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
 * Created by dllo on 16/9/20.
 */
public class RecommendEntity {

    /**
     * rowcount : 10496
     * pagecount : 350
     * pageindex : 1
     * headlineinfo : {"id":893338,"title":"????????????2016????????????????????????:??????SUV","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g19/M0B/2E/E0/160x120_0_autohomecar__wKgFWFffxX2AaBK_AAEihxfanwc246.jpg","replycount":267,"pagecount":0,"jumppage":1,"lasttime":""}
     * focusimg : [{"id":893384,"imgurl":"http://www2.autoimg.cn/newsdfs/g20/M14/2E/89/640x320_0_autohomecar__wKjBw1fghcGAWQjlAAoLgrePFEc691.jpg","title":"???????????? ???????????????????????????4?????????","type":"????????????","replycount":0,"pageindex":1,"JumpType":0,"jumpurl":"","mediatype":1},{"id":893371,"imgurl":"http://www3.autoimg.cn/newsdfs/g16/M09/4C/16/640x320_0_autohomecar__wKgH11ff_siAT39EAAb11cjL4MY067.jpg","title":"?????????????????? ????????????????????????MX5","type":"????????????","replycount":0,"pageindex":1,"JumpType":0,"jumpurl":"","mediatype":1},{"id":892890,"imgurl":"http://www3.autoimg.cn/newsdfs/g9/M0D/48/4A/640x320_0_autohomecar__wKjBzlfgFyyAENWFAAd8Bod_72w326.jpg","title":"??????????????? KTM X-BOW GT????????????","type":"????????????","replycount":0,"pageindex":1,"JumpType":0,"jumpurl":"","mediatype":1},{"id":55970444,"imgurl":"http://www2.autoimg.cn/newsdfs/g18/M01/48/51/640x320_0_autohomecar__wKgH2VfdXsOAENBxAAHlhJ5YO-I087.jpg","title":"???????????????????????? ??????RX5????????????","type":"","replycount":0,"pageindex":4080,"JumpType":0,"jumpurl":"","mediatype":4},{"id":55721365,"imgurl":"http://www2.autoimg.cn/newsdfs/g17/M13/45/3D/640x320_0_autohomecar__wKgH2FfeYnWAAOUJAALmvKVjQsI150.jpg","title":"?????????????????? ?????????2.5T WRX STi","type":"","replycount":0,"pageindex":283,"JumpType":0,"jumpurl":"","mediatype":4},{"id":89977,"imgurl":"http://www3.autoimg.cn/newsdfs/g17/M09/47/9E/640x320_0_autohomecar__wKgH51feKYCAQ02oAAhFNzn7tVU182.jpg","title":"??????????????? ??????????????????Ghibli ?????????","type":"??????","replycount":0,"pageindex":1,"JumpType":0,"jumpurl":"","mediatype":2}]
     * newslist : [{"id":535338,"title":"???????????????????????????????????????","mediatype":2,"type":"","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g23/M03/30/A2/160x120_0_autohomecar__wKgFXFfgm0OAP7dnABkZMhFro0w507.jpg","replycount":21,"pagecount":0,"jumppage":1,"lasttime":""},{"id":893395,"title":"??????????????????QX60??????9??????????????????","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g6/M02/4E/26/160x120_0_autohomecar__wKjB0VfgtB2AVqR_AAGfhuoKEu4730.jpg","replycount":129,"pagecount":0,"jumppage":1,"lasttime":""},{"id":90190,"title":"?????????????????? ????????? 17??? 28T????????????","mediatype":3,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g23/M03/2D/D9/240x180_0_autohomecar__wKgFV1fgqxWADExPAAFjrCZwC5Q470.jpg","replycount":533,"pagecount":0,"jumppage":1,"lasttime":""},{"id":536021,"title":"??????????????????????????????????????????????????????","mediatype":2,"type":"","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g10/M06/40/26/160x120_0_autohomecar__wKjBzVfYwo2AU_soAAMbY4zf0Is302.jpg","replycount":23,"pagecount":0,"jumppage":1,"lasttime":""},{"id":535970,"title":"7????????????????????????????????????","mediatype":2,"type":"","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g19/M02/2D/9C/160x120_0_autohomecar__wKgFU1fgqO-ASEoRAAK_jRV7yVE984.jpg","replycount":104,"pagecount":0,"jumppage":1,"lasttime":""},{"id":90151,"title":"???????????????911 Turbo S vs Huracan","mediatype":3,"type":"??????","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g11/M06/4E/E3/240x180_0_autohomecar__wKgH4Vfgl3eAHqaeAADnpb-mXQw761.jpg","replycount":3454,"pagecount":0,"jumppage":1,"lasttime":""},{"id":3588126,"title":"??????????????? ????????????MX5","mediatype":6,"type":"1","time":"2016-09-20","indexdetail":"3984???27484???http://car3.autoimg.cn/cardfs/product/g11/M14/4D/6D/t_autohomecar__wKjBzFffsyOADankAAgJbMlskMo360.jpg,http://car2.autoimg.cn/cardfs/product/g11/M12/4D/FE/t_autohomecar__wKgH4VffsyKAHFN9AAeoiNyVkIw860.jpg,http://car3.autoimg.cn/cardfs/product/g11/M11/4D/6D/t_autohomecar__wKjBzFffsyGAQmMOAAiVvoTnobA355.jpg","smallpic":"","replycount":150,"pagecount":0,"jumppage":1,"lasttime":""},{"id":90118,"title":"????????????????????????????????????????????????","mediatype":3,"type":"??????","time":"2016-09-20","indexdetail":"","smallpic":"http://www3.autoimg.cn/newsdfs/g21/M0E/2B/A6/240x180_0_autohomecar__wKgFVVffmU2AEn1TAAE2ADPvVDo244.jpg","replycount":65976,"pagecount":0,"jumppage":1,"lasttime":""},{"id":536715,"title":"????????????R1200GS???????????????????????????","mediatype":2,"type":"","time":"2016-09-20","indexdetail":"","smallpic":"http://www3.autoimg.cn/newsdfs/g4/M15/4E/E4/160x120_0_autohomecar__wKjB01fgpfeAMQ3lAAG1rpU7dpQ692.jpg","replycount":54,"pagecount":0,"jumppage":1,"lasttime":""},{"id":893386,"title":"???26.98-27.98?????? ???????????????BRZ??????","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www3.autoimg.cn/newsdfs/g10/M0E/4F/AC/160x120_0_autohomecar__wKgH4Ffgop-AD0MCAAFFy0VRYrU170.jpg","replycount":315,"pagecount":0,"jumppage":1,"lasttime":""},{"id":893385,"title":"???2018????????? ?????????????????????????????????","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g17/M14/48/F6/160x120_0_autohomecar__wKjBxlfgoUKAE7m0AAGbcQWZqJk094.jpg","replycount":106,"pagecount":0,"jumppage":1,"lasttime":""},{"id":893384,"title":"???????????? ???????????????????????????4?????????","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www3.autoimg.cn/newsdfs/g13/M14/4F/80/160x120_0_autohomecar__wKgH41fgha6AEYbSAAGk_IAQxzs532.jpg","replycount":34,"pagecount":0,"jumppage":1,"lasttime":""},{"id":536613,"title":"?????????????????????????????????????????????","mediatype":2,"type":"","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g10/M13/4D/40/160x120_0_autohomecar__wKjBzVfffyKAUGP3AAN5AaSTg5s061.jpg","replycount":419,"pagecount":0,"jumppage":1,"lasttime":""},{"id":893379,"title":"???8.59-9.39??? ????????????1.5L???????????????","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www3.autoimg.cn/newsdfs/g7/M02/50/1C/160x120_0_autohomecar__wKgH3Vfgm1WAO737AAE9xhoyIxE132.jpg","replycount":356,"pagecount":0,"jumppage":1,"lasttime":""},{"id":90131,"title":"400??????????????? ????????????????????????TT RS","mediatype":3,"type":"??????","time":"2016-09-20","indexdetail":"","smallpic":"http://www3.autoimg.cn/newsdfs/g18/M09/4B/25/240x180_0_autohomecar__wKgH2Vffs32AIqllAAFg7kcQ2O4694.jpg","replycount":15350,"pagecount":0,"jumppage":1,"lasttime":""},{"id":536757,"title":"04?????????????????? ???????????????\u201c?????????\u201d","mediatype":2,"type":"","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g11/M05/4E/CC/160x120_0_autohomecar__wKgH4VfgibyAU7CnAAIqsaR3sio378.jpg","replycount":238,"pagecount":0,"jumppage":1,"lasttime":""},{"id":893375,"title":"???\u201c??????\u201d????????? ????????????P14????????????","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g8/M0F/52/15/160x120_0_autohomecar__wKgH3lfgjy-ASK8JAAEWT4BogQ0240.jpg","replycount":96,"pagecount":0,"jumppage":1,"lasttime":""},{"id":893363,"title":"?????????????????? ????????????AX5??????????????????","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g10/M0F/4E/80/160x120_0_autohomecar__wKjBzVfgkQ6AP7K3AAFRLZ3Gma0826.jpg","replycount":168,"pagecount":0,"jumppage":1,"lasttime":""},{"id":893329,"title":"?????????????????? ??????????????????????????????","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www3.autoimg.cn/newsdfs/g5/M0D/4D/D4/160x120_0_autohomecar__wKjB0lfgh4GAZGjCAAFhVV8XDrQ331.jpg","replycount":128,"pagecount":0,"jumppage":1,"lasttime":""},{"id":893324,"title":"??????????????? ????????????????????????????????????","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www3.autoimg.cn/newsdfs/g20/M08/2F/D6/160x120_0_autohomecar__wKgFWVfgiQOAHvM0AAFjdnUU4b0711.jpg","replycount":483,"pagecount":0,"jumppage":1,"lasttime":""},{"id":90058,"title":"?????????????????? ?????????????????????????????????","mediatype":3,"type":"??????","time":"2016-09-20","indexdetail":"","smallpic":"http://www3.autoimg.cn/newsdfs/g16/M0E/4D/57/240x180_0_autohomecar__wKjBx1ffSO-ANDAnAADVi0yrVCM196.jpg","replycount":26104,"pagecount":0,"jumppage":1,"lasttime":""},{"id":536541,"title":"?????????????????????,????????????\u201c????????????\u201d?","mediatype":2,"type":"","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g13/M11/4A/3E/160x120_0_autohomecar__wKgH1FfeZoKAWHt_ABURqcboSgA603.JPG","replycount":201,"pagecount":0,"jumppage":1,"lasttime":""},{"id":893261,"title":"????????????????????????????????????????????????????","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www3.autoimg.cn/newsdfs/g4/M05/4F/2D/160x120_0_autohomecar__wKgH2lfgfxCAZMVgAAHiyxbMzcs166.jpg","replycount":281,"pagecount":0,"jumppage":1,"lasttime":""},{"id":3547658,"title":"?????????????????? ??????XFL","mediatype":6,"type":"10","time":"2016-09-20","indexdetail":"4083???25930???http://car3.autoimg.cn/cardfs/product/g22/M01/F2/06/t_autohomecar__wKgFVle9bX6ARzTaAAks4rNxbbY249.jpg,http://car2.autoimg.cn/cardfs/product/g22/M11/F2/06/t_autohomecar__wKgFVle9bXyAE2JMAAiWJf9Re0I419.jpg,http://car2.autoimg.cn/cardfs/product/g22/M01/F0/C3/t_autohomecar__wKjBwVe9bXuAP64eAAbUkU_uJj0465.jpg","smallpic":"","replycount":291,"pagecount":0,"jumppage":32,"lasttime":""},{"id":90019,"title":"???????????? 2017?????????CC R-Line????????????","mediatype":3,"type":"??????","time":"2016-09-20","indexdetail":"","smallpic":"http://www3.autoimg.cn/newsdfs/g11/M00/4C/1C/240x180_0_autohomecar__wKgH4VfeYDSAcHmvAAGScHToMr8946.jpg","replycount":80695,"pagecount":0,"jumppage":1,"lasttime":""},{"id":536629,"title":"15??????????????????????????? ?????????????????????","mediatype":2,"type":"","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g23/M12/2C/CB/160x120_0_autohomecar__wKgFV1ffr6OADRbJAAHeT3DOY30658.jpg","replycount":460,"pagecount":0,"jumppage":1,"lasttime":""},{"id":893338,"title":"????????????2016????????????????????????:??????SUV","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g19/M0B/2E/E0/160x120_0_autohomecar__wKgFWFffxX2AaBK_AAEihxfanwc246.jpg","replycount":267,"pagecount":0,"jumppage":1,"lasttime":""},{"id":90074,"title":"2016???????????????GP?????? ??????????????????","mediatype":3,"type":"??????","time":"2016-09-20","indexdetail":"","smallpic":"http://www3.autoimg.cn/newsdfs/g8/M06/4E/18/240x180_0_autohomecar__wKgHz1ffS-KALEe-AAFrUi7tcv4912.jpg","replycount":22182,"pagecount":0,"jumppage":1,"lasttime":""},{"id":893372,"title":"??????2019????????? ?????????8?????????????????????","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www3.autoimg.cn/newsdfs/g20/M14/2F/6C/160x120_0_autohomecar__wKgFWVff84qARqevAAHGsPS4KI8436.jpg","replycount":348,"pagecount":0,"jumppage":1,"lasttime":""},{"id":893370,"title":"100%????????????????????? ????????????????????????","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g19/M08/2E/AE/160x120_0_autohomecar__wKjBxFff6wmAVAheAACZ3qEivu8039.jpg","replycount":87,"pagecount":0,"jumppage":1,"lasttime":"201609200605004421430"}]
     * topnewsinfo : {}
     */

    private ResultBean result;
    /**
     * result : {"rowcount":10496,"pagecount":350,"pageindex":1,"headlineinfo":{"id":893338,"title":"????????????2016????????????????????????:??????SUV","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g19/M0B/2E/E0/160x120_0_autohomecar__wKgFWFffxX2AaBK_AAEihxfanwc246.jpg","replycount":267,"pagecount":0,"jumppage":1,"lasttime":""},"focusimg":[{"id":893384,"imgurl":"http://www2.autoimg.cn/newsdfs/g20/M14/2E/89/640x320_0_autohomecar__wKjBw1fghcGAWQjlAAoLgrePFEc691.jpg","title":"???????????? ???????????????????????????4?????????","type":"????????????","replycount":0,"pageindex":1,"JumpType":0,"jumpurl":"","mediatype":1},{"id":893371,"imgurl":"http://www3.autoimg.cn/newsdfs/g16/M09/4C/16/640x320_0_autohomecar__wKgH11ff_siAT39EAAb11cjL4MY067.jpg","title":"?????????????????? ????????????????????????MX5","type":"????????????","replycount":0,"pageindex":1,"JumpType":0,"jumpurl":"","mediatype":1},{"id":892890,"imgurl":"http://www3.autoimg.cn/newsdfs/g9/M0D/48/4A/640x320_0_autohomecar__wKjBzlfgFyyAENWFAAd8Bod_72w326.jpg","title":"??????????????? KTM X-BOW GT????????????","type":"????????????","replycount":0,"pageindex":1,"JumpType":0,"jumpurl":"","mediatype":1},{"id":55970444,"imgurl":"http://www2.autoimg.cn/newsdfs/g18/M01/48/51/640x320_0_autohomecar__wKgH2VfdXsOAENBxAAHlhJ5YO-I087.jpg","title":"???????????????????????? ??????RX5????????????","type":"","replycount":0,"pageindex":4080,"JumpType":0,"jumpurl":"","mediatype":4},{"id":55721365,"imgurl":"http://www2.autoimg.cn/newsdfs/g17/M13/45/3D/640x320_0_autohomecar__wKgH2FfeYnWAAOUJAALmvKVjQsI150.jpg","title":"?????????????????? ?????????2.5T WRX STi","type":"","replycount":0,"pageindex":283,"JumpType":0,"jumpurl":"","mediatype":4},{"id":89977,"imgurl":"http://www3.autoimg.cn/newsdfs/g17/M09/47/9E/640x320_0_autohomecar__wKgH51feKYCAQ02oAAhFNzn7tVU182.jpg","title":"??????????????? ??????????????????Ghibli ?????????","type":"??????","replycount":0,"pageindex":1,"JumpType":0,"jumpurl":"","mediatype":2}],"newslist":[{"id":535338,"title":"???????????????????????????????????????","mediatype":2,"type":"","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g23/M03/30/A2/160x120_0_autohomecar__wKgFXFfgm0OAP7dnABkZMhFro0w507.jpg","replycount":21,"pagecount":0,"jumppage":1,"lasttime":""},{"id":893395,"title":"??????????????????QX60??????9??????????????????","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g6/M02/4E/26/160x120_0_autohomecar__wKjB0VfgtB2AVqR_AAGfhuoKEu4730.jpg","replycount":129,"pagecount":0,"jumppage":1,"lasttime":""},{"id":90190,"title":"?????????????????? ????????? 17??? 28T????????????","mediatype":3,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g23/M03/2D/D9/240x180_0_autohomecar__wKgFV1fgqxWADExPAAFjrCZwC5Q470.jpg","replycount":533,"pagecount":0,"jumppage":1,"lasttime":""},{"id":536021,"title":"??????????????????????????????????????????????????????","mediatype":2,"type":"","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g10/M06/40/26/160x120_0_autohomecar__wKjBzVfYwo2AU_soAAMbY4zf0Is302.jpg","replycount":23,"pagecount":0,"jumppage":1,"lasttime":""},{"id":535970,"title":"7????????????????????????????????????","mediatype":2,"type":"","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g19/M02/2D/9C/160x120_0_autohomecar__wKgFU1fgqO-ASEoRAAK_jRV7yVE984.jpg","replycount":104,"pagecount":0,"jumppage":1,"lasttime":""},{"id":90151,"title":"???????????????911 Turbo S vs Huracan","mediatype":3,"type":"??????","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g11/M06/4E/E3/240x180_0_autohomecar__wKgH4Vfgl3eAHqaeAADnpb-mXQw761.jpg","replycount":3454,"pagecount":0,"jumppage":1,"lasttime":""},{"id":3588126,"title":"??????????????? ????????????MX5","mediatype":6,"type":"1","time":"2016-09-20","indexdetail":"3984???27484???http://car3.autoimg.cn/cardfs/product/g11/M14/4D/6D/t_autohomecar__wKjBzFffsyOADankAAgJbMlskMo360.jpg,http://car2.autoimg.cn/cardfs/product/g11/M12/4D/FE/t_autohomecar__wKgH4VffsyKAHFN9AAeoiNyVkIw860.jpg,http://car3.autoimg.cn/cardfs/product/g11/M11/4D/6D/t_autohomecar__wKjBzFffsyGAQmMOAAiVvoTnobA355.jpg","smallpic":"","replycount":150,"pagecount":0,"jumppage":1,"lasttime":""},{"id":90118,"title":"????????????????????????????????????????????????","mediatype":3,"type":"??????","time":"2016-09-20","indexdetail":"","smallpic":"http://www3.autoimg.cn/newsdfs/g21/M0E/2B/A6/240x180_0_autohomecar__wKgFVVffmU2AEn1TAAE2ADPvVDo244.jpg","replycount":65976,"pagecount":0,"jumppage":1,"lasttime":""},{"id":536715,"title":"????????????R1200GS???????????????????????????","mediatype":2,"type":"","time":"2016-09-20","indexdetail":"","smallpic":"http://www3.autoimg.cn/newsdfs/g4/M15/4E/E4/160x120_0_autohomecar__wKjB01fgpfeAMQ3lAAG1rpU7dpQ692.jpg","replycount":54,"pagecount":0,"jumppage":1,"lasttime":""},{"id":893386,"title":"???26.98-27.98?????? ???????????????BRZ??????","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www3.autoimg.cn/newsdfs/g10/M0E/4F/AC/160x120_0_autohomecar__wKgH4Ffgop-AD0MCAAFFy0VRYrU170.jpg","replycount":315,"pagecount":0,"jumppage":1,"lasttime":""},{"id":893385,"title":"???2018????????? ?????????????????????????????????","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g17/M14/48/F6/160x120_0_autohomecar__wKjBxlfgoUKAE7m0AAGbcQWZqJk094.jpg","replycount":106,"pagecount":0,"jumppage":1,"lasttime":""},{"id":893384,"title":"???????????? ???????????????????????????4?????????","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www3.autoimg.cn/newsdfs/g13/M14/4F/80/160x120_0_autohomecar__wKgH41fgha6AEYbSAAGk_IAQxzs532.jpg","replycount":34,"pagecount":0,"jumppage":1,"lasttime":""},{"id":536613,"title":"?????????????????????????????????????????????","mediatype":2,"type":"","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g10/M13/4D/40/160x120_0_autohomecar__wKjBzVfffyKAUGP3AAN5AaSTg5s061.jpg","replycount":419,"pagecount":0,"jumppage":1,"lasttime":""},{"id":893379,"title":"???8.59-9.39??? ????????????1.5L???????????????","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www3.autoimg.cn/newsdfs/g7/M02/50/1C/160x120_0_autohomecar__wKgH3Vfgm1WAO737AAE9xhoyIxE132.jpg","replycount":356,"pagecount":0,"jumppage":1,"lasttime":""},{"id":90131,"title":"400??????????????? ????????????????????????TT RS","mediatype":3,"type":"??????","time":"2016-09-20","indexdetail":"","smallpic":"http://www3.autoimg.cn/newsdfs/g18/M09/4B/25/240x180_0_autohomecar__wKgH2Vffs32AIqllAAFg7kcQ2O4694.jpg","replycount":15350,"pagecount":0,"jumppage":1,"lasttime":""},{"id":536757,"title":"04?????????????????? ???????????????\u201c?????????\u201d","mediatype":2,"type":"","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g11/M05/4E/CC/160x120_0_autohomecar__wKgH4VfgibyAU7CnAAIqsaR3sio378.jpg","replycount":238,"pagecount":0,"jumppage":1,"lasttime":""},{"id":893375,"title":"???\u201c??????\u201d????????? ????????????P14????????????","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g8/M0F/52/15/160x120_0_autohomecar__wKgH3lfgjy-ASK8JAAEWT4BogQ0240.jpg","replycount":96,"pagecount":0,"jumppage":1,"lasttime":""},{"id":893363,"title":"?????????????????? ????????????AX5??????????????????","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g10/M0F/4E/80/160x120_0_autohomecar__wKjBzVfgkQ6AP7K3AAFRLZ3Gma0826.jpg","replycount":168,"pagecount":0,"jumppage":1,"lasttime":""},{"id":893329,"title":"?????????????????? ??????????????????????????????","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www3.autoimg.cn/newsdfs/g5/M0D/4D/D4/160x120_0_autohomecar__wKjB0lfgh4GAZGjCAAFhVV8XDrQ331.jpg","replycount":128,"pagecount":0,"jumppage":1,"lasttime":""},{"id":893324,"title":"??????????????? ????????????????????????????????????","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www3.autoimg.cn/newsdfs/g20/M08/2F/D6/160x120_0_autohomecar__wKgFWVfgiQOAHvM0AAFjdnUU4b0711.jpg","replycount":483,"pagecount":0,"jumppage":1,"lasttime":""},{"id":90058,"title":"?????????????????? ?????????????????????????????????","mediatype":3,"type":"??????","time":"2016-09-20","indexdetail":"","smallpic":"http://www3.autoimg.cn/newsdfs/g16/M0E/4D/57/240x180_0_autohomecar__wKjBx1ffSO-ANDAnAADVi0yrVCM196.jpg","replycount":26104,"pagecount":0,"jumppage":1,"lasttime":""},{"id":536541,"title":"?????????????????????,????????????\u201c????????????\u201d?","mediatype":2,"type":"","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g13/M11/4A/3E/160x120_0_autohomecar__wKgH1FfeZoKAWHt_ABURqcboSgA603.JPG","replycount":201,"pagecount":0,"jumppage":1,"lasttime":""},{"id":893261,"title":"????????????????????????????????????????????????????","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www3.autoimg.cn/newsdfs/g4/M05/4F/2D/160x120_0_autohomecar__wKgH2lfgfxCAZMVgAAHiyxbMzcs166.jpg","replycount":281,"pagecount":0,"jumppage":1,"lasttime":""},{"id":3547658,"title":"?????????????????? ??????XFL","mediatype":6,"type":"10","time":"2016-09-20","indexdetail":"4083???25930???http://car3.autoimg.cn/cardfs/product/g22/M01/F2/06/t_autohomecar__wKgFVle9bX6ARzTaAAks4rNxbbY249.jpg,http://car2.autoimg.cn/cardfs/product/g22/M11/F2/06/t_autohomecar__wKgFVle9bXyAE2JMAAiWJf9Re0I419.jpg,http://car2.autoimg.cn/cardfs/product/g22/M01/F0/C3/t_autohomecar__wKjBwVe9bXuAP64eAAbUkU_uJj0465.jpg","smallpic":"","replycount":291,"pagecount":0,"jumppage":32,"lasttime":""},{"id":90019,"title":"???????????? 2017?????????CC R-Line????????????","mediatype":3,"type":"??????","time":"2016-09-20","indexdetail":"","smallpic":"http://www3.autoimg.cn/newsdfs/g11/M00/4C/1C/240x180_0_autohomecar__wKgH4VfeYDSAcHmvAAGScHToMr8946.jpg","replycount":80695,"pagecount":0,"jumppage":1,"lasttime":""},{"id":536629,"title":"15??????????????????????????? ?????????????????????","mediatype":2,"type":"","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g23/M12/2C/CB/160x120_0_autohomecar__wKgFV1ffr6OADRbJAAHeT3DOY30658.jpg","replycount":460,"pagecount":0,"jumppage":1,"lasttime":""},{"id":893338,"title":"????????????2016????????????????????????:??????SUV","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g19/M0B/2E/E0/160x120_0_autohomecar__wKgFWFffxX2AaBK_AAEihxfanwc246.jpg","replycount":267,"pagecount":0,"jumppage":1,"lasttime":""},{"id":90074,"title":"2016???????????????GP?????? ??????????????????","mediatype":3,"type":"??????","time":"2016-09-20","indexdetail":"","smallpic":"http://www3.autoimg.cn/newsdfs/g8/M06/4E/18/240x180_0_autohomecar__wKgHz1ffS-KALEe-AAFrUi7tcv4912.jpg","replycount":22182,"pagecount":0,"jumppage":1,"lasttime":""},{"id":893372,"title":"??????2019????????? ?????????8?????????????????????","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www3.autoimg.cn/newsdfs/g20/M14/2F/6C/160x120_0_autohomecar__wKgFWVff84qARqevAAHGsPS4KI8436.jpg","replycount":348,"pagecount":0,"jumppage":1,"lasttime":""},{"id":893370,"title":"100%????????????????????? ????????????????????????","mediatype":1,"type":"????????????","time":"2016-09-20","indexdetail":"","smallpic":"http://www2.autoimg.cn/newsdfs/g19/M08/2E/AE/160x120_0_autohomecar__wKjBxFff6wmAVAheAACZ3qEivu8039.jpg","replycount":87,"pagecount":0,"jumppage":1,"lasttime":"201609200605004421430"}],"topnewsinfo":{}}
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
        private int pagecount;
        private int pageindex;
        /**
         * id : 893338
         * title : ????????????2016????????????????????????:??????SUV
         * mediatype : 1
         * type : ????????????
         * time : 2016-09-20
         * indexdetail :
         * smallpic : http://www2.autoimg.cn/newsdfs/g19/M0B/2E/E0/160x120_0_autohomecar__wKgFWFffxX2AaBK_AAEihxfanwc246.jpg
         * replycount : 267
         * pagecount : 0
         * jumppage : 1
         * lasttime :
         */

