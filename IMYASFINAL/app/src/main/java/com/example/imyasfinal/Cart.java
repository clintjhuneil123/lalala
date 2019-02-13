package com.example.imyasfinal;

import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.imyasfinal.Common.CommonArt;
import com.example.imyasfinal.Database.Database;
import com.example.imyasfinal.ViewHolder.CartAdapter;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Cart extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    FirebaseDatabase database;
    DatabaseReference requests,portfolio;

    TextView txtTotalPrice;
    Button btnPlace;
    ArtistPorfolio currentPortfolio;
    List<Order> cart = new ArrayList<>();

    CartAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

//        database = FirebaseDatabase.getInstance();
//        requests=database.getReference("Request");
//        portfolio = FirebaseDatabase.getInstance().getReference("ArtistPortfolio");
//        recyclerView = (RecyclerView)findViewById(R.id.listCart);
//        recyclerView.setHasFixedSize(true);
//        layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);
//        txtTotalPrice= (TextView) findViewById(R.id.total);
//        btnPlace = (Button)findViewById(R.id.btnPlaceOrder);
//
//
//
//
//        btnPlace.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                showAlertDialog();
//            }
//        });
//
//        loadListCart();
//
//
//    }
//
//    private void showAlertDialog() {
//        AlertDialog.Builder alertDialog = new AlertDialog.Builder(Cart.this);
//        alertDialog.setTitle("One more step!");
//        alertDialog.setMessage("Enter your address:");
//
//        final EditText edtAddress = new EditText(Cart.this);
//        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.MATCH_PARENT,
//                LinearLayout.LayoutParams.MATCH_PARENT
//        );
//        edtAddress.setLayoutParams(lp);
//        alertDialog.setView(edtAddress);
//        alertDialog.setIcon(R.drawable.ic_shopping_cart_black_24dp);
//
//        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//                Request request = new Request(
//                        CommonArt.currentArt.getContact(),
//                        CommonArt.currentArt.getLastname(),
//                        edtAddress.getText().toString(),
//                        txtTotalPrice.getText().toString(),
//                        cart
//                );
//
//                requests.child(String.valueOf(System.currentTimeMillis()))
//                        .setValue(request);
//
////                new Database(getBaseContext()).cleanCart();
////                Toast.makeText(Cart.this, "Thank you, Artist place", Toast.LENGTH_SHORT).show();
////                finish();
//            }
//        });
//
//        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//            dialog.dismiss();
//            }
//        });
//        alertDialog.show();
//    }
//
//    private void loadListCart() {
//
//        adapter = new CartAdapter(cart, this);
//        recyclerView.setAdapter(adapter);
//
//        int total = 0;
//        for(Order order:cart)
//            total+=(Integer.parseInt(order.getPrice()))*(Integer.parseInt(order.getQuantity()));
//        Locale locale = new Locale("en","US");
//        NumberFormat fmt = NumberFormat.getCurrencyInstance(locale);
//
//        txtTotalPrice.setText(fmt.format(total));
    }
}
