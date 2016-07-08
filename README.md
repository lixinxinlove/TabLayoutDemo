# TabLayoutDemo使用 TabLayout 和 ViewPager 实现页面的切换 ，自定 tab 的布局 ，例如 掘金app 。
通过  tab.setCustomView(item);设置自定义的布局
   TabLayout.Tab tab = tabLayout.getTabAt(0);
        viewPager.setCurrentItem(1);
        if (tab != null) {
            View item = View.inflate(this, R.layout.tab_view, null);
            tab.setCustomView(item);
        }
