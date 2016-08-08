/**
 * Created by chinmoy.dey on 02/08/16.
 */
package dey.chinmoy.updatestatus;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SelectTab extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static SelectTab newInstance(int sectionNumber) {
        SelectTab fragment = new SelectTab();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public SelectTab() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.select_tab, container, false);
        TextView myAwesomeTextView = (TextView) rootView.findViewById(R.id.section_label);
        myAwesomeTextView.setText("Let's update Quote here...");


        return rootView;
    }
}