        private HeadlineinfoBean headlineinfo;
        private TopnewsinfoBean topnewsinfo;
        /**
         * id : 893384
         * imgurl : http://www2.autoimg.cn/newsdfs/g20/M14/2E/89/640x320_0_autohomecar__wKjBw1fghcGAWQjlAAoLgrePFEc691.jpg
         * title : ???????????? ???????????????????????????4?????????
         * type : ????????????
         * replycount : 0
         * pageindex : 1
         * JumpType : 0
         * jumpurl :
         * mediatype : 1
         */

        private List<FocusimgBean> focusimg;
        /**
         * id : 535338
         * title : ???????????????????????????????????????
         * mediatype : 2
         * type :
         * time : 2016-09-20
         * indexdetail :
         * smallpic : http://www2.autoimg.cn/newsdfs/g23/M03/30/A2/160x120_0_autohomecar__wKgFXFfgm0OAP7dnABkZMhFro0w507.jpg
         * replycount : 21
         * pagecount : 0
         * jumppage : 1
         * lasttime :
         */

        private List<NewslistBean> newslist;

        public int getRowcount() {
            return rowcount;
        }

        public void setRowcount(int rowcount) {
            this.rowcount = rowcount;
        }

        public int getPagecount() {
            return pagecount;
        }

        public void setPagecount(int pagecount) {
            this.pagecount = pagecount;
        }

