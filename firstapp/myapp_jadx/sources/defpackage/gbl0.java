package defpackage;

import android.database.ContentObserver;

/* JADX INFO: loaded from: classes4.dex */
public final class gbl0 extends ContentObserver {
    public final /* synthetic */ kbl0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbl0(kbl0 kbl0Var) {
        super(null);
        this.a = kbl0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.a.set(true);
    }
}
