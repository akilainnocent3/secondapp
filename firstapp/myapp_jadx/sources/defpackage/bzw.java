package defpackage;

import android.widget.Toast$Callback;

/* JADX INFO: loaded from: classes6.dex */
public final class bzw extends Toast$Callback {
    public final /* synthetic */ String a;

    public bzw(String str) {
        this.a = str;
    }

    public final void onToastHidden() {
        super.onToastHidden();
        czw.a.remove(this.a);
    }
}
