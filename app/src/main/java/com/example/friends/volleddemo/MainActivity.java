package com.example.friends.volleddemo;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.LruCache;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView text = (TextView) findViewById(R.id.test);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "AAAAAAAAAAAAAAAAAAAAA", Toast.LENGTH_SHORT).show();

                text.setVisibility(View.GONE);
               /* text.isCursorVisible();
                final View view=text;
                view.setVisibility();*/
            }
        });

//===========================
     /*   RequestQueue queue = Volley.newRequestQueue(this);
        final StringRequest request = new StringRequest("http://www.baidu.com", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.e("HELLO", response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this, "ERROR..........", Toast.LENGTH_SHORT).show();
            }
        });*/
        //queue.add(request);
//============================
//        JsonRequest jsonRequest = new JsonObjectRequest("http://m.weather.com.cn/data/101010100.html", new Response.Listener<JSONObject>() {
//            @Override
//            public void onResponse(JSONObject response) {
//                Log.e("HELLO", response.toString());
//            }
//        }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                Log.e("HELLO", "ERROR");
//            }
//        });

        //queue.add(jsonRequest);

/*

        NetworkImageView networkImageView = (NetworkImageView) findViewById(R.id.network_image_view);
        networkImageView.setDefaultImageResId(R.mipmap.ic_launcher);
        networkImageView.setErrorImageResId(R.mipmap.ic_launcher);
        networkImageView.setImageUrl("http://img2.imgtn.bdimg.com/it/u=11960589,3193921445&fm=21&gp=0.jpg", new ImageLoader(queue, new MyImageLoaderCache()));

*/


    }

    public static class MyImageLoaderCache implements ImageLoader.ImageCache {
        private LruCache<String, Bitmap> cache;

        public MyImageLoaderCache() {
            super();
            int max = (int) (Runtime.getRuntime().maxMemory() / 8);
            cache = new LruCache<String, Bitmap>(max) {
                @Override
                protected int sizeOf(String key, Bitmap value) {
                    return value.getByteCount();
                }
            };
        }


        @Override
        public Bitmap getBitmap(String url) {
            return cache.get(url);
        }

        @Override
        public void putBitmap(String url, Bitmap bitmap) {
            cache.put(url, bitmap);
        }
    }

}

