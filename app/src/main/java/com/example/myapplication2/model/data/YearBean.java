package com.example.myapplication2.model.data;

import com.google.gson.annotations.SerializedName;

/**
 * 项目名： My Application2
 * 包名：   com.example.myapplication2.model.data
 * 文件名： YearBean
 * 创建者： 小狼不是哈士奇
 * B站：    幻雨之秋
 * 个人主页: https://hyzqacg.github.io/
 * 创建时间：2021/4/1 21:56
 * 描述：TODO
 */
public class YearBean {

    /**
     * code : 0
     * holiday : {"01-01":{"holiday":true,"name":"元旦","wage":3,"date":"2021-01-01"},"01-02":{"holiday":true,"name":"元旦","wage":2,"date":"2021-01-02","rest":1},"01-03":{"holiday":true,"name":"元旦","wage":2,"date":"2021-01-03","rest":1},"02-07":{"holiday":false,"name":"春节前调休","after":false,"wage":1,"target":"春节","date":"2021-02-07","rest":34},"02-11":{"holiday":true,"name":"除夕","wage":2,"date":"2021-02-11","rest":38},"02-12":{"holiday":true,"name":"初一","wage":3,"date":"2021-02-12"},"02-13":{"holiday":true,"name":"初二","wage":3,"date":"2021-02-13"},"02-14":{"holiday":true,"name":"初三","wage":3,"date":"2021-02-14"},"02-15":{"holiday":true,"name":"初四","wage":2,"date":"2021-02-15"},"02-16":{"holiday":true,"name":"初五","wage":2,"date":"2021-02-16"},"02-17":{"holiday":true,"name":"初六","wage":2,"date":"2021-02-17"},"02-20":{"holiday":false,"name":"春节后调休","after":true,"wage":1,"target":"春节","date":"2021-02-20"},"04-03":{"holiday":true,"name":"清明节","wage":3,"date":"2021-04-03","rest":2},"04-04":{"holiday":true,"name":"清明节","wage":2,"date":"2021-04-04","rest":1},"04-05":{"holiday":true,"name":"清明节","wage":2,"date":"2021-04-05","rest":1},"04-25":{"holiday":false,"name":"劳动节前调休","after":false,"wage":1,"target":"劳动节","date":"2021-04-25","rest":20},"05-01":{"holiday":true,"name":"劳动节","wage":3,"date":"2021-05-01","rest":26},"05-02":{"holiday":true,"name":"劳动节","wage":2,"date":"2021-05-02","rest":1},"05-03":{"holiday":true,"name":"劳动节","wage":2,"date":"2021-05-03","rest":1},"05-04":{"holiday":true,"name":"劳动节","wage":2,"date":"2021-05-04","rest":1},"05-05":{"holiday":true,"name":"劳动节","wage":2,"date":"2021-05-05","rest":1},"05-08":{"holiday":false,"name":"劳动节后调休","after":true,"wage":1,"target":"劳动节","date":"2021-05-08","rest":1},"06-12":{"holiday":true,"name":"端午节","wage":3,"date":"2021-06-12","rest":35},"06-13":{"holiday":true,"name":"端午节","wage":2,"date":"2021-06-13"},"06-14":{"holiday":true,"name":"端午节","wage":2,"date":"2021-06-14"},"09-18":{"holiday":false,"after":false,"name":"中秋节前调休","wage":1,"target":"中秋节","date":"2021-09-18","rest":1},"09-19":{"holiday":true,"name":"中秋节","wage":3,"date":"2021-09-19","rest":2},"09-20":{"holiday":true,"name":"中秋节","wage":2,"date":"2021-09-20"},"09-21":{"holiday":true,"name":"中秋节","wage":2,"date":"2021-09-21"},"09-26":{"holiday":false,"after":false,"name":"国庆节前调休","wage":1,"target":"国庆节","date":"2021-09-26"},"10-01":{"holiday":true,"name":"国庆节","wage":3,"date":"2021-10-01"},"10-02":{"holiday":true,"name":"国庆节","wage":3,"date":"2021-10-02","rest":1},"10-03":{"holiday":true,"name":"国庆节","wage":3,"date":"2021-10-03"},"10-04":{"holiday":true,"name":"国庆节","wage":2,"date":"2021-10-04"},"10-05":{"holiday":true,"name":"国庆节","wage":2,"date":"2021-10-05"},"10-06":{"holiday":true,"name":"国庆节","wage":2,"date":"2021-10-06"},"10-07":{"holiday":true,"name":"国庆节","wage":2,"date":"2021-10-07"},"10-09":{"holiday":false,"name":"国庆节后调休","after":true,"wage":1,"target":"国庆节","date":"2021-10-09"}}
     */

