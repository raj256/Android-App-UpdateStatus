/**
 * Created by chinmoy.dey on 02/08/16.
 */
package dey.chinmoy.updatestatus;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WriteTab extends Fragment {
    private static final String ARG_SECTION_NUMBER = "section_number";

    public static WriteTab newInstance(int sectionNumber) {
        WriteTab fragment = new WriteTab();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.write_tab, container, false);

        return v;
    }
}
