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
 * Created by dllo on 16/9/21.
 */
public class CenturyEntity {


    /**
     * pageindex : 1
     * pagecount : 10000
     * rowcount : 0
     * updatecount : 30
     * list : [{"bbsid":3777,"bbsname":"??????S330??????","bbstype":"c","topicid":56434873,"title":"?????????????????? ??????S330???????????????","lastreplydate":"2016-09-26 14:49:30","postusername":"k_n_i_g_h_t","replycounts":"185","isclosed":0,"pvid":"","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g14/M05/54/1F/userphotos/2016/09/25/21/240180_wKgH1Vfn06WAWd8rAAEaz_OOrWM323.jpg","topictype":"","views":136567,"postmemberid":0,"imgurl":""},{"bbsid":2357,"bbsname":"MODEL S??????","bbstype":"c","topicid":55938113,"title":"?????????????????? MODEL S 90D?????????","lastreplydate":"2016-09-26 11:57:35","postusername":"xtooo","replycounts":"567","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g6/M08/31/56/userphotos/2016/09/08/23/240180_wKjB0VfRg5mAIZ9lAAE0KZSFdjc682.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":2966,"bbsname":"??????CLA?????????","bbstype":"c","topicid":55754217,"title":"?????????????????? ??????CLA 220????????????","lastreplydate":"2016-09-26 14:26:34","postusername":"marswind16","replycounts":"334","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g14/M09/30/E0/userphotos/2016/09/08/11/240180_wKgH5FfQ1fWAdRdJAAEdOQIxEiw600.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":2565,"bbsname":"???????????????","bbstype":"c","topicid":55526103,"title":"?????????????????? ???????????????????????????","lastreplydate":"2016-09-23 14:16:38","postusername":"morgan_fs","replycounts":"62","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g4/M11/1E/8D/userphotos/2016/08/28/23/240180_wKgHy1fDCnuAIi1YAAFxPvUW38k749.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":3607,"bbsname":"??????7??????","bbstype":"c","topicid":55759139,"title":"?????????????????? ????????????????????????7","lastreplydate":"2016-09-26 14:16:21","postusername":"??????_??????","replycounts":"579","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g18/M0B/51/CE/userphotos/2016/09/21/21/240180_wKgH6FfijwKAXLT6AAXH-rBGH7U181.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":3097,"bbsname":"????????????Q70??????","bbstype":"c","topicid":56177867,"title":"????????????????????? ????????????Q70L??????","lastreplydate":"2016-09-25 18:19:24","postusername":"0????????????0","replycounts":"234","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g11/M11/45/F6/userphotos/2016/09/15/13/240180_wKjBzFfaK2SALDkuAAElNAnswic916.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":3154,"bbsname":"???????????????","bbstype":"c","topicid":55608725,"title":"?????????????????? ???????????????2.5L??????","lastreplydate":"2016-09-26 00:53:16","postusername":"majormoonirl","replycounts":"1115","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g17/M02/1F/C3/userphotos/2016/09/02/15/240180_wKjBxlfJJdqARpPGAAFECJjKDd0182.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":3683,"bbsname":"??????GLE??????M????????????","bbstype":"c","topicid":55271968,"title":"?????????????????? ??????GLE 320????????????","lastreplydate":"2016-09-22 11:19:29","postusername":"NorthBig","replycounts":"214","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g7/M00/0D/3E/userphotos/2016/08/22/09/240180_wKgH3Ve6W46AEbeIAAEe-Q90Juc316.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":3405,"bbsname":"?????????5??????","bbstype":"c","topicid":54674279,"title":"??????????????? ?????????5 1.5L????????????","lastreplydate":"2016-09-25 23:10:13","postusername":"8023??????","replycounts":"630","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g23/M0A/C2/6B/userphotos/2016/07/28/16/240180_wKgFXFeZxJKAWNMaAAEbVm3uKSA552.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":3472,"bbsname":"??????CS10??????","bbstype":"c","topicid":55861219,"title":"????????????????????? ??????CS10????????????","lastreplydate":"2016-09-25 13:18:04","postusername":"amsong2016","replycounts":"72","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g15/M09/33/04/userphotos/2016/09/08/22/240180_wKjByFfRco6AQChYAAGNBv03eP0373.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":871,"bbsname":"???????????????","bbstype":"c","topicid":53196432,"title":"??????????????? ?????????R-Line????????????","lastreplydate":"2016-09-25 19:39:10","postusername":"pop?????????","replycounts":"262","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g14/M07/9E/4B/userphotos/2016/06/08/17/240180_wKgH1VdX5P6AcNtAAAE2-tmG1xI388.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":859,"bbsname":"???????????????","bbstype":"c","topicid":55341344,"title":"???????????????????????? ?????????????????????","lastreplydate":"2016-09-25 22:51:47","postusername":"JaySon__","replycounts":"310","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g20/M13/E6/52/userphotos/2016/08/19/01/240180_wKgFWVe19VSAFHrvAAEpKQLv3YM951.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":2381,"bbsname":"????????????","bbstype":"c","topicid":55287076,"title":"????????????????????? ??????2.5T????????????","lastreplydate":"2016-09-26 09:33:45","postusername":"????????????V","replycounts":"226","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g11/M11/FF/9D/userphotos/2016/08/17/19/240180_wKjBzFe0S4SASwTsAAEwbWW13u8129.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":620,"bbsname":"smart??????","bbstype":"c","topicid":55867992,"title":"???????????????????????? smart???????????????","lastreplydate":"2016-09-26 13:52:38","postusername":"??????GOLF??????","replycounts":"231","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g6/M03/2B/95/userphotos/2016/09/06/15/240180_wKgHzVfOcmOAaikqAAE2vtctrBY212.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":770,"bbsname":"RAV4????????????","bbstype":"c","topicid":55442541,"title":"????????????????????? ????????????RAV4??????","lastreplydate":"2016-09-26 14:17:16","postusername":"????????????","replycounts":"524","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g16/M0A/1E/4A/userphotos/2016/08/28/12/240180_wKgH5lfCZjGAXyl3AAE6-9CT8K8947.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":2980,"bbsname":"?????????7??????","bbstype":"c","topicid":55002236,"title":"?????????????????? ?????????7 1.5T?????????","lastreplydate":"2016-09-25 15:12:16","postusername":"ltt38139785","replycounts":"296","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g12/M0D/F7/EC/userphotos/2016/08/11/10/240180_wKjBy1er40yAYkClAAElbu9cV8Y601.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":3442,"bbsname":"????????????NX??????","bbstype":"c","topicid":55428641,"title":"????????????????????? ????????????NX200??????","lastreplydate":"2016-09-26 11:54:08","postusername":"67?????????","replycounts":"279","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g23/M0C/EE/5A/userphotos/2016/08/22/17/240180_wKgFV1e6v8KAGP9FAAE1Y_SbiD0253.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":65,"bbsname":"??????5?????????","bbstype":"c","topicid":54423515,"title":"????????????????????? ??????528Li????????????","lastreplydate":"2016-09-24 19:41:09","postusername":"clcapf","replycounts":"549","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g8/M00/D9/F2/userphotos/2016/07/20/18/240180_wKgHz1ePTPOASYKDAAE3zJygW6g956.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":163,"bbsname":"????????????","bbstype":"c","topicid":54826834,"title":"????????????????????? ??????3 1.5L?????????","lastreplydate":"2016-09-24 03:09:06","postusername":"zmlonger1","replycounts":"55","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g16/M00/EB/E6/userphotos/2016/08/04/16/240180_wKgH11ei_qCAEZ0EAAEcP6i9rzs516.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":3207,"bbsname":"????????????ATS/ATS-L??????","bbstype":"c","topicid":54208865,"title":"??????????????? ????????????ATS-L?????????","lastreplydate":"2016-09-26 11:10:48","postusername":"???????????????","replycounts":"119","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g9/M07/D2/38/userphotos/2016/07/14/00/240180_wKgH31eGaXqAOFlZAAEwR0AbHW0936.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":2380,"bbsname":"Amarok??????","bbstype":"c","topicid":55412147,"title":"???????????????????????? Amarok????????????","lastreplydate":"2016-09-25 17:34:03","postusername":"???????????????","replycounts":"105","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g12/M05/18/95/userphotos/2016/08/26/10/240180_wKgH4le_sHyAJmjuAAE8Wcqg6fo477.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":442,"bbsname":"????????????","bbstype":"c","topicid":53830310,"title":"???????????????????????? ????????????230TSI","lastreplydate":"2016-09-22 14:12:56","postusername":"HYJlov3","replycounts":"167","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g21/M07/9A/78/userphotos/2016/06/30/15/240180_wKgFVVd0xWmAI870AAE0L0sXXkU680.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":874,"bbsname":"????????????","bbstype":"c","topicid":55436392,"title":"?????????????????? ?????????300TSI?????????","lastreplydate":"2016-09-26 07:34:39","postusername":"AaronMISO","replycounts":"191","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g8/M02/06/2A/userphotos/2016/08/22/17/240180_wKjBz1e6yJmAA0wVAAE6cHleIyw458.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":564,"bbsname":"????????????","bbstype":"c","topicid":54306118,"title":"????????????????????? ??????2.0L??????/??????","lastreplydate":"2016-09-26 09:21:00","postusername":"qiangqiang2008","replycounts":"135","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g8/M11/D5/0D/userphotos/2016/07/16/22/240180_wKgH3leKS6WAGg3EAAEzQan0P-A591.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":2886,"bbsname":"??????K3/K3S??????","bbstype":"c","topicid":54304978,"title":"??????????????? ??????K3 1.6L????????????","lastreplydate":"2016-09-25 19:06:13","postusername":"?????????2017","replycounts":"237","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g11/M02/D1/F9/userphotos/2016/07/16/22/240180_wKgH4VeKR92AMao4AAEsDuXKQTY933.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":3968,"bbsname":"?????????CX-4??????","bbstype":"c","topicid":54655105,"title":"???????????????????????? ???????????????CX-4","lastreplydate":"2016-09-25 06:51:55","postusername":"Sunrise_fz","replycounts":"249","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g20/M09/C0/B8/userphotos/2016/07/27/22/240180_wKjBw1eYyKOAenhpAARKie8emPs448.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":81,"bbsname":"????????????","bbstype":"c","topicid":54476701,"title":"?????????????????? ??????1.5L???????????????","lastreplydate":"2016-09-25 13:56:59","postusername":"?????????????????????","replycounts":"124","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g21/M04/B8/8E/userphotos/2016/07/21/16/240180_wKgFVVeQi_qAaANkAAE6RFGUVgY236.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":905,"bbsname":"??????-??????CC??????","bbstype":"c","topicid":55049520,"title":"?????????????????? ???????????????????????????","lastreplydate":"2016-09-26 14:18:23","postusername":"Colin_Joe","replycounts":"1211","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g20/M0D/D5/2C/userphotos/2016/08/09/08/240180_wKgFVFepI1GAfBWyAAFElUxmSnw437.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":4133,"bbsname":"??????SUV??????","bbstype":"c","topicid":55605250,"title":"?????????????????? ???????????????SUV 1.3T","lastreplydate":"2016-09-26 13:49:59","postusername":"????????????????????????","replycounts":"2422","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g19/M11/05/CB/userphotos/2016/09/02/13/240180_wKjBxFfJEVGAGlEjAAEjVAaPUuc172.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":2197,"bbsname":"??????AMG??????","bbstype":"c","topicid":55664027,"title":"??????????????? ??????GLS 63 AMG?????????","lastreplydate":"2016-09-26 14:29:37","postusername":"NbuliaoG","replycounts":"647","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g16/M0B/2A/B5/userphotos/2016/09/05/16/240180_wKgH11fNMWyAN440AAEZlCGy8mw281.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":135,"bbsname":"????????????","bbstype":"c","topicid":53735060,"title":"????????????????????? ????????????????????????","lastreplydate":"2016-09-24 23:07:06","postusername":"_??????","replycounts":"447","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g5/M01/B6/3A/userphotos/2016/06/27/11/240180_wKgH21dwn2uAX1j5AAEyvdeYw9s902.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""}]
     */

    private ResultBean result;
    /**
     * result : {"pageindex":1,"pagecount":10000,"rowcount":0,"updatecount":30,"list":[{"bbsid":3777,"bbsname":"??????S330??????","bbstype":"c","topicid":56434873,"title":"?????????????????? ??????S330???????????????","lastreplydate":"2016-09-26 14:49:30","postusername":"k_n_i_g_h_t","replycounts":"185","isclosed":0,"pvid":"","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g14/M05/54/1F/userphotos/2016/09/25/21/240180_wKgH1Vfn06WAWd8rAAEaz_OOrWM323.jpg","topictype":"","views":136567,"postmemberid":0,"imgurl":""},{"bbsid":2357,"bbsname":"MODEL S??????","bbstype":"c","topicid":55938113,"title":"?????????????????? MODEL S 90D?????????","lastreplydate":"2016-09-26 11:57:35","postusername":"xtooo","replycounts":"567","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g6/M08/31/56/userphotos/2016/09/08/23/240180_wKjB0VfRg5mAIZ9lAAE0KZSFdjc682.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":2966,"bbsname":"??????CLA?????????","bbstype":"c","topicid":55754217,"title":"?????????????????? ??????CLA 220????????????","lastreplydate":"2016-09-26 14:26:34","postusername":"marswind16","replycounts":"334","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g14/M09/30/E0/userphotos/2016/09/08/11/240180_wKgH5FfQ1fWAdRdJAAEdOQIxEiw600.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":2565,"bbsname":"???????????????","bbstype":"c","topicid":55526103,"title":"?????????????????? ???????????????????????????","lastreplydate":"2016-09-23 14:16:38","postusername":"morgan_fs","replycounts":"62","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g4/M11/1E/8D/userphotos/2016/08/28/23/240180_wKgHy1fDCnuAIi1YAAFxPvUW38k749.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":3607,"bbsname":"??????7??????","bbstype":"c","topicid":55759139,"title":"?????????????????? ????????????????????????7","lastreplydate":"2016-09-26 14:16:21","postusername":"??????_??????","replycounts":"579","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g18/M0B/51/CE/userphotos/2016/09/21/21/240180_wKgH6FfijwKAXLT6AAXH-rBGH7U181.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":3097,"bbsname":"????????????Q70??????","bbstype":"c","topicid":56177867,"title":"????????????????????? ????????????Q70L??????","lastreplydate":"2016-09-25 18:19:24","postusername":"0????????????0","replycounts":"234","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g11/M11/45/F6/userphotos/2016/09/15/13/240180_wKjBzFfaK2SALDkuAAElNAnswic916.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":3154,"bbsname":"???????????????","bbstype":"c","topicid":55608725,"title":"?????????????????? ???????????????2.5L??????","lastreplydate":"2016-09-26 00:53:16","postusername":"majormoonirl","replycounts":"1115","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g17/M02/1F/C3/userphotos/2016/09/02/15/240180_wKjBxlfJJdqARpPGAAFECJjKDd0182.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":3683,"bbsname":"??????GLE??????M????????????","bbstype":"c","topicid":55271968,"title":"?????????????????? ??????GLE 320????????????","lastreplydate":"2016-09-22 11:19:29","postusername":"NorthBig","replycounts":"214","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g7/M00/0D/3E/userphotos/2016/08/22/09/240180_wKgH3Ve6W46AEbeIAAEe-Q90Juc316.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":3405,"bbsname":"?????????5??????","bbstype":"c","topicid":54674279,"title":"??????????????? ?????????5 1.5L????????????","lastreplydate":"2016-09-25 23:10:13","postusername":"8023??????","replycounts":"630","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g23/M0A/C2/6B/userphotos/2016/07/28/16/240180_wKgFXFeZxJKAWNMaAAEbVm3uKSA552.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":3472,"bbsname":"??????CS10??????","bbstype":"c","topicid":55861219,"title":"????????????????????? ??????CS10????????????","lastreplydate":"2016-09-25 13:18:04","postusername":"amsong2016","replycounts":"72","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g15/M09/33/04/userphotos/2016/09/08/22/240180_wKjByFfRco6AQChYAAGNBv03eP0373.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":871,"bbsname":"???????????????","bbstype":"c","topicid":53196432,"title":"??????????????? ?????????R-Line????????????","lastreplydate":"2016-09-25 19:39:10","postusername":"pop?????????","replycounts":"262","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g14/M07/9E/4B/userphotos/2016/06/08/17/240180_wKgH1VdX5P6AcNtAAAE2-tmG1xI388.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":859,"bbsname":"???????????????","bbstype":"c","topicid":55341344,"title":"???????????????????????? ?????????????????????","lastreplydate":"2016-09-25 22:51:47","postusername":"JaySon__","replycounts":"310","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g20/M13/E6/52/userphotos/2016/08/19/01/240180_wKgFWVe19VSAFHrvAAEpKQLv3YM951.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":2381,"bbsname":"????????????","bbstype":"c","topicid":55287076,"title":"????????????????????? ??????2.5T????????????","lastreplydate":"2016-09-26 09:33:45","postusername":"????????????V","replycounts":"226","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g11/M11/FF/9D/userphotos/2016/08/17/19/240180_wKjBzFe0S4SASwTsAAEwbWW13u8129.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":620,"bbsname":"smart??????","bbstype":"c","topicid":55867992,"title":"???????????????????????? smart???????????????","lastreplydate":"2016-09-26 13:52:38","postusername":"??????GOLF??????","replycounts":"231","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g6/M03/2B/95/userphotos/2016/09/06/15/240180_wKgHzVfOcmOAaikqAAE2vtctrBY212.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":770,"bbsname":"RAV4????????????","bbstype":"c","topicid":55442541,"title":"????????????????????? ????????????RAV4??????","lastreplydate":"2016-09-26 14:17:16","postusername":"????????????","replycounts":"524","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g16/M0A/1E/4A/userphotos/2016/08/28/12/240180_wKgH5lfCZjGAXyl3AAE6-9CT8K8947.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":2980,"bbsname":"?????????7??????","bbstype":"c","topicid":55002236,"title":"?????????????????? ?????????7 1.5T?????????","lastreplydate":"2016-09-25 15:12:16","postusername":"ltt38139785","replycounts":"296","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g12/M0D/F7/EC/userphotos/2016/08/11/10/240180_wKjBy1er40yAYkClAAElbu9cV8Y601.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":3442,"bbsname":"????????????NX??????","bbstype":"c","topicid":55428641,"title":"????????????????????? ????????????NX200??????","lastreplydate":"2016-09-26 11:54:08","postusername":"67?????????","replycounts":"279","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g23/M0C/EE/5A/userphotos/2016/08/22/17/240180_wKgFV1e6v8KAGP9FAAE1Y_SbiD0253.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":65,"bbsname":"??????5?????????","bbstype":"c","topicid":54423515,"title":"????????????????????? ??????528Li????????????","lastreplydate":"2016-09-24 19:41:09","postusername":"clcapf","replycounts":"549","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g8/M00/D9/F2/userphotos/2016/07/20/18/240180_wKgHz1ePTPOASYKDAAE3zJygW6g956.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":163,"bbsname":"????????????","bbstype":"c","topicid":54826834,"title":"????????????????????? ??????3 1.5L?????????","lastreplydate":"2016-09-24 03:09:06","postusername":"zmlonger1","replycounts":"55","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g16/M00/EB/E6/userphotos/2016/08/04/16/240180_wKgH11ei_qCAEZ0EAAEcP6i9rzs516.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":3207,"bbsname":"????????????ATS/ATS-L??????","bbstype":"c","topicid":54208865,"title":"??????????????? ????????????ATS-L?????????","lastreplydate":"2016-09-26 11:10:48","postusername":"???????????????","replycounts":"119","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g9/M07/D2/38/userphotos/2016/07/14/00/240180_wKgH31eGaXqAOFlZAAEwR0AbHW0936.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":2380,"bbsname":"Amarok??????","bbstype":"c","topicid":55412147,"title":"???????????????????????? Amarok????????????","lastreplydate":"2016-09-25 17:34:03","postusername":"???????????????","replycounts":"105","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g12/M05/18/95/userphotos/2016/08/26/10/240180_wKgH4le_sHyAJmjuAAE8Wcqg6fo477.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":442,"bbsname":"????????????","bbstype":"c","topicid":53830310,"title":"???????????????????????? ????????????230TSI","lastreplydate":"2016-09-22 14:12:56","postusername":"HYJlov3","replycounts":"167","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g21/M07/9A/78/userphotos/2016/06/30/15/240180_wKgFVVd0xWmAI870AAE0L0sXXkU680.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":874,"bbsname":"????????????","bbstype":"c","topicid":55436392,"title":"?????????????????? ?????????300TSI?????????","lastreplydate":"2016-09-26 07:34:39","postusername":"AaronMISO","replycounts":"191","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g8/M02/06/2A/userphotos/2016/08/22/17/240180_wKjBz1e6yJmAA0wVAAE6cHleIyw458.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":564,"bbsname":"????????????","bbstype":"c","topicid":54306118,"title":"????????????????????? ??????2.0L??????/??????","lastreplydate":"2016-09-26 09:21:00","postusername":"qiangqiang2008","replycounts":"135","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g8/M11/D5/0D/userphotos/2016/07/16/22/240180_wKgH3leKS6WAGg3EAAEzQan0P-A591.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":2886,"bbsname":"??????K3/K3S??????","bbstype":"c","topicid":54304978,"title":"??????????????? ??????K3 1.6L????????????","lastreplydate":"2016-09-25 19:06:13","postusername":"?????????2017","replycounts":"237","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g11/M02/D1/F9/userphotos/2016/07/16/22/240180_wKgH4VeKR92AMao4AAEsDuXKQTY933.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":3968,"bbsname":"?????????CX-4??????","bbstype":"c","topicid":54655105,"title":"???????????????????????? ???????????????CX-4","lastreplydate":"2016-09-25 06:51:55","postusername":"Sunrise_fz","replycounts":"249","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g20/M09/C0/B8/userphotos/2016/07/27/22/240180_wKjBw1eYyKOAenhpAARKie8emPs448.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":81,"bbsname":"????????????","bbstype":"c","topicid":54476701,"title":"?????????????????? ??????1.5L???????????????","lastreplydate":"2016-09-25 13:56:59","postusername":"?????????????????????","replycounts":"124","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g21/M04/B8/8E/userphotos/2016/07/21/16/240180_wKgFVVeQi_qAaANkAAE6RFGUVgY236.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":905,"bbsname":"??????-??????CC??????","bbstype":"c","topicid":55049520,"title":"?????????????????? ???????????????????????????","lastreplydate":"2016-09-26 14:18:23","postusername":"Colin_Joe","replycounts":"1211","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g20/M0D/D5/2C/userphotos/2016/08/09/08/240180_wKgFVFepI1GAfBWyAAFElUxmSnw437.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":4133,"bbsname":"??????SUV??????","bbstype":"c","topicid":55605250,"title":"?????????????????? ???????????????SUV 1.3T","lastreplydate":"2016-09-26 13:49:59","postusername":"????????????????????????","replycounts":"2422","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g19/M11/05/CB/userphotos/2016/09/02/13/240180_wKjBxFfJEVGAGlEjAAEjVAaPUuc172.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":2197,"bbsname":"??????AMG??????","bbstype":"c","topicid":55664027,"title":"??????????????? ??????GLS 63 AMG?????????","lastreplydate":"2016-09-26 14:29:37","postusername":"NbuliaoG","replycounts":"647","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g16/M0B/2A/B5/userphotos/2016/09/05/16/240180_wKgH11fNMWyAN440AAEZlCGy8mw281.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""},{"bbsid":135,"bbsname":"????????????","bbstype":"c","topicid":53735060,"title":"????????????????????? ????????????????????????","lastreplydate":"2016-09-24 23:07:06","postusername":"_??????","replycounts":"447","isclosed":0,"pvid":"TF48UEPNDHdKfZecWp9gMY1sSkvl5CK4","bigpic":"","smallpic":"http://club2.autoimg.cn/album/g5/M01/B6/3A/userphotos/2016/06/27/11/240180_wKgH21dwn2uAX1j5AAEyvdeYw9s902.jpg","topictype":"","views":0,"postmemberid":0,"imgurl":""}]}
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
        private int pageindex;
        private int pagecount;
        private int rowcount;
        private int updatecount;
        /**
         * bbsid : 3777
         * bbsname : ??????S330??????
         * bbstype : c
         * topicid : 56434873
         * title : ?????????????????? ??????S330???????????????
         * lastreplydate : 2016-09-26 14:49:30
         * postusername : k_n_i_g_h_t
         * replycounts : 185
         * isclosed : 0
         * pvid :
         * bigpic :
         * smallpic : http://club2.autoimg.cn/album/g14/M05/54/1F/userphotos/2016/09/25/21/240180_wKgH1Vfn06WAWd8rAAEaz_OOrWM323.jpg
         * topictype :
         * views : 136567
         * postmemberid : 0
         * imgurl :
         */

