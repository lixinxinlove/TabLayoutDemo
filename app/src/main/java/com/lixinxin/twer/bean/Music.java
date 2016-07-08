package com.lixinxin.twer.bean;

import java.util.List;

/**
 * Created by lixinxin on 2016/7/7.
 */
public class Music {


    /**
     * album_offset : 0
     * albums : [{"artists":[{"id":51080391,"name":"大哲","portrait":"http://pic.cdn.duomi.com/imageproxy2/dimgm/scaleImage?url=http://img.kxting.cn//p1/18/32/71024645.jpg&w=150&h=150&s=100&c=0&o=0&m=","valid":true}],"available":true,"company":"","cover":"http://pic.cdn.duomi.com/imageproxy2/dimgm/scaleImage?url=http://img.kxting.cn//p1/28/19/70607116.jpg&w=150&h=150&s=100&c=0&o=0&m=","id":2307126,"name":"红玫瑰","num_tracks":3,"release_date":"2011-11-11","type":"专辑"},{"artists":[{"id":50000133,"name":"关牧村","portrait":"http://pic.cdn.duomi.com/imageproxy2/dimgm/scaleImage?url=http://img.kxting.cn//p1/26/02/70868723.jpg&w=150&h=150&s=100&c=0&o=0&m=","valid":true}],"available":true,"company":"","cover":"http://pic.cdn.duomi.com/imageproxy2/dimgm/scaleImage?url=http://img.kxting.cn//p1/20/21/70262202.jpg&w=150&h=150&s=100&c=0&o=0&m=","id":2002906,"name":"天山红玫瑰","num_tracks":5,"release_date":"2003-01-01","type":"专辑"},{"artists":[{"id":50000529,"name":"于台烟","portrait":"http://pic.cdn.duomi.com/imageproxy2/dimgm/scaleImage?url=http://img.kxting.cn//p1/14/27/70893201.jpg&w=150&h=150&s=100&c=0&o=0&m=","valid":true}],"available":true,"company":"","id":1164841,"name":"深情红玫瑰","num_tracks":1,"release_date":"2000-01-01","type":"专辑"},{"artists":[{"id":61543030,"name":"王俊凯","portrait":"http://pic.cdn.duomi.com/imageproxy2/dimgm/scaleImage?url=http://img.kxting.cn//p1/19/10/71706832.jpg&w=150&h=150&s=100&c=0&o=0&m=","valid":true}],"available":true,"company":"","cover":"http://pic.cdn.duomi.com/imageproxy2/dimgm/scaleImage?url=http://img.kxting.cn//p1/19/14/71757920.jpg&w=150&h=150&s=100&c=0&o=0&m=","id":2623459,"name":"红玫瑰(Live)","num_tracks":1,"release_date":"2014-12-19","type":"现场"},{"artists":[{"id":50000810,"name":"江俐奇","portrait":"http://pic.cdn.duomi.com/imageproxy2/dimgm/scaleImage?url=http://img.kxting.cn//p1/27/04/70076395.jpg&w=150&h=150&s=100&c=0&o=0&m=","valid":true}],"available":true,"company":"","cover":"http://pic.cdn.duomi.com/imageproxy2/dimgm/scaleImage?url=http://img.kxting.cn//p1/11/05/70592219.jpg&w=150&h=150&s=100&c=0&o=0&m=","id":2293225,"name":"酒中的红玫瑰","num_tracks":1,"release_date":"2008-01-01","type":"EP/单曲"}]
     * artist_offset : 0
     * artists : [{"id":50000673,"name":"陈奕迅","num_albums":38,"num_tracks":181,"portrait":"http://pic.cdn.duomi.com/imageproxy2/dimgm/scaleImage?url=http://img.kxting.cn//p1/18/01/72065005.jpg&w=150&h=150&s=100&c=0&o=0&m=","valid":true}]
     * dm_error : 0
     * error_msg : 操作成功
     * recommend : 0
     * total_albums : 7
     * total_artists : 1
     * total_tracks : 31
     * track_offset : 0
     * tracks : [{"album":{"cover":"/p1/26/24/71184489.jpg","id":2067013,"name":"认了吧"},"artists":[{"id":50000673,"name":"陈奕迅","num_albums":38,"num_tracks":181,"portrait":"/p1/18/01/72065005.jpg","valid":true}],"availability":"1110","dlyric":"","id":25351496,"isdown":"1","isplay":"1","medias":[{"bitrate":320,"p2purl":"623699F00562B3F4780500000092821E090000000C.mp3"}],"mv":0,"slyric":"static/01/25/92257861.txt","title":"红玫瑰"},{"artists":[{"id":61447272,"name":"于小彤","num_albums":0,"num_tracks":2,"portrait":"/p1/02/29/71509841.jpg","valid":false}],"availability":"1110","dlyric":"","id":24949130,"isdown":"1","isplay":"1","medias":[{"bitrate":128,"p2purl":"24716DC31E6DEAA99D0500000036E71B18000000D2.mp3"}],"mv":0,"slyric":"static/01/24/91304953.txt","title":"红玫瑰"}]
     */

