package java.android.shutup;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class ShutUpActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        setButtonClickListener();
        
    }
    private void setButtonClickListener(){
    	
        Button toggleButton = (Button)findViewById(R.id.toggleButton);
        toggleButton.setOnClickListener(new view.OnClickListener(){
    	public void onClick(View v){
    		
    	}
        });
    }
}