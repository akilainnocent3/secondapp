package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o3c extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ dtg0<Object> a;
    public final /* synthetic */ goh<Float> b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ op8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3c(dtg0 dtg0Var, goh gohVar, Object obj, op8 op8Var) {
        super(2);
        this.a = dtg0Var;
        this.b = gohVar;
        this.c = obj;
        this.d = op8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        Object objV;
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            l3c l3cVar = new l3c(this.b);
            g0h0 g0h0Var = gjs.b;
            dtg0<Object> dtg0Var = this.a;
            boolean zI = dtg0Var.i();
            o oVar = dtg0Var.a;
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zI) {
                aVar2.N(1666853325);
                aVar2.H();
                objV = oVar.V();
            } else {
                aVar2.N(1666599280);
                boolean zM = aVar2.M(dtg0Var);
                objV = aVar2.y();
                if (zM || objV == c0042a) {
                    c5a0.e.getClass();
                    c5a0 c5a0VarA = c5a0.a.a();
                    Function1<Object, Unit> function1E = c5a0VarA != null ? c5a0VarA.e() : null;
                    c5a0 c5a0VarB = c5a0.a.b(c5a0VarA);
                    try {
                        Object objV2 = oVar.V();
                        c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                        aVar2.r(objV2);
                        objV = objV2;
                    } catch (Throwable th) {
                        c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                        throw th;
                    }
                }
                aVar2.H();
            }
            aVar2.N(1378811975);
            Object obj = this.c;
            float f = Intrinsics.g(objV, obj) ? 1.0f : 0.0f;
            aVar2.H();
            Float fValueOf = Float.valueOf(f);
            boolean zM2 = aVar2.M(dtg0Var);
            Object objY = aVar2.y();
            if (zM2 || objY == c0042a) {
                objY = a6a0.b(new m3c(dtg0Var));
                aVar2.r(objY);
            }
            Object value = ((twd0) objY).getValue();
            aVar2.N(1378811975);
            float f2 = Intrinsics.g(value, obj) ? 1.0f : 0.0f;
            aVar2.H();
            Float fValueOf2 = Float.valueOf(f2);
            boolean zM3 = aVar2.M(dtg0Var);
            Object objY2 = aVar2.y();
            if (zM3 || objY2 == c0042a) {
                objY2 = a6a0.b(new n3c(dtg0Var));
                aVar2.r(objY2);
            }
            dtg0.d dVarD = vtg0.d(dtg0Var, fValueOf, fValueOf2, l3cVar.invoke(((twd0) objY2).getValue(), aVar2, 0), g0h0Var, aVar2, 0);
            boolean zM4 = aVar2.M(dVarD);
            Object objY3 = aVar2.y();
            if (zM4 || objY3 == c0042a) {
                objY3 = new k3c(dVarD);
                aVar2.r(objY3);
            }
            d dVarA = androidx.compose.ui.graphics.a.a(d.a.b, (Function1) objY3);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(aVar2.m());
            ne00 ne00VarO = aVar2.o();
            d dVarC = c.c(aVar2, dVarA);
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
            this.d.invoke(obj, aVar2, 0);
            aVar2.s();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