    private int album_offset;
    private int artist_offset;
    private int dm_error;
    private String error_msg;
    private int recommend;
    private int total_albums;
    private int total_artists;
    private int total_tracks;
    private int track_offset;
    /**
     * artists : [{"id":51080391,"name":"大哲","portrait":"http://pic.cdn.duomi.com/imageproxy2/dimgm/scaleImage?url=http://img.kxting.cn//p1/18/32/71024645.jpg&w=150&h=150&s=100&c=0&o=0&m=","valid":true}]
     * available : true
     * company :
     * cover : http://pic.cdn.duomi.com/imageproxy2/dimgm/scaleImage?url=http://img.kxting.cn//p1/28/19/70607116.jpg&w=150&h=150&s=100&c=0&o=0&m=
     * id : 2307126
     * name : 红玫瑰
     * num_tracks : 3
     * release_date : 2011-11-11
     * type : 专辑
     */

    private List<AlbumsBean> albums;
    /**
     * id : 50000673
     * name : 陈奕迅
     * num_albums : 38
     * num_tracks : 181
     * portrait : http://pic.cdn.duomi.com/imageproxy2/dimgm/scaleImage?url=http://img.kxting.cn//p1/18/01/72065005.jpg&w=150&h=150&s=100&c=0&o=0&m=
     * valid : true
     */

    private List<ArtistsBean> artists;
    /**
     * album : {"cover":"/p1/26/24/71184489.jpg","id":2067013,"name":"认了吧"}
     * artists : [{"id":50000673,"name":"陈奕迅","num_albums":38,"num_tracks":181,"portrait":"/p1/18/01/72065005.jpg","valid":true}]
     * availability : 1110
     * dlyric :
     * id : 25351496
     * isdown : 1
     * isplay : 1
     * medias : [{"bitrate":320,"p2purl":"623699F00562B3F4780500000092821E090000000C.mp3"}]
     * mv : 0
     * slyric : static/01/25/92257861.txt
     * title : 红玫瑰
     */

    private List<TracksBean> tracks;

    public int getAlbum_offset() {
        return album_offset;
    }

    public void setAlbum_offset(int album_offset) {
        this.album_offset = album_offset;
    }

    public int getArtist_offset() {
        return artist_offset;
    }

    public void setArtist_offset(int artist_offset) {
        this.artist_offset = artist_offset;
    }

    public int getDm_error() {
        return dm_error;
    }

    public void setDm_error(int dm_error) {
        this.dm_error = dm_error;
    }

    public String getError_msg() {
        return error_msg;
    }

    public void setError_msg(String error_msg) {
        this.error_msg = error_msg;
    }

    public int getRecommend() {
        return recommend;
    }

    public void setRecommend(int recommend) {
        this.recommend = recommend;
    }

    public int getTotal_albums() {
        return total_albums;
    }

    public void setTotal_albums(int total_albums) {
        this.total_albums = total_albums;
    }

    public int getTotal_artists() {
        return total_artists;
    }

    public void setTotal_artists(int total_artists) {
        this.total_artists = total_artists;
    }

    public int getTotal_tracks() {
        return total_tracks;
    }

    public void setTotal_tracks(int total_tracks) {
        this.total_tracks = total_tracks;
    }

    public int getTrack_offset() {
        return track_offset;
    }

    public void setTrack_offset(int track_offset) {
        this.track_offset = track_offset;
    }

    public List<AlbumsBean> getAlbums() {
        return albums;
    }

    public void setAlbums(List<AlbumsBean> albums) {
        this.albums = albums;
    }

    public List<ArtistsBean> getArtists() {
        return artists;
    }

    public void setArtists(List<ArtistsBean> artists) {
        this.artists = artists;
    }

    public List<TracksBean> getTracks() {
        return tracks;
    }

    public void setTracks(List<TracksBean> tracks) {
        this.tracks = tracks;
    }

    public static class AlbumsBean {
        private boolean available;
        private String company;
        private String cover;
        private int id;
        private String name;
        private int num_tracks;
        private String release_date;
        private String type;
        /**
         * id : 51080391
         * name : 大哲
         * portrait : http://pic.cdn.duomi.com/imageproxy2/dimgm/scaleImage?url=http://img.kxting.cn//p1/18/32/71024645.jpg&w=150&h=150&s=100&c=0&o=0&m=
         * valid : true
         */

