package defpackage;

import android.view.View;
import com.sporty.android.common_ui.widgets.PasswordEditText;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uuz implements View.OnFocusChangeListener {
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = PasswordEditText.e;
        if (z) {
            lop.d(view);
        } else {
            lop.a(view);
        }
    }
}
