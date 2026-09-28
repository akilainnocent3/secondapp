package com.sporty.android.common.uievent;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends BaseTransientBottomBar.f<Snackbar> {
    public final /* synthetic */ Snackbar a;

    public c(Snackbar snackbar, a.m mVar) {
        this.a = snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar.f
    public final void a(BaseTransientBottomBar baseTransientBottomBar, int i) {
        ArrayList arrayList = this.a.s;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(this);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar.f
    public final void b(BaseTransientBottomBar baseTransientBottomBar) {
    }
}
