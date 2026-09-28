package defpackage;

import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class v7l implements ovr {
    public final hur a;
    public long b = oxa.b(0, 0, 0, 15);
    public float c;
    public nvr d;

    public v7l(hur hurVar) {
        this.a = hurVar;
    }

    @Override // defpackage.ovr
    public final nvr a(oxr oxrVar, long j) {
        rce0 rce0Var = oxrVar.b;
        if (this.d != null && kxa.c(this.b, j) && this.c == rce0Var.getDensity()) {
            nvr nvrVar = this.d;
            nvrVar.getClass();
            return nvrVar;
        }
        this.b = j;
        this.c = rce0Var.getDensity();
        hur hurVar = this.a;
        p7l.a aVar = hurVar.a;
        kw0.e eVar = hurVar.b;
        if (kxa.i(j) == Integer.MAX_VALUE) {
            zkn.a("LazyVerticalGrid's width should be bound by parent.");
        }
        int i = kxa.i(j);
        int[] iArrZ0 = CollectionsKt.z0(aVar.a(i, oxrVar.y0(eVar.a())));
        int[] iArr = new int[iArrZ0.length];
        eVar.b(oxrVar, i, iArrZ0, asr.a, iArr);
        nvr nvrVar2 = new nvr(iArrZ0, iArr);
        this.d = nvrVar2;
        return nvrVar2;
    }
}
