package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", f = "PageFetcherSnapshot.kt", l = {}, m = "invokeSuspend")
public final class gnz extends tje0 implements gaj<p1k, p1k, v1b<? super p1k>, Object> {
    public /* synthetic */ p1k a;
    public /* synthetic */ p1k b;
    public final /* synthetic */ kxs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnz(kxs kxsVar, v1b<? super gnz> v1bVar) {
        super(3, v1bVar);
        this.c = kxsVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(p1k p1kVar, p1k p1kVar2, v1b<? super p1k> v1bVar) {
        gnz gnzVar = new gnz(this.c, v1bVar);
        gnzVar.a = p1kVar;
        gnzVar.b = p1kVar2;
        return gnzVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean zD;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        p1k p1kVar = this.a;
        p1k p1kVar2 = this.b;
        p1kVar2.getClass();
        p1kVar.getClass();
        int i = p1kVar2.a;
        int i2 = p1kVar.a;
        if (i > i2) {
            zD = true;
        } else {
            zD = i < i2 ? false : k2h.d(p1kVar2.b, p1kVar.b, this.c);
        }
        return zD ? p1kVar2 : p1kVar;
    }
}
