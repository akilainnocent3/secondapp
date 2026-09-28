package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d4j0 extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ ytw a;
    public final /* synthetic */ nwa b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ op8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4j0(ytw ytwVar, nwa nwaVar, Function0 function0, String str, op8 op8Var) {
        super(2);
        this.a = ytwVar;
        this.b = nwaVar;
        this.c = function0;
        this.d = str;
        this.e = op8Var;
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
        a aVar2 = aVar;
        if ((num.intValue() & 3) == 2 && aVar2.j()) {
            aVar2.G();
        } else {
            this.a.setValue(Unit.a);
            nwa nwaVar = this.b;
            int i = nwaVar.b;
            nwa nwaVar2 = nwa.this;
            cwa cwaVarE = nwaVar2.e();
            cwa cwaVarE2 = nwaVar2.e();
            qyd0 qyd0Var = ejb0.a;
            float f = ((cjb0) aVar2.O(qyd0Var)).e;
            d.a aVar3 = d.a.b;
            d dVarJ = h.j(aVar3, 0.0f, f, 0.0f, 0.0f, 13);
            boolean zM = aVar2.M(cwaVarE);
            Object objY = aVar2.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = new y3j0(cwaVarE);
                aVar2.r(objY);
            }
            mw90.a(this.d, null, nwa.d(dVarJ, cwaVarE2, (Function1) objY), null, null, null, null, aVar2, 48, 2040);
            d dVarK = j.k(aVar3, 70.0f + ((cjb0) aVar2.O(qyd0Var)).e, 0.0f, 2);
            Object objY2 = aVar2.y();
            if (objY2 == c0042a) {
                objY2 = z3j0.a;
                aVar2.r(objY2);
            }
            d dVarD = nwa.d(dVarK, cwaVarE, (Function1) objY2);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(aVar2.m());
            ne00 ne00VarO = aVar2.o();
            d dVarC = c.c(aVar2, dVarD);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            if (aVar2.k() == null) {
                l2a.b();
                throw null;
            }
            aVar2.D();
            if (aVar2.g()) {
                aVar2.F(aVar4);
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
            this.e.invoke(aVar2, 0);
            aVar2.s();
            aVar2.H();
            if (nwaVar.b != i) {
                use useVar = xvf.a;
                aVar2.t(this.c);
            }
        }
        return Unit.a;
    }
}
