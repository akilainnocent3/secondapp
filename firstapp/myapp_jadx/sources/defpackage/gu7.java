package defpackage;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgu7;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gu7 extends j8i0 {
    public final rdd0 a;
    public final c0e b;
    public final bag c;

    public gu7(vu60 vu60Var, rdd0 rdd0Var, c0e c0eVar) {
        vu60Var.getClass();
        rdd0Var.getClass();
        c0eVar.getClass();
        this.a = rdd0Var;
        this.b = c0eVar;
        Object objB = vu60Var.b("EXTRA_ENTRANCE");
        this.c = objB instanceof bag ? (bag) objB : null;
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        this.b.a = 0L;
        super.onCleared();
    }
}
