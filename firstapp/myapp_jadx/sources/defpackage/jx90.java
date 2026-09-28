package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class jx90 implements ix90 {
    public final boolean a;
    public final Function2<jxo, jxo, goh<jxo>> b;

    /* JADX WARN: Multi-variable type inference failed */
    public jx90(boolean z, Function2<? super jxo, ? super jxo, ? extends goh<jxo>> function2) {
        this.a = z;
        this.b = function2;
    }

    @Override // defpackage.ix90
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.ix90
    public final goh<jxo> b(long j, long j2) {
        return this.b.invoke(new jxo(j), new jxo(j2));
    }
}
