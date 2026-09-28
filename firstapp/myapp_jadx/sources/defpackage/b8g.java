package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class b8g extends qlr implements Function1<a7l, Unit> {
    public final /* synthetic */ twd0<Float> a;
    public final /* synthetic */ twd0<Float> b;
    public final /* synthetic */ twd0<jsg0> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8g(dtg0.a.C0505a c0505a, dtg0.a.C0505a c0505a2, dtg0.a.C0505a c0505a3) {
        super(1);
        this.a = c0505a;
        this.b = c0505a2;
        this.c = c0505a3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(a7l a7lVar) {
        a7l a7lVar2 = a7lVar;
        twd0<Float> twd0Var = this.a;
        a7lVar2.b(twd0Var != null ? twd0Var.getValue().floatValue() : 1.0f);
        twd0<Float> twd0Var2 = this.b;
        a7lVar2.k(twd0Var2 != null ? twd0Var2.getValue().floatValue() : 1.0f);
        a7lVar2.v(twd0Var2 != null ? twd0Var2.getValue().floatValue() : 1.0f);
        twd0<jsg0> twd0Var3 = this.c;
        a7lVar2.z0(twd0Var3 != null ? twd0Var3.getValue().a : jsg0.b);
        return Unit.a;
    }
}
