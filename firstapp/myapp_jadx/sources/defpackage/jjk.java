package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class jjk implements Function1<bwa, Unit> {
    public final /* synthetic */ cwa a;

    public jjk(cwa cwaVar) {
        this.a = cwaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(bwa bwaVar) {
        bwa bwaVar2 = bwaVar;
        bwaVar2.getClass();
        bwaVar2.b(this.a);
        bwaVar2.g(0.7f);
        bwaVar2.f(0.58f);
        return Unit.a;
    }
}
