package com.example.dllo.homemycar.fragment; /*
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

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;


import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.actity.CollectActivity;
import com.example.dllo.homemycar.actity.DraftActivity;
import com.example.dllo.homemycar.actity.HistoryActivity;
import com.example.dllo.homemycar.actity.PreferentialActivity;
import com.example.dllo.homemycar.actity.SetUpActivity;
import com.example.dllo.homemycar.base.BaseFragment;
import com.example.dllo.homemycar.custom.ThemeChangeUtil;

import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;
import cn.sharesdk.sina.weibo.SinaWeibo;
import cn.sharesdk.tencent.qq.QQ;

/**
 * Created by dllo on 16/9/19.
 */
public class MyFragment extends BaseFragment implements OnClickListener {
    private RelativeLayout rlCollect;
    private RelativeLayout rlPreferential, rlHistory, rlCg, rlSetUp;
    private ImageView imaDay;
    private ImageView imaWeixin, imaWeibo;


    @Override
    protected int setlayout() {
        return R.layout.my_fragment;
    }

    @Override
    protected void initView() {
        rlCollect = getView(R.id.my_rl_collect);
        rlPreferential = getView(R.id.rl_preferential);
        rlHistory = getView(R.id.my_rl_history);
        rlCg = getView(R.id.my_fragment_cao_gao_rl);
        rlSetUp = getView(R.id.my_fragment_set_up_rl);
        imaDay = getView(R.id.ima_day);
        imaWeixin = getView(R.id.ima_wei_xin);
        imaWeibo = getView(R.id.ima_wei_bo);


    }

    @Override
    protected void initData() {
        ShareSDK.initSDK(getContext());
        rlCollect.setOnClickListener(this);
        rlPreferential.setOnClickListener(this);
        rlHistory.setOnClickListener(this);
        rlCg.setOnClickListener(this);
        rlSetUp.setOnClickListener(this);
        imaDay.setOnClickListener(this);
        imaWeibo.setOnClickListener(this);
        imaWeixin.setOnClickListener(this);
        ShareSDK.initSDK(getContext());


    }

    @Override
    public void onClick(View view) {
        PlatformActionListener paListener = null;
        switch (view.getId()) {
            case R.id.my_rl_collect:
                startActivity(new Intent(getContext(), CollectActivity.class));
                break;
            case R.id.rl_preferential:
                startActivity(new Intent(getContext(), PreferentialActivity.class));
                break;
            case R.id.my_rl_history:
                startActivity(new Intent(getContext(), HistoryActivity.class));
                Log.d("??????", "onClick: ");
                Toast.makeText(mContext, "?????????", Toast.LENGTH_SHORT).show();
                break;
            case R.id.my_fragment_cao_gao_rl:
                startActivity(new Intent(getContext(), DraftActivity.class));
                break;
            case R.id.my_fragment_set_up_rl:
                startActivity(new Intent(getContext(), SetUpActivity.class));
                break;
            case R.id.ima_day:
                showShare();
                break;
            case R.id.ima_wei_bo:
                Platform weibo = ShareSDK.getPlatform(SinaWeibo.NAME);

                weibo.setPlatformActionListener(paListener);
//authorize???showUser????????????????????????
                weibo.authorize();//????????????,OnComplete?????????hashmap?????????
                weibo.showUser(null);//???????????????????????????
                break;
            case R.id.ima_wei_xin:
                Platform qq = ShareSDK.getPlatform(QQ.NAME);

                qq.setPlatformActionListener(paListener);
//authorize???showUser????????????????????????
                qq.authorize();//????????????,OnComplete?????????hashmap?????????
                qq.showUser(null);//???????????????????????????
                break;

        }

    }

    private void showShare() {
        ShareSDK.initSDK(getContext());
        OnekeyShare oks = new OnekeyShare();
//??????sso??????
        oks.disableSSOWhenAuthorize();

// title???????????????????????????????????????????????????????????????QQ???????????????
        oks.setTitle("??????");
// titleUrl???????????????????????????QQ???QQ???????????????
        oks.setTitleUrl("http://sharesdk.cn");
// text???????????????????????????????????????????????????
        oks.setText("??????????????????");
// imagePath???????????????????????????Linked-In?????????????????????????????????
//oks.setImagePath("/sdcard/test.jpg");//??????SDcard????????????????????????
// url???????????????????????????????????????????????????
        oks.setUrl("http://sharesdk.cn");
// comment???????????????????????????????????????????????????QQ????????????
        oks.setComment("????????????????????????");
// site??????????????????????????????????????????QQ????????????
        oks.setSite(getString(R.string.app_name));
// siteUrl??????????????????????????????????????????QQ????????????
        oks.setSiteUrl("http://sharesdk.cn");

// ????????????GUI
        oks.show(getContext());
    }
}
