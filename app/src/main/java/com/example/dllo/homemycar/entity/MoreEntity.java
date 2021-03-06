package com.example.dllo.homemycar.entity; /*
        quu..__
         $$$b  `---.__
          "$$b        `--.                          ___.---uuudP
           `$$b           `.__.------.__     __.---'      $$$$"              .
             "$b          -'            `-.-'            $$$"              .'|
               ".                                       d$"             _.'  |
                 `.   /                              ..."             .'     |
                   `./                           ..::-'            _.'       |
                    /                         .:::-'            .-'         .'
                   :                          ::''\          _.'            |
                  .' .-.             .-.           `.      .'               |
                  : /'$$|           .@"$\           `.   .'              _.-'
                 .'|$u$$|          |$$,$$|           |  <            _.-'
                 | `:$$:'          :$$$$$:           `.  `.       .-'
                 :                  `"--'             |    `-.     \
                :                |                |#'     `..'`..'          `                 \                                   xXX|     /    ./
                  \                                xXXX'|    /   ./
                  /`-.                                  `.  /   /
                 :    `-  ...........,                   | /  .'
                 |         ``:::::::'       .            |<    `.
                 |             ```          |           x| \ `.:``.
                 |                         .'    /'   xXX|  `:`M`M':.
                 |    |                    ;    /:' xXXX'|  -'MMMMM:'
                 `.  .'                   :    /:'       |-'MMMM.-'
                  |  |                   .'   /'        .'MMM.-'
                  `'`'                   :  ,'          |MMM<
                    |                     `'            |tbap\
                     \                                  :MM.-'
                      \                 |              .''
                       \.               `.            /
                        /     .:::::::.. :           /
                       |     .:::::::::::`.         /
                       |   .:::------------\       /
                      /   .''               >::'  /
                      `',:                 :    .'
                                           `:.:'

         
        */

import java.util.List;

/**
 * Created by dllo on 16/9/29.
 */
public class MoreEntity {

    /**
     * returncode : 0
     * message : ok
     * result : {"metalist":[{"key":"newstype","timestamp":636099619431200120,"list":[{"name":"??????+","value":"118","type":"1","iconurl":"http://x.autoimg.cn/app/image/metadataicon/newstype/youchuang3.png?636099619431200120"},{"name":"??????","value":"109","type":"4","iconurl":"http://x.autoimg.cn/app/image/metadataicon/newstype/shuoke3.png?636099619431200120"},{"name":"??????","value":"0","type":"2","iconurl":"http://x.autoimg.cn/app/image/metadataicon/newstype/shipin3.png?636099619431200120"},{"name":"??????","value":"117","type":"5","iconurl":"http://x.autoimg.cn/app/image/metadataicon/newstype/kuaibao3.png?636099619431200120"},{"name":"??????","value":"100","type":"1","iconurl":"http://x.autoimg.cn/app/image/metadataicon/newstype/youji3.png?636099619431200120"},{"name":"??????","value":"2","type":"1","iconurl":"http://x.autoimg.cn/app/image/metadataicon/newstype/hangqing3.png?636099619431200120"},{"name":"??????","value":"1","type":"1","iconurl":"http://x.autoimg.cn/app/image/metadataicon/newstype/xinwen3.png?636099619431200120"},{"name":"??????","value":"3","type":"1","iconurl":"http://x.autoimg.cn/app/image/metadataicon/newstype/pingce3.png?636099619431200120"},{"name":"??????","value":"60","type":"1","iconurl":"http://x.autoimg.cn/app/image/metadataicon/newstype/daogou3.png?636099619431200120"},{"name":"??????","value":"82","type":"1","iconurl":"http://x.autoimg.cn/app/image/metadataicon/newstype/yongche3.png?636099619431200120"},{"name":"??????","value":"102","type":"1","iconurl":"http://x.autoimg.cn/app/image/metadataicon/newstype/jishu3.png?636099619431200120"},{"name":"??????","value":"97","type":"1","iconurl":"http://x.autoimg.cn/app/image/metadataicon/newstype/wenhua3.png?636099619431200120"},{"name":"??????","value":"107","type":"1","iconurl":"http://x.autoimg.cn/app/image/metadataicon/newstype/gaizhuang3.png?636099619431200120"}]},{"key":"videotype","timestamp":636099619431200120,"list":[{"name":"??????","value":"0","type":"1","iconurl":""},{"name":"??????","value":"23","type":"1","iconurl":""},{"name":"????????????","value":"21","type":"1","iconurl":""},{"name":"??????/??????","value":"28","type":"2","iconurl":""},{"name":"??????/??????","value":"3","type":"1","iconurl":""},{"name":"??????","value":"5","type":"1","iconurl":""},{"name":"??????","value":"16","type":"1","iconurl":""},{"name":"?????????","value":"25","type":"1","iconurl":""},{"name":"????????????","value":"29","type":"1","iconurl":""},{"name":"??????","value":"2","type":"1","iconurl":""},{"name":"?????????","value":"19","type":"1","iconurl":""},{"name":"????????????","value":"1","type":"1","iconurl":""},{"name":"??????","value":"13","type":"1","iconurl":""},{"name":"????????????","value":"17","type":"1","iconurl":""},{"name":"??????","value":"11","type":"1","iconurl":""},{"name":"??????","value":"7","type":"1","iconurl":""},{"name":"??????","value":"24","type":"1","iconurl":""},{"name":"?????????","value":"18","type":"1","iconurl":""},{"name":"?????????","value":"30","type":"1","iconurl":""},{"name":"??????","value":"22","type":"1","iconurl":""}]}]}
     */

