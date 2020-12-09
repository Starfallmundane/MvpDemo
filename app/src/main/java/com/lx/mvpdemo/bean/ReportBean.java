package com.lx.mvpdemo.bean;

import com.google.gson.annotations.SerializedName;

public class ReportBean {


    /**
     * checkTaskList : {"0":{"id":"16","pid":"82","uid":"3","p_uid":"3","type":"2","status":"5","state":"1","share_num":"0","one_num":"1","two_num":"0","thr_num":"0","four_num":"0","total_num":"1","amount":"10.00","picture":"/Public/Uploads/picture/20201125/5fbe074217fbe.jpg","content":null,"fail_desc":null,"fail_picture":"","succ_picture":"","appeal_text":"","phone":null,"isdel":"0","due_time":"1606309888","shenhe_time":"","addtime":"1606288288","update_time":"1606361872","appeal_picture":"","desc_text":"一级群分享"},"1":{"id":"58","pid":"82","uid":"3","p_uid":"3","type":"2","status":"5","state":"1","share_num":"0","one_num":"1","two_num":"0","thr_num":"0","four_num":"0","total_num":"1","amount":"10.00","picture":"/Public/Uploads/picture/20201127/5fc07dc494654.jpg","content":null,"fail_desc":"123","fail_picture":"/Public/Uploads/picture/20201127/5fc110bbb6d3d.jpg","succ_picture":"/Public/Uploads/picture/20201127/5fc110b7a34ee.jpg","appeal_text":"","phone":null,"isdel":"0","due_time":"1606463199","shenhe_time":"1606488259","addtime":"1606441599","update_time":"1606488358","appeal_picture":"","desc_text":"一级群分享"},"2":{"id":"231","pid":"82","uid":"3","p_uid":"3","type":"2","status":"5","state":"1","share_num":"0","one_num":"1","two_num":"0","thr_num":"0","four_num":"0","total_num":"1","amount":"10.00","picture":"/Public/Uploads/picture/20201209/5fd04a1dc714b.jpg","content":null,"fail_desc":null,"fail_picture":"","succ_picture":"","appeal_text":"","phone":null,"isdel":"0","due_time":"1607507576","shenhe_time":"","addtime":"1607485976","update_time":"1607486093","appeal_picture":"","desc_text":"一级群分享"},"3":{"id":"232","pid":"82","uid":"3","p_uid":"3","type":"2","status":"5","state":"1","share_num":"0","one_num":"1","two_num":"0","thr_num":"0","four_num":"0","total_num":"1","amount":"10.00","picture":"/Public/Uploads/picture/20201209/5fd04c542b912.jpg","content":null,"fail_desc":null,"fail_picture":"","succ_picture":"","appeal_text":"","phone":null,"isdel":"0","due_time":"1607508143","shenhe_time":"","addtime":"1607486543","update_time":"1607486599","appeal_picture":"","desc_text":"一级群分享"},"4":{"id":"233","pid":"82","uid":"3","p_uid":"3","type":"2","status":"5","state":"1","share_num":"0","one_num":"1","two_num":"0","thr_num":"0","four_num":"0","total_num":"1","amount":"10.00","picture":"/Public/Uploads/picture/20201209/5fd04e4a06f72.jpg","content":null,"fail_desc":null,"fail_picture":"","succ_picture":"","appeal_text":"","phone":null,"isdel":"0","due_time":"1607508644","shenhe_time":"","addtime":"1607487044","update_time":"1607487093","appeal_picture":"","desc_text":"一级群分享"},"5":{"id":"32","pid":"82","uid":"3","p_uid":"3","type":"2","status":"5","state":"1","share_num":"0","one_num":"0","two_num":"0","thr_num":"0","four_num":"1","total_num":"1","amount":"10.00","picture":"/Public/Uploads/picture/20201126/5fbf26576e568.jpg","content":null,"fail_desc":null,"fail_picture":"","succ_picture":"","appeal_text":"","phone":null,"isdel":"0","due_time":"1606378237","shenhe_time":"","addtime":"1606356637","update_time":"1606382695","appeal_picture":"","desc_text":"二级群转发"},"reportInfo":{"id":"4","type":"2","status":"1","pid":"32","tip_uid":"3","get_uid":"3","hg_picture":"/Public/Uploads/picture/20201126/5fbf745e9fb36.jpg","jb_picture":"/Public/Uploads/picture/20201126/5fbf746422130.jpg","jb_desc":"","shenhe":"1","reason":null,"result":null,"jb_time":"1606382695","cl_time":null,"addtime":"1606382695","update_time":"1606382695"}}
     * extensionInfo : {"id":"82","uid":"3","cid":"1","number_id":"000000082","price":"0.00","one_price":"10.00","two_price":"0.00","thr_price":"0.00","four_price":"10.00","content":"1234","picture":"/Public/Uploads/picture/20201125/5fbdd5af0f11e.jpg","one_picture":"/Public/Uploads/picture/20201125/5fbdd5d3952e4.jpg","two_picture":"null","thr_picture":"null","four_picture":"/Public/Uploads/picture/20201125/5fbdd5f9206ad.jpg","browse_num":"0","share_num":"0","addtime":"1606276656"}
     */

    private CheckTaskListBean checkTaskList;
    private ExtensionInfoBean extensionInfo;

    public CheckTaskListBean getCheckTaskList() {
        return checkTaskList;
    }

    public void setCheckTaskList(CheckTaskListBean checkTaskList) {
        this.checkTaskList = checkTaskList;
    }

