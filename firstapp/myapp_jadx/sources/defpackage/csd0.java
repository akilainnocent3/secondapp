package defpackage;

import android.widget.EditText;
import com.sportybet.android.virtual.presentation.widget.StakeItemLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class csd0 implements Runnable {
    public final /* synthetic */ StakeItemLayout a;

    public csd0(StakeItemLayout stakeItemLayout) {
        this.a = stakeItemLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditText editText = this.a.i;
        editText.setSelection(editText.getText().length());
    }
}
