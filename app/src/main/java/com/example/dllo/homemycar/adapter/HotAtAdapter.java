package com.example.dllo.homemycar.adapter; /*
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

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dllo.homemycar.R;
import com.example.dllo.homemycar.entity.HotEntity;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;

/**
 * Created by dllo on 16/9/27.
 */
public class HotAtAdapter extends BaseAdapter {
    private HotEntity entity;
    private Context context;

    public void setEntity(HotEntity entity) {
        this.entity = entity;
    }

    public HotAtAdapter(Context context) {

        this.context = context;
    }

    @Override
    public int getCount() {
        return entity == null ? 0 : entity.getResult().getList().size();
    }

    @Override
    public Object getItem(int i) {
        return entity.getResult().getList().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        HotViewHolder holder = null;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_hot_ac, viewGroup, false);
            holder = new HotViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (HotViewHolder) view.getTag();
        }
        holder.tvName.setText(entity.getResult().getList().get(i).getNickname());
        holder.tvTitle.setText(entity.getResult().getList().get(i).getTitle());
        holder.tvContent.setText(entity.getResult().getList().get(i).getTopicinfo());
        holder.tvDate.setText(entity.getResult().getList().get(i).getPostdate());
        holder.tvForum.setText(entity.getResult().getList().get(i).getBbsname());
        holder.tvNum.setText(entity.getResult().getList().get(i).getReplycounts()+"??????");
        String path = entity.getResult().getList().get(i).getHeadimg();
        if (path!=""){
            Picasso.with(context).load(entity.getResult().getList().get(i).getHeadimg()).transform(new CircleTransform()).into(holder.ima);
        }

        return view;
    }

    class HotViewHolder {
        private ImageView ima;
        private TextView tvName, tvDate, tvTitle, tvContent, tvForum, tvNum;

        public HotViewHolder(View view) {
            ima = (ImageView) view.findViewById(R.id.item_hot_ima);
            tvName = (TextView) view.findViewById(R.id.item_hot_name);
            tvDate = (TextView) view.findViewById(R.id.item_hot_date);
            tvTitle = (TextView) view.findViewById(R.id.item_hot_title);
            tvContent = (TextView) view.findViewById(R.id.item_hot_content);
            tvForum = (TextView) view.findViewById(R.id.item_hot_forum);
            tvNum = (TextView) view.findViewById(R.id.item_hot_num);

        }

    }
    public class CircleTransform implements Transformation {
        @Override
        public Bitmap transform(Bitmap source) {
            int size = Math.min(source.getWidth(), source.getHeight());

            int x = (source.getWidth() - size) / 2;
            int y = (source.getHeight() - size) / 2;

            Bitmap squaredBitmap = Bitmap.createBitmap(source, x, y, size, size);
            if (squaredBitmap != source) {
                source.recycle();
            }

            Bitmap bitmap = Bitmap.createBitmap(size, size, source.getConfig());

            Canvas canvas = new Canvas(bitmap);
            Paint paint = new Paint();
            BitmapShader shader = new BitmapShader(squaredBitmap,
                    BitmapShader.TileMode.CLAMP, BitmapShader.TileMode.CLAMP);
            paint.setShader(shader);
            paint.setAntiAlias(true);

            float r = size / 2f;
            canvas.drawCircle(r, r, r, paint);

            squaredBitmap.recycle();
            return bitmap;
        }

        @Override
        public String key() {
            return "circle";
        }

    }
}
