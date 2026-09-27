package p2;

import android.util.SparseBooleanArray;
import android.widget.TableLayout;
import java.util.regex.Pattern;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY})
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Pattern f120329a = Pattern.compile("\\s*,\\s*");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f120330b = 20;

    public static SparseBooleanArray a(CharSequence charSequence) {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        if (charSequence != null) {
            for (String str : f120329a.split(charSequence)) {
                try {
                    int i10 = Integer.parseInt(str);
                    if (i10 >= 0) {
                        sparseBooleanArray.put(i10, true);
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return sparseBooleanArray;
    }

    @androidx.databinding.d({"android:collapseColumns"})
    public static void b(TableLayout tableLayout, CharSequence charSequence) {
        SparseBooleanArray sparseBooleanArrayA = a(charSequence);
        for (int i10 = 0; i10 < 20; i10++) {
            boolean z10 = sparseBooleanArrayA.get(i10, false);
            if (z10 != tableLayout.isColumnCollapsed(i10)) {
                tableLayout.setColumnCollapsed(i10, z10);
            }
        }
    }

    @androidx.databinding.d({"android:shrinkColumns"})
    public static void c(TableLayout tableLayout, CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0 && charSequence.charAt(0) == '*') {
            tableLayout.setShrinkAllColumns(true);
            return;
        }
        tableLayout.setShrinkAllColumns(false);
        SparseBooleanArray sparseBooleanArrayA = a(charSequence);
        int size = sparseBooleanArrayA.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = sparseBooleanArrayA.keyAt(i10);
            boolean zValueAt = sparseBooleanArrayA.valueAt(i10);
            if (zValueAt) {
                tableLayout.setColumnShrinkable(iKeyAt, zValueAt);
            }
        }
    }

    @androidx.databinding.d({"android:stretchColumns"})
    public static void d(TableLayout tableLayout, CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0 && charSequence.charAt(0) == '*') {
            tableLayout.setStretchAllColumns(true);
            return;
        }
        tableLayout.setStretchAllColumns(false);
        SparseBooleanArray sparseBooleanArrayA = a(charSequence);
        int size = sparseBooleanArrayA.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = sparseBooleanArrayA.keyAt(i10);
            boolean zValueAt = sparseBooleanArrayA.valueAt(i10);
            if (zValueAt) {
                tableLayout.setColumnStretchable(iKeyAt, zValueAt);
            }
        }
    }
}
