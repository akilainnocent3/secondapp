package p2;

import android.R;
import android.widget.AbsSpinner;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import java.util.List;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY})
public class c {
    @androidx.databinding.d({"android:entries"})
    public static <T> void a(AbsSpinner absSpinner, List<T> list) {
        if (list == null) {
            absSpinner.setAdapter((SpinnerAdapter) null);
            return;
        }
        SpinnerAdapter adapter = absSpinner.getAdapter();
        if (adapter instanceof t) {
            ((t) adapter).b(list);
        } else {
            absSpinner.setAdapter((SpinnerAdapter) new t(absSpinner.getContext(), list, R.layout.simple_spinner_item, R.layout.simple_spinner_dropdown_item, 0));
        }
    }

    @androidx.databinding.d({"android:entries"})
    public static <T extends CharSequence> void b(AbsSpinner absSpinner, T[] tArr) {
        if (tArr == null) {
            absSpinner.setAdapter((SpinnerAdapter) null);
            return;
        }
        SpinnerAdapter adapter = absSpinner.getAdapter();
        if (adapter != null && adapter.getCount() == tArr.length) {
            for (int i10 = 0; i10 < tArr.length; i10++) {
                if (tArr[i10].equals(adapter.getItem(i10))) {
                }
            }
            return;
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(absSpinner.getContext(), R.layout.simple_spinner_item, tArr);
        arrayAdapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        absSpinner.setAdapter((SpinnerAdapter) arrayAdapter);
    }
}
