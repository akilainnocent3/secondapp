package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n2k {

    @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.screen.GestureKt$GestureImpl$1$1", f = "Gesture.kt", l = {52, 59, 60, 67}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ isw A;
        public int a;
        public int b;
        public int c;
        public float d;
        public mmd e;
        public gzg0 f;
        public isw i;
        public int v;
        public final /* synthetic */ float w;
        public final /* synthetic */ mmd y;
        public final /* synthetic */ gzg0<Float> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, mmd mmdVar, gzg0<Float> gzg0Var, isw iswVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.w = f;
            this.y = mmdVar;
            this.z = gzg0Var;
            this.A = iswVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.w, this.y, this.z, this.A, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x007c A[PHI: r0 r2 r3 r4 r6 r8 r11 r16 r17 r18 r20
          0x007c: PHI (r0v4 int) = (r0v9 int), (r0v19 int) binds: [B:23:0x0118, B:13:0x0061] A[DONT_GENERATE, DONT_INLINE]
          0x007c: PHI (r2v3 int) = (r2v9 int), (r2v16 int) binds: [B:23:0x0118, B:13:0x0061] A[DONT_GENERATE, DONT_INLINE]
          0x007c: PHI (r3v3 float) = (r3v6 float), (r3v12 float) binds: [B:23:0x0118, B:13:0x0061] A[DONT_GENERATE, DONT_INLINE]
          0x007c: PHI (r4v3 int) = (r4v8 int), (r4v14 int) binds: [B:23:0x0118, B:13:0x0061] A[DONT_GENERATE, DONT_INLINE]
          0x007c: PHI (r6v2 isw) = (r6v6 isw), (r6v14 isw) binds: [B:23:0x0118, B:13:0x0061] A[DONT_GENERATE, DONT_INLINE]
          0x007c: PHI (r8v4 gzg0<java.lang.Float>) = (r8v6 gzg0<java.lang.Float>), (r8v12 gzg0<java.lang.Float>) binds: [B:23:0x0118, B:13:0x0061] A[DONT_GENERATE, DONT_INLINE]
          0x007c: PHI (r11v2 mmd) = (r11v5 mmd), (r11v10 mmd) binds: [B:23:0x0118, B:13:0x0061] A[DONT_GENERATE, DONT_INLINE]
          0x007c: PHI (r16v2 float) = (r16v3 float), (r16v7 float) binds: [B:23:0x0118, B:13:0x0061] A[DONT_GENERATE, DONT_INLINE]
          0x007c: PHI (r17v2 float) = (r17v3 float), (r17v7 float) binds: [B:23:0x0118, B:13:0x0061] A[DONT_GENERATE, DONT_INLINE]
          0x007c: PHI (r18v0 float) = (r18v1 float), (r18v4 float) binds: [B:23:0x0118, B:13:0x0061] A[DONT_GENERATE, DONT_INLINE]
          0x007c: PHI (r20v1 int) = (r20v2 int), (r20v6 int) binds: [B:23:0x0118, B:13:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x00be  */
        /* JADX WARN: Code duplicated, block: B:21:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:28:0x014e  */
        /* JADX WARN: Code duplicated, block: B:32:0x016e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x016e -> B:9:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instruction units count: 383
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: n2k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(final float f, androidx.compose.runtime.a aVar, final int i) {
        b bVarI = aVar.i(136767214);
        int i2 = (bVarI.c(f) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            d dVarE = j.e(d.a.b, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
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
            hlh0.a(bVarI, dVarC, yka.a.d);
            b(f, bVarI, i2 & 14);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, f) { // from class: i2k
                public final /* synthetic */ float a;

                {
                    this.a = f;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    n2k.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final float f, androidx.compose.runtime.a aVar, final int i) {
        final isw iswVar;
        b bVarI = aVar.i(491630126);
        int i2 = (bVarI.c(f) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = androidx.compose.runtime.j.a(mmdVar.C1((f - 65.13f) - 17.0f));
                bVarI.r(objY);
            }
            isw iswVar2 = (isw) objY;
            final int iB = (int) mla.b(188.0f, bVarI);
            gzg0 gzg0VarE = yi0.e(1000, 0, xkf.a, 2);
            Unit unit = Unit.a;
            boolean zM = bVarI.M(mmdVar) | ((i2 & 14) == 4) | bVarI.M(gzg0VarE);
            Object objY2 = bVarI.y();
            if (zM || objY2 == c0042a) {
                iswVar = iswVar2;
                a aVar2 = new a(f, mmdVar, gzg0VarE, iswVar, null);
                bVarI.r(aVar2);
                objY2 = aVar2;
            } else {
                iswVar = iswVar2;
            }
            xvf.e(bVarI, unit, (Function2) objY2);
            boolean zD = bVarI.d(iB);
            Object objY3 = bVarI.y();
            if (zD || objY3 == c0042a) {
                objY3 = new Function1() { // from class: j2k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((mmd) obj).getClass();
                        int iJ = (int) iswVar.j();
                        return new iwo((((long) iJ) & 4294967295L) | (((long) iB) << 32));
                    }
                };
                bVarI.r(objY3);
            }
            d dVarT = j.t(g.b(d.a.b, (Function1) objY3), 54.0f, 65.13f);
            ctt.a aVar3 = ctt.b;
            mw90.a("https://s.sporty.net/cms/Gesture_55c5db2b89.png", "gesture", dVarT, null, null, null, null, bVarI, 48, 2040);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, f) { // from class: k2k
                public final /* synthetic */ float a;

                {
                    this.a = f;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    n2k.b(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