    private int code;
    private HolidayBean holiday;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public HolidayBean getHoliday() {
        return holiday;
    }

    public void setHoliday(HolidayBean holiday) {
        this.holiday = holiday;
    }

    public static class HolidayBean {
        /**
         * 01-01 : {"holiday":true,"name":"元旦","wage":3,"date":"2021-01-01"}
         * 01-02 : {"holiday":true,"name":"元旦","wage":2,"date":"2021-01-02","rest":1}
         * 01-03 : {"holiday":true,"name":"元旦","wage":2,"date":"2021-01-03","rest":1}
         * 02-07 : {"holiday":false,"name":"春节前调休","after":false,"wage":1,"target":"春节","date":"2021-02-07","rest":34}
         * 02-11 : {"holiday":true,"name":"除夕","wage":2,"date":"2021-02-11","rest":38}
         * 02-12 : {"holiday":true,"name":"初一","wage":3,"date":"2021-02-12"}
         * 02-13 : {"holiday":true,"name":"初二","wage":3,"date":"2021-02-13"}
         * 02-14 : {"holiday":true,"name":"初三","wage":3,"date":"2021-02-14"}
         * 02-15 : {"holiday":true,"name":"初四","wage":2,"date":"2021-02-15"}
         * 02-16 : {"holiday":true,"name":"初五","wage":2,"date":"2021-02-16"}
         * 02-17 : {"holiday":true,"name":"初六","wage":2,"date":"2021-02-17"}
         * 02-20 : {"holiday":false,"name":"春节后调休","after":true,"wage":1,"target":"春节","date":"2021-02-20"}
         * 04-03 : {"holiday":true,"name":"清明节","wage":3,"date":"2021-04-03","rest":2}
         * 04-04 : {"holiday":true,"name":"清明节","wage":2,"date":"2021-04-04","rest":1}
         * 04-05 : {"holiday":true,"name":"清明节","wage":2,"date":"2021-04-05","rest":1}
         * 04-25 : {"holiday":false,"name":"劳动节前调休","after":false,"wage":1,"target":"劳动节","date":"2021-04-25","rest":20}
         * 05-01 : {"holiday":true,"name":"劳动节","wage":3,"date":"2021-05-01","rest":26}
         * 05-02 : {"holiday":true,"name":"劳动节","wage":2,"date":"2021-05-02","rest":1}
         * 05-03 : {"holiday":true,"name":"劳动节","wage":2,"date":"2021-05-03","rest":1}
         * 05-04 : {"holiday":true,"name":"劳动节","wage":2,"date":"2021-05-04","rest":1}
         * 05-05 : {"holiday":true,"name":"劳动节","wage":2,"date":"2021-05-05","rest":1}
         * 05-08 : {"holiday":false,"name":"劳动节后调休","after":true,"wage":1,"target":"劳动节","date":"2021-05-08","rest":1}
         * 06-12 : {"holiday":true,"name":"端午节","wage":3,"date":"2021-06-12","rest":35}
         * 06-13 : {"holiday":true,"name":"端午节","wage":2,"date":"2021-06-13"}
         * 06-14 : {"holiday":true,"name":"端午节","wage":2,"date":"2021-06-14"}
         * 09-18 : {"holiday":false,"after":false,"name":"中秋节前调休","wage":1,"target":"中秋节","date":"2021-09-18","rest":1}
         * 09-19 : {"holiday":true,"name":"中秋节","wage":3,"date":"2021-09-19","rest":2}
         * 09-20 : {"holiday":true,"name":"中秋节","wage":2,"date":"2021-09-20"}
         * 09-21 : {"holiday":true,"name":"中秋节","wage":2,"date":"2021-09-21"}
         * 09-26 : {"holiday":false,"after":false,"name":"国庆节前调休","wage":1,"target":"国庆节","date":"2021-09-26"}
         * 10-01 : {"holiday":true,"name":"国庆节","wage":3,"date":"2021-10-01"}
         * 10-02 : {"holiday":true,"name":"国庆节","wage":3,"date":"2021-10-02","rest":1}
         * 10-03 : {"holiday":true,"name":"国庆节","wage":3,"date":"2021-10-03"}
         * 10-04 : {"holiday":true,"name":"国庆节","wage":2,"date":"2021-10-04"}
         * 10-05 : {"holiday":true,"name":"国庆节","wage":2,"date":"2021-10-05"}
         * 10-06 : {"holiday":true,"name":"国庆节","wage":2,"date":"2021-10-06"}
         * 10-07 : {"holiday":true,"name":"国庆节","wage":2,"date":"2021-10-07"}
         * 10-09 : {"holiday":false,"name":"国庆节后调休","after":true,"wage":1,"target":"国庆节","date":"2021-10-09"}
         */

        @SerializedName("01-01")
        private _$0101Bean _$0101;
        @SerializedName("01-02")
        private _$0102Bean _$0102;
        @SerializedName("01-03")
        private _$0103Bean _$0103;
        @SerializedName("02-07")
        private _$0207Bean _$0207;
        @SerializedName("02-11")
        private _$0211Bean _$0211;
        @SerializedName("02-12")
        private _$0212Bean _$0212;
        @SerializedName("02-13")
        private _$0213Bean _$0213;
        @SerializedName("02-14")
        private _$0214Bean _$0214;
        @SerializedName("02-15")
        private _$0215Bean _$0215;
        @SerializedName("02-16")
        private _$0216Bean _$0216;
        @SerializedName("02-17")
        private _$0217Bean _$0217;
        @SerializedName("02-20")
        private _$0220Bean _$0220;
        @SerializedName("04-03")
        private _$0403Bean _$0403;
        @SerializedName("04-04")
        private _$0404Bean _$0404;
        @SerializedName("04-05")
        private _$0405Bean _$0405;
        @SerializedName("04-25")
        private _$0425Bean _$0425;
        @SerializedName("05-01")
        private _$0501Bean _$0501;
        @SerializedName("05-02")
        private _$0502Bean _$0502;
        @SerializedName("05-03")
        private _$0503Bean _$0503;
        @SerializedName("05-04")
        private _$0504Bean _$0504;
        @SerializedName("05-05")
        private _$0505Bean _$0505;
        @SerializedName("05-08")
        private _$0508Bean _$0508;
        @SerializedName("06-12")
        private _$0612Bean _$0612;
        @SerializedName("06-13")
        private _$0613Bean _$0613;
        @SerializedName("06-14")
        private _$0614Bean _$0614;
        @SerializedName("09-18")
        private _$0918Bean _$0918;
        @SerializedName("09-19")
        private _$0919Bean _$0919;
        @SerializedName("09-20")
        private _$0920Bean _$0920;
        @SerializedName("09-21")
        private _$0921Bean _$0921;
        @SerializedName("09-26")
        private _$0926Bean _$0926;
        @SerializedName("10-01")
        private _$1001Bean _$1001;
        @SerializedName("10-02")
        private _$1002Bean _$1002;
        @SerializedName("10-03")
        private _$1003Bean _$1003;
        @SerializedName("10-04")
        private _$1004Bean _$1004;
        @SerializedName("10-05")
        private _$1005Bean _$1005;
        @SerializedName("10-06")
        private _$1006Bean _$1006;
        @SerializedName("10-07")
        private _$1007Bean _$1007;
        @SerializedName("10-09")
        private _$1009Bean _$1009;

        public _$0101Bean get_$0101() {
            return _$0101;
        }

        public void set_$0101(_$0101Bean _$0101) {
            this._$0101 = _$0101;
        }

        public _$0102Bean get_$0102() {
            return _$0102;
        }

        public void set_$0102(_$0102Bean _$0102) {
            this._$0102 = _$0102;
        }

        public _$0103Bean get_$0103() {
            return _$0103;
        }

        public void set_$0103(_$0103Bean _$0103) {
            this._$0103 = _$0103;
        }

        public _$0207Bean get_$0207() {
            return _$0207;
        }

