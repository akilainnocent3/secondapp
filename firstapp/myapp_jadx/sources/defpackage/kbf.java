package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.v;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kbf implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ List a;
    public final /* synthetic */ fcf b;
    public final /* synthetic */ op8 c;

    public kbf(List list, fcf fcfVar, op8 op8Var) {
        this.a = list;
        this.b = fcfVar;
        this.c = op8Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.iaj
    public final Unit d(gwr gwrVar, Integer num, a aVar, Integer num2) {
        int i;
        gwr gwrVar2 = gwrVar;
        int iIntValue = num.intValue();
        a aVar2 = aVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= aVar2.d(iIntValue) ? 32 : 16;
        }
        boolean z = true;
        if (aVar2.q(i & 1, (i & 147) != 146)) {
            Object obj = this.a.get(iIntValue);
            aVar2.N(-1184557665);
            fcf fcfVar = this.b;
            fcfVar.getClass();
            mae maeVarB = a6a0.b(new bcf(iIntValue, fcfVar));
            mae maeVarB2 = a6a0.b(new ccf(iIntValue, fcfVar));
            int i2 = i & 112;
            int i3 = i2 ^ 48;
            boolean zA = aVar2.A(fcfVar) | ((i3 > 32 && aVar2.d(iIntValue)) || (i & 48) == 32);
            Object objY = aVar2.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new hbf(iIntValue, fcfVar);
                aVar2.r(objY);
            }
            d dVarA = v.a(d.a.b, (Function1) objY);
            boolean zA2 = aVar2.A(fcfVar);
            if ((i3 <= 32 || !aVar2.d(iIntValue)) && (i & 48) != 32) {
                z = false;
            }
            boolean z2 = zA2 | z;
            Object objY2 = aVar2.y();
            if (z2 || objY2 == c0042a) {
                objY2 = new ibf(iIntValue, fcfVar);
                aVar2.r(objY2);
            }
            d dVarA2 = abk0.a(androidx.compose.ui.graphics.a.a(dVarA, (Function1) objY2), ((Boolean) maeVarB2.getValue()).booleanValue() ? 1.0f : 0.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(aVar2.m());
            ne00 ne00VarO = aVar2.o();
            d dVarC = c.c(aVar2, dVarA2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            if (aVar2.k() == null) {
                l2a.b();
                throw null;
            }
            aVar2.D();
            if (aVar2.g()) {
                aVar2.F(aVar3);
            } else {
                aVar2.p();
            }
            hlh0.a(aVar2, aivVarC, yka.a.f);
            hlh0.a(aVar2, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
            }
            hlh0.a(aVar2, dVarC, yka.a.d);
            ybf ybfVar = new ybf(fcfVar, i3z.a, iIntValue);
            Integer numValueOf = Integer.valueOf(iIntValue);
            Boolean bool = (Boolean) maeVarB.getValue();
            bool.getClass();
            this.c.f(ybfVar, numValueOf, obj, bool, aVar2, Integer.valueOf(i2));
            aVar2.s();
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