        private List<ArtistsBean> artists;

        public boolean isAvailable() {
            return available;
        }

        public void setAvailable(boolean available) {
            this.available = available;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNum_tracks() {
            return num_tracks;
        }

        public void setNum_tracks(int num_tracks) {
            this.num_tracks = num_tracks;
        }

        public String getRelease_date() {
            return release_date;
        }

        public void setRelease_date(String release_date) {
            this.release_date = release_date;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<ArtistsBean> getArtists() {
            return artists;
        }

        public void setArtists(List<ArtistsBean> artists) {
            this.artists = artists;
        }

        public static class ArtistsBean {
            private int id;
            private String name;
            private String portrait;
            private boolean valid;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPortrait() {
                return portrait;
            }

            public void setPortrait(String portrait) {
                this.portrait = portrait;
            }

            public boolean isValid() {
                return valid;
            }

            public void setValid(boolean valid) {
                this.valid = valid;
            }
        }
    }

    public static class ArtistsBean {
        private int id;
        private String name;
        private int num_albums;
        private int num_tracks;
        private String portrait;
        private boolean valid;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNum_albums() {
            return num_albums;
        }

        public void setNum_albums(int num_albums) {
            this.num_albums = num_albums;
        }

        public int getNum_tracks() {
            return num_tracks;
        }

        public void setNum_tracks(int num_tracks) {
            this.num_tracks = num_tracks;
        }

        public String getPortrait() {
            return portrait;
        }

        public void setPortrait(String portrait) {
            this.portrait = portrait;
        }

        public boolean isValid() {
            return valid;
        }

        public void setValid(boolean valid) {
            this.valid = valid;
        }
    }

    public static class TracksBean {
        /**
         * cover : /p1/26/24/71184489.jpg
         * id : 2067013
         * name : 认了吧
         */

        private AlbumBean album;
        private String availability;
        private String dlyric;
        private int id;
        private String isdown;
        private String isplay;
        private int mv;
        private String slyric;
        private String title;
        /**
         * id : 50000673
         * name : 陈奕迅
         * num_albums : 38
         * num_tracks : 181
         * portrait : /p1/18/01/72065005.jpg
         * valid : true
         */

        private List<ArtistsBean> artists;
        /**
         * bitrate : 320
         * p2purl : 623699F00562B3F4780500000092821E090000000C.mp3
         */

        private List<MediasBean> medias;

        public AlbumBean getAlbum() {
            return album;
        }

        public void setAlbum(AlbumBean album) {
            this.album = album;
        }

        public String getAvailability() {
            return availability;
        }

        public void setAvailability(String availability) {
            this.availability = availability;
        }

        public String getDlyric() {
            return dlyric;
        }

        public void setDlyric(String dlyric) {
            this.dlyric = dlyric;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getIsdown() {
            return isdown;
        }

        public void setIsdown(String isdown) {
            this.isdown = isdown;
        }

        public String getIsplay() {
            return isplay;
        }

        public void setIsplay(String isplay) {
            this.isplay = isplay;
        }

        public int getMv() {
            return mv;
        }

        public void setMv(int mv) {
            this.mv = mv;
        }

        public String getSlyric() {
            return slyric;
        }

        public void setSlyric(String slyric) {
            this.slyric = slyric;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<ArtistsBean> getArtists() {
            return artists;
        }

        public void setArtists(List<ArtistsBean> artists) {
            this.artists = artists;
        }

        public List<MediasBean> getMedias() {
            return medias;
        }

        public void setMedias(List<MediasBean> medias) {
            this.medias = medias;
        }

        public static class AlbumBean {
            private String cover;
            private int id;
            private String name;

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class ArtistsBean {
            private int id;
            private String name;
            private int num_albums;
            private int num_tracks;
            private String portrait;
            private boolean valid;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getNum_albums() {
                return num_albums;
            }

            public void setNum_albums(int num_albums) {
                this.num_albums = num_albums;
            }

            public int getNum_tracks() {
                return num_tracks;
            }

            public void setNum_tracks(int num_tracks) {
                this.num_tracks = num_tracks;
            }

            public String getPortrait() {
                return portrait;
            }

            public void setPortrait(String portrait) {
                this.portrait = portrait;
            }

            public boolean isValid() {
                return valid;
            }

            public void setValid(boolean valid) {
                this.valid = valid;
            }
        }

        public static class MediasBean {
            private int bitrate;
            private String p2purl;

            public int getBitrate() {
                return bitrate;
            }

            public void setBitrate(int bitrate) {
                this.bitrate = bitrate;
            }

            public String getP2purl() {
                return p2purl;
            }

            public void setP2purl(String p2purl) {
                this.p2purl = p2purl;
            }
        }
    }
}
