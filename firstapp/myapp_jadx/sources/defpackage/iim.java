package defpackage;

import android.accounts.Account;
import com.sporty.android.book.domain.entity.UIState;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.patron.KycHintExtra;
import com.sporty.android.core.model.realsports.FeatureLaunchRate;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.loyalty.impl.bettingstreak.presentation.model.BettingStreakUpgradeHintUiModel;
import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.SocketPushManager;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.ntespm.socket.Topic;
import com.sportybet.plugin.realsports.data.BoostInfo;
import com.sportybet.plugin.realsports.data.BoostResult;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.FeaturedMatch;
import com.sportybet.plugin.realsports.data.FeaturedMatchData;
import com.sportybet.plugin.realsports.data.FeaturedResponse;
import com.sportybet.plugin.realsports.data.FeaturedTab;
import com.sportybet.plugin.realsports.data.HighlightData;
import com.sportybet.plugin.realsports.data.HomeNotification;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.ServerProductStatus;
import com.sportybet.plugin.realsports.data.ServerProductStatusHelper;
import com.sportybet.plugin.realsports.data.SocketEventMessage;
import com.sportybet.plugin.realsports.data.SocketMarketMessage;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.SportGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liim;", "Lihb0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class iim extends ihb0 {
    public final m2l A;
    public final HomeNotification.Show A0;
    public final gip B;
    public final r5b B0;
    public final n9k C;
    public BoostInfo C0;
    public final cup D;
    public jvd0 D0;
    public final rdd0 E;
    public jvd0 E0;
    public final lyz F;
    public jvd0 F0;
    public final nkb0 G;
    public jvd0 G0;
    public final qa30 H;
    public final HashMap<String, c9p> H0;
    public final JsonSerializeService I;
    public boolean I0;
    public final je5 J;
    public jvd0 J0;
    public final ui7 K;
    public final r5b K0;
    public final sfy L;
    public final v340 L0;
    public final lch M;
    public final ku90<Boolean> M0;
    public final w1p N;
    public final ku90<BettingStreakUpgradeHintUiModel> N0;
    public final w6f O;
    public final t340 O0;
    public final jvh P;
    public final ku90<Unit> P0;
    public final xhh0 Q;
    public final v340 Q0;
    public final hkf R;
    public final psm S;
    public final zru T;
    public final mpe0 U;
    public final mpe0 V;
    public final v340 W;
    public final lyh<Integer> X;
    public final lyh<Integer> Y;
    public final lyh<KycHintExtra> Z;
    public final lyh<Boolean> a0;
    public final r5b b0;
    public final r5b c0;
    public final uqm d;
    public final LinkedHashMap d0;
    public final h940 e;
    public final xhm e0;
    public final n25 f;
    public final yhm f0;
    public final b390 g0;
    public final b390 h0;
    public final e8h i;
    public final b390 i0;
    public final b390 j0;
    public final wwd0 k0;
    public final wwd0 l0;
    public final wwd0 m0;
    public final v340 n0;
    public final vu90<Boolean> o0;
    public final vu90 p0;
    public final vu90<UIState<List<Event>>> q0;
    public final vu90 r0;
    public final vu90<UIState<HighlightData>> s0;
    public final vu90 t0;
    public final vu90<UIState<c6g0>> u0;
    public final lq1 v;
    public final vu90 v0;
    public final fls w;
    public final vu90<UIState<SportGroup>> w0;
    public final vu90 x0;
    public final uy0 y;
    public final vu90<tx40> y0;
    public final sr10 z;
    public final vu90 z0;

    public static final class a implements lyh<lk50<? extends FeaturedMatchData>> {
        public final /* synthetic */ s78 a;
        public final /* synthetic */ iim b;

        /* JADX INFO: renamed from: iim$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$fetchFeaturedMatches$$inlined$map$1", f = "HomeViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0682a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0682a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ iim b;

            /* JADX INFO: renamed from: iim$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$fetchFeaturedMatches$$inlined$map$1$2", f = "HomeViewModel.kt", l = {51, 50}, m = "emit", v = 2)
            public static final class C0683a extends x1b {
                public /* synthetic */ Object a;
                public int b;
                public myh d;

                public C0683a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, iim iimVar) {
                this.a = myhVar;
                this.b = iimVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
            
                if (r6.emit(r7, r0) == r1) goto L22;
             */
            @Override // defpackage.myh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, defpackage.v1b r8) throws java.lang.Throwable {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof iim.a.b.C0683a
                    if (r0 == 0) goto L13
                    r0 = r8
                    iim$a$b$a r0 = (iim.a.b.C0683a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    iim$a$b$a r0 = new iim$a$b$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.a
                    y5b r1 = defpackage.y5b.a
                    int r2 = r0.b
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L37
                    if (r2 == r4) goto L31
                    if (r2 != r3) goto L2b
                    defpackage.uj50.b(r8)
                    goto L68
                L2b:
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r6)
                    return r5
                L31:
                    myh r6 = r0.d
                    defpackage.uj50.b(r8)
                    goto L58
                L37:
                    defpackage.uj50.b(r8)
                    com.sporty.android.common.network.data.BaseResponse r7 = (com.sporty.android.common.network.data.BaseResponse) r7
                    T r8 = r7.data
                    r8.getClass()
                    java.util.List r8 = (java.util.List) r8
                    java.lang.String r7 = r7.message
                    r7.getClass()
                    myh r2 = r6.a
                    r0.d = r2
                    r0.b = r4
                    iim r6 = r6.b
                    java.lang.Object r8 = r6.C1(r0, r7, r8)
                    if (r8 != r1) goto L57
                    goto L67
                L57:
                    r6 = r2
                L58:
                    lk50$c r7 = new lk50$c
                    r7.<init>(r8)
                    r0.d = r5
                    r0.b = r3
                    java.lang.Object r6 = r6.emit(r7, r0)
                    if (r6 != r1) goto L68
                L67:
                    return r1
                L68:
                    kotlin.Unit r6 = kotlin.Unit.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: iim.a.b.emit(java.lang.Object, v1b):java.lang.Object");
            }
        }

        public a(s78 s78Var, iim iimVar) {
            this.a = s78Var;
            this.b = iimVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super lk50<? extends FeaturedMatchData>> myhVar, v1b v1bVar) {
            C0682a c0682a;
            if (v1bVar instanceof C0682a) {
                c0682a = (C0682a) v1bVar;
                int i = c0682a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0682a.b = i - Integer.MIN_VALUE;
                } else {
                    c0682a = new C0682a(v1bVar);
                }
            } else {
                c0682a = new C0682a(v1bVar);
            }
            Object obj = c0682a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0682a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b);
                c0682a.b = 1;
                if (this.a.collect(bVar, c0682a) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$fetchFeaturedMatches$1", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<BaseResponse<List<? extends FeaturedResponse>>, BaseResponse<BoostInfo>, v1b<? super BaseResponse<List<? extends FeaturedResponse>>>, Object> {
        public /* synthetic */ BaseResponse a;
        public /* synthetic */ BaseResponse b;

        public b(v1b<? super b> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(BaseResponse<List<? extends FeaturedResponse>> baseResponse, BaseResponse<BoostInfo> baseResponse2, v1b<? super BaseResponse<List<? extends FeaturedResponse>>> v1bVar) {
            b bVar = iim.this.new b(v1bVar);
            bVar.a = baseResponse;
            bVar.b = baseResponse2;
            return bVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            BaseResponse baseResponse = this.a;
            BaseResponse baseResponse2 = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            iim.this.C0 = (BoostInfo) baseResponse2.data;
            return baseResponse;
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$fetchFeaturedMatches$3", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<lk50<? extends FeaturedMatchData>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = iim.this.new c(v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends FeaturedMatchData> lk50Var, v1b<? super Unit> v1bVar) {
            return ((c) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            iim.this.k0.setValue(lk50Var);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$fetchFeaturedMatches$4", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements gaj<myh<? super lk50<? extends FeaturedMatchData>>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;

        public d(v1b<? super d> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super lk50<? extends FeaturedMatchData>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            d dVar = iim.this.new d(v1bVar);
            dVar.a = th;
            return dVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wwd0 wwd0Var = iim.this.k0;
            lk50.a aVar = new lk50.a(th);
            wwd0Var.getClass();
            wwd0Var.k(null, aVar);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$getFeaturesLaunchRate$2", f = "HomeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<lk50<? extends BaseResponse<List<? extends FeatureLaunchRate>>>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = iim.this.new e(v1bVar);
            eVar.a = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends BaseResponse<List<? extends FeatureLaunchRate>>> lk50Var, v1b<? super Unit> v1bVar) {
            return ((e) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (!(lk50Var instanceof lk50.c)) {
                return Unit.a;
            }
            T t = ((BaseResponse) ((lk50.c) lk50Var).a).data;
            if (t != 0) {
                for (FeatureLaunchRate featureLaunchRate : (List) t) {
                    lch lchVar = iim.this.M;
                    String str = featureLaunchRate.featureId;
                    int i = featureLaunchRate.launchRate;
                    lchVar.getClass();
                    vn20.a("features").edit().putInt("pref_key_feature_prefix_" + str, i).commit();
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v10, types: [xhm] */
    /* JADX WARN: Type inference failed for: r2v11, types: [yhm] */
    public iim(uqm uqmVar, h940 h940Var, n25 n25Var, e8h e8hVar, lq1 lq1Var, fls flsVar, uy0 uy0Var, sr10 sr10Var, m2l m2lVar, gip gipVar, n9k n9kVar, g990 g990Var, pck pckVar, cup cupVar, rdd0 rdd0Var, sde sdeVar, lyz lyzVar, nkb0 nkb0Var, qa30 qa30Var, mgb0 mgb0Var, JsonSerializeService jsonSerializeService, je5 je5Var, ui7 ui7Var, sfy sfyVar, lch lchVar, w1p w1pVar, w6f w6fVar, jvh jvhVar, xhh0 xhh0Var, hkf hkfVar, psm psmVar, yo6 yo6Var, zru zruVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, k8k k8kVar) {
        super(0);
        uqmVar.getClass();
        h940Var.getClass();
        n25Var.getClass();
        e8hVar.getClass();
        lq1Var.getClass();
        flsVar.getClass();
        uy0Var.getClass();
        sr10Var.getClass();
        m2lVar.getClass();
        n9kVar.getClass();
        rdd0Var.getClass();
        sdeVar.getClass();
        lyzVar.getClass();
        nkb0Var.getClass();
        qa30Var.getClass();
        mgb0Var.getClass();
        jsonSerializeService.getClass();
        je5Var.getClass();
        sfyVar.getClass();
        jvhVar.getClass();
        psmVar.getClass();
        zruVar.getClass();
        this.d = uqmVar;
        this.e = h940Var;
        this.f = n25Var;
        this.i = e8hVar;
        this.v = lq1Var;
        this.w = flsVar;
        this.y = uy0Var;
        this.z = sr10Var;
        this.A = m2lVar;
        this.B = gipVar;
        this.C = n9kVar;
        this.D = cupVar;
        this.E = rdd0Var;
        this.F = lyzVar;
        this.G = nkb0Var;
        this.H = qa30Var;
        this.I = jsonSerializeService;
        this.J = je5Var;
        this.K = ui7Var;
        this.L = sfyVar;
        this.M = lchVar;
        this.N = w1pVar;
        this.O = w6fVar;
        this.P = jvhVar;
        this.Q = xhh0Var;
        this.R = hkfVar;
        this.S = psmVar;
        this.T = zruVar;
        this.U = hwr.b(new vhm());
        this.V = hwr.b(new whm());
        pu0.b bVar = pu0.b.a;
        vl50 vl50VarF = bm50.f(uy0Var.h(bVar));
        lyh<Account> accountFlow = mgb0Var.getAccountFlow();
        et7 et7VarD = o8i0.d(this);
        kwd0 kwd0Var = q490.a.a;
        v340 v340VarE = e1i.e(accountFlow, et7VarD, kwd0Var, null);
        this.W = v340VarE;
        lyh<Integer> userCertStatusFlow = mgb0Var.getUserCertStatusFlow();
        this.X = userCertStatusFlow;
        lyh<Integer> documentAuditStatusFlow = mgb0Var.getDocumentAuditStatusFlow();
        this.Y = documentAuditStatusFlow;
        lyh<KycHintExtra> kycHintExtraFlow = mgb0Var.getKycHintExtraFlow();
        this.Z = kycHintExtraFlow;
        lyh<Boolean> lyhVarIsShowingBalanceFlow = mgb0Var.isShowingBalanceFlow();
        this.a0 = lyhVarIsShowingBalanceFlow;
        this.b0 = i2i.c(e1i.e(r1i.b(vl50VarF, userCertStatusFlow, lyhVarIsShowingBalanceFlow, v340VarE, new yim(5, null)), o8i0.d(this), kwd0Var, new rbm(null, 0, true)), null, 3);
        this.c0 = i2i.c(r1i.b(v340VarE, userCertStatusFlow, documentAuditStatusFlow, kycHintExtraFlow, new zim(5, null)), null, 3);
        this.d0 = new LinkedHashMap();
        this.e0 = new Subscriber() { // from class: xhm
            @Override // com.sportybet.ntespm.socket.Subscriber
            public final void onReceive(String str) {
                itf0.a aVar = itf0.a;
                aVar.a(yv0.a(aVar, MyLog.TAG_FEATURED_MATCH, "on receive market status message: ", str), new Object[0]);
                SocketMarketMessage socketMarketMessageCreate = SocketMarketMessage.create(str);
                if (socketMarketMessageCreate == null) {
                    return;
                }
                this.a.g0.a(socketMarketMessageCreate);
            }
        };
        this.f0 = new Subscriber() { // from class: yhm
            @Override // com.sportybet.ntespm.socket.Subscriber
            public final void onReceive(String str) {
                itf0.a aVar = itf0.a;
                aVar.a(yv0.a(aVar, MyLog.TAG_FEATURED_MATCH, "on receive event status message: ", str), new Object[0]);
                SocketEventMessage socketEventMessageCreate = SocketEventMessage.create(str);
                if (socketEventMessageCreate == null) {
                    return;
                }
                this.a.i0.a(socketEventMessageCreate);
            }
        };
        pb5 pb5Var = pb5.b;
        b390 b390VarA = d390.a(256, 256, pb5Var);
        this.g0 = b390VarA;
        this.h0 = b390VarA;
        b390 b390VarA2 = d390.a(256, 256, pb5Var);
        this.i0 = b390VarA2;
        this.j0 = b390VarA2;
        lk50.b bVar2 = lk50.b.a;
        this.k0 = xwd0.a(bVar2);
        this.l0 = xwd0.a(bVar2);
        wwd0 wwd0VarA = xwd0.a(null);
        this.m0 = wwd0VarA;
        this.n0 = e1i.b(wwd0VarA);
        vu90<Boolean> vu90Var = new vu90<>();
        this.o0 = vu90Var;
        this.p0 = vu90Var;
        vu90<UIState<List<Event>>> vu90Var2 = new vu90<>();
        this.q0 = vu90Var2;
        this.r0 = vu90Var2;
        vu90<UIState<HighlightData>> vu90Var3 = new vu90<>();
        this.s0 = vu90Var3;
        this.t0 = vu90Var3;
        vu90<UIState<c6g0>> vu90Var4 = new vu90<>();
        this.u0 = vu90Var4;
        this.v0 = vu90Var4;
        vu90<UIState<SportGroup>> vu90Var5 = new vu90<>();
        this.w0 = vu90Var5;
        this.x0 = vu90Var5;
        vu90<tx40> vu90Var6 = new vu90<>();
        this.y0 = vu90Var6;
        this.z0 = vu90Var6;
        this.A0 = new HomeNotification.Show(R.string.wap_home__reached_limits_reminder, R.string.common_functions__more, false, new fjm(0, this, iim.class, "onReachedLimitsNotificationClicked", "onReachedLimitsNotificationClicked()V", 0), null, 16, null);
        this.B0 = i2i.c(new hjm(new xzh(uzh.b(uzh.b(g990Var.a.b())), new ajm(this, pckVar, null)), this), null, 3);
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.H0 = new HashMap<>(o2gVar);
        this.K0 = i2i.c(e1i.e(new yzh(bm50.f(lyzVar.a(pu0.c.a)), new aim(3, null)), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), new AccountInfo(null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, 0, 0, null, false, false, 0L, null, false, false, 0L, -1, 127, null)), null, 3);
        this.L0 = e1i.e(uzh.b(new ijm(bm50.f(lq1Var.a(bVar)))), o8i0.d(this), kwd0Var, Boolean.FALSE);
        this.M0 = new ku90<>();
        ku90<BettingStreakUpgradeHintUiModel> ku90Var = new ku90<>();
        this.N0 = ku90Var;
        this.O0 = e1i.a(ku90Var);
        ku90<Unit> ku90Var2 = new ku90<>();
        this.P0 = ku90Var2;
        this.Q0 = e1i.e(ozh.c(hzh.b(new j8k(ku90Var2, k8kVar, null)), oddVar), o8i0.d(this), kwd0Var, q7q.c.a);
        ej5.c(o8i0.d(this), null, null, new zhm(this, null), 3);
        sdeVar.b();
        if (yo6Var != null) {
            yo6Var.i();
        }
    }

    public final void A1() {
        jvd0 jvd0Var = this.E0;
        if (jvd0Var == null || !jvd0Var.isActive() || jvd0Var.isCompleted()) {
            g1i g1iVar = new g1i(bm50.a(this.e.D()), new e(null));
            pfd pfdVar = fse.a;
            this.E0 = kzh.d(ozh.c(g1iVar, odd.b), o8i0.d(this));
        }
    }

    public final SocketPushManager B1() {
        return (SocketPushManager) this.V.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:107:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:109:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:110:0x0200  */
    /* JADX WARN: Code duplicated, block: B:113:0x0206  */
    /* JADX WARN: Code duplicated, block: B:117:0x020e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0212  */
    /* JADX WARN: Code duplicated, block: B:122:0x0223  */
    /* JADX WARN: Code duplicated, block: B:125:0x0233  */
    /* JADX WARN: Code duplicated, block: B:127:0x023d  */
    /* JADX WARN: Code duplicated, block: B:130:0x024a  */
    /* JADX WARN: Code duplicated, block: B:136:0x0258  */
    /* JADX WARN: Code duplicated, block: B:139:0x026d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0274  */
    /* JADX WARN: Code duplicated, block: B:144:0x0285  */
    /* JADX WARN: Code duplicated, block: B:147:0x028e  */
    /* JADX WARN: Code duplicated, block: B:150:0x0297  */
    /* JADX WARN: Code duplicated, block: B:153:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:156:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:159:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:162:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:165:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:168:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:171:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:173:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:174:0x02df  */
    /* JADX WARN: Code duplicated, block: B:176:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:178:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:179:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:182:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:183:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:211:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:230:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00af A[PHI: r16
      0x00af: PHI (r16v3 java.lang.Object) = (r16v2 java.lang.Object), (r16v5 java.lang.Object) binds: [B:29:0x008e, B:34:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d5 A[PHI: r15
      0x01d5: PHI (r15v6 ??) = (r15v15 ??), (r15v16 ??), (r15v17 ??) binds: [B:76:0x0191, B:89:0x01c1, B:91:0x01cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x01db  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v6, types: [com.sportybet.plugin.realsports.data.Market] */
    /* JADX WARN: Type inference failed for: r15v7, types: [com.sportybet.plugin.realsports.data.Market] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.sportybet.plugin.realsports.data.Market] */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [com.sportybet.plugin.realsports.data.Market] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r29v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v7 */
    public final Object C1(x1b x1bVar, String str, List list) throws Throwable {
        bjm bjmVar;
        BoostResult boostResult;
        ArrayList arrayList;
        BoostResult boostResult2;
        String str2;
        ?? r8;
        boolean z;
        boolean z2;
        boolean z3;
        Iterator it;
        Object next;
        Market pcbbReplacementMarket;
        Object obj;
        boolean z4;
        ?? r27;
        String str3;
        String str4;
        boolean zU;
        ?? r1;
        ArrayList arrayListA;
        Iterator it2;
        List list2;
        String str5;
        Object obj2;
        String strO0;
        String str6;
        boolean zB;
        String str7;
        boolean z5;
        boolean z6;
        Object featuredMatch;
        Sport sport;
        Object obj3;
        List listSplit$default;
        List<Outcome> list3;
        Object next2;
        Market market;
        List list4 = list;
        if (x1bVar instanceof bjm) {
            bjmVar = (bjm) x1bVar;
            int i = bjmVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                bjmVar.i = i - Integer.MIN_VALUE;
            } else {
                bjmVar = new bjm(this, x1bVar);
            }
        } else {
            bjmVar = new bjm(this, x1bVar);
        }
        Object obj4 = bjmVar.e;
        y5b y5bVar = y5b.a;
        int i2 = bjmVar.i;
        BoostResult boostResult3 = null;
        if (i2 == 0) {
            uj50.b(obj4);
            ArrayList arrayList2 = new ArrayList(l48.r(list4, 10));
            int i3 = 0;
            for (Object obj5 : list4) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    ?? r29 = boostResult3;
                    kotlin.collections.b.q();
                    throw r29;
                }
                FeaturedResponse featuredResponse = (FeaturedResponse) obj5;
                String tournamentId = featuredResponse.getTournamentId();
                if (tournamentId == null) {
                    tournamentId = featuredResponse.getSportId();
                }
                boolean z7 = i3 == 0;
                String tournamentName = featuredResponse.getTournamentName();
                if (tournamentName == null) {
                    tournamentName = featuredResponse.getSportName();
                }
                BoostResult boostResult4 = boostResult3;
                String str8 = tournamentName;
                Object tournamentIcon = featuredResponse.getTournamentIcon();
                if (tournamentIcon != null) {
                    r8 = tournamentIcon;
                } else {
                    mfb0 mfb0VarE = ((lfb0) this.U.getValue()).e(featuredResponse.getSportId());
                    tournamentIcon = mfb0VarE != null ? mfb0VarE.a() : boostResult4;
                    if (tournamentIcon == null) {
                        r8 = "";
                    } else {
                        r8 = tournamentIcon;
                    }
                }
                arrayList2.add(new FeaturedTab(tournamentId, str8, r8, z7));
                boostResult3 = boostResult4;
                i3 = i4;
            }
            boostResult = boostResult3;
            E1(true);
            this.g0.h();
            this.i0.h();
            BoostInfo boostInfo = this.C0;
            BoostResult boostResultA = boostInfo != null ? t25.a(boostInfo) : boostResult;
            bjmVar.a = list4;
            bjmVar.b = str;
            bjmVar.c = arrayList2;
            bjmVar.d = boostResultA;
            bjmVar.i = 1;
            w1p w1pVar = this.N;
            w1pVar.getClass();
            Object objK = !Intrinsics.g("sr:sport:1", "sr:sport:1") ? Boolean.FALSE : qq1.k(w1pVar.a, BOConfigParam.DedicatedTeamPageEnabled, w1pVar.b.b().a(), bjmVar);
            if (objK == y5bVar) {
                return y5bVar;
            }
            arrayList = arrayList2;
            obj4 = objK;
            boostResult2 = boostResultA;
            str2 = str;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            BoostResult boostResult5 = bjmVar.d;
            arrayList = bjmVar.c;
            str2 = bjmVar.b;
            List list5 = bjmVar.a;
            uj50.b(obj4);
            boostResult2 = boostResult5;
            list4 = list5;
            boostResult = null;
        }
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            FeaturedResponse featuredResponse2 = (FeaturedResponse) it3.next();
            List<Event> eventVOS = featuredResponse2.getEventVOS();
            ArrayList arrayList4 = new ArrayList();
            for (Event event : eventVOS) {
                String tournamentId2 = featuredResponse2.getTournamentId();
                if (tournamentId2 == null) {
                    tournamentId2 = featuredResponse2.getSportId();
                }
                String str9 = tournamentId2;
                List<Market> list6 = event.markets;
                list6.getClass();
                Iterator it4 = list6.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next = it4.next();
                        Market market2 = (Market) next;
                        z3 = zBooleanValue;
                        if (market2.isFavorite()) {
                            int i5 = market2.status;
                            it = it3;
                            if (i5 == 0 || i5 == 1) {
                                List<Outcome> list7 = market2.outcomes;
                                list7.getClass();
                                if (!list7.isEmpty()) {
                                }
                            }
                        } else {
                            it = it3;
                        }
                        zBooleanValue = z3;
                        it3 = it;
                    } else {
                        z3 = zBooleanValue;
                        it = it3;
                        next = boostResult;
                    }
                }
                Market market3 = (Market) next;
                ?? r15 = market3;
                if (market3 == null) {
                    List<Market> list8 = event.markets;
                    list8.getClass();
                    Iterator it5 = list8.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            next2 = it5.next();
                            Market market4 = (Market) next2;
                            int i6 = market4.status;
                            if (i6 == 0 || i6 == 1) {
                                List<Outcome> list9 = market4.outcomes;
                                list9.getClass();
                                if (!list9.isEmpty()) {
                                }
                            }
                        } else {
                            next2 = boostResult;
                        }
                    }
                    Market market5 = (Market) next2;
                    r15 = market5;
                    if (market5 == null) {
                        List<Market> list10 = event.markets;
                        list10.getClass();
                        market = (Market) CollectionsKt.firstOrNull(list10);
                        if (market == null) {
                            featuredMatch = boostResult;
                        } else {
                            r15 = market;
                            pcbbReplacementMarket = featuredResponse2.getPcbbReplacementMarket();
                            if (pcbbReplacementMarket != null) {
                                list3 = pcbbReplacementMarket.outcomes;
                                list3.getClass();
                                if (list3.isEmpty()) {
                                    obj = pcbbReplacementMarket;
                                    obj = boostResult;
                                }
                            } else {
                                obj = pcbbReplacementMarket;
                                obj = boostResult;
                            }
                            obj = pcbbReplacementMarket;
                            if (u5y.d(r15) || event.status == 0 || obj == null) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (z4) {
                                r15 = obj;
                            }
                            if (z4) {
                                r27 = boostResult;
                            } else {
                                r27 = obj;
                            }
                            str3 = r15.title;
                            str4 = str3;
                            if (str3 == null) {
                                str4 = "";
                            }
                            zU = StringsKt.U(str4);
                            r1 = str4;
                            if (zU) {
                                r1 = boostResult;
                            }
                            if (r1 != 0 || (listSplit$default = StringsKt__StringsKt.split$default(r1, new String[]{","}, false, 0, 6, null)) == null) {
                                List<Outcome> list11 = r15.outcomes;
                                arrayListA = kw5.a(list11);
                                it2 = list11.iterator();
                                while (it2.hasNext()) {
                                    str5 = ((Outcome) it2.next()).desc;
                                    if (str5 != null) {
                                        strO0 = StringsKt.o0(str5, " ");
                                        if (StringsKt.U(strO0)) {
                                            obj2 = strO0;
                                            obj2 = boostResult;
                                        }
                                    } else {
                                        obj2 = strO0;
                                        obj2 = boostResult;
                                    }
                                    if (obj2 != null) {
                                        arrayListA.add(obj2);
                                    }
                                }
                                list2 = arrayListA;
                            } else {
                                list2 = listSplit$default;
                            }
                            str6 = r15.desc;
                            if (str6 == null) {
                                str6 = "";
                            }
                            Pair pairA = ueh.a(str6, r15.specifier);
                            String str10 = (String) pairA.a;
                            String str11 = (String) pairA.b;
                            if (boostResult2 != null) {
                                zB = t25.b(event, boostResult2);
                            } else {
                                zB = false;
                            }
                            str7 = event.sport.id;
                            str7.getClass();
                            switch (str7) {
                                case "sr:sport:1":
                                case "sr:sport:2":
                                case "sr:sport:3":
                                case "sr:sport:4":
                                case "sr:sport:6":
                                case "sr:sport:12":
                                case "sr:sport:16":
                                case "sr:sport:21":
                                case "sr:sport:23":
                                case "sr:sport:29":
                                    z5 = true;
                                    break;
                                default:
                                    z5 = false;
                                    break;
                            }
                            if (z3) {
                                sport = event.sport;
                                if (sport != null) {
                                    obj3 = sport.id;
                                } else {
                                    obj3 = boostResult;
                                }
                                if (Intrinsics.g(obj3, "sr:sport:1")) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                            } else {
                                z6 = false;
                            }
                            featuredMatch = new FeaturedMatch(str9, event, r15, list2, str10, str11, zB, z5, z6, r27);
                        }
                    } else {
                        r15 = market;
                        pcbbReplacementMarket = featuredResponse2.getPcbbReplacementMarket();
                        if (pcbbReplacementMarket != null) {
                            list3 = pcbbReplacementMarket.outcomes;
                            list3.getClass();
                            if (list3.isEmpty()) {
                                obj = pcbbReplacementMarket;
                                obj = boostResult;
                            }
                        } else {
                            obj = pcbbReplacementMarket;
                            obj = boostResult;
                        }
                        obj = pcbbReplacementMarket;
                        if (u5y.d(r15)) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            r15 = obj;
                        }
                        if (z4) {
                            r27 = boostResult;
                        } else {
                            r27 = obj;
                        }
                        str3 = r15.title;
                        str4 = str3;
                        if (str3 == null) {
                            str4 = "";
                        }
                        zU = StringsKt.U(str4);
                        r1 = str4;
                        if (zU) {
                            r1 = boostResult;
                        }
                        if (r1 != 0) {
                            List<Outcome> list12 = r15.outcomes;
                            arrayListA = kw5.a(list12);
                            it2 = list12.iterator();
                            while (it2.hasNext()) {
                                str5 = ((Outcome) it2.next()).desc;
                                if (str5 != null) {
                                    strO0 = StringsKt.o0(str5, " ");
                                    if (StringsKt.U(strO0)) {
                                        obj2 = strO0;
                                        obj2 = boostResult;
                                    }
                                } else {
                                    obj2 = strO0;
                                    obj2 = boostResult;
                                }
                                if (obj2 != null) {
                                    arrayListA.add(obj2);
                                }
                            }
                            list2 = arrayListA;
                        } else {
                            List<Outcome> list13 = r15.outcomes;
                            arrayListA = kw5.a(list13);
                            it2 = list13.iterator();
                            while (it2.hasNext()) {
                                str5 = ((Outcome) it2.next()).desc;
                                if (str5 != null) {
                                    strO0 = StringsKt.o0(str5, " ");
                                    if (StringsKt.U(strO0)) {
                                        obj2 = strO0;
                                        obj2 = boostResult;
                                    }
                                } else {
                                    obj2 = strO0;
                                    obj2 = boostResult;
                                }
                                if (obj2 != null) {
                                    arrayListA.add(obj2);
                                }
                            }
                            list2 = arrayListA;
                        }
                        str6 = r15.desc;
                        if (str6 == null) {
                            str6 = "";
                        }
                        Pair pairA2 = ueh.a(str6, r15.specifier);
                        String str12 = (String) pairA2.a;
                        String str13 = (String) pairA2.b;
                        if (boostResult2 != null) {
                            zB = t25.b(event, boostResult2);
                        } else {
                            zB = false;
                        }
                        str7 = event.sport.id;
                        str7.getClass();
                        switch (str7) {
                            case -715617392:
                                if (!str7.equals("sr:sport:1")) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                break;
                            case -715617391:
                                if (!str7.equals("sr:sport:2")) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                break;
                            case -715617390:
                                if (!str7.equals("sr:sport:3")) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                break;
                            case -715617389:
                                if (!str7.equals("sr:sport:4")) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                break;
                            case -715617387:
                                if (!str7.equals("sr:sport:6")) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                break;
                            case -709302622:
                                if (!str7.equals("sr:sport:12")) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                break;
                            case -709302618:
                                if (!str7.equals("sr:sport:16")) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                break;
                            case -709302592:
                                if (!str7.equals("sr:sport:21")) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                break;
                            case -709302590:
                                if (!str7.equals("sr:sport:23")) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                break;
                            case -709302584:
                                if (!str7.equals("sr:sport:29")) {
                                    z5 = false;
                                } else {
                                    z5 = true;
                                }
                                break;
                            default:
                                z5 = false;
                                break;
                        }
                        if (z3) {
                            z6 = false;
                        } else {
                            sport = event.sport;
                            if (sport != null) {
                                obj3 = sport.id;
                            } else {
                                obj3 = boostResult;
                            }
                            if (Intrinsics.g(obj3, "sr:sport:1")) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        }
                        featuredMatch = new FeaturedMatch(str9, event, r15, list2, str12, str13, zB, z5, z6, r27);
                    }
                } else {
                    r15 = market;
                    pcbbReplacementMarket = featuredResponse2.getPcbbReplacementMarket();
                    if (pcbbReplacementMarket != null) {
                        list3 = pcbbReplacementMarket.outcomes;
                        list3.getClass();
                        if (list3.isEmpty()) {
                            obj = pcbbReplacementMarket;
                            obj = boostResult;
                        }
                    } else {
                        obj = pcbbReplacementMarket;
                        obj = boostResult;
                    }
                    obj = pcbbReplacementMarket;
                    if (u5y.d(r15)) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        r15 = obj;
                    }
                    if (z4) {
                        r27 = boostResult;
                    } else {
                        r27 = obj;
                    }
                    str3 = r15.title;
                    str4 = str3;
                    if (str3 == null) {
                        str4 = "";
                    }
                    zU = StringsKt.U(str4);
                    r1 = str4;
                    if (zU) {
                        r1 = boostResult;
                    }
                    if (r1 != 0) {
                        List<Outcome> list14 = r15.outcomes;
                        arrayListA = kw5.a(list14);
                        it2 = list14.iterator();
                        while (it2.hasNext()) {
                            str5 = ((Outcome) it2.next()).desc;
                            if (str5 != null) {
                                strO0 = StringsKt.o0(str5, " ");
                                if (StringsKt.U(strO0)) {
                                    obj2 = strO0;
                                    obj2 = boostResult;
                                }
                            } else {
                                obj2 = strO0;
                                obj2 = boostResult;
                            }
                            if (obj2 != null) {
                                arrayListA.add(obj2);
                            }
                        }
                        list2 = arrayListA;
                    } else {
                        List<Outcome> list15 = r15.outcomes;
                        arrayListA = kw5.a(list15);
                        it2 = list15.iterator();
                        while (it2.hasNext()) {
                            str5 = ((Outcome) it2.next()).desc;
                            if (str5 != null) {
                                strO0 = StringsKt.o0(str5, " ");
                                if (StringsKt.U(strO0)) {
                                    obj2 = strO0;
                                    obj2 = boostResult;
                                }
                            } else {
                                obj2 = strO0;
                                obj2 = boostResult;
                            }
                            if (obj2 != null) {
                                arrayListA.add(obj2);
                            }
                        }
                        list2 = arrayListA;
                    }
                    str6 = r15.desc;
                    if (str6 == null) {
                        str6 = "";
                    }
                    Pair pairA3 = ueh.a(str6, r15.specifier);
                    String str14 = (String) pairA3.a;
                    String str15 = (String) pairA3.b;
                    if (boostResult2 != null) {
                        zB = t25.b(event, boostResult2);
                    } else {
                        zB = false;
                    }
                    str7 = event.sport.id;
                    str7.getClass();
                    switch (str7) {
                        case -715617392:
                            if (!str7.equals("sr:sport:1")) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            break;
                        case -715617391:
                            if (!str7.equals("sr:sport:2")) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            break;
                        case -715617390:
                            if (!str7.equals("sr:sport:3")) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            break;
                        case -715617389:
                            if (!str7.equals("sr:sport:4")) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            break;
                        case -715617387:
                            if (!str7.equals("sr:sport:6")) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            break;
                        case -709302622:
                            if (!str7.equals("sr:sport:12")) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            break;
                        case -709302618:
                            if (!str7.equals("sr:sport:16")) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            break;
                        case -709302592:
                            if (!str7.equals("sr:sport:21")) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            break;
                        case -709302590:
                            if (!str7.equals("sr:sport:23")) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            break;
                        case -709302584:
                            if (!str7.equals("sr:sport:29")) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            break;
                        default:
                            z5 = false;
                            break;
                    }
                    if (z3) {
                        z6 = false;
                    } else {
                        sport = event.sport;
                        if (sport != null) {
                            obj3 = sport.id;
                        } else {
                            obj3 = boostResult;
                        }
                        if (Intrinsics.g(obj3, "sr:sport:1")) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    featuredMatch = new FeaturedMatch(str9, event, r15, list2, str14, str15, zB, z5, z6, r27);
                }
                if (featuredMatch != null) {
                    r15 = market;
                    arrayList4.add(featuredMatch);
                } else {
                    r15 = market;
                }
                zBooleanValue = z3;
                it3 = it;
            }
            p48.w(arrayList4, arrayList3);
        }
        ArrayList arrayList5 = new ArrayList();
        int size = arrayList3.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj6 = arrayList3.get(i7);
            i7++;
            if (((FeaturedMatch) obj6).getEvent().status <= 2) {
                arrayList5.add(obj6);
            }
        }
        int size2 = arrayList5.size();
        int i8 = 0;
        while (i8 < size2) {
            Object obj7 = arrayList5.get(i8);
            i8++;
            FeaturedMatch featuredMatch2 = (FeaturedMatch) obj7;
            Event event2 = featuredMatch2.getEvent();
            String str16 = featuredMatch2.getMarket().id;
            str16.getClass();
            GroupTopic groupTopic = new GroupTopic(event2.getTopic());
            yhm yhmVar = this.f0;
            LinkedHashMap linkedHashMap = this.d0;
            linkedHashMap.put(groupTopic, yhmVar);
            GroupTopic groupTopic2 = new GroupTopic(event2.getMarketOddsTopic("~", str16));
            xhm xhmVar = this.e0;
            linkedHashMap.put(groupTopic2, xhmVar);
            linkedHashMap.put(new GroupTopic(event2.getMarketStatusTopic("~", str16)), xhmVar);
        }
        ArrayList arrayList6 = new ArrayList(arrayList5);
        if (arrayList6.size() > 1) {
            FeaturedMatch featuredMatch3 = (FeaturedMatch) CollectionsKt.T(arrayList6);
            z = false;
            arrayList6.add(0, (FeaturedMatch) CollectionsKt.b0(arrayList6));
            arrayList6.add(featuredMatch3);
        } else {
            z = false;
        }
        D1();
        if (arrayList.isEmpty() || arrayList6.isEmpty()) {
            z2 = z;
        } else {
            ServerProductStatus serverProductStatus = ServerProductStatusHelper.getServerProductStatus(str2);
            if (serverProductStatus != null ? serverProductStatus.isAllProductInServing() : z) {
                z2 = true;
            } else {
                z2 = z;
            }
        }
        return new FeaturedMatchData(arrayList, arrayList6, z2, this.C0);
    }

    public final void D1() {
        for (Map.Entry entry : kpu.l(this.d0).entrySet()) {
            B1().subscribeTopic((Topic) entry.getKey(), (Subscriber) entry.getValue());
        }
    }

    public final void E1(boolean z) {
        LinkedHashMap linkedHashMap = this.d0;
        for (Map.Entry entry : kpu.l(linkedHashMap).entrySet()) {
            B1().unsubscribeTopic((Topic) entry.getKey(), (Subscriber) entry.getValue());
        }
        if (z) {
            linkedHashMap.clear();
        }
    }

    @Override // defpackage.ihb0, defpackage.j8i0
    public final void onCleared() {
        super.onCleared();
        this.H0.clear();
    }

    public final void z1(boolean z) {
        jvd0 jvd0Var = this.D0;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.k0.setValue(lk50.b.a);
        this.D0 = kzh.d(new yzh(new g1i(new a(new s78(this.f.a(z), this.e.F(), new b(null)), this), new c(null)), new d(null)), o8i0.d(this));
    }
}
