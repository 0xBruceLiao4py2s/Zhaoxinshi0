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

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.adapter.MoreActivityAdapter;
import com.example.dllo.homemycar.custom.DividerItemDecoration;
import com.example.dllo.homemycar.custom.ThemeChangeUtil;
import com.example.dllo.homemycar.entity.MoreEntity;
import com.example.dllo.homemycar.fragment.RecommendAllFragment;
import com.example.dllo.homemycar.volley.VolleySingleton;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by dllo on 16/9/29.
 */
public class MoreActivity extends FragmentActivity {
    public static final String POSITION = "com.example.dllo.homemycar.actity.POSITION";
    private RecyclerView recyclerView;
    private MoreActivityAdapter activityAdapter;
    private ItemTouchHelper mHelper;
    private ImageView imaBack;
    private RecommendAllFragment recommendAllFragment;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ThemeChangeUtil.changeTheme(this);
        setContentView(R.layout.more_ac);
        initView();
        initData();
    }


    private void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.more_ry);
        imaBack = (ImageView) findViewById(R.id.s);

    }


    private void initData() {
        imaBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        activityAdapter = new MoreActivityAdapter(this);
        GridLayoutManager manager = new GridLayoutManager(this, 3);
        recyclerView.setLayoutManager(manager);
        ItemTouchHelper.Callback callback = createCallback();
        mHelper = new ItemTouchHelper(callback);
        mHelper.attachToRecyclerView(recyclerView);
        activityAdapter.setOnRecyclerItemClickListener(new MoreActivityAdapter.OnRecyclerItemClickListener() {
            @Override
            public void onItemClick(View view, MoreActivityAdapter.MoreViewHolder holder, int position) {
                Toast.makeText(MoreActivity.this, "position:" + position, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent.putExtra("popopo",position+1);
                setResult(100,intent);
                finish();


            }
        });


        VolleySingleton.addRequest("http://news.app.autohome.com.cn/shouye_v7.0.0/mobile/metadata.ashx?a=2&pm=2&v=7.0.7&types=newstype%7C636002832282225908%2Cvideotype%7C636002832282225908", MoreEntity.class, new Response.Listener<MoreEntity>() {
            @Override
            public void onResponse(MoreEntity response) {
                activityAdapter.setEntity(response);
                recyclerView.setAdapter(activityAdapter);
                // entities.add(response);
                // activityAdapter.setEntityList(entities);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        recyclerView.addItemDecoration(new DividerItemDecoration(this,RecyclerView.VERTICAL));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,RecyclerView.HORIZONTAL));
    }


    private ItemTouchHelper.Callback createCallback() {
        return new ItemTouchHelper.Callback() {
            // ???????????????item?????????(?????????????????????)??????
            @Override
            public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int actionState) {
                if (actionState != ItemTouchHelper.ACTION_STATE_IDLE){
                    viewHolder.itemView.setBackgroundColor(Color.LTGRAY);
                }
                super.onSelectedChanged(viewHolder, actionState);
            }

            // ????????????????????????(???????????????????????????
            @Override
            public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                super.clearView(recyclerView, viewHolder);
                viewHolder.itemView.setBackgroundColor(0);
            }
            //??????RecyclerView??????????????????????????????
            @Override
            public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                //????????????
                //????????? ??????????????????????????????????????????
                //????????? ??????????????????????????????????????????
                return ItemTouchHelper.Callback.makeMovementFlags(
                        ItemTouchHelper.UP | ItemTouchHelper.DOWN | ItemTouchHelper.START | ItemTouchHelper.END,
                        ItemTouchHelper.START | ItemTouchHelper.END
                );
            }
            //??????:??????????????????????????????????????????
            //?????????
            //????????? ???????????????????????????ViewHolder
            //????????? ??????????????????????????????ViewHolder

            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                int from = viewHolder.getAdapterPosition();
                int to = target.getAdapterPosition();
                activityAdapter.move(from, to);
                return false;
            }
            // ???????????????????????????
            //????????? ??????????????????????????????ViewHolder
            //????????? ???????????????

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
                int position = viewHolder.getAdapterPosition();
//                activityAdapter.add(position);

            }

            //??????????????? ?????????????????????????????????????????????
            @Override
            public boolean isLongPressDragEnabled() {
                return super.isLongPressDragEnabled();
            }

            //??????????????? ???????????????????????????????????????
            @Override
            public boolean isItemViewSwipeEnabled() {
                return super.isItemViewSwipeEnabled();
            }
        };
    }
}

