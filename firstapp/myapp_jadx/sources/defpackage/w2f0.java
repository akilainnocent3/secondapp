package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class w2f0 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ zp70 a;
    public final /* synthetic */ op8 b;
    public final /* synthetic */ op8 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;
    public final /* synthetic */ op8 i;

    public w2f0(zp70 zp70Var, op8 op8Var, op8 op8Var2, float f, float f2, int i, op8 op8Var3) {
        this.a = zp70Var;
        this.b = op8Var;
        this.c = op8Var2;
        this.d = f;
        this.e = f2;
        this.f = i;
        this.i = op8Var3;
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
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        tsr.a aVar2;
        Object u2f0Var;
        a aVar3 = aVar;
        int iIntValue = num.intValue();
        if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objY = aVar3.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = xvf.i(e.a, aVar3);
                aVar3.r(objY);
            }
            v5b v5bVar = (v5b) objY;
            z5w z5wVar = z5w.a;
            goh gohVarB = a6w.b(z5wVar, aVar3);
            goh gohVarB2 = a6w.b(z5wVar, aVar3);
            zp70 zp70Var = this.a;
            boolean zM = aVar3.M(zp70Var) | aVar3.M(v5bVar);
            Object objY2 = aVar3.y();
            if (zM || objY2 == c0042a) {
                objY2 = new jr70(zp70Var, v5bVar, gohVarB);
                aVar3.r(objY2);
            }
            jr70 jr70Var = (jr70) objY2;
            Object objY3 = aVar3.y();
            if (objY3 == c0042a) {
                objY3 = new v2f0(gohVarB2);
                aVar3.r(objY3);
            }
            v2f0 v2f0Var = (v2f0) objY3;
            aiv aivVarC = g75.c(ht.a.g, false);
            int I = aVar3.I();
            ne00 ne00VarO = aVar3.o();
            d.a aVar4 = d.a.b;
            d dVarC = c.c(aVar3, aVar4);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            if (aVar3.k() == null) {
                l2a.b();
                throw null;
            }
            aVar3.D();
            if (aVar3.g()) {
                aVar3.F(aVar5);
            } else {
                aVar3.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(aVar3, aivVarC, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(aVar3, ne00VarO, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(I))) {
                j3c.a(I, aVar3, I, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(aVar3, dVarC, cVar);
            this.b.invoke(aVar3, 0);
            List listK = b.k(this.c, pp8.b(509386037, new s2f0(this.i, v2f0Var), aVar3));
            d dVarB = ls7.b(i780.a(op70.b(j.C(j.g(aVar4, 1.0f), ht.a.d, 2), zp70Var, false, true, false)));
            float f = this.d;
            boolean zC = aVar3.c(f);
            float f2 = this.e;
            boolean zC2 = zC | aVar3.c(f2);
            int i = this.f;
            boolean zD = zC2 | aVar3.d(i) | aVar3.A(jr70Var);
            Object objY4 = aVar3.y();
            if (zD || objY4 == c0042a) {
                aVar2 = aVar5;
                u2f0Var = new u2f0(f, f2, v2f0Var, i, jr70Var);
                aVar3.r(u2f0Var);
            } else {
                u2f0Var = objY4;
                aVar2 = aVar5;
            }
            z8w z8wVar = (z8w) u2f0Var;
            op8 op8VarB = lsr.b(listK);
            boolean zM2 = aVar3.M(z8wVar);
            Object objY5 = aVar3.y();
            if (zM2 || objY5 == c0042a) {
                objY5 = new a9w(z8wVar);
                aVar3.r(objY5);
            }
            aiv aivVar = (aiv) objY5;
            int I2 = aVar3.I();
            ne00 ne00VarO2 = aVar3.o();
            d dVarC2 = c.c(aVar3, dVarB);
            if (aVar3.k() == null) {
                l2a.b();
                throw null;
            }
            aVar3.D();
            if (aVar3.g()) {
                aVar3.F(aVar2);
            } else {
                aVar3.p();
            }
            hlh0.a(aVar3, aivVar, bVar);
            hlh0.a(aVar3, ne00VarO2, dVar);
            if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(I2))) {
                j3c.a(I2, aVar3, I2, c1350a);
            }
            hlh0.a(aVar3, dVarC2, cVar);
            op8VarB.invoke(aVar3, 0);
            aVar3.s();
            aVar3.s();
        } else {
            aVar3.G();
        }
        return Unit.a;
    }
}
