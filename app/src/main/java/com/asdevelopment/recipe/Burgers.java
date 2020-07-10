package com.asdevelopment.recipe;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.ListView;
import android.support.v7.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Burgers extends AppCompatActivity {
    ListView listView;
    int images[] = {R.drawable.b1, R.drawable.b2, R.drawable.b3, R.drawable.b4, R.drawable.b5, R.drawable.b6,
            R.drawable.b7, R.drawable.b8, R.drawable.b9, R.drawable.b10, R.drawable.b11, R.drawable.b12, R.drawable.b13, R.drawable.b14, R.drawable.b15};
    String names[];
    List<ItemsModel> listItems = new ArrayList<>();
    CustomAdapter customAdapter;
    Intent intent;
    FavDB favDb;
    Button fav_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burgers);
        setTitle("Burgers");

        listView = findViewById(R.id.listView);
        names = getResources().getStringArray(R.array.items);

        for (int i = 0; i < names.length; i++) {
            ItemsModel itemsModel = new ItemsModel(names[i], images[i], null,null);
            listItems.add(itemsModel);
        }
        customAdapter = new CustomAdapter(listItems, listItems, this);
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        intent = new Intent(Burgers.this, b1.class);
                        intent.putExtra("name", "b1");
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(Burgers.this, b1.class);
                        intent.putExtra("name", "b2");
                        startActivity(intent);
                        break;
                    case 2:
                        Intent intent = new Intent(Burgers.this, b1.class);
                        intent.putExtra("name", "b3");
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(Burgers.this, b1.class);
                        intent.putExtra("name", "b4");
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(Burgers.this, b1.class);
                        intent.putExtra("name", "b5");
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(Burgers.this, b1.class);
                        intent.putExtra("name", "b6");
                        startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(Burgers.this, b1.class);
                        intent.putExtra("name", "b7");
                        startActivity(intent);
                        break;
                    case 7:
                        intent = new Intent(Burgers.this, b1.class);
                        intent.putExtra("name", "b8");
                        startActivity(intent);
                        break;
                    case 8:
                        intent = new Intent(Burgers.this, b1.class);
                        intent.putExtra("name", "b9");
                        startActivity(intent);
                        break;
                    case 9:
                        intent = new Intent(Burgers.this, b1.class);
                        intent.putExtra("name", "b10");
                        startActivity(intent);
                        break;
                    case 10:
                        intent = new Intent(Burgers.this, b1.class);
                        intent.putExtra("name", "b11");
                        startActivity(intent);
                        break;
                    case 11:
                        intent = new Intent(Burgers.this, b1.class);
                        intent.putExtra("name", "b12");
                        startActivity(intent);
                        break;
                    case 12:
                        intent = new Intent(Burgers.this, b1.class);
                        intent.putExtra("name", "b13");
                        startActivity(intent);
                        break;
                    case 13:
                        intent = new Intent(Burgers.this, b1.class);
                        intent.putExtra("name", "b14");
                        startActivity(intent);
                        break;
                    case 14:
                        intent = new Intent(Burgers.this, b1.class);
                        intent.putExtra("name", "b15");
                        startActivity(intent);
                        break;

                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        MenuItem menuItem = menu.findItem(R.id.searchView);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                customAdapter.getFilter().filter(s);
                return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.searchView) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public class CustomAdapter extends BaseAdapter implements Filterable {
        private List<ItemsModel> itemsModelList;
        private List<ItemsModel> itemsModelListFiltered;
        private Context context;

        public CustomAdapter(List<ItemsModel> itemsModelListFiltered, List<ItemsModel> itemsModelList, Context context) {
            this.itemsModelListFiltered = itemsModelListFiltered;
            this.itemsModelList = itemsModelList;
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
            favDb = new FavDB(context);
            SharedPreferences prefs = context.getSharedPreferences("prefs",Context.MODE_PRIVATE);
            boolean firstStart = prefs.getBoolean("firstStart", true);
            if (firstStart){
                createTableOnFirstStart();
            }

            ImageView imageView = v.findViewById(R.id.L_imageview);
            TextView itemName = v.findViewById(R.id.l_textview);

            imageView.setImageResource(itemsModelListFiltered.get(i).getImage());
            itemName.setText(itemsModelListFiltered.get(i).getName());

            final Button fav_button = v.findViewById(R.id.fav_button);
            fav_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getCount();
                    ItemsModel itemsModel = itemsModelList.get(position);

                    if (itemsModel.getFavStatus().equals("0")){
                        itemsModel.setFavStatus("1");
                        favDb.insertIntroTheDatabase(itemsModel.getName(),itemsModel.getImage(),
                                itemsModel.getKey_id(),itemsModel.getFavStatus());
                        fav_button.setBackgroundResource(R.drawable.ic_baseline_favorite_24);
                    }else {
                        itemsModel.setFavStatus("0");
                        favDb.remove_fav(itemsModel.getKey_id());
                        fav_button.setBackgroundResource(R.drawable.ic_baseline_favorite_shadow_24);
                    }

                }

            });
            final ItemsModel itemsModel =itemsModelList.get(i);
            imageView.setImageResource(itemsModel.getImage());
            itemName.setText(itemsModel.getName());
            readCursorData(itemsModel);
            return v;
        }

        private void readCursorData(ItemsModel itemsModel) {
            Cursor cursor = favDb.read_all_data(itemsModel.getKey_id());
            SQLiteDatabase db = favDb.getReadableDatabase();
            try{
                while (cursor.moveToNext()){
                    String item_fav_status = cursor.getString(cursor.getColumnIndex(FavDB.FAVOURITE_STATUS));
                    itemsModel.setFavStatus(item_fav_status);

                    if (item_fav_status != null && item_fav_status.equals("1")){
                        fav_button.setBackgroundResource(R.drawable.ic_baseline_favorite_24);
                    }else if (item_fav_status != null && item_fav_status.equals("0")){
                        fav_button.setBackgroundResource(R.drawable.ic_baseline_favorite_shadow_24);
                    }
                }
            }finally {
                if (cursor!= null && cursor.isClosed())
                    cursor.close();
                db.close();
            }
        }

        private void createTableOnFirstStart() {
            favDb.insertEmpty();

            SharedPreferences prefs = context.getSharedPreferences("prefs",Context.MODE_PRIVATE);
            SharedPreferences.Editor editor= prefs.edit();
            editor.putBoolean("firstStart",false);
            editor.apply();

        }

        @Override
        public Filter getFilter() {
            Filter filter = new Filter() {
                @Override
                protected FilterResults performFiltering(CharSequence charSequence) {
                    FilterResults filterResults = new FilterResults();
                    if (charSequence == null || charSequence.length() == 0) {
                        filterResults.count = itemsModelList.size();
                        filterResults.values = itemsModelList;
                    } else {
                        String searchStr = charSequence.toString().toLowerCase().trim();
                        List<ItemsModel> resultData = new ArrayList<>();
                        for (ItemsModel itemsModel : itemsModelList) {
                            if (itemsModel.getName().toLowerCase().contains(searchStr)) {
                                resultData.add(itemsModel);
                            }
                            filterResults.count = resultData.size();
                            filterResults.values = resultData;

                        }
                    }
                    return filterResults;
                }

                @Override
                protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
                    itemsModelListFiltered = (List<ItemsModel>) filterResults.values;
                    notifyDataSetChanged();
                }
            };
            return filter;
        }
    }
}