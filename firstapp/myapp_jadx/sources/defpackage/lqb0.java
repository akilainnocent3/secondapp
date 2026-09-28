package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.crash.remote.models.BetHistoryItem;
import com.sportygames.crash.remote.models.TopBets;
import com.sportygames.crash.remote.models.TopWinResponseV2;
import com.sportygames.vip.data.EliteTopWinsThisWeekItem;
import com.sportygames.vip.data.UserTopCoeffResponse;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class lqb0 {
    public static final long a = j58.l;
    public static final long b = j58.f;
    public static final long c = r58.b(1040187391);
    public static final long d = r58.d(4287787282L);
    public static final long e = r58.b(1728053247);
    public static final long f = r58.d(4294684736L);
    public static final long g = r58.b(529107337);
    public static final long h = r58.d(4285071104L);
    public static final long i = r58.d(4280566050L);
    public static final long j = r58.d(4280667136L);
    public static final long k = r58.b(1040187391);
    public static final long l = r58.b(536870911);
    public static final i060 m = j060.c(100.0f);
    public static final p8i n = g8i.a(n8i.a(R.font.roboto, null, 0, 14));
    public static final p8i o = g8i.a(n8i.a(R.font.roboto_medium, null, 0, 14));
    public static final float p = 1.0f;
    public static final List<j58> q = kotlin.collections.b.k(new j58(abi0.Q), new j58(abi0.R), new j58(abi0.S), new j58(abi0.T), new j58(abi0.U), new j58(abi0.V));
    public static final List<j58> r = kotlin.collections.b.k(new j58(abi0.W), new j58(abi0.X), new j58(abi0.Y), new j58(abi0.Z), new j58(abi0.a0), new j58(abi0.b0));
    public static final List<j58> s = kotlin.collections.b.k(new j58(abi0.c0), new j58(abi0.d0), new j58(abi0.e0), new j58(abi0.f0), new j58(abi0.g0), new j58(abi0.h0));

    @c0d(c = "com.sportygames.sportyherocompose.components.SportyHeroAllBetsComposeUiKt$ReportListScrollState$1$1", f = "SportyHeroAllBetsComposeUi.kt", l = {1230}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zzr b;
        public final /* synthetic */ Function1<Boolean, Unit> c;

        /* JADX INFO: renamed from: lqb0$a$a, reason: collision with other inner class name */
        public static final class C0832a<T> implements myh {
            public final /* synthetic */ Function1<Boolean, Unit> a;

            /* JADX WARN: Multi-variable type inference failed */
            public C0832a(Function1<? super Boolean, Unit> function1) {
                this.a = function1;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.a.invoke(bool);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(zzr zzrVar, Function1<? super Boolean, Unit> function1, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = zzrVar;
            this.c = function1;
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
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                final zzr zzrVar = this.b;
                lyh lyhVarB = uzh.b(n95.c(new Function0() { // from class: kqb0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(zzrVar.i.c());
                    }
                }));
                C0832a c0832a = new C0832a(this.c);
                this.a = 1;
                if (lyhVarB.collect(c0832a, this) == y5bVar) {
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

    public static final class b implements tse {
        public final /* synthetic */ Function1 a;

        public b(Function1 function1) {
            this.a = function1;
        }

        @Override // defpackage.tse
        public final void dispose() {
            this.a.invoke(Boolean.FALSE);
        }
    }

    public static final void a(final TopBets topBets, final gw2 gw2Var, androidx.compose.runtime.a aVar, final int i2) {
        final gw2 gw2Var2;
        String string;
        String strL;
        androidx.compose.runtime.b bVarI = aVar.i(-965642536);
        int i3 = (bVarI.A(topBets) ? 4 : 2) | i2 | (bVarI.M(gw2Var) ? 32 : 16);
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            boolean zG = Intrinsics.g(topBets.getUserId(), SportyGamesManager.getInstance().getUserId());
            String cashoutCoefficient = topBets.getCashoutCoefficient();
            if (cashoutCoefficient == null) {
                cashoutCoefficient = "";
            }
            if (cashoutCoefficient.length() > 0) {
                string = context.getString(R.string.coeff, cashoutCoefficient);
                string.getClass();
                TreeMap treeMap = pw.a;
                strL = pw.l(topBets.getPayoutAmount());
            } else {
                string = "--";
                strL = "0";
            }
            String str = string;
            String str2 = strL;
            op8 op8VarB = pp8.b(-1719044553, new gaj() { // from class: jpb0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    e160 e160Var = (e160) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    e160Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(e160Var) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        lqb0.o(5, 0, aVar2, e160Var.a(1.0f, h.j(d.a.b, gw2Var.f, 0.0f, 0.0f, 0.0f, 14), true), topBets.getNickName());
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI);
            TreeMap treeMap2 = pw.a;
            gw2Var2 = gw2Var;
            n(gw2Var2, zG, op8VarB, pw.l(topBets.getStakeAmount()), str, str2, bVarI, ((i3 >> 3) & 14) | 384, 0);
        } else {
            gw2Var2 = gw2Var;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(gw2Var2, i2) { // from class: kpb0
                public final /* synthetic */ gw2 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    lqb0.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final String str, final Integer num, final boolean z, final d dVar, final eil eilVar, final Function0 function0, final boolean z2, final boolean z3, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        Function0 function1;
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(-657344126);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.M(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.M(num) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.M(dVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bVarI.M(eilVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            function1 = function0;
            i3 |= bVarI.A(function1) ? 131072 : 65536;
        } else {
            function1 = function0;
        }
        if ((1572864 & i2) == 0) {
            i3 |= bVarI.b(z2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= bVarI.b(z3) ? 8388608 : 4194304;
        }
        if (bVarI.q(i3 & 1, (4793491 & i3) != 4793490)) {
            d dVarD = androidx.compose.foundation.d.d(androidx.compose.foundation.a.b(j.i(dVar, eilVar.a), z ? r58.b(536870911) : a, zk40.a), false, null, null, function1, 15);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarD);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            int i4 = i3;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarH = h.h(d.a.b, eilVar.f, 0.0f, 2);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarH);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            imf0 imf0Var = new imf0(0L, eilVar.d, null, null, null, 0L, null, null, 0, 0L, null, null, 16777213);
            float fC = omf0.c(eilVar.d) * 0.75f;
            if (fC < 6.0f) {
                fC = 6.0f;
            }
            wf1.a(str, null, imf0Var, 1, d2l.g(fC, 4294967296L), null, 3, null, b, bVarI, (i4 & 14) | 100666368, 162);
            bVar = bVarI;
            if (num == null || num.intValue() <= 0) {
                bVar.N(933955978);
            } else {
                bVar.N(958539784);
                lkf0.b(" (" + num + ")", null, (z2 && z3) ? f : h, eilVar.d, null, null, o, 0L, null, eilVar.e, 0, false, 1, 0, null, null, bVar, 1572864, 3072, 121778);
            }
            bVar.X(false);
            bVar.X(true);
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: jqb0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lqb0.b(str, num, z, dVar, eilVar, function0, z2, z3, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final int i2, final long j2, androidx.compose.runtime.a aVar, final d dVar, final String str) {
        androidx.compose.runtime.b bVarI = aVar.i(1083108822);
        int i3 = (bVarI.M(str) ? 4 : 2) | i2 | (bVarI.e(j2) ? 32 : 16) | (bVarI.M(dVar) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            i060 i060Var = j060.a;
            mw90.a(str, null, d35.a(androidx.compose.foundation.a.b(ls7.a(dVar, i060Var), r58.d(4283058762L), zk40.a), 1.0f, j2, i060Var), null, null, d0b.a.a, null, bVarI, (i3 & 14) | 1572912, 1976);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i2, j2, dVar, str) { // from class: ypb0
                public final /* synthetic */ String a;
                public final /* synthetic */ long b;
                public final /* synthetic */ d c;

                {
                    this.a = str;
                    this.b = j2;
                    this.c = dVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lqb0.c(qj40.a(1), this.b, (a) obj, this.c, this.a);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final String str, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.b bVarI = aVar.i(-1486517388);
        int i4 = i2 & 6;
        l78 l78Var = l78.a;
        if (i4 == 0) {
            i3 = i2 | (bVarI.M(l78Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.M(str) ? 32 : 16;
        }
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarJ = h.j(l78Var.a(1.0f, j.e(aVar2, 1.0f), true), 0.0f, 0.0f, 0.0f, 15.0f, 7);
            i78 i78VarA = g78.a(kw0.e, ht.a.n, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
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
            h9n.a(erz.a(R.drawable.no_data_chips, 0, bVarI), null, j.i(j.w(aVar2, pi60.a(R.dimen._70sdp, 0, bVarI)), pi60.a(R.dimen._80sdp, 0, bVarI)), null, null, 0.0f, null, bVarI, 48, 120);
            lkf0.b(str, g.d(aVar2, 0.0f, -5.0f, 1), r58.d(4282861383L), d2l.g(fw20.a(R.dimen._12ssp, bVarI), 4294967296L), null, null, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, null, bVarI, ((i3 >> 3) & 14) | 432, 0, 130544);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: tpb0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    lqb0.d(str, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(final int i2, androidx.compose.runtime.a aVar, final d dVar, String str, final String str2) {
        androidx.compose.runtime.b bVar;
        final String str3 = str;
        str2.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(2015836784);
        int i3 = i2 | (bVarI.M(str3) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16) | (bVarI.M(dVar) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            d dVarF = h.f(d35.a(ls7.a(j.i(j.g(dVar, 1.0f), pi60.a(R.dimen._28sdp, 0, bVarI)), j060.c(pi60.a(R.dimen._4sdp, 0, bVarI))), 1.0f, l, j060.c(pi60.a(R.dimen._4sdp, 0, bVarI))), pi60.a(R.dimen._3sdp, 0, bVarI));
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            i78 i78VarA = g78.a(kw0.e, ht.a.n, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d.a aVar3 = d.a.b;
            d dVarC2 = c.c(bVarI, aVar3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            String upperCase = str2.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            long jD = r58.d(4290624957L);
            long j2 = j58.b;
            lkf0.b(upperCase, null, 0L, pi60.b(R.dimen._7ssp, 0, bVarI), null, t9i.B, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, new imf0(jD, 0L, null, null, null, 0L, null, new ix80(4.0f, j58.c(0.4f, j2), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(2.0f)) & 4294967295L)), 0, 0L, null, null, 16769022), bVarI, 196608, 1572864, 64982);
            ty0.a(bVarI, j.i(aVar3, pi60.a(R.dimen._1sdp, 0, bVarI)));
            str3 = str;
            lkf0.b(str3, null, 0L, pi60.b(R.dimen._11ssp, 0, bVarI), null, t9i.G, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, new imf0(r58.d(4293322470L), 0L, null, null, null, 0L, null, new ix80(4.0f, j58.c(0.4f, j2), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(2.0f)) & 4294967295L)), 0, 0L, null, null, 16769022), bVarI, (i3 & 14) | 196608, 1572864, 64982);
            bVar = bVarI;
            bVar.X(true);
            ty0.a(bVar, j.i(aVar3, pi60.a(R.dimen._1sdp, 0, bVar)));
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i2, dVar, str3, str2) { // from class: npb0
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ d c;

                {
                    this.a = str3;
                    this.b = str2;
                    this.c = dVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lqb0.e(qj40.a(1), (a) obj, this.c, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void f(final wqb0 wqb0Var, final String str, final String str2, final String str3, final String str4, final String str5, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        androidx.compose.runtime.b bVarI = aVar.i(435496731);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.d(wqb0Var.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            str6 = str;
            i3 |= bVarI.M(str6) ? 32 : 16;
        } else {
            str6 = str;
        }
        if ((i2 & 384) == 0) {
            str7 = str2;
            i3 |= bVarI.M(str7) ? 256 : 128;
        } else {
            str7 = str2;
        }
        if ((i2 & 3072) == 0) {
            str8 = str3;
            i3 |= bVarI.M(str8) ? 2048 : 1024;
        } else {
            str8 = str3;
        }
        if ((i2 & 24576) == 0) {
            str9 = str4;
            i3 |= bVarI.M(str9) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            str9 = str4;
        }
        if ((196608 & i2) == 0) {
            str10 = str5;
            i3 |= bVarI.M(str10) ? 131072 : 65536;
        } else {
            str10 = str5;
        }
        if (bVarI.q(i3 & 1, (74899 & i3) != 74898)) {
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
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
            long jG = d2l.g(fw20.a(R.dimen._8ssp, bVarI), 4294967296L);
            long jG2 = d2l.g(fw20.a(R.dimen._11ssp, bVarI), 4294967296L);
            String str11 = wqb0Var == wqb0.b ? str6 : str7;
            f160 f160Var = f160.a;
            d dVarJ = h.j(f160Var.a(1.0f, aVar2, true), 4.0f, 0.0f, 0.0f, 0.0f, 14);
            gdf0 gdf0Var = new gdf0(5);
            long j2 = b;
            p8i p8iVar = n;
            int i4 = i3;
            lkf0.b(str11, dVarJ, j2, jG, null, null, p8iVar, 0L, gdf0Var, jG2, 0, false, 0, 0, null, null, bVarI, 1573248, 0, 129456);
            lkf0.b(str8, h.j(f160Var.a(1.0f, aVar2, true), 6.0f, 0.0f, 0.0f, 0.0f, 14), j2, jG, null, null, p8iVar, 0L, new gdf0(3), jG2, 0, false, 0, 0, null, null, bVarI, ((i4 >> 9) & 14) | 1573248, 0, 129456);
            lkf0.b(str9, h.j(f160Var.a(1.0f, aVar2, true), 0.0f, 0.0f, 10.0f, 0.0f, 11), j2, jG, null, null, p8iVar, 0L, new gdf0(3), jG2, 0, false, 0, 0, null, null, bVarI, ((i4 >> 12) & 14) | 1573248, 0, 129456);
            lkf0.b(str10, h.j(f160Var.a(1.0f, aVar2, true), 0.0f, 0.0f, 12.0f, 0.0f, 11), j2, jG, null, null, p8iVar, 0L, new gdf0(6), jG2, 0, false, 0, 0, null, null, bVarI, ((i4 >> 15) & 14) | 1573248, 0, 129456);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: rpb0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lqb0.f(wqb0Var, str, str2, str3, str4, str5, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void g(final BetHistoryItem betHistoryItem, final gw2 gw2Var, androidx.compose.runtime.a aVar, final int i2) {
        final gw2 gw2Var2;
        String str;
        String str2;
        String str3;
        androidx.compose.runtime.b bVarI = aVar.i(1562130186);
        int i3 = (bVarI.A(betHistoryItem) ? 4 : 2) | i2 | (bVarI.M(gw2Var) ? 32 : 16);
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            Double cashoutCoefficient = betHistoryItem.getCashoutCoefficient();
            double dDoubleValue = cashoutCoefficient != null ? cashoutCoefficient.doubleValue() : 0.0d;
            if (dDoubleValue == 0.0d) {
                str = "--";
            } else {
                try {
                    str = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dDoubleValue);
                    str.getClass();
                } catch (Exception unused) {
                    str = "0.00";
                }
            }
            double payoutAmount = betHistoryItem.getPayoutAmount();
            if (payoutAmount == 0.0d) {
                str2 = "0";
            } else {
                try {
                    str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(payoutAmount);
                    str2.getClass();
                } catch (Exception unused2) {
                    str2 = "0.00";
                }
            }
            String str4 = str2;
            op8 op8VarB = pp8.b(963179305, new gaj() { // from class: aqb0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String string;
                    e160 e160Var = (e160) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    e160Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(e160Var) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        String roundId = betHistoryItem.getRoundId();
                        if (roundId == null || (string = roundId.toString()) == null) {
                            string = "--";
                        }
                        lqb0.o(5, 0, aVar2, e160Var.a(1.0f, h.j(d.a.b, gw2Var.f, 0.0f, 0.0f, 0.0f, 14), true), string);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI);
            try {
                String str5 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(betHistoryItem.getStakeAmount());
                str5.getClass();
                str3 = str5;
            } catch (Exception unused3) {
                str3 = "0.00";
            }
            gw2Var2 = gw2Var;
            n(gw2Var2, false, op8VarB, str3, str, str4, bVarI, ((i3 >> 3) & 14) | 384, 2);
        } else {
            gw2Var2 = gw2Var;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(gw2Var2, i2) { // from class: bqb0
                public final /* synthetic */ gw2 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    lqb0.g(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void h(final int i2, final int i3, androidx.compose.runtime.a aVar, final d dVar) {
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(952731652);
        int i4 = (bVarI.d(i2) ? 4 : 2) | i3 | (bVarI.M(dVar) ? 32 : 16);
        if (bVarI.q(i4 & 1, (i4 & 19) != 18)) {
            long jB = pi60.b(R.dimen._6ssp, 0, bVarI);
            long jB2 = pi60.b(R.dimen._5ssp, 0, bVarI);
            int i5 = i2 % 100;
            String str = "th";
            if (11 > i5 || i5 >= 14) {
                int i6 = i2 % 10;
                if (i6 == 1) {
                    str = "st";
                } else if (i6 == 2) {
                    str = "nd";
                } else if (i6 == 3) {
                    str = "rd";
                }
            }
            nk0.b bVar2 = new nk0.b((Object) null);
            t9i t9iVar = t9i.E;
            String str2 = str;
            int iL = bVar2.l(new ora0(0L, jB, t9iVar, new n9i(1), (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65521));
            try {
                bVar2.g(String.valueOf(i2));
                Unit unit = Unit.a;
                bVar2.i(iL);
                int iL2 = bVar2.l(new ora0(0L, jB2, t9iVar, new n9i(1), (o9i) null, (f8i) null, (String) null, 0L, new t82(0.35f), (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65265));
                try {
                    bVar2.g(str2);
                    bVar2.i(iL2);
                    nk0 nk0VarM = bVar2.m();
                    d dVarI = j.i(dVar, pi60.a(R.dimen._14sdp, 0, bVarI));
                    long jD = j58.f;
                    d dVarH = h.h(androidx.compose.foundation.a.b(dVarI, j58.c(0.16f, jD), j060.e(0.0f, 0.0f, 0.0f, pi60.a(R.dimen._5sdp, 0, bVarI), 7)), pi60.a(R.dimen._4sdp, 0, bVarI), 0.0f, 2);
                    aiv aivVarC = g75.c(ht.a.e, false);
                    int iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS = bVarI.S();
                    d dVarC = c.c(bVarI, dVarH);
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
                    if (i2 == 1) {
                        jD = r58.d(4294949191L);
                    } else if (i2 != 2) {
                        jD = r58.d(4294293155L);
                    }
                    lkf0.c(nk0VarM, null, jD, pi60.b(R.dimen._6ssp, 0, bVarI), new n9i(1), t9iVar, null, 0L, null, pi60.b(R.dimen._6ssp, 0, bVarI), 0, false, 0, 0, null, null, null, bVarI, 196608, 0, 261058);
                    bVar = bVarI;
                    bVar.X(true);
                } catch (Throwable th) {
                    bVar2.i(iL2);
                    throw th;
                }
            } catch (Throwable th2) {
                bVar2.i(iL);
                throw th2;
            }
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i2, i3, dVar) { // from class: wpb0
                public final /* synthetic */ int a;
                public final /* synthetic */ d b;

                {
                    this.b = dVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    lqb0.h(this.a, iA, (a) obj, this.b);
                    return Unit.a;
                }
            };
        }
    }

    public static final void i(final zzr zzrVar, final Function1<? super Boolean, Unit> function1, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.b bVarI = aVar.i(71515640);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.M(zzrVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 14) == 4;
            int i4 = i3 & 112;
            boolean z2 = z | (i4 == 32);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z2 || objY == c0042a) {
                objY = new a(zzrVar, function1, null);
                bVarI.r(objY);
            }
            xvf.e(bVarI, zzrVar, (Function2) objY);
            Unit unit = Unit.a;
            boolean z3 = i4 == 32;
            Object objY2 = bVarI.y();
            if (z3 || objY2 == c0042a) {
                objY2 = new Function1() { // from class: lpb0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((use) obj).getClass();
                        return new lqb0.b(function1);
                    }
                };
                bVarI.r(objY2);
            }
            xvf.c(unit, (Function1) objY2, bVarI);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: mpb0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i2 | 1);
                    lqb0.i(zzrVar, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(final xqb0 xqb0Var, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final Function0 function0, final Function0 function1, final Function0 function2, final Function0 function3, final Function1 function4, final boolean z, boolean z2, final String str12, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.b bVar;
        boolean z3;
        Object nqb0Var;
        wd0 wd0Var;
        SharedPreferences sharedPreferences;
        wd0 wd0Var2;
        yka.a.C1350a c1350a;
        char c2;
        d dVarA;
        boolean z4;
        boolean z5;
        xqb0Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        qn4.b(str5, str6, str7, str9, str10);
        str11.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-1548505543);
        int i3 = i2 | (bVarI.M(xqb0Var) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.M(str2) ? 256 : 128) | (bVarI.M(str3) ? 2048 : 1024) | (bVarI.M(str4) ? 16384 : 8192) | (bVarI.M(str5) ? 131072 : 65536) | (bVarI.M(str6) ? 1048576 : 524288) | (bVarI.M(str7) ? 8388608 : 4194304) | (bVarI.M(str8) ? 67108864 : 33554432) | (bVarI.M(str9) ? 536870912 : 268435456);
        int i4 = (bVarI.M(str10) ? 4 : 2) | (bVarI.M(str11) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024) | (bVarI.A(function2) ? 16384 : 8192) | (bVarI.A(function3) ? 131072 : 65536) | (bVarI.A(function4) ? 1048576 : 524288) | (bVarI.b(z) ? 8388608 : 4194304) | (bVarI.b(z2) ? 67108864 : 33554432) | (bVarI.M(str12) ? 536870912 : 268435456);
        if (bVarI.q(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 306783379) == 306783378) ? false : true)) {
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            n54 n54Var = ht.a.a;
            aiv aivVarC = g75.c(n54Var, false);
            int iHashCode = Long.hashCode(bVarI.m());
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
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a2);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            float fA = pi60.a(R.dimen._8sdp, 0, bVarI);
            float fA2 = pi60.a(R.dimen._20sdp, 0, bVarI);
            i060 i060VarC = j060.c(fA);
            eil eilVar = new eil(fA2, fA, i060VarC, pi60.b(R.dimen._8ssp, 0, bVarI), pi60.b(R.dimen._9ssp, 0, bVarI), pi60.a(R.dimen._2sdp, 0, bVarI), pi60.a(R.dimen._1sdp, 0, bVarI));
            i060 i060VarC2 = j060.c(fA);
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = context.getSharedPreferences("vip_elite_data", 0);
                bVarI.r(objY);
            }
            SharedPreferences sharedPreferences2 = (SharedPreferences) objY;
            twd0<Boolean> twd0Var = gci0.D;
            twd0<Boolean> twd0Var2 = gci0.F;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = ee0.a(0.0f);
                bVarI.r(objY2);
            }
            wd0 wd0Var3 = (wd0) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = m.b(Boolean.FALSE);
                bVarI.r(objY3);
            }
            ytw ytwVar = (ytw) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = ee0.a(0.0f);
                bVarI.r(objY4);
            }
            wd0 wd0Var4 = (wd0) objY4;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = m.b(Boolean.FALSE);
                bVarI.r(objY5);
            }
            ytw ytwVar2 = (ytw) objY5;
            Boolean boolValueOf = Boolean.valueOf(z2);
            x5a0 x5a0Var = (x5a0) twd0Var;
            Boolean bool = (Boolean) x5a0Var.getValue();
            bool.getClass();
            int i5 = i4 & 234881024;
            boolean zA = bVarI.A(wd0Var3) | (i5 == 67108864) | bVarI.A(sharedPreferences2) | bVarI.M(x5a0Var);
            Object objY6 = bVarI.y();
            if (zA || objY6 == c0042a) {
                nqb0Var = new nqb0(z2, wd0Var3, sharedPreferences2, ytwVar, x5a0Var, null);
                wd0Var = wd0Var3;
                sharedPreferences = sharedPreferences2;
                x5a0Var = x5a0Var;
                bVarI.r(nqb0Var);
            } else {
                nqb0Var = objY6;
                sharedPreferences = sharedPreferences2;
                wd0Var = wd0Var3;
            }
            int i6 = i4 >> 24;
            xvf.g(boolValueOf, bool, (Function2) nqb0Var, bVarI);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            Boolean boolValueOf3 = Boolean.valueOf(z);
            x5a0 x5a0Var2 = (x5a0) twd0Var2;
            Boolean bool2 = (Boolean) x5a0Var2.getValue();
            bool2.getClass();
            Boolean bool3 = (Boolean) x5a0Var.getValue();
            bool3.getClass();
            Object[] objArr = {boolValueOf2, boolValueOf3, bool2, bool3};
            boolean zA2 = (i5 == 67108864) | ((i4 & 29360128) == 8388608) | bVarI.A(wd0Var4) | bVarI.M(x5a0Var2) | bVarI.M(x5a0Var) | bVarI.A(sharedPreferences);
            Object objY7 = bVarI.y();
            if (zA2 || objY7 == c0042a) {
                wd0Var2 = wd0Var4;
                oqb0 oqb0Var = new oqb0(z, wd0Var2, z2, sharedPreferences, ytwVar2, x5a0Var2, x5a0Var, null);
                bVarI.r(oqb0Var);
                objY7 = oqb0Var;
            } else {
                wd0Var2 = wd0Var4;
            }
            xvf.h(objArr, (Function2) objY7, bVarI);
            hfs hfsVar = new hfs(kotlin.collections.b.k(new j58(abi0.a), new j58(abi0.b)), null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f)) & 4294967295L), (14 & 8) != 0 ? 0 : 2);
            float fFloatValue = ((Number) wd0Var2.d()).floatValue();
            boolean z6 = z && fFloatValue > 0.0f;
            d dVarG = h.g(ls7.a(j.e(aVar2, 1.0f), i060VarC2).n(z2 ? androidx.compose.foundation.a.a(androidx.compose.foundation.a.b(aVar2, abi0.g, i060VarC2), ya5.a.a(0.0f, 0.0f, 14, kotlin.collections.b.k(new j58(j58.c(((Number) wd0Var.d()).floatValue(), abi0.e)), new j58(abi0.f))), i060VarC2, 0.0f, 4) : androidx.compose.foundation.a.b(aVar2, g, i060VarC2)).n((z2 && k(ytwVar)) ? d35.b(aVar2, 0.5f, hfsVar, i060VarC2) : d35.a(aVar2, p, e, i060VarC2)), pi60.a(R.dimen._6sdp, 0, bVarI), pi60.a(R.dimen._6sdp, 0, bVarI));
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.m());
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                c1350a = c1350a2;
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                c1350a = c1350a2;
            }
            hlh0.a(bVarI, dVarC2, cVar);
            d dVarA2 = ls7.a(j.i(j.g(aVar2, 1.0f), fA2), i060VarC);
            if (z2 && k(ytwVar)) {
                dVarA = d35.b(aVar2, 0.5f, hfsVar, i060VarC);
                c2 = 14;
            } else {
                c2 = 14;
                dVarA = d35.a(aVar2, 1.0f, c, i060VarC);
            }
            d dVarN = dVarA2.n(dVarA);
            aiv aivVarC2 = g75.c(n54Var, false);
            int iHashCode3 = Long.hashCode(bVarI.m());
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarN);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            d dVarB = ls7.b(j.c(j.g(aVar2, 1.0f), 1.0f));
            kw0.j jVar = kw0.a;
            n54.b bVar3 = ht.a.k;
            d160 d160VarA = b160.a(jVar, bVar3, bVarI, 48);
            int iHashCode4 = Long.hashCode(bVarI.m());
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarB);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar2);
            hlh0.a(bVarI, ne00VarS4, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            Integer num = xqb0Var.c;
            wqb0 wqb0Var = xqb0Var.a;
            boolean z7 = wqb0Var == wqb0.a;
            f160 f160Var = f160.a;
            boolean z8 = z6;
            b(str, num, z7, f160Var.a(1.0f, aVar2, true), eilVar, function0, z2, k(ytwVar), bVarI, ((i3 >> 3) & 14) | ((i4 << 9) & 458752) | ((i4 >> 6) & 3670016));
            z3 = z2;
            int i7 = (i4 >> 21) & 112;
            q(eilVar, z3, ((Boolean) ytwVar.getValue()).booleanValue(), bVarI, i7);
            int i8 = i3 >> 6;
            p(str2, wqb0Var == wqb0.b, f160Var.a(1.0f, aVar2, true), eilVar, function1, false, bVarI, (i8 & 14) | ((i4 << 3) & 57344), 32);
            q(eilVar, z3, ((Boolean) ytwVar.getValue()).booleanValue(), bVarI, i7);
            p(str3, wqb0Var == wqb0.c, f160Var.a(1.0f, aVar2, true), eilVar, function2, false, bVarI, ((i3 >> 9) & 14) | (i4 & 57344), 32);
            bVar = bVarI;
            if (z8) {
                bVar.N(1778140445);
                d dVarB2 = ls7.b(j.c(f160Var.a(fFloatValue >= 1.0E-4f ? fFloatValue : 1.0E-4f, aVar2, true), 1.0f));
                wqb0 wqb0Var2 = wqb0.d;
                d dVarB3 = androidx.compose.foundation.a.b(dVarB2, wqb0Var == wqb0Var2 ? r58.b(536870911) : a, zk40.a);
                d160 d160VarA2 = b160.a(kw0.e, bVar3, bVar, 54);
                int iHashCode5 = Long.hashCode(bVar.m());
                ne00 ne00VarS5 = bVar.S();
                d dVarC5 = c.c(bVar, dVarB3);
                bVar.D();
                if (bVar.S) {
                    bVar.F(aVar3);
                } else {
                    bVar.p();
                }
                hlh0.a(bVar, d160VarA2, bVar2);
                hlh0.a(bVar, ne00VarS5, dVar);
                if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode5))) {
                    n30.a(iHashCode5, bVar, iHashCode5, c1350a);
                }
                hlh0.a(bVar, dVarC5, cVar);
                q(eilVar, z3, ((Boolean) ytwVar.getValue()).booleanValue(), bVar, i7);
                h9n.a(erz.a(R.drawable.ic_gold_spark, 0, bVar), null, g.d(j.r(aVar2, pi60.a(R.dimen._12sdp, 0, bVar)), 1.0f, 0.0f, 2), null, null, 0.0f, null, bVar, 48, 120);
                p(str4, wqb0Var == wqb0Var2, null, eilVar, function3, true, bVar, ((i3 >> 12) & 14) | 196608 | ((i4 >> 3) & 57344), 4);
                h9n.a(erz.a(R.drawable.ic_gold_spark, 0, bVar), null, g.d(j.r(aVar2, pi60.a(R.dimen._14sdp, 0, bVar)), -2.0f, 0.0f, 2), null, null, 0.0f, null, bVar, 48, 120);
                bVar = bVar;
                z5 = true;
                bVar.X(true);
                z4 = false;
            } else {
                z4 = false;
                z5 = true;
                bVar.N(1757176323);
            }
            bVar.X(z4);
            bVar.X(z5);
            bVar.X(z5);
            ty0.a(bVar, j.i(aVar2, 8.0f));
            int i9 = i4 << 24;
            boolean z9 = z5;
            l(j.c(j.g(aVar2, 1.0f), 1.0f), xqb0Var.a, xqb0Var.b, str5, str6, str7, str8, str9, str10, str11, function4, str12, bVar, (i8 & 29360128) | (i8 & 7168) | 6 | (i8 & 57344) | (i8 & 458752) | (i8 & 3670016) | (i9 & 234881024) | (i9 & 1879048192), ((i4 >> 18) & 14) | (i6 & 112));
            bVar.X(z9);
            bVar.X(z9);
        } else {
            bVar = bVarI;
            z3 = z2;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final boolean z10 = z3;
            eVarZ.d = new Function2(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, function0, function1, function2, function3, function4, z, z10, str12, i2) { // from class: hpb0
                public final /* synthetic */ String A;
                public final /* synthetic */ Function0 B;
                public final /* synthetic */ Function0 C;
                public final /* synthetic */ Function0 D;
                public final /* synthetic */ Function0 E;
                public final /* synthetic */ Function1 F;
                public final /* synthetic */ boolean G;
                public final /* synthetic */ boolean H;
                public final /* synthetic */ String I;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ String e;
                public final /* synthetic */ String f;
                public final /* synthetic */ String i;
                public final /* synthetic */ String v;
                public final /* synthetic */ String w;
                public final /* synthetic */ String y;
                public final /* synthetic */ String z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    lqb0.j(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final boolean k(ytw<Boolean> ytwVar) {
        return ytwVar.getValue().booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:114:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:119:0x0215  */
    /* JADX WARN: Code duplicated, block: B:123:0x022a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0230  */
    /* JADX WARN: Code duplicated, block: B:126:0x0241  */
    /* JADX WARN: Code duplicated, block: B:128:0x0247  */
    /* JADX WARN: Code duplicated, block: B:130:0x0254  */
    /* JADX WARN: Code duplicated, block: B:131:0x025d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0266 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x0268  */
    /* JADX WARN: Code duplicated, block: B:136:0x0271  */
    /* JADX WARN: Code duplicated, block: B:139:0x0275  */
    /* JADX WARN: Code duplicated, block: B:140:0x028b  */
    /* JADX WARN: Code duplicated, block: B:143:0x0291  */
    /* JADX WARN: Code duplicated, block: B:146:0x029b  */
    /* JADX WARN: Code duplicated, block: B:151:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:153:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:156:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:159:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:161:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:164:0x02df  */
    /* JADX WARN: Code duplicated, block: B:167:0x02ef A[LOOP:2: B:162:0x02d9->B:167:0x02ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:171:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:173:0x0329  */
    /* JADX WARN: Code duplicated, block: B:175:0x0335  */
    /* JADX WARN: Code duplicated, block: B:177:0x0346  */
    /* JADX WARN: Code duplicated, block: B:178:0x0359  */
    /* JADX WARN: Code duplicated, block: B:180:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:181:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:185:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:188:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:190:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:192:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:193:0x040f  */
    /* JADX WARN: Code duplicated, block: B:195:0x045d  */
    /* JADX WARN: Code duplicated, block: B:196:0x045f  */
    /* JADX WARN: Code duplicated, block: B:200:0x046d  */
    /* JADX WARN: Code duplicated, block: B:203:0x049b  */
    /* JADX WARN: Code duplicated, block: B:205:0x049f  */
    /* JADX WARN: Code duplicated, block: B:207:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:208:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:210:0x0511  */
    /* JADX WARN: Code duplicated, block: B:211:0x0513  */
    /* JADX WARN: Code duplicated, block: B:215:0x0521  */
    /* JADX WARN: Code duplicated, block: B:219:0x0553  */
    /* JADX WARN: Code duplicated, block: B:226:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x02f3 A[EDGE_INSN: B:235:0x02f3->B:169:0x02f3 BREAK  A[LOOP:2: B:162:0x02d9->B:167:0x02ef], SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:139:0x0275, please report this as an issue */
    public static final void l(final d dVar, final wqb0 wqb0Var, final vqb0 vqb0Var, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final Function1 function1, final String str8, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        androidx.compose.runtime.b bVar;
        zzr zzrVar;
        yka.a.c cVar;
        boolean z;
        d.a aVar2;
        boolean z2;
        boolean z3;
        boolean zM;
        Object objY;
        boolean z4;
        boolean z5;
        boolean zM2;
        Object objY2;
        boolean z6;
        boolean z7;
        boolean zM3;
        Object objY3;
        boolean z8;
        UserTopCoeffResponse userTopCoeffResponse;
        Double dValueOf;
        final String str9;
        List<EliteTopWinsThisWeekItem> list;
        final EliteTopWinsThisWeekItem eliteTopWinsThisWeekItem;
        final ArrayList arrayList;
        final EliteTopWinsThisWeekItem eliteTopWinsThisWeekItem2;
        Iterator<T> it;
        Object next;
        int i4;
        Iterator<T> it2;
        Object next2;
        Double dValueOf2;
        int iHashCode;
        androidx.compose.runtime.b bVarI = aVar.i(867042022);
        int i5 = (i2 & 6) == 0 ? (bVarI.M(dVar) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i5 |= bVarI.d(wqb0Var.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= bVarI.M(vqb0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= bVarI.M(str) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= bVarI.M(str2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= bVarI.M(str3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i5 |= bVarI.M(str4) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i5 |= bVarI.M(str5) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= bVarI.M(str6) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= bVarI.M(str7) ? 536870912 : 268435456;
        }
        int i6 = (i3 & 6) == 0 ? i3 | (bVarI.A(function1) ? 4 : 2) : i3;
        if ((i3 & 48) == 0) {
            i6 |= bVarI.M(str8) ? 32 : 16;
        }
        if (bVarI.q(i5 & 1, ((306783379 & i5) == 306783378 && (i6 & 19) == 18) ? false : true)) {
            zzr zzrVarA = e0s.a(0, 3, bVarI);
            int i7 = 3;
            float fA = pi60.a(R.dimen._24sdp, 0, bVarI);
            float fA2 = pi60.a(R.dimen._4sdp, 0, bVarI);
            float fA3 = pi60.a(R.dimen._2sdp, 0, bVarI);
            float fA4 = pi60.a(R.dimen._16sdp, 0, bVarI);
            float fA5 = pi60.a(R.dimen._3sdp, 0, bVarI);
            float fA6 = pi60.a(R.dimen._3sdp, 0, bVarI);
            float fA7 = pi60.a(R.dimen._4sdp, 0, bVarI);
            final gw2 gw2Var = new gw2(fA, fA2, fA3, fA4, fA5, fA6, fA7);
            i(zzrVarA, function1, bVarI, (i6 << 3) & 112);
            d dVarG = j.g(dVar, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
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
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar2);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                zzrVar = zzrVarA;
            } else {
                zzrVar = zzrVarA;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                }
                cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                z = vqb0Var instanceof vqb0.d;
                aVar2 = d.a.b;
                if (z) {
                    bVarI.N(1175206741);
                    d dVarJ = h.j(j.e(aVar2, 1.0f), 0.0f, 60.0f, 0.0f, 0.0f, 13);
                    aiv aivVarC = g75.c(ht.a.b, false);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS2 = bVarI.S();
                    d dVarC2 = c.c(bVarI, dVarJ);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC, bVar2);
                    hlh0.a(bVarI, ne00VarS2, dVar2);
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    hlh0.a(bVarI, dVarC2, cVar);
                    m(0, bVarI);
                    bVarI.X(true);
                    bVarI.X(false);
                } else {
                    if (vqb0Var instanceof vqb0.b) {
                        bVarI.N(1175554065);
                        d(str, bVarI, ((i5 >> 6) & 112) | 6);
                        bVarI.X(false);
                    } else if (vqb0Var instanceof vqb0.c) {
                        bVarI.N(1175782535);
                        vqb0.c cVar2 = (vqb0.c) vqb0Var;
                        userTopCoeffResponse = cVar2.b;
                        if (userTopCoeffResponse != null) {
                            dValueOf = Double.valueOf(userTopCoeffResponse.getCashoutCoefficient());
                        } else {
                            dValueOf = null;
                        }
                        if (Intrinsics.c(dValueOf, 0.0d)) {
                            str9 = "--";
                        } else {
                            if (userTopCoeffResponse != null) {
                                dValueOf2 = Double.valueOf(userTopCoeffResponse.getCashoutCoefficient());
                            } else {
                                dValueOf2 = null;
                            }
                            if (dValueOf2 == null) {
                                str9 = "--";
                            } else {
                                str9 = userTopCoeffResponse.getCashoutCoefficient() + "x";
                            }
                        }
                        list = cVar2.a;
                        if (list != null) {
                            it2 = list.iterator();
                            do {
                                if (it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                            } while (((EliteTopWinsThisWeekItem) next2).getRank() != 1);
                            eliteTopWinsThisWeekItem = (EliteTopWinsThisWeekItem) next2;
                        } else {
                            eliteTopWinsThisWeekItem = null;
                        }
                        if (list != null) {
                            arrayList = new ArrayList();
                            for (Object obj : list) {
                                if (((EliteTopWinsThisWeekItem) obj).getRank() == 2) {
                                    arrayList.add(obj);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        if (list != null) {
                            it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                                i4 = i7;
                                if (((EliteTopWinsThisWeekItem) next).getRank() == i4) {
                                    break;
                                } else {
                                    i7 = i4;
                                }
                            }
                            eliteTopWinsThisWeekItem2 = (EliteTopWinsThisWeekItem) next;
                        } else {
                            eliteTopWinsThisWeekItem2 = null;
                        }
                        d dVarC3 = op70.c(j.e(aVar2, 1.0f), op70.a(bVarI), 14);
                        op8 op8VarB = pp8.b(-1117679630, new gaj() { // from class: cqb0
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                Unit unit;
                                Unit unit2;
                                EliteTopWinsThisWeekItem eliteTopWinsThisWeekItem3;
                                Unit unit3;
                                r75 r75Var = (r75) obj2;
                                a aVar4 = (a) obj3;
                                int iIntValue = ((Integer) obj4).intValue();
                                r75Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= aVar4.M(r75Var) ? 4 : 2;
                                }
                                if (aVar4.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    float fE = r75Var.e() * 0.77f;
                                    d.a aVar5 = d.a.b;
                                    d dVarG2 = j.g(aVar5, 1.0f);
                                    i78 i78VarA2 = g78.a(kw0.c, ht.a.n, aVar4, 48);
                                    int iHashCode3 = Long.hashCode(aVar4.m());
                                    ne00 ne00VarO = aVar4.o();
                                    d dVarC4 = c.c(aVar4, dVarG2);
                                    yka.k.getClass();
                                    tsr.a aVar6 = yka.a.b;
                                    if (aVar4.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar4.D();
                                    if (aVar4.g()) {
                                        aVar4.F(aVar6);
                                    } else {
                                        aVar4.p();
                                    }
                                    yka.a.b bVar3 = yka.a.f;
                                    hlh0.a(aVar4, i78VarA2, bVar3);
                                    yka.a.d dVar3 = yka.a.e;
                                    hlh0.a(aVar4, ne00VarO, dVar3);
                                    yka.a.C1350a c1350a2 = yka.a.g;
                                    if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode3))) {
                                        j3c.a(iHashCode3, aVar4, iHashCode3, c1350a2);
                                    }
                                    yka.a.c cVar3 = yka.a.d;
                                    hlh0.a(aVar4, dVarC4, cVar3);
                                    lqb0.e(0, aVar4, h.g(aVar5, pi60.a(R.dimen._1sdp, 0, aVar4), pi60.a(R.dimen._4sdp, 0, aVar4)), str9, str7);
                                    ty0.a(aVar4, j.i(aVar5, pi60.a(R.dimen._18sdp, 0, aVar4)));
                                    d dVarI = j.i(j.g(dVar, 1.0f), fE);
                                    d160 d160VarA = b160.a(kw0.g, ht.a.l, aVar4, 54);
                                    int iHashCode4 = Long.hashCode(aVar4.m());
                                    ne00 ne00VarO2 = aVar4.o();
                                    d dVarC5 = c.c(aVar4, dVarI);
                                    if (aVar4.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar4.D();
                                    if (aVar4.g()) {
                                        aVar4.F(aVar6);
                                    } else {
                                        aVar4.p();
                                    }
                                    hlh0.a(aVar4, d160VarA, bVar3);
                                    hlh0.a(aVar4, ne00VarO2, dVar3);
                                    if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode4))) {
                                        j3c.a(iHashCode4, aVar4, iHashCode4, c1350a2);
                                    }
                                    hlh0.a(aVar4, dVarC5, cVar3);
                                    List list2 = arrayList;
                                    EliteTopWinsThisWeekItem eliteTopWinsThisWeekItem4 = list2 != null ? (EliteTopWinsThisWeekItem) CollectionsKt.V(0, list2) : null;
                                    String str10 = str8;
                                    f160 f160Var = f160.a;
                                    if (eliteTopWinsThisWeekItem4 == null) {
                                        aVar4.N(-682274102);
                                        aVar4.H();
                                        unit = null;
                                    } else {
                                        aVar4.N(-682274101);
                                        lqb0.s(eliteTopWinsThisWeekItem4, j.i(f160Var.a(1.0f, aVar5, true), 0.68f * fE), lqb0.t(eliteTopWinsThisWeekItem4.getCurrency(), str10), aVar4, EliteTopWinsThisWeekItem.$stable);
                                        Unit unit4 = Unit.a;
                                        aVar4.H();
                                        unit = Unit.a;
                                    }
                                    if (unit == null) {
                                        aVar4.N(1086383207);
                                        ty0.a(aVar4, f160Var.a(1.0f, aVar5, true));
                                        aVar4.H();
                                    } else {
                                        aVar4.N(1086369040);
                                        aVar4.H();
                                    }
                                    ty0.a(aVar4, j.w(aVar5, i18.c(R.dimen._10sdp, 0, aVar4)));
                                    EliteTopWinsThisWeekItem eliteTopWinsThisWeekItem5 = eliteTopWinsThisWeekItem;
                                    if (eliteTopWinsThisWeekItem5 == null) {
                                        aVar4.N(-681628341);
                                        aVar4.H();
                                        unit2 = null;
                                    } else {
                                        aVar4.N(-681628340);
                                        lqb0.s(eliteTopWinsThisWeekItem5, j.i(f160Var.a(1.0f, aVar5, true), 0.8f * fE), lqb0.t(eliteTopWinsThisWeekItem5.getCurrency(), str10), aVar4, EliteTopWinsThisWeekItem.$stable);
                                        Unit unit5 = Unit.a;
                                        aVar4.H();
                                        unit2 = Unit.a;
                                    }
                                    if (unit2 == null) {
                                        aVar4.N(1086404007);
                                        ty0.a(aVar4, f160Var.a(1.0f, aVar5, true));
                                        aVar4.H();
                                    } else {
                                        aVar4.N(1086390460);
                                        aVar4.H();
                                    }
                                    ty0.a(aVar4, j.w(aVar5, i18.c(R.dimen._10sdp, 0, aVar4)));
                                    if (list2 == null || (eliteTopWinsThisWeekItem3 = (EliteTopWinsThisWeekItem) CollectionsKt.V(1, list2)) == null) {
                                        eliteTopWinsThisWeekItem3 = eliteTopWinsThisWeekItem2;
                                    }
                                    if (eliteTopWinsThisWeekItem3 == null) {
                                        aVar4.N(-680768246);
                                        aVar4.H();
                                        unit3 = null;
                                    } else {
                                        aVar4.N(-680768245);
                                        lqb0.s(eliteTopWinsThisWeekItem3, j.i(f160Var.a(1.0f, aVar5, true), fE * 0.61f), lqb0.t(eliteTopWinsThisWeekItem3.getCurrency(), str10), aVar4, EliteTopWinsThisWeekItem.$stable);
                                        Unit unit6 = Unit.a;
                                        aVar4.H();
                                        unit3 = Unit.a;
                                    }
                                    if (unit3 == null) {
                                        aVar4.N(1086431783);
                                        ty0.a(aVar4, f160Var.a(1.0f, aVar5, true));
                                        aVar4.H();
                                    } else {
                                        aVar4.N(1086418081);
                                        aVar4.H();
                                    }
                                    aVar4.s();
                                    aVar4.s();
                                } else {
                                    aVar4.G();
                                }
                                return Unit.a;
                            }
                        }, bVarI);
                        bVar = bVarI;
                        q75.a(dVarC3, null, false, op8VarB, bVar, 3072, 6);
                        bVar.X(false);
                    } else {
                        bVar = bVarI;
                        z2 = vqb0Var instanceof vqb0.a;
                        androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                        if (z2) {
                            bVar.N(1179610818);
                            if (((vqb0.a) vqb0Var).a.isEmpty()) {
                                bVar.N(-1901609967);
                                d(str, bVar, ((i5 >> 6) & 112) | 6);
                                z8 = false;
                                bVar.X(false);
                            } else {
                                bVar.N(1179694952);
                                int i8 = i5 >> 9;
                                f(wqb0Var, str2, str3, str4, str5, str6, bVar, ((i5 >> 3) & 14) | (i8 & 112) | (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752));
                                d dVarJ2 = h.j(j.g(aVar2, 1.0f), 0.0f, fA3, 0.0f, 0.0f, 13);
                                kw0.i iVar = new kw0.i(fA7, true, new hw0());
                                if ((i5 & 896) == 256) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                zM3 = z7 | bVar.M(gw2Var);
                                objY3 = bVar.y();
                                if (zM3 || objY3 == c0042a) {
                                    objY3 = new Function1() { // from class: eqb0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            szr szrVar = (szr) obj2;
                                            szrVar.getClass();
                                            List<TopBets> list2 = ((vqb0.a) vqb0Var).a;
                                            szrVar.d(list2.size(), null, new pqb0(list2), new op8(802480018, new qqb0(list2, gw2Var), true));
                                            return Unit.a;
                                        }
                                    };
                                    bVar.r(objY3);
                                }
                                aur.a(dVarJ2, zzrVar, null, false, iVar, null, null, false, null, (Function1) objY3, bVar, 0, 492);
                                z8 = false;
                                bVar.X(false);
                            }
                            bVar.X(z8);
                        } else if (vqb0Var instanceof vqb0.e) {
                            bVar.N(1180399551);
                            if (((vqb0.e) vqb0Var).a.isEmpty()) {
                                bVar.N(-1901584559);
                                d(str, bVar, ((i5 >> 6) & 112) | 6);
                                z6 = false;
                                bVar.X(false);
                            } else {
                                bVar.N(1180483685);
                                int i9 = i5 >> 9;
                                f(wqb0Var, str2, str3, str4, str5, str6, bVar, ((i5 >> 3) & 14) | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (i9 & 57344) | (i9 & 458752));
                                d dVarJ3 = h.j(j.g(aVar2, 1.0f), 0.0f, fA3, 0.0f, 0.0f, 13);
                                kw0.i iVar2 = new kw0.i(fA7, true, new hw0());
                                if ((i5 & 896) == 256) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                zM2 = z5 | bVar.M(gw2Var);
                                objY2 = bVar.y();
                                if (zM2 || objY2 == c0042a) {
                                    objY2 = new Function1() { // from class: fqb0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            szr szrVar = (szr) obj2;
                                            szrVar.getClass();
                                            List<BetHistoryItem> list2 = ((vqb0.e) vqb0Var).a;
                                            szrVar.d(list2.size(), new rqb0(new vm7(1), list2), new sqb0(list2), new op8(802480018, new tqb0(list2, gw2Var), true));
                                            return Unit.a;
                                        }
                                    };
                                    bVar.r(objY2);
                                }
                                aur.a(dVarJ3, zzrVar, null, false, iVar2, null, null, false, null, (Function1) objY2, bVar, 0, 492);
                                z6 = false;
                                bVar.X(false);
                            }
                            bVar.X(z6);
                        } else {
                            if (vqb0Var instanceof vqb0.f) {
                                throw igf0.a(bVar, -1901748348, false);
                            }
                            bVar.N(1181222446);
                            if (((vqb0.f) vqb0Var).a.isEmpty()) {
                                bVar.N(-1901557999);
                                d(str, bVar, ((i5 >> 6) & 112) | 6);
                                z4 = false;
                                bVar.X(false);
                            } else {
                                bVar.N(1181306580);
                                int i10 = i5 >> 9;
                                f(wqb0Var, str2, str3, str4, str5, str6, bVar, ((i5 >> 3) & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (i10 & 57344) | (i10 & 458752));
                                d dVarJ4 = h.j(j.g(aVar2, 1.0f), 0.0f, fA3, 0.0f, 0.0f, 13);
                                kw0.i iVar3 = new kw0.i(fA7, true, new hw0());
                                if ((i5 & 896) == 256) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                zM = bVar.M(gw2Var) | z3;
                                objY = bVar.y();
                                if (zM || objY == c0042a) {
                                    objY = new Function1() { // from class: gqb0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            szr szrVar = (szr) obj2;
                                            szrVar.getClass();
                                            final vqb0 vqb0Var2 = vqb0Var;
                                            int size = ((vqb0.f) vqb0Var2).a.size();
                                            final gw2 gw2Var2 = gw2Var;
                                            szr.f(szrVar, size, null, new op8(480020347, new iaj() { // from class: ipb0
                                                @Override // defpackage.iaj
                                                public final Object d(Object obj3, Object obj4, Object obj5, Object obj6) {
                                                    int iIntValue = ((Integer) obj4).intValue();
                                                    a aVar4 = (a) obj5;
                                                    int iIntValue2 = ((Integer) obj6).intValue();
                                                    ((gwr) obj3).getClass();
                                                    if ((iIntValue2 & 48) == 0) {
                                                        iIntValue2 |= aVar4.d(iIntValue) ? 32 : 16;
                                                    }
                                                    if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                                        lqb0.r(((vqb0.f) vqb0Var2).a.get(iIntValue), gw2Var2, aVar4, 0);
                                                    } else {
                                                        aVar4.G();
                                                    }
                                                    return Unit.a;
                                                }
                                            }, true), 6);
                                            return Unit.a;
                                        }
                                    };
                                    bVar.r(objY);
                                }
                                aur.a(dVarJ4, zzrVar, null, false, iVar3, null, null, false, null, (Function1) objY, bVar, 0, 492);
                                z4 = false;
                                bVar.X(false);
                            }
                            bVar.X(z4);
                        }
                    }
                    bVar.X(true);
                }
                bVar = bVarI;
                bVar.X(true);
            }
            n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            z = vqb0Var instanceof vqb0.d;
            aVar2 = d.a.b;
            if (z) {
                bVarI.N(1175206741);
                d dVarJ5 = h.j(j.e(aVar2, 1.0f), 0.0f, 60.0f, 0.0f, 0.0f, 13);
                aiv aivVarC2 = g75.c(ht.a.b, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC4 = c.c(bVarI, dVarJ5);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC2, bVar2);
                hlh0.a(bVarI, ne00VarS3, dVar2);
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC4, cVar);
                m(0, bVarI);
                bVarI.X(true);
                bVarI.X(false);
            } else {
                if (vqb0Var instanceof vqb0.b) {
                    bVarI.N(1175554065);
                    d(str, bVarI, ((i5 >> 6) & 112) | 6);
                    bVarI.X(false);
                } else if (vqb0Var instanceof vqb0.c) {
                    bVarI.N(1175782535);
                    vqb0.c cVar3 = (vqb0.c) vqb0Var;
                    userTopCoeffResponse = cVar3.b;
                    if (userTopCoeffResponse != null) {
                        dValueOf = Double.valueOf(userTopCoeffResponse.getCashoutCoefficient());
                    } else {
                        dValueOf = null;
                    }
                    if (Intrinsics.c(dValueOf, 0.0d)) {
                        str9 = "--";
                    } else {
                        if (userTopCoeffResponse != null) {
                            dValueOf2 = Double.valueOf(userTopCoeffResponse.getCashoutCoefficient());
                        } else {
                            dValueOf2 = null;
                        }
                        if (dValueOf2 == null) {
                            str9 = "--";
                        } else {
                            str9 = userTopCoeffResponse.getCashoutCoefficient() + "x";
                        }
                    }
                    list = cVar3.a;
                    if (list != null) {
                        it2 = list.iterator();
                        do {
                            if (it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                        } while (((EliteTopWinsThisWeekItem) next2).getRank() != 1);
                        eliteTopWinsThisWeekItem = (EliteTopWinsThisWeekItem) next2;
                    } else {
                        eliteTopWinsThisWeekItem = null;
                    }
                    if (list != null) {
                        arrayList = new ArrayList();
                        while (r6.hasNext()) {
                            if (((EliteTopWinsThisWeekItem) obj).getRank() == 2) {
                                arrayList.add(obj);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (list != null) {
                        it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            i4 = i7;
                            if (((EliteTopWinsThisWeekItem) next).getRank() == i4) {
                                break;
                                break;
                            }
                            i7 = i4;
                        }
                        eliteTopWinsThisWeekItem2 = (EliteTopWinsThisWeekItem) next;
                    } else {
                        eliteTopWinsThisWeekItem2 = null;
                    }
                    d dVarC5 = op70.c(j.e(aVar2, 1.0f), op70.a(bVarI), 14);
                    op8 op8VarB2 = pp8.b(-1117679630, new gaj() { // from class: cqb0
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj2, Object obj3, Object obj4) {
                            Unit unit;
                            Unit unit2;
                            EliteTopWinsThisWeekItem eliteTopWinsThisWeekItem3;
                            Unit unit3;
                            r75 r75Var = (r75) obj2;
                            a aVar4 = (a) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            r75Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= aVar4.M(r75Var) ? 4 : 2;
                            }
                            if (aVar4.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                                float fE = r75Var.e() * 0.77f;
                                d.a aVar5 = d.a.b;
                                d dVarG2 = j.g(aVar5, 1.0f);
                                i78 i78VarA2 = g78.a(kw0.c, ht.a.n, aVar4, 48);
                                int iHashCode3 = Long.hashCode(aVar4.m());
                                ne00 ne00VarO = aVar4.o();
                                d dVarC6 = c.c(aVar4, dVarG2);
                                yka.k.getClass();
                                tsr.a aVar6 = yka.a.b;
                                if (aVar4.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar4.D();
                                if (aVar4.g()) {
                                    aVar4.F(aVar6);
                                } else {
                                    aVar4.p();
                                }
                                yka.a.b bVar3 = yka.a.f;
                                hlh0.a(aVar4, i78VarA2, bVar3);
                                yka.a.d dVar3 = yka.a.e;
                                hlh0.a(aVar4, ne00VarO, dVar3);
                                yka.a.C1350a c1350a2 = yka.a.g;
                                if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode3))) {
                                    j3c.a(iHashCode3, aVar4, iHashCode3, c1350a2);
                                }
                                yka.a.c cVar4 = yka.a.d;
                                hlh0.a(aVar4, dVarC6, cVar4);
                                lqb0.e(0, aVar4, h.g(aVar5, pi60.a(R.dimen._1sdp, 0, aVar4), pi60.a(R.dimen._4sdp, 0, aVar4)), str9, str7);
                                ty0.a(aVar4, j.i(aVar5, pi60.a(R.dimen._18sdp, 0, aVar4)));
                                d dVarI = j.i(j.g(dVar, 1.0f), fE);
                                d160 d160VarA = b160.a(kw0.g, ht.a.l, aVar4, 54);
                                int iHashCode4 = Long.hashCode(aVar4.m());
                                ne00 ne00VarO2 = aVar4.o();
                                d dVarC7 = c.c(aVar4, dVarI);
                                if (aVar4.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar4.D();
                                if (aVar4.g()) {
                                    aVar4.F(aVar6);
                                } else {
                                    aVar4.p();
                                }
                                hlh0.a(aVar4, d160VarA, bVar3);
                                hlh0.a(aVar4, ne00VarO2, dVar3);
                                if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode4))) {
                                    j3c.a(iHashCode4, aVar4, iHashCode4, c1350a2);
                                }
                                hlh0.a(aVar4, dVarC7, cVar4);
                                List list2 = arrayList;
                                EliteTopWinsThisWeekItem eliteTopWinsThisWeekItem4 = list2 != null ? (EliteTopWinsThisWeekItem) CollectionsKt.V(0, list2) : null;
                                String str10 = str8;
                                f160 f160Var = f160.a;
                                if (eliteTopWinsThisWeekItem4 == null) {
                                    aVar4.N(-682274102);
                                    aVar4.H();
                                    unit = null;
                                } else {
                                    aVar4.N(-682274101);
                                    lqb0.s(eliteTopWinsThisWeekItem4, j.i(f160Var.a(1.0f, aVar5, true), 0.68f * fE), lqb0.t(eliteTopWinsThisWeekItem4.getCurrency(), str10), aVar4, EliteTopWinsThisWeekItem.$stable);
                                    Unit unit4 = Unit.a;
                                    aVar4.H();
                                    unit = Unit.a;
                                }
                                if (unit == null) {
                                    aVar4.N(1086383207);
                                    ty0.a(aVar4, f160Var.a(1.0f, aVar5, true));
                                    aVar4.H();
                                } else {
                                    aVar4.N(1086369040);
                                    aVar4.H();
                                }
                                ty0.a(aVar4, j.w(aVar5, i18.c(R.dimen._10sdp, 0, aVar4)));
                                EliteTopWinsThisWeekItem eliteTopWinsThisWeekItem5 = eliteTopWinsThisWeekItem;
                                if (eliteTopWinsThisWeekItem5 == null) {
                                    aVar4.N(-681628341);
                                    aVar4.H();
                                    unit2 = null;
                                } else {
                                    aVar4.N(-681628340);
                                    lqb0.s(eliteTopWinsThisWeekItem5, j.i(f160Var.a(1.0f, aVar5, true), 0.8f * fE), lqb0.t(eliteTopWinsThisWeekItem5.getCurrency(), str10), aVar4, EliteTopWinsThisWeekItem.$stable);
                                    Unit unit5 = Unit.a;
                                    aVar4.H();
                                    unit2 = Unit.a;
                                }
                                if (unit2 == null) {
                                    aVar4.N(1086404007);
                                    ty0.a(aVar4, f160Var.a(1.0f, aVar5, true));
                                    aVar4.H();
                                } else {
                                    aVar4.N(1086390460);
                                    aVar4.H();
                                }
                                ty0.a(aVar4, j.w(aVar5, i18.c(R.dimen._10sdp, 0, aVar4)));
                                if (list2 == null || (eliteTopWinsThisWeekItem3 = (EliteTopWinsThisWeekItem) CollectionsKt.V(1, list2)) == null) {
                                    eliteTopWinsThisWeekItem3 = eliteTopWinsThisWeekItem2;
                                }
                                if (eliteTopWinsThisWeekItem3 == null) {
                                    aVar4.N(-680768246);
                                    aVar4.H();
                                    unit3 = null;
                                } else {
                                    aVar4.N(-680768245);
                                    lqb0.s(eliteTopWinsThisWeekItem3, j.i(f160Var.a(1.0f, aVar5, true), fE * 0.61f), lqb0.t(eliteTopWinsThisWeekItem3.getCurrency(), str10), aVar4, EliteTopWinsThisWeekItem.$stable);
                                    Unit unit6 = Unit.a;
                                    aVar4.H();
                                    unit3 = Unit.a;
                                }
                                if (unit3 == null) {
                                    aVar4.N(1086431783);
                                    ty0.a(aVar4, f160Var.a(1.0f, aVar5, true));
                                    aVar4.H();
                                } else {
                                    aVar4.N(1086418081);
                                    aVar4.H();
                                }
                                aVar4.s();
                                aVar4.s();
                            } else {
                                aVar4.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI);
                    bVar = bVarI;
                    q75.a(dVarC5, null, false, op8VarB2, bVar, 3072, 6);
                    bVar.X(false);
                } else {
                    bVar = bVarI;
                    z2 = vqb0Var instanceof vqb0.a;
                    androidx.compose.runtime.a.C0041a.C0042a c0042a2 = androidx.compose.runtime.a.C0041a.a;
                    if (z2) {
                        bVar.N(1179610818);
                        if (((vqb0.a) vqb0Var).a.isEmpty()) {
                            bVar.N(-1901609967);
                            d(str, bVar, ((i5 >> 6) & 112) | 6);
                            z8 = false;
                            bVar.X(false);
                        } else {
                            bVar.N(1179694952);
                            int i11 = i5 >> 9;
                            f(wqb0Var, str2, str3, str4, str5, str6, bVar, ((i5 >> 3) & 14) | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (i11 & 57344) | (i11 & 458752));
                            d dVarJ6 = h.j(j.g(aVar2, 1.0f), 0.0f, fA3, 0.0f, 0.0f, 13);
                            kw0.i iVar4 = new kw0.i(fA7, true, new hw0());
                            if ((i5 & 896) == 256) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            zM3 = z7 | bVar.M(gw2Var);
                            objY3 = bVar.y();
                            if (zM3) {
                                objY3 = new Function1() { // from class: eqb0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        szr szrVar = (szr) obj2;
                                        szrVar.getClass();
                                        List<TopBets> list2 = ((vqb0.a) vqb0Var).a;
                                        szrVar.d(list2.size(), null, new pqb0(list2), new op8(802480018, new qqb0(list2, gw2Var), true));
                                        return Unit.a;
                                    }
                                };
                                bVar.r(objY3);
                            } else {
                                objY3 = new Function1() { // from class: eqb0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        szr szrVar = (szr) obj2;
                                        szrVar.getClass();
                                        List<TopBets> list2 = ((vqb0.a) vqb0Var).a;
                                        szrVar.d(list2.size(), null, new pqb0(list2), new op8(802480018, new qqb0(list2, gw2Var), true));
                                        return Unit.a;
                                    }
                                };
                                bVar.r(objY3);
                            }
                            aur.a(dVarJ6, zzrVar, null, false, iVar4, null, null, false, null, (Function1) objY3, bVar, 0, 492);
                            z8 = false;
                            bVar.X(false);
                        }
                        bVar.X(z8);
                    } else if (vqb0Var instanceof vqb0.e) {
                        bVar.N(1180399551);
                        if (((vqb0.e) vqb0Var).a.isEmpty()) {
                            bVar.N(-1901584559);
                            d(str, bVar, ((i5 >> 6) & 112) | 6);
                            z6 = false;
                            bVar.X(false);
                        } else {
                            bVar.N(1180483685);
                            int i12 = i5 >> 9;
                            f(wqb0Var, str2, str3, str4, str5, str6, bVar, ((i5 >> 3) & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752));
                            d dVarJ7 = h.j(j.g(aVar2, 1.0f), 0.0f, fA3, 0.0f, 0.0f, 13);
                            kw0.i iVar5 = new kw0.i(fA7, true, new hw0());
                            if ((i5 & 896) == 256) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            zM2 = z5 | bVar.M(gw2Var);
                            objY2 = bVar.y();
                            if (zM2) {
                                objY2 = new Function1() { // from class: fqb0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        szr szrVar = (szr) obj2;
                                        szrVar.getClass();
                                        List<BetHistoryItem> list2 = ((vqb0.e) vqb0Var).a;
                                        szrVar.d(list2.size(), new rqb0(new vm7(1), list2), new sqb0(list2), new op8(802480018, new tqb0(list2, gw2Var), true));
                                        return Unit.a;
                                    }
                                };
                                bVar.r(objY2);
                            } else {
                                objY2 = new Function1() { // from class: fqb0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        szr szrVar = (szr) obj2;
                                        szrVar.getClass();
                                        List<BetHistoryItem> list2 = ((vqb0.e) vqb0Var).a;
                                        szrVar.d(list2.size(), new rqb0(new vm7(1), list2), new sqb0(list2), new op8(802480018, new tqb0(list2, gw2Var), true));
                                        return Unit.a;
                                    }
                                };
                                bVar.r(objY2);
                            }
                            aur.a(dVarJ7, zzrVar, null, false, iVar5, null, null, false, null, (Function1) objY2, bVar, 0, 492);
                            z6 = false;
                            bVar.X(false);
                        }
                        bVar.X(z6);
                    } else {
                        if (vqb0Var instanceof vqb0.f) {
                            throw igf0.a(bVar, -1901748348, false);
                        }
                        bVar.N(1181222446);
                        if (((vqb0.f) vqb0Var).a.isEmpty()) {
                            bVar.N(-1901557999);
                            d(str, bVar, ((i5 >> 6) & 112) | 6);
                            z4 = false;
                            bVar.X(false);
                        } else {
                            bVar.N(1181306580);
                            int i13 = i5 >> 9;
                            f(wqb0Var, str2, str3, str4, str5, str6, bVar, ((i5 >> 3) & 14) | (i13 & 112) | (i13 & 896) | (i13 & 7168) | (i13 & 57344) | (i13 & 458752));
                            d dVarJ8 = h.j(j.g(aVar2, 1.0f), 0.0f, fA3, 0.0f, 0.0f, 13);
                            kw0.i iVar6 = new kw0.i(fA7, true, new hw0());
                            if ((i5 & 896) == 256) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            zM = bVar.M(gw2Var) | z3;
                            objY = bVar.y();
                            if (zM) {
                                objY = new Function1() { // from class: gqb0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        szr szrVar = (szr) obj2;
                                        szrVar.getClass();
                                        final vqb0 vqb0Var2 = vqb0Var;
                                        int size = ((vqb0.f) vqb0Var2).a.size();
                                        final gw2 gw2Var2 = gw2Var;
                                        szr.f(szrVar, size, null, new op8(480020347, new iaj() { // from class: ipb0
                                            @Override // defpackage.iaj
                                            public final Object d(Object obj3, Object obj4, Object obj5, Object obj6) {
                                                int iIntValue = ((Integer) obj4).intValue();
                                                a aVar4 = (a) obj5;
                                                int iIntValue2 = ((Integer) obj6).intValue();
                                                ((gwr) obj3).getClass();
                                                if ((iIntValue2 & 48) == 0) {
                                                    iIntValue2 |= aVar4.d(iIntValue) ? 32 : 16;
                                                }
                                                if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                                    lqb0.r(((vqb0.f) vqb0Var2).a.get(iIntValue), gw2Var2, aVar4, 0);
                                                } else {
                                                    aVar4.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, true), 6);
                                        return Unit.a;
                                    }
                                };
                                bVar.r(objY);
                            } else {
                                objY = new Function1() { // from class: gqb0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        szr szrVar = (szr) obj2;
                                        szrVar.getClass();
                                        final vqb0 vqb0Var2 = vqb0Var;
                                        int size = ((vqb0.f) vqb0Var2).a.size();
                                        final gw2 gw2Var2 = gw2Var;
                                        szr.f(szrVar, size, null, new op8(480020347, new iaj() { // from class: ipb0
                                            @Override // defpackage.iaj
                                            public final Object d(Object obj3, Object obj4, Object obj5, Object obj6) {
                                                int iIntValue = ((Integer) obj4).intValue();
                                                a aVar4 = (a) obj5;
                                                int iIntValue2 = ((Integer) obj6).intValue();
                                                ((gwr) obj3).getClass();
                                                if ((iIntValue2 & 48) == 0) {
                                                    iIntValue2 |= aVar4.d(iIntValue) ? 32 : 16;
                                                }
                                                if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                                    lqb0.r(((vqb0.f) vqb0Var2).a.get(iIntValue), gw2Var2, aVar4, 0);
                                                } else {
                                                    aVar4.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, true), 6);
                                        return Unit.a;
                                    }
                                };
                                bVar.r(objY);
                            }
                            aur.a(dVarJ8, zzrVar, null, false, iVar6, null, null, false, null, (Function1) objY, bVar, 0, 492);
                            z4 = false;
                            bVar.X(false);
                        }
                        bVar.X(z4);
                    }
                }
                bVar.X(true);
            }
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: hqb0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(i2 | 1);
                    int iA2 = qj40.a(i3);
                    lqb0.l(dVar, wqb0Var, vqb0Var, str, str2, str3, str4, str5, str6, str7, function1, str8, (a) obj2, iA, iA2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void m(int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(-1627865343);
        if (bVarI.q(i2 & 1, i2 != 0)) {
            d dVarI = j.i(d.a.b, fw20.a(R.dimen._32sdp, bVarI));
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new upb0();
                bVarI.r(objY);
            }
            androidx.compose.ui.viewinterop.b.a((Function1) objY, dVarI, null, bVarI, 6, 4);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new vpb0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00be  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:72:0x0110  */
    /* JADX WARN: Code duplicated, block: B:75:0x0121  */
    /* JADX WARN: Code duplicated, block: B:79:0x015a  */
    /* JADX WARN: Code duplicated, block: B:80:0x015e  */
    /* JADX WARN: Code duplicated, block: B:83:0x016b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0179  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void n(final gw2 gw2Var, boolean z, final op8 op8Var, String str, String str2, String str3, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        boolean z2;
        boolean z3;
        String str4;
        String str5;
        final boolean z4;
        e eVarZ;
        long j2;
        long j3;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        boolean z5;
        int iHashCode2;
        int i5;
        int i6;
        int i7;
        int i8;
        final String str6 = str3;
        androidx.compose.runtime.b bVarI = aVar.i(-1931927129);
        if ((i2 & 6) == 0) {
            i4 = (bVarI.M(gw2Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 == 0) {
            if ((i2 & 48) == 0) {
                z2 = z;
                i4 |= bVarI.b(z2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                if (bVarI.A(op8Var)) {
                    i8 = 256;
                } else {
                    i8 = 128;
                }
                i4 |= i8;
            }
            if ((i2 & 3072) == 0) {
                if (bVarI.M(str)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i4 |= i7;
            }
            if ((i2 & 24576) == 0) {
                if (bVarI.M(str2)) {
                    i6 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i6 = 8192;
                }
                i4 |= i6;
            }
            if ((196608 & i2) == 0) {
                if (bVarI.M(str6)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i4 |= i5;
            }
            if ((74899 & i4) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i4 & 1, z3)) {
                if (i9 != 0) {
                    z2 = false;
                }
                d.a aVar3 = d.a.b;
                d dVarK = j.k(j.g(aVar3, 1.0f), gw2Var.a, 0.0f, 2);
                i060 i060Var = m;
                d dVarA = ls7.a(dVarK, i060Var);
                if (z2) {
                    j2 = i;
                } else {
                    j2 = j58.l;
                }
                d dVarB = androidx.compose.foundation.a.b(dVarA, j2, i060Var);
                if (z2) {
                    j3 = j;
                } else {
                    j3 = k;
                }
                d dVarG = h.g(d35.a(dVarB, 1.0f, j3, i060Var), gw2Var.b, gw2Var.c);
                kw0.j jVar = kw0.a;
                n54.b bVar = ht.a.k;
                d160 d160VarA = b160.a(jVar, bVar, bVarI, 48);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVarG);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                int i10 = i4;
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                yka.a.b bVar2 = yka.a.f;
                hlh0.a(bVarI, d160VarA, bVar2);
                yka.a.d dVar = yka.a.e;
                hlh0.a(bVarI, ne00VarS, dVar);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    z5 = z2;
                } else {
                    z5 = z2;
                    if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    }
                    yka.a.c cVar = yka.a.d;
                    hlh0.a(bVarI, dVarC, cVar);
                    f160 f160Var = f160.a;
                    d dVarA2 = f160Var.a(1.0f, aVar3, true);
                    int i11 = ((i10 << 3) & 7168) | 384;
                    d160 d160VarA2 = b160.a(jVar, bVar, bVarI, 48);
                    iHashCode2 = Long.hashCode(bVarI.T);
                    ne00 ne00VarS2 = bVarI.S();
                    d dVarC2 = c.c(bVarI, dVarA2);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA2, bVar2);
                    hlh0.a(bVarI, ne00VarS2, dVar);
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                        n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                    }
                    hlh0.a(bVarI, dVarC2, cVar);
                    op8Var.invoke(f160Var, bVarI, Integer.valueOf(((i11 >> 6) & 112) | 6));
                    bVarI.X(true);
                    str4 = str;
                    o(3, (i10 >> 9) & 14, bVarI, h.j(f160Var.a(1.0f, aVar3, true), gw2Var.f, 0.0f, 0.0f, 0.0f, 14), str4);
                    str5 = str2;
                    o(3, (i10 >> 12) & 14, bVarI, h.j(f160Var.a(1.0f, aVar3, true), 0.0f, 0.0f, gw2Var.f, 0.0f, 11), str5);
                    str6 = str3;
                    o(6, (i10 >> 15) & 14, bVarI, h.j(f160Var.a(1.0f, aVar3, true), 0.0f, 0.0f, gw2Var.f, 0.0f, 11), str6);
                    bVarI.X(true);
                    z4 = z5;
                }
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
                yka.a.c cVar2 = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar2);
                f160 f160Var2 = f160.a;
                d dVarA3 = f160Var2.a(1.0f, aVar3, true);
                int i12 = ((i10 << 3) & 7168) | 384;
                d160 d160VarA3 = b160.a(jVar, bVar, bVarI, 48);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = c.c(bVarI, dVarA3);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA3, bVar2);
                hlh0.a(bVarI, ne00VarS3, dVar);
                if (bVarI.S) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC3, cVar2);
                op8Var.invoke(f160Var2, bVarI, Integer.valueOf(((i12 >> 6) & 112) | 6));
                bVarI.X(true);
                str4 = str;
                o(3, (i10 >> 9) & 14, bVarI, h.j(f160Var2.a(1.0f, aVar3, true), gw2Var.f, 0.0f, 0.0f, 0.0f, 14), str4);
                str5 = str2;
                o(3, (i10 >> 12) & 14, bVarI, h.j(f160Var2.a(1.0f, aVar3, true), 0.0f, 0.0f, gw2Var.f, 0.0f, 11), str5);
                str6 = str3;
                o(6, (i10 >> 15) & 14, bVarI, h.j(f160Var2.a(1.0f, aVar3, true), 0.0f, 0.0f, gw2Var.f, 0.0f, 11), str6);
                bVarI.X(true);
                z4 = z5;
            } else {
                str4 = str;
                str5 = str2;
                bVarI.G();
                z4 = z2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                final String str7 = str4;
                final String str8 = str5;
                eVarZ.d = new Function2() { // from class: dqb0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        lqb0.n(gw2Var, z4, op8Var, str7, str8, str6, (a) obj, qj40.a(i2 | 1), i3);
                        return Unit.a;
                    }
                };
            }
        }
        i4 |= 48;
        z2 = z;
        if ((i2 & 384) == 0) {
            if (bVarI.A(op8Var)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i4 |= i8;
        }
        if ((i2 & 3072) == 0) {
            if (bVarI.M(str)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i4 |= i7;
        }
        if ((i2 & 24576) == 0) {
            if (bVarI.M(str2)) {
                i6 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i6 = 8192;
            }
            i4 |= i6;
        }
        if ((196608 & i2) == 0) {
            if (bVarI.M(str6)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i4 |= i5;
        }
        if ((74899 & i4) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i4 & 1, z3)) {
            if (i9 != 0) {
                z2 = false;
            }
            d.a aVar4 = d.a.b;
            d dVarK2 = j.k(j.g(aVar4, 1.0f), gw2Var.a, 0.0f, 2);
            i060 i060Var2 = m;
            d dVarA4 = ls7.a(dVarK2, i060Var2);
            if (z2) {
                j2 = i;
            } else {
                j2 = j58.l;
            }
            d dVarB2 = androidx.compose.foundation.a.b(dVarA4, j2, i060Var2);
            if (z2) {
                j3 = j;
            } else {
                j3 = k;
            }
            d dVarG2 = h.g(d35.a(dVarB2, 1.0f, j3, i060Var2), gw2Var.b, gw2Var.c);
            kw0.j jVar2 = kw0.a;
            n54.b bVar3 = ht.a.k;
            d160 d160VarA4 = b160.a(jVar2, bVar3, bVarI, 48);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarG2);
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarI.D();
            int i13 = i4;
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar4 = yka.a.f;
            hlh0.a(bVarI, d160VarA4, bVar4);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS4, dVar2);
            c1350a = yka.a.g;
            if (bVarI.S) {
                z5 = z2;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                }
                yka.a.c cVar3 = yka.a.d;
                hlh0.a(bVarI, dVarC4, cVar3);
                f160 f160Var3 = f160.a;
                d dVarA5 = f160Var3.a(1.0f, aVar4, true);
                int i14 = ((i13 << 3) & 7168) | 384;
                d160 d160VarA5 = b160.a(jVar2, bVar3, bVarI, 48);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS5 = bVarI.S();
                d dVarC5 = c.c(bVarI, dVarA5);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA5, bVar4);
                hlh0.a(bVarI, ne00VarS5, dVar2);
                if (bVarI.S) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC5, cVar3);
                op8Var.invoke(f160Var3, bVarI, Integer.valueOf(((i14 >> 6) & 112) | 6));
                bVarI.X(true);
                str4 = str;
                o(3, (i13 >> 9) & 14, bVarI, h.j(f160Var3.a(1.0f, aVar4, true), gw2Var.f, 0.0f, 0.0f, 0.0f, 14), str4);
                str5 = str2;
                o(3, (i13 >> 12) & 14, bVarI, h.j(f160Var3.a(1.0f, aVar4, true), 0.0f, 0.0f, gw2Var.f, 0.0f, 11), str5);
                str6 = str3;
                o(6, (i13 >> 15) & 14, bVarI, h.j(f160Var3.a(1.0f, aVar4, true), 0.0f, 0.0f, gw2Var.f, 0.0f, 11), str6);
                bVarI.X(true);
                z4 = z5;
            } else {
                z5 = z2;
            }
            n30.a(iHashCode, bVarI, iHashCode, c1350a);
            yka.a.c cVar4 = yka.a.d;
            hlh0.a(bVarI, dVarC4, cVar4);
            f160 f160Var4 = f160.a;
            d dVarA6 = f160Var4.a(1.0f, aVar4, true);
            int i15 = ((i13 << 3) & 7168) | 384;
            d160 d160VarA6 = b160.a(jVar2, bVar3, bVarI, 48);
            iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS6 = bVarI.S();
            d dVarC6 = c.c(bVarI, dVarA6);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA6, bVar4);
            hlh0.a(bVarI, ne00VarS6, dVar2);
            if (bVarI.S) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC6, cVar4);
            op8Var.invoke(f160Var4, bVarI, Integer.valueOf(((i15 >> 6) & 112) | 6));
            bVarI.X(true);
            str4 = str;
            o(3, (i13 >> 9) & 14, bVarI, h.j(f160Var4.a(1.0f, aVar4, true), gw2Var.f, 0.0f, 0.0f, 0.0f, 14), str4);
            str5 = str2;
            o(3, (i13 >> 12) & 14, bVarI, h.j(f160Var4.a(1.0f, aVar4, true), 0.0f, 0.0f, gw2Var.f, 0.0f, 11), str5);
            str6 = str3;
            o(6, (i13 >> 15) & 14, bVarI, h.j(f160Var4.a(1.0f, aVar4, true), 0.0f, 0.0f, gw2Var.f, 0.0f, 11), str6);
            bVarI.X(true);
            z4 = z5;
        } else {
            str4 = str;
            str5 = str2;
            bVarI.G();
            z4 = z2;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final String str9 = str4;
            final String str10 = str5;
            eVarZ.d = new Function2() { // from class: dqb0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lqb0.n(gw2Var, z4, op8Var, str9, str10, str6, (a) obj, qj40.a(i2 | 1), i3);
                    return Unit.a;
                }
            };
        }
    }

    public static final void o(final int i2, final int i3, androidx.compose.runtime.a aVar, final d dVar, final String str) {
        int i4;
        androidx.compose.runtime.b bVar;
        androidx.compose.runtime.b bVarI = aVar.i(774939227);
        if ((i3 & 6) == 0) {
            i4 = (bVarI.M(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= bVarI.d(i2) ? 256 : 128;
        }
        if (bVarI.q(i4 & 1, (i4 & 147) != 146)) {
            bVar = bVarI;
            lkf0.b(str, dVar, b, d2l.g(fw20.a(R.dimen._8ssp, bVarI), 4294967296L), null, null, n, 0L, new gdf0(i2), d2l.g(fw20.a(R.dimen._9ssp, bVarI), 4294967296L), 2, false, 1, 0, null, null, bVar, (i4 & 14) | 1573248 | (i4 & 112) | ((i4 << 21) & 1879048192), 3120, 119216);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: xpb0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i3 | 1);
                    lqb0.o(i2, iA, (a) obj, dVar, str);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x010b  */
    /* JADX WARN: Code duplicated, block: B:76:0x010f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0122  */
    /* JADX WARN: Code duplicated, block: B:81:0x0130  */
    /* JADX WARN: Code duplicated, block: B:84:0x013d  */
    /* JADX WARN: Code duplicated, block: B:86:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0201  */
    /* JADX WARN: Code duplicated, block: B:91:0x0235  */
    /* JADX WARN: Code duplicated, block: B:94:0x0240  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    public static final void p(final String str, final boolean z, d dVar, final eil eilVar, final Function0<Unit> function0, boolean z2, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        d dVar2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        final d dVar3;
        final boolean z5;
        e eVarZ;
        d.a aVar2;
        d dVar4;
        boolean z6;
        float f2;
        long jB;
        int iHashCode;
        tsr.a aVar3;
        yka.a.C1350a c1350a;
        p8i p8iVar;
        float fC;
        int i7;
        int i8;
        androidx.compose.runtime.b bVarI = aVar.i(-1132501816);
        if ((i2 & 6) == 0) {
            i4 = (bVarI.M(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarI.b(z) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 == 0) {
            if ((i2 & 384) == 0) {
                dVar2 = dVar;
                i4 |= bVarI.M(dVar2) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                if (bVarI.M(eilVar)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i4 |= i8;
            }
            if ((i2 & 24576) == 0) {
                if (bVarI.A(function0)) {
                    i7 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i7 = 8192;
                }
                i4 |= i7;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
                if ((196608 & i2) == 0) {
                    z3 = z2;
                    if (bVarI.b(z3)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
                if ((74899 & i4) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (bVarI.q(i4 & 1, z4)) {
                    aVar2 = d.a.b;
                    if (i9 != 0) {
                        dVar4 = aVar2;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i5 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    float f3 = eilVar.a;
                    f2 = eilVar.f;
                    d dVarI = j.i(dVar4, f3);
                    jB = a;
                    if (z6) {
                        bVarI.N(-1707510029);
                    } else {
                        bVarI.N(-1707509465);
                        if (z) {
                            jB = r58.b(536870911);
                        }
                    }
                    bVarI.X(false);
                    d dVarD = androidx.compose.foundation.d.d(androidx.compose.foundation.a.b(dVarI, jB, zk40.a), false, null, null, function0, 15);
                    aiv aivVarC = g75.c(ht.a.e, false);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS = bVarI.S();
                    d dVarC = c.c(bVarI, dVarD);
                    yka.k.getClass();
                    aVar3 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC, yka.a.f);
                    hlh0.a(bVarI, ne00VarS, yka.a.e);
                    c1350a = yka.a.g;
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    hlh0.a(bVarI, dVarC, yka.a.d);
                    p8iVar = o;
                    if (z6) {
                        bVarI.N(1553854423);
                        lkf0.b(str, h.h(aVar2, f2, 0.0f, 2), 0L, pi60.b(R.dimen._8ssp, 0, bVarI), null, t9i.C, p8iVar, 0L, new gdf0(3), eilVar.e, 0, false, 1, 0, null, new imf0(f, 0L, null, null, null, 0L, null, new ix80(4.0f, r58.d(2160896103L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), 0, 0L, null, null, 16769022), bVarI, (i4 & 14) | 1769472, 1575936, 55700);
                        bVarI.X(false);
                    } else {
                        bVarI.N(1554665321);
                        imf0 imf0Var = new imf0(0L, eilVar.d, null, null, p8iVar, 0L, null, null, 0, 0L, null, null, 16777181);
                        fC = omf0.c(eilVar.d) * 0.75f;
                        if (fC < 6.0f) {
                            fC = 6.0f;
                        }
                        wf1.a(str, h.h(aVar2, f2, 0.0f, 2), imf0Var, 1, d2l.g(fC, 4294967296L), null, 3, null, b, bVarI, (i4 & 14) | 100666368, 160);
                        bVarI.X(false);
                    }
                    bVarI.X(true);
                    dVar3 = dVar4;
                    z5 = z6;
                } else {
                    bVarI.G();
                    dVar3 = dVar2;
                    z5 = z3;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: iqb0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            lqb0.p(str, z, dVar3, eilVar, function0, z5, (a) obj, qj40.a(i2 | 1), i3);
                            return Unit.a;
                        }
                    };
                }
            }
            i4 |= 196608;
            z3 = z2;
            if ((74899 & i4) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bVarI.q(i4 & 1, z4)) {
                aVar2 = d.a.b;
                if (i9 != 0) {
                    dVar4 = aVar2;
                } else {
                    dVar4 = dVar2;
                }
                if (i5 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                float f4 = eilVar.a;
                f2 = eilVar.f;
                d dVarI2 = j.i(dVar4, f4);
                jB = a;
                if (z6) {
                    bVarI.N(-1707510029);
                } else {
                    bVarI.N(-1707509465);
                    if (z) {
                        jB = r58.b(536870911);
                    }
                }
                bVarI.X(false);
                d dVarD2 = androidx.compose.foundation.d.d(androidx.compose.foundation.a.b(dVarI2, jB, zk40.a), false, null, null, function0, 15);
                aiv aivVarC2 = g75.c(ht.a.e, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarD2);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC2, yka.a.f);
                hlh0.a(bVarI, ne00VarS2, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, yka.a.d);
                p8iVar = o;
                if (z6) {
                    bVarI.N(1553854423);
                    lkf0.b(str, h.h(aVar2, f2, 0.0f, 2), 0L, pi60.b(R.dimen._8ssp, 0, bVarI), null, t9i.C, p8iVar, 0L, new gdf0(3), eilVar.e, 0, false, 1, 0, null, new imf0(f, 0L, null, null, null, 0L, null, new ix80(4.0f, r58.d(2160896103L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), 0, 0L, null, null, 16769022), bVarI, (i4 & 14) | 1769472, 1575936, 55700);
                    bVarI.X(false);
                } else {
                    bVarI.N(1554665321);
                    imf0 imf0Var2 = new imf0(0L, eilVar.d, null, null, p8iVar, 0L, null, null, 0, 0L, null, null, 16777181);
                    fC = omf0.c(eilVar.d) * 0.75f;
                    if (fC < 6.0f) {
                        fC = 6.0f;
                    }
                    wf1.a(str, h.h(aVar2, f2, 0.0f, 2), imf0Var2, 1, d2l.g(fC, 4294967296L), null, 3, null, b, bVarI, (i4 & 14) | 100666368, 160);
                    bVarI.X(false);
                }
                bVarI.X(true);
                dVar3 = dVar4;
                z5 = z6;
            } else {
                bVarI.G();
                dVar3 = dVar2;
                z5 = z3;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: iqb0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        lqb0.p(str, z, dVar3, eilVar, function0, z5, (a) obj, qj40.a(i2 | 1), i3);
                        return Unit.a;
                    }
                };
            }
        }
        i4 |= 384;
        dVar2 = dVar;
        if ((i2 & 3072) == 0) {
            if (bVarI.M(eilVar)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i4 |= i8;
        }
        if ((i2 & 24576) == 0) {
            if (bVarI.A(function0)) {
                i7 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i7 = 8192;
            }
            i4 |= i7;
        }
        i5 = i3 & 32;
        if (i5 != 0) {
            if ((196608 & i2) == 0) {
                z3 = z2;
                if (bVarI.b(z3)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
            if ((74899 & i4) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bVarI.q(i4 & 1, z4)) {
                aVar2 = d.a.b;
                if (i9 != 0) {
                    dVar4 = aVar2;
                } else {
                    dVar4 = dVar2;
                }
                if (i5 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                float f5 = eilVar.a;
                f2 = eilVar.f;
                d dVarI3 = j.i(dVar4, f5);
                jB = a;
                if (z6) {
                    bVarI.N(-1707510029);
                } else {
                    bVarI.N(-1707509465);
                    if (z) {
                        jB = r58.b(536870911);
                    }
                }
                bVarI.X(false);
                d dVarD3 = androidx.compose.foundation.d.d(androidx.compose.foundation.a.b(dVarI3, jB, zk40.a), false, null, null, function0, 15);
                aiv aivVarC3 = g75.c(ht.a.e, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC3 = c.c(bVarI, dVarD3);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC3, yka.a.f);
                hlh0.a(bVarI, ne00VarS3, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC3, yka.a.d);
                p8iVar = o;
                if (z6) {
                    bVarI.N(1553854423);
                    lkf0.b(str, h.h(aVar2, f2, 0.0f, 2), 0L, pi60.b(R.dimen._8ssp, 0, bVarI), null, t9i.C, p8iVar, 0L, new gdf0(3), eilVar.e, 0, false, 1, 0, null, new imf0(f, 0L, null, null, null, 0L, null, new ix80(4.0f, r58.d(2160896103L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), 0, 0L, null, null, 16769022), bVarI, (i4 & 14) | 1769472, 1575936, 55700);
                    bVarI.X(false);
                } else {
                    bVarI.N(1554665321);
                    imf0 imf0Var3 = new imf0(0L, eilVar.d, null, null, p8iVar, 0L, null, null, 0, 0L, null, null, 16777181);
                    fC = omf0.c(eilVar.d) * 0.75f;
                    if (fC < 6.0f) {
                        fC = 6.0f;
                    }
                    wf1.a(str, h.h(aVar2, f2, 0.0f, 2), imf0Var3, 1, d2l.g(fC, 4294967296L), null, 3, null, b, bVarI, (i4 & 14) | 100666368, 160);
                    bVarI.X(false);
                }
                bVarI.X(true);
                dVar3 = dVar4;
                z5 = z6;
            } else {
                bVarI.G();
                dVar3 = dVar2;
                z5 = z3;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: iqb0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        lqb0.p(str, z, dVar3, eilVar, function0, z5, (a) obj, qj40.a(i2 | 1), i3);
                        return Unit.a;
                    }
                };
            }
        }
        i4 |= 196608;
        z3 = z2;
        if ((74899 & i4) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (bVarI.q(i4 & 1, z4)) {
            aVar2 = d.a.b;
            if (i9 != 0) {
                dVar4 = aVar2;
            } else {
                dVar4 = dVar2;
            }
            if (i5 != 0) {
                z6 = false;
            } else {
                z6 = z3;
            }
            float f6 = eilVar.a;
            f2 = eilVar.f;
            d dVarI4 = j.i(dVar4, f6);
            jB = a;
            if (z6) {
                bVarI.N(-1707510029);
            } else {
                bVarI.N(-1707509465);
                if (z) {
                    jB = r58.b(536870911);
                }
            }
            bVarI.X(false);
            d dVarD4 = androidx.compose.foundation.d.d(androidx.compose.foundation.a.b(dVarI4, jB, zk40.a), false, null, null, function0, 15);
            aiv aivVarC4 = g75.c(ht.a.e, false);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarD4);
            yka.k.getClass();
            aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC4, yka.a.f);
            hlh0.a(bVarI, ne00VarS4, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC4, yka.a.d);
            p8iVar = o;
            if (z6) {
                bVarI.N(1553854423);
                lkf0.b(str, h.h(aVar2, f2, 0.0f, 2), 0L, pi60.b(R.dimen._8ssp, 0, bVarI), null, t9i.C, p8iVar, 0L, new gdf0(3), eilVar.e, 0, false, 1, 0, null, new imf0(f, 0L, null, null, null, 0L, null, new ix80(4.0f, r58.d(2160896103L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), 0, 0L, null, null, 16769022), bVarI, (i4 & 14) | 1769472, 1575936, 55700);
                bVarI.X(false);
            } else {
                bVarI.N(1554665321);
                imf0 imf0Var4 = new imf0(0L, eilVar.d, null, null, p8iVar, 0L, null, null, 0, 0L, null, null, 16777181);
                fC = omf0.c(eilVar.d) * 0.75f;
                if (fC < 6.0f) {
                    fC = 6.0f;
                }
                wf1.a(str, h.h(aVar2, f2, 0.0f, 2), imf0Var4, 1, d2l.g(fC, 4294967296L), null, 3, null, b, bVarI, (i4 & 14) | 100666368, 160);
                bVarI.X(false);
            }
            bVarI.X(true);
            dVar3 = dVar4;
            z5 = z6;
        } else {
            bVarI.G();
            dVar3 = dVar2;
            z5 = z3;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: iqb0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lqb0.p(str, z, dVar3, eilVar, function0, z5, (a) obj, qj40.a(i2 | 1), i3);
                    return Unit.a;
                }
            };
        }
    }

    public static final void q(final eil eilVar, final boolean z, final boolean z2, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.b bVarI = aVar.i(-1297644681);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.M(eilVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.b(z2) ? 256 : 128;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            g75.a(androidx.compose.foundation.a.b(j.i(j.w(d.a.b, eilVar.g), eilVar.a), (z && z2) ? d : c, zk40.a), bVarI, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: spb0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    lqb0.q(eilVar, z, z2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void r(final TopWinResponseV2 topWinResponseV2, final gw2 gw2Var, androidx.compose.runtime.a aVar, int i2) {
        gw2 gw2Var2;
        String str;
        String str2;
        androidx.compose.runtime.b bVarI = aVar.i(-2104525666);
        int i3 = (bVarI.A(topWinResponseV2) ? 4 : 2) | i2 | (bVarI.M(gw2Var) ? 32 : 16);
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            Double cashoutCoefficient = topWinResponseV2.getCashoutCoefficient();
            double dDoubleValue = cashoutCoefficient != null ? cashoutCoefficient.doubleValue() : 0.0d;
            String str3 = "--";
            if (dDoubleValue == 0.0d) {
                str = "--";
            } else {
                try {
                    str = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dDoubleValue);
                    str.getClass();
                } catch (Exception unused) {
                    str = "0.00";
                }
            }
            Double payoutAmount = topWinResponseV2.getPayoutAmount();
            double dDoubleValue2 = payoutAmount != null ? payoutAmount.doubleValue() : 0.0d;
            if (dDoubleValue2 == 0.0d) {
                str2 = "0";
            } else {
                try {
                    str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dDoubleValue2);
                    str2.getClass();
                } catch (Exception unused2) {
                    str2 = "0.00";
                }
            }
            String str4 = str2;
            final crz crzVarA = erz.a(2131232710, 0, bVarI);
            op8 op8VarB = pp8.b(138893343, new gaj() { // from class: zpb0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    e160 e160Var = (e160) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    e160Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(e160Var) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        TopWinResponseV2 topWinResponseV3 = topWinResponseV2;
                        String avatar = topWinResponseV3.getAvatar();
                        if (avatar == null) {
                            avatar = "";
                        }
                        gw2 gw2Var3 = gw2Var;
                        float f2 = gw2Var3.d;
                        d.a aVar3 = d.a.b;
                        d dVarA = ls7.a(j.r(aVar3, f2), j060.a);
                        d0b.a.C0470a c0470a = d0b.a.a;
                        crz crzVar = crzVarA;
                        fn80.a(avatar, null, dVarA, c0470a, null, 0.0f, crzVar, crzVar, null, aVar2, 3120, 1648);
                        ty0.a(aVar2, j.w(aVar3, gw2Var3.e));
                        String nickName = topWinResponseV3.getNickName();
                        if (nickName == null) {
                            nickName = "";
                        }
                        if (nickName.length() == 0) {
                            nickName = "";
                        }
                        lqb0.o(5, 0, aVar2, e160Var.a(1.0f, aVar3, true), nickName);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI);
            Double stakeAmount = topWinResponseV2.getStakeAmount();
            if (stakeAmount != null) {
                try {
                    String str5 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(stakeAmount.doubleValue());
                    str5.getClass();
                    str3 = str5;
                } catch (Exception unused3) {
                    str3 = "0.00";
                }
            }
            String str6 = str;
            gw2Var2 = gw2Var;
            n(gw2Var2, false, op8VarB, str3, str6, str4, bVarI, ((i3 >> 3) & 14) | 384, 2);
        } else {
            gw2Var2 = gw2Var;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new d430(topWinResponseV2, i2, 2, gw2Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    public static final void s(final EliteTopWinsThisWeekItem eliteTopWinsThisWeekItem, final d dVar, final String str, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.b bVar;
        List<j58> list;
        long j2;
        long j3;
        long j4;
        long j5;
        int i4;
        int i5;
        ?? r8;
        int i6;
        int i7;
        long jB;
        long jB2;
        long jB3;
        eliteTopWinsThisWeekItem.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(906777789);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? bVarI.M(eliteTopWinsThisWeekItem) : bVarI.A(eliteTopWinsThisWeekItem) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.M(str) ? 256 : 128;
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            int rank = eliteTopWinsThisWeekItem.getRank();
            if (rank != 1) {
                list = rank != 2 ? s : q;
            } else {
                list = r;
            }
            d dVarF = h.f(androidx.compose.foundation.a.a(dVar, new hfs(list, null, 0L, 9187343241974906880L, 0), j060.c(dp9.a(R.dimen._5sdp, 0, bVarI)), 0.0f, 4), 1.0f);
            n54 n54Var = ht.a.a;
            aiv aivVarC = g75.c(n54Var, false);
            int iHashCode = Long.hashCode(bVarI.m());
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d.a aVar3 = d.a.b;
            d dVarA = ls7.a(j.e(aVar3, 1.0f), j060.c(dp9.a(R.dimen._5sdp, 0, bVarI)));
            long j6 = abi0.x;
            zk40.a aVar4 = zk40.a;
            d dVarB = androidx.compose.foundation.a.b(dVarA, j6, aVar4);
            if (eliteTopWinsThisWeekItem.getRank() == 1) {
                j2 = abi0.o0;
            } else {
                j2 = eliteTopWinsThisWeekItem.getRank() == 2 ? abi0.p0 : abi0.q0;
            }
            d dVarA2 = wbi0.a(dVarB, j2, 8.0f, 2.0f, 2.0f, j060.c(dp9.a(R.dimen._5sdp, 0, bVarI)));
            if (eliteTopWinsThisWeekItem.getRank() == 1) {
                j3 = abi0.p0;
            } else {
                j3 = eliteTopWinsThisWeekItem.getRank() == 2 ? abi0.m0 : abi0.l0;
            }
            d dVarA3 = wbi0.a(dVarA2, j3, 16.0f, -4.0f, -4.0f, j060.c(dp9.a(R.dimen._5sdp, 0, bVarI)));
            if (eliteTopWinsThisWeekItem.getRank() == 1) {
                j4 = abi0.q0;
            } else {
                j4 = eliteTopWinsThisWeekItem.getRank() == 2 ? abi0.n0 : abi0.l0;
            }
            d dVarA4 = wbi0.a(dVarA3, j4, 8.0f, 0.0f, 4.0f, j060.c(dp9.a(R.dimen._5sdp, 0, bVarI)));
            i060 i060VarC = j060.c(dp9.a(R.dimen._5sdp, 0, bVarI));
            long j7 = j58.b;
            d dVarA5 = lx80.a(dVarA4, i060VarC, new hx80(j58.c(0.2f, j7), 48, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(4.0f)) & 4294967295L), 6.0f));
            aiv aivVarC2 = g75.c(n54Var, false);
            int iHashCode2 = Long.hashCode(bVarI.m());
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarA5);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            int rank2 = eliteTopWinsThisWeekItem.getRank();
            n54 n54Var2 = ht.a.c;
            androidx.compose.foundation.layout.d dVar3 = androidx.compose.foundation.layout.d.a;
            h(rank2, 0, bVarI, dVar3.b(aVar3, n54Var2));
            d dVarE = j.e(aVar3, 1.0f);
            i78 i78VarA = g78.a(kw0.e, ht.a.n, bVarI, 54);
            int iHashCode3 = Long.hashCode(bVarI.m());
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarE);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar2);
            hlh0.a(bVarI, ne00VarS3, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            ty0.a(bVarI, j.i(aVar3, dp9.a(R.dimen._16sdp, 0, bVarI)));
            n54 n54Var3 = ht.a.b;
            aiv aivVarC3 = g75.c(n54Var3, false);
            int iHashCode4 = Long.hashCode(bVarI.m());
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, aVar3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC3, bVar2);
            hlh0.a(bVarI, ne00VarS4, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar);
            String avatar = eliteTopWinsThisWeekItem.getAvatar();
            if (rank2 != 1) {
                j5 = rank2 != 2 ? abi0.k0 : abi0.j0;
            } else {
                j5 = abi0.i0;
            }
            long j8 = j5;
            d dVarJ = h.j(aVar3, 0.0f, dp9.a(R.dimen._6sdp, 0, bVarI), 0.0f, 0.0f, 13);
            if (rank2 == 1) {
                bVarI.N(148278381);
                i4 = R.dimen._40sdp;
            } else if (rank2 != 2) {
                bVarI.N(148280781);
                i4 = R.dimen._28sdp;
            } else {
                bVarI.N(148279821);
                i4 = R.dimen._33sdp;
            }
            float fA = dp9.a(i4, 0, bVarI);
            bVarI.X(false);
            c(0, j8, bVarI, j.r(dVarJ, fA), avatar);
            if (rank2 != 1) {
                i5 = rank2 != 2 ? R.drawable.elite_crown_3 : R.drawable.elite_crown_2;
            } else {
                i5 = R.drawable.elite_crown_1;
            }
            Integer numValueOf = Integer.valueOf(i5);
            d dVarC5 = lx80.c(aVar3, 10.0f, aVar4, false, j58.c(0.5f, j7), j58.c(0.8f, j7));
            if (rank2 == 1) {
                r8 = 0;
                bVarI.N(148307463);
                i6 = R.dimen._25sdp;
            } else if (rank2 != 2) {
                bVarI.N(148309479);
                i6 = R.dimen._20sdp;
                r8 = 0;
            } else {
                r8 = 0;
                bVarI.N(148308711);
                i6 = R.dimen._22sdp;
            }
            float fA2 = dp9.a(i6, r8, bVarI);
            bVarI.X(r8);
            d dVarI = j.i(dVarC5, fA2);
            if (rank2 == 1) {
                bVarI.N(148311719);
                i7 = R.dimen._50sdp;
            } else if (rank2 != 2) {
                bVarI.N(148313735);
                i7 = R.dimen._35sdp;
            } else {
                bVarI.N(148312967);
                i7 = R.dimen._45sdp;
            }
            float fA3 = dp9.a(i7, r8, bVarI);
            bVarI.X(r8);
            boolean z = r8;
            mw90.a(numValueOf, "crown", g.d(dVar3.b(j.w(dVarI, fA3), n54Var3), 0.0f, rank2 == 3 ? -5.0f : -7.0f, 1), null, null, d0b.a.b, null, bVarI, 1572912, 1976);
            bVarI.X(true);
            ty0.a(bVarI, j.i(aVar3, dp9.a(R.dimen._3sdp, z ? 1 : 0, bVarI)));
            String nickName = eliteTopWinsThisWeekItem.getNickName();
            long j9 = j58.f;
            if (rank2 == 1) {
                bVarI.N(-654242381);
                jB = dp9.b(R.dimen._11ssp, z ? 1 : 0, bVarI);
            } else {
                bVarI.N(-654241421);
                jB = dp9.b(R.dimen._10ssp, z ? 1 : 0, bVarI);
            }
            bVarI.X(z);
            t9i t9iVar = t9i.E;
            int i8 = i3;
            lkf0.b(nickName, null, j9, jB, null, t9iVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarI, 196992, 0, 131026);
            ty0.a(bVarI, j.i(aVar3, dp9.a(R.dimen._3sdp, z ? 1 : 0, bVarI)));
            TreeMap treeMap = pw.a;
            String strC = pw.c(String.valueOf(eliteTopWinsThisWeekItem.getPayoutAmount()));
            if (rank2 == 1) {
                bVarI.N(-654230861);
                jB2 = dp9.b(R.dimen._12ssp, z ? 1 : 0, bVarI);
                bVarI.X(z);
            } else if (rank2 != 2) {
                bVarI.N(-654227565);
                long jB4 = dp9.b(R.dimen._10ssp, z ? 1 : 0, bVarI);
                bVarI.X(z);
                jB2 = jB4;
            } else {
                bVarI.N(-654229261);
                jB2 = dp9.b(R.dimen._11ssp, z ? 1 : 0, bVarI);
                bVarI.X(z);
            }
            long jB5 = dp9.b(R.dimen._7ssp, z ? 1 : 0, bVarI);
            int i9 = i8 & 896;
            boolean z2 = (bVarI.M(strC) ? 1 : 0) | (i9 == 256 ? true : z ? 1 : 0) | (bVarI.e(jB2) ? 1 : 0);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            Object obj = objY;
            if (z2 || objY == c0042a) {
                isw iswVarA = androidx.compose.runtime.j.a(1.0f);
                bVarI.r(iswVarA);
                obj = iswVarA;
            }
            final isw iswVar = (isw) obj;
            boolean z3 = (i9 == 256 ? true : z ? 1 : 0) | (bVarI.M(strC) ? 1 : 0) | (bVarI.e(jB2) ? 1 : 0);
            Object objY2 = bVarI.y();
            Object obj2 = objY2;
            if (z3 || objY2 == c0042a) {
                ytw ytwVarB = m.b(Boolean.FALSE);
                bVarI.r(ytwVarB);
                obj2 = ytwVarB;
            }
            final ytw ytwVar = (ytw) obj2;
            nk0.b bVar3 = new nk0.b((Object) null);
            long j10 = abi0.n;
            long j11 = jB2;
            int iL = bVar3.l(new ora0(j10, d2l.g(iswVar.j() * omf0.c(jB5), 4294967296L), t9iVar, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65528));
            try {
                bVar3.g(str == null ? "" : str);
                Unit unit = Unit.a;
                bVar3.i(iL);
                bVar3.g(" ");
                int iL2 = bVar3.l(new ora0(j10, d2l.g(iswVar.j() * omf0.c(j11), 4294967296L), t9i.G, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65528));
                try {
                    bVar3.g(strC);
                    bVar3.i(iL2);
                    nk0 nk0VarM = bVar3.m();
                    d dVarH = h.h(j.g(aVar3, 1.0f), dp9.a(R.dimen._4sdp, z ? 1 : 0, bVarI), 0.0f, 2);
                    boolean zM = bVarI.M(ytwVar);
                    Object objY3 = bVarI.y();
                    Object obj3 = objY3;
                    if (zM || objY3 == c0042a) {
                        Function1 function1 = new Function1() { // from class: opb0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                lza lzaVar = (lza) obj4;
                                lzaVar.getClass();
                                if (((Boolean) ytwVar.getValue()).booleanValue()) {
                                    lzaVar.b2();
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(function1);
                        obj3 = function1;
                    }
                    d dVarC6 = androidx.compose.ui.draw.a.c(dVarH, (Function1) obj3);
                    gdf0 gdf0Var = new gdf0(3);
                    boolean zM2 = bVarI.M(iswVar) | bVarI.M(ytwVar);
                    Object objY4 = bVarI.y();
                    Object obj4 = objY4;
                    if (zM2 || objY4 == c0042a) {
                        Function1 function2 = new Function1() { // from class: ppb0
                            /* JADX WARN: Code duplicated, block: B:7:0x002b  */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                ukf0 ukf0Var = (ukf0) obj5;
                                ukf0Var.getClass();
                                boolean zE = ukf0Var.e();
                                ytw ytwVar2 = ytwVar;
                                if (zE) {
                                    isw iswVar2 = iswVar;
                                    if (iswVar2.j() > 0.45f) {
                                        iswVar2.A(iswVar2.j() * 0.9f);
                                        ytwVar2.setValue(Boolean.FALSE);
                                    } else {
                                        ytwVar2.setValue(Boolean.TRUE);
                                    }
                                } else {
                                    ytwVar2.setValue(Boolean.TRUE);
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(function2);
                        obj4 = function2;
                    }
                    lkf0.c(nk0VarM, dVarC6, 0L, 0L, null, null, null, 0L, gdf0Var, 0L, 0, false, 1, 0, null, (Function1) obj4, null, bVarI, 0, 3456, 183804);
                    ty0.a(bVarI, j.i(aVar3, dp9.a(R.dimen._1sdp, z ? 1 : 0, bVarI)));
                    String str2 = eliteTopWinsThisWeekItem.getCashoutCoefficient() + "x";
                    imf0 imf0Var = new imf0(j10, 0L, null, null, null, 0L, null, new ix80(6.0f, j58.c(0.6f, r58.d(4291602535L)), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(2.0f)) & 4294967295L)), 0, 0L, null, null, 16769022);
                    if (rank2 == 1) {
                        bVarI.N(-654136653);
                        jB3 = dp9.b(R.dimen._11ssp, z ? 1 : 0, bVarI);
                    } else {
                        bVarI.N(-654135693);
                        jB3 = dp9.b(R.dimen._10ssp, z ? 1 : 0, bVarI);
                    }
                    bVarI.X(z);
                    lkf0.b(str2, null, 0L, jB3, null, t9i.B, null, 0L, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, 196608, 0, 65494);
                    androidx.compose.runtime.b bVar4 = bVarI;
                    ty0.a(bVar4, j.i(aVar3, dp9.a(R.dimen._6sdp, z ? 1 : 0, bVar4)));
                    f30.a(bVar4, true, true, true);
                    bVar = bVar4;
                } catch (Throwable th) {
                    bVar3.i(iL2);
                    throw th;
                }
            } catch (Throwable th2) {
                bVar3.i(iL);
                throw th2;
            }
        } else {
            bVarI.G();
            bVar = bVarI;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: qpb0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int iA = qj40.a(i2 | 1);
                    lqb0.s(eliteTopWinsThisWeekItem, dVar, str, (a) obj5, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final String t(String str, String str2) {
        if (str == null || StringsKt.U(str)) {
            str = null;
        }
        if (str == null) {
            return str2 == null ? "" : str2;
        }
        op5.a.getClass();
        return op5.i(str);
    }
}
