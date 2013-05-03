
package us.jsy.monitor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import roboguice.inject.InjectView;
import us.jsy.monitor.robosherlock.RoboSherlockFragment;

public class SampleFragment
    extends RoboSherlockFragment
{

    @InjectView(R.id.label_text)
    TextView labelText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_sample, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle bundle = getArguments();
        String label = bundle.getString("label");
        labelText.setText(label);
    }

}