        public void set_$0207(_$0207Bean _$0207) {
            this._$0207 = _$0207;
        }

        public _$0211Bean get_$0211() {
            return _$0211;
        }

        public void set_$0211(_$0211Bean _$0211) {
            this._$0211 = _$0211;
        }

        public _$0212Bean get_$0212() {
            return _$0212;
        }

        public void set_$0212(_$0212Bean _$0212) {
            this._$0212 = _$0212;
        }

        public _$0213Bean get_$0213() {
            return _$0213;
        }

        public void set_$0213(_$0213Bean _$0213) {
            this._$0213 = _$0213;
        }

        public _$0214Bean get_$0214() {
            return _$0214;
        }

        public void set_$0214(_$0214Bean _$0214) {
            this._$0214 = _$0214;
        }

        public _$0215Bean get_$0215() {
            return _$0215;
        }

        public void set_$0215(_$0215Bean _$0215) {
            this._$0215 = _$0215;
        }

        public _$0216Bean get_$0216() {
            return _$0216;
        }

        public void set_$0216(_$0216Bean _$0216) {
            this._$0216 = _$0216;
        }

        public _$0217Bean get_$0217() {
            return _$0217;
        }

        public void set_$0217(_$0217Bean _$0217) {
            this._$0217 = _$0217;
        }

        public _$0220Bean get_$0220() {
            return _$0220;
        }

        public void set_$0220(_$0220Bean _$0220) {
            this._$0220 = _$0220;
        }

        public _$0403Bean get_$0403() {
            return _$0403;
        }

        public void set_$0403(_$0403Bean _$0403) {
            this._$0403 = _$0403;
        }

        public _$0404Bean get_$0404() {
            return _$0404;
        }

        public void set_$0404(_$0404Bean _$0404) {
            this._$0404 = _$0404;
        }

        public _$0405Bean get_$0405() {
            return _$0405;
        }

        public void set_$0405(_$0405Bean _$0405) {
            this._$0405 = _$0405;
        }

        public _$0425Bean get_$0425() {
            return _$0425;
        }

        public void set_$0425(_$0425Bean _$0425) {
            this._$0425 = _$0425;
        }

        public _$0501Bean get_$0501() {
            return _$0501;
        }

        public void set_$0501(_$0501Bean _$0501) {
            this._$0501 = _$0501;
        }

        public _$0502Bean get_$0502() {
            return _$0502;
        }

        public void set_$0502(_$0502Bean _$0502) {
            this._$0502 = _$0502;
        }

        public _$0503Bean get_$0503() {
            return _$0503;
        }

        public void set_$0503(_$0503Bean _$0503) {
            this._$0503 = _$0503;
        }

        public _$0504Bean get_$0504() {
            return _$0504;
        }

        public void set_$0504(_$0504Bean _$0504) {
            this._$0504 = _$0504;
        }

        public _$0505Bean get_$0505() {
            return _$0505;
        }

        public void set_$0505(_$0505Bean _$0505) {
            this._$0505 = _$0505;
        }

        public _$0508Bean get_$0508() {
            return _$0508;
        }

        public void set_$0508(_$0508Bean _$0508) {
            this._$0508 = _$0508;
        }

        public _$0612Bean get_$0612() {
            return _$0612;
        }

        public void set_$0612(_$0612Bean _$0612) {
            this._$0612 = _$0612;
        }

        public _$0613Bean get_$0613() {
            return _$0613;
        }

        public void set_$0613(_$0613Bean _$0613) {
            this._$0613 = _$0613;
        }

        public _$0614Bean get_$0614() {
            return _$0614;
        }

        public void set_$0614(_$0614Bean _$0614) {
            this._$0614 = _$0614;
        }

        public _$0918Bean get_$0918() {
            return _$0918;
        }

        public void set_$0918(_$0918Bean _$0918) {
            this._$0918 = _$0918;
        }

        public _$0919Bean get_$0919() {
            return _$0919;
        }

        public void set_$0919(_$0919Bean _$0919) {
            this._$0919 = _$0919;
        }

        public _$0920Bean get_$0920() {
            return _$0920;
        }

        public void set_$0920(_$0920Bean _$0920) {
            this._$0920 = _$0920;
        }

        public _$0921Bean get_$0921() {
            return _$0921;
        }

