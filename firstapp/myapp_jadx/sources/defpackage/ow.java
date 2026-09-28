package defpackage;

import android.content.Context;
import android.text.Editable;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class ow {
    public static final void a(ClearEditText clearEditText, lod lodVar, String str) {
        clearEditText.getClass();
        lodVar.getClass();
        str.getClass();
        if (lodVar.equals(lod.e.a) || lodVar.equals(lod.b.a)) {
            clearEditText.setError((String) null);
            return;
        }
        if (lodVar.equals(lod.f.a)) {
            Context context = clearEditText.getContext();
            context.getClass();
            clearEditText.setError(sn5.b(context, R.string.common_feedback__something_went_wrong_tip, new Object[0]));
            return;
        }
        if (lodVar instanceof lod.c) {
            Context context2 = clearEditText.getContext();
            context2.getClass();
            clearEditText.setError(sn5.b(context2, R.string.page_payment__the_maximum_deposit_amount_is_vcurrency_vamount, str, n4d.a(((lod.c) lodVar).a)));
        } else if (lodVar instanceof lod.d) {
            Context context3 = clearEditText.getContext();
            context3.getClass();
            clearEditText.setError(sn5.b(context3, R.string.page_payment__the_minimum_deposit_amount_is_vcurrency_vamount, str, n4d.a(((lod.d) lodVar).a)));
        } else {
            if (!lodVar.equals(lod.a.a)) {
                uhc.a();
                return;
            }
            Context context4 = clearEditText.getContext();
            context4.getClass();
            clearEditText.setError(sn5.b(context4, R.string.page_payment__please_enter_a_valid_integer, new Object[0]));
        }
    }

    public static final void b(ClearEditText clearEditText, xyx xyxVar) {
        clearEditText.getClass();
        xyxVar.getClass();
        String str = xyxVar.a;
        int i = xyxVar.b;
        if (str.equals(String.valueOf(clearEditText.getText()))) {
            return;
        }
        clearEditText.setText(str);
        clearEditText.setSelection(i);
    }

    public static final void c(ClearEditText clearEditText) {
        clearEditText.requestFocus();
        Editable text = clearEditText.getText();
        clearEditText.setSelection(text != null ? text.length() : 0);
        lop.c(clearEditText);
    }
}