    public ExtensionInfoBean getExtensionInfo() {
        return extensionInfo;
    }

    public void setExtensionInfo(ExtensionInfoBean extensionInfo) {
        this.extensionInfo = extensionInfo;
    }

    public static class CheckTaskListBean {
        /**
         * 0 : {"id":"16","pid":"82","uid":"3","p_uid":"3","type":"2","status":"5","state":"1","share_num":"0","one_num":"1","two_num":"0","thr_num":"0","four_num":"0","total_num":"1","amount":"10.00","picture":"/Public/Uploads/picture/20201125/5fbe074217fbe.jpg","content":null,"fail_desc":null,"fail_picture":"","succ_picture":"","appeal_text":"","phone":null,"isdel":"0","due_time":"1606309888","shenhe_time":"","addtime":"1606288288","update_time":"1606361872","appeal_picture":"","desc_text":"一级群分享"}
         * 1 : {"id":"58","pid":"82","uid":"3","p_uid":"3","type":"2","status":"5","state":"1","share_num":"0","one_num":"1","two_num":"0","thr_num":"0","four_num":"0","total_num":"1","amount":"10.00","picture":"/Public/Uploads/picture/20201127/5fc07dc494654.jpg","content":null,"fail_desc":"123","fail_picture":"/Public/Uploads/picture/20201127/5fc110bbb6d3d.jpg","succ_picture":"/Public/Uploads/picture/20201127/5fc110b7a34ee.jpg","appeal_text":"","phone":null,"isdel":"0","due_time":"1606463199","shenhe_time":"1606488259","addtime":"1606441599","update_time":"1606488358","appeal_picture":"","desc_text":"一级群分享"}
         * 2 : {"id":"231","pid":"82","uid":"3","p_uid":"3","type":"2","status":"5","state":"1","share_num":"0","one_num":"1","two_num":"0","thr_num":"0","four_num":"0","total_num":"1","amount":"10.00","picture":"/Public/Uploads/picture/20201209/5fd04a1dc714b.jpg","content":null,"fail_desc":null,"fail_picture":"","succ_picture":"","appeal_text":"","phone":null,"isdel":"0","due_time":"1607507576","shenhe_time":"","addtime":"1607485976","update_time":"1607486093","appeal_picture":"","desc_text":"一级群分享"}
         * 3 : {"id":"232","pid":"82","uid":"3","p_uid":"3","type":"2","status":"5","state":"1","share_num":"0","one_num":"1","two_num":"0","thr_num":"0","four_num":"0","total_num":"1","amount":"10.00","picture":"/Public/Uploads/picture/20201209/5fd04c542b912.jpg","content":null,"fail_desc":null,"fail_picture":"","succ_picture":"","appeal_text":"","phone":null,"isdel":"0","due_time":"1607508143","shenhe_time":"","addtime":"1607486543","update_time":"1607486599","appeal_picture":"","desc_text":"一级群分享"}
         * 4 : {"id":"233","pid":"82","uid":"3","p_uid":"3","type":"2","status":"5","state":"1","share_num":"0","one_num":"1","two_num":"0","thr_num":"0","four_num":"0","total_num":"1","amount":"10.00","picture":"/Public/Uploads/picture/20201209/5fd04e4a06f72.jpg","content":null,"fail_desc":null,"fail_picture":"","succ_picture":"","appeal_text":"","phone":null,"isdel":"0","due_time":"1607508644","shenhe_time":"","addtime":"1607487044","update_time":"1607487093","appeal_picture":"","desc_text":"一级群分享"}
         * 5 : {"id":"32","pid":"82","uid":"3","p_uid":"3","type":"2","status":"5","state":"1","share_num":"0","one_num":"0","two_num":"0","thr_num":"0","four_num":"1","total_num":"1","amount":"10.00","picture":"/Public/Uploads/picture/20201126/5fbf26576e568.jpg","content":null,"fail_desc":null,"fail_picture":"","succ_picture":"","appeal_text":"","phone":null,"isdel":"0","due_time":"1606378237","shenhe_time":"","addtime":"1606356637","update_time":"1606382695","appeal_picture":"","desc_text":"二级群转发"}
         * reportInfo : {"id":"4","type":"2","status":"1","pid":"32","tip_uid":"3","get_uid":"3","hg_picture":"/Public/Uploads/picture/20201126/5fbf745e9fb36.jpg","jb_picture":"/Public/Uploads/picture/20201126/5fbf746422130.jpg","jb_desc":"","shenhe":"1","reason":null,"result":null,"jb_time":"1606382695","cl_time":null,"addtime":"1606382695","update_time":"1606382695"}
         */

        @SerializedName("0")
        private _$0Bean _$0;
        @SerializedName("1")
        private _$1Bean _$1;
        @SerializedName("2")
        private _$2Bean _$2;
        @SerializedName("3")
        private _$3Bean _$3;
        @SerializedName("4")
        private _$4Bean _$4;
        @SerializedName("5")
        private _$5Bean _$5;
        private ReportInfoBean reportInfo;

        public _$0Bean get_$0() {
            return _$0;
        }

        public void set_$0(_$0Bean _$0) {
            this._$0 = _$0;
        }

        public _$1Bean get_$1() {
            return _$1;
        }

        public void set_$1(_$1Bean _$1) {
            this._$1 = _$1;
        }

        public _$2Bean get_$2() {
            return _$2;
        }

        public void set_$2(_$2Bean _$2) {
            this._$2 = _$2;
        }

        public _$3Bean get_$3() {
            return _$3;
        }