    private int returncode;
    private String message;
    private ResultBean result;

    public int getReturncode() {
        return returncode;
    }

    public void setReturncode(int returncode) {
        this.returncode = returncode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * key : newstype
         * timestamp : 636099619431200120
         * list : [{"name":"??????+","value":"118","type":"1","iconurl":"http://x.autoimg.cn/app/image/metadataicon/newstype/youchuang3.png?636099619431200120"},{"name":"??????","value":"109","type":"4","iconurl":"http://x.autoimg.cn/app/image/metadataicon/newstype/shuoke3.png?636099619431200120"},{"name":"??????","value":"0","type":"2","iconurl":"http://x.autoimg.cn/app/image/metadataicon/newstype/shipin3.png?636099619431200120"},{"name":"??????","value":"117","type":"5","iconurl":"http://x.autoimg.cn/app/image/metadataicon/newstype/kuaibao3.png?636099619431200120"},{"name":"??????","value":"100","type":"1","iconurl":"http://x.autoimg.cn/app/image/metadataicon/newstype/youji3.png?636099619431200120"},{"name":"??????","value":"2","type":"1","iconurl":"http://x.autoimg.cn/app/image/metadataicon/newstype/hangqing3.png?636099619431200120"},{"name":"??????","value":"1","type":"1","iconurl":"http://x.autoimg.cn/app/image/metadataicon/newstype/xinwen3.png?636099619431200120"},{"name":"??????","value":"3","type":"1","iconurl":"http://x.autoimg.cn/app/image/metadataicon/newstype/pingce3.png?636099619431200120"},{"name":"??????","value":"60","type":"1","iconurl":"http://x.autoimg.cn/app/image/metadataicon/newstype/daogou3.png?636099619431200120"},{"name":"??????","value":"82","type":"1","iconurl":"http://x.autoimg.cn/app/image/metadataicon/newstype/yongche3.png?636099619431200120"},{"name":"??????","value":"102","type":"1","iconurl":"http://x.autoimg.cn/app/image/metadataicon/newstype/jishu3.png?636099619431200120"},{"name":"??????","value":"97","type":"1","iconurl":"http://x.autoimg.cn/app/image/metadataicon/newstype/wenhua3.png?636099619431200120"},{"name":"??????","value":"107","type":"1","iconurl":"http://x.autoimg.cn/app/image/metadataicon/newstype/gaizhuang3.png?636099619431200120"}]
         */

        private List<MetalistBean> metalist;

        public List<MetalistBean> getMetalist() {
            return metalist;
        }

        public void setMetalist(List<MetalistBean> metalist) {
            this.metalist = metalist;
        }

        public static class MetalistBean {
            private String key;
            private long timestamp;
            /**
             * name : ??????+
             * value : 118
             * type : 1
             * iconurl : http://x.autoimg.cn/app/image/metadataicon/newstype/youchuang3.png?636099619431200120
             */

            private List<ListBean> list;

            public String getKey() {
                return key;
            }

            public void setKey(String key) {
                this.key = key;
            }

            public long getTimestamp() {
                return timestamp;
            }

            public void setTimestamp(long timestamp) {
                this.timestamp = timestamp;
            }

            public List<ListBean> getList() {
                return list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            public static class ListBean {
                private String name;
                private String value;
                private String type;
                private String iconurl;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getIconurl() {
                    return iconurl;
                }

                public void setIconurl(String iconurl) {
                    this.iconurl = iconurl;
                }
            }
        }
    }
}
