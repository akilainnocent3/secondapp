package defpackage;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.r;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.loyalty.impl.challenge.presentation.model.ChallengeCardStatus;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class hz6 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ChallengeCardStatus.values().length];
            try {
                iArr[ChallengeCardStatus.Available.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChallengeCardStatus.Ongoing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChallengeCardStatus.Completed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChallengeCardStatus.Upcoming.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChallengeCardStatus.EntryClosed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ChallengeCardStatus.Cancelled.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ChallengeCardStatus.Expired.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ChallengeCardStatus.Conflicted.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            a = iArr;
        }
    }

    static {
        StringUiText stringUiText = vch0.a;
        new iz6(1L, null, new StringUiText("Ends at: 5 Jan 23:59"), null, 0L, "NGN 9,999,999,999", "Biggest Net Profit", 0, 0, new StringUiText("1,000 challengers joined"), new StringUiText("* Last Acceptance Time: 3 Jan 23:59"), null, null, false, null, new uz6("Rank in the Top 100 Net Winning Amount of Real Sport.", new StringUiText("Note: Only participants with at least one eligible bet will be ranked on the leaderboard."), a4h.a(new a27("NGN 9,999,999,999", new StringUiText("Champion"), R.drawable.img_crown), new a27("NGN 99,999", new StringUiText("Leaderboard Top 100"), R.drawable.img_money_bag)), new StringUiText("From 1 Jan 23:59 to 5 Jan 23:59"), a4h.a(new r27(new StringUiText("Bet Type"), new StringUiText("Single")), new r27(new StringUiText("Minimum stake per bet"), new StringUiText("at least NGN 150")), new r27(new StringUiText("Total Odds per bet"), new StringUiText("Over 1.5")), new r27(new StringUiText("Gift Usage"), new StringUiText("Must use Gift")), new r27(new StringUiText("Cash Out"), new StringUiText("Can not cash out")))), 0, 457114);
    }

    public static final void a(int i, androidx.compose.runtime.a aVar, d dVar, String str, Function0 function0) {
        b bVarI = aVar.i(1467067721);
        int i2 = (bVarI.M(str) ? 4 : 2) | i | (bVarI.M(dVar) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            alb0 alb0Var = sya.c;
            umz umzVar = ek5.a;
            ak5 ak5VarA = ek5.a(((ast) bVarI.O(cst.e)).E, ((lib0) bVarI.O(oib0.a)).o, 0L, 0L, bVarI, 12);
            bVarI = bVarI;
            xya.a(dVar, false, str, null, alb0Var, ak5VarA, null, null, null, function0, bVarI, ((i2 >> 3) & 14) | ((i2 << 6) & 896) | ((i2 << 21) & 1879048192), 458);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new zy6(i, dVar, str, function0);
        }
    }

    public static final void b(final iz6 iz6Var, final Function1<? super rw6, Unit> function1, d dVar, UiText uiText, boolean z, androidx.compose.runtime.a aVar, final int i, final int i2) {
        UiText uiText2;
        int i3;
        final boolean z2;
        int i4;
        b bVar;
        final d dVar2;
        final UiText uiText3;
        String str;
        iz6Var.getClass();
        function1.getClass();
        b bVarI = aVar.i(-1110715775);
        int i5 = i | (bVarI.M(iz6Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i5 |= bVarI.A(function1) ? 32 : 16;
        }
        int i6 = i5 | 384;
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 = i5 | 3456;
            uiText2 = uiText;
        } else {
            uiText2 = uiText;
            i3 = i6 | (bVarI.M(uiText2) ? 2048 : 1024);
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i4 = i3 | 24576;
            z2 = z;
        } else {
            z2 = z;
            i4 = i3 | (bVarI.b(z2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        }
        int i9 = i4;
        if (bVarI.q(i9 & 1, (i9 & 9363) != 9362)) {
            if (i7 != 0) {
                uiText2 = null;
            }
            UiText uiText4 = uiText2;
            boolean z3 = i8 != 0 ? false : z2;
            final float f = ((zib0) bVarI.O(ajb0.a)).d;
            final long j = ((ast) bVarI.O(cst.e)).a;
            d.a aVar2 = d.a.b;
            d dVarA = ls7.a(j.g(aVar2, 1.0f), j060.c(f));
            boolean zC = bVarI.c(f) | bVarI.e(j);
            Object objY = bVarI.y();
            if (zC || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: by6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) throws Throwable {
                        long j2;
                        lza lzaVar = (lza) obj;
                        lzaVar.getClass();
                        lzaVar.b2();
                        float fC1 = lzaVar.C1(3.0f);
                        float fC2 = lzaVar.C1(f);
                        lc6 lc6VarA = lzaVar.F1().a();
                        b90 b90VarA = c90.a();
                        Paint paint = b90VarA.a;
                        paint.setAntiAlias(true);
                        paint.setStyle(Paint.Style.STROKE);
                        paint.setStrokeWidth(fC1);
                        paint.setColor(r58.l(j));
                        paint.setMaskFilter(new BlurMaskFilter(fC1, BlurMaskFilter.Blur.NORMAL));
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (lzaVar.d() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L));
                        qc6.b bVarF1 = lzaVar.F1();
                        long jD = bVarF1.d();
                        bVarF1.a().p();
                        try {
                            bVarF1.a.b(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                            j2 = jD;
                            try {
                                lc6VarA.l(0.0f, 0.0f, Float.intBitsToFloat((int) (lzaVar.d() >> 32)), Float.intBitsToFloat((int) (4294967295L & lzaVar.d())), fC2, fC2, b90VarA);
                                hrh.a(bVarF1, j2);
                                return Unit.a;
                            } catch (Throwable th) {
                                th = th;
                                hrh.a(bVarF1, j2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j2 = jD;
                        }
                    }
                };
                bVarI.r(objY);
            }
            d dVarC = androidx.compose.ui.draw.a.c(dVarA, (Function1) objY);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarC);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC2, cVar);
            if (iz6Var.n) {
                kz6 kz6Var = kz6.BiggestNetProfitBg;
                str = "https://s.sporty.net/cms/challenage_Card_Bg_3x_df8eb29a85.png";
            } else {
                kz6 kz6Var2 = kz6.BiggestNetProfitBg;
                str = "https://s.sporty.net/cms/challenge_card_default_bg_50c8932bf6.png";
            }
            mw90.a(str, null, androidx.compose.foundation.layout.d.a.f(aVar2), null, null, d0b.a.g, null, bVarI, 1572912, 1976);
            d dVarA2 = ls7.a(j.g(aVar2, 1.0f), j060.c(f));
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarA2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            e(iz6Var.l == ChallengeCardStatus.Upcoming, iz6Var.b, iz6Var.c, uiText4, iz6Var.f, null, bVarI, i9 & 7168);
            bVar = bVarI;
            d(iz6Var, z3, function1, null, bVar, (i9 & 14) | ((i9 >> 9) & 112) | ((i9 << 3) & 896));
            bVar.X(true);
            bVar.X(true);
            z2 = z3;
            dVar2 = aVar2;
            uiText3 = uiText4;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
            uiText3 = uiText2;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ly6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hz6.b(iz6Var, function1, dVar2, uiText3, z2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final long j, final String str, final ChallengeCardStatus challengeCardStatus, final boolean z, final boolean z2, final Function1 function1, d dVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final d dVar2;
        b bVarI = aVar.i(-1900496643);
        if ((i & 6) == 0) {
            i2 = (bVarI.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.d(challengeCardStatus.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.b(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.b(z2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function1) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if (bVarI.q(i3 & 1, (599187 & i3) != 599186)) {
            int i4 = a.a[challengeCardStatus.ordinal()];
            d.a aVar2 = d.a.b;
            switch (i4) {
                case 1:
                    bVarI.N(-1436256599);
                    String strA = cb40.a(z2 ? R.string.page_loyalty__challenge_card_accept : R.string.page_loyalty__login_to_join, new Object[0], bVarI);
                    uxs uxsVar = z ? uxs.LOADING : uxs.ENABLE;
                    alb0 alb0Var = sya.c;
                    qyd0 qyd0Var = cst.e;
                    long j2 = ((ast) bVarI.O(qyd0Var)).E;
                    qyd0 qyd0Var2 = oib0.a;
                    ak5 ak5VarA = sya.a(j2, ((lib0) bVarI.O(qyd0Var2)).o, 0L, 0L, bVarI, 24576, 12);
                    ak5 ak5VarC = sya.c(((ast) bVarI.O(qyd0Var)).E, ((lib0) bVarI.O(qyd0Var2)).o, bVarI, 384, 0);
                    d dVarH = h.h(j.g(aVar2, 1.0f), ((cjb0) bVarI.O(ejb0.a)).f, 0.0f, 2);
                    boolean z3 = ((i3 & 458752) == 131072) | ((i3 & 14) == 4);
                    Object objY = bVarI.y();
                    if (z3 || objY == androidx.compose.runtime.a.C0041a.a) {
                        objY = new Function0() { // from class: ez6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(new rw6.b(j));
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY);
                    }
                    aza.a(dVarH, strA, uxsVar, null, alb0Var, ak5VarA, ak5VarC, null, (Function0) objY, null, bVarI, 0, 648);
                    bVarI = bVarI;
                    bVarI.X(false);
                    break;
                case 2:
                    bVarI.N(-1434875270);
                    j(((i3 >> 18) & 14) | 48, pp8.b(1739157462, new gaj() { // from class: fz6
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            e160 e160Var = (e160) obj;
                            a aVar3 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            e160Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= aVar3.M(e160Var) ? 4 : 2;
                            }
                            if (aVar3.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                final Function1 function2 = function1;
                                boolean zM = aVar3.M(function2);
                                final long j3 = j;
                                boolean zE = zM | aVar3.e(j3);
                                Object objY2 = aVar3.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zE || objY2 == c0042a) {
                                    objY2 = new Function0() { // from class: my6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function2.invoke(new rw6.f(j3));
                                            return Unit.a;
                                        }
                                    };
                                    aVar3.r(objY2);
                                }
                                hz6.k(e160Var, (Function0) objY2, aVar3, iIntValue & 14);
                                String strA2 = cb40.a(R.string.page_loyalty__challenge_card_bet_now, new Object[0], aVar3);
                                d dVarA = e160Var.a(1.0f, d.a.b, true);
                                boolean zM2 = aVar3.M(function2);
                                String str2 = str;
                                boolean zM3 = zM2 | aVar3.M(str2);
                                Object objY3 = aVar3.y();
                                if (zM3 || objY3 == c0042a) {
                                    objY3 = new ny6(0, function2, str2);
                                    aVar3.r(objY3);
                                }
                                hz6.a(0, aVar3, dVarA, strA2, (Function0) objY3);
                            } else {
                                aVar3.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI);
                    bVarI.X(false);
                    break;
                case 3:
                    bVarI.N(-1434136633);
                    j(((i3 >> 18) & 14) | 48, pp8.b(-1373577099, new gaj() { // from class: gz6
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            e160 e160Var = (e160) obj;
                            a aVar3 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            e160Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= aVar3.M(e160Var) ? 4 : 2;
                            }
                            if (aVar3.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                final Function1 function2 = function1;
                                boolean zM = aVar3.M(function2);
                                final long j3 = j;
                                boolean zE = aVar3.e(j3) | zM;
                                Object objY2 = aVar3.y();
                                if (zE || objY2 == a.C0041a.a) {
                                    objY2 = new Function0() { // from class: ky6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function2.invoke(new rw6.f(j3));
                                            return Unit.a;
                                        }
                                    };
                                    aVar3.r(objY2);
                                }
                                int i5 = iIntValue & 14;
                                hz6.k(e160Var, (Function0) objY2, aVar3, i5);
                                hz6.i(e160Var, cb40.a(R.string.page_loyalty__completed, new Object[0], aVar3), false, aVar3, i5, 2);
                            } else {
                                aVar3.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI);
                    bVarI.X(false);
                    break;
                case 4:
                    bVarI.N(-1433811288);
                    h(0, bVarI, h.h(j.g(aVar2, 1.0f), ((cjb0) bVarI.O(ejb0.a)).f, 0.0f, 2), cb40.a(R.string.page_loyalty__challenge_card_coming_soon, new Object[0], bVarI));
                    bVarI.X(false);
                    break;
                case 5:
                    bVarI.N(-1433480859);
                    j(((i3 >> 18) & 14) | 48, pp8.b(990888371, new gaj() { // from class: cy6
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            e160 e160Var = (e160) obj;
                            a aVar3 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            e160Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= aVar3.M(e160Var) ? 4 : 2;
                            }
                            if (aVar3.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                final Function1 function2 = function1;
                                boolean zM = aVar3.M(function2);
                                final long j3 = j;
                                boolean zE = aVar3.e(j3) | zM;
                                Object objY2 = aVar3.y();
                                if (zE || objY2 == a.C0041a.a) {
                                    objY2 = new Function0() { // from class: ry6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function2.invoke(new rw6.f(j3));
                                            return Unit.a;
                                        }
                                    };
                                    aVar3.r(objY2);
                                }
                                int i5 = iIntValue & 14;
                                hz6.k(e160Var, (Function0) objY2, aVar3, i5);
                                hz6.i(e160Var, cb40.a(R.string.page_loyalty__challenge_card_entry_closed, new Object[0], aVar3), true, aVar3, i5 | 384, 0);
                            } else {
                                aVar3.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI);
                    bVarI.X(false);
                    break;
                case 6:
                    bVarI.N(-1433057399);
                    j(((i3 >> 18) & 14) | 48, pp8.b(-2121846190, new gaj() { // from class: dy6
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            e160 e160Var = (e160) obj;
                            a aVar3 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            e160Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= aVar3.M(e160Var) ? 4 : 2;
                            }
                            if (aVar3.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                final Function1 function2 = function1;
                                boolean zM = aVar3.M(function2);
                                final long j3 = j;
                                boolean zE = aVar3.e(j3) | zM;
                                Object objY2 = aVar3.y();
                                if (zE || objY2 == a.C0041a.a) {
                                    objY2 = new Function0() { // from class: py6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function2.invoke(new rw6.f(j3));
                                            return Unit.a;
                                        }
                                    };
                                    aVar3.r(objY2);
                                }
                                int i5 = iIntValue & 14;
                                hz6.k(e160Var, (Function0) objY2, aVar3, i5);
                                hz6.i(e160Var, cb40.a(R.string.page_loyalty__challenge_card_canceled, new Object[0], aVar3), true, aVar3, i5 | 384, 0);
                            } else {
                                aVar3.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI);
                    bVarI.X(false);
                    break;
                case 7:
                    bVarI.N(-1432640263);
                    j(((i3 >> 18) & 14) | 48, pp8.b(-939613455, new gaj() { // from class: ey6
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            e160 e160Var = (e160) obj;
                            a aVar3 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            e160Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= aVar3.M(e160Var) ? 4 : 2;
                            }
                            if (aVar3.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                final Function1 function2 = function1;
                                boolean zM = aVar3.M(function2);
                                final long j3 = j;
                                boolean zE = aVar3.e(j3) | zM;
                                Object objY2 = aVar3.y();
                                if (zE || objY2 == a.C0041a.a) {
                                    objY2 = new Function0() { // from class: uy6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function2.invoke(new rw6.f(j3));
                                            return Unit.a;
                                        }
                                    };
                                    aVar3.r(objY2);
                                }
                                int i5 = iIntValue & 14;
                                hz6.k(e160Var, (Function0) objY2, aVar3, i5);
                                hz6.i(e160Var, cb40.a(R.string.page_loyalty__expired, new Object[0], aVar3), true, aVar3, i5 | 384, 0);
                            } else {
                                aVar3.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI);
                    bVarI.X(false);
                    break;
                case 8:
                    bVarI.N(-1432237635);
                    h(0, bVarI, h.h(j.g(aVar2, 1.0f), ((cjb0) bVarI.O(ejb0.a)).f, 0.0f, 2), cb40.a(R.string.page_loyalty__challenge_card_finish_current_to_join, new Object[0], bVarI));
                    bVarI.X(false);
                    break;
                default:
                    throw igf0.a(bVarI, -1016160935, false);
            }
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: fy6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hz6.c(j, str, challengeCardStatus, z, z2, function1, dVar2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0476  */
    /* JADX WARN: Code duplicated, block: B:109:0x0483  */
    /* JADX WARN: Code duplicated, block: B:112:0x048a  */
    /* JADX WARN: Code duplicated, block: B:114:0x048e  */
    /* JADX WARN: Code duplicated, block: B:117:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:120:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:85:0x036a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x0370  */
    /* JADX WARN: Code duplicated, block: B:91:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:93:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:96:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:98:0x03f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    public static final void d(iz6 iz6Var, final boolean z, final Function1 function1, d dVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final Function1 function2;
        b bVar;
        final d dVar2;
        yka.a.C1350a c1350a;
        ChallengeCardStatus challengeCardStatus;
        yka.a.b bVar2;
        tsr.a aVar2;
        yka.a.d dVar3;
        int i3;
        float f;
        float f2;
        d.a aVar3;
        final iz6 iz6Var2;
        ?? r7;
        int i4;
        Object objY;
        int iHashCode;
        b bVar3;
        ?? r15;
        Object objY2;
        ?? r4;
        final iz6 iz6Var3 = iz6Var;
        b bVarI = aVar.i(-985085299);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(iz6Var3) : bVarI.A(iz6Var3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        int i5 = i2 | 3072;
        if (bVarI.q(i5 & 1, (i5 & 1171) != 1170)) {
            d.a aVar4 = d.a.b;
            d dVarG = j.g(aVar4, 1.0f);
            qyd0 qyd0Var = cst.e;
            d dVarJ = h.j(androidx.compose.foundation.a.a(dVarG, new hfs(kotlin.collections.b.k(new j58(((ast) bVarI.O(qyd0Var)).I), new j58(j58.c(0.5f, ((ast) bVarI.O(qyd0Var)).E))), null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), null, 0.0f, 6), 0.0f, 0.0f, 0.0f, fjb0.d(bVarI).f, 7);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            yka.a.b bVar4 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar4);
            yka.a.d dVar4 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar4);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            String str = iz6Var3.g;
            ChallengeCardStatus challengeCardStatus2 = iz6Var3.l;
            b bVar5 = bVarI;
            f(str, challengeCardStatus2 == ChallengeCardStatus.Ongoing, iz6Var3.j, h.j(aVar4, fjb0.d(bVarI).f, 0.0f, fjb0.d(bVarI).f, fjb0.d(bVarI).f, 2), bVar5, 0);
            ChallengeCardStatus challengeCardStatus3 = ChallengeCardStatus.Available;
            l78 l78Var = l78.a;
            if (challengeCardStatus2 == challengeCardStatus3 || challengeCardStatus2 == ChallengeCardStatus.EntryClosed || challengeCardStatus2 == ChallengeCardStatus.Conflicted) {
                bVar5.N(730091123);
                UiText uiText = iz6Var3.k;
                uiText.getClass();
                c1350a = c1350a2;
                challengeCardStatus = challengeCardStatus2;
                bVar2 = bVar4;
                aVar2 = aVar5;
                dVar3 = dVar4;
                i3 = 0;
                lkf0.d(uiText.g((Context) bVar5.O(AndroidCompositionLocals_androidKt.b)), l78Var.c(ht.a.n, h.j(aVar4, 0.0f, 0.0f, 0.0f, fjb0.d(bVar5).d, 7)), fjb0.b(bVar5).q, null, 0L, null, null, null, mla.m(-0.1f, bVar5), null, null, 0L, 0, false, 0, 0, null, imf0.b(fjb0.e(bVar5).q, 0L, 0L, t9i.C, null, null, 0L, null, null, null, 0, 0L, null, null, 16777211), bVar5, 0, 0, 130808);
                bVar5 = bVar5;
                bVar5.X(false);
                f = 1.0f;
            } else {
                bVar5.N(730493131);
                bVar5.X(false);
                challengeCardStatus = challengeCardStatus2;
                i3 = 0;
                c1350a = c1350a2;
                aVar2 = aVar5;
                bVar2 = bVar4;
                dVar3 = dVar4;
                f = 1.0f;
            }
            float f3 = f;
            b bVar6 = bVar5;
            ChallengeCardStatus challengeCardStatus4 = challengeCardStatus;
            c(iz6Var3.a, iz6Var3.p, iz6Var3.l, z, iz6Var3.s, function1, null, bVar6, ((i5 << 6) & 7168) | ((i5 << 9) & 458752));
            b bVar7 = bVar6;
            if (challengeCardStatus4 == ChallengeCardStatus.Conflicted) {
                bVar7.N(730905710);
                f2 = f3;
                aVar3 = aVar4;
                lkf0.d(cb40.a(R.string.page_loyalty__challenge_card_conflict_hint, new Object[i3], bVar7), h.g(j.g(aVar4, f3), fjb0.d(bVar7).f, fjb0.d(bVar7).d), fjb0.b(bVar7).e, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, fjb0.e(bVar7).q, bVar7, 0, 0, 130040);
                bVar7 = bVar7;
                bVar7.X(i3);
            } else {
                f2 = f3;
                aVar3 = r16;
                bVar7.N(731312523);
                bVar7.X(i3);
            }
            d dVarG2 = j.g(aVar3, f2);
            ?? r16 = (i5 & 896) == 256 ? 1 : i3;
            int i6 = i5 & 14;
            if (i6 != 4) {
                if ((i5 & 8) != 0) {
                    iz6Var2 = iz6Var;
                    if (bVar7.A(iz6Var2)) {
                    }
                    i4 = r7 | r16;
                    objY = bVar7.y();
                    androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (i4 == 0 || objY == c0042a) {
                        objY = new Function0() { // from class: wy6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(new rw6.l(iz6Var2.a));
                                return Unit.a;
                            }
                        };
                        bVar7.r(objY);
                    }
                    d dVarH = h.h(h.j(androidx.compose.foundation.d.d(dVarG2, false, null, null, (Function0) objY, 15), fjb0.d(bVar7).f, 18.0f, fjb0.d(bVar7).f, 0.0f, 8), fjb0.d(bVar7).f, 0.0f, 2);
                    d160 d160VarA = b160.a(kw0.a, ht.a.k, bVar7, 48);
                    iHashCode = Long.hashCode(bVar7.T);
                    ne00 ne00VarS2 = bVar7.S();
                    d dVarC2 = c.c(bVar7, dVarH);
                    bVar7.D();
                    if (bVar7.S) {
                        bVar7.F(aVar2);
                    } else {
                        bVar7.p();
                    }
                    hlh0.a(bVar7, d160VarA, bVar2);
                    hlh0.a(bVar7, ne00VarS2, dVar3);
                    if (bVar7.S || !Intrinsics.g(bVar7.y(), Integer.valueOf(iHashCode))) {
                        n30.a(iHashCode, bVar7, iHashCode, c1350a);
                    }
                    hlh0.a(bVar7, dVarC2, cVar);
                    String strA = cb40.a(R.string.page_loyalty__challenge_card_details, new Object[i3], bVar7);
                    imf0 imf0Var = fjb0.e(bVar7).g;
                    long j = fjb0.b(bVar7).o;
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f2, true);
                    bVar3 = bVar7;
                    iz6Var3 = iz6Var;
                    lkf0.d(strA, layoutWeightElement, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVar3, 0, 0, 131064);
                    crz crzVarA = pib0.a(R.drawable.ic__arrow_chevron_down, i3, bVar3);
                    d dVarR = j.r(aVar3, 20.0f);
                    if (i6 != 4 || ((i5 & 8) != 0 && bVar3.A(iz6Var3))) {
                        r15 = 1;
                    } else {
                        r15 = i3;
                    }
                    objY2 = bVar3.y();
                    if (r15 == 0 || objY2 == c0042a) {
                        objY2 = new az6(iz6Var3, i3);
                        bVar3.r(objY2);
                    }
                    h6n.b(crzVarA, null, androidx.compose.ui.graphics.a.a(dVarR, (Function1) objY2), fjb0.b(bVar3).a0, bVar3, 48, 0);
                    bVar3.X(true);
                    if (iz6Var3.n || iz6Var3.q == null) {
                        r4 = i3;
                    } else {
                        r4 = 1;
                    }
                    function2 = function1;
                    hh0.b(l78Var, r4, null, null, null, null, pp8.b(-269409921, new gaj() { // from class: bz6
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            a aVar6 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((jh0) obj).getClass();
                            if (aVar6.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                final iz6 iz6Var4 = iz6Var3;
                                if (iz6Var4.q != null) {
                                    aVar6.N(1303019380);
                                    ChallengeCardStatus challengeCardStatus5 = iz6Var4.l;
                                    ChallengeCardStatus challengeCardStatus6 = ChallengeCardStatus.Ongoing;
                                    boolean z2 = challengeCardStatus5 == challengeCardStatus6;
                                    uz6 uz6Var = iz6Var4.q;
                                    boolean z3 = iz6Var4.s && (challengeCardStatus5 == ChallengeCardStatus.Available || challengeCardStatus5 == challengeCardStatus6);
                                    d dVarH2 = h.h(h.j(d.a.b, 0.0f, 10.0f, 0.0f, 0.0f, 13), ((cjb0) aVar6.O(ejb0.a)).f, 0.0f, 2);
                                    final Function1 function3 = function2;
                                    boolean zM = aVar6.M(function3) | aVar6.A(iz6Var4);
                                    Object objY3 = aVar6.y();
                                    a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                    if (zM || objY3 == c0042a2) {
                                        objY3 = new Function0() { // from class: iy6
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                function3.invoke(new rw6.i(iz6Var4.p, rw6.j.b));
                                                return Unit.a;
                                            }
                                        };
                                        aVar6.r(objY3);
                                    }
                                    Function0 function0 = (Function0) objY3;
                                    boolean zM2 = aVar6.M(function3);
                                    Object objY4 = aVar6.y();
                                    if (zM2 || objY4 == c0042a2) {
                                        objY4 = new pv1(1, function3);
                                        aVar6.r(objY4);
                                    }
                                    Function0 function4 = (Function0) objY4;
                                    boolean zM3 = aVar6.M(function3) | aVar6.A(iz6Var4);
                                    Object objY5 = aVar6.y();
                                    if (zM3 || objY5 == c0042a2) {
                                        objY5 = new Function0() { // from class: jy6
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                function3.invoke(new rw6.d(iz6Var4.a));
                                                return Unit.a;
                                            }
                                        };
                                        aVar6.r(objY5);
                                    }
                                    ay6.a(z2, uz6Var, function0, function4, (Function0) objY5, dVarH2, z3, aVar6, 0, 0);
                                    aVar6.H();
                                } else {
                                    aVar6.N(1304370019);
                                    aVar6.H();
                                }
                            } else {
                                aVar6.G();
                            }
                            return Unit.a;
                        }
                    }, bVar3), bVar3, 1572870, 30);
                    bVar = bVar3;
                    bVar.X(true);
                    dVar2 = aVar3;
                } else {
                    iz6Var2 = iz6Var;
                }
                r7 = i3;
                i4 = r7 | r16;
                objY = bVar7.y();
                androidx.compose.runtime.a.C0041a.C0042a c0042a2 = androidx.compose.runtime.a.C0041a.a;
                if (i4 == 0) {
                    objY = new Function0() { // from class: wy6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(new rw6.l(iz6Var2.a));
                            return Unit.a;
                        }
                    };
                    bVar7.r(objY);
                } else {
                    objY = new Function0() { // from class: wy6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(new rw6.l(iz6Var2.a));
                            return Unit.a;
                        }
                    };
                    bVar7.r(objY);
                }
                d dVarH2 = h.h(h.j(androidx.compose.foundation.d.d(dVarG2, false, null, null, (Function0) objY, 15), fjb0.d(bVar7).f, 18.0f, fjb0.d(bVar7).f, 0.0f, 8), fjb0.d(bVar7).f, 0.0f, 2);
                d160 d160VarA2 = b160.a(kw0.a, ht.a.k, bVar7, 48);
                iHashCode = Long.hashCode(bVar7.T);
                ne00 ne00VarS3 = bVar7.S();
                d dVarC3 = c.c(bVar7, dVarH2);
                bVar7.D();
                if (bVar7.S) {
                    bVar7.F(aVar2);
                } else {
                    bVar7.p();
                }
                hlh0.a(bVar7, d160VarA2, bVar2);
                hlh0.a(bVar7, ne00VarS3, dVar3);
                if (bVar7.S) {
                    n30.a(iHashCode, bVar7, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVar7, iHashCode, c1350a);
                }
                hlh0.a(bVar7, dVarC3, cVar);
                String strA2 = cb40.a(R.string.page_loyalty__challenge_card_details, new Object[i3], bVar7);
                imf0 imf0Var2 = fjb0.e(bVar7).g;
                long j2 = fjb0.b(bVar7).o;
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(f2, true);
                bVar3 = bVar7;
                iz6Var3 = iz6Var;
                lkf0.d(strA2, layoutWeightElement2, j2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var2, bVar3, 0, 0, 131064);
                crz crzVarA2 = pib0.a(R.drawable.ic__arrow_chevron_down, i3, bVar3);
                d dVarR2 = j.r(aVar3, 20.0f);
                if (i6 != 4) {
                    r15 = 1;
                } else {
                    r15 = 1;
                }
                objY2 = bVar3.y();
                if (r15 == 0) {
                    objY2 = new az6(iz6Var3, i3);
                    bVar3.r(objY2);
                } else {
                    objY2 = new az6(iz6Var3, i3);
                    bVar3.r(objY2);
                }
                h6n.b(crzVarA2, null, androidx.compose.ui.graphics.a.a(dVarR2, (Function1) objY2), fjb0.b(bVar3).a0, bVar3, 48, 0);
                bVar3.X(true);
                if (iz6Var3.n) {
                    r4 = i3;
                } else {
                    r4 = i3;
                }
                function2 = function1;
                hh0.b(l78Var, r4, null, null, null, null, pp8.b(-269409921, new gaj() { // from class: bz6
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar6 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((jh0) obj).getClass();
                        if (aVar6.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            final iz6 iz6Var4 = iz6Var3;
                            if (iz6Var4.q != null) {
                                aVar6.N(1303019380);
                                ChallengeCardStatus challengeCardStatus5 = iz6Var4.l;
                                ChallengeCardStatus challengeCardStatus6 = ChallengeCardStatus.Ongoing;
                                boolean z2 = challengeCardStatus5 == challengeCardStatus6;
                                uz6 uz6Var = iz6Var4.q;
                                boolean z3 = iz6Var4.s && (challengeCardStatus5 == ChallengeCardStatus.Available || challengeCardStatus5 == challengeCardStatus6);
                                d dVarH3 = h.h(h.j(d.a.b, 0.0f, 10.0f, 0.0f, 0.0f, 13), ((cjb0) aVar6.O(ejb0.a)).f, 0.0f, 2);
                                final Function1 function3 = function2;
                                boolean zM = aVar6.M(function3) | aVar6.A(iz6Var4);
                                Object objY3 = aVar6.y();
                                a.C0041a.C0042a c0042a3 = a.C0041a.a;
                                if (zM || objY3 == c0042a3) {
                                    objY3 = new Function0() { // from class: iy6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function3.invoke(new rw6.i(iz6Var4.p, rw6.j.b));
                                            return Unit.a;
                                        }
                                    };
                                    aVar6.r(objY3);
                                }
                                Function0 function0 = (Function0) objY3;
                                boolean zM2 = aVar6.M(function3);
                                Object objY4 = aVar6.y();
                                if (zM2 || objY4 == c0042a3) {
                                    objY4 = new pv1(1, function3);
                                    aVar6.r(objY4);
                                }
                                Function0 function4 = (Function0) objY4;
                                boolean zM3 = aVar6.M(function3) | aVar6.A(iz6Var4);
                                Object objY5 = aVar6.y();
                                if (zM3 || objY5 == c0042a3) {
                                    objY5 = new Function0() { // from class: jy6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function3.invoke(new rw6.d(iz6Var4.a));
                                            return Unit.a;
                                        }
                                    };
                                    aVar6.r(objY5);
                                }
                                ay6.a(z2, uz6Var, function0, function4, (Function0) objY5, dVarH3, z3, aVar6, 0, 0);
                                aVar6.H();
                            } else {
                                aVar6.N(1304370019);
                                aVar6.H();
                            }
                        } else {
                            aVar6.G();
                        }
                        return Unit.a;
                    }
                }, bVar3), bVar3, 1572870, 30);
                bVar = bVar3;
                bVar.X(true);
                dVar2 = aVar3;
            } else {
                iz6Var2 = iz6Var;
            }
            r7 = 1;
            i4 = r7 | r16;
            objY = bVar7.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a3 = androidx.compose.runtime.a.C0041a.a;
            if (i4 == 0) {
                objY = new Function0() { // from class: wy6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(new rw6.l(iz6Var2.a));
                        return Unit.a;
                    }
                };
                bVar7.r(objY);
            } else {
                objY = new Function0() { // from class: wy6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function1.invoke(new rw6.l(iz6Var2.a));
                        return Unit.a;
                    }
                };
                bVar7.r(objY);
            }
            d dVarH3 = h.h(h.j(androidx.compose.foundation.d.d(dVarG2, false, null, null, (Function0) objY, 15), fjb0.d(bVar7).f, 18.0f, fjb0.d(bVar7).f, 0.0f, 8), fjb0.d(bVar7).f, 0.0f, 2);
            d160 d160VarA3 = b160.a(kw0.a, ht.a.k, bVar7, 48);
            iHashCode = Long.hashCode(bVar7.T);
            ne00 ne00VarS4 = bVar7.S();
            d dVarC4 = c.c(bVar7, dVarH3);
            bVar7.D();
            if (bVar7.S) {
                bVar7.F(aVar2);
            } else {
                bVar7.p();
            }
            hlh0.a(bVar7, d160VarA3, bVar2);
            hlh0.a(bVar7, ne00VarS4, dVar3);
            if (bVar7.S) {
                n30.a(iHashCode, bVar7, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVar7, iHashCode, c1350a);
            }
            hlh0.a(bVar7, dVarC4, cVar);
            String strA3 = cb40.a(R.string.page_loyalty__challenge_card_details, new Object[i3], bVar7);
            imf0 imf0Var3 = fjb0.e(bVar7).g;
            long j3 = fjb0.b(bVar7).o;
            LayoutWeightElement layoutWeightElement3 = new LayoutWeightElement(f2, true);
            bVar3 = bVar7;
            iz6Var3 = iz6Var;
            lkf0.d(strA3, layoutWeightElement3, j3, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var3, bVar3, 0, 0, 131064);
            crz crzVarA3 = pib0.a(R.drawable.ic__arrow_chevron_down, i3, bVar3);
            d dVarR3 = j.r(aVar3, 20.0f);
            if (i6 != 4) {
                r15 = 1;
            } else {
                r15 = 1;
            }
            objY2 = bVar3.y();
            if (r15 == 0) {
                objY2 = new az6(iz6Var3, i3);
                bVar3.r(objY2);
            } else {
                objY2 = new az6(iz6Var3, i3);
                bVar3.r(objY2);
            }
            h6n.b(crzVarA3, null, androidx.compose.ui.graphics.a.a(dVarR3, (Function1) objY2), fjb0.b(bVar3).a0, bVar3, 48, 0);
            bVar3.X(true);
            if (iz6Var3.n) {
                r4 = i3;
            } else {
                r4 = i3;
            }
            function2 = function1;
            hh0.b(l78Var, r4, null, null, null, null, pp8.b(-269409921, new gaj() { // from class: bz6
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar6 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((jh0) obj).getClass();
                    if (aVar6.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        final iz6 iz6Var4 = iz6Var3;
                        if (iz6Var4.q != null) {
                            aVar6.N(1303019380);
                            ChallengeCardStatus challengeCardStatus5 = iz6Var4.l;
                            ChallengeCardStatus challengeCardStatus6 = ChallengeCardStatus.Ongoing;
                            boolean z2 = challengeCardStatus5 == challengeCardStatus6;
                            uz6 uz6Var = iz6Var4.q;
                            boolean z3 = iz6Var4.s && (challengeCardStatus5 == ChallengeCardStatus.Available || challengeCardStatus5 == challengeCardStatus6);
                            d dVarH4 = h.h(h.j(d.a.b, 0.0f, 10.0f, 0.0f, 0.0f, 13), ((cjb0) aVar6.O(ejb0.a)).f, 0.0f, 2);
                            final Function1 function3 = function2;
                            boolean zM = aVar6.M(function3) | aVar6.A(iz6Var4);
                            Object objY3 = aVar6.y();
                            a.C0041a.C0042a c0042a4 = a.C0041a.a;
                            if (zM || objY3 == c0042a4) {
                                objY3 = new Function0() { // from class: iy6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function3.invoke(new rw6.i(iz6Var4.p, rw6.j.b));
                                        return Unit.a;
                                    }
                                };
                                aVar6.r(objY3);
                            }
                            Function0 function0 = (Function0) objY3;
                            boolean zM2 = aVar6.M(function3);
                            Object objY4 = aVar6.y();
                            if (zM2 || objY4 == c0042a4) {
                                objY4 = new pv1(1, function3);
                                aVar6.r(objY4);
                            }
                            Function0 function4 = (Function0) objY4;
                            boolean zM3 = aVar6.M(function3) | aVar6.A(iz6Var4);
                            Object objY5 = aVar6.y();
                            if (zM3 || objY5 == c0042a4) {
                                objY5 = new Function0() { // from class: jy6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function3.invoke(new rw6.d(iz6Var4.a));
                                        return Unit.a;
                                    }
                                };
                                aVar6.r(objY5);
                            }
                            ay6.a(z2, uz6Var, function0, function4, (Function0) objY5, dVarH4, z3, aVar6, 0, 0);
                            aVar6.H();
                        } else {
                            aVar6.N(1304370019);
                            aVar6.H();
                        }
                    } else {
                        aVar6.G();
                    }
                    return Unit.a;
                }
            }, bVar3), bVar3, 1572870, 30);
            bVar = bVar3;
            bVar.X(true);
            dVar2 = aVar3;
        } else {
            function2 = function1;
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final Function1 function3 = function2;
            eVarZ.d = new Function2() { // from class: cz6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hz6.d(iz6Var3, z, function3, dVar2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:58:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:63:0x01da  */
    /* JADX WARN: Code duplicated, block: B:66:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:68:0x031a  */
    /* JADX WARN: Code duplicated, block: B:69:0x031e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0339  */
    /* JADX WARN: Code duplicated, block: B:77:0x036b  */
    /* JADX WARN: Code duplicated, block: B:78:0x036e  */
    /* JADX WARN: Code duplicated, block: B:80:0x03be  */
    public static final void e(final boolean z, final String str, final UiText uiText, final UiText uiText2, final String str2, d dVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final d dVar2;
        int i3;
        yka.a.c cVar;
        androidx.compose.foundation.layout.d dVar3;
        int iHashCode;
        int iHashCode2;
        UiText uiText3;
        b bVarI = aVar.i(-568812102);
        if ((i & 6) == 0) {
            i2 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(uiText) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(uiText2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.M(str2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i4 = i2 | 196608;
        if (bVarI.q(i4 & 1, (74899 & i4) != 74898)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            qyd0 qyd0Var = cst.e;
            d dVarB = androidx.compose.foundation.a.b(dVarG, ((ast) bVarI.O(qyd0Var)).H, zk40.a);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode3 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar4 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar4);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                i3 = i4;
            } else {
                i3 = i4;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                }
                cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                mw90.a(str, "", j.i(j.g(aVar2, 1.0f), 140.0f), null, null, d0b.a.a, null, bVarI, ((i3 >> 3) & 14) | 1573296, 1976);
                d dVarI = j.i(j.g(aVar2, 1.0f), 50.0f);
                dVar3 = androidx.compose.foundation.layout.d.a;
                n54 n54Var = ht.a.h;
                g75.a(androidx.compose.foundation.a.a(dVar3.b(dVarI, n54Var), ya5.a.i(new Pair[]{new Pair(Float.valueOf(0.05f), new j58(r58.b(991076))), new Pair(Float.valueOf(0.75f), new j58(((ast) bVarI.O(qyd0Var)).I))}, 14), null, 0.0f, 6), bVarI, 0);
                d dVarJ = h.j(dVar3.b(aVar2, n54Var), fjb0.d(bVarI).f, 0.0f, fjb0.d(bVarI).f, 12.0f, 2);
                i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarJ);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA, bVar);
                hlh0.a(bVarI, ne00VarS2, dVar4);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                lkf0.d(cb40.a(R.string.page_loyalty__challenge_card_join_to_win, new Object[0], bVarI), null, ((ast) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, mla.m(-0.32f, bVarI), null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVarI).g, bVarI, 0, 0, 130810);
                h9n.a(pib0.a(R.drawable.img__challenge_prize_divider, 0, bVarI), null, h.h(j.w(aVar2, 224.0f), 0.0f, fjb0.d(bVarI).b, 1), null, d0b.a.d, 0.0f, null, bVarI, 24624, 104);
                lkf0.d(str2, null, ((ast) bVarI.O(qyd0Var)).a, null, mla.m(24.0f, bVarI), null, t9i.G, null, mla.m(-0.48f, bVarI), null, null, 0L, 2, false, 2, 0, null, null, bVarI, ((i3 >> 12) & 14) | 1572864, 24960, 241322);
                bVarI = bVarI;
                bVarI.X(true);
                if (z) {
                    bVarI.N(1071825518);
                    bVarI.X(false);
                } else {
                    bVarI.N(1070798209);
                    d dVarG2 = h.g(androidx.compose.foundation.a.b(h.j(dVar3.b(aVar2, ht.a.b), 0.0f, fjb0.d(bVarI).c, 0.0f, 0.0f, 13), ((ast) bVarI.O(qyd0Var)).H, j060.c(100.0f)), fjb0.d(bVarI).d, fjb0.d(bVarI).c);
                    d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
                    iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS3 = bVarI.S();
                    d dVarC3 = c.c(bVarI, dVarG2);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA, bVar);
                    hlh0.a(bVarI, ne00VarS3, dVar4);
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    }
                    hlh0.a(bVarI, dVarC3, cVar);
                    h6n.b(pib0.a(R.drawable.ic__stopwatch, 0, bVarI), null, j.r(aVar2, 12.0f), fjb0.b(bVarI).a0, bVarI, 432, 0);
                    ty0.a(bVarI, j.w(aVar2, 4.0f));
                    if (uiText2 == null) {
                        uiText3 = uiText;
                    } else {
                        uiText3 = uiText2;
                    }
                    uiText3.getClass();
                    lkf0.d(uiText3.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), null, fjb0.b(bVarI).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVarI).q, bVarI, 0, 0, 131066);
                    bVarI = bVarI;
                    bVarI.X(true);
                    bVarI.X(false);
                }
                bVarI.X(true);
                dVar2 = aVar2;
            }
            n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            mw90.a(str, "", j.i(j.g(aVar2, 1.0f), 140.0f), null, null, d0b.a.a, null, bVarI, ((i3 >> 3) & 14) | 1573296, 1976);
            d dVarI2 = j.i(j.g(aVar2, 1.0f), 50.0f);
            dVar3 = androidx.compose.foundation.layout.d.a;
            n54 n54Var2 = ht.a.h;
            g75.a(androidx.compose.foundation.a.a(dVar3.b(dVarI2, n54Var2), ya5.a.i(new Pair[]{new Pair(Float.valueOf(0.05f), new j58(r58.b(991076))), new Pair(Float.valueOf(0.75f), new j58(((ast) bVarI.O(qyd0Var)).I))}, 14), null, 0.0f, 6), bVarI, 0);
            d dVarJ2 = h.j(dVar3.b(aVar2, n54Var2), fjb0.d(bVarI).f, 0.0f, fjb0.d(bVarI).f, 12.0f, 2);
            i78 i78VarA2 = g78.a(kw0.c, ht.a.n, bVarI, 48);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarJ2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar);
            hlh0.a(bVarI, ne00VarS4, dVar4);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            lkf0.d(cb40.a(R.string.page_loyalty__challenge_card_join_to_win, new Object[0], bVarI), null, ((ast) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, mla.m(-0.32f, bVarI), null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVarI).g, bVarI, 0, 0, 130810);
            h9n.a(pib0.a(R.drawable.img__challenge_prize_divider, 0, bVarI), null, h.h(j.w(aVar2, 224.0f), 0.0f, fjb0.d(bVarI).b, 1), null, d0b.a.d, 0.0f, null, bVarI, 24624, 104);
            lkf0.d(str2, null, ((ast) bVarI.O(qyd0Var)).a, null, mla.m(24.0f, bVarI), null, t9i.G, null, mla.m(-0.48f, bVarI), null, null, 0L, 2, false, 2, 0, null, null, bVarI, ((i3 >> 12) & 14) | 1572864, 24960, 241322);
            bVarI = bVarI;
            bVarI.X(true);
            if (z) {
                bVarI.N(1070798209);
                d dVarG3 = h.g(androidx.compose.foundation.a.b(h.j(dVar3.b(aVar2, ht.a.b), 0.0f, fjb0.d(bVarI).c, 0.0f, 0.0f, 13), ((ast) bVarI.O(qyd0Var)).H, j060.c(100.0f)), fjb0.d(bVarI).d, fjb0.d(bVarI).c);
                d160 d160VarA2 = b160.a(kw0.a, ht.a.k, bVarI, 48);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS5 = bVarI.S();
                d dVarC5 = c.c(bVarI, dVarG3);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA2, bVar);
                hlh0.a(bVarI, ne00VarS5, dVar4);
                if (bVarI.S) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC5, cVar);
                h6n.b(pib0.a(R.drawable.ic__stopwatch, 0, bVarI), null, j.r(aVar2, 12.0f), fjb0.b(bVarI).a0, bVarI, 432, 0);
                ty0.a(bVarI, j.w(aVar2, 4.0f));
                if (uiText2 == null) {
                    uiText3 = uiText;
                } else {
                    uiText3 = uiText2;
                }
                uiText3.getClass();
                lkf0.d(uiText3.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), null, fjb0.b(bVarI).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVarI).q, bVarI, 0, 0, 131066);
                bVarI = bVarI;
                bVarI.X(true);
                bVarI.X(false);
            } else {
                bVarI.N(1071825518);
                bVarI.X(false);
            }
            bVarI.X(true);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: dz6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hz6.e(z, str, uiText, uiText2, str2, dVar2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0105  */
    /* JADX WARN: Code duplicated, block: B:43:0x0118  */
    /* JADX WARN: Code duplicated, block: B:46:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:47:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:52:0x0200  */
    public static final void f(final String str, final boolean z, UiText uiText, final d dVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        d.a aVar2;
        int iHashCode;
        final UiText uiText2 = uiText;
        b bVarI = aVar.i(1590748927);
        int i3 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.b(z) ? 32 : 16) | (bVarI.M(uiText2) ? 256 : 128) | (bVarI.M(dVar) ? 2048 : 1024);
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            final float f = fjb0.c(bVarI).d;
            qyd0 qyd0Var = cst.e;
            final long j = ((ast) bVarI.O(qyd0Var)).a;
            d dVarG = j.g(dVar, 1.0f);
            boolean zC = bVarI.c(f) | bVarI.e(j);
            Object objY = bVarI.y();
            if (zC || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: gy6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        long j2 = j;
                        lza lzaVar = (lza) obj;
                        lzaVar.getClass();
                        float fC1 = lzaVar.C1(12.0f);
                        float f2 = f;
                        float fC2 = lzaVar.C1(f2);
                        b9z b9zVarA = j060.c(f2).a(lzaVar.d(), lzaVar.getLayoutDirection(), lzaVar);
                        j90 j90VarA = m90.a();
                        c9z.a(j90VarA, b9zVarA);
                        qc6.b bVarF1 = lzaVar.F1();
                        long jD = bVarF1.d();
                        bVarF1.a().p();
                        try {
                            bVarF1.a.a(j90VarA, 0);
                            lc6 lc6VarA = lzaVar.F1().a();
                            b90 b90VarA = c90.a();
                            Paint paint = b90VarA.a;
                            paint.setAntiAlias(true);
                            paint.setStyle(Paint.Style.FILL);
                            paint.setColor(r58.l(j2));
                            paint.setMaskFilter(new BlurMaskFilter(fC1, BlurMaskFilter.Blur.NORMAL));
                            lc6VarA.l(0.0f, 0.0f, Float.intBitsToFloat((int) (lzaVar.d() >> 32)), Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)), fC2, fC2, b90VarA);
                            bVarF1.a().f();
                            bVarF1.h(jD);
                            lzaVar.b2();
                            return Unit.a;
                        } catch (Throwable th) {
                            hrh.a(bVarF1, jD);
                            throw th;
                        }
                    }
                };
                bVarI.r(objY);
            }
            d dVarF = h.f(androidx.compose.foundation.a.b(androidx.compose.ui.draw.a.c(dVarG, (Function1) objY), ((ast) bVarI.O(qyd0Var)).J, j060.c(fjb0.c(bVarI).d)), fjb0.d(bVarI).d);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                i2 = 48;
            } else {
                i2 = 48;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                aVar2 = d.a.b;
                if (z) {
                    bVarI.N(-637345430);
                    g(0, bVarI);
                    iib0.a(aVar2, fjb0.d(bVarI).e, bVarI, false);
                } else {
                    bVarI.N(-637238759);
                    bVarI.X(false);
                }
                lkf0.d(str, j.g(aVar2, 1.0f), fjb0.b(bVarI).o, null, 0L, null, null, null, mla.m(-0.2f, bVarI), null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0.b(fjb0.e(bVarI).c, 0L, 0L, t9i.F, null, null, 0L, null, null, null, 0, 0L, null, null, 16777211), bVarI, (i3 & 14) | 48, 0, 129784);
                ty0.a(bVarI, j.i(aVar2, fjb0.d(bVarI).d));
                d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, i2);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, aVar2);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, bVar);
                hlh0.a(bVarI, ne00VarS2, dVar2);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                h6n.b(pib0.a(R.drawable.ic__feature__sportysocial, 0, bVarI), null, j.r(aVar2, 16.0f), fjb0.b(bVarI).a0, bVarI, 432, 0);
                ty0.a(bVarI, j.w(aVar2, fjb0.d(bVarI).d));
                uiText.getClass();
                uiText2 = uiText;
                lkf0.d(uiText2.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), null, fjb0.b(bVarI).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVarI).q, bVarI, 0, 0, 131066);
                bVarI = bVarI;
                bVarI.X(true);
                bVarI.X(true);
            }
            n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar2);
            aVar2 = d.a.b;
            if (z) {
                bVarI.N(-637345430);
                g(0, bVarI);
                iib0.a(aVar2, fjb0.d(bVarI).e, bVarI, false);
            } else {
                bVarI.N(-637238759);
                bVarI.X(false);
            }
            lkf0.d(str, j.g(aVar2, 1.0f), fjb0.b(bVarI).o, null, 0L, null, null, null, mla.m(-0.2f, bVarI), null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0.b(fjb0.e(bVarI).c, 0L, 0L, t9i.F, null, null, 0L, null, null, null, 0, 0L, null, null, 16777211), bVarI, (i3 & 14) | 48, 0, 129784);
            ty0.a(bVarI, j.i(aVar2, fjb0.d(bVarI).d));
            d160 d160VarA2 = b160.a(kw0.a, ht.a.k, bVarI, i2);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar2);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar2);
            h6n.b(pib0.a(R.drawable.ic__feature__sportysocial, 0, bVarI), null, j.r(aVar2, 16.0f), fjb0.b(bVarI).a0, bVarI, 432, 0);
            ty0.a(bVarI, j.w(aVar2, fjb0.d(bVarI).d));
            uiText.getClass();
            uiText2 = uiText;
            lkf0.d(uiText2.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), null, fjb0.b(bVarI).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, fjb0.e(bVarI).q, bVarI, 0, 0, 131066);
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, z, uiText2, dVar, i) { // from class: hy6
                public final /* synthetic */ String a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ UiText c;
                public final /* synthetic */ d d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    hz6.f(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(int i, androidx.compose.runtime.a aVar) {
        b bVarI = aVar.i(1132377662);
        if (bVarI.q(i & 1, i != 0)) {
            long jB = r58.b(855699625);
            i060 i060VarC = j060.c(12.0f);
            d.a aVar2 = d.a.b;
            d dVarB = androidx.compose.foundation.a.b(aVar2, jB, i060VarC);
            qyd0 qyd0Var = cst.e;
            d dVarA = d35.a(dVarB, 0.5f, ((ast) bVarI.O(qyd0Var)).a, j060.c(12.0f));
            qyd0 qyd0Var2 = ejb0.a;
            d dVarG = h.g(dVarA, ((cjb0) bVarI.O(qyd0Var2)).d, ((cjb0) bVarI.O(qyd0Var2)).b);
            d160 d160VarA = b160.a(new kw0.i(((cjb0) bVarI.O(qyd0Var2)).c, true, new hw0()), ht.a.k, bVarI, 48);
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
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            h6n.b(pib0.a(R.drawable.ic__ellipse, 0, bVarI), "On going", j.r(aVar2, 5.0f), ((ast) bVarI.O(qyd0Var)).a, bVarI, 432, 0);
            lkf0.d(cb40.a(R.string.page_loyalty__ongoing, new Object[0], bVarI), null, ((ast) bVarI.O(qyd0Var)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).q, bVarI, 0, 0, 131066);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new oy6();
        }
    }

    public static final void h(final int i, androidx.compose.runtime.a aVar, final d dVar, final String str) {
        b bVar;
        b bVarI = aVar.i(-41728639);
        int i2 = (bVarI.M(str) ? 4 : 2) | i | (bVarI.M(dVar) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            alb0 alb0Var = sya.c;
            umz umzVar = ek5.a;
            qyd0 qyd0Var = oib0.a;
            ak5 ak5VarA = ek5.a(0L, 0L, ((lib0) bVarI.O(qyd0Var)).w0, ((lib0) bVarI.O(qyd0Var)).d, bVarI, 3);
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new sy6();
                bVarI.r(objY);
            }
            xya.a(dVar, false, str, null, alb0Var, ak5VarA, null, null, null, (Function0) objY, bVarI, ((i2 << 6) & 896) | ((i2 >> 3) & 14) | 805306416, 456);
            bVar = bVarI;
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar, str) { // from class: ty6
                public final /* synthetic */ String a;
                public final /* synthetic */ d b;

                {
                    this.a = str;
                    this.b = dVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hz6.h(qj40.a(1), (a) obj, this.b, this.a);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:44:0x009a  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    public static final void i(final e160 e160Var, final String str, boolean z, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        String str2;
        boolean z2;
        boolean z3;
        final boolean z4;
        e eVarZ;
        op8 op8Var;
        Object objY;
        b bVarI = aVar.i(-1410650472);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(e160Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i3 |= bVarI.M(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= bVarI.b(z2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i3 & 1, z3)) {
                if (i4 != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                alb0 alb0Var = sya.c;
                umz umzVar = ek5.a;
                qyd0 qyd0Var = oib0.a;
                ak5 ak5VarA = ek5.a(0L, 0L, ((lib0) bVarI.O(qyd0Var)).w0, ((lib0) bVarI.O(qyd0Var)).d, bVarI, 3);
                d dVarA = e160Var.a(1.0f, d.a.b, true);
                if (z4) {
                    op8Var = lu8.a;
                } else {
                    op8Var = null;
                }
                objY = bVarI.y();
                if (objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new xy6();
                    bVarI.r(objY);
                }
                xya.a(dVarA, false, str2, null, alb0Var, ak5VarA, null, null, op8Var, (Function0) objY, bVarI, ((i3 << 3) & 896) | 805306416, r.d.DEFAULT_DRAG_ANIMATION_DURATION);
                bVarI = bVarI;
            } else {
                bVarI.G();
                z4 = z2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: yy6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        hz6.i(e160Var, str, z4, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i3 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i3 & 1, z3)) {
            if (i4 != 0) {
                z4 = false;
            } else {
                z4 = z2;
            }
            alb0 alb0Var2 = sya.c;
            umz umzVar2 = ek5.a;
            qyd0 qyd0Var2 = oib0.a;
            ak5 ak5VarA2 = ek5.a(0L, 0L, ((lib0) bVarI.O(qyd0Var2)).w0, ((lib0) bVarI.O(qyd0Var2)).d, bVarI, 3);
            d dVarA2 = e160Var.a(1.0f, d.a.b, true);
            if (z4) {
                op8Var = lu8.a;
            } else {
                op8Var = null;
            }
            objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new xy6();
                bVarI.r(objY);
            }
            xya.a(dVarA2, false, str2, null, alb0Var2, ak5VarA2, null, null, op8Var, (Function0) objY, bVarI, ((i3 << 3) & 896) | 805306416, r.d.DEFAULT_DRAG_ANIMATION_DURATION);
            bVarI = bVarI;
        } else {
            bVarI.G();
            z4 = z2;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: yy6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hz6.i(e160Var, str, z4, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void j(final int i, final op8 op8Var, androidx.compose.runtime.a aVar) {
        int i2;
        b bVarI = aVar.i(301057322);
        int i3 = i & 6;
        d.a aVar2 = d.a.b;
        if (i3 == 0) {
            i2 = (bVarI.M(aVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(op8Var) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            qyd0 qyd0Var = ejb0.a;
            kw0.i iVar = new kw0.i(((cjb0) bVarI.O(qyd0Var)).d, true, new hw0());
            d dVarH = h.h(j.g(aVar2, 1.0f), ((cjb0) bVarI.O(qyd0Var)).f, 0.0f, 2);
            int i4 = ((i2 << 6) & 7168) | 384;
            d160 d160VarA = b160.a(iVar, ht.a.k, bVarI, 48);
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
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            op8Var.invoke(f160.a, bVarI, Integer.valueOf(((i4 >> 6) & 112) | 6));
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: qy6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hz6.j(qj40.a(i | 1), op8Var, (a) obj);
                    return Unit.a;
                }
            };
        }
    }

    public static final void k(final e160 e160Var, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(1078014013);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(e160Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            String strA = cb40.a(R.string.page_loyalty__challenge_card_view_leaderboard, new Object[0], bVarI);
            alb0 alb0Var = sya.a;
            qyd0 qyd0Var = oib0.a;
            ak5 ak5VarA = sya.a(((lib0) bVarI.O(qyd0Var)).b1, ((lib0) bVarI.O(qyd0Var)).o, 0L, 0L, bVarI, 24576, 12);
            xya.a(e160Var.a(1.0f, d35.a(d.a.b, 1.0f, ((lib0) bVarI.O(qyd0Var)).H, j060.c(((zib0) bVarI.O(ajb0.a)).b)), true), false, strA, null, sya.c, ak5VarA, null, null, null, function0, bVarI, (i2 << 24) & 1879048192, 458);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: vy6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    hz6.k(e160Var, function0, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