        public void set_$3(_$3Bean _$3) {
            this._$3 = _$3;
        }

        public _$4Bean get_$4() {
            return _$4;
        }

        public void set_$4(_$4Bean _$4) {
            this._$4 = _$4;
        }

        public _$5Bean get_$5() {
            return _$5;
        }

        public void set_$5(_$5Bean _$5) {
            this._$5 = _$5;
        }

        public ReportInfoBean getReportInfo() {
            return reportInfo;
        }

        public void setReportInfo(ReportInfoBean reportInfo) {
            this.reportInfo = reportInfo;
        }

        public static class _$0Bean {
            /**
             * id : 16
             * pid : 82
             * uid : 3
             * p_uid : 3
             * type : 2
             * status : 5
             * state : 1
             * share_num : 0
             * one_num : 1
             * two_num : 0
             * thr_num : 0
             * four_num : 0
             * total_num : 1
             * amount : 10.00
             * picture : /Public/Uploads/picture/20201125/5fbe074217fbe.jpg
             * content : null
             * fail_desc : null
             * fail_picture :
             * succ_picture :
             * appeal_text :
             * phone : null
             * isdel : 0
             * due_time : 1606309888
             * shenhe_time :
             * addtime : 1606288288
             * update_time : 1606361872
             * appeal_picture :
             * desc_text : 一级群分享
             */

            private String id;
            private String pid;
            private String uid;
            private String p_uid;
            private String type;
            private String status;
            private String state;
            private String share_num;
            private String one_num;
            private String two_num;
            private String thr_num;
            private String four_num;
            private String total_num;
            private String amount;
            private String picture;
            private Object content;
            private Object fail_desc;
            private String fail_picture;
            private String succ_picture;
            private String appeal_text;
            private Object phone;
            private String isdel;
            private String due_time;
            private String shenhe_time;
            private String addtime;
            private String update_time;
            private String appeal_picture;
            private String desc_text;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getPid() {
                return pid;
            }