        private List<ListBean> list;

        public int getPageindex() {
            return pageindex;
        }

        public void setPageindex(int pageindex) {
            this.pageindex = pageindex;
        }

        public int getPagecount() {
            return pagecount;
        }

        public void setPagecount(int pagecount) {
            this.pagecount = pagecount;
        }

        public int getRowcount() {
            return rowcount;
        }

        public void setRowcount(int rowcount) {
            this.rowcount = rowcount;
        }

        public int getUpdatecount() {
            return updatecount;
        }

        public void setUpdatecount(int updatecount) {
            this.updatecount = updatecount;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            private int bbsid;
            private String bbsname;
            private String bbstype;
            private int topicid;
            private String title;
            private String lastreplydate;
            private String postusername;
            private String replycounts;
            private int isclosed;
            private String pvid;
            private String bigpic;
            private String smallpic;
            private String topictype;
            private int views;
            private int postmemberid;
            private String imgurl;

            public int getBbsid() {
                return bbsid;
            }

            public void setBbsid(int bbsid) {
                this.bbsid = bbsid;
            }

            public String getBbsname() {
                return bbsname;
            }

            public void setBbsname(String bbsname) {
                this.bbsname = bbsname;
            }

            public String getBbstype() {
                return bbstype;
            }

            public void setBbstype(String bbstype) {
                this.bbstype = bbstype;
            }

            public int getTopicid() {
                return topicid;
            }

            public void setTopicid(int topicid) {
                this.topicid = topicid;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getLastreplydate() {
                return lastreplydate;
            }

            public void setLastreplydate(String lastreplydate) {
                this.lastreplydate = lastreplydate;
            }

            public String getPostusername() {
                return postusername;
            }

            public void setPostusername(String postusername) {
                this.postusername = postusername;
            }

            public String getReplycounts() {
                return replycounts;
            }

            public void setReplycounts(String replycounts) {
                this.replycounts = replycounts;
            }

            public int getIsclosed() {
                return isclosed;
            }

            public void setIsclosed(int isclosed) {
                this.isclosed = isclosed;
            }

            public String getPvid() {
                return pvid;
            }

            public void setPvid(String pvid) {
                this.pvid = pvid;
            }

            public String getBigpic() {
                return bigpic;
            }

            public void setBigpic(String bigpic) {
                this.bigpic = bigpic;
            }

            public String getSmallpic() {
                return smallpic;
            }

            public void setSmallpic(String smallpic) {
                this.smallpic = smallpic;
            }

            public String getTopictype() {
                return topictype;
            }

            public void setTopictype(String topictype) {
                this.topictype = topictype;
            }

            public int getViews() {
                return views;
            }

            public void setViews(int views) {
                this.views = views;
            }

            public int getPostmemberid() {
                return postmemberid;
            }

            public void setPostmemberid(int postmemberid) {
                this.postmemberid = postmemberid;
            }

            public String getImgurl() {
                return imgurl;
            }

            public void setImgurl(String imgurl) {
                this.imgurl = imgurl;
            }
        }
    }
}
