package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cai0 implements Runnable {
    public final /* synthetic */ View a;

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.a;
        ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
    }
}