            public void setPid(String pid) {
                this.pid = pid;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getP_uid() {
                return p_uid;
            }

            public void setP_uid(String p_uid) {
                this.p_uid = p_uid;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getShare_num() {
                return share_num;
            }

            public void setShare_num(String share_num) {
                this.share_num = share_num;
            }

            public String getOne_num() {
                return one_num;
            }

            public void setOne_num(String one_num) {
                this.one_num = one_num;
            }

            public String getTwo_num() {
                return two_num;
            }

            public void setTwo_num(String two_num) {
                this.two_num = two_num;
            }

            public String getThr_num() {
                return thr_num;
            }

            public void setThr_num(String thr_num) {
                this.thr_num = thr_num;
            }

            public String getFour_num() {
                return four_num;
            }

            public void setFour_num(String four_num) {
                this.four_num = four_num;
            }

            public String getTotal_num() {
                return total_num;
            }

            public void setTotal_num(String total_num) {
                this.total_num = total_num;
            }

            public String getAmount() {
                return amount;
            }

            public void setAmount(String amount) {
                this.amount = amount;
            }

            public String getPicture() {
                return picture;
            }

            public void setPicture(String picture) {
                this.picture = picture;
            }

            public Object getContent() {
                return content;
            }

            public void setContent(Object content) {
                this.content = content;
            }

            public Object getFail_desc() {
                return fail_desc;
            }

            public void setFail_desc(Object fail_desc) {
                this.fail_desc = fail_desc;
            }

            public String getFail_picture() {
                return fail_picture;
            }

            public void setFail_picture(String fail_picture) {
                this.fail_picture = fail_picture;
            }

            public String getSucc_picture() {
                return succ_picture;
            }

            public void setSucc_picture(String succ_picture) {
                this.succ_picture = succ_picture;
            }

            public String getAppeal_text() {
                return appeal_text;
            }

            public void setAppeal_text(String appeal_text) {
                this.appeal_text = appeal_text;
            }

            public Object getPhone() {
                return phone;
            }

            public void setPhone(Object phone) {
                this.phone = phone;
            }

            public String getIsdel() {
                return isdel;
            }

            public void setIsdel(String isdel) {
                this.isdel = isdel;
            }

            public String getDue_time() {
                return due_time;
            }

            public void setDue_time(String due_time) {
                this.due_time = due_time;
            }

            public String getShenhe_time() {
                return shenhe_time;
            }

            public void setShenhe_time(String shenhe_time) {
                this.shenhe_time = shenhe_time;
            }

            public String getAddtime() {
                return addtime;
            }

            public void setAddtime(String addtime) {
                this.addtime = addtime;
            }

            public String getUpdate_time() {
                return update_time;
            }

            public void setUpdate_time(String update_time) {
                this.update_time = update_time;
            }

            public String getAppeal_picture() {
                return appeal_picture;
            }

            public void setAppeal_picture(String appeal_picture) {
                this.appeal_picture = appeal_picture;
            }

            public String getDesc_text() {
                return desc_text;
            }

            public void setDesc_text(String desc_text) {
                this.desc_text = desc_text;
            }
        }

        public static class _$1Bean {
            /**
             * id : 58
             * pid : 82
             * uid : 3
             * p_uid : 3
             * type : 2
             * status : 5
             * state : 1
             * share_num : 0
             * one_num : 1
             * two_num : 0
             * thr_num : 0
             * four_num : 0
             * total_num : 1
             * amount : 10.00
             * picture : /Public/Uploads/picture/20201127/5fc07dc494654.jpg
             * content : null
             * fail_desc : 123
             * fail_picture : /Public/Uploads/picture/20201127/5fc110bbb6d3d.jpg
             * succ_picture : /Public/Uploads/picture/20201127/5fc110b7a34ee.jpg
             * appeal_text :
             * phone : null
             * isdel : 0
             * due_time : 1606463199
             * shenhe_time : 1606488259
             * addtime : 1606441599
             * update_time : 1606488358
             * appeal_picture :
             * desc_text : 一级群分享
             */

            private String id;
            private String pid;
            private String uid;
            private String p_uid;
            private String type;
            private String status;
            private String state;
            private String share_num;
            private String one_num;
            private String two_num;
            private String thr_num;
            private String four_num;
            private String total_num;
            private String amount;
            private String picture;
            private Object content;
            private String fail_desc;
            private String fail_picture;
            private String succ_picture;
            private String appeal_text;
            private Object phone;
            private String isdel;
            private String due_time;
            private String shenhe_time;
            private String addtime;
            private String update_time;
            private String appeal_picture;
            private String desc_text;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getPid() {
                return pid;
            }

            public void setPid(String pid) {
                this.pid = pid;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getP_uid() {
                return p_uid;
            }

            public void setP_uid(String p_uid) {
                this.p_uid = p_uid;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getShare_num() {
                return share_num;
            }

            public void setShare_num(String share_num) {
                this.share_num = share_num;
            }

            public String getOne_num() {
                return one_num;
            }

            public void setOne_num(String one_num) {
                this.one_num = one_num;
            }

            public String getTwo_num() {
                return two_num;
            }

            public void setTwo_num(String two_num) {
                this.two_num = two_num;
            }

            public String getThr_num() {
                return thr_num;
            }

            public void setThr_num(String thr_num) {
                this.thr_num = thr_num;
            }

            public String getFour_num() {
                return four_num;
            }

            public void setFour_num(String four_num) {
                this.four_num = four_num;
            }

            public String getTotal_num() {
                return total_num;
            }

            public void setTotal_num(String total_num) {
                this.total_num = total_num;
            }

            public String getAmount() {
                return amount;
            }

            public void setAmount(String amount) {
                this.amount = amount;
            }

            public String getPicture() {
                return picture;
            }

            public void setPicture(String picture) {
                this.picture = picture;
            }

            public Object getContent() {
                return content;
            }

            public void setContent(Object content) {
                this.content = content;
            }

            public String getFail_desc() {
                return fail_desc;
            }

            public void setFail_desc(String fail_desc) {
                this.fail_desc = fail_desc;
            }

            public String getFail_picture() {
                return fail_picture;
            }

            public void setFail_picture(String fail_picture) {
                this.fail_picture = fail_picture;
            }

            public String getSucc_picture() {
                return succ_picture;
            }

            public void setSucc_picture(String succ_picture) {
                this.succ_picture = succ_picture;
            }

            public String getAppeal_text() {
                return appeal_text;
            }

            public void setAppeal_text(String appeal_text) {
                this.appeal_text = appeal_text;
            }

            public Object getPhone() {
                return phone;
            }

            public void setPhone(Object phone) {
                this.phone = phone;
            }

            public String getIsdel() {
                return isdel;
            }

            public void setIsdel(String isdel) {
                this.isdel = isdel;
            }

            public String getDue_time() {
                return due_time;
            }

            public void setDue_time(String due_time) {
                this.due_time = due_time;
            }

            public String getShenhe_time() {
                return shenhe_time;
            }

            public void setShenhe_time(String shenhe_time) {
                this.shenhe_time = shenhe_time;
            }

            public String getAddtime() {
                return addtime;
            }

            public void setAddtime(String addtime) {
                this.addtime = addtime;
            }

            public String getUpdate_time() {
                return update_time;
            }

            public void setUpdate_time(String update_time) {
                this.update_time = update_time;
            }

            public String getAppeal_picture() {
                return appeal_picture;
            }

            public void setAppeal_picture(String appeal_picture) {
                this.appeal_picture = appeal_picture;
            }

            public String getDesc_text() {
                return desc_text;
            }

            public void setDesc_text(String desc_text) {
                this.desc_text = desc_text;
            }
        }

        public static class _$2Bean {
            /**
             * id : 231
             * pid : 82
             * uid : 3
             * p_uid : 3
             * type : 2
             * status : 5
             * state : 1
             * share_num : 0
             * one_num : 1
             * two_num : 0
             * thr_num : 0
             * four_num : 0
             * total_num : 1
             * amount : 10.00
             * picture : /Public/Uploads/picture/20201209/5fd04a1dc714b.jpg
             * content : null
             * fail_desc : null
             * fail_picture :
             * succ_picture :
             * appeal_text :
             * phone : null
             * isdel : 0
             * due_time : 1607507576
             * shenhe_time :
             * addtime : 1607485976
             * update_time : 1607486093
             * appeal_picture :
             * desc_text : 一级群分享
             */

            private String id;
            private String pid;
            private String uid;
            private String p_uid;
            private String type;
            private String status;
            private String state;
            private String share_num;
            private String one_num;
            private String two_num;
            private String thr_num;
            private String four_num;
            private String total_num;
            private String amount;
            private String picture;
            private Object content;
            private Object fail_desc;
            private String fail_picture;
            private String succ_picture;
            private String appeal_text;
            private Object phone;
            private String isdel;
            private String due_time;
            private String shenhe_time;
            private String addtime;
            private String update_time;
            private String appeal_picture;
            private String desc_text;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getPid() {
                return pid;
            }

            public void setPid(String pid) {
                this.pid = pid;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getP_uid() {
                return p_uid;
            }

            public void setP_uid(String p_uid) {
                this.p_uid = p_uid;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getShare_num() {
                return share_num;
            }

            public void setShare_num(String share_num) {
                this.share_num = share_num;
            }

            public String getOne_num() {
                return one_num;
            }

            public void setOne_num(String one_num) {
                this.one_num = one_num;
            }

            public String getTwo_num() {
                return two_num;
            }

            public void setTwo_num(String two_num) {
                this.two_num = two_num;
            }

            public String getThr_num() {
                return thr_num;
            }

            public void setThr_num(String thr_num) {
                this.thr_num = thr_num;
            }

            public String getFour_num() {
                return four_num;
            }

            public void setFour_num(String four_num) {
                this.four_num = four_num;
            }

            public String getTotal_num() {
                return total_num;
            }

            public void setTotal_num(String total_num) {
                this.total_num = total_num;
            }

            public String getAmount() {
                return amount;
            }

            public void setAmount(String amount) {
                this.amount = amount;
            }

            public String getPicture() {
                return picture;
            }

            public void setPicture(String picture) {
                this.picture = picture;
            }

            public Object getContent() {
                return content;
            }

            public void setContent(Object content) {
                this.content = content;
            }

            public Object getFail_desc() {
                return fail_desc;
            }

            public void setFail_desc(Object fail_desc) {
                this.fail_desc = fail_desc;
            }

            public String getFail_picture() {
                return fail_picture;
            }

            public void setFail_picture(String fail_picture) {
                this.fail_picture = fail_picture;
            }

            public String getSucc_picture() {
                return succ_picture;
            }

            public void setSucc_picture(String succ_picture) {
                this.succ_picture = succ_picture;
            }

            public String getAppeal_text() {
                return appeal_text;
            }

            public void setAppeal_text(String appeal_text) {
                this.appeal_text = appeal_text;
            }

            public Object getPhone() {
                return phone;
            }

            public void setPhone(Object phone) {
                this.phone = phone;
            }

            public String getIsdel() {
                return isdel;
            }

            public void setIsdel(String isdel) {
                this.isdel = isdel;
            }

            public String getDue_time() {
                return due_time;
            }

            public void setDue_time(String due_time) {
                this.due_time = due_time;
            }

            public String getShenhe_time() {
                return shenhe_time;
            }

            public void setShenhe_time(String shenhe_time) {
                this.shenhe_time = shenhe_time;
            }

            public String getAddtime() {
                return addtime;
            }

            public void setAddtime(String addtime) {
                this.addtime = addtime;
            }

            public String getUpdate_time() {
                return update_time;
            }

            public void setUpdate_time(String update_time) {
                this.update_time = update_time;
            }

            public String getAppeal_picture() {
                return appeal_picture;
            }

            public void setAppeal_picture(String appeal_picture) {
                this.appeal_picture = appeal_picture;
            }

            public String getDesc_text() {
                return desc_text;
            }

            public void setDesc_text(String desc_text) {
                this.desc_text = desc_text;
            }
        }

        public static class _$3Bean {
            /**
             * id : 232
             * pid : 82
             * uid : 3
             * p_uid : 3
             * type : 2
             * status : 5
             * state : 1
             * share_num : 0
             * one_num : 1
             * two_num : 0
             * thr_num : 0
             * four_num : 0
             * total_num : 1
             * amount : 10.00
             * picture : /Public/Uploads/picture/20201209/5fd04c542b912.jpg
             * content : null
             * fail_desc : null
             * fail_picture :
             * succ_picture :
             * appeal_text :
             * phone : null
             * isdel : 0
             * due_time : 1607508143
             * shenhe_time :
             * addtime : 1607486543
             * update_time : 1607486599
             * appeal_picture :
             * desc_text : 一级群分享
             */

            private String id;
            private String pid;
            private String uid;
            private String p_uid;
            private String type;
            private String status;
            private String state;
            private String share_num;
            private String one_num;
            private String two_num;
            private String thr_num;
            private String four_num;
            private String total_num;
            private String amount;
            private String picture;
            private Object content;
            private Object fail_desc;
            private String fail_picture;
            private String succ_picture;
            private String appeal_text;
            private Object phone;
            private String isdel;
            private String due_time;
            private String shenhe_time;
            private String addtime;
            private String update_time;
            private String appeal_picture;
            private String desc_text;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getPid() {
                return pid;
            }

            public void setPid(String pid) {
                this.pid = pid;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getP_uid() {
                return p_uid;
            }

            public void setP_uid(String p_uid) {
                this.p_uid = p_uid;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getShare_num() {
                return share_num;
            }

            public void setShare_num(String share_num) {
                this.share_num = share_num;
            }

            public String getOne_num() {
                return one_num;
            }

            public void setOne_num(String one_num) {
                this.one_num = one_num;
            }

            public String getTwo_num() {
                return two_num;
            }

            public void setTwo_num(String two_num) {
                this.two_num = two_num;
            }

            public String getThr_num() {
                return thr_num;
            }

            public void setThr_num(String thr_num) {
                this.thr_num = thr_num;
            }

            public String getFour_num() {
                return four_num;
            }

            public void setFour_num(String four_num) {
                this.four_num = four_num;
            }

            public String getTotal_num() {
                return total_num;
            }

            public void setTotal_num(String total_num) {
                this.total_num = total_num;
            }

            public String getAmount() {
                return amount;
            }

            public void setAmount(String amount) {
                this.amount = amount;
            }

            public String getPicture() {
                return picture;
            }

            public void setPicture(String picture) {
                this.picture = picture;
            }

            public Object getContent() {
                return content;
            }

            public void setContent(Object content) {
                this.content = content;
            }

            public Object getFail_desc() {
                return fail_desc;
            }

            public void setFail_desc(Object fail_desc) {
                this.fail_desc = fail_desc;
            }

            public String getFail_picture() {
                return fail_picture;
            }

            public void setFail_picture(String fail_picture) {
                this.fail_picture = fail_picture;
            }

            public String getSucc_picture() {
                return succ_picture;
            }

            public void setSucc_picture(String succ_picture) {
                this.succ_picture = succ_picture;
            }

            public String getAppeal_text() {
                return appeal_text;
            }

            public void setAppeal_text(String appeal_text) {
                this.appeal_text = appeal_text;
            }

            public Object getPhone() {
                return phone;
            }

            public void setPhone(Object phone) {
                this.phone = phone;
            }

            public String getIsdel() {
                return isdel;
            }

            public void setIsdel(String isdel) {
                this.isdel = isdel;
            }

            public String getDue_time() {
                return due_time;
            }

            public void setDue_time(String due_time) {
                this.due_time = due_time;
            }

            public String getShenhe_time() {
                return shenhe_time;
            }

            public void setShenhe_time(String shenhe_time) {
                this.shenhe_time = shenhe_time;
            }

            public String getAddtime() {
                return addtime;
            }

            public void setAddtime(String addtime) {
                this.addtime = addtime;
            }

            public String getUpdate_time() {
                return update_time;
            }

            public void setUpdate_time(String update_time) {
                this.update_time = update_time;
            }

            public String getAppeal_picture() {
                return appeal_picture;
            }

            public void setAppeal_picture(String appeal_picture) {
                this.appeal_picture = appeal_picture;
            }

            public String getDesc_text() {
                return desc_text;
            }

            public void setDesc_text(String desc_text) {
                this.desc_text = desc_text;
            }
        }

        public static class _$4Bean {
            /**
             * id : 233
             * pid : 82
             * uid : 3
             * p_uid : 3
             * type : 2
             * status : 5
             * state : 1
             * share_num : 0
             * one_num : 1
             * two_num : 0
             * thr_num : 0
             * four_num : 0
             * total_num : 1
             * amount : 10.00
             * picture : /Public/Uploads/picture/20201209/5fd04e4a06f72.jpg
             * content : null
             * fail_desc : null
             * fail_picture :
             * succ_picture :
             * appeal_text :
             * phone : null
             * isdel : 0
             * due_time : 1607508644
             * shenhe_time :
             * addtime : 1607487044
             * update_time : 1607487093
             * appeal_picture :
             * desc_text : 一级群分享
             */

            private String id;
            private String pid;
            private String uid;
            private String p_uid;
            private String type;
            private String status;
            private String state;
            private String share_num;
            private String one_num;
            private String two_num;
            private String thr_num;
            private String four_num;
            private String total_num;
            private String amount;
            private String picture;
            private Object content;
            private Object fail_desc;
            private String fail_picture;
            private String succ_picture;
            private String appeal_text;
            private Object phone;
            private String isdel;
            private String due_time;
            private String shenhe_time;
            private String addtime;
            private String update_time;
            private String appeal_picture;
            private String desc_text;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getPid() {
                return pid;
            }

            public void setPid(String pid) {
                this.pid = pid;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getP_uid() {
                return p_uid;
            }

            public void setP_uid(String p_uid) {
                this.p_uid = p_uid;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getShare_num() {
                return share_num;
            }

            public void setShare_num(String share_num) {
                this.share_num = share_num;
            }

            public String getOne_num() {
                return one_num;
            }

            public void setOne_num(String one_num) {
                this.one_num = one_num;
            }

            public String getTwo_num() {
                return two_num;
            }

            public void setTwo_num(String two_num) {
                this.two_num = two_num;
            }

            public String getThr_num() {
                return thr_num;
            }

            public void setThr_num(String thr_num) {
                this.thr_num = thr_num;
            }

            public String getFour_num() {
                return four_num;
            }

            public void setFour_num(String four_num) {
                this.four_num = four_num;
            }

            public String getTotal_num() {
                return total_num;
            }

            public void setTotal_num(String total_num) {
                this.total_num = total_num;
            }

            public String getAmount() {
                return amount;
            }

            public void setAmount(String amount) {
                this.amount = amount;
            }

            public String getPicture() {
                return picture;
            }

            public void setPicture(String picture) {
                this.picture = picture;
            }

            public Object getContent() {
                return content;
            }

            public void setContent(Object content) {
                this.content = content;
            }

            public Object getFail_desc() {
                return fail_desc;
            }

            public void setFail_desc(Object fail_desc) {
                this.fail_desc = fail_desc;
            }

            public String getFail_picture() {
                return fail_picture;
            }

            public void setFail_picture(String fail_picture) {
                this.fail_picture = fail_picture;
            }

            public String getSucc_picture() {
                return succ_picture;
            }

            public void setSucc_picture(String succ_picture) {
                this.succ_picture = succ_picture;
            }

            public String getAppeal_text() {
                return appeal_text;
            }

            public void setAppeal_text(String appeal_text) {
                this.appeal_text = appeal_text;
            }

            public Object getPhone() {
                return phone;
            }

            public void setPhone(Object phone) {
                this.phone = phone;
            }

            public String getIsdel() {
                return isdel;
            }

            public void setIsdel(String isdel) {
                this.isdel = isdel;
            }

            public String getDue_time() {
                return due_time;
            }

            public void setDue_time(String due_time) {
                this.due_time = due_time;
            }

            public String getShenhe_time() {
                return shenhe_time;
            }

            public void setShenhe_time(String shenhe_time) {
                this.shenhe_time = shenhe_time;
            }

            public String getAddtime() {
                return addtime;
            }

            public void setAddtime(String addtime) {
                this.addtime = addtime;
            }

            public String getUpdate_time() {
                return update_time;
            }

            public void setUpdate_time(String update_time) {
                this.update_time = update_time;
            }

            public String getAppeal_picture() {
                return appeal_picture;
            }

            public void setAppeal_picture(String appeal_picture) {
                this.appeal_picture = appeal_picture;
            }

            public String getDesc_text() {
                return desc_text;
            }

            public void setDesc_text(String desc_text) {
                this.desc_text = desc_text;
            }
        }

        public static class _$5Bean {
            /**
             * id : 32
             * pid : 82
             * uid : 3
             * p_uid : 3
             * type : 2
             * status : 5
             * state : 1
             * share_num : 0
             * one_num : 0
             * two_num : 0
             * thr_num : 0
             * four_num : 1
             * total_num : 1
             * amount : 10.00
             * picture : /Public/Uploads/picture/20201126/5fbf26576e568.jpg
             * content : null
             * fail_desc : null
             * fail_picture :
             * succ_picture :
             * appeal_text :
             * phone : null
             * isdel : 0
             * due_time : 1606378237
             * shenhe_time :
             * addtime : 1606356637
             * update_time : 1606382695
             * appeal_picture :
             * desc_text : 二级群转发
             */

            private String id;
            private String pid;
            private String uid;
            private String p_uid;
            private String type;
            private String status;
            private String state;
            private String share_num;
            private String one_num;
            private String two_num;
            private String thr_num;
            private String four_num;
            private String total_num;
            private String amount;
            private String picture;
            private Object content;
            private Object fail_desc;
            private String fail_picture;
            private String succ_picture;
            private String appeal_text;
            private Object phone;
            private String isdel;
            private String due_time;
            private String shenhe_time;
            private String addtime;
            private String update_time;
            private String appeal_picture;
            private String desc_text;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getPid() {
                return pid;
            }

            public void setPid(String pid) {
                this.pid = pid;
            }

            public String getUid() {
                return uid;
            }

            public void setUid(String uid) {
                this.uid = uid;
            }

            public String getP_uid() {
                return p_uid;
            }

            public void setP_uid(String p_uid) {
                this.p_uid = p_uid;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getShare_num() {
                return share_num;
            }

            public void setShare_num(String share_num) {
                this.share_num = share_num;
            }

            public String getOne_num() {
                return one_num;
            }

            public void setOne_num(String one_num) {
                this.one_num = one_num;
            }

            public String getTwo_num() {
                return two_num;
            }

            public void setTwo_num(String two_num) {
                this.two_num = two_num;
            }

            public String getThr_num() {
                return thr_num;
            }

            public void setThr_num(String thr_num) {
                this.thr_num = thr_num;
            }

            public String getFour_num() {
                return four_num;
            }

            public void setFour_num(String four_num) {
                this.four_num = four_num;
            }

            public String getTotal_num() {
                return total_num;
            }

            public void setTotal_num(String total_num) {
                this.total_num = total_num;
            }

            public String getAmount() {
                return amount;
            }

            public void setAmount(String amount) {
                this.amount = amount;
            }

            public String getPicture() {
                return picture;
            }

            public void setPicture(String picture) {
                this.picture = picture;
            }

            public Object getContent() {
                return content;
            }

            public void setContent(Object content) {
                this.content = content;
            }

            public Object getFail_desc() {
                return fail_desc;
            }

            public void setFail_desc(Object fail_desc) {
                this.fail_desc = fail_desc;
            }

            public String getFail_picture() {
                return fail_picture;
            }

            public void setFail_picture(String fail_picture) {
                this.fail_picture = fail_picture;
            }

            public String getSucc_picture() {
                return succ_picture;
            }

            public void setSucc_picture(String succ_picture) {
                this.succ_picture = succ_picture;
            }

            public String getAppeal_text() {
                return appeal_text;
            }

            public void setAppeal_text(String appeal_text) {
                this.appeal_text = appeal_text;
            }

            public Object getPhone() {
                return phone;
            }

            public void setPhone(Object phone) {
                this.phone = phone;
            }

            public String getIsdel() {
                return isdel;
            }

            public void setIsdel(String isdel) {
                this.isdel = isdel;
            }

            public String getDue_time() {
                return due_time;
            }

            public void setDue_time(String due_time) {
                this.due_time = due_time;
            }

            public String getShenhe_time() {
                return shenhe_time;
            }

            public void setShenhe_time(String shenhe_time) {
                this.shenhe_time = shenhe_time;
            }

            public String getAddtime() {
                return addtime;
            }

            public void setAddtime(String addtime) {
                this.addtime = addtime;
            }

            public String getUpdate_time() {
                return update_time;
            }

            public void setUpdate_time(String update_time) {
                this.update_time = update_time;
            }

            public String getAppeal_picture() {
                return appeal_picture;
            }

            public void setAppeal_picture(String appeal_picture) {
                this.appeal_picture = appeal_picture;
            }

            public String getDesc_text() {
                return desc_text;
            }

            public void setDesc_text(String desc_text) {
                this.desc_text = desc_text;
            }
        }

        public static class ReportInfoBean {
            /**
             * id : 4
             * type : 2
             * status : 1
             * pid : 32
             * tip_uid : 3
             * get_uid : 3
             * hg_picture : /Public/Uploads/picture/20201126/5fbf745e9fb36.jpg
             * jb_picture : /Public/Uploads/picture/20201126/5fbf746422130.jpg
             * jb_desc :
             * shenhe : 1
             * reason : null
             * result : null
             * jb_time : 1606382695
             * cl_time : null
             * addtime : 1606382695
             * update_time : 1606382695
             */

            private String id;
            private String type;
            private String status;
            private String pid;
            private String tip_uid;
            private String get_uid;
            private String hg_picture;
            private String jb_picture;
            private String jb_desc;
            private String shenhe;
            private Object reason;
            private Object result;
            private String jb_time;
            private Object cl_time;
            private String addtime;
            private String update_time;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getPid() {
                return pid;
            }

            public void setPid(String pid) {
                this.pid = pid;
            }

            public String getTip_uid() {
                return tip_uid;
            }

            public void setTip_uid(String tip_uid) {
                this.tip_uid = tip_uid;
            }

            public String getGet_uid() {
                return get_uid;
            }

            public void setGet_uid(String get_uid) {
                this.get_uid = get_uid;
            }

            public String getHg_picture() {
                return hg_picture;
            }

            public void setHg_picture(String hg_picture) {
                this.hg_picture = hg_picture;
            }

            public String getJb_picture() {
                return jb_picture;
            }

            public void setJb_picture(String jb_picture) {
                this.jb_picture = jb_picture;
            }

            public String getJb_desc() {
                return jb_desc;
            }

            public void setJb_desc(String jb_desc) {
                this.jb_desc = jb_desc;
            }

            public String getShenhe() {
                return shenhe;
            }

            public void setShenhe(String shenhe) {
                this.shenhe = shenhe;
            }

            public Object getReason() {
                return reason;
            }

            public void setReason(Object reason) {
                this.reason = reason;
            }

            public Object getResult() {
                return result;
            }

            public void setResult(Object result) {
                this.result = result;
            }

            public String getJb_time() {
                return jb_time;
            }

            public void setJb_time(String jb_time) {
                this.jb_time = jb_time;
            }

            public Object getCl_time() {
                return cl_time;
            }

            public void setCl_time(Object cl_time) {
                this.cl_time = cl_time;
            }

            public String getAddtime() {
                return addtime;
            }

            public void setAddtime(String addtime) {
                this.addtime = addtime;
            }

            public String getUpdate_time() {
                return update_time;
            }

            public void setUpdate_time(String update_time) {
                this.update_time = update_time;
            }
        }
    }

    public static class ExtensionInfoBean {
        /**
         * id : 82
         * uid : 3
         * cid : 1
         * number_id : 000000082
         * price : 0.00
         * one_price : 10.00
         * two_price : 0.00
         * thr_price : 0.00
         * four_price : 10.00
         * content : 1234
         * picture : /Public/Uploads/picture/20201125/5fbdd5af0f11e.jpg
         * one_picture : /Public/Uploads/picture/20201125/5fbdd5d3952e4.jpg
         * two_picture : null
         * thr_picture : null
         * four_picture : /Public/Uploads/picture/20201125/5fbdd5f9206ad.jpg
         * browse_num : 0
         * share_num : 0
         * addtime : 1606276656
         */

        private String id;
        private String uid;
        private String cid;
        private String number_id;
        private String price;
        private String one_price;
        private String two_price;
        private String thr_price;
        private String four_price;
        private String content;
        private String picture;
        private String one_picture;
        private String two_picture;
        private String thr_picture;
        private String four_picture;
        private String browse_num;
        private String share_num;
        private String addtime;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public String getNumber_id() {
            return number_id;
        }

        public void setNumber_id(String number_id) {
            this.number_id = number_id;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getOne_price() {
            return one_price;
        }

        public void setOne_price(String one_price) {
            this.one_price = one_price;
        }

        public String getTwo_price() {
            return two_price;
        }

        public void setTwo_price(String two_price) {
            this.two_price = two_price;
        }

        public String getThr_price() {
            return thr_price;
        }

        public void setThr_price(String thr_price) {
            this.thr_price = thr_price;
        }

        public String getFour_price() {
            return four_price;
        }

        public void setFour_price(String four_price) {
            this.four_price = four_price;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getPicture() {
            return picture;
        }

        public void setPicture(String picture) {
            this.picture = picture;
        }

        public String getOne_picture() {
            return one_picture;
        }

        public void setOne_picture(String one_picture) {
            this.one_picture = one_picture;
        }

        public String getTwo_picture() {
            return two_picture;
        }

        public void setTwo_picture(String two_picture) {
            this.two_picture = two_picture;
        }

        public String getThr_picture() {
            return thr_picture;
        }

        public void setThr_picture(String thr_picture) {
            this.thr_picture = thr_picture;
        }

        public String getFour_picture() {
            return four_picture;
        }

        public void setFour_picture(String four_picture) {
            this.four_picture = four_picture;
        }

        public String getBrowse_num() {
            return browse_num;
        }

        public void setBrowse_num(String browse_num) {
            this.browse_num = browse_num;
        }

        public String getShare_num() {
            return share_num;
        }

        public void setShare_num(String share_num) {
            this.share_num = share_num;
        }

        public String getAddtime() {
            return addtime;
        }

        public void setAddtime(String addtime) {
            this.addtime = addtime;
        }
    }
}
