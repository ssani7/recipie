package com.asdevelopment.recipe;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ChickenFry extends AppCompatActivity {
    ListView listView;
    int images[] = {R.drawable.cf1, R.drawable.cf2, R.drawable.cf3, R.drawable.cf4, R.drawable.cf5, R.drawable.cf6,
            R.drawable.cf7, R.drawable.cf8, R.drawable.cf9, R.drawable.cf10};
    String names[];
    List<ItemsModel> listItems = new ArrayList<>();
    CustomAdapter customAdapter;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burgers);
        setTitle("Burgers");

        listView = findViewById(R.id.listView);
        names = getResources().getStringArray(R.array.chickenFry_names);

        for (int i = 0; i < names.length; i++) {
            ItemsModel itemsModel = new ItemsModel(names[i], images[i]);
            listItems.add(itemsModel);
        }
        customAdapter = new CustomAdapter(listItems, listItems, this);
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        intent = new Intent(ChickenFry.this, b1.class);
                        intent.putExtra("name", "cf1");
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(ChickenFry.this, b1.class);
                        intent.putExtra("name", "cf2");
                        startActivity(intent);
                        break;
                    case 2:
                        Intent intent = new Intent(ChickenFry.this, b1.class);
                        intent.putExtra("name", "cf3");
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(ChickenFry.this, b1.class);
                        intent.putExtra("name", "cf4");
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(ChickenFry.this, b1.class);
                        intent.putExtra("name", "cf5");
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(ChickenFry.this, b1.class);
                        intent.putExtra("name", "cf6");
                        startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(ChickenFry.this, b1.class);
                        intent.putExtra("name", "cf7");
                        startActivity(intent);
                        break;
                    case 7:
                        intent = new Intent(ChickenFry.this, b1.class);
                        intent.putExtra("name", "cf8");
                        startActivity(intent);
                        break;
                    case 8:
                        intent = new Intent(ChickenFry.this, b1.class);
                        intent.putExtra("name", "cf9");
                        startActivity(intent);
                        break;
                    case 9:
                        intent = new Intent(ChickenFry.this, b1.class);
                        intent.putExtra("name", "cf10");
                        startActivity(intent);
                        break;
                    case 10:
                        intent = new Intent(ChickenFry.this, b1.class);
                        intent.putExtra("name", "cf11");
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

            ImageView imageView = v.findViewById(R.id.L_imageview);
            TextView itemName = v.findViewById(R.id.l_textview);

            imageView.setImageResource(itemsModelListFiltered.get(i).getImage());
            itemName.setText(itemsModelListFiltered.get(i).getName());
            return v;
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