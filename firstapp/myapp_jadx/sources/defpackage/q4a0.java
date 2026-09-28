package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", l = {134, 150}, m = "invokeSuspend")
public final class q4a0 extends tje0 implements Function2<v5b, v1b<? super ti0<Float, ij0>>, Object> {
    public aq40 a;
    public int b;
    public final /* synthetic */ t4a0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Function1<Float, Unit> e;
    public final /* synthetic */ tp70 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q4a0(t4a0 t4a0Var, float f, Function1<? super Float, Unit> function1, tp70 tp70Var, v1b<? super q4a0> v1bVar) {
        super(2, v1bVar);
        this.c = t4a0Var;
        this.d = f;
        this.e = function1;
        this.f = tp70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new q4a0(this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super ti0<Float, ij0>> v1bVar) {
        return ((q4a0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [p4a0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        final aq40 aq40Var;
        Object objD;
        t4a0 t4a0Var = this.c;
        y4a0 y4a0Var = t4a0Var.a;
        y5b y5bVar = y5b.a;
        int i = this.b;
        int i2 = 1;
        final Function1<Float, Unit> function1 = this.e;
        if (i == 0) {
            uj50.b(obj);
            h4d<Float> h4dVar = t4a0Var.b;
            float f = this.d;
            float fB = y4a0Var.b(f, j4d.a(h4dVar, 0.0f, f));
            if (Float.isNaN(fB)) {
                zkn.c("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            aq40Var = new aq40();
            float fSignum = Math.signum(f) * Math.abs(fB);
            aq40Var.a = fSignum;
            function1.invoke(new Float(fSignum));
            float f2 = aq40Var.a;
            ?? r4 = new Function1() { // from class: p4a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    float fFloatValue = ((Float) obj2).floatValue();
                    aq40 aq40Var2 = aq40Var;
                    float f3 = aq40Var2.a - fFloatValue;
                    aq40Var2.a = f3;
                    function1.invoke(Float.valueOf(f3));
                    return Unit.a;
                }
            };
            this.a = aq40Var;
            this.b = 1;
            objD = t4a0Var.d(this.f, f2, this.d, r4, this);
            if (objD != y5bVar) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        aq40 aq40Var2 = this.a;
        uj50.b(obj);
        aq40Var = aq40Var2;
        objD = obj;
        aj0 aj0Var = (aj0) objD;
        float fA = y4a0Var.a(((Number) aj0Var.b()).floatValue());
        if (Float.isNaN(fA)) {
            zkn.c("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        aq40Var.a = fA;
        aj0 aj0VarB = cj0.b(aj0Var, 0.0f, 0.0f, 30);
        xi0<Float> xi0Var = t4a0Var.c;
        i85 i85Var = new i85(i2, function1, aq40Var);
        this.a = null;
        this.b = 2;
        Object objD2 = ssi.d(this.f, fA, fA, aj0VarB, xi0Var, i85Var, this);
        return objD2 == y5bVar ? y5bVar : objD2;
    }
}
