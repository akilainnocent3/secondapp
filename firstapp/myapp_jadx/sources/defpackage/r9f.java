package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class r9f<T> extends d.c implements psr {
    public c20<T> D;
    public Function2<? super jxo, ? super kxa, ? extends Pair<? extends m9f<T>, ? extends T>> E;
    public i3z F;
    public boolean G;

    public r9f() {
        throw null;
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
    @Override // defpackage.psr
    public final biv e(final t tVar, vhv vhvVar, long j) {
        final y yVarD0 = vhvVar.d0(j);
        if (!tVar.q0() || !this.G) {
            Pair<? extends m9f<T>, ? extends T> pairInvoke = this.E.invoke(new jxo((((long) yVarD0.b) & 4294967295L) | (((long) yVarD0.a) << 32)), new kxa(j));
            c20 c20Var = (c20<T>) this.D;
            m9f m9fVar = (m9f) pairInvoke.a;
            B b = pairInvoke.b;
            if (!Intrinsics.g(c20Var.e(), m9fVar)) {
                ((x5a0) c20Var.m).setValue(m9fVar);
                tuw tuwVar = c20Var.e.b;
                boolean zG = tuwVar.g();
                if (zG) {
                    try {
                        h20 h20Var = c20Var.n;
                        float fD = c20Var.e().d(b);
                        if (!Float.isNaN(fD)) {
                            h20Var.a(fD, 0.0f);
                            c20Var.i(null);
                        }
                        c20Var.h(b);
                        Unit unit = Unit.a;
                        tuwVar.f(null);
                    } catch (Throwable th) {
                        tuwVar.f(null);
                        throw th;
                    }
                }
                if (!zG) {
                    c20Var.i(b);
                }
            }
        }
        this.G = tVar.q0() || this.G;
        return t.z1(tVar, yVarD0.a, yVarD0.b, new Function1() { // from class: q9f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y.a aVar = (y.a) obj;
                boolean zQ0 = tVar.q0();
                r9f r9fVar = this;
                c20<T> c20Var2 = r9fVar.D;
                float fD2 = zQ0 ? c20Var2.e().d(r9fVar.D.h.getValue()) : c20Var2.g();
                i3z i3zVar = r9fVar.F;
                float f = i3zVar == i3z.b ? fD2 : 0.0f;
                if (i3zVar != i3z.a) {
                    fD2 = 0.0f;
                }
                aVar.a = true;
                aVar.s(yVarD0, ycv.b(f), ycv.b(fD2), 0.0f);
                Unit unit2 = Unit.a;
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
