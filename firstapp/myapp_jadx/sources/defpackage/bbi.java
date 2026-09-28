package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bbi {

    /* JADX INFO: loaded from: classes.dex */
    @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.screen.FootballBoardKt$FootballBoard$3$1", f = "FootballBoard.kt", l = {91, 104, 122}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ isw A;
        public float a;
        public float b;
        public int c;
        public double d;
        public int e;
        public /* synthetic */ Object f;
        public final /* synthetic */ gzg0<Float> i;
        public final /* synthetic */ zg4 v;
        public final /* synthetic */ Function0<Unit> w;
        public final /* synthetic */ ytw<wd0<Float, ij0>> y;
        public final /* synthetic */ ytw<Boolean> z;

        /* JADX INFO: renamed from: bbi$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes5.dex */
        @c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.screen.FootballBoardKt$FootballBoard$3$1$2$1$1", f = "FootballBoard.kt", l = {117}, m = "invokeSuspend", v = 2)
        public static final class C0117a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ytw<wd0<Float, ij0>> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0117a(ytw<wd0<Float, ij0>> ytwVar, v1b<? super C0117a> v1bVar) {
                super(2, v1bVar);
                this.b = ytwVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0117a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0117a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    wd0<Float, ij0> value = this.b.getValue();
                    this.a = 1;
                    if (value.g(this) == y5bVar) {
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
        public a(gzg0<Float> gzg0Var, zg4 zg4Var, Function0<Unit> function0, ytw<wd0<Float, ij0>> ytwVar, ytw<Boolean> ytwVar2, isw iswVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.i = gzg0Var;
            this.v = zg4Var;
            this.w = function0;
            this.y = ytwVar;
            this.z = ytwVar2;
            this.A = iswVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.i, this.v, this.w, this.y, this.z, this.A, v1bVar);
            aVar.f = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x0106, code lost:
        
            if (defpackage.hkd.b(500, r22) == r8) goto L44;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 296
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: bbi.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(final d dVar, final yg4 yg4Var, final zg4 zg4Var, final float f, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        String str;
        b bVarI = aVar.i(945508891);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.d(yg4Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(zg4Var) : bVarI.A(zg4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.c(f) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
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
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            d.a aVar3 = d.a.b;
            d dVarE = j.e(aVar3, 1.0f);
            if (yg4Var == yg4.b) {
                str = zg4Var.d;
            } else {
                ctt.a aVar4 = ctt.b;
                str = "https://s.sporty.net/cms/Card_Flip_629a7040ac.png";
            }
            mw90.a(str, "board", dVarE, null, null, null, null, bVarI, 432, 2040);
            if (yg4Var == yg4.a && (zg4Var.e instanceof hh4.c)) {
                bVarI.N(278318961);
                d dVarA = dw.a(h.f(aVar3, 6.0f), f);
                String str2 = ((hh4.c) zg4Var.e).a;
                List listK = kotlin.collections.b.k(new j58(shi.a), new j58(shi.b), new j58(shi.c));
                float f2 = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
                lkf0.d(str2, dVarA, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, new imf0(new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), mla.m(20.0f, bVarI), new t9i(900), f8i.b, null, null, mla.m(18.79f, bVarI), 33292210), bVarI, 0, 24960, 110588);
                bVarI = bVarI;
                bVarI.X(false);
            } else {
                bVarI.N(279124589);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: zai
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bbi.a(dVar, yg4Var, zg4Var, f, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final zg4 zg4Var, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        zg4Var.getClass();
        long j = zg4Var.b;
        function0.getClass();
        b bVarI = aVar.i(950123432);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(zg4Var) : bVarI.A(zg4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarJ = h.j(d.a.b, j7f.c(j), j7f.d(j), 0.0f, 0.0f, 12);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
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
            d(zg4Var, function0, bVarI, (i2 & 14) | 8 | (i2 & 112));
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: uai
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    bbi.b(zg4Var, function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final d dVar, zg4 zg4Var, Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        b bVar;
        Object aVar2;
        final zg4 zg4Var2 = zg4Var;
        final Function0<Unit> function1 = function0;
        b bVarI = aVar.i(63090445);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(zg4Var2) : bVarI.A(zg4Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            boolean zB = bVarI.b(((Boolean) ytwVar.getValue()).booleanValue());
            Object objY2 = bVarI.y();
            if (zB || objY2 == c0042a) {
                objY2 = m.b(ee0.a(0.0f));
                bVarI.r(objY2);
            }
            ytw ytwVar2 = (ytw) objY2;
            gzg0 gzg0VarE = yi0.e(300, 0, xkf.d, 2);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = androidx.compose.runtime.j.a(0.0f);
                bVarI.r(objY3);
            }
            isw iswVar = (isw) objY3;
            Boolean bool = (Boolean) ytwVar.getValue();
            bool.getClass();
            boolean zM = bVarI.M(ytwVar2) | bVarI.M(gzg0VarE) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && bVarI.A(zg4Var2))) | ((i3 & 896) == 256);
            Object objY4 = bVarI.y();
            if (zM || objY4 == c0042a) {
                aVar2 = new a(gzg0VarE, zg4Var2, function1, ytwVar2, ytwVar, iswVar, null);
                iswVar = iswVar;
                bVarI.r(aVar2);
            } else {
                aVar2 = objY4;
            }
            xvf.e(bVarI, bool, (Function2) aVar2);
            final float fFloatValue = ((Number) ((wd0) ytwVar2.getValue()).d()).floatValue() % 360.0f;
            boolean zC = bVarI.c(fFloatValue);
            Object objY5 = bVarI.y();
            if (zC || objY5 == c0042a) {
                objY5 = new Function1() { // from class: wai
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        a7l a7lVar = (a7l) obj;
                        a7lVar.getClass();
                        a7lVar.r(fFloatValue);
                        a7lVar.p(a7lVar.getDensity() * 8.0f);
                        return Unit.a;
                    }
                };
                bVarI.r(objY5);
            }
            d dVarA = androidx.compose.ui.graphics.a.a(dVar, (Function1) objY5);
            if ((0.0f > fFloatValue || fFloatValue > 90.0f) && (270.0f > fFloatValue || fFloatValue > 360.0f)) {
                bVarI.N(-1666160207);
                Object objY6 = bVarI.y();
                if (objY6 == c0042a) {
                    objY6 = new xai();
                    bVarI.r(objY6);
                }
                bVar = bVarI;
                zg4Var2 = zg4Var;
                a(androidx.compose.ui.graphics.a.a(dVarA, (Function1) objY6), yg4.a, zg4Var2, iswVar.j(), bVar, ((i3 << 3) & 896) | 560);
                bVar.X(false);
            } else {
                bVarI.N(-1666344347);
                bVar = bVarI;
                zg4Var2 = zg4Var;
                a(dVarA, yg4.b, zg4Var2, iswVar.j(), bVar, 560 | ((i3 << 3) & 896));
                bVar.X(false);
            }
        } else {
            function1 = function1;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: yai
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    bbi.c(dVar, zg4Var2, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(zg4 zg4Var, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final zg4 zg4Var2;
        b bVarI = aVar.i(2115840779);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(zg4Var) : bVarI.A(zg4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarR = j.r(d.a.b, zg4Var.c);
            hh4 hh4Var = zg4Var.e;
            if (Intrinsics.g(hh4Var, hh4.a.a)) {
                bVarI.N(72825367);
                zg4Var2 = zg4Var;
                a(dVarR, yg4.b, zg4Var2, 0.0f, bVarI, 3632 | ((i2 << 6) & 896));
                bVarI.X(false);
            } else {
                zg4Var2 = zg4Var;
                if (!(hh4Var instanceof hh4.b) && !(hh4Var instanceof hh4.c)) {
                    throw igf0.a(bVarI, 1803463010, false);
                }
                bVarI.N(72982971);
                int i3 = i2 << 3;
                c(dVarR, zg4Var2, function0, bVarI, (i3 & 896) | (i3 & 112) | 64);
                bVarI.X(false);
            }
        } else {
            zg4Var2 = zg4Var;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: vai
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    bbi.d(zg4Var2, function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
