package defpackage;

import android.util.SparseArray;
import android.view.autofill.AutofillValue;

/* JADX INFO: loaded from: classes.dex */
public final class c30 {
    public static final void a(x20 x20Var, SparseArray<AutofillValue> sparseArray) {
        if (x20Var.b.a.isEmpty()) {
            return;
        }
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            AutofillValue autofillValueA = y20.a(sparseArray.get(iKeyAt));
            if (autofillValueA.isText()) {
                am1 am1Var = x20Var.b;
                autofillValueA.getTextValue().toString();
            } else {
                if (autofillValueA.isDate()) {
                    throw new czx("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (autofillValueA.isList()) {
                    throw new czx("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (autofillValueA.isToggle()) {
                    throw new czx("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }
}
