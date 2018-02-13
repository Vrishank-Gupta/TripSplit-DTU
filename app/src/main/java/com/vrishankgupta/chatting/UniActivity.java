package com.vrishankgupta.chatting;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by tanishqsaluja on 13/2/18.
 */

public class UniActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uni_layout);
     //   ArrayList<Split> arrayList=new ArrayList<>();
      //  arrayList.add(new Split(FirebaseAuth.getInstance().getCurrentUser(),2.0f,5.0f));
      /*  Log.e("TEST",FirebaseAuth.getInstance().getCurrentUser().getUid()+" -> uid");
        RecyclerView recyclerView= (RecyclerView)findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(),DividerItemDecoration.VERTICAL));
        SplitAdapter splitAdapter=new SplitAdapter(arrayList);
        recyclerView.setAdapter(splitAdapter);
*/
    }
}
