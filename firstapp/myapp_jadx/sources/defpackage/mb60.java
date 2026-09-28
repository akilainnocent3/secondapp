package defpackage;

import android.graphics.DashPathEffect;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mb60 {

    @c0d(c = "com.sportygames.speedybingo.presentation.card.SBCardNumberKt$SBCardNumber$1$1$1", f = "SBCardNumber.kt", l = {113, 114}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ wd0<Float, ij0> c;
        public final /* synthetic */ wd0<j58, lj0> d;
        public final /* synthetic */ wd0<Float, ij0> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wd0<Float, ij0> wd0Var, wd0<j58, lj0> wd0Var2, wd0<Float, ij0> wd0Var3, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = wd0Var;
            this.d = wd0Var2;
            this.e = wd0Var3;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, this.e, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
            if (r6.c.f(r6, r7) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.b
                v5b r0 = (defpackage.v5b) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r6.a
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L1f
                if (r2 == r5) goto L1b
                if (r2 != r4) goto L15
                defpackage.uj50.b(r7)
                goto L49
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r3
            L1b:
                defpackage.uj50.b(r7)
                goto L35
            L1f:
                defpackage.uj50.b(r7)
                z5y r7 = defpackage.mb60.j()
                r6.b = r3
                r6.a = r5
                wd0<j58, lj0> r2 = r6.d
                wd0<java.lang.Float, ij0> r5 = r6.e
                java.lang.Object r7 = defpackage.mb60.g(r0, r2, r5, r7, r6)
                if (r7 != r1) goto L35
                goto L48
            L35:
                java.lang.Float r7 = new java.lang.Float
                r0 = 1065353216(0x3f800000, float:1.0)
                r7.<init>(r0)
                r6.b = r3
                r6.a = r4
                wd0<java.lang.Float, ij0> r0 = r6.c
                java.lang.Object r6 = r0.f(r6, r7)
                if (r6 != r1) goto L49
            L48:
                return r1
            L49:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: mb60.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.card.SBCardNumberKt$SBCardNumber$1$2$1", f = "SBCardNumber.kt", l = {124, 125, 128, 137, 143, 144, 145, 146}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ wd0<Float, ij0> c;
        public final /* synthetic */ lg6 d;
        public final /* synthetic */ wd0<Float, ij0> e;
        public final /* synthetic */ wd0<Float, ij0> f;
        public final /* synthetic */ wd0<j58, lj0> i;
        public final /* synthetic */ wd0<Float, ij0> v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(wd0<Float, ij0> wd0Var, lg6 lg6Var, wd0<Float, ij0> wd0Var2, wd0<Float, ij0> wd0Var3, wd0<j58, lj0> wd0Var4, wd0<Float, ij0> wd0Var5, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = wd0Var;
            this.d = lg6Var;
            this.e = wd0Var2;
            this.f = wd0Var3;
            this.i = wd0Var4;
            this.v = wd0Var5;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x006b  */
        /* JADX WARN: Code duplicated, block: B:21:0x0079  */
        /* JADX WARN: Code duplicated, block: B:24:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:26:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:29:0x00dd A[PHI: r7
          0x00dd: PHI (r7v2 mb60$b) = (r7v0 mb60$b), (r7v3 mb60$b) binds: [B:27:0x00d9, B:9:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:32:0x0101 A[PHI: r7
          0x0101: PHI (r7v4 mb60$b) = (r7v2 mb60$b), (r7v5 mb60$b) binds: [B:30:0x00fe, B:8:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:35:0x0127 A[PHI: r7
          0x0127: PHI (r7v6 mb60$b) = (r7v4 mb60$b), (r7v7 mb60$b) binds: [B:33:0x0124, B:7:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:38:0x014b A[PHI: r7
          0x014b: PHI (r7v8 mb60$b) = (r7v6 mb60$b), (r7v9 mb60$b) binds: [B:36:0x0148, B:6:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:43:0x0173  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a5, code lost:
        
            if (defpackage.mb60.f(r1, r14.i, r14.v, r4, androidx.recyclerview.widget.r.d.DEFAULT_DRAG_ANIMATION_DURATION, r6, r14) == r0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x016d, code lost:
        
            if (defpackage.mb60.e(r1, 130, r14, r7) == r0) goto L40;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 398
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: mb60.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.card.SBCardNumberKt$SBCardNumber$1$3$1", f = "SBCardNumber.kt", l = {163, 164}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ wd0<Float, ij0> c;
        public final /* synthetic */ wd0<Float, ij0> d;
        public final /* synthetic */ wd0<j58, lj0> e;
        public final /* synthetic */ wd0<Float, ij0> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(wd0<Float, ij0> wd0Var, wd0<Float, ij0> wd0Var2, wd0<j58, lj0> wd0Var3, wd0<Float, ij0> wd0Var4, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.c = wd0Var;
            this.d = wd0Var2;
            this.e = wd0Var3;
            this.f = wd0Var4;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = new c(this.c, this.d, this.e, this.f, v1bVar);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x006d, code lost:
        
            if (defpackage.mb60.e(r0, 300, r9, r8) == r1) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.b
                v5b r0 = (defpackage.v5b) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r8.a
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L1f
                if (r2 == r5) goto L1b
                if (r2 != r4) goto L15
                defpackage.uj50.b(r9)
                goto L70
            L15:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                return r3
            L1b:
                defpackage.uj50.b(r9)
                goto L43
            L1f:
                defpackage.uj50.b(r9)
                z5y r9 = new z5y
                r6 = 4287838215(0xff933807, double:2.118473557E-314)
                long r6 = defpackage.r58.d(r6)
                t9i r2 = defpackage.t9i.f
                int r2 = r2.a
                r9.<init>(r6, r2)
                r8.b = r0
                r8.a = r5
                wd0<j58, lj0> r2 = r8.e
                wd0<java.lang.Float, ij0> r5 = r8.f
                java.lang.Object r9 = defpackage.mb60.g(r0, r2, r5, r9, r8)
                if (r9 != r1) goto L43
                goto L6f
            L43:
                java.lang.Float r9 = new java.lang.Float
                r2 = 0
                r9.<init>(r2)
                kotlin.Pair r2 = new kotlin.Pair
                wd0<java.lang.Float, ij0> r5 = r8.c
                r2.<init>(r5, r9)
                java.lang.Float r9 = new java.lang.Float
                r5 = 1070386381(0x3fcccccd, float:1.6)
                r9.<init>(r5)
                kotlin.Pair r5 = new kotlin.Pair
                wd0<java.lang.Float, ij0> r6 = r8.d
                r5.<init>(r6, r9)
                kotlin.Pair[] r9 = new kotlin.Pair[]{r2, r5}
                r8.b = r3
                r8.a = r4
                r2 = 300(0x12c, float:4.2E-43)
                java.lang.Object r8 = defpackage.mb60.e(r0, r2, r9, r8)
                if (r8 != r1) goto L70
            L6f:
                return r1
            L70:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: mb60.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.speedybingo.presentation.card.SBCardNumberKt$SBCardNumber$1$4$1", f = "SBCardNumber.kt", l = {192, 193, 194, r.d.DEFAULT_DRAG_ANIMATION_DURATION}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ wd0<Float, ij0> c;
        public final /* synthetic */ wd0<Float, ij0> d;
        public final /* synthetic */ wd0<Float, ij0> e;
        public final /* synthetic */ wd0<Float, ij0> f;
        public final /* synthetic */ ytw<Boolean> i;
        public final /* synthetic */ wd0<j58, lj0> v;
        public final /* synthetic */ wd0<Float, ij0> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(wd0<Float, ij0> wd0Var, wd0<Float, ij0> wd0Var2, wd0<Float, ij0> wd0Var3, wd0<Float, ij0> wd0Var4, ytw<Boolean> ytwVar, wd0<j58, lj0> wd0Var5, wd0<Float, ij0> wd0Var6, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.c = wd0Var;
            this.d = wd0Var2;
            this.e = wd0Var3;
            this.f = wd0Var4;
            this.i = ytwVar;
            this.v = wd0Var5;
            this.w = wd0Var6;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = new d(this.c, this.d, this.e, this.f, this.i, this.v, this.w, v1bVar);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x009f A[PHI: r7
          0x009f: PHI (r7v1 mb60$d) = (r7v0 mb60$d), (r7v3 mb60$d) binds: [B:21:0x009c, B:11:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00d9, code lost:
        
            if (defpackage.mb60.f(r1, r7.v, r7.w, r4, 300, r6, r7) == r0) goto L25;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 230
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: mb60.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(androidx.compose.ui.d dVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-2083232505);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(j.t(dVar, 28.0f, 20.0f), r58.d(4294945859L), j060.c(2.0f));
            long j = j58.f;
            androidx.compose.ui.d dVarA = d35.a(dVarB, 1.0f, j, j060.c(2.0f));
            i060 i060VarC = j060.c(2.0f);
            dVarA.getClass();
            androidx.compose.ui.d dVarC = androidx.compose.ui.draw.a.c(androidx.compose.ui.graphics.a.a(dVarA, new kln()), new lln(2.0f, 1.0f, 1.0f, -1.0f, i060VarC, j, 0.5f));
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarC);
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
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new sfa(i, 1, dVar);
        }
    }

    public static final void b(final int i, androidx.compose.runtime.a aVar, final androidx.compose.ui.d dVar, final boolean z) {
        androidx.compose.runtime.b bVarI = aVar.i(-479515134);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.ui.d dVarA = d35.a(androidx.compose.foundation.a.b(j.t(dVar, 28.0f, 20.0f), j58.f, j060.c(2.0f)), 1.0f, r58.d(4294945859L), j060.c(2.0f));
            long jD = r58.d(4294945859L);
            i060 i060VarC = j060.c(2.0f);
            dVarA.getClass();
            androidx.compose.ui.d dVarC = androidx.compose.ui.draw.a.c(androidx.compose.ui.graphics.a.a(dVarA, new kln()), new lln(4.0f, -1.0f, -2.0f, 2.0f, i060VarC, jD, 0.5f));
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarC);
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
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar, z) { // from class: jb60
                public final /* synthetic */ d a;
                public final /* synthetic */ boolean b;

                {
                    this.a = dVar;
                    this.b = z;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mb60.b(qj40.a(1), (a) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final androidx.compose.ui.d dVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        dVar.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-2089334122);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(j.t(dVar, 28.0f, 20.0f), r58.d(2156109542L), j060.c(2.0f));
            final long jD = r58.d(4286815974L);
            final mmd mmdVar = (mmd) bVarI.O(kna.h);
            boolean zM = bVarI.M(mmdVar) | bVarI.c(1.0f) | bVarI.c(4.0f) | bVarI.c(4.0f) | bVarI.c(2.0f) | bVarI.e(jD);
            Object objY = bVarI.y();
            if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: kb60
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        mr5 mr5Var = (mr5) obj;
                        mr5Var.getClass();
                        mmd mmdVar2 = mmdVar;
                        final float fC1 = mmdVar2.C1(1.0f);
                        float fC2 = mmdVar2.C1(4.0f);
                        float fC3 = mmdVar2.C1(4.0f);
                        final float fC4 = mmdVar2.C1(2.0f);
                        final float f = fC1 / 2.0f;
                        final yae0 yae0Var = new yae0(fC1, 0.0f, 0, 0, new k90(new DashPathEffect(new float[]{fC2, fC3}, 10.0f)), 14);
                        final long j = jD;
                        return mr5Var.e(new Function1() { // from class: lb60
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                tcf tcfVar = (tcf) obj2;
                                tcfVar.getClass();
                                float f2 = fC4;
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                                float f3 = f;
                                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                                float f4 = fC1;
                                tcf.d1(tcfVar, j, jFloatToRawIntBits2, (4294967295L & ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)) - f4))) | (Float.floatToRawIntBits(fIntBitsToFloat - f4) << 32), jFloatToRawIntBits, yae0Var, 0.0f, 224);
                                return Unit.a;
                            }
                        });
                    }
                };
                bVarI.r(objY);
            }
            androidx.compose.ui.d dVarB2 = androidx.compose.ui.draw.a.b(dVarB, (Function1) objY);
            long j = j58.f;
            i060 i060VarC = j060.c(2.0f);
            dVarB2.getClass();
            androidx.compose.ui.d dVarC = androidx.compose.ui.draw.a.c(androidx.compose.ui.graphics.a.a(dVarB2, new kln()), new lln(2.0f, 1.0f, 1.0f, -1.0f, i060VarC, j, 0.5f));
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarC);
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
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: hb60
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    mb60.c(dVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    public static final void d(lg6 lg6Var, androidx.compose.runtime.a aVar, int i) {
        lg6 lg6Var2;
        ?? r2;
        androidx.compose.runtime.b bVar;
        androidx.compose.ui.d.a aVar2;
        wd0 wd0Var;
        androidx.compose.runtime.b bVar2;
        boolean z;
        boolean z2;
        wd0 wd0Var2;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        wd0 wd0Var3;
        lg6Var.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(151208600);
        int i2 = i | (bVarI.M(lg6Var) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.ui.d.a aVar3 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarT = j.t(aVar3, 28.0f, 20.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarT);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
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
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a2 = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a2) {
                long j = j().a;
                fkd0<j58> fkd0Var = hw90.a;
                objY = new wd0(new j58(j), e78.a.invoke(j58.f(j)), null, 12);
                bVarI.r(objY);
            }
            wd0 wd0Var4 = (wd0) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a2) {
                objY2 = ee0.a(j().b);
                bVarI.r(objY2);
            }
            wd0 wd0Var5 = (wd0) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a2) {
                objY3 = ee0.a(1.0f);
                bVarI.r(objY3);
            }
            wd0 wd0Var6 = (wd0) objY3;
            int iOrdinal = lg6Var.b.ordinal();
            if (iOrdinal == 0) {
                lg6Var2 = lg6Var;
                aVar2 = aVar3;
                wd0Var = wd0Var5;
                bVar2 = bVarI;
                z = true;
                bVar2.N(-984201599);
                c(aVar2, bVar2, 6);
                Unit unit = Unit.a;
                boolean zA = bVar2.A(wd0Var4) | bVar2.A(wd0Var) | bVar2.A(wd0Var6);
                Object objY4 = bVar2.y();
                if (zA || objY4 == c0042a2) {
                    objY4 = new a(wd0Var6, wd0Var4, wd0Var, null);
                    bVar2.r(objY4);
                }
                xvf.e(bVar2, unit, (Function2) objY4);
                bVar2.X(false);
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    aVar2 = aVar3;
                    bVar2 = bVarI;
                    wd0Var2 = wd0Var5;
                    bVar2.N(-982307251);
                    Object objY5 = bVar2.y();
                    if (objY5 == c0042a2) {
                        objY5 = ee0.a(1.0f);
                        bVar2.r(objY5);
                    }
                    wd0 wd0Var7 = (wd0) objY5;
                    Object objY6 = bVar2.y();
                    if (objY6 == c0042a2) {
                        objY6 = ee0.a(1.0f);
                        bVar2.r(objY6);
                    }
                    wd0 wd0Var8 = (wd0) objY6;
                    i(aVar2, bVar2, 6);
                    float fFloatValue = ((Number) wd0Var8.d()).floatValue();
                    i(abk0.a(dw.a(bz60.a(aVar2, fFloatValue, fFloatValue), ((Number) wd0Var7.d()).floatValue()), 1.0f), bVar2, 0);
                    Unit unit2 = Unit.a;
                    boolean zA2 = bVar2.A(wd0Var4) | bVar2.A(wd0Var2) | bVar2.A(wd0Var7) | bVar2.A(wd0Var8);
                    Object objY7 = bVar2.y();
                    if (zA2 || objY7 == c0042a2) {
                        c cVar = new c(wd0Var7, wd0Var8, wd0Var4, wd0Var2, null);
                        bVar2.r(cVar);
                        objY7 = cVar;
                    }
                    xvf.e(bVar2, unit2, (Function2) objY7);
                    bVar2.X(false);
                } else {
                    if (iOrdinal != 3) {
                        throw igf0.a(bVarI, -308841224, false);
                    }
                    bVarI.N(-981644099);
                    Object objY8 = bVarI.y();
                    if (objY8 == c0042a2) {
                        objY8 = ee0.a(1.0f);
                        bVarI.r(objY8);
                    }
                    wd0 wd0Var9 = (wd0) objY8;
                    Object objY9 = bVarI.y();
                    if (objY9 == c0042a2) {
                        objY9 = ee0.a(0.0f);
                        bVarI.r(objY9);
                    }
                    wd0 wd0Var10 = (wd0) objY9;
                    Object objY10 = bVarI.y();
                    if (objY10 == c0042a2) {
                        objY10 = ee0.a(0.0f);
                        bVarI.r(objY10);
                    }
                    wd0 wd0Var11 = (wd0) objY10;
                    Object objY11 = bVarI.y();
                    if (objY11 == c0042a2) {
                        objY11 = m.b(Boolean.FALSE);
                        bVarI.r(objY11);
                    }
                    ytw ytwVar = (ytw) objY11;
                    c(dw.a(aVar3, ((Number) wd0Var9.d()).floatValue()), bVarI, 0);
                    a(dw.a(aVar3, ((Number) wd0Var10.d()).floatValue()), bVarI, 0);
                    b(0, bVarI, dw.a(aVar3, ((Number) wd0Var11.d()).floatValue()), ((Boolean) ytwVar.getValue()).booleanValue());
                    if (((Boolean) ytwVar.getValue()).booleanValue()) {
                        bVarI.N(-981038328);
                        aVar2 = aVar3;
                        c0042a = c0042a2;
                        wd0Var3 = wd0Var6;
                        wd0Var2 = wd0Var5;
                        g7w.a(j.o(aVar3, 29.0f, 21.0f), 2.5f, 1.0f, 0.0f, 0, r58.d(4294963574L), 0, bVarI, 197046);
                        bVar2 = bVarI;
                    } else {
                        aVar2 = aVar3;
                        c0042a = c0042a2;
                        wd0Var3 = wd0Var6;
                        bVar2 = bVarI;
                        wd0Var2 = wd0Var5;
                        bVar2.N(-988704752);
                    }
                    bVar2.X(false);
                    Unit unit3 = Unit.a;
                    boolean zA3 = bVar2.A(wd0Var4) | bVar2.A(wd0Var2) | bVar2.A(wd0Var3) | bVar2.A(wd0Var10) | bVar2.A(wd0Var9) | bVar2.A(wd0Var11);
                    Object objY12 = bVar2.y();
                    if (zA3 || objY12 == c0042a) {
                        objY12 = new d(wd0Var3, wd0Var10, wd0Var9, wd0Var11, ytwVar, wd0Var4, wd0Var2, null);
                        bVar2.r(objY12);
                    }
                    xvf.e(bVar2, unit3, (Function2) objY12);
                    bVar2.X(false);
                }
                lg6Var2 = lg6Var;
                wd0Var = wd0Var2;
                z = true;
            } else {
                aVar2 = aVar3;
                bVar2 = bVarI;
                bVar2.N(-983906510);
                Object objY13 = bVar2.y();
                if (objY13 == c0042a2) {
                    objY13 = ee0.a(1.0f);
                    bVar2.r(objY13);
                }
                wd0 wd0Var12 = (wd0) objY13;
                Object objY14 = bVar2.y();
                if (objY14 == c0042a2) {
                    objY14 = ee0.a(0.0f);
                    bVar2.r(objY14);
                }
                wd0 wd0Var13 = (wd0) objY14;
                c(dw.a(aVar2, ((Number) wd0Var12.d()).floatValue()), bVar2, 0);
                h(dw.a(aVar2, ((Number) wd0Var13.d()).floatValue()), bVar2, 0);
                Unit unit4 = Unit.a;
                boolean zA4 = ((i2 & 14) == 4) | bVar2.A(wd0Var4) | bVar2.A(wd0Var5) | bVar2.A(wd0Var6) | bVar2.A(wd0Var13) | bVar2.A(wd0Var12);
                Object objY15 = bVar2.y();
                if (zA4 || objY15 == c0042a2) {
                    wd0Var = wd0Var5;
                    z2 = false;
                    z = true;
                    b bVar3 = new b(wd0Var6, lg6Var, wd0Var13, wd0Var12, wd0Var4, wd0Var, null);
                    lg6Var2 = lg6Var;
                    bVar2.r(bVar3);
                    objY15 = bVar3;
                } else {
                    lg6Var2 = lg6Var;
                    wd0Var = wd0Var5;
                    z2 = false;
                    z = true;
                }
                xvf.e(bVar2, unit4, (Function2) objY15);
                bVar2.X(z2);
            }
            boolean z3 = z;
            androidx.compose.runtime.b bVar4 = bVar2;
            lkf0.b(lg6Var2.a.a(), abk0.a(aVar2, 2.0f), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0.b(((xob0) bVar2.O(vob0.a)).a, ((j58) wd0Var4.d()).a, i7f.b(12.0f, bVar2), new t9i((int) ((Number) wd0Var.d()).floatValue()), null, null, 0L, null, null, null, 0, 0L, null, null, 16777208), bVar4, 48, 0, 65532);
            androidx.compose.runtime.b bVar5 = bVar4;
            bVar5.X(z3);
            r2 = z3;
            bVar = bVar5;
        } else {
            androidx.compose.runtime.b bVar6 = bVarI;
            lg6Var2 = lg6Var;
            r2 = 1;
            bVar6.G();
            bVar = bVar6;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new ofa(i, r2, lg6Var2);
        }
    }

    public static final Object e(v5b v5bVar, int i, Pair[] pairArr, tje0 tje0Var) {
        ArrayList arrayList = new ArrayList(pairArr.length);
        for (Pair pair : pairArr) {
            arrayList.add(ej5.a(v5bVar, null, new nb60(pair, i, null), 3));
        }
        Object objA = up1.a(arrayList, tje0Var);
        return objA == y5b.a ? objA : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f(v5b v5bVar, wd0 wd0Var, wd0 wd0Var2, z5y z5yVar, int i, Pair[] pairArr, x1b x1bVar) {
        ob60 ob60Var;
        List list;
        if (x1bVar instanceof ob60) {
            ob60Var = (ob60) x1bVar;
            int i2 = ob60Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ob60Var.c = i2 - Integer.MIN_VALUE;
            } else {
                ob60Var = new ob60(x1bVar);
            }
        } else {
            ob60Var = new ob60(x1bVar);
        }
        Object objA = ob60Var.b;
        y5b y5bVar = y5b.a;
        int i3 = ob60Var.c;
        if (i3 == 0) {
            uj50.b(objA);
            List listK = kotlin.collections.b.k(ej5.a(v5bVar, null, new pb60(wd0Var, z5yVar, i, null), 3), ej5.a(v5bVar, null, new qb60(wd0Var2, z5yVar, i, null), 3));
            ArrayList arrayList = new ArrayList(pairArr.length);
            for (Pair pair : pairArr) {
                arrayList.add(ej5.a(v5bVar, null, new rb60(pair, i, null), 3));
            }
            ob60Var.a = listK;
            ob60Var.c = 1;
            objA = up1.a(arrayList, ob60Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
            list = listK;
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = ob60Var.a;
            uj50.b(objA);
        }
        CollectionsKt.i0((Iterable) objA, list);
        return Unit.a;
    }

    public static final Object g(v5b v5bVar, wd0 wd0Var, wd0 wd0Var2, z5y z5yVar, tje0 tje0Var) {
        Object objA = up1.a(kotlin.collections.b.k(ej5.a(v5bVar, null, new sb60(wd0Var, z5yVar, null), 3), ej5.a(v5bVar, null, new tb60(wd0Var2, z5yVar, null), 3)), tje0Var);
        return objA == y5b.a ? objA : Unit.a;
    }

    public static final void h(final androidx.compose.ui.d dVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        dVar.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-742315294);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.ui.d dVarA = d35.a(androidx.compose.foundation.a.b(j.t(dVar, 28.0f, 20.0f), r58.d(4294945859L), j060.c(2.0f)), 1.0f, r58.d(4293561365L), j060.c(2.0f));
            long j = j58.f;
            i060 i060VarC = j060.c(2.0f);
            dVarA.getClass();
            androidx.compose.ui.d dVarC = androidx.compose.ui.draw.a.c(androidx.compose.ui.graphics.a.a(dVarA, new kln()), new lln(2.0f, 1.0f, 1.0f, -1.0f, i060VarC, j, 0.5f));
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarC);
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
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ib60
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    mb60.h(dVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void i(final androidx.compose.ui.d dVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        dVar.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-662846627);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(j.t(dVar, 28.0f, 20.0f), r58.d(4294955075L), j060.c(2.0f));
            long j = j58.f;
            androidx.compose.ui.d dVarA = d35.a(dVarB, 1.0f, j, j060.c(2.0f));
            i060 i060VarC = j060.c(2.0f);
            dVarA.getClass();
            androidx.compose.ui.d dVarC = androidx.compose.ui.draw.a.c(androidx.compose.ui.graphics.a.a(dVarA, new kln()), new lln(2.0f, 1.0f, 1.0f, -1.0f, i060VarC, j, 0.5f));
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarC);
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
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: gb60
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    mb60.i(dVar, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final z5y j() {
        long jD = r58.d(4281026965L);
        t9i t9iVar = t9i.b;
        return new z5y(jD, t9i.f.a);
    }

    public static final z5y k() {
        long jD = r58.d(4287838215L);
        t9i t9iVar = t9i.b;
        return new z5y(jD, t9i.f.a);
    }
}
