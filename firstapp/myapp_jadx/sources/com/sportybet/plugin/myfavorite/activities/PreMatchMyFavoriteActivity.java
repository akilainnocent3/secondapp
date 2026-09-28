package com.sportybet.plugin.myfavorite.activities;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.data.SimpleResponseWrapper;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.OUEarlyGoalsSwitch;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm;
import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.SocketPushManager;
import com.sportybet.plugin.myfavorite.activities.MyFavoriteTutorialActivity;
import com.sportybet.plugin.myfavorite.activities.PreMatchMyFavoriteActivity;
import com.sportybet.plugin.myfavorite.widget.LoadingView;
import com.sportybet.plugin.myfavorite.widget.MyFavoriteEmptyLayout;
import com.sportybet.plugin.myfavorite.widget.MyFavoriteLivePanel;
import com.sportybet.plugin.realsports.activities.AlertDialogActivity;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.LiveEventChange;
import com.sportybet.plugin.realsports.data.PreMatchSportsData;
import com.sportybet.plugin.realsports.data.QuickMarketHelper;
import com.sportybet.plugin.realsports.data.QuickMarketMappingData;
import com.sportybet.plugin.realsports.data.QuickMarketSpotEnum;
import com.sportybet.plugin.realsports.data.ServerProductStatus;
import com.sportybet.plugin.realsports.data.ServerProductStatusHelper;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.SportGroup;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import com.sportybet.plugin.realsports.sportssoccer.expandview.PopOneListView;
import com.sportybet.plugin.realsports.sportssoccer.expandview.RegionsListView;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportybet.plugin.realsports.widget.PreMatchSpinnerTextView;
import defpackage.a8z;
import defpackage.ap0;
import defpackage.asy;
import defpackage.avy;
import defpackage.bb40;
import defpackage.bj30;
import defpackage.br3;
import defpackage.bsy;
import defpackage.c1b;
import defpackage.c2b;
import defpackage.ch20;
import defpackage.ckf;
import defpackage.cyb;
import defpackage.djs;
import defpackage.dq7;
import defpackage.dty;
import defpackage.eg20;
import defpackage.ej5;
import defpackage.ekp;
import defpackage.ety;
import defpackage.g1f0;
import defpackage.g1i;
import defpackage.g8z;
import defpackage.gby;
import defpackage.gty;
import defpackage.h220;
import defpackage.hb5;
import defpackage.hih0;
import defpackage.hkf;
import defpackage.hp0;
import defpackage.i0m;
import defpackage.ijf;
import defpackage.ing;
import defpackage.itf0;
import defpackage.ity;
import defpackage.iu2;
import defpackage.iuy;
import defpackage.ivw;
import defpackage.iwh0;
import defpackage.izw;
import defpackage.j020;
import defpackage.jq40;
import defpackage.jqu;
import defpackage.jty;
import defpackage.k0e0;
import defpackage.k9j;
import defpackage.kut;
import defpackage.kzh;
import defpackage.lfb0;
import defpackage.lfy;
import defpackage.lkf;
import defpackage.lqu;
import defpackage.lww;
import defpackage.lzw;
import defpackage.mds;
import defpackage.mfb0;
import defpackage.mjf;
import defpackage.mmc;
import defpackage.muh;
import defpackage.mzw;
import defpackage.njs;
import defpackage.nzw;
import defpackage.o8i0;
import defpackage.of20;
import defpackage.okp;
import defpackage.ozh;
import defpackage.phh0;
import defpackage.pkf;
import defpackage.qfb0;
import defpackage.qg20;
import defpackage.qh20;
import defpackage.qz3;
import defpackage.r8i0;
import defpackage.rh20;
import defpackage.rhh0;
import defpackage.rs40;
import defpackage.rty;
import defpackage.ruy;
import defpackage.s8i0;
import defpackage.sn20;
import defpackage.sty;
import defpackage.su5;
import defpackage.tay;
import defpackage.th20;
import defpackage.trs;
import defpackage.tru;
import defpackage.uts;
import defpackage.uuy;
import defpackage.v8i0;
import defpackage.ve20;
import defpackage.vg20;
import defpackage.vh20;
import defpackage.vjt;
import defpackage.vuy;
import defpackage.vym;
import defpackage.whh0;
import defpackage.wi30;
import defpackage.wlc;
import defpackage.wq3;
import defpackage.wuy;
import defpackage.wym;
import defpackage.xh20;
import defpackage.xhh0;
import defpackage.xlc;
import defpackage.xvf0;
import defpackage.xxw;
import defpackage.xyd0;
import defpackage.yec;
import defpackage.yh20;
import defpackage.yhh0;
import defpackage.yrh0;
import defpackage.z7h;
import defpackage.zch0;
import defpackage.zhh0;
import defpackage.zjf;
import defpackage.zyf0;
import java.net.ConnectException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class PreMatchMyFavoriteActivity extends i0m implements View.OnClickListener, SwipeRefreshLayout.f, iu2.b, TabLayout.d, wym, vym, ivw, k9j, bb40 {
    public static final /* synthetic */ int b1 = 0;
    public of20 A0;
    public yh20 B0;
    public bj30 C0;
    public trs D0;
    public sn20 E0;
    public TextView F;
    public ruy F0;
    public ImageView G;
    public ity G0;
    public RecyclerView H;
    public bsy H0;
    public k0e0 I;
    public ijf I0;
    public SwipeRefreshLayout J;
    public xlc J0;
    public ConsecutiveScrollerLayout K;
    public View K0;
    public lww L;
    public MyFavoriteLivePanel L0;
    public LinearLayout M0;
    public OneUpTwoUpSwitch N0;
    public OUEarlyGoalsSwitch O0;
    public PreMatchSpinnerTextView P;
    public View P0;
    public PreMatchSpinnerTextView Q;
    public BubbleView Q0;
    public View R;
    public View S;
    public int T;
    public PreMatchSpinnerTextView U;
    public RelativeLayout U0;
    public ImageButton V0;
    public yec W;
    public TextView W0;
    public LoadingView X;
    public TextView X0;
    public PopOneListView Y;
    public MyFavoriteEmptyLayout Y0;
    public PopOneListView Z;
    public RegionsListView a0;
    public String b0;
    public iuy c;
    public String c0;
    public mjf d;
    public a8z e;
    public long e0;
    public muh f;
    public mfb0 f0;
    public String g0;
    public String h0;
    public hkf i;
    public su5<BaseResponse<PreMatchSportsData>> i0;
    public su5<BaseResponse<SportGroup>> j0;
    public TabLayout n0;
    public OneUpTwoUpSwitch o0;
    public OUEarlyGoalsSwitch p0;
    public View q0;
    public BubbleView r0;
    public RelativeLayout s0;
    public TextView t0;
    public TextView u0;
    public xhh0 v;
    public zhh0 w;
    public ImageView w0;
    public su5<BaseResponse<List<Sport>>> x0;
    public sty y;
    public int y0;
    public jty z;
    public final QuickMarketSpotEnum b = QuickMarketSpotEnum.SPORTS_PAGE_PRE_MATCH;
    public final ArrayList A = new ArrayList();
    public final ArrayList B = new ArrayList();
    public ArrayList C = new ArrayList();
    public long D = 0;
    public long E = 0;
    public final ArrayList M = new ArrayList();
    public final ArrayList N = new ArrayList();
    public final ArrayList O = new ArrayList();
    public final ArrayList<RelativeLayout> V = new ArrayList<>();
    public long d0 = 0;
    public int k0 = 1;
    public int l0 = -1;
    public long m0 = Long.MIN_VALUE;
    public int v0 = 0;
    public int z0 = 0;
    public boolean R0 = false;
    public final a S0 = new a();
    public final b T0 = new b();
    public String Z0 = null;
    public final vg20 a1 = new g8z() { // from class: vg20
        @Override // defpackage.g8z
        public final void a(Selection selection, boolean z, e8z e8zVar) {
            gty gtyVar;
            int i = PreMatchMyFavoriteActivity.b1;
            PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = this.a;
            xhh0 xhh0Var = preMatchMyFavoriteActivity.v;
            mfb0 mfb0Var = preMatchMyFavoriteActivity.f0;
            whh0 whh0VarD = xhh0Var.d(mfb0Var == null ? null : mfb0Var.getId(), preMatchMyFavoriteActivity.b0, false);
            preMatchMyFavoriteActivity.w.getClass();
            boolean z2 = zhh0.a(whh0VarD).b == avy.a;
            RegularMarketRule regularMarketRule = preMatchMyFavoriteActivity.f0 != null ? QuickMarketMappingData.getInstance().get(preMatchMyFavoriteActivity.b, preMatchMyFavoriteActivity.f0.getId(), preMatchMyFavoriteActivity.b0) : null;
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
            sty styVar = preMatchMyFavoriteActivity.y;
            ity ityVar = preMatchMyFavoriteActivity.G0;
            Event event = selection.a;
            ityVar.getClass();
            nty ntyVarA = ityVar.b.a(gtyVar2, event, regularMarketRule);
            ntyVarA.getClass();
            styVar.getClass();
            styVar.b(new sty.b.C1102b(new yty(selection, z, gtyVar2, z2, ntyVarA, styVar.c.b()), true));
            preMatchMyFavoriteActivity.H0.G1(selection, z, e8zVar);
        }
    };

    public class a implements asy {
        public a() {
        }

        @Override // defpackage.asy
        public final void a() {
            PreMatchMyFavoriteActivity.this.H0.D1(wuy.e, uuy.a);
        }

        @Override // defpackage.asy
        public final void b() {
            int i = PreMatchMyFavoriteActivity.b1;
            PreMatchMyFavoriteActivity.this.J1();
        }

        @Override // defpackage.asy
        public final boolean c() {
            PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = PreMatchMyFavoriteActivity.this;
            sn20 sn20Var = preMatchMyFavoriteActivity.E0;
            sn20Var.getClass();
            boolean zA = sn20Var.a.a("dc_one_up_switch_hint_displayed");
            sn20 sn20Var2 = preMatchMyFavoriteActivity.E0;
            sn20Var2.getClass();
            return (zA || !sn20Var2.a.a("market_early_goals_switch_hint_displayed") || (preMatchMyFavoriteActivity.r0.getVisibility() != 8)) ? false : true;
        }

        @Override // defpackage.asy
        public final void d(OneUpTwoUpSwitch.f fVar) {
            PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = PreMatchMyFavoriteActivity.this;
            preMatchMyFavoriteActivity.o0.setState(fVar, false);
            preMatchMyFavoriteActivity.H0.C1(wuy.e, uuy.a, vuy.b(hih0.g(fVar)));
        }
    }

    public class b implements tay {
        public b() {
        }

        @Override // defpackage.tay
        public final void a() {
            PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = PreMatchMyFavoriteActivity.this;
            preMatchMyFavoriteActivity.I0.C1(lkf.e, zjf.a, preMatchMyFavoriteActivity.O0.c() ? pkf.a : pkf.b);
        }

        @Override // defpackage.tay
        public final void b() {
            int i = PreMatchMyFavoriteActivity.b1;
            PreMatchMyFavoriteActivity.this.J1();
        }

        @Override // defpackage.tay
        public final boolean c() {
            PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = PreMatchMyFavoriteActivity.this;
            sn20 sn20Var = preMatchMyFavoriteActivity.E0;
            sn20Var.getClass();
            return (sn20Var.a.a("market_early_goals_switch_hint_displayed") || (preMatchMyFavoriteActivity.r0.getVisibility() != 8)) ? false : true;
        }

        @Override // defpackage.tay
        public final void onStateChanged(boolean z) {
            PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = PreMatchMyFavoriteActivity.this;
            preMatchMyFavoriteActivity.p0.setState(z, false, false);
            preMatchMyFavoriteActivity.I0.B1(lkf.e, zjf.a, z ? pkf.a : pkf.b);
        }
    }

    public class c implements wq3.b {
        public c() {
        }

        @Override // wq3.b
        public final boolean a() {
            return !PreMatchMyFavoriteActivity.this.isFinishing();
        }

        @Override // wq3.b
        public final void b(int i) {
            ArrayList arrayList;
            PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = PreMatchMyFavoriteActivity.this;
            preMatchMyFavoriteActivity.z0 = i;
            if (preMatchMyFavoriteActivity.L == null || (arrayList = preMatchMyFavoriteActivity.B) == null || arrayList.size() <= 0) {
                return;
            }
            preMatchMyFavoriteActivity.L.o();
        }

        @Override // wq3.b
        public final void c(boolean z) {
            ArrayList arrayList;
            PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = PreMatchMyFavoriteActivity.this;
            preMatchMyFavoriteActivity.z0 = 0;
            if (preMatchMyFavoriteActivity.L == null || (arrayList = preMatchMyFavoriteActivity.B) == null || arrayList.size() <= 0) {
                return;
            }
            preMatchMyFavoriteActivity.L.o();
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class d extends SimpleResponseWrapper<PreMatchSportsData> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(PreMatchMyFavoriteActivity preMatchMyFavoriteActivity, boolean z) {
            super(preMatchMyFavoriteActivity);
            this.a = z;
        }

        @Override // com.sportybet.android.data.SimpleResponseWrapper
        public final void onFailure(Throwable th) {
            PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = PreMatchMyFavoriteActivity.this;
            lww lwwVar = preMatchMyFavoriteActivity.L;
            if (lwwVar != null) {
                lwwVar.m(false);
            }
            preMatchMyFavoriteActivity.M1(th, this.a);
        }

        @Override // com.sportybet.android.data.SimpleResponseWrapper
        public final void onSuccess(PreMatchSportsData preMatchSportsData) {
            long j;
            String strValueOf;
            String strValueOf2;
            List<Event> list;
            PreMatchSportsData preMatchSportsData2 = preMatchSportsData;
            ServerProductStatus serverProductStatus = ServerProductStatusHelper.getServerProductStatus(getMessage());
            PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = PreMatchMyFavoriteActivity.this;
            if (serverProductStatus != null && !serverProductStatus.isInServing(ServerProductStatus.Product.PRE_MATCH_EVENTS)) {
                yrh0.t(preMatchMyFavoriteActivity, AlertDialogActivity.class, true);
                return;
            }
            preMatchMyFavoriteActivity.l0 = preMatchSportsData2.lastIndex;
            List<Tournament> list2 = preMatchSportsData2.tournaments;
            if (list2 != null) {
                if (list2.size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    long j2 = 0;
                    for (Tournament tournament : list2) {
                        for (Event event : tournament.events) {
                            ing ingVar = new ing();
                            ingVar.c = !vjt.a(j2, event.estimateStartTime);
                            j2 = event.estimateStartTime;
                            ingVar.a = event;
                            ingVar.b = tournament.id;
                            ingVar.i = tournament.name;
                            ingVar.f = tournament.categoryName;
                            ingVar.v = false;
                            arrayList.add(ingVar);
                        }
                    }
                    j = 0;
                    preMatchMyFavoriteActivity.C = arrayList;
                    if (arrayList.size() > 0) {
                        eg20 eg20Var = new eg20();
                        eg20Var.c = preMatchMyFavoriteActivity.D;
                        eg20Var.d = preMatchMyFavoriteActivity.E;
                        long j3 = preMatchMyFavoriteActivity.d0;
                        eg20Var.e = preMatchMyFavoriteActivity.m0;
                        eg20Var.y = preMatchMyFavoriteActivity.A;
                        eg20Var.f = preMatchMyFavoriteActivity.k0 + 1;
                        eg20Var.i = preMatchMyFavoriteActivity.l0;
                        PreMatchMyFavoriteActivity.H1(-1.0d, j3);
                        boolean z = preMatchSportsData2.moreEvents;
                        eg20Var.a = z;
                        eg20Var.w = !z;
                        if (list2.size() >= 20 && (list = ((Tournament) uts.a(1, list2)).events) != null && list.size() > 0) {
                            eg20Var.v = ((Event) uts.a(1, list)).estimateStartTime;
                        }
                        preMatchMyFavoriteActivity.C.add(eg20Var);
                    } else {
                        preMatchMyFavoriteActivity.C.add(new eg20());
                    }
                } else {
                    j = 0;
                    preMatchMyFavoriteActivity.C.clear();
                }
                boolean zH1 = PreMatchMyFavoriteActivity.H1(-1.0d, preMatchMyFavoriteActivity.d0);
                su5<BaseResponse<SportGroup>> su5Var = preMatchMyFavoriteActivity.j0;
                if (su5Var != null) {
                    su5Var.cancel();
                }
                long j4 = preMatchMyFavoriteActivity.m0;
                String str = null;
                if (j4 < j) {
                    String strValueOf3 = String.valueOf(preMatchMyFavoriteActivity.D);
                    strValueOf2 = String.valueOf(preMatchMyFavoriteActivity.E);
                    str = strValueOf3;
                    strValueOf = null;
                } else if (j4 > j) {
                    strValueOf = String.valueOf(j4);
                    strValueOf2 = null;
                } else {
                    strValueOf = null;
                    strValueOf2 = null;
                }
                z7h z7hVarB = ap0.b();
                String str2 = preMatchMyFavoriteActivity.c0;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("sportId", str2);
                    jSONObject.put("productId", "3");
                    jSONObject.put("startTime", str);
                    jSONObject.put(dqvOSm.EpqNfdvyWeXjdL, strValueOf2);
                    jSONObject.put("timeline", strValueOf);
                    jSONObject.put("todayGames", zH1);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                su5<BaseResponse<SportGroup>> su5VarL = z7hVarB.l(jSONObject.toString());
                preMatchMyFavoriteActivity.j0 = su5VarL;
                su5VarL.G(new th20(preMatchMyFavoriteActivity, preMatchMyFavoriteActivity, this.a));
            }
        }
    }

    public class e extends SimpleResponseWrapper<List<Sport>> {
        public e(PreMatchMyFavoriteActivity preMatchMyFavoriteActivity) {
            super(preMatchMyFavoriteActivity);
        }

        @Override // com.sportybet.android.data.SimpleResponseWrapper
        public final void onSuccess(List<Sport> list) {
            PreMatchMyFavoriteActivity preMatchMyFavoriteActivity;
            ArrayList arrayListF = lfb0.d().f(list);
            int size = arrayListF.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                preMatchMyFavoriteActivity = PreMatchMyFavoriteActivity.this;
                if (i2 >= size) {
                    break;
                }
                Object obj = arrayListF.get(i2);
                i2++;
                Sport sport = (Sport) obj;
                i += sport.eventSize;
                TextUtils.equals(preMatchMyFavoriteActivity.c0, sport.id);
            }
            if (i <= 0) {
                preMatchMyFavoriteActivity.s0.setVisibility(8);
            } else {
                preMatchMyFavoriteActivity.t0.setText(String.valueOf(i));
                preMatchMyFavoriteActivity.s0.setVisibility(0);
            }
        }
    }

    public static boolean H1(double d2, double d3) {
        return Double.doubleToLongBits(d2) == Double.doubleToLongBits(d3);
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void A0(TabLayout.g gVar) {
    }

    public final void A1() {
        this.X0.setVisibility(8);
        yh20 yh20Var = this.B0;
        yh20Var.getClass();
        ej5.c(o8i0.d(yh20Var), null, null, new vh20(yh20Var, null), 3);
        if (TextUtils.equals(this.Z0, "MyFavoriteSummaryActivity")) {
            finish();
        } else {
            izw.c("PreMatchMyFavoriteActivity");
        }
    }

    public final String B1(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (TextUtils.equals(getCMSString(R.string.common_functions__all, new Object[0]), str)) {
            return getCMSString(R.string.common_functions__daily, new Object[0]);
        }
        return (TextUtils.equals(getCMSString(R.string.live___3_hours, new Object[0]), str) || TextUtils.equals(getCMSString(R.string.wap_home__today, new Object[0]), str)) ? str : str.substring(0, 3);
    }

    @Override // iu2.a
    public final void C() {
        this.L.o();
    }

    public final void C1(final View view, boolean z) {
        PreMatchSpinnerTextView preMatchSpinnerTextView;
        boolean z2 = this.L0.getVisibility() == 0;
        if (this.T != 1) {
            this.R0 = false;
            O1();
        }
        yec yecVar = this.W;
        ArrayList<RelativeLayout> arrayList = this.V;
        if (yecVar == null) {
            yec yecVar2 = new yec((View) arrayList.get(this.T));
            this.W = yecVar2;
            yecVar2.setAnimationStyle(R.style.spr_PopupWindowAnimation);
            this.W.setFocusable(true);
            this.W.setOutsideTouchable(true);
            this.W.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: tg20
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    int i = PreMatchMyFavoriteActivity.b1;
                    PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = this.a;
                    PreMatchSpinnerTextView preMatchSpinnerTextView2 = preMatchMyFavoriteActivity.U;
                    if (preMatchSpinnerTextView2 != null) {
                        preMatchSpinnerTextView2.setExpanded(false);
                    }
                    preMatchMyFavoriteActivity.L1();
                }
            });
        }
        if (this.W.isShowing()) {
            this.W.dismiss();
        }
        if (!z || ((preMatchSpinnerTextView = this.U) != null && preMatchSpinnerTextView.v)) {
            if (this.W.getContentView() != arrayList.get(this.T)) {
                this.W.setContentView(arrayList.get(this.T));
            }
            new Handler().postDelayed(new Runnable() { // from class: ug20
                @Override // java.lang.Runnable
                public final void run() {
                    int i = PreMatchMyFavoriteActivity.b1;
                    this.a.W.c(view);
                }
            }, z2 ? 100L : 0L);
        }
    }

    public final void D1() {
        su5<BaseResponse<List<Sport>>> su5Var = this.x0;
        if (su5Var != null) {
            su5Var.cancel();
        }
        su5<BaseResponse<List<Sport>>> su5VarF0 = ap0.b().f0(null, 1, null, "1", null, false);
        this.x0 = su5VarF0;
        su5VarF0.G(new e(this));
    }

    public final void E1(boolean z) {
        long j;
        long j2;
        long j3;
        if (!z) {
            LoadingView loadingView = this.X;
            loadingView.setVisibility(0);
            loadingView.b.setVisibility(0);
            loadingView.a.setVisibility(8);
            loadingView.c.setVisibility(8);
            this.J.setRefreshing(false);
        }
        long j4 = this.d0;
        if (j4 == 0 || j4 == 3) {
            this.E = 0L;
            this.D = 0L;
            this.m0 = j4;
            j = 0;
            j2 = 0;
        } else {
            if (j4 == -1) {
                j4 = this.e0;
                this.D = j4;
                j3 = j4 + 86399999;
                this.E = j3;
                this.m0 = -1L;
            } else {
                this.D = j4;
                j3 = j4 + 86399999;
                this.E = j3;
                this.m0 = -1L;
            }
            j = j4;
            j4 = -1;
            j2 = j3;
        }
        JSONObject jSONObjectA = mds.a(this.c0, this.A, this.k0, this.l0, j, j2, j4);
        su5<BaseResponse<PreMatchSportsData>> su5Var = this.i0;
        if (su5Var != null) {
            su5Var.cancel();
        }
        k0e0 k0e0Var = this.I;
        if (k0e0Var != null) {
            k0e0Var.b();
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_MY_FAVORITE);
        aVar.a("request = %s", jSONObjectA.toString());
        su5<BaseResponse<PreMatchSportsData>> su5VarG = ap0.b().g(jSONObjectA.toString());
        this.i0 = su5VarG;
        su5VarG.G(new d(this, z));
    }

    public final boolean F1() {
        xxw xxwVar = izw.a;
        if (xxwVar.a().k() != null && !xxwVar.a().k().isEmpty()) {
            String str = this.c0;
            if (str == null || !xxwVar.a().i(str)) {
                this.c0 = xxwVar.a().k().get(0);
            }
            if (!TextUtils.isEmpty(this.c0)) {
                mfb0 mfb0VarE = lfb0.d().e(this.c0);
                this.f0 = mfb0VarE;
                if (mfb0VarE != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void G(TabLayout.g gVar) {
        String str = ((RegularMarketRule) gVar.a).a;
        this.b0 = str;
        lww lwwVar = this.L;
        if (lwwVar != null) {
            lwwVar.p(this.b, str);
            V0();
        }
        P1();
    }

    public final void G1() {
        String string;
        ArrayList arrayList = this.O;
        arrayList.clear();
        for (String str : izw.a.a().k()) {
            qfb0 qfb0Var = new qfb0();
            mfb0 mfb0VarE = lfb0.d().e(str);
            if (mfb0VarE != null) {
                UiText uiTextC = mfb0VarE.c();
                uiTextC.getClass();
                string = uiTextC.e(this).toString();
            } else {
                string = "";
            }
            qfb0Var.b = string;
            qfb0Var.d = str;
            qfb0Var.c = str.equals(this.c0);
            arrayList.add(qfb0Var);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            g1f0 g1f0Var = (g1f0) obj;
            if (g1f0Var.c) {
                this.h0 = g1f0Var.b;
                return;
            }
        }
    }

    public final void I1() {
        yec yecVar = this.W;
        if (yecVar == null || !yecVar.isShowing()) {
            return;
        }
        this.W.dismiss();
    }

    public final void J1() {
        jqu jquVarB = lqu.b(this.Q0.getVisibility() != 8 ? this.Q0 : this.r0);
        sn20 sn20Var = this.E0;
        String str = jquVarB == jqu.b ? "dc_one_up_switch_hint_displayed" : "market_early_goals_switch_hint_displayed";
        sn20Var.getClass();
        sn20Var.a.b(str);
        this.Q0.setVisibility(8);
        this.r0.setVisibility(8);
    }

    public final void K1(String str, boolean z) {
        if (!TextUtils.equals(this.c0, str) || z) {
            this.c0 = str;
            this.f0 = lfb0.d().e(this.c0);
            this.k0 = 1;
            this.l0 = -1;
            this.Q.setTextColor(getColor(R.color.text_type1_tertiary));
            OneUpTwoUpSwitch oneUpTwoUpSwitch = this.o0;
            avy avyVar = avy.c;
            hih0.b(oneUpTwoUpSwitch, avyVar);
            hih0.b(this.N0, avyVar);
            this.p0.setState(false, false, true);
            this.O0.setState(false, false, true);
            bj30 bj30Var = this.C0;
            String str2 = this.c0;
            bj30Var.getClass();
            QuickMarketSpotEnum quickMarketSpotEnum = this.b;
            quickMarketSpotEnum.getClass();
            str2.getClass();
            QuickMarketHelper.fetch(quickMarketSpotEnum, str2, new wi30(false, bj30Var));
        }
    }

    public final void L1() {
        yec yecVar = this.W;
        this.W0.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, iwh0.a(this, (yecVar != null && yecVar.isShowing() && this.T == 1) ? R.drawable.spr_ic_arrow_drop_up_black_24dp : R.drawable.spr_ic_arrow_drop_down_black_24dp, -1), (Drawable) null);
    }

    public final void M1(Throwable th, boolean z) {
        ((br3) mmc.a(hp0.A, br3.class)).U().a(this, false);
        this.S.setVisibility(8);
        this.n0.setVisibility(8);
        P1();
        if (th instanceof ConnectException) {
            if (z) {
                zyf0.b(R.string.common_feedback__no_internet_connection_try_again, 0);
                this.J.setRefreshing(false);
                return;
            }
            LoadingView loadingView = this.X;
            loadingView.setVisibility(0);
            loadingView.b.setVisibility(8);
            loadingView.a.setVisibility(0);
            loadingView.c.setVisibility(0);
            this.X.b(null);
            return;
        }
        if (z) {
            zyf0.b(R.string.my_favourites_settings__something_went_error_msg, 0);
            this.J.setRefreshing(false);
            return;
        }
        LoadingView loadingView2 = this.X;
        String cMSString = getCMSString(R.string.my_favourites_settings__something_went_error_msg, new Object[0]);
        loadingView2.setVisibility(0);
        loadingView2.b.setVisibility(8);
        loadingView2.a.setVisibility(0);
        loadingView2.a.a(cMSString, null, "");
        loadingView2.c.setVisibility(0);
        this.X.b(null);
    }

    public final void N1() {
        if (!izw.a()) {
            this.Y0.setOnClickListener(this);
            this.V0.setVisibility(8);
            this.W0.setVisibility(8);
            this.Y0.setVisibility(0);
            this.X0.setVisibility(8);
            return;
        }
        this.V0.setVisibility(0);
        this.W0.setVisibility(0);
        this.Y0.setVisibility(8);
        yh20 yh20Var = this.B0;
        mzw mzwVar = yh20Var.a;
        kzh.d(new g1i(ozh.c(new lzw(nzw.b.a(mzwVar.a, nzw.a[0]).k()), mzwVar.b), new xh20(yh20Var, null)), o8i0.d(yh20Var));
    }

    public final void O1() {
        final int color = getColor(R.color.brand_secondary);
        int color2 = getColor(R.color.text_type2_primary);
        int color3 = getColor(R.color.text_type1_secondary);
        boolean z = this.v0 > 0;
        this.K0.setOnClickListener(z ? new View.OnClickListener() { // from class: sg20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = PreMatchMyFavoriteActivity.b1;
                final PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = this.a;
                boolean z2 = preMatchMyFavoriteActivity.R0;
                preMatchMyFavoriteActivity.R0 = !z2;
                preMatchMyFavoriteActivity.w0.setImageResource(!z2 ? R.drawable.iwqk_less : R.drawable.iwqk_more);
                preMatchMyFavoriteActivity.w0.setColorFilter(color);
                if (preMatchMyFavoriteActivity.L0 != null) {
                    preMatchMyFavoriteActivity.M0.setVisibility(preMatchMyFavoriteActivity.R0 ? 0 : 8);
                    preMatchMyFavoriteActivity.L0.setVisibility(preMatchMyFavoriteActivity.R0 ? 0 : 8);
                }
                if (preMatchMyFavoriteActivity.R0) {
                    preMatchMyFavoriteActivity.K.postDelayed(new Runnable() { // from class: dh20
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2 = PreMatchMyFavoriteActivity.b1;
                            preMatchMyFavoriteActivity.K.scrollTo(0, 0);
                        }
                    }, 50L);
                }
            }
        } : null);
        TextView textView = this.u0;
        if (textView != null) {
            if (z) {
                color2 = color;
            }
            textView.setTextColor(color2);
            this.u0.setText(String.valueOf(this.v0));
        }
        this.w0.setImageResource(this.R0 ? R.drawable.iwqk_less : R.drawable.iwqk_more);
        ImageView imageView = this.w0;
        if (!z) {
            color = color3;
        }
        imageView.setColorFilter(color);
        if (this.L0 != null) {
            this.M0.setVisibility((z && this.R0) ? 0 : 8);
            this.L0.setVisibility((z && this.R0) ? 0 : 8);
        }
    }

    public final void P1() {
        mfb0 mfb0Var = this.f0;
        if (mfb0Var == null || this.b0 == null) {
            this.o0.setVisibility(8);
            this.p0.setVisibility(8);
            this.q0.setVisibility(8);
            this.r0.setVisibility(8);
            return;
        }
        xhh0 xhh0Var = this.v;
        String id = mfb0Var.getId();
        QuickMarketMappingData quickMarketMappingData = QuickMarketMappingData.getInstance();
        String id2 = this.f0.getId();
        String str = this.b0;
        QuickMarketSpotEnum quickMarketSpotEnum = this.b;
        boolean zE = xhh0Var.e(quickMarketMappingData.get(quickMarketSpotEnum, id2, str), id, false);
        boolean zB = this.d.b(ckf.c, this.f0.getId(), this.b0, false);
        int i = 1;
        if (!zE || this.n0.getVisibility() != 0) {
            if (!zB || this.n0.getVisibility() != 0) {
                this.o0.setVisibility(8);
                this.p0.setVisibility(8);
                this.q0.setVisibility(8);
                this.r0.setVisibility(8);
                return;
            }
            this.o0.setVisibility(8);
            this.p0.setVisibility(0);
            this.q0.setVisibility(0);
            sn20 sn20Var = this.E0;
            sn20Var.getClass();
            boolean z = (sn20Var.a.a("market_early_goals_switch_hint_displayed") || (this.Q0.getVisibility() != 8)) ? false : true;
            if (z) {
                BubbleView bubbleView = this.r0;
                lqu.c(bubbleView, jqu.a, new c1b(bubbleView, i));
            }
            this.r0.setVisibility(z ? 0 : 8);
            this.I0.C1(lkf.e, zjf.b, this.O0.c() ? pkf.a : pkf.b);
            return;
        }
        whh0 whh0VarC = this.v.c(QuickMarketMappingData.getInstance().get(quickMarketSpotEnum, this.f0.getId(), this.b0), this.f0.getId(), false);
        this.w.getClass();
        yhh0 yhh0VarA = zhh0.a(whh0VarC);
        avy avyVar = yhh0VarA.b;
        hih0.a(this.o0, yhh0VarA.a);
        hih0.b(this.o0, avyVar);
        this.o0.setVisibility(0);
        this.p0.setVisibility(8);
        this.q0.setVisibility(0);
        sn20 sn20Var2 = this.E0;
        sn20Var2.getClass();
        boolean zA = sn20Var2.a.a("dc_one_up_switch_hint_displayed");
        jqu jquVar = null;
        boolean z2 = (whh0VarC != null ? whh0VarC.a : null) == rhh0.b && whh0VarC.c.contains(phh0.a);
        if (!zA && z2) {
            jquVar = jqu.b;
        }
        if (jquVar != null) {
            BubbleView bubbleView2 = this.r0;
            lqu.c(bubbleView2, jquVar, new c1b(bubbleView2, i));
        }
        this.r0.setVisibility(jquVar != null ? 0 : 8);
        if (!wlc.a(whh0VarC)) {
            this.H0.D1(wuy.e, uuy.b);
            return;
        }
        xlc xlcVar = this.J0;
        lkf lkfVar = lkf.e;
        zjf zjfVar = zjf.a;
        xlcVar.y1(lkfVar, avyVar == avy.a ? pkf.a : pkf.b);
    }

    public final void Q1(List<RegularMarketRule> list) {
        this.n0.n();
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                i = 0;
                break;
            } else if (TextUtils.equals(this.b0, list.get(i).a)) {
                break;
            } else {
                i++;
            }
        }
        int i2 = 0;
        while (i2 < list.size()) {
            RegularMarketRule regularMarketRule = list.get(i2);
            TabLayout tabLayout = this.n0;
            TabLayout.g gVarL = tabLayout.l();
            HashSet hashSet = tru.a;
            gVarL.e(regularMarketRule.b);
            gVarL.a = regularMarketRule;
            tabLayout.d(gVarL, i == i2);
            if (i == i2) {
                this.b0 = regularMarketRule.a;
            }
            QuickMarketMappingData.getInstance().add(this.b, this.c0, regularMarketRule);
            i2++;
        }
    }

    public final void R1(String str) {
        this.b0 = str;
        TabLayout.g gVarK = this.n0.k(this.n0.getTabCount() > 0 ? this.n0.getSelectedTabPosition() : -1);
        if (gVarK != null) {
            gVarK.a = RegularMarketRule.a(str, null);
        }
        lww lwwVar = this.L;
        if (lwwVar != null) {
            lwwVar.p(this.b, str);
            V0();
        }
    }

    @Override // defpackage.ivw
    public final void V0() {
        k0e0 k0e0Var = this.I;
        if (k0e0Var != null) {
            k0e0Var.d(true);
        }
    }

    @Override // defpackage.ivw
    public final void a(Event event) {
        xyd0.a.a(event.eventId, event.sport.id, event.isLiveOrFinished(), event.eventSource).show(getSupportFragmentManager(), "statisticsDialogFragment");
    }

    @Override // com.google.android.material.tabs.TabLayout.c
    public final void g0(TabLayout.g gVar) {
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void i() {
        lww lwwVar = this.L;
        if (lwwVar != null) {
            lwwVar.m(true);
        }
        E1(true);
        D1();
        this.L0.u();
    }

    @Override // defpackage.wym
    public final boolean k0() {
        return false;
    }

    @Override // defpackage.wym
    public final boolean o() {
        return false;
    }

    @Override // defpackage.r1k
    public final boolean onBackPressedCompat() {
        yec yecVar = this.W;
        if (yecVar == null || !yecVar.isShowing()) {
            finish();
            return true;
        }
        this.W.dismiss();
        PreMatchSpinnerTextView preMatchSpinnerTextView = this.U;
        if (preMatchSpinnerTextView != null) {
            preMatchSpinnerTextView.setExpanded(false);
        }
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.regions_btn) {
            this.a0.d(this.M);
            PreMatchSpinnerTextView preMatchSpinnerTextView = (PreMatchSpinnerTextView) view;
            PreMatchSpinnerTextView preMatchSpinnerTextView2 = this.U;
            if (preMatchSpinnerTextView2 != null && preMatchSpinnerTextView2 != preMatchSpinnerTextView) {
                preMatchSpinnerTextView2.setExpanded(false);
            }
            this.U = preMatchSpinnerTextView;
            this.T = ((Integer) preMatchSpinnerTextView.getTag()).intValue();
            PreMatchSpinnerTextView preMatchSpinnerTextView3 = this.U;
            preMatchSpinnerTextView3.setExpanded(!preMatchSpinnerTextView3.v);
            C1(this.S, true);
            return;
        }
        if (id != R.id.time_btn) {
            if (id == R.id.sports_expand_tab_layout) {
                I1();
                return;
            }
            return;
        }
        PreMatchSpinnerTextView preMatchSpinnerTextView4 = (PreMatchSpinnerTextView) view;
        PreMatchSpinnerTextView preMatchSpinnerTextView5 = this.U;
        if (preMatchSpinnerTextView5 != null && preMatchSpinnerTextView5 != preMatchSpinnerTextView4) {
            preMatchSpinnerTextView5.setExpanded(false);
        }
        this.U = preMatchSpinnerTextView4;
        this.T = ((Integer) preMatchSpinnerTextView4.getTag()).intValue();
        PreMatchSpinnerTextView preMatchSpinnerTextView6 = this.U;
        preMatchSpinnerTextView6.setExpanded(!preMatchSpinnerTextView6.v);
        C1(this.S, true);
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_pre_match_my_favorite);
        int i = 1;
        setRequireBetslipBtnLater(true);
        this.Z0 = getIntent().getStringExtra("from");
        F1();
        xvf0 xvf0Var = new xvf0();
        int i2 = 0;
        xvf0Var.b = getCMSString(R.string.common_functions__all, new Object[0]);
        xvf0Var.d = 0L;
        xvf0Var.c = H1(0.0d, this.d0);
        ArrayList arrayList = this.N;
        arrayList.add(xvf0Var);
        xvf0 xvf0Var2 = new xvf0();
        xvf0Var2.b = getCMSString(R.string.live___3_hours, new Object[0]);
        xvf0Var2.d = 3L;
        boolean zH1 = H1(3.0d, this.d0);
        xvf0Var2.c = zH1;
        this.g0 = zH1 ? xvf0Var2.b : null;
        arrayList.add(xvf0Var2);
        xvf0 xvf0Var3 = new xvf0();
        xvf0Var3.b = getCMSString(R.string.wap_home__today, new Object[0]);
        xvf0Var3.d = -1L;
        xvf0Var3.c = H1(-1.0d, this.d0);
        arrayList.add(xvf0Var3);
        int i3 = Calendar.getInstance().get(7);
        int i4 = i3 - 2;
        if (i4 < 0) {
            i4 = i3 + 5;
        }
        int i5 = i4 + 1;
        this.e0 = j020.c(i5);
        String[] strArrG = yrh0.g(this);
        if (i5 < 7) {
            while (i5 < 7) {
                xvf0 xvf0Var4 = new xvf0();
                xvf0Var4.b = strArrG[i5];
                i5++;
                long jC = j020.c(i5);
                xvf0Var4.d = jC;
                xvf0Var4.c = H1(jC, this.d0);
                arrayList.add(xvf0Var4);
            }
        }
        int i6 = 0;
        while (i6 < i4) {
            xvf0 xvf0Var5 = new xvf0();
            xvf0Var5.b = strArrG[i6];
            i6++;
            long jC2 = j020.c(i6);
            xvf0Var5.d = jC2;
            xvf0Var5.c = H1(jC2, this.d0);
            arrayList.add(xvf0Var5);
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            g1f0 g1f0Var = (g1f0) obj;
            if (g1f0Var.c) {
                this.g0 = g1f0Var.b;
                break;
            }
        }
        G1();
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(of20.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        of20 of20Var = (of20) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        this.A0 = of20Var;
        of20Var.D.f(this, new qg20(this, i2));
        of20 of20Var2 = this.A0;
        of20Var2.i.p(new kut(of20Var2, i));
        of20Var2.v.a(new ve20(of20Var2, i2));
        v8i0 viewModelStore2 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory2 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras2 = getDefaultViewModelCreationExtras();
        viewModelStore2.getClass();
        defaultViewModelProviderFactory2.getClass();
        defaultViewModelCreationExtras2.getClass();
        s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, defaultViewModelCreationExtras2);
        dq7 dq7VarA2 = jq40.a(bj30.class);
        String strI2 = dq7VarA2.i();
        if (strI2 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        bj30 bj30Var = (bj30) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
        this.C0 = bj30Var;
        bj30Var.b.f(this, new lfy() { // from class: ah20
            @Override // defpackage.lfy
            public final void u1(Object obj2) {
                bj30.a aVar = (bj30.a) obj2;
                int i8 = PreMatchMyFavoriteActivity.b1;
                boolean z = aVar instanceof bj30.a.C0128a;
                PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = this.a;
                if (z) {
                    preMatchMyFavoriteActivity.Q1(((bj30.a.C0128a) aVar).a);
                    preMatchMyFavoriteActivity.E1(false);
                    preMatchMyFavoriteActivity.D1();
                    return;
                }
                List<RegularMarketRule> list = ((bj30.a.b) aVar).a;
                preMatchMyFavoriteActivity.A.clear();
                rs40.b().a();
                preMatchMyFavoriteActivity.Q.setText(preMatchMyFavoriteActivity.getCMSString(R.string.common_functions__league, new Object[0]));
                preMatchMyFavoriteActivity.b0 = list.get(0).a;
                preMatchMyFavoriteActivity.E1(false);
                preMatchMyFavoriteActivity.Q1(list);
                final MyFavoriteLivePanel myFavoriteLivePanel = preMatchMyFavoriteActivity.L0;
                if (myFavoriteLivePanel != null) {
                    String str = preMatchMyFavoriteActivity.c0;
                    myFavoriteLivePanel.setFixedSport(str);
                    if (myFavoriteLivePanel.a0) {
                        QuickMarketHelper.fetch(myFavoriteLivePanel.A, str, new QuickMarketHelper.FetchCallback() { // from class: fxw
                            @Override // com.sportybet.plugin.realsports.data.QuickMarketHelper.FetchCallback
                            public final void onResult(List list2) {
                                MyFavoriteLivePanel myFavoriteLivePanel2 = myFavoriteLivePanel;
                                int i9 = MyFavoriteLivePanel.p0;
                                synchronized (myFavoriteLivePanel2.K) {
                                    myFavoriteLivePanel2.z(list2);
                                }
                                myFavoriteLivePanel2.o0.a.removeAllViews();
                                myFavoriteLivePanel2.B.clear();
                                myFavoriteLivePanel2.D(true);
                                myFavoriteLivePanel2.v(false);
                            }
                        });
                    }
                }
            }
        });
        v8i0 viewModelStore3 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory3 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras3 = getDefaultViewModelCreationExtras();
        viewModelStore3.getClass();
        defaultViewModelProviderFactory3.getClass();
        defaultViewModelCreationExtras3.getClass();
        s8i0 s8i0Var3 = new s8i0(viewModelStore3, defaultViewModelProviderFactory3, defaultViewModelCreationExtras3);
        dq7 dq7VarA3 = jq40.a(trs.class);
        String strI3 = dq7VarA3.i();
        if (strI3 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        trs trsVar = (trs) s8i0Var3.a(dq7VarA3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI3));
        this.D0 = trsVar;
        trsVar.c.f(this, new lfy() { // from class: jh20
            @Override // defpackage.lfy
            public final void u1(Object obj2) {
                TextView textView;
                Integer num = (Integer) obj2;
                int i8 = PreMatchMyFavoriteActivity.b1;
                if (num == null || (textView = this.a.t0) == null) {
                    return;
                }
                textView.setText(String.valueOf(num));
            }
        });
        this.D0.d.f(this, new lfy() { // from class: lh20
            @Override // defpackage.lfy
            public final void u1(Object obj2) {
                int i8 = PreMatchMyFavoriteActivity.b1;
                int iIntValue = ((Integer) obj2).intValue();
                PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = this.a;
                preMatchMyFavoriteActivity.v0 = iIntValue;
                if (iIntValue <= 0) {
                    preMatchMyFavoriteActivity.R0 = false;
                }
                preMatchMyFavoriteActivity.O1();
            }
        });
        this.D0.a.f(this, new lfy() { // from class: mh20
            @Override // defpackage.lfy
            public final void u1(Object obj2) {
                int i8;
                LiveEventChange liveEventChange = (LiveEventChange) obj2;
                int i9 = PreMatchMyFavoriteActivity.b1;
                if (liveEventChange != null) {
                    boolean z = liveEventChange.add;
                    PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = this.a;
                    int i10 = preMatchMyFavoriteActivity.v0;
                    if (z) {
                        i8 = i10 + 1;
                        preMatchMyFavoriteActivity.v0 = i8;
                    } else {
                        i8 = i10 - 1;
                        preMatchMyFavoriteActivity.v0 = i8;
                    }
                    int i11 = i8;
                    if (i8 < 0) {
                        preMatchMyFavoriteActivity.v0 = 0;
                        i11 = 0;
                    }
                    if (i11 <= 0) {
                        preMatchMyFavoriteActivity.R0 = false;
                    }
                    preMatchMyFavoriteActivity.O1();
                    preMatchMyFavoriteActivity.D0.a.m(null);
                }
            }
        });
        v8i0 viewModelStore4 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory4 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras4 = getDefaultViewModelCreationExtras();
        viewModelStore4.getClass();
        defaultViewModelProviderFactory4.getClass();
        defaultViewModelCreationExtras4.getClass();
        s8i0 s8i0Var4 = new s8i0(viewModelStore4, defaultViewModelProviderFactory4, defaultViewModelCreationExtras4);
        dq7 dq7VarA4 = jq40.a(sn20.class);
        String strI4 = dq7VarA4.i();
        if (strI4 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.E0 = (sn20) s8i0Var4.a(dq7VarA4, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI4));
        v8i0 viewModelStore5 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory5 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras5 = getDefaultViewModelCreationExtras();
        viewModelStore5.getClass();
        defaultViewModelProviderFactory5.getClass();
        defaultViewModelCreationExtras5.getClass();
        s8i0 s8i0Var5 = new s8i0(viewModelStore5, defaultViewModelProviderFactory5, defaultViewModelCreationExtras5);
        dq7 dq7VarA5 = jq40.a(ruy.class);
        String strI5 = dq7VarA5.i();
        if (strI5 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        ruy ruyVar = (ruy) s8i0Var5.a(dq7VarA5, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI5));
        this.F0 = ruyVar;
        ((njs) ruyVar.d.getValue()).f(this, new lfy() { // from class: nh20
            @Override // defpackage.lfy
            public final void u1(Object obj2) {
                uvy uvyVar = (uvy) obj2;
                int i8 = PreMatchMyFavoriteActivity.b1;
                if (uvyVar == null) {
                    return;
                }
                PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = this.a;
                preMatchMyFavoriteActivity.L0.setupUpMarketViews();
                preMatchMyFavoriteActivity.P1();
                if (preMatchMyFavoriteActivity.F1()) {
                    preMatchMyFavoriteActivity.O1();
                    bj30 bj30Var2 = preMatchMyFavoriteActivity.C0;
                    QuickMarketSpotEnum quickMarketSpotEnum = preMatchMyFavoriteActivity.b;
                    String str = preMatchMyFavoriteActivity.c0;
                    bj30Var2.getClass();
                    quickMarketSpotEnum.getClass();
                    str.getClass();
                    QuickMarketHelper.fetch(quickMarketSpotEnum, str, new wi30(true, bj30Var2));
                }
            }
        });
        ruy ruyVar2 = this.F0;
        ruyVar2.getClass();
        ruy.x1(ruyVar2);
        v8i0 viewModelStore6 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory6 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras6 = getDefaultViewModelCreationExtras();
        viewModelStore6.getClass();
        defaultViewModelProviderFactory6.getClass();
        defaultViewModelCreationExtras6.getClass();
        s8i0 s8i0Var6 = new s8i0(viewModelStore6, defaultViewModelProviderFactory6, defaultViewModelCreationExtras6);
        dq7 dq7VarA6 = jq40.a(bsy.class);
        String strI6 = dq7VarA6.i();
        if (strI6 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.H0 = (bsy) s8i0Var6.a(dq7VarA6, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI6));
        v8i0 viewModelStore7 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory7 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras7 = getDefaultViewModelCreationExtras();
        viewModelStore7.getClass();
        defaultViewModelProviderFactory7.getClass();
        defaultViewModelCreationExtras7.getClass();
        s8i0 s8i0Var7 = new s8i0(viewModelStore7, defaultViewModelProviderFactory7, defaultViewModelCreationExtras7);
        dq7 dq7VarA7 = jq40.a(ijf.class);
        String strI7 = dq7VarA7.i();
        if (strI7 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.I0 = (ijf) s8i0Var7.a(dq7VarA7, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI7));
        v8i0 viewModelStore8 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory8 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras8 = getDefaultViewModelCreationExtras();
        viewModelStore8.getClass();
        defaultViewModelProviderFactory8.getClass();
        defaultViewModelCreationExtras8.getClass();
        s8i0 s8i0Var8 = new s8i0(viewModelStore8, defaultViewModelProviderFactory8, defaultViewModelCreationExtras8);
        dq7 dq7VarA8 = jq40.a(xlc.class);
        String strI8 = dq7VarA8.i();
        if (strI8 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.J0 = (xlc) s8i0Var8.a(dq7VarA8, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI8));
        v8i0 viewModelStore9 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory9 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras9 = getDefaultViewModelCreationExtras();
        viewModelStore9.getClass();
        defaultViewModelProviderFactory9.getClass();
        defaultViewModelCreationExtras9.getClass();
        s8i0 s8i0Var9 = new s8i0(viewModelStore9, defaultViewModelProviderFactory9, defaultViewModelCreationExtras9);
        dq7 dq7VarA9 = jq40.a(yh20.class);
        String strI9 = dq7VarA9.i();
        if (strI9 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        yh20 yh20Var = (yh20) s8i0Var9.a(dq7VarA9, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI9));
        this.B0 = yh20Var;
        yh20Var.c.f(this, new lfy() { // from class: oh20
            @Override // defpackage.lfy
            public final void u1(Object obj2) {
                int i8 = PreMatchMyFavoriteActivity.b1;
                if (((Boolean) obj2).booleanValue()) {
                    final PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = this.a;
                    preMatchMyFavoriteActivity.X0.setVisibility(0);
                    new Handler().postDelayed(new Runnable() { // from class: ih20
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i9 = PreMatchMyFavoriteActivity.b1;
                            PreMatchMyFavoriteActivity preMatchMyFavoriteActivity2 = preMatchMyFavoriteActivity;
                            preMatchMyFavoriteActivity2.X0.setVisibility(8);
                            yh20 yh20Var2 = preMatchMyFavoriteActivity2.B0;
                            yh20Var2.getClass();
                            ej5.c(o8i0.d(yh20Var2), null, null, new wh20(yh20Var2, null), 3);
                        }
                    }, 5000L);
                }
            }
        });
        this.y0 = zch0.b(getResources(), 44);
        this.s0 = (RelativeLayout) findViewById(R.id.live_container);
        findViewById(R.id.live_events).setOnClickListener(new View.OnClickListener() { // from class: ph20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8 = PreMatchMyFavoriteActivity.b1;
                f00 f00Var = vgb0.a;
                vgb0.a("Sort_LiveClick");
                PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = this.a;
                Intent intent = new Intent(preMatchMyFavoriteActivity, (Class<?>) LivePageActivity.class);
                intent.putExtra("key_sport_id", preMatchMyFavoriteActivity.c0);
                preMatchMyFavoriteActivity.startActivity(intent);
            }
        });
        this.t0 = (TextView) findViewById(R.id.live_count);
        this.K0 = findViewById(R.id.live_betting);
        this.u0 = (TextView) findViewById(R.id.live_betting_count);
        this.w0 = (ImageView) findViewById(R.id.live_betting_arrow);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.sports_frame);
        LoadingView loadingView = new LoadingView(this);
        this.X = loadingView;
        loadingView.setBackgroundColor(getColor(R.color.background_type1_secondary));
        this.X.setOnClickListener(new okp(this, i));
        this.X.b(new qh20());
        frameLayout.addView(this.X);
        this.F = (TextView) findViewById(R.id.sports_no_match);
        this.G = (ImageView) findViewById(R.id.sports_no_match_icon);
        this.M0 = (LinearLayout) findViewById(R.id.live_tabs_container);
        this.N0 = (OneUpTwoUpSwitch) findViewById(R.id.live_one_up_two_up_switch);
        this.O0 = (OUEarlyGoalsSwitch) findViewById(R.id.live_ou_early_goals_switch);
        this.P0 = findViewById(R.id.live_market_option_divider);
        this.Q0 = (BubbleView) findViewById(R.id.live_market_option_feature_alert);
        MyFavoriteLivePanel myFavoriteLivePanel = (MyFavoriteLivePanel) findViewById(R.id.live_panel);
        this.L0 = myFavoriteLivePanel;
        myFavoriteLivePanel.setActionListener(this);
        this.L0.setOneTwoUpStateDelegate(this.S0);
        this.L0.setOuEarlyGoalsCoordinator(this.T0);
        this.L0.setSportTabLayout((TabLayout) findViewById(R.id.live_sport_tab));
        this.L0.setMarketTabLayout((TabLayout) findViewById(R.id.live_market_tab));
        this.L0.setMarketTitle((RelativeLayout) findViewById(R.id.live_market_title));
        this.L0.setMarketOptionViews(this.N0, this.O0, this.P0, this.Q0);
        MyFavoriteLivePanel myFavoriteLivePanel2 = this.L0;
        myFavoriteLivePanel2.W = false;
        myFavoriteLivePanel2.setFixedSport(this.c0);
        this.L0.setViewModel(this.D0);
        iu2.a(this.L0);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.sports_recycler_view);
        this.H = recyclerView;
        recyclerView.setItemAnimator(null);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.layout_swipe_refresh);
        this.J = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        this.K = (ConsecutiveScrollerLayout) findViewById(R.id.scroll_container);
        TextView textView = (TextView) findViewById(R.id.add_more_settings);
        this.X0 = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: rg20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8 = PreMatchMyFavoriteActivity.b1;
                this.a.A1();
            }
        });
        this.W0 = (TextView) findViewById(R.id.sport_title);
        this.V0 = (ImageButton) findViewById(R.id.add_my_favorite);
        this.Y0 = (MyFavoriteEmptyLayout) findViewById(R.id.my_favorite_empty_layout);
        this.U0 = (RelativeLayout) findViewById(R.id.action_bar);
        this.V0.setOnClickListener(new View.OnClickListener() { // from class: wg20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8 = PreMatchMyFavoriteActivity.b1;
                this.a.A1();
            }
        });
        findViewById(R.id.go_back).setOnClickListener(new View.OnClickListener() { // from class: xg20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8 = PreMatchMyFavoriteActivity.b1;
                this.a.getOnBackPressedDispatcher().d();
            }
        });
        this.Y0.setPickMyFavouritesOnClickListener(new View.OnClickListener() { // from class: yg20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8 = PreMatchMyFavoriteActivity.b1;
                xxw xxwVar = izw.a;
                int i9 = MyFavoriteTutorialActivity.i;
                PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = this.a;
                preMatchMyFavoriteActivity.startActivity(new Intent(preMatchMyFavoriteActivity, (Class<?>) MyFavoriteTutorialActivity.class));
            }
        });
        final int color = getColor(R.color.text_type1_primary);
        final int color2 = getColor(R.color.brand_quaternary);
        PreMatchSpinnerTextView preMatchSpinnerTextView = (PreMatchSpinnerTextView) findViewById(R.id.time_btn);
        this.P = preMatchSpinnerTextView;
        preMatchSpinnerTextView.setTag(0);
        if (!TextUtils.isEmpty(this.g0)) {
            this.P.setText(B1(this.g0));
        }
        this.P.setOnClickListener(this);
        PreMatchSpinnerTextView preMatchSpinnerTextView2 = (PreMatchSpinnerTextView) findViewById(R.id.regions_btn);
        this.Q = preMatchSpinnerTextView2;
        preMatchSpinnerTextView2.setTag(2);
        this.Q.setOnClickListener(this);
        this.R = findViewById(R.id.sports_top_container);
        this.S = findViewById(R.id.sports_expand_tab_layout);
        this.Y = new PopOneListView(this);
        this.Z = new PopOneListView(this);
        this.a0 = new RegionsListView(this);
        this.Y.setOnSelectListener(new PopOneListView.a() { // from class: eh20
            @Override // com.sportybet.plugin.realsports.sportssoccer.expandview.PopOneListView.a
            public final void a(int i8) {
                int i9 = PreMatchMyFavoriteActivity.b1;
                PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = this.a;
                preMatchMyFavoriteActivity.I1();
                ArrayList arrayList2 = preMatchMyFavoriteActivity.N;
                if (i8 < arrayList2.size()) {
                    g1f0 g1f0Var2 = (g1f0) arrayList2.get(i8);
                    if (!g1f0Var2.c) {
                        preMatchMyFavoriteActivity.P.setTextColor(TextUtils.equals(preMatchMyFavoriteActivity.getCMSString(R.string.common_functions__all, new Object[0]), g1f0Var2.b) ? color : color2);
                        preMatchMyFavoriteActivity.P.setText(preMatchMyFavoriteActivity.B1(g1f0Var2.b));
                        int size2 = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            ((g1f0) obj2).c = false;
                        }
                        g1f0Var2.c = true;
                        PopOneListView popOneListView = preMatchMyFavoriteActivity.Y;
                        h220 h220Var = popOneListView.b;
                        h220Var.a = arrayList2;
                        popOneListView.a.setAdapter((ListAdapter) h220Var);
                    }
                    xvf0 xvf0Var6 = (xvf0) g1f0Var2;
                    if (PreMatchMyFavoriteActivity.H1(preMatchMyFavoriteActivity.d0, xvf0Var6.d)) {
                        return;
                    }
                    preMatchMyFavoriteActivity.d0 = xvf0Var6.d;
                    preMatchMyFavoriteActivity.E1(false);
                    long j = preMatchMyFavoriteActivity.d0;
                    if (j == 0 || j == 3) {
                        preMatchMyFavoriteActivity.E = 0L;
                        preMatchMyFavoriteActivity.D = 0L;
                        preMatchMyFavoriteActivity.m0 = j;
                    } else if (j != -1) {
                        preMatchMyFavoriteActivity.D = j;
                        preMatchMyFavoriteActivity.E = j + 86399999;
                        preMatchMyFavoriteActivity.m0 = -1L;
                    } else {
                        long j2 = preMatchMyFavoriteActivity.e0;
                        preMatchMyFavoriteActivity.D = j2;
                        preMatchMyFavoriteActivity.E = j2 + 86399999;
                        preMatchMyFavoriteActivity.m0 = -1L;
                    }
                }
            }
        });
        this.Z.setOnSelectListener(new PopOneListView.a() { // from class: fh20
            @Override // com.sportybet.plugin.realsports.sportssoccer.expandview.PopOneListView.a
            public final void a(int i8) {
                int i9 = PreMatchMyFavoriteActivity.b1;
                PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = this.a;
                preMatchMyFavoriteActivity.I1();
                ArrayList arrayList2 = preMatchMyFavoriteActivity.O;
                if (i8 < arrayList2.size()) {
                    g1f0 g1f0Var2 = (g1f0) arrayList2.get(i8);
                    if (!g1f0Var2.c) {
                        preMatchMyFavoriteActivity.W0.setText(g1f0Var2.b);
                        int size2 = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            ((g1f0) obj2).c = false;
                        }
                        g1f0Var2.c = true;
                        PopOneListView popOneListView = preMatchMyFavoriteActivity.Z;
                        h220 h220Var = popOneListView.b;
                        h220Var.a = arrayList2;
                        popOneListView.a.setAdapter((ListAdapter) h220Var);
                        preMatchMyFavoriteActivity.H.o0(0);
                    }
                    preMatchMyFavoriteActivity.K1(((qfb0) g1f0Var2).d, false);
                }
            }
        });
        this.a0.setOnApplyClickListener(new RegionsListView.a() { // from class: gh20
            @Override // com.sportybet.plugin.realsports.sportssoccer.expandview.RegionsListView.a
            public final void a(String str, boolean z) {
                int i8 = PreMatchMyFavoriteActivity.b1;
                PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = this.a;
                preMatchMyFavoriteActivity.Q.setTextColor(str.equals(preMatchMyFavoriteActivity.getCMSString(R.string.common_functions__league, new Object[0])) ? color : color2);
                preMatchMyFavoriteActivity.Q.setText(str);
                ArrayList arrayList2 = preMatchMyFavoriteActivity.A;
                arrayList2.clear();
                ArrayList arrayListC = rs40.b().c();
                if (arrayListC.size() > 0) {
                    arrayList2.addAll(arrayListC);
                }
                ArrayList arrayList3 = preMatchMyFavoriteActivity.N;
                int size2 = arrayList3.size();
                int i9 = 0;
                while (i9 < size2) {
                    Object obj2 = arrayList3.get(i9);
                    i9++;
                    if (((g1f0) obj2).c) {
                        preMatchMyFavoriteActivity.E1(false);
                        preMatchMyFavoriteActivity.I1();
                    }
                }
                ((g1f0) arrayList3.get(0)).c = true;
                preMatchMyFavoriteActivity.d0 = 0L;
                preMatchMyFavoriteActivity.P.setText(preMatchMyFavoriteActivity.B1(((g1f0) arrayList3.get(0)).b));
                PopOneListView popOneListView = preMatchMyFavoriteActivity.Y;
                h220 h220Var = popOneListView.b;
                h220Var.a = arrayList3;
                popOneListView.a.setAdapter((ListAdapter) h220Var);
                preMatchMyFavoriteActivity.E1(false);
                preMatchMyFavoriteActivity.I1();
            }
        });
        PopOneListView popOneListView = this.Y;
        h220 h220Var = popOneListView.b;
        h220Var.a = arrayList;
        popOneListView.a.setAdapter((ListAdapter) h220Var);
        PopOneListView popOneListView2 = this.Z;
        h220 h220Var2 = popOneListView2.b;
        h220Var2.a = this.O;
        popOneListView2.a.setAdapter((ListAdapter) h220Var2);
        z1(this.Y, 0);
        z1(this.Z, 1);
        z1(this.a0, 2);
        this.W0.setTag(1);
        this.W0.setOnClickListener(new View.OnClickListener() { // from class: hh20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i8 = PreMatchMyFavoriteActivity.b1;
                PreMatchMyFavoriteActivity preMatchMyFavoriteActivity = this.a;
                preMatchMyFavoriteActivity.T = ((Integer) preMatchMyFavoriteActivity.W0.getTag()).intValue();
                preMatchMyFavoriteActivity.C1(preMatchMyFavoriteActivity.U0, false);
                preMatchMyFavoriteActivity.L1();
            }
        });
        if (!TextUtils.isEmpty(this.h0)) {
            this.W0.setText(this.h0);
        }
        L1();
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        this.n0 = tabLayout;
        tabLayout.setTabMode(0);
        this.n0.a(this);
        this.o0 = (OneUpTwoUpSwitch) findViewById(R.id.pre_match_one_up_two_up_switch);
        ity ityVarA = this.z.a(gty.d, new ety() { // from class: zg20
            @Override // defpackage.ety
            public final void a() {
                avy avyVar = avy.a;
                int i8 = PreMatchMyFavoriteActivity.b1;
                hih0.c(this.a.o0, avyVar, true, false);
            }
        }, new rty() { // from class: bh20
            @Override // defpackage.rty
            public final void a() {
                int i8 = PreMatchMyFavoriteActivity.b1;
                fty.a(this.a.H);
            }
        });
        this.G0 = ityVarA;
        ityVarA.c(this);
        this.o0.setOnStateChangedListener(new rh20(this));
        OUEarlyGoalsSwitch oUEarlyGoalsSwitch = (OUEarlyGoalsSwitch) findViewById(R.id.pre_match_ou_early_goals_switch);
        this.p0 = oUEarlyGoalsSwitch;
        oUEarlyGoalsSwitch.setOnStateChangedListener(new ch20(this));
        this.q0 = findViewById(R.id.pre_match_market_option_divider);
        BubbleView bubbleView = (BubbleView) findViewById(R.id.pre_match_market_option_feature_alert);
        this.r0 = bubbleView;
        bubbleView.setOnClickedClose(new c2b(this, i));
        gby.a(this.r0.getDescriptionView(), new ekp(this, i));
        N1();
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        k0e0 k0e0Var = this.I;
        if (k0e0Var != null) {
            k0e0Var.b();
        }
        if (izw.a()) {
            iu2.q(this);
            rs40.b().a();
            iu2.q(this.L0);
        }
        MyFavoriteLivePanel myFavoriteLivePanel = this.L0;
        djs djsVar = myFavoriteLivePanel.R;
        if (djsVar != null) {
            djsVar.y = null;
            HashMap map = djsVar.w;
            if (map != null) {
                map.clear();
            }
        }
        HashMap map2 = myFavoriteLivePanel.B;
        if (map2 != null) {
            map2.clear();
        }
        QuickMarketHelper.disposeAll();
        super.onDestroy();
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (izw.a()) {
            ((br3) mmc.a(hp0.A, br3.class)).U().K = null;
            this.L0.getClass();
        }
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (izw.a()) {
            boolean z = true;
            if (Boolean.TRUE.equals(this.A0.h0.d())) {
                boolean z2 = this.c0 == null;
                this.k0 = 1;
                this.l0 = -1;
                N1();
                F1();
                this.L0.setFixedSport(this.c0);
                G1();
                ArrayList arrayList = this.O;
                PopOneListView popOneListView = this.Z;
                h220 h220Var = popOneListView.b;
                h220Var.a = arrayList;
                popOneListView.a.setAdapter((ListAdapter) h220Var);
                if (!TextUtils.isEmpty(this.h0)) {
                    this.W0.setText(this.h0);
                }
                if (z2) {
                    O1();
                    bj30 bj30Var = this.C0;
                    QuickMarketSpotEnum quickMarketSpotEnum = this.b;
                    String str = this.c0;
                    bj30Var.getClass();
                    quickMarketSpotEnum.getClass();
                    str.getClass();
                    QuickMarketHelper.fetch(quickMarketSpotEnum, str, new wi30(z, bj30Var));
                } else {
                    K1(this.c0, true);
                }
            }
            this.A0.g0.j(Boolean.FALSE);
            ((br3) mmc.a(hp0.A, br3.class)).U().K = new c();
            ((br3) mmc.a(hp0.A, br3.class)).U().a(this, true);
            MyFavoriteLivePanel myFavoriteLivePanel = this.L0;
            if (myFavoriteLivePanel.P) {
                myFavoriteLivePanel.P = false;
                myFavoriteLivePanel.C();
            }
            this.L0.u();
        }
    }

    @Override // defpackage.r1k, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onStart() {
        super.onStart();
        dty dtyVar = this.G0.g;
        dtyVar.a.clear();
        dtyVar.b = false;
        if (izw.a()) {
            MyFavoriteLivePanel myFavoriteLivePanel = this.L0;
            myFavoriteLivePanel.B(false);
            SocketPushManager.getInstance().subscribeTopic(new GroupTopic("live^sports"), myFavoriteLivePanel.n0);
        }
    }

    @Override // defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (izw.a()) {
            if (qz3.a()) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_MY_FAVORITE);
                aVar.a("[Socket] skip unSubscribe in Favorite", new Object[0]);
            } else {
                MyFavoriteLivePanel myFavoriteLivePanel = this.L0;
                myFavoriteLivePanel.D(false);
                SocketPushManager.getInstance().unsubscribeTopic(new GroupTopic("live^sports"), myFavoriteLivePanel.n0);
            }
        }
    }

    @Override // defpackage.ivw
    public final void t(boolean z) {
        if (!z) {
            this.F.setVisibility(8);
            this.G.setVisibility(8);
            this.H.setVisibility(0);
            return;
        }
        ((FrameLayout.LayoutParams) this.R.getLayoutParams()).topMargin = this.y0;
        this.R.requestLayout();
        this.F.setVisibility(0);
        this.G.setVisibility(0);
        this.F.setText(getCMSString(R.string.my_favourites__no_events_found, new Object[0]));
        this.H.setVisibility(8);
    }

    @Override // defpackage.wym
    public final boolean y() {
        return false;
    }

    public final void z1(ViewGroup viewGroup, int i) {
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.addView(viewGroup, new RelativeLayout.LayoutParams(-1, -1));
        this.V.add(i, relativeLayout);
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: kh20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = PreMatchMyFavoriteActivity.b1;
                this.a.I1();
            }
        });
    }
}
