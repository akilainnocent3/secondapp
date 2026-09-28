package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kbj implements nv5.c {
    public final /* synthetic */ nv5.d a;
    public final /* synthetic */ adl b;
    public final /* synthetic */ long c;

    public /* synthetic */ kbj(nv5.d dVar, adl adlVar, long j) {
        this.a = dVar;
        this.b = adlVar;
        this.c = j;
    }

    @Override // nv5.c
    public final Object a(final nv5.a aVar) {
        final nv5.d dVar = this.a;
        obj.e(dVar, aVar);
        nv5.d.a aVar2 = dVar.b;
        if (!aVar2.isDone()) {
            aVar2.k(new qy5(this.b.schedule(new Runnable() { // from class: lbj
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.b(null);
                    dVar.cancel(true);
                }
            }, this.c, TimeUnit.MILLISECONDS), 1), nqe.a());
        }
        return "TimeoutFuture[" + dVar + "]";
    }
}