        public void set_$0921(_$0921Bean _$0921) {
            this._$0921 = _$0921;
        }

        public _$0926Bean get_$0926() {
            return _$0926;
        }

        public void set_$0926(_$0926Bean _$0926) {
            this._$0926 = _$0926;
        }

        public _$1001Bean get_$1001() {
            return _$1001;
        }

        public void set_$1001(_$1001Bean _$1001) {
            this._$1001 = _$1001;
        }

        public _$1002Bean get_$1002() {
            return _$1002;
        }

        public void set_$1002(_$1002Bean _$1002) {
            this._$1002 = _$1002;
        }

        public _$1003Bean get_$1003() {
            return _$1003;
        }

        public void set_$1003(_$1003Bean _$1003) {
            this._$1003 = _$1003;
        }

        public _$1004Bean get_$1004() {
            return _$1004;
        }

        public void set_$1004(_$1004Bean _$1004) {
            this._$1004 = _$1004;
        }

        public _$1005Bean get_$1005() {
            return _$1005;
        }

        public void set_$1005(_$1005Bean _$1005) {
            this._$1005 = _$1005;
        }

        public _$1006Bean get_$1006() {
            return _$1006;
        }

        public void set_$1006(_$1006Bean _$1006) {
            this._$1006 = _$1006;
        }

        public _$1007Bean get_$1007() {
            return _$1007;
        }

        public void set_$1007(_$1007Bean _$1007) {
            this._$1007 = _$1007;
        }

        public _$1009Bean get_$1009() {
            return _$1009;
        }

        public void set_$1009(_$1009Bean _$1009) {
            this._$1009 = _$1009;
        }

        public static class _$0101Bean {
            /**
             * holiday : true
             * name : 元旦
             * wage : 3
             * date : 2021-01-01
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }

        public static class _$0102Bean {
            /**
             * holiday : true
             * name : 元旦
             * wage : 2
             * date : 2021-01-02
             * rest : 1
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;
            private int rest;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public int getRest() {
                return rest;
            }

            public void setRest(int rest) {
                this.rest = rest;
            }
        }

        public static class _$0103Bean {
            /**
             * holiday : true
             * name : 元旦
             * wage : 2
             * date : 2021-01-03
             * rest : 1
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;
            private int rest;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public int getRest() {
                return rest;
            }

            public void setRest(int rest) {
                this.rest = rest;
            }
        }

        public static class _$0207Bean {
            /**
             * holiday : false
             * name : 春节前调休
             * after : false
             * wage : 1
             * target : 春节
             * date : 2021-02-07
             * rest : 34
             */

            private boolean holiday;
            private String name;
            private boolean after;
            private int wage;
            private String target;
            private String date;
            private int rest;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public boolean isAfter() {
                return after;
            }

