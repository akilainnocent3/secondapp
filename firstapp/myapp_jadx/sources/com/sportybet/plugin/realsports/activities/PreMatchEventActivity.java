package com.sportybet.plugin.realsports.activities;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.appsflyer.internal.u;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.book.domain.entity.BetBuilderData;
import com.sporty.android.book.domain.entity.EventSource;
import com.sporty.android.book.domain.entity.MarketGroup;
import com.sporty.android.book.domain.entity.SimpleMarket;
import com.sporty.android.book.presentation.eventdetails.header.EventDetailHeaderUiModel;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.widgets.SimpleActionBar;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.IndicatorView;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.core.injection.opentelemetry.PageMeta;
import com.sportybet.feature.settings.SettingsActivity;
import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.ISocketPushManager;
import com.sportybet.plugin.event.e;
import com.sportybet.plugin.event.i;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.FilteredMarkets;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.PreCannedBBOutcome;
import com.sportybet.plugin.realsports.data.ServerProductStatus;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.event.PreMatchEventAdapter;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.CommentsData;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.PostCommentData;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.ShareBetData;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.UploadImageResponse;
import com.sportybet.plugin.realsports.prematch.data.EventDetailsNavigation;
import com.sportybet.plugin.realsports.prematch.data.NavigationUiEvent;
import com.sportybet.plugin.realsports.prematch.data.TournamentDetails;
import com.sportybet.plugin.realsports.widget.FloatLoadingView;
import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;
import defpackage.a8z;
import defpackage.aah;
import defpackage.ab1;
import defpackage.af20;
import defpackage.ap0;
import defpackage.apg;
import defpackage.aq70;
import defpackage.aru;
import defpackage.ay0;
import defpackage.azj0;
import defpackage.azm;
import defpackage.b3;
import defpackage.b6d;
import defpackage.bb40;
import defpackage.be;
import defpackage.bi50;
import defpackage.br3;
import defpackage.bsy;
import defpackage.c6k;
import defpackage.ca20;
import defpackage.cb20;
import defpackage.cc20;
import defpackage.chk;
import defpackage.ct90;
import defpackage.cyb;
import defpackage.czj0;
import defpackage.d6k;
import defpackage.db1;
import defpackage.dc20;
import defpackage.dd20;
import defpackage.dq7;
import defpackage.duj;
import defpackage.eal;
import defpackage.eb20;
import defpackage.ebs;
import defpackage.ed20;
import defpackage.ee;
import defpackage.ej5;
import defpackage.ema;
import defpackage.erb;
import defpackage.f00;
import defpackage.fae;
import defpackage.fb20;
import defpackage.fd20;
import defpackage.fdt;
import defpackage.fe00;
import defpackage.fj2;
import defpackage.fks;
import defpackage.g08;
import defpackage.g0m;
import defpackage.g1i;
import defpackage.g880;
import defpackage.g8y;
import defpackage.gaj;
import defpackage.ge00;
import defpackage.gi20;
import defpackage.gky;
import defpackage.gr0;
import defpackage.gtg;
import defpackage.h0j0;
import defpackage.haj;
import defpackage.hb20;
import defpackage.hb5;
import defpackage.hd20;
import defpackage.hhy;
import defpackage.hp0;
import defpackage.hsx;
import defpackage.htj;
import defpackage.i2i;
import defpackage.ibh0;
import defpackage.id20;
import defpackage.if20;
import defpackage.itf0;
import defpackage.iu2;
import defpackage.iym;
import defpackage.jd20;
import defpackage.jf1;
import defpackage.jf20;
import defpackage.jpu;
import defpackage.jq40;
import defpackage.jwj;
import defpackage.k00;
import defpackage.k650;
import defpackage.k9j;
import defpackage.kb20;
import defpackage.kd20;
import defpackage.kf1;
import defpackage.kw5;
import defpackage.kzh;
import defpackage.l48;
import defpackage.lbp;
import defpackage.ld20;
import defpackage.lfb0;
import defpackage.lfy;
import defpackage.lgb0;
import defpackage.lrm;
import defpackage.lvs;
import defpackage.m2g;
import defpackage.m58;
import defpackage.mb20;
import defpackage.mch;
import defpackage.md20;
import defpackage.mf20;
import defpackage.mfb0;
import defpackage.mi20;
import defpackage.mj40;
import defpackage.mlk;
import defpackage.mmc;
import defpackage.muh;
import defpackage.mwo;
import defpackage.n1i;
import defpackage.n88;
import defpackage.nb20;
import defpackage.nd20;
import defpackage.nh4;
import defpackage.nn6;
import defpackage.nqa;
import defpackage.nuj;
import defpackage.nzm;
import defpackage.o0b;
import defpackage.o8i0;
import defpackage.oa20;
import defpackage.od20;
import defpackage.of20;
import defpackage.oi20;
import defpackage.oke;
import defpackage.on6;
import defpackage.op8;
import defpackage.osg;
import defpackage.paj;
import defpackage.pc20;
import defpackage.pd20;
import defpackage.psg;
import defpackage.psm;
import defpackage.ptj;
import defpackage.py1;
import defpackage.qc20;
import defpackage.qm70;
import defpackage.qst;
import defpackage.qz3;
import defpackage.r5b;
import defpackage.r8i0;
import defpackage.r8p;
import defpackage.rb20;
import defpackage.rc1;
import defpackage.rd20;
import defpackage.rdd0;
import defpackage.rgy;
import defpackage.rt5;
import defpackage.rtj;
import defpackage.rvu;
import defpackage.s1p;
import defpackage.s88;
import defpackage.s8i0;
import defpackage.s9s;
import defpackage.sb20;
import defpackage.sg2;
import defpackage.sn6;
import defpackage.ssw;
import defpackage.str;
import defpackage.t8f;
import defpackage.ta20;
import defpackage.tb20;
import defpackage.tc20;
import defpackage.th50;
import defpackage.tit;
import defpackage.tru;
import defpackage.ttj;
import defpackage.u6i0;
import defpackage.u88;
import defpackage.uhc;
import defpackage.v88;
import defpackage.v8i0;
import defpackage.va0;
import defpackage.va20;
import defpackage.vd;
import defpackage.vgb0;
import defpackage.vpu;
import defpackage.vu90;
import defpackage.we20;
import defpackage.wm70;
import defpackage.wpu;
import defpackage.wq3;
import defpackage.wsm;
import defpackage.wym;
import defpackage.x920;
import defpackage.xa20;
import defpackage.xc20;
import defpackage.xxz;
import defpackage.xym;
import defpackage.xz80;
import defpackage.y1k0;
import defpackage.y8j;
import defpackage.ya20;
import defpackage.yk10;
import defpackage.yrh0;
import defpackage.yzh;
import defpackage.zb20;
import defpackage.zch0;
import defpackage.ze20;
import defpackage.zsu;
import defpackage.zvo;
import defpackage.zy80;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\rB\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/sportybet/plugin/realsports/activities/PreMatchEventActivity;", "Lpy1;", "Landroid/view/View$OnClickListener;", "", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$f;", "Liu2$b;", "Lcom/google/android/material/tabs/TabLayout$d;", "Lxym;", "Landroid/text/TextWatcher;", "Lwym;", "Lk9j;", "Lfe00;", "Lbb40;", "Lmch$a;", "<init>", "()V", "Landroid/view/View;", "v", "", "onClick", "(Landroid/view/View;)V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PreMatchEventActivity extends g0m implements View.OnClickListener, SwipeRefreshLayout.f, iu2.b, TabLayout.d, xym, TextWatcher, wym, k9j, fe00, bb40, mch.a {
    public static final /* synthetic */ int a2 = 0;
    public xz80 A;
    public PreMatchEventAdapter A0;
    public RecyclerView A1;
    public xxz B;
    public aq70 B0;
    public LinearLayout B1;
    public iym C;
    public hsx C0;
    public IndicatorView C1;
    public k650 D;
    public View D0;
    public mch D1;
    public zsu E;
    public ImageView E0;
    public lrm F;
    public ImageView F0;
    public int F1;
    public nzm G;
    public s88 G0;
    public int G1;
    public str<hsx> H;
    public gi20 H0;
    public a8z I;
    public WebView I0;
    public muh J;
    public int J0;
    public s1p K;
    public int K0;
    public boolean K1;
    public lbp L;
    public Animation L0;
    public com.sportybet.plugin.event.e L1;
    public boolean M0;
    public mi20 M1;
    public boolean N0;
    public bsy N1;
    public int O0;
    public int O1;
    public String P;
    public FloatLoadingView P0;
    public String P1;
    public String Q;
    public List<Integer> Q0;
    public String Q1;
    public String R;
    public of20 R0;
    public boolean R1;
    public Event S;
    public oa20 S0;
    public boolean S1;
    public SwipeRefreshLayout T;
    public fj2 T0;
    public boolean T1;
    public RecyclerView U;
    public rvu U0;
    public ArrayList V;
    public boolean V0;
    public String V1;
    public boolean W;
    public String W0;
    public Boolean W1;
    public List<SimpleMarket> X;
    public AppCompatEditText X0;
    public TextView Y;
    public ImageView Y0;
    public TextView Z;
    public View Z0;
    public ge00 Z1;
    public TextView a0;
    public View a1;
    public b6d b;
    public TextView b0;
    public View b1;
    public rdd0 c;
    public ViewGroup c0;
    public View c1;
    public chk d;
    public View d0;
    public zy80 d1;
    public y1k0 e;
    public ViewGroup e0;
    public ShareBetData e1;
    public azm f;
    public TextView f0;
    public TextView f1;
    public BubbleView g0;
    public TextView g1;
    public FragmentContainerView h0;
    public TextView h1;
    public erb i;
    public x920 i0;
    public TextView i1;
    public x920 j0;
    public ImageView j1;
    public ComposeView k0;
    public TextView k1;
    public ComposeView l0;
    public ConstraintLayout l1;
    public ComposeView m0;
    public TextView m1;
    public ComposeView n0;
    public TextView n1;
    public ComposeView o0;
    public boolean p0;
    public FlexboxLayout p1;
    public SimpleActionBar q0;
    public ConsecutiveScrollerLayout q1;
    public ViewGroup r0;
    public DrawerLayout r1;
    public ImageView s0;
    public ComposeView s1;
    public TabLayout t0;
    public ComposeView t1;
    public TabLayout.g u0;
    public ComposeView u1;
    public str<String> v;
    public TabLayout v0;
    public ComposeView v1;
    public lvs w;
    public RelativeLayout w0;
    public boolean w1;
    public int x0;
    public boolean x1;
    public wsm y;
    public LoadingView y0;
    public com.sporty.android.common.uievent.e z;
    public LoadingView z0;
    public final HashMap<String, List<Market>> M = new HashMap<>();
    public final ArrayList N = new ArrayList();
    public final ArrayList O = new ArrayList();
    public int o1 = -1;
    public String y1 = "";
    public rgy z1 = hhy.a().get(0);
    public final c E1 = new c();
    public final HashMap<Integer, Integer> H1 = new HashMap<>();
    public boolean I1 = true;
    public String J1 = "";
    public final g U1 = new g();
    public final ee<String> X1 = registerForActivityResult(new be(), new g8y(this, 1));
    public final d Y1 = new d();

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.sportybet.plugin.event.c.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                com.sportybet.plugin.event.c.a aVar = com.sportybet.plugin.event.c.a.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                com.sportybet.plugin.event.c.a aVar2 = com.sportybet.plugin.event.c.a.a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EventDetailsNavigation.values().length];
            try {
                iArr2[EventDetailsNavigation.NEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EventDetailsNavigation.PREVIOUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr2;
            int[] iArr3 = new int[n88.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                n88 n88Var = n88.a;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                n88 n88Var2 = n88.a;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b implements wq3.b {
        public b() {
        }

        @Override // wq3.b
        public final boolean a() {
            return !PreMatchEventActivity.this.isFinishing();
        }

        @Override // wq3.b
        public final void b(int i) {
            PreMatchEventActivity preMatchEventActivity = PreMatchEventActivity.this;
            preMatchEventActivity.F1 = i;
            PreMatchEventAdapter preMatchEventAdapter = preMatchEventActivity.A0;
            if (preMatchEventAdapter != null) {
                preMatchEventAdapter.showFooterQuickBetViewBackground(preMatchEventActivity, i);
            }
        }

        @Override // wq3.b
        public final void c(boolean z) {
            PreMatchEventActivity preMatchEventActivity = PreMatchEventActivity.this;
            preMatchEventActivity.F1 = 0;
            PreMatchEventAdapter preMatchEventAdapter = preMatchEventActivity.A0;
            if (preMatchEventAdapter != null) {
                preMatchEventAdapter.hideFooterQuickBetViewBackground();
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class c extends RecyclerView.s {
        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void b(RecyclerView recyclerView, int i, int i2) {
            mi20 mi20Var;
            PreMatchEventActivity preMatchEventActivity = PreMatchEventActivity.this;
            gi20 gi20Var = preMatchEventActivity.H0;
            if (i2 <= 0 || preMatchEventActivity.J0 != 4 || gi20Var == null) {
                return;
            }
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            int itemCount = gi20Var.getItemCount();
            int iH1 = linearLayoutManager.h1();
            if (itemCount <= 0 || iH1 < itemCount - 1 || (mi20Var = preMatchEventActivity.M1) == null) {
                return;
            }
            Event event = preMatchEventActivity.S;
            String str = preMatchEventActivity.P;
            if (str != null && str.equals(mi20Var.E) && ((mj40) mi20Var.B.getValue()).b) {
                mi20Var.F = ej5.c(o8i0.d(mi20Var), null, null, new oi20(mi20Var, str, event, null), 3);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class d extends ee<String> {
        public final vd<String, ?> a;

        public d() {
            this.a = PreMatchEventActivity.this.X1.a();
        }

        @Override // defpackage.ee
        public final vd<String, ?> a() {
            return this.a;
        }

        @Override // defpackage.ee
        public final void b(Object obj) {
            String str = (String) obj;
            str.getClass();
            PreMatchEventActivity preMatchEventActivity = PreMatchEventActivity.this;
            preMatchEventActivity.V1 = str;
            if ("android.permission.POST_NOTIFICATIONS".equals(str) && Build.VERSION.SDK_INT >= 33) {
                preMatchEventActivity.W1 = Boolean.valueOf(o0b.a(preMatchEventActivity, str) == 0);
            }
            preMatchEventActivity.X1.b(str);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class e implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public e(Function1 function1) {
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

    /* JADX INFO: loaded from: classes7.dex */
    public static final class f implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ ComposeView a;
        public final /* synthetic */ PreMatchEventActivity b;

        public f(ComposeView composeView, PreMatchEventActivity preMatchEventActivity) {
            this.a = composeView;
            this.b = preMatchEventActivity;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            ComposeView composeView = this.a;
            composeView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            int measuredHeight = composeView.getMeasuredHeight();
            PreMatchEventActivity preMatchEventActivity = this.b;
            LoadingView loadingView = preMatchEventActivity.y0;
            ViewGroup.LayoutParams layoutParams = loadingView != null ? loadingView.getLayoutParams() : null;
            FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            layoutParams2.setMargins(0, measuredHeight, 0, 0);
            LoadingView loadingView2 = preMatchEventActivity.y0;
            if (loadingView2 != null) {
                loadingView2.setLayoutParams(layoutParams2);
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class g extends BroadcastReceiver {
        public g() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            String[] stringArrayExtra;
            String str;
            String str2;
            context.getClass();
            intent.getClass();
            if (!TextUtils.equals(intent.getStringExtra("eventName"), "openBottomSheet") || (stringArrayExtra = intent.getStringArrayExtra("data")) == null || (str = (String) ay0.C(0, stringArrayExtra)) == null || (str2 = (String) ay0.C(1, stringArrayExtra)) == null) {
                return;
            }
            PreMatchEventActivity preMatchEventActivity = PreMatchEventActivity.this;
            FragmentManager supportFragmentManager = preMatchEventActivity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            i.a.a(supportFragmentManager, preMatchEventActivity.getLifecycle(), str, str2, false);
        }
    }

    public static void D1(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Market market = (Market) it.next();
            if (market != null) {
                boolean zContains = tru.c.contains(market.id);
                if (z && !zContains) {
                    arrayList.addAll(arrayList.size(), arrayList2);
                    arrayList.add(market);
                } else if (zContains && tru.g(market.id, market.specifier)) {
                    arrayList2.add(market);
                } else {
                    arrayList.add(market);
                }
                z = zContains;
            }
        }
        list.clear();
        list.addAll(arrayList);
    }

    public static final int k2(String str) {
        if (str == null) {
            return 0;
        }
        switch (str.hashCode()) {
            case -2044594742:
                return !str.equals("betBuilder") ? 0 : 3;
            case -1915551093:
                return !str.equals("recommendedCodes") ? 0 : 4;
            case -602415628:
                return !str.equals("comments") ? 0 : 2;
            case 109757599:
                return !str.equals("stats") ? 0 : 1;
            default:
                return 0;
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void A0(TabLayout.g gVar) {
        gVar.getClass();
    }

    public final void A1() {
        ComposeView composeView = this.u1;
        if (composeView != null) {
            composeView.setVisibility(8);
        }
        View view = this.b1;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // defpackage.fe00
    public final ee<String> B0() {
        return this.Y1;
    }

    public final PostCommentData B1(String str) {
        com.sportybet.plugin.event.e eVar = this.L1;
        PostCommentData postCommentData = new PostCommentData(str, null, eVar != null ? eVar.Q : null, this.W0, "PRE_MATCH");
        int i = this.o1;
        if (i > 0) {
            postCommentData.parentId = Integer.valueOf(i);
        }
        return postCommentData;
    }

    @Override // iu2.a
    public final void C() {
        ca20 ca20Var;
        ca20 ca20Var2;
        PreMatchEventAdapter preMatchEventAdapter = this.A0;
        if (preMatchEventAdapter != null) {
            preMatchEventAdapter.notifyDataSetChanged();
        }
        mch mchVar = this.D1;
        if (mchVar != null) {
            mchVar.notifyDataSetChanged();
        }
        x920 x920Var = this.i0;
        if (x920Var != null && (ca20Var2 = x920Var.C) != null) {
            ca20Var2.notifyDataSetChanged();
        }
        x920 x920Var2 = this.j0;
        if (x920Var2 == null || (ca20Var = x920Var2.C) == null) {
            return;
        }
        ca20Var.notifyDataSetChanged();
    }

    public final TabLayout.g C1(TabLayout tabLayout, String str, String str2) {
        boolean zG = Intrinsics.g(str2, "favorites");
        Drawable drawable = getDrawable(R.drawable.ic_star_on);
        TabLayout.g gVarL = tabLayout.l();
        if (!zG || drawable == null) {
            View viewInflate = LayoutInflater.from(this).inflate(R.layout.spr_market_tab, (ViewGroup) null);
            viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            ((TextView) viewInflate.findViewById(R.id.title)).setText(str);
            gVarL.c(viewInflate);
        } else {
            gVarL.d(drawable);
        }
        gVarL.a = str2;
        tabLayout.b(gVarL);
        return gVarL;
    }

    public final void F1() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
        x920 x920Var = this.i0;
        if (x920Var != null) {
            aVarA.o(x920Var);
            aVarA.q(x920Var, s9s.b.d);
        }
        x920 x920Var2 = this.j0;
        if (x920Var2 != null) {
            aVarA.o(x920Var2);
            aVarA.q(x920Var2, s9s.b.d);
        }
        aVarA.l();
        FragmentContainerView fragmentContainerView = this.h0;
        if (fragmentContainerView != null) {
            fragmentContainerView.setVisibility(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    @Override // com.google.android.material.tabs.TabLayout.c
    public final void G(TabLayout.g gVar) {
        RecyclerView recyclerView;
        int height;
        int height2;
        ComposeView composeView;
        gVar.getClass();
        if (gVar.e != 0 || K1()) {
            this.x0 = gVar.e;
            Object obj = gVar.a;
            String str = obj instanceof String ? (String) obj : null;
            List<Market> list = str != null ? this.M.get(str) : null;
            if (gVar != this.u0) {
                z1();
                PreMatchEventAdapter preMatchEventAdapter = this.A0;
                if (preMatchEventAdapter != null) {
                    preMatchEventAdapter.setMarkets(list, this.x0, str);
                }
                String str2 = this.Q;
                if (str2 != null && list != null) {
                    Market marketC = vpu.c(str2, this.R, list);
                    if (marketC != null) {
                        PreMatchEventAdapter preMatchEventAdapter2 = this.A0;
                        if (preMatchEventAdapter2 != null) {
                            preMatchEventAdapter2.highlightMarket(marketC);
                        }
                        final int iIndexOf = list.indexOf(marketC);
                        if (iIndexOf > 0) {
                            View view = this.d0;
                            if (view == null) {
                                height = 0;
                            } else {
                                if (view.getVisibility() != 0) {
                                    view = null;
                                }
                                if (view != null) {
                                    height = view.getHeight();
                                } else {
                                    height = 0;
                                }
                            }
                            ViewGroup viewGroup = this.r0;
                            if (viewGroup == null) {
                                height2 = 0;
                            } else {
                                if (viewGroup.getVisibility() != 0) {
                                    viewGroup = null;
                                }
                                if (viewGroup != null) {
                                    height2 = viewGroup.getHeight();
                                } else {
                                    height2 = 0;
                                }
                            }
                            final int i = height + height2;
                            ConsecutiveScrollerLayout consecutiveScrollerLayout = this.q1;
                            if (consecutiveScrollerLayout != null) {
                                consecutiveScrollerLayout.post(new Runnable() { // from class: vb20
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        PreMatchEventActivity preMatchEventActivity = this.a;
                                        ConsecutiveScrollerLayout consecutiveScrollerLayout2 = preMatchEventActivity.q1;
                                        if (consecutiveScrollerLayout2 != null) {
                                            consecutiveScrollerLayout2.C(preMatchEventActivity.U);
                                        }
                                        preMatchEventActivity.R1(iIndexOf, i);
                                    }
                                });
                            }
                        }
                    }
                    this.Q = null;
                }
            } else {
                PreMatchEventAdapter preMatchEventAdapter3 = this.A0;
                if (preMatchEventAdapter3 != null) {
                    preMatchEventAdapter3.setMarkets(list, this.x0, str, this.z1);
                }
            }
            aq70 aq70Var = this.B0;
            if (aq70Var != null && (recyclerView = this.U) != null) {
                recyclerView.k0(aq70Var);
            }
        } else {
            getAccountHelper().demandAccount(this, new tit() { // from class: ub20
                @Override // defpackage.tit
                public final void w(Account account, boolean z) {
                    TabLayout.g gVarK;
                    PreMatchEventActivity preMatchEventActivity = this.a;
                    if (account == null) {
                        TabLayout tabLayout = preMatchEventActivity.t0;
                        if (tabLayout == null || (gVarK = tabLayout.k(preMatchEventActivity.x0)) == null) {
                            return;
                        }
                        gVarK.b();
                        return;
                    }
                    preMatchEventActivity.x0 = 0;
                    FloatLoadingView floatLoadingView = preMatchEventActivity.P0;
                    if (floatLoadingView != null) {
                        floatLoadingView.setVisibility(0);
                        floatLoadingView.c.setVisibility(0);
                        floatLoadingView.a.setVisibility(8);
                        floatLoadingView.b.setVisibility(8);
                    }
                    e eVar = preMatchEventActivity.L1;
                    if (eVar != null) {
                        eVar.B1(false, new iwj(preMatchEventActivity, 2));
                    }
                    preMatchEventActivity.z1();
                }
            });
        }
        if (this.w1 && gVar != this.u0 && (composeView = this.v1) != null) {
            composeView.setVisibility(0);
        }
        m2();
    }

    public final void G1(boolean z) {
        com.sportybet.plugin.event.e eVar;
        if (z && (eVar = this.L1) != null) {
            ej5.c(o8i0.d(eVar), null, null, new psg(eVar, 3, null), 3);
        }
        BubbleView bubbleView = this.g0;
        if (bubbleView != null) {
            bubbleView.setVisibility(8);
        }
    }

    public final void H1() {
        View view = this.a1;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.b1;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.c1;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        View view4 = this.D0;
        int paddingBottom = view4 != null ? view4.getPaddingBottom() : 0;
        View view5 = this.D0;
        if (view5 != null) {
            view5.setPadding(0, paddingBottom, 0, paddingBottom);
        }
    }

    public final boolean I1() {
        return this.J0 == 3 && this.K0 == 0;
    }

    public final boolean J1(Market market, String str) {
        ssw sswVar;
        str.getClass();
        fj2 fj2Var = this.T0;
        List<SimpleMarket> list = (fj2Var == null || (sswVar = fj2Var.i) == null) ? null : (List) sswVar.d();
        if (list != null && !list.isEmpty()) {
            for (SimpleMarket simpleMarket : list) {
                if (Intrinsics.g(simpleMarket.getMarketId(), market.id)) {
                    String specifier = simpleMarket.getSpecifier();
                    String str2 = market.specifier;
                    if (((TextUtils.isEmpty(specifier) && TextUtils.isEmpty(str2)) ? true : TextUtils.equals(specifier, str2)) && simpleMarket.getOutcomeIds().contains(str)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean K1() {
        String str = this.P;
        return (str == null || str.length() == 0 || !b3.S(str)) ? false : true;
    }

    public final boolean L1() {
        TabLayout.g gVarK;
        TabLayout tabLayout = this.t0;
        if (tabLayout == null || (gVarK = tabLayout.k(this.x0)) == null) {
            return false;
        }
        return "market_search".equals(gVarK.a);
    }

    public final void M1(String str, String str2) {
        if (str == null) {
            return;
        }
        oa20 oa20Var = this.S0;
        if (oa20Var != null) {
            oa20Var.x1(new v88.a(str2), k00.a, k00.c);
        }
        g08 g08VarValueOf = g08.valueOf(str2);
        g08 g08Var = g08.RECOMMENDED_BOOKING_CODE_SUCCESSFUL;
        if (g08VarValueOf == g08Var) {
            boolean z = g08.valueOf(str2) == g08Var;
            oa20 oa20Var2 = this.S0;
            if (oa20Var2 != null) {
                oa20Var2.x1(new v88.h(z ? "recommended_image" : "recommended_code"), k00.d);
            }
        }
        qz3.k(str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:136:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:149:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:237:0x0467  */
    /* JADX WARN: Code duplicated, block: B:242:0x0474  */
    /* JADX WARN: Code duplicated, block: B:245:0x047e  */
    /* JADX WARN: Code duplicated, block: B:362:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:364:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:366:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:469:0x048b A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
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
    public final void N1(int i, boolean z, boolean z2, boolean z3) throws Throwable {
        int i2;
        Event event;
        String str;
        HashMap<String, List<Market>> map;
        List<Market> list;
        int i3;
        int i4;
        TabLayout.g gVar;
        String str2;
        RecyclerView recyclerView;
        TabLayout.g gVarK;
        View view;
        TabLayout.g gVar2;
        String str3;
        RecyclerView recyclerView2;
        TabLayout.g gVarK2;
        PreMatchEventAdapter preMatchEventAdapter;
        Collection<? extends Market> collectionR0;
        SimpleMarket simpleMarket;
        ArrayList arrayList;
        int i5;
        Market market;
        boolean zContains;
        int i6;
        int i7;
        Object next;
        List<String> baseMarketIds;
        Iterator<T> it;
        int i8;
        ssw sswVar;
        com.sportybet.plugin.event.e eVar;
        ssw sswVar2;
        of20 of20Var;
        Category category;
        Tournament tournament;
        SwipeRefreshLayout swipeRefreshLayout;
        if (i == 0) {
            SwipeRefreshLayout swipeRefreshLayout2 = this.T;
            if (swipeRefreshLayout2 != null) {
                swipeRefreshLayout2.setRefreshing(false);
            }
            Event event2 = this.S;
            if (event2 == null || (of20Var = this.R0) == null) {
                i2 = 4;
            } else {
                we20 we20Var = of20Var.q0;
                ISocketPushManager iSocketPushManager = of20Var.z;
                a2(z2);
                vu90<NavigationUiEvent> vu90Var = of20Var.e0;
                of20Var.k0 = event2;
                ssw<Boolean> sswVar3 = of20Var.i0;
                List<String> listA = of20Var.B.a();
                Sport sport = event2.sport;
                sswVar3.m(Boolean.valueOf(CollectionsKt.M(listA, (sport == null || (category = sport.category) == null || (tournament = category.tournament) == null) ? null : tournament.id)));
                Sport sport2 = event2.sport;
                String str4 = sport2.category.tournament.id;
                d6k d6kVar = of20Var.d;
                String str5 = sport2.id;
                str5.getClass();
                str4.getClass();
                d6kVar.getClass();
                gtg gtgVar = d6kVar.a;
                i2 = 4;
                kzh.d(new yzh(new g1i(new n1i(gtgVar.b(new TournamentDetails(str4, 1, str5)), gtgVar.b(new TournamentDetails(str4, 3, str5)), new c6k(3, null)), new ze20(of20Var, event2, null)), new af20(3, null)), o8i0.d(of20Var));
                ej5.c(o8i0.d(of20Var), null, null, new if20(of20Var, event2, null), 3);
                Event event3 = of20Var.k0;
                if (event3 != null) {
                    iSocketPushManager.unsubscribeTopic(new GroupTopic(event3.getTopic()), we20Var);
                }
                Event event4 = of20Var.k0;
                if (event4 != null) {
                    iSocketPushManager.subscribeTopic(new GroupTopic(event4.getTopic()), we20Var);
                }
                if (kotlin.collections.b.k(3, 4).contains(Integer.valueOf(event2.status))) {
                    vu90Var.m(NavigationUiEvent.MatchEndedNavigation.INSTANCE);
                } else if (event2.status == 1) {
                    String str6 = event2.eventId;
                    str6.getClass();
                    vu90Var.m(new NavigationUiEvent.LiveNavigation(str6, true));
                }
            }
            Z1(false);
            TabLayout tabLayout = this.t0;
            if (tabLayout != null) {
                if (this.W) {
                    tabLayout.o(this);
                    this.W = false;
                    tabLayout.n();
                    if (!K1()) {
                        C1(tabLayout, getCMSString(R.string.common_functions__my_favourites, new Object[0]), "favorites");
                    }
                    C1(tabLayout, getCMSString(R.string.common_functions__all, new Object[0]), "all");
                    ArrayList arrayList2 = this.V;
                    if (arrayList2 != null) {
                        int size = arrayList2.size();
                        int i9 = 0;
                        while (i9 < size) {
                            Object obj = arrayList2.get(i9);
                            i9++;
                            MarketGroup marketGroup = (MarketGroup) obj;
                            C1(tabLayout, marketGroup.displayName(), marketGroup.getId());
                        }
                    }
                    com.sportybet.plugin.event.e eVar2 = this.L1;
                    boolean z4 = (!((eVar2 == null || (sswVar2 = eVar2.b0) == null) ? false : Intrinsics.g(sswVar2.d(), Boolean.TRUE)) || (eVar = this.L1) == null || eVar.I1() || this.X == null) ? false : true;
                    com.sportybet.plugin.event.e eVar3 = this.L1;
                    boolean z5 = ((eVar3 == null || (sswVar = eVar3.D0) == null) ? false : Intrinsics.g(sswVar.d(), Boolean.TRUE)) && z3;
                    TabLayout tabLayout2 = this.v0;
                    if (tabLayout2 != null && tabLayout2.getTabCount() < 2) {
                        tabLayout2.n();
                        String str7 = "bet_builder_build_your_own";
                        if (z4) {
                            TabLayout.g gVarC1 = C1(tabLayout2, getCMSString(R.string.bet_builder__build_your_own, new Object[0]), "bet_builder_build_your_own");
                            y8j fullStoryCommonManager = getFullStoryCommonManager();
                            View view2 = gVarC1.h;
                            view2.getClass();
                            fullStoryCommonManager.c(view2, AnalyticsParam.BET_BUILDER_CREATE_YOUR_OWN_TAB);
                        }
                        if (z2) {
                            TabLayout.g gVarC2 = C1(tabLayout2, getCMSString(R.string.bet_builder__built_for_you, new Object[0]), "bet_builder_pre_canned");
                            y8j fullStoryCommonManager2 = getFullStoryCommonManager();
                            View view3 = gVarC2.h;
                            view3.getClass();
                            fullStoryCommonManager2.c(view3, AnalyticsParam.PCBB_QUICK_PICKS_TAB);
                        }
                        if (z5) {
                            TabLayout.g gVarC3 = C1(tabLayout2, getCMSString(R.string.bet_builder__mega_bet_builder, new Object[0]), "bet_builder_mega");
                            y8j fullStoryCommonManager3 = getFullStoryCommonManager();
                            View view4 = gVarC3.h;
                            view4.getClass();
                            fullStoryCommonManager3.c(view4, AnalyticsParam.MEGA_TAB);
                        }
                        if (tabLayout2.getTabCount() > 0) {
                            IntRange intRangeN = kotlin.ranges.f.n(0, tabLayout2.getTabCount());
                            ArrayList arrayList3 = new ArrayList(l48.r(intRangeN, 10));
                            Iterator<Integer> it2 = intRangeN.iterator();
                            while (((mwo) it2).c) {
                                TabLayout.g gVarK3 = tabLayout2.k(((zvo) it2).nextInt());
                                Object obj2 = gVarK3 != null ? gVarK3.a : null;
                                String str8 = obj2 instanceof String ? (String) obj2 : null;
                                if (str8 == null) {
                                    str8 = "";
                                }
                                arrayList3.add(str8);
                            }
                            String str9 = this.P1;
                            if (str9 == null) {
                                str7 = null;
                            } else {
                                int iHashCode = str9.hashCode();
                                if (iHashCode != -1102771532) {
                                    if (iHashCode != 3347570) {
                                        if (iHashCode != 2039812101 || !str9.equals("buildYourOwn")) {
                                            str7 = null;
                                        }
                                    } else if (str9.equals("mega")) {
                                        str7 = "bet_builder_mega";
                                    } else {
                                        str7 = null;
                                    }
                                } else if (str9.equals("builtForYou")) {
                                    str7 = "bet_builder_pre_canned";
                                } else {
                                    str7 = null;
                                }
                            }
                            int iIndexOf = arrayList3.indexOf(str7);
                            if (iIndexOf < 0) {
                                iIndexOf = 0;
                            }
                            TabLayout.g gVarK4 = tabLayout2.k(iIndexOf);
                            if (gVarK4 != null) {
                                tabLayout2.s(gVarK4, true);
                            }
                            if (z4) {
                                this.P1 = null;
                            }
                        }
                        o2();
                        n2();
                        tabLayout2.a(new ed20(this));
                    }
                    TabLayout.g gVarL = tabLayout.l();
                    this.u0 = gVarL;
                    gVarL.a = "market_search";
                    tabLayout.b(gVarL);
                    TabLayout tabLayout3 = this.t0;
                    if (tabLayout3 == null) {
                        i8 = 8;
                    } else {
                        View childAt = tabLayout3.getChildAt(0);
                        ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
                        View childAt2 = viewGroup != null ? viewGroup.getChildAt(tabLayout3.getTabCount() - 1) : null;
                        if (childAt2 != null) {
                            i8 = 8;
                            childAt2.setVisibility(8);
                        } else {
                            i8 = 8;
                        }
                    }
                    tabLayout.a(this);
                } else {
                    i8 = 8;
                }
                ViewGroup viewGroup2 = this.r0;
                if (viewGroup2 != null) {
                    ViewGroup viewGroup3 = this.e0;
                    viewGroup2.setVisibility(((viewGroup3 == null || !viewGroup3.isSelected()) && this.J0 == 0) ? 0 : i8);
                }
            }
            Event event5 = this.S;
            if (event5 != null) {
                List arrayList4 = event5.markets;
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    event5.markets = arrayList4;
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : arrayList4) {
                    List<Outcome> list2 = ((Market) obj3).outcomes;
                    list2.getClass();
                    if (!list2.isEmpty()) {
                        Iterator<T> it3 = list2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                List<PreCannedBBOutcome> list3 = ((Outcome) it3.next()).childOutcomes;
                                if (list3 != null && !list3.isEmpty()) {
                                    break;
                                }
                            }
                        }
                    }
                    arrayList5.add(obj3);
                }
                ArrayList arrayList6 = new ArrayList(arrayList5);
                j2(arrayList6);
                D1(arrayList6);
                HashMap<String, List<Market>> map2 = this.M;
                for (List<Market> list4 : map2.values()) {
                    list4.getClass();
                    list4.clear();
                }
                int size2 = arrayList6.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj4 = arrayList6.get(i10);
                    i10++;
                    Market market2 = (Market) obj4;
                    List<Market> list5 = map2.get(market2.groupId);
                    if (list5 != null) {
                        list5.add(market2);
                    }
                }
                String str10 = "bet_builder";
                List<Market> list6 = map2.get("bet_builder");
                if (list6 != null) {
                    List<SimpleMarket> list7 = this.X;
                    if (list7 == null || list7.isEmpty()) {
                        event = event5;
                        str = "bet_builder";
                        collectionR0 = m2g.a;
                    } else {
                        ArrayList arrayList7 = new ArrayList(l48.r(arrayList6, 10));
                        int size3 = arrayList6.size();
                        int i11 = 0;
                        while (i11 < size3) {
                            Object obj5 = arrayList6.get(i11);
                            i11++;
                            arrayList7.add(((Market) obj5).id);
                        }
                        Set setE0 = CollectionsKt.E0(arrayList7);
                        ArrayList arrayList8 = new ArrayList();
                        int size4 = arrayList6.size();
                        int i12 = 0;
                        while (i12 < size4) {
                            Object obj6 = arrayList6.get(i12);
                            int i13 = i12 + 1;
                            Market market3 = (Market) obj6;
                            Iterator<T> it4 = list7.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    i6 = size4;
                                    i7 = i13;
                                    next = null;
                                    break;
                                } else {
                                    next = it4.next();
                                    i6 = size4;
                                    i7 = i13;
                                    if (Intrinsics.g(((SimpleMarket) next).getMarketId(), market3.id)) {
                                        break;
                                    }
                                    size4 = i6;
                                    i13 = i7;
                                }
                            }
                            SimpleMarket simpleMarket2 = (SimpleMarket) next;
                            if (simpleMarket2 != null && Intrinsics.g(simpleMarket2.getMarketId(), market3.id)) {
                                String str11 = market3.specifier;
                                if (str11 == null || str11.length() == 0) {
                                    baseMarketIds = simpleMarket2.getBaseMarketIds();
                                    if (baseMarketIds == null && baseMarketIds.isEmpty()) {
                                        arrayList8.add(obj6);
                                        break;
                                        break;
                                    } else {
                                        it = baseMarketIds.iterator();
                                        do {
                                            if (!it.hasNext()) {
                                                arrayList8.add(obj6);
                                                break;
                                            }
                                        } while (setE0.contains((String) it.next()));
                                    }
                                } else {
                                    List<String> banSpecifiers = simpleMarket2.getBanSpecifiers();
                                    if (banSpecifiers == null) {
                                        banSpecifiers = m2g.a;
                                    }
                                    if (!banSpecifiers.contains(market3.specifier)) {
                                        baseMarketIds = simpleMarket2.getBaseMarketIds();
                                        if (baseMarketIds == null) {
                                            it = baseMarketIds.iterator();
                                            do {
                                                if (!it.hasNext()) {
                                                    arrayList8.add(obj6);
                                                    break;
                                                    break;
                                                }
                                            } while (setE0.contains((String) it.next()));
                                        } else {
                                            it = baseMarketIds.iterator();
                                            do {
                                                if (!it.hasNext()) {
                                                    arrayList8.add(obj6);
                                                    break;
                                                    break;
                                                }
                                            } while (setE0.contains((String) it.next()));
                                        }
                                    }
                                }
                            }
                            size4 = i6;
                            i12 = i7;
                        }
                        ArrayList arrayList9 = new ArrayList();
                        int size5 = arrayList8.size();
                        int i14 = 0;
                        while (i14 < size5) {
                            Object obj7 = arrayList8.get(i14);
                            int i15 = i14 + 1;
                            Market market4 = (Market) obj7;
                            Iterator<T> it5 = list7.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    ibh0.a("Collection contains no element matching the predicate.");
                                    return;
                                }
                                simpleMarket = (SimpleMarket) it5.next();
                                arrayList = arrayList8;
                                i5 = size5;
                                if (Intrinsics.g(simpleMarket.getMarketId(), market4.id)) {
                                    break;
                                }
                                arrayList8 = arrayList;
                                size5 = i5;
                            }
                            List<String> ids = simpleMarket.getOutcome().getIds();
                            List<Outcome> list8 = market4.outcomes;
                            ArrayList arrayListA = kw5.a(list8);
                            Iterator it6 = list8.iterator();
                            while (it6.hasNext()) {
                                Iterator it7 = it6;
                                Object next2 = it7.next();
                                int i16 = i15;
                                Outcome outcome = (Outcome) next2;
                                String str12 = str10;
                                int i17 = vpu.a.a[simpleMarket.getOutcome().getKind().ordinal()];
                                Event event6 = event5;
                                if (i17 == 1) {
                                    zContains = ids.contains(outcome.id);
                                } else {
                                    if (i17 != 2) {
                                        uhc.a();
                                        return;
                                    }
                                    zContains = !ids.contains(outcome.id);
                                }
                                if (zContains) {
                                    arrayListA.add(next2);
                                }
                                it6 = it7;
                                i15 = i16;
                                event5 = event6;
                                str10 = str12;
                            }
                            Event event7 = event5;
                            String str13 = str10;
                            int i18 = i15;
                            if (arrayListA.isEmpty()) {
                                market = null;
                            } else {
                                market = new Market(market4);
                                market.outcomes = arrayListA;
                            }
                            if (market != null) {
                                arrayList9.add(market);
                            }
                            arrayList8 = arrayList;
                            size5 = i5;
                            i14 = i18;
                            event5 = event7;
                            str10 = str13;
                        }
                        event = event5;
                        str = str10;
                        collectionR0 = CollectionsKt.r0(arrayList9, new wpu(list7));
                    }
                    list6.addAll(collectionR0);
                } else {
                    event = event5;
                    str = "bet_builder";
                }
                List<Market> list9 = map2.get("all");
                if (list9 != null) {
                    list9.addAll(arrayList6);
                }
                List<Market> list10 = map2.get("favorites");
                if (list10 != null) {
                    list10.addAll(this.N);
                }
                if (this.y1.length() > 0) {
                    FilteredMarkets filteredMarketsB = vpu.b(this.y1, arrayList6);
                    List<Market> list11 = map2.get("market_search");
                    if (list11 != null) {
                        list11.addAll(filteredMarketsB.getMarkets());
                    }
                }
                PreMatchEventAdapter preMatchEventAdapter2 = this.A0;
                if (preMatchEventAdapter2 == null) {
                    Event event8 = event;
                    mfb0 mfb0VarE = lfb0.d().e(event8.sport.id);
                    aah aahVar = new aah() { // from class: yc20
                        @Override // defpackage.aah
                        public final void a(Market market5, boolean z6) {
                            int i19 = PreMatchEventActivity.a2;
                            market5.getClass();
                            e eVar4 = this.a.L1;
                            if (eVar4 != null) {
                                eVar4.K1(market5, z6);
                            }
                        }
                    };
                    zsu zsuVar = this.E;
                    if (zsuVar == null) {
                        Intrinsics.n("marketsTeamPlayersSorter");
                        throw null;
                    }
                    a8z a8zVar = this.I;
                    if (a8zVar == null) {
                        Intrinsics.n("outcomeBoostResolver");
                        throw null;
                    }
                    muh muhVar = this.J;
                    if (muhVar == null) {
                        Intrinsics.n("flashBoostViewTracker");
                        throw null;
                    }
                    lbp lbpVar = this.L;
                    if (lbpVar == null) {
                        Intrinsics.n("jokerViewTracker");
                        throw null;
                    }
                    map = map2;
                    PreMatchEventAdapter preMatchEventAdapter3 = new PreMatchEventAdapter(this, event8, map, mfb0VarE, aahVar, zsuVar, a8zVar, muhVar, lbpVar);
                    preMatchEventAdapter3.setHasStableIds(false);
                    preMatchEventAdapter3.setHeaderWithEmptyEnable(false);
                    preMatchEventAdapter3.setFooterWithEmptyEnable(false);
                    preMatchEventAdapter3.showJokerOutcomes(Boolean.valueOf(this.x1), Boolean.FALSE);
                    preMatchEventAdapter3.setCallback(new pd20(this));
                    preMatchEventAdapter3.setFooterLayout(this.U, new dd20(this, 0));
                    this.A0 = preMatchEventAdapter3;
                    RecyclerView recyclerView3 = this.U;
                    if (recyclerView3 != null) {
                        recyclerView3.setAdapter(preMatchEventAdapter3);
                    }
                    int i19 = this.F1;
                    if (i19 != 0 && (preMatchEventAdapter = this.A0) != null) {
                        preMatchEventAdapter.showFooterQuickBetViewBackground(this, i19);
                    }
                    list = null;
                } else {
                    map = map2;
                    list = null;
                    preMatchEventAdapter2.setEvent(event);
                }
                if (this.B0 == null) {
                    i3 = 1;
                    this.B0 = new aq70(new nqa(this, i3), new ta20(0));
                } else {
                    i3 = 1;
                }
                ViewGroup viewGroup4 = this.e0;
                if (viewGroup4 == null || viewGroup4.isSelected() != i3) {
                    if (!z) {
                        int i20 = this.x0;
                        TabLayout tabLayout4 = this.t0;
                        if (i20 >= (tabLayout4 != null ? tabLayout4.getTabCount() : 0)) {
                            if (this.I1) {
                                if (K1() && (this.O0 <= 0 || this.Q != null)) {
                                    i4 = 1;
                                } else {
                                    i4 = 0;
                                }
                                this.x0 = i4;
                                this.I1 = false;
                            }
                        }
                    } else if (this.I1) {
                        if (K1()) {
                            i4 = 0;
                        } else {
                            i4 = 1;
                        }
                        this.x0 = i4;
                        this.I1 = false;
                    }
                    TabLayout tabLayout5 = this.t0;
                    if (tabLayout5 != null) {
                        gVarK = tabLayout5.k(this.x0);
                    } else {
                        gVar = list;
                    }
                    if (gVar != 0) {
                        gVar.b();
                        Object obj8 = gVar.a;
                        if (obj8 instanceof String) {
                            gVar = gVarK;
                            str2 = (String) obj8;
                        } else {
                            gVar = gVarK;
                            str2 = list;
                        }
                        TabLayout.g gVar3 = this.u0;
                        PreMatchEventAdapter preMatchEventAdapter4 = this.A0;
                        if (gVar != gVar3) {
                            if (preMatchEventAdapter4 != null) {
                                preMatchEventAdapter4.setMarkets(str2 != 0 ? map.get(str2) : list, this.x0, str2);
                            }
                        } else if (preMatchEventAdapter4 != null) {
                            preMatchEventAdapter4.setMarkets(str2 != 0 ? map.get(str2) : list, this.x0, str2, this.z1);
                        }
                        aq70 aq70Var = this.B0;
                        if (aq70Var != null && (recyclerView = this.U) != null) {
                            recyclerView.k0(aq70Var);
                        }
                    }
                } else {
                    TabLayout tabLayout6 = this.v0;
                    int selectedTabPosition = tabLayout6 != null ? tabLayout6.getSelectedTabPosition() : 0;
                    TabLayout tabLayout7 = this.v0;
                    if (tabLayout7 != null) {
                        gVarK2 = tabLayout7.k(selectedTabPosition);
                    } else {
                        gVar2 = list;
                    }
                    if (gVar2 != 0) {
                        Object obj9 = gVar2.a;
                        if (obj9 instanceof String) {
                            gVar2 = gVarK2;
                            str3 = (String) obj9;
                        } else {
                            gVar2 = gVarK2;
                            str3 = list;
                        }
                        PreMatchEventAdapter preMatchEventAdapter5 = this.A0;
                        if (preMatchEventAdapter5 != null) {
                            preMatchEventAdapter5.setMarkets(map.get(str), 3, str3);
                        }
                        aq70 aq70Var2 = this.B0;
                        if (aq70Var2 != null && (recyclerView2 = this.U) != null) {
                            recyclerView2.k(aq70Var2);
                        }
                    }
                }
                gVar = gVarK;
                gVar2 = gVarK2;
                PreMatchEventAdapter preMatchEventAdapter6 = this.A0;
                if (preMatchEventAdapter6 != null) {
                    preMatchEventAdapter6.setFavoriteMarketIds(this.Q0);
                }
                PreMatchEventAdapter preMatchEventAdapter7 = this.A0;
                if (preMatchEventAdapter7 != null) {
                    preMatchEventAdapter7.notifyDataSetChanged();
                }
                LoadingView loadingView = this.y0;
                if (loadingView != null) {
                    loadingView.E();
                }
                iu2.q(this);
                iu2.a(this);
                int i21 = this.O1;
                if (i21 == 1) {
                    view = this.Y;
                } else if (i21 == 2) {
                    view = this.c0;
                } else if (i21 == 3) {
                    view = this.e0;
                } else if (i21 != i2) {
                    this.O1 = 0;
                } else {
                    view = this.a0;
                }
                if (view != null && view.getVisibility() == 0) {
                    view.performClick();
                    this.O1 = 0;
                }
            }
            ap0.e().b().G(new fd20(this));
        } else if (i == 1) {
            SwipeRefreshLayout swipeRefreshLayout3 = this.T;
            if (swipeRefreshLayout3 != null) {
                swipeRefreshLayout3.setRefreshing(false);
            }
            h2(true);
        } else if (i == 2) {
            s88 s88Var = this.G0;
            if (s88Var != null) {
                s88Var.m(1);
            }
        } else if ((i == 3 || i == 4) && (swipeRefreshLayout = this.T) != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        if (getIntent().getBooleanExtra("restoreShareBetView", false)) {
            getIntent().removeExtra("restoreShareBetView");
            this.e1 = (ShareBetData) getIntent().getParcelableExtra("key_share_bet_data");
            l2((Uri) getIntent().getParcelableExtra("result_uri"));
            ShareBetData shareBetData = this.e1;
            if (shareBetData != null) {
                this.W0 = new eal().j(shareBetData);
                X1(this.e1);
            }
            String stringExtra = getIntent().getStringExtra("keyResultInput");
            AppCompatEditText appCompatEditText = this.X0;
            if (appCompatEditText != null) {
                appCompatEditText.setText(stringExtra);
            }
            View view5 = this.c0;
            if (view5 != null) {
                onClick(view5);
            }
        }
    }

    public final void O1() {
        this.e1 = null;
        this.W0 = null;
        ImageView imageView = this.Y0;
        if (imageView != null) {
            imageView.setTag(null);
        }
        zy80 zy80Var = this.d1;
        if (zy80Var != null) {
            zy80Var.c();
        }
        View view = this.Z0;
        if (view != null) {
            view.setVisibility(8);
        }
        H1();
    }

    public final void P1(RuntimeException runtimeException) {
        erb erbVar = this.i;
        if (erbVar == null) {
            Intrinsics.n("crashUtils");
            throw null;
        }
        erbVar.a(this);
        wsm wsmVar = this.y;
        if (wsmVar == null) {
            Intrinsics.n("crashlyticsHelper");
            throw null;
        }
        wsmVar.g("Detected Resources.NotFoundException in PreMatchEventActivity", "", runtimeException, null);
        this.K1 = true;
        finish();
    }

    public final void Q1() {
        ImageView imageView = this.s0;
        if (imageView != null) {
            imageView.setImageTintList(th50.a(R.color.brand_quinary, getTheme(), getResources()));
        }
        TabLayout tabLayout = this.t0;
        int i = 0;
        if (tabLayout != null) {
            int scrollX = tabLayout.getScrollX();
            tabLayout.s(this.u0, true);
            tabLayout.scrollTo(scrollX, 0);
        }
        ComposeView composeView = this.t1;
        if (composeView != null) {
            composeView.setVisibility(0);
        }
        if (!this.w1 || this.y1.length() <= 0) {
            ComposeView composeView2 = this.v1;
            if (composeView2 != null) {
                composeView2.setVisibility(8);
            }
        } else {
            ComposeView composeView3 = this.v1;
            if (composeView3 != null) {
                composeView3.setVisibility(0);
            }
        }
        ComposeView composeView4 = this.t1;
        if (composeView4 != null) {
            com.sportybet.plugin.event.e eVar = this.L1;
            String strH1 = eVar != null ? eVar.H1() : null;
            if (strH1 == null) {
                strH1 = "";
            }
            aru.f(composeView4, strH1, false, new cc20(this, i), new Function0() { // from class: ec20
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    PreMatchEventActivity preMatchEventActivity = this.a;
                    ComposeView composeView5 = preMatchEventActivity.u1;
                    if (composeView5 != null) {
                        composeView5.setVisibility(0);
                    }
                    View view = preMatchEventActivity.b1;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    List<Market> list = preMatchEventActivity.M.get("market_search");
                    if (list == null) {
                        list = m2g.a;
                    }
                    ArrayList arrayListH = vpu.h(list, hhy.a());
                    ComposeView composeView6 = preMatchEventActivity.u1;
                    if (composeView6 != null) {
                        jjy.c(composeView6, arrayListH, preMatchEventActivity.z1, new cxj(preMatchEventActivity, 1), new hdf(preMatchEventActivity, 2), false);
                    }
                    return Unit.a;
                }
            }, new Function0() { // from class: fc20
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    RecyclerView recyclerView;
                    int i2 = PreMatchEventActivity.a2;
                    rgy rgyVar = hhy.a().get(0);
                    PreMatchEventActivity preMatchEventActivity = this.a;
                    preMatchEventActivity.z1 = rgyVar;
                    PreMatchEventAdapter preMatchEventAdapter = preMatchEventActivity.A0;
                    if (preMatchEventAdapter != null) {
                        preMatchEventAdapter.setMarkets(preMatchEventActivity.M.get("market_search"), preMatchEventActivity.x0, "market_search", preMatchEventActivity.z1);
                    }
                    aq70 aq70Var = preMatchEventActivity.B0;
                    if (aq70Var != null && (recyclerView = preMatchEventActivity.U) != null) {
                        recyclerView.k0(aq70Var);
                    }
                    PreMatchEventAdapter preMatchEventAdapter2 = preMatchEventActivity.A0;
                    if (preMatchEventAdapter2 != null) {
                        preMatchEventAdapter2.notifyDataSetChanged();
                    }
                    preMatchEventActivity.Q1();
                    return Unit.a;
                }
            }, this.z1, false);
        }
    }

    public final void R1(int i, int i2) {
        PreMatchEventAdapter preMatchEventAdapter;
        if (this.U == null || (preMatchEventAdapter = this.A0) == null || preMatchEventAdapter.getItemCount() == 0) {
            return;
        }
        if ((this.J0 == 0 || I1()) && i >= 0) {
            PreMatchEventAdapter preMatchEventAdapter2 = this.A0;
            if (i >= (preMatchEventAdapter2 != null ? preMatchEventAdapter2.getItemCount() : 0)) {
                return;
            }
            RecyclerView recyclerView = this.U;
            RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null) {
                return;
            }
            int iC1 = linearLayoutManager.c1();
            int iG1 = linearLayoutManager.g1();
            if (iC1 + 1 > i || i >= iG1) {
                if (i2 > 0) {
                    linearLayoutManager.w1(i, i2);
                } else {
                    linearLayoutManager.H0(i);
                }
            }
        }
    }

    public final void S1() {
        RecyclerView recyclerView = this.A1;
        RecyclerView.o layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        int iC1 = linearLayoutManager != null ? linearLayoutManager.c1() : 0;
        IndicatorView indicatorView = this.C1;
        if (indicatorView != null) {
            indicatorView.b(iC1 != -1 ? iC1 : 0);
        }
    }

    public final void T1(PostCommentData postCommentData) {
        of20 of20Var = this.R0;
        if (of20Var != null) {
            ct90<bi50<Void>> ct90VarC = of20Var.y.c(postCommentData);
            qm70 qm70Var = wm70.c;
            ct90<bi50<Void>> ct90VarB = ct90VarC.d(qm70Var).b(qm70Var);
            jf20 jf20Var = new jf20(of20Var);
            ct90VarB.a(jf20Var);
            of20Var.x1(jf20Var);
        }
    }

    public final void U1(n88 n88Var, CommentsData commentsData, boolean z) {
        int iOrdinal = n88Var.ordinal();
        if (iOrdinal == 0) {
            Integer parentId = commentsData.getParentId();
            int iIntValue = parentId != null ? parentId.intValue() : 0;
            if (!z) {
                iIntValue = commentsData.getId();
            }
            g2(iIntValue, commentsData.getUserNickname(), kotlin.text.c.l(commentsData.getUserId(), getAccountHelper().getUserId(), true));
            return;
        }
        if (iOrdinal == 1) {
            yrh0.e(commentsData.getComment());
            return;
        }
        if (iOrdinal != 2) {
            uhc.a();
            return;
        }
        of20 of20Var = this.R0;
        if (of20Var != null) {
            ct90<bi50<Void>> ct90VarB = of20Var.y.b(commentsData.getId()).d(wm70.c).b(va0.a());
            mf20 mf20Var = new mf20(of20Var);
            ct90VarB.a(mf20Var);
            of20Var.x1(mf20Var);
        }
    }

    public final void V1(Event event) {
        o2();
        if (event.hasGift()) {
            LinkedHashSet linkedHashSet = mlk.a;
            String str = event.eventId;
            str.getClass();
            if (mlk.b(str)) {
                f00 f00Var = vgb0.a;
                vgb0.a(AnalyticsEvent.GIFT_GRAB_ICON_SHOWN);
            }
        }
    }

    public final void X1(ShareBetData shareBetData) {
        if (shareBetData != null) {
            View view = this.c1;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.a1;
            int i = 0;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = this.b1;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            View view4 = this.D0;
            int paddingBottom = view4 != null ? view4.getPaddingBottom() : 0;
            View view5 = this.D0;
            if (view5 != null) {
                view5.setPadding(0, 0, 0, paddingBottom);
            }
            View view6 = this.Z0;
            if (view6 != null) {
                view6.setVisibility(0);
            }
            ImageView imageView = this.j1;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            String strA = yk10.a(getCMSString(R.string.comment_details__odds, gky.a(rt5.b(shareBetData.getTotalOdds()))), getCMSString(R.string.app_common__blank_space, new Object[0]));
            TextView textView = this.g1;
            if (textView != null) {
                textView.setText(strA);
            }
            String strA2 = yk10.a(getCMSString(R.string.comment_details__max_bonus, rt5.a(shareBetData)), "%");
            TextView textView2 = this.h1;
            if (textView2 != null) {
                textView2.setText(strA2);
            }
            ImageView imageView2 = this.Y0;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new dc20(this, i));
            }
            boolean zIsAllSettled = shareBetData.isAllSettled();
            TextView textView3 = this.i1;
            if (zIsAllSettled) {
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                TextView textView4 = this.f1;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
            } else {
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                TextView textView5 = this.f1;
                if (textView5 != null) {
                    textView5.setVisibility(0);
                }
                TextView textView6 = this.i1;
                if (textView6 != null) {
                    textView6.setText(shareBetData.getShareCode());
                }
                TextView textView7 = this.i1;
                if (textView7 != null) {
                    textView7.setTextColor(getResources().getColor(R.color.brand_secondary));
                }
                TextView textView8 = this.f1;
                if (textView8 != null) {
                    textView8.setText(getCMSString(R.string.comment_details__bet_booking_code, new Object[0]));
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(shareBetData.getTotalOdds());
            FlexboxLayout flexboxLayout = this.p1;
            if (zIsEmpty) {
                if (flexboxLayout != null) {
                    flexboxLayout.setVisibility(8);
                }
            } else if (flexboxLayout != null) {
                flexboxLayout.setVisibility(0);
            }
        }
    }

    public final void Y1(boolean z) {
        Event event = this.S;
        if (event == null) {
            return;
        }
        SimpleActionBar simpleActionBar = this.q0;
        if (z) {
            if (simpleActionBar != null) {
                simpleActionBar.setTitleWithFadeAnimation(getCMSString(R.string.common_functions__details, new Object[0]));
            }
        } else if (simpleActionBar != null) {
            simpleActionBar.setDoubleTextWithSeparatorTitle(event.homeTeamName, event.awayTeamName, getCMSString(R.string.bet_history__vs, new Object[0]));
        }
    }

    public final void Z1(boolean z) {
        View progressView;
        View viewFindViewById;
        Event event = this.S;
        if (event == null) {
            LoadingView loadingView = this.y0;
            if (loadingView == null || (progressView = loadingView.getProgressView()) == null || (viewFindViewById = progressView.findViewById(R.id.header_part)) == null) {
                return;
            }
            viewFindViewById.setVisibility(0);
            return;
        }
        if (z) {
            final Rect rect = new Rect();
            ConsecutiveScrollerLayout consecutiveScrollerLayout = this.q1;
            if (consecutiveScrollerLayout != null) {
                consecutiveScrollerLayout.setOnVerticalScrollChangeListener(new ConsecutiveScrollerLayout.e() { // from class: ua20
                    @Override // com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout.e
                    public final void a(int i) {
                        PreMatchEventActivity preMatchEventActivity = this.a;
                        ConsecutiveScrollerLayout consecutiveScrollerLayout2 = preMatchEventActivity.q1;
                        Rect rect2 = rect;
                        if (consecutiveScrollerLayout2 != null) {
                            consecutiveScrollerLayout2.getHitRect(rect2);
                        }
                        ComposeView composeView = preMatchEventActivity.m0;
                        boolean z2 = false;
                        if (composeView != null && composeView.getLocalVisibleRect(rect2)) {
                            z2 = true;
                        }
                        preMatchEventActivity.Y1(z2);
                    }
                });
            }
            V1(event);
            ComposeView composeView = this.m0;
            if (composeView == null) {
                return;
            }
            composeView.getViewTreeObserver().addOnGlobalLayoutListener(new f(composeView, this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a2(boolean z) {
        com.sportybet.plugin.event.e eVar;
        ssw sswVar;
        ssw sswVar2;
        com.sportybet.plugin.event.e eVar2 = this.L1;
        Integer num = (eVar2 == null || (sswVar2 = eVar2.r0) == null) ? null : (Integer) sswVar2.d();
        com.sportybet.plugin.event.e eVar3 = this.L1;
        return !K1() && ((((eVar3 == null || (sswVar = eVar3.b0) == null) ? false : Intrinsics.g(sswVar.d(), Boolean.TRUE)) && (eVar = this.L1) != null && !eVar.I1() && this.X != null) || z) && num != null && num.intValue() <= 3;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        editable.getClass();
        if (editable.toString().length() <= 50) {
            TextView textView = this.k1;
            if (textView != null) {
                textView.setText("");
            }
            TextView textView2 = this.k1;
            if (textView2 != null) {
                textView2.setVisibility(8);
                return;
            }
            return;
        }
        String strA = m58.a(editable.toString().length(), "/300");
        TextView textView3 = this.k1;
        if (textView3 != null) {
            textView3.setText(strA);
        }
        TextView textView4 = this.k1;
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
    }

    public final void b2(boolean z) {
        ((br3) mmc.a(hp0.A, br3.class)).U().a(this, z);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void c2() {
        ImageView imageView = this.E0;
        if (imageView != null) {
            imageView.clearAnimation();
        }
        ImageView imageView2 = this.E0;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
    }

    public final void d2(final Function0<Unit> function0) {
        ssw sswVar;
        final com.sportybet.plugin.event.e eVar = this.L1;
        List list = (eVar == null || (sswVar = eVar.X) == null) ? null : (List) sswVar.d();
        if (list == null) {
            list = m2g.a;
        }
        if (list.isEmpty()) {
            function0.invoke();
            return;
        }
        androidx.appcompat.app.b.a title = new androidx.appcompat.app.b.a(this).setTitle(getCMSString(R.string.bet_builder__discard_selections_title, new Object[0]));
        String cMSString = getCMSString(R.string.bet_builder__discard_selections_message, new Object[0]);
        AlertController.b bVar = title.a;
        bVar.f = cMSString;
        bVar.k = false;
        title.b(getCMSString(R.string.common_functions__stay, new Object[0]), null);
        title.c(getCMSString(R.string.common_functions__discard, new Object[0]), new DialogInterface.OnClickListener() { // from class: mc20
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                int i2 = PreMatchEventActivity.a2;
                e eVar2 = eVar;
                if (eVar2 != null) {
                    eVar2.W.m(m2g.a);
                }
                f00 f00Var = vgb0.a;
                vgb0.a(AnalyticsEvent.BET_BUILDER_ABANDONED);
                if (eVar2 != null) {
                    eVar2.O1(new sg2.i(eVar2.E1(), eVar2.D1()));
                }
                function0.invoke();
            }
        });
        final androidx.appcompat.app.b bVarCreate = title.create();
        bVarCreate.getClass();
        bVarCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: nc20
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                int i = PreMatchEventActivity.a2;
                b bVar2 = bVarCreate;
                bVar2.f(-1).setAllCaps(false);
                Button buttonF = bVar2.f(-1);
                PreMatchEventActivity preMatchEventActivity = this;
                buttonF.setTextColor(preMatchEventActivity.getResources().getColor(R.color.brand_quaternary));
                bVar2.f(-2).setAllCaps(false);
                bVar2.f(-2).setTextColor(preMatchEventActivity.getResources().getColor(R.color.brand_quaternary));
            }
        });
        bVarCreate.show();
    }

    @Override // mch.a
    public final boolean e(Selection selection) {
        com.sportybet.plugin.event.e eVar = this.L1;
        return eVar != null && eVar.M1(selection);
    }

    public final void e2() {
        com.sportybet.plugin.event.e eVar = this.L1;
        if (eVar != null) {
            eVar.G0.m(x920.a.b);
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
        x920 x920Var = this.j0;
        if (x920Var == null) {
            x920.a aVar = x920.a.a;
            x920 x920Var2 = new x920();
            Bundle bundle = new Bundle();
            bundle.putString("arg_mode", "MEGA");
            x920Var2.setArguments(bundle);
            this.j0 = x920Var2;
            aVarA.e(R.id.bb_fragment_container, x920Var2, null, 1);
        } else {
            aVarA.s(x920Var);
            aVarA.q(x920Var, s9s.b.e);
        }
        x920 x920Var3 = this.i0;
        if (x920Var3 != null) {
            aVarA.o(x920Var3);
            aVarA.q(x920Var3, s9s.b.d);
        }
        aVarA.d();
        FragmentContainerView fragmentContainerView = this.h0;
        if (fragmentContainerView != null) {
            fragmentContainerView.setVisibility(0);
        }
    }

    public final void f2() {
        com.sportybet.plugin.event.e eVar = this.L1;
        if (eVar != null) {
            eVar.G0.m(x920.a.a);
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
        x920 x920Var = this.i0;
        if (x920Var == null) {
            x920.a aVar = x920.a.a;
            x920 x920Var2 = new x920();
            Bundle bundle = new Bundle();
            bundle.putString("arg_mode", "QUICK_PICKS");
            x920Var2.setArguments(bundle);
            this.i0 = x920Var2;
            aVarA.e(R.id.bb_fragment_container, x920Var2, null, 1);
        } else {
            aVarA.s(x920Var);
            aVarA.q(x920Var, s9s.b.e);
        }
        x920 x920Var3 = this.j0;
        if (x920Var3 != null) {
            aVarA.o(x920Var3);
            aVarA.q(x920Var3, s9s.b.d);
        }
        aVarA.d();
        FragmentContainerView fragmentContainerView = this.h0;
        if (fragmentContainerView != null) {
            fragmentContainerView.setVisibility(0);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void g0(TabLayout.g gVar) {
        gVar.getClass();
    }

    public final void g2(int i, String str, boolean z) {
        TextView textView = this.n1;
        int i2 = 0;
        if (textView != null) {
            textView.setOnClickListener(new tc20(this, i2));
        }
        ConstraintLayout constraintLayout = this.l1;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        TextView textView2 = this.m1;
        if (z) {
            if (textView2 != null) {
                textView2.setText(getCMSString(R.string.comment_details__reply_yourself, new Object[0]));
            }
            AppCompatEditText appCompatEditText = this.X0;
            if (appCompatEditText != null) {
                appCompatEditText.setText("");
            }
        } else {
            if (textView2 != null) {
                textView2.setText(str);
            }
            AppCompatEditText appCompatEditText2 = this.X0;
            if (appCompatEditText2 != null) {
                appCompatEditText2.setText(getCMSString(R.string.comment_reply_hint, str));
            }
            AppCompatEditText appCompatEditText3 = this.X0;
            if (appCompatEditText3 != null) {
                appCompatEditText3.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
            AppCompatEditText appCompatEditText4 = this.X0;
            if (appCompatEditText4 != null) {
                Editable text = appCompatEditText4.getText();
                appCompatEditText4.setSelection(text != null ? text.length() : 0);
            }
        }
        this.o1 = i;
    }

    @Override // mch.a
    public final boolean h(Market market, String str) {
        str.getClass();
        return J1(market, str);
    }

    public final void h2(boolean z) {
        final WebView webView;
        WebView webView2 = this.I0;
        if (webView2 != null) {
            webView2.setVisibility(z ? 0 : 8);
        }
        if (z && !this.M0 && (webView = this.I0) != null) {
            webView.post(new Runnable() { // from class: wb20
                @Override // java.lang.Runnable
                public final void run() {
                    PreMatchEventActivity preMatchEventActivity = this.a;
                    Event event = preMatchEventActivity.S;
                    if (event == null || event.sport == null) {
                        return;
                    }
                    WebView webView3 = webView;
                    String strE = c8i0.e(webView3);
                    lvs lvsVar = preMatchEventActivity.w;
                    if (lvsVar == null) {
                        Intrinsics.n("liveTrackerWidgetUrlBuilder");
                        throw null;
                    }
                    String str = event.eventId;
                    str.getClass();
                    String str2 = event.sport.id;
                    EventSource eventSource = event.eventSource;
                    String languageCode = preMatchEventActivity.getAccountHelper().getLanguageCode();
                    languageCode.getClass();
                    String strB = lvsVar.b(str, str2, eventSource, languageCode, strE, Integer.valueOf(webView3.getMeasuredHeight()), null, dbl.V1);
                    itf0.a aVar = itf0.a;
                    aVar.q(MyLog.TAG_PREMATCH_PAGE);
                    aVar.a("[StatsWebView] loadUrl url=%s", strB);
                    webView3.loadUrl(strB);
                }
            });
        }
        if (z) {
            iym iymVarE1 = E1();
            PageMeta.INSTANCE.getClass();
            iymVarE1.f(AnalyticsEvent.PREMATCH_EVENT_STATS_CLICK, PageMeta.Companion.a());
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void i() throws Throwable {
        SwipeRefreshLayout swipeRefreshLayout = this.T;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(true);
        }
        int i = this.J0;
        if (i == 2) {
            N1(2, false, false, false);
            return;
        }
        if (i == 4) {
            mi20 mi20Var = this.M1;
            if (mi20Var != null) {
                mi20Var.y1(this.S, this.P, true);
                return;
            }
            return;
        }
        com.sportybet.plugin.event.e eVar = this.L1;
        if (eVar != null) {
            eVar.A1(false, true);
        }
        com.sportybet.plugin.event.e eVar2 = this.L1;
        if (eVar2 != null) {
            eVar2.C1();
        }
    }

    public final void i2(boolean z) {
        int i = this.J0;
        View view = this.D0;
        if (i != 2) {
            if (view != null) {
                view.setVisibility(8);
            }
        } else if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public final void j2(List<Market> list) {
        Sport sport;
        k650 k650Var = this.D;
        String str = null;
        if (k650Var == null) {
            Intrinsics.n("remoteConfigRepository");
            throw null;
        }
        if (k650Var.b("sort_prematch_event_markets")) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            lfb0 lfb0VarD = lfb0.d();
            Event event = this.S;
            if (event != null && (sport = event.sport) != null) {
                str = sport.id;
            }
            mfb0 mfb0VarE = lfb0VarD.e(str);
            if (mfb0VarE == null) {
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Market market = list.get(i);
                if (!hashSet.contains(market.id + market.desc)) {
                    if (mfb0VarE.o(market.id) || mfb0VarE.i(market.id)) {
                        hashSet.add(market.id + market.desc);
                        arrayList.add(market);
                        for (int i2 = i + 1; i2 < size; i2++) {
                            Market market2 = list.get(i2);
                            if (TextUtils.equals(market.id, market2.id) && TextUtils.equals(market.desc, market2.desc)) {
                                arrayList.add(market2);
                            }
                        }
                    } else {
                        arrayList.add(market);
                    }
                }
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    @Override // defpackage.wym
    public final boolean k0() {
        return false;
    }

    @Override // defpackage.fe00
    public final void l0(ge00 ge00Var) {
        this.Z1 = ge00Var;
    }

    public final void l2(Uri uri) throws Throwable {
        if (uri == null) {
            return;
        }
        try {
            int i = getResources().getDisplayMetrics().widthPixels;
            Bitmap bitmapI = zch0.i(this, uri, i, true);
            if (bitmapI != null) {
                ImageView imageView = this.Y0;
                if (imageView != null) {
                    imageView.setTag(uri.toString());
                }
                ImageView imageView2 = this.Y0;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                int height = bitmapI.getHeight();
                if (height > i) {
                    height = i;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapI, 0, 0, i, height);
                bitmapCreateBitmap.getClass();
                ImageView imageView3 = this.Y0;
                if (imageView3 != null) {
                    imageView3.setImageBitmap(bitmapCreateBitmap);
                }
            }
        } catch (Exception e2) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_PREMATCH_PAGE);
            aVar.f(e2, "Failed to get ShareImage", new Object[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [gb20] */
    public final void m2() {
        ComposeView composeView = this.s1;
        if (composeView == null) {
            return;
        }
        final com.sportybet.plugin.event.e eVar = this.L1;
        if (!I1() || eVar == null) {
            composeView.setVisibility(8);
            return;
        }
        final List list = (List) eVar.X.d();
        final ArrayList arrayListB = g880.B(list);
        final ?? r4 = new Function1() { // from class: gb20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                e.b bVar;
                BetBuilderData betBuilderData = (BetBuilderData) obj;
                int i = PreMatchEventActivity.a2;
                betBuilderData.getClass();
                PreMatchEventActivity preMatchEventActivity = this.a;
                Event event = preMatchEventActivity.S;
                if (event != null) {
                    Event eventF = apg.f(event);
                    e eVar2 = eVar;
                    Market marketA = qg2.a(betBuilderData, preMatchEventActivity, eVar2.P);
                    Outcome outcomeB = qg2.b(betBuilderData, preMatchEventActivity);
                    List list2 = list;
                    Selection selection = new Selection(eventF, marketA, outcomeB, list2);
                    jrm jrmVar = eVar2.A;
                    if (g880.p(selection, jrmVar.U()) != null) {
                        ku90<a> ku90Var = eVar2.L;
                        StringUiText stringUiText = vch0.a;
                        com.sporty.android.common.uievent.b.i(ku90Var, new ResourceUiText(R.string.component_betslip__selection_already_in_betslip), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                        bVar = e.b.C0418b.a;
                    } else if (jrmVar.e0(selection) || jrmVar.y1(eventF)) {
                        qz3.m(preMatchEventActivity);
                        Unit unit = Unit.a;
                        bVar = e.b.C0418b.a;
                    } else {
                        bVar = eVar2.A.N0(eventF, marketA, outcomeB, true, (14336 & 16) != 0 ? false : false, (14336 & 32) != 0 ? null : list2, (14336 & 64) != 0 ? k980.DEFAULT : null, (14336 & 128) != 0 ? false : false, (14336 & 256) != 0 ? false : false, (14336 & 512) != 0 ? false : false, (14336 & 1024) != 0 ? null : null, (14336 & 2048) != 0 ? false : false, (14336 & 4096) != 0 ? false : false, false) ? e.b.a.a : e.b.C0418b.a;
                    }
                    if (bVar instanceof e.b.a) {
                        eVar2.W.m(m2g.a);
                        f00 f00Var = vgb0.a;
                        vgb0.a(AnalyticsEvent.BET_BUILDER_ADDED_TO_BETSLIP);
                        eVar2.O1(new sg2.a(eVar2.E1(), eVar2.D1()));
                        iym iymVarE1 = preMatchEventActivity.E1();
                        PageMeta.INSTANCE.getClass();
                        iymVarE1.f(AnalyticsEvent.EVENT_DETAIL_ADD_TO_BETSLIP, PageMeta.Companion.a());
                    }
                }
                return Unit.a;
            }
        };
        final t8f t8fVar = new t8f(eVar, 2);
        composeView.setContent(new op8(-1824206263, new Function2() { // from class: ki2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final ArrayList arrayList = arrayListB;
                    final gb20 gb20Var = r4;
                    final t8f t8fVar2 = t8fVar;
                    scv.b(null, null, null, pp8.b(-1976155659, new Function2() { // from class: oi2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                dj2.a(arrayList, gb20Var, t8fVar2, aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 3072, 7);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        composeView.setVisibility(0);
    }

    public final void n2() {
        TextView textView;
        ViewGroup viewGroup;
        com.sportybet.plugin.event.e eVar = this.L1;
        if (eVar == null || (textView = this.a0) == null || (viewGroup = this.e0) == null) {
            return;
        }
        boolean z = textView.getVisibility() == 0 && Intrinsics.g(eVar.v0.d(), Boolean.TRUE);
        TextView textView2 = this.b0;
        if (textView2 != null) {
            textView2.setVisibility(z ? 0 : 8);
        }
        boolean z2 = !z && !K1() && viewGroup.getVisibility() == 0 && Intrinsics.g(eVar.t0.d(), Boolean.TRUE);
        TextView textView3 = this.f0;
        if (textView3 != null) {
            textView3.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // defpackage.wym
    public final boolean o() {
        return false;
    }

    public final void o2() {
        TextView textView;
        ViewGroup viewGroup;
        TextView textView2;
        ViewGroup viewGroup2;
        View view;
        TextView textView3 = this.Z;
        if (textView3 == null || (textView = this.Y) == null || (viewGroup = this.c0) == null || (textView2 = this.a0) == null || (viewGroup2 = this.e0) == null || (view = this.d0) == null) {
            return;
        }
        Event event = this.S;
        boolean z = event != null && event.showStats(false);
        boolean zW = getCountryManager().W();
        TabLayout tabLayout = this.v0;
        boolean z2 = (tabLayout != null ? tabLayout.getTabCount() : 0) > 0;
        boolean zK1 = K1();
        boolean z3 = this.S1;
        boolean z4 = z && !zK1;
        boolean z5 = z2 && !zK1;
        boolean z6 = (zW || zK1) ? false : true;
        int i = z4 ? 2 : 1;
        if (z5) {
            i++;
        }
        if (z6) {
            i++;
        }
        if (z3) {
            i++;
        }
        boolean z7 = i > 1;
        textView3.setVisibility(0);
        textView.setVisibility(z4 ? 0 : 8);
        viewGroup.setVisibility(z6 ? 0 : 8);
        textView2.setVisibility(z3 ? 0 : 8);
        viewGroup2.setVisibility(z5 ? 0 : 8);
        view.setVisibility(z7 ? 0 : 8);
    }

    @Override // defpackage.py1, defpackage.i8
    public final void onAccountChange(Account account) {
        if (account == null || this.J0 != 2) {
            return;
        }
        boolean zR = getCountryManager().r();
        s88 s88Var = this.G0;
        if (!zR) {
            if (s88Var != null) {
                s88Var.m(-1);
            }
        } else if (s88Var != null) {
            s88Var.J = getCountryManager().getCountryCode();
            s88Var.m(-1);
        }
    }

    @Override // androidx.fragment.app.e, defpackage.rn8, android.app.Activity
    @fae
    public final void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        String string;
        super.onActivityResult(i, i2, intent);
        Intent intent2 = getIntent();
        if (i != 1) {
            if (i == 2) {
                this.V0 = false;
                if (i2 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("param_booking_code");
                    String stringExtra2 = intent.getStringExtra("param_code_source");
                    if (stringExtra2 == null) {
                        stringExtra2 = "COMBO_PREMATCH_BET";
                    }
                    M1(stringExtra, stringExtra2);
                }
            }
        } else if (i2 != -1 || intent == null) {
            intent2.removeExtra("key_share_bet_data");
            intent2.removeExtra("result_uri");
            intent2.removeExtra("restoreShareBetView");
        } else {
            Uri uri = (Uri) intent.getParcelableExtra("result_uri");
            l2(uri);
            N1(2, false, false, false);
            ShareBetData shareBetData = (ShareBetData) intent.getParcelableExtra("key_share_bet_data");
            this.e1 = shareBetData;
            if (shareBetData != null) {
                this.W0 = new eal().j(shareBetData);
                X1(this.e1);
                if (intent2.getBooleanExtra(py1.PENDING_RECREATE_ACTIVITY, false)) {
                    intent2.putExtra("restoreShareBetView", true);
                    intent2.putExtra("result_uri", uri);
                    intent2.putExtra("key_share_bet_data", this.e1);
                }
            } else {
                intent2.removeExtra("key_share_bet_data");
                O1();
            }
        }
        if (intent2.getBooleanExtra(py1.PENDING_RECREATE_ACTIVITY, false)) {
            intent2.putExtra("restoreShareBetView", true);
            AppCompatEditText appCompatEditText = this.X0;
            Editable text = appCompatEditText != null ? appCompatEditText.getText() : null;
            if (text == null || (string = text.toString()) == null) {
                string = "";
            }
            intent2.putExtra("keyResultInput", string);
            finish();
            intent2.removeExtra(py1.PENDING_RECREATE_ACTIVITY);
            startActivity(intent2);
        }
    }

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() {
        WebView webView;
        ComposeView composeView = this.u1;
        if (composeView != null && composeView.getVisibility() == 0) {
            A1();
            return true;
        }
        if (this.J0 != 1 || (webView = this.I0) == null || !webView.canGoBack()) {
            d2(new Function0() { // from class: ic20
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i = PreMatchEventActivity.a2;
                    this.a.finish();
                    return Unit.a;
                }
            });
            return true;
        }
        WebView webView2 = this.I0;
        if (webView2 != null) {
            webView2.goBack();
        }
        return true;
    }

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
    @Override // android.view.View.OnClickListener
    public void onClick(View v) throws Throwable {
        s88 s88Var;
        int iIntValue;
        ImageView imageView;
        List<T> list;
        mi20 mi20Var;
        TabLayout.g gVarK;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        v.getClass();
        int id = v.getId();
        HashMap<String, List<Market>> map = this.M;
        Integer numValueOf = null;
        int i = 0;
        if (id == R.id.tab_markets) {
            this.J0 = 0;
            TextView textView = this.Z;
            if (textView != null) {
                textView.setSelected(true);
            }
            TextView textView2 = this.Y;
            if (textView2 != null) {
                textView2.setSelected(false);
            }
            ViewGroup viewGroup = this.c0;
            if (viewGroup != null) {
                viewGroup.setSelected(false);
            }
            TextView textView3 = this.a0;
            if (textView3 != null) {
                textView3.setSelected(false);
            }
            ViewGroup viewGroup2 = this.e0;
            if (viewGroup2 != null) {
                viewGroup2.setSelected(false);
            }
            LoadingView loadingView = this.y0;
            if (loadingView != null) {
                loadingView.E();
            }
            ViewGroup viewGroup3 = this.r0;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(0);
            }
            TabLayout tabLayout = this.v0;
            if (tabLayout != null) {
                tabLayout.setVisibility(8);
            }
            RelativeLayout relativeLayout = this.w0;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(8);
            }
            F1();
            RecyclerView recyclerView3 = this.U;
            if (recyclerView3 != null) {
                recyclerView3.setAdapter(this.A0);
            }
            RecyclerView recyclerView4 = this.U;
            if (recyclerView4 != null) {
                recyclerView4.setPadding(0, 0, 0, 0);
            }
            W1(false);
            TabLayout tabLayout2 = this.t0;
            TabLayout.g gVarK2 = tabLayout2 != null ? tabLayout2.k(tabLayout2.getSelectedTabPosition()) : null;
            if (gVarK2 != null) {
                this.x0 = gVarK2.e;
                Object obj = gVarK2.a;
                String str = obj instanceof String ? (String) obj : null;
                PreMatchEventAdapter preMatchEventAdapter = this.A0;
                if (preMatchEventAdapter != null) {
                    preMatchEventAdapter.setMarkets(str != null ? map.get(str) : null, this.x0, str);
                }
                aq70 aq70Var = this.B0;
                if (aq70Var != null && (recyclerView2 = this.U) != null) {
                    recyclerView2.k0(aq70Var);
                }
            }
            SwipeRefreshLayout swipeRefreshLayout = this.T;
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setEnabled(true);
            }
            i2(false);
            b2(true);
            h2(false);
            s88 s88Var2 = this.G0;
            if (s88Var2 != null) {
                ema emaVar = s88Var2.B;
                if (emaVar.f() > 0) {
                    emaVar.d();
                }
            }
            RecyclerView recyclerView5 = this.U;
            if (recyclerView5 != null) {
                recyclerView5.setVisibility(0);
            }
            c2();
            m2();
            if (L1()) {
                Q1();
            }
            if (!this.w1 || (L1() && this.y1.length() <= 0)) {
                ComposeView composeView = this.v1;
                if (composeView != null) {
                    composeView.setVisibility(8);
                    return;
                }
                return;
            }
            ComposeView composeView2 = this.v1;
            if (composeView2 != null) {
                composeView2.setVisibility(0);
                return;
            }
            return;
        }
        if (id == R.id.tab_stats) {
            this.J0 = 1;
            TextView textView4 = this.Z;
            if (textView4 != null) {
                textView4.setSelected(false);
            }
            TextView textView5 = this.Y;
            if (textView5 != null) {
                textView5.setSelected(true);
            }
            ViewGroup viewGroup4 = this.c0;
            if (viewGroup4 != null) {
                viewGroup4.setSelected(false);
            }
            TextView textView6 = this.a0;
            if (textView6 != null) {
                textView6.setSelected(false);
            }
            ViewGroup viewGroup5 = this.e0;
            if (viewGroup5 != null) {
                viewGroup5.setSelected(false);
            }
            LoadingView loadingView2 = this.y0;
            if (loadingView2 != null) {
                loadingView2.E();
            }
            ViewGroup viewGroup6 = this.r0;
            if (viewGroup6 != null) {
                viewGroup6.setVisibility(8);
            }
            TabLayout tabLayout3 = this.v0;
            if (tabLayout3 != null) {
                tabLayout3.setVisibility(8);
            }
            RelativeLayout relativeLayout2 = this.w0;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(8);
            }
            F1();
            W1(false);
            b2(false);
            h2(true);
            RecyclerView recyclerView6 = this.U;
            if (recyclerView6 != null) {
                recyclerView6.setVisibility(8);
            }
            s88 s88Var3 = this.G0;
            if (s88Var3 != null) {
                ema emaVar2 = s88Var3.B;
                if (emaVar2.f() > 0) {
                    emaVar2.d();
                }
            }
            SwipeRefreshLayout swipeRefreshLayout2 = this.T;
            if (swipeRefreshLayout2 != null) {
                swipeRefreshLayout2.setEnabled(false);
            }
            i2(false);
            c2();
            m2();
            z1();
            ComposeView composeView3 = this.v1;
            if (composeView3 != null) {
                composeView3.setVisibility(8);
                return;
            }
            return;
        }
        if (id == R.id.tab_comments) {
            this.J0 = 2;
            RecyclerView recyclerView7 = this.U;
            if (recyclerView7 != null) {
                recyclerView7.setVisibility(0);
            }
            RecyclerView recyclerView8 = this.U;
            if (recyclerView8 != null) {
                recyclerView8.setPadding(0, 0, 0, zch0.b(getResources(), 46));
            }
            TextView textView7 = this.Z;
            if (textView7 != null) {
                textView7.setSelected(false);
            }
            TextView textView8 = this.Y;
            if (textView8 != null) {
                textView8.setSelected(false);
            }
            ViewGroup viewGroup7 = this.c0;
            if (viewGroup7 != null) {
                viewGroup7.setSelected(true);
            }
            TextView textView9 = this.a0;
            if (textView9 != null) {
                textView9.setSelected(false);
            }
            ViewGroup viewGroup8 = this.e0;
            if (viewGroup8 != null) {
                viewGroup8.setSelected(false);
            }
            LoadingView loadingView3 = this.y0;
            if (loadingView3 != null) {
                loadingView3.E();
            }
            ViewGroup viewGroup9 = this.r0;
            if (viewGroup9 != null) {
                viewGroup9.setVisibility(8);
            }
            TabLayout tabLayout4 = this.v0;
            if (tabLayout4 != null) {
                tabLayout4.setVisibility(8);
            }
            RelativeLayout relativeLayout3 = this.w0;
            if (relativeLayout3 != null) {
                relativeLayout3.setVisibility(8);
            }
            F1();
            W1(false);
            b2(false);
            h2(false);
            s88 s88Var4 = this.G0;
            if (s88Var4 != null) {
                s88Var4.m(0);
                RecyclerView recyclerView9 = this.U;
                if (recyclerView9 != null) {
                    recyclerView9.setAdapter(s88Var4);
                }
            }
            SwipeRefreshLayout swipeRefreshLayout3 = this.T;
            if (swipeRefreshLayout3 != null) {
                swipeRefreshLayout3.setEnabled(true);
            }
            ViewGroup viewGroup10 = this.r0;
            if (viewGroup10 != null) {
                viewGroup10.setVisibility(8);
            }
            ComposeView composeView4 = this.t1;
            if (composeView4 != null) {
                composeView4.setVisibility(8);
            }
            ComposeView composeView5 = this.v1;
            if (composeView5 != null) {
                composeView5.setVisibility(8);
            }
            m2();
            z1();
            oa20 oa20Var = this.S0;
            if (oa20Var != null) {
                oa20Var.x1(v88.g.a, k00.d);
                return;
            }
            return;
        }
        if (id == R.id.tab_bet_builder) {
            com.sportybet.plugin.event.e eVar = this.L1;
            if (eVar != null) {
                eVar.O1(new sg2.d(eVar.E1(), eVar.D1()));
            }
            ViewGroup viewGroup11 = this.e0;
            if (viewGroup11 != null) {
                viewGroup11.setSelected(true);
            }
            TextView textView10 = this.Z;
            if (textView10 != null) {
                textView10.setSelected(false);
            }
            TextView textView11 = this.Y;
            if (textView11 != null) {
                textView11.setSelected(false);
            }
            ViewGroup viewGroup12 = this.c0;
            if (viewGroup12 != null) {
                viewGroup12.setSelected(false);
            }
            TextView textView12 = this.a0;
            if (textView12 != null) {
                textView12.setSelected(false);
            }
            LoadingView loadingView4 = this.y0;
            if (loadingView4 != null) {
                loadingView4.E();
            }
            ViewGroup viewGroup13 = this.r0;
            if (viewGroup13 != null) {
                viewGroup13.setVisibility(8);
            }
            TabLayout tabLayout5 = this.v0;
            if (tabLayout5 != null) {
                tabLayout5.setVisibility(0);
            }
            RelativeLayout relativeLayout4 = this.w0;
            if (relativeLayout4 != null) {
                relativeLayout4.setVisibility(0);
            }
            W1(true);
            TabLayout tabLayout6 = this.v0;
            int selectedTabPosition = tabLayout6 != null ? tabLayout6.getSelectedTabPosition() : 0;
            TabLayout tabLayout7 = this.v0;
            if (tabLayout7 == null || (gVarK = tabLayout7.k(selectedTabPosition)) == null) {
                return;
            }
            Object obj2 = gVarK.a;
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 != null) {
                int iHashCode = str2.hashCode();
                if (iHashCode != -1597175932) {
                    if (iHashCode != -1112684355) {
                        if (iHashCode == 2124665451 && str2.equals("bet_builder_pre_canned")) {
                            this.J0 = 3;
                            this.K0 = 1;
                            RecyclerView recyclerView10 = this.U;
                            if (recyclerView10 != null) {
                                recyclerView10.setVisibility(8);
                            }
                            f2();
                            ComposeView composeView6 = this.k0;
                            if (composeView6 != null) {
                                composeView6.setVisibility(0);
                            }
                            ComposeView composeView7 = this.l0;
                            if (composeView7 != null) {
                                composeView7.setVisibility(0);
                            }
                            com.sportybet.plugin.event.e eVar2 = this.L1;
                            if (eVar2 != null) {
                                eVar2.O1(new sg2.h(eVar2.E1(), eVar2.D1()));
                            }
                        }
                    } else if (str2.equals("bet_builder_build_your_own")) {
                        this.J0 = 3;
                        this.K0 = 0;
                        RecyclerView recyclerView11 = this.U;
                        if (recyclerView11 != null) {
                            recyclerView11.setVisibility(0);
                        }
                        RecyclerView recyclerView12 = this.U;
                        if (recyclerView12 != null) {
                            recyclerView12.setAdapter(this.A0);
                        }
                        RecyclerView recyclerView13 = this.U;
                        if (recyclerView13 != null) {
                            recyclerView13.setPadding(0, 0, 0, 0);
                        }
                        PreMatchEventAdapter preMatchEventAdapter2 = this.A0;
                        if (preMatchEventAdapter2 != null) {
                            preMatchEventAdapter2.setMarkets(map.get("bet_builder"), 3, str2);
                        }
                        aq70 aq70Var2 = this.B0;
                        if (aq70Var2 != null && (recyclerView = this.U) != null) {
                            recyclerView.k(aq70Var2);
                        }
                        F1();
                        ComposeView composeView8 = this.k0;
                        if (composeView8 != null) {
                            composeView8.setVisibility(4);
                        }
                        ComposeView composeView9 = this.l0;
                        if (composeView9 != null) {
                            composeView9.setVisibility(4);
                        }
                        com.sportybet.plugin.event.e eVar3 = this.L1;
                        if (eVar3 != null) {
                            eVar3.O1(new sg2.b(eVar3.E1(), eVar3.D1()));
                        }
                    }
                } else if (str2.equals("bet_builder_mega")) {
                    this.J0 = 3;
                    this.K0 = 2;
                    RecyclerView recyclerView14 = this.U;
                    if (recyclerView14 != null) {
                        recyclerView14.setVisibility(8);
                    }
                    e2();
                    ComposeView composeView10 = this.k0;
                    if (composeView10 != null) {
                        composeView10.setVisibility(8);
                    }
                    ComposeView composeView11 = this.l0;
                    if (composeView11 != null) {
                        composeView11.setVisibility(8);
                    }
                    com.sportybet.plugin.event.e eVar4 = this.L1;
                    if (eVar4 != null) {
                        eVar4.O1(new sg2.q(eVar4.E1(), eVar4.D1()));
                    }
                }
            }
            h2(false);
            i2(false);
            b2(true);
            SwipeRefreshLayout swipeRefreshLayout4 = this.T;
            if (swipeRefreshLayout4 != null) {
                swipeRefreshLayout4.setEnabled(true);
            }
            c2();
            m2();
            z1();
            ComposeView composeView12 = this.v1;
            if (composeView12 != null) {
                composeView12.setVisibility(8);
            }
            G1(true);
            com.sportybet.plugin.event.e eVar5 = this.L1;
            if (eVar5 != null) {
                eVar5.O1(new sg2.e(eVar5.E1(), eVar5.D1()));
            }
            f00 f00Var = vgb0.a;
            vgb0.a(AnalyticsEvent.BET_BUILDER_MENU_TAB_VIEW);
            return;
        }
        if (id != R.id.tab_recommended_codes) {
            if (id == R.id.refresh_btn) {
                Animation animation = this.L0;
                if (animation != null && (imageView = this.E0) != null) {
                    imageView.startAnimation(animation);
                }
                i();
                return;
            }
            if (id != R.id.comment_nav_up_button) {
                if (id == R.id.clear_share_image) {
                    View view = this.Z0;
                    if (view == null || view.getVisibility() != 0) {
                        return;
                    }
                    O1();
                    return;
                }
                if (id == R.id.input_share_btn) {
                    getAccountHelper().demandAccount(this, new htj(this));
                    return;
                } else if (id == R.id.comment_send_btn) {
                    getAccountHelper().demandAccount(this, new zb20(this, new Function0() { // from class: za20
                        /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Editable text;
                            Editable text2;
                            String string;
                            PreMatchEventActivity preMatchEventActivity = this.a;
                            AppCompatEditText appCompatEditText = preMatchEventActivity.X0;
                            String string2 = (appCompatEditText == null || (text2 = appCompatEditText.getText()) == null || (string = text2.toString()) == null) ? null : StringsKt.t0(string).toString();
                            if (string2 == null || string2.length() == 0) {
                                zyf0.c(1, preMatchEventActivity.getCMSString(R.string.common_feedback__please_write_a_comment, new Object[0]));
                            } else {
                                AppCompatEditText appCompatEditText2 = preMatchEventActivity.X0;
                                String string3 = (appCompatEditText2 == null || (text = appCompatEditText2.getText()) == null) ? null : text.toString();
                                if (string3 == null) {
                                    string3 = "";
                                }
                                preMatchEventActivity.J1 = string3;
                                AppCompatEditText appCompatEditText3 = preMatchEventActivity.X0;
                                if (appCompatEditText3 != null) {
                                    appCompatEditText3.setText("");
                                }
                                preMatchEventActivity.H1();
                                View view2 = preMatchEventActivity.Z0;
                                if (view2 != null) {
                                    view2.setVisibility(8);
                                }
                                AppCompatEditText appCompatEditText4 = preMatchEventActivity.X0;
                                if (appCompatEditText4 != null) {
                                    lop.b(appCompatEditText4, null);
                                }
                                zy80 zy80Var = preMatchEventActivity.d1;
                                File fileF = zy80Var != null ? zy80Var.f() : null;
                                if (fileF == null) {
                                    preMatchEventActivity.T1(preMatchEventActivity.B1(preMatchEventActivity.J1));
                                } else {
                                    ImageView imageView2 = preMatchEventActivity.Y0;
                                    if ((imageView2 != null ? imageView2.getTag() : null) != null) {
                                        MultipartBody.Part partCreateFormData = MultipartBody.Part.INSTANCE.createFormData("file", fileF.getName(), RequestBody.INSTANCE.create(MediaType.INSTANCE.parse("image/png"), fileF));
                                        of20 of20Var = preMatchEventActivity.R0;
                                        if (of20Var != null) {
                                            partCreateFormData.getClass();
                                            ct90<bi50<UploadImageResponse>> ct90VarA = of20Var.y.a(partCreateFormData);
                                            qm70 qm70Var = wm70.c;
                                            ct90<bi50<UploadImageResponse>> ct90VarB = ct90VarA.d(qm70Var).b(qm70Var);
                                            nf20 nf20Var = new nf20(of20Var);
                                            ct90VarB.a(nf20Var);
                                            of20Var.x1(nf20Var);
                                        }
                                    } else {
                                        preMatchEventActivity.T1(preMatchEventActivity.B1(preMatchEventActivity.J1));
                                    }
                                }
                            }
                            return Unit.a;
                        }
                    }));
                    return;
                } else {
                    if (id == R.id.market_search_image_view) {
                        Q1();
                        return;
                    }
                    return;
                }
            }
            if (this.U == null || (s88Var = this.G0) == null || s88Var.getItemCount() == 0 || this.J0 != 2) {
                return;
            }
            s88 s88Var5 = this.G0;
            if (s88Var5 != null) {
                ArrayList arrayList = s88Var5.C;
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        i2 = -1;
                        break;
                    }
                    Object obj3 = arrayList.get(i3);
                    i3++;
                    if (((u88) obj3).a() == 6) {
                        break;
                    } else {
                        i2++;
                    }
                }
                numValueOf = Integer.valueOf(i2);
            }
            RecyclerView recyclerView15 = this.U;
            if (recyclerView15 != null) {
                if (numValueOf != null && (iIntValue = numValueOf.intValue()) >= 0) {
                    i = iIntValue;
                }
                recyclerView15.o0(i);
                return;
            }
            return;
        }
        this.J0 = 4;
        TextView textView13 = this.Z;
        if (textView13 != null) {
            textView13.setSelected(false);
        }
        TextView textView14 = this.Y;
        if (textView14 != null) {
            textView14.setSelected(false);
        }
        ViewGroup viewGroup14 = this.c0;
        if (viewGroup14 != null) {
            viewGroup14.setSelected(false);
        }
        TextView textView15 = this.a0;
        if (textView15 != null) {
            textView15.setSelected(true);
        }
        ViewGroup viewGroup15 = this.e0;
        if (viewGroup15 != null) {
            viewGroup15.setSelected(false);
        }
        LoadingView loadingView5 = this.y0;
        if (loadingView5 != null) {
            loadingView5.E();
        }
        ViewGroup viewGroup16 = this.r0;
        if (viewGroup16 != null) {
            viewGroup16.setVisibility(8);
        }
        TabLayout tabLayout8 = this.v0;
        if (tabLayout8 != null) {
            tabLayout8.setVisibility(8);
        }
        RelativeLayout relativeLayout5 = this.w0;
        if (relativeLayout5 != null) {
            relativeLayout5.setVisibility(8);
        }
        F1();
        W1(false);
        b2(true);
        h2(false);
        RecyclerView recyclerView16 = this.U;
        if (recyclerView16 != null) {
            recyclerView16.setVisibility(0);
        }
        RecyclerView recyclerView17 = this.U;
        if (recyclerView17 != null) {
            recyclerView17.setPadding(0, 0, 0, 0);
        }
        RecyclerView recyclerView18 = this.U;
        if (recyclerView18 != null) {
            recyclerView18.setAdapter(this.H0);
        }
        s88 s88Var6 = this.G0;
        if (s88Var6 != null) {
            ema emaVar3 = s88Var6.B;
            if (emaVar3.f() > 0) {
                emaVar3.d();
            }
        }
        SwipeRefreshLayout swipeRefreshLayout5 = this.T;
        if (swipeRefreshLayout5 != null) {
            swipeRefreshLayout5.setEnabled(true);
        }
        i2(false);
        c2();
        m2();
        z1();
        ComposeView composeView13 = this.v1;
        if (composeView13 != null) {
            composeView13.setVisibility(8);
        }
        com.sportybet.plugin.event.e eVar6 = this.L1;
        if (eVar6 != null) {
            ej5.c(o8i0.d(eVar6), null, null, new osg(null, eVar6), 3);
        }
        n2();
        gi20 gi20Var = this.H0;
        if (gi20Var != null && (list = gi20Var.a.f) != 0 && list.isEmpty() && (mi20Var = this.M1) != null) {
            mi20Var.y1(this.S, this.P, false);
        }
        mi20 mi20Var2 = this.M1;
        if (mi20Var2 != null) {
            mi20Var2.D1(rd20.b.a, k00.d, k00.c);
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        CoroutineContext coroutineContext;
        oa20 oa20Var;
        oa20 oa20Var2;
        String str;
        super.onCreate(bundle);
        try {
            setContentView(R.layout.spr_activity_prematch_event);
            int i = 0;
            this.K1 = false;
            Event event = (Event) getIntent().getParcelableExtra("EXTRA_EVENT");
            if (event != null) {
                this.S = event;
                this.P = event.eventId;
            } else {
                this.P = getIntent().getStringExtra("EXTRA_EVENT_ID");
            }
            this.O1 = getIntent().getIntExtra("EXTRA_NAVI_TAB", 0);
            this.P1 = getIntent().getStringExtra("EXTRA_BB_MODE");
            this.Q1 = getIntent().getStringExtra("EXTRA_SHARE_CODE");
            getIntent().removeExtra("EXTRA_SHARE_CODE");
            if (this.O1 == 0) {
                this.Q = getIntent().getStringExtra("EXTRA_MARKET_ID");
                this.R = getIntent().getStringExtra("EXTRA_MARKET_SPECIFIER");
            }
            String str2 = this.P;
            if (str2 == null || str2.length() == 0) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_COMMON);
                aVar.d("no eventId was found", new Object[0]);
                finish();
                return;
            }
            int i2 = 1;
            setRequireBetslipBtnLater(true);
            this.L0 = AnimationUtils.loadAnimation(this, R.anim.spr_anim_rotate_loading);
            getAccountHelper().addAccountChangeListener(this);
            this.d0 = findViewById(R.id.tab_container);
            SimpleActionBar simpleActionBar = (SimpleActionBar) findViewById(R.id.action_bar_container);
            simpleActionBar.setTitle(getCMSString(R.string.common_functions__details, new Object[0]));
            simpleActionBar.setBackButton(new View.OnClickListener() { // from class: ib20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = PreMatchEventActivity.a2;
                    this.a.getOnBackPressedDispatcher().d();
                }
            });
            simpleActionBar.setSearchActionButton(new nuj(this, i2));
            simpleActionBar.setHomeButton(new View.OnClickListener() { // from class: jb20
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = PreMatchEventActivity.a2;
                    this.a.d2(new ac20());
                }
            });
            this.q0 = simpleActionBar;
            str<String> strVar = this.v;
            if (strVar == null) {
                Intrinsics.n("liveTrackerUrl");
                throw null;
            }
            String str3 = strVar.get();
            str3.getClass();
            String languageCode = getAccountHelper().getLanguageCode();
            languageCode.getClass();
            h0j0.c(str3, "locale", languageCode);
            WebView webView = (WebView) findViewById(R.id.web_view);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setDomStorageEnabled(true);
            getWebViewWrapperService().uninstallJsBridge(webView);
            this.I0 = webView;
            getWebViewWrapperService().installJsBridge(this, this.I0, new nd20(this), new WebChromeClient());
            LoadingView loadingView = (LoadingView) findViewById(R.id.loading_view);
            loadingView.getErrorView().getTitle().setTextSize(14.0f);
            loadingView.L(null);
            loadingView.setOnClickListener(new kb20(this, i));
            this.y0 = loadingView;
            this.q1 = (ConsecutiveScrollerLayout) findViewById(R.id.nestedscrollview);
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.event_recycler);
            recyclerView.setItemAnimator(null);
            this.U = recyclerView;
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe);
            swipeRefreshLayout.setOnRefreshListener(this);
            this.T = swipeRefreshLayout;
            LoadingView loadingView2 = (LoadingView) findViewById(R.id.content_loading_view);
            loadingView2.L(null);
            loadingView2.setOnClickListener(new qc20(this, i));
            this.z0 = loadingView2;
            TextView textView = (TextView) findViewById(R.id.tab_stats);
            textView.setOnClickListener(this);
            this.Y = textView;
            TextView textView2 = (TextView) findViewById(R.id.tab_markets);
            textView2.setOnClickListener(this);
            textView2.setSelected(true);
            this.Z = textView2;
            TextView textView3 = (TextView) findViewById(R.id.tab_recommended_codes);
            textView3.setOnClickListener(this);
            textView3.setVisibility(8);
            this.a0 = textView3;
            TextView textView4 = (TextView) findViewById(R.id.recommended_codes_tab_new_badge);
            textView4.setVisibility(8);
            this.b0 = textView4;
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.tab_comments);
            viewGroup.setOnClickListener(this);
            this.c0 = viewGroup;
            this.v0 = (TabLayout) findViewById(R.id.bet_builder_tabs);
            this.w0 = (RelativeLayout) findViewById(R.id.bet_builder_tabs_container);
            ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.tab_bet_builder);
            y8j fullStoryCommonManager = getFullStoryCommonManager();
            viewGroup2.getClass();
            fullStoryCommonManager.c(viewGroup2, AnalyticsParam.BET_BUILDER_MENU_TAB);
            viewGroup2.setOnClickListener(this);
            viewGroup2.setSelected(false);
            this.e0 = viewGroup2;
            this.f0 = (TextView) findViewById(R.id.bet_builder_tab_new_badge);
            this.g0 = (BubbleView) findViewById(R.id.bet_builder_tab_tooltip);
            this.h0 = (FragmentContainerView) findViewById(R.id.bb_fragment_container);
            ComposeView composeView = (ComposeView) findViewById(R.id.bet_builder_filter_compose_view);
            u6i0.b bVar = u6i0.b.a;
            composeView.setViewCompositionStrategy(bVar);
            this.k0 = composeView;
            ComposeView composeView2 = (ComposeView) findViewById(R.id.bet_builder_sort_compose_view);
            composeView2.setViewCompositionStrategy(bVar);
            this.l0 = composeView2;
            ComposeView composeView3 = (ComposeView) findViewById(R.id.event_details_header);
            u6i0.a aVar2 = u6i0.a.a;
            composeView3.setViewCompositionStrategy(aVar2);
            this.m0 = composeView3;
            final ComposeView composeView4 = (ComposeView) findViewById(R.id.fifa_world_cup_banner);
            composeView4.setViewCompositionStrategy(bVar);
            this.o0 = composeView4;
            y1k0 y1k0Var = this.e;
            if (y1k0Var == null) {
                Intrinsics.n("worldCupPassBannerStateProvider");
                throw null;
            }
            azj0.b(composeView4, y1k0Var, czj0.Compact, new jwj(this, i2), new qst(this, i2), new Function0() { // from class: oc20
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i3 = PreMatchEventActivity.a2;
                    if (composeView4.getVisibility() == 0) {
                        PreMatchEventActivity preMatchEventActivity = this;
                        if (!preMatchEventActivity.p0) {
                            rdd0 rdd0Var = preMatchEventActivity.c;
                            if (rdd0Var == null) {
                                Intrinsics.n("sportyTrackingUseCase");
                                throw null;
                            }
                            rdd0Var.a(s2k0.z.a, k00.d);
                            preMatchEventActivity.p0 = true;
                        }
                    }
                    return Unit.a;
                }
            }, false);
            composeView4.setVisibility(8);
            ComposeView composeView5 = (ComposeView) findViewById(R.id.events_side_menu);
            composeView5.setViewCompositionStrategy(aVar2);
            this.n0 = composeView5;
            this.r0 = (ViewGroup) findViewById(R.id.market_tab_container);
            this.t0 = (TabLayout) findViewById(R.id.market_tabs);
            this.D0 = findViewById(R.id.refresh_container);
            ImageView imageView = (ImageView) findViewById(R.id.refresh_btn);
            imageView.setOnClickListener(this);
            this.E0 = imageView;
            ImageView imageView2 = (ImageView) findViewById(R.id.comment_nav_up_button);
            imageView2.setOnClickListener(this);
            this.F0 = imageView2;
            ((ImageView) findViewById(R.id.comment_send_btn)).setOnClickListener(this);
            final AppCompatEditText appCompatEditText = (AppCompatEditText) findViewById(R.id.edtInput);
            appCompatEditText.setCompoundDrawablesWithIntrinsicBounds(gr0.a(getBaseContext(), R.drawable.ic_edit), (Drawable) null, (Drawable) null, (Drawable) null);
            appCompatEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(300)});
            appCompatEditText.addTextChangedListener(this);
            appCompatEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: lb20
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    int i3 = PreMatchEventActivity.a2;
                    if (z) {
                        appCompatEditText.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    }
                }
            });
            this.X0 = appCompatEditText;
            this.Y0 = (ImageView) findViewById(R.id.share_img);
            this.Z0 = findViewById(R.id.spr_image_container);
            this.a1 = findViewById(R.id.overlay_top);
            View viewFindViewById = findViewById(R.id.overlay_bottom);
            viewFindViewById.setOnClickListener(new mb20(this, i));
            this.b1 = viewFindViewById;
            this.c1 = findViewById(R.id.top_line);
            this.f1 = (TextView) findViewById(R.id.share_result);
            this.i1 = (TextView) findViewById(R.id.result_booking_code);
            this.g1 = (TextView) findViewById(R.id.odds);
            this.h1 = (TextView) findViewById(R.id.bonus);
            ImageView imageView3 = (ImageView) findViewById(R.id.clear_share_image);
            imageView3.setOnClickListener(this);
            this.j1 = imageView3;
            this.k1 = (TextView) findViewById(R.id.input_count);
            this.l1 = (ConstraintLayout) findViewById(R.id.reply_at_name_container);
            this.m1 = (TextView) findViewById(R.id.reply_at_name);
            this.n1 = (TextView) findViewById(R.id.cancel_reply_at_name);
            this.p1 = (FlexboxLayout) findViewById(R.id.odds_bonus_container);
            findViewById(R.id.input_share_btn).setOnClickListener(this);
            this.P0 = (FloatLoadingView) findViewById(R.id.float_loading);
            DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawerLayout.setDrawerLockMode(1);
            this.r1 = drawerLayout;
            ComposeView composeView6 = (ComposeView) findViewById(R.id.bet_builder_view);
            composeView6.setViewCompositionStrategy(bVar);
            this.s1 = composeView6;
            ImageView imageView4 = (ImageView) findViewById(R.id.market_search_image_view);
            imageView4.setOnClickListener(this);
            this.s0 = imageView4;
            ComposeView composeView7 = (ComposeView) findViewById(R.id.market_search_view);
            composeView7.setViewCompositionStrategy(bVar);
            this.t1 = composeView7;
            ComposeView composeView8 = (ComposeView) findViewById(R.id.odds_filter_view);
            composeView8.setViewCompositionStrategy(bVar);
            this.u1 = composeView8;
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.featured_bb_container);
            this.B1 = linearLayout;
            RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.featured_bb_recycler);
            recyclerView2.setLayoutManager(new LinearLayoutManager(0, false));
            recyclerView2.setHasFixedSize(false);
            this.A1 = recyclerView2;
            new d0().a(recyclerView2);
            mch mchVar = new mch(this, getFullStoryCommonManager());
            this.D1 = mchVar;
            recyclerView2.setAdapter(mchVar);
            IndicatorView indicatorView = new IndicatorView(this);
            this.C1 = indicatorView;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 16;
            indicatorView.setLayoutParams(layoutParams);
            indicatorView.setOrientation(0);
            indicatorView.setGravity(17);
            linearLayout.addView(indicatorView);
            recyclerView2.k(new ld20(this));
            ComposeView composeView9 = (ComposeView) findViewById(R.id.joker_toggle_view);
            composeView9.setViewCompositionStrategy(bVar);
            this.v1 = composeView9;
            o2();
            if (!this.T1) {
                fdt.a(this).b(this.U1, new IntentFilter("com.sportybet.action.JS_EVENT"));
                this.T1 = true;
            }
            Z1(true);
            if (this.H0 == null) {
                this.H0 = new gi20(new md20(this));
                RecyclerView recyclerView3 = this.U;
                c cVar = this.E1;
                if (recyclerView3 != null) {
                    recyclerView3.k0(cVar);
                }
                RecyclerView recyclerView4 = this.U;
                if (recyclerView4 != null) {
                    recyclerView4.k(cVar);
                }
            }
            v8i0 viewModelStore = getViewModelStore();
            r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
            cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
            viewModelStore.getClass();
            defaultViewModelProviderFactory.getClass();
            defaultViewModelCreationExtras.getClass();
            s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
            dq7 dq7VarA = jq40.a(bsy.class);
            String strI = dq7VarA.i();
            if (strI == null) {
                hb5.a("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.N1 = (bsy) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
            v8i0 viewModelStore2 = getViewModelStore();
            r8i0.c defaultViewModelProviderFactory2 = getDefaultViewModelProviderFactory();
            cyb defaultViewModelCreationExtras2 = getDefaultViewModelCreationExtras();
            viewModelStore2.getClass();
            defaultViewModelProviderFactory2.getClass();
            defaultViewModelCreationExtras2.getClass();
            s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, defaultViewModelCreationExtras2);
            dq7 dq7VarA2 = jq40.a(oa20.class);
            String strI2 = dq7VarA2.i();
            if (strI2 == null) {
                hb5.a("Local and anonymous classes can not be ViewModels");
                return;
            }
            this.S0 = (oa20) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
            v8i0 viewModelStore3 = getViewModelStore();
            r8i0.c defaultViewModelProviderFactory3 = getDefaultViewModelProviderFactory();
            cyb defaultViewModelCreationExtras3 = getDefaultViewModelCreationExtras();
            viewModelStore3.getClass();
            defaultViewModelProviderFactory3.getClass();
            defaultViewModelCreationExtras3.getClass();
            s8i0 s8i0Var3 = new s8i0(viewModelStore3, defaultViewModelProviderFactory3, defaultViewModelCreationExtras3);
            dq7 dq7VarA3 = jq40.a(of20.class);
            String strI3 = dq7VarA3.i();
            if (strI3 == null) {
                hb5.a("Local and anonymous classes can not be ViewModels");
                return;
            }
            of20 of20Var = (of20) s8i0Var3.a(dq7VarA3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI3));
            this.R0 = of20Var;
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
            this.U0 = rvuVar;
            v8i0 viewModelStore5 = getViewModelStore();
            r8i0.c defaultViewModelProviderFactory5 = getDefaultViewModelProviderFactory();
            cyb defaultViewModelCreationExtras5 = getDefaultViewModelCreationExtras();
            viewModelStore5.getClass();
            defaultViewModelProviderFactory5.getClass();
            defaultViewModelCreationExtras5.getClass();
            s8i0 s8i0Var5 = new s8i0(viewModelStore5, defaultViewModelProviderFactory5, defaultViewModelCreationExtras5);
            dq7 dq7VarA5 = jq40.a(mi20.class);
            String strI5 = dq7VarA5.i();
            if (strI5 == null) {
                hb5.a("Local and anonymous classes can not be ViewModels");
                return;
            }
            mi20 mi20Var = (mi20) s8i0Var5.a(dq7VarA5, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI5));
            this.M1 = mi20Var;
            i2i.c(mi20Var.A, null, 3).f(this, new e(new ab1(i2, this, mi20Var)));
            ej5.c(ebs.a(getLifecycle()), null, null, new od20(null, mi20Var, this), 3);
            mi20Var.y1(this.S, this.P, false);
            of20Var.F.f(this, new e(new Function1() { // from class: bb20
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    oi40 oi40Var = (oi40) obj;
                    s88 s88Var = this.a.G0;
                    if (s88Var == null) {
                        return Unit.a;
                    }
                    if (oi40Var == null) {
                        return Unit.a;
                    }
                    s88Var.E = oi40Var;
                    s88Var.p(true);
                    return Unit.a;
                }
            }));
            of20Var.H.f(this, new e(new cb20(this, i)));
            of20Var.J.f(this, new e(new r8p(this, i2)));
            of20Var.L.f(this, new e(new Function1() { // from class: db20
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    soi0 soi0Var = (soi0) obj;
                    s88 s88Var = this.a.G0;
                    if (s88Var == null) {
                        return Unit.a;
                    }
                    if (soi0Var == null) {
                        s88Var.p(false);
                        return Unit.a;
                    }
                    if (!soi0Var.c.isEmpty()) {
                        s88Var.q(soi0Var, false);
                    }
                    s88Var.p(true);
                    return Unit.a;
                }
            }));
            of20Var.N.f(this, new e(new eb20(this, i)));
            of20Var.R.f(this, new e(new rc1(this, i2)));
            of20Var.P.f(this, new e(new fb20(this, i)));
            of20Var.T.f(this, new e(new hb20(this, i)));
            of20Var.V.f(this, new e(new duj(this, i2)));
            of20Var.X.f(this, new e(new va20(this, i)));
            of20Var.Z.f(this, new e(new db1(this, i2)));
            ssw sswVar = of20Var.b0;
            sswVar.getClass();
            r5b r5bVar = rvuVar.E;
            r5bVar.getClass();
            r5b r5bVar2 = rvuVar.A;
            r5bVar2.getClass();
            fks.a(sswVar, r5bVar, r5bVar2, new gaj() { // from class: wa20
                /* JADX WARN: Type inference failed for: r12v0, types: [lc20] */
                /* JADX WARN: Type inference failed for: r9v0, types: [jc20] */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    final EventDetailHeaderUiModel eventDetailHeaderUiModel = (EventDetailHeaderUiModel) obj;
                    final tzs tzsVar = (tzs) obj2;
                    final boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                    int i3 = PreMatchEventActivity.a2;
                    eventDetailHeaderUiModel.getClass();
                    tzsVar.getClass();
                    final PreMatchEventActivity preMatchEventActivity = this.a;
                    ComposeView composeView10 = preMatchEventActivity.m0;
                    if (composeView10 != null) {
                        int i4 = 1;
                        final taf tafVar = new taf(preMatchEventActivity, i4);
                        final uaf uafVar = new uaf(preMatchEventActivity, i4);
                        int i5 = 2;
                        final vaf vafVar = new vaf(preMatchEventActivity, i5);
                        final awj awjVar = new awj(preMatchEventActivity, i4);
                        final mr6 mr6Var = new mr6(preMatchEventActivity, i5);
                        final ?? r9 = new Function0() { // from class: jc20
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Event event2;
                                of20 of20Var2 = preMatchEventActivity.R0;
                                if (of20Var2 != null && (event2 = of20Var2.l0) != null) {
                                    of20Var2.e0.m(new NavigationUiEvent.PreMatchNavigation(event2, EventDetailsNavigation.PREVIOUS));
                                }
                                return Unit.a;
                            }
                        };
                        final kc20 kc20Var = new kc20(preMatchEventActivity);
                        final qr6 qr6Var = new qr6(preMatchEventActivity, i4);
                        final ?? r12 = new Function2() { // from class: lc20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Sport sport;
                                String str4 = (String) obj4;
                                String str5 = (String) obj5;
                                int i6 = PreMatchEventActivity.a2;
                                str4.getClass();
                                str5.getClass();
                                PreMatchEventActivity preMatchEventActivity2 = preMatchEventActivity;
                                Event event2 = preMatchEventActivity2.S;
                                if (event2 != null && (sport = event2.sport) != null) {
                                    b6d b6dVar = preMatchEventActivity2.b;
                                    if (b6dVar == null) {
                                        Intrinsics.n("dedicatedTeamPageLauncher");
                                        throw null;
                                    }
                                    b6dVar.a(preMatchEventActivity2, str4, str5, sport.id, AnalyticsParam.EVENT_SOURCE_EVENT_DETAILS);
                                }
                                return Unit.a;
                            }
                        };
                        composeView10.setContent(new op8(-1529285780, new Function2() { // from class: qng
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj4;
                                int iIntValue = ((Integer) obj5).intValue();
                                if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    final EventDetailHeaderUiModel eventDetailHeaderUiModel2 = eventDetailHeaderUiModel;
                                    final tzs tzsVar2 = tzsVar;
                                    final boolean z = zBooleanValue;
                                    final taf tafVar2 = tafVar;
                                    final uaf uafVar2 = uafVar;
                                    final vaf vafVar2 = vafVar;
                                    final awj awjVar2 = awjVar;
                                    final mr6 mr6Var2 = mr6Var;
                                    final jc20 jc20Var = r9;
                                    final kc20 kc20Var2 = kc20Var;
                                    final qr6 qr6Var2 = qr6Var;
                                    final lc20 lc20Var = r12;
                                    scv.b(null, null, null, pp8.b(354145304, new Function2() { // from class: rng
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj6, Object obj7) {
                                            androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj6;
                                            int iIntValue2 = ((Integer) obj7).intValue();
                                            if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                xng.a(null, eventDetailHeaderUiModel2, tzsVar2, z, tafVar2, uafVar2, vafVar2, awjVar2, mr6Var2, jc20Var, kc20Var2, qr6Var2, lc20Var, aVar4, 0);
                                            } else {
                                                aVar4.G();
                                            }
                                            return Unit.a;
                                        }
                                    }, aVar3), aVar3, 3072, 7);
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, true));
                    }
                    return Unit.a;
                }
            }).f(this, new e(new xa20()));
            of20Var.d0.f(this, new e(new ya20(this, i)));
            int i3 = 2;
            of20Var.f0.f(this, new e(new ptj(this, i3)));
            rvuVar.i.f(this, new e(new rtj(this, i3)));
            rvuVar.w.f(this, new e(new Function1() { // from class: ab20
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i4 = PreMatchEventActivity.a2;
                    if (((qvu) obj) instanceof qvu.a) {
                        PreMatchEventActivity preMatchEventActivity = this.a;
                        Intent intent = new Intent(preMatchEventActivity, (Class<?>) SettingsActivity.class);
                        intent.putExtra("destination_in_settings", "notification_settings_match_alert_route");
                        preMatchEventActivity.startActivity(intent);
                    }
                    return Unit.a;
                }
            }));
            of20Var.j0.f(this, new e(new ttj(this, i2)));
            Event event2 = this.S;
            if (event2 != null) {
                of20Var.a0.m(of20Var.f.a(event2, (event2.homeTeamIcon == null && event2.awayTeamIcon == null) ? false : true, false, false, false, false, false));
            }
            if (this.G0 != null || (str = this.P) == null) {
                coroutineContext = null;
            } else {
                CountryCodeName countryCodeName = getCountryManager().O() ? CountryCodeName.SOUTH_AFRICA : null;
                pc20 pc20Var = new pc20(this);
                nh4 nh4VarC = nh4.c();
                nh4VarC.getClass();
                lrm lrmVar = this.F;
                if (lrmVar == null) {
                    Intrinsics.n("betStore");
                    throw null;
                }
                psm countryManager = getCountryManager();
                y8j fullStoryCommonManager2 = getFullStoryCommonManager();
                hd20 hd20Var = new hd20(this);
                id20 id20Var = new id20(this);
                coroutineContext = null;
                jd20 jd20Var = new jd20(this);
                kd20 kd20Var = new kd20(this);
                nzm nzmVar = this.G;
                if (nzmVar == null) {
                    Intrinsics.n("stakeConfigAgent");
                    throw null;
                }
                s88 s88Var = new s88(pc20Var, str, countryCodeName, nh4VarC, lrmVar, countryManager, fullStoryCommonManager2, hd20Var, id20Var, jd20Var, kd20Var, nzmVar);
                s88Var.setHasStableIds(false);
                s88Var.L = this;
                this.G0 = s88Var;
            }
            Intent intent = getIntent();
            lgb0[] lgb0VarArr = lgb0.a;
            int intExtra = intent.getIntExtra("EXTRA_AI_SOURCE", 0);
            v8i0 viewModelStore6 = getViewModelStore();
            r8i0.c defaultViewModelProviderFactory6 = getDefaultViewModelProviderFactory();
            cyb defaultViewModelCreationExtras6 = getDefaultViewModelCreationExtras();
            viewModelStore6.getClass();
            defaultViewModelProviderFactory6.getClass();
            defaultViewModelCreationExtras6.getClass();
            s8i0 s8i0Var6 = new s8i0(viewModelStore6, defaultViewModelProviderFactory6, defaultViewModelCreationExtras6);
            dq7 dq7VarA6 = jq40.a(com.sportybet.plugin.event.e.class);
            String strI6 = dq7VarA6.i();
            if (strI6 == null) {
                hb5.a("Local and anonymous classes can not be ViewModels");
                return;
            }
            final com.sportybet.plugin.event.e eVar = (com.sportybet.plugin.event.e) s8i0Var6.a(dq7VarA6, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI6));
            this.L1 = eVar;
            String str4 = this.P;
            if (str4 == null) {
                str4 = "";
            }
            eVar.P1(3, str4, this.S, intExtra, ServerProductStatus.Product.PRE_MATCH_EVENTS, false);
            eVar.e0.f(this, new e(new nn6(this, eVar, i2)));
            eVar.K.f(this, new e(new on6(this, i2)));
            eVar.X.f(this, new e(new nb20(this, i)));
            eVar.B0.f(this, new e(new Function1() { // from class: ob20
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    alg algVar = (alg) obj;
                    int i4 = PreMatchEventActivity.a2;
                    Event event3 = algVar.a;
                    List<Market> list = algVar.b;
                    if (!list.isEmpty() && event3 != null) {
                        PreMatchEventActivity preMatchEventActivity = this.a;
                        mch mchVar2 = preMatchEventActivity.D1;
                        if (mchVar2 != null) {
                            ArrayList<Market> arrayList = mchVar2.c;
                            if (!Intrinsics.g(arrayList, list)) {
                                arrayList.clear();
                                arrayList.addAll(list);
                                mchVar2.d = event3;
                                mchVar2.notifyDataSetChanged();
                            }
                        }
                        IndicatorView indicatorView2 = preMatchEventActivity.C1;
                        if (indicatorView2 != null) {
                            indicatorView2.removeAllViews();
                        }
                        IndicatorView indicatorView3 = preMatchEventActivity.C1;
                        if (indicatorView3 != null) {
                            indicatorView3.a(list.size(), true);
                        }
                        IndicatorView indicatorView4 = preMatchEventActivity.C1;
                        if (indicatorView4 != null) {
                            indicatorView4.setGreyVersion(true);
                        }
                        IndicatorView indicatorView5 = preMatchEventActivity.C1;
                        if (indicatorView5 != null) {
                            preMatchEventActivity.getFullStoryCommonManager().c(indicatorView5, AnalyticsParam.FEATURED_BB_INDICATOR);
                        }
                        preMatchEventActivity.S1();
                        ViewGroup viewGroup3 = preMatchEventActivity.e0;
                        preMatchEventActivity.W1(viewGroup3 != null && viewGroup3.isSelected());
                    }
                    return Unit.a;
                }
            }));
            eVar.M.f(this, new e(new sn6(this, 2)));
            eVar.o0.f(this, new e(new Function1() { // from class: pb20
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    final m1g0 m1g0Var = (m1g0) obj;
                    int i4 = PreMatchEventActivity.a2;
                    if (m1g0Var != null) {
                        List<l1g0> list = m1g0Var.b;
                        if (!list.isEmpty()) {
                            PreMatchEventActivity preMatchEventActivity = this.a;
                            ComposeView composeView10 = preMatchEventActivity.k0;
                            final e eVar2 = eVar;
                            int i5 = 1;
                            if (composeView10 != null) {
                                ArrayList arrayList = new ArrayList(l48.r(list, 10));
                                for (l1g0 l1g0Var : list) {
                                    l1g0Var.getClass();
                                    arrayList.add(new ugy(l1g0Var.a, l1g0Var.b, l1g0Var.c));
                                }
                                l1g0 l1g0Var2 = m1g0Var.a;
                                composeView10.setContent(new op8(1334285937, new fwt(arrayList, l1g0Var2 != null ? new ugy(l1g0Var2.a, l1g0Var2.b, l1g0Var2.c) : null, new Function1() { // from class: rc20
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        Object next;
                                        Object value;
                                        ugy ugyVar = (ugy) obj2;
                                        int i6 = PreMatchEventActivity.a2;
                                        ugyVar.getClass();
                                        List<l1g0> list2 = m1g0Var.b;
                                        list2.getClass();
                                        Iterator<T> it = list2.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it.next();
                                            l1g0 l1g0Var3 = (l1g0) next;
                                            if (Intrinsics.g(l1g0Var3.a, ugyVar.a) && Intrinsics.g(l1g0Var3.b, ugyVar.b)) {
                                                break;
                                            }
                                        }
                                        l1g0 l1g0Var4 = (l1g0) next;
                                        wwd0 wwd0Var = eVar2.n0;
                                        do {
                                            value = wwd0Var.getValue();
                                        } while (!wwd0Var.g(value, m1g0.a((m1g0) value, l1g0Var4, null, 6)));
                                        return Unit.a;
                                    }
                                }, i5), true));
                            }
                            ComposeView composeView11 = preMatchEventActivity.l0;
                            if (composeView11 != null) {
                                final boolean z = m1g0Var.c == epa0.a;
                                final qwj qwjVar = new qwj(eVar2, i5);
                                composeView11.setContent(new op8(1051708512, new Function2() { // from class: zoa0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj2, Object obj3) {
                                        androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                                        int iIntValue = ((Integer) obj3).intValue();
                                        if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            final boolean z2 = z;
                                            final qwj qwjVar2 = qwjVar;
                                            scv.b(null, null, null, pp8.b(-1319731188, new Function2() { // from class: apa0
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj4, Object obj5) {
                                                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj4;
                                                    int iIntValue2 = ((Integer) obj5).intValue();
                                                    if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                        dpa0.a(null, z2, qwjVar2, aVar4, 0);
                                                    } else {
                                                        aVar4.G();
                                                    }
                                                    return Unit.a;
                                                }
                                            }, aVar3), aVar3, 3072, 7);
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, true));
                            }
                        }
                    }
                    return Unit.a;
                }
            }));
            int i4 = 2;
            eVar.t0.f(this, new e(new jf1(this, i4)));
            eVar.v0.f(this, new e(new kf1(this, i4)));
            i2i.c(eVar.J0, coroutineContext, 3).f(this, new e(new Function1() { // from class: qb20
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    PreMatchEventAdapter preMatchEventAdapter;
                    int i5 = PreMatchEventActivity.a2;
                    if (((Boolean) obj).booleanValue()) {
                        PreMatchEventActivity preMatchEventActivity = this.a;
                        int i6 = 1;
                        preMatchEventActivity.w1 = true;
                        e eVar2 = eVar;
                        boolean z = eVar2.K0;
                        preMatchEventActivity.x1 = z;
                        if (z && (preMatchEventAdapter = preMatchEventActivity.A0) != null) {
                            preMatchEventAdapter.showJokerOutcomes(Boolean.TRUE, Boolean.FALSE);
                        }
                        ComposeView composeView10 = preMatchEventActivity.v1;
                        if (composeView10 != null) {
                            composeView10.setVisibility(0);
                        }
                        ComposeView composeView11 = preMatchEventActivity.v1;
                        if (composeView11 != null) {
                            final boolean z2 = preMatchEventActivity.x1;
                            final boolean z3 = eVar2.L0;
                            final mq6 mq6Var = new mq6(i6, eVar2, preMatchEventActivity);
                            composeView11.setContent(new op8(-858205697, new Function2() { // from class: cap
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        final boolean z4 = z3;
                                        final boolean z5 = z2;
                                        final mq6 mq6Var2 = mq6Var;
                                        o0z.a(null, null, null, null, null, pp8.b(-1198124432, new Function2() { // from class: dap
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj4, Object obj5) {
                                                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj4;
                                                int iIntValue2 = ((Integer) obj5).intValue();
                                                if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                                    lap.a(z4, z5, mq6Var2, aVar4, 0);
                                                } else {
                                                    aVar4.G();
                                                }
                                                return Unit.a;
                                            }
                                        }, aVar3), aVar3, 196608);
                                    } else {
                                        aVar3.G();
                                    }
                                    return Unit.a;
                                }
                            }, true));
                        }
                        lbp lbpVar = preMatchEventActivity.L;
                        if (lbpVar == null) {
                            Intrinsics.n("jokerViewTracker");
                            throw null;
                        }
                        boolean z4 = preMatchEventActivity.x1;
                        if (!lbpVar.b) {
                            lbpVar.a.a(new ibp(z4), k00.d);
                            lbpVar.b = true;
                        }
                    }
                    return Unit.a;
                }
            }));
            v8i0 viewModelStore7 = getViewModelStore();
            r8i0.c defaultViewModelProviderFactory7 = getDefaultViewModelProviderFactory();
            cyb defaultViewModelCreationExtras7 = getDefaultViewModelCreationExtras();
            viewModelStore7.getClass();
            defaultViewModelProviderFactory7.getClass();
            defaultViewModelCreationExtras7.getClass();
            s8i0 s8i0Var7 = new s8i0(viewModelStore7, defaultViewModelProviderFactory7, defaultViewModelCreationExtras7);
            dq7 dq7VarA7 = jq40.a(fj2.class);
            String strI7 = dq7VarA7.i();
            if (strI7 == null) {
                hb5.a("Local and anonymous classes can not be ViewModels");
                return;
            }
            fj2 fj2Var = (fj2) s8i0Var7.a(dq7VarA7, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI7));
            this.T0 = fj2Var;
            fj2Var.i.f(this, new e(new rb20(this, i)));
            fj2Var.y.f(this, new e(new sb20(this, i)));
            ViewGroup viewGroup3 = this.c0;
            if (viewGroup3 != null && (oa20Var2 = this.S0) != null) {
                v88.f fVar = v88.f.a;
                fVar.getClass();
                oa20Var2.b.c(viewGroup3, fVar.getName());
            }
            ImageView imageView5 = this.F0;
            if (imageView5 != null && (oa20Var = this.S0) != null) {
                v88.b bVar2 = v88.b.a;
                bVar2.getClass();
                oa20Var.b.c(imageView5, bVar2.getName());
            }
            nzm nzmVar2 = this.G;
            if (nzmVar2 == null) {
                Intrinsics.n("stakeConfigAgent");
                throw null;
            }
            this.d1 = new zy80(this, nzmVar2);
            iym iymVarE1 = E1();
            Map<String, ? extends Object> mapA = u.a(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, this.P);
            PageMeta.INSTANCE.getClass();
            iymVarE1.c(AnalyticsEvent.EVENT_DETAIL_VIEW, mapA, PageMeta.Companion.a());
        } catch (Resources.NotFoundException e2) {
            P1(e2);
        } catch (InflateException e3) {
            P1(e3);
        }
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        if (this.T1) {
            fdt.a(this).d(this.U1);
            this.T1 = false;
        }
        super.onDestroy();
        if (this.K1) {
            return;
        }
        getAccountHelper().removeAccountChangeListener(this);
        iu2.q(this);
        ImageView imageView = this.E0;
        if (imageView != null) {
            imageView.clearAnimation();
        }
        of20 of20Var = this.R0;
        if (of20Var != null) {
            of20Var.T.l(this);
            of20Var.N.l(this);
            of20Var.P.l(this);
            of20Var.R.l(this);
        }
        WebView webView = this.I0;
        if (webView != null) {
            getWebViewWrapperService().uninstallJsBridge(webView);
            webView.destroy();
        }
        com.sporty.android.common.uievent.e eVar = this.z;
        if (eVar != null) {
            eVar.a();
        } else {
            Intrinsics.n("commonUiEventProcessor");
            throw null;
        }
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        ((br3) mmc.a(hp0.A, br3.class)).U().K = null;
        this.V0 = true;
        PreMatchEventAdapter preMatchEventAdapter = this.A0;
        if (preMatchEventAdapter != null) {
            preMatchEventAdapter.unSub();
        }
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        ssw sswVar;
        super.onResume();
        ((br3) mmc.a(hp0.A, br3.class)).U().K = new b();
        int i = this.J0;
        int i2 = 0;
        b2(i == 0 || i == 3 || i == 4);
        of20 of20Var = this.R0;
        if (of20Var != null && (sswVar = of20Var.D) != null) {
            sswVar.f(this, new e(new tb20(this, i2)));
        }
        if (this.V0) {
            com.sportybet.plugin.event.e eVar = this.L1;
            if (eVar != null) {
                eVar.A1(false, false);
            }
            com.sportybet.plugin.event.e eVar2 = this.L1;
            if (eVar2 != null) {
                eVar2.C1();
            }
            this.V0 = false;
        }
        rvu rvuVar = this.U0;
        if (rvuVar != null) {
            rvuVar.x1();
        }
        PreMatchEventAdapter preMatchEventAdapter = this.A0;
        if (preMatchEventAdapter != null) {
            preMatchEventAdapter.sub();
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // mch.a
    public final void r0(Event event, Market market, Outcome outcome) {
        event.getClass();
        com.sportybet.plugin.event.e eVar = this.L1;
        if (eVar != null) {
            Event eventF = apg.f(event);
            xc20 xc20Var = new xc20(this, 0);
            String strD = apg.d(eventF);
            String strC = apg.c(eventF);
            eVar.L1(eventF, market, outcome, false, true, new sg2.j(strD, strC), new sg2.k(strD, strC), null, xc20Var);
        }
    }

    @Override // defpackage.py1
    public final void saveDataBeforeRecreate() {
        getIntent().putExtra(py1.PENDING_RECREATE_ACTIVITY, true);
    }

    @Override // defpackage.wym
    public final boolean y() {
        return false;
    }

    public final void z1() {
        ImageView imageView = this.s0;
        if (imageView != null) {
            imageView.setImageTintList(th50.a(R.color.text_type1_tertiary, getTheme(), getResources()));
        }
        ComposeView composeView = this.t1;
        if (composeView != null) {
            composeView.setVisibility(8);
        }
    }

    public final iym E1() {
        iym iymVar = this.C;
        if (iymVar != null) {
            return iymVar;
        }
        Intrinsics.n(vZBMKENANSz.WfyMXBnW);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0018  */
    public final void W1(boolean z) {
        boolean z2;
        LinearLayout linearLayout = this.B1;
        if (linearLayout == null) {
            return;
        }
        if (z) {
            mch mchVar = this.D1;
            if ((mchVar != null ? mchVar.c.size() : 0) > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        int i = z2 ? 0 : 8;
        if (linearLayout.getVisibility() == i) {
            return;
        }
        if (z2) {
            com.sportybet.plugin.event.e eVar = this.L1;
            if (eVar != null) {
                eVar.O1(new sg2.l(eVar.E1(), eVar.D1()));
            }
            getFullStoryCommonManager().f(lobGSRIlnSGJY.oOjDlRPzoQTKJ, jpu.b(new Pair("source", AnalyticsParam.EVENT_SOURCE_EVENT_DETAILS)));
        }
        linearLayout.setVisibility(i);
    }
}
