package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hur implements Function2 {
    public final /* synthetic */ p7l.a a;
    public final /* synthetic */ kw0.e b;

    public /* synthetic */ hur(p7l.a aVar, kw0.e eVar) {
        this.a = aVar;
        this.b = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mmd mmdVar = (mmd) obj;
        kxa kxaVar = (kxa) obj2;
        if (kxa.i(kxaVar.a) == Integer.MAX_VALUE) {
            zkn.a("LazyVerticalGrid's width should be bound by parent.");
        }
        int i = kxa.i(kxaVar.a);
        kw0.e eVar = this.b;
        int[] iArrZ0 = CollectionsKt.z0(this.a.a(i, mmdVar.y0(eVar.a())));
        int[] iArr = new int[iArrZ0.length];
        eVar.b(mmdVar, i, iArrZ0, asr.a, iArr);
        return new nvr(iArrZ0, iArr);
    }
}
