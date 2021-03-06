package com.example.dllo.homemycar.recommendfragment; /*
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
import android.os.Handler.Callback;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ScrollView;

import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.custom.GridViews;

import com.example.dllo.homemycar.adapter.RecommendAllGridAdapter;
import com.example.dllo.homemycar.adapter.RecommendLunBoAdapter;
import com.example.dllo.homemycar.base.BaseFragment;
import com.example.dllo.homemycar.entity.RecommendEntity;
import com.example.dllo.homemycar.volley.VolleySingleton;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshScrollView;

/**
 * Created by dllo on 16/9/19.
 */
public class RecommendFragment extends BaseFragment {

    private PullToRefreshScrollView scrollView;
    //?????????????????????
    private RecommendLunBoAdapter recommendLunBoAdapter;
    private ViewPager viewPager;
    private android.os.Handler handler;
    private boolean flag = true;
    private boolean mm = true;

    private GridViews gridViews;
    private String url;


    @Override
    protected int setlayout() {
        return R.layout.recommend_fragment;
    }

    @Override
    protected void initView() {

        scrollView = getView(R.id.recommend_drawer_layout);

        viewPager = getView(R.id.library_recommend_view_pager);

        gridViews = getView(R.id.recommend_list_view);


    }

    @Override
    protected void initData() {
        gridViews.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, final int i, long l) {

                VolleySingleton.addRequest("http://app.api.autohome.com.cn/autov4.8.8/news/newslist-pm1-c0-nt0-p1-s30-l0.json\n",RecommendEntity.class, new Listener<RecommendEntity>() {
                    @Override
                    public void onResponse(RecommendEntity response) {
                        int u = response.getResult().getNewslist().get(i).getId();
                        url = "http://cont.app.autohome.com.cn/autov4.2.5/content/News/newscontent-a2-pm1-v4.2.5-n"+u
                                +"-lz0-sp0-nt0-sa1-p0-c1-fs0-cw320.html\n";
                        Log.d("??????", url);

                        Intent intent = new Intent(getContext(), com.example.dllo.homemycar.recommendfragment.RecommendWebActivity.class);
                        intent.putExtra("recommend",url);
                        startActivity(intent);

                    }
                }, new ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.getMessage();
                    }
                });

            }
        });
        scrollView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ScrollView>() {
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ScrollView> refreshView) {
                //?????????
                recommendLunBoAdapter = new RecommendLunBoAdapter(getContext());
                VolleySingleton.addRequest("http://app.api.autohome.com.cn/autov4.2.5/news/newslist-a2-pm1-v4.2.5-c0-nt0-p1-s30-l0.html",
                        RecommendEntity.class, new Response.Listener<RecommendEntity>() {
                            @Override
                            public void onResponse(RecommendEntity response) {
                                recommendLunBoAdapter.setEntity(response);
                                viewPager.setAdapter(recommendLunBoAdapter);
                            }
                        }
                        , new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                error.getMessage();
                            }
                        });

                recommendLunBoAdapter.setViewPager(viewPager);
                //???????????????handler??????
                handler = new android.os.Handler(new Callback() {

                    @Override
                    public boolean handleMessage(Message msg) {
                        viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                        return false;
                    }
                });

                if (mm) {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            while (flag) {
                                try {
                                    Thread.sleep(3000);

                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                handler.sendEmptyMessage(0);
                            }
                        }
                    }).start();
                    mm = false;
                }


                //listView

                VolleySingleton.addRequest("http://app.api.autohome.com.cn/autov4.2.5/news/newslist-a2-pm1-v4.2.5-c0-nt0-p1-s30-l0.html", RecommendEntity.class, new Listener<RecommendEntity>() {
                    @Override
                    public void onResponse(RecommendEntity response) {
                        RecommendAllGridAdapter allGridAdapter = new RecommendAllGridAdapter(getContext());
                        allGridAdapter.setEntity(response);
                        gridViews.setAdapter(allGridAdapter);

                    }
                }, new ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.getMessage();

                    }
                });

                scrollView.onRefreshComplete();

            }

            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ScrollView> refreshView) {

            }
        });


//?????????
        recommendLunBoAdapter = new RecommendLunBoAdapter(getContext());
        VolleySingleton.addRequest("http://app.api.autohome.com.cn/autov4.2.5/news/newslist-a2-pm1-v4.2.5-c0-nt0-p1-s30-l0.html",
                RecommendEntity.class, new Response.Listener<RecommendEntity>() {
                    @Override
                    public void onResponse(RecommendEntity response) {
                        recommendLunBoAdapter.setEntity(response);
                        viewPager.setAdapter(recommendLunBoAdapter);
                    }
                }
                , new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        error.getMessage();
                    }
                });

        recommendLunBoAdapter.setViewPager(viewPager);
        //???????????????handler??????
        handler = new android.os.Handler(new Callback() {

            @Override
            public boolean handleMessage(Message msg) {
                viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                return false;
            }
        });

        if (mm) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (flag) {
                        try {
                            Thread.sleep(3000);

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        handler.sendEmptyMessage(0);
                    }
                }
            }).start();
            mm = false;
        }


        //listView

        VolleySingleton.addRequest("http://app.api.autohome.com.cn/autov4.2.5/news/newslist-a2-pm1-v4.2.5-c0-nt0-p1-s30-l0.html", RecommendEntity.class, new Listener<RecommendEntity>() {
            @Override
            public void onResponse(RecommendEntity response) {
                RecommendAllGridAdapter allGridAdapter = new RecommendAllGridAdapter(getContext());
                allGridAdapter.setEntity(response);
                gridViews.setAdapter(allGridAdapter);

            }
        }, new ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.getMessage();

            }
        });


    }
}
