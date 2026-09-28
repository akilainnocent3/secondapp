package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.j;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
public final class c2u {

    @c0d(c = "com.sporty.android.platform.features.loyalty.upgradedialog.LoyaltyUpgradeScreenKt$Coin$1$1", f = "LoyaltyUpgradeScreen.kt", l = {HttpStatusCodesKt.HTTP_PERM_REDIRECT}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ gzg0<Float> c;
        public final /* synthetic */ isw d;
        public final /* synthetic */ isw e;
        public final /* synthetic */ ytw<Boolean> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, gzg0<Float> gzg0Var, isw iswVar, isw iswVar2, ytw<Boolean> ytwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = z;
            this.c = gzg0Var;
            this.d = iswVar;
            this.e = iswVar2;
            this.f = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            a aVar;
            y5b y5bVar = y5b.a;
            int i = this.a;
            int i2 = 1;
            if (i == 0) {
                uj50.b(obj);
                if (!this.b) {
                    return Unit.a;
                }
                e9b e9bVar = new e9b(i2, this.d, this.e);
                this.a = 1;
                aVar = this;
                if (sje0.c(0.5f, 1.0f, 0.0f, this.c, e9bVar, aVar, 4) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                aVar = this;
            }
            aVar.f.setValue(Boolean.TRUE);
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.loyalty.upgradedialog.LoyaltyUpgradeScreenKt$DialogBG$1$1", f = "LoyaltyUpgradeScreen.kt", l = {141}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ytw<Boolean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ytw<Boolean> ytwVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = ytwVar;
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
                this.a = 1;
                if (hkd.b(300L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            this.b.setValue(Boolean.TRUE);
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [androidx.compose.runtime.a, androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r14v1, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r14v11, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r16v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    public static final void a(final f2u f2uVar, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        ?? r14;
        Object obj;
        ?? r3;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        int i2;
        float fFloatValue;
        float f;
        float f2;
        ?? r21;
        ?? r1;
        Object aVar2;
        isw iswVar;
        isw iswVar2;
        int i3;
        ?? I = aVar.i(2821433);
        int i4 = (I.d(f2uVar.ordinal()) ? 4 : 2) | i | (I.b(z) ? 32 : 16);
        if (I.q(i4 & 1, (i4 & 19) != 18)) {
            wkf wkfVar = xkf.d;
            gzg0 gzg0VarE = yi0.e(500, 0, wkfVar, 2);
            Object objY = I.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a2 = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a2) {
                obj = objY;
                isw iswVarA = j.a(0.0f);
                I.r(iswVarA);
                obj = iswVarA;
            }
            obj = objY;
            isw iswVar3 = (isw) obj;
            Object objY2 = I.y();
            Object obj2 = objY2;
            if (objY2 == c0042a2) {
                isw iswVarA2 = j.a(0.5f);
                I.r(iswVarA2);
                obj2 = iswVarA2;
            }
            isw iswVar4 = (isw) obj2;
            Object objY3 = I.y();
            Object obj3 = objY3;
            if (objY3 == c0042a2) {
                ytw ytwVarB = m.b(Boolean.FALSE);
                I.r(ytwVarB);
                obj3 = ytwVarB;
            }
            ytw ytwVar = (ytw) obj3;
            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                I.N(-1845668406);
                i2 = 1000;
                c0042a = c0042a2;
                r3 = 0;
                fFloatValue = ((Number) ((x5a0) kgn.a(kgn.b("down coin", I, 0), 0.0f, 10.0f, yi0.a(yi0.e(1000, 0, wkfVar, 2), l850.b, 0L, 4), "downOffset", I, 29112, 0).c).getValue()).floatValue();
                I.X(false);
            } else {
                r3 = 0;
                c0042a = c0042a2;
                i2 = 1000;
                I.N(-1845324585);
                I.X(false);
                fFloatValue = 0.0f;
            }
            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                I.N(-1845251797);
                f = fFloatValue;
                float fFloatValue2 = ((Number) ((x5a0) kgn.a(kgn.b("up coin", I, r3), 0.0f, -10.0f, yi0.a(yi0.e(i2, r3, wkfVar, 2), l850.b, 0L, 4), "downOffset", I, 28728, 0).c).getValue()).floatValue();
                I.X(r3);
                f2 = fFloatValue2;
            } else {
                f = fFloatValue;
                I.N(-1844908937);
                I.X(r3);
                f2 = 0.0f;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            if ((i4 & 112) == 32) {
                r21 = r3;
                r1 = 1;
            } else {
                ?? r2 = r3;
                r21 = r2 == true ? 1 : 0;
                r1 = r2;
            }
            int i5 = r1 | (I.M(gzg0VarE) ? 1 : 0);
            Object objY4 = I.y();
            if (i5 != 0 || objY4 == c0042a) {
                iswVar = iswVar3;
                iswVar2 = iswVar4;
                i3 = 1;
                aVar2 = new a(z, gzg0VarE, iswVar, iswVar2, ytwVar, null);
                I.r(aVar2);
            } else {
                aVar2 = objY4;
                iswVar = iswVar3;
                iswVar2 = iswVar4;
                i3 = 1;
            }
            xvf.e(I, boolValueOf, (Function2) aVar2);
            d.a aVar3 = d.a.b;
            d dVarA = dw.a(androidx.compose.foundation.layout.j.t(aVar3, 360.0f, 220.0f), iswVar.j());
            float fJ = iswVar2.j();
            d dVarA2 = bz60.a(dVarA, fJ, fJ);
            aiv aivVarC = g75.c(ht.a.a, r21);
            int iHashCode = Long.hashCode(I.T);
            ne00 ne00VarS = I.S();
            d dVarC = c.c(I, dVarA2);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            I.D();
            if (I.S) {
                I.F(aVar4);
            } else {
                I.p();
            }
            hlh0.a(I, aivVarC, yka.a.f);
            hlh0.a(I, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (I.S || !Intrinsics.g(I.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, I, iHashCode, c1350a);
            }
            hlh0.a(I, dVarC, yka.a.d);
            d dVarD = g.d(androidx.compose.foundation.layout.j.t(h.j(aVar3, 22.93f, 19.54f, 0.0f, 0.0f, 12), 79.0f, 84.0f), 0.0f, f2, i3);
            klh0 klh0Var = f2uVar.e;
            float f3 = f;
            ?? r16 = i3;
            mw90.a(klh0Var.a, "bg", dVarD, null, null, null, null, I, 48, 2040);
            mw90.a(klh0Var.b, "bg", g.d(androidx.compose.foundation.layout.j.t(h.j(aVar3, 18.0f, 146.0f, 0.0f, 0.0f, 12), 53.0f, 58.0f), 0.0f, f3, r16 == true ? 1 : 0), null, null, null, null, I, 48, 2040);
            mw90.a(klh0Var.c, "bg", g.d(androidx.compose.foundation.layout.j.t(h.j(aVar3, 263.0f, 32.0f, 0.0f, 0.0f, 12), 58.0f, 56.0f), 0.0f, f3, r16 == true ? 1 : 0), null, null, null, null, I, 48, 2040);
            mw90.a(klh0Var.d, "bg", g.d(androidx.compose.foundation.layout.j.t(h.j(aVar3, 293.0f, 129.0f, 0.0f, 0.0f, 12), 32.0f, 35.0f), 0.0f, f2, r16 == true ? 1 : 0), null, null, null, null, I, 48, 2040);
            mw90.a(klh0Var.e, "bg", g.d(androidx.compose.foundation.layout.j.t(h.j(aVar3, 247.0f, 162.0f, 0.0f, 0.0f, 12), 41.0f, 42.0f), 0.0f, f3, r16 == true ? 1 : 0), null, null, null, null, I, 48, 2040);
            ?? r15 = I;
            r15.X(r16);
            r14 = r15;
        } else {
            I.G();
            r14 = I;
        }
        e eVarZ = r14.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, i) { // from class: s1u
                public final /* synthetic */ boolean b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int iA = qj40.a(1);
                    c2u.a(this.a, this.b, (a) obj4, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final krf0 krf0Var, final Function0<Unit> function0, final Function0<Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(2045528484);
        int i2 = (bVarI.d(krf0Var.ordinal()) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVarG = androidx.compose.foundation.layout.j.g(aVar2, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            final float fB = mla.b(4.0f, bVarI);
            d dVarC2 = androidx.compose.ui.draw.a.c(g.b(aVar2, new Function1() { // from class: v1u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ((mmd) obj).getClass();
                    return new iwo(((long) ycv.b(fB / 2.0f)) << 32);
                }
            }), new Function1() { // from class: w1u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    lza lzaVar = (lza) obj;
                    lzaVar.getClass();
                    float[] fArrA = ddv.a();
                    fArrA[4] = (fB / Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L))) * (-1.0f);
                    qc6.b bVarF1 = lzaVar.F1();
                    long jD = bVarF1.d();
                    bVarF1.a().p();
                    try {
                        bVarF1.a.h(fArrA);
                        lzaVar.b2();
                        return Unit.a;
                    } finally {
                        hrh.a(bVarF1, jD);
                    }
                }
            });
            String strA = cb40.a(R.string.page_loyalty__congrats_upgrade_to, new Object[0], bVarI);
            v1k v1kVar = f8i.b;
            lkf0.d(strA, dVarC2, c68.a(R.color.text_type2_primary, bVarI), null, mla.m(26.0f, bVarI), null, new t9i(900), v1kVar, 0L, null, new gdf0(3), mla.m(30.47f, bVarI), 0, false, 0, 0, null, null, bVarI, 1572864, 0, 258856);
            d dVarJ = h.j(aVar2, 0.0f, 1.31f, 0.0f, 0.0f, 13);
            final float fB2 = mla.b(7.0f, bVarI);
            d dVarC3 = androidx.compose.ui.draw.a.c(g.b(dVarJ, new Function1() { // from class: v1u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ((mmd) obj).getClass();
                    return new iwo(((long) ycv.b(fB2 / 2.0f)) << 32);
                }
            }), new Function1() { // from class: w1u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    lza lzaVar = (lza) obj;
                    lzaVar.getClass();
                    float[] fArrA = ddv.a();
                    fArrA[4] = (fB2 / Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L))) * (-1.0f);
                    qc6.b bVarF1 = lzaVar.F1();
                    long jD = bVarF1.d();
                    bVarF1.a().p();
                    try {
                        bVarF1.a.h(fArrA);
                        lzaVar.b2();
                        return Unit.a;
                    } finally {
                        hrh.a(bVarF1, jD);
                    }
                }
            });
            String strA2 = cb40.a(krf0Var.b, new Object[0], bVarI);
            t9i t9iVar = new t9i(700);
            long jM = mla.m(44.0f, bVarI);
            long jM2 = mla.m(51.56f, bVarI);
            lkf0.d(strA2, dVarC3, krf0Var.c, null, jM, null, t9iVar, v1kVar, 0L, null, new gdf0(3), jM2, 0, false, 0, 0, null, new imf0(0L, 0L, null, null, null, 0L, null, new ix80(j58.b, 4, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(mla.b(4.0f, bVarI))) & 4294967295L), 0.0f), 0, 0L, null, null, 16769023), bVarI, 1572864, 0, 127784);
            bVarI = bVarI;
            c(h.j(aVar2, 0.0f, 1.54f, 0.0f, 0.0f, 13), krf0Var, function1, bVarI, ((i2 << 3) & 112) | 6 | (i2 & 896));
            c6n.a(function0, h.j(aVar2, 0.0f, 74.0f, 0.0f, 0.0f, 13), false, null, null, md9.a, bVarI, ((i2 >> 3) & 14) | 1572912, 60);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, i) { // from class: u1u
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    c2u.b(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final d dVar, final krf0 krf0Var, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVarI = aVar.i(1163948197);
        if ((i & 48) == 0) {
            i2 = (bVarI.d(krf0Var.ordinal()) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 >> 3;
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(llh0.b.a);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            Unit unit = Unit.a;
            boolean zA = ((((i4 & 14) ^ 6) > 4 && bVarI.d(krf0Var.ordinal())) || (i4 & 6) == 4) | bVarI.A(context);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new e2u(ytwVar, krf0Var, context, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, unit, (Function2) objY2);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = m.b(Boolean.FALSE);
                bVarI.r(objY3);
            }
            final ytw ytwVar2 = (ytw) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = new b(ytwVar2, null);
                bVarI.r(objY4);
            }
            xvf.e(bVarI, unit, (Function2) objY4);
            d dVarT = androidx.compose.foundation.layout.j.t(dVar, 360.0f, 320.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarT);
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
            dtg0 dtg0VarF = vtg0.f((llh0) ytwVar.getValue(), "dialog_state", bVarI, 48, 0);
            gzg0 gzg0VarE = yi0.e(500, 0, null, 6);
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = new z8b(1);
                bVarI.r(objY5);
            }
            q3c.a(dtg0VarF, null, gzg0VarE, (Function1) objY5, pp8.b(133088112, new gaj() { // from class: x1u
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    llh0 llh0Var = (llh0) obj;
                    a aVar3 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    llh0Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar3.M(llh0Var) ? 4 : 2;
                    }
                    if (aVar3.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        boolean z = llh0Var instanceof llh0.a;
                        Function0 function1 = function0;
                        if (z) {
                            aVar3.N(573214427);
                            c2u.d(((llh0.a) llh0Var).a, function1, aVar3, 0);
                            aVar3.H();
                        } else if (llh0Var.equals(llh0.b.a)) {
                            aVar3.N(573344317);
                            c2u.f(0, aVar3);
                            aVar3.H();
                        } else {
                            if (!(llh0Var instanceof llh0.c)) {
                                throw rg.a(-951342086, aVar3);
                            }
                            aVar3.N(573467170);
                            c2u.h(((llh0.c) llh0Var).a, ((Boolean) ytwVar2.getValue()).booleanValue(), function1, aVar3, 0);
                            aVar3.H();
                        }
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 28032, 1);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: y1u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    c2u.c(dVar, krf0Var, function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(f2u f2uVar, Function0<Unit> function0, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.b bVarI = aVar.i(319420777);
        int i2 = (bVarI.d(f2uVar == null ? -1 : f2uVar.ordinal()) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16);
        if (!bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            bVarI.G();
        } else if (f2uVar == null) {
            bVarI.N(-1783073528);
            bVarI.X(false);
        } else {
            bVarI.N(-1783073527);
            d.a aVar2 = d.a.b;
            d dVarE = androidx.compose.foundation.layout.j.e(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.b, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
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
            e(h.j(aVar2, 0.0f, 246.0f, 0.0f, 0.0f, 13), f2uVar, function0, bVarI, ((i2 << 3) & 896) | 6);
            bVarI.X(true);
            bVarI.X(false);
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new b2u(f2uVar, function0, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(final d dVar, final f2u f2uVar, final Function0 function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(783003869);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.d(f2uVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        int i3 = 1;
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            d dVarT = androidx.compose.foundation.layout.j.t(dVar, 200.0f, 44.0f);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = rzk.a(bVarI);
            }
            d dVarB = androidx.compose.foundation.d.b(dVarT, (psw) objY2, ut50.b(0.0f, 7, 0L, false), false, null, function0, 28);
            Unit unit = Unit.a;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new d2u(ytwVar);
                bVarI.r(objY3);
            }
            bVar = bVarI;
            rg6.a(dw.a(wje0.a(dVarB, unit, (PointerInputEventHandler) objY3), ((Boolean) ytwVar.getValue()).booleanValue() ? 0.75f : 1.0f), j060.c(4.0f), null, null, new l35(2.0f, ya5.a.a(0.0f, 0.0f, 14, f2uVar.b)), pp8.b(-1299948629, new jpf(f2uVar, i3), bVarI), bVar, 196608, 12);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: t1u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    c2u.e(dVar, f2uVar, function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(-778203376);
        if (bVarI.q(i & 1, i != 0)) {
            d.a aVar2 = d.a.b;
            d dVarE = androidx.compose.foundation.layout.j.e(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
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
            q330.a(androidx.compose.foundation.layout.j.r(aVar2, 46.0f), j58.f, 4.0f, 0L, 0, 0.0f, bVarI, 438, 56);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new z1u();
        }
    }

    public static final void g(final krf0 krf0Var, final Function0<Unit> function0, final Function0<Unit> function1, androidx.compose.runtime.a aVar, final int i) {
        krf0Var.getClass();
        function0.getClass();
        function1.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(304046985);
        int i2 = (bVarI.d(krf0Var.ordinal()) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d dVarE = androidx.compose.foundation.layout.j.e(d.a.b, 1.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
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
            b(krf0Var, function0, function1, bVarI, i2 & 1022);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, i) { // from class: r1u
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    c2u.g(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(final f2u f2uVar, final boolean z, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-256229429);
        int i2 = (bVarI.d(f2uVar.ordinal()) ? 4 : 2) | i | (bVarI.b(z) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            d dVarE = androidx.compose.foundation.layout.j.e(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.b, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
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
            mw90.a(f2uVar.d, "bg", androidx.compose.foundation.layout.j.t(aVar2, 360.0f, 320.0f), null, null, null, null, bVarI, 432, 2040);
            a(f2uVar, z, bVarI, i2 & WebSocketProtocol.PAYLOAD_SHORT);
            e(h.j(aVar2, 0.0f, 246.0f, 0.0f, 0.0f, 13), f2uVar, function0, bVarI, (i2 & 896) | ((i2 << 3) & 112) | 6);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, function0, i) { // from class: a2u
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    c2u.h(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