            public void setAfter(boolean after) {
                this.after = after;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getTarget() {
                return target;
            }

            public void setTarget(String target) {
                this.target = target;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public int getRest() {
                return rest;
            }

            public void setRest(int rest) {
                this.rest = rest;
            }
        }

        public static class _$0211Bean {
            /**
             * holiday : true
             * name : 除夕
             * wage : 2
             * date : 2021-02-11
             * rest : 38
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;
            private int rest;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public int getRest() {
                return rest;
            }

            public void setRest(int rest) {
                this.rest = rest;
            }
        }

        public static class _$0212Bean {
            /**
             * holiday : true
             * name : 初一
             * wage : 3
             * date : 2021-02-12
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }

        public static class _$0213Bean {
            /**
             * holiday : true
             * name : 初二
             * wage : 3
             * date : 2021-02-13
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }

        public static class _$0214Bean {
            /**
             * holiday : true
             * name : 初三
             * wage : 3
             * date : 2021-02-14
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }

        public static class _$0215Bean {
            /**
             * holiday : true
             * name : 初四
             * wage : 2
             * date : 2021-02-15
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }

        public static class _$0216Bean {
            /**
             * holiday : true
             * name : 初五
             * wage : 2
             * date : 2021-02-16
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }

        public static class _$0217Bean {
            /**
             * holiday : true
             * name : 初六
             * wage : 2
             * date : 2021-02-17
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }

        public static class _$0220Bean {
            /**
             * holiday : false
             * name : 春节后调休
             * after : true
             * wage : 1
             * target : 春节
             * date : 2021-02-20
             */

            private boolean holiday;
            private String name;
            private boolean after;
            private int wage;
            private String target;
            private String date;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public boolean isAfter() {
                return after;
            }

            public void setAfter(boolean after) {
                this.after = after;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getTarget() {
                return target;
            }

            public void setTarget(String target) {
                this.target = target;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }

        public static class _$0403Bean {
            /**
             * holiday : true
             * name : 清明节
             * wage : 3
             * date : 2021-04-03
             * rest : 2
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;
            private int rest;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public int getRest() {
                return rest;
            }

            public void setRest(int rest) {
                this.rest = rest;
            }
        }

        public static class _$0404Bean {
            /**
             * holiday : true
             * name : 清明节
             * wage : 2
             * date : 2021-04-04
             * rest : 1
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;
            private int rest;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public int getRest() {
                return rest;
            }

            public void setRest(int rest) {
                this.rest = rest;
            }
        }

        public static class _$0405Bean {
            /**
             * holiday : true
             * name : 清明节
             * wage : 2
             * date : 2021-04-05
             * rest : 1
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;
            private int rest;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public int getRest() {
                return rest;
            }

            public void setRest(int rest) {
                this.rest = rest;
            }
        }

        public static class _$0425Bean {
            /**
             * holiday : false
             * name : 劳动节前调休
             * after : false
             * wage : 1
             * target : 劳动节
             * date : 2021-04-25
             * rest : 20
             */

            private boolean holiday;
            private String name;
            private boolean after;
            private int wage;
            private String target;
            private String date;
            private int rest;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public boolean isAfter() {
                return after;
            }

            public void setAfter(boolean after) {
                this.after = after;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getTarget() {
                return target;
            }

            public void setTarget(String target) {
                this.target = target;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public int getRest() {
                return rest;
            }

            public void setRest(int rest) {
                this.rest = rest;
            }
        }

        public static class _$0501Bean {
            /**
             * holiday : true
             * name : 劳动节
             * wage : 3
             * date : 2021-05-01
             * rest : 26
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;
            private int rest;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public int getRest() {
                return rest;
            }

            public void setRest(int rest) {
                this.rest = rest;
            }
        }

        public static class _$0502Bean {
            /**
             * holiday : true
             * name : 劳动节
             * wage : 2
             * date : 2021-05-02
             * rest : 1
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;
            private int rest;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public int getRest() {
                return rest;
            }

            public void setRest(int rest) {
                this.rest = rest;
            }
        }

        public static class _$0503Bean {
            /**
             * holiday : true
             * name : 劳动节
             * wage : 2
             * date : 2021-05-03
             * rest : 1
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;
            private int rest;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public int getRest() {
                return rest;
            }

            public void setRest(int rest) {
                this.rest = rest;
            }
        }

        public static class _$0504Bean {
            /**
             * holiday : true
             * name : 劳动节
             * wage : 2
             * date : 2021-05-04
             * rest : 1
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;
            private int rest;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public int getRest() {
                return rest;
            }

            public void setRest(int rest) {
                this.rest = rest;
            }
        }

        public static class _$0505Bean {
            /**
             * holiday : true
             * name : 劳动节
             * wage : 2
             * date : 2021-05-05
             * rest : 1
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;
            private int rest;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public int getRest() {
                return rest;
            }

            public void setRest(int rest) {
                this.rest = rest;
            }
        }

        public static class _$0508Bean {
            /**
             * holiday : false
             * name : 劳动节后调休
             * after : true
             * wage : 1
             * target : 劳动节
             * date : 2021-05-08
             * rest : 1
             */

            private boolean holiday;
            private String name;
            private boolean after;
            private int wage;
            private String target;
            private String date;
            private int rest;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public boolean isAfter() {
                return after;
            }

            public void setAfter(boolean after) {
                this.after = after;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getTarget() {
                return target;
            }

            public void setTarget(String target) {
                this.target = target;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public int getRest() {
                return rest;
            }

            public void setRest(int rest) {
                this.rest = rest;
            }
        }

        public static class _$0612Bean {
            /**
             * holiday : true
             * name : 端午节
             * wage : 3
             * date : 2021-06-12
             * rest : 35
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;
            private int rest;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public int getRest() {
                return rest;
            }

            public void setRest(int rest) {
                this.rest = rest;
            }
        }

        public static class _$0613Bean {
            /**
             * holiday : true
             * name : 端午节
             * wage : 2
             * date : 2021-06-13
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }

        public static class _$0614Bean {
            /**
             * holiday : true
             * name : 端午节
             * wage : 2
             * date : 2021-06-14
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }

        public static class _$0918Bean {
            /**
             * holiday : false
             * after : false
             * name : 中秋节前调休
             * wage : 1
             * target : 中秋节
             * date : 2021-09-18
             * rest : 1
             */

            private boolean holiday;
            private boolean after;
            private String name;
            private int wage;
            private String target;
            private String date;
            private int rest;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public boolean isAfter() {
                return after;
            }

            public void setAfter(boolean after) {
                this.after = after;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getTarget() {
                return target;
            }

            public void setTarget(String target) {
                this.target = target;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public int getRest() {
                return rest;
            }

            public void setRest(int rest) {
                this.rest = rest;
            }
        }

        public static class _$0919Bean {
            /**
             * holiday : true
             * name : 中秋节
             * wage : 3
             * date : 2021-09-19
             * rest : 2
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;
            private int rest;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public int getRest() {
                return rest;
            }

            public void setRest(int rest) {
                this.rest = rest;
            }
        }

        public static class _$0920Bean {
            /**
             * holiday : true
             * name : 中秋节
             * wage : 2
             * date : 2021-09-20
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }

        public static class _$0921Bean {
            /**
             * holiday : true
             * name : 中秋节
             * wage : 2
             * date : 2021-09-21
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }

        public static class _$0926Bean {
            /**
             * holiday : false
             * after : false
             * name : 国庆节前调休
             * wage : 1
             * target : 国庆节
             * date : 2021-09-26
             */

            private boolean holiday;
            private boolean after;
            private String name;
            private int wage;
            private String target;
            private String date;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public boolean isAfter() {
                return after;
            }

            public void setAfter(boolean after) {
                this.after = after;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getTarget() {
                return target;
            }

            public void setTarget(String target) {
                this.target = target;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }

        public static class _$1001Bean {
            /**
             * holiday : true
             * name : 国庆节
             * wage : 3
             * date : 2021-10-01
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }

        public static class _$1002Bean {
            /**
             * holiday : true
             * name : 国庆节
             * wage : 3
             * date : 2021-10-02
             * rest : 1
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;
            private int rest;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public int getRest() {
                return rest;
            }

            public void setRest(int rest) {
                this.rest = rest;
            }
        }

        public static class _$1003Bean {
            /**
             * holiday : true
             * name : 国庆节
             * wage : 3
             * date : 2021-10-03
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }

        public static class _$1004Bean {
            /**
             * holiday : true
             * name : 国庆节
             * wage : 2
             * date : 2021-10-04
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }

        public static class _$1005Bean {
            /**
             * holiday : true
             * name : 国庆节
             * wage : 2
             * date : 2021-10-05
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }

        public static class _$1006Bean {
            /**
             * holiday : true
             * name : 国庆节
             * wage : 2
             * date : 2021-10-06
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }

        public static class _$1007Bean {
            /**
             * holiday : true
             * name : 国庆节
             * wage : 2
             * date : 2021-10-07
             */

            private boolean holiday;
            private String name;
            private int wage;
            private String date;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }

        public static class _$1009Bean {
            /**
             * holiday : false
             * name : 国庆节后调休
             * after : true
             * wage : 1
             * target : 国庆节
             * date : 2021-10-09
             */

            private boolean holiday;
            private String name;
            private boolean after;
            private int wage;
            private String target;
            private String date;

            public boolean isHoliday() {
                return holiday;
            }

            public void setHoliday(boolean holiday) {
                this.holiday = holiday;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public boolean isAfter() {
                return after;
            }

            public void setAfter(boolean after) {
                this.after = after;
            }

            public int getWage() {
                return wage;
            }

            public void setWage(int wage) {
                this.wage = wage;
            }

            public String getTarget() {
                return target;
            }

            public void setTarget(String target) {
                this.target = target;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }
        }
    }
}
