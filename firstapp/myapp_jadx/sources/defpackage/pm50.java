package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.ResultsSearchActivity;

/* JADX INFO: loaded from: classes7.dex */
public final class pm50 implements TextWatcher {
    public final /* synthetic */ egd0 a;
    public final /* synthetic */ ResultsSearchActivity b;

    public pm50(egd0 egd0Var, ResultsSearchActivity resultsSearchActivity) {
        this.a = egd0Var;
        this.b = resultsSearchActivity;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string = editable != null ? editable.toString() : null;
        if (string == null) {
            string = "";
        }
        int length = string.length();
        ResultsSearchActivity resultsSearchActivity = this.b;
        egd0 egd0Var = this.a;
        if (length > 0) {
            rm50.a.getClass();
            if (rm50.a.a(string) == null) {
                egd0Var.c.setError((CharSequence) resultsSearchActivity.getCMSString(R.string.live_result__search_error_message, new Object[0]));
            } else {
                egd0Var.c.setError((CharSequence) null);
            }
        } else {
            egd0Var.c.setError((CharSequence) null);
        }
        int i = ResultsSearchActivity.e;
        resultsSearchActivity.z1(true);
        egd0Var.e.setEnabled(string.length() > 0);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
