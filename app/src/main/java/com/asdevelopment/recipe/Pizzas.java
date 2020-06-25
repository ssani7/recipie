package com.asdevelopment.recipe;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Pizzas extends AppCompatActivity {
    ListView listView;
    int images[] = {R.drawable.pz1, R.drawable.pz2,R.drawable.pz3, R.drawable.pz4, R.drawable.pz5, R.drawable.pz6, R.drawable.pz7,
            R.drawable.pz8, R.drawable.pz9, R.drawable.pz10, R.drawable.pz11, R.drawable.pz12, R.drawable.pz13, R.drawable.pz14, R.drawable.pz15};
    String names[];
    List<ItemsModel> listItems = new ArrayList<>();
    CustomAdapter customAdapter;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burgers);
        this.setTitle("Pasta");

        listView = findViewById(R.id.listView);
        names = getResources().getStringArray(R.array.pizzaNames);

        for (int i = 0; i< names.length; i++){
            ItemsModel itemsModel = new ItemsModel(names[i],images[i]);
            listItems.add(itemsModel);
        }
        customAdapter = new CustomAdapter(listItems, listItems, this);
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        intent = new Intent(Pizzas.this, b1.class);
                        intent.putExtra("name","pz1");
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(Pizzas.this, b1.class);
                        intent.putExtra("name","pz2");
                        startActivity(intent);
                        break;
                    case 2:
                        Intent intent = new Intent(Pizzas.this, b1.class);
                        intent.putExtra("name","pz3");
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(Pizzas.this, b1.class);
                        intent.putExtra("name","pz4");
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(Pizzas.this, b1.class);
                        intent.putExtra("name","pz5");
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(Pizzas.this, b1.class);
                        intent.putExtra("name","pz6");
                        startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(Pizzas.this, b1.class);
                        intent.putExtra("name","pz7");
                        startActivity(intent);
                        break;
                    case 7:
                        intent = new Intent(Pizzas.this, b1.class);
                        intent.putExtra("name","pz8");
                        startActivity(intent);
                        break;
                    case 8:
                        intent = new Intent(Pizzas.this, b1.class);
                        intent.putExtra("name","pz9");
                        startActivity(intent);
                        break;
                    case 9:
                        intent = new Intent(Pizzas.this, b1.class);
                        intent.putExtra("name","pz10");
                        startActivity(intent);
                        break;
                    case 10:
                        intent = new Intent(Pizzas.this, b1.class);
                        intent.putExtra("name","pz11");
                        startActivity(intent);
                        break;
                    case 11:
                        intent = new Intent(Pizzas.this, b1.class);
                        intent.putExtra("name","pz12");
                        startActivity(intent);
                        break;
                    case 12:
                        intent = new Intent(Pizzas.this, b1.class);
                        intent.putExtra("name","pz13");
                        startActivity(intent);
                        break;
                    case 13:
                        intent = new Intent(Pizzas.this, b1.class);
                        intent.putExtra("name","pz14");
                        startActivity(intent);
                        break;
                    case 14:
                        intent = new Intent(Pizzas.this, b1.class);
                        intent.putExtra("name","pz15");
                        startActivity(intent);
                        break;

                }
            }
        });

    }
    public class CustomAdapter extends BaseAdapter {
        private List<ItemsModel> itemsModelList;
        private List<ItemsModel> itemsModelListFiltered;
        private Context context;

        public CustomAdapter(List<ItemsModel> itemsModelList, List<ItemsModel> itemsModelListFiltered, Context context) {
            this.itemsModelList = itemsModelList;
            this.itemsModelListFiltered = itemsModelList;
            this.context = context;
        }

        @Override
        public int getCount() {
            return itemsModelListFiltered.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View v = getLayoutInflater().inflate(R.layout.sample_view, null);

            ImageView imageView = v.findViewById(R.id.L_imageview);
            TextView itemName = v.findViewById(R.id.l_textview);

            imageView.setImageResource(itemsModelListFiltered.get(i).getImage());
            itemName.setText(itemsModelListFiltered.get(i).getName());
            return v;
        }

    }
}
