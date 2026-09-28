package defpackage;

import com.sportybet.android.instantwin.presentation.model.BetSlipData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gp3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gp3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                jp3 jp3Var = (jp3) obj2;
                kt3 kt3Var = (kt3) obj;
                jp3.a aVar = jp3.c0;
                kt3Var.getClass();
                String str = kt3Var.a;
                if (sqo.m(jp3Var.getActivity(), jp3Var.s0())) {
                    return Unit.a;
                }
                gs3 gs3VarW1 = jp3Var.r0().f.w1(str);
                if (gs3VarW1 == null) {
                    return Unit.a;
                }
                ((n4p) jp3Var.s0()).v(str, new BetSlipData(gs3VarW1.a, gs3VarW1.g, gs3VarW1.i, gs3VarW1.h, gs3VarW1.j, gs3VarW1.k, gs3VarW1.c, gs3VarW1.e, gs3VarW1.l, true));
                y03 y03Var = jp3Var.B;
                if (y03Var != null) {
                    y03Var.y0();
                }
                return Unit.a;
            default:
                return Boolean.valueOf(iic.f.a((String) obj2, (f1e0) obj));
        }
    }
}
