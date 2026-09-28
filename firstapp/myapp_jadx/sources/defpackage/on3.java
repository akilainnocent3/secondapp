package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class on3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ on3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ao3) obj).x1(xy3.b.a);
                break;
            default:
                o540 o540Var = (o540) obj;
                o540Var.s0();
                d740 d740VarQ0 = o540Var.q0();
                d740VarQ0.Q.setValue(null);
                wwd0 wwd0Var = d740VarQ0.K;
                z2z z2zVar = z2z.SETTLED;
                wwd0Var.getClass();
                wwd0Var.k(null, z2zVar);
                wwd0 wwd0Var2 = d740VarQ0.M;
                bbj0 bbj0Var = bbj0.a;
                wwd0Var2.getClass();
                wwd0Var2.k(null, bbj0Var);
                break;
        }
        return Unit.a;
    }
}
