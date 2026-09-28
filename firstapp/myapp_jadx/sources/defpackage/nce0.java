package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class nce0 {
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
    public static final void a(final g01 g01Var, final d dVar, final Function1 function1, final ht htVar, d0b d0bVar, a aVar, final int i, final int i2) {
        int i3;
        final d0b d0bVar2;
        b bVar;
        b bVarI = aVar.i(-205779950);
        int i4 = i | (bVarI.M(g01Var) ? 4 : 2) | (bVarI.A(function1) ? 2048 : 1024) | (bVarI.A(null) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.M(htVar) ? 131072 : 65536) | (bVarI.c(1.0f) ? 8388608 : 4194304) | (bVarI.M(null) ? 67108864 : 33554432) | (bVarI.d(1) ? 536870912 : 268435456);
        if ((i2 & 6) == 0) {
            i3 = i2 | (bVarI.b(true) ? 4 : 2);
        } else {
            i3 = i2;
        }
        int i5 = i2 & 48;
        op8 op8Var = hq9.a;
        if (i5 == 0) {
            i3 |= bVarI.A(op8Var) ? 32 : 16;
        }
        if (bVarI.q(i4 & 1, ((306783379 & i4) == 306783378 && (i3 & 19) == 18) ? false : true)) {
            nan nanVarD = qsh0.d(g01Var.a, d0bVar, bVarI, 48);
            int i6 = ((i4 >> 3) & 8064) | 24576;
            int i7 = i4 >> 12;
            final b01 b01VarA = c01.a(nanVarD, g01Var.c, function1, d0bVar, bVarI, (458752 & i7) | i6);
            d0bVar2 = d0bVar;
            final hx90 hx90Var = nanVarD.q;
            if (hx90Var instanceof qxa) {
                bVarI.N(-1470550590);
                q75.a(dVar, htVar, true, pp8.b(-374957172, new gaj() { // from class: lce0
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        r75 r75Var = (r75) obj;
                        a aVar2 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                        }
                        if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                            ((qxa) hx90Var).z(r75Var.c());
                            hq9.a.invoke(new la40(r75Var, b01VarA, htVar, d0bVar2), aVar2, 0);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, (i7 & 112) | 3462, 0);
                b bVar2 = bVarI;
                bVar2.X(false);
                bVar = bVar2;
            } else {
                bVarI.N(-1471239317);
                aiv aivVarC = g75.c(htVar, true);
                int I = bVarI.I();
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVar);
                yka.k.getClass();
                tsr.a aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I))) {
                    n30.a(I, bVarI, I, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                op8Var.invoke(new la40(androidx.compose.foundation.layout.d.a, b01VarA, htVar, d0bVar2), bVarI, Integer.valueOf(i3 & 112));
                bVarI.X(true);
                bVarI.X(false);
                bVar = bVarI;
            }
        } else {
            d0bVar2 = d0bVar;
            bVarI.G();
            bVar = bVarI;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final d0b d0bVar3 = d0bVar2;
            eVarZ.d = new Function2(dVar, function1, htVar, d0bVar3, i, i2) { // from class: mce0
                public final /* synthetic */ d b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ ht d;
                public final /* synthetic */ d0b e;
                public final /* synthetic */ int f;

                {
                    this.f = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nce0.a(this.a, this.b, this.c, this.d, this.e, (a) obj, qj40.a(1573297), qj40.a(this.f));
                    return Unit.a;
                }
            };
        }
    }
}
