package com.sportybet.plugin.event;

import android.accounts.Account;
import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.appsflyer.internal.u;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.book.domain.entity.EventSource;
import com.sporty.android.book.domain.entity.MarketGroup;
import com.sporty.android.chat.data.LiveShareBetData;
import com.sporty.android.common_ui.widgets.AspectRatioFrameLayout;
import com.sporty.android.common_ui.widgets.GiftGrabPowerBar;
import com.sporty.android.common_ui.widgets.SimpleActionBar;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.bet.edit.EditBetDlgType;
import com.sporty.android.core.model.bet.edit.ErrorDataInfo;
import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;
import com.sporty.android.sportyfm.service.RadioService;
import com.sporty.android.sportyfm.ui.widget.RadioPlaybackMiniPanel;
import com.sportybet.android.choosebet.presentation.ChooseBetActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.openbet.domain.model.OpenBetEntranceData;
import com.sportybet.core.injection.opentelemetry.PageMeta;
import com.sportybet.feature.gameslobby.model.GamesLobbyResult;
import com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.SportyTvRedirectActivity;
import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.SocketPushManager;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.ntespm.socket.Topic;
import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.event.c;
import com.sportybet.plugin.event.d;
import com.sportybet.plugin.event.e;
import com.sportybet.plugin.event.f;
import com.sportybet.plugin.event.g;
import com.sportybet.plugin.event.h;
import com.sportybet.plugin.event.view.LiveEventMatchWebView;
import com.sportybet.plugin.event.view.LiveEventVideoView;
import com.sportybet.plugin.lgg.GiftGrabView;
import com.sportybet.plugin.realsports.activities.AlertDialogActivity;
import com.sportybet.plugin.realsports.activities.ZoomImageActivity;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.FilteredMarkets;
import com.sportybet.plugin.realsports.data.LiveStreamData;
import com.sportybet.plugin.realsports.data.LiveStreamDataBetGenius;
import com.sportybet.plugin.realsports.data.LiveStreamDataBetRadar;
import com.sportybet.plugin.realsports.data.LiveStreamDataBeter;
import com.sportybet.plugin.realsports.data.LiveStreamDataIGameMedia;
import com.sportybet.plugin.realsports.data.LiveStreamDataSocialMedia;
import com.sportybet.plugin.realsports.data.LiveStreamDataSportyTV;
import com.sportybet.plugin.realsports.data.LiveStreamDataTenTx;
import com.sportybet.plugin.realsports.data.LiveStreamDataWebView;
import com.sportybet.plugin.realsports.data.LiveStreamSharedData;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.OutcomesRequest;
import com.sportybet.plugin.realsports.data.ServerProductStatus;
import com.sportybet.plugin.realsports.data.SocialMediaStreamData;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.event.ChangeMatchPanel;
import com.sportybet.plugin.realsports.event.EventLiveAdapter;
import com.sportybet.plugin.realsports.event.LiveTimerTextView;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.ShareBetData;
import com.sportybet.plugin.realsports.event.widget.LiveEventControlsHeaderView;
import com.sportybet.plugin.realsports.event.widget.LiveEventHeaderView;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;
import com.sportybet.plugin.realsports.streaming.provider.img.api.data.IMGStreamResp;
import com.sportybet.plugin.realsports.streaming.provider.perform.api.data.PerformStreamResp;
import com.sportybet.plugin.realsports.widget.EPLStreamingMentionView;
import com.twilio.voice.EventKeys;
import defpackage.a8z;
import defpackage.aah;
import defpackage.ad7;
import defpackage.agd0;
import defpackage.akg;
import defpackage.ap0;
import defpackage.arm;
import defpackage.aru;
import defpackage.ay0;
import defpackage.azd0;
import defpackage.azj0;
import defpackage.azm;
import defpackage.b12;
import defpackage.b1z;
import defpackage.b3;
import defpackage.b6d;
import defpackage.bb40;
import defpackage.be;
import defpackage.be7;
import defpackage.bjb0;
import defpackage.bjg;
import defpackage.bls;
import defpackage.bms;
import defpackage.bnh0;
import defpackage.bqe;
import defpackage.br3;
import defpackage.bvd;
import defpackage.c7i0;
import defpackage.ch7;
import defpackage.chk;
import defpackage.cjg;
import defpackage.ckg;
import defpackage.cms;
import defpackage.cns;
import defpackage.cyb;
import defpackage.czj0;
import defpackage.did0;
import defpackage.djg;
import defpackage.dms;
import defpackage.dns;
import defpackage.dq7;
import defpackage.ebs;
import defpackage.ee;
import defpackage.eid0;
import defpackage.eig;
import defpackage.ej5;
import defpackage.ekg;
import defpackage.ems;
import defpackage.erb;
import defpackage.f00;
import defpackage.fdt;
import defpackage.fe00;
import defpackage.fkg;
import defpackage.fks;
import defpackage.g880;
import defpackage.g9i0;
import defpackage.ge00;
import defpackage.gig;
import defpackage.gq6;
import defpackage.gr0;
import defpackage.gug0;
import defpackage.h0j0;
import defpackage.haj;
import defpackage.hb5;
import defpackage.hce0;
import defpackage.hhy;
import defpackage.hks;
import defpackage.hmk;
import defpackage.hns;
import defpackage.hp0;
import defpackage.hsx;
import defpackage.hug0;
import defpackage.i0j0;
import defpackage.i2i;
import defpackage.iai0;
import defpackage.ijg;
import defpackage.iks;
import defpackage.inm;
import defpackage.itf0;
import defpackage.iu2;
import defpackage.ius;
import defpackage.iwh0;
import defpackage.iym;
import defpackage.ja7;
import defpackage.jq40;
import defpackage.jqa0;
import defpackage.jvd0;
import defpackage.k650;
import defpackage.k9j;
import defpackage.kd2;
import defpackage.lfb0;
import defpackage.lfy;
import defpackage.lgb0;
import defpackage.ljs;
import defpackage.lkg;
import defpackage.lus;
import defpackage.lvs;
import defpackage.ly2;
import defpackage.m2g;
import defpackage.mfb0;
import defpackage.mkg;
import defpackage.mmc;
import defpackage.muh;
import defpackage.nkg;
import defpackage.nnf;
import defpackage.nzm;
import defpackage.o0b;
import defpackage.o8i0;
import defpackage.oke;
import defpackage.okg;
import defpackage.op8;
import defpackage.oxc;
import defpackage.oxd;
import defpackage.paj;
import defpackage.pkg;
import defpackage.pum;
import defpackage.qae0;
import defpackage.qkg;
import defpackage.qls;
import defpackage.qz3;
import defpackage.r0b;
import defpackage.r13;
import defpackage.r6i0;
import defpackage.r8i0;
import defpackage.rd00;
import defpackage.rgy;
import defpackage.rig;
import defpackage.rkg;
import defpackage.rks;
import defpackage.rvu;
import defpackage.s13;
import defpackage.s1p;
import defpackage.s8i0;
import defpackage.sig;
import defpackage.skg;
import defpackage.sks;
import defpackage.sn5;
import defpackage.ssw;
import defpackage.str;
import defpackage.su5;
import defpackage.svj;
import defpackage.td7;
import defpackage.th50;
import defpackage.tig;
import defpackage.tit;
import defpackage.tkg;
import defpackage.tm2;
import defpackage.tru;
import defpackage.tsg;
import defpackage.u6i0;
import defpackage.ud;
import defpackage.uig;
import defpackage.ukg;
import defpackage.v840;
import defpackage.v8i0;
import defpackage.vd;
import defpackage.vgb0;
import defpackage.vn20;
import defpackage.vns;
import defpackage.vpu;
import defpackage.vql;
import defpackage.vri;
import defpackage.vy7;
import defpackage.w8;
import defpackage.wc;
import defpackage.whs;
import defpackage.wig;
import defpackage.wkg;
import defpackage.wq3;
import defpackage.wsm;
import defpackage.wym;
import defpackage.xkg;
import defpackage.xls;
import defpackage.xq3;
import defpackage.xxz;
import defpackage.xym;
import defpackage.y1k0;
import defpackage.yhg;
import defpackage.yi5;
import defpackage.yk10;
import defpackage.ykg;
import defpackage.yls;
import defpackage.yrh0;
import defpackage.yxi0;
import defpackage.yy7;
import defpackage.z7h;
import defpackage.zc7;
import defpackage.zch0;
import defpackage.zls;
import defpackage.zsu;
import defpackage.zy80;
import defpackage.zyf0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0003\t\n\u000bB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/sportybet/plugin/event/EventActivity;", "Lpy1;", "Lwym;", "Lxym;", "Lk9j;", "Lfe00;", "Lbb40;", "<init>", "()V", "b", "c", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class EventActivity extends vql implements wym, xym, k9j, fe00, bb40 {
    public static final /* synthetic */ int U0 = 0;
    public wsm A;
    public td7 A0;
    public com.sporty.android.common.uievent.e B;
    public ekg B0;
    public xxz C;
    public be7 C0;
    public iym D;
    public hmk D0;
    public rd00 E;
    public com.sportybet.plugin.event.e E0;
    public pum F;
    public rvu F0;
    public k650 G;
    public yi5 H;
    public zsu I;
    public c I0;
    public a8z J;
    public boolean J0;
    public muh K;
    public boolean K0;
    public s1p L;
    public bnh0 M;
    public gq6 N;
    public str<hsx> O;
    public jvd0 O0;
    public b1z P;
    public String P0;
    public svj Q;
    public Boolean Q0;
    public agd0 R;
    public eid0 S;
    public ge00 T0;
    public List<Integer> V;
    public mfb0 W;
    public List<MarketGroup> X;
    public String Y;
    public String Z;
    public b6d b;
    public y1k0 c;
    public azm d;
    public int d0;
    public nzm e;
    public int e0;
    public chk f;
    public boolean f0;
    public boolean h0;
    public v840 i;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public int r0;
    public int s0;
    public Animation t0;
    public SimpleActionBar u0;
    public arm v;
    public LiveEventHeaderView v0;
    public lvs w;
    public EventLiveAdapter w0;
    public hsx x0;
    public azd0 y;
    public ChangeMatchPanel y0;
    public erb z;
    public zy80 z0;
    public final HashMap T = new HashMap();
    public final ArrayList U = new ArrayList();
    public String a0 = "";
    public rgy b0 = hhy.a().get(0);
    public final ArrayList c0 = new ArrayList();
    public boolean g0 = true;
    public final HashSet p0 = new HashSet();
    public b q0 = b.a;
    public int G0 = 1;
    public final ssw<Boolean> H0 = new ssw<>(Boolean.FALSE);
    public final d L0 = new d();
    public final eig M0 = new iu2.b() { // from class: eig
        @Override // iu2.a
        public final void C() {
            EventLiveAdapter eventLiveAdapter = this.a.w0;
            if (eventLiveAdapter != null) {
                eventLiveAdapter.notifyDataSetChanged();
            }
        }
    };
    public final gig N0 = new aah() { // from class: gig
        @Override // defpackage.aah
        public final void a(Market market, boolean z) {
            int i = EventActivity.U0;
            market.getClass();
            e eVar = this.a.E0;
            if (eVar != null) {
                eVar.K1(market, z);
            } else {
                Intrinsics.n("eventViewModel");
                throw null;
            }
        }
    };
    public final ee<String> R0 = registerForActivityResult(new be(), new ud() { // from class: hig
        @Override // defpackage.ud
        public final void a(Object obj) {
            Boolean bool = (Boolean) obj;
            boolean zBooleanValue = bool.booleanValue();
            EventActivity eventActivity = this.a;
            if (Intrinsics.g(eventActivity.P0, "android.permission.POST_NOTIFICATIONS")) {
                Boolean bool2 = eventActivity.Q0;
                if (bool2 == null || !bool2.equals(bool)) {
                    if (zBooleanValue) {
                        gym.a(eventActivity.F1(), l0y.a);
                    } else {
                        gym.a(eventActivity.F1(), k0y.a);
                    }
                }
                eventActivity.Q0 = null;
            }
            ge00 ge00Var = eventActivity.T0;
            if (ge00Var != null) {
                ge00Var.a(zBooleanValue);
            }
        }
    });
    public final g S0 = new g();

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a {
        public static void a(Context context, Intent intent) {
            String stringExtra;
            context.getClass();
            Event event = (Event) intent.getParcelableExtra("EXTRA_EVENT");
            if (event == null || (stringExtra = event.eventId) == null) {
                stringExtra = intent.getStringExtra("EXTRA_EVENT_ID");
            }
            if (stringExtra == null || stringExtra.length() == 0) {
                new b12().showDialog(context, sn5.b(context, R.string.common_feedback__failed_to_load_data_please_refresh_the_page, new Object[0]), new ckg(0));
            } else {
                yrh0.s(context, intent, true);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final /* synthetic */ b[] d;

        static {
            b bVar = new b("NONE", 0);
            a = bVar;
            b bVar2 = new b("WEB_VIDEO", 1);
            b = bVar2;
            b bVar3 = new b("VIDEO", 2);
            c = bVar3;
            d = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }
    }

    public final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String str;
            String str2;
            context.getClass();
            intent.getClass();
            boolean zEquals = TextUtils.equals(intent.getStringExtra("eventName"), "updateMatchTrackerHeight");
            final EventActivity eventActivity = EventActivity.this;
            if (zEquals) {
                int intExtra = intent.getIntExtra("data", 0);
                if (intExtra == 0) {
                    return;
                }
                agd0 agd0Var = eventActivity.R;
                if (agd0Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                agd0Var.A.setLiveTrackerHeightMeasured(true);
                agd0 agd0Var2 = eventActivity.R;
                if (agd0Var2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                LiveEventMatchWebView liveEventMatchWebView = agd0Var2.A;
                int iC = (int) (bqe.c() * intExtra);
                bls blsVar = liveEventMatchWebView.d;
                ViewGroup.LayoutParams layoutParams = blsVar.a.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = iC;
                    blsVar.a.setLayoutParams(layoutParams);
                }
                if (eventActivity.n0) {
                    return;
                }
                agd0 agd0Var3 = eventActivity.R;
                if (agd0Var3 != null) {
                    agd0Var3.A.setActive(false);
                    return;
                } else {
                    Intrinsics.n("binding");
                    throw null;
                }
            }
            if (TextUtils.equals(intent.getStringExtra("eventName"), "gamesLobbyResult")) {
                final GamesLobbyResult gamesLobbyResult = (GamesLobbyResult) intent.getParcelableExtra("data");
                if (gamesLobbyResult == null) {
                    return;
                }
                int i = EventActivity.U0;
                com.sportybet.plugin.event.e eVar = eventActivity.E0;
                if (eVar != null) {
                    eVar.K.f(eventActivity, new fkg(new Function1() { // from class: mig
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Event event = (Event) obj;
                            int i2 = EventActivity.U0;
                            event.getClass();
                            EventActivity eventActivity2 = eventActivity;
                            svj svjVar = eventActivity2.Q;
                            if (svjVar == null) {
                                Intrinsics.n("gamesLobbyManager");
                                throw null;
                            }
                            String str3 = event.matchStatus;
                            if (str3 == null) {
                                str3 = "";
                            }
                            oqv oqvVar = oqv.LIVE;
                            hkg hkgVar = new hkg(eventActivity2);
                            svjVar.a(gamesLobbyResult, eventActivity2, str3, oqvVar, hkgVar);
                            return Unit.a;
                        }
                    }, eVar));
                    return;
                } else {
                    Intrinsics.n("eventViewModel");
                    throw null;
                }
            }
            if (!kotlin.text.c.l(intent.getAction(), "com.sportybet.OPEN_BETS_COUNT_UPDATE", false)) {
                if (TextUtils.equals(intent.getStringExtra("eventName"), "openBottomSheet")) {
                    int i2 = EventActivity.U0;
                    String[] stringArrayExtra = intent.getStringArrayExtra("data");
                    if (stringArrayExtra == null || (str = (String) ay0.C(0, stringArrayExtra)) == null || (str2 = (String) ay0.C(1, stringArrayExtra)) == null) {
                        return;
                    }
                    FragmentManager supportFragmentManager = eventActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    i.a.a(supportFragmentManager, eventActivity.getLifecycle(), str, str2, true);
                    return;
                }
                return;
            }
            OpenBetEntranceData openBetEntranceData = (OpenBetEntranceData) intent.getParcelableExtra("EXTRA_OPEN_BET_DATA");
            if (openBetEntranceData != null) {
                int i3 = openBetEntranceData.a;
                LiveEventHeaderView liveEventHeaderView = eventActivity.v0;
                if (liveEventHeaderView == null) {
                    Intrinsics.n("liveEventHeaderView");
                    throw null;
                }
                TextView textView = liveEventHeaderView.E;
                if (textView != null) {
                    textView.setText(i3 > 99 ? "99+" : String.valueOf(i3));
                }
            }
        }
    }

    public static final class d implements Subscriber {
        public d() {
        }

        @Override // com.sportybet.ntespm.socket.Subscriber
        public final void onReceive(String str) {
            str.getClass();
            EventActivity eventActivity = EventActivity.this;
            if (eventActivity.isFinishing()) {
                return;
            }
            com.sportybet.plugin.event.e eVar = eventActivity.E0;
            if (eVar == null) {
                Intrinsics.n("eventViewModel");
                throw null;
            }
            eVar.F1().update(str);
            ej5.c(o8i0.d(eVar), null, null, new tsg(null, eVar), 3);
            com.sportybet.plugin.event.e eVar2 = eventActivity.E0;
            if (eVar2 == null) {
                Intrinsics.n("eventViewModel");
                throw null;
            }
            eventActivity.j2(eVar2.F1(), eventActivity.W);
            EventLiveAdapter eventLiveAdapter = eventActivity.w0;
            if (eventLiveAdapter != null) {
                eventLiveAdapter.notifyDataSetChanged();
            }
            if (eventActivity.q0 != b.a) {
                com.sportybet.plugin.event.e eVar3 = eventActivity.E0;
                if (eVar3 == null) {
                    Intrinsics.n("eventViewModel");
                    throw null;
                }
                if (eVar3.F1().status > 2) {
                    eventActivity.H0.m(Boolean.TRUE);
                }
            }
            com.sportybet.plugin.event.e eVar4 = eventActivity.E0;
            if (eVar4 == null) {
                Intrinsics.n("eventViewModel");
                throw null;
            }
            Event eventF1 = eVar4.F1();
            if (eventActivity.h0 && eventF1.status == 1) {
                eventActivity.h0 = false;
                if (eventActivity.m0) {
                    if (eventF1.showStats()) {
                        eventActivity.d2(eventActivity.z1(eventF1), true);
                    } else {
                        eventActivity.d2(null, false);
                    }
                }
            }
        }
    }

    public static final class e implements wq3.b {
        public e() {
        }

        @Override // wq3.b
        public final boolean a() {
            return !EventActivity.this.isFinishing();
        }

        @Override // wq3.b
        public final void b(int i) {
            EventActivity eventActivity = EventActivity.this;
            eventActivity.e0 = i;
            eventActivity.K1(i);
            EventLiveAdapter eventLiveAdapter = eventActivity.w0;
            if (eventLiveAdapter != null) {
                eventLiveAdapter.showFooterQuickBetViewBackground(eventActivity, i);
            }
        }

        @Override // wq3.b
        public final void c(boolean z) {
            EventActivity eventActivity = EventActivity.this;
            eventActivity.e0 = 0;
            eventActivity.K1(0);
            EventLiveAdapter eventLiveAdapter = eventActivity.w0;
            if (eventLiveAdapter != null) {
                eventLiveAdapter.hideFooterQuickBetViewBackground();
            }
            eventActivity.R1(z);
        }
    }

    public static final class f implements gq6.a {
        public f() {
        }

        @Override // gq6.a
        public final void a() {
            EventActivity.this.i0 = false;
        }
    }

    public static final class g extends ee<String> {
        public final vd<String, ?> a;

        public g() {
            this.a = EventActivity.this.R0.a();
        }

        @Override // defpackage.ee
        public final vd<String, ?> a() {
            return this.a;
        }

        @Override // defpackage.ee
        public final void b(Object obj) {
            String str = (String) obj;
            str.getClass();
            EventActivity eventActivity = EventActivity.this;
            eventActivity.P0 = str;
            if (str.equals("android.permission.POST_NOTIFICATIONS") && Build.VERSION.SDK_INT >= 33) {
                eventActivity.Q0 = Boolean.valueOf(o0b.a(eventActivity, str) == 0);
            }
            eventActivity.R0.b(str);
        }
    }

    public static final class h implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public h(Function1 function1) {
            this.a = function1;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    public static void E1(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Market market = (Market) it.next();
            boolean zContains = tru.c.contains(market.id);
            if (z && !zContains) {
                arrayList.addAll(arrayList.size(), arrayList2);
                arrayList.add(market);
            } else if (!zContains) {
                arrayList.add(market);
            } else if (tru.g(market.id, market.specifier)) {
                arrayList2.add(market);
            } else {
                arrayList.add(market);
            }
            z = zContains;
        }
        list.clear();
        list.addAll(arrayList);
    }

    public static void Y1(TextView textView, String str) {
        textView.setText(str);
        if (StringsKt.M(str, " ", false)) {
            textView.setGravity(17);
        } else {
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setMaxLines(1);
        }
    }

    public final String A1(Event event) {
        lvs lvsVar = this.w;
        String str = null;
        if (lvsVar == null) {
            Intrinsics.n("liveTrackerWidgetUrlBuilder");
            throw null;
        }
        String str2 = event.eventId;
        str2.getClass();
        Sport sport = event.sport;
        if (sport != null) {
            str = sport.id;
        }
        String sourceId = event.getSourceId();
        sourceId.getClass();
        EventSource eventSource = event.eventSource;
        String languageCode = getAccountHelper().getLanguageCode();
        languageCode.getClass();
        return lvsVar.a(str2, str, sourceId, eventSource, languageCode);
    }

    @Override // defpackage.fe00
    public final ee<String> B0() {
        return this.S0;
    }

    public final String B1(Event event) {
        lvs lvsVar = this.w;
        if (lvsVar == null) {
            Intrinsics.n("liveTrackerWidgetUrlBuilder");
            throw null;
        }
        String str = event.eventId;
        str.getClass();
        String str2 = event.sport.id;
        EventSource eventSource = event.eventSource;
        String languageCode = getAccountHelper().getLanguageCode();
        languageCode.getClass();
        return lvs.c(lvsVar, str, str2, eventSource, languageCode, "dark", null, null, 224);
    }

    public final void C1() {
        agd0 agd0Var = this.R;
        if (agd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        agd0Var.H.setVisibility(8);
        agd0 agd0Var2 = this.R;
        if (agd0Var2 != null) {
            agd0Var2.I.setVisibility(8);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    public final void D1(TabLayout tabLayout, String str, String str2) {
        boolean zG = Intrinsics.g(str2, "favorites");
        Drawable drawable = getDrawable(R.drawable.ic_star_on);
        TabLayout.g gVarL = tabLayout.l();
        if (!zG || drawable == null) {
            View viewInflate = LayoutInflater.from(this).inflate(R.layout.spr_market_tab, (ViewGroup) null);
            viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            TextView textView = (TextView) viewInflate.findViewById(R.id.title);
            textView.setTextColor(getColor(R.color.white));
            textView.setText(str);
            gVarL.c(viewInflate);
        } else {
            gVarL.d(drawable);
        }
        gVarL.a = str2;
        tabLayout.b(gVarL);
    }

    public final iym F1() {
        iym iymVar = this.D;
        if (iymVar != null) {
            return iymVar;
        }
        Intrinsics.n("openTelemetryLogger");
        throw null;
    }

    public final String G1() {
        agd0 agd0Var = this.R;
        if (agd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TabLayout.g gVarK = agd0Var.C.k(this.G0);
        Object obj = gVarK != null ? gVarK.a : null;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final void H1() {
        td7 td7Var = this.A0;
        if (td7Var != null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
            aVarA.h(R.anim.slide_in, R.anim.slide_out, 0, 0);
            aVarA.o(td7Var);
            aVarA.k(true, true);
            agd0 agd0Var = this.R;
            if (agd0Var == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var.J.setVisibility(8);
        }
        if (isFinishing()) {
            return;
        }
        ((br3) mmc.a(hp0.A, br3.class)).U().a(this, true);
        wq3 wq3VarU = ((br3) mmc.a(hp0.A, br3.class)).U();
        ArrayList arrayListU = wq3VarU.c.U();
        if (arrayListU.isEmpty()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        OutcomesRequest outcomesRequestK = g880.k(arrayListU, true);
        z7h z7hVarB = ap0.b();
        jqa0 jqa0Var = jqa0.BETSLIP_BUTTON_FOREGROUND;
        String requestBody = outcomesRequestK.getRequestBody();
        z7hVarB.getClass();
        z7hVarB.K("Betslip-Manager-QuickBet-View", requestBody).G(new xq3(wq3VarU, arrayListU, jCurrentTimeMillis));
    }

    public final void I1() {
        e2(false, null, null);
    }

    public final boolean J1() {
        td7 td7Var = this.A0;
        return td7Var != null && td7Var.isVisible();
    }

    public final void K1(int i) {
        agd0 agd0Var = this.R;
        if (agd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = agd0Var.L.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        Resources resources = getResources();
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = i == 0 ? (int) resources.getDimension(R.dimen.refresh_btn_margin_bottom) : i + ((int) resources.getDimension(R.dimen.refresh_btn_margin_bottom_when_qb_isshowed));
        agd0 agd0Var2 = this.R;
        if (agd0Var2 != null) {
            agd0Var2.L.setLayoutParams(layoutParams2);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L1(ad7 ad7Var) {
        Uri uri;
        if (ad7.a == ad7Var) {
            getAccountHelper().demandAccount(this, new tit() { // from class: ojg
                @Override // defpackage.tit
                public final void w(Account account, boolean z) {
                    int i = EventActivity.U0;
                    if (account != null) {
                        EventActivity eventActivity = this.a;
                        eventActivity.k2();
                        eventActivity.L1(ad7.d);
                    }
                }
            });
            return;
        }
        if (ad7.b == ad7Var) {
            if (J1()) {
                H1();
                return;
            }
            k650 k650Var = this.G;
            if (k650Var == null) {
                Intrinsics.n("remoteConfigRepository");
                throw null;
            }
            ljs.b = k650Var.b("is_chat_logging_enabled");
            String string = UUID.randomUUID().toString();
            string.getClass();
            ljs.c = string;
            itf0.a aVar = itf0.a;
            aVar.q("SPORTY_CHAT_GA_EVENT");
            aVar.a(inm.a("operationID: ", ljs.c), new Object[0]);
            X1();
            td7 td7Var = this.A0;
            if (td7Var == null) {
                td7 td7Var2 = new td7();
                Bundle bundle = new Bundle();
                bundle.putBoolean("arg_hide_share_button", false);
                bundle.putBoolean("arg_force_dark_mode", true);
                td7Var2.setArguments(bundle);
                this.A0 = td7Var2;
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                androidx.fragment.app.a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
                aVarA.h(R.anim.slide_in, R.anim.slide_out, 0, 0);
                aVarA.e(R.id.fragment_container, td7Var2, null, 1);
                aVarA.d();
            } else {
                FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                androidx.fragment.app.a aVarA2 = oke.a(supportFragmentManager2, supportFragmentManager2);
                aVarA2.h(R.anim.slide_in, R.anim.slide_out, 0, 0);
                aVarA2.s(td7Var);
                aVarA2.d();
            }
            agd0 agd0Var = this.R;
            if (agd0Var == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var.J.setVisibility(0);
            ((br3) mmc.a(hp0.A, br3.class)).U().a(this, false);
            return;
        }
        if (ad7.c == ad7Var) {
            if (J1()) {
                H1();
                return;
            }
            return;
        }
        if (ad7.d == ad7Var) {
            if (getAccountHelper().isLogin()) {
                String lastNickName = getAccountHelper().getLastNickName();
                if (lastNickName == null || StringsKt.U(lastNickName)) {
                    if (J1()) {
                        be7 be7Var = this.C0;
                        if (be7Var == null) {
                            Intrinsics.n("chatroomViewModel");
                            throw null;
                        }
                        kd2.a(0, be7Var.e, null);
                    }
                    getAccountHelper().loadAccountInfo(new w8() { // from class: pjg
                        @Override // defpackage.w8
                        public final void a(AccountInfo accountInfo, String str, String str2) {
                            int i = EventActivity.U0;
                            final EventActivity eventActivity = this.a;
                            eventActivity.k2();
                            String lastNickName2 = eventActivity.getAccountHelper().getLastNickName();
                            if (lastNickName2 == null || StringsKt.U(lastNickName2)) {
                                hsx hsxVar = eventActivity.x0;
                                if (hsxVar == null) {
                                    str<hsx> strVar = eventActivity.O;
                                    if (strVar == null) {
                                        Intrinsics.n("nickNameDialogLazy");
                                        throw null;
                                    }
                                    hsxVar = strVar.get();
                                    eventActivity.x0 = hsxVar;
                                    if (hsxVar != null) {
                                        hsxVar.y = new hsx.c() { // from class: sjg
                                            @Override // hsx.c
                                            public final void onDismiss() {
                                                EditText editText;
                                                int i2 = EventActivity.U0;
                                                EventActivity eventActivity2 = eventActivity;
                                                eventActivity2.k2();
                                                hsx hsxVar2 = eventActivity2.x0;
                                                if (hsxVar2 == null || (editText = hsxVar2.i) == null) {
                                                    return;
                                                }
                                                editText.postDelayed(new xjg(eventActivity2, 0), 50L);
                                            }
                                        };
                                    }
                                }
                                if (hsxVar != null) {
                                    hsxVar.b();
                                }
                            }
                            if (eventActivity.J1()) {
                                be7 be7Var2 = eventActivity.C0;
                                if (be7Var2 != null) {
                                    kd2.a(8, be7Var2.e, null);
                                } else {
                                    Intrinsics.n("chatroomViewModel");
                                    throw null;
                                }
                            }
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        if (ad7.i == ad7Var) {
            getAccountHelper().demandAccount(this, new tit() { // from class: qjg
                @Override // defpackage.tit
                public final void w(Account account, boolean z) {
                    int i = EventActivity.U0;
                    if (account != null) {
                        EventActivity eventActivity = this.a;
                        eventActivity.saveDataBeforeRecreate();
                        Intent intent = new Intent(eventActivity, (Class<?>) ChooseBetActivity.class);
                        e eVar = eventActivity.E0;
                        if (eVar == null) {
                            Intrinsics.n("eventViewModel");
                            throw null;
                        }
                        intent.putExtra("key_event_id", eVar.Q);
                        intent.putExtra("key_come_from", 1);
                        eventActivity.startActivityForResult(intent, 1);
                    }
                }
            });
            return;
        }
        if (ad7.v == ad7Var) {
            new ja7().show(getSupportFragmentManager(), "chat_guideline");
            return;
        }
        if (ad7.w == ad7Var) {
            be7 be7Var2 = this.C0;
            if (be7Var2 == null) {
                Intrinsics.n("chatroomViewModel");
                throw null;
            }
            LiveShareBetData liveShareBetData = (LiveShareBetData) be7Var2.G.d();
            if (liveShareBetData == null || (uri = liveShareBetData.getUri()) == null) {
                return;
            }
            Intent intent = new Intent(this, (Class<?>) ZoomImageActivity.class);
            intent.putExtra("param_image_uri", uri.toString());
            startActivity(intent);
            return;
        }
        if (ad7.A == ad7Var) {
            agd0 agd0Var2 = this.R;
            if (agd0Var2 != null) {
                agd0Var2.J.setVisibility(8);
                return;
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
        if (ad7.B == ad7Var) {
            zy80 zy80Var = this.z0;
            if (zy80Var != null) {
                zy80Var.c();
                return;
            }
            return;
        }
        if (ad7.y == ad7Var) {
            zyf0.c(1, getCMSString(R.string.common_feedback__please_write_a_comment, new Object[0]));
        } else if (ad7.z == ad7Var) {
            zyf0.c(1, getCMSString(R.string.component_wap_share_bet__try_later_to_share_code, new Object[0]));
        }
    }

    public final void M1(final TabLayout.g gVar) {
        gVar.getClass();
        agd0 agd0Var = this.R;
        if (agd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        if (agd0Var.K.V()) {
            agd0 agd0Var2 = this.R;
            if (agd0Var2 != null) {
                agd0Var2.K.postDelayed(new Runnable() { // from class: ujg
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = EventActivity.U0;
                        this.a.M1(gVar);
                    }
                }, 50L);
                return;
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
        com.sportybet.plugin.event.e eVar = this.E0;
        if (eVar == null) {
            Intrinsics.n("eventViewModel");
            throw null;
        }
        String str = eVar.Q;
        if (this.G0 == 0 && !b3.S(str)) {
            getAccountHelper().demandAccount(this, new tit() { // from class: yjg
                @Override // defpackage.tit
                public final void w(Account account, boolean z) {
                    if (account == null) {
                        int i = EventActivity.U0;
                        return;
                    }
                    e eVar2 = this.a.E0;
                    if (eVar2 != null) {
                        eVar2.B1(false, new zjg(0));
                    } else {
                        Intrinsics.n("eventViewModel");
                        throw null;
                    }
                }
            });
            return;
        }
        T1(this.G0);
        Object obj = gVar.a;
        String str2 = obj instanceof String ? (String) obj : null;
        if (str2 == null) {
            return;
        }
        List<Market> list = (List) this.T.get(str2);
        if (list == null) {
            list = m2g.a;
        }
        boolean zEquals = str2.equals("market_search");
        EventLiveAdapter eventLiveAdapter = this.w0;
        if (zEquals) {
            if (eventLiveAdapter != null) {
                eventLiveAdapter.setMarkets(list, this.d0, this.b0);
            }
        } else if (eventLiveAdapter != null) {
            eventLiveAdapter.setMarkets(list, this.d0);
        }
        String str3 = this.Y;
        if (str3 != null) {
            Market marketC = vpu.c(str3, this.Z, list);
            if (marketC != null) {
                EventLiveAdapter eventLiveAdapter2 = this.w0;
                if (eventLiveAdapter2 != null) {
                    eventLiveAdapter2.highlightMarket(marketC);
                }
                int iIndexOf = list.indexOf(marketC);
                Integer numValueOf = Integer.valueOf(iIndexOf);
                if (iIndexOf <= 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    final int iIntValue = numValueOf.intValue();
                    agd0 agd0Var3 = this.R;
                    if (agd0Var3 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    agd0Var3.G.post(new Runnable() { // from class: wjg
                        @Override // java.lang.Runnable
                        public final void run() {
                            EventActivity eventActivity = this.a;
                            agd0 agd0Var4 = eventActivity.R;
                            if (agd0Var4 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            agd0Var4.G.C(agd0Var4.K);
                            agd0 agd0Var5 = eventActivity.R;
                            if (agd0Var5 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            int height = agd0Var5.F.getHeight();
                            agd0 agd0Var6 = eventActivity.R;
                            if (agd0Var6 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            int height2 = agd0Var6.d.getHeight() + height;
                            agd0 agd0Var7 = eventActivity.R;
                            if (agd0Var7 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            RecyclerView.o layoutManager = agd0Var7.K.getLayoutManager();
                            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                            if (linearLayoutManager != null) {
                                linearLayoutManager.w1(iIntValue, height2);
                            }
                        }
                    });
                }
            }
            this.Y = null;
        }
    }

    public final void N1() {
        R1(false);
        com.sportybet.plugin.event.e eVar = this.E0;
        if (eVar != null) {
            eVar.A1(false, true);
        } else {
            Intrinsics.n("eventViewModel");
            throw null;
        }
    }

    public final void O1() {
        agd0 agd0Var = this.R;
        if (agd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        agd0Var.D.setImageTintList(th50.a(R.color.brand_quinary, getTheme(), getResources()));
        agd0 agd0Var2 = this.R;
        if (agd0Var2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        int scrollX = agd0Var2.C.getScrollX();
        agd0 agd0Var3 = this.R;
        if (agd0Var3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TabLayout tabLayout = agd0Var3.C;
        TabLayout.g gVarK = tabLayout.k(tabLayout.getTabCount() - 1);
        if (gVarK != null) {
            agd0 agd0Var4 = this.R;
            if (agd0Var4 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var4.C.s(gVarK, true);
        }
        agd0 agd0Var5 = this.R;
        if (agd0Var5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        int i = 0;
        agd0Var5.C.scrollTo(scrollX, 0);
        agd0 agd0Var6 = this.R;
        if (agd0Var6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        agd0Var6.E.setVisibility(0);
        agd0 agd0Var7 = this.R;
        if (agd0Var7 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        ComposeView composeView = agd0Var7.E;
        com.sportybet.plugin.event.e eVar = this.E0;
        if (eVar != null) {
            aru.f(composeView, eVar.H1(), true, new Function1() { // from class: vig
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    int i2 = EventActivity.U0;
                    str.getClass();
                    EventActivity eventActivity = this.a;
                    eventActivity.a0 = str;
                    HashMap map = eventActivity.T;
                    List<Market> list = (List) map.get("market_search");
                    List list2 = (List) map.get("all");
                    if (list2 == null) {
                        list2 = m2g.a;
                    }
                    if (str.length() != 0) {
                        FilteredMarkets filteredMarketsB = vpu.b(str, list2);
                        String keyword = filteredMarketsB.getKeyword();
                        if (keyword == null) {
                            keyword = "";
                        }
                        if (list != null) {
                            list.clear();
                            list.addAll(filteredMarketsB.getMarkets());
                        }
                        str = keyword;
                    } else if (list != null) {
                        list.clear();
                    }
                    EventLiveAdapter eventLiveAdapter = eventActivity.w0;
                    if (eventLiveAdapter != null) {
                        if (list == null) {
                            list = m2g.a;
                        }
                        eventLiveAdapter.setMarkets(list, eventActivity.d0, eventActivity.b0);
                    }
                    return str;
                }
            }, new wig(this, i), new Function0() { // from class: xig
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i2 = EventActivity.U0;
                    rgy rgyVar = (rgy) CollectionsKt.firstOrNull(hhy.a());
                    EventActivity eventActivity = this.a;
                    if (rgyVar == null) {
                        rgyVar = eventActivity.b0;
                    }
                    eventActivity.b0 = rgyVar;
                    List<Market> list = (List) eventActivity.T.get("market_search");
                    EventLiveAdapter eventLiveAdapter = eventActivity.w0;
                    if (eventLiveAdapter != null) {
                        if (list == null) {
                            list = m2g.a;
                        }
                        eventLiveAdapter.setMarkets(list, eventActivity.d0, eventActivity.b0);
                    }
                    eventActivity.O1();
                    return Unit.a;
                }
            }, this.b0, true);
        } else {
            Intrinsics.n("eventViewModel");
            throw null;
        }
    }

    public final void P1() {
        boolean z = !this.n0;
        this.n0 = z;
        agd0 agd0Var = this.R;
        if (agd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        agd0Var.d.setMatchTrackerActivated(z);
        if (this.n0) {
            this.l0 = false;
            I1();
            com.sportybet.plugin.event.e eVar = this.E0;
            if (eVar == null) {
                Intrinsics.n("eventViewModel");
                throw null;
            }
            String strA1 = A1(eVar.F1());
            d2(null, false);
            Z1(null, false);
            c2(strA1, true);
            agd0 agd0Var2 = this.R;
            if (agd0Var2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var2.d.setStreamingActivated(false);
            this.m0 = false;
            agd0 agd0Var3 = this.R;
            if (agd0Var3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var3.d.setStatsActivated(false);
            this.o0 = false;
            agd0 agd0Var4 = this.R;
            if (agd0Var4 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var4.d.setGamesActivated(false);
            S1();
        } else {
            c2(null, false);
        }
        LiveEventHeaderView liveEventHeaderView = this.v0;
        if (liveEventHeaderView == null) {
            Intrinsics.n("liveEventHeaderView");
            throw null;
        }
        com.sportybet.plugin.event.e eVar2 = this.E0;
        if (eVar2 != null) {
            liveEventHeaderView.b(eVar2.F1(), this.W);
        } else {
            Intrinsics.n("eventViewModel");
            throw null;
        }
    }

    public final void Q1(final LiveEventMatchWebView liveEventMatchWebView, String str, boolean z) {
        int visibility = liveEventMatchWebView.getVisibility();
        if (visibility == 8) {
            liveEventMatchWebView.setVisibility(4);
        }
        if (z) {
            liveEventMatchWebView.setOnPageFinishedListener(new ijg(this, liveEventMatchWebView, 0));
        }
        com.sportybet.plugin.event.e eVar = this.E0;
        if (eVar == null) {
            Intrinsics.n("eventViewModel");
            throw null;
        }
        LiveEventMatchWebView.a(liveEventMatchWebView, eVar.Q, this.W, str, false, 8);
        if (visibility == 8) {
            liveEventMatchWebView.post(new Runnable() { // from class: jjg
                @Override // java.lang.Runnable
                public final void run() {
                    int i = EventActivity.U0;
                    liveEventMatchWebView.setVisibility(8);
                }
            });
        }
    }

    public final void R1(boolean z) {
        if (getAccountHelper().getAccount() == null || this.w0 == null || this.i0) {
            return;
        }
        this.i0 = true;
        gq6 gq6Var = this.N;
        if (gq6Var == null) {
            Intrinsics.n("cashoutOpenBetsCountManager");
            throw null;
        }
        com.sportybet.plugin.event.e eVar = this.E0;
        if (eVar != null) {
            gq6Var.b(eVar.Q, ebs.a(getLifecycle()), z, new f());
        } else {
            Intrinsics.n("eventViewModel");
            throw null;
        }
    }

    public final void S1() {
        agd0 agd0Var = this.R;
        if (agd0Var != null) {
            agd0Var.G.post(new Runnable() { // from class: kjg
                @Override // java.lang.Runnable
                public final void run() {
                    EventActivity eventActivity = this.a;
                    agd0 agd0Var2 = eventActivity.R;
                    if (agd0Var2 == null) {
                        Intrinsics.n(yFmFZvuWxAYfEj.IxQRf);
                        throw null;
                    }
                    ConsecutiveScrollerLayout consecutiveScrollerLayout = agd0Var2.G;
                    LiveEventHeaderView liveEventHeaderView = eventActivity.v0;
                    if (liveEventHeaderView != null) {
                        consecutiveScrollerLayout.D(liveEventHeaderView);
                    } else {
                        Intrinsics.n("liveEventHeaderView");
                        throw null;
                    }
                }
            });
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    public final void T1(int i) {
        agd0 agd0Var = this.R;
        if (agd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TabLayout.g gVarK = agd0Var.C.k(i);
        if (gVarK == null || this.w0 == null) {
            return;
        }
        agd0 agd0Var2 = this.R;
        if (agd0Var2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        agd0Var2.C.s(gVarK, true);
        EventLiveAdapter eventLiveAdapter = this.w0;
        if (eventLiveAdapter != null) {
            Object obj = gVarK.a;
            eventLiveAdapter.setSelectedMarketGroupTab(i, obj instanceof String ? (String) obj : null);
        }
    }

    public final void U1() {
        arm armVar = this.v;
        if (armVar == null) {
            Intrinsics.n("appInfo");
            throw null;
        }
        boolean zA = armVar.a();
        boolean zR = getCountryManager().r();
        hug0.a aVar = hug0.a;
        aVar.getClass();
        Context applicationContext = hp0.A.getApplicationContext();
        applicationContext.getClass();
        aVar.getClass();
        boolean z = hug0.a.a(applicationContext) == hug0.e;
        if (zA && zR && z) {
            agd0 agd0Var = this.R;
            if (agd0Var == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var.b.setVisibility(8);
            agd0 agd0Var2 = this.R;
            if (agd0Var2 != null) {
                agd0Var2.f.setChatEnable(false);
                return;
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
        com.sportybet.plugin.event.e eVar = this.E0;
        if (eVar == null) {
            Intrinsics.n("eventViewModel");
            throw null;
        }
        boolean zG1 = eVar.G1();
        agd0 agd0Var3 = this.R;
        if (!zG1) {
            if (agd0Var3 != null) {
                agd0Var3.b.setVisibility(0);
                return;
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
        if (agd0Var3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        agd0Var3.b.setVisibility(8);
        agd0 agd0Var4 = this.R;
        if (agd0Var4 != null) {
            agd0Var4.f.setChatEnable(true);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    public final void V1(LiveStreamData liveStreamData, final ius iusVar) {
        agd0 agd0Var = this.R;
        if (agd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        agd0Var.d.setStreamingActivated(true);
        c2(null, false);
        d2(null, false);
        Z1(null, false);
        e2(true, liveStreamData, iusVar);
        if (iusVar != null) {
            agd0 agd0Var2 = this.R;
            if (agd0Var2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            LiveEventVideoView liveEventVideoView = agd0Var2.w;
            final wkg wkgVar = new wkg(0, this, EventActivity.class, "onLiveStreamLoginClicked", "onLiveStreamLoginClicked()V", 0);
            final xkg xkgVar = new xkg(0, this, EventActivity.class, "onLiveStreamDepositClicked", "onLiveStreamDepositClicked()V", 0);
            final ykg ykgVar = new ykg(0, this, EventActivity.class, "trackFtdLiveStreamBlockView", "trackFtdLiveStreamBlockView()V", 0);
            liveEventVideoView.setVideoPlayWhenReady(false);
            liveEventVideoView.setPlayerLayout(true, 0.5625f, false);
            ems emsVar = liveEventVideoView.L;
            TextView textView = emsVar.z;
            ComposeView composeView = emsVar.i;
            textView.setVisibility(8);
            composeView.setVisibility(0);
            composeView.setContent(new op8(-1431428161, new Function2() { // from class: ams
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i = LiveEventVideoView.W;
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        int iOrdinal = iusVar.ordinal();
                        if (iOrdinal == 0) {
                            aVar.N(1054482181);
                            lys.a(0, aVar);
                            aVar.H();
                        } else if (iOrdinal == 1) {
                            aVar.N(1054022358);
                            qit.a(wkgVar, aVar, 0);
                            aVar.H();
                        } else {
                            if (iOrdinal != 2) {
                                throw rg.a(-1212926944, aVar);
                            }
                            aVar.N(1054228911);
                            s6e.a(xkgVar, ykgVar, aVar, 0);
                            aVar.H();
                        }
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
        this.n0 = false;
        agd0 agd0Var3 = this.R;
        if (agd0Var3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        agd0Var3.d.setMatchTrackerActivated(false);
        this.m0 = false;
        agd0 agd0Var4 = this.R;
        if (agd0Var4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        agd0Var4.d.setStatsActivated(false);
        this.o0 = false;
        agd0 agd0Var5 = this.R;
        if (agd0Var5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        agd0Var5.d.setGamesActivated(false);
        S1();
    }

    public final void W1(boolean z, boolean z2) {
        if (!z2) {
            com.sportybet.plugin.event.e eVar = this.E0;
            if (eVar == null) {
                Intrinsics.n("eventViewModel");
                throw null;
            }
            if (eVar.J1()) {
                com.sportybet.plugin.event.e eVar2 = this.E0;
                if (eVar2 == null) {
                    Intrinsics.n("eventViewModel");
                    throw null;
                }
                Event eventF1 = eVar2.F1();
                SimpleActionBar simpleActionBar = this.u0;
                if (z) {
                    if (simpleActionBar != null) {
                        simpleActionBar.setTitleWithFadeAnimation(eventF1.sport.category.tournament.name);
                        return;
                    } else {
                        Intrinsics.n("titleContainer");
                        throw null;
                    }
                }
                if (simpleActionBar != null) {
                    simpleActionBar.setDoubleTextWithSeparatorTitle(eventF1.homeTeamName, eventF1.awayTeamName, getCMSString(R.string.bet_history__vs, new Object[0]));
                    return;
                } else {
                    Intrinsics.n("titleContainer");
                    throw null;
                }
            }
        }
        SimpleActionBar simpleActionBar2 = this.u0;
        if (simpleActionBar2 != null) {
            simpleActionBar2.setTitleWithFadeAnimation(getCMSString(R.string.common_functions__details, new Object[0]));
        } else {
            Intrinsics.n("titleContainer");
            throw null;
        }
    }

    public final void X1() {
        String userId = getAccountHelper().getUserId();
        if (userId == null) {
            userId = "";
        }
        String lastNickName = getAccountHelper().getLastNickName();
        String str = lastNickName != null ? lastNickName : "";
        be7 be7Var = this.C0;
        if (be7Var != null) {
            be7Var.D1(userId, getCountryManager().getCountryCode(), str);
        } else {
            Intrinsics.n("chatroomViewModel");
            throw null;
        }
    }

    public final void Z1(String str, boolean z) {
        if (z && str != null) {
            h0j0.c(str, "platform", "ANDROID");
        }
        agd0 agd0Var = this.R;
        if (agd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        LiveEventMatchWebView liveEventMatchWebView = agd0Var.y;
        if (agd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        b2(z, str, R.id.live_games_view, liveEventMatchWebView, agd0Var.A, false);
        if (z) {
            agd0 agd0Var2 = this.R;
            if (agd0Var2 != null) {
                agd0Var2.z.setActive(false);
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
    }

    public final void a2() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        hmk hmkVar = this.D0;
        if (hmkVar == null) {
            Intrinsics.n("giftGrabViewModel");
            throw null;
        }
        String str = hmkVar.v;
        String str2 = hmkVar.w;
        str.getClass();
        str2.getClass();
        if (supportFragmentManager.H("LiveGiftGrabInfoDialog") != null) {
            return;
        }
        Bundle bundleA = whs.a("key - tournament id", str, "key - event id", str2);
        vns vnsVar = new vns();
        vnsVar.setArguments(bundleA);
        vnsVar.show(supportFragmentManager, "LiveGiftGrabInfoDialog");
    }

    public final void b2(boolean z, String str, int i, LiveEventMatchWebView liveEventMatchWebView, LiveEventMatchWebView liveEventMatchWebView2, boolean z2) {
        liveEventMatchWebView.setVisibility(z ? 0 : 8);
        if (!z || str == null) {
            liveEventMatchWebView.setActive(false);
            agd0 agd0Var = this.R;
            if (agd0Var == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var.i.setVisibility(8);
            agd0 agd0Var2 = this.R;
            if (agd0Var2 != null) {
                agd0Var2.v.setVisibility(8);
                return;
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
        liveEventMatchWebView.setActive(true);
        liveEventMatchWebView2.setActive(false);
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        agd0 agd0Var3 = this.R;
        if (agd0Var3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        bVar.f(agd0Var3.e);
        bVar.h(R.id.hide_side_bg, 3, i, 4, 0);
        agd0 agd0Var4 = this.R;
        if (agd0Var4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        bVar.b(agd0Var4.e);
        agd0 agd0Var5 = this.R;
        if (agd0Var5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        agd0Var5.i.setVisibility(0);
        agd0 agd0Var6 = this.R;
        if (agd0Var6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        agd0Var6.v.setVisibility(0);
        com.sportybet.plugin.event.e eVar = this.E0;
        if (eVar != null) {
            LiveEventMatchWebView.a(liveEventMatchWebView, eVar.Q, this.W, str, z2, 16);
        } else {
            Intrinsics.n("eventViewModel");
            throw null;
        }
    }

    public final void c2(String str, boolean z) {
        agd0 agd0Var = this.R;
        if (agd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        LiveEventMatchWebView liveEventMatchWebView = agd0Var.A;
        if (agd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        b2(z, str, R.id.live_tracker_view, liveEventMatchWebView, agd0Var.z, true);
        if (z) {
            iym iymVarF1 = F1();
            PageMeta.INSTANCE.getClass();
            iymVarF1.f(AnalyticsEvent.EVENT_DETAIL_MATCH_TRACKER_CLICK, PageMeta.Companion.a());
        }
    }

    public final void d2(String str, boolean z) {
        agd0 agd0Var = this.R;
        if (agd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        LiveEventMatchWebView liveEventMatchWebView = agd0Var.z;
        if (agd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        b2(z, str, R.id.live_stats_view, liveEventMatchWebView, agd0Var.A, true);
        if (z) {
            iym iymVarF1 = F1();
            PageMeta.INSTANCE.getClass();
            iymVarF1.f(AnalyticsEvent.EVENT_DETAIL_STATS_CLICK, PageMeta.Companion.a());
        }
    }

    @Override // defpackage.r1k, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        td7 td7Var;
        motionEvent.getClass();
        if (motionEvent.getAction() == 0 && J1() && (td7Var = this.A0) != null) {
            td7Var.j0(motionEvent);
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (NullPointerException unused) {
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:168:0x0305  */
    /* JADX WARN: Code duplicated, block: B:170:0x030f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0313  */
    /* JADX WARN: Code duplicated, block: B:174:0x031b  */
    /* JADX WARN: Code duplicated, block: B:176:0x0321  */
    /* JADX WARN: Code duplicated, block: B:179:0x0345 A[Catch: Exception -> 0x0363, TryCatch #1 {Exception -> 0x0363, blocks: (B:177:0x0328, B:179:0x0345, B:181:0x0359, B:184:0x0365, B:185:0x036a), top: B:321:0x0328 }] */
    /* JADX WARN: Code duplicated, block: B:181:0x0359 A[Catch: Exception -> 0x0363, TryCatch #1 {Exception -> 0x0363, blocks: (B:177:0x0328, B:179:0x0345, B:181:0x0359, B:184:0x0365, B:185:0x036a), top: B:321:0x0328 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x0365 A[Catch: Exception -> 0x0363, TryCatch #1 {Exception -> 0x0363, blocks: (B:177:0x0328, B:179:0x0345, B:181:0x0359, B:184:0x0365, B:185:0x036a), top: B:321:0x0328 }] */
    /* JADX WARN: Code duplicated, block: B:191:0x037e  */
    /* JADX WARN: Code duplicated, block: B:193:0x0382  */
    /* JADX WARN: Code duplicated, block: B:195:0x0386  */
    /* JADX WARN: Code duplicated, block: B:197:0x038a  */
    /* JADX WARN: Code duplicated, block: B:199:0x039a  */
    /* JADX WARN: Code duplicated, block: B:200:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:202:0x03be  */
    /* JADX WARN: Instruction removed from duplicated block: B:179:0x0345, please report this as an issue */
    public final void e2(boolean z, LiveStreamData liveStreamData, ius iusVar) {
        String strA;
        Window window;
        agd0 agd0Var;
        LiveEventVideoView liveEventVideoView;
        String strS;
        float f2;
        String str;
        hns hnsVar;
        k650 k650Var;
        agd0 agd0Var2;
        String strOptString;
        String strOptString2;
        String strOptString3;
        rd00 rd00Var;
        su5<PerformStreamResp> su5VarA;
        agd0 agd0Var3 = this.R;
        if (agd0Var3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        hns hnsVar2 = agd0Var3.w.P;
        if (hnsVar2 == null) {
            Intrinsics.n("webViewHelper");
            throw null;
        }
        ems emsVar = hnsVar2.b;
        try {
            emsVar.A.setBackgroundColor(-16777216);
            emsVar.A.loadUrl("about:blank");
        } catch (Exception e2) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.p(e2, "Failed to reset WebView", new Object[0]);
        }
        agd0 agd0Var4 = this.R;
        if (agd0Var4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        agd0Var4.w.setContainerVisibility(z);
        agd0 agd0Var5 = this.R;
        if (z) {
            if (agd0Var5 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ems emsVar2 = agd0Var5.w.L;
            emsVar2.w.setVisibility(8);
            emsVar2.v.E();
            agd0 agd0Var6 = this.R;
            if (agd0Var6 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var6.w.L.i.setVisibility(8);
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            agd0 agd0Var7 = this.R;
            if (agd0Var7 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            bVar.f(agd0Var7.e);
            bVar.h(R.id.hide_side_bg, 3, R.id.live_event_video_view, 4, 0);
            agd0 agd0Var8 = this.R;
            if (agd0Var8 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            bVar.b(agd0Var8.e);
            agd0 agd0Var9 = this.R;
            if (agd0Var9 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var9.v.setVisibility(0);
            agd0 agd0Var10 = this.R;
            if (agd0Var10 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var10.i.setVisibility(0);
            mfb0 mfb0Var = this.W;
            com.sportybet.plugin.event.e eVar = this.E0;
            if (eVar == null) {
                Intrinsics.n("eventViewModel");
                throw null;
            }
            Event eventF1 = eVar.F1();
            int i = 2;
            if (mfb0Var == null || !mfb0Var.k()) {
                eid0 eid0Var = this.S;
                if (eid0Var == null) {
                    Intrinsics.n("liveEventScoreBinding");
                    throw null;
                }
                eid0Var.f.setVisibility(8);
            } else {
                String str2 = eventF1.awayTeamName;
                str2.getClass();
                eid0 eid0Var2 = this.S;
                if (eid0Var2 == null) {
                    Intrinsics.n("liveEventScoreBinding");
                    throw null;
                }
                Y1(eid0Var2.b, str2);
                String str3 = eventF1.homeTeamName;
                str3.getClass();
                eid0 eid0Var3 = this.S;
                if (eid0Var3 == null) {
                    Intrinsics.n("liveEventScoreBinding");
                    throw null;
                }
                Y1(eid0Var3.d, str3);
                ArrayList arrayListA = mfb0Var.A(eventF1.setScore, eventF1.pointScore, eventF1.gameScore);
                int size = arrayListA.size();
                eid0 eid0Var4 = this.S;
                if (size < 2) {
                    if (eid0Var4 == null) {
                        Intrinsics.n("liveEventScoreBinding");
                        throw null;
                    }
                    eid0Var4.f.setVisibility(8);
                } else {
                    if (eid0Var4 == null) {
                        Intrinsics.n("liveEventScoreBinding");
                        throw null;
                    }
                    eid0Var4.e.setText((CharSequence) arrayListA.get(0));
                    eid0 eid0Var5 = this.S;
                    if (eid0Var5 == null) {
                        Intrinsics.n("liveEventScoreBinding");
                        throw null;
                    }
                    eid0Var5.c.setText((CharSequence) arrayListA.get(1));
                    eid0 eid0Var6 = this.S;
                    if (eid0Var6 == null) {
                        Intrinsics.n("liveEventScoreBinding");
                        throw null;
                    }
                    eid0Var6.f.setVisibility(0);
                }
            }
            if (liveStreamData != null) {
                LiveStreamSharedData.getInstance().setLiveStreamData(liveStreamData);
                boolean z2 = liveStreamData instanceof LiveStreamDataSportyTV;
                ssw<Boolean> sswVar = this.H0;
                if (z2) {
                    this.f0 = true;
                    agd0 agd0Var11 = this.R;
                    if (agd0Var11 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    LiveEventVideoView liveEventVideoView2 = agd0Var11.w;
                    LiveStreamDataSportyTV liveStreamDataSportyTV = (LiveStreamDataSportyTV) liveStreamData;
                    com.sportybet.plugin.event.e eVar2 = this.E0;
                    if (eVar2 == null) {
                        Intrinsics.n("eventViewModel");
                        throw null;
                    }
                    String str4 = eVar2.Q;
                    Boolean boolD = sswVar.d();
                    boolean zBooleanValue = boolD != null ? boolD.booleanValue() : false;
                    str4.getClass();
                    hns hnsVar3 = liveEventVideoView2.P;
                    if (hnsVar3 == null) {
                        Intrinsics.n("webViewHelper");
                        throw null;
                    }
                    ems emsVar3 = hnsVar3.b;
                    AspectRatioFrameLayout aspectRatioFrameLayout = emsVar3.e;
                    aspectRatioFrameLayout.setVisibility(0);
                    aspectRatioFrameLayout.setAspectRatio(liveStreamDataSportyTV.playerRatio);
                    EPLStreamingMentionView ePLStreamingMentionView = emsVar3.f;
                    ePLStreamingMentionView.setVisibility(0);
                    ePLStreamingMentionView.setEPLWatchText(liveStreamDataSportyTV.getPlayInDotCom());
                    ePLStreamingMentionView.setListener(new dns(liveStreamDataSportyTV, hnsVar3, str4, ePLStreamingMentionView, zBooleanValue));
                    liveEventVideoView2.L.z.setVisibility(8);
                    return;
                }
                if (liveStreamData instanceof LiveStreamDataBetRadar) {
                    LiveStreamDataBetRadar liveStreamDataBetRadar = (LiveStreamDataBetRadar) liveStreamData;
                    agd0 agd0Var12 = this.R;
                    if (agd0Var12 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    LiveEventVideoView liveEventVideoView3 = agd0Var12.w;
                    String str5 = liveStreamDataBetRadar.streamSingleBitRate;
                    Boolean boolD2 = sswVar.d();
                    liveEventVideoView3.G(str5, liveStreamDataBetRadar, boolD2 != null ? boolD2.booleanValue() : false);
                } else if (liveStreamData instanceof LiveStreamDataTenTx) {
                    LiveStreamDataTenTx liveStreamDataTenTx = (LiveStreamDataTenTx) liveStreamData;
                    agd0 agd0Var13 = this.R;
                    if (agd0Var13 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    LiveEventVideoView liveEventVideoView4 = agd0Var13.w;
                    String url = liveStreamDataTenTx.getUrl();
                    Boolean boolD3 = sswVar.d();
                    liveEventVideoView4.G(url, liveStreamDataTenTx, boolD3 != null ? boolD3.booleanValue() : false);
                } else if (liveStreamData instanceof LiveStreamDataIGameMedia) {
                    this.q0 = b.c;
                    agd0 agd0Var14 = this.R;
                    if (agd0Var14 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    LiveEventVideoView liveEventVideoView5 = agd0Var14.w;
                    String url2 = ((LiveStreamDataIGameMedia) liveStreamData).getUrl();
                    Boolean boolD4 = sswVar.d();
                    liveEventVideoView5.G(url2, liveStreamData, boolD4 != null ? boolD4.booleanValue() : false);
                } else {
                    if (liveStreamData instanceof LiveStreamDataSocialMedia) {
                        LiveStreamDataSocialMedia liveStreamDataSocialMedia = (LiveStreamDataSocialMedia) liveStreamData;
                        agd0 agd0Var15 = this.R;
                        if (agd0Var15 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        agd0Var15.w.setUpChannelSwitch(liveStreamDataSocialMedia);
                        this.q0 = b.b;
                        agd0 agd0Var16 = this.R;
                        if (agd0Var16 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        LiveEventVideoView liveEventVideoView6 = agd0Var16.w;
                        List<SocialMediaStreamData> list = liveStreamDataSocialMedia.items;
                        list.getClass();
                        hns hnsVar4 = liveEventVideoView6.P;
                        if (hnsVar4 == null) {
                            Intrinsics.n("webViewHelper");
                            throw null;
                        }
                        SocialMediaStreamData socialMediaStreamData = (SocialMediaStreamData) CollectionsKt.V(hnsVar4.k, list);
                        strA = socialMediaStreamData != null ? hnsVar4.a(socialMediaStreamData) : "";
                        agd0 agd0Var17 = this.R;
                        if (agd0Var17 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        LiveEventVideoView liveEventVideoView7 = agd0Var17.w;
                        float f3 = liveStreamDataSocialMedia.playerRatio;
                        String str6 = liveStreamDataSocialMedia.platform;
                        hns hnsVar5 = liveEventVideoView7.P;
                        if (hnsVar5 == null) {
                            Intrinsics.n("webViewHelper");
                            throw null;
                        }
                        hnsVar5.d();
                        hnsVar5.p = str6;
                        cms cmsVar = hnsVar5.f;
                        Boolean bool = Boolean.FALSE;
                        cmsVar.invoke(bool, Float.valueOf(f3), bool);
                        hnsVar5.b.A.loadUrl(strA);
                        liveEventVideoView7.L.z.setVisibility(8);
                    } else if (liveStreamData instanceof LiveStreamDataWebView) {
                        LiveStreamDataWebView liveStreamDataWebView = (LiveStreamDataWebView) liveStreamData;
                        if (kotlin.text.c.l(liveStreamDataWebView.platform, "img", true)) {
                            k650 k650Var2 = this.G;
                            if (k650Var2 == null) {
                                Intrinsics.n("remoteConfigRepository");
                                throw null;
                            }
                            if (k650Var2.b("live_streaming_enable_img_native_1")) {
                                agd0 agd0Var18 = this.R;
                                if (agd0Var18 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                agd0Var18.w.setPlayerLayout(true, liveStreamDataWebView.playerRatio, true);
                                try {
                                    JSONObject jSONObject = new JSONObject(liveStreamDataWebView.data);
                                    String strOptString4 = jSONObject.optString("auth");
                                    String strOptString5 = jSONObject.optString("matchedEventId");
                                    long jOptLong = jSONObject.optLong("operatorId", -1L);
                                    long jOptLong2 = jSONObject.optLong(EventKeys.TIMESTAMP, -1L);
                                    pum pumVar = this.F;
                                    if (pumVar == null) {
                                        Intrinsics.n("imgApiService");
                                        throw null;
                                    }
                                    su5<IMGStreamResp> su5VarB = pumVar.b(strOptString5, jOptLong, strOptString4, jOptLong2);
                                    if (su5VarB != null) {
                                        su5VarB.G(new com.sportybet.plugin.event.a(this, liveStreamDataWebView));
                                    }
                                } catch (Exception e3) {
                                    this.q0 = b.b;
                                    agd0 agd0Var19 = this.R;
                                    if (agd0Var19 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    agd0Var19.w.E(liveStreamDataWebView, e3);
                                }
                            } else if (kotlin.text.c.l(liveStreamDataWebView.platform, "perform", true)) {
                                k650Var = this.G;
                                if (k650Var != null) {
                                    Intrinsics.n("remoteConfigRepository");
                                    throw null;
                                }
                                if (k650Var.b("live_streaming_enable_perform_native_1")) {
                                    agd0Var2 = this.R;
                                    if (agd0Var2 != null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    agd0Var2.w.setPlayerLayout(true, liveStreamDataWebView.playerRatio, true);
                                    JSONObject jSONObject2 = new JSONObject(liveStreamDataWebView.data);
                                    strOptString = jSONObject2.optString("oauthToken");
                                    strOptString2 = jSONObject2.optString("outletKey");
                                    strOptString3 = jSONObject2.optString("streamUuid");
                                    rd00Var = this.E;
                                    if (rd00Var != null) {
                                        Intrinsics.n("performApiService");
                                        throw null;
                                    }
                                    su5VarA = rd00Var.a("Bearer " + strOptString, "sportybet.com", strOptString2, strOptString3);
                                    if (su5VarA != null) {
                                        su5VarA.G(new com.sportybet.plugin.event.b(this, liveStreamDataWebView));
                                    }
                                } else {
                                    agd0Var = this.R;
                                    if (agd0Var != null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    liveEventVideoView = agd0Var.w;
                                    strS = bjb0.S("/m/liveStreamAgent");
                                    f2 = liveStreamDataWebView.playerRatio;
                                    str = liveStreamDataWebView.platform;
                                    hnsVar = liveEventVideoView.P;
                                    if (hnsVar != null) {
                                        Intrinsics.n("webViewHelper");
                                        throw null;
                                    }
                                    hnsVar.d();
                                    hnsVar.p = str;
                                    cms cmsVar2 = hnsVar.f;
                                    Boolean bool2 = Boolean.FALSE;
                                    cmsVar2.invoke(bool2, Float.valueOf(f2), bool2);
                                    hnsVar.b.A.loadUrl(strS);
                                    liveEventVideoView.L.z.setVisibility(8);
                                }
                            } else {
                                agd0Var = this.R;
                                if (agd0Var != null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                liveEventVideoView = agd0Var.w;
                                strS = bjb0.S("/m/liveStreamAgent");
                                f2 = liveStreamDataWebView.playerRatio;
                                str = liveStreamDataWebView.platform;
                                hnsVar = liveEventVideoView.P;
                                if (hnsVar != null) {
                                    Intrinsics.n("webViewHelper");
                                    throw null;
                                }
                                hnsVar.d();
                                hnsVar.p = str;
                                cms cmsVar3 = hnsVar.f;
                                Boolean bool3 = Boolean.FALSE;
                                cmsVar3.invoke(bool3, Float.valueOf(f2), bool3);
                                hnsVar.b.A.loadUrl(strS);
                                liveEventVideoView.L.z.setVisibility(8);
                            }
                        } else if (kotlin.text.c.l(liveStreamDataWebView.platform, "perform", true)) {
                            agd0Var = this.R;
                            if (agd0Var != null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            liveEventVideoView = agd0Var.w;
                            strS = bjb0.S("/m/liveStreamAgent");
                            f2 = liveStreamDataWebView.playerRatio;
                            str = liveStreamDataWebView.platform;
                            hnsVar = liveEventVideoView.P;
                            if (hnsVar != null) {
                                Intrinsics.n("webViewHelper");
                                throw null;
                            }
                            hnsVar.d();
                            hnsVar.p = str;
                            cms cmsVar4 = hnsVar.f;
                            Boolean bool4 = Boolean.FALSE;
                            cmsVar4.invoke(bool4, Float.valueOf(f2), bool4);
                            hnsVar.b.A.loadUrl(strS);
                            liveEventVideoView.L.z.setVisibility(8);
                        } else {
                            k650Var = this.G;
                            if (k650Var != null) {
                                Intrinsics.n("remoteConfigRepository");
                                throw null;
                            }
                            if (k650Var.b("live_streaming_enable_perform_native_1")) {
                                agd0Var2 = this.R;
                                if (agd0Var2 != null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                agd0Var2.w.setPlayerLayout(true, liveStreamDataWebView.playerRatio, true);
                                try {
                                    JSONObject jSONObject3 = new JSONObject(liveStreamDataWebView.data);
                                    strOptString = jSONObject3.optString("oauthToken");
                                    strOptString2 = jSONObject3.optString("outletKey");
                                    strOptString3 = jSONObject3.optString("streamUuid");
                                    rd00Var = this.E;
                                    if (rd00Var != null) {
                                        Intrinsics.n("performApiService");
                                        throw null;
                                    }
                                    su5VarA = rd00Var.a("Bearer " + strOptString, "sportybet.com", strOptString2, strOptString3);
                                    if (su5VarA != null) {
                                        su5VarA.G(new com.sportybet.plugin.event.b(this, liveStreamDataWebView));
                                    }
                                } catch (Exception e4) {
                                    this.q0 = b.b;
                                    agd0 agd0Var20 = this.R;
                                    if (agd0Var20 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    agd0Var20.w.E(liveStreamDataWebView, e4);
                                }
                            } else {
                                agd0Var = this.R;
                                if (agd0Var != null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                liveEventVideoView = agd0Var.w;
                                strS = bjb0.S("/m/liveStreamAgent");
                                f2 = liveStreamDataWebView.playerRatio;
                                str = liveStreamDataWebView.platform;
                                hnsVar = liveEventVideoView.P;
                                if (hnsVar != null) {
                                    Intrinsics.n("webViewHelper");
                                    throw null;
                                }
                                hnsVar.d();
                                hnsVar.p = str;
                                cms cmsVar5 = hnsVar.f;
                                Boolean bool5 = Boolean.FALSE;
                                cmsVar5.invoke(bool5, Float.valueOf(f2), bool5);
                                hnsVar.b.A.loadUrl(strS);
                                liveEventVideoView.L.z.setVisibility(8);
                            }
                        }
                    } else if (liveStreamData instanceof LiveStreamDataBeter) {
                        this.q0 = b.a;
                        agd0 agd0Var21 = this.R;
                        if (agd0Var21 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        LiveEventVideoView liveEventVideoView8 = agd0Var21.w;
                        LiveStreamDataBeter liveStreamDataBeter = (LiveStreamDataBeter) liveStreamData;
                        hns hnsVar6 = liveEventVideoView8.P;
                        if (hnsVar6 == null) {
                            Intrinsics.n("webViewHelper");
                            throw null;
                        }
                        hnsVar6.d();
                        hnsVar6.p = liveStreamDataBeter.platform;
                        cms cmsVar6 = hnsVar6.f;
                        Boolean bool6 = Boolean.FALSE;
                        cmsVar6.invoke(bool6, Float.valueOf(liveStreamDataBeter.playerRatio), bool6);
                        hnsVar6.b.A.loadDataWithBaseURL(hnsVar6.d.a("https", new String[0]), qae0.c("\n            <style>\n                body, html, iframe { margin: 0; padding: 0; width: 100%; height: 100%; }\n            </style>\n            <iframe src=\"" + liveStreamDataBeter.getBroadCastUrl() + "\" frameborder=\"0\"></iframe>\n        "), "text/html", "UTF-8", null);
                        liveEventVideoView8.L.z.setVisibility(8);
                    } else if (liveStreamData instanceof LiveStreamDataBetGenius) {
                        LiveStreamDataBetGenius liveStreamDataBetGenius = (LiveStreamDataBetGenius) liveStreamData;
                        if (liveStreamDataBetGenius.getEnableScreenProtection()) {
                            this.J0 = true;
                            getWindow().setFlags(8192, 8192);
                        }
                        bnh0 bnh0Var = this.M;
                        if (bnh0Var == null) {
                            Intrinsics.n("urlCreator");
                            throw null;
                        }
                        String host = Uri.parse(bnh0Var.a("https", new String[0])).getHost();
                        strA = host != null ? host : "";
                        agd0 agd0Var22 = this.R;
                        if (agd0Var22 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        LiveEventVideoView liveEventVideoView9 = agd0Var22.w;
                        String lowerCase = getCountryManager().getCountryCode().getCode().toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        com.sportybet.plugin.event.e eVar3 = this.E0;
                        if (eVar3 == null) {
                            Intrinsics.n("eventViewModel");
                            throw null;
                        }
                        Uri uri = liveStreamDataBetGenius.getUri(lowerCase, eVar3.Q, eVar3.y.a().a, strA);
                        String lastAccessToken = getAccountHelper().getLastAccessToken();
                        lastAccessToken.getClass();
                        float f4 = liveStreamDataBetGenius.playerRatio;
                        String str7 = liveStreamDataBetGenius.platform;
                        uri.getClass();
                        hns hnsVar7 = liveEventVideoView9.P;
                        if (hnsVar7 == null) {
                            Intrinsics.n("webViewHelper");
                            throw null;
                        }
                        WebView webView = hnsVar7.b.A;
                        hnsVar7.d();
                        hnsVar7.p = str7;
                        cms cmsVar7 = hnsVar7.f;
                        Boolean bool7 = Boolean.FALSE;
                        cmsVar7.invoke(bool7, Float.valueOf(f4), bool7);
                        WebSettings settings = webView.getSettings();
                        settings.setJavaScriptEnabled(true);
                        settings.setDomStorageEnabled(true);
                        settings.setAllowFileAccess(true);
                        settings.setCacheMode(2);
                        Context context = webView.getContext();
                        context.getClass();
                        Activity activityB = wc.b(context);
                        if (activityB != null && (window = activityB.getWindow()) != null) {
                            webView.setWebChromeClient(new tm2(webView, window, new oxd(hnsVar7, i)));
                            webView.setWebViewClient(new cns(hnsVar7));
                            CookieManager.getInstance().setCookie(oxc.a(uri.getScheme(), "://", uri.getHost()), qae0.c("accessToken=".concat(lastAccessToken)));
                            webView.loadUrl(uri.toString());
                        }
                        liveEventVideoView9.L.z.setVisibility(8);
                    } else {
                        LiveStreamSharedData.getInstance().setLiveStreamData(null);
                    }
                }
            } else {
                eid0 eid0Var7 = this.S;
                if (eid0Var7 == null) {
                    Intrinsics.n("liveEventScoreBinding");
                    throw null;
                }
                eid0Var7.f.setVisibility(8);
                if (iusVar == null) {
                    agd0 agd0Var23 = this.R;
                    if (agd0Var23 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    hns hnsVar8 = agd0Var23.w.P;
                    if (hnsVar8 == null) {
                        Intrinsics.n("webViewHelper");
                        throw null;
                    }
                    String strC = qae0.c("\n            <style>\n                body { background-color: black; display: flex; justify-content: center; align-items: center;\n                       color: white; text-align: center; }\n                html, body { width: 100%; height: 100%; }\n            </style>\n            <body><h3>" + sn5.b(hnsVar8.a, R.string.live__sorry_there_is_no_live_data, new Object[0]) + "</h3></body>\n        ");
                    cms cmsVar8 = hnsVar8.f;
                    Boolean bool8 = Boolean.FALSE;
                    cmsVar8.invoke(bool8, Float.valueOf(0.5625f), bool8);
                    hnsVar8.b.A.loadDataWithBaseURL(null, strC, "text/html", "UTF-8", null);
                }
            }
        } else {
            if (agd0Var5 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var5.w.L.i.setVisibility(8);
            agd0 agd0Var24 = this.R;
            if (agd0Var24 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var24.w.setVideoPlayWhenReady(false);
            androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
            agd0 agd0Var25 = this.R;
            if (agd0Var25 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            bVar2.f(agd0Var25.e);
            bVar2.h(R.id.hide_side_bg, 3, R.id.live_tracker_container, 4, 0);
            agd0 agd0Var26 = this.R;
            if (agd0Var26 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            bVar2.b(agd0Var26.e);
            agd0 agd0Var27 = this.R;
            if (agd0Var27 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var27.i.setVisibility(8);
            agd0 agd0Var28 = this.R;
            if (agd0Var28 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var28.v.setVisibility(8);
            eid0 eid0Var8 = this.S;
            if (eid0Var8 == null) {
                Intrinsics.n("liveEventScoreBinding");
                throw null;
            }
            eid0Var8.f.setVisibility(8);
        }
        com.sportybet.plugin.event.e eVar4 = this.E0;
        if (eVar4 != null) {
            j2(eVar4.F1(), this.W);
        } else {
            Intrinsics.n("eventViewModel");
            throw null;
        }
    }

    public final void g2() {
        h2();
        com.sportybet.plugin.event.e eVar = this.E0;
        if (eVar == null) {
            Intrinsics.n("eventViewModel");
            throw null;
        }
        Pair pair = new Pair(new GroupTopic(eVar.F1().getTopic()), this.L0);
        HashSet<Pair> hashSet = this.p0;
        hashSet.add(pair);
        for (Pair pair2 : hashSet) {
            SocketPushManager.getInstance().subscribeTopic((Topic) pair2.first, (Subscriber) pair2.second);
        }
    }

    public final void h2() {
        HashSet<Pair> hashSet = this.p0;
        for (Pair pair : hashSet) {
            SocketPushManager.getInstance().unsubscribeTopic((Topic) pair.first, (Subscriber) pair.second);
        }
        hashSet.clear();
    }

    public final void i2() {
        agd0 agd0Var = this.R;
        if (agd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        GiftGrabView giftGrabView = agd0Var.f;
        com.sportybet.plugin.event.e eVar = this.E0;
        if (eVar == null) {
            Intrinsics.n("eventViewModel");
            throw null;
        }
        giftGrabView.setVisibility(eVar.G1() ? 0 : 8);
        U1();
    }

    public final void j2(Event event, mfb0 mfb0Var) {
        Sport sport;
        Category category;
        Tournament tournament;
        String str;
        LiveEventHeaderView liveEventHeaderView = this.v0;
        if (liveEventHeaderView == null) {
            Intrinsics.n("liveEventHeaderView");
            throw null;
        }
        liveEventHeaderView.setVisibility(0);
        liveEventHeaderView.b(event, mfb0Var);
        agd0 agd0Var = this.R;
        if (agd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        LiveEventControlsHeaderView liveEventControlsHeaderView = agd0Var.d;
        liveEventControlsHeaderView.setVisibility(0);
        liveEventControlsHeaderView.a(event);
        agd0 agd0Var2 = this.R;
        if (agd0Var2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        LiveEventVideoView liveEventVideoView = agd0Var2.w;
        com.sportybet.plugin.event.e eVar = this.E0;
        if (eVar == null) {
            Intrinsics.n("eventViewModel");
            throw null;
        }
        String str2 = "unknown";
        if (eVar.J1() && (sport = eVar.F1().sport) != null && (category = sport.category) != null && (tournament = category.tournament) != null && (str = tournament.id) != null) {
            str2 = str;
        }
        liveEventVideoView.setFullScreenEnabled(!str2.equals("sr:tournament:16"));
    }

    @Override // defpackage.wym
    public final boolean k0() {
        return false;
    }

    public final void k2() {
        if (J1()) {
            X1();
        }
        be7 be7Var = this.C0;
        if (be7Var != null) {
            be7Var.D.m(ad7.f);
        } else {
            Intrinsics.n("chatroomViewModel");
            throw null;
        }
    }

    @Override // defpackage.fe00
    public final void l0(ge00 ge00Var) {
        this.T0 = ge00Var;
    }

    @Override // defpackage.wym
    public final boolean o() {
        return false;
    }

    @Override // androidx.fragment.app.e, defpackage.rn8, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            if (i == 2 && i2 == -1 && intent != null && (stringExtra = intent.getStringExtra("param_booking_code")) != null) {
                f00 f00Var = vgb0.a;
                Map mapSingletonMap = Collections.singletonMap("from", "ANY_EVENT_COMMENTS_LOAD_CODE");
                mapSingletonMap.getClass();
                vgb0.c(AnalyticsEvent.COMMENT_LOAD_BOOKING_CODE, mapSingletonMap, false);
                qz3.k(stringExtra, "ANY_EVENT_COMMENTS_LOAD_CODE");
                return;
            }
            return;
        }
        if (i2 != -1 || intent == null) {
            return;
        }
        Uri uri = (Uri) intent.getParcelableExtra("result_uri");
        ShareBetData shareBetData = (ShareBetData) intent.getParcelableExtra("key_share_bet_data");
        if (shareBetData != null) {
            zy80 zy80Var = this.z0;
            LiveShareBetData liveShareBetData = new LiveShareBetData(shareBetData.getShareCode(), shareBetData.getTotalOdds(), shareBetData.getTotalBonus(), shareBetData.getWinningStatus(), shareBetData.getTotalStake(), shareBetData.isAllSettled(), shareBetData.getImageUrl(), uri, zy80Var != null ? zy80Var.f() : null);
            be7 be7Var = this.C0;
            if (be7Var == null) {
                Intrinsics.n("chatroomViewModel");
                throw null;
            }
            be7Var.F.m(liveShareBetData);
            agd0 agd0Var = this.R;
            if (agd0Var != null) {
                agd0Var.J.setVisibility(0);
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        }
    }

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() {
        agd0 agd0Var = this.R;
        if (agd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        if (agd0Var.H.getVisibility() == 0) {
            C1();
            return true;
        }
        agd0 agd0Var2 = this.R;
        if (agd0Var2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        if (!agd0Var2.w.getFullscreen()) {
            if (!J1()) {
                return false;
            }
            H1();
            return true;
        }
        agd0 agd0Var3 = this.R;
        if (agd0Var3 != null) {
            agd0Var3.w.H(getWindow());
            return true;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        androidx.media3.exoplayer.d dVarA;
        androidx.media3.exoplayer.d dVarA2;
        androidx.media3.exoplayer.d dVarA3;
        androidx.media3.exoplayer.d dVarA4;
        super.onDestroy();
        if (this.k0) {
            return;
        }
        H1();
        iu2.q(this.M0);
        agd0 agd0Var = this.R;
        if (agd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        LiveEventVideoView liveEventVideoView = agd0Var.w;
        liveEventVideoView.setVideoPlayWhenReady(false);
        xls xlsVar = liveEventVideoView.N;
        if (xlsVar == null) {
            Intrinsics.n("videoPlayerHelper");
            throw null;
        }
        xlsVar.e.removeCallbacksAndMessages(null);
        androidx.media3.exoplayer.d dVar = xlsVar.f;
        if (dVar != null) {
            dVar.W(xlsVar.m);
            dVar.J(xlsVar.n);
            yxi0 yxi0Var = xlsVar.i;
            if (yxi0Var != null) {
                yxi0Var.a();
            }
            xlsVar.i = null;
            dVar.release();
        }
        hns hnsVar = liveEventVideoView.P;
        if (hnsVar == null) {
            Intrinsics.n("webViewHelper");
            throw null;
        }
        hnsVar.d();
        i0j0 i0j0Var = hnsVar.c;
        WebView webView = hnsVar.b.A;
        i0j0Var.uninstallJsBridge(webView);
        webView.onPause();
        iai0.a(webView);
        webView.destroy();
        c cVar = this.I0;
        if (cVar != null) {
            fdt.a(this).d(cVar);
        }
        this.I0 = null;
        agd0 agd0Var2 = this.R;
        if (agd0Var2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        LiveEventMatchWebView liveEventMatchWebView = agd0Var2.A;
        bls blsVar = liveEventMatchWebView.d;
        blsVar.c.removeJavascriptInterface("AndroidScrollBridge");
        i0j0 webViewWrapperService = liveEventMatchWebView.getWebViewWrapperService();
        WebView webView2 = blsVar.c;
        webViewWrapperService.uninstallJsBridge(webView2);
        iai0.a(webView2);
        webView2.destroy();
        agd0 agd0Var3 = this.R;
        if (agd0Var3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        LiveEventMatchWebView liveEventMatchWebView2 = agd0Var3.z;
        bls blsVar2 = liveEventMatchWebView2.d;
        blsVar2.c.removeJavascriptInterface("AndroidScrollBridge");
        i0j0 webViewWrapperService2 = liveEventMatchWebView2.getWebViewWrapperService();
        WebView webView3 = blsVar2.c;
        webViewWrapperService2.uninstallJsBridge(webView3);
        iai0.a(webView3);
        webView3.destroy();
        agd0 agd0Var4 = this.R;
        if (agd0Var4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        agd0Var4.O.clearAnimation();
        this.f0 = false;
        agd0 agd0Var5 = this.R;
        if (agd0Var5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        RadioPlaybackMiniPanel radioPlaybackMiniPanel = agd0Var5.d.e.d;
        if (radioPlaybackMiniPanel.F.compareAndSet(true, false)) {
            RadioService.a aVar = radioPlaybackMiniPanel.I;
            if (aVar != null && (dVarA4 = aVar.a()) != null) {
                dVarA4.n(false);
            }
            itf0.a aVar2 = itf0.a;
            aVar2.q("com.sporty.sportyfm");
            aVar2.a("RadioPlaybackPanel unBindService", new Object[0]);
            RadioService.a aVar3 = radioPlaybackMiniPanel.I;
            if (aVar3 != null && (dVarA3 = aVar3.a()) != null) {
                dVarA3.W(radioPlaybackMiniPanel.K);
            }
            RadioService.a aVar4 = radioPlaybackMiniPanel.I;
            if (aVar4 != null && (dVarA2 = aVar4.a()) != null) {
                dVarA2.n(false);
            }
            RadioService.a aVar5 = radioPlaybackMiniPanel.I;
            if (aVar5 != null && (dVarA = aVar5.a()) != null) {
                dVarA.release();
            }
            radioPlaybackMiniPanel.I = null;
            radioPlaybackMiniPanel.getContext().unbindService(radioPlaybackMiniPanel.L);
        }
        com.sporty.android.common.uievent.e eVar = this.B;
        if (eVar != null) {
            eVar.a();
        } else {
            Intrinsics.n("commonUiEventProcessor");
            throw null;
        }
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        androidx.media3.exoplayer.d dVarA;
        super.onPause();
        EventLiveAdapter eventLiveAdapter = this.w0;
        if (eventLiveAdapter != null) {
            eventLiveAdapter.unSub();
        }
        agd0 agd0Var = this.R;
        if (agd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        agd0Var.A.setActive(false);
        agd0 agd0Var2 = this.R;
        if (agd0Var2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        agd0Var2.z.setActive(false);
        agd0 agd0Var3 = this.R;
        if (agd0Var3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        agd0Var3.y.setActive(false);
        ((br3) mmc.a(hp0.A, br3.class)).U().K = null;
        h2();
        this.j0 = true;
        agd0 agd0Var4 = this.R;
        if (agd0Var4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        RadioService.a aVar = agd0Var4.d.e.d.I;
        if (aVar != null && (dVarA = aVar.a()) != null) {
            dVarA.n(false);
        }
        agd0 agd0Var5 = this.R;
        if (agd0Var5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        agd0Var5.w.setVideoPlayWhenReady(false);
        agd0 agd0Var6 = this.R;
        if (agd0Var6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        agd0Var6.w.F(true);
        if (this.J0) {
            getWindow().clearFlags(8192);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((br3) mmc.a(hp0.A, br3.class)).U().K = new e();
        agd0 agd0Var = this.R;
        if (agd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        if (!agd0Var.w.getFullscreen() && !J1()) {
            ((br3) mmc.a(hp0.A, br3.class)).U().a(this, true);
        }
        b3.b = "LiveEventActivity";
        com.sportybet.plugin.event.e eVar = this.E0;
        if (eVar == null) {
            Intrinsics.n("eventViewModel");
            throw null;
        }
        if (eVar.J1()) {
            g2();
        }
        agd0 agd0Var2 = this.R;
        if (agd0Var2 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        agd0Var2.w.F(false);
        agd0 agd0Var3 = this.R;
        if (agd0Var3 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        agd0Var3.A.setActive(this.n0);
        agd0 agd0Var4 = this.R;
        if (agd0Var4 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        agd0Var4.z.setActive(this.m0);
        agd0 agd0Var5 = this.R;
        if (agd0Var5 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        agd0Var5.y.setActive(this.o0);
        EventLiveAdapter eventLiveAdapter = this.w0;
        if (eventLiveAdapter != null) {
            eventLiveAdapter.sub();
        }
        if (this.j0) {
            com.sportybet.plugin.event.e eVar2 = this.E0;
            if (eVar2 == null) {
                Intrinsics.n("eventViewModel");
                throw null;
            }
            eVar2.A1(false, false);
        }
        R1(false);
        com.sportybet.plugin.event.e eVar3 = this.E0;
        if (eVar3 == null) {
            Intrinsics.n("eventViewModel");
            throw null;
        }
        T tD = eVar3.k0.d();
        com.sportybet.plugin.event.g.b bVar = tD instanceof com.sportybet.plugin.event.g.b ? (com.sportybet.plugin.event.g.b) tD : null;
        if ((bVar != null ? bVar.a : null) == lus.b) {
            eVar3.N1();
        }
        agd0 agd0Var6 = this.R;
        if (agd0Var6 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        agd0Var6.w.setVideoPlayWhenReady(true);
        rvu rvuVar = this.F0;
        if (rvuVar != null) {
            rvuVar.x1();
        } else {
            Intrinsics.n("matchAlertViewModel");
            throw null;
        }
    }

    @Override // defpackage.wym
    public final boolean y() {
        Application application = getApplication();
        application.getClass();
        return r0b.b(application).equals("dark");
    }

    public final String z1(Event event) {
        azd0 azd0Var = this.y;
        if (azd0Var == null) {
            Intrinsics.n("statisticsWidgetUrlBuilder");
            throw null;
        }
        String str = event.eventId;
        str.getClass();
        EventSource eventSource = event.eventSource;
        String languageCode = getAccountHelper().getLanguageCode();
        languageCode.getClass();
        return azd0Var.a(str, eventSource, languageCode, "dark");
    }

    public final void f2(List<Market> list) {
        mfb0 mfb0Var;
        k650 k650Var = this.G;
        if (k650Var == null) {
            Intrinsics.n("remoteConfigRepository");
            throw null;
        }
        if (k650Var.b(gvQvkPPtA.nWvHsocq)) {
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Market market = list.get(i);
                String strA = yk10.a(market.id, market.desc);
                if (!linkedHashSet.contains(strA)) {
                    mfb0 mfb0Var2 = this.W;
                    if ((mfb0Var2 == null || !mfb0Var2.o(market.id)) && ((mfb0Var = this.W) == null || !mfb0Var.i(market.id))) {
                        arrayList.add(market);
                    } else {
                        linkedHashSet.add(strA);
                        arrayList.add(market);
                        for (int i2 = i + 1; i2 < size; i2++) {
                            Market market2 = list.get(i2);
                            if (Intrinsics.g(market.id, market2.id) && Intrinsics.g(market.desc, market2.desc)) {
                                arrayList.add(market2);
                            }
                        }
                    }
                }
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v47, types: [kotlin.coroutines.CoroutineContext] */
    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        Drawable drawableMutate;
        Throwable th;
        View viewFindViewById;
        super.onCreate(bundle);
        int i = 1;
        Throwable th2 = null;
        try {
            agd0 agd0VarA = agd0.a(getLayoutInflater());
            this.R = agd0VarA;
            setContentView(agd0VarA.N);
            int i2 = 0;
            this.k0 = false;
            setRequireBetslipBtnLater(true);
            Event event = (Event) getIntent().getParcelableExtra("EXTRA_EVENT");
            String stringExtra = event != null ? event.eventId : getIntent().getStringExtra("EXTRA_EVENT_ID");
            this.Y = getIntent().getStringExtra("EXTRA_MARKET_ID");
            this.Z = getIntent().getStringExtra("EXTRA_MARKET_SPECIFIER");
            int intExtra = getIntent().getIntExtra("EXTRA_SOURCE", -1);
            if (stringExtra == null || stringExtra.length() == 0) {
                Intent intent = new Intent(this, (Class<?>) AlertDialogActivity.class);
                intent.putExtra("EXTRA_MESSAGE", R.string.common_feedback__failed_to_load_data_please_refresh_the_page);
                yrh0.s(this, intent, true);
                wsm wsmVar = this.A;
                if (wsmVar == null) {
                    Intrinsics.n("crashlyticsHelper");
                    throw null;
                }
                wsmVar.g("EventActivity", "", new IllegalArgumentException(hce0.a(intExtra, "Event ID is missing, TraceSource : ")), null);
                finish();
                return;
            }
            this.H0.f(this, new h(new Function1() { // from class: xhg
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        EventActivity eventActivity = this.a;
                        agd0 agd0Var = eventActivity.R;
                        if (agd0Var == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        agd0Var.w.F(true);
                        agd0 agd0Var2 = eventActivity.R;
                        if (agd0Var2 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        agd0Var2.w.setVideoPlayWhenReady(false);
                        EventLiveAdapter eventLiveAdapter = eventActivity.w0;
                        if (eventLiveAdapter != null) {
                            e eVar = eventActivity.E0;
                            if (eVar == null) {
                                Intrinsics.n("eventViewModel");
                                throw null;
                            }
                            eventLiveAdapter.setEvent(eVar.F1());
                            eventLiveAdapter.notifyDataSetChanged();
                        }
                        if (eventActivity.q0 == EventActivity.b.b) {
                            eventActivity.I1();
                            e eVar2 = eventActivity.E0;
                            if (eVar2 == null) {
                                Intrinsics.n("eventViewModel");
                                throw null;
                            }
                            if (eVar2.F1().showLiveTracker()) {
                                e eVar3 = eventActivity.E0;
                                if (eVar3 == null) {
                                    Intrinsics.n("eventViewModel");
                                    throw null;
                                }
                                eventActivity.c2(eventActivity.A1(eVar3.F1()), true);
                            }
                        } else {
                            agd0 agd0Var3 = eventActivity.R;
                            if (agd0Var3 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            LiveEventVideoView liveEventVideoView = agd0Var3.w;
                            String cMSString = eventActivity.getCMSString(R.string.live__live_stream_ended, new Object[0]);
                            cMSString.getClass();
                            ems emsVar = liveEventVideoView.L;
                            emsVar.z.setText(cMSString);
                            emsVar.z.setVisibility(0);
                        }
                        eventActivity.h2();
                    } else {
                        int i3 = EventActivity.U0;
                    }
                    return Unit.a;
                }
            }));
            agd0 agd0Var = this.R;
            if (agd0Var == null) {
                Intrinsics.n("binding");
                throw null;
            }
            GiftGrabPowerBar giftGrabPowerBar = agd0Var.f.I.A;
            if (!giftGrabPowerBar.W0) {
                giftGrabPowerBar.W0 = true;
                getLifecycle().a(new com.sporty.android.common_ui.widgets.c(giftGrabPowerBar));
            }
            View viewFindViewById2 = findViewById(R.id.action_bar_container);
            viewFindViewById2.getClass();
            SimpleActionBar simpleActionBar = (SimpleActionBar) viewFindViewById2;
            this.u0 = simpleActionBar;
            simpleActionBar.setTitle(getCMSString(R.string.common_functions__details, new Object[0]));
            SimpleActionBar simpleActionBar2 = this.u0;
            if (simpleActionBar2 == null) {
                Intrinsics.n("titleContainer");
                throw null;
            }
            simpleActionBar2.setBackButton(new yhg(this, i2));
            SimpleActionBar simpleActionBar3 = this.u0;
            if (simpleActionBar3 == null) {
                Intrinsics.n("titleContainer");
                throw null;
            }
            simpleActionBar3.setSearchActionButton(new View.OnClickListener() { // from class: zhg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = EventActivity.U0;
                    yrh0.k(this.a);
                }
            });
            SimpleActionBar simpleActionBar4 = this.u0;
            if (simpleActionBar4 == null) {
                Intrinsics.n("titleContainer");
                throw null;
            }
            simpleActionBar4.setHomeButton(new vy7(this, i));
            agd0 agd0Var2 = this.R;
            if (agd0Var2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var2.i.setOnClickListener(new View.OnClickListener() { // from class: aig
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EventActivity eventActivity = this.a;
                    agd0 agd0Var3 = eventActivity.R;
                    if (agd0Var3 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    if (agd0Var3.d.e.b.isActivated()) {
                        e eVar = eventActivity.E0;
                        if (eVar == null) {
                            Intrinsics.n("eventViewModel");
                            throw null;
                        }
                        String str = eVar.F1().matchStatus;
                        if (str == null) {
                            str = "";
                        }
                        eVar.O1(new nqv.b(str, oqv.LIVE));
                    }
                    eventActivity.c2(null, false);
                    eventActivity.d2(null, false);
                    eventActivity.Z1(null, false);
                    eventActivity.I1();
                    EventLiveAdapter eventLiveAdapter = eventActivity.w0;
                    if (eventLiveAdapter != null) {
                        eventLiveAdapter.hide();
                    }
                    eventActivity.n0 = false;
                    eventActivity.m0 = false;
                    eventActivity.o0 = false;
                    eventActivity.l0 = false;
                    e eVar2 = eventActivity.E0;
                    if (eVar2 == null) {
                        Intrinsics.n("eventViewModel");
                        throw null;
                    }
                    eventActivity.j2(eVar2.F1(), eventActivity.W);
                    agd0 agd0Var4 = eventActivity.R;
                    if (agd0Var4 != null) {
                        agd0Var4.w.setPlayerViewVisibility(eventActivity.f0);
                    } else {
                        Intrinsics.n("binding");
                        throw null;
                    }
                }
            });
            agd0 agd0Var3 = this.R;
            if (agd0Var3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            ImageView imageView = agd0Var3.L;
            Drawable drawableA = iwh0.a(this, R.drawable.spr_shape_red_circle_item_48_bg, -16777216);
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            imageView.setBackground(drawableA);
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(this, R.anim.spr_anim_rotate_loading);
            animationLoadAnimation.getClass();
            this.t0 = animationLoadAnimation;
            agd0 agd0Var4 = this.R;
            if (agd0Var4 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var4.L.setOnClickListener(new View.OnClickListener() { // from class: big
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EventActivity eventActivity = this.a;
                    agd0 agd0Var5 = eventActivity.R;
                    if (agd0Var5 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    agd0Var5.O.setRefreshing(true);
                    agd0 agd0Var6 = eventActivity.R;
                    if (agd0Var6 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    ImageView imageView2 = agd0Var6.L;
                    Animation animation = eventActivity.t0;
                    if (animation == null) {
                        Intrinsics.n("animation");
                        throw null;
                    }
                    imageView2.startAnimation(animation);
                    eventActivity.N1();
                }
            });
            agd0 agd0Var5 = this.R;
            if (agd0Var5 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var5.B.getErrorView().getTitle().setTextSize(14.0f);
            agd0 agd0Var6 = this.R;
            if (agd0Var6 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var6.B.getErrorView().getTitle().setTextColor(getColor(R.color.text_type1_secondary));
            agd0 agd0Var7 = this.R;
            if (agd0Var7 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var7.B.L(null);
            agd0 agd0Var8 = this.R;
            if (agd0Var8 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var8.B.setOnClickListener(new yy7(this, i));
            agd0 agd0Var9 = this.R;
            if (agd0Var9 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            LiveEventVideoView liveEventVideoView = agd0Var9.w;
            ems emsVar = liveEventVideoView.L;
            ComposeView composeView = emsVar.i;
            u6i0.b bVar = u6i0.b.a;
            composeView.setViewCompositionStrategy(bVar);
            Context context = liveEventVideoView.getContext();
            context.getClass();
            liveEventVideoView.N = new xls(context, liveEventVideoView.L, new bms(2, liveEventVideoView, LiveEventVideoView.class, "reportWatchTime", "reportWatchTime(ILjava/lang/String;)V", 0), new yls(liveEventVideoView), liveEventVideoView.M);
            Context context2 = liveEventVideoView.getContext();
            context2.getClass();
            liveEventVideoView.O = new qls(context2, emsVar);
            xls xlsVar = liveEventVideoView.N;
            if (xlsVar == null) {
                Intrinsics.n("videoPlayerHelper");
                throw null;
            }
            ems emsVar2 = xlsVar.b;
            PlayerView playerView = emsVar2.y;
            playerView.setShowBuffering(2);
            ProgressBar progressBar = (ProgressBar) playerView.findViewById(R.id.exo_buffering);
            if (progressBar != null) {
                progressBar.setIndeterminateTintList(ColorStateList.valueOf(xlsVar.a.getColor(R.color.white_70)));
            }
            ((ImageView) playerView.findViewById(R.id.exo_fullscreen_icon)).setImageResource(R.drawable.spm_ic_enter_full_screen);
            View viewFindViewById3 = emsVar2.y.findViewById(R.id.exo_fullscreen_button);
            if (viewFindViewById3 != null) {
                viewFindViewById3.setVisibility(xlsVar.k ? 0 : 8);
            }
            View viewFindViewById4 = playerView.findViewById(R.id.exo_volume_icon);
            viewFindViewById4.getClass();
            xlsVar.g = (ImageView) viewFindViewById4;
            View viewFindViewById5 = emsVar.y.findViewById(R.id.exo_fullscreen_icon);
            viewFindViewById5.getClass();
            liveEventVideoView.Q = (ImageView) viewFindViewById5;
            Context context3 = liveEventVideoView.getContext();
            context3.getClass();
            ems emsVar3 = liveEventVideoView.L;
            i0j0 webViewWrapperService = liveEventVideoView.getWebViewWrapperService();
            bnh0 urlCreator = liveEventVideoView.getUrlCreator();
            qls qlsVar = liveEventVideoView.O;
            if (qlsVar == null) {
                Intrinsics.n("animationUtil");
                throw null;
            }
            liveEventVideoView.P = new hns(context3, emsVar3, webViewWrapperService, urlCreator, qlsVar, new cms(3, liveEventVideoView, LiveEventVideoView.class, "setPlayerLayout", "setPlayerLayout(ZFZ)V", 0), new dms(2, liveEventVideoView, LiveEventVideoView.class, "reportWatchTime", "reportWatchTime(ILjava/lang/String;)V", 0), new zls(liveEventVideoView));
            liveEventVideoView.setupPlayer();
            liveEventVideoView.setupVideoInWeb();
            liveEventVideoView.setOnWatchTimeReported(new ly2(this));
            liveEventVideoView.setOnFullScreenToggled(new Function1() { // from class: cig
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    EventActivity eventActivity = this.a;
                    SimpleActionBar simpleActionBar5 = eventActivity.u0;
                    if (simpleActionBar5 == null) {
                        Intrinsics.n("titleContainer");
                        throw null;
                    }
                    simpleActionBar5.setVisibility(zBooleanValue ? 0 : 8);
                    agd0 agd0Var10 = eventActivity.R;
                    if (agd0Var10 != null) {
                        agd0Var10.M.setVisibility(zBooleanValue ? 0 : 8);
                        return Unit.a;
                    }
                    Intrinsics.n("binding");
                    throw null;
                }
            });
            this.S = eid0.a(findViewById(R.id.live_event_score_container));
            c cVar = this.I0;
            if (cVar == null) {
                cVar = new c();
                this.I0 = cVar;
            }
            fdt fdtVarA = fdt.a(this);
            fdtVarA.b(cVar, new IntentFilter("com.sportybet.action.JS_EVENT"));
            fdtVarA.b(cVar, new IntentFilter("com.sportybet.OPEN_BETS_COUNT_UPDATE"));
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_activated}, iwh0.a(this, R.drawable.spr_ic_arrow_drop_up_black_24dp, -1));
            stateListDrawable.addState(StateSet.WILD_CARD, iwh0.a(this, R.drawable.spr_ic_arrow_drop_down_black_24dp, -1));
            SimpleActionBar simpleActionBar5 = this.u0;
            if (simpleActionBar5 == null) {
                Intrinsics.n("titleContainer");
                throw null;
            }
            simpleActionBar5.setPrimaryActionButtonBounds(null, null, stateListDrawable, null);
            SimpleActionBar simpleActionBar6 = this.u0;
            if (simpleActionBar6 == null) {
                Intrinsics.n("titleContainer");
                throw null;
            }
            simpleActionBar6.setPrimaryActionButtonVisible(0);
            SimpleActionBar simpleActionBar7 = this.u0;
            if (simpleActionBar7 == null) {
                Intrinsics.n("titleContainer");
                throw null;
            }
            simpleActionBar7.setDividerLineVisible(8);
            SimpleActionBar simpleActionBar8 = this.u0;
            if (simpleActionBar8 == null) {
                Intrinsics.n("titleContainer");
                throw null;
            }
            simpleActionBar8.setPrimaryActionIconButton(Integer.valueOf(R.drawable.ic_icon_primary_action_change), new View.OnClickListener() { // from class: dig
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = EventActivity.U0;
                    view.getClass();
                    view.setActivated(true);
                    final EventActivity eventActivity = this.a;
                    e eVar = eventActivity.E0;
                    if (eVar == null) {
                        Intrinsics.n("eventViewModel");
                        throw null;
                    }
                    if (!eVar.J1() || eventActivity.W == null) {
                        return;
                    }
                    e eVar2 = eventActivity.E0;
                    if (eVar2 == null) {
                        Intrinsics.n("eventViewModel");
                        throw null;
                    }
                    String str = eVar2.F1().sport.id;
                    ChangeMatchPanel changeMatchPanel = new ChangeMatchPanel(eventActivity);
                    changeMatchPanel.setListener(new vkg(eventActivity, str));
                    mfb0 mfb0Var = eventActivity.W;
                    if (mfb0Var != null) {
                        changeMatchPanel.setSportRule(mfb0Var);
                    }
                    eventActivity.y0 = changeMatchPanel;
                    PopupWindow popupWindow = new PopupWindow((View) eventActivity.y0, -1, eventActivity.getResources().getDimensionPixelSize(R.dimen.spr_change_match_height), true);
                    popupWindow.setBackgroundDrawable(new ColorDrawable(eventActivity.getColor(R.color.background_type2_secondary)));
                    popupWindow.showAsDropDown(view);
                    popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: zig
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            EventActivity eventActivity2 = eventActivity;
                            SimpleActionBar simpleActionBar9 = eventActivity2.u0;
                            if (simpleActionBar9 == null) {
                                Intrinsics.n("titleContainer");
                                throw null;
                            }
                            simpleActionBar9.setPrimaryActionButtonActivate(false);
                            agd0 agd0Var10 = eventActivity2.R;
                            if (agd0Var10 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            agd0Var10.A.setMaskAlpha(0.0f);
                            eventActivity2.y0 = null;
                        }
                    });
                    e eVar3 = eventActivity.E0;
                    if (eVar3 == null) {
                        Intrinsics.n("eventViewModel");
                        throw null;
                    }
                    str.getClass();
                    ej5.c(o8i0.d(eVar3), null, null, new f(eVar3, str, null), 3);
                    agd0 agd0Var10 = eventActivity.R;
                    if (agd0Var10 != null) {
                        agd0Var10.A.setMaskAlpha(0.6f);
                    } else {
                        Intrinsics.n("binding");
                        throw null;
                    }
                }
            });
            agd0 agd0Var10 = this.R;
            if (agd0Var10 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var10.K.setBackgroundColor(getColor(R.color.background_type2_primary));
            agd0 agd0Var11 = this.R;
            if (agd0Var11 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var11.K.setItemAnimator(null);
            agd0 agd0Var12 = this.R;
            if (agd0Var12 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var12.K.setLayoutManager(new LinearLayoutManager());
            agd0 agd0Var13 = this.R;
            if (agd0Var13 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var13.O.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: fig
                @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
                public final void i() {
                    int i3 = EventActivity.U0;
                    this.a.N1();
                }
            });
            agd0 agd0Var14 = this.R;
            if (agd0Var14 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            Drawable drawableA2 = gr0.a(agd0Var14.M.getContext(), R.drawable.spr_chat_icon);
            if (drawableA2 == null || (drawableMutate = drawableA2.mutate()) == null) {
                drawableMutate = null;
            }
            if (drawableMutate != null) {
                drawableMutate.setBounds(0, 0, zch0.b(getResources(), 16), zch0.b(getResources(), 16));
            }
            if (drawableMutate != null) {
                drawableMutate.setTint(getColor(R.color.brand_secondary_variable_type3));
            }
            agd0 agd0Var15 = this.R;
            if (agd0Var15 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var15.M.setCompoundDrawables(drawableMutate, null, null, null);
            agd0 agd0Var16 = this.R;
            if (agd0Var16 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var16.M.setOnClickListener(new View.OnClickListener() { // from class: qig
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    be7 be7Var = this.a.C0;
                    if (be7Var != null) {
                        be7Var.D.m(ad7.b);
                    } else {
                        Intrinsics.n("chatroomViewModel");
                        throw null;
                    }
                }
            });
            if (getCountryManager().W()) {
                agd0 agd0Var17 = this.R;
                if (agd0Var17 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                agd0Var17.M.setVisibility(8);
            }
            agd0 agd0Var18 = this.R;
            if (agd0Var18 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var18.f.setChatLayoutOnClickListener(new bjg(this, 0));
            agd0 agd0Var19 = this.R;
            if (agd0Var19 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var19.f.setGrabOnClickListener(new View.OnClickListener() { // from class: ljg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    hmk hmkVar = this.a.D0;
                    if (hmkVar != null) {
                        kzh.d(new g1i(bm50.a(new mmk(hmkVar.d.a(hmkVar.v, hmkVar.w))), new nmk(hmkVar, null)), o8i0.d(hmkVar));
                    } else {
                        Intrinsics.n("giftGrabViewModel");
                        throw null;
                    }
                }
            });
            agd0 agd0Var20 = this.R;
            if (agd0Var20 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var20.f.setInfoClickListener(new View.OnClickListener() { // from class: vjg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = EventActivity.U0;
                    this.a.a2();
                }
            });
            agd0 agd0Var21 = this.R;
            if (agd0Var21 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var21.b.setEnabled(false);
            findViewById(R.id.match_alert_icon_image_view).setOnClickListener(new r13(this, 1));
            v8i0 viewModelStore = getViewModelStore();
            r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
            cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
            viewModelStore.getClass();
            defaultViewModelProviderFactory.getClass();
            defaultViewModelCreationExtras.getClass();
            s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
            dq7 dq7VarA = jq40.a(be7.class);
            String strI = dq7VarA.i();
            if (strI == null) {
                hb5.a("Local and anonymous classes can not be ViewModels");
                return;
            }
            be7 be7Var = (be7) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
            this.C0 = be7Var;
            yi5 yi5Var = this.H;
            if (yi5Var == null) {
                Intrinsics.n("buildConfig");
                throw null;
            }
            String strA = yi5Var.b().a();
            ch7 ch7Var = ch7.a;
            c7i0.a aVar = c7i0.b;
            c7i0 c7i0Var = c7i0.AllCountries;
            int i3 = vn20.a("sportybet").getInt("chat_country_filter", 0);
            aVar.getClass();
            c7i0[] c7i0VarArrValues = c7i0.values();
            int length = c7i0VarArrValues.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    th = th2;
                    break;
                }
                c7i0 c7i0Var2 = c7i0VarArrValues[i4];
                th = th2;
                if (c7i0Var2.a == i3) {
                    c7i0Var = c7i0Var2;
                    break;
                } else {
                    i4++;
                    th2 = th;
                }
            }
            be7Var.B1(strA, c7i0Var, zc7.a);
            be7 be7Var2 = this.C0;
            if (be7Var2 == null) {
                Intrinsics.n("chatroomViewModel");
                throw th;
            }
            be7Var2.V = stringExtra;
            if (be7Var2 == null) {
                Intrinsics.n("chatroomViewModel");
                throw th;
            }
            be7Var2.E.f(this, new h(new nkg(1, this, EventActivity.class, jbkEboCkTqmGf.VqapuPv, "onChatRoomEvent(Lcom/sporty/android/chat/ChatRoomEvent;)V", 0)));
            be7 be7Var3 = this.C0;
            if (be7Var3 == null) {
                Intrinsics.n("chatroomViewModel");
                throw th;
            }
            be7Var3.I.f(this, new h(new okg(1, this, EventActivity.class, "onBookingCodeEvent", "onBookingCodeEvent(Lcom/sporty/android/chat/BookingCodeEvent;)V", 0)));
            be7 be7Var4 = this.C0;
            if (be7Var4 == null) {
                Intrinsics.n("chatroomViewModel");
                throw th;
            }
            be7Var4.C.f(this, new h(new pkg(zyf0.a)));
            be7 be7Var5 = this.C0;
            if (be7Var5 == null) {
                Intrinsics.n("chatroomViewModel");
                throw th;
            }
            be7Var5.w.f(this, new h(new qkg(1, ch7.a, ch7.class, "setChatCountryFilter", "setChatCountryFilter(Lcom/sporty/android/chat/ViewCountry;)V", 0)));
            v8i0 viewModelStore2 = getViewModelStore();
            r8i0.c defaultViewModelProviderFactory2 = getDefaultViewModelProviderFactory();
            cyb defaultViewModelCreationExtras2 = getDefaultViewModelCreationExtras();
            viewModelStore2.getClass();
            defaultViewModelProviderFactory2.getClass();
            defaultViewModelCreationExtras2.getClass();
            s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, defaultViewModelCreationExtras2);
            dq7 dq7VarA2 = jq40.a(hmk.class);
            String strI2 = dq7VarA2.i();
            if (strI2 == null) {
                hb5.a("Local and anonymous classes can not be ViewModels");
                return;
            }
            hmk hmkVar = (hmk) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
            this.D0 = hmkVar;
            hmkVar.F.f(this, new h(new rkg(1, this, EventActivity.class, "updateGiftGrabProgress", "updateGiftGrabProgress(I)V", 0)));
            hmk hmkVar2 = this.D0;
            if (hmkVar2 == null) {
                Intrinsics.n("giftGrabViewModel");
                throw th;
            }
            hmkVar2.L.f(this, new h(new skg(1, this, EventActivity.class, "updateGiftGrabUI", "updateGiftGrabUI(Lcom/sportybet/plugin/realsports/data/GiftGrabUIState;)V", 0)));
            hmk hmkVar3 = this.D0;
            if (hmkVar3 == null) {
                Intrinsics.n("giftGrabViewModel");
                throw th;
            }
            hmkVar3.B.f(this, new h(new tkg(1, this, EventActivity.class, "showGiftGrabDialog", "showGiftGrabDialog(Lcom/sportybet/plugin/realsports/data/GiftGrabGiftValue;)V", 0)));
            hmk hmkVar4 = this.D0;
            if (hmkVar4 == null) {
                Intrinsics.n("giftGrabViewModel");
                throw th;
            }
            hmkVar4.z.f(this, new h(new ukg(1, this, EventActivity.class, "handleErrorMessage", "handleErrorMessage(Lcom/sporty/android/common_ui/uitext/UiText;)V", 0)));
            hmk hmkVar5 = this.D0;
            if (hmkVar5 == null) {
                Intrinsics.n("giftGrabViewModel");
                throw th;
            }
            int i5 = 0;
            hmkVar5.D.f(this, new h(new cjg(this, i5)));
            hmk hmkVar6 = this.D0;
            if (hmkVar6 == null) {
                Intrinsics.n("giftGrabViewModel");
                throw th;
            }
            hmkVar6.K.f(this, new h(new djg(this, i5)));
            if (intExtra == 3) {
                be7 be7Var6 = this.C0;
                if (be7Var6 == null) {
                    Intrinsics.n("chatroomViewModel");
                    throw th;
                }
                be7Var6.D.m(ad7.b);
            }
            Intent intent2 = getIntent();
            lgb0[] lgb0VarArr = lgb0.a;
            int intExtra2 = intent2.getIntExtra("EXTRA_AI_SOURCE", 0);
            v8i0 viewModelStore3 = getViewModelStore();
            r8i0.c defaultViewModelProviderFactory3 = getDefaultViewModelProviderFactory();
            cyb defaultViewModelCreationExtras3 = getDefaultViewModelCreationExtras();
            viewModelStore3.getClass();
            defaultViewModelProviderFactory3.getClass();
            defaultViewModelCreationExtras3.getClass();
            s8i0 s8i0Var3 = new s8i0(viewModelStore3, defaultViewModelProviderFactory3, defaultViewModelCreationExtras3);
            dq7 dq7VarA3 = jq40.a(com.sportybet.plugin.event.e.class);
            String strI3 = dq7VarA3.i();
            if (strI3 == null) {
                hb5.a("Local and anonymous classes can not be ViewModels");
                return;
            }
            com.sportybet.plugin.event.e eVar = (com.sportybet.plugin.event.e) s8i0Var3.a(dq7VarA3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI3));
            this.E0 = eVar;
            eVar.K.f(this, new h(new Function1() { // from class: kig
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v51 */
                /* JADX WARN: Type inference failed for: r1v53, types: [int] */
                /* JADX WARN: Type inference failed for: r1v54 */
                /* JADX WARN: Type inference failed for: r1v64 */
                /* JADX WARN: Type inference failed for: r1v65, types: [android.view.ViewGroup] */
                /* JADX WARN: Type inference failed for: r1v66 */
                /* JADX WARN: Type inference failed for: r1v67, types: [android.view.View] */
                /* JADX WARN: Type inference failed for: r1v94 */
                /* JADX WARN: Type inference failed for: r1v95 */
                /* JADX WARN: Type inference failed for: r4v13 */
                /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r4v36, types: [com.sportybet.plugin.realsports.event.BaseEventDetailMarketListAdapter, com.sportybet.plugin.realsports.event.EventLiveAdapter] */
                /* JADX WARN: Type inference failed for: r4v47 */
                /* JADX WARN: Type inference failed for: r5v0, types: [android.content.Context, com.sportybet.plugin.event.EventActivity, fq0, java.lang.Object, py1, rn8] */
                /* JADX WARN: Type inference failed for: r7v26 */
                /* JADX WARN: Type inference failed for: r7v27 */
                /* JADX WARN: Type inference failed for: r7v28, types: [v1b] */
                /* JADX WARN: Type inference failed for: r7v38 */
                /* JADX WARN: Type inference failed for: r7v39 */
                /* JADX WARN: Type inference failed for: r7v40 */
                /* JADX WARN: Type inference failed for: r7v8, types: [a6b, ekg, java.lang.Throwable, kotlin.coroutines.CoroutineContext, v1b] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) throws Throwable {
                    Throwable th3;
                    Throwable th4;
                    Object obj2;
                    ?? r7;
                    ?? r4;
                    Category category;
                    Tournament tournament;
                    String str;
                    Category category2;
                    Tournament tournament2;
                    String str2;
                    String str3;
                    ?? r1;
                    ?? r8;
                    ?? r5;
                    View childAt;
                    List listM0;
                    agd0 agd0Var22;
                    c cVar2 = (c) obj;
                    int i6 = EventActivity.U0;
                    boolean z = cVar2.b;
                    aqg aqgVar = cVar2.e;
                    final ?? r6 = this.a;
                    boolean z2 = false;
                    boolean z3 = true;
                    Throwable th5 = null;
                    if (z) {
                        agd0 agd0Var23 = r6.R;
                        if (agd0Var23 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        agd0Var23.B.E();
                        agd0 agd0Var24 = r6.R;
                        if (agd0Var24 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        agd0Var24.O.setRefreshing(false);
                        int iOrdinal = cVar2.c.ordinal();
                        if (iOrdinal == 0) {
                            r6.showDialog(r6, cVar2.d, new hjg(r6, z2 ? 1 : 0));
                        } else if (iOrdinal == 1) {
                            yrh0.t(r6, AlertDialogActivity.class, true);
                        } else {
                            if (iOrdinal != 2) {
                                uhc.a();
                                return null;
                            }
                            agd0 agd0Var25 = r6.R;
                            if (agd0Var25 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            agd0Var25.B.I();
                        }
                    } else if (cVar2.a) {
                        agd0 agd0Var26 = r6.R;
                        if (agd0Var26 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        if (!agd0Var26.O.c) {
                            agd0Var26.B.K();
                        }
                    } else {
                        ArrayList arrayList = r6.U;
                        HashMap map = r6.T;
                        agd0 agd0Var27 = r6.R;
                        if (agd0Var27 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        agd0Var27.B.E();
                        agd0 agd0Var28 = r6.R;
                        if (agd0Var28 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        agd0Var28.O.setRefreshing(false);
                        Event event2 = aqgVar.a;
                        List<MarketGroup> list = aqgVar.b;
                        if (event2 == null) {
                            agd0Var22 = r6.R;
                            if (agd0Var22 == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                        } else {
                            Sport sport = event2.sport;
                            if (sport == null) {
                                agd0Var22 = r6.R;
                                if (agd0Var22 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                            } else if (!lfb0.d().d.containsKey(sport.id)) {
                                agd0Var22 = r6.R;
                                if (agd0Var22 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                            } else if (list == null) {
                                agd0Var22 = r6.R;
                                if (agd0Var22 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                            } else {
                                r6.W = lfb0.d().e(event2.sport.id);
                                r6.g2();
                                e eVar2 = r6.E0;
                                if (eVar2 == null) {
                                    Intrinsics.n("eventViewModel");
                                    throw null;
                                }
                                if (eVar2.F1().status > 2) {
                                    r6.H0.m(Boolean.TRUE);
                                }
                                if (Intrinsics.g(r6.X, list)) {
                                    th3 = null;
                                } else {
                                    r6.X = list;
                                    map.clear();
                                    map.put("market_search", new ArrayList());
                                    map.put("favorites", new ArrayList());
                                    map.put("all", new ArrayList());
                                    List list2 = r6.X;
                                    if (list2 == null) {
                                        list2 = m2g.a;
                                    }
                                    Iterator it = list2.iterator();
                                    while (it.hasNext()) {
                                        map.put(((MarketGroup) it.next()).getId(), new ArrayList());
                                        th5 = th5;
                                    }
                                    th3 = th5;
                                    r6.X = list;
                                }
                                String userId = r6.getAccountHelper().getUserId();
                                List<Integer> list3 = aqgVar.c;
                                if (userId != null && list3 != null) {
                                    r6.V = list3;
                                    r6.d0 = list3.size();
                                    arrayList.clear();
                                    e eVar3 = r6.E0;
                                    if (eVar3 == null) {
                                        Intrinsics.n("eventViewModel");
                                        throw th3;
                                    }
                                    List<Market> list4 = eVar3.F1().markets;
                                    if (list4 != null) {
                                        r6.f2(list4);
                                        EventActivity.E1(list4);
                                        List<Integer> list5 = r6.V;
                                        if (list5 == null || (listM0 = CollectionsKt.m0(list5)) == null) {
                                            listM0 = m2g.a;
                                        }
                                        Iterator it2 = listM0.iterator();
                                        while (it2.hasNext()) {
                                            int iIntValue = ((Number) it2.next()).intValue();
                                            for (Market market : list4) {
                                                boolean z4 = z3;
                                                String str4 = market.id;
                                                str4.getClass();
                                                Integer intOrNull = StringsKt.toIntOrNull(str4);
                                                if (intOrNull != null && intOrNull.intValue() == iIntValue) {
                                                    arrayList.add(market);
                                                }
                                                z3 = z4;
                                            }
                                        }
                                    }
                                }
                                boolean z5 = z3;
                                boolean z6 = cVar2.f;
                                eig eigVar = r6.M0;
                                e eVar4 = r6.E0;
                                if (eVar4 == null) {
                                    Throwable th6 = th3;
                                    Intrinsics.n("eventViewModel");
                                    throw th6;
                                }
                                List<Market> list6 = eVar4.F1().markets;
                                list6.getClass();
                                r6.f2(list6);
                                EventActivity.E1(list6);
                                Iterator it3 = map.values().iterator();
                                while (it3.hasNext()) {
                                    ((List) it3.next()).clear();
                                }
                                for (Market market2 : list6) {
                                    List list7 = (List) map.get(market2.groupId);
                                    if (list7 != null) {
                                        list7.add(market2);
                                    }
                                }
                                List list8 = (List) map.get("all");
                                if (list8 != null) {
                                    list8.addAll(list6);
                                }
                                List list9 = (List) map.get("favorites");
                                if (list9 != null) {
                                    list9.addAll(arrayList);
                                }
                                if (r6.a0.length() > 0) {
                                    FilteredMarkets filteredMarketsB = vpu.b(r6.a0, list6);
                                    List list10 = (List) map.get("market_search");
                                    if (list10 != null) {
                                        list10.addAll(filteredMarketsB.getMarkets());
                                    }
                                }
                                EventLiveAdapter eventLiveAdapter = r6.w0;
                                if (eventLiveAdapter == null) {
                                    e eVar5 = r6.E0;
                                    if (eVar5 == null) {
                                        Throwable th7 = th3;
                                        Intrinsics.n("eventViewModel");
                                        throw th7;
                                    }
                                    Event eventF1 = eVar5.F1();
                                    mfb0 mfb0Var = r6.W;
                                    gig gigVar = r6.N0;
                                    zsu zsuVar = r6.I;
                                    if (zsuVar == null) {
                                        Throwable th8 = th3;
                                        Intrinsics.n("marketSorter");
                                        throw th8;
                                    }
                                    a8z a8zVar = r6.J;
                                    if (a8zVar == null) {
                                        Throwable th9 = th3;
                                        Intrinsics.n("outcomeBoostResolver");
                                        throw th9;
                                    }
                                    muh muhVar = r6.K;
                                    if (muhVar == null) {
                                        Throwable th10 = th3;
                                        Intrinsics.n("flashBoostViewTracker");
                                        throw th10;
                                    }
                                    obj2 = "market_search";
                                    EventLiveAdapter eventLiveAdapter2 = new EventLiveAdapter(r6, eventF1, mfb0Var, gigVar, map, zsuVar, a8zVar, muhVar);
                                    eventLiveAdapter2.setHeaderWithEmptyEnable(false);
                                    eventLiveAdapter2.setFooterWithEmptyEnable(false);
                                    eventLiveAdapter2.setCallback(new ikg(r6));
                                    r6.w0 = eventLiveAdapter2;
                                    kkg kkgVar = new kkg(r6);
                                    agd0 agd0Var29 = r6.R;
                                    if (agd0Var29 == null) {
                                        Throwable th11 = th3;
                                        Intrinsics.n("binding");
                                        throw th11;
                                    }
                                    agd0Var29.C.n();
                                    e eVar6 = r6.E0;
                                    if (eVar6 == null) {
                                        Throwable th12 = th3;
                                        Intrinsics.n("eventViewModel");
                                        throw th12;
                                    }
                                    if (!b3.S(eVar6.Q)) {
                                        agd0 agd0Var30 = r6.R;
                                        if (agd0Var30 == null) {
                                            Intrinsics.n("binding");
                                            throw th3;
                                        }
                                        r6.D1(agd0Var30.C, r6.getCMSString(R.string.common_functions__my_favourites, new Object[0]), "favorites");
                                    }
                                    agd0 agd0Var31 = r6.R;
                                    if (agd0Var31 == null) {
                                        Throwable th13 = th3;
                                        Intrinsics.n("binding");
                                        throw th13;
                                    }
                                    r6.D1(agd0Var31.C, r6.getCMSString(R.string.common_functions__all, new Object[0]), "all");
                                    List<MarketGroup> list11 = r6.X;
                                    if (list11 != null) {
                                        for (MarketGroup marketGroup : list11) {
                                            agd0 agd0Var32 = r6.R;
                                            if (agd0Var32 == null) {
                                                Intrinsics.n("binding");
                                                throw th3;
                                            }
                                            TabLayout tabLayout = agd0Var32.C;
                                            String strDisplayName = marketGroup.displayName();
                                            if (strDisplayName == null) {
                                                strDisplayName = "";
                                            }
                                            r6.D1(tabLayout, strDisplayName, marketGroup.getId());
                                        }
                                    }
                                    agd0 agd0Var33 = r6.R;
                                    if (agd0Var33 == null) {
                                        Throwable th14 = th3;
                                        Intrinsics.n("binding");
                                        throw th14;
                                    }
                                    TabLayout tabLayout2 = agd0Var33.C;
                                    TabLayout.g gVarL = tabLayout2.l();
                                    gVarL.a = obj2;
                                    tabLayout2.b(gVarL);
                                    agd0 agd0Var34 = r6.R;
                                    if (agd0Var34 == null) {
                                        Throwable th15 = th3;
                                        Intrinsics.n("binding");
                                        throw th15;
                                    }
                                    View childAt2 = agd0Var34.C.getChildAt(0);
                                    ?? r2 = childAt2 instanceof ViewGroup ? (ViewGroup) childAt2 : th3;
                                    agd0 agd0Var35 = r6.R;
                                    if (agd0Var35 == null) {
                                        Throwable th16 = th3;
                                        Intrinsics.n("binding");
                                        throw th16;
                                    }
                                    int tabCount = agd0Var35.C.getTabCount() - 1;
                                    if (r2 != 0) {
                                        childAt = r2.getChildAt(tabCount);
                                    } else {
                                        r1 = th3;
                                    }
                                    if (r1 != 0) {
                                        r1 = childAt;
                                        r1.setVisibility(8);
                                    }
                                    r1 = childAt;
                                    agd0 agd0Var36 = r6.R;
                                    if (agd0Var36 == null) {
                                        Throwable th17 = th3;
                                        Intrinsics.n("binding");
                                        throw th17;
                                    }
                                    agd0Var36.C.a(kkgVar);
                                    EventLiveAdapter eventLiveAdapter3 = r6.w0;
                                    if (eventLiveAdapter3 != null) {
                                        agd0 agd0Var37 = r6.R;
                                        if (agd0Var37 == null) {
                                            Intrinsics.n("binding");
                                            throw th3;
                                        }
                                        eventLiveAdapter3.setFooterLayout(agd0Var37.K, new View.OnClickListener() { // from class: gjg
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                final EventActivity eventActivity = r6;
                                                agd0 agd0Var38 = eventActivity.R;
                                                if (agd0Var38 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                agd0Var38.G.post(new Runnable() { // from class: tjg
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        agd0 agd0Var39 = eventActivity.R;
                                                        if (agd0Var39 == null) {
                                                            Intrinsics.n("binding");
                                                            throw null;
                                                        }
                                                        ConsecutiveScrollerLayout consecutiveScrollerLayout = agd0Var39.G;
                                                        consecutiveScrollerLayout.D(consecutiveScrollerLayout.getChildAt(0));
                                                    }
                                                });
                                                e eVar7 = eventActivity.E0;
                                                if (eVar7 == null) {
                                                    Intrinsics.n("eventViewModel");
                                                    throw null;
                                                }
                                                boolean zT = b3.T(eVar7.Q);
                                                Rect rect = new Rect();
                                                agd0 agd0Var39 = eventActivity.R;
                                                if (agd0Var39 == null) {
                                                    Intrinsics.n("binding");
                                                    throw null;
                                                }
                                                agd0Var39.G.getHitRect(rect);
                                                LiveEventHeaderView liveEventHeaderView = eventActivity.v0;
                                                if (liveEventHeaderView != null) {
                                                    eventActivity.W1(zT, liveEventHeaderView.getLocalVisibleRect(rect));
                                                } else {
                                                    Intrinsics.n("liveEventHeaderView");
                                                    throw null;
                                                }
                                            }
                                        });
                                    }
                                    agd0 agd0Var38 = r6.R;
                                    if (agd0Var38 == null) {
                                        Throwable th18 = th3;
                                        Intrinsics.n("binding");
                                        throw th18;
                                    }
                                    agd0Var38.K.setAdapter(r6.w0);
                                    e eVar7 = r6.E0;
                                    if (eVar7 == null) {
                                        Throwable th19 = th3;
                                        Intrinsics.n("eventViewModel");
                                        throw th19;
                                    }
                                    r6.j2(eVar7.F1(), r6.W);
                                    EventLiveAdapter eventLiveAdapter4 = r6.w0;
                                    if (eventLiveAdapter4 != null) {
                                        r6.getLifecycle().a(eventLiveAdapter4);
                                    }
                                    int i7 = r6.e0;
                                    if (i7 != 0 && (r5 = r6.w0) != 0) {
                                        r5.showFooterQuickBetViewBackground(r6, i7);
                                    }
                                    e eVar8 = r6.E0;
                                    if (eVar8 == null) {
                                        Throwable th20 = th3;
                                        Intrinsics.n("eventViewModel");
                                        throw th20;
                                    }
                                    if (eVar8.F1().hasAudioStream() && eVar8.l0.d() == null) {
                                        ?? r9 = th3;
                                        kzh.d(new yzh(new g1i(eVar8.f.b(eVar8.Q), new msg(r9, eVar8)), new nsg(r9, eVar8)), o8i0.d(eVar8));
                                        r8 = r9;
                                    } else {
                                        r8 = th3;
                                    }
                                    r6.R1(false);
                                    r7 = r8;
                                } else {
                                    th4 = th3;
                                    obj2 = "market_search";
                                    e eVar9 = r6.E0;
                                    if (eVar9 == null) {
                                        Intrinsics.n("eventViewModel");
                                        throw th4;
                                    }
                                    eventLiveAdapter.setEvent(eVar9.F1());
                                }
                                if (z6) {
                                    r7 = th4;
                                    if (r6.g0) {
                                        e eVar10 = r6.E0;
                                        if (eVar10 == null) {
                                            Intrinsics.n("eventViewModel");
                                            throw r7;
                                        }
                                        r6.G0 = (!b3.S(eVar10.Q) && (r6.d0 <= 0 || r6.Y != null)) ? z5 : 0;
                                        r6.g0 = false;
                                    }
                                }
                                r7 = th4;
                                r6.T1(r6.G0);
                                EventLiveAdapter eventLiveAdapter5 = r6.w0;
                                if (eventLiveAdapter5 != null) {
                                    eventLiveAdapter5.setFavoriteMarketIds(r6.V);
                                }
                                String strG1 = r6.G1();
                                List<Market> list12 = (List) map.get(strG1);
                                boolean zG = Intrinsics.g(strG1, obj2);
                                EventLiveAdapter eventLiveAdapter6 = r6.w0;
                                if (zG) {
                                    if (eventLiveAdapter6 != null) {
                                        eventLiveAdapter6.setMarkets(list12, r6.d0, r6.b0);
                                    }
                                } else if (eventLiveAdapter6 != null) {
                                    eventLiveAdapter6.setMarkets(list12, r6.d0);
                                }
                                ap0.e().b().G(new gkg(r6));
                                agd0 agd0Var39 = r6.R;
                                if (agd0Var39 == null) {
                                    Intrinsics.n("binding");
                                    throw r7;
                                }
                                agd0Var39.b.setEnabled(z5);
                                agd0 agd0Var40 = r6.R;
                                if (agd0Var40 == null) {
                                    Intrinsics.n("binding");
                                    throw r7;
                                }
                                agd0Var40.L.setVisibility(8);
                                iu2.q(eigVar);
                                iu2.a(eigVar);
                                Event.GiftGrabActivityResult giftGrabActivityResult = event2.enableGiftGrab;
                                if (giftGrabActivityResult != null) {
                                    str3 = giftGrabActivityResult.customMessage;
                                } else {
                                    r4 = r7;
                                }
                                if (r4 != 0 && r4.length() != 0 && !r6.isDialogShowing()) {
                                    r4 = str3;
                                    r6.showDialog(r6, "", r4, new mjg());
                                }
                                r4 = str3;
                                r4 = str3;
                                r4 = str3;
                                e eVar11 = r6.E0;
                                if (eVar11 == null) {
                                    Intrinsics.n("eventViewModel");
                                    throw r7;
                                }
                                boolean zG1 = eVar11.G1();
                                ekg ekgVar = r6.B0;
                                if (!zG1) {
                                    if (ekgVar != null) {
                                        ekgVar.b();
                                        ekgVar.b = true;
                                        ekgVar.a.d(ekgVar.d);
                                    }
                                    r6.B0 = r7;
                                    r6.i2();
                                } else if (ekgVar == null) {
                                    s9s lifecycle = r6.getLifecycle();
                                    ekg ekgVar2 = new ekg(r6, event2, lifecycle);
                                    if (!ekgVar2.b) {
                                        hmk hmkVar7 = r6.D0;
                                        if (hmkVar7 == null) {
                                            Intrinsics.n("giftGrabViewModel");
                                            throw r7;
                                        }
                                        String str5 = event2.eventId;
                                        if (str5 != null) {
                                            hmkVar7.w = str5;
                                        }
                                        Sport sport2 = event2.sport;
                                        if (sport2 != null && (category = sport2.category) != null && (tournament = category.tournament) != null && (str = tournament.id) != null) {
                                            hmkVar7.v = str;
                                        }
                                        alk alkVar = hmkVar7.i;
                                        String str6 = hmkVar7.w;
                                        alkVar.getClass();
                                        str6.getClass();
                                        or60 or60Var = new or60(new zkk(alkVar, str6, r7));
                                        pfd pfdVar = fse.a;
                                        kzh.d(new g1i(ozh.c(or60Var, odd.b), new omk(hmkVar7, r7)), o8i0.d(hmkVar7));
                                        ekgVar2.c = false;
                                        ekgVar2.a();
                                        lifecycle.a(ekgVar2.d);
                                    }
                                    r6.B0 = ekgVar2;
                                }
                                View viewFindViewById6 = r6.findViewById(R.id.delay_info_hint_container);
                                Sport sport3 = event2.sport;
                                viewFindViewById6.setVisibility((sport3 == null || (category2 = sport3.category) == null || (tournament2 = category2.tournament) == null || (str2 = tournament2.id) == null) ? false : kgb0.a.contains(str2) ? 0 : 8);
                                if (!r6.K0) {
                                    e eVar12 = r6.E0;
                                    if (eVar12 == null) {
                                        Intrinsics.n("eventViewModel");
                                        throw r7;
                                    }
                                    if (((Boolean) eVar12.z0.a.getValue()).booleanValue()) {
                                        r6.K0 = true;
                                        if (event2.showLiveTracker()) {
                                            String strA1 = r6.A1(event2);
                                            agd0 agd0Var41 = r6.R;
                                            if (agd0Var41 == null) {
                                                Intrinsics.n("binding");
                                                throw r7;
                                            }
                                            r6.Q1(agd0Var41.A, strA1, false);
                                        }
                                        if (event2.showStats()) {
                                            String strB1 = r6.h0 ? r6.B1(event2) : r6.z1(event2);
                                            agd0 agd0Var42 = r6.R;
                                            if (agd0Var42 == null) {
                                                Intrinsics.n("binding");
                                                throw r7;
                                            }
                                            r6.Q1(agd0Var42.z, strB1, true);
                                        }
                                    }
                                }
                                rvu rvuVar = r6.F0;
                                if (rvuVar == null) {
                                    Intrinsics.n("matchAlertViewModel");
                                    throw r7;
                                }
                                rvu.a[] aVarArr = rvu.a.a;
                                rvuVar.d = event2.sport.id;
                                ej5.c(o8i0.d(rvuVar), r7, r7, new tvu(rvuVar, r7), 3);
                                r6.h0 = event2.status == 0;
                                jvd0 jvd0Var = r6.O0;
                                if (jvd0Var == null || !jvd0Var.isActive()) {
                                    gq6 gq6Var = r6.N;
                                    if (gq6Var == null) {
                                        Intrinsics.n("cashoutOpenBetsCountManager");
                                        throw r7;
                                    }
                                    e eVar13 = r6.E0;
                                    if (eVar13 == null) {
                                        Intrinsics.n("eventViewModel");
                                        throw r7;
                                    }
                                    g1i g1iVar = new g1i(gq6Var.c(eVar13.Q), new dkg(r6, r7));
                                    s9s lifecycle2 = r6.getLifecycle();
                                    lifecycle2.getClass();
                                    r6.O0 = arr.a(g1iVar, lifecycle2, s9s.b.d);
                                }
                            }
                        }
                        agd0Var22.B.I();
                    }
                    return Unit.a;
                }
            }));
            com.sportybet.plugin.event.e eVar2 = this.E0;
            if (eVar2 == null) {
                Intrinsics.n("eventViewModel");
                throw th;
            }
            eVar2.M.f(this, new h(new Function1() { // from class: lig
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    com.sporty.android.common.uievent.a aVar2 = (com.sporty.android.common.uievent.a) obj;
                    int i6 = EventActivity.U0;
                    EventActivity eventActivity = this.a;
                    com.sporty.android.common.uievent.e eVar3 = eventActivity.B;
                    if (eVar3 != null) {
                        eVar3.c(aVar2, eventActivity, eventActivity.findViewById(R.id.root), eventActivity);
                        return Unit.a;
                    }
                    Intrinsics.n("commonUiEventProcessor");
                    throw null;
                }
            }));
            com.sportybet.plugin.event.e eVar3 = this.E0;
            if (eVar3 == null) {
                Intrinsics.n("eventViewModel");
                throw th;
            }
            eVar3.e0.f(this, new h(new Function1() { // from class: nig
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    d dVar = (d) obj;
                    boolean z = dVar instanceof d.b;
                    EventActivity eventActivity = this.a;
                    if (!z) {
                        int i6 = EventActivity.U0;
                        if (dVar instanceof d.c) {
                            eventActivity.getAccountHelper().demandAccount(eventActivity, new hub(eventActivity));
                        } else {
                            if (!(dVar instanceof d.a)) {
                                uhc.a();
                                return null;
                            }
                            d.a aVar2 = (d.a) dVar;
                            zyf0.c(1, eventActivity.getCMSString(aVar2.b, new Object[0]));
                            EventLiveAdapter eventLiveAdapter = eventActivity.w0;
                            if (eventLiveAdapter != null) {
                                eventLiveAdapter.onFavoriteMarketStatusUpdated(aVar2.a);
                            }
                        }
                    } else if (!eventActivity.n0) {
                        eventActivity.P1();
                    }
                    return Unit.a;
                }
            }));
            com.sportybet.plugin.event.e eVar4 = this.E0;
            if (eVar4 == null) {
                Intrinsics.n("eventViewModel");
                throw th;
            }
            eVar4.h0.f(this, new h(new Function1() { // from class: ajg
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    qus qusVar = (qus) obj;
                    int i6 = EventActivity.U0;
                    boolean z = qusVar instanceof qus.b;
                    EventActivity eventActivity = this.a;
                    if (z) {
                        eventActivity.V1(((qus.b) qusVar).a, null);
                    } else if (qusVar instanceof qus.c) {
                        e eVar5 = eventActivity.E0;
                        if (eVar5 == null) {
                            Intrinsics.n("eventViewModel");
                            throw null;
                        }
                        eVar5.F1().setNoLiveStream();
                        agd0 agd0Var22 = eventActivity.R;
                        if (agd0Var22 == null) {
                            Intrinsics.n("binding");
                            throw null;
                        }
                        LiveEventControlsHeaderView liveEventControlsHeaderView = agd0Var22.d;
                        e eVar6 = eventActivity.E0;
                        if (eVar6 == null) {
                            Intrinsics.n("eventViewModel");
                            throw null;
                        }
                        liveEventControlsHeaderView.a(eVar6.F1());
                    } else {
                        if (!(qusVar instanceof qus.a)) {
                            uhc.a();
                            return null;
                        }
                        eventActivity.V1(null, null);
                    }
                    return Unit.a;
                }
            }));
            com.sportybet.plugin.event.e eVar5 = this.E0;
            if (eVar5 == null) {
                Intrinsics.n("eventViewModel");
                throw th;
            }
            eVar5.k0.f(this, new h(new Function1() { // from class: yig
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ius iusVar;
                    g gVar = (g) obj;
                    int i6 = EventActivity.U0;
                    boolean z = gVar instanceof g.a;
                    EventActivity eventActivity = this.a;
                    if (z) {
                        e eVar6 = eventActivity.E0;
                        if (eVar6 == null) {
                            Intrinsics.n("eventViewModel");
                            throw null;
                        }
                        jvd0 jvd0Var = eVar6.i0;
                        if (jvd0Var != null) {
                            jvd0Var.cancel((CancellationException) null);
                        }
                        eVar6.i0 = kzh.d(new wzh(new yzh(new g1i(eVar6.f.k(eVar6.Q), new jsg(null, eVar6)), new ksg(null, eVar6)), new lsg(null, eVar6)), o8i0.d(eVar6));
                    } else {
                        if (!(gVar instanceof g.c) && !(gVar instanceof g.b)) {
                            uhc.a();
                            return null;
                        }
                        gVar.getClass();
                        if (gVar.equals(g.a.a)) {
                            iusVar = null;
                        } else if (gVar instanceof g.b) {
                            int iOrdinal = ((g.b) gVar).a.ordinal();
                            if (iOrdinal == 0) {
                                iusVar = ius.b;
                            } else {
                                if (iOrdinal != 1) {
                                    uhc.a();
                                    return null;
                                }
                                iusVar = ius.c;
                            }
                        } else {
                            if (!gVar.equals(g.c.a)) {
                                uhc.a();
                                return null;
                            }
                            iusVar = ius.a;
                        }
                        eventActivity.V1(null, iusVar);
                    }
                    return Unit.a;
                }
            }));
            com.sportybet.plugin.event.e eVar6 = this.E0;
            if (eVar6 == null) {
                Intrinsics.n("eventViewModel");
                throw th;
            }
            eVar6.m0.f(this, new h(new uig(this, 0)));
            com.sportybet.plugin.event.e eVar7 = this.E0;
            if (eVar7 == null) {
                Intrinsics.n("eventViewModel");
                throw th;
            }
            i2i.c(eVar7.x0, th, 3).f(this, new h(new Function1() { // from class: fjg
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    h hVar = (h) obj;
                    final ChangeMatchPanel changeMatchPanel = this.a.y0;
                    if (changeMatchPanel != null) {
                        if (hVar instanceof h.b) {
                            changeMatchPanel.c.K();
                        } else if (hVar instanceof h.c) {
                            List<Tournament> list = ((h.c) hVar).a;
                            changeMatchPanel.c.E();
                            if (list == null || list.isEmpty()) {
                                changeMatchPanel.findViewById(R.id.empty).setVisibility(0);
                            } else {
                                for (Tournament tournament : list) {
                                    TextView textView = (TextView) changeMatchPanel.b.inflate(R.layout.spr_change_match_section_header, (ViewGroup) changeMatchPanel.d, false);
                                    String[] strArrSplit = tournament.id.split(":");
                                    if (strArrSplit.length == 3 && TextUtils.equals(strArrSplit[0], "sv")) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(tournament.categoryName);
                                        sb.append(" ");
                                        zug.b(sb, tournament.name, textView);
                                    } else {
                                        textView.setText(tournament.name);
                                    }
                                    changeMatchPanel.d.addView(textView);
                                    for (final Event event2 : tournament.events) {
                                        View viewInflate = changeMatchPanel.b.inflate(R.layout.spr_change_match_item, (ViewGroup) changeMatchPanel.d, false);
                                        ((TextView) viewInflate.findViewById(R.id.time)).setText(changeMatchPanel.a.f(event2.playedSeconds, event2.remainingTimeInPeriod, event2.matchStatus));
                                        ((TextView) viewInflate.findViewById(R.id.team)).setText(event2.homeTeamName + "\n" + event2.awayTeamName);
                                        TextView textView2 = (TextView) viewInflate.findViewById(R.id.score);
                                        textView2.setText(event2.setScore);
                                        ArrayList arrayListA = changeMatchPanel.a.A(event2.setScore, event2.pointScore, event2.gameScore);
                                        if (arrayListA.isEmpty()) {
                                            textView2.setVisibility(8);
                                        } else {
                                            StringBuilder sb2 = new StringBuilder();
                                            for (int i6 = 0; i6 < arrayListA.size(); i6 += 2) {
                                                sb2.append((String) arrayListA.get(i6));
                                                sb2.append(" ");
                                            }
                                            sb2.setLength(sb2.length() - 1);
                                            sb2.append("\n");
                                            for (int i7 = 1; i7 < arrayListA.size(); i7 += 2) {
                                                sb2.append((String) arrayListA.get(i7));
                                                sb2.append(" ");
                                            }
                                            sb2.setLength(sb2.length() - 1);
                                            textView2.setText(sb2);
                                        }
                                        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: x47
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                int i8 = ChangeMatchPanel.f;
                                                ChangeMatchPanel.a aVar2 = changeMatchPanel.e;
                                                if (aVar2 != null) {
                                                    aVar2.a(event2);
                                                }
                                            }
                                        });
                                        changeMatchPanel.d.addView(viewInflate);
                                    }
                                }
                            }
                        } else {
                            if (!(hVar instanceof h.a)) {
                                uhc.a();
                                return null;
                            }
                            changeMatchPanel.c.I();
                        }
                    }
                    return Unit.a;
                }
            }));
            com.sportybet.plugin.event.e eVar8 = this.E0;
            if (eVar8 == null) {
                Intrinsics.n("eventViewModel");
                throw null;
            }
            eVar8.P1(1, stringExtra, event, intExtra2, ServerProductStatus.Product.LIVE_EVENTS, getIntent().getBooleanExtra("EXTRA_OPEN_MATCH_TRACKER", false));
            View viewFindViewById6 = findViewById(R.id.event_header_layout);
            viewFindViewById6.getClass();
            final LiveEventHeaderView liveEventHeaderView = (LiveEventHeaderView) viewFindViewById6;
            this.v0 = liveEventHeaderView;
            final lkg lkgVar = new lkg(this);
            y1k0 y1k0Var = this.c;
            if (y1k0Var == null) {
                Intrinsics.n("worldCupPassBannerStateProvider");
                throw null;
            }
            liveEventHeaderView.e = lkgVar;
            liveEventHeaderView.C = y1k0Var;
            liveEventHeaderView.G = (ImageView) liveEventHeaderView.findViewById(R.id.activity_img);
            ImageView imageView2 = (ImageView) liveEventHeaderView.findViewById(R.id.simulate_img);
            liveEventHeaderView.H = imageView2;
            imageView2.setImageDrawable(gug0.e(liveEventHeaderView.getContext()));
            ImageView imageView3 = (ImageView) liveEventHeaderView.findViewById(R.id.virtual_img);
            liveEventHeaderView.I = imageView3;
            imageView3.setImageDrawable(gug0.g(liveEventHeaderView.getContext()));
            liveEventHeaderView.f = (LiveTimerTextView) liveEventHeaderView.findViewById(R.id.time);
            liveEventHeaderView.i = (TextView) liveEventHeaderView.findViewById(R.id.team1);
            liveEventHeaderView.v = (TextView) liveEventHeaderView.findViewById(R.id.team2);
            liveEventHeaderView.w = new TextView[]{(TextView) liveEventHeaderView.findViewById(R.id.score11), (TextView) liveEventHeaderView.findViewById(R.id.score12), (TextView) liveEventHeaderView.findViewById(R.id.score13)};
            liveEventHeaderView.y = new TextView[]{(TextView) liveEventHeaderView.findViewById(R.id.score21), (TextView) liveEventHeaderView.findViewById(R.id.score22), (TextView) liveEventHeaderView.findViewById(R.id.score23)};
            liveEventHeaderView.z = (TextView) liveEventHeaderView.findViewById(R.id.league);
            liveEventHeaderView.A = liveEventHeaderView.findViewById(R.id.open_bets_container);
            ComposeView composeView2 = (ComposeView) liveEventHeaderView.findViewById(R.id.fifa_world_cup_banner);
            liveEventHeaderView.B = composeView2;
            composeView2.setViewCompositionStrategy(bVar);
            ComposeView composeView3 = liveEventHeaderView.B;
            czj0 czj0Var = czj0.Compact;
            Function0 function0 = new Function0() { // from class: pks
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i6 = LiveEventHeaderView.L;
                    liveEventHeaderView.d.a(s2k0.i.a, k00.d);
                    EventActivity eventActivity = lkgVar.a;
                    int i7 = EventActivity.U0;
                    if (eventActivity.getAccountHelper().isLogin()) {
                        azm azmVar = eventActivity.d;
                        if (azmVar == null) {
                            Intrinsics.n("router");
                            throw null;
                        }
                        azmVar.f(wae.WORLDCUP_MISSION, kotlin.collections.a.c(new kotlin.Pair("source", "live_event_banner")));
                    } else {
                        chk chkVar = eventActivity.f;
                        if (chkVar == null) {
                            Intrinsics.n("getWorldCupPassPromotionsUrlUseCase");
                            throw null;
                        }
                        String strA2 = chkVar.a();
                        azm azmVar2 = eventActivity.d;
                        if (azmVar2 == null) {
                            Intrinsics.n("router");
                            throw null;
                        }
                        azm.c(azmVar2, strA2, vj5.a(new kotlin.Pair("data_share_dialog_title", eventActivity.getCMSString(R.string.az_menu__promotion_share_title, new Object[0])), new kotlin.Pair("data_share_dialog_sharing_content", strA2), new kotlin.Pair("data_share_dialog_title_style", Integer.valueOf(R.style.H3_B)), new kotlin.Pair("data_share_dialog_title_bottom_padding", 16)), null, 4);
                    }
                    return Unit.a;
                }
            };
            Function0 function1 = new Function0() { // from class: qks
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i6 = LiveEventHeaderView.L;
                    liveEventHeaderView.d.a(s2k0.i.a, k00.d);
                    EventActivity eventActivity = lkgVar.a;
                    int i7 = SportyTvRedirectActivity.c;
                    eventActivity.startActivity(SportyTvRedirectActivity.a.a(eventActivity));
                    return Unit.a;
                }
            };
            bvd bvdVar = new bvd(liveEventHeaderView, 1);
            composeView3.getClass();
            czj0Var.getClass();
            azj0.b(composeView3, y1k0Var, czj0Var, function0, function1, bvdVar, false);
            liveEventHeaderView.B.setVisibility(8);
            if (liveEventHeaderView.J == null) {
                nnf nnfVar = new nnf((ComposeView) liveEventHeaderView.findViewById(R.id.compose_view));
                liveEventHeaderView.J = nnfVar;
                nnfVar.c = new rks(lkgVar);
            }
            liveEventHeaderView.findViewById(R.id.open_bets_container).setOnClickListener(new sks(liveEventHeaderView, 0));
            liveEventHeaderView.findViewById(R.id.open_bet_c).setOnClickListener(new View.OnClickListener() { // from class: tks
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i6 = LiveEventHeaderView.L;
                    if (iu2.k()) {
                        liveEventHeaderView.J.a(new ErrorDataInfo(EditBetDlgType.DISCARD, ""));
                    } else {
                        lkgVar.a();
                    }
                }
            });
            liveEventHeaderView.F = (TextView) liveEventHeaderView.findViewById(R.id.all_open_bet_count);
            liveEventHeaderView.E = (TextView) liveEventHeaderView.findViewById(R.id.live_open_bet_count);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.setIntrinsicWidth(zch0.a(liveEventHeaderView.getContext(), 24));
            shapeDrawable.setIntrinsicHeight(zch0.a(liveEventHeaderView.getContext(), 24));
            shapeDrawable.getPaint().setColor(liveEventHeaderView.getContext().getColor(R.color.background_type2_tertiary));
            TextView textView = liveEventHeaderView.F;
            WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
            textView.setBackground(shapeDrawable);
            liveEventHeaderView.E.setBackground(shapeDrawable);
            com.sportybet.plugin.event.e eVar9 = this.E0;
            if (eVar9 == null) {
                Intrinsics.n("eventViewModel");
                throw null;
            }
            eVar9.O.f(this, new h(new Function1() { // from class: iig
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Boolean bool = (Boolean) obj;
                    LiveEventHeaderView liveEventHeaderView2 = this.a.v0;
                    if (liveEventHeaderView2 == null) {
                        Intrinsics.n("liveEventHeaderView");
                        throw null;
                    }
                    bool.getClass();
                    liveEventHeaderView2.setWorldCupPassBannerVisible(bool.booleanValue());
                    return Unit.a;
                }
            }));
            agd0 agd0Var22 = this.R;
            if (agd0Var22 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            LiveEventControlsHeaderView liveEventControlsHeaderView = agd0Var22.d;
            mkg mkgVar = new mkg(this);
            liveEventControlsHeaderView.d = mkgVar;
            did0 did0Var = liveEventControlsHeaderView.e;
            AppCompatImageView appCompatImageView = did0Var.f;
            RadioPlaybackMiniPanel radioPlaybackMiniPanel = did0Var.d;
            int i6 = 0;
            appCompatImageView.setOnClickListener(new hks(mkgVar, i6));
            did0Var.b.setOnClickListener(new iks(mkgVar, i6));
            radioPlaybackMiniPanel.setOnPlayPauseToggleClickListener(new vri(mkgVar, 1));
            if (radioPlaybackMiniPanel.F.compareAndSet(false, true)) {
                radioPlaybackMiniPanel.getContext().bindService(new Intent(radioPlaybackMiniPanel.getContext(), (Class<?>) RadioService.class), radioPlaybackMiniPanel.L, 1);
            }
            final boolean zIsLogin = getAccountHelper().isLogin();
            com.sportybet.plugin.event.e eVar10 = this.E0;
            if (eVar10 == null) {
                Intrinsics.n("eventViewModel");
                throw null;
            }
            eVar10.K.f(this, new fkg(new Function1() { // from class: jig
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Event event2 = (Event) obj;
                    int i7 = EventActivity.U0;
                    event2.getClass();
                    if (zIsLogin) {
                        e eVar11 = this.E0;
                        if (eVar11 == null) {
                            Intrinsics.n("eventViewModel");
                            throw null;
                        }
                        String str = event2.matchStatus;
                        if (str == null) {
                            str = "";
                        }
                        eVar11.O1(new nqv.c(str, oqv.LIVE));
                    }
                    return Unit.a;
                }
            }, eVar10));
            agd0 agd0Var23 = this.R;
            if (agd0Var23 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var23.d.e.b.setVisibility(zIsLogin ? 0 : 8);
            if (event != null) {
                mfb0 mfb0VarE = lfb0.d().e(event.sport.id);
                this.W = mfb0VarE;
                j2(event, mfb0VarE);
            } else {
                agd0 agd0Var24 = this.R;
                if (agd0Var24 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                View progressView = agd0Var24.B.getProgressView();
                if (progressView != null && (viewFindViewById = progressView.findViewById(R.id.header_part)) != null) {
                    viewFindViewById.setVisibility(0);
                }
            }
            v8i0 viewModelStore4 = getViewModelStore();
            r8i0.c defaultViewModelProviderFactory4 = getDefaultViewModelProviderFactory();
            cyb defaultViewModelCreationExtras4 = getDefaultViewModelCreationExtras();
            viewModelStore4.getClass();
            defaultViewModelProviderFactory4.getClass();
            defaultViewModelCreationExtras4.getClass();
            s8i0 s8i0Var4 = new s8i0(viewModelStore4, defaultViewModelProviderFactory4, defaultViewModelCreationExtras4);
            dq7 dq7VarA4 = jq40.a(rvu.class);
            String strI4 = dq7VarA4.i();
            if (strI4 == null) {
                hb5.a("Local and anonymous classes can not be ViewModels");
                return;
            }
            rvu rvuVar = (rvu) s8i0Var4.a(dq7VarA4, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI4));
            this.F0 = rvuVar;
            rvuVar.i.f(this, new h(new Function1() { // from class: pig
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    com.sporty.android.common.uievent.a aVar2 = (com.sporty.android.common.uievent.a) obj;
                    int i7 = EventActivity.U0;
                    EventActivity eventActivity = this.a;
                    com.sporty.android.common.uievent.e eVar11 = eventActivity.B;
                    if (eVar11 != null) {
                        eVar11.c(aVar2, eventActivity, eventActivity.findViewById(R.id.root), eventActivity);
                        return Unit.a;
                    }
                    Intrinsics.n("commonUiEventProcessor");
                    throw null;
                }
            }));
            rvu rvuVar2 = this.F0;
            if (rvuVar2 == null) {
                Intrinsics.n("matchAlertViewModel");
                throw null;
            }
            fks.b(rvuVar2.A, rvuVar2.E, new rig(this)).f(this, new h(new sig()));
            rvu rvuVar3 = this.F0;
            if (rvuVar3 == null) {
                Intrinsics.n("matchAlertViewModel");
                throw null;
            }
            rvuVar3.w.f(this, new h(new tig(this, 0)));
            U1();
            final boolean zT = b3.T(stringExtra);
            final Rect rect = new Rect();
            agd0 agd0Var25 = this.R;
            if (agd0Var25 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var25.G.setOnVerticalScrollChangeListener(new ConsecutiveScrollerLayout.e() { // from class: ejg
                @Override // com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout.e
                public final void a(int i7) {
                    EventActivity eventActivity = this.a;
                    agd0 agd0Var26 = eventActivity.R;
                    if (agd0Var26 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    ConsecutiveScrollerLayout consecutiveScrollerLayout = agd0Var26.G;
                    Rect rect2 = rect;
                    consecutiveScrollerLayout.getHitRect(rect2);
                    LiveEventHeaderView liveEventHeaderView2 = eventActivity.v0;
                    if (liveEventHeaderView2 == null) {
                        Intrinsics.n("liveEventHeaderView");
                        throw null;
                    }
                    eventActivity.W1(zT, liveEventHeaderView2.getLocalVisibleRect(rect2));
                }
            });
            agd0 agd0Var26 = this.R;
            if (agd0Var26 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var26.J.setOnClickListener(new s13(this, 1));
            agd0 agd0Var27 = this.R;
            if (agd0Var27 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var27.I.setOnClickListener(new akg(this, 0));
            nzm nzmVar = this.e;
            if (nzmVar == null) {
                Intrinsics.n("stakeConfigAgent");
                throw null;
            }
            this.z0 = new zy80(this, nzmVar);
            iym iymVarF1 = F1();
            Map<String, ? extends Object> mapA = u.a(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, stringExtra);
            PageMeta.INSTANCE.getClass();
            iymVarF1.c(AnalyticsEvent.EVENT_DETAIL_VIEW, mapA, PageMeta.Companion.a());
            agd0 agd0Var28 = this.R;
            if (agd0Var28 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var28.D.setOnClickListener(new View.OnClickListener() { // from class: bkg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i7 = EventActivity.U0;
                    this.a.O1();
                }
            });
            agd0 agd0Var29 = this.R;
            if (agd0Var29 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            agd0Var29.E.setViewCompositionStrategy(bVar);
            agd0 agd0Var30 = this.R;
            if (agd0Var30 != null) {
                agd0Var30.H.setViewCompositionStrategy(bVar);
            } else {
                Intrinsics.n("binding");
                throw null;
            }
        } catch (Exception e2) {
            erb erbVar = this.z;
            if (erbVar == null) {
                Intrinsics.n("crashUtils");
                throw null;
            }
            erbVar.a(this);
            wsm wsmVar2 = this.A;
            if (wsmVar2 == null) {
                Intrinsics.n("crashlyticsHelper");
                throw null;
            }
            wsmVar2.g("Detected Resources.NotFoundException in EventActivity", "", e2, null);
            this.k0 = true;
            finish();
        }
    }
}
