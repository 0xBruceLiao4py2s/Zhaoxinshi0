package com.example.dllo.homemycar.findcarfragment; /*
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

import android.graphics.Color;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.adapter.HeadNewCarHotAdapter;
import com.example.dllo.homemycar.adapter.NewCarAdapter;
import com.example.dllo.homemycar.base.BaseFragment;
import com.example.dllo.homemycar.entity.HeadHotNewCarEntity;
import com.example.dllo.homemycar.entity.NewCarLabelEntity;
import com.example.dllo.homemycar.entity.Url;
import com.example.dllo.homemycar.volley.VolleySingleton;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by dllo on 16/9/23.
 */
public class NewCarFragment extends BaseFragment {
    private HashMap<String, Integer> selector;// ?????????????????????????????????
    private LinearLayout layoutIndex;
    private ListView lv;
    private TextView tvShow;
    private RecyclerView ryHot;
    private NewCarAdapter adapter;
    private String[] indexStr = {"A", "B", "C", "D", "F", "G", "H",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "W", "X", "Y", "Z"};
    private List<CarNameBean> nameList = null;
    private List<CarNameBean> newNameList = new ArrayList<CarNameBean>();
    private int height;// ????????????
    private boolean flag = false;
    private HeadNewCarHotAdapter headNewCarHotAdapter;
    private TextView labelImaFirst,labelImaSecond,labelImaThird,labelImaFour,labelImaFive,labelImaSix;

    @Override
    protected int setlayout() {
        return R.layout.new_car_fragments;
    }

    @Override
    protected void initView() {
        layoutIndex = getView(R.id.ll_new_car);
        layoutIndex.setBackgroundColor(Color.parseColor("#00ffffff"));
        lv = getView(R.id.lv_new_car);
        tvShow = getView(R.id.tv_new_car);
        tvShow.setVisibility(View.GONE);
        nameList = new ArrayList<>();

        initSendInterent();


    }

