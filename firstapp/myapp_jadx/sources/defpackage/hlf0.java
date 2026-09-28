package defpackage;

import androidx.compose.foundation.f;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.d;
import hlf0.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hlf0 {
    public final ytw a = m.b(null);
    public nk0 b;
    public final SnapshotStateList<Function1<ndf0, Unit>> c;

    @c0d(c = "androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$3$1", f = "TextLinkScope.kt", l = {247}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ wfs b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wfs wfsVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = wfsVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return Unit.a;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            this.a = 1;
            wfs wfsVar = this.b;
            wfsVar.getClass();
            wfsVar.a.b().collect(new vfs(new etw((Object) null), wfsVar), this);
            return y5bVar;
        }
    }

    public static final class b implements tse {
        public final /* synthetic */ Function1 b;

        public b(Function1 function1) {
            this.b = function1;
        }

        @Override // defpackage.tse
        public final void dispose() {
            hlf0.this.c.remove(this.b);
        }
    }

    public hlf0(nk0 nk0Var) {
        alf0 alf0Var = new alf0();
        nk0Var.getClass();
        nk0.b bVar = new nk0.b(nk0Var);
        ArrayList arrayList = bVar.c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) alf0Var.invoke(((nk0.b.a) arrayList.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                nk0.d dVar = (nk0.d) list.get(i2);
                arrayList3.add(new nk0.b.a(dVar.a, dVar.d, dVar.b, dVar.c));
            }
            p48.w(arrayList3, arrayList2);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.b = bVar.m();
        this.c = new SnapshotStateList<>();
    }

    public static nk0.d c(nk0.d dVar, ukf0 ukf0Var) {
        zjw zjwVar = ukf0Var.b;
        int iC = zjwVar.c(zjwVar.f - 1, false);
        if (dVar.b < iC) {
            return nk0.d.a(dVar, null, Math.min(dVar.c, iC), 11);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(1154651354);
        char c = 2;
        int i2 = (bVarI.A(this) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            final lmh0 lmh0Var = (lmh0) bVarI.O(kna.r);
            nk0 nk0Var = this.b;
            List listA = nk0Var.a(nk0Var.b.length());
            int size = listA.size();
            int i3 = 0;
            while (i3 < size) {
                final nk0.d dVar = (nk0.d) listA.get(i3);
                int i4 = dVar.b;
                T t = dVar.a;
                if (i4 != dVar.c) {
                    bVarI.N(725478935);
                    Object objY = bVarI.y();
                    androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (objY == c0042a) {
                        objY = rzk.a(bVarI);
                    }
                    psw pswVar = (psw) objY;
                    d dVarA = androidx.compose.ui.graphics.a.a(d.a.b, new Function1() { // from class: elf0
                        /* JADX WARN: Code duplicated, block: B:10:0x0023  */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ukf0 ukf0Var;
                            j90 j90VarK;
                            tkf0 tkf0Var;
                            a7l a7lVar = (a7l) obj;
                            hlf0 hlf0Var = this.a;
                            nk0 nk0Var2 = hlf0Var.b;
                            ytw ytwVar = hlf0Var.a;
                            ukf0 ukf0Var2 = (ukf0) ((x5a0) ytwVar).getValue();
                            if (Intrinsics.g(nk0Var2, (ukf0Var2 == null || (tkf0Var = ukf0Var2.a) == null) ? null : tkf0Var.a) && (ukf0Var = (ukf0) ((x5a0) ytwVar).getValue()) != null) {
                                zjw zjwVar = ukf0Var.b;
                                nk0.d dVarC = hlf0.c(dVar, ukf0Var);
                                if (dVarC == null) {
                                    j90VarK = null;
                                } else {
                                    int i5 = dVarC.c;
                                    int i6 = dVarC.b;
                                    j90VarK = ukf0Var.k(i6, i5);
                                    lk40 lk40VarB = ukf0Var.b(i6);
                                    int i7 = i5 - 1;
                                    j90VarK.k(((((long) Float.floatToRawIntBits(lk40VarB.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(zjwVar.d(i6) == zjwVar.d(i7) ? Math.min(ukf0Var.b(i7).a, lk40VarB.a) : 0.0f)) << 32)) ^ (-9223372034707292160L));
                                }
                            } else {
                                j90VarK = null;
                            }
                            ilf0 ilf0Var = j90VarK != null ? new ilf0(j90VarK) : null;
                            if (ilf0Var != null) {
                                a7lVar.A1(ilf0Var);
                                a7lVar.l(true);
                            }
                            return Unit.a;
                        }
                    });
                    Object objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new blf0();
                        bVarI.r(objY2);
                    }
                    d dVarA2 = f.a(xa80.b(dVarA, false, (Function1) objY2).n(new xlf0(new ykf0(this, dVar))), pswVar);
                    g020.a.getClass();
                    d dVarC = h020.c(dVarA2, j020.c);
                    boolean zA = bVarI.A(this) | bVarI.M(dVar) | bVarI.A(lmh0Var);
                    Object objY3 = bVarI.y();
                    if (zA || objY3 == c0042a) {
                        objY3 = new Function0(this) { // from class: clf0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ufs ufsVar;
                                lmh0 lmh0Var2 = lmh0Var;
                                rfs rfsVar = (rfs) dVar.a;
                                if (rfsVar instanceof rfs.b) {
                                    ufs ufsVar2 = ((rfs.b) rfsVar).c;
                                    if (ufsVar2 != null) {
                                        ufsVar2.a(rfsVar);
                                    } else {
                                        try {
                                            lmh0Var2.a(((rfs.b) rfsVar).a);
                                        } catch (IllegalArgumentException unused) {
                                        }
                                    }
                                } else if ((rfsVar instanceof rfs.a) && (ufsVar = ((rfs.a) rfsVar).c) != null) {
                                    ufsVar.a(rfsVar);
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY3);
                    }
                    g75.a(androidx.compose.foundation.d.e(dVarC, pswVar, (Function0) objY3), bVarI, 0);
                    rfs rfsVar = (rfs) t;
                    jlf0 jlf0VarB = rfsVar.b();
                    if (jlf0VarB == null || (jlf0VarB.a == null && jlf0VarB.b == null && jlf0VarB.c == null && jlf0VarB.d == null)) {
                        bVarI.N(728331710);
                        bVarI.X(false);
                    } else {
                        bVarI.N(726303039);
                        Object objY4 = bVarI.y();
                        if (objY4 == c0042a) {
                            objY4 = new wfs(pswVar);
                            bVarI.r(objY4);
                        }
                        wfs wfsVar = (wfs) objY4;
                        Unit unit = Unit.a;
                        Object objY5 = bVarI.y();
                        if (objY5 == c0042a) {
                            objY5 = new a(wfsVar, null);
                            bVarI.r(objY5);
                        }
                        xvf.e(bVarI, unit, (Function2) objY5);
                        osw oswVar = wfsVar.b;
                        osw oswVar2 = wfsVar.b;
                        Boolean boolValueOf = Boolean.valueOf((((u5a0) oswVar).D() & 2) != 0);
                        Boolean boolValueOf2 = Boolean.valueOf((((u5a0) oswVar2).D() & 1) != 0);
                        Boolean boolValueOf3 = Boolean.valueOf((((u5a0) oswVar2).D() & 4) != 0);
                        jlf0 jlf0VarB2 = rfsVar.b();
                        ora0 ora0Var = jlf0VarB2 != null ? jlf0VarB2.a : null;
                        jlf0 jlf0VarB3 = rfsVar.b();
                        ora0 ora0Var2 = jlf0VarB3 != null ? jlf0VarB3.b : null;
                        jlf0 jlf0VarB4 = rfsVar.b();
                        ora0 ora0Var3 = jlf0VarB4 != null ? jlf0VarB4.c : null;
                        jlf0 jlf0VarB5 = rfsVar.b();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, ora0Var, ora0Var2, ora0Var3, jlf0VarB5 != null ? jlf0VarB5.d : null};
                        boolean zA2 = bVarI.A(this) | bVarI.M(dVar);
                        Object objY6 = bVarI.y();
                        if (zA2 || objY6 == c0042a) {
                            objY6 = new rdz(this, dVar, wfsVar);
                            bVarI.r(objY6);
                        }
                        b(objArr, (Function1) objY6, bVarI, (i2 << 6) & 896);
                        bVarI.X(false);
                    }
                    bVarI.X(false);
                } else {
                    bVarI.N(728345598);
                    bVarI.X(false);
                }
                i3++;
                c = c;
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new z9q(this, i);
        }
    }

    public final void b(final Object[] objArr, final Function1<? super ndf0, Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-2083052099);
        int i2 = (i & 48) == 0 ? (bVarI.A(function1) ? 32 : 16) | i : i;
        if ((i & 384) == 0) {
            i2 |= bVarI.A(this) ? 256 : 128;
        }
        bVarI.C(-358305778, Integer.valueOf(objArr.length));
        int i3 = i2 | (bVarI.d(objArr.length) ? 4 : 0);
        for (Object obj : objArr) {
            i3 |= bVarI.A(obj) ? 4 : 0;
        }
        bVarI.X(false);
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            q8a0 q8a0Var = new q8a0();
            ArrayList arrayList = (ArrayList) q8a0Var.a;
            arrayList.add(function1);
            q8a0Var.a(objArr);
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zA = bVarI.A(this) | ((i3 & 112) == 32);
            Object objY = bVarI.y();
            if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: flf0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        hlf0 hlf0Var = this.a;
                        SnapshotStateList<Function1<ndf0, Unit>> snapshotStateList = hlf0Var.c;
                        Function1<ndf0, Unit> function2 = function1;
                        snapshotStateList.add(function2);
                        return hlf0Var.new b(function2);
                    }
                };
                bVarI.r(objY);
            }
            xvf.d(array, (Function1) objY, bVarI);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: glf0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(i | 1);
                    this.a.b(objArr, function1, (a) obj2, iA);
                    return Unit.a;
                }
            };
        }
    }
}
