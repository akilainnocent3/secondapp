package defpackage;

import androidx.compose.foundation.lazy.layout.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nfn implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nfn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                final pfn pfnVar = (pfn) obj2;
                mr5 mr5Var = (mr5) obj;
                float density = mr5Var.getDensity() * pfnVar.P.d().a;
                j90 j90VarA = m90.a();
                qx80 qx80VarA = pfnVar.O;
                if (qx80VarA == null) {
                    qx80VarA = xy80.a((uy80) zma.a(pfnVar, xy80.a), amh.d);
                }
                c9z.a(j90VarA, qx80VarA.a(mr5Var.a.d(), mr5Var.a.getLayoutDirection(), mr5Var));
                j90 j90VarA2 = m90.a();
                bxz.o(j90VarA2, new lk40(0.0f, Float.intBitsToFloat((int) (mr5Var.a.d() & 4294967295L)) - density, Float.intBitsToFloat((int) (mr5Var.a.d() >> 32)), Float.intBitsToFloat((int) (mr5Var.a.d() & 4294967295L))));
                final j90 j90VarA3 = m90.a();
                j90VarA3.u(j90VarA2, j90VarA, 1);
                return mr5Var.g(new Function1() { // from class: ofn
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        lza lzaVar = (lza) obj3;
                        lzaVar.b2();
                        wd0<j58, lj0> wd0Var = pfnVar.N;
                        wd0Var.getClass();
                        tcf.j0(lzaVar, j90VarA3, new soa0(wd0Var.d().a), 0.0f, null, null, 0, 60);
                        return Unit.a;
                    }
                });
            case 1:
                c cVarInvoke = ((uyr) obj2).D.invoke();
                int iA = cVarInvoke.a();
                int i2 = 0;
                while (i2 < iA) {
                    if (cVarInvoke.g(i2).equals(obj)) {
                        return Integer.valueOf(i2);
                    }
                    i2++;
                }
                i2 = -1;
                return Integer.valueOf(i2);
            default:
                String str = (String) obj;
                str.getClass();
                ((m410) obj2).K0(str);
                return Unit.a;
        }
    }
}
