package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.d;
import androidx.compose.runtime.e;
import androidx.compose.runtime.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hna {
    /* JADX WARN: Code duplicated, block: B:46:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
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
    public static final void a(final j730<?> j730Var, final Function2<? super a, ? super Integer, Unit> function2, a aVar, final int i) {
        avh0 avh0Var;
        boolean z;
        e eVarZ;
        b bVarI = aVar.i(-149765515);
        lxo lxoVar = bVarI.x;
        ne00 ne00VarS = bVarI.S();
        bVarI.B0(201, c.b);
        Object objY = bVarI.y();
        if (Intrinsics.g(objY, a.C0041a.a)) {
            avh0Var = null;
        } else {
            objY.getClass();
            avh0Var = (avh0) objY;
        }
        d dVar = j730Var.a;
        avh0 avh0VarC = dVar.c(j730Var, avh0Var);
        boolean zEquals = avh0VarC.equals(avh0Var);
        if (!zEquals) {
            bVarI.r(avh0VarC);
        }
        if (!bVarI.S) {
            f fVar = bVarI.G;
            Object objB = fVar.b(fVar.b, fVar.g);
            objB.getClass();
            ne00 ne00Var = (ne00) objB;
            if (!(bVarI.j() && zEquals) && (j730Var.f || !ne00VarS.containsKey(dVar))) {
                ne00VarS = ne00VarS.C(dVar, avh0VarC);
            } else if ((zEquals && !bVarI.w) || !bVarI.w) {
                ne00VarS = ne00Var;
            }
            if (bVarI.y || ne00Var != ne00VarS) {
                z = true;
            }
            if (z && !bVarI.S) {
                bVarI.r0(ne00VarS);
            }
            lxoVar.c(bVarI.w ? 1 : 0);
            bVarI.w = z;
            bVarI.K = ne00VarS;
            bVarI.z0(c.c, 202, 0, ne00VarS);
            function2.invoke(bVarI, Integer.valueOf((i >> 3) & 14));
            bVarI.X(false);
            bVarI.X(false);
            bVarI.w = lxoVar.b() != 0;
            bVarI.K = null;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: bna
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).intValue();
                        int iA = qj40.a(i | 1);
                        hna.a(j730Var, function2, (a) obj, iA);
                        return Unit.a;
                    }
                };
            }
        }
        if (j730Var.f || !ne00VarS.containsKey(dVar)) {
            ne00VarS = ne00VarS.C(dVar, avh0VarC);
        }
        bVarI.J = true;
        z = false;
        if (z) {
            bVarI.r0(ne00VarS);
        }
        lxoVar.c(bVarI.w ? 1 : 0);
        bVarI.w = z;
        bVarI.K = ne00VarS;
        bVarI.z0(c.c, 202, 0, ne00VarS);
        function2.invoke(bVarI, Integer.valueOf((i >> 3) & 14));
        bVarI.X(false);
        bVarI.X(false);
        bVarI.w = lxoVar.b() != 0;
        bVarI.K = null;
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: bna
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    hna.a(j730Var, function2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00da  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
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
    public static final void b(final j730<?>[] j730VarArr, final Function2<? super a, ? super Integer, Unit> function2, a aVar, final int i) {
        me00 me00VarBuild;
        boolean z;
        e eVarZ;
        b bVarI = aVar.i(415205898);
        lxo lxoVar = bVarI.x;
        ne00 ne00VarS = bVarI.S();
        bVarI.B0(201, c.b);
        boolean z2 = bVarI.S;
        qxy qxyVar = c.d;
        if (z2) {
            ne00 ne00VarB = jna.b(j730VarArr, ne00VarS, me00.i);
            me00.a aVarBuilder = ne00VarS.builder();
            aVarBuilder.putAll(ne00VarB);
            me00VarBuild = aVarBuilder.build();
            bVarI.B0(204, qxyVar);
            bVarI.l0();
            bVarI.I0(me00VarBuild);
            bVarI.l0();
            bVarI.I0(ne00VarB);
            bVarI.X(false);
            bVarI.J = true;
        } else {
            f fVar = bVarI.G;
            Object objH = fVar.h(fVar.g, 0);
            objH.getClass();
            Object obj = (ne00) objH;
            f fVar2 = bVarI.G;
            Object objH2 = fVar2.h(fVar2.g, 1);
            objH2.getClass();
            ne00 ne00Var = (ne00) objH2;
            ne00 ne00VarB2 = jna.b(j730VarArr, ne00VarS, ne00Var);
            if (!bVarI.j() || bVarI.y || !ne00Var.equals(ne00VarB2)) {
                me00.a aVarBuilder2 = ne00VarS.builder();
                aVarBuilder2.putAll(ne00VarB2);
                me00VarBuild = aVarBuilder2.build();
                bVarI.B0(204, qxyVar);
                bVarI.l0();
                bVarI.I0(me00VarBuild);
                bVarI.l0();
                bVarI.I0(ne00VarB2);
                bVarI.X(false);
                if (bVarI.y || !me00VarBuild.equals(obj)) {
                    z = true;
                }
                if (z && !bVarI.S) {
                    bVarI.r0(me00VarBuild);
                }
                lxoVar.c(bVarI.w ? 1 : 0);
                bVarI.w = z;
                bVarI.K = me00VarBuild;
                bVarI.z0(c.c, 202, 0, me00VarBuild);
                function2.invoke(bVarI, Integer.valueOf((i >> 3) & 14));
                bVarI.X(false);
                bVarI.X(false);
                bVarI.w = lxoVar.b() != 0;
                bVarI.K = null;
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: dna
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int iA = qj40.a(i | 1);
                            hna.b(j730VarArr, function2, (a) obj2, iA);
                            return Unit.a;
                        }
                    };
                }
            }
            bVarI.l = bVarI.G.s() + bVarI.l;
            me00VarBuild = obj;
        }
        z = false;
        if (z) {
            bVarI.r0(me00VarBuild);
        }
        lxoVar.c(bVarI.w ? 1 : 0);
        bVarI.w = z;
        bVarI.K = me00VarBuild;
        bVarI.z0(c.c, 202, 0, me00VarBuild);
        function2.invoke(bVarI, Integer.valueOf((i >> 3) & 14));
        bVarI.X(false);
        bVarI.X(false);
        bVarI.w = lxoVar.b() != 0;
        bVarI.K = null;
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: dna
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(i | 1);
                    hna.b(j730VarArr, function2, (a) obj2, iA);
                    return Unit.a;
                }
            };
        }
    }
}
