package defpackage;

import com.sportybet.android.instantwin.router.sportylegends.SportyLegendsSettlementInput;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lodc0;", "Lj8i0;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class odc0 extends j8i0 {
    public final h1f a;
    public final jh2 b;
    public final SportyLegendsSettlementInput c;
    public final ku90<ndc0> d;
    public final uwd0<y5f> e;

    public static final /* synthetic */ class a extends pf implements Function2<x5f, v1b<? super Unit>, Object> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x5f x5fVar, v1b<? super Unit> v1bVar) {
            x5f x5fVar2 = x5fVar;
            odc0 odc0Var = (odc0) this.a;
            ku90<ndc0> ku90Var = odc0Var.d;
            if (x5fVar2 instanceof x5f.a) {
                ku90Var.a(new ndc0.a(((x5f.a) x5fVar2).a, odc0Var.b.B("sr:sport:3")));
            } else if (x5fVar2 instanceof x5f.b) {
                ku90Var.a(new ndc0.c(((x5f.b) x5fVar2).a));
            } else {
                if (!(x5fVar2 instanceof x5f.c)) {
                    uhc.a();
                    return null;
                }
                ku90Var.a(new ndc0.b(((x5f.c) x5fVar2).a));
            }
            return Unit.a;
        }
    }

    public odc0(vu60 vu60Var, h1f h1fVar, jh2 jh2Var) {
        vu60Var.getClass();
        h1fVar.getClass();
        jh2Var.getClass();
        this.a = h1fVar;
        this.b = jh2Var;
        this.c = (SportyLegendsSettlementInput) vu60Var.b("ARG_INPUT");
        this.d = new ku90<>();
        this.e = h1fVar.c();
        h1fVar.a(o8i0.d(this));
        kzh.d(new g1i(h1fVar.b(), new a(2, this, odc0.class, "handleDoubleOrNothingUiEvent", "handleDoubleOrNothingUiEvent(Lcom/sportybet/android/instantwin/presentation/doubleornothing/DoubleOrNothingUiEvent;)V", 4)), o8i0.d(this));
    }
}
