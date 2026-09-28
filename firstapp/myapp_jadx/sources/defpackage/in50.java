package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class in50 extends j9p {
    public final bc6 e;

    public in50(bc6 bc6Var) {
        this.e = bc6Var;
    }

    @Override // defpackage.j9p
    public final boolean k() {
        return false;
    }

    @Override // defpackage.j9p
    public final void l(Throwable th) {
        zi50.a aVar = zi50.b;
        this.e.resumeWith(Unit.a);
    }
}
