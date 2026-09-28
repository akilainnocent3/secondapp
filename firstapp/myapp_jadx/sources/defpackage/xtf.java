package defpackage;

import android.view.View;
import com.sportybet.plugin.realsports.betslip.virtualkeyboard.EditTextWithKeyBoard;

/* JADX INFO: loaded from: classes7.dex */
public final class xtf implements View.OnClickListener {
    public final /* synthetic */ EditTextWithKeyBoard a;

    public xtf(EditTextWithKeyBoard editTextWithKeyBoard) {
        this.a = editTextWithKeyBoard;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.b();
    }
}
