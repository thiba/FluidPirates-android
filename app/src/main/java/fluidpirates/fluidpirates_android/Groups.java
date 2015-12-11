package fluidpirates.fluidpirates_android;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Groups extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] items = this.getResources().getStringArray(R.array.name_group);
        ArrayAdapter adapter = new ArrayAdapter(this.getApplicationContext(),R.layout.fragment_group_element,items);
        setContentView(R.layout.activity_groups);
        ((ListView) this.findViewById(R.id.listGroups)).setAdapter(adapter);
    }

}
