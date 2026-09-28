package defpackage;

import com.google.gson.reflect.TypeToken;
import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.cms.CMSLanguage;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.loyalty.DailyRecordContent;
import com.sporty.android.core.model.loyalty.LoyaltyActivityData;
import com.sporty.android.core.model.loyalty.LoyaltyTierConfig;
import com.sporty.android.core.model.loyalty.TierConfig;
import com.sporty.android.core.model.loyalty.TierDobConfig;
import com.sporty.android.core.model.loyalty.TierReward;
import com.sporty.android.core.model.loyalty.TierRewardTime;
import com.sporty.android.core.model.loyalty.UserTier;
import com.sportybet.android.gp.tz.R;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0006\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lb3u;", "Lj8i0;", "Lw0u;", "", "f", "a", "d", "b", "e", "c", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class b3u extends j8i0 implements w0u {
    public final uti A;
    public final jrf0 B;
    public final do3 C;
    public final v340 D;
    public final ku90<jgm> E;
    public final t340 F;
    public final wwd0 G;
    public final wwd0 H;
    public final wwd0 I;
    public final wwd0 J;
    public final wwd0 K;
    public final wwd0 L;
    public boolean M;
    public final v340 N;
    public final wwd0 O;
    public final wwd0 P;
    public final wwd0 Q;
    public final wwd0 R;
    public jvd0 S;
    public jvd0 T;
    public jvd0 U;
    public jvd0 V;
    public boolean W;
    public final v340 X;
    public final v340 Y;
    public final wwd0 Z;
    public final svt a;
    public final v340 a0;
    public final nvv b;
    public final v340 b0;
    public final f0u c;
    public final wwd0 c0;
    public final h530 d;
    public final v340 d0;
    public final psm e;
    public final wwd0 e0;
    public final vxt f;
    public final v340 f0;
    public final m2l i;
    public final odd v;
    public final JsonSerializeService w;
    public final rdd0 y;
    public final t5k z;

    public static final class b {
        public final krf0 a;
        public final lk50<List<LoyaltyActivityData>> b;
        public final tyt c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(krf0 krf0Var, lk50<? extends List<LoyaltyActivityData>> lk50Var, tyt tytVar) {
            lk50Var.getClass();
            tytVar.getClass();
            this.a = krf0Var;
            this.b = lk50Var;
            this.c = tytVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c);
        }

        public final int hashCode() {
            krf0 krf0Var = this.a;
            int iHashCode = krf0Var == null ? 0 : krf0Var.hashCode();
            return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
        }

        public final String toString() {
            return "CombinedListData(selectedTier=" + this.a + ", activityResult=" + this.b + ", selectedTab=" + this.c + ")";
        }
    }

    public static final class c {
        public final jwv a;

        public c(jwv jwvVar) {
            jwvVar.getClass();
            this.a = jwvVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "CombinedMissionData(uiState=" + this.a + ")";
        }
    }

    public static final class d {
        public final boolean a;
        public final String b;

        public d(boolean z, String str) {
            str.getClass();
            this.a = z;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && Intrinsics.g(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "CombinedRewardData(skipBallFlicking=" + this.a + ", gameLoadingId=" + this.b + ")";
        }
    }

    public static final class e {
        public final lk50<ftt> a;
        public final ib50 b;

        public e(lk50<ftt> lk50Var, ib50 ib50Var) {
            lk50Var.getClass();
            ib50Var.getClass();
            this.a = lk50Var;
            this.b = ib50Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Intrinsics.g(this.a, eVar.a) && Intrinsics.g(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "CombinedTierData(tierData=" + this.a + ", requestScrollTier=" + this.b + ")";
        }
    }

    public static final class f {
        public final kst a;
        public final y0u b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        public f(kst kstVar, y0u y0uVar, boolean z, boolean z2, boolean z3) {
            kstVar.getClass();
            y0uVar.getClass();
            this.a = kstVar;
            this.b = y0uVar;
            this.c = z;
            this.d = z2;
            this.e = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.g(this.a, fVar.a) && Intrinsics.g(this.b, fVar.b) && this.c == fVar.c && this.d == fVar.d && this.e == fVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + mtg0.a(mtg0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ComponentScrollState(dialog=");
            sb.append(this.a);
            sb.append(", toastState=");
            sb.append(this.b);
            sb.append(", shouldScrollToFirstMission=");
            nng.a(", shouldScrollToBetslip=", ", scrollToBetslipMission=", sb, this.c, this.d);
            return mq0.a(sb, this.e, ")");
        }
    }

    @c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$getApplicable$1", f = "LoyaltyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends tje0 implements Function2<lk50<? extends List<? extends LoyaltyActivityData>>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ b3u b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(v1b v1bVar, b3u b3uVar) {
            super(2, v1bVar);
            this.b = b3uVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            g gVar = new g(v1bVar, this.b);
            gVar.a = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends List<? extends LoyaltyActivityData>> lk50Var, v1b<? super Unit> v1bVar) {
            return ((g) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.b.P.setValue(lk50Var);
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$getLoyaltyTierConfig$1", f = "LoyaltyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class h extends tje0 implements Function2<lk50<? extends ftt>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ b3u b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(v1b v1bVar, b3u b3uVar) {
            super(2, v1bVar);
            this.b = b3uVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            h hVar = new h(v1bVar, this.b);
            hVar.a = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends ftt> lk50Var, v1b<? super Unit> v1bVar) {
            return ((h) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            b3u b3uVar = this.b;
            wwd0 wwd0Var = b3uVar.Q;
            wwd0 wwd0Var2 = b3uVar.R;
            b3uVar.O.setValue(lk50Var);
            if (lk50Var instanceof lk50.c) {
                b3uVar.z.d = null;
                krf0 krf0VarL1 = b3u.L1(((ftt) ((lk50.c) lk50Var).a).b.getCurrentTier());
                krf0 krf0Var = (krf0) wwd0Var2.getValue();
                if (krf0Var == null || b3uVar.W) {
                    wwd0Var2.setValue(krf0VarL1);
                    b3uVar.W = false;
                    if (krf0Var != null && krf0Var != krf0VarL1) {
                        ib50.b bVar = new ib50.b(krf0VarL1);
                        wwd0Var.getClass();
                        wwd0Var.k(null, bVar);
                    }
                } else {
                    ib50.b bVar2 = new ib50.b(krf0VarL1);
                    wwd0Var.getClass();
                    wwd0Var.k(null, bVar2);
                }
            }
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"b3u$i", "Lcom/google/gson/reflect/TypeToken;", "", "", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class i extends TypeToken<Set<? extends String>> {
    }

    public b3u(svt svtVar, nvv nvvVar, f0u f0uVar, h530 h530Var, psm psmVar, vxt vxtVar, m2l m2lVar, uo1 uo1Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, JsonSerializeService jsonSerializeService, rdd0 rdd0Var, mgb0 mgb0Var, t5k t5kVar, m7e0 m7e0Var, uek uekVar, uti utiVar, zvt zvtVar, jrf0 jrf0Var, wib0 wib0Var, do3 do3Var, sq20 sq20Var) {
        nvvVar.getClass();
        f0uVar.getClass();
        h530Var.getClass();
        psmVar.getClass();
        m2lVar.getClass();
        uo1Var.getClass();
        jsonSerializeService.getClass();
        rdd0Var.getClass();
        mgb0Var.getClass();
        t5kVar.getClass();
        m7e0Var.getClass();
        zvtVar.getClass();
        jrf0Var.getClass();
        wib0Var.getClass();
        do3Var.getClass();
        this.a = svtVar;
        this.b = nvvVar;
        this.c = f0uVar;
        this.d = h530Var;
        this.e = psmVar;
        this.f = vxtVar;
        this.i = m2lVar;
        this.v = oddVar;
        this.w = jsonSerializeService;
        this.y = rdd0Var;
        this.z = t5kVar;
        this.A = utiVar;
        this.B = jrf0Var;
        this.C = do3Var;
        lyh<Boolean> lyhVarIsLoginFlow = mgb0Var.isLoginFlow();
        et7 et7VarD = o8i0.d(this);
        Boolean boolValueOf = Boolean.valueOf(mgb0Var.isLogin());
        kwd0 kwd0Var = q490.a.a;
        v340 v340VarE = e1i.e(lyhVarIsLoginFlow, et7VarD, kwd0Var, boolValueOf);
        this.D = v340VarE;
        ku90<jgm> ku90Var = new ku90<>();
        this.E = ku90Var;
        this.F = e1i.a(ku90Var);
        Boolean bool = Boolean.FALSE;
        wwd0 wwd0VarA = xwd0.a(bool);
        this.G = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a("");
        this.H = wwd0VarA2;
        wwd0 wwd0VarA3 = xwd0.a(y0u.a.a);
        this.I = wwd0VarA3;
        wwd0 wwd0VarA4 = xwd0.a(bool);
        this.J = wwd0VarA4;
        wwd0 wwd0VarA5 = xwd0.a(bool);
        this.K = wwd0VarA5;
        wwd0 wwd0VarA6 = xwd0.a(bool);
        this.L = wwd0VarA6;
        rkd rkdVar = vxtVar.g;
        ohp<?>[] ohpVarArr = vxt.h;
        this.N = e1i.e(rkdVar.a(vxtVar, ohpVarArr[5]).d(""), o8i0.d(this), kwd0Var, "");
        lk50.b bVar = lk50.b.a;
        wwd0 wwd0VarA7 = xwd0.a(bVar);
        this.O = wwd0VarA7;
        wwd0 wwd0VarA8 = xwd0.a(bVar);
        this.P = wwd0VarA8;
        wwd0 wwd0VarA9 = xwd0.a(ib50.a.a);
        this.Q = wwd0VarA9;
        wwd0 wwd0VarA10 = xwd0.a(null);
        this.R = wwd0VarA10;
        this.X = e1i.e(new n1i(wwd0VarA, f0uVar.d, new x3u(3, null)), o8i0.d(this), kwd0Var, bool);
        v340 v340VarE2 = e1i.e(mgb0Var.getLanguageFlow(), o8i0.d(this), q490.a.a(3), "");
        this.Y = nvvVar.h;
        wwd0 wwd0VarA11 = xwd0.a(new kst.b());
        this.Z = wwd0VarA11;
        v340 v340VarE3 = e1i.e(new f1i(new oyh(new qzh(null, wwd0VarA10, new azh(new cq40(), 0)))), o8i0.d(this), kwd0Var, null);
        v340 v340Var = f0uVar.b;
        k1i k1iVarA = r1i.a(v340VarE3, wwd0VarA8, v340Var, new c3u(4, null));
        v340 v340VarE4 = e1i.e(vxtVar.f.a(vxtVar, ohpVarArr[4]).d(bool), o8i0.d(this), q490.a.a(3), bool);
        this.a0 = e1i.e(vxtVar.d.a(vxtVar, ohpVarArr[2]).d(bool), o8i0.d(this), q490.a.a(2), null);
        n1i n1iVar = new n1i(v340VarE4, wwd0VarA2, new m3u(3, null));
        n1i n1iVar2 = new n1i(wwd0VarA7, wwd0VarA9, new n3u(3, null));
        v340 v340VarE5 = e1i.e(r0i.f(v340VarE, new e4u(null, this)), o8i0.d(this), kwd0Var, new jwv(0));
        this.b0 = v340VarE5;
        i4u i4uVar = new i4u(v340VarE5);
        m1i m1iVarC = r1i.c(wwd0VarA11, wwd0VarA3, wwd0VarA4, wwd0VarA5, wwd0VarA6, new l3u(null));
        v340 v340VarE6 = e1i.e(r0i.f(v340VarE, new f4u(null, m7e0Var, uekVar)), o8i0.d(this), q490.a.a(3), new p34(false, null, null, 31));
        m2g m2gVar = m2g.a;
        this.c0 = xwd0.a(m2gVar);
        v340 v340VarE7 = e1i.e(r0i.f(v340VarE, new g4u(null, this)), o8i0.d(this), q490.a.a(3), new a(false, false));
        v340 v340VarE8 = e1i.e(r0i.f(v340VarE, new h4u(null, zvtVar)), o8i0.d(this), q490.a.a(3), m2gVar);
        et7 et7VarD2 = o8i0.d(this);
        v340 v340VarE9 = e1i.e(r1i.b(e1i.e(r0i.f(new n1i(v340VarE, do3Var.g, new jo3(3, null)), new ho3(do3Var, null)), et7VarD2, q490.a.a(3), new do3.a(0)), do3Var.d, do3Var.e, do3Var.i, new mo3(do3Var, null)), et7VarD2, q490.a.a(3), do3.a(do3Var));
        do3Var.k = v340VarE9;
        v340 v340VarE10 = e1i.e(r1i.a(v340VarE9, do3Var.f, do3Var.j, new io3(4, null)), et7VarD2, q490.a.a(3), new st3(do3.a(do3Var), false, null, null));
        this.d0 = v340VarE10;
        v340 v340VarE11 = e1i.e(new or60(new m6b(2, null)), o8i0.d(this), q490.a.a(3), Long.valueOf(System.currentTimeMillis()));
        this.e0 = xwd0.a(new myt(null, null, 255));
        this.f0 = e1i.e(ozh.c(new b4u(new lyh[]{n1iVar2, k1iVarA, m1iVarC, n1iVar, i4uVar, v340VarE2, v340VarE6, v340VarE8, v340VarE11, v340VarE7, v340VarE, v340VarE10}, this), oddVar), o8i0.d(this), kwd0Var, new myt(null, null, 255));
        kzh.d(new g1i(uzh.b(new d4u(uo1Var.b.a().d(-1))), new v2u(null, this)), o8i0.d(this));
        kzh.d(new g1i(v340VarE, new w2u(null, this)), o8i0.d(this));
        kzh.d(new g1i(new b720(new a720(fc4.a(uzh.b(mgb0Var.isLoginFlow()), 1)), vxtVar), new x2u(null, this)), o8i0.d(this));
        kzh.d(new g1i(do3Var.m, new y2u(this, mgb0Var, null)), o8i0.d(this));
        kzh.d(new g1i(nvvVar.n, new z2u(null, this)), o8i0.d(this));
        kzh.d(new g1i(new c4u(uzh.b(new j4u(v340Var))), new a3u(null, this)), o8i0.d(this));
        wib0Var.b(o8i0.d(this), yvt.v, "loyalty_cdn_img");
        et7 et7VarD3 = o8i0.d(this);
        uag uagVar = xvt.b;
        uagVar.getClass();
        ej5.c(et7VarD3, wib0Var.c, null, new qib0(wib0Var, uagVar, null), 2);
    }

    public static int E1(krf0 krf0Var) {
        switch (krf0Var.ordinal()) {
            case 0:
                return R.string.page_loyalty__challenge_entry_iron_img_v2;
            case 1:
                return R.string.page_loyalty__challenge_entry_copper_img_v2;
            case 2:
                return R.string.page_loyalty__challenge_entry_bronze_img_v2;
            case 3:
                return R.string.page_loyalty__challenge_entry_silver_img_v2;
            case 4:
                return R.string.page_loyalty__challenge_entry_gold_img_v2;
            case 5:
                return R.string.page_loyalty__challenge_entry_platinum_img_v2;
            case 6:
                return R.string.page_loyalty__challenge_entry_titanium_img_v2;
            case 7:
                return R.string.page_loyalty__challenge_entry_diamond_img_v2;
            default:
                uhc.a();
                return 0;
        }
    }

    public static krf0 L1(int i2) {
        Object next;
        uag uagVar = krf0.I;
        q3.b bVarA = ocx.a(uagVar, uagVar);
        do {
            if (!bVarA.hasNext()) {
                next = null;
                break;
            }
            next = bVarA.next();
        } while (((krf0) next).a != i2);
        krf0 krf0Var = (krf0) next;
        return krf0Var == null ? krf0.TIER_0 : krf0Var;
    }

    public static uqf0 M1(int i2, LoyaltyTierConfig loyaltyTierConfig) {
        Object next;
        uag uagVar = krf0.I;
        q3.b bVarA = ocx.a(uagVar, uagVar);
        do {
            if (!bVarA.hasNext()) {
                next = null;
                break;
            }
            next = bVarA.next();
        } while (((krf0) next).a != i2);
        krf0 krf0Var = (krf0) next;
        if (krf0Var == null) {
            return null;
        }
        return N1(krf0Var, loyaltyTierConfig);
    }

    public static uqf0 N1(krf0 krf0Var, LoyaltyTierConfig loyaltyTierConfig) {
        TierDobConfig tierDobConfig;
        Object next;
        Object obj;
        Iterator<T> it = loyaltyTierConfig.getTierConfigList().iterator();
        do {
            tierDobConfig = null;
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((TierConfig) next).getTier() != krf0Var.a);
        TierConfig tierConfig = (TierConfig) next;
        if (tierConfig == null) {
            return null;
        }
        List<TierDobConfig> tierDobConfigList = loyaltyTierConfig.getTierDobConfigList();
        if (tierDobConfigList != null) {
            for (Object obj2 : tierDobConfigList) {
                if (((TierDobConfig) obj2).getTier() == krf0Var.a) {
                    obj = obj2;
                    break;
                }
            }
            tierDobConfig = (TierDobConfig) obj;
        }
        return new uqf0(krf0Var, tierConfig, tierDobConfig);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:43:0x011b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0128  */
    /* JADX WARN: Code duplicated, block: B:54:0x0147 A[LOOP:1: B:42:0x0119->B:54:0x0147, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0151  */
    /* JADX WARN: Code duplicated, block: B:63:0x0161  */
    /* JADX WARN: Code duplicated, block: B:67:0x0189  */
    /* JADX WARN: Code duplicated, block: B:70:0x019f  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x014b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0141 A[SYNTHETIC] */
    public final Object A1(List list, p34 p34Var, x1b x1bVar) {
        p3u p3uVar;
        Object next;
        List list2;
        p34 p34Var2;
        uyt.j jVar;
        String strB1;
        String str;
        ArrayList arrayList;
        Integer[] numArr;
        int i2;
        LoyaltyActivityData loyaltyActivityData;
        String str2;
        String batchId;
        String strW;
        Object objQ1;
        LoyaltyActivityData loyaltyActivityData2;
        String str3;
        String str4;
        p34 p34Var3;
        uyt.j jVar2;
        int size;
        int i3;
        Object obj;
        LoyaltyActivityData loyaltyActivityData3;
        LoyaltyActivityData loyaltyActivityData4;
        List listC;
        DailyRecordContent dailyRecordContent;
        boolean zIsAccumulate;
        if (x1bVar instanceof p3u) {
            p3uVar = (p3u) x1bVar;
            int i4 = p3uVar.A;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                p3uVar.A = i4 - Integer.MIN_VALUE;
            } else {
                p3uVar = new p3u(this, x1bVar);
            }
        } else {
            p3uVar = new p3u(this, x1bVar);
        }
        Object obj2 = p3uVar.y;
        Object obj3 = y5b.a;
        int i5 = p3uVar.A;
        int i6 = 0;
        uyt.b bVar = null;
        if (i5 != 0) {
            if (i5 == 1) {
                String str5 = p3uVar.e;
                strB1 = p3uVar.d;
                p34 p34Var4 = p3uVar.b;
                List list3 = p3uVar.a;
                uj50.b(obj2);
                p34Var2 = p34Var4;
                list2 = list3;
                str = str5;
            } else {
                if (i5 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str6 = p3uVar.w;
                String str7 = p3uVar.v;
                str2 = p3uVar.i;
                loyaltyActivityData2 = p3uVar.f;
                jVar2 = p3uVar.c;
                p34Var3 = p3uVar.b;
                uj50.b(obj2);
                str3 = str6;
                str4 = str7;
            }
            String str8 = str2;
            String str9 = (String) obj2;
            int status = loyaltyActivityData2.getStatus();
            dailyRecordContent = loyaltyActivityData2.getDailyRecordContent();
            if (dailyRecordContent != null) {
                zIsAccumulate = dailyRecordContent.isAccumulate();
            } else {
                zIsAccumulate = false;
            }
            jVar = jVar2;
            bVar = new uyt.b(str3, str4, str9, status, zIsAccumulate, str8, p34Var3.c);
            return (jVar != null || (listC = kotlin.collections.a.c(new uyt.e(jVar, bVar))) == null) ? kotlin.collections.a.c(uyt.d.a) : listC;
        }
        uj50.b(obj2);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            LoyaltyActivityData loyaltyActivityData5 = (LoyaltyActivityData) next;
            if (!loyaltyActivityData5.isDailyReward() && loyaltyActivityData5.getStatus() == 1) {
                break;
            }
        }
        LoyaltyActivityData loyaltyActivityData6 = (LoyaltyActivityData) next;
        if (loyaltyActivityData6 == null) {
            list2 = list;
            p34Var2 = p34Var;
            jVar = null;
            arrayList = new ArrayList();
            for (Object obj4 : list2) {
                if (((LoyaltyActivityData) obj4).isDailyReward()) {
                    arrayList.add(obj4);
                }
            }
            numArr = new Integer[]{new Integer(3), new Integer(5), new Integer(1)};
            i2 = 0;
            while (true) {
                if (i2 < 3) {
                    loyaltyActivityData = null;
                    break;
                }
                int iIntValue = numArr[i2].intValue();
                size = arrayList.size();
                i3 = i6;
                while (true) {
                    if (i3 < size) {
                        obj = null;
                        break;
                    }
                    obj = arrayList.get(i3);
                    i3++;
                    loyaltyActivityData4 = (LoyaltyActivityData) obj;
                    if (!loyaltyActivityData4.isDailyReward() && loyaltyActivityData4.getStatus() == iIntValue) {
                        break;
                    }
                }
                loyaltyActivityData3 = (LoyaltyActivityData) obj;
                if (loyaltyActivityData3 == null) {
                    loyaltyActivityData = loyaltyActivityData3;
                    break;
                }
                i2++;
                i6 = 0;
            }
            if (loyaltyActivityData != null) {
                if (loyaltyActivityData.getStatus() != 4 || loyaltyActivityData.getStatus() == 5) {
                    str2 = null;
                } else {
                    str2 = p34Var2.b;
                }
                batchId = loyaltyActivityData.getBatchId();
                strW = w0u.W(loyaltyActivityData.getDailyRecordContent());
                p3uVar.a = null;
                p3uVar.b = p34Var2;
                p3uVar.c = jVar;
                p3uVar.d = null;
                p3uVar.e = null;
                p3uVar.f = loyaltyActivityData;
                p3uVar.i = str2;
                p3uVar.v = strW;
                p3uVar.w = batchId;
                p3uVar.A = 2;
                objQ1 = Q1(loyaltyActivityData, p3uVar);
                if (objQ1 != obj3) {
                    loyaltyActivityData2 = loyaltyActivityData;
                    str3 = batchId;
                    str4 = strW;
                    p34Var3 = p34Var2;
                    jVar2 = jVar;
                    obj2 = objQ1;
                    String str10 = str2;
                    String str11 = (String) obj2;
                    int status2 = loyaltyActivityData2.getStatus();
                    dailyRecordContent = loyaltyActivityData2.getDailyRecordContent();
                    if (dailyRecordContent != null) {
                        zIsAccumulate = dailyRecordContent.isAccumulate();
                    } else {
                        zIsAccumulate = false;
                    }
                    jVar = jVar2;
                    bVar = new uyt.b(str3, str4, str11, status2, zIsAccumulate, str10, p34Var3.c);
                }
            }
            if (jVar != null) {
            }
        }
        strB1 = w0u.b1(loyaltyActivityData6.getStartTime(), loyaltyActivityData6.getEndTime());
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(loyaltyActivityData6.getEndTime());
        Date time = calendar.getTime();
        time.getClass();
        Locale locale = Locale.US;
        locale.getClass();
        String strL = bwf0.l(time, "HH:mm, dd MMM", locale, 2, 0);
        list2 = list;
        p3uVar.a = list2;
        p34Var2 = p34Var;
        p3uVar.b = p34Var2;
        p3uVar.c = null;
        p3uVar.d = strB1;
        p3uVar.e = strL;
        p3uVar.A = 1;
        Object objQ2 = Q1(loyaltyActivityData6, p3uVar);
        if (objQ2 != obj3) {
            str = strL;
            obj2 = objQ2;
        }
        return obj3;
        jVar = new uyt.j(p34Var2.c, strB1, str, (String) obj2, p34Var2.b);
        arrayList = new ArrayList();
        while (r4.hasNext()) {
            if (((LoyaltyActivityData) obj4).isDailyReward()) {
                arrayList.add(obj4);
            }
        }
        numArr = new Integer[]{new Integer(3), new Integer(5), new Integer(1)};
        i2 = 0;
        while (true) {
            if (i2 < 3) {
                loyaltyActivityData = null;
                break;
            }
            int iIntValue2 = numArr[i2].intValue();
            size = arrayList.size();
            i3 = i6;
            while (true) {
                if (i3 < size) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i3);
                i3++;
                loyaltyActivityData4 = (LoyaltyActivityData) obj;
                if (!loyaltyActivityData4.isDailyReward()) {
                }
            }
            loyaltyActivityData3 = (LoyaltyActivityData) obj;
            if (loyaltyActivityData3 == null) {
                loyaltyActivityData = loyaltyActivityData3;
                break;
            }
            i2++;
            i6 = 0;
        }
        if (loyaltyActivityData != null) {
            if (loyaltyActivityData.getStatus() != 4) {
                str2 = null;
            } else {
                str2 = null;
            }
            batchId = loyaltyActivityData.getBatchId();
            strW = w0u.W(loyaltyActivityData.getDailyRecordContent());
            p3uVar.a = null;
            p3uVar.b = p34Var2;
            p3uVar.c = jVar;
            p3uVar.d = null;
            p3uVar.e = null;
            p3uVar.f = loyaltyActivityData;
            p3uVar.i = str2;
            p3uVar.v = strW;
            p3uVar.w = batchId;
            p3uVar.A = 2;
            objQ1 = Q1(loyaltyActivityData, p3uVar);
            if (objQ1 != obj3) {
                loyaltyActivityData2 = loyaltyActivityData;
                str3 = batchId;
                str4 = strW;
                p34Var3 = p34Var2;
                jVar2 = jVar;
                obj2 = objQ1;
                String str12 = str2;
                String str13 = (String) obj2;
                int status3 = loyaltyActivityData2.getStatus();
                dailyRecordContent = loyaltyActivityData2.getDailyRecordContent();
                if (dailyRecordContent != null) {
                    zIsAccumulate = dailyRecordContent.isAccumulate();
                } else {
                    zIsAccumulate = false;
                }
                jVar = jVar2;
                bVar = new uyt.b(str3, str4, str13, status3, zIsAccumulate, str12, p34Var3.c);
            }
            return obj3;
        }
        if (jVar != null) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00db  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fd, code lost:
    
        if (r1 == r7) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B1(java.util.List r17, defpackage.uqf0 r18, defpackage.uqf0 r19, defpackage.uqf0 r20, java.lang.String r21, com.sporty.android.core.model.loyalty.UserTier r22, java.lang.String r23, defpackage.x1b r24) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b3u.B1(java.util.List, uqf0, uqf0, uqf0, java.lang.String, com.sporty.android.core.model.loyalty.UserTier, java.lang.String, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0100  */
    /* JADX WARN: Code duplicated, block: B:54:0x0120  */
    /* JADX WARN: Code duplicated, block: B:58:0x0140  */
    /* JADX WARN: Code duplicated, block: B:61:0x0151 A[LOOP:0: B:56:0x0139->B:61:0x0151, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0157  */
    /* JADX WARN: Code duplicated, block: B:65:0x0163  */
    /* JADX WARN: Code duplicated, block: B:67:0x016d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0155 A[EDGE_INSN: B:74:0x0155->B:63:0x0155 BREAK  A[LOOP:0: B:56:0x0139->B:61:0x0151], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object C1(jwv jwvVar, uqf0 uqf0Var, uqf0 uqf0Var2, List list, tyt tytVar, uqf0 uqf0Var3, String str, UserTier userTier, p34 p34Var, x1b x1bVar) {
        r3u r3uVar;
        Object objC;
        uqf0 uqf0Var4;
        List list2;
        uqf0 uqf0Var5;
        jwv jwvVar2;
        tyt tytVar2;
        String str2;
        boolean z;
        ArrayList arrayListL;
        uf00 uf00VarF;
        Iterator<E> it;
        int i2;
        m3f0 m3f0Var;
        tyt tytVar3;
        jwv jwvVar3 = jwvVar;
        tyt tytVar4 = tytVar;
        if (x1bVar instanceof r3u) {
            r3uVar = (r3u) x1bVar;
            int i3 = r3uVar.i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r3uVar.i = i3 - Integer.MIN_VALUE;
            } else {
                r3uVar = new r3u(this, x1bVar);
            }
        } else {
            r3uVar = new r3u(this, x1bVar);
        }
        r3u r3uVar2 = r3uVar;
        Object objF1 = r3uVar2.e;
        Object obj = y5b.a;
        int i4 = r3uVar2.i;
        f0u f0uVar = this.c;
        if (i4 == 0) {
            uj50.b(objF1);
            r3uVar2.a = jwvVar3;
            r3uVar2.b = uqf0Var2;
            r3uVar2.c = tytVar4;
            r3uVar2.i = 1;
            f0uVar.getClass();
            if (Intrinsics.g(tytVar4, tyt.a.d)) {
                objC = A1(list, p34Var, r3uVar2);
            } else if (tytVar4 instanceof tyt.b) {
                objC = B1(list, uqf0Var, uqf0Var2, uqf0Var3, str, userTier, p34Var.b, r3uVar2);
            } else {
                if (!(tytVar4 instanceof tyt.c)) {
                    uhc.a();
                    return null;
                }
                jwvVar3.getClass();
                objC = !jwvVar3.a.isEmpty() ? kotlin.collections.a.c(new uyt.g(jwvVar3)) : m2g.a;
            }
            objF1 = objC;
            if (objF1 != obj) {
                uqf0Var4 = uqf0Var2;
            }
            return obj;
        }
        if (i4 == 1) {
            tyt tytVar5 = r3uVar2.c;
            uqf0Var4 = r3uVar2.b;
            jwv jwvVar4 = r3uVar2.a;
            uj50.b(objF1);
            tytVar4 = tytVar5;
            jwvVar3 = jwvVar4;
        } else {
            if (i4 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = r3uVar2.d;
            tytVar2 = r3uVar2.c;
            uqf0Var5 = r3uVar2.b;
            jwvVar2 = r3uVar2.a;
            uj50.b(objF1);
        }
        str2 = (String) objF1;
        Set<String> setO1 = O1((String) this.N.a.getValue());
        if (str2 != null || setO1.contains(str2)) {
            z = false;
        } else {
            z = true;
        }
        f0uVar.getClass();
        jwvVar2.getClass();
        arrayListL = kotlin.collections.b.l(tyt.a.d, new tyt.b(z));
        if (!jwvVar2.a.isEmpty()) {
            arrayListL.add(new tyt.c(jwvVar2.b));
        }
        uf00VarF = a4h.f(arrayListL);
        uf00VarF.getClass();
        tytVar2.getClass();
        it = uf00VarF.iterator();
        i2 = 0;
        while (true) {
            if (it.hasNext()) {
                i2 = -1;
                break;
            }
            if (((tyt) it.next()).b.equals(tytVar2.b)) {
                break;
            }
            i2++;
        }
        if (i2 != -1) {
            m3f0Var = new m3f0(uf00VarF, (tyt) uf00VarF.get(i2), i2);
        } else {
            tytVar3 = (tyt) CollectionsKt.firstOrNull(uf00VarF);
            if (tytVar3 == null) {
                tytVar3 = tyt.a.d;
            }
            m3f0Var = new m3f0(uf00VarF, tytVar3, 0);
        }
        return kotlin.collections.b.k(new wd8(m3f0Var, lrf0.a(uqf0Var5.a)), new vd8(a4h.f(list2), lrf0.a(uqf0Var5.a), tytVar2));
        list2 = (List) objF1;
        lk50 lk50Var = (lk50) this.O.getValue();
        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
        ftt fttVar = cVar != null ? (ftt) cVar.a : null;
        if (fttVar == null) {
            return m2g.a;
        }
        lk50 cVar2 = new lk50.c(fttVar);
        krf0 krf0Var = uqf0Var4.a;
        r3uVar2.a = jwvVar3;
        r3uVar2.b = uqf0Var4;
        r3uVar2.c = tytVar4;
        r3uVar2.d = list2;
        r3uVar2.i = 2;
        objF1 = F1(cVar2, krf0Var, r3uVar2);
        if (objF1 != obj) {
            uqf0Var5 = uqf0Var4;
            jwvVar2 = jwvVar3;
            tytVar2 = tytVar4;
            str2 = (String) objF1;
            Set<String> setO2 = O1((String) this.N.a.getValue());
            if (str2 != null) {
                z = false;
            } else {
                z = false;
            }
            f0uVar.getClass();
            jwvVar2.getClass();
            arrayListL = kotlin.collections.b.l(tyt.a.d, new tyt.b(z));
            if (!jwvVar2.a.isEmpty()) {
                arrayListL.add(new tyt.c(jwvVar2.b));
            }
            uf00VarF = a4h.f(arrayListL);
            uf00VarF.getClass();
            tytVar2.getClass();
            it = uf00VarF.iterator();
            i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (((tyt) it.next()).b.equals(tytVar2.b)) {
                    break;
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                m3f0Var = new m3f0(uf00VarF, (tyt) uf00VarF.get(i2), i2);
            } else {
                tytVar3 = (tyt) CollectionsKt.firstOrNull(uf00VarF);
                if (tytVar3 == null) {
                    tytVar3 = tyt.a.d;
                }
                m3f0Var = new m3f0(uf00VarF, tytVar3, 0);
            }
            return kotlin.collections.b.k(new wd8(m3f0Var, lrf0.a(uqf0Var5.a)), new vd8(a4h.f(list2), lrf0.a(uqf0Var5.a), tytVar2));
        }
        return obj;
    }

    public final void D1() {
        jvd0 jvd0Var = this.V;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.V = kzh.d(new g1i(bm50.a(new nvt(this.a.a.l())), new g(null, this)), o8i0.d(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object F1(lk50 lk50Var, krf0 krf0Var, x1b x1bVar) {
        s3u s3uVar;
        if (x1bVar instanceof s3u) {
            s3uVar = (s3u) x1bVar;
            int i2 = s3uVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s3uVar.d = i2 - Integer.MIN_VALUE;
            } else {
                s3uVar = new s3u(this, x1bVar);
            }
        } else {
            s3uVar = new s3u(this, x1bVar);
        }
        Object objC = s3uVar.b;
        y5b y5bVar = y5b.a;
        int i3 = s3uVar.d;
        if (i3 == 0) {
            uj50.b(objC);
            if (lk50Var instanceof lk50.c) {
                ftt fttVar = (ftt) ((lk50.c) lk50Var).a;
                uqf0 uqf0VarN1 = N1(krf0Var, fttVar.a);
                uqf0 uqf0VarM1 = M1(fttVar.b.getCurrentTier(), fttVar.a);
                if (uqf0VarN1 != null && uqf0VarM1 != null) {
                    krf0 krf0Var2 = uqf0VarN1.a;
                    TierDobConfig tierDobConfig = uqf0VarN1.c;
                    TierDobConfig tierDobConfig2 = uqf0VarM1.c;
                    s3uVar.a = krf0Var;
                    s3uVar.d = 1;
                    objC = this.z.c(krf0Var2, tierDobConfig2, tierDobConfig, s3uVar);
                    if (objC == y5bVar) {
                        return y5bVar;
                    }
                }
            }
            return null;
        }
        if (i3 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        krf0Var = s3uVar.a;
        uj50.b(objC);
        if (((aue) objC) != null) {
            return hce0.a(krf0Var.a, "dob_benefit_");
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:47:0x0103  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object G1(uqf0 uqf0Var, uqf0 uqf0Var2, uqf0 uqf0Var3, UserTier userTier, List list, tyt tytVar, jwv jwvVar, String str, p34 p34Var, List list2, long j, a aVar, x1b x1bVar) {
        t3u t3uVar;
        Object obj;
        boolean z;
        boolean z2;
        BigDecimal bigDecimal;
        Object next;
        uqf0 uqf0Var4;
        uqf0 uqf0Var5;
        UserTier userTier2;
        List list3;
        tyt tytVar2;
        jwv jwvVar2;
        String str2;
        p34 p34Var2;
        long j2;
        a aVar2;
        List list4;
        List list5;
        List list6;
        if (x1bVar instanceof t3u) {
            t3uVar = (t3u) x1bVar;
            int i2 = t3uVar.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t3uVar.D = i2 - Integer.MIN_VALUE;
            } else {
                t3uVar = new t3u(this, x1bVar);
            }
        } else {
            t3uVar = new t3u(this, x1bVar);
        }
        t3u t3uVar2 = t3uVar;
        Object objC = t3uVar2.B;
        Object obj2 = y5b.a;
        int i3 = t3uVar2.D;
        if (i3 != 0) {
            if (i3 == 1) {
                j2 = t3uVar2.A;
                list4 = t3uVar2.y;
                aVar2 = t3uVar2.w;
                p34Var2 = t3uVar2.v;
                str2 = t3uVar2.i;
                jwvVar2 = t3uVar2.f;
                tytVar2 = t3uVar2.e;
                list3 = t3uVar2.d;
                userTier2 = t3uVar2.c;
                uqf0Var5 = t3uVar2.b;
                uqf0Var4 = t3uVar2.a;
                uj50.b(objC);
                obj = obj2;
            } else {
                if (i3 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list5 = t3uVar2.z;
                list6 = t3uVar2.y;
                uj50.b(objC);
            }
            list5.addAll((Collection) objC);
            return list6;
        }
        ArrayList arrayListA = j9f.a(objC);
        if (!userTier.isUserTierUnlocked()) {
            arrayListA.add(fbj.a);
        }
        t3uVar2.a = uqf0Var;
        t3uVar2.b = uqf0Var3;
        t3uVar2.c = userTier;
        t3uVar2.d = list;
        t3uVar2.e = tytVar;
        t3uVar2.f = jwvVar;
        t3uVar2.i = str;
        t3uVar2.v = p34Var;
        t3uVar2.w = aVar;
        t3uVar2.y = arrayListA;
        obj = obj2;
        t3uVar2.A = j;
        t3uVar2.D = 1;
        jrf0 jrf0Var = this.B;
        jrf0Var.getClass();
        BigDecimal bigDecimalK = jrf0.k(userTier.getPeriodWager());
        BigDecimal bigDecimalK2 = jrf0.k(userTier.getLifeWager());
        TierConfig tierConfig = uqf0Var.b;
        krf0 krf0Var = uqf0Var.a;
        Long minMonthWager = tierConfig.getMinMonthWager();
        BigDecimal bigDecimalK3 = minMonthWager != null ? jrf0.k(minMonthWager.longValue()) : null;
        if (bigDecimalK3 == null) {
            z = true;
        } else {
            BigDecimal bigDecimal2 = krf0Var != krf0.TIER_0 ? bigDecimalK3 : null;
            if (bigDecimal2 == null || bigDecimalK.compareTo(bigDecimal2) >= 0) {
                z = true;
            } else {
                z = false;
            }
        }
        Long minLifeTimeWager = uqf0Var.b.getMinLifeTimeWager();
        BigDecimal bigDecimalK4 = minLifeTimeWager != null ? jrf0.k(minLifeTimeWager.longValue()) : null;
        if (bigDecimalK4 == null) {
            z2 = true;
        } else {
            if (krf0Var == krf0.TIER_0) {
                bigDecimalK4 = null;
            }
            if (bigDecimalK4 == null || bigDecimalK2.compareTo(bigDecimalK4) >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        boolean z3 = !(z && z2) && userTier.isProbation();
        Iterator<T> it = krf0.I.iterator();
        while (true) {
            if (!it.hasNext()) {
                bigDecimal = bigDecimalK2;
                next = null;
                break;
            }
            next = it.next();
            bigDecimal = bigDecimalK2;
            if (((krf0) next).a == krf0Var.a - 1) {
                break;
            }
            bigDecimalK2 = bigDecimal;
        }
        krf0 krf0Var2 = (krf0) next;
        if (krf0Var2 == null) {
            krf0Var2 = krf0.TIER_0;
        }
        if (uqf0Var2 == null || uqf0Var2.a.i) {
            UserTier userTier3 = userTier;
            objC = jrf0Var.c(uqf0Var, userTier3, z3, bigDecimalK3, krf0Var2, list2, j, t3uVar2);
        } else {
            obj = obj;
            objC = jrf0Var.f(uqf0Var, uqf0Var2, userTier, bigDecimalK, bigDecimal, bigDecimalK3, z, z2, z3, krf0Var2, list2, j, t3uVar2);
        }
        if (objC != obj) {
            t3uVar2 = t3uVar2;
            uqf0Var4 = uqf0Var;
            uqf0Var5 = uqf0Var3;
            userTier2 = userTier;
            list3 = list;
            tytVar2 = tytVar;
            jwvVar2 = jwvVar;
            str2 = str;
            p34Var2 = p34Var;
            j2 = j;
            aVar2 = aVar;
            list4 = arrayListA;
        }
        t3uVar2 = t3uVar2;
        return obj;
        list4.add((crf0) objC);
        if (p34Var2.a) {
            list4.add(new lnc(lrf0.a(uqf0Var4.a), p34Var2.d, p34Var2.e));
        }
        if (aVar2.a) {
            boolean zA = lrf0.a(uqf0Var4.a);
            int iE1 = E1(uqf0Var4.a);
            StringUiText stringUiText = vch0.a;
            list4.add(new e07(zA, new ResourceUiText(iE1), aVar2.b));
        }
        t3uVar2.a = null;
        t3uVar2.b = null;
        t3uVar2.c = null;
        t3uVar2.d = null;
        t3uVar2.e = null;
        t3uVar2.f = null;
        t3uVar2.i = null;
        t3uVar2.v = null;
        t3uVar2.w = null;
        t3uVar2.y = list4;
        t3uVar2.z = list4;
        t3uVar2.A = j2;
        t3uVar2.D = 2;
        objC = C1(jwvVar2, uqf0Var4, uqf0Var4, list3, tytVar2, uqf0Var5, str2, userTier2, p34Var2, t3uVar2);
        if (objC != obj) {
            list5 = list4;
            list6 = list5;
            list5.addAll((Collection) objC);
            return list6;
        }
        t3uVar2 = t3uVar2;
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object H1(uqf0 uqf0Var, uqf0 uqf0Var2, UserTier userTier, List list, tyt tytVar, jwv jwvVar, String str, p34 p34Var, List list2, long j, a aVar, x1b x1bVar) {
        u3u u3uVar;
        StringUiText stringUiText;
        ArrayList arrayList;
        ArrayList arrayList2;
        if (x1bVar instanceof u3u) {
            u3uVar = (u3u) x1bVar;
            int i2 = u3uVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u3uVar.e = i2 - Integer.MIN_VALUE;
            } else {
                u3uVar = new u3u(this, x1bVar);
            }
        } else {
            u3uVar = new u3u(this, x1bVar);
        }
        u3u u3uVar2 = u3uVar;
        Object objC1 = u3uVar2.c;
        Object obj = y5b.a;
        int i3 = u3uVar2.e;
        if (i3 == 0) {
            ArrayList arrayListA = j9f.a(objC1);
            jrf0 jrf0Var = this.B;
            jrf0Var.getClass();
            uqf0Var.getClass();
            list2.getClass();
            arrayListA.add(new z4c(jrf0Var.e(uqf0Var, list2, j)));
            String supportCSName = userTier.getSupportCSName();
            if (supportCSName == null) {
                supportCSName = "";
            }
            String supportCSNumber = userTier.getSupportCSNumber();
            if (supportCSNumber != null) {
                StringUiText stringUiText2 = vch0.a;
                stringUiText = new StringUiText(supportCSNumber);
            } else {
                stringUiText = vch0.a;
            }
            arrayListA.add(new y4c(supportCSName, stringUiText, this.e.x() ? "https://s.sporty.net/cms/CS_img_GH_13b7c593ab.png" : "https://s.sporty.net/cms/CS_img_amb_7f733c6252.png"));
            if (p34Var.a) {
                arrayListA.add(new lnc(true, p34Var.d, p34Var.e));
            }
            if (aVar.a) {
                arrayListA.add(new e07(true, new ResourceUiText(E1(uqf0Var.a)), aVar.b));
                if (!this.M) {
                    this.y.a(bqt.a, k00.d);
                    this.M = true;
                }
            }
            u3uVar2.a = arrayListA;
            u3uVar2.b = arrayListA;
            u3uVar2.e = 1;
            objC1 = C1(jwvVar, uqf0Var, uqf0Var, list, tytVar, uqf0Var2, str, userTier, p34Var, u3uVar2);
            if (objC1 == obj) {
                return obj;
            }
            arrayList = arrayListA;
            arrayList2 = arrayList;
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = u3uVar2.b;
            arrayList2 = u3uVar2.a;
            uj50.b(objC1);
        }
        arrayList.addAll((Collection) objC1);
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object I1(uqf0 uqf0Var, uqf0 uqf0Var2, UserTier userTier, List list, tyt tytVar, jwv jwvVar, String str, p34 p34Var, List list2, long j, a aVar, x1b x1bVar) {
        v3u v3uVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        if (x1bVar instanceof v3u) {
            v3uVar = (v3u) x1bVar;
            int i2 = v3uVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v3uVar.e = i2 - Integer.MIN_VALUE;
            } else {
                v3uVar = new v3u(this, x1bVar);
            }
        } else {
            v3uVar = new v3u(this, x1bVar);
        }
        v3u v3uVar2 = v3uVar;
        Object objC1 = v3uVar2.c;
        Object obj = y5b.a;
        int i3 = v3uVar2.e;
        if (i3 == 0) {
            ArrayList arrayListA = j9f.a(objC1);
            arrayListA.add(fbj.a);
            if (p34Var.a) {
                arrayListA.add(new lnc(false, p34Var.d, p34Var.e));
            }
            if (aVar.a) {
                int iE1 = E1(uqf0Var.a);
                StringUiText stringUiText = vch0.a;
                arrayListA.add(new e07(false, new ResourceUiText(iE1), aVar.b));
            }
            StringUiText stringUiText2 = vch0.a;
            arrayListA.add(new yd8(new ResourceUiText(R.string.page_loyalty__weekly_giveaway_title)));
            arrayListA.add(new gbj(this.B.d(uqf0Var, list2, j)));
            arrayListA.add(new yd8(new ConcatUiText(new UiText[]{new ResourceUiText(uqf0Var.a.b), new ResourceUiText(R.string.page_loyalty__tier_benefit)}, new StringUiText(" "))));
            v3uVar2.a = arrayListA;
            v3uVar2.b = arrayListA;
            v3uVar2.e = 1;
            objC1 = C1(jwvVar, uqf0Var, uqf0Var, list, tytVar, uqf0Var2, str, userTier, p34Var, v3uVar2);
            if (objC1 == obj) {
                return obj;
            }
            arrayList = arrayListA;
            arrayList2 = arrayList;
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = v3uVar2.b;
            arrayList2 = v3uVar2.a;
            uj50.b(objC1);
        }
        arrayList.addAll((Collection) objC1);
        return arrayList2;
    }

    public final void J1() {
        jvd0 jvd0Var = this.T;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        h530 h530Var = this.a.a;
        this.T = kzh.d(new g1i(bm50.a(new s78(new pvt(h530Var.k()), new ovt(h530Var.e()), new qvt(3, null))), new h(null, this)), o8i0.d(this));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x013f  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object K1(uqf0 uqf0Var, uqf0 uqf0Var2, uqf0 uqf0Var3, List list, UserTier userTier, String str, x1b x1bVar) {
        w3u w3uVar;
        UserTier userTier2;
        uqf0 uqf0Var4;
        List list2;
        uqf0 uqf0Var5;
        uqf0 uqf0Var6;
        List list3;
        String str2;
        uqf0 uqf0Var7;
        List list4;
        uqf0 uqf0Var8;
        List list5;
        UserTier userTier3;
        uqf0 uqf0Var9;
        String str3;
        boolean z;
        List list6;
        if (x1bVar instanceof w3u) {
            w3uVar = (w3u) x1bVar;
            int i2 = w3uVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w3uVar.y = i2 - Integer.MIN_VALUE;
            } else {
                w3uVar = new w3u(this, x1bVar);
            }
        } else {
            w3uVar = new w3u(this, x1bVar);
        }
        w3u w3uVar2 = w3uVar;
        Object objB1 = w3uVar2.v;
        Object obj = y5b.a;
        int i3 = w3uVar2.y;
        jrf0 jrf0Var = this.B;
        if (i3 != 0) {
            if (i3 == 1) {
                list5 = w3uVar2.i;
                str3 = w3uVar2.f;
                userTier3 = w3uVar2.e;
                List list7 = w3uVar2.d;
                uqf0 uqf0Var10 = w3uVar2.c;
                uqf0Var9 = w3uVar2.b;
                uqf0Var8 = w3uVar2.a;
                uj50.b(objB1);
                list4 = list7;
                uqf0Var7 = uqf0Var10;
            } else {
                if (i3 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list6 = w3uVar2.i;
                uj50.b(objB1);
                z = false;
            }
            boolean z2 = z;
            list6.add(new vd8(a4h.f((List) objB1), z2, new tyt.b(z2)));
            return list6;
        }
        ArrayList arrayListA = j9f.a(objB1);
        if (userTier.isUserTierUnlocked()) {
            arrayListA.add(ebj.a);
        } else if (!lrf0.a(uqf0Var.a)) {
            arrayListA.add(fbj.a);
        }
        if (uqf0Var.a.a > uqf0Var2.a.a) {
            boolean zIsUserTierUnlocked = userTier.isUserTierUnlocked();
            w3uVar2.a = uqf0Var;
            w3uVar2.b = uqf0Var2;
            uqf0Var7 = uqf0Var3;
            w3uVar2.c = uqf0Var7;
            list4 = list;
            w3uVar2.d = list4;
            w3uVar2.e = userTier;
            w3uVar2.f = str;
            w3uVar2.i = arrayListA;
            w3uVar2.y = 1;
            Object objB = jrf0Var.b(uqf0Var, zIsUserTierUnlocked, w3uVar2);
            if (objB != obj) {
                uqf0Var8 = uqf0Var;
                list5 = arrayListA;
                objB1 = objB;
                userTier3 = userTier;
                uqf0Var9 = uqf0Var2;
                str3 = str;
            }
        } else {
            userTier2 = userTier;
            uqf0Var4 = uqf0Var3;
            list2 = arrayListA;
            uqf0Var5 = uqf0Var2;
            uqf0Var6 = uqf0Var;
            list3 = list;
            str2 = str;
            StringUiText stringUiText = vch0.a;
            z = false;
            list2.add(new yd8(new ResourceUiText(R.string.page_loyalty__weekly_giveaway_title)));
            list2.add(new gbj(jrf0Var.d(uqf0Var6, m2g.a, System.currentTimeMillis())));
            list2.add(new yd8(new ConcatUiText(new UiText[]{new ResourceUiText(uqf0Var6.a.b), new ResourceUiText(R.string.page_loyalty__tier_benefit)}, new StringUiText(" "))));
            w3uVar2.a = null;
            w3uVar2.b = null;
            w3uVar2.c = null;
            w3uVar2.d = null;
            w3uVar2.e = null;
            w3uVar2.f = null;
            w3uVar2.i = list2;
            w3uVar2.y = 2;
            objB1 = B1(list3, uqf0Var6, uqf0Var5, uqf0Var4, "", userTier2, str2, w3uVar2);
            if (objB1 != obj) {
                list6 = list2;
                boolean z3 = z;
                list6.add(new vd8(a4h.f((List) objB1), z3, new tyt.b(z3)));
                return list6;
            }
        }
        return obj;
        crf0 crf0Var = (crf0) objB1;
        if (crf0Var != null) {
            list5.add(crf0Var);
        }
        uqf0Var5 = uqf0Var9;
        userTier2 = userTier3;
        uqf0Var4 = uqf0Var7;
        list2 = list5;
        list3 = list4;
        str2 = str3;
        uqf0Var6 = uqf0Var8;
        StringUiText stringUiText2 = vch0.a;
        z = false;
        list2.add(new yd8(new ResourceUiText(R.string.page_loyalty__weekly_giveaway_title)));
        list2.add(new gbj(jrf0Var.d(uqf0Var6, m2g.a, System.currentTimeMillis())));
        list2.add(new yd8(new ConcatUiText(new UiText[]{new ResourceUiText(uqf0Var6.a.b), new ResourceUiText(R.string.page_loyalty__tier_benefit)}, new StringUiText(" "))));
        w3uVar2.a = null;
        w3uVar2.b = null;
        w3uVar2.c = null;
        w3uVar2.d = null;
        w3uVar2.e = null;
        w3uVar2.f = null;
        w3uVar2.i = list2;
        w3uVar2.y = 2;
        objB1 = B1(list3, uqf0Var6, uqf0Var5, uqf0Var4, "", userTier2, str2, w3uVar2);
        if (objB1 != obj) {
            list6 = list2;
            boolean z4 = z;
            list6.add(new vd8(a4h.f((List) objB1), z4, new tyt.b(z4)));
            return list6;
        }
        return obj;
    }

    public final Set<String> O1(String str) {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            bVar = (Set) this.w.fromJson(str, new i().getType());
            if (bVar == null) {
                bVar = t3g.a;
            }
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Object obj = t3g.a;
        if (bVar instanceof zi50.b) {
            bVar = obj;
        }
        return (Set) bVar;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x028a  */
    /* JADX WARN: Code duplicated, block: B:152:0x0299  */
    /* JADX WARN: Code duplicated, block: B:154:0x029d  */
    /* JADX WARN: Code duplicated, block: B:156:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:158:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:289:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0111  */
    /* JADX WARN: Code duplicated, block: B:56:0x011d  */
    /* JADX WARN: Code duplicated, block: B:59:0x012f  */
    /* JADX WARN: Code duplicated, block: B:71:0x014f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0152  */
    /* JADX WARN: Code duplicated, block: B:74:0x0155  */
    /* JADX WARN: Code duplicated, block: B:75:0x0158  */
    /* JADX WARN: Code duplicated, block: B:77:0x015c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0161  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void P1(igm igmVar) {
        ftt fttVar;
        Object next;
        wwd0 wwd0Var;
        wwd0 wwd0Var2;
        Object value;
        Set set;
        String str;
        Object value2;
        oo3.d dVar;
        String str2;
        String str3;
        String str4;
        oo3 oo3Var;
        Iterator<T> it;
        Iterator<T> it2;
        Object next2;
        pdd0 pdd0Var;
        igmVar.getClass();
        boolean z = igmVar instanceof igm.o;
        ku90<jgm> ku90Var = this.E;
        rdd0 rdd0Var = this.y;
        if (z) {
            igm.o oVar = (igm.o) igmVar;
            boolean z2 = oVar instanceof igm.o.e;
            nvv nvvVar = this.b;
            if (z2) {
                if (!((Boolean) this.D.a.getValue()).booleanValue()) {
                    ku90Var.a(jgm.b.a);
                    return;
                } else {
                    rdd0Var.a(dwt.k.a, k00.d);
                    nvvVar.a(new yqv.e(((igm.o.e) oVar).a), o8i0.d(this));
                    return;
                }
            }
            if (oVar instanceof igm.o.f) {
                nvvVar.a(new yqv.g(((igm.o.f) oVar).a), o8i0.d(this));
                return;
            }
            if (oVar instanceof igm.o.b) {
                nvvVar.a(new yqv.b(((igm.o.b) oVar).a), o8i0.d(this));
                return;
            }
            if (oVar instanceof igm.o.c) {
                nvvVar.a(new yqv.c(((igm.o.c) oVar).a), o8i0.d(this));
                return;
            }
            if (oVar.equals(igm.o.d.a)) {
                nvvVar.a(yqv.d.a, o8i0.d(this));
                return;
            } else if (oVar instanceof igm.o.a) {
                nvvVar.a(new yqv.a(((igm.o.a) oVar).a), o8i0.d(this));
                return;
            } else {
                uhc.a();
                return;
            }
        }
        boolean z3 = igmVar instanceof igm.d;
        wwd0 wwd0Var3 = this.L;
        wwd0 wwd0Var4 = this.K;
        f0u f0uVar = this.c;
        if (z3) {
            igm.d dVar2 = (igm.d) igmVar;
            et7 et7VarD = o8i0.d(this);
            do3 do3Var = this.C;
            wwd0 wwd0Var5 = do3Var.d;
            wwd0 wwd0Var6 = do3Var.f;
            boolean z4 = dVar2 instanceof igm.d.b;
            if (z4) {
                ej5.c(et7VarD, null, null, new fo3(do3Var, ((igm.d.b) dVar2).a, null), 3);
                wwd0Var = wwd0Var3;
                wwd0Var2 = wwd0Var4;
            } else if (dVar2 instanceof igm.d.k) {
                igm.d.k kVar = (igm.d.k) dVar2;
                wwd0Var = wwd0Var3;
                long j = kVar.a;
                v340 v340Var = do3Var.k;
                if (v340Var == null || (oo3Var = (oo3) v340Var.a.getValue()) == null) {
                    wwd0Var2 = wwd0Var4;
                } else {
                    dVar = oo3Var.g;
                    wwd0Var2 = wwd0Var4;
                    if (dVar == null) {
                        it = oo3Var.f.iterator();
                        do {
                            if (it.hasNext()) {
                                it2 = ((oo3.a) it.next()).c.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        next2 = null;
                                        break;
                                    }
                                    next2 = it2.next();
                                } while (((oo3.d) next2).a != j);
                                dVar = (oo3.d) next2;
                            }
                        } while (dVar == null);
                    } else {
                        if (dVar.a != j) {
                            dVar = null;
                        }
                        if (dVar == null) {
                            it = oo3Var.f.iterator();
                            do {
                                if (it.hasNext()) {
                                    it2 = ((oo3.a) it.next()).c.iterator();
                                    do {
                                        if (it2.hasNext()) {
                                            next2 = null;
                                            break;
                                        }
                                        next2 = it2.next();
                                    } while (((oo3.d) next2).a != j);
                                    dVar = (oo3.d) next2;
                                }
                            } while (dVar == null);
                        }
                    }
                    long j2 = kVar.a;
                    if (dVar != null) {
                        str2 = dVar.c;
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    if (dVar != null) {
                        str4 = dVar.b;
                    } else {
                        str4 = null;
                    }
                    wwd0Var6.k(null, new nz3.a(j2, str3, str4, false));
                }
                dVar = null;
                long j3 = kVar.a;
                if (dVar != null) {
                    str2 = dVar.c;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                if (dVar != null) {
                    str4 = dVar.b;
                } else {
                    str4 = null;
                }
                wwd0Var6.k(null, new nz3.a(j3, str3, str4, false));
            } else {
                wwd0Var = wwd0Var3;
                wwd0Var2 = wwd0Var4;
                if (dVar2.equals(igm.d.c.a)) {
                    Object value3 = wwd0Var6.getValue();
                    nz3.a aVar = value3 instanceof nz3.a ? (nz3.a) value3 : null;
                    if (aVar != null) {
                        wwd0Var6.k(null, nz3.a.d(aVar, true));
                        ej5.c(et7VarD, null, null, new go3(do3Var, aVar, null), 3);
                    }
                } else if (dVar2.equals(igm.d.f.a)) {
                    wwd0Var6.setValue(null);
                } else if (dVar2.equals(igm.d.e.a)) {
                    do3Var.j.setValue(null);
                } else if (dVar2.equals(igm.d.j.a)) {
                    do {
                        value2 = wwd0Var5.getValue();
                    } while (!wwd0Var5.g(value2, Boolean.valueOf(!((Boolean) value2).booleanValue())));
                } else if (dVar2 instanceof igm.d.i) {
                    wwd0 wwd0Var7 = do3Var.e;
                    do {
                        value = wwd0Var7.getValue();
                        set = (Set) value;
                        str = ((igm.d.i) dVar2).a;
                    } while (!wwd0Var7.g(value, set.contains(str) ? yi80.c(set, str) : yi80.f(set, str)));
                } else if (!dVar2.equals(igm.d.h.a)) {
                    if (dVar2.equals(igm.d.C0678d.a)) {
                        Object value4 = wwd0Var6.getValue();
                        nz3.b bVar = value4 instanceof nz3.b ? (nz3.b) value4 : null;
                        if (bVar != null) {
                            wwd0Var6.k(null, nz3.b.d(bVar, true));
                            ej5.c(et7VarD, null, null, new eo3(do3Var, bVar, null), 3);
                        }
                    } else if (!dVar2.equals(igm.d.a.a)) {
                        if (!dVar2.equals(igm.d.g.a)) {
                            uhc.a();
                            return;
                        }
                        wwd0Var5.k(null, Boolean.TRUE);
                    }
                }
            }
            boolean z5 = dVar2 instanceof igm.d.g;
            if (z5) {
                pdd0Var = ex3.a;
            } else if (dVar2 instanceof igm.d.h) {
                pdd0Var = ix3.a;
            } else if (dVar2 instanceof igm.d.j) {
                pdd0Var = ox3.a;
            } else if (dVar2 instanceof igm.d.k) {
                pdd0Var = kx3.a;
            } else {
                if (!(dVar2 instanceof igm.d.c)) {
                    if (z4 || (dVar2 instanceof igm.d.C0678d)) {
                        pdd0Var = ax3.a;
                    }
                    if (dVar2 instanceof igm.d.a) {
                        ej5.c(o8i0.d(this), null, null, new d3u(null, this), 3);
                        return;
                    }
                    if (z5) {
                        ej5.c(o8i0.d(this), null, null, new d3u(null, this), 3);
                        f0uVar.a(new tyt.b(false));
                        Boolean bool = Boolean.TRUE;
                        wwd0Var2.getClass();
                        wwd0Var2.k(null, bool);
                        return;
                    }
                    if (dVar2 instanceof igm.d.h) {
                        f0uVar.a(new tyt.c(false));
                        Boolean bool2 = Boolean.TRUE;
                        wwd0Var.getClass();
                        wwd0Var.k(null, bool2);
                        return;
                    }
                    return;
                }
                pdd0Var = mx3.a;
            }
            rdd0Var.a(pdd0Var, k00.d);
            if (dVar2 instanceof igm.d.a) {
                ej5.c(o8i0.d(this), null, null, new d3u(null, this), 3);
                return;
            }
            if (z5) {
                ej5.c(o8i0.d(this), null, null, new d3u(null, this), 3);
                f0uVar.a(new tyt.b(false));
                Boolean bool3 = Boolean.TRUE;
                wwd0Var2.getClass();
                wwd0Var2.k(null, bool3);
                return;
            }
            if (dVar2 instanceof igm.d.h) {
                f0uVar.a(new tyt.c(false));
                Boolean bool4 = Boolean.TRUE;
                wwd0Var.getClass();
                wwd0Var.k(null, bool4);
                return;
            }
            return;
        }
        if (igmVar instanceof igm.t) {
            krf0 krf0Var = ((igm.t) igmVar).a;
            wwd0 wwd0Var8 = this.R;
            wwd0Var8.getClass();
            wwd0Var8.k(null, krf0Var);
            return;
        }
        if (igmVar instanceof igm.u) {
            f0uVar.a(((igm.u) igmVar).a);
            return;
        }
        boolean zEquals = igmVar.equals(igm.a.a);
        wwd0 wwd0Var9 = this.Q;
        wwd0 wwd0Var10 = this.O;
        if (zEquals) {
            Object value5 = wwd0Var10.getValue();
            if (!(value5 instanceof lk50.c)) {
                value5 = null;
            }
            lk50.c cVar = (lk50.c) value5;
            if (cVar != null) {
                ib50.b bVar2 = new ib50.b(L1(((ftt) cVar.a).b.getCurrentTier()));
                wwd0Var9.getClass();
                wwd0Var9.k(null, bVar2);
                return;
            }
            return;
        }
        if (igmVar.equals(igm.g.a)) {
            wwd0Var9.getClass();
            wwd0Var9.k(null, ib50.a.a);
            return;
        }
        boolean z6 = igmVar instanceof igm.r;
        wwd0 wwd0Var11 = this.Z;
        if (z6) {
            wsf0 wsf0Var = ((igm.r) igmVar).a;
            if (wsf0Var == null) {
                return;
            }
            if (wsf0Var instanceof wsf0.a) {
                Object[] objArr = {((wsf0.a) wsf0Var).c};
                StringUiText stringUiText = vch0.a;
                kst.a aVar2 = new kst.a(new ResourceUiText(R.string.page_loyalty__dialog_content_downgrade, ay0.S(objArr)));
                wwd0Var11.getClass();
                wwd0Var11.k(null, aVar2);
                return;
            }
            if (wsf0Var instanceof wsf0.b) {
                wsf0.b bVar3 = (wsf0.b) wsf0Var;
                String str5 = bVar3.c;
                int i2 = bVar3.f ? R.string.page_loyalty__dialog_content_next_grade_high_frequency : R.string.page_loyalty__dialog_content_next_grade;
                int i3 = bVar3.b.b;
                StringUiText stringUiText2 = vch0.a;
                kst.a aVar3 = new kst.a(new ResourceUiText(i2, ay0.S(new Object[]{new ResourceUiText(i3), bVar3.a, oxc.a(str5, " ", bVar3.d), oxc.a(str5, " ", bVar3.e)})));
                wwd0Var11.getClass();
                wwd0Var11.k(null, aVar3);
                return;
            }
            if (wsf0Var.equals(wsf0.c.a)) {
                kst.c cVar2 = new kst.c(vch0.a, new ResourceUiText(R.string.page_loyalty__dialog_content_processing));
                wwd0Var11.getClass();
                wwd0Var11.k(null, cVar2);
                return;
            } else {
                if (!(wsf0Var instanceof wsf0.d)) {
                    uhc.a();
                    return;
                }
                Object[] objArr2 = {((wsf0.d) wsf0Var).a};
                StringUiText stringUiText3 = vch0.a;
                kst.a aVar4 = new kst.a(new ResourceUiText(R.string.page_loyalty__dialog_content_upgrade, ay0.S(objArr2)));
                wwd0Var11.getClass();
                wwd0Var11.k(null, aVar4);
                return;
            }
        }
        if (igmVar.equals(igm.v.a)) {
            kst.c cVar3 = new kst.c(vch0.a, new ResourceUiText(R.string.page_loyalty__dialog_content_wager));
            wwd0Var11.getClass();
            wwd0Var11.k(null, cVar3);
            return;
        }
        if (igmVar.equals(igm.i.a)) {
            kst.b bVar4 = new kst.b();
            wwd0Var11.getClass();
            wwd0Var11.k(null, bVar4);
            return;
        }
        if (igmVar.equals(igm.k.a)) {
            Object value6 = wwd0Var10.getValue();
            if (!(value6 instanceof lk50.c)) {
                value6 = null;
            }
            lk50.c cVar4 = (lk50.c) value6;
            if (cVar4 == null || (fttVar = (ftt) cVar4.a) == null) {
                return;
            }
            Iterator<T> it3 = fttVar.a.getTierConfigList().iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (((TierConfig) next).getTier() != fttVar.b.getCurrentTier());
            TierConfig tierConfig = (TierConfig) next;
            if (tierConfig == null) {
                return;
            }
            Object[] objArr3 = {Float.valueOf(tierConfig.getRealSport()), Float.valueOf(tierConfig.getInstantWin()), Float.valueOf(tierConfig.getGame())};
            StringUiText stringUiText4 = vch0.a;
            kst.a aVar5 = new kst.a(new ResourceUiText(R.string.page_loyalty__potential_reward_detail_tip, ay0.S(objArr3)));
            wwd0Var11.getClass();
            wwd0Var11.k(null, aVar5);
            return;
        }
        if (igmVar.equals(igm.h.a)) {
            StringUiText stringUiText5 = vch0.a;
            kst.c cVar5 = new kst.c(new StringUiText(""), new ResourceUiText(R.string.page_loyalty__game_reward_release_info_dialog_content_app));
            wwd0Var11.getClass();
            wwd0Var11.k(null, cVar5);
            return;
        }
        if (igmVar.equals(igm.j.a)) {
            StringUiText stringUiText6 = vch0.a;
            kst.c cVar6 = new kst.c(new ResourceUiText(R.string.page_loyalty__weekly_rewards), new ResourceUiText(R.string.page_loyalty__reward_processing_desc));
            wwd0Var11.getClass();
            wwd0Var11.k(null, cVar6);
            return;
        }
        if (igmVar instanceof igm.f) {
            String str6 = ((igm.f) igmVar).a;
            kzh.d(new g1i(bm50.a(new j3u(this.d.y(str6))), new k3u(this, str6, null)), o8i0.d(this));
            return;
        }
        if (igmVar instanceof igm.e) {
            ej5.c(o8i0.d(this), null, null, new z3u(this, ((igm.e) igmVar).a, null), 3);
            return;
        }
        if (igmVar.equals(igm.l.a)) {
            ku90Var.a(jgm.a.a);
            return;
        }
        if (igmVar instanceof igm.n) {
            osa0.a(((igm.n) igmVar).a, this.G, null);
            return;
        }
        if (igmVar instanceof igm.s) {
            igm.s sVar = (igm.s) igmVar;
            pdd0 pdd0Var2 = sVar.a;
            k00[] k00VarArr = (k00[]) sVar.b.toArray(new k00[0]);
            rdd0Var.a(pdd0Var2, (k00[]) Arrays.copyOf(k00VarArr, k00VarArr.length));
            return;
        }
        if (igmVar.equals(igm.m.a)) {
            f0uVar.a(tyt.a.d);
            return;
        }
        if (igmVar.equals(igm.q.a)) {
            wwd0 wwd0Var12 = this.J;
            osa0.a(!((Boolean) wwd0Var12.getValue()).booleanValue(), wwd0Var12, null);
            return;
        }
        if (igmVar.equals(igm.p.a)) {
            Boolean bool5 = Boolean.TRUE;
            wwd0Var4.getClass();
            wwd0Var4.k(null, bool5);
        } else if (igmVar.equals(igm.b.a)) {
            Boolean bool6 = Boolean.FALSE;
            wwd0Var4.getClass();
            wwd0Var4.k(null, bool6);
        } else {
            if (!igmVar.equals(igm.c.a)) {
                uhc.a();
                return;
            }
            Boolean bool7 = Boolean.FALSE;
            wwd0Var3.getClass();
            wwd0Var3.k(null, bool7);
        }
    }

    public final Object Q1(LoyaltyActivityData loyaltyActivityData, x1b x1bVar) {
        return uti.g(this.A, s5y.d(new Long(loyaltyActivityData.getPotentialReward())), loyaltyActivityData.getCurrency(), false, x1bVar, 28);
    }

    public final boolean R1() {
        f0u f0uVar = this.c;
        if (f0uVar.d.a.getValue() != null) {
            return true;
        }
        return !Intrinsics.g(f0uVar.b.a.getValue(), tyt.a.d);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008e  */
    /* JADX WARN: Code duplicated, block: B:26:0x009b  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x0117  */
    /* JADX WARN: Code duplicated, block: B:49:0x011e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0126  */
    /* JADX WARN: Code duplicated, block: B:56:0x014a  */
    /* JADX WARN: Code duplicated, block: B:69:0x0192  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x014a -> B:13:0x0043). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object x1(java.util.List r23, defpackage.uqf0 r24, defpackage.uqf0 r25, java.lang.String r26, java.lang.String r27, defpackage.x1b r28) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b3u.x1(java.util.List, uqf0, uqf0, java.lang.String, java.lang.String, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object y1(uqf0 uqf0Var, uqf0 uqf0Var2, UserTier userTier, x1b x1bVar) {
        f3u f3uVar;
        Object next;
        Object next2;
        ResourceUiText resourceUiText;
        if (x1bVar instanceof f3u) {
            f3uVar = (f3u) x1bVar;
            int i2 = f3uVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f3uVar.f = i2 - Integer.MIN_VALUE;
            } else {
                f3uVar = new f3u(this, x1bVar);
            }
        } else {
            f3uVar = new f3u(this, x1bVar);
        }
        f3u f3uVar2 = f3uVar;
        Object objG = f3uVar2.d;
        y5b y5bVar = y5b.a;
        int i3 = f3uVar2.f;
        if (i3 == 0) {
            uj50.b(objG);
            Iterator<T> it = userTier.getTierRewardTimes().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((TierRewardTime) next).getTier() != uqf0Var.b.getTier());
            TierRewardTime tierRewardTime = (TierRewardTime) next;
            Long l = tierRewardTime != null ? new Long(tierRewardTime.getTime()) : null;
            if (l != null && Instant.ofEpochMilli(l.longValue()).isBefore(Instant.now().c(7L, ChronoUnit.DAYS))) {
                return null;
            }
            Iterator<T> it2 = uqf0Var.b.getTierRewardList().iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (((TierReward) next2).getRewardType() != 1);
            TierReward tierReward = (TierReward) next2;
            if (tierReward == null) {
                return null;
            }
            StringUiText stringUiText = vch0.a;
            ResourceUiText resourceUiText2 = new ResourceUiText(R.string.page_loyalty__upgrade_free_bet_gift);
            String plainString = new BigDecimal(tierReward.getRewardAmount()).divide(new BigDecimal(10000)).toPlainString();
            plainString.getClass();
            String currency = tierReward.getCurrency();
            f3uVar2.a = uqf0Var;
            f3uVar2.b = uqf0Var2;
            f3uVar2.c = resourceUiText2;
            f3uVar2.f = 1;
            objG = uti.g(this.A, plainString, currency, false, f3uVar2, 28);
            if (objG == y5bVar) {
                return y5bVar;
            }
            resourceUiText = resourceUiText2;
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResourceUiText resourceUiText3 = f3uVar2.c;
            uqf0Var2 = f3uVar2.b;
            uqf0Var = f3uVar2.a;
            uj50.b(objG);
            resourceUiText = resourceUiText3;
        }
        return new wr50.d(resourceUiText, vch0.d((CharSequence) objG), uqf0Var.a.a <= uqf0Var2.a.a ? new cgs.b(R.string.page_loyalty__rewarded_and_check_gift) : new cgs.a(), wae.ME_GIFTS, new ResourceUiText(R.string.page_loyalty__one_time_reward));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object z1(LoyaltyTierConfig loyaltyTierConfig, UserTier userTier, krf0 krf0Var, List list, tyt tytVar, ib50 ib50Var, jwv jwvVar, String str, String str2, p34 p34Var, List list2, long j, a aVar, x1b x1bVar) {
        o3u o3uVar;
        yvt yvtVar;
        String str3;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        if (x1bVar instanceof o3u) {
            o3uVar = (o3u) x1bVar;
            int i2 = o3uVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o3uVar.e = i2 - Integer.MIN_VALUE;
            } else {
                o3uVar = new o3u(this, x1bVar);
            }
        } else {
            o3uVar = new o3u(this, x1bVar);
        }
        o3u o3uVar2 = o3uVar;
        Object objI1 = o3uVar2.c;
        Object obj = y5b.a;
        int i3 = o3uVar2.e;
        if (i3 != 0) {
            if (i3 == 1) {
                arrayList7 = o3uVar2.b;
                arrayList8 = o3uVar2.a;
                uj50.b(objI1);
                arrayList7.addAll((Collection) objI1);
                return a4h.f(arrayList8);
            }
            if (i3 == 2) {
                arrayList5 = o3uVar2.b;
                arrayList6 = o3uVar2.a;
                uj50.b(objI1);
                arrayList5.addAll((Collection) objI1);
                return a4h.f(arrayList6);
            }
            if (i3 == 3) {
                arrayList3 = o3uVar2.b;
                arrayList4 = o3uVar2.a;
                uj50.b(objI1);
                arrayList3.addAll((Collection) objI1);
                return a4h.f(arrayList4);
            }
            if (i3 != 4) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = o3uVar2.b;
            arrayList2 = o3uVar2.a;
            uj50.b(objI1);
            arrayList.addAll((Collection) objI1);
            return a4h.f(arrayList2);
        }
        uj50.b(objI1);
        krf0 krf0VarL1 = L1(userTier.getCurrentTier());
        psm psmVar = this.e;
        if (psmVar.n()) {
            yvtVar = yvt.LoyaltyBannerOshoala;
        } else if (psmVar.x()) {
            yvtVar = yvt.LoyaltyBannerGH;
        } else if (psmVar.O()) {
            yvtVar = yvt.LoyaltyBannerMccarthyKolbe;
        } else {
            yvtVar = (psmVar.W() || psmVar.F()) ? yvt.LoyaltyBannerMourinho : yvt.LoyaltyBannerMccarthy;
        }
        String str4 = yvtVar.a;
        if (Intrinsics.g(str2, CMSLanguage.PORTUGUESE_BRAZIL.getLanguageCode())) {
            str3 = "https://s.sporty.net/cms/loyalty_logo_pt_b6670c782d.png";
        } else {
            str3 = Intrinsics.g(str2, CMSLanguage.SW.getLanguageCode()) ? "https://s.sporty.net/cms/main_title_sw_9bcb43e4a1.png" : "https://s.sporty.net/cms/main_title_644f4819d3.png";
        }
        ArrayList arrayListL = kotlin.collections.b.l(new xd8(krf0Var, krf0VarL1, str4, str3, ib50Var, userTier.isUserTierUnlocked()));
        uqf0 uqf0VarN1 = N1(krf0Var, loyaltyTierConfig);
        if (uqf0VarN1 == null) {
            return a4h.f(arrayListL);
        }
        uqf0 uqf0VarM1 = M1(userTier.getCurrentTier(), loyaltyTierConfig);
        if (uqf0VarM1 == null) {
            return a4h.f(arrayListL);
        }
        uqf0 uqf0VarM2 = M1(userTier.getHighestTier(), loyaltyTierConfig);
        if (uqf0VarM2 == null) {
            return a4h.f(arrayListL);
        }
        uqf0 uqf0VarM3 = M1(krf0Var.a + 1, loyaltyTierConfig);
        krf0 krf0Var2 = uqf0VarM1.a;
        if (krf0Var != krf0Var2) {
            String str5 = p34Var.b;
            o3uVar2.a = arrayListL;
            o3uVar2.b = arrayListL;
            o3uVar2.e = 1;
            objI1 = K1(uqf0VarN1, uqf0VarM1, uqf0VarM2, list, userTier, str5, o3uVar2);
            if (objI1 != obj) {
                arrayList7 = arrayListL;
                arrayList8 = arrayList7;
                arrayList7.addAll((Collection) objI1);
                return a4h.f(arrayList8);
            }
        } else if (lrf0.a(krf0Var2)) {
            o3uVar2.a = arrayListL;
            o3uVar2.b = arrayListL;
            o3uVar2.e = 2;
            objI1 = H1(uqf0VarN1, uqf0VarM2, userTier, list, tytVar, jwvVar, str, p34Var, list2, j, aVar, o3uVar2);
            if (objI1 != obj) {
                arrayList5 = arrayListL;
                arrayList6 = arrayList5;
                arrayList5.addAll((Collection) objI1);
                return a4h.f(arrayList6);
            }
        } else if (userTier.isUserTierUnlocked()) {
            o3uVar2.a = arrayListL;
            o3uVar2.b = arrayListL;
            o3uVar2.e = 3;
            objI1 = G1(uqf0VarN1, uqf0VarM3, uqf0VarM2, userTier, list, tytVar, jwvVar, str, p34Var, list2, j, aVar, o3uVar2);
            if (objI1 != obj) {
                arrayList3 = arrayListL;
                arrayList4 = arrayList3;
                arrayList3.addAll((Collection) objI1);
                return a4h.f(arrayList4);
            }
        } else {
            o3uVar2.a = arrayListL;
            o3uVar2.b = arrayListL;
            o3uVar2.e = 4;
            objI1 = I1(uqf0VarN1, uqf0VarM2, userTier, list, tytVar, jwvVar, str, p34Var, list2, j, aVar, o3uVar2);
            if (objI1 != obj) {
                arrayList = arrayListL;
                arrayList2 = arrayList;
                arrayList.addAll((Collection) objI1);
                return a4h.f(arrayList2);
            }
        }
        return obj;
    }

    public static final class a {
        public final boolean a;
        public final boolean b;

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "ChallengeEntryState(showEntrance=" + this.a + ", showNew=" + this.b + ")";
        }

        public a() {
            this(false, false);
        }
    }
}
