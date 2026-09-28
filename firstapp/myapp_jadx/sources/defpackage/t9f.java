package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class t9f<T> extends d.c implements psr {
    public i20<T> D;
    public Function2<? super jxo, ? super kxa, ? extends Pair<? extends n9f<T>, ? extends T>> E;
    public i3z F;
    public boolean G;

    public t9f() {
        throw null;
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
    @Override // defpackage.psr
    public final biv e(final t tVar, vhv vhvVar, long j) {
        final y yVarD0 = vhvVar.d0(j);
        if (!tVar.q0() || !this.G) {
            Pair<? extends n9f<T>, ? extends T> pairInvoke = this.E.invoke(new jxo((((long) yVarD0.b) & 4294967295L) | (((long) yVarD0.a) << 32)), new kxa(j));
            ((i20<T>) this.D).g((n9f) pairInvoke.a, pairInvoke.b);
        }
        this.G = tVar.q0() || this.G;
        return t.z1(tVar, yVarD0.a, yVarD0.b, new Function1() { // from class: s9f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y.a aVar = (y.a) obj;
                boolean zQ0 = tVar.q0();
                t9f t9fVar = this;
                i20<T> i20Var = t9fVar.D;
                float fD = zQ0 ? i20Var.b().d(t9fVar.D.i.getValue()) : i20Var.e();
                float f = (pkd.f(t9fVar).O == asr.b && t9fVar.F == i3z.b) ? -1.0f : 1.0f;
                i3z i3zVar = t9fVar.F;
                float f2 = i3zVar == i3z.b ? f * fD : 0.0f;
                if (i3zVar != i3z.a) {
                    fD = 0.0f;
                }
                aVar.a = true;
                aVar.s(yVarD0, ycv.b(f2), ycv.b(fD), 0.0f);
                Unit unit = Unit.a;
                aVar.a = false;
                return Unit.a;
            }
        });
    }

    @Override // androidx.compose.ui.d.c
    public final void i2() {
        this.G = false;
    }
}
