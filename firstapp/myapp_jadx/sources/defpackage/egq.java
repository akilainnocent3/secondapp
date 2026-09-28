package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class egq {
    public static final i060 a = j060.c(100.0f);
    public static final i060 b = j060.d(100.0f, 0.0f, 0.0f, 100.0f);
    public static final fkd0<Float> c = yi0.d(1.0f, 200.0f, null, 4);
    public static final float d = 4.0f;
    public static final float e = 32.0f;

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNGroupTabKt$AnimatedPillMask$1$1", f = "LNGroupTab.kt", l = {127, 128, 135, 140, 141, 146, 147, 149}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public dz00 a;
        public dz00 b;
        public int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ fz00 e;
        public final /* synthetic */ wd0<Float, ij0> f;
        public final /* synthetic */ wd0<Float, ij0> i;
        public final /* synthetic */ ytw<ez00> v;

        /* JADX INFO: renamed from: egq$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNGroupTabKt$AnimatedPillMask$1$1$1", f = "LNGroupTab.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0515a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ wd0<Float, ij0> b;
            public final /* synthetic */ wd0<Float, ij0> c;

            /* JADX INFO: renamed from: egq$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNGroupTabKt$AnimatedPillMask$1$1$1$1", f = "LNGroupTab.kt", l = {150}, m = "invokeSuspend", v = 2)
            public static final class C0516a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ wd0<Float, ij0> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0516a(wd0<Float, ij0> wd0Var, v1b<? super C0516a> v1bVar) {
                    super(2, v1bVar);
                    this.b = wd0Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C0516a(this.b, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((C0516a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    int i = this.a;
                    if (i == 0) {
                        uj50.b(obj);
                        Float f = new Float(0.0f);
                        fkd0<Float> fkd0Var = egq.c;
                        this.a = 1;
                        if (wd0.a(this.b, f, fkd0Var, null, null, this, 12) == y5bVar) {
                            return y5bVar;
                        }
                    } else {
                        if (i != 1) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uj50.b(obj);
                    }
                    return Unit.a;
                }
            }

            /* JADX INFO: renamed from: egq$a$a$b */
            @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNGroupTabKt$AnimatedPillMask$1$1$1$2", f = "LNGroupTab.kt", l = {151}, m = "invokeSuspend", v = 2)
            public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ wd0<Float, ij0> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(wd0<Float, ij0> wd0Var, v1b<? super b> v1bVar) {
                    super(2, v1bVar);
                    this.b = wd0Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new b(this.b, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    int i = this.a;
                    if (i == 0) {
                        uj50.b(obj);
                        Float f = new Float(0.0f);
                        fkd0<Float> fkd0Var = egq.c;
                        this.a = 1;
                        if (wd0.a(this.b, f, fkd0Var, null, null, this, 12) == y5bVar) {
                            return y5bVar;
                        }
                    } else {
                        if (i != 1) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uj50.b(obj);
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0515a(wd0<Float, ij0> wd0Var, wd0<Float, ij0> wd0Var2, v1b<? super C0515a> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
                this.c = wd0Var2;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0515a c0515a = new C0515a(this.b, this.c, v1bVar);
                c0515a.a = obj;
                return c0515a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0515a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                ej5.c(v5bVar, null, null, new C0516a(this.b, null), 3);
                ej5.c(v5bVar, null, null, new b(this.c, null), 3);
                return Unit.a;
            }
        }

        @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNGroupTabKt$AnimatedPillMask$1$1$targetInfo$2", f = "LNGroupTab.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class b extends tje0 implements Function2<dz00, v1b<? super Boolean>, Object> {
            public /* synthetic */ Object a;

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                b bVar = new b(2, v1bVar);
                bVar.a = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(dz00 dz00Var, v1b<? super Boolean> v1bVar) {
                return ((b) create(dz00Var, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                dz00 dz00Var = (dz00) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                return Boolean.valueOf(dz00Var != null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, fz00 fz00Var, wd0<Float, ij0> wd0Var, wd0<Float, ij0> wd0Var2, ytw<ez00> ytwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.d = i;
            this.e = fz00Var;
            this.f = wd0Var;
            this.i = wd0Var2;
            this.v = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.d, this.e, this.f, this.i, this.v, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0093  */
        /* JADX WARN: Code duplicated, block: B:31:0x0096  */
        /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:51:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:56:0x011b  */
        /* JADX WARN: Code duplicated, block: B:59:0x0138  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
        
            if (r3.f(r9, r10) == r0) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0115, code lost:
        
            if (defpackage.w5b.d(r10, r9) == r0) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0146, code lost:
        
            if (r3.f(r9, r10) == r0) goto L61;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 354
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: egq.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(final int i, ytw<ez00> ytwVar, androidx.compose.runtime.a aVar, final int i2) {
        final ytw<ez00> ytwVar2;
        e eVarZ;
        Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function2;
        Object aVar2;
        final fz00 fz00Var;
        wd0 wd0Var;
        wd0 wd0Var2;
        Integer num;
        b bVarI = aVar.i(1901817792);
        int i3 = (bVarI.d(i) ? 4 : 2) | i2;
        boolean z = true;
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = new fz00();
                bVarI.r(objY);
            }
            fz00 fz00Var2 = (fz00) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = ee0.a(0.0f);
                bVarI.r(objY2);
            }
            wd0 wd0Var3 = (wd0) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = ee0.a(0.0f);
                bVarI.r(objY3);
            }
            wd0 wd0Var4 = (wd0) objY3;
            Integer numValueOf = Integer.valueOf(i);
            boolean zA = ((i3 & 14) == 4) | bVarI.A(fz00Var2) | bVarI.A(wd0Var3) | bVarI.A(wd0Var4);
            Object objY4 = bVarI.y();
            if (zA || objY4 == c0042a) {
                fz00Var = fz00Var2;
                wd0Var = wd0Var3;
                wd0Var2 = wd0Var4;
                ytwVar2 = ytwVar;
                aVar2 = new a(i, fz00Var, wd0Var, wd0Var2, ytwVar2, null);
                bVarI.r(aVar2);
            } else {
                aVar2 = objY4;
                fz00Var = fz00Var2;
                wd0Var = wd0Var3;
                wd0Var2 = wd0Var4;
                ytwVar2 = ytwVar;
            }
            xvf.e(bVarI, numValueOf, (Function2) aVar2);
            dz00 dz00VarE = e(ytwVar2.getValue(), i);
            Float f = fz00Var.b;
            ytw ytwVar3 = fz00Var.a;
            final dz00 dz00Var = null;
            if (f != null) {
                float fFloatValue = f.floatValue();
                Float f2 = fz00Var.c;
                if (f2 != null) {
                    dz00Var = new dz00(fFloatValue, f2.floatValue());
                }
            }
            if (dz00VarE == null || ((Integer) ((x5a0) ytwVar3).getValue()) == null || ((num = (Integer) ((x5a0) ytwVar3).getValue()) != null && num.intValue() == i)) {
                z = false;
            }
            if (dz00VarE != null) {
                float fFloatValue2 = dz00VarE.b;
                float fFloatValue3 = dz00VarE.a;
                if (z) {
                    Float f3 = fz00Var.b;
                    if (f3 != null) {
                        fFloatValue3 = f3.floatValue();
                    }
                    Float f4 = fz00Var.c;
                    if (f4 != null) {
                        fFloatValue2 = f4.floatValue();
                    }
                    dz00Var = new dz00(fFloatValue3, fFloatValue2);
                } else {
                    float fFloatValue4 = ((Number) wd0Var.d()).floatValue() + fFloatValue3;
                    float fFloatValue5 = ((Number) wd0Var2.d()).floatValue() + fFloatValue2;
                    dz00Var = new dz00(fFloatValue4, fFloatValue5 >= 0.0f ? fFloatValue5 : 0.0f);
                }
            }
            if (dz00Var == null) {
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    function2 = new Function2(i, ytwVar2, i2) { // from class: xfq
                        public final /* synthetic */ int a;
                        public final /* synthetic */ ytw b;

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(49);
                            egq.a(this.a, this.b, (a) obj, iA);
                            return Unit.a;
                        }
                    };
                }
            } else {
                boolean zA2 = bVarI.A(fz00Var) | bVarI.M(dz00Var);
                Object objY5 = bVarI.y();
                if (zA2 || objY5 == c0042a) {
                    objY5 = new Function0() { // from class: yfq
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            dz00 dz00Var2 = dz00Var;
                            Float fValueOf = Float.valueOf(dz00Var2.a);
                            fz00 fz00Var3 = fz00Var;
                            fz00Var3.b = fValueOf;
                            fz00Var3.c = Float.valueOf(dz00Var2.b);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY5);
                }
                bVarI.t((Function0) objY5);
                mmd mmdVar = (mmd) bVarI.O(kna.h);
                final float fC1 = mmdVar.C1(d);
                boolean zC = bVarI.c(fC1) | bVarI.M(dz00Var);
                Object objY6 = bVarI.y();
                if (zC || objY6 == c0042a) {
                    objY6 = new Function1() { // from class: zfq
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ((mmd) obj).getClass();
                            float f5 = dz00Var.a;
                            float f6 = fC1;
                            int iB = ycv.b(f5 + f6);
                            return new iwo((((long) ycv.b(f6)) & 4294967295L) | (((long) iB) << 32));
                        }
                    };
                    bVarI.r(objY6);
                }
                g75.a(androidx.compose.foundation.a.b(ls7.a(j.i(j.w(g.b(d.a.b, (Function1) objY6), mmdVar.v1(dz00Var.b)), e), a), ((lib0) bVarI.O(oib0.a)).g1, zk40.a), bVarI, 0);
            }
            eVarZ.d = function2;
        }
        ytwVar2 = ytwVar;
        bVarI.G();
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            function2 = new Function2(i, ytwVar2, i2) { // from class: agq
                public final /* synthetic */ int a;
                public final /* synthetic */ ytw b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(49);
                    egq.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
            eVarZ.d = function2;
        }
    }

    public static final void b(final d dVar, final qcn qcnVar, final Function1 function1, androidx.compose.runtime.a aVar, final int i) {
        qcnVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(122050496);
        int i2 = (bVarI.M(qcnVar) ? 32 : 16) | i | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            Iterator<E> it = qcnVar.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                } else if (((usq) it.next()).c) {
                    break;
                } else {
                    i3++;
                }
            }
            zzr zzrVarA = e0s.a(0, 3, bVarI);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(new ez00(0));
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            Integer numValueOf = Integer.valueOf(i3);
            Integer numValueOf2 = Integer.valueOf(qcnVar.size());
            boolean zD = bVarI.d(i3) | bVarI.M(zzrVarA);
            Object objY2 = bVarI.y();
            if (zD || objY2 == c0042a) {
                objY2 = new fgq(i3, null, zzrVarA);
                bVarI.r(objY2);
            }
            xvf.g(numValueOf, numValueOf2, (Function2) objY2, bVarI);
            boolean zM = bVarI.M(zzrVarA);
            Object objY3 = bVarI.y();
            if (zM || objY3 == c0042a) {
                objY3 = new hgq(zzrVarA, ytwVar, null);
                bVarI.r(objY3);
            }
            xvf.e(bVarI, zzrVarA, (Function2) objY3);
            d dVarC = j.c(dVar, 1.0f);
            i060 i060Var = b;
            d dVarA = ls7.a(dVarC, i060Var);
            qyd0 qyd0Var = oib0.a;
            int i4 = i3;
            d dVarA2 = d35.a(androidx.compose.foundation.a.b(dVarA, ((lib0) bVarI.O(qyd0Var)).b1, zk40.a), 1.0f, ((lib0) bVarI.O(qyd0Var)).F, i060Var);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarA2);
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
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC2, yka.a.d);
            a(i4, ytwVar, bVarI, 48);
            d dVarF = h.f(j.e(d.a.b, 1.0f), d);
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objY4 = bVarI.y();
            if (z || objY4 == c0042a) {
                objY4 = new vfq(0, qcnVar, function1);
                bVarI.r(objY4);
            }
            aur.b(dVarF, zzrVarA, null, null, null, null, false, null, (Function1) objY4, bVarI, 6, 508);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(qcnVar, function1, i) { // from class: wfq
                public final /* synthetic */ qcn b;
                public final /* synthetic */ Function1 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    egq.b(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(int i, androidx.compose.runtime.a aVar, d dVar, String str, Function0 function0, boolean z) {
        d dVar2;
        long j;
        b bVarI = aVar.i(-873187646);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.b(z) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128) | 3072;
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            float f = e;
            d.a aVar2 = d.a.b;
            d dVarH = h.h(androidx.compose.foundation.d.d(ls7.a(j.i(aVar2, f), a), false, null, null, function0, 15), 16.0f, 0.0f, 2);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            imf0 imf0Var = ((ijb0) bVarI.O(kjb0.a)).i;
            if (z) {
                bVarI.N(-281251110);
                j = ((lib0) bVarI.O(oib0.a)).o;
            } else {
                bVarI.N(-281250116);
                j = ((lib0) bVarI.O(oib0.a)).q;
            }
            bVarI.X(false);
            lkf0.d(str, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 1, false, 1, 0, null, imf0Var, bVarI, i2 & 14, 28032, 102394);
            bVarI.X(true);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new b08(i, dVar2, str, function0, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00cb A[PHI: r9 r10
      0x00cb: PHI (r9v3 zzr) = (r9v0 zzr), (r9v2 zzr), (r9v11 zzr) binds: [B:73:0x00cb, B:42:0x00c8, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x00cb: PHI (r10v2 int) = (r10v0 int), (r10v1 int), (r10v7 int) binds: [B:73:0x00cb, B:42:0x00c8, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:57:0x0112  */
    /* JADX WARN: Code duplicated, block: B:58:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0117  */
    /* JADX WARN: Code duplicated, block: B:61:0x011b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0134  */
    /* JADX WARN: Code duplicated, block: B:71:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012e, code lost:
    
        if (defpackage.ts7.a(r9, r3, defpackage.yi0.d(0.0f, 0.0f, null, 7), r0) == r1) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(final defpackage.zzr r9, final int r10, defpackage.x1b r11) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egq.d(zzr, int, x1b):java.lang.Object");
    }

    public static final dz00 e(ez00 ez00Var, int i) {
        Object next;
        List<cz00> list = ez00Var.a;
        int i2 = ez00Var.b;
        List<cz00> list2 = ez00Var.a;
        if (list.isEmpty()) {
            return null;
        }
        Iterator<T> it = list2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((cz00) next).a != i);
        cz00 cz00Var = (cz00) next;
        if (cz00Var != null) {
            return new dz00(cz00Var.b, cz00Var.c);
        }
        cz00 cz00Var2 = (cz00) CollectionsKt.T(list2);
        cz00 cz00Var3 = (cz00) CollectionsKt.b0(list2);
        if (i < cz00Var2.a) {
            return new dz00(-i2, 0.0f);
        }
        if (i > cz00Var3.a) {
            return new dz00(i2, 0.0f);
        }
        return null;
    }
}
