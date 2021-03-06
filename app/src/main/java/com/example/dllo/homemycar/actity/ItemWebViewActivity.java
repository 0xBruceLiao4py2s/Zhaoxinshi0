package com.example.dllo.homemycar.actity; /*
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

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.base.BaseActivity;
import com.example.dllo.homemycar.datebase.DateBaseTool;
import com.example.dllo.homemycar.entity.CollectEntity;
import com.litesuits.orm.LiteOrm;

import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;

/**
 * Created by dllo on 16/10/11.
 */
public class ItemWebViewActivity extends BaseActivity {
    private WebView webView;
    private ImageView imageView, imaCollect;
    private String url;
    private DateBaseTool tool;

    @Override
    protected int setLayout() {
        return R.layout.item_web_ac;
    }

    @Override
    protected void initView() {
        ShareSDK.initSDK(this);
        webView = getView(R.id.item_web_ac);
        imageView = getView(R.id.item_web_ac_for);
        imaCollect = getView(R.id.ima_collect);

    }

    @Override
    protected void initData() {
        Intent intent = getIntent();
        url = intent.getStringExtra("asd");
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showShare();
            }
        });

        tool = new DateBaseTool(this);
        imaCollect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CollectEntity entity = new CollectEntity();
                entity.setUrl(url);
                Log.d("?????????url", "entity:" + entity);
                tool.insert(entity);
                Toast.makeText(ItemWebViewActivity.this, "???", Toast.LENGTH_SHORT).show();

            }
        });


    }

    private void showShare() {
        ShareSDK.initSDK(this);
        OnekeyShare oks = new OnekeyShare();
//??????sso??????
        oks.disableSSOWhenAuthorize();

// title???????????????????????????????????????????????????????????????QQ???????????????
        oks.setTitle("??????");
// titleUrl???????????????????????????QQ???QQ???????????????
        oks.setTitleUrl(url);
// text???????????????????????????????????????????????????
        oks.setText("");
// imagePath???????????????????????????Linked-In?????????????????????????????????
        oks.setImagePath("/sdcard/test.jpg");//??????SDcard????????????????????????
// url???????????????????????????????????????????????????
        oks.setUrl(url);
// comment???????????????????????????????????????????????????QQ????????????
        oks.setComment("????????????????????????");
// site??????????????????????????????????????????QQ????????????
        oks.setSite(getString(R.string.app_name));
// siteUrl??????????????????????????????????????????QQ????????????
        oks.setSiteUrl(url);

// ????????????GUI
        oks.show(this);
    }
}
