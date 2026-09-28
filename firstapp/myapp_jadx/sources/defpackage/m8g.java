package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class m8g extends qlr implements Function1<jxo, jxo> {
    public final /* synthetic */ Function1<Integer, Integer> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m8g(Function1<? super Integer, Integer> function1) {
        super(1);
        this.a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final jxo invoke(jxo jxoVar) {
        long j = jxoVar.a;
        return new jxo((((long) this.a.invoke(Integer.valueOf((int) (j >> 32))).intValue()) << 32) | (((long) ((int) (j & 4294967295L))) & 4294967295L));
    }
}
