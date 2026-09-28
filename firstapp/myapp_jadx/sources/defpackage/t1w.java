package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t1w implements Function2<a, Integer, Unit> {
    public final /* synthetic */ Function2<a, Integer, g8j0> a;
    public final /* synthetic */ wd0<Float, ij0> b;
    public final /* synthetic */ j590 c;
    public final /* synthetic */ Function2<a, Integer, Unit> d;
    public final /* synthetic */ op8 e;
    public final /* synthetic */ Function0<Unit> f;
    public final /* synthetic */ v5b i;
    public final /* synthetic */ boolean v;

    public t1w(Function2 function2, wd0 wd0Var, j590 j590Var, Function2 function3, op8 op8Var, Function0 function0, v5b v5bVar, boolean z) {
        this.a = function2;
        this.b = wd0Var;
        this.c = j590Var;
        this.d = function3;
        this.e = op8Var;
        this.f = function0;
        this.i = v5bVar;
        this.v = z;
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
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            d dVarA = u8j0.a(j.g(d.a.b, 1.0f), this.a.invoke(aVar2, 0));
            final wd0<Float, ij0> wd0Var = this.b;
            boolean zA = aVar2.A(wd0Var);
            Object objY = aVar2.y();
            if (zA || objY == a.C0041a.a) {
                objY = new Function1() { // from class: j1w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        a7l a7lVar = (a7l) obj;
                        float fFloatValue = ((Number) wd0Var.d()).floatValue();
                        float fE = v1w.e(a7lVar, fFloatValue);
                        float f = v1w.f(a7lVar, fFloatValue);
                        a7lVar.v(f == 0.0f ? 1.0f : fE / f);
                        a7lVar.z0(v1w.a);
                        return Unit.a;
                    }
                };
                aVar2.r(objY);
            }
            d dVarA2 = androidx.compose.ui.graphics.a.a(dVarA, (Function1) objY);
            j590 j590Var = this.c;
            d dVarA3 = androidx.compose.ui.graphics.a.a(dVarA2, new j55(j590Var));
            i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
            int I = aVar2.I();
            ne00 ne00VarO = aVar2.o();
            d dVarC = c.c(aVar2, dVarA3);
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
            hlh0.a(aVar2, i78VarA, yka.a.f);
            hlh0.a(aVar2, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(I))) {
                j3c.a(I, aVar2, I, c1350a);
            }
            hlh0.a(aVar2, dVarC, yka.a.d);
            Function2<a, Integer, Unit> function2 = this.d;
            if (function2 != null) {
                aVar2.N(1352934765);
                b590.a(54, pp8.b(2000500644, new s1w(j590Var, this.f, this.i, this.v, xae0.a(R.string.m3c_bottom_sheet_dismiss_description, aVar2), xae0.a(R.string.m3c_bottom_sheet_expand_description, aVar2), xae0.a(R.string.m3c_bottom_sheet_collapse_description, aVar2), function2), aVar2), aVar2);
                aVar2.H();
            } else {
                aVar2.N(1356009965);
                aVar2.H();
            }
            this.e.invoke(l78.a, aVar2, 6);
            aVar2.s();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
