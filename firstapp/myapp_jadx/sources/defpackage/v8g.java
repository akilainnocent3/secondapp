package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class v8g extends qlr implements Function1<jxo, iwo> {
    public final /* synthetic */ Function1<Integer, Integer> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v8g(Function1<? super Integer, Integer> function1) {
        super(1);
        this.a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final iwo invoke(jxo jxoVar) {
        return new iwo(((long) this.a.invoke(Integer.valueOf((int) (jxoVar.a & 4294967295L))).intValue()) & 4294967295L);
    }
}
