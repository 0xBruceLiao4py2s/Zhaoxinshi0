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
 * Created by dllo on 16/10/8.
 */
public class MarketEntity {

    /**
     * rowcount : 586
     * isloadmore : true
     * headlineinfo : {}
     * focusimg : []
     * newslist : [{"dbid":0,"id":100073354,"title":"??????T70????????????1.2??????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g10/M12/39/D7/s_autohomecar__wKgH4FfWksOAAL9fAAiAZykT3_8845.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":0,"updatetime":""},{"dbid":0,"id":78074472,"title":"??????CC????????????5??? ??????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g11/M0F/14/ED/s_autohomecar__wKjBzFZz8ueAKxwZAAmWjY4bPRM490.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78074263,"title":"?????????GLC???????????? ??????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g7/M13/0E/3E/s_autohomecar__wKgH3VZuNkeAPNdKAAVTWvRXiRI924.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78074218,"title":"????????????2????????? ??????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g19/M05/E4/3C/s_autohomecar__wKgFU1bqcdSAcCPiAAmrfezSiWI456.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78074245,"title":"EX?????????????????? ????????????9??????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g13/M0A/F2/A3/s_autohomecar__wKgH1FeoKaCAKPywAAcjy1kC0iE615.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78074115,"title":"??????508????????? ????????????4.2???","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g15/M0A/AC/94/s_autohomecar__wKgH5VdpKJKAbcYmAAYX0WiX0IA658.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78074203,"title":"??????A4L??????????????? ??????29.98?????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g7/M02/0F/AD/s_autohomecar__wKgH3Ve8Jq-AOoA8AAl9nhGECuU568.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78073840,"title":"??????SLK???????????????10??? ????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://www.autoimg.cn/upload/spec/10949/s_201110122139066623655.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78073308,"title":"EU?????????????????? ??????????????????11???","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g19/M0C/7D/3D/s_autohomecar__wKgFU1bM6_mAG8fiAAeF42X0OzA765.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78073314,"title":"????????????XC60???7.13????????? ???????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g16/M06/88/44/s_autohomecar__wKgH11dC5BaALW73AAfHHSMIOOw184.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78073211,"title":"??????40?????????????????? ??????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://www.autoimg.cn/upload/2013/11/15/s_201311151736051553686.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78073111,"title":"??????GS4??????10.68????????? ????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://www.autoimg.cn/car/upload/2015/5/4/s_201505041729052644178110.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78072958,"title":"??????KX5?????????????????? ????????????3.1???","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g5/M01/90/F0/s_autohomecar__wKjB0ldMCwOAAMBiAAqmHKNGdKU053.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78072763,"title":"Yeti??????????????????2?????? ????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://www.autoimg.cn/car/upload/2015/7/29/s_20150729164752300264110.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78072893,"title":"????????????????????????3??? ??????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g15/M06/4D/AA/s_autohomecar__wKgH5VfhDm2AaE3oAA4CCm97exU193.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78072907,"title":"MODEL X?????????????????? ???????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g5/M0F/5F/F7/s_autohomecar__wKgH21cZg5GAfB0jAAR79x628H4568.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78072463,"title":"???MODEL X???????????? ??????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g5/M0F/5F/F7/s_autohomecar__wKgH21cZg5GAfB0jAAR79x628H4568.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78072415,"title":"??????????????????????????? ??????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://www.autoimg.cn/upload/2014/8/20/s_20140820223127339497110.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78072258,"title":"??????A6L????????????11.36??? ??????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g15/M06/F0/89/s_autohomecar__wKgH5VeoZpGALcoBAAsR5oY50CU663.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78072050,"title":"POLO??????????????? ??????????????????1.3??????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://www.autoimg.cn/upload/2014/8/6/s_20140806072335496497111.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78071855,"title":"2016???MINI????????? ???????????????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g5/M0C/76/D7/s_autohomecar__wKgHzFcwgsmAcu2GAAWkFti5SLs442.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78071377,"title":"????????????????????? ?????????????????????3???","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g13/M13/FD/68/s_autohomecar__wKgH41exrUaAapdJAAVpRN4Fwg8479.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78071235,"title":"???????????????????????? ????????????5000???","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g19/M15/5A/5F/s_autohomecar__wKjBxFcx_K6AU7E5AAfbpuWCmOY121.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78070782,"title":"????????????QX60??????????????? ?????????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g12/M02/5B/D5/s_autohomecar__wKgH4lfpF0WAJTCrAAfhib0jBeI423.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78070767,"title":"??????Q3??????6.2?????? ??????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g8/M09/57/E8/s_autohomecar__wKjBz1cYu12ANSDIAAZJpKAxx6A192.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78070813,"title":"??????X25????????????500??? ??????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g8/M03/01/25/s_autohomecar__wKgHz1ZgfCSAR9NxAAvBUJVnsyU206.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78070581,"title":"??????Q3??????????????????6.9??? ??????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g8/M09/57/E8/s_autohomecar__wKjBz1cYu12ANSDIAAZJpKAxx6A192.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78070598,"title":"????????????XTS????????????9??? ???????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g21/M10/DB/05/s_autohomecar__wKjBwlbn-aWAJXNuAAdUhG35Ris353.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78070553,"title":"?????????XL??????????????? ???????????????2???","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g16/M06/60/66/s_autohomecar__wKjBx1caNi-AMnXLAAWUPRinK2Y004.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78070204,"title":"??????SX6????????? ??????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g5/M08/9B/8E/s_autohomecar__wKgHzFdUMhKAPTbnAAhY6saA9RY748.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""}]
     * topnewsinfo : {}
     */

