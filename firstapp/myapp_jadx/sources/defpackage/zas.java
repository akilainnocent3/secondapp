package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class zas {

    public static final class a implements tse {
        public final /* synthetic */ ibs a;
        public final /* synthetic */ was b;
        public final /* synthetic */ dq40 c;

        public a(ibs ibsVar, was wasVar, dq40 dq40Var) {
            this.a = ibsVar;
            this.b = wasVar;
            this.c = dq40Var;
        }

        @Override // defpackage.tse
        public final void dispose() {
            this.a.getLifecycle().d(this.b);
            jbs jbsVar = (jbs) this.c.a;
            if (jbsVar != null) {
                jbsVar.a();
            }
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[s9s.a.values().length];
            try {
                iArr[s9s.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s9s.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s9s.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s9s.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public static final void a(final j8i0 j8i0Var, final Boolean bool, ibs ibsVar, final Function1 function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(752680142);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(j8i0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(bool) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                ibsVar = (ibs) bVarI.O(ndt.a);
            } else {
                bVarI.G();
            }
            int i3 = i2 & (-897);
            bVarI.Y();
            boolean zM = bVarI.M(j8i0Var) | bVarI.M(bool) | bVarI.M(ibsVar);
            Object objY = bVarI.y();
            if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new obs(ibsVar.getLifecycle());
                bVarI.r(objY);
            }
            c(ibsVar, (obs) objY, function1, bVarI, (i3 >> 3) & 896);
        } else {
            bVarI.G();
        }
        final ibs ibsVar2 = ibsVar;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ras
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    zas.a(j8i0Var, bool, ibsVar2, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final Object obj, final ibs ibsVar, final Function1 function1, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(1220373486);
        int i2 = (bVarI.A(obj) ? 4 : 2) | i | 16 | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                ibsVar = (ibs) bVarI.O(ndt.a);
            } else {
                bVarI.G();
            }
            int i3 = i2 & (-113);
            bVarI.Y();
            boolean zM = bVarI.M(obj) | bVarI.M(ibsVar);
            Object objY = bVarI.y();
            if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new obs(ibsVar.getLifecycle());
                bVarI.r(objY);
            }
            c(ibsVar, (obs) objY, function1, bVarI, i3 & 896);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: tas
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(i | 1);
                    zas.b(obj, ibsVar, function1, (a) obj2, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final ibs ibsVar, final obs obsVar, final Function1<? super obs, ? extends jbs> function1, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(912823238);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(ibsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(obsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            boolean zA = bVarI.A(obsVar) | ((i2 & 896) == 256) | bVarI.A(ibsVar);
            Object objY = bVarI.y();
            if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: uas
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v0, types: [hbs, was] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        final dq40 dq40Var = new dq40();
                        final obs obsVar2 = obsVar;
                        final Function1 function2 = function1;
                        ?? r0 = new cbs() { // from class: was
                            /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
                            @Override // defpackage.cbs
                            public final void F0(ibs ibsVar2, s9s.a aVar2) {
                                int i3 = zas.b.a[aVar2.ordinal()];
                                dq40 dq40Var2 = dq40Var;
                                if (i3 == 3) {
                                    dq40Var2.a = function2.invoke(obsVar2);
                                } else {
                                    if (i3 != 4) {
                                        return;
                                    }
                                    jbs jbsVar = (jbs) dq40Var2.a;
                                    if (jbsVar != null) {
                                        jbsVar.a();
                                    }
                                    dq40Var2.a = null;
                                }
                            }
                        };
                        ibs ibsVar2 = ibsVar;
                        ibsVar2.getLifecycle().a(r0);
                        return new zas.a(ibsVar2, r0, dq40Var);
                    }
                };
                bVarI.r(objY);
            }
            xvf.a(ibsVar, obsVar, (Function1) objY, bVarI);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: vas
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    zas.c(ibsVar, obsVar, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
