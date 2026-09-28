package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.protobuf.Reader;
import com.sporty.android.book.domain.entity.UIState;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.common_ui.widgets.AspectRatioImageView;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.ads.RealSportsAds;
import com.sporty.android.core.model.ads.RealSportsAdsData;
import com.sporty.android.core.model.appupdate.VersionCheckResults;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sporty.android.core.model.bet.edit.EditBetDlgType;
import com.sporty.android.core.model.bet.edit.ErrorDataInfo;
import com.sporty.android.core.model.cms.CMSLanguage;
import com.sporty.android.core.model.common.DataHolder;
import com.sporty.android.core.model.common.DataHolderUtils;
import com.sporty.android.core.model.config.BroadcastConfig;
import com.sporty.android.core.model.patron.KYCReminder;
import com.sporty.android.core.model.patron.KycSource;
import com.sporty.android.core.model.patron.UserCertStatusRules;
import com.sporty.android.core.model.pay.security.NameUpdateStatus;
import com.sporty.android.core.model.pay.security.NameUpdateStatusMapperKt;
import com.sporty.android.core.model.realsports.EarlyPayoutConfig;
import com.sporty.android.core.model.realsports.EarlyPayoutMarketMapping;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.core.model.welcomereward.BalanceButtonPage;
import com.sporty.android.platform.features.account.register.presentation.RegistrationSuccessfulActivity;
import com.sporty.android.platform.features.homeshortcut.HomeShortcutRowComposeView;
import com.sporty.android.platform.features.welcomereward.presentation.WelcomeRewardActivity;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.home.MainActivity;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import com.sportybet.android.multimaker.domain.model.MultiMakerItem;
import com.sportybet.android.multimaker.presentation.activity.MultiMakerActivity;
import com.sportybet.android.payment.security.nameupdate.presentation.activity.NameUpdateWebViewActivity;
import com.sportybet.android.router.Sender;
import com.sportybet.android.user.kyc.KYCActivity;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.ErrorView;
import com.sportybet.android.widget.OUEarlyGoalsSwitch;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.core.injection.opentelemetry.PageMeta;
import com.sportybet.core.segmentation.HomeSegment;
import com.sportybet.feature.kyc.nin.NINReVerifyActivity;
import com.sportybet.feature.loyalty.impl.bettingstreak.presentation.model.BettingStreakUpgradeHintUiModel;
import com.sportybet.feature.loyalty.impl.welcomereward.WelcomeRewardBottomSheetActivity;
import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.ISocketPushManager;
import com.sportybet.ntespm.socket.SocketPushManager;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.ntespm.socket.Topic;
import com.sportybet.ntespm.socket.TopicInfoKt;
import com.sportybet.ntespm.socket.TopicType;
import com.sportybet.plugin.jackpot.widget.EllipsizingTextView;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import com.sportybet.plugin.realsports.data.Categories;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.FeaturedDisplayData;
import com.sportybet.plugin.realsports.data.HighlightData;
import com.sportybet.plugin.realsports.data.HomeNotification;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.OrderedSportItem;
import com.sportybet.plugin.realsports.data.OrderedSportItemHelper;
import com.sportybet.plugin.realsports.data.QuickMarketHelper;
import com.sportybet.plugin.realsports.data.QuickMarketSpotEnum;
import com.sportybet.plugin.realsports.data.ServerProductStatus;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.SportGroup;
import com.sportybet.plugin.realsports.data.Tournaments;
import com.sportybet.plugin.realsports.data.promotion.PromotionDataStoreImpl;
import com.sportybet.plugin.realsports.home.KycRejectBottomSheetActivity;
import com.sportybet.plugin.realsports.home.KycVerificationInProgressBottomSheetActivity;
import com.sportybet.plugin.realsports.home.LivePanel;
import com.sportybet.plugin.realsports.home.featuredsection.FeaturedContainer;
import com.sportybet.plugin.realsports.promotion.GetGiftsPanel;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportybet.plugin.realsports.widget.MarqueeView;
import com.sportybet.plugin.realsports.widget.MidBroadcastPanel;
import com.sportybet.plugin.realsports.widget.OddsFilterSettingView;
import com.sportybet.plugin.realsports.widget.PanImageContainer;
import com.sportybet.plugin.worldcuptournament.ui.WorldCupPanelComposeViewWrapper;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.Collator;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class dfm extends zrl implements SwipeRefreshLayout.f, View.OnClickListener, tit, i8, wym, qbm, FeaturedContainer.b {
    public static final List<String> v2;
    public static final List<String> w2;
    public String A0;
    public tgm A1;
    public n0z B1;
    public TextView C0;
    public ohm C1;
    public jmr D;
    public FrameLayout D0;
    public oku D1;
    public uqm E;
    public ConstraintLayout E0;
    public com.sportybet.android.instantwin.presentation.buildandgo.f E1;
    public psm F;
    public TextView F0;
    public hby F1;
    public y1k0 G;
    public TextView G0;
    public w4j0 G1;
    public rdd0 H;
    public ImageView H0;
    public hzz H1;
    public chk I;
    public f320 I0;
    public FrameLayout I1;
    public y8j J;
    public AspectRatioImageView J0;
    public ImageView J1;
    public vsm K;
    public ViewStub K0;
    public TextView K1;
    public lq1 L;
    public ComposeView L0;
    public LinearLayout L1;
    public gbn M;
    public WorldCupPanelComposeViewWrapper M0;
    public yec M1;
    public azm N;
    public ComposeView N0;
    public OddsFilterSettingView N1;
    public jlo O;
    public boolean O0;
    public BigDecimal O1;
    public xxz P;
    public EllipsizingTextView P0;
    public BigDecimal P1;
    public uy0 Q;
    public LinearLayout Q0;
    public CheckedTextView Q1;
    public iym R;
    public MidBroadcastPanel R0;
    public ImageView R1;
    public PromotionDataStoreImpl S;
    public int S0;
    public final h S1;
    public com.sporty.android.common.uievent.e T;
    public RecyclerView T0;
    public hk80 T1;
    public xz80 U;
    public k0e0 U0;
    public yec U1;
    public kkh0 V;
    public bzf0 V0;
    public FeaturedContainer V1;
    public k650 W;
    public kkl W0;
    public y1i0 W1;
    public muh X;
    public sn20 X1;
    public s1p Y;
    public a7b Y0;
    public sz70 Y1;
    public a8z Z;
    public androidx.recyclerview.widget.f Z0;
    public ruy Z1;
    public hkf a0;
    public androidx.recyclerview.widget.f a1;
    public ity a2;
    public tta b0;
    public androidx.recyclerview.widget.f b1;
    public bsy b2;
    public lsp c0;
    public TabLayout c1;
    public ijf c2;
    public ou1 d0;
    public TabLayout d1;
    public xlc d2;
    public xhh0 e0;
    public TabLayout e1;
    public final ncm e2;
    public zhh0 f0;
    public boolean f1;
    public nns f2;
    public sty g0;
    public boolean g1;
    public cky g2;
    public jty h0;
    public RealSportsAds h1;
    public tch h2;
    public ee<fqk> i0;
    public ConsecutiveScrollerLayout i1;
    public boolean i2;
    public SwipeRefreshLayout j0;
    public ConstraintLayout j1;
    public nnf j2;
    public TextView k0;
    public BubbleView k1;
    public ComposeView k2;
    public OneUpTwoUpSwitch l1;
    public Boolean l2;
    public TextView m0;
    public OUEarlyGoalsSwitch m1;
    public long m2;
    public View n0;
    public View n1;
    public final HashMap n2;
    public View o0;
    public BubbleView o1;
    public final i o2;
    public ImageView p0;
    public OneUpTwoUpSwitch p1;
    public final j p2;
    public LivePanel q0;
    public OUEarlyGoalsSwitch q1;
    public final k q2;
    public TextView r0;
    public View r1;
    public ViewTreeObserver r2;
    public GetGiftsPanel s0;
    public BubbleView s1;
    public final l s2;
    public PanImageContainer t0;
    public final b t2;
    public final c u2;
    public ImageView v0;
    public of20 v1;
    public RecyclerView w0;
    public iim w1;
    public View x0;
    public com.sportybet.feature.luckynumber.featurematch.presentation.k x1;
    public su5<BaseResponse<RealSportsAdsData>> y0;
    public e320 y1;
    public String z0;
    public ov6 z1;
    public final ArrayList<String> i = new ArrayList<>();
    public final Object v = new Object();
    public final QuickMarketSpotEnum w = QuickMarketSpotEnum.MAIN_PAGE_PRE_MATCH;
    public final ArrayList y = new ArrayList();
    public final Rect z = new Rect();
    public final GroupTopic A = new GroupTopic(TopicInfoKt.generateTopicString(TopicType.BET_STATUS, new ccm()));
    public final HashSet<String> B = new HashSet<>();
    public final mo0 C = l840.a();
    public zsp l0 = new zsp();
    public final f u0 = new f();
    public boolean B0 = true;
    public final g X0 = new g();
    public mfb0 t1 = lfb0.d().e("sr:sport:1");
    public int u1 = -1;

    /* JADX INFO: loaded from: classes7.dex */
    public class a implements lfy<pgm> {
        public List<BroadcastConfig.Info> a;

        public a() {
        }

        @Override // defpackage.lfy
        public final void u1(pgm pgmVar) {
            pgm pgmVar2 = pgmVar;
            int i = pgmVar2.a;
            List<BroadcastConfig.Info> list = pgmVar2.b;
            dfm dfmVar = dfm.this;
            if (i == 1) {
                this.a = list;
                dfmVar.V0.p(list);
                dfmVar.W0.p(list);
                dfmVar.Y0.j(list);
                return;
            }
            if (i == 2) {
                dfmVar.V0.p(null);
                dfmVar.W0.p(null);
                dfmVar.Y0.j(null);
            } else {
                if (i != 3) {
                    return;
                }
                dfmVar.V0.p(this.a);
                dfmVar.W0.p(this.a);
                dfmVar.Y0.j(this.a);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public class b implements asy {
        public b() {
        }

        @Override // defpackage.asy
        public final void a() {
            dfm.this.b2.D1(wuy.a, uuy.a);
        }

        @Override // defpackage.asy
        public final void b() {
            List<String> list = dfm.v2;
            dfm.this.F0();
        }

        @Override // defpackage.asy
        public final boolean c() {
            dfm dfmVar = dfm.this;
            sn20 sn20Var = dfmVar.X1;
            sn20Var.getClass();
            boolean zA = sn20Var.a.a("dc_one_up_switch_hint_displayed");
            sn20 sn20Var2 = dfmVar.X1;
            sn20Var2.getClass();
            return (zA || !sn20Var2.a.a("market_early_goals_switch_hint_displayed") || (dfmVar.s1.getVisibility() != 8)) ? false : true;
        }

        @Override // defpackage.asy
        public final void d(OneUpTwoUpSwitch.f fVar) {
            dfm dfmVar = dfm.this;
            dfmVar.p1.setState(fVar, false);
            dfmVar.b2.C1(wuy.a, uuy.a, vuy.b(hih0.g(fVar)));
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public class c implements tay {
        public c() {
        }

        @Override // defpackage.tay
        public final void a() {
            dfm dfmVar = dfm.this;
            dfmVar.c2.C1(lkf.a, zjf.a, dfmVar.m1.c() ? pkf.a : pkf.b);
        }

        @Override // defpackage.tay
        public final void b() {
            List<String> list = dfm.v2;
            dfm.this.F0();
        }

        @Override // defpackage.tay
        public final boolean c() {
            dfm dfmVar = dfm.this;
            sn20 sn20Var = dfmVar.X1;
            sn20Var.getClass();
            return (sn20Var.a.a("market_early_goals_switch_hint_displayed") || (dfmVar.s1.getVisibility() != 8)) ? false : true;
        }

        @Override // defpackage.tay
        public final void onStateChanged(boolean z) {
            dfm dfmVar = dfm.this;
            dfmVar.q1.setState(z, false, false);
            dfmVar.c2.B1(lkf.a, zjf.a, z ? pkf.a : pkf.b);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public class d implements gv5<BaseResponse<KYCReminder>> {
        public final /* synthetic */ ComposeView a;

        public d(ComposeView composeView) {
            this.a = composeView;
        }

        @Override // defpackage.gv5
        public final void onFailure(su5<BaseResponse<KYCReminder>> su5Var, Throwable th) {
            ConstraintLayout constraintLayout;
            dfm dfmVar = dfm.this;
            if (dfmVar.isResumed() || (constraintLayout = dfmVar.E0) == null) {
                return;
            }
            constraintLayout.setVisibility(8);
        }

        @Override // defpackage.gv5
        public final void onResponse(su5<BaseResponse<KYCReminder>> su5Var, bi50<BaseResponse<KYCReminder>> bi50Var) {
            BaseResponse<KYCReminder> baseResponse;
            Integer numValueOf;
            int i;
            dfm dfmVar = dfm.this;
            if (dfmVar.isResumed() && bi50Var.a.getIsSuccessful() && (baseResponse = bi50Var.b) != null && baseResponse.isSuccessful() && baseResponse.data.getShowWarning()) {
                final KYCReminder kYCReminder = baseResponse.data;
                iim iimVar = dfmVar.w1;
                iimVar.getClass();
                kYCReminder.getClass();
                ej5.c(o8i0.d(iimVar), null, null, new xim(iimVar, kYCReminder, null), 3);
                iim iimVar2 = dfmVar.w1;
                Context contextRequireContext = dfmVar.requireContext();
                iimVar2.getClass();
                contextRequireContext.getClass();
                int i2 = 0;
                boolean z = contextRequireContext.getSharedPreferences("kyc_reminder", 0).getBoolean(iimVar2.D.a(kYCReminder), false);
                ComposeView composeView = this.a;
                if (z) {
                    dfmVar.E0.setVisibility(8);
                    composeView.setVisibility(8);
                    return;
                }
                dfmVar.H0.setOnClickListener(new kfm(i2, this, kYCReminder));
                dfmVar.G0.setText(sn5.d(dfmVar, R.string.common_functions__verify, new Object[0]));
                dfmVar.G0.setOnClickListener(new View.OnClickListener() { // from class: nfm
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        yrh0.t(dfm.this.requireContext(), KYCActivity.class, true);
                    }
                });
                boolean z2 = true;
                switch (e.b[kYCReminder.getReminder().ordinal()]) {
                    case 1:
                        TextView textView = dfmVar.F0;
                        textView.setText(sn5.c(textView, R.string.wap_home__kyc_reminder_01, new Object[0]));
                        break;
                    case 2:
                        TextView textView2 = dfmVar.F0;
                        textView2.setText(sn5.c(textView2, R.string.wap_home__kyc_reminder_02, new Object[0]));
                        break;
                    case 3:
                        TextView textView3 = dfmVar.F0;
                        textView3.setText(sn5.c(textView3, R.string.wap_home__kyc_reminder_03, new Object[0]));
                        break;
                    case 4:
                        TextView textView4 = dfmVar.F0;
                        textView4.setText(sn5.c(textView4, R.string.wap_home__kyc_reminder_04, new Object[0]));
                        break;
                    case 5:
                        TextView textView5 = dfmVar.F0;
                        textView5.setText(sn5.c(textView5, R.string.wap_home__kyc_reminder_05, new Object[0]));
                        dfmVar.G0.setText(sn5.d(dfmVar, R.string.common_functions__deposit, new Object[0]));
                        dfmVar.G0.setOnClickListener(new ofm());
                        break;
                    case 6:
                        TextView textView6 = dfmVar.F0;
                        textView6.setText(sn5.c(textView6, R.string.wap_home__kyc_reminder_06, new Object[0]));
                        dfmVar.G0.setText(sn5.d(dfmVar, R.string.common_functions__deposit, new Object[0]));
                        dfmVar.G0.setOnClickListener(new pfm());
                        break;
                    case 7:
                        x9m x9mVar = x9m.a.d;
                        int i3 = e.a[kYCReminder.getVerificationStatus().ordinal()];
                        if (i3 != 1) {
                            if (i3 == 2) {
                                x9mVar = x9m.b.d;
                                numValueOf = Integer.valueOf(R.string.identity_verification__resubmit);
                                i = R.string.wap_home__kyc_reminder_07_02__ZA;
                            } else if (i3 != 3) {
                                i = R.string.wap_home__kyc_reminder_07_04__ZA;
                                if (i3 == 4) {
                                    numValueOf = Integer.valueOf(R.string.common_functions__check);
                                } else if (i3 != 5) {
                                    numValueOf = null;
                                } else {
                                    numValueOf = Integer.valueOf(R.string.wap_home__set_up_now);
                                    i = R.string.wap_home__kyc_reminder_07_05__ZA;
                                }
                            } else {
                                numValueOf = Integer.valueOf(R.string.common_functions__verify);
                                i = R.string.wap_home__kyc_reminder_07_03__ZA;
                            }
                            z2 = false;
                        } else {
                            numValueOf = Integer.valueOf(R.string.common_functions__deposit);
                            i = R.string.wap_home__kyc_reminder_07_01__ZA;
                        }
                        String strD = numValueOf != null ? sn5.d(dfmVar, numValueOf.intValue(), new Object[0]) : null;
                        wbk0.a(composeView, x9mVar, sn5.d(dfmVar, i, new Object[0]), strD, strD != null ? z2 ? new Function0() { // from class: qfm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                dfm.this.N.d(wae.DEPOSIT);
                                return Unit.a;
                            }
                        } : new rfm(this, i2) : null);
                        return;
                    case 8:
                        wbk0.a(composeView, x9m.a.d, sn5.d(dfmVar, R.string.wap_home__kyc_reminder_08__ZA, new Object[0]), sn5.d(dfmVar, R.string.common_functions__deposit, new Object[0]), new Function0() { // from class: sfm
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                dfm.this.N.d(wae.DEPOSIT);
                                return Unit.a;
                            }
                        });
                        return;
                    case 9:
                        KYCReminder.Details details = kYCReminder.getDetails();
                        Objects.requireNonNull(details);
                        String bankName = details.getBankName();
                        final KYCReminder.VerificationStatus verificationStatus = kYCReminder.getVerificationStatus();
                        int[] iArr = e.a;
                        int i4 = iArr[verificationStatus.ordinal()];
                        String strD2 = "";
                        String strD3 = i4 != 1 ? i4 != 2 ? "" : sn5.d(dfmVar, R.string.wap_home__vbank_account_verification_failed, bankName) : sn5.d(dfmVar, R.string.wap_home__vbank_account_is_verified, bankName);
                        int i5 = iArr[verificationStatus.ordinal()];
                        if (i5 == 1) {
                            strD2 = sn5.d(dfmVar, R.string.common_functions__withdraw, new Object[0]);
                        } else if (i5 == 2) {
                            strD2 = sn5.d(dfmVar, R.string.common_functions__view, new Object[0]);
                        }
                        dfmVar.F0.setText(strD3);
                        dfmVar.G0.setText(strD2);
                        final Bundle bundle = new Bundle();
                        c100 c100Var = c100.e;
                        bundle.putInt("withdrawChannelId", 26003);
                        dfmVar.G0.setOnClickListener(new View.OnClickListener() { // from class: tfm
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                final KYCReminder kYCReminder2 = kYCReminder;
                                KYCReminder.Details details2 = kYCReminder2.getDetails();
                                final dfm.d dVar = this.a;
                                dfm dfmVar2 = dfm.this;
                                iim iimVar3 = dfmVar2.w1;
                                Context contextRequireContext2 = dfmVar2.requireContext();
                                iimVar3.getClass();
                                contextRequireContext2.getClass();
                                cup cupVar = iimVar3.D;
                                cupVar.getClass();
                                vn20.f(contextRequireContext2, "kyc_reminder", cupVar.a(kYCReminder2), true, true);
                                int i6 = dfm.e.a[verificationStatus.ordinal()];
                                if (i6 == 1) {
                                    sh8.c().c(o7d.a(wae.WITHDRAW), bundle);
                                } else {
                                    if (i6 != 2) {
                                        return;
                                    }
                                    js.a(dfmVar2.requireContext(), sn5.d(dfmVar2, R.string.common_feedback__verification_failed, new Object[0]), sn5.d(dfmVar2, R.string.identity_verification__vbank_vaccount_verification_failed_content_by_vreason, details2.getBankName(), details2.getBankAccountNumber(), kYCReminder2.getRejectReason()), true, sn5.d(dfmVar2, R.string.identity_verification__resubmit, new Object[0]), sn5.d(dfmVar2, R.string.common_functions__cancel, new Object[0]), new Function0() { // from class: lfm
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            dfm dfmVar3 = dfm.this;
                                            yrh0.s(dfmVar3.requireActivity(), KYCActivity.E.newInstanceForBankAccountVerification(dfmVar3.requireActivity(), kYCReminder2.getDetails().getAssetId()), true);
                                            return Unit.a;
                                        }
                                    }, new mfm());
                                }
                            }
                        });
                        break;
                    case 10:
                        int i6 = e.a[kYCReminder.getVerificationStatus().ordinal()];
                        if (i6 == 1) {
                            dfmVar.F0.setText(sn5.d(dfmVar, R.string.wap_home__kyc_reminder_10_20, new Object[0]));
                            dfmVar.G0.setText(sn5.d(dfmVar, R.string.common_functions__deposit, new Object[0]));
                            dfmVar.G0.setOnClickListener(new ufm());
                        } else if (i6 != 3) {
                            dfmVar.E0.setVisibility(8);
                            return;
                        } else {
                            dfmVar.F0.setText(sn5.d(dfmVar, R.string.wap_home__kyc_reminder_10_40, new Object[0]));
                            dfmVar.G0.setText(sn5.d(dfmVar, R.string.gift__claim, new Object[0]));
                            dfmVar.G0.setOnClickListener(new vfm());
                        }
                        break;
                    default:
                        dfmVar.E0.setVisibility(8);
                        return;
                }
                dfmVar.E0.setVisibility(0);
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static /* synthetic */ class e {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[e8z.values().length];
            c = iArr;
            try {
                e8z e8zVar = e8z.a;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = c;
                e8z e8zVar2 = e8z.a;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = c;
                e8z e8zVar3 = e8z.a;
                iArr3[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = c;
                e8z e8zVar4 = e8z.a;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr5 = new int[KYCReminder.Reminder.values().length];
            b = iArr5;
            try {
                iArr5[KYCReminder.Reminder.FIRST_USE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[KYCReminder.Reminder.VERIFICATION_FAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[KYCReminder.Reminder.USER_TIER_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[KYCReminder.Reminder.DEPOSIT_PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[KYCReminder.Reminder.FREE_GIFT_PIX.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[KYCReminder.Reminder.FIRST_DEPOSIT_PIX.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[KYCReminder.Reminder.SOUTH_AFRICA_IDENTITY_VERIFICATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[KYCReminder.Reminder.SOUTH_AFRICA_FIRST_DEPOSIT.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[KYCReminder.Reminder.SOUTH_AFRICA_BANK_ACCOUNT_VERIFICATION.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[KYCReminder.Reminder.MX_PROMOTION.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr6 = new int[KYCReminder.VerificationStatus.values().length];
            a = iArr6;
            try {
                iArr6[KYCReminder.VerificationStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[KYCReminder.VerificationStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[KYCReminder.VerificationStatus.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[KYCReminder.VerificationStatus.UNDER_REVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[KYCReminder.VerificationStatus.PENDING_DATA.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[KYCReminder.VerificationStatus.WHO_YOU_VERIFICATION_PENDING.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PanImageContainer panImageContainer = dfm.this.t0;
            if (panImageContainer != null) {
                panImageContainer.setAlpha(1.0f);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public class g implements Subscriber {
        public g() {
        }

        @Override // com.sportybet.ntespm.socket.Subscriber
        public final void onReceive(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i = jSONObject.getInt("eventStatus");
                final String str2 = jSONObject.getString("topic").split("\\^")[3];
                if (i != 1 || dfm.this.B.contains(str2)) {
                    return;
                }
                dfm.this.B.add(str2);
                kkl kklVar = dfm.this.W0;
                if (kklVar != null) {
                    synchronized (kklVar.c) {
                        kklVar.c.removeIf(new Predicate() { // from class: jkl
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                jpc jpcVar = (jpc) obj;
                                if (jpcVar instanceof ing) {
                                    return TextUtils.equals(str2, ((ing) jpcVar).a.eventId);
                                }
                                return false;
                            }
                        });
                        kklVar.i();
                    }
                }
                bzf0 bzf0Var = dfm.this.V0;
                if (bzf0Var != null) {
                    synchronized (bzf0Var.c) {
                        bzf0Var.c.removeIf(new Predicate() { // from class: azf0
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj) {
                                return TextUtils.equals(str2, ((Event) obj).eventId);
                            }
                        });
                        bzf0Var.i();
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CheckedTextView checkedTextView = dfm.this.Q1;
            if (checkedTextView != null) {
                checkedTextView.setChecked(false);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public class l implements ViewTreeObserver.OnPreDrawListener {

        public class a implements lfy<HomeSegment> {
            public a() {
            }

            @Override // defpackage.lfy
            public final void u1(HomeSegment homeSegment) {
                dfm.this.V1.setSwitchToGamesTabWhenReady(homeSegment == HomeSegment.SportsDominant);
            }
        }

        public l() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            List<String> list = dfm.v2;
            dfm dfmVar = dfm.this;
            ViewTreeObserver viewTreeObserver = dfmVar.r2;
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                dfmVar.r2.removeOnPreDrawListener(dfmVar.s2);
            }
            ibs ibsVarD = dfmVar.getViewLifecycleOwnerLiveData().d();
            if (ibsVarD == null) {
                return true;
            }
            dfmVar.D1.r0.f(ibsVarD, new a());
            return true;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public class m extends OneUpTwoUpSwitch.d {
        public m() {
        }

        @Override // com.sportybet.android.widget.OneUpTwoUpSwitch.d
        public final void d(OneUpTwoUpSwitch.f fVar) {
            DataHolder<RegularMarketRule> dataHolderW0;
            List<String> list = dfm.v2;
            dfm dfmVar = dfm.this;
            if (!rvi.b(dfmVar) && (dataHolderW0 = dfmVar.w0()) != null) {
                RegularMarketRule primary = dataHolderW0.getPrimary();
                RegularMarketRule current = dataHolderW0.getCurrent();
                avy avyVarG = hih0.g(fVar);
                mfb0 mfb0Var = dfmVar.t1;
                RegularMarketRule regularMarketRuleB = (mfb0Var == null || current == null) ? false : dfmVar.e0.f(mfb0Var.getId(), current.a, false) ? dfmVar.e0.b(avyVarG, current, dfmVar.t1.getId(), false) : current;
                if (regularMarketRuleB != null) {
                    dfmVar.V0.m(regularMarketRuleB, dfmVar.t1.getId(), false);
                    dfmVar.W0.m(regularMarketRuleB, false);
                    TabLayout.g gVarY0 = dfmVar.y0();
                    if (gVarY0 != null && primary != null) {
                        gVarY0.a = new DataHolder(primary, regularMarketRuleB);
                    }
                    if (wlc.a(dfmVar.e0.c(current, dfmVar.t1.getId(), false))) {
                        xlc xlcVar = dfmVar.d2;
                        lkf lkfVar = lkf.a;
                        zjf zjfVar = zjf.a;
                        xlcVar.x1(lkfVar, avyVarG == avy.a ? pkf.a : pkf.b);
                    } else {
                        dfmVar.b2.C1(wuy.a, uuy.b, vuy.b(avyVarG));
                    }
                }
            }
            dfmVar.l1.setState(fVar, false);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public class n implements PopupWindow.OnDismissListener {
        public n() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            List<String> list = dfm.v2;
            dfm.this.Q0();
        }
    }

    static {
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{"sr:sport:1"}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        v2 = Collections.unmodifiableList(arrayList);
        w2 = Arrays.asList("code-hub", "swipeBet", "multi_maker", "sportybet://betslip");
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [ncm] */
    public dfm() {
        BigDecimal bigDecimal = BigDecimal.ZERO;
        this.O1 = bigDecimal;
        this.P1 = bigDecimal;
        this.S1 = new h();
        this.e2 = new g8z() { // from class: ncm
            @Override // defpackage.g8z
            public final void a(Selection selection, boolean z, e8z e8zVar) {
                gty gtyVar;
                brg brgVar;
                String str;
                List<String> list = dfm.v2;
                dfm dfmVar = this.a;
                RegularMarketRule regularMarketRuleT0 = dfmVar.t1 == null ? null : dfmVar.t0();
                xhh0 xhh0Var = dfmVar.e0;
                mfb0 mfb0Var = dfmVar.t1;
                whh0 whh0VarC = xhh0Var.c(regularMarketRuleT0, mfb0Var != null ? mfb0Var.getId() : null, false);
                dfmVar.f0.getClass();
                boolean z2 = zhh0.a(whh0VarC).b == avy.a;
                switch (e8zVar.ordinal()) {
                    case 0:
                    case 1:
                        gtyVar = gty.a;
                        break;
                    case 2:
                    case 3:
                    case 4:
                        gtyVar = gty.f;
                        break;
                    case 5:
                        gtyVar = gty.e;
                        break;
                    case 6:
                        gtyVar = gty.d;
                        break;
                    case 7:
                        gtyVar = gty.b;
                        break;
                    default:
                        uhc.a();
                        return;
                }
                gty gtyVar2 = gtyVar;
                sty styVar = dfmVar.g0;
                ity ityVar = dfmVar.a2;
                Event event = selection.a;
                Market market = selection.b;
                ityVar.getClass();
                nty ntyVarA = ityVar.b.a(gtyVar2, event, regularMarketRuleT0);
                ntyVarA.getClass();
                styVar.getClass();
                styVar.b(new sty.b.C1102b(new yty(selection, z, gtyVar2, z2, ntyVarA, styVar.c.b()), true));
                dfmVar.b2.G1(selection, z, e8zVar);
                if (z && (e8zVar == e8z.a || e8zVar == e8z.b || e8zVar == e8z.c || e8zVar == e8z.d)) {
                    int iOrdinal = e8zVar.ordinal();
                    if (iOrdinal == 0 || iOrdinal == 1) {
                        str = AnalyticsEvent.HOME_PREMATCH_ADD_TO_BETSLIP;
                    } else if (iOrdinal != 2) {
                        str = iOrdinal != 3 ? "" : AnalyticsEvent.HOME_FEATURED_MATCH_ADD_TO_BETSLIP;
                    } else {
                        str = AnalyticsEvent.HOME_LIVE_ADD_TO_BETSLIP;
                    }
                    iym iymVar = dfmVar.R;
                    PageMeta.INSTANCE.getClass();
                    iymVar.f(str, PageMeta.Companion.b());
                }
                if (!iu2.m() || event.isVirtualSoccer()) {
                    return;
                }
                String strB = apg.b(event, market);
                if (!z) {
                    gym.a(dfmVar.R, new nt3(strB));
                    return;
                }
                boolean zA = dfmVar.Y.a(event.eventId, market.status, selection.c);
                int iOrdinal2 = e8zVar.ordinal();
                if (iOrdinal2 == 1) {
                    brgVar = brg.HIGHLIGHTS;
                } else if (iOrdinal2 != 2) {
                    brgVar = iOrdinal2 != 3 ? brg.TODAY : brg.FEATURED_MATCH;
                } else {
                    brgVar = brg.LIVE_PANEL;
                }
                gym.a(dfmVar.R, new y7z(brgVar, strB, zA));
            }
        };
        this.i2 = false;
        this.l2 = Boolean.FALSE;
        this.n2 = new HashMap();
        this.o2 = new i();
        this.p2 = new j();
        this.q2 = new k();
        this.s2 = new l();
        this.t2 = new b();
        this.u2 = new c();
    }

    public final void C0() {
        ComposeView composeView = this.k2;
        if (composeView != null) {
            this.D0.removeView(composeView);
        }
        if (iu2.k()) {
            ComposeView composeView2 = new ComposeView(requireContext(), null, 0);
            this.k2 = composeView2;
            nnf nnfVar = new nnf(composeView2);
            this.j2 = nnfVar;
            nnfVar.c = new tdm();
            this.D0.addView(this.k2);
        }
    }

    public final boolean D0() {
        if (this.R0.getVisibility() == 0) {
            float y = this.R0.getY();
            int height = this.R0.getHeight();
            int scrollY = this.i1.getScrollY();
            if (height > 0) {
                float f2 = scrollY;
                if (f2 >= y && f2 <= y + height) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int E0(int i2) {
        return !v2.contains(this.t1.getId()) ? i2 + 1 : i2;
    }

    public final void F0() {
        jqu jquVarB = lqu.b(this.o1.getVisibility() != 8 ? this.o1 : this.s1);
        sn20 sn20Var = this.X1;
        String str = jquVarB == jqu.b ? "dc_one_up_switch_hint_displayed" : "market_early_goals_switch_hint_displayed";
        sn20Var.getClass();
        sn20Var.a.b(str);
        this.o1.setVisibility(8);
        this.s1.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void H0() {
        this.d1.n();
        TabLayout tabLayout = this.d1;
        j jVar = this.p2;
        tabLayout.o(jVar);
        String id = this.t1.getId();
        List<String> list = v2;
        if (list.contains(id)) {
            TabLayout tabLayout2 = this.d1;
            TabLayout.g gVarL = tabLayout2.l();
            gVarL.e(sn5.d(this, R.string.wap_home__highlights, new Object[0]));
            tabLayout2.b(gVarL);
        }
        TabLayout tabLayout3 = this.d1;
        TabLayout.g gVarL2 = tabLayout3.l();
        gVarL2.e(sn5.d(this, R.string.wap_home__today, new Object[0]));
        tabLayout3.d(gVarL2, true);
        TabLayout tabLayout4 = this.d1;
        TabLayout.g gVarL3 = tabLayout4.l();
        gVarL3.e(sn5.d(this, R.string.wap_home__countries, new Object[0]));
        tabLayout4.b(gVarL3);
        this.d1.a(jVar);
        int i2 = this.u1;
        int iContains = i2;
        if (i2 <= -1) {
            iContains = list.contains(this.t1.getId());
        }
        this.d1.k(iContains).b();
    }

    public final void I0() {
        int iE0 = E0(this.d1.getSelectedTabPosition());
        if (iE0 == 0) {
            n0(this.W0);
            RecyclerView.f adapter = this.T0.getAdapter();
            androidx.recyclerview.widget.f fVar = this.a1;
            if (adapter != fVar) {
                this.T0.setAdapter(fVar);
            }
            this.W0.m(t0(), true);
            this.f1 = false;
            return;
        }
        if (iE0 == 1) {
            n0(this.V0);
            RecyclerView.f adapter2 = this.T0.getAdapter();
            androidx.recyclerview.widget.f fVar2 = this.Z0;
            if (adapter2 != fVar2) {
                this.T0.setAdapter(fVar2);
            }
            this.V0.m(t0(), this.t1.getId(), true);
            return;
        }
        if (iE0 != 2) {
            return;
        }
        k0e0 k0e0Var = this.U0;
        if (k0e0Var != null) {
            k0e0Var.b();
        }
        RecyclerView.f adapter3 = this.T0.getAdapter();
        androidx.recyclerview.widget.f fVar3 = this.b1;
        if (adapter3 != fVar3) {
            this.T0.setAdapter(fVar3);
        }
        this.Y0.i(this.t1.getId(), true);
    }

    public final void J0(mfb0 mfb0Var, List<RegularMarketRule> list) {
        if (isResumed()) {
            int iE0 = E0(this.d1.getSelectedTabPosition());
            RegularMarketRule regularMarketRule = null;
            if (iE0 == 0 || iE0 == 1) {
                regularMarketRule = list.isEmpty() ? null : list.get(0);
                this.e1.setVisibility(0);
                N0(mfb0Var, v0(regularMarketRule), false, true);
            } else {
                list = new ArrayList<>();
                this.e1.setVisibility(8);
                N0(mfb0Var, v0(null), true, true);
            }
            synchronized (this.v) {
                try {
                    if (this.e1.getVisibility() == 0 && !m0(list)) {
                        RegularMarketRule regularMarketRuleV0 = v0(regularMarketRule);
                        this.e1.o(this.q2);
                        this.e1.n();
                        this.e1.getContext();
                        final int i2 = -1;
                        for (int i3 = 0; i3 < list.size(); i3++) {
                            RegularMarketRule regularMarketRule2 = list.get(i3);
                            if (regularMarketRule2 != null) {
                                this.e1.b(r0(mfb0Var, regularMarketRule2));
                                if (regularMarketRuleV0 != null && TextUtils.equals(regularMarketRuleV0.a, regularMarketRule2.a)) {
                                    i2 = i3;
                                }
                            }
                        }
                        this.e1.post(new Runnable() { // from class: rcm
                            @Override // java.lang.Runnable
                            public final void run() {
                                List<String> list2 = dfm.v2;
                                dfm dfmVar = this.a;
                                if (dfmVar.e1.getTabCount() > 0) {
                                    int i4 = i2;
                                    if (i4 <= -1) {
                                        i4 = 0;
                                    }
                                    TabLayout.g gVarK = dfmVar.e1.k(i4);
                                    if (gVarK != null) {
                                        gVarK.b();
                                        dfmVar.N0(dfmVar.t1, dfmVar.t0(), false, false);
                                    }
                                }
                                dfmVar.e1.a(dfmVar.q2);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void K0() {
        androidx.fragment.app.e eVarA = rvi.a(this);
        if (eVarA == null || !isResumed()) {
            return;
        }
        Account account = this.E.getAccount();
        double d2 = eVarA.getResources().getDisplayMetrics().density;
        int iB = zch0.b(eVarA.getResources(), d2 == 1.0d ? 2 : 6);
        int iB2 = zch0.b(eVarA.getResources(), d2 == 1.0d ? 4 : 12);
        View view = this.x0;
        if (account == null) {
            view.setBackgroundColor(0);
            this.o0.setBackgroundResource(R.drawable.spr_bg_white_rect);
            this.k0.setText(sn5.d(this, R.string.common_functions__log_in, new Object[0]));
            this.n0.setVisibility(8);
            View view2 = this.o0;
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            view2.setPaddingRelative(iB2, 0, iB2, 0);
            this.m0.setVisibility(0);
            this.r0.setVisibility(8);
        } else {
            view.setBackgroundResource(R.drawable.spr_bg_white_rect);
            this.o0.setBackgroundColor(0);
            this.n0.setVisibility(0);
            this.m0.setVisibility(8);
            View view3 = this.o0;
            WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
            view3.setPaddingRelative(iB, 0, iB2, 0);
        }
        R0();
        try {
            this.Q1.setText(this.E.getLanguageCode().split("-")[0]);
        } catch (Exception unused) {
        }
    }

    public final void L0(boolean z) {
        mfb0 mfb0Var;
        boolean globalVisibleRect = this.T0.getGlobalVisibleRect(this.z);
        boolean zBooleanValue = false;
        boolean z2 = this.l2.booleanValue() != globalVisibleRect;
        if (z2) {
            this.l2 = Boolean.valueOf(globalVisibleRect);
            if (globalVisibleRect) {
                HashMap map = this.n2;
                for (Map.Entry entry : map.entrySet()) {
                    this.X.a((String) entry.getKey(), (brg) entry.getValue());
                }
                map.clear();
            }
        }
        if (!z) {
            zBooleanValue = this.l2.booleanValue();
        } else if (z2 && this.l2.booleanValue()) {
            zBooleanValue = true;
        }
        if (!zBooleanValue || (mfb0Var = this.t1) == null || this.V0.c.isEmpty()) {
            return;
        }
        iym iymVar = this.R;
        String id = mfb0Var.getId();
        PageMeta.INSTANCE.getClass();
        gym.a(iymVar, new xgm(id, PageMeta.Companion.b()));
    }

    public final void M0(Event event, Market market, brg brgVar, z7z z7zVar) {
        if (z7zVar instanceof z7z.b) {
            String strB = apg.b(event, market);
            if (this.l2.booleanValue()) {
                this.X.a(strB, brgVar);
            } else {
                this.n2.put(strB, brgVar);
            }
        }
    }

    public final void N0(mfb0 mfb0Var, RegularMarketRule regularMarketRule, boolean z, boolean z2) {
        boolean zB;
        boolean z3;
        if (rvi.b(this)) {
            return;
        }
        int i2 = 0;
        if (!((mfb0Var == null || regularMarketRule == null) ? false : this.e0.f(mfb0Var.getId(), regularMarketRule.a, false)) || z) {
            if (mfb0Var == null || regularMarketRule == null) {
                zB = false;
            } else {
                iim iimVar = this.w1;
                String id = mfb0Var.getId();
                String str = regularMarketRule.a;
                hkf hkfVar = iimVar.R;
                ckf ckfVar = ckf.c;
                hkfVar.getClass();
                zB = hkfVar.a.b(ckfVar, id, str, false);
            }
            if (!zB || z) {
                this.p1.setVisibility(8);
                this.q1.setVisibility(8);
                this.r1.setVisibility(8);
                this.s1.setVisibility(8);
                return;
            }
            this.p1.setVisibility(8);
            this.q1.setVisibility(0);
            this.r1.setVisibility(0);
            sn20 sn20Var = this.X1;
            sn20Var.getClass();
            z3 = (sn20Var.a.a("market_early_goals_switch_hint_displayed") || (this.o1.getVisibility() != 8)) ? false : true;
            if (z3) {
                BubbleView bubbleView = this.s1;
                lqu.c(bubbleView, jqu.a, new mdm(bubbleView, i2));
            }
            this.s1.setVisibility(z3 ? 0 : 8);
            if (z2) {
                this.c2.C1(lkf.a, zjf.b, this.q1.c() ? pkf.a : pkf.b);
                return;
            }
            return;
        }
        DataHolder<RegularMarketRule> dataHolderW0 = w0();
        if (dataHolderW0 != null && regularMarketRule != null) {
            RegularMarketRule primary = dataHolderW0.getPrimary();
            RegularMarketRule current = dataHolderW0.getCurrent();
            if (primary != null && TextUtils.equals(primary.a, regularMarketRule.a) && current != null) {
                regularMarketRule = current;
            }
        }
        jqu jquVar = null;
        whh0 whh0VarD = this.e0.d(mfb0Var != null ? mfb0Var.getId() : null, regularMarketRule != null ? regularMarketRule.a : null, false);
        this.f0.getClass();
        yhh0 yhh0VarA = zhh0.a(whh0VarD);
        avy avyVar = yhh0VarA.b;
        hih0.a(this.p1, yhh0VarA.a);
        hih0.b(this.p1, avyVar);
        this.q1.setVisibility(8);
        this.p1.setVisibility(0);
        this.r1.setVisibility(0);
        sn20 sn20Var2 = this.X1;
        sn20Var2.getClass();
        boolean zA = sn20Var2.a.a("dc_one_up_switch_hint_displayed");
        z3 = (whh0VarD != null ? whh0VarD.a : null) == rhh0.b && whh0VarD.c.contains(phh0.a);
        if (!zA && z3) {
            jquVar = jqu.b;
        }
        if (jquVar != null) {
            BubbleView bubbleView2 = this.s1;
            lqu.c(bubbleView2, jquVar, new mdm(bubbleView2, i2));
        }
        this.s1.setVisibility(jquVar == null ? 8 : 0);
        if (z2) {
            if (!wlc.a(whh0VarD)) {
                this.b2.D1(wuy.a, uuy.b);
                return;
            }
            xlc xlcVar = this.d2;
            lkf lkfVar = lkf.a;
            zjf zjfVar = zjf.a;
            xlcVar.y1(lkfVar, avyVar == avy.a ? pkf.a : pkf.b);
        }
    }

    public final boolean O0() {
        if (!iu2.k()) {
            return false;
        }
        if (this.j2 == null) {
            C0();
        }
        this.j2.a(new ErrorDataInfo(EditBetDlgType.DISCARD, ""));
        return true;
    }

    public final void P0() {
        androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(requireContext());
        aVar.d(R.string.wap_setting__live_event_notifications_alert_title);
        aVar.a.f = sn5.b(requireContext(), R.string.wap_setting__live_event_notifications_alert_content, new Object[0]);
        aVar.c(sn5.b(requireContext(), R.string.common_functions__ok, new Object[0]), new DialogInterface.OnClickListener() { // from class: xdm
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                List<String> list = dfm.v2;
                dfm dfmVar = this.a;
                iim iimVar = dfmVar.w1;
                Context contextRequireContext = dfmVar.requireContext();
                iimVar.getClass();
                contextRequireContext.getClass();
                ej5.c(o8i0.d(iimVar), null, null, new cjm(iimVar, contextRequireContext, true, null), 3);
            }
        });
        aVar.b(sn5.b(requireContext(), R.string.wap_setting__live_event_notifications_alert_next_time, new Object[0]), new hp3(this, 1));
        androidx.appcompat.app.b bVarCreate = aVar.create();
        bVarCreate.setCanceledOnTouchOutside(false);
        bVarCreate.show();
    }

    public final void Q0() {
        yec yecVar = this.M1;
        final boolean z = yecVar == null || !yecVar.isShowing();
        BigDecimal bigDecimal = this.O1;
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        boolean z2 = (bigDecimal.compareTo(bigDecimal2) == 0 || this.P1.compareTo(bigDecimal2) == 0) ? false : true;
        this.J1.setOnClickListener(new View.OnClickListener() { // from class: hem
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                List<String> list = dfm.v2;
                dfm dfmVar = this.a;
                if (z) {
                    dfmVar.p0();
                } else {
                    dfmVar.o0();
                }
            }
        });
        if (z2 && z) {
            this.J1.setVisibility(8);
            this.L1.setVisibility(0);
        } else {
            this.J1.setVisibility(0);
            this.L1.setVisibility(8);
        }
    }

    public final void R0() {
        if (isResumed()) {
            boolean zR = this.F.r();
            boolean z = this.D.i.size() > 1;
            boolean z2 = (zR && z) || !(zR || !z || this.E.isLogin());
            this.Q1.setVisibility(z2 ? 0 : 8);
            Integer numQ = this.F.q();
            boolean z3 = (numQ == null || z2) ? false : true;
            this.R1.setVisibility(z3 ? 0 : 8);
            if (z3) {
                this.R1.setImageResource(numQ.intValue());
            }
        }
    }

    @Override // com.sportybet.plugin.realsports.home.featuredsection.FeaturedContainer.b
    public final void a(Event event) {
        xyd0 xyd0VarA = xyd0.a.a(event.eventId, event.sport.id, event.isLiveOrFinished(), event.eventSource);
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.e(0, xyd0VarA, "statisticsDialogFragment", 1);
        aVar.k(true, true);
    }

    @Override // com.sportybet.plugin.realsports.home.featuredsection.FeaturedContainer.b
    public final void c(Event event) {
        FragmentManager parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.getClass();
        ilk ilkVar = new ilk();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
        aVar.e(0, ilkVar, "GiftGrabPromotionDialogFragment", 1);
        aVar.c("GiftGrabPromotionDialogFragment");
        aVar.d();
        LinkedHashSet linkedHashSet = mlk.a;
        if (mlk.a(event.eventId)) {
            f00 f00Var = vgb0.a;
            vgb0.a(AnalyticsEvent.GIFT_GRAB_ICON_CLICK);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void i() {
        iim iimVar = this.w1;
        uqm uqmVar = this.E;
        iimVar.getClass();
        uqmVar.getClass();
        if (uqmVar.getAccount() != null) {
            iimVar.y.g();
        }
        nns nnsVar = this.q0.O;
        if (nnsVar != null) {
            nnsVar.A1();
        }
        I0();
        iim iimVar2 = this.w1;
        kzh.d(new g1i(iimVar2.G.h(pu0.c.a), new dim(iimVar2, null)), o8i0.d(iimVar2));
        this.w1.P0.a(Unit.a);
        su5<BaseResponse<RealSportsAdsData>> su5Var = this.y0;
        if (su5Var != null) {
            su5Var.cancel();
        }
        this.S.isGetGiftsEnabled(new r6h(this, 1));
        s0();
        this.w1.A1();
        this.w1.z1(true);
        iim iimVar3 = this.w1;
        iimVar3.getClass();
        ej5.c(o8i0.d(iimVar3), null, null, new jjm(iimVar3, null), 3);
        this.C1.x1();
        ComposeView composeView = this.L0;
        composeView.getClass();
        Object tag = composeView.getTag();
        Runnable runnable = tag instanceof Runnable ? (Runnable) tag : null;
        if (runnable != null) {
            composeView.post(runnable);
        }
        WorldCupPanelComposeViewWrapper worldCupPanelComposeViewWrapper = this.M0;
        worldCupPanelComposeViewWrapper.getClass();
        Object tag2 = worldCupPanelComposeViewWrapper.getTag();
        Runnable runnable2 = tag2 instanceof Runnable ? (Runnable) tag2 : null;
        if (runnable2 != null) {
            worldCupPanelComposeViewWrapper.post(runnable2);
        }
        this.G1.y1();
    }

    @Override // defpackage.wym
    public final boolean k0() {
        return false;
    }

    public final boolean m0(List<RegularMarketRule> list) {
        int tabCount = this.e1.getTabCount();
        if (tabCount == list.size()) {
            for (int i2 = 0; i2 < tabCount; i2++) {
                TabLayout.g gVarK = this.e1.k(i2);
                if (gVarK != null) {
                    RegularMarketRule regularMarketRule = list.get(i2);
                    DataHolder dataHolderAsDataHolderOrNull = DataHolderUtils.asDataHolderOrNull(gVarK.a, RegularMarketRule.class);
                    if (dataHolderAsDataHolderOrNull != null) {
                        RegularMarketRule regularMarketRule2 = (RegularMarketRule) dataHolderAsDataHolderOrNull.getPrimary();
                        if (TextUtils.equals(regularMarketRule2.a, regularMarketRule.a) && TextUtils.equals(regularMarketRule2.b, regularMarketRule.b)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n0(RecyclerView.f<?> fVar) {
        k0e0 k0e0Var = this.U0;
        if (k0e0Var != null) {
            k0e0Var.b();
        }
        k0e0 k0e0Var2 = this.U0;
        if (k0e0Var2 == null) {
            k0e0Var2 = new k0e0();
            this.U0 = k0e0Var2;
        }
        k0e0Var2.a(this.T0, fVar, (k0e0.a) fVar);
    }

    @Override // defpackage.wym
    public final boolean o() {
        return false;
    }

    public final void o0() {
        OddsFilterSettingView oddsFilterSettingView;
        yec yecVar = this.M1;
        if (yecVar == null || !yecVar.isShowing() || (oddsFilterSettingView = this.N1) == null) {
            return;
        }
        oddsFilterSettingView.K.setProgress(oddsFilterSettingView.S, oddsFilterSettingView.T);
        this.M1.dismiss();
    }

    @Override // defpackage.i8
    public final void onAccountChange(Account account) {
        K0();
        String userId = this.E.getUserId();
        vsm vsmVar = this.K;
        if (userId == null) {
            userId = "UNKNOWN";
        }
        vsmVar.setUserId(userId);
        if (isResumed() && E0(this.d1.getSelectedTabPosition()) == 0) {
            this.W0.m(t0(), true);
        } else {
            this.f1 = true;
        }
        u0();
        this.D1.g0.m(Boolean.TRUE);
        this.E1.c0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        I0();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.get_gifts_close) {
            this.S.disableGetGifts();
            this.s0.setVisibility(8);
            return;
        }
        if (id == R.id.get_gifts_panel) {
            this.S.disableGetGifts();
            this.s0.setVisibility(8);
            if (this.E.getAccount() != null) {
                z0(null);
                return;
            } else {
                this.E.demandAccount(getActivity(), this);
                return;
            }
        }
        if (id != R.id.search) {
            if (id == R.id.register) {
                gym.a(this.R, new ts40.e());
                this.J.c(this.m0, AnalyticsEvent.KYC_HEADER_JOIN_NOW_BTN);
                this.E.demandNewAccount(getActivity(), this);
                return;
            }
            return;
        }
        sz70 sz70Var = this.Y1;
        sz70Var.c.b("search_tooltip_displayed");
        wwd0 wwd0Var = sz70Var.d;
        Boolean bool = Boolean.FALSE;
        wwd0Var.getClass();
        wwd0Var.k(null, bool);
        yrh0.k(requireActivity());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList arrayList = this.y;
        arrayList.clear();
        Iterator<OrderedSportItem> it = OrderedSportItemHelper.getFromStorage(3).iterator();
        while (it.hasNext()) {
            mfb0 mfb0VarE = lfb0.d().e(it.next().id);
            if (mfb0VarE != null) {
                arrayList.add(mfb0VarE);
            }
        }
        androidx.fragment.app.e eVarRequireActivity = requireActivity();
        eVarRequireActivity.getClass();
        v8i0 viewModelStore = eVarRequireActivity.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = eVarRequireActivity.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, sd7.a(eVarRequireActivity, viewModelStore, defaultViewModelProviderFactory));
        dq7 dq7VarA = jq40.a(iim.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.w1 = (iim) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        v8i0 viewModelStore2 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory2 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore2.getClass();
        defaultViewModelProviderFactory2.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, defaultViewModelCreationExtras);
        dq7 dq7VarA2 = jq40.a(com.sportybet.feature.luckynumber.featurematch.presentation.k.class);
        String strI2 = dq7VarA2.i();
        if (strI2 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.x1 = (com.sportybet.feature.luckynumber.featurematch.presentation.k) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
        v8i0 viewModelStore3 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory3 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras2 = getDefaultViewModelCreationExtras();
        viewModelStore3.getClass();
        defaultViewModelProviderFactory3.getClass();
        defaultViewModelCreationExtras2.getClass();
        s8i0 s8i0Var3 = new s8i0(viewModelStore3, defaultViewModelProviderFactory3, defaultViewModelCreationExtras2);
        dq7 dq7VarA3 = jq40.a(of20.class);
        String strI3 = dq7VarA3.i();
        if (strI3 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.v1 = (of20) s8i0Var3.a(dq7VarA3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI3));
        v8i0 viewModelStore4 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory4 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras3 = getDefaultViewModelCreationExtras();
        viewModelStore4.getClass();
        defaultViewModelProviderFactory4.getClass();
        defaultViewModelCreationExtras3.getClass();
        s8i0 s8i0Var4 = new s8i0(viewModelStore4, defaultViewModelProviderFactory4, defaultViewModelCreationExtras3);
        dq7 dq7VarA4 = jq40.a(e320.class);
        String strI4 = dq7VarA4.i();
        if (strI4 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.y1 = (e320) s8i0Var4.a(dq7VarA4, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI4));
        v8i0 viewModelStore5 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory5 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras4 = getDefaultViewModelCreationExtras();
        viewModelStore5.getClass();
        defaultViewModelProviderFactory5.getClass();
        defaultViewModelCreationExtras4.getClass();
        s8i0 s8i0Var5 = new s8i0(viewModelStore5, defaultViewModelProviderFactory5, defaultViewModelCreationExtras4);
        dq7 dq7VarA5 = jq40.a(tgm.class);
        String strI5 = dq7VarA5.i();
        if (strI5 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.A1 = (tgm) s8i0Var5.a(dq7VarA5, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI5));
        androidx.fragment.app.e eVarRequireActivity2 = requireActivity();
        eVarRequireActivity2.getClass();
        v8i0 viewModelStore6 = eVarRequireActivity2.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory6 = eVarRequireActivity2.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var6 = new s8i0(viewModelStore6, defaultViewModelProviderFactory6, sd7.a(eVarRequireActivity2, viewModelStore6, defaultViewModelProviderFactory6));
        dq7 dq7VarA6 = jq40.a(ov6.class);
        String strI6 = dq7VarA6.i();
        if (strI6 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.z1 = (ov6) s8i0Var6.a(dq7VarA6, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI6));
        v8i0 viewModelStore7 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory7 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras5 = getDefaultViewModelCreationExtras();
        viewModelStore7.getClass();
        defaultViewModelProviderFactory7.getClass();
        defaultViewModelCreationExtras5.getClass();
        s8i0 s8i0Var7 = new s8i0(viewModelStore7, defaultViewModelProviderFactory7, defaultViewModelCreationExtras5);
        dq7 dq7VarA7 = jq40.a(sn20.class);
        String strI7 = dq7VarA7.i();
        if (strI7 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.X1 = (sn20) s8i0Var7.a(dq7VarA7, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI7));
        v8i0 viewModelStore8 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory8 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras6 = getDefaultViewModelCreationExtras();
        viewModelStore8.getClass();
        defaultViewModelProviderFactory8.getClass();
        defaultViewModelCreationExtras6.getClass();
        s8i0 s8i0Var8 = new s8i0(viewModelStore8, defaultViewModelProviderFactory8, defaultViewModelCreationExtras6);
        dq7 dq7VarA8 = jq40.a(sz70.class);
        String strI8 = dq7VarA8.i();
        if (strI8 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.Y1 = (sz70) s8i0Var8.a(dq7VarA8, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI8));
        v8i0 viewModelStore9 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory9 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras7 = getDefaultViewModelCreationExtras();
        viewModelStore9.getClass();
        defaultViewModelProviderFactory9.getClass();
        defaultViewModelCreationExtras7.getClass();
        s8i0 s8i0Var9 = new s8i0(viewModelStore9, defaultViewModelProviderFactory9, defaultViewModelCreationExtras7);
        dq7 dq7VarA9 = jq40.a(bsy.class);
        String strI9 = dq7VarA9.i();
        if (strI9 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.b2 = (bsy) s8i0Var9.a(dq7VarA9, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI9));
        v8i0 viewModelStore10 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory10 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras8 = getDefaultViewModelCreationExtras();
        viewModelStore10.getClass();
        defaultViewModelProviderFactory10.getClass();
        defaultViewModelCreationExtras8.getClass();
        s8i0 s8i0Var10 = new s8i0(viewModelStore10, defaultViewModelProviderFactory10, defaultViewModelCreationExtras8);
        dq7 dq7VarA10 = jq40.a(ruy.class);
        String strI10 = dq7VarA10.i();
        if (strI10 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.Z1 = (ruy) s8i0Var10.a(dq7VarA10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI10));
        v8i0 viewModelStore11 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory11 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras9 = getDefaultViewModelCreationExtras();
        viewModelStore11.getClass();
        defaultViewModelProviderFactory11.getClass();
        defaultViewModelCreationExtras9.getClass();
        s8i0 s8i0Var11 = new s8i0(viewModelStore11, defaultViewModelProviderFactory11, defaultViewModelCreationExtras9);
        dq7 dq7VarA11 = jq40.a(ijf.class);
        String strI11 = dq7VarA11.i();
        if (strI11 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.c2 = (ijf) s8i0Var11.a(dq7VarA11, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI11));
        v8i0 viewModelStore12 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory12 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras10 = getDefaultViewModelCreationExtras();
        viewModelStore12.getClass();
        defaultViewModelProviderFactory12.getClass();
        defaultViewModelCreationExtras10.getClass();
        s8i0 s8i0Var12 = new s8i0(viewModelStore12, defaultViewModelProviderFactory12, defaultViewModelCreationExtras10);
        dq7 dq7VarA12 = jq40.a(xlc.class);
        String strI12 = dq7VarA12.i();
        if (strI12 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.d2 = (xlc) s8i0Var12.a(dq7VarA12, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI12));
        androidx.fragment.app.e eVarRequireActivity3 = requireActivity();
        eVarRequireActivity3.getClass();
        v8i0 viewModelStore13 = eVarRequireActivity3.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory13 = eVarRequireActivity3.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var13 = new s8i0(viewModelStore13, defaultViewModelProviderFactory13, sd7.a(eVarRequireActivity3, viewModelStore13, defaultViewModelProviderFactory13));
        dq7 dq7VarA13 = jq40.a(cky.class);
        String strI13 = dq7VarA13.i();
        if (strI13 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        cky ckyVar = (cky) s8i0Var13.a(dq7VarA13, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI13));
        this.g2 = ckyVar;
        ckyVar.x1();
        androidx.fragment.app.e eVarRequireActivity4 = requireActivity();
        eVarRequireActivity4.getClass();
        v8i0 viewModelStore14 = eVarRequireActivity4.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory14 = eVarRequireActivity4.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var14 = new s8i0(viewModelStore14, defaultViewModelProviderFactory14, sd7.a(eVarRequireActivity4, viewModelStore14, defaultViewModelProviderFactory14));
        dq7 dq7VarA14 = jq40.a(oku.class);
        String strI14 = dq7VarA14.i();
        if (strI14 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.D1 = (oku) s8i0Var14.a(dq7VarA14, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI14));
        androidx.fragment.app.e eVarRequireActivity5 = requireActivity();
        eVarRequireActivity5.getClass();
        v8i0 viewModelStore15 = eVarRequireActivity5.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory15 = eVarRequireActivity5.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var15 = new s8i0(viewModelStore15, defaultViewModelProviderFactory15, sd7.a(eVarRequireActivity5, viewModelStore15, defaultViewModelProviderFactory15));
        dq7 dq7VarA15 = jq40.a(tch.class);
        String strI15 = dq7VarA15.i();
        if (strI15 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.h2 = (tch) s8i0Var15.a(dq7VarA15, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI15));
        androidx.fragment.app.e eVarRequireActivity6 = requireActivity();
        eVarRequireActivity6.getClass();
        v8i0 viewModelStore16 = eVarRequireActivity6.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory16 = eVarRequireActivity6.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var16 = new s8i0(viewModelStore16, defaultViewModelProviderFactory16, sd7.a(eVarRequireActivity6, viewModelStore16, defaultViewModelProviderFactory16));
        dq7 dq7VarA16 = jq40.a(com.sportybet.android.instantwin.presentation.buildandgo.f.class);
        String strI16 = dq7VarA16.i();
        if (strI16 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.E1 = (com.sportybet.android.instantwin.presentation.buildandgo.f) s8i0Var16.a(dq7VarA16, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI16));
        androidx.fragment.app.e eVarRequireActivity7 = requireActivity();
        eVarRequireActivity7.getClass();
        v8i0 viewModelStore17 = eVarRequireActivity7.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory17 = eVarRequireActivity7.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var17 = new s8i0(viewModelStore17, defaultViewModelProviderFactory17, sd7.a(eVarRequireActivity7, viewModelStore17, defaultViewModelProviderFactory17));
        dq7 dq7VarA17 = jq40.a(hby.class);
        String strI17 = dq7VarA17.i();
        if (strI17 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.F1 = (hby) s8i0Var17.a(dq7VarA17, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI17));
        androidx.fragment.app.e eVarRequireActivity8 = requireActivity();
        eVarRequireActivity8.getClass();
        v8i0 viewModelStore18 = eVarRequireActivity8.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory18 = eVarRequireActivity8.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var18 = new s8i0(viewModelStore18, defaultViewModelProviderFactory18, sd7.a(eVarRequireActivity8, viewModelStore18, defaultViewModelProviderFactory18));
        dq7 dq7VarA18 = jq40.a(nns.class);
        String strI18 = dq7VarA18.i();
        if (strI18 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.f2 = (nns) s8i0Var18.a(dq7VarA18, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI18));
        androidx.fragment.app.e eVarRequireActivity9 = requireActivity();
        eVarRequireActivity9.getClass();
        v8i0 viewModelStore19 = eVarRequireActivity9.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory19 = eVarRequireActivity9.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var19 = new s8i0(viewModelStore19, defaultViewModelProviderFactory19, sd7.a(eVarRequireActivity9, viewModelStore19, defaultViewModelProviderFactory19));
        dq7 dq7VarA19 = jq40.a(w4j0.class);
        String strI19 = dq7VarA19.i();
        if (strI19 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.G1 = (w4j0) s8i0Var19.a(dq7VarA19, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI19));
        androidx.fragment.app.e eVarRequireActivity10 = requireActivity();
        eVarRequireActivity10.getClass();
        v8i0 viewModelStore20 = eVarRequireActivity10.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory20 = eVarRequireActivity10.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var20 = new s8i0(viewModelStore20, defaultViewModelProviderFactory20, sd7.a(eVarRequireActivity10, viewModelStore20, defaultViewModelProviderFactory20));
        dq7 dq7VarA20 = jq40.a(hzz.class);
        String strI20 = dq7VarA20.i();
        if (strI20 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
        } else {
            this.H1 = (hzz) s8i0Var20.a(dq7VarA20, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI20));
            this.i0 = registerForActivityResult(this.O.a(), new ud() { // from class: scm
                @Override // defpackage.ud
                public final void a(Object obj) {
                    gqk gqkVar = (gqk) obj;
                    List<String> list = dfm.v2;
                    boolean z = gqkVar instanceof gqk.c;
                    dfm dfmVar = this.a;
                    if (z) {
                        dfmVar.E1.j1(((gqk.c) gqkVar).a);
                        return;
                    }
                    if (!(gqkVar instanceof gqk.a)) {
                        if (gqkVar instanceof gqk.d) {
                            dfmVar.E1.b0();
                        }
                    } else {
                        gqk.a aVar = (gqk.a) gqkVar;
                        dfmVar.E1.B1(aVar.a, aVar.b);
                    }
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [ucm] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        yie0.b(this, mie0.a);
        int i2 = 0;
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.spr_fragment_home, viewGroup, false);
        this.D0 = frameLayout;
        this.T0 = (RecyclerView) frameLayout.findViewById(R.id.highlights);
        this.a2 = this.h0.a(gty.a, new ety() { // from class: dem
            @Override // defpackage.ety
            public final void a() {
                avy avyVar = avy.a;
                List<String> list = dfm.v2;
                hih0.c(this.a.p1, avyVar, true, false);
            }
        }, new rty() { // from class: eem
            @Override // defpackage.rty
            public final void a() {
                List<String> list = dfm.v2;
                fty.a(this.a.T0);
            }
        });
        this.T0.k(new efm(this));
        this.T0.setItemAnimator(null);
        Context context = getContext();
        boolean zB = this.W.b("enable_main_page_today_pre_match_events_ad");
        a8z a8zVar = this.Z;
        hkf hkfVar = this.a0;
        ity ityVar = this.a2;
        ncm ncmVar = this.e2;
        this.V0 = new bzf0((t6i0.a) context, this, ncmVar, zB, a8zVar, hkfVar, ityVar);
        this.W0 = new kkl((t6i0.a) getContext(), this, ncmVar, this.Z, this.a0, this.a2);
        this.Y0 = new a7b(this);
        joi joiVar = new joi(ypi.b(new fem(this, i2)));
        int i3 = 1;
        this.Z0 = new androidx.recyclerview.widget.f(this.V0, joiVar);
        this.a1 = new androidx.recyclerview.widget.f(this.W0, joiVar);
        this.b1 = new androidx.recyclerview.widget.f(this.Y0, joiVar);
        n0(this.V0);
        this.T0.setAdapter(this.Z0);
        this.j1 = (ConstraintLayout) this.D0.findViewById(R.id.title_bar);
        ConsecutiveScrollerLayout consecutiveScrollerLayout = (ConsecutiveScrollerLayout) this.D0.findViewById(R.id.nestedscrollview);
        this.i1 = consecutiveScrollerLayout;
        consecutiveScrollerLayout.setOnVerticalScrollChangeListener(new ConsecutiveScrollerLayout.e() { // from class: tcm
            @Override // com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout.e
            public final void a(int i4) {
                List<String> list = dfm.v2;
                dfm dfmVar = this.a;
                LivePanel livePanel = dfmVar.q0;
                if (livePanel != null) {
                    livePanel.q(true);
                }
                dfmVar.L0(true);
                dfm.f fVar = dfmVar.u0;
                PanImageContainer panImageContainer = dfmVar.t0;
                if (panImageContainer != null) {
                    panImageContainer.setAlpha(0.5f);
                    dfmVar.t0.removeCallbacks(fVar);
                    dfmVar.t0.postDelayed(fVar, 500L);
                }
                dfmVar.o0();
                if (i4 == 0) {
                    boolean zD0 = dfmVar.D0();
                    MidBroadcastPanel midBroadcastPanel = dfmVar.R0;
                    if (!zD0) {
                        midBroadcastPanel.b.c();
                        return;
                    }
                    MarqueeView marqueeView = midBroadcastPanel.b;
                    if (marqueeView.w) {
                        return;
                    }
                    marqueeView.b(false);
                }
            }
        });
        TabLayout tabLayout = (TabLayout) this.D0.findViewById(R.id.prematch_sport_tab);
        this.c1 = tabLayout;
        tabLayout.setTabMode(0);
        this.d1 = (TabLayout) this.D0.findViewById(R.id.pre_match_category_tab);
        OneUpTwoUpSwitch oneUpTwoUpSwitch = (OneUpTwoUpSwitch) this.D0.findViewById(R.id.pre_match_one_up_two_up_switch);
        this.p1 = oneUpTwoUpSwitch;
        oneUpTwoUpSwitch.setOnStateChangedListener(new m());
        OUEarlyGoalsSwitch oUEarlyGoalsSwitch = (OUEarlyGoalsSwitch) this.D0.findViewById(R.id.pre_match_ou_early_goals_switch);
        this.q1 = oUEarlyGoalsSwitch;
        oUEarlyGoalsSwitch.setOnStateChangedListener(new zfc(this));
        this.r1 = this.D0.findViewById(R.id.pre_match_market_option_divider);
        BubbleView bubbleView = (BubbleView) this.D0.findViewById(R.id.pre_match_market_option_feature_alert);
        this.s1 = bubbleView;
        bubbleView.setOnClickedClose(new pn3(this, i3));
        TabLayout tabLayout2 = (TabLayout) this.D0.findViewById(R.id.pre_match_category_market_tabs);
        this.e1 = tabLayout2;
        tabLayout2.setTabMode(0);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.D0.findViewById(R.id.swipe);
        this.j0 = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        RecyclerView recyclerView = (RecyclerView) this.D0.findViewById(R.id.popular);
        this.w0 = recyclerView;
        if (this.I0 != null) {
            getActivity();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            this.w0.setAdapter(this.I0);
        }
        azj0.b((ComposeView) this.D0.findViewById(R.id.fifa_world_cup_banner), this.G, czj0.Compact, new Function0() { // from class: edm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List<String> list = dfm.v2;
                dfm dfmVar = this.a;
                dfmVar.H.a(s2k0.c.a, k00.d);
                if (dfmVar.E.isLogin()) {
                    dfmVar.N.k(wae.WORLDCUP_MISSION, new Pair[]{new Pair("source", "home_banner")}, null);
                } else {
                    String strA = dfmVar.I.a();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("data_share_dialog_title", sn5.d(dfmVar, R.string.az_menu__promotion_share_title, new Object[0]));
                    bundle2.putString("data_share_dialog_sharing_content", strA);
                    bundle2.putInt("data_share_dialog_title_style", R.style.H3_B);
                    bundle2.putInt("data_share_dialog_title_bottom_padding", 16);
                    dfmVar.N.h(strA, bundle2, Sender.UNKNOWN);
                }
                return Unit.a;
            }
        }, new rn3(this, i3), new Function0() { // from class: gdm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List<String> list = dfm.v2;
                this.a.H.a(s2k0.d.a, k00.d);
                return Unit.a;
            }
        }, true);
        ((ImageButton) this.D0.findViewById(R.id.search)).setOnClickListener(this);
        BubbleView bubbleView2 = (BubbleView) this.D0.findViewById(R.id.search_tooltip);
        this.k1 = bubbleView2;
        bubbleView2.setOnClickedClose(new Function0() { // from class: hdm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List<String> list = dfm.v2;
                sz70 sz70Var = this.a.Y1;
                sz70Var.c.b("search_tooltip_displayed");
                wwd0 wwd0Var = sz70Var.d;
                Boolean bool = Boolean.FALSE;
                wwd0Var.getClass();
                wwd0Var.k(null, bool);
                return Unit.a;
            }
        });
        this.o0 = this.D0.findViewById(R.id.login_balance_container);
        this.p0 = (ImageView) this.D0.findViewById(R.id.balance_lock);
        TextView textView = (TextView) this.D0.findViewById(R.id.deposit);
        this.r0 = textView;
        this.J.e(textView, "ftd__homepage_deposit");
        this.r0.setOnClickListener(new View.OnClickListener() { // from class: idm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                List<String> list = dfm.v2;
                dag dagVar = dag.NAV_BAR;
                dfm dfmVar = this.a;
                dfmVar.z0(dagVar);
                dfmVar.H.a(new wnd(), k00.d);
            }
        });
        this.k0 = (TextView) this.D0.findViewById(R.id.login);
        this.x0 = this.D0.findViewById(R.id.login_container);
        TextView textView2 = (TextView) this.D0.findViewById(R.id.register);
        this.m0 = textView2;
        textView2.setOnClickListener(this);
        View viewFindViewById = this.D0.findViewById(R.id.me_img);
        this.n0 = viewFindViewById;
        viewFindViewById.setOnClickListener(new jdm());
        this.l1 = (OneUpTwoUpSwitch) this.D0.findViewById(R.id.live_one_up_two_up_switch);
        this.m1 = (OUEarlyGoalsSwitch) this.D0.findViewById(R.id.live_ou_early_goals_switch);
        this.n1 = this.D0.findViewById(R.id.live_market_option_divider);
        this.o1 = (BubbleView) this.D0.findViewById(R.id.live_market_option_feature_alert);
        LivePanel livePanel = (LivePanel) this.D0.findViewById(R.id.live_panel);
        this.q0 = livePanel;
        livePanel.I = this.D0.findViewById(R.id.live_title);
        this.q0.setActionListener(this);
        this.q0.setOutcomeChangeListener(ncmVar);
        this.q0.setOneTwoUpStateCoordinator(this.t2);
        this.q0.setOUEarlyGoalsCoordinator(this.u2);
        this.q0.setSportTabLayout((TabLayout) this.D0.findViewById(R.id.live_sport_tab));
        this.q0.setMarketTabLayout((TabLayout) this.D0.findViewById(R.id.live_market_tab));
        this.q0.setMarketTitle((RelativeLayout) this.D0.findViewById(R.id.live_market_title));
        this.q0.setMarketOptionViews(this.l1, this.m1, this.n1, this.o1);
        this.K0 = (ViewStub) this.D0.findViewById(R.id.second_banner_stub);
        ComposeView composeView = (ComposeView) this.D0.findViewById(R.id.storiesContainer);
        this.L0 = composeView;
        kdm kdmVar = new kdm(this);
        composeView.getClass();
        composeView.setContent(new op8(-24624406, new rje(composeView, kdmVar), true));
        final WorldCupPanelComposeViewWrapper worldCupPanelComposeViewWrapper = (WorldCupPanelComposeViewWrapper) this.D0.findViewById(R.id.worldCupPanelContainer);
        this.M0 = worldCupPanelComposeViewWrapper;
        final androidx.fragment.app.e eVarRequireActivity = requireActivity();
        final ?? r5 = new Function2() { // from class: ucm
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                String str = (String) obj;
                String str2 = (String) obj2;
                List<String> list = dfm.v2;
                if (str != null && str2 != null) {
                    xyd0 xyd0VarA = xyd0.a.a(str2, str, false, null);
                    FragmentManager supportFragmentManager = this.a.requireActivity().getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    a aVar = new a(supportFragmentManager);
                    aVar.e(0, xyd0VarA, "statisticsDialogFragment", 1);
                    aVar.k(true, true);
                }
                return Unit.a;
            }
        };
        worldCupPanelComposeViewWrapper.getClass();
        eVarRequireActivity.getClass();
        worldCupPanelComposeViewWrapper.setContent(new op8(-952932779, new Function2() { // from class: fzj0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    w8i0 w8i0VarA = zdt.a(aVar);
                    if (w8i0VarA == null) {
                        ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    final t0k0 t0k0Var = (t0k0) p8i0.a(jq40.a(t0k0.class), w8i0VarA, null, cll.a(w8i0VarA, aVar), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, aVar);
                    e eVar = eVarRequireActivity;
                    final tch tchVar = (tch) p8i0.a(jq40.a(tch.class), eVar, null, cll.a(eVar, aVar), eVar.getDefaultViewModelCreationExtras(), aVar);
                    Unit unit = Unit.a;
                    final WorldCupPanelComposeViewWrapper worldCupPanelComposeViewWrapper2 = worldCupPanelComposeViewWrapper;
                    boolean zA = aVar.A(worldCupPanelComposeViewWrapper2) | aVar.A(t0k0Var);
                    Object objY = aVar.y();
                    if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                        objY = new Function1() { // from class: nzj0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                ((use) obj3).getClass();
                                rjf0 rjf0Var = new rjf0(t0k0Var, 1);
                                WorldCupPanelComposeViewWrapper worldCupPanelComposeViewWrapper3 = worldCupPanelComposeViewWrapper2;
                                worldCupPanelComposeViewWrapper3.setTag(rjf0Var);
                                return new j0k0(worldCupPanelComposeViewWrapper3);
                            }
                        };
                        aVar.r(objY);
                    }
                    xvf.c(unit, (Function1) objY, aVar);
                    final ucm ucmVar = r5;
                    o0z.a(null, null, null, null, null, pp8.b(-2142346364, new Function2() { // from class: rzj0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                k0k0.f(t0k0Var, tchVar, ucmVar, aVar2, 72);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        ComposeView composeView2 = (ComposeView) this.D0.findViewById(R.id.welcomeRewardContainer);
        this.N0 = composeView2;
        composeView2.setOnClickListener(new View.OnClickListener() { // from class: vcm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x0j0.a aVar;
                List<String> list = dfm.v2;
                dfm dfmVar = this.a;
                w4j0 w4j0Var = dfmVar.G1;
                uwd0<T> uwd0Var = w4j0Var.E.a;
                if (((q1j0) uwd0Var.getValue()).f) {
                    aVar = x0j0.a.COMPLETED;
                } else {
                    aVar = ((q1j0) uwd0Var.getValue()).e != null ? x0j0.a.TIME_COUNT : x0j0.a.DEFAULT;
                }
                w4j0Var.e.a(new x0j0.e(aVar), k00.d);
                boolean z = ((q1j0) uwd0Var.getValue()).f;
                w1j0 w1j0Var = w4j0Var.b;
                ej5.c(o8i0.d(w4j0Var), null, null, new k5j0(w4j0Var, z ? w1j0Var.a() : w1j0Var.b(), null), 3);
                Context contextRequireContext = dfmVar.requireContext();
                int i4 = WelcomeRewardActivity.f;
                contextRequireContext.getClass();
                contextRequireContext.startActivity(new Intent(contextRequireContext, (Class<?>) WelcomeRewardActivity.class));
            }
        });
        ComposeView composeView3 = this.N0;
        final v340 v340Var = this.G1.E;
        final v340 v340Var2 = this.D1.q0;
        final wcm wcmVar = new wcm(this, i2);
        composeView3.getClass();
        v340Var.getClass();
        v340Var2.getClass();
        composeView3.setContent(new op8(-757029874, new Function2() { // from class: d1j0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ytw ytwVarC = wyh.c(v340Var, aVar, 0, 7);
                    final ytw ytwVarC2 = wyh.c(v340Var2, aVar, 0, 7);
                    final q1j0 q1j0Var = (q1j0) ytwVarC.getValue();
                    if (q1j0Var == null) {
                        aVar.N(196498850);
                        aVar.H();
                    } else {
                        aVar.N(196498851);
                        if (!q1j0Var.a) {
                            aVar.H();
                            return Unit.a;
                        }
                        final wcm wcmVar2 = wcmVar;
                        o0z.a(null, null, null, null, null, pp8.b(979912836, new Function2() { // from class: e1j0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    d dVarF = h.f(j.g(d.a.b, 1.0f), ((cjb0) aVar2.O(ejb0.a)).d);
                                    Object objY = aVar2.y();
                                    if (objY == androidx.compose.runtime.a.C0041a.a) {
                                        objY = new f1j0();
                                        aVar2.r(objY);
                                    }
                                    d dVarB = xa80.b(dVarF, false, (Function1) objY);
                                    aiv aivVarC = g75.c(ht.a.a, false);
                                    int iHashCode = Long.hashCode(aVar2.m());
                                    ne00 ne00VarO = aVar2.o();
                                    d dVarC = c.c(aVar2, dVarB);
                                    yka.k.getClass();
                                    tsr.a aVar3 = yka.a.b;
                                    if (aVar2.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar2.D();
                                    if (aVar2.g()) {
                                        aVar2.F(aVar3);
                                    } else {
                                        aVar2.p();
                                    }
                                    hlh0.a(aVar2, aivVarC, yka.a.f);
                                    hlh0.a(aVar2, ne00VarO, yka.a.e);
                                    yka.a.C1350a c1350a = yka.a.g;
                                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                                    }
                                    hlh0.a(aVar2, dVarC, yka.a.d);
                                    p1j0.a(q1j0Var, ((Number) ytwVarC2.getValue()).floatValue(), wcmVar2, aVar2, 0);
                                    aVar2.s();
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, aVar), aVar, 196608);
                        aVar.H();
                    }
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        GetGiftsPanel getGiftsPanel = (GetGiftsPanel) this.D0.findViewById(R.id.get_gifts_panel);
        this.s0 = getGiftsPanel;
        getGiftsPanel.setOnClickListener(this);
        this.t0 = (PanImageContainer) this.D0.findViewById(R.id.gifts_box_container);
        this.v0 = (ImageView) this.D0.findViewById(R.id.get_gifts_img);
        this.C0 = (TextView) this.D0.findViewById(R.id.get_gifts_view);
        this.D0.findViewById(R.id.get_gifts_close).setOnClickListener(this);
        this.E.addAccountChangeListener(this);
        this.P0 = (EllipsizingTextView) this.D0.findViewById(R.id.top_broadcast_view);
        this.Q0 = (LinearLayout) this.D0.findViewById(R.id.top_broadcast_container);
        MidBroadcastPanel midBroadcastPanel = (MidBroadcastPanel) this.D0.findViewById(R.id.mid_broadcast_panel);
        this.R0 = midBroadcastPanel;
        midBroadcastPanel.setMarqueeViewLogPrefix("TopMarquee");
        this.S.isGetGiftsEnabled(new Function1() { // from class: wdm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List<String> list = dfm.v2;
                if (!((Boolean) obj).booleanValue()) {
                    dfm dfmVar = this.a;
                    dfmVar.s0.setVisibility(8);
                    dfmVar.B0 = false;
                }
                return Unit.a;
            }
        });
        iu2.a(this.V0);
        iu2.a(this.W0);
        iu2.a(this.Y0);
        this.Q1 = (CheckedTextView) this.D0.findViewById(R.id.global_settings);
        this.R1 = (ImageView) this.D0.findViewById(R.id.flag);
        R0();
        this.Q1.setOnClickListener(new View.OnClickListener() { // from class: xcm
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v11 */
            /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
            /* JADX WARN: Type inference failed for: r4v13, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r4v22, types: [m2g] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                Throwable th;
                ?? arrayList;
                List<String> list = dfm.v2;
                final dfm dfmVar = this.a;
                boolean zIsChecked = dfmVar.Q1.isChecked();
                yec yecVar = dfmVar.U1;
                if (!zIsChecked) {
                    if (yecVar == null) {
                        Throwable th2 = null;
                        View viewInflate = LayoutInflater.from(dfmVar.requireContext()).inflate(R.layout.settings_drop_down, (ViewGroup) null, false);
                        int i4 = R.id.language_recycler_view;
                        RecyclerView recyclerView2 = (RecyclerView) h5e.a(R.id.language_recycler_view, viewInflate);
                        if (recyclerView2 != null) {
                            i4 = R.id.odds_format_label;
                            TextView textView3 = (TextView) h5e.a(R.id.odds_format_label, viewInflate);
                            if (textView3 != null) {
                                i4 = R.id.odds_format_recycler_view;
                                RecyclerView recyclerView3 = (RecyclerView) h5e.a(R.id.odds_format_recycler_view, viewInflate);
                                if (recyclerView3 != null) {
                                    dfmVar.T1 = new hk80((LinearLayout) viewInflate, recyclerView2, textView3, recyclerView3);
                                    ulr ulrVar = new ulr(new ulr.a());
                                    ulrVar.b = new ydm(dfmVar, ulrVar);
                                    dfmVar.T1.b.setAdapter(ulrVar);
                                    jmr jmrVar = dfmVar.D;
                                    ArrayList arrayListB = jmrVar.b();
                                    ArrayList arrayListC = jmrVar.c();
                                    if (arrayListB.size() != arrayListC.size()) {
                                        arrayList = m2g.a;
                                        th = null;
                                    } else {
                                        String languageCode = jmrVar.c.getLanguageCode(null);
                                        ArrayList arrayList2 = new ArrayList(l48.r(arrayListB, 10));
                                        int size = arrayListB.size();
                                        int i5 = 0;
                                        int i6 = 0;
                                        while (i6 < size) {
                                            Object obj = arrayListB.get(i6);
                                            i6++;
                                            int i7 = i5 + 1;
                                            if (i5 < 0) {
                                                Throwable th3 = th2;
                                                b.q();
                                                throw th3;
                                            }
                                            String str = (String) obj;
                                            arrayList2.add(new xlr((String) arrayListC.get(i5), str, (String) StringsKt__StringsKt.split$default(str, new String[]{"-"}, false, 0, 6, null).get(0), Intrinsics.g(str, languageCode)));
                                            th2 = th2;
                                            i5 = i7;
                                        }
                                        th = th2;
                                        if (jmrVar.b.v()) {
                                            arrayList = arrayList2;
                                        } else {
                                            arrayList = new ArrayList();
                                            int size2 = arrayList2.size();
                                            int i8 = 0;
                                            while (i8 < size2) {
                                                Object obj2 = arrayList2.get(i8);
                                                i8++;
                                                if (!Intrinsics.g(((xlr) obj2).b, CMSLanguage.FR.getLanguageCode())) {
                                                    arrayList.add(obj2);
                                                }
                                            }
                                        }
                                    }
                                    ulrVar.i(arrayList);
                                    mjy mjyVar = new mjy(new mjy.a());
                                    mjyVar.b = new aem(dfmVar, mjyVar);
                                    dfmVar.T1.d.setAdapter(mjyVar);
                                    xjy xjyVar = (xjy) dfmVar.g2.c.getValue();
                                    List<ljy> list2 = xjyVar.a;
                                    ArrayList arrayList3 = new ArrayList(l48.r(list2, 10));
                                    int i9 = 0;
                                    for (Object obj3 : list2) {
                                        int i10 = i9 + 1;
                                        if (i9 < 0) {
                                            b.q();
                                            throw th;
                                        }
                                        arrayList3.add(new njy((ljy) obj3, i9 == xjyVar.b));
                                        i9 = i10;
                                    }
                                    mjyVar.i(arrayList3);
                                    boolean zEquals = Boolean.TRUE.equals(dfmVar.g2.f.d());
                                    dfmVar.T1.c.setVisibility(zEquals ? 0 : 8);
                                    dfmVar.T1.d.setVisibility(zEquals ? 0 : 8);
                                    RelativeLayout relativeLayout = new RelativeLayout(dfmVar.getContext());
                                    relativeLayout.addView(dfmVar.T1.a, new RelativeLayout.LayoutParams(-1, -2));
                                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: bem
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view2) {
                                            List<String> list3 = dfm.v2;
                                            yec yecVar2 = dfmVar.U1;
                                            if (yecVar2 != null) {
                                                yecVar2.dismiss();
                                            }
                                        }
                                    });
                                    yec yecVar2 = new yec((View) relativeLayout);
                                    dfmVar.U1 = yecVar2;
                                    yecVar2.setAnimationStyle(R.style.spr_PopupWindowAnimation);
                                    dfmVar.U1.setFocusable(true);
                                    dfmVar.U1.setOutsideTouchable(true);
                                    dfmVar.U1.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: cem
                                        @Override // android.widget.PopupWindow.OnDismissListener
                                        public final void onDismiss() {
                                            List<String> list3 = dfm.v2;
                                            dfm dfmVar2 = dfmVar;
                                            dfmVar2.Q1.postDelayed(dfmVar2.S1, 200L);
                                        }
                                    });
                                }
                            }
                        }
                        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
                        return;
                    }
                    dfmVar.U1.b(0, dfmVar.j1);
                } else if (yecVar != null) {
                    yecVar.dismiss();
                }
                CheckedTextView checkedTextView = dfmVar.Q1;
                checkedTextView.setChecked(!checkedTextView.isChecked());
            }
        });
        this.I1 = (FrameLayout) this.D0.findViewById(R.id.odds_filter_container);
        this.J1 = (ImageView) this.D0.findViewById(R.id.odds_filter_expand_btn);
        LinearLayout linearLayout = (LinearLayout) this.D0.findViewById(R.id.odds_filter_value_container);
        this.L1 = linearLayout;
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: zcm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                List<String> list = dfm.v2;
                this.a.p0();
            }
        });
        Q0();
        ((ImageView) this.D0.findViewById(R.id.odds_filter_clear_btn)).setOnClickListener(new View.OnClickListener() { // from class: adm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                List<String> list = dfm.v2;
                OddsFilterSettingView oddsFilterSettingView = this.a.N1;
                if (oddsFilterSettingView != null) {
                    oddsFilterSettingView.J();
                }
            }
        });
        this.K1 = (TextView) this.D0.findViewById(R.id.odds_filter_value_tv);
        TabLayout tabLayout3 = this.c1;
        i iVar = this.o2;
        tabLayout3.o(iVar);
        this.c1.n();
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            mfb0 mfb0Var = (mfb0) obj;
            if (mfb0Var != null) {
                TabLayout.g gVarL = this.c1.l();
                gVarL.e(mfb0Var.c().g(requireContext()));
                gVarL.a = mfb0Var;
                this.c1.b(gVarL);
            }
        }
        this.c1.a(iVar);
        mfb0 mfb0Var2 = (mfb0) this.c1.k(0).a;
        mfb0 mfb0VarE = lfb0.d().e(mfb0Var2.getId());
        this.t1 = mfb0VarE;
        if (mfb0VarE == null) {
            this.t1 = mfb0Var2;
        }
        H0();
        int iE0 = E0(this.d1.getSelectedTabPosition());
        if (iE0 == 0) {
            this.W0.notifyDataSetChanged();
        } else if (iE0 == 1) {
            this.V0.notifyDataSetChanged();
        }
        FeaturedContainer featuredContainer = (FeaturedContainer) this.D0.findViewById(R.id.featured_container);
        this.V1 = featuredContainer;
        featuredContainer.setScope(getViewLifecycleOwner());
        this.V1.setFeaturedTabSelectionListener(new bdm(this));
        FeaturedContainer featuredContainer2 = this.V1;
        final tch tchVar = this.h2;
        Objects.requireNonNull(tchVar);
        featuredContainer2.setFeaturedCodeActionListener(new fz4() { // from class: cdm
            @Override // defpackage.fz4
            public final void a(ez4 ez4Var) {
                tchVar.B1(ez4Var);
            }
        });
        FeaturedContainer featuredContainer3 = this.V1;
        final tch tchVar2 = this.h2;
        Objects.requireNonNull(tchVar2);
        featuredContainer3.setFeaturedCodeRetryListener(new ErrorView.a() { // from class: ddm
            @Override // com.sportybet.android.widget.ErrorView.a
            public final void a() {
                tchVar2.x1();
            }
        });
        this.V1.setActionListener(this);
        this.V1.setOutcomeChangeListener(ncmVar);
        this.V1.setCodeHubImgClickListener(new yfc(this));
        this.E0 = (ConstraintLayout) this.D0.findViewById(R.id.reminder_view);
        this.H0 = (ImageView) this.D0.findViewById(R.id.reminder_close);
        this.F0 = (TextView) this.D0.findViewById(R.id.reminder_hint);
        this.G0 = (TextView) this.D0.findViewById(R.id.reminder_action);
        final ConstraintLayout constraintLayout = (ConstraintLayout) this.D0.findViewById(R.id.home_name_update_hint_container);
        final TextView textView3 = (TextView) this.D0.findViewById(R.id.home_name_update_hint_txt);
        final LinearLayout linearLayout2 = (LinearLayout) this.D0.findViewById(R.id.home_name_update_hint_action_btn);
        this.w1.K0.f(getViewLifecycleOwner(), new lfy() { // from class: ndm
            @Override // defpackage.lfy
            public final void u1(Object obj2) {
                List<String> list = dfm.v2;
                NameUpdateStatus nameUpdateStatusModel = NameUpdateStatusMapperKt.getNameUpdateStatusModel((AccountInfo) obj2);
                boolean z = nameUpdateStatusModel instanceof NameUpdateStatus.Rejected;
                ConstraintLayout constraintLayout2 = constraintLayout;
                if (!z) {
                    constraintLayout2.setVisibility(8);
                    return;
                }
                NameUpdateStatus.Rejected rejected = (NameUpdateStatus.Rejected) nameUpdateStatusModel;
                constraintLayout2.setVisibility(0);
                final dfm dfmVar = this.a;
                String strD = sn5.d(dfmVar, R.string.common_functions__unknown, new Object[0]);
                if (rejected.getReasonTitle() != null) {
                    strD = rejected.getReasonTitle();
                }
                textView3.setText(zch0.j(sn5.d(dfmVar, R.string.page_withdraw__your_request_is_rejected_tip, tug.a("^", strD, "^")), dfmVar.requireContext().getColor(R.color.highlight), 12, null));
                linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: tem
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        List<String> list2 = dfm.v2;
                        int i5 = NameUpdateWebViewActivity.e;
                        NameUpdateWebViewActivity.a.a(dfmVar.requireContext());
                    }
                });
            }
        });
        C0();
        gby.a(this.s1.getDescriptionView(), new rdm(this, i2));
        return this.D0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.E.removeAccountChangeListener(this);
        LivePanel livePanel = this.q0;
        if (livePanel != null) {
            iu2.q(livePanel);
            djs djsVar = livePanel.N;
            if (djsVar != null) {
                djsVar.y = null;
                HashMap map = djsVar.w;
                if (map != null) {
                    map.clear();
                }
                livePanel.N = null;
            }
            livePanel.o();
            nns nnsVar = livePanel.O;
            if (nnsVar != null) {
                nnsVar.e.unsubscribeTopic(new GroupTopic("live^sports"), nnsVar.R);
                nnsVar.E1();
            }
        }
        QuickMarketHelper.disposeAll();
        this.D0 = null;
        this.w1.E1(false);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        k0e0 k0e0Var = this.U0;
        if (k0e0Var != null) {
            k0e0Var.b();
        }
        iu2.q(this.Y0);
        iu2.q(this.W0);
        iu2.q(this.V0);
        if (this.U1 != null) {
            this.U1 = null;
            this.T1 = null;
        }
        ViewTreeObserver viewTreeObserver = this.r2;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.r2.removeOnPreDrawListener(this.s2);
        }
        this.r2 = null;
        FeaturedContainer featuredContainer = this.V1;
        if (featuredContainer != null) {
            ydh ydhVar = featuredContainer.I;
            ydhVar.v.setAdapter(null);
            ydhVar.c.setAdapter(null);
            featuredContainer.getAccountHelper().removeLoginEventListener(featuredContainer.s0);
            featuredContainer.getAccountHelper().removeLogoutEventListener(featuredContainer.t0);
            featuredContainer.M = null;
            this.V1 = null;
        }
        this.J0 = null;
        this.K0 = null;
        super.onDestroyView();
    }

    @Override // defpackage.jr10, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.O0 = false;
        if (qz3.a()) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.a("[Socket] skip unSubscribe in Home", new Object[0]);
        } else {
            SocketPushManager.getInstance().unsubscribeTopic(this.A, this.X0);
            this.A1.i.j(new pgm(2, null));
            this.A1.w.j(new pgm(2, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02cb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [zi50$b] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.List<bby>] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.ArrayList] */
    @Override // defpackage.jr10, androidx.fragment.app.Fragment
    public final void onResume() {
        ?? bVar;
        String strB;
        ?? arrayList;
        mfb0 mfb0Var;
        super.onResume();
        int i2 = 1;
        this.O0 = true;
        iim iimVar = this.w1;
        if (iimVar.W.a.getValue() != null) {
            ej5.c(o8i0.d(iimVar), null, null, new gjm(iimVar, null), 3);
        }
        ku90<Unit> ku90Var = iimVar.P0;
        Unit unit = Unit.a;
        ku90Var.a(unit);
        zru zruVar = iimVar.T;
        if (zruVar.c.getAccount() != null && zruVar.f.compareAndSet(false, true)) {
            jvd0 jvd0Var = zruVar.g;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            zruVar.g = ej5.c(zruVar.a, null, null, new yru(zruVar, null), 3);
        }
        this.A1.i.j(new pgm(3, null));
        this.A1.w.j(new pgm(3, null));
        if (System.currentTimeMillis() - this.m2 > 300000) {
            s0();
        }
        this.w1.A1();
        this.w1.z1(false);
        iim iimVar2 = this.w1;
        iimVar2.getClass();
        ej5.c(o8i0.d(iimVar2), null, null, new jjm(iimVar2, null), 3);
        com.sportybet.android.instantwin.presentation.buildandgo.f fVar = this.E1;
        if (fVar != null && fVar.v.isLogin() && !(fVar.f.w().getValue() instanceof lk50.b)) {
            fVar.u0();
        }
        if (getActivity() != null) {
            y1i0 y1i0Var = this.W1;
            y1i0Var.getClass();
            ej5.c(o8i0.d(y1i0Var), null, null, new a2i0(y1i0Var, null), 3);
        }
        su5<BaseResponse<RealSportsAdsData>> su5Var = this.y0;
        if (su5Var != null) {
            su5Var.cancel();
        }
        this.S.isGetGiftsEnabled(new r6h(this, i2));
        K0();
        if (requireActivity().getIntent().getBooleanExtra("show_registration_successful", false)) {
            boolean booleanExtra = requireActivity().getIntent().getBooleanExtra("is_facial_recognition_deferred", false);
            requireActivity().getIntent().removeExtra("show_registration_successful");
            iim iimVar3 = this.w1;
            iimVar3.y0.m(iimVar3.S.F() ? new tx40(tx40.a.a, false, 14) : new tx40(tx40.a.b, booleanExtra, 6));
        }
        u0();
        iim iimVar4 = this.w1;
        uqm uqmVar = this.E;
        iimVar4.getClass();
        uqmVar.getClass();
        if (uqmVar.getAccount() != null) {
            iimVar4.y.g();
        }
        this.w1.C.b.a(unit);
        iim iimVar5 = this.w1;
        kzh.d(new g1i(iimVar5.G.h(pu0.c.a), new dim(iimVar5, null)), o8i0.d(iimVar5));
        iim iimVar6 = this.w1;
        if (iimVar6.d.isLogin()) {
            ej5.c(o8i0.d(iimVar6), null, null, new djm(iimVar6, null), 3);
            ej5.c(o8i0.d(iimVar6), null, null, new ejm(iimVar6, null), 3);
        }
        iim iimVar7 = this.w1;
        iimVar7.getClass();
        ej5.c(o8i0.d(iimVar7), null, null, new nim(iimVar7, null), 3);
        nns nnsVar = this.q0.O;
        if (nnsVar != null) {
            nnsVar.A1();
        }
        this.G1.y1();
        TabLayout tabLayout = this.e1;
        if ((tabLayout != null ? tabLayout.getTabCount() : -1) <= 0 && (mfb0Var = this.t1) != null && this.e1 != null) {
            J0(this.t1, QuickMarketHelper.getFromStorage(this.w, mfb0Var.getId()));
        }
        int iE0 = E0(this.d1.getSelectedTabPosition());
        if (iE0 == 0) {
            this.W0.notifyDataSetChanged();
        } else if (iE0 == 1) {
            this.V0.notifyDataSetChanged();
        }
        dgy.b.a.a(null);
        SocketPushManager.getInstance().subscribeTopic(this.A, this.X0);
        this.w1.D1();
        iim iimVar8 = this.w1;
        m2l m2lVar = iimVar8.A;
        m2lVar.getClass();
        kzh.d(new g1i(m2lVar.a.getBooleanByFlow("show_nin_reminding", false), new wim(iimVar8, null)), o8i0.d(iimVar8));
        iim iimVar9 = this.w1;
        sr10 sr10Var = iimVar9.z;
        sr10Var.i(o8i0.d(iimVar9));
        sr10Var.d0(o8i0.d(iimVar9));
        ruy ruyVar = this.Z1;
        ruyVar.getClass();
        ruy.x1(ruyVar);
        hby hbyVar = this.F1;
        hbyVar.getClass();
        mjf mjfVar = hbyVar.a;
        ckf ckfVar = ckf.a;
        EarlyPayoutConfig earlyPayoutConfigC = mjfVar.c();
        if (earlyPayoutConfigC != null) {
            try {
                zi50.a aVar = zi50.b;
                List<EarlyPayoutMarketMapping> marketMapping = earlyPayoutConfigC.getMarketMapping();
                if (marketMapping != null) {
                    bVar = new ArrayList(l48.r(marketMapping, 10));
                    for (EarlyPayoutMarketMapping earlyPayoutMarketMapping : marketMapping) {
                        androidx.fragment.app.e activity = getActivity();
                        String strB2 = activity != null ? sn5.b(activity, R.string.component_betslip__early_goals, new Object[0]) : "";
                        androidx.fragment.app.e activity2 = getActivity();
                        if (activity2 != null) {
                            String mappedMarketId = earlyPayoutMarketMapping.getMappedMarketId();
                            if (mappedMarketId == null) {
                                mappedMarketId = "";
                            }
                            String mappedSpecifier = earlyPayoutMarketMapping.getMappedSpecifier();
                            if (mappedSpecifier == null) {
                                mappedSpecifier = "";
                            }
                            strB = dby.b(activity2, mappedMarketId, mappedSpecifier);
                        } else {
                            strB = "";
                        }
                        bVar.add(zay.a(earlyPayoutMarketMapping, strB2, strB));
                    }
                } else {
                    bVar = 0;
                }
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            Throwable thA = zi50.a(bVar);
            ?? r8 = bVar;
            if (thA != null) {
                itf0.a aVar3 = itf0.a;
                aVar3.q("OUEarlyPayoutViewModel");
                aVar3.n(inm.a("Error setupOUEarlyPayoutData: ", thA.getLocalizedMessage()), new Object[0]);
                r8 = m2g.a;
            }
            List list = (List) r8;
            arrayList = list;
            if (list == null) {
                arrayList = m2g.a;
            }
        } else {
            arrayList = m2g.a;
        }
        if (arrayList.isEmpty()) {
            List<bby> list2 = jez.a;
            List<aby> listK = kotlin.collections.b.k(aby.a.a, aby.c.a, aby.b.a);
            arrayList = new ArrayList(l48.r(listK, 10));
            for (aby abyVar : listK) {
                androidx.fragment.app.e activity3 = getActivity();
                String strB3 = activity3 != null ? sn5.b(activity3, R.string.component_betslip__early_goals, new Object[0]) : "";
                androidx.fragment.app.e activity4 = getActivity();
                String strB4 = activity4 != null ? dby.b(activity4, abyVar.a(), abyVar.d()) : "";
                abyVar.getClass();
                arrayList.add(zay.a(new EarlyPayoutMarketMapping(abyVar.c(), abyVar.e(), abyVar.a(), abyVar.d()), strB3, strB4));
            }
        }
        jez.a = arrayList;
        L0(false);
        iim iimVar10 = this.w1;
        iimVar10.getClass();
        ej5.c(o8i0.d(iimVar10), null, null, new bim(iimVar10, null), 3);
        iim iimVar11 = this.w1;
        w6f w6fVar = iimVar11.O;
        w6fVar.getClass();
        kzh.d(ozh.c(new v6f(new gzh(Unit.a), w6fVar), w6fVar.d), o8i0.d(iimVar11));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        dty dtyVar = this.a2.g;
        dtyVar.a.clear();
        dtyVar.b = false;
        nns nnsVar = this.q0.O;
        if (nnsVar != null) {
            ISocketPushManager iSocketPushManager = nnsVar.e;
            iSocketPushManager.subscribeTopic(new GroupTopic("live^sports"), nnsVar.R);
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_LIVE_PANEL);
            HashMap map = nnsVar.B;
            aVar.a("subscribeMarketTopics [" + map.size() + "]: " + map.keySet(), new Object[0]);
            for (Map.Entry entry : map.entrySet()) {
                iSocketPushManager.subscribeTopic((Topic) entry.getKey(), (Subscriber) entry.getValue());
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (qz3.a()) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.a("[Socket] skip unSubscribe in Home", new Object[0]);
        } else {
            nns nnsVar = this.q0.O;
            if (nnsVar != null) {
                nnsVar.e.unsubscribeTopic(new GroupTopic("live^sports"), nnsVar.R);
                nnsVar.E1();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.a2.c(getViewLifecycleOwner());
        i2i.b(this.Y1.d).f(getViewLifecycleOwner(), new lfy() { // from class: fdm
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                List<String> list = dfm.v2;
                final dfm dfmVar = this.a;
                boolean z = dfmVar.k1.getVisibility() == 0;
                dfmVar.k1.setVisibility(zBooleanValue ? 0 : 8);
                if (!zBooleanValue || z) {
                    return;
                }
                final View viewFindViewById = dfmVar.D0.findViewById(R.id.search);
                qry.a(viewFindViewById, new Runnable() { // from class: odm
                    @Override // java.lang.Runnable
                    public final void run() {
                        List<String> list2 = dfm.v2;
                        int[] iArr = new int[2];
                        int[] iArr2 = new int[2];
                        dfm dfmVar2 = dfmVar;
                        dfmVar2.D0.getLocationOnScreen(iArr);
                        View view2 = viewFindViewById;
                        view2.getLocationOnScreen(iArr2);
                        dfmVar2.k1.setTranslationX(Math.max(0.0f, Math.min((((view2.getWidth() / 2.0f) + (iArr2[0] - iArr[0])) - (dfmVar2.k1.getWidth() / 2.0f)) + (dfmVar2.getResources().getDisplayMetrics().density * 4.0f), dfmVar2.D0.getWidth() - dfmVar2.k1.getWidth())));
                    }
                });
            }
        });
        this.g2.f.f(getViewLifecycleOwner(), new lfy() { // from class: wbm
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                Boolean bool = (Boolean) obj;
                List<String> list = dfm.v2;
                dfm dfmVar = this.a;
                hk80 hk80Var = dfmVar.T1;
                if (hk80Var != null) {
                    hk80Var.c.setVisibility(bool.booleanValue() ? 0 : 8);
                    dfmVar.T1.d.setVisibility(bool.booleanValue() ? 0 : 8);
                }
            }
        });
        ((njs) this.Z1.d.getValue()).f(getViewLifecycleOwner(), new lfy() { // from class: hcm
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                uvy uvyVar = (uvy) obj;
                List<String> list = dfm.v2;
                if (uvyVar == null) {
                    return;
                }
                final dfm dfmVar = this.a;
                dfmVar.q0.setupUpMarketViews();
                nns nnsVar = dfmVar.q0.O;
                if (nnsVar != null) {
                    nnsVar.A1();
                }
                zuy zuyVarA = vuy.a(uvyVar);
                OneUpTwoUpSwitch oneUpTwoUpSwitch = dfmVar.p1;
                if (oneUpTwoUpSwitch != null) {
                    zuy zuyVarE = hih0.e(oneUpTwoUpSwitch.getA());
                    avy avyVarG = hih0.g(dfmVar.p1.getB());
                    if (zuyVarE != zuyVarA && avyVarG == avy.c) {
                        hih0.a(dfmVar.p1, zuyVarA);
                    }
                }
                QuickMarketHelper.fetch(dfmVar.w, dfmVar.t1.getId(), new QuickMarketHelper.FetchCallback() { // from class: udm
                    @Override // com.sportybet.plugin.realsports.data.QuickMarketHelper.FetchCallback
                    public final void onResult(List list2) {
                        List<String> list3 = dfm.v2;
                        dfm dfmVar2 = dfmVar;
                        dfmVar2.e1.post(new oq3(1, dfmVar2, list2));
                    }
                });
            }
        });
        this.v1.D.f(getViewLifecycleOwner(), new lfy() { // from class: jcm
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                List<Market> list;
                String str;
                String str2;
                e880 e880Var = (e880) obj;
                List<String> list2 = dfm.v2;
                if (e880Var != null) {
                    dfm dfmVar = this.a;
                    kkl kklVar = dfmVar.W0;
                    if (kklVar != null) {
                        Selection selection = e880Var.a;
                        String str3 = selection.a.eventId;
                        String str4 = selection.b.id;
                        ArrayList arrayList = kklVar.c;
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj2 = arrayList.get(i2);
                            i2++;
                            jpc jpcVar = (jpc) obj2;
                            if (jpcVar instanceof ing) {
                                Event event = ((ing) jpcVar).a;
                                if (str3.equals(event.eventId)) {
                                    for (Market market : event.markets) {
                                        String str5 = market.specifier;
                                        boolean z = (str5 == null && e880Var.a.b.specifier == null) || ((str2 = e880Var.a.b.specifier) != null && str2.equals(str5));
                                        if (market.id.equals(str4) && z) {
                                            market.update(e880Var.b);
                                            kklVar.n();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    bzf0 bzf0Var = dfmVar.V0;
                    if (bzf0Var != null) {
                        Selection selection2 = e880Var.a;
                        String str6 = selection2.a.eventId;
                        String str7 = selection2.b.id;
                        ArrayList arrayList2 = bzf0Var.c;
                        int size2 = arrayList2.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj3 = arrayList2.get(i3);
                            i3++;
                            Event event2 = (Event) obj3;
                            if (event2.eventId.equals(str6) && (list = event2.markets) != null) {
                                for (Market market2 : list) {
                                    String str8 = market2.specifier;
                                    boolean z2 = (str8 == null && e880Var.a.b.specifier == null) || ((str = e880Var.a.b.specifier) != null && str.equals(str8));
                                    if (str7.equals(market2.id) && z2) {
                                        market2.update(e880Var.b);
                                        bzf0Var.n();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        });
        this.J.d(view, "fs-unmask");
        this.J.d(this.k0, "fs-mask");
        this.y1.i.f(getViewLifecycleOwner(), new lfy() { // from class: kcm
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                dfm dfmVar;
                RealSportsAds realSportsAds;
                List<String> list = dfm.v2;
                if (!Boolean.FALSE.equals((Boolean) obj) || (realSportsAds = (dfmVar = this.a).h1) == null) {
                    return;
                }
                dfmVar.M.c(realSportsAds.getImgUrl(), new jfm(dfmVar, realSportsAds));
            }
        });
        i2i.b(this.w1.L0).f(getViewLifecycleOwner(), new lfy() { // from class: lcm
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                List<String> list = dfm.v2;
                this.a.V1.setGamesForYouEnabled(((Boolean) obj).booleanValue());
            }
        });
        i2i.b(this.w1.n0).f(getViewLifecycleOwner(), new lfy() { // from class: mcm
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                Intent intent;
                FeaturedDisplayData featuredDisplayData = (FeaturedDisplayData) obj;
                List<String> list = dfm.v2;
                if (featuredDisplayData == null) {
                    return;
                }
                dfm dfmVar = this.a;
                e activity = dfmVar.getActivity();
                boolean booleanExtra = false;
                if (activity != null && (intent = activity.getIntent()) != null) {
                    booleanExtra = intent.getBooleanExtra("select_bng_tab", false);
                    intent.removeExtra("select_bng_tab");
                }
                dfmVar.V1.T(featuredDisplayData, dfmVar.E1, booleanExtra);
            }
        });
        i2i.b(this.w1.Q0).f(getViewLifecycleOwner(), new lfy() { // from class: ocm
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                List<String> list = dfm.v2;
                this.a.x1.x1(new com.sportybet.feature.luckynumber.featurematch.presentation.a.h((q7q) obj));
            }
        });
        this.w1.r0.f(getViewLifecycleOwner(), new lfy() { // from class: pcm
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                UIState uIState = (UIState) obj;
                List<String> list = dfm.v2;
                boolean z = uIState instanceof UIState.Loading;
                dfm dfmVar = this.a;
                if (z) {
                    bzf0 bzf0Var = dfmVar.V0;
                    bzf0Var.w = ioa.a.a;
                    bzf0Var.d.clear();
                    bzf0Var.i();
                    return;
                }
                boolean z2 = uIState instanceof UIState.Success;
                ioa.a aVar = ioa.a.c;
                if (!z2) {
                    if (uIState instanceof UIState.Error) {
                        bzf0 bzf0Var2 = dfmVar.V0;
                        bzf0Var2.w = aVar;
                        bzf0Var2.n();
                        return;
                    }
                    return;
                }
                if (dfmVar.T0.getAdapter() == dfmVar.Z0) {
                    dfmVar.a2.d();
                }
                bzf0 bzf0Var3 = dfmVar.V0;
                List list2 = (List) uIState.getData();
                ArrayList arrayList = bzf0Var3.c;
                try {
                    arrayList.clear();
                    arrayList.addAll(list2);
                    bzf0Var3.w = ioa.a.d;
                    ioa.b(1, System.currentTimeMillis());
                    bzf0Var3.n();
                } catch (Exception unused) {
                    bzf0Var3.w = aVar;
                    bzf0Var3.n();
                }
                dfmVar.L0(false);
            }
        });
        this.w1.t0.f(getViewLifecycleOwner(), new lfy() { // from class: qcm
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                UIState uIState = (UIState) obj;
                List<String> list = dfm.v2;
                boolean z = uIState instanceof UIState.Success;
                dfm dfmVar = this.a;
                if (!z) {
                    if (uIState instanceof UIState.Error) {
                        dfmVar.W0.o(false);
                        return;
                    }
                    return;
                }
                if (dfmVar.T0.getAdapter() == dfmVar.a1) {
                    dfmVar.a2.d();
                }
                kkl kklVar = dfmVar.W0;
                HighlightData highlightData = (HighlightData) uIState.getData();
                kklVar.getClass();
                kklVar.f = highlightData.getCustomEvents();
                kklVar.i = highlightData.getTournaments();
                kklVar.v = highlightData.getHighlightEvents();
                kklVar.o(true);
            }
        });
        this.w1.v0.f(getViewLifecycleOwner(), new lfy() { // from class: qdm
            /* JADX WARN: Code duplicated, block: B:17:0x004f  */
            /* JADX WARN: Code duplicated, block: B:19:0x0055  */
            /* JADX WARN: Code duplicated, block: B:20:0x005e  */
            /* JADX WARN: Code duplicated, block: B:22:0x0062  */
            /* JADX WARN: Code duplicated, block: B:24:0x0068  */
            /* JADX WARN: Code duplicated, block: B:26:0x006e  */
            /* JADX WARN: Code duplicated, block: B:27:0x0073  */
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                UIState uIState = (UIState) obj;
                List<String> list = dfm.v2;
                boolean z = uIState instanceof UIState.Success;
                dfm dfmVar = this.a;
                if (!z) {
                    if (uIState instanceof UIState.Error) {
                        kkl kklVar = dfmVar.W0;
                        c6g0 c6g0Var = (c6g0) uIState.getData();
                        int iIndexOf = kklVar.d.indexOf(c6g0Var);
                        if (iIndexOf == -1) {
                            return;
                        }
                        c6g0Var.y = 3;
                        kklVar.j(iIndexOf);
                        return;
                    }
                    return;
                }
                kkl kklVar2 = dfmVar.W0;
                c6g0 c6g0Var2 = (c6g0) uIState.getData();
                ArrayList arrayList = kklVar2.d;
                int iIndexOf2 = arrayList.indexOf(c6g0Var2);
                if (iIndexOf2 == -1) {
                    return;
                }
                ArrayList arrayListB = c6g0Var2.b(kklVar2.y.a, kklVar2.E, kklVar2.F, true);
                if (!xvy.i(kklVar2.y)) {
                    RegularMarketRule regularMarketRule = kklVar2.y;
                    String str = regularMarketRule != null ? regularMarketRule.a : null;
                    slc.a.getClass();
                    if (!Intrinsics.g(str, slc.d) && !yay.f(kklVar2.y)) {
                        if (c6g0Var2.e) {
                            if (arrayListB.isEmpty()) {
                                c6g0Var2.e = true;
                                c6g0Var2.w = true;
                            } else {
                                int i2 = iIndexOf2 + 1;
                                arrayList.addAll(i2, c6g0Var2.b(kklVar2.y.a, kklVar2.E, kklVar2.F, true));
                                c6g0Var2.e = true;
                                kklVar2.k(i2, arrayListB.size());
                            }
                        } else if (arrayListB.isEmpty()) {
                            c6g0Var2.e = true;
                            c6g0Var2.w = true;
                        } else {
                            int i3 = iIndexOf2 + 1;
                            arrayList.addAll(i3, c6g0Var2.b(kklVar2.y.a, kklVar2.E, kklVar2.F, true));
                            c6g0Var2.e = true;
                            kklVar2.k(i3, arrayListB.size());
                        }
                        c6g0Var2.y = 2;
                    } else if (arrayListB.isEmpty()) {
                        c6g0Var2.e = false;
                        c6g0Var2.w = false;
                        c6g0Var2.y = 4;
                    } else {
                        if (c6g0Var2.e) {
                            if (arrayListB.isEmpty()) {
                                c6g0Var2.e = true;
                                c6g0Var2.w = true;
                            } else {
                                int i4 = iIndexOf2 + 1;
                                arrayList.addAll(i4, c6g0Var2.b(kklVar2.y.a, kklVar2.E, kklVar2.F, true));
                                c6g0Var2.e = true;
                                kklVar2.k(i4, arrayListB.size());
                            }
                        } else if (arrayListB.isEmpty()) {
                            c6g0Var2.e = true;
                            c6g0Var2.w = true;
                        } else {
                            int i5 = iIndexOf2 + 1;
                            arrayList.addAll(i5, c6g0Var2.b(kklVar2.y.a, kklVar2.E, kklVar2.F, true));
                            c6g0Var2.e = true;
                            kklVar2.k(i5, arrayListB.size());
                        }
                        c6g0Var2.y = 2;
                    }
                } else if (arrayListB.isEmpty()) {
                    c6g0Var2.e = false;
                    c6g0Var2.w = false;
                    c6g0Var2.y = 4;
                } else {
                    if (c6g0Var2.e || arrayListB.isEmpty()) {
                        if (arrayListB.isEmpty()) {
                            c6g0Var2.e = true;
                            c6g0Var2.w = true;
                        } else {
                            int i6 = iIndexOf2 + 1;
                            arrayList.addAll(i6, c6g0Var2.b(kklVar2.y.a, kklVar2.E, kklVar2.F, true));
                            c6g0Var2.e = true;
                            kklVar2.k(i6, arrayListB.size());
                        }
                    }
                    c6g0Var2.y = 2;
                }
                kklVar2.j(iIndexOf2);
            }
        });
        this.w1.x0.f(getViewLifecycleOwner(), new lfy() { // from class: zdm
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                ArrayList arrayList;
                ArrayList arrayList2;
                UIState uIState = (UIState) obj;
                List<String> list = dfm.v2;
                boolean z = uIState instanceof UIState.Loading;
                dfm dfmVar = this.a;
                if (z) {
                    a7b a7bVar = dfmVar.Y0;
                    a7bVar.b = 0;
                    a7bVar.a.clear();
                    a7bVar.notifyDataSetChanged();
                    return;
                }
                if (!(uIState instanceof UIState.Success)) {
                    if (uIState instanceof UIState.Error) {
                        a7b a7bVar2 = dfmVar.Y0;
                        a7bVar2.b = 2;
                        a7bVar2.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                a7b a7bVar3 = dfmVar.Y0;
                SportGroup sportGroup = (SportGroup) uIState.getData();
                ArrayList arrayList3 = a7bVar3.a;
                ioa.b(2, System.currentTimeMillis());
                List<Sport> list2 = sportGroup.sportList;
                List<Sport> list3 = sportGroup.popularEvents;
                if (list2 == null && list3 == null) {
                    a7bVar3.b = 1;
                    a7bVar3.notifyDataSetChanged();
                    return;
                }
                arrayList3.clear();
                if (list3 != null && list3.size() != 0) {
                    for (Sport sport : list3) {
                        if (sport.id.equals(a7bVar3.d)) {
                            List<Categories> list4 = sport.categories;
                            if (list4 == null || list4.size() == 0) {
                                break;
                            }
                            int i2 = 0;
                            while (true) {
                                if (i2 >= sport.categories.size()) {
                                    i2 = -1;
                                    break;
                                }
                                String str = sport.categories.get(i2).id;
                                AccountHelperEntryPointImpl accountHelperEntryPointImpl = yrh0.a;
                                if (TextUtils.equals(str, "sr:category:top")) {
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                            if (i2 != -1 && i2 < sport.categories.size()) {
                                sport.categories.remove(i2);
                            }
                        }
                    }
                }
                ArrayList arrayList4 = kgb0.a;
                if (list3 == null || list3.size() == 0) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    new c7b();
                    Iterator<Sport> it = list3.iterator();
                    while (it.hasNext()) {
                        List<Categories> list5 = it.next().categories;
                        if (list5 != null) {
                            for (Categories categories : list5) {
                                b7b b7bVar = new b7b();
                                b7bVar.b = categories.id;
                                b7bVar.a = categories.name;
                                b7bVar.f = categories.eventSize;
                                ArrayList arrayList5 = new ArrayList();
                                List<Tournaments> list6 = categories.tournaments;
                                if (list6 != null) {
                                    for (Tournaments tournaments : list6) {
                                        arrayList5.add(new q7b(tournaments.name, tournaments.id, b7bVar.b, tournaments.eventSize));
                                    }
                                    b7bVar.e = arrayList5;
                                    arrayList.add(b7bVar);
                                }
                            }
                        }
                    }
                }
                if (arrayList != null) {
                    arrayList3.addAll(arrayList);
                }
                boolean z2 = arrayList != null && arrayList.size() > 0;
                if (list2 != null && list2.size() == 1) {
                    List<Sport> list7 = sportGroup.sportList;
                    String strB = z2 ? sn5.b(yrh0.j(), R.string.common_functions__a_z, new Object[0]) : null;
                    if (list7 == null || list7.size() == 0) {
                        arrayList2 = null;
                    } else {
                        arrayList2 = new ArrayList();
                        c7b c7bVar = new c7b();
                        boolean zEquals = "sr:sport:1".equals(list7.get(0).id);
                        if (TextUtils.isEmpty(strB)) {
                            c7bVar.a = sn5.b(yrh0.j(), zEquals ? R.string.wap_home__countries : R.string.common_functions__categories, new Object[0]);
                        } else {
                            c7bVar.a = strB;
                        }
                        arrayList2.add(c7bVar);
                        Iterator<Sport> it2 = list7.iterator();
                        while (it2.hasNext()) {
                            List<Categories> list8 = it2.next().categories;
                            if (list8 != null) {
                                final Collator collator = Collator.getInstance(Locale.getDefault());
                                Collections.sort(list8, new Comparator() { // from class: jgb0
                                    @Override // java.util.Comparator
                                    public final int compare(Object obj2, Object obj3) {
                                        return collator.compare(((Categories) obj2).name, ((Categories) obj3).name);
                                    }
                                });
                                for (Categories categories2 : list8) {
                                    b7b b7bVar2 = new b7b();
                                    b7bVar2.b = categories2.id;
                                    b7bVar2.a = categories2.name;
                                    b7bVar2.f = categories2.eventSize;
                                    ArrayList arrayList6 = new ArrayList();
                                    List<Tournaments> list9 = categories2.tournaments;
                                    if (list9 != null) {
                                        for (Tournaments tournaments2 : list9) {
                                            arrayList6.add(new q7b(tournaments2.name, tournaments2.id, b7bVar2.b, tournaments2.eventSize));
                                        }
                                        b7bVar2.e = arrayList6;
                                        arrayList2.add(b7bVar2);
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList3.addAll(arrayList2);
                    }
                }
                a7bVar3.notifyDataSetChanged();
            }
        });
        this.w1.z0.f(getViewLifecycleOwner(), new lfy() { // from class: kem
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                tx40 tx40Var = (tx40) obj;
                List<String> list = dfm.v2;
                tx40.a aVar = tx40Var.a;
                tx40.a aVar2 = tx40.a.a;
                dfm dfmVar = this.a;
                if (aVar == aVar2) {
                    dfmVar.N.e(wae.DEPOSIT, x6.a("show_registration_successful_dialog", true));
                    return;
                }
                Context contextRequireContext = dfmVar.requireContext();
                js40 js40Var = tx40Var.b;
                boolean z = tx40Var.c;
                RegistrationSuccessfulActivity.d.getClass();
                RegistrationSuccessfulActivity.a.a(contextRequireContext, js40Var, false, z);
            }
        });
        this.w1.b0.f(getViewLifecycleOwner(), new lfy() { // from class: rem
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                final rbm rbmVar = (rbm) obj;
                List<String> list = dfm.v2;
                int i2 = rbmVar.b;
                final dfm dfmVar = this.a;
                boolean z = (dfmVar.F.x() && i2 == 310) || (dfmVar.F.n() && UserCertStatusRules.isNgNameConfirmRequired(i2));
                if (dfmVar.E.isLogin() && z) {
                    dfmVar.p0.setVisibility(0);
                } else {
                    dfmVar.p0.setVisibility(8);
                }
                AssetsInfo assetsInfo = rbmVar.a;
                boolean z2 = rbmVar.c;
                if (dfmVar.E.getAccount() == null) {
                    dfmVar.r0.setVisibility(8);
                } else if (assetsInfo != null) {
                    dfmVar.r0.setVisibility(assetsInfo.balance == 0 ? 0 : 8);
                    if (z2) {
                        boolean zS = dfmVar.F.S();
                        TextView textView = dfmVar.k0;
                        if (zS) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(dfmVar.F.b());
                            long j2 = assetsInfo.balance;
                            int i3 = j2 < 0 ? 3 : 2;
                            BigDecimal bigDecimalDivide = BigDecimal.valueOf(j2).divide(BigDecimal.valueOf(10000L), 2, RoundingMode.HALF_UP);
                            Locale locale = Locale.US;
                            zug.b(sb, String.format(locale, "%1$,d", Long.valueOf(bigDecimalDivide.longValue())).length() > 7 ? String.format(locale, "%,.2f", bigDecimalDivide).substring(0, i3 + 7).concat("...") : String.format(locale, "%,.2f", bigDecimalDivide), textView);
                        } else {
                            textView.setText(v4c.a.h(assetsInfo.balance));
                        }
                    } else {
                        dfmVar.k0.setText(dfmVar.F.b() + "******");
                    }
                }
                c8i0.b(dfmVar.o0, 300L, new Function1() { // from class: pdm
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        AssetsInfo assetsInfo2;
                        List<String> list2 = dfm.v2;
                        dfm dfmVar2 = dfmVar;
                        if (dfmVar2.E.getAccount() == null || (assetsInfo2 = rbmVar.a) == null) {
                            dfmVar2.J.f(AnalyticsEvent.KYC_HEADER_LOGIN_BUTTON, Collections.EMPTY_MAP);
                            dfmVar2.E.demandAccount(dfmVar2.getActivity(), dfmVar2);
                            dfmVar2.S.disableGetGifts();
                            dfmVar2.s0.setVisibility(8);
                        } else if (dfmVar2.l0.a == zsp.a.d) {
                            Context contextRequireContext = dfmVar2.requireContext();
                            KycVerificationInProgressBottomSheetActivity.d.getClass();
                            contextRequireContext.getClass();
                            Intent intent = new Intent(contextRequireContext, (Class<?>) KycVerificationInProgressBottomSheetActivity.class);
                            wup wupVar = wup.HOME;
                            intent.putExtra("source", "home");
                            intent.putExtra("action", "TRANSACTION");
                            contextRequireContext.startActivity(intent);
                        } else {
                            dfmVar2.d0.a(assetsInfo2.balance, dfmVar2.requireActivity(), BalanceButtonPage.HOME);
                        }
                        return Unit.a;
                    }
                });
            }
        });
        this.w1.c0.f(getViewLifecycleOwner(), new lfy() { // from class: cfm
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                zsp zspVar = (zsp) obj;
                List<String> list = dfm.v2;
                final dfm dfmVar = this.a;
                if (dfmVar.F.x() || dfmVar.F.n()) {
                    dfmVar.l0 = zspVar;
                    fgm fgmVarA = ggm.a(zspVar);
                    ComposeView composeView = (ComposeView) dfmVar.D0.findViewById(R.id.home_kyc_hint_container);
                    pdd0 pdd0Var = fgmVarA.b;
                    if (dfmVar.F.x() && pdd0Var != null) {
                        gym.a(dfmVar.R, pdd0Var);
                    }
                    ysp.b(new ysp.a() { // from class: mem
                        @Override // ysp.a
                        public final void b(zsp zspVar2) {
                            List<String> list2 = dfm.v2;
                            fgm fgmVarA2 = ggm.a(zspVar2);
                            pdd0 pdd0Var2 = fgmVarA2.c;
                            dfm dfmVar2 = dfmVar;
                            if (dfmVar2.F.x() && pdd0Var2 != null) {
                                gym.a(dfmVar2.R, pdd0Var2);
                            }
                            Intent intentB = dfmVar2.c0.b(dfmVar2.requireActivity(), fgmVarA2.a, zspVar2);
                            if (intentB != null) {
                                yrh0.s(dfmVar2.requireActivity(), intentB, true);
                            }
                        }
                    }, new ysp.a() { // from class: nem
                        @Override // ysp.a
                        public final void b(zsp zspVar2) {
                            List<String> list2 = dfm.v2;
                            fgm fgmVarA2 = ggm.a(zspVar2);
                            pdd0 pdd0Var2 = fgmVarA2.d;
                            dfm dfmVar2 = dfmVar;
                            if (dfmVar2.F.x() && pdd0Var2 != null) {
                                gym.a(dfmVar2.R, pdd0Var2);
                            }
                            Context contextRequireContext = dfmVar2.requireContext();
                            String str = zspVar2.c;
                            KycSource kycSource = fgmVarA2.a;
                            int i2 = KycRejectBottomSheetActivity.d;
                            contextRequireContext.getClass();
                            kycSource.getClass();
                            Intent intent = new Intent(contextRequireContext, (Class<?>) KycRejectBottomSheetActivity.class);
                            intent.putExtra("reject_reason", str);
                            intent.putExtra("source", kycSource.getValue());
                            contextRequireContext.startActivity(intent);
                        }
                    }, zspVar, composeView);
                }
            }
        });
        int i2 = 1;
        if (this.E.getAccount() != null) {
            this.H1.x1(true);
        }
        this.A1.f.f(getViewLifecycleOwner(), new lfy() { // from class: sbm
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                pgm pgmVar = (pgm) obj;
                List<String> list = dfm.v2;
                int i3 = pgmVar.a;
                List<BroadcastConfig.Info> list2 = pgmVar.b;
                if (1 == i3) {
                    int i4 = 0;
                    BroadcastConfig.Info info = (list2 == null || list2.size() <= 0) ? null : list2.get(0);
                    dfm dfmVar = this.a;
                    if (info == null || TextUtils.isEmpty(info.getText())) {
                        dfmVar.Q0.setVisibility(8);
                        return;
                    }
                    boolean zIsEmpty = TextUtils.isEmpty(info.getUrl());
                    EllipsizingTextView ellipsizingTextView = dfmVar.P0;
                    if (zIsEmpty) {
                        ellipsizingTextView.setViewMore(false);
                        dfmVar.P0.setText(info.getText());
                        dfmVar.Q0.setOnClickListener(null);
                    } else {
                        ellipsizingTextView.setViewMore(true);
                        dfmVar.P0.setText(info.getText());
                        dfmVar.Q0.setOnClickListener(new vdm(info, i4));
                    }
                    dfmVar.Q0.setVisibility(0);
                }
            }
        });
        this.A1.v.f(getViewLifecycleOwner(), new lfy() { // from class: tbm
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                pgm pgmVar = (pgm) obj;
                List<String> list = dfm.v2;
                int i3 = pgmVar.a;
                List<BroadcastConfig.Info> list2 = pgmVar.b;
                dfm dfmVar = this.a;
                if (i3 == 1) {
                    boolean z = (list2 == null || list2.isEmpty()) ? false : true;
                    dfmVar.R0.b.c();
                    dfmVar.R0.setVisibility(z ? 0 : 8);
                    dfmVar.R0.setInfo(list2);
                    boolean zD0 = dfmVar.D0();
                    MidBroadcastPanel midBroadcastPanel = dfmVar.R0;
                    if (!zD0) {
                        midBroadcastPanel.b.c();
                        return;
                    }
                    MarqueeView marqueeView = midBroadcastPanel.b;
                    if (marqueeView.w) {
                        return;
                    }
                    marqueeView.b(true);
                    return;
                }
                if (i3 == 2) {
                    dfmVar.R0.b.c();
                    return;
                }
                if (i3 != 3) {
                    return;
                }
                boolean zD1 = dfmVar.D0();
                MidBroadcastPanel midBroadcastPanel2 = dfmVar.R0;
                if (!zD1) {
                    midBroadcastPanel2.b.c();
                    return;
                }
                MarqueeView marqueeView2 = midBroadcastPanel2.b;
                if (marqueeView2.w) {
                    return;
                }
                marqueeView2.b(false);
            }
        });
        this.A1.y.f(getViewLifecycleOwner(), new a());
        FeaturedContainer featuredContainer = this.V1;
        iim iimVar = this.w1;
        b390 b390Var = iimVar.j0;
        b390 b390Var2 = iimVar.h0;
        featuredContainer.getClass();
        b390Var.getClass();
        b390Var2.getClass();
        nas nasVar = featuredContainer.M;
        int i3 = 0;
        if (nasVar != null) {
            kzh.d(new g1i(r0i.e(b390Var, b390Var2), new rdh(featuredContainer, null)), nasVar);
        }
        if (this.F.r() && this.E.isLogin()) {
            soh sohVar = soh.c;
            ubm ubmVar = new ubm(this, i3);
            sohVar.getClass();
            eth ethVar = (eth) soh.v.getValue();
            if (ethVar != null) {
                j1b j1bVar = soh.i;
                muc mucVar = new muc(ubmVar, i2);
                j1bVar.getClass();
                or60 or60Var = new or60(new esh(ethVar.a, null));
                pfd pfdVar = fse.a;
                lyh lyhVarC = ozh.c(or60Var, odd.b);
                if (lyhVarC != null) {
                    kzh.d(new g1i(bm50.b(lyhVarC, vch0.b), new dth(mucVar, null)), j1bVar);
                }
            }
        }
        if (this.F.r()) {
            final ConstraintLayout constraintLayout = (ConstraintLayout) this.D0.findViewById(R.id.home_notification_bar);
            this.w1.B0.f(getViewLifecycleOwner(), new lfy() { // from class: ldm
                @Override // defpackage.lfy
                public final void u1(Object obj) {
                    HomeNotification homeNotification = (HomeNotification) obj;
                    List<String> list = dfm.v2;
                    ConstraintLayout constraintLayout2 = constraintLayout;
                    TextView textView = (TextView) constraintLayout2.findViewById(R.id.home_notification_hint);
                    TextView textView2 = (TextView) constraintLayout2.findViewById(R.id.home_notification_action);
                    View viewFindViewById = constraintLayout2.findViewById(R.id.home_notification_close);
                    if (!(homeNotification instanceof HomeNotification.Show)) {
                        constraintLayout2.setVisibility(8);
                        return;
                    }
                    HomeNotification.Show show = (HomeNotification.Show) homeNotification;
                    constraintLayout2.setVisibility(0);
                    textView.setText(show.getHint());
                    textView2.setText(show.getActionLabel());
                    textView2.setOnClickListener(new oem(show, 0));
                    if (!show.getDismissible()) {
                        viewFindViewById.setVisibility(8);
                    } else {
                        viewFindViewById.setOnClickListener(new pem(show));
                        viewFindViewById.setVisibility(0);
                    }
                }
            });
        }
        this.D.g.f(getViewLifecycleOwner(), new lfy() { // from class: vbm
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                List<String> list = dfm.v2;
                if (((wjh0) obj).equals(wjh0.b)) {
                    this.a.R0();
                }
            }
        });
        androidx.fragment.app.e eVarRequireActivity = requireActivity();
        eVarRequireActivity.getClass();
        v8i0 viewModelStore = eVarRequireActivity.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = eVarRequireActivity.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, sd7.a(eVarRequireActivity, viewModelStore, defaultViewModelProviderFactory));
        dq7 dq7VarA = jq40.a(n0z.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.B1 = (n0z) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        if (this.C1 == null) {
            androidx.fragment.app.e eVarRequireActivity2 = requireActivity();
            eVarRequireActivity2.getClass();
            v8i0 viewModelStore2 = eVarRequireActivity2.getViewModelStore();
            r8i0.c defaultViewModelProviderFactory2 = eVarRequireActivity2.getDefaultViewModelProviderFactory();
            s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, sd7.a(eVarRequireActivity2, viewModelStore2, defaultViewModelProviderFactory2));
            dq7 dq7VarA2 = jq40.a(ohm.class);
            String strI2 = dq7VarA2.i();
            if (strI2 == null) {
                hb5.a("Local and anonymous classes can not be ViewModels");
                return;
            } else {
                ohm ohmVar = (ohm) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
                this.C1 = ohmVar;
                ohmVar.x1();
            }
        }
        ohm ohmVar2 = this.C1;
        thm.j jVar = new thm.j();
        Object[] objArr = {k00.d, k00.c};
        ArrayList arrayList = new ArrayList(2);
        for (int i4 = 0; i4 < 2; i4++) {
            Object obj = objArr[i4];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        ohmVar2.y1(new zgm.d(jVar, Collections.unmodifiableList(arrayList)));
        ((HomeShortcutRowComposeView) this.D0.findViewById(R.id.side_panel_banner)).b(this.C1.w, this.N, new xbm(this, 0), new ybm(this));
        v8i0 viewModelStore3 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory3 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore3.getClass();
        defaultViewModelProviderFactory3.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var3 = new s8i0(viewModelStore3, defaultViewModelProviderFactory3, defaultViewModelCreationExtras);
        dq7 dq7VarA3 = jq40.a(y1i0.class);
        String strI3 = dq7VarA3.i();
        if (strI3 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        y1i0 y1i0Var = (y1i0) s8i0Var3.a(dq7VarA3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI3));
        this.W1 = y1i0Var;
        y1i0Var.y1(this.V);
        i2i.b(this.W1.a.m).f(getViewLifecycleOwner(), new lfy() { // from class: zbm
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.lfy
            public final void u1(Object obj2) {
                VersionCheckResults versionCheckResults = (VersionCheckResults) obj2;
                List<String> list = dfm.v2;
                dfm dfmVar = this.a;
                e eVarA = rvi.a(dfmVar);
                if (eVarA != null) {
                    if (versionCheckResults instanceof VersionCheckResults.UpdateRequired) {
                        AccountHelperEntryPointImpl accountHelperEntryPointImpl = tzf0.a;
                        new t2y(eVarA).b.cancel(null, 500000);
                        return;
                    }
                    if (versionCheckResults instanceof VersionCheckResults.UpdateAvailable) {
                        dfmVar.g1 = false;
                        if (eVarA instanceof MainActivity) {
                            wwd0 wwd0Var = ((MainActivity) eVarA).I.a0;
                            Boolean bool = Boolean.TRUE;
                            wwd0Var.getClass();
                            wwd0Var.k(null, bool);
                        }
                    } else {
                        dfmVar.g1 = true;
                    }
                    wyy wyyVar = (wyy) dfmVar.B1.A.d();
                    tzf0.j(eVarA, wyyVar != null ? wyyVar.a : 0);
                }
            }
        });
        this.w1.p0.f(getViewLifecycleOwner(), new lfy() { // from class: lem
            @Override // defpackage.lfy
            public final void u1(Object obj2) {
                List<String> list = dfm.v2;
                if (((Boolean) obj2).booleanValue()) {
                    dfm dfmVar = this.a;
                    dfmVar.startActivity(new Intent(dfmVar.requireContext(), (Class<?>) NINReVerifyActivity.class));
                    iim iimVar2 = dfmVar.w1;
                    iimVar2.getClass();
                    ej5.c(o8i0.d(iimVar2), null, null, new cim(iimVar2, null), 3);
                }
            }
        });
        r5b r5bVarB = i2i.b(this.h2.V);
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        final FeaturedContainer featuredContainer2 = this.V1;
        Objects.requireNonNull(featuredContainer2);
        r5bVarB.f(viewLifecycleOwner, new lfy() { // from class: acm
            @Override // defpackage.lfy
            public final void u1(Object obj2) {
                featuredContainer2.setFeaturedCodesUiState((lk50) obj2);
            }
        });
        i2i.b(this.h2.w).f(getViewLifecycleOwner(), new lfy() { // from class: bcm
            @Override // defpackage.lfy
            public final void u1(Object obj2) {
                List<String> list = dfm.v2;
                dfm dfmVar = this.a;
                dfmVar.T.d((com.sporty.android.common.uievent.a) obj2, dfmVar, dfmVar.D0, null);
            }
        });
        i2i.b(this.h2.z).f(getViewLifecycleOwner(), new lfy() { // from class: dcm
            @Override // defpackage.lfy
            public final void u1(Object obj2) {
                mws.c cVar;
                String str;
                mws mwsVar = (mws) obj2;
                List<String> list = dfm.v2;
                boolean z = mwsVar instanceof mws.a;
                dfm dfmVar = this.a;
                if (!z) {
                    if (!(mwsVar instanceof mws.c) || (str = (cVar = (mws.c) mwsVar).a) == null) {
                        return;
                    }
                    e eVarRequireActivity3 = dfmVar.requireActivity();
                    List<Event> list2 = cVar.b;
                    g08 g08Var = g08.UNKNOWN;
                    ekl.b(eVarRequireActivity3, str, list2, "FEATURED_CODE_HOME_PLACE_BET", false, cVar.d);
                    return;
                }
                Intent intent = new Intent(dfmVar.requireContext(), (Class<?>) BetslipActivity.class);
                bew bewVar = bew.ADD_TO_BETSLIP_DIRECTLY;
                intent.putExtra("multi_maker_code_action", 2);
                intent.putExtra("code_provider", "home_page_featured_code");
                g08 g08Var2 = g08.UNKNOWN;
                intent.putExtra("action_load_booking_code_from", "FEATURED_CODE_HOME_PLACE_BET");
                Integer num = ((mws.a) mwsVar).b;
                if (num != null) {
                    intent.putExtra("extra_booking_code_order_type", num.intValue());
                }
                yrh0.s(dfmVar.requireContext(), intent, true);
            }
        });
        r5b r5bVarB2 = i2i.b(this.h2.B);
        ibs viewLifecycleOwner2 = getViewLifecycleOwner();
        xz80 xz80Var = this.U;
        Objects.requireNonNull(xz80Var);
        r5bVarB2.f(viewLifecycleOwner2, new eq20(xz80Var));
        i2i.b(this.h2.D).f(getViewLifecycleOwner(), new lfy() { // from class: ecm
            @Override // defpackage.lfy
            public final void u1(Object obj2) {
                x53.k kVar = (x53.k) obj2;
                List<String> list = dfm.v2;
                azm azmVar = this.a.N;
                wae waeVar = wae.MULTI_MAKER;
                g08 g08Var = g08.UNKNOWN;
                bew bewVar = bew.ADD_TO_BETSLIP_DIRECTLY;
                String str = kVar.b;
                List<MultiMakerItem> list2 = kVar.c;
                int i5 = MultiMakerActivity.E;
                azmVar.e(waeVar, MultiMakerActivity.a.a(false, true, "FEATURED_CODE_HOME_PLACE_BET", 1, 0, str, list2, false));
            }
        });
        this.h2.A1(aj40.b.a, sch.a, false, true, "home_page_featured_code");
        this.h2.x1();
        iim iimVar2 = this.w1;
        kzh.d(iimVar2.H.e(new pu0.a(0)), o8i0.d(iimVar2));
        final LivePanel livePanel = this.q0;
        nns nnsVar = this.f2;
        ibs viewLifecycleOwner3 = getViewLifecycleOwner();
        livePanel.O = nnsVar;
        i2i.b(nnsVar.P).f(viewLifecycleOwner3, new lfy() { // from class: lrs
            /* JADX WARN: Code duplicated, block: B:101:0x0106 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:105:0x00d4 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:36:0x00da  */
            /* JADX WARN: Code duplicated, block: B:38:0x00e2  */
            /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
            @Override // defpackage.lfy
            public final void u1(Object obj2) {
                RegularMarketRule regularMarketRuleD;
                TabLayout.g gVarL;
                String str;
                final LivePanel livePanel2 = livePanel;
                UIState uIState = (UIState) obj2;
                int i5 = LivePanel.c0;
                livePanel2.getClass();
                if (uIState instanceof UIState.Loading) {
                    if (uIState.getData() != null) {
                        livePanel2.p(((ins) uIState.getData()).a, ((ins) uIState.getData()).b);
                    }
                    if (uIState.getData() == null || ((ins) uIState.getData()).e == null) {
                        livePanel2.D.K();
                        livePanel2.F.n();
                        OneUpTwoUpSwitch oneUpTwoUpSwitch = livePanel2.J;
                        if (oneUpTwoUpSwitch != null) {
                            oneUpTwoUpSwitch.setVisibility(8);
                        }
                        livePanel2.V.a.setVisibility(8);
                        RelativeLayout relativeLayout = livePanel2.G;
                        if (relativeLayout != null) {
                            relativeLayout.setVisibility(4);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (!(uIState instanceof UIState.Success) || uIState.getData() == null) {
                    if (uIState instanceof UIState.Error) {
                        UIState.Error error = (UIState.Error) uIState;
                        final boolean z = error.getData() != null;
                        if (!(error.getError() instanceof ServerProductStatus.ProductDownException)) {
                            itf0.a aVar = itf0.a;
                            aVar.q(MyLog.TAG_LIVE_PANEL);
                            aVar.a("Error loading", new Object[0]);
                            if (livePanel2.D.isShown()) {
                                livePanel2.D.I();
                                livePanel2.D.setOnClickListener(new View.OnClickListener() { // from class: frs
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        int i6 = LivePanel.c0;
                                        nns nnsVar2 = livePanel2.O;
                                        if (nnsVar2 != null) {
                                            if (!z) {
                                                nnsVar2.A1();
                                                return;
                                            }
                                            itf0.a aVar2 = itf0.a;
                                            aVar2.q(MyLog.TAG_LIVE_PANEL);
                                            aVar2.a("onRetryLoadEvents", new Object[0]);
                                            nnsVar2.z1();
                                        }
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        itf0.a aVar2 = itf0.a;
                        aVar2.q(MyLog.TAG_LIVE_PANEL);
                        aVar2.a("Server product down", new Object[0]);
                        livePanel2.E.setVisibility(8);
                        livePanel2.F.setVisibility(8);
                        livePanel2.b0.setVisibility(8);
                        livePanel2.D.G(R.string.wap_home__failed_to_load_game_tip);
                        livePanel2.o();
                        return;
                    }
                    return;
                }
                List<Sport> list = ((ins) uIState.getData()).a;
                Sport sport = ((ins) uIState.getData()).b;
                livePanel2.p(list, sport);
                List<RegularMarketRule> list2 = ((ins) uIState.getData()).c;
                RegularMarketRule regularMarketRule = ((ins) uIState.getData()).d;
                LivePanel.b bVar = livePanel2.a0;
                if (list2 != null && !list2.isEmpty()) {
                    int tabCount = livePanel2.F.getTabCount();
                    if (tabCount != list2.size()) {
                        itf0.a aVar3 = itf0.a;
                        aVar3.q(MyLog.TAG_LIVE_PANEL);
                        aVar3.a("Render markets tab", new Object[0]);
                        livePanel2.F.o(bVar);
                        livePanel2.F.n();
                        for (RegularMarketRule regularMarketRule2 : list2) {
                            if (regularMarketRule2 == null) {
                                regularMarketRuleD = null;
                            } else {
                                livePanel2.A.getClass();
                                regularMarketRuleD = hkf.d(regularMarketRule2);
                            }
                            gVarL = livePanel2.F.l();
                            gVarL.a = regularMarketRule2;
                            livePanel2.getContext();
                            HashSet hashSet = tru.a;
                            gVarL.e(regularMarketRuleD.b);
                            livePanel2.F.b(gVarL);
                            if (regularMarketRule != null) {
                                str = regularMarketRule.a;
                                if (!TextUtils.equals(str, regularMarketRule2.a) || TextUtils.equals(str, regularMarketRuleD.a)) {
                                    gVarL.b();
                                }
                            }
                        }
                        livePanel2.F.a(bVar);
                    } else {
                        int i6 = 0;
                        while (true) {
                            if (i6 < tabCount) {
                                if (((RegularMarketRule) livePanel2.F.k(i6).a).equals(list2.get(i6))) {
                                    i6++;
                                } else {
                                    itf0.a aVar4 = itf0.a;
                                    aVar4.q(MyLog.TAG_LIVE_PANEL);
                                    aVar4.a("Render markets tab", new Object[0]);
                                    livePanel2.F.o(bVar);
                                    livePanel2.F.n();
                                    while (r14.hasNext()) {
                                        if (regularMarketRule2 == null) {
                                            regularMarketRuleD = null;
                                        } else {
                                            livePanel2.A.getClass();
                                            regularMarketRuleD = hkf.d(regularMarketRule2);
                                        }
                                        gVarL = livePanel2.F.l();
                                        gVarL.a = regularMarketRule2;
                                        livePanel2.getContext();
                                        HashSet hashSet2 = tru.a;
                                        gVarL.e(regularMarketRuleD.b);
                                        livePanel2.F.b(gVarL);
                                        if (regularMarketRule != null) {
                                            str = regularMarketRule.a;
                                            if (!TextUtils.equals(str, regularMarketRule2.a)) {
                                            }
                                            gVarL.b();
                                        }
                                    }
                                    livePanel2.F.a(bVar);
                                }
                            }
                        }
                    }
                }
                List<Event> list3 = ((ins) uIState.getData()).e;
                List<Map<String, String>> list4 = ((ins) uIState.getData()).f;
                itf0.a aVar5 = itf0.a;
                aVar5.q(MyLog.TAG_LIVE_PANEL);
                aVar5.a("Render live events, sport: " + sport + ", market: " + regularMarketRule + ", events: " + livePanel2.H.size(), new Object[0]);
                if (regularMarketRule == null || list3 == null || list3.isEmpty()) {
                    livePanel2.o();
                    livePanel2.D.G(R.string.common_functions__no_game);
                    livePanel2.D.L(new View.OnClickListener() { // from class: grs
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i7 = LivePanel.c0;
                            LivePanel livePanel3 = livePanel2;
                            livePanel3.D.L(null);
                            nns nnsVar2 = livePanel3.O;
                            if (nnsVar2 != null) {
                                itf0.a aVar6 = itf0.a;
                                aVar6.q(MyLog.TAG_LIVE_PANEL);
                                aVar6.a("onRetryLoadEvents", new Object[0]);
                                nnsVar2.z1();
                            }
                        }
                    });
                    return;
                }
                livePanel2.H = list3;
                livePanel2.F.setVisibility(0);
                djs djsVar = livePanel2.N;
                if (djsVar == null) {
                    livePanel2.N = new djs(livePanel2.getContext(), sport.id, livePanel2, "home/live", livePanel2.e, livePanel2.f, livePanel2.i, livePanel2.v);
                    iu2.a(livePanel2);
                    djs djsVar2 = livePanel2.N;
                    djsVar2.w = livePanel2.w;
                    djsVar2.registerAdapterDataObserver(new prs(livePanel2));
                } else {
                    djsVar.v = lfb0.d().e(sport.id);
                }
                djs djsVar3 = livePanel2.N;
                djsVar3.y = livePanel2.G;
                List<Event> list5 = livePanel2.H;
                synchronized (djsVar3.c) {
                    djsVar3.B = regularMarketRule;
                    djsVar3.c.clear();
                    djsVar3.c.addAll(list5);
                    ArrayList arrayList2 = djsVar3.c;
                    arrayList2.getClass();
                    djsVar3.b.b(regularMarketRule, arrayList2, true);
                    djsVar3.m(regularMarketRule);
                }
                if (list4 != null) {
                    aVar5.q(MyLog.TAG_LIVE_PANEL);
                    aVar5.a("Update boosted events", new Object[0]);
                    djs djsVar4 = livePanel2.N;
                    djsVar4.z = true;
                    ArrayList arrayList3 = djsVar4.A;
                    arrayList3.clear();
                    arrayList3.addAll(list4);
                }
                try {
                    livePanel2.s(-1, -1);
                } catch (Exception unused) {
                    View view2 = livePanel2.I;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    livePanel2.setVisibility(8);
                }
                livePanel2.q(false);
            }
        });
        i2i.b(livePanel.O.I).f(viewLifecycleOwner3, new lfy() { // from class: mrs
            @Override // defpackage.lfy
            public final void u1(Object obj2) {
                iqu iquVar = (iqu) obj2;
                int i5 = LivePanel.c0;
                djs djsVar = livePanel.N;
                if (djsVar != null) {
                    djsVar.p(iquVar.a, iquVar.b);
                }
            }
        });
        i2i.b(livePanel.O.K).f(viewLifecycleOwner3, new lfy() { // from class: nrs
            @Override // defpackage.lfy
            public final void u1(Object obj2) {
                qrg qrgVar = (qrg) obj2;
                int i5 = LivePanel.c0;
                LivePanel livePanel2 = livePanel;
                if (livePanel2.N == null || qrgVar == null) {
                    return;
                }
                livePanel2.H = qrgVar.a;
                livePanel2.s(qrgVar.b, 1);
            }
        });
        i2i.b(livePanel.O.M).f(viewLifecycleOwner3, new lfy() { // from class: ors
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.lfy
            public final void u1(Object obj2) {
                kotlin.Pair pair = (kotlin.Pair) obj2;
                int i5 = LivePanel.c0;
                LivePanel livePanel2 = livePanel;
                livePanel2.getClass();
                Sport sport = (Sport) pair.a;
                RegularMarketRule regularMarketRule = (RegularMarketRule) pair.b;
                OneUpTwoUpSwitch oneUpTwoUpSwitch = livePanel2.J;
                if (oneUpTwoUpSwitch == null || livePanel2.K == null || livePanel2.L == null || livePanel2.M == null) {
                    return;
                }
                if (sport == null || regularMarketRule == null) {
                    oneUpTwoUpSwitch.setVisibility(8);
                    livePanel2.K.setVisibility(8);
                    livePanel2.L.setVisibility(8);
                    livePanel2.M.setVisibility(8);
                    return;
                }
                String str = regularMarketRule.a;
                boolean zE = livePanel2.B.e(regularMarketRule, sport.id, true);
                boolean zB = livePanel2.z.b(ckf.c, sport.id, str, true);
                if (zE) {
                    whh0 whh0VarD = livePanel2.B.d(sport.id, str, true);
                    livePanel2.C.getClass();
                    yhh0 yhh0VarA = zhh0.a(whh0VarD);
                    hih0.a(livePanel2.J, yhh0VarA.a);
                    hih0.b(livePanel2.J, yhh0VarA.b);
                    livePanel2.J.setVisibility(0);
                    livePanel2.K.setVisibility(8);
                    livePanel2.L.setVisibility(0);
                    asy asyVar = livePanel2.R;
                    jqu jquVar = ((asyVar == null || !asyVar.c()) || !((whh0VarD != null ? whh0VarD.a : null) == rhh0.b && whh0VarD.c.contains(phh0.a))) ? null : jqu.b;
                    if (jquVar != null) {
                        BubbleView bubbleView = livePanel2.M;
                        bubbleView.getClass();
                        lqu.c(bubbleView, jquVar, null);
                    }
                    livePanel2.M.setVisibility(jquVar != null ? 0 : 8);
                    asy asyVar2 = livePanel2.R;
                    if (asyVar2 != null) {
                        asyVar2.a();
                        return;
                    }
                    return;
                }
                OneUpTwoUpSwitch oneUpTwoUpSwitch2 = livePanel2.J;
                if (!zB) {
                    oneUpTwoUpSwitch2.setVisibility(8);
                    livePanel2.K.setVisibility(8);
                    livePanel2.L.setVisibility(8);
                    livePanel2.M.setVisibility(8);
                    return;
                }
                oneUpTwoUpSwitch2.setVisibility(8);
                livePanel2.K.setVisibility(0);
                livePanel2.L.setVisibility(0);
                tay tayVar = livePanel2.S;
                boolean zC = tayVar != null ? tayVar.c() : false;
                if (zC) {
                    lqu.c(livePanel2.M, jqu.a, new jh5(livePanel2, 3));
                }
                livePanel2.M.setVisibility(zC ? 0 : 8);
                tay tayVar2 = livePanel2.S;
                if (tayVar2 != null) {
                    tayVar2.a();
                }
            }
        });
        i2i.b(livePanel.O.D).f(viewLifecycleOwner3, new lfy() { // from class: drs
            @Override // defpackage.lfy
            public final void u1(Object obj2) {
                int i5 = LivePanel.c0;
                hih0.b(livePanel.J, (avy) obj2);
            }
        });
        i2i.b(livePanel.O.F).f(viewLifecycleOwner3, new lfy() { // from class: ers
            @Override // defpackage.lfy
            public final void u1(Object obj2) {
                int i5 = LivePanel.c0;
                livePanel.K.setState(((Boolean) obj2).booleanValue(), false, true);
            }
        });
        t340 t340Var = this.w1.O0;
        ibs viewLifecycleOwner4 = getViewLifecycleOwner();
        s9s.b bVar = s9s.b.d;
        yyh.b(t340Var, viewLifecycleOwner4, bVar, new Function1() { // from class: gem
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                BettingStreakUpgradeHintUiModel bettingStreakUpgradeHintUiModel = (BettingStreakUpgradeHintUiModel) obj2;
                List<String> list = dfm.v2;
                dfm dfmVar = this.a;
                if (dfmVar.getActivity() == null) {
                    return Unit.a;
                }
                int color = dfmVar.requireContext().getColor(R.color.loyalty_green);
                Context contextRequireContext = dfmVar.requireContext();
                String message = bettingStreakUpgradeHintUiModel.getMessage();
                contextRequireContext.getClass();
                message.getClass();
                StringBuilder sb = new StringBuilder();
                Matcher matcher = Pattern.compile("\\{([^}]+)\\}").matcher(message);
                ArrayList arrayList2 = new ArrayList();
                int i5 = 0;
                int iEnd = 0;
                while (matcher.find()) {
                    String strGroup = matcher.group(0);
                    String strGroup2 = matcher.group(1);
                    sb.append(message.substring(iEnd, matcher.start()));
                    int length = sb.length();
                    sb.append(strGroup2);
                    arrayList2.add(new bxg0(Integer.valueOf(length), Integer.valueOf(sb.length()), Integer.valueOf(strGroup2.length())));
                    strGroup.getClass();
                    iEnd = matcher.end();
                }
                if (iEnd < message.length()) {
                    sb.append(message.substring(iEnd));
                }
                SpannableString spannableString = new SpannableString(sb.toString());
                int size = arrayList2.size();
                while (i5 < size) {
                    Object obj3 = arrayList2.get(i5);
                    i5++;
                    bxg0 bxg0Var = (bxg0) obj3;
                    int iIntValue = ((Number) bxg0Var.a).intValue();
                    int iIntValue2 = ((Number) bxg0Var.b).intValue();
                    spannableString.setSpan(new ForegroundColorSpan(color), iIntValue, iIntValue2, 33);
                    spannableString.setSpan(new StyleSpan(1), iIntValue, iIntValue2, 33);
                }
                m4a0.a(dfmVar.getActivity(), bettingStreakUpgradeHintUiModel.getTitle(), spannableString, new dch(dfmVar, 1));
                return Unit.a;
            }
        });
        i2i.b(this.G1.H).f(getViewLifecycleOwner(), new lfy() { // from class: fcm
            @Override // defpackage.lfy
            public final void u1(Object obj2) {
                List<String> list = dfm.v2;
                if (((Boolean) obj2).booleanValue()) {
                    Context contextRequireContext = this.a.requireContext();
                    int i5 = WelcomeRewardActivity.f;
                    contextRequireContext.getClass();
                    contextRequireContext.startActivity(new Intent(contextRequireContext, (Class<?>) WelcomeRewardActivity.class));
                }
            }
        });
        i2i.b(this.E1.B).f(getViewLifecycleOwner(), new lfy() { // from class: gcm
            @Override // defpackage.lfy
            public final void u1(Object obj2) {
                com.sportybet.android.instantwin.presentation.buildandgo.e eVar = (com.sportybet.android.instantwin.presentation.buildandgo.e) obj2;
                List<String> list = dfm.v2;
                boolean z = eVar instanceof mi5;
                dfm dfmVar = this.a;
                if (z) {
                    dfmVar.E.demandAccount(dfmVar.getActivity(), dfmVar);
                    return;
                }
                if (eVar instanceof li5) {
                    li5 li5Var = (li5) eVar;
                    ee<fqk> eeVar = dfmVar.i0;
                    if (eeVar != null) {
                        eeVar.b(li5Var.a);
                        return;
                    }
                    return;
                }
                if (eVar instanceof com.sportybet.android.instantwin.presentation.buildandgo.e.a) {
                    FragmentManager parentFragmentManager = dfmVar.getParentFragmentManager();
                    parentFragmentManager.getClass();
                    yc5.a(parentFragmentManager, true);
                }
            }
        });
        yyh.b(e1i.a(this.w1.M0), getViewLifecycleOwner(), bVar, new sah(this, i2));
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        this.r2 = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this.s2);
        i2i.b(this.G1.B).f(getViewLifecycleOwner(), new lfy() { // from class: icm
            @Override // defpackage.lfy
            public final void u1(Object obj2) {
                List<String> list = dfm.v2;
                if (((Boolean) obj2).booleanValue()) {
                    Context contextRequireContext = this.a.requireContext();
                    int i5 = WelcomeRewardBottomSheetActivity.d;
                    contextRequireContext.getClass();
                    contextRequireContext.startActivity(new Intent(contextRequireContext, (Class<?>) WelcomeRewardBottomSheetActivity.class));
                }
            }
        });
    }

    public final void p0() {
        ArrayList arrayList;
        if (this.N1 == null) {
            OddsFilterSettingView oddsFilterSettingView = new OddsFilterSettingView(getContext());
            this.N1 = oddsFilterSettingView;
            oddsFilterSettingView.setOnApplyClickListener(new OddsFilterSettingView.a() { // from class: qem
                @Override // com.sportybet.plugin.realsports.widget.OddsFilterSettingView.a
                public final void a(String str, String str2) {
                    List<String> list = dfm.v2;
                    BigDecimal bigDecimal = new BigDecimal(str);
                    dfm dfmVar = this.a;
                    dfmVar.O1 = bigDecimal;
                    dfmVar.P1 = TextUtils.equals(str2, sn5.d(dfmVar, R.string.component_odds_filters__max, new Object[0])) ? new BigDecimal(Reader.READ_DONE) : new BigDecimal(str2);
                    dfmVar.K1.setText(zog.b(str, str2));
                    kkl kklVar = dfmVar.W0;
                    BigDecimal bigDecimal2 = dfmVar.O1;
                    BigDecimal bigDecimal3 = dfmVar.P1;
                    kklVar.E = bigDecimal2;
                    kklVar.F = bigDecimal3;
                    kklVar.m(kklVar.y, true);
                    bzf0 bzf0Var = dfmVar.V0;
                    BigDecimal bigDecimal4 = dfmVar.O1;
                    BigDecimal bigDecimal5 = dfmVar.P1;
                    bzf0Var.E = bigDecimal4;
                    bzf0Var.F = bigDecimal5;
                    bzf0Var.m(bzf0Var.i, bzf0Var.v, true);
                    dfmVar.J1.setVisibility(8);
                    dfmVar.L1.setVisibility(0);
                    dfmVar.o0();
                }
            });
            this.N1.setOnClearClickListener(new rhc(this));
            this.N1.setOnCloseFilterListener(new shc(this));
        }
        if (this.M1 == null) {
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.addView(this.N1, new RelativeLayout.LayoutParams(-1, -2));
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: sdm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    List<String> list = dfm.v2;
                    this.a.o0();
                }
            });
            yec yecVar = new yec((View) relativeLayout);
            this.M1 = yecVar;
            yecVar.setAnimationStyle(R.style.spr_PopupWindowAnimation);
            this.M1.setFocusable(true);
            this.M1.setOutsideTouchable(true);
            this.M1.setOnDismissListener(new n());
        }
        if (this.M1.isShowing()) {
            OddsFilterSettingView oddsFilterSettingView2 = this.N1;
            oddsFilterSettingView2.K.setProgress(oddsFilterSettingView2.S, oddsFilterSettingView2.T);
            this.M1.dismiss();
        }
        OddsFilterSettingView oddsFilterSettingView3 = this.N1;
        int iE0 = E0(this.d1.getSelectedTabPosition());
        if (iE0 != 0) {
            arrayList = iE0 != 1 ? new ArrayList() : this.V0.c;
        } else {
            kkl kklVar = this.W0;
            kklVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = kklVar.c;
            int size = arrayList3.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList3.get(i2);
                i2++;
                jpc jpcVar = (jpc) obj;
                if (jpcVar instanceof ing) {
                    arrayList2.add(((ing) jpcVar).a);
                }
            }
            arrayList = arrayList2;
        }
        oddsFilterSettingView3.setEventCounts(arrayList, t0());
        this.i1.C(this.D0.findViewById(R.id.highlight_tabs_container));
        this.M1.b(0, this.j1);
        Q0();
    }

    public final void q0(c6g0 c6g0Var, RegularMarketRule regularMarketRule) {
        iim iimVar = this.w1;
        iimVar.getClass();
        QuickMarketSpotEnum quickMarketSpotEnum = this.w;
        quickMarketSpotEnum.getClass();
        c6g0Var.getClass();
        regularMarketRule.getClass();
        String strConcat = regularMarketRule.a;
        HashMap<String, c9p> map = iimVar.H0;
        if (map.containsKey(c6g0Var.c) || iimVar.I0) {
            return;
        }
        whh0 whh0VarC = iimVar.Q.c(regularMarketRule, "sr:sport:1", false);
        List<RegularMarketRule> fromStorage = QuickMarketHelper.getFromStorage(quickMarketSpotEnum, "sr:sport:1");
        if (!fromStorage.isEmpty()) {
            strConcat = CollectionsKt.a0(fromStorage, ",", null, null, new lkc(1), 30).concat((whh0VarC != null ? whh0VarC.b : null) != null ? inm.a(",", strConcat) : "");
        }
        strConcat.getClass();
        String str = c6g0Var.c;
        e8h e8hVar = iimVar.i;
        str.getClass();
        map.put(str, kzh.d(new wzh(new yzh(new g1i(new xzh(e8hVar.h(strConcat, str), new sim(iimVar, null)), new tim(c6g0Var, regularMarketRule, iimVar, null)), new uim(iimVar, c6g0Var, null)), new vim(iimVar, c6g0Var, null)), o8i0.d(iimVar)));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    public final TabLayout.g r0(mfb0 mfb0Var, RegularMarketRule regularMarketRule) {
        boolean zB;
        RegularMarketRule regularMarketRuleA;
        String str = regularMarketRule.a;
        if (mfb0Var != null ? this.e0.f(mfb0Var.getId(), str, false) : false) {
            regularMarketRuleA = this.e0.b(hih0.g(this.p1.getB()), regularMarketRule, mfb0Var.getId(), false);
            if (regularMarketRuleA == null) {
                regularMarketRuleA = regularMarketRule;
            }
        } else {
            if (mfb0Var != null) {
                iim iimVar = this.w1;
                String id = mfb0Var.getId();
                hkf hkfVar = iimVar.R;
                ckf ckfVar = ckf.c;
                hkfVar.getClass();
                zB = hkfVar.a.b(ckfVar, id, str, false);
            } else {
                zB = false;
            }
            if (zB) {
                iim iimVar2 = this.w1;
                String id2 = mfb0Var.getId();
                boolean zC = this.q1.c();
                hkf hkfVar2 = iimVar2.R;
                ckf ckfVar2 = ckf.a;
                regularMarketRuleA = hkfVar2.a(id2, regularMarketRule, zC, false);
                if (regularMarketRuleA == null) {
                    regularMarketRuleA = regularMarketRule;
                }
            } else {
                regularMarketRuleA = regularMarketRule;
            }
        }
        TabLayout.g gVarL = this.e1.l();
        gVarL.a = new DataHolder(regularMarketRule, regularMarketRuleA);
        HashSet hashSet = tru.a;
        gVarL.e(regularMarketRule.b);
        return gVarL;
    }

    @Override // com.sportybet.plugin.realsports.home.featuredsection.FeaturedContainer.b
    public final void s(Event event, String str, String str2) {
        iim iimVar = this.w1;
        xhm xhmVar = iimVar.e0;
        event.getClass();
        str2.getClass();
        GroupTopic groupTopic = new GroupTopic(event.getMarketOddsTopic("~", str));
        GroupTopic groupTopic2 = new GroupTopic(event.getMarketStatusTopic("~", str));
        LinkedHashMap linkedHashMap = iimVar.d0;
        Subscriber subscriber = (Subscriber) linkedHashMap.remove(groupTopic);
        if (subscriber != null) {
            iimVar.B1().unsubscribeTopic(groupTopic, subscriber);
        }
        Subscriber subscriber2 = (Subscriber) linkedHashMap.remove(groupTopic2);
        if (subscriber2 != null) {
            iimVar.B1().unsubscribeTopic(groupTopic2, subscriber2);
        }
        GroupTopic groupTopic3 = new GroupTopic(event.getMarketOddsTopic("~", str2));
        GroupTopic groupTopic4 = new GroupTopic(event.getMarketStatusTopic("~", str2));
        linkedHashMap.put(groupTopic3, xhmVar);
        linkedHashMap.put(groupTopic4, xhmVar);
        iimVar.B1().subscribeTopic(groupTopic3, xhmVar);
        iimVar.B1().subscribeTopic(groupTopic4, xhmVar);
    }

    public final void s0() {
        this.m2 = System.currentTimeMillis();
        tgm tgmVar = this.A1;
        tgmVar.getClass();
        try {
            ct90 ct90VarA = ru90.a(tgmVar.d.d(), tgmVar.a);
            final qgm qgmVar = new qgm(tgmVar, 0);
            pya pyaVar = new pya() { // from class: rgm
                @Override // defpackage.pya
                public final void accept(Object obj) {
                    qgmVar.invoke(obj);
                }
            };
            final cjc cjcVar = new cjc(1);
            rya ryaVar = new rya(pyaVar, new pya() { // from class: sgm
                @Override // defpackage.pya
                public final void accept(Object obj) {
                    cjcVar.invoke(obj);
                }
            });
            ct90VarA.a(ryaVar);
            tgmVar.x1(ryaVar);
        } catch (Exception e2) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.o(e2);
        }
    }

    public final RegularMarketRule t0() {
        DataHolder<RegularMarketRule> dataHolderW0 = w0();
        return dataHolderW0 != null ? dataHolderW0.getCurrent() : this.t1.n();
    }

    public final void u0() {
        if (isResumed()) {
            this.E0.setVisibility(8);
            if (this.E.isLogin() && this.F.V()) {
                ComposeView composeView = (ComposeView) this.D0.findViewById(R.id.home_kyc_hint_container);
                composeView.getClass();
                composeView.setVisibility(8);
                this.P.s().G(new d(composeView));
            }
        }
    }

    public final RegularMarketRule v0(RegularMarketRule regularMarketRule) {
        DataHolder<RegularMarketRule> dataHolderW0 = w0();
        if (dataHolderW0 != null) {
            return dataHolderW0.getPrimary();
        }
        return regularMarketRule != null ? regularMarketRule : this.t1.n();
    }

    @Override // defpackage.tit
    public final void w(Account account, boolean z) {
        K0();
        iim iimVar = this.w1;
        if (iimVar.W.a.getValue() != null) {
            ej5.c(o8i0.d(iimVar), null, null, new gjm(iimVar, null), 3);
        }
        if (account != null && !z && isVisible()) {
            final kotlin.Pair[] pairArr = {new kotlin.Pair("game", "soccer")};
            oku okuVar = this.D1;
            okuVar.getClass();
            s5b.b(kotlin.coroutines.e.a, new alu(null, okuVar)).f(this, new lfy() { // from class: ycm
                @Override // defpackage.lfy
                public final void u1(Object obj) {
                    List<String> list = dfm.v2;
                    long jLongValue = ((Long) obj).longValue();
                    FragmentManager childFragmentManager = this.a.getChildFragmentManager();
                    final kotlin.Pair[] pairArr2 = pairArr;
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: iem
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            List<String> list2 = dfm.v2;
                            sh8.c().b(o7d.b(wae.GAMES_LOBBY, pairArr2));
                        }
                    };
                    jem jemVar = new jem();
                    childFragmentManager.getClass();
                    try {
                        gd8.j0(new pke(jLongValue, onClickListener, jemVar)).showNow(childFragmentManager, "dialog");
                    } catch (Exception unused) {
                    }
                }
            });
        }
        if (this.E.getAccount() != null) {
            this.H1.x1(true);
        }
    }

    public final DataHolder<RegularMarketRule> w0() {
        TabLayout.g gVarY0 = y0();
        return DataHolderUtils.asDataHolderOrNull(gVarY0 == null ? null : gVarY0.a, RegularMarketRule.class);
    }

    @Override // defpackage.wym
    public final boolean y() {
        return false;
    }

    public final TabLayout.g y0() {
        int iE0 = E0(this.d1.getSelectedTabPosition());
        if (iE0 == 0 || iE0 == 1) {
            return this.e1.k(this.e1.getTabCount() > 0 ? this.e1.getSelectedTabPosition() : -1);
        }
        return null;
    }

    public final void z0(bag bagVar) {
        Bundle bundle = new Bundle();
        if (bagVar != null) {
            bundle.putSerializable("EXTRA_ENTRANCE", bagVar);
            Unit unit = Unit.a;
        }
        sh8.c().c(o7d.a(wae.DEPOSIT), bundle);
        this.S.disableGetGifts();
        this.s0.setVisibility(8);
    }

    public final void G0() {
        mfb0 mfb0Var = this.t1;
        if (mfb0Var != null && this.e1 != null) {
            J0(this.t1, QuickMarketHelper.getFromStorage(this.w, mfb0Var.getId()));
        }
        int iE0 = E0(this.d1.getSelectedTabPosition());
        String str = LGxrN.sABlTpgvMD;
        if (iE0 == 0) {
            this.I1.setVisibility(0);
            jvd0 jvd0Var = this.w1.F0;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
                Unit unit = Unit.a;
            }
            jvd0 jvd0Var2 = this.w1.J0;
            if (jvd0Var2 != null) {
                jvd0Var2.cancel((CancellationException) null);
                Unit unit2 = Unit.a;
            }
            if (this.T0.getAdapter() != this.a1) {
                this.a2.d();
                n0(this.W0);
                this.T0.setAdapter(this.a1);
            } else {
                k0e0 k0e0Var = this.U0;
                if (k0e0Var != null) {
                    k0e0Var.d(true);
                }
            }
            this.W0.m(t0(), this.f1);
            this.f1 = false;
            f00 f00Var = vgb0.a;
            Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("type", "Highlights")};
            HashMap map = new HashMap(1);
            Map.Entry entry = entryArr[0];
            Object key = entry.getKey();
            if (w1k.a(key, entry, map, key) != null) {
                hb5.a(wga.a(key, str));
                return;
            }
            Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
            mapUnmodifiableMap.getClass();
            vgb0.c("Football_Highlight", mapUnmodifiableMap, false);
            return;
        }
        if (iE0 == 1) {
            this.I1.setVisibility(0);
            jvd0 jvd0Var3 = this.w1.G0;
            if (jvd0Var3 != null) {
                jvd0Var3.cancel((CancellationException) null);
                Unit unit3 = Unit.a;
            }
            jvd0 jvd0Var4 = this.w1.J0;
            if (jvd0Var4 != null) {
                jvd0Var4.cancel((CancellationException) null);
                Unit unit4 = Unit.a;
            }
            if (this.T0.getAdapter() != this.Z0) {
                this.a2.d();
                n0(this.V0);
                this.T0.setAdapter(this.Z0);
            } else {
                k0e0 k0e0Var2 = this.U0;
                if (k0e0Var2 != null) {
                    k0e0Var2.d(true);
                }
            }
            this.V0.m(t0(), this.t1.getId(), false);
            f00 f00Var2 = vgb0.a;
            Map.Entry[] entryArr2 = {new AbstractMap.SimpleEntry("type", "Today")};
            HashMap map2 = new HashMap(1);
            Map.Entry entry2 = entryArr2[0];
            Object key2 = entry2.getKey();
            if (w1k.a(key2, entry2, map2, key2) != null) {
                hb5.a(wga.a(key2, str));
                return;
            }
            Map mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
            mapUnmodifiableMap2.getClass();
            vgb0.c("Football_Highlight", mapUnmodifiableMap2, false);
            return;
        }
        if (iE0 != 2) {
            return;
        }
        this.I1.setVisibility(8);
        jvd0 jvd0Var5 = this.w1.G0;
        if (jvd0Var5 != null) {
            jvd0Var5.cancel((CancellationException) null);
            Unit unit5 = Unit.a;
        }
        jvd0 jvd0Var6 = this.w1.F0;
        if (jvd0Var6 != null) {
            jvd0Var6.cancel((CancellationException) null);
            Unit unit6 = Unit.a;
        }
        k0e0 k0e0Var3 = this.U0;
        if (k0e0Var3 != null) {
            k0e0Var3.b();
        }
        RecyclerView.f adapter = this.T0.getAdapter();
        androidx.recyclerview.widget.f fVar = this.b1;
        if (adapter != fVar) {
            this.T0.setAdapter(fVar);
        }
        this.Y0.i(this.t1.getId(), false);
        f00 f00Var3 = vgb0.a;
        Map.Entry[] entryArr3 = {new AbstractMap.SimpleEntry("type", "Countries")};
        HashMap map3 = new HashMap(1);
        Map.Entry entry3 = entryArr3[0];
        Object key3 = entry3.getKey();
        if (w1k.a(key3, entry3, map3, key3) != null) {
            hb5.a(wga.a(key3, str));
            return;
        }
        Map mapUnmodifiableMap3 = Collections.unmodifiableMap(map3);
        mapUnmodifiableMap3.getClass();
        vgb0.c("Football_Highlight", mapUnmodifiableMap3, false);
    }

    /* JADX INFO: loaded from: classes7.dex */
    public class i implements TabLayout.d {
        public i() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void G(TabLayout.g gVar) {
            final mfb0 mfb0Var = (mfb0) gVar.a;
            if (mfb0Var != null) {
                itf0.a aVar = itf0.a;
                aVar.q("HomeFragment");
                UiText uiTextC = mfb0Var.c();
                dfm dfmVar = dfm.this;
                aVar.a("onTabSelected : sport = %s", uiTextC.g(dfmVar.requireContext()));
                String id = dfmVar.t1.getId();
                List<String> list = dfm.v2;
                boolean zContains = list.contains(id);
                if (zContains != list.contains(mfb0Var.getId())) {
                    int i = dfmVar.u1;
                    if (zContains) {
                        dfmVar.u1 = i - 1;
                    } else {
                        dfmVar.u1 = i + 1;
                    }
                }
                mfb0 mfb0VarE = lfb0.d().e(mfb0Var.getId());
                dfmVar.t1 = mfb0VarE;
                if (mfb0VarE == null) {
                    dfmVar.t1 = mfb0Var;
                }
                dfmVar.H0();
                QuickMarketHelper.fetch(dfmVar.w, mfb0Var.getId(), new QuickMarketHelper.FetchCallback() { // from class: wfm
                    @Override // com.sportybet.plugin.realsports.data.QuickMarketHelper.FetchCallback
                    public final void onResult(List list2) {
                        dfm dfmVar2 = dfm.this;
                        if (dfmVar2.O0) {
                            dfmVar2.J0(mfb0Var, list2);
                            dfmVar2.I0();
                        }
                    }
                });
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void A0(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void g0(TabLayout.g gVar) {
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public class j implements TabLayout.d {
        public j() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void G(TabLayout.g gVar) {
            int i = gVar.e;
            dfm dfmVar = dfm.this;
            iim iimVar = dfmVar.w1;
            boolean z = i != 0;
            HashMap<String, c9p> map = iimVar.H0;
            iimVar.I0 = z;
            if (z && !map.isEmpty()) {
                Collection<c9p> collectionValues = map.values();
                collectionValues.getClass();
                for (c9p c9pVar : CollectionsKt.A0(collectionValues)) {
                    c9pVar.getClass();
                    c9pVar.cancel((CancellationException) null);
                }
            }
            dfmVar.u1 = i;
            dfmVar.G0();
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void A0(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void g0(TabLayout.g gVar) {
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public class k implements TabLayout.d {
        public k() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void G(TabLayout.g gVar) {
            String str;
            RegularMarketRule regularMarketRuleT0;
            List<String> list = dfm.v2;
            dfm dfmVar = dfm.this;
            dfmVar.G0();
            int iE0 = dfmVar.E0(dfmVar.d1.getSelectedTabPosition());
            if (iE0 != 0) {
                str = iE0 != 1 ? null : "B_TODAY_";
            } else {
                str = "B_HIGHLIGHT_";
            }
            if (TextUtils.isEmpty(str) || (regularMarketRuleT0 = dfmVar.t0()) == null) {
                return;
            }
            f00 f00Var = vgb0.a;
            StringBuilder sbA = y4s.a(str);
            sbA.append(regularMarketRuleT0.a);
            Map.Entry[] entryArr = {new AbstractMap.SimpleEntry(AnalyticsParam.CONTENT_TYPE, sbA.toString())};
            HashMap map = new HashMap(1);
            Map.Entry entry = entryArr[0];
            Object key = entry.getKey();
            if (w1k.a(key, entry, map, key) != null) {
                hb5.a(wga.a(key, "duplicate key: "));
                return;
            }
            Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
            mapUnmodifiableMap.getClass();
            vgb0.c("quick_market", mapUnmodifiableMap, false);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void A0(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void g0(TabLayout.g gVar) {
        }
    }
}
