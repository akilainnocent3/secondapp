package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ry90 extends qlr implements Function1<a7l, Unit> {
    public final /* synthetic */ long a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry90(long j) {
        super(1);
        this.a = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(a7l a7lVar) {
        a7l a7lVar2 = a7lVar;
        long j = this.a;
        a7lVar2.k(Float.intBitsToFloat((int) (j >> 32)));
        a7lVar2.v(Float.intBitsToFloat((int) (j & 4294967295L)));
        a7lVar2.z0(n09.a(0.0f, 0.0f));
        return Unit.a;
    }
}