        public int getPageindex() {
            return pageindex;
        }

        public void setPageindex(int pageindex) {
            this.pageindex = pageindex;
        }

        public HeadlineinfoBean getHeadlineinfo() {
            return headlineinfo;
        }

        public void setHeadlineinfo(HeadlineinfoBean headlineinfo) {
            this.headlineinfo = headlineinfo;
        }

        public TopnewsinfoBean getTopnewsinfo() {
            return topnewsinfo;
        }

        public void setTopnewsinfo(TopnewsinfoBean topnewsinfo) {
            this.topnewsinfo = topnewsinfo;
        }

        public List<FocusimgBean> getFocusimg() {
            return focusimg;
        }

        public void setFocusimg(List<FocusimgBean> focusimg) {
            this.focusimg = focusimg;
        }

        public List<NewslistBean> getNewslist() {
            return newslist;
        }

        public void setNewslist(List<NewslistBean> newslist) {
            this.newslist = newslist;
        }

        public static class HeadlineinfoBean {
            private int id;
            private String title;
            private int mediatype;
            private String type;
            private String time;
            private String indexdetail;
            private String smallpic;
            private int replycount;

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
        }

        public static class TopnewsinfoBean {
        }

        public static class FocusimgBean {
            private int id;
            private String imgurl;
            private String title;
            private String type;
            private int replycount;
            private int pageindex;
            private int JumpType;
            private String jumpurl;
            private int mediatype;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImgurl() {
                return imgurl;
            }

            public void setImgurl(String imgurl) {
                this.imgurl = imgurl;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public int getReplycount() {
                return replycount;
            }

            public void setReplycount(int replycount) {
                this.replycount = replycount;
            }

            public int getPageindex() {
                return pageindex;
            }

            public void setPageindex(int pageindex) {
                this.pageindex = pageindex;
            }

            public int getJumpType() {
                return JumpType;
            }

            public void setJumpType(int JumpType) {
                this.JumpType = JumpType;
            }

            public String getJumpurl() {
                return jumpurl;
            }

            public void setJumpurl(String jumpurl) {
                this.jumpurl = jumpurl;
            }

            public int getMediatype() {
                return mediatype;
            }

            public void setMediatype(int mediatype) {
                this.mediatype = mediatype;
            }
        }

        public static class NewslistBean {
            private int id;
            private String title;
            private int mediatype;
            private String type;
            private String time;
            private String indexdetail;
            private String smallpic;
            private int replycount;
            private int pagecount;
            private int jumppage;
            private String lasttime;

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
        }
    }
}
