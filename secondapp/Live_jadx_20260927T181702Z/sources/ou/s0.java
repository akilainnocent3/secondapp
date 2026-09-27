package ou;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@kotlin.jvm.internal.s1({"SMAP\nSpecialTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpecialTypes.kt\norg/jetbrains/kotlin/types/SpecialTypesKt\n+ 2 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,216:1\n102#2,2:217\n104#2,5:222\n112#2,7:228\n1549#3:219\n1620#3,2:220\n1622#3:227\n*S KotlinDebug\n*F\n+ 1 SpecialTypes.kt\norg/jetbrains/kotlin/types/SpecialTypesKt\n*L\n214#1:217,2\n214#1:222,5\n214#1:228,7\n214#1:219\n214#1:220,2\n214#1:227\n*E\n"})
public final class s0 {
    @oy.m
    public static final a a(@oy.l g0 g0Var) {
        kotlin.jvm.internal.m0.p(g0Var, "<this>");
        v1 v1VarL0 = g0Var.L0();
        if (v1VarL0 instanceof a) {
            return (a) v1VarL0;
        }
        return null;
    }

    @oy.m
    public static final o0 b(@oy.l g0 g0Var) {
        kotlin.jvm.internal.m0.p(g0Var, "<this>");
        a aVarA = a(g0Var);
        if (aVarA != null) {
            return aVarA.U0();
        }
        return null;
    }

    public static final boolean c(@oy.l g0 g0Var) {
        kotlin.jvm.internal.m0.p(g0Var, "<this>");
        return g0Var.L0() instanceof p;
    }

    public static final f0 d(f0 f0Var) {
        g0 g0Var;
        Collection<g0> collectionI = f0Var.i();
        ArrayList arrayList = new ArrayList(fr.i0.d0(collectionI, 10));
        Iterator<T> it = collectionI.iterator();
        boolean z10 = false;
        while (true) {
            g0Var = null;
            if (!it.hasNext()) {
                break;
            }
            g0 g0VarF = (g0) it.next();
            if (s1.l(g0VarF)) {
                g0VarF = f(g0VarF.L0(), false, 1, null);
                z10 = true;
            }
            arrayList.add(g0VarF);
        }
        if (!z10) {
            return null;
        }
        g0 g0VarE = f0Var.e();
        if (g0VarE != null) {
            if (s1.l(g0VarE)) {
                g0VarE = f(g0VarE.L0(), false, 1, null);
            }
            g0Var = g0VarE;
        }
        return new f0(arrayList).j(g0Var);
    }

    @oy.l
    public static final v1 e(@oy.l v1 v1Var, boolean z10) {
        kotlin.jvm.internal.m0.p(v1Var, "<this>");
        p pVarC = p.a.c(p.f119785e, v1Var, z10, false, 4, null);
        if (pVarC != null) {
            return pVarC;
        }
        o0 o0VarG = g(v1Var);
        return o0VarG != null ? o0VarG : v1Var.P0(false);
    }

    public static /* synthetic */ v1 f(v1 v1Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return e(v1Var, z10);
    }

    public static final o0 g(g0 g0Var) {
        f0 f0VarD;
        g1 g1VarI0 = g0Var.I0();
        f0 f0Var = g1VarI0 instanceof f0 ? (f0) g1VarI0 : null;
        if (f0Var == null || (f0VarD = d(f0Var)) == null) {
            return null;
        }
        return f0VarD.d();
    }

    @oy.l
    public static final o0 h(@oy.l o0 o0Var, boolean z10) {
        kotlin.jvm.internal.m0.p(o0Var, "<this>");
        p pVarC = p.a.c(p.f119785e, o0Var, z10, false, 4, null);
        if (pVarC != null) {
            return pVarC;
        }
        o0 o0VarG = g(o0Var);
        return o0VarG == null ? o0Var.P0(false) : o0VarG;
    }

    public static /* synthetic */ o0 i(o0 o0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return h(o0Var, z10);
    }

    @oy.l
    public static final o0 j(@oy.l o0 o0Var, @oy.l o0 abbreviatedType) {
        kotlin.jvm.internal.m0.p(o0Var, "<this>");
        kotlin.jvm.internal.m0.p(abbreviatedType, "abbreviatedType");
        return i0.a(o0Var) ? o0Var : new a(o0Var, abbreviatedType);
    }

    @oy.l
    public static final pu.i k(@oy.l pu.i iVar) {
        kotlin.jvm.internal.m0.p(iVar, "<this>");
        return new pu.i(iVar.R0(), iVar.I0(), iVar.T0(), iVar.H0(), iVar.J0(), true);
    }
}
