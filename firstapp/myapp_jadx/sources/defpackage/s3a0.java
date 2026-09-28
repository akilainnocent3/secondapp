package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s3a0 {

    @c0d(c = "androidx.compose.material3.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", l = {231}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ j3a0 b;
        public final /* synthetic */ n6 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j3a0 j3a0Var, n6 n6Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = j3a0Var;
            this.c = n6Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            long jA;
            y5b y5bVar = y5b.a;
            int i = this.a;
            j3a0 j3a0Var = this.b;
            if (i == 0) {
                uj50.b(obj);
                if (j3a0Var != null) {
                    k3a0 duration = j3a0Var.a().getDuration();
                    boolean z = j3a0Var.a().a() != null;
                    int iOrdinal = duration.ordinal();
                    if (iOrdinal == 0) {
                        jA = 4000;
                    } else if (iOrdinal == 1) {
                        jA = 10000;
                    } else {
                        if (iOrdinal != 2) {
                            uhc.a();
                            return null;
                        }
                        jA = Long.MAX_VALUE;
                    }
                    n6 n6Var = this.c;
                    if (n6Var != null) {
                        jA = n6Var.a(jA, z);
                    }
                    this.a = 1;
                    if (hkd.b(jA, this) == y5bVar) {
                        return y5bVar;
                    }
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            j3a0Var.dismiss();
            return Unit.a;
        }
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
    public static final void a(final j3a0 j3a0Var, final d dVar, final gaj gajVar, androidx.compose.runtime.a aVar, final int i) {
        b bVarI = aVar.i(-977568115);
        int i2 = (i & 6) == 0 ? (bVarI.M(j3a0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(gajVar) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            String strA = xae0.a(R.string.m3c_snackbar_pane_title, bVarI);
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new s8h();
                bVarI.r(objY);
            }
            s8h s8hVar = (s8h) objY;
            Object obj = s8hVar.a;
            ArrayList arrayList = s8hVar.b;
            if (Intrinsics.g(j3a0Var, obj)) {
                bVarI.N(1443908949);
                bVarI.X(false);
            } else {
                bVarI.N(1154891761);
                s8hVar.a = j3a0Var;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add((j3a0) ((r8h) arrayList.get(i3)).a);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(j3a0Var)) {
                    arrayList3.add(j3a0Var);
                }
                arrayList.clear();
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Object obj2 = arrayList3.get(i4);
                    if (obj2 != null) {
                        arrayList4.add(obj2);
                    }
                }
                int size3 = arrayList4.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    j3a0 j3a0Var2 = (j3a0) arrayList4.get(i5);
                    arrayList.add(new r8h(j3a0Var2, pp8.b(-1952400805, new q3a0(j3a0Var2, j3a0Var, s8hVar, strA), bVarI)));
                }
                bVarI.X(false);
            }
            aiv aivVarC = g75.c(ht.a.a, false);
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
            e eVarV = bVarI.v();
            if (eVarV == null) {
                ib5.a("no recompose scope found");
                return;
            }
            bVarI.E(eVarV);
            s8hVar.c = eVarV;
            bVarI.N(-1888182177);
            int size4 = arrayList.size();
            for (int i6 = 0; i6 < size4; i6++) {
                r8h r8hVar = (r8h) arrayList.get(i6);
                j3a0 j3a0Var3 = (j3a0) r8hVar.a;
                op8 op8Var = r8hVar.b;
                bVarI.C(1325010085, j3a0Var3);
                op8Var.invoke(pp8.b(-1893791890, new r3a0(gajVar, j3a0Var3), bVarI), bVarI, 6);
                bVarI.X(false);
            }
            bVarI.X(false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: m3a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iA = qj40.a(i | 1);
                    s3a0.a(j3a0Var, dVar, gajVar, (a) obj3, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final v3a0 v3a0Var, d dVar, gaj<? super j3a0, ? super androidx.compose.runtime.a, ? super Integer, Unit> gajVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        b bVarI = aVar.i(-1077081618);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(v3a0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bVarI.M(dVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bVarI.A(gajVar) ? 256 : 128;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                dVar = d.a.b;
            }
            if (i5 != 0) {
                gajVar = yp9.a;
            }
            j3a0 j3a0Var = (j3a0) ((x5a0) v3a0Var.b).getValue();
            n6 n6Var = (n6) bVarI.O(kna.a);
            boolean zM = bVarI.M(j3a0Var) | bVarI.A(n6Var);
            Object objY = bVarI.y();
            if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new a(j3a0Var, n6Var, null);
                bVarI.r(objY);
            }
            xvf.e(bVarI, j3a0Var, (Function2) objY);
            a((j3a0) ((x5a0) v3a0Var.b).getValue(), dVar, gajVar, bVarI, i3 & 1008);
        } else {
            bVarI.G();
        }
        final d dVar2 = dVar;
        final gaj<? super j3a0, ? super androidx.compose.runtime.a, ? super Integer, Unit> gajVar2 = gajVar;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: l3a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s3a0.b(v3a0Var, dVar2, gajVar2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
