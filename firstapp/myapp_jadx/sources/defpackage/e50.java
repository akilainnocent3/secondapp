package defpackage;

import androidx.compose.ui.platform.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class e50 extends qlr implements Function0<Unit> {
    public final /* synthetic */ sp70 a;
    public final /* synthetic */ c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e50(sp70 sp70Var, c cVar) {
        super(0);
        this.a = sp70Var;
        this.b = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        bb80 bb80Var;
        tsr tsrVar;
        sp70 sp70Var = this.a;
        vo70 vo70Var = sp70Var.e;
        vo70 vo70Var2 = sp70Var.f;
        Float f = sp70Var.c;
        Float f2 = sp70Var.d;
        float fFloatValue = (vo70Var == null || f == null) ? 0.0f : vo70Var.a.invoke().floatValue() - f.floatValue();
        float fFloatValue2 = (vo70Var2 == null || f2 == null) ? 0.0f : vo70Var2.a.invoke().floatValue() - f2.floatValue();
        if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
            int i = sp70Var.a;
            c cVar = this.b;
            int iA = cVar.A(i);
            eb80 eb80VarB = cVar.t().b(cVar.n);
            if (eb80VarB != null) {
                try {
                    c7 c7Var = cVar.p;
                    if (c7Var != null) {
                        c7Var.k(cVar.k(eb80VarB));
                        Unit unit = Unit.a;
                    }
                } catch (IllegalStateException unused) {
                    Unit unit2 = Unit.a;
                }
            }
            eb80 eb80VarB2 = cVar.t().b(cVar.o);
            if (eb80VarB2 != null) {
                try {
                    c7 c7Var2 = cVar.q;
                    if (c7Var2 != null) {
                        c7Var2.k(cVar.k(eb80VarB2));
                        Unit unit3 = Unit.a;
                    }
                } catch (IllegalStateException unused2) {
                    Unit unit4 = Unit.a;
                }
            }
            cVar.d.invalidate();
            eb80 eb80VarB3 = cVar.t().b(iA);
            if (eb80VarB3 != null && (bb80Var = eb80VarB3.a) != null && (tsrVar = bb80Var.c) != null) {
                if (vo70Var != null) {
                    cVar.s.h(iA, vo70Var);
                }
                if (vo70Var2 != null) {
                    cVar.t.h(iA, vo70Var2);
                }
                cVar.w(tsrVar);
            }
        }
        if (vo70Var != null) {
            sp70Var.c = vo70Var.a.invoke();
        }
        if (vo70Var2 != null) {
            sp70Var.d = vo70Var2.a.invoke();
        }
        return Unit.a;
    }
}
