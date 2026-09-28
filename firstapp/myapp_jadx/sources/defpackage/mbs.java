package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class mbs implements la50, rdd {
    public final s9s a;
    public final c9p b;

    public mbs(s9s s9sVar, c9p c9pVar) {
        this.a = s9sVar;
        this.b = c9pVar;
    }

    @Override // defpackage.la50
    public final Object a(a840.d dVar) {
        Object objA = sbs.a(this.a, dVar);
        return objA == y5b.a ? objA : Unit.a;
    }

    @Override // defpackage.la50
    public final void c() {
        this.a.d(this);
    }

    @Override // defpackage.rdd
    public final void onDestroy(ibs ibsVar) {
        this.b.cancel((CancellationException) null);
    }

    @Override // defpackage.la50
    public final void start() {
        this.a.a(this);
    }
}