    @Override
    protected void initData() {


        View newCarView = LayoutInflater.from(getContext()).inflate(R.layout.head_new_car_hot,null);
        lv.addHeaderView(newCarView);
        ryHot = (RecyclerView) newCarView.findViewById(R.id.head_new_car_hot);
        ryHot.setLayoutManager(new GridLayoutManager(getContext(),5));
        headNewCarHotAdapter = new HeadNewCarHotAdapter(getContext());
        VolleySingleton.addRequest("http://223.99.255.20/cars.app.autohome.com.cn/dealer_v6.0.0/dealer/hotbrands-pm2.json",HeadHotNewCarEntity.class, new Response.Listener<HeadHotNewCarEntity>() {
            @Override
            public void onResponse(HeadHotNewCarEntity response) {
                headNewCarHotAdapter.setEntity(response);
                ryHot.setAdapter(headNewCarHotAdapter);




            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.getMessage();

            }
        });
        ViewTreeObserver observer = layoutIndex.getViewTreeObserver();
        observer.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            @Override
            public boolean onPreDraw() {
                /**************************/
                if (!flag) {
                    height = layoutIndex.getMeasuredHeight() / indexStr.length;
                    getIndexView();
                    flag = true;
                }
                return true;
            }
        });

    }
    private void initSendInterent() {
        VolleySingleton.addRequest(Url.NEW_CAR,NewCarBean.class, new Response.Listener<NewCarBean>() {
            private CarNameBean nameBean;
            @Override
            public void onResponse(NewCarBean response) {
                for (int i = 0; i < response.getResult().getBrandlist().size(); i++) {
                    for (int j = 0; j < response.getResult().getBrandlist().get(i).getList().size(); j++) {
                        nameBean = new CarNameBean(response.getResult().getBrandlist().get(i).getList().get(j).getName());
                        nameBean.setImageUrl(response.getResult().getBrandlist().get(i).getList().get(j).getImgurl());
                        nameList.add(nameBean);
                    }
                }
                String[] allNames = sortIndex(nameList);
                sortList(allNames);
                selector = new HashMap<String, Integer>();
                // ????????????????????????newPersons????????????????????????
                for (int j = 0; j < indexStr.length; j++) {
                    for (int i = 0; i < newNameList.size(); i++) {
                        if (newNameList.get(i).getName().equals(indexStr[j])) {
                            selector.put(indexStr[j], i);
                        }
                    }

                }
                adapter = new NewCarAdapter(getContext(), newNameList);
                lv.setAdapter(adapter);
            }


        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
    }
    private void sortList(String[] allNames) {
        for (int i = 0; i < allNames.length; i++) {
            if (allNames[i].length() != 1) {
                for (int j = 0; j < nameList.size(); j++) {
                    if (allNames[i].equals(nameList.get(j).getPinYinName())) {
                        CarNameBean p = new CarNameBean(nameList.get(j).getName(), nameList
                                .get(j).getPinYinName());
                        p.setImageUrl(nameList.get(j).getImageUrl());
                        newNameList.add(p);
                    }
                }
            } else {
                newNameList.add(new CarNameBean(allNames[i]));
            }
        }
    }
    private String[] sortIndex(List<CarNameBean> nameList) {
        TreeSet<String> set = new TreeSet<String>();
        // ???????????????????????????????????????????????????set???
        for (CarNameBean bean : nameList) {
            set.add(StringHelper.getPinYinHeadChar(bean.getName()).substring(
                    0, 1));
        }
        // ????????????????????????????????????set?????????
        String[] names = new String[nameList.size() + set.size()];
        int i = 0;
        for (String string : set) {
            names[i] = string;
            i++;
        }
        String[] pinYinNames = new String[nameList.size()];
        for (int j = 0; j < nameList.size(); j++) {
            nameList.get(j).setPinYinName(
                    StringHelper
                            .getPingYin(nameList.get(j).getName().toString()));
            pinYinNames[j] = StringHelper.getPingYin(nameList.get(j).getName()
                    .toString());
        }
        // ?????????????????????????????????
        System.arraycopy(pinYinNames, 0, names, set.size(), pinYinNames.length);
        // ???????????????????????????
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        return names;

    }
    public void getIndexView() {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT, height);
        for (int i = 0; i < indexStr.length; i++) {
            final TextView tv = new TextView(getContext());
            tv.setLayoutParams(params);
            tv.setText(indexStr[i]);
            tv.setPadding(10, 0, 10, 0);
            layoutIndex.addView(tv);
            layoutIndex.setOnTouchListener(new View.OnTouchListener() {

                @Override
                public boolean onTouch(View v, MotionEvent event)

                {
                    float y = event.getY();
                    int index = (int) (y / height);
                    if (index > -1 && index < indexStr.length) {// ????????????
                        String key = indexStr[index];
                        if (selector.containsKey(key)) {
                            int pos = selector.get(key);
                            if (lv.getHeaderViewsCount() > 0) {// ??????ListView?????????????????????????????????
                                lv.setSelectionFromTop(
                                        pos + lv.getHeaderViewsCount(), 0);
                            } else {
                                lv.setSelectionFromTop(pos, 0);// ??????????????????
                            }
                            tvShow.setVisibility(View.VISIBLE);
                            tvShow.setText(indexStr[index]);
                        }
                    }
                    switch (event.getAction()) {
                        case MotionEvent.ACTION_DOWN:
                            layoutIndex.setBackgroundColor(Color
                                    .parseColor("#00ffffff"));
                            break;

                        case MotionEvent.ACTION_MOVE:

                            break;
                        case MotionEvent.ACTION_UP:
                            layoutIndex.setBackgroundColor(Color
                                    .parseColor("#00ffffff"));
                            tvShow.setVisibility(View.GONE);
                            break;
                    }
                    return true;
                }
            });
        }
    }

}
