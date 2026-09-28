package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class k40 implements ms7 {
    public final l40 a;

    public k40(l40 l40Var) {
        this.a = l40Var;
    }

    @Override // defpackage.ms7
    public final ks7 a() {
        ClipData primaryClip = this.a.a.getPrimaryClip();
        if (primaryClip != null) {
            return new ks7(primaryClip);
        }
        return null;
    }

    @Override // defpackage.ms7
    public final Unit b(ks7 ks7Var) {
        ClipboardManager clipboardManager = this.a.a;
        if (ks7Var != null) {
            clipboardManager.setPrimaryClip(ks7Var.a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            vl0.a(clipboardManager);
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
        }
        return Unit.a;
    }
}
