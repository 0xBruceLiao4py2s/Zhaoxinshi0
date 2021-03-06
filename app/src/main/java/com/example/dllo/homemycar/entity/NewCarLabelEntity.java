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
 * Created by dllo on 16/9/30.
 */
public class NewCarLabelEntity {

    /**
     * returncode : 0
     * message :
     * result : {"metalist":[{"key":"label","description":"??????","list":[{"value":14,"name":"????????????"},{"value":13,"name":"????????????"},{"value":25,"name":"??????SUV"},{"value":21,"name":"????????????"},{"value":17,"name":"????????????"},{"value":18,"name":"7????????????"}]},{"key":"order","description":"??????","list":[{"value":0,"name":"?????????"},{"value":1,"name":"?????????"},{"value":2,"name":"?????????"}]}]}
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
         * key : label
         * description : ??????
         * list : [{"value":14,"name":"????????????"},{"value":13,"name":"????????????"},{"value":25,"name":"??????SUV"},{"value":21,"name":"????????????"},{"value":17,"name":"????????????"},{"value":18,"name":"7????????????"}]
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
            private String description;
            /**
             * value : 14
             * name : ????????????
             */

            private List<ListBean> list;

            public String getKey() {
                return key;
            }

            public void setKey(String key) {
                this.key = key;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public List<ListBean> getList() {
                return list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            public static class ListBean {
                private int value;
                private String name;

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }
        }
    }
}
