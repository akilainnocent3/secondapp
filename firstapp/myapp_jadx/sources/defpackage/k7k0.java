package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k7k0 implements Function2 {
    public final /* synthetic */ ht.c a;

    public /* synthetic */ k7k0(ht.c cVar) {
        this.a = cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new iwo(((long) this.a.a(0, (int) (((jxo) obj).a & 4294967295L))) & 4294967295L);
    }
}
