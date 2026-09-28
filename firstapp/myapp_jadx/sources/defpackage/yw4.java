package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class yw4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yw4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                dx4 dx4Var = (dx4) obj2;
                vr4 vr4Var = (vr4) obj;
                vr4Var.getClass();
                ucy ucyVarD = ucy.d(new ldy(new ax4(vr4Var, dx4Var)).h(va0.a()), new zcy(new cx4(dx4Var, vr4Var.d, vr4Var.b, vr4Var.c, vr4Var.a, vr4Var.e)).h(wm70.c));
                bx4 bx4Var = new bx4();
                ucyVarD.getClass();
                return new tdy(new idy(ucyVarD, bx4Var), new taj.c());
            default:
                irn irnVar = (irn) obj;
                irnVar.getClass();
                return Boolean.valueOf(irnVar.a.equals(((asn) obj2).a));
        }
    }
}