    private ResultBean result;
    /**
     * result : {"rowcount":586,"isloadmore":true,"headlineinfo":{},"focusimg":[],"newslist":[{"dbid":0,"id":100073354,"title":"??????T70????????????1.2??????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g10/M12/39/D7/s_autohomecar__wKgH4FfWksOAAL9fAAiAZykT3_8845.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":0,"updatetime":""},{"dbid":0,"id":78074472,"title":"??????CC????????????5??? ??????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g11/M0F/14/ED/s_autohomecar__wKjBzFZz8ueAKxwZAAmWjY4bPRM490.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78074263,"title":"?????????GLC???????????? ??????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g7/M13/0E/3E/s_autohomecar__wKgH3VZuNkeAPNdKAAVTWvRXiRI924.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78074218,"title":"????????????2????????? ??????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g19/M05/E4/3C/s_autohomecar__wKgFU1bqcdSAcCPiAAmrfezSiWI456.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78074245,"title":"EX?????????????????? ????????????9??????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g13/M0A/F2/A3/s_autohomecar__wKgH1FeoKaCAKPywAAcjy1kC0iE615.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78074115,"title":"??????508????????? ????????????4.2???","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g15/M0A/AC/94/s_autohomecar__wKgH5VdpKJKAbcYmAAYX0WiX0IA658.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78074203,"title":"??????A4L??????????????? ??????29.98?????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g7/M02/0F/AD/s_autohomecar__wKgH3Ve8Jq-AOoA8AAl9nhGECuU568.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78073840,"title":"??????SLK???????????????10??? ????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://www.autoimg.cn/upload/spec/10949/s_201110122139066623655.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78073308,"title":"EU?????????????????? ??????????????????11???","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g19/M0C/7D/3D/s_autohomecar__wKgFU1bM6_mAG8fiAAeF42X0OzA765.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78073314,"title":"????????????XC60???7.13????????? ???????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g16/M06/88/44/s_autohomecar__wKgH11dC5BaALW73AAfHHSMIOOw184.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78073211,"title":"??????40?????????????????? ??????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://www.autoimg.cn/upload/2013/11/15/s_201311151736051553686.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78073111,"title":"??????GS4??????10.68????????? ????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://www.autoimg.cn/car/upload/2015/5/4/s_201505041729052644178110.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78072958,"title":"??????KX5?????????????????? ????????????3.1???","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g5/M01/90/F0/s_autohomecar__wKjB0ldMCwOAAMBiAAqmHKNGdKU053.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78072763,"title":"Yeti??????????????????2?????? ????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://www.autoimg.cn/car/upload/2015/7/29/s_20150729164752300264110.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78072893,"title":"????????????????????????3??? ??????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g15/M06/4D/AA/s_autohomecar__wKgH5VfhDm2AaE3oAA4CCm97exU193.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78072907,"title":"MODEL X?????????????????? ???????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g5/M0F/5F/F7/s_autohomecar__wKgH21cZg5GAfB0jAAR79x628H4568.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78072463,"title":"???MODEL X???????????? ??????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g5/M0F/5F/F7/s_autohomecar__wKgH21cZg5GAfB0jAAR79x628H4568.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78072415,"title":"??????????????????????????? ??????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://www.autoimg.cn/upload/2014/8/20/s_20140820223127339497110.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78072258,"title":"??????A6L????????????11.36??? ??????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g15/M06/F0/89/s_autohomecar__wKgH5VeoZpGALcoBAAsR5oY50CU663.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78072050,"title":"POLO??????????????? ??????????????????1.3??????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://www.autoimg.cn/upload/2014/8/6/s_20140806072335496497111.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78071855,"title":"2016???MINI????????? ???????????????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g5/M0C/76/D7/s_autohomecar__wKgHzFcwgsmAcu2GAAWkFti5SLs442.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78071377,"title":"????????????????????? ?????????????????????3???","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g13/M13/FD/68/s_autohomecar__wKgH41exrUaAapdJAAVpRN4Fwg8479.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78071235,"title":"???????????????????????? ????????????5000???","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g19/M15/5A/5F/s_autohomecar__wKjBxFcx_K6AU7E5AAfbpuWCmOY121.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78070782,"title":"????????????QX60??????????????? ?????????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g12/M02/5B/D5/s_autohomecar__wKgH4lfpF0WAJTCrAAfhib0jBeI423.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78070767,"title":"??????Q3??????6.2?????? ??????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g8/M09/57/E8/s_autohomecar__wKjBz1cYu12ANSDIAAZJpKAxx6A192.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78070813,"title":"??????X25????????????500??? ??????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g8/M03/01/25/s_autohomecar__wKgHz1ZgfCSAR9NxAAvBUJVnsyU206.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78070581,"title":"??????Q3??????????????????6.9??? ??????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g8/M09/57/E8/s_autohomecar__wKjBz1cYu12ANSDIAAZJpKAxx6A192.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78070598,"title":"????????????XTS????????????9??? ???????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g21/M10/DB/05/s_autohomecar__wKjBwlbn-aWAJXNuAAdUhG35Ris353.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78070553,"title":"?????????XL??????????????? ???????????????2???","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g16/M06/60/66/s_autohomecar__wKjBx1caNi-AMnXLAAWUPRinK2Y004.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""},{"dbid":0,"id":78070204,"title":"??????SX6????????? ??????????????????","mediatype":1,"type":"","time":"2016-10-08","intacttime":"","indexdetail":"","smallpic":"http://car3.autoimg.cn/cardfs/product/g5/M08/9B/8E/s_autohomecar__wKgHzFdUMhKAPTbnAAhY6saA9RY748.jpg","replycount":0,"pagecount":1,"jumppage":1,"lasttime":"","newstype":1,"updatetime":""}],"topnewsinfo":{}}
     * returncode : 0
     * message :
     */

