package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class h9a extends ClickableSpan {
    public final rfs a;

    public h9a(rfs rfsVar) {
        this.a = rfsVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        rfs rfsVar = this.a;
        ufs ufsVarA = rfsVar.a();
        if (ufsVarA != null) {
            ufsVarA.a(rfsVar);
        }
    }
}
