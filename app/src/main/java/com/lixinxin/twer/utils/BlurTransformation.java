package com.lixinxin.twer.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;

/**
 * Created by lixinxin on 2016/7/8.
 */
public class BlurTransformation extends BitmapTransformation {
    private RenderScript rs;
    private int radius; //模糊半径

    public BlurTransformation(Context context, int radius) {
        super(context);
        rs = RenderScript.create(context);
        this.radius = radius;
    }

    @Override
    protected Bitmap transform(BitmapPool pool, Bitmap toTransform, int outWidth, int outHeight) {
        Bitmap blurredBitmap = toTransform.copy(Bitmap.Config.ARGB_8888, true);
        // Allocate memory for Renderscript to work with
        Allocation input = Allocation.createFromBitmap(rs, blurredBitmap,
                Allocation.MipmapControl.MIPMAP_FULL, Allocation.USAGE_SHARED);

        Allocation output = Allocation.createTyped(rs, input.getType());
        // Load up an instance of the specific script that we want to use.
        ScriptIntrinsicBlur script = ScriptIntrinsicBlur.create(rs, Element.U8_4(rs));
        script.setInput(input);
        // Set the blur radius   设置模糊半径
        // script.setRadius(10);
        script.setRadius(radius);
        // Start the ScriptIntrinisicBlur
        script.forEach(output);
        // Copy the output to the blurred bitmap 将输出复制到模糊位图
        output.copyTo(blurredBitmap);
        toTransform.recycle();
        return blurredBitmap;
    }

    @Override
    public String getId() {
        return "blur";
    }
}