    private int returncode;
    private String message;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

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

    public static class ResultBean {
        private int rowcount;
        private boolean isloadmore;
        private List<?> focusimg;
        /**
         * dbid : 0
         * id : 100073354
         * title : ??????T70????????????1.2??????
         * mediatype : 1
         * type :
         * time : 2016-10-08
         * intacttime :
         * indexdetail :
         * smallpic : http://car3.autoimg.cn/cardfs/product/g10/M12/39/D7/s_autohomecar__wKgH4FfWksOAAL9fAAiAZykT3_8845.jpg
         * replycount : 0
         * pagecount : 1
         * jumppage : 1
         * lasttime :
         * newstype : 0
         * updatetime :
         */

        private List<NewslistBean> newslist;

        public int getRowcount() {
            return rowcount;
        }

        public void setRowcount(int rowcount) {
            this.rowcount = rowcount;
        }

        public boolean isIsloadmore() {
            return isloadmore;
        }

        public void setIsloadmore(boolean isloadmore) {
            this.isloadmore = isloadmore;
        }

        public List<?> getFocusimg() {
            return focusimg;
        }

        public void setFocusimg(List<?> focusimg) {
            this.focusimg = focusimg;
        }

        public List<NewslistBean> getNewslist() {
            return newslist;
        }

        public void setNewslist(List<NewslistBean> newslist) {
            this.newslist = newslist;
        }

        public static class NewslistBean {
            private int dbid;
            private int id;
            private String title;
            private int mediatype;
            private String type;
            private String time;
            private String intacttime;
            private String indexdetail;
            private String smallpic;
            private int replycount;
            private int pagecount;
            private int jumppage;
            private String lasttime;
            private int newstype;
            private String updatetime;

            public int getDbid() {
                return dbid;
            }

            public void setDbid(int dbid) {
                this.dbid = dbid;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getMediatype() {
                return mediatype;
            }

            public void setMediatype(int mediatype) {
                this.mediatype = mediatype;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public String getIntacttime() {
                return intacttime;
            }

            public void setIntacttime(String intacttime) {
                this.intacttime = intacttime;
            }

            public String getIndexdetail() {
                return indexdetail;
            }

            public void setIndexdetail(String indexdetail) {
                this.indexdetail = indexdetail;
            }

            public String getSmallpic() {
                return smallpic;
            }

            public void setSmallpic(String smallpic) {
                this.smallpic = smallpic;
            }

            public int getReplycount() {
                return replycount;
            }

            public void setReplycount(int replycount) {
                this.replycount = replycount;
            }

            public int getPagecount() {
                return pagecount;
            }

            public void setPagecount(int pagecount) {
                this.pagecount = pagecount;
            }

            public int getJumppage() {
                return jumppage;
            }

            public void setJumppage(int jumppage) {
                this.jumppage = jumppage;
            }

            public String getLasttime() {
                return lasttime;
            }

            public void setLasttime(String lasttime) {
                this.lasttime = lasttime;
            }

            public int getNewstype() {
                return newstype;
            }

            public void setNewstype(int newstype) {
                this.newstype = newstype;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }
        }
    }
}
