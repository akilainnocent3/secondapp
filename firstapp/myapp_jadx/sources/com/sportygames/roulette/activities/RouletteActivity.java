package com.sportygames.roulette.activities;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.navigation.NavigationView;
import com.sportybet.android.account.Qr.QQWMbKFOuTf;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.components.SGConfirmDialogActivity;
import com.sportygames.commons.tw_commons.data.BaseResponse;
import com.sportygames.commons.utils.CasinoLogger;
import com.sportygames.commons.views.ExitDialogActivity;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.roulette.activities.RouletteActivity;
import com.sportygames.roulette.data.AssetsInfo;
import com.sportygames.roulette.data.BetResult;
import com.sportygames.roulette.data.LastBet;
import com.sportygames.roulette.data.LeftMenuButton;
import com.sportygames.roulette.data.LeftMenuButtonKey;
import com.sportygames.roulette.data.Market;
import com.sportygames.roulette.data.MenuIconSize;
import com.sportygames.roulette.data.RoundInfo;
import com.sportygames.roulette.util.HowToPlayView;
import com.sportygames.roulette.widget.LoadingView;
import com.sportygames.roulette.widget.RouletteView;
import com.sportygames.roulette.widget.TableGrid;
import com.sportygames.roulette.widget.WinningView;
import com.twilio.voice.EventKeys;
import defpackage.ax50;
import defpackage.b3;
import defpackage.bb;
import defpackage.bi50;
import defpackage.bx50;
import defpackage.cam;
import defpackage.cco;
import defpackage.ce;
import defpackage.cny;
import defpackage.cyb;
import defpackage.dq7;
import defpackage.dx50;
import defpackage.ee;
import defpackage.ex50;
import defpackage.fbn;
import defpackage.fq0;
import defpackage.fx50;
import defpackage.g2j;
import defpackage.g9i0;
import defpackage.gr0;
import defpackage.gv5;
import defpackage.gx50;
import defpackage.h51;
import defpackage.h8e;
import defpackage.hb5;
import defpackage.hbn;
import defpackage.hx50;
import defpackage.ipa0;
import defpackage.ix50;
import defpackage.jq40;
import defpackage.k7g;
import defpackage.kf9;
import defpackage.kit;
import defpackage.kv1;
import defpackage.l2j;
import defpackage.lv1;
import defpackage.m6f;
import defpackage.m8;
import defpackage.mpe0;
import defpackage.n4s;
import defpackage.no0;
import defpackage.nrz;
import defpackage.nzf0;
import defpackage.o6f;
import defpackage.on10;
import defpackage.ox50;
import defpackage.p3j;
import defpackage.pw50;
import defpackage.qlf;
import defpackage.qw50;
import defpackage.r6i0;
import defpackage.r8i0;
import defpackage.rx50;
import defpackage.s8i0;
import defpackage.ssw;
import defpackage.su5;
import defpackage.sw50;
import defpackage.sx50;
import defpackage.th8;
import defpackage.tx50;
import defpackage.ud;
import defpackage.ux50;
import defpackage.v8i0;
import defpackage.vx50;
import defpackage.wn20;
import defpackage.wx50;
import defpackage.wz;
import defpackage.xae;
import defpackage.xnh0;
import defpackage.xzk;
import defpackage.ypa0;
import defpackage.yw50;
import defpackage.yyf0;
import defpackage.z6e;
import defpackage.zw50;
import java.io.File;
import java.math.BigDecimal;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class RouletteActivity extends fq0 implements View.OnClickListener, SwipeRefreshLayout.f, bb {
    public static final int[] A0 = {R.id.chip1, R.id.chip2, R.id.chip3, R.id.chip4, R.id.chip5};
    public boolean A;
    public List<Long> B;
    public List<Market> C;
    public View E;
    public int F;
    public lv1 G;
    public LinearLayoutManager H;
    public long I;
    public View J;
    public View K;
    public View L;
    public View M;
    public TextView N;
    public TextView O;
    public WinningView P;
    public View Q;
    public RouletteView R;
    public GridLayout S;
    public RecyclerView T;
    public HowToPlayView U;
    public boolean V;
    public List<RoundInfo> W;
    public h51 X;
    public boolean Y;
    public ViewGroup Z;
    public HistoryActivity a0;
    public TextView b;
    public View b0;
    public SpinKitView c0;
    public String d0;
    public boolean e0;
    public boolean f0;
    public RouletteActivity g0;
    public ArrayList<GameDetails> h0;
    public ConstraintLayout i;
    public ConstraintLayout i0;
    public DrawerLayout j0;
    public TextView k0;
    public LinearLayout l0;
    public ImageView m0;
    public ProgressMeterComponent n0;
    public boolean o0;
    public TextView p0;
    public ImageView q0;
    public int r0;
    public View s0;
    public ipa0 u0;
    public LoadingView v;
    public o6f w0;
    public SwipeRefreshLayout y;
    public boolean z;
    public AssetsInfo z0;
    public final no0 a = ux50.a();
    public final TableGrid[] c = new TableGrid[22];
    public long d = -18493478;
    public final int[] e = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 4, 4, 1, 1, 3, 3, 2, 2};
    public final List<String> f = Arrays.asList("[0]", "[1]", "[2]", "[3]", "[4]", "[5]", "[6]", "[7]", "[8]", "[9]", "[10]", "[11]", "[12]", "[1,4,7,10]", "[2,5,8,11]", "[3,6,9,12]", "[1,3,5,8,10,12]", "[2,4,6,7,9,11]", "[1,3,5,7,9,11]", "[2,4,6,8,10,12]", "[1,2,3,4,5,6]", "[7,8,9,10,11,12]");
    public final TextView[] w = new TextView[5];
    public SparseArray<Market> D = new SparseArray<>();
    public final ssw<Long> t0 = new ssw<>();
    public final m6f v0 = new m6f();
    public final HashSet x0 = new HashSet();
    public final ee<Intent> y0 = registerForActivityResult(new ce(), new i());

    /* JADX INFO: loaded from: classes6.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            RouletteActivity rouletteActivity = RouletteActivity.this;
            if (rouletteActivity.n0.getVisibility() == 8) {
                rouletteActivity.G1(201);
            }
            rouletteActivity.E.setSelected(false);
            view.setSelected(true);
            rouletteActivity.E = view;
            int iIntValue = ((Integer) view.getTag()).intValue();
            rouletteActivity.F = iIntValue;
            List<Long> list = rouletteActivity.B;
            if (list == null || iIntValue < 0 || iIntValue >= list.size()) {
                return;
            }
            wn20.d(rouletteActivity.B.get(rouletteActivity.F).longValue(), "roulette", "chip_value", true, rouletteActivity.g0);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ int a;

        public b(int i) {
            this.a = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i;
            RouletteActivity rouletteActivity = RouletteActivity.this;
            rouletteActivity.G1(201);
            if (SportyGamesManager.getInstance().getUser() == null) {
                SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                return;
            }
            List<Long> list = rouletteActivity.B;
            if (list == null || (i = rouletteActivity.F) < 0 || i >= list.size()) {
                return;
            }
            SparseArray<Market> sparseArray = rouletteActivity.D;
            int[] iArr = rouletteActivity.e;
            int i2 = this.a;
            if (sparseArray.get(iArr[i2]) == null) {
                return;
            }
            TableGrid tableGrid = rouletteActivity.c[i2];
            int i3 = rouletteActivity.F;
            tableGrid.a(i3, rouletteActivity.B.get(i3).longValue(), true);
            rouletteActivity.I = rouletteActivity.B.get(rouletteActivity.F).longValue() + rouletteActivity.I;
            rouletteActivity.K1();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public class c extends AnimatorListenerAdapter {
        public final /* synthetic */ long a;

        public c(long j) {
            this.a = j;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            RouletteActivity.this.d = this.a;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public class d implements View.OnClickListener {
        public final /* synthetic */ PopupWindow a;

        public d(PopupWindow popupWindow) {
            this.a = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.dismiss();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public class e implements View.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ String b;

        public e(int i, String str) {
            this.a = i;
            this.b = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            RouletteActivity rouletteActivity = RouletteActivity.this;
            rouletteActivity.G1(r.d.DEFAULT_DRAG_ANIMATION_DURATION);
            if (SportyGamesManager.getInstance().getUser() == null) {
                rouletteActivity.Q.setVisibility(8);
                SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                return;
            }
            if (rouletteActivity.I == 0) {
                rouletteActivity.Q.setVisibility(8);
                rouletteActivity.y1(rouletteActivity.getString(R.string.sg_game_roulette__please_make_some_bets_first));
                return;
            }
            int i = this.a;
            rouletteActivity.X = new h51(i, i);
            String str = this.b;
            if (str != null) {
                try {
                    if (Float.parseFloat(str) > 0.001f) {
                        rouletteActivity.X.e = str;
                    }
                } catch (Exception unused) {
                }
            }
            rouletteActivity.u1();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public class f implements gv5<BaseResponse<BetResult>> {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                RouletteActivity rouletteActivity = RouletteActivity.this;
                if (rouletteActivity.isFinishing()) {
                    return;
                }
                h51 h51Var = rouletteActivity.X;
                if (h51Var == null || h51Var.a == 0 || h51Var.g) {
                    rouletteActivity.L.setVisibility(8);
                    rouletteActivity.R1();
                    rouletteActivity.X = null;
                    return;
                }
                rouletteActivity.N.setText(R.string.sg_game_roulette__next_round_about_to_start);
                rouletteActivity.M.setEnabled(false);
                if (rouletteActivity.Y) {
                    rouletteActivity.u1();
                } else {
                    rouletteActivity.V = true;
                    rouletteActivity.L.setVisibility(8);
                }
            }
        }

        public f() {
        }

        @Override // defpackage.gv5
        public final void onFailure(su5<BaseResponse<BetResult>> su5Var, Throwable th) {
            RouletteActivity rouletteActivity = RouletteActivity.this;
            if (rouletteActivity.isFinishing()) {
                return;
            }
            int[] iArr = RouletteActivity.A0;
            rouletteActivity.x1();
            String string = rouletteActivity.getString(R.string.sg_common_feedback__something_went_wrong_tip);
            if ((th instanceof ConnectException) || (th instanceof UnknownHostException)) {
                string = rouletteActivity.getString(R.string.sg_common_feedback__please_check_your_internet_connection_and_try_again);
            }
            String str = string;
            if (rouletteActivity.isFinishing() || rouletteActivity.isDestroyed()) {
                return;
            }
            vx50 vx50Var = new vx50(rouletteActivity);
            vx50Var.b(str, rouletteActivity.getString(R.string.sg_common_functions__ok), null, new h8e(this, 2), new bx50());
            vx50Var.a();
            rouletteActivity.v.setVisibility(8);
        }

        @Override // defpackage.gv5
        public final void onResponse(su5<BaseResponse<BetResult>> su5Var, bi50<BaseResponse<BetResult>> bi50Var) {
            Response response = bi50Var.a;
            final RouletteActivity rouletteActivity = RouletteActivity.this;
            if (rouletteActivity.isFinishing()) {
                return;
            }
            rouletteActivity.v.setVisibility(8);
            rouletteActivity.x1();
            if (!response.getIsSuccessful()) {
                int iCode = response.code();
                if (iCode == 401 || iCode == 403) {
                    SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                    return;
                } else {
                    onFailure(su5Var, null);
                    return;
                }
            }
            BaseResponse<BetResult> baseResponse = bi50Var.b;
            if (baseResponse != null) {
                int i = baseResponse.bizCode;
                int i2 = 1;
                if (i == 4200) {
                    if (rouletteActivity.isFinishing() || rouletteActivity.isDestroyed()) {
                        return;
                    }
                    final vx50 vx50Var = new vx50(rouletteActivity);
                    vx50Var.b(rouletteActivity.getString(R.string.sg_rut_err_8009), rouletteActivity.g0.getString(R.string.label_dialog_add_money), rouletteActivity.g0.getString(R.string.sg_common_functions__cancel), new Function0() { // from class: ow50
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int[] iArr = RouletteActivity.A0;
                            RouletteActivity rouletteActivity2 = rouletteActivity;
                            h51 h51Var = rouletteActivity2.X;
                            if (h51Var == null) {
                                rouletteActivity2.L.setVisibility(8);
                                rouletteActivity2.K.performClick();
                            } else if (h51Var.a() > 1) {
                                rouletteActivity2.V = true;
                            }
                            SportyGamesManager.getInstance().gotoSportyBet(xae.c, null);
                            vx50Var.dismiss();
                            return null;
                        }
                    }, new g2j(rouletteActivity, i2));
                    vx50Var.a();
                    return;
                }
                if (i == 4220) {
                    if (rouletteActivity.isFinishing() || rouletteActivity.isDestroyed()) {
                        return;
                    }
                    vx50 vx50Var2 = new vx50(rouletteActivity);
                    vx50Var2.b(rouletteActivity.getString(R.string.sg_game_roulette__frozen, RouletteActivity.w1()), rouletteActivity.getString(R.string.sg_common_functions__ok), null, new Function0() { // from class: cx50
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            RouletteActivity rouletteActivity2 = RouletteActivity.this;
                            if (rouletteActivity2.X.a() > 1) {
                                rouletteActivity2.R1();
                                rouletteActivity2.L.setVisibility(8);
                            }
                            rouletteActivity2.X = null;
                            return null;
                        }
                    }, new dx50());
                    vx50Var2.a();
                    return;
                }
                if (i != 10000) {
                    if (i == 19000) {
                        if (rouletteActivity.isFinishing() || rouletteActivity.isDestroyed()) {
                            return;
                        }
                        vx50 vx50Var3 = new vx50(rouletteActivity);
                        vx50Var3.b(baseResponse.message, rouletteActivity.getString(R.string.sg_common_functions__exit), null, new p3j(this, i2), new ex50());
                        vx50Var3.a();
                        return;
                    }
                    if (rouletteActivity.X.a() != 1) {
                        if (rouletteActivity.isFinishing() || rouletteActivity.isDestroyed()) {
                            return;
                        }
                        vx50 vx50Var4 = new vx50(rouletteActivity);
                        vx50Var4.b(TextUtils.isEmpty(baseResponse.message) ? rouletteActivity.getString(R.string.sg_sporty_bingo__purchase_confirm) : baseResponse.message, rouletteActivity.getString(R.string.sg_common_functions__ok), null, new cco(this, i2), new hx50());
                        vx50Var4.a();
                        return;
                    }
                    if (baseResponse.message == null || rouletteActivity.isFinishing() || rouletteActivity.isDestroyed()) {
                        return;
                    }
                    vx50 vx50Var5 = new vx50(rouletteActivity);
                    vx50Var5.b(baseResponse.message, rouletteActivity.getString(R.string.sg_common_functions__ok), null, new fx50(this, 0), new gx50());
                    vx50Var5.a();
                    return;
                }
                rouletteActivity.C1(false);
                if (baseResponse.data != null) {
                    if (rouletteActivity.X.a() == 1) {
                        rouletteActivity.X.c = baseResponse.data.betId;
                    }
                    rouletteActivity.X.a--;
                    lv1 lv1Var = rouletteActivity.G;
                    BetResult betResult = baseResponse.data;
                    String str = betResult.result;
                    boolean z = betResult.winningStatus == 1;
                    lv1Var.getClass();
                    kv1 kv1Var = new kv1();
                    kv1Var.a = str;
                    kv1Var.b = z;
                    lv1Var.a.add(0, kv1Var);
                    lv1Var.notifyItemInserted(0);
                    rouletteActivity.H.H0(0);
                    rouletteActivity.J.setVisibility(8);
                    rouletteActivity.l0.setVisibility(4);
                    rouletteActivity.m0.setVisibility(4);
                    int i3 = Integer.parseInt(baseResponse.data.result);
                    rouletteActivity.N.setVisibility(0);
                    h51 h51Var = rouletteActivity.X;
                    String str2 = h51Var.e;
                    TextView textView = rouletteActivity.N;
                    if (str2 == null) {
                        textView.setText(rouletteActivity.getString(R.string.sg_game_roulette__round_left, String.valueOf(h51Var.a), rouletteActivity.X.a <= 1 ? "" : "s"));
                    } else {
                        String strValueOf = String.valueOf(h51Var.a);
                        h51 h51Var2 = rouletteActivity.X;
                        textView.setText(rouletteActivity.getString(R.string.sg_game_roulette__round_left_bonus, strValueOf, h51Var2.a <= 1 ? "" : "s", h51Var2.e));
                    }
                    rouletteActivity.M.setVisibility(0);
                    rouletteActivity.M.setEnabled(true);
                    if (baseResponse.data.winningStatus == 1) {
                        rouletteActivity.X.f = true;
                    }
                    try {
                        rouletteActivity.X.d += new BigDecimal(baseResponse.data.winningAmount).multiply(BigDecimal.valueOf(10000L)).longValue();
                    } catch (Exception unused) {
                    }
                    AssetsInfo assetsInfo = rouletteActivity.z0;
                    if (assetsInfo != null) {
                        assetsInfo.balance -= rouletteActivity.I;
                        rouletteActivity.Q1(Math.max(rouletteActivity.z0.balance, 0L), SportyGamesManager.getInstance().getCountryCurrency());
                    }
                    rouletteActivity.U1(i3, new a());
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RouletteActivity.this.P.setVisibility(8);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public class h implements gv5<BaseResponse<List<RoundInfo>>> {
        public h() {
        }

        @Override // defpackage.gv5
        public final void onFailure(su5<BaseResponse<List<RoundInfo>>> su5Var, Throwable th) {
            RouletteActivity rouletteActivity = RouletteActivity.this;
            rouletteActivity.v.setVisibility(8);
            RouletteActivity rouletteActivity2 = rouletteActivity.g0;
            mpe0 mpe0Var = yyf0.a;
            rouletteActivity2.getClass();
            yyf0.a(1, rouletteActivity2, rouletteActivity2.getString(R.string.sg_page_transaction__session_timeout));
        }

        @Override // defpackage.gv5
        public final void onResponse(su5<BaseResponse<List<RoundInfo>>> su5Var, bi50<BaseResponse<List<RoundInfo>>> bi50Var) {
            List<RoundInfo> list;
            RouletteActivity rouletteActivity = RouletteActivity.this;
            rouletteActivity.v.setVisibility(8);
            Response response = bi50Var.a;
            if (!response.getIsSuccessful()) {
                int iCode = response.code();
                if (iCode == 401 || iCode == 403) {
                    SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                    return;
                } else {
                    onFailure(su5Var, null);
                    return;
                }
            }
            BaseResponse<List<RoundInfo>> baseResponse = bi50Var.b;
            if (baseResponse == null || baseResponse.bizCode != 10000 || (list = baseResponse.data) == null || list.size() <= 0) {
                return;
            }
            rouletteActivity.W = baseResponse.data;
            rouletteActivity.S1();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public class i implements ud<ActivityResult> {
        public i() {
        }

        @Override // defpackage.ud
        public final void a(ActivityResult activityResult) {
            if (activityResult.a == -1) {
                RouletteActivity.this.finish();
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public class j implements gv5<BaseResponse<LastBet>> {
        public final /* synthetic */ boolean a;

        public j(boolean z) {
            this.a = z;
        }

        @Override // defpackage.gv5
        public final void onFailure(su5<BaseResponse<LastBet>> su5Var, Throwable th) {
            RouletteActivity rouletteActivity = RouletteActivity.this;
            rouletteActivity.n0.O(100);
            if (this.a) {
                rouletteActivity.v.setVisibility(8);
                RouletteActivity rouletteActivity2 = rouletteActivity.g0;
                mpe0 mpe0Var = yyf0.a;
                rouletteActivity2.getClass();
                yyf0.a(1, rouletteActivity2, rouletteActivity2.getString(R.string.sg_page_transaction__session_timeout));
            }
        }

        @Override // defpackage.gv5
        public final void onResponse(su5<BaseResponse<LastBet>> su5Var, bi50<BaseResponse<LastBet>> bi50Var) {
            Response response = bi50Var.a;
            RouletteActivity rouletteActivity = RouletteActivity.this;
            boolean z = this.a;
            if (z) {
                rouletteActivity.v.setVisibility(8);
            }
            if (!response.getIsSuccessful()) {
                rouletteActivity.n0.O(100);
                int iCode = response.code();
                if (iCode == 401 || iCode == 403) {
                    SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                    return;
                } else {
                    onFailure(su5Var, null);
                    return;
                }
            }
            BaseResponse<LastBet> baseResponse = bi50Var.b;
            if (baseResponse == null || baseResponse.bizCode != 10000) {
                onFailure(su5Var, null);
                return;
            }
            int[] iArr = RouletteActivity.A0;
            rouletteActivity.W1();
            if (z) {
                rouletteActivity.O.setBackgroundResource(R.drawable.sg_rut_left_disable);
                rouletteActivity.O.setClickable(false);
                rouletteActivity.O.setEnabled(false);
            } else {
                rouletteActivity.a.a(rouletteActivity.getIntent().getStringExtra(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT)).G(new ox50(rouletteActivity));
            }
            LastBet lastBet = baseResponse.data;
            TextView textView = rouletteActivity.O;
            if (lastBet == null) {
                textView.setEnabled(false);
                return;
            }
            textView.setEnabled(true);
            if (z) {
                rouletteActivity.H1(baseResponse.data);
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public class k implements gv5<BaseResponse<AssetsInfo>> {
        public final /* synthetic */ boolean a;

        public k(boolean z) {
            this.a = z;
        }

        @Override // defpackage.gv5
        public final void onFailure(su5<BaseResponse<AssetsInfo>> su5Var, Throwable th) {
            RouletteActivity rouletteActivity = RouletteActivity.this;
            rouletteActivity.n0.O(100);
            rouletteActivity.z0 = null;
        }

        @Override // defpackage.gv5
        public final void onResponse(su5<BaseResponse<AssetsInfo>> su5Var, bi50<BaseResponse<AssetsInfo>> bi50Var) {
            Response response = bi50Var.a;
            boolean isSuccessful = response.getIsSuccessful();
            RouletteActivity rouletteActivity = RouletteActivity.this;
            if (!isSuccessful) {
                rouletteActivity.n0.O(100);
                int iCode = response.code();
                if (iCode == 401 || iCode == 403) {
                    SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                    return;
                } else {
                    onFailure(su5Var, null);
                    return;
                }
            }
            BaseResponse<AssetsInfo> baseResponse = bi50Var.b;
            if (baseResponse == null || baseResponse.bizCode != 10000) {
                onFailure(su5Var, null);
                return;
            }
            rouletteActivity.z0 = baseResponse.data;
            rouletteActivity.I1(SportyGamesManager.getInstance().getUser());
            rouletteActivity.W1();
            if (this.a) {
                rouletteActivity.a.b().G(new rx50(rouletteActivity));
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static /* synthetic */ class l {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LeftMenuButtonKey.values().length];
            a = iArr;
            try {
                iArr[LeftMenuButtonKey.HOW_TO_PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[LeftMenuButtonKey.SHARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[LeftMenuButtonKey.WITHDRAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[LeftMenuButtonKey.MUSIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[LeftMenuButtonKey.SOUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public class m extends cny {
        public m() {
            super(true);
        }

        @Override // defpackage.cny
        public final void b() {
            int[] iArr = RouletteActivity.A0;
            wz.a("BackClicked", "Roulette", new String[0]);
            RouletteActivity rouletteActivity = RouletteActivity.this;
            if (rouletteActivity.Q.isShown()) {
                rouletteActivity.Q.setVisibility(8);
                return;
            }
            HistoryActivity historyActivity = rouletteActivity.a0;
            if (historyActivity != null && historyActivity.isShown()) {
                rouletteActivity.a0.E();
                return;
            }
            HowToPlayView howToPlayView = rouletteActivity.U;
            if (howToPlayView != null && howToPlayView.isShown()) {
                rouletteActivity.U.setVisibility(8);
                return;
            }
            if (rouletteActivity.X != null) {
                return;
            }
            if (rouletteActivity.getSupportFragmentManager().L() == 0) {
                rouletteActivity.onClick(rouletteActivity.findViewById(R.id.ivBack));
                return;
            }
            f(false);
            rouletteActivity.getOnBackPressedDispatcher().d();
            f(true);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public class n {
        public final /* synthetic */ View a;

        public n(View view) {
            this.a = view;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public class o extends hbn<Drawable> {
        public o() {
        }

        @Override // defpackage.hbn
        public final boolean a(String str, xzk xzkVar) {
            int[] iArr = RouletteActivity.A0;
            RouletteActivity.this.E1();
            return true;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public class p implements View.OnClickListener {
        public p() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            RouletteActivity.this.Q.setVisibility(8);
        }
    }

    public static boolean B1(RouletteActivity rouletteActivity) {
        return (rouletteActivity == null || rouletteActivity.isDestroyed() || rouletteActivity.isFinishing()) ? false : true;
    }

    public static void L1(String str) {
        wz.a(str, "Roulette", new String[0]);
    }

    public static String w1() {
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        return (sportyGamesManager == null || sportyGamesManager.getCountryContactUsPhoneResId() == null) ? "" : sportyGamesManager.getCountryContactUsPhoneResId().toString();
    }

    public final LeftMenuButton A1(LeftMenuButtonKey leftMenuButtonKey) {
        int i2 = l.a[leftMenuButtonKey.ordinal()];
        if (i2 == 1) {
            return new LeftMenuButton.Builder().name(getString(R.string.how_to_play_menu)).tag(leftMenuButtonKey).icon(R.drawable.ic_how_to_play).iconSize(new MenuIconSize(R.dimen._13sdp, R.dimen._13sdp)).build();
        }
        if (i2 == 2) {
            return new LeftMenuButton.Builder().name(getString(R.string.share_menu)).tag(leftMenuButtonKey).icon(R.drawable.ic_share).iconSize(new MenuIconSize(R.dimen._14sdp, R.dimen._14sdp)).build();
        }
        if (i2 == 3) {
            return new LeftMenuButton.Builder().name(getString(R.string.withdraw_menu)).tag(leftMenuButtonKey).icon(R.drawable.ic_withdraw).iconSize(new MenuIconSize(R.dimen._14sdp, R.dimen._15sdp)).build();
        }
        if (i2 != 4) {
            return i2 != 5 ? new LeftMenuButton() : new LeftMenuButton.Builder().name(getString(R.string.sound_menu)).tag(leftMenuButtonKey).isToggle(true).toggleState(this.z).icon(R.drawable.ic_sound).iconSize(new MenuIconSize(R.dimen._15sdp, R.dimen._12sdp)).build();
        }
        return new LeftMenuButton.Builder().name(getString(R.string.music_menu)).tag(leftMenuButtonKey).isToggle(true).toggleState(this.A).icon(R.drawable.music).iconSize(new MenuIconSize(R.dimen._15sdp, R.dimen._12sdp)).build();
    }

    public final void C1(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, "Roulette");
        bundle.putBoolean(JsPluginCommon.GAMES_BET_PLACED_IS_REBET_ARGUMENT, z);
        bundle.putString("Platform", "ANDROID");
        CasinoLogger.INSTANCE.logEventToCasino("BetPlaced", bundle);
    }

    public final void D1() {
        String string;
        this.u0 = new ipa0(this);
        this.v.setVisibility(8);
        W1();
        int i2 = 0;
        long j2 = this.g0.getSharedPreferences("roulette", 0).getLong("chip_value", 0L);
        if (this.B == null) {
            return;
        }
        while (true) {
            TextView[] textViewArr = this.w;
            if (i2 >= textViewArr.length) {
                return;
            }
            TextView textView = textViewArr[i2];
            long jLongValue = this.B.get(i2).longValue();
            if (jLongValue % 10000 == 0) {
                long j3 = jLongValue / 10000;
                if (j3 < 1000) {
                    string = String.valueOf(j3);
                } else if (j3 % 1000 == 0) {
                    string = nrz.a(j3 / 1000, "K", new StringBuilder());
                } else {
                    string = BigDecimal.valueOf(j3).divide(BigDecimal.valueOf(1000L)) + "K";
                }
            } else {
                string = BigDecimal.valueOf(jLongValue).divide(BigDecimal.valueOf(10000L)).toString();
            }
            textView.setText(string);
            if (j2 == this.B.get(i2).longValue()) {
                textViewArr[i2].performClick();
            }
            i2++;
        }
    }

    public final void E1() {
        RouletteActivity rouletteActivity = this.g0;
        mpe0 mpe0Var = yyf0.a;
        rouletteActivity.getClass();
        yyf0.a(1, rouletteActivity, rouletteActivity.getString(R.string.sg_common_feedback__something_went_wrong_please_try_again));
        finish();
    }

    public final void F1() {
        MediaPlayer mediaPlayer;
        ipa0 ipa0Var = this.u0;
        if (ipa0Var == null || (mediaPlayer = (MediaPlayer) ipa0Var.a.get(204)) == null) {
            return;
        }
        try {
            if (mediaPlayer.isPlaying()) {
                return;
            }
            mediaPlayer.setLooping(true);
            mediaPlayer.start();
        } catch (Exception unused) {
        }
    }

    public final void G1(int i2) {
        ipa0 ipa0Var;
        MediaPlayer mediaPlayer;
        if (!this.z || (ipa0Var = this.u0) == null || (mediaPlayer = (MediaPlayer) ipa0Var.a.get(Integer.valueOf(i2))) == null) {
            return;
        }
        try {
            if (mediaPlayer.isPlaying()) {
                return;
            }
            mediaPlayer.start();
        } catch (Exception unused) {
        }
    }

    public final void H1(LastBet lastBet) {
        TableGrid[] tableGridArr = this.c;
        try {
            for (TableGrid tableGrid : tableGridArr) {
                tableGrid.f = 0L;
                tableGrid.a.clear();
                tableGrid.b();
            }
            this.I = 0L;
            for (Map.Entry<String, Long> entry : lastBet.betInfoDetail.entrySet()) {
                int iIndexOf = this.f.indexOf(entry.getKey());
                if (iIndexOf >= 0) {
                    long jLongValue = entry.getValue().longValue();
                    this.I += jLongValue;
                    for (int i2 = 0; i2 < this.B.size(); i2++) {
                        if (jLongValue >= this.B.get(i2).longValue()) {
                            jLongValue -= this.B.get(i2).longValue();
                            tableGridArr[iIndexOf].a(i2, this.B.get(i2).longValue(), false);
                        }
                    }
                    TableGrid tableGrid2 = tableGridArr[iIndexOf];
                    tableGrid2.f += jLongValue;
                    tableGrid2.b();
                }
            }
            K1();
        } catch (Exception unused) {
        }
    }

    public final void I1(xnh0 xnh0Var) {
        if (xnh0Var == null || xnh0Var.a.isEmpty()) {
            this.i.setVisibility(8);
            return;
        }
        AssetsInfo assetsInfo = this.z0;
        if (assetsInfo == null) {
            this.i.setVisibility(8);
            this.c0.setVisibility(0);
        } else {
            Q1(assetsInfo.balance, SportyGamesManager.getInstance().getCountryCurrency());
            this.c0.setVisibility(8);
            this.i.setVisibility(0);
        }
    }

    public final void J1(boolean z) {
        boolean zEquals = "int".equals(SportyGamesManager.getInstance().getCountry());
        no0 no0Var = this.a;
        su5<BaseResponse<AssetsInfo>> su5VarK = (zEquals && !TextUtils.isEmpty(SportyGamesManager.getInstance().getCountryCurrency())) ? no0Var.k(SportyGamesManager.getInstance().getCountryCurrency()) : no0Var.j();
        su5VarK.G(new k(z));
    }

    public final void M1(int i2, int i3, String str) {
        TableGrid tableGrid = (TableGrid) findViewById(i3);
        this.c[i2] = tableGrid;
        TextView textView = tableGrid.b;
        k7g k7gVar = new k7g();
        k7gVar.b(getResources().getDimensionPixelSize(R.dimen.sg_rut_thirteen), str);
        k7gVar.a("\n");
        k7gVar.b(getResources().getDimensionPixelSize(R.dimen.sg_eight), "1:2");
        textView.setText(k7gVar);
    }

    public final void N1(int i2, int i3, String str) {
        TableGrid tableGrid = (TableGrid) findViewById(i3);
        this.c[i2] = tableGrid;
        TextView textView = tableGrid.b;
        k7g k7gVar = new k7g();
        k7gVar.b(getResources().getDimensionPixelSize(R.dimen.sg_rut_ninty), str);
        k7gVar.a("\n");
        k7gVar.b(getResources().getDimensionPixelSize(R.dimen.sg_eight), "1:3");
        textView.setText(k7gVar);
    }

    public final void O1(int i2, int i3, int i4, int i5) {
        TableGrid tableGrid = (TableGrid) findViewById(i3);
        TableGrid[] tableGridArr = this.c;
        tableGridArr[i2] = tableGrid;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tableGrid.b.getLayoutParams();
        marginLayoutParams.setMargins((int) TypedValue.applyDimension(1, i4, getResources().getDisplayMetrics()), 0, (int) TypedValue.applyDimension(1, i5, getResources().getDisplayMetrics()), 0);
        tableGridArr[i2].b.setLayoutParams(marginLayoutParams);
    }

    public final void P1(int i2, int i3, String str) {
        TableGrid tableGrid = (TableGrid) findViewById(i3);
        this.c[i2] = tableGrid;
        TextView textView = tableGrid.b;
        k7g k7gVar = new k7g(str);
        k7gVar.a("\n");
        k7gVar.b(getResources().getDimensionPixelSize(R.dimen.sg_eight), "1:12");
        textView.setText(k7gVar);
    }

    @Override // defpackage.bb
    public final void Q(xnh0 xnh0Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = nzf0.a;
        if (!z && jCurrentTimeMillis - nzf0.b <= 500) {
            z = true;
        }
        if (z) {
            return;
        }
        J1(true);
        I1(xnh0Var);
        this.n0.setProgressForApi(14);
        this.n0.setCurrentProgress(2);
        this.n0.setVisibility(0);
        this.n0.L();
        if (xnh0Var == null || xnh0Var.a.isEmpty()) {
            return;
        }
        List<Long> list = this.B;
        no0 no0Var = this.a;
        if (list != null) {
            W1();
        } else {
            no0Var.f().G(new ix50(this));
        }
        if (this.C != null) {
            W1();
        } else {
            no0Var.h().G(new tx50(this));
        }
        v1();
    }

    public final void Q1(long j2, final String str) {
        this.t0.j(Long.valueOf(j2 / 10000));
        long j3 = this.d;
        if (j3 != -18493478) {
            final long j4 = j2 - j3;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(1500L);
            if (str != null) {
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: uw50
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        int[] iArr = RouletteActivity.A0;
                        RouletteActivity rouletteActivity = this.a;
                        rouletteActivity.k0.setText(str.trim() + " " + b3.V(((long) (((Float) valueAnimator.getAnimatedValue()).floatValue() * j4)) + rouletteActivity.d));
                    }
                });
            }
            valueAnimatorOfFloat.addListener(new c(j2));
            valueAnimatorOfFloat.start();
            return;
        }
        TextView textView = this.k0;
        if (str != null) {
            textView.setText(str.trim() + " " + b3.V(j2));
        } else {
            textView.setText(b3.V(j2));
        }
        this.d = j2;
    }

    public final void R1() {
        MediaPlayer mediaPlayer;
        J1(false);
        ipa0 ipa0Var = this.u0;
        if (ipa0Var != null && (mediaPlayer = (MediaPlayer) ipa0Var.a.get(204)) != null) {
            mediaPlayer.setVolume(0.99f, 0.99f);
        }
        h51 h51Var = this.X;
        if (h51Var == null) {
            return;
        }
        if (h51Var.f) {
            T1(b3.V(h51Var.d));
        } else {
            y1(getString(R.string.sg_game_roulette__sorry_you_lost));
        }
        this.l0.setVisibility(0);
        this.m0.setVisibility(0);
        this.K.performClick();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0121 A[PHI: r3
      0x0121: PHI (r3v9 float) = (r3v3 float), (r3v3 float), (r3v4 float), (r3v3 float), (r3v3 float) binds: [B:20:0x00f0, B:35:0x0121, B:25:0x010d, B:27:0x0111, B:29:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    public final void S1() {
        this.Q.setVisibility(0);
        if (this.S == null) {
            GridLayout gridLayout = (GridLayout) this.Q.findViewById(R.id.grid);
            this.S = gridLayout;
            gridLayout.setColumnCount(2);
            int size = this.W.size();
            TextView[] textViewArr = new TextView[size];
            int i2 = 0;
            for (RoundInfo roundInfo : this.W) {
                View viewInflate = getLayoutInflater().inflate(R.layout.sg_rut_round, (ViewGroup) this.S, false);
                TextView textView = (TextView) viewInflate.findViewById(R.id.round);
                int i3 = i2 + 1;
                textViewArr[i2] = textView;
                int i4 = roundInfo.count;
                String str = roundInfo.percent;
                k7g k7gVar = new k7g(String.valueOf(roundInfo.count));
                k7gVar.b(kf9.a(this, 16), getString(R.string.sg_game_roulette__nrounds));
                textView.setText(k7gVar);
                TextView textView2 = (TextView) viewInflate.findViewById(R.id.prize);
                try {
                    String str2 = roundInfo.percent;
                    if (str2 == null || Float.parseFloat(str2) <= 0.01f) {
                        textView2.setVisibility(8);
                    } else {
                        textView2.setVisibility(0);
                        textView2.setText(getString(R.string.sg_game_roulette__prize_hint, roundInfo.percent));
                    }
                } catch (Exception unused) {
                    textView2.setVisibility(8);
                }
                GridLayout.Alignment alignment = GridLayout.FILL;
                GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams(GridLayout.spec(Integer.MIN_VALUE, 1, alignment), GridLayout.spec(Integer.MIN_VALUE, 1, alignment, 1.0f));
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.sg_rut_mar);
                layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                layoutParams.width = 0;
                viewInflate.findViewById(R.id.play).setOnClickListener(new e(i4, str));
                this.S.addView(viewInflate, layoutParams);
                i2 = i3;
            }
            float f2 = 0.01f;
            for (int i5 = size - 1; i5 >= 0; i5--) {
                if (this.W.get(i5).percent != null) {
                    try {
                        float f3 = Float.parseFloat(this.W.get(i5).percent);
                        if (f3 > f2) {
                            try {
                                textViewArr[i5].setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.sg_rut_bonus_big, 0);
                            } catch (Exception unused2) {
                                f2 = f3;
                                textViewArr[i5].setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                            }
                        } else if (f3 >= f2 || f3 <= 0.01f) {
                            textViewArr[i5].setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                        } else {
                            textViewArr[i5].setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.sg_rut_bonus_small, 0);
                        }
                        f2 = f3;
                    } catch (Exception unused3) {
                    }
                } else {
                    textViewArr[i5].setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
            }
        }
    }

    public final void T1(String str) {
        G1(202);
        this.P.setVisibility(0);
        this.P.postDelayed(new g(), 2000L);
        TextView winView = this.P.getWinView();
        k7g k7gVar = new k7g();
        k7gVar.b(getResources().getDimensionPixelSize(R.dimen.sg_rut_win_txt), "Congratulations! You Won!\n");
        k7gVar.a("+");
        k7gVar.a(SportyGamesManager.getInstance().getCountryCurrency());
        k7gVar.a(" ");
        k7gVar.a(str);
        winView.setText(k7gVar);
    }

    public final void U1(int i2, Runnable runnable) {
        MediaPlayer mediaPlayer;
        this.L.setVisibility(0);
        RouletteView rouletteView = this.R;
        ObjectAnimator objectAnimator = rouletteView.w;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        rouletteView.A = i2;
        rouletteView.z = runnable;
        rouletteView.y = SystemClock.elapsedRealtime();
        rouletteView.w.start();
        ipa0 ipa0Var = this.u0;
        if (ipa0Var != null && this.z && (mediaPlayer = (MediaPlayer) ipa0Var.a.get(204)) != null) {
            mediaPlayer.setVolume(0.25f, 0.25f);
        }
        G1(203);
    }

    public final void V1() {
        ipa0 ipa0Var = this.u0;
        if (ipa0Var != null) {
            Iterator it = ipa0Var.a.entrySet().iterator();
            while (it.hasNext()) {
                MediaPlayer mediaPlayer = (MediaPlayer) ((Map.Entry) it.next()).getValue();
                try {
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                        mediaPlayer.prepare();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void W1() {
        this.n0.P();
    }

    @Override // defpackage.bb
    public final void f0(m8 m8Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = nzf0.a;
        if (!z && jCurrentTimeMillis - nzf0.b <= 500) {
            z = true;
        }
        if (z || isFinishing() || isDestroyed()) {
            return;
        }
        kit kitVar = new kit(this);
        kitVar.e = "Roulette";
        kitVar.setCancelable(false);
        String string = getString(R.string.game_not_available);
        String string2 = getString(R.string.label_dialog_exit);
        pw50 pw50Var = new pw50(this);
        qw50 qw50Var = new qw50();
        int color = getColor(R.color.try_again_color);
        string.getClass();
        string2.getClass();
        kitVar.d = new kit.a(string, string2, pw50Var, qw50Var, color);
        Window window = kitVar.getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        if (attributes != null) {
            attributes.gravity = 17;
        }
        if (attributes != null) {
            attributes.flags &= -5;
        }
        Window window2 = kitVar.getWindow();
        if (window2 != null) {
            window2.setAttributes(attributes);
        }
        Window window3 = kitVar.getWindow();
        if (window3 != null) {
            window3.setBackgroundDrawableResource(R.color.trans_black_color);
        }
        kitVar.show();
        Window window4 = kitVar.getWindow();
        if (window4 != null) {
            window4.setLayout(-1, -1);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void i() {
        if (SportyGamesManager.getInstance() == null || SportyGamesManager.getInstance().getUserId() == null) {
            this.y.setRefreshing(false);
        } else {
            z1(false);
        }
    }

    @Override // androidx.fragment.app.e, defpackage.rn8, android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i3 == 107) {
            finish();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        int i2 = 1;
        int i3 = 0;
        if (id == R.id.stop) {
            G1(r.d.DEFAULT_DRAG_ANIMATION_DURATION);
            this.X.g = true;
            this.M.setEnabled(false);
            return;
        }
        no0 no0Var = this.a;
        if (id == R.id.auto) {
            G1(r.d.DEFAULT_DRAG_ANIMATION_DURATION);
            wz.a("AutoPlayClicked", "Roulette", new String[0]);
            if (this.W != null) {
                S1();
                return;
            } else {
                this.v.setVisibility(0);
                no0Var.i().G(new h());
                return;
            }
        }
        if (id == R.id.rebet) {
            G1(r.d.DEFAULT_DRAG_ANIMATION_DURATION);
            wz.a("rebetClicked", "Roulette", "gameScreen");
            C1(true);
            if (SportyGamesManager.getInstance().getUser() != null) {
                z1(true);
                return;
            } else {
                SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                return;
            }
        }
        TableGrid[] tableGridArr = this.c;
        if (id == R.id.spin) {
            G1(r.d.DEFAULT_DRAG_ANIMATION_DURATION);
            wz.a("BetPlaced", "Roulette", new String[0]);
            C1(false);
            if (SportyGamesManager.getInstance().getUser() == null) {
                SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                return;
            }
            if (this.I == 0) {
                if (isFinishing() || isDestroyed()) {
                    return;
                }
                vx50 vx50Var = new vx50(this);
                vx50Var.b(getString(R.string.sg_game_roulette__auto_bet_hint), getString(R.string.sg_common_functions__yes), getString(R.string.sg_common_functions__cancel), new l2j(this, i2), new sw50());
                vx50Var.a();
                return;
            }
            this.v.setVisibility(0);
            JSONObject jSONObject = new JSONObject();
            try {
                JSONObject jSONObject2 = new JSONObject();
                while (i3 < tableGridArr.length) {
                    if (tableGridArr[i3].f > 0) {
                        jSONObject2.put(this.f.get(i3), tableGridArr[i3].f);
                    }
                    i3++;
                }
                jSONObject.put("betInfo", jSONObject2);
                jSONObject.put("continuousCnt", 1);
                jSONObject.put("currentNum", 1);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            no0Var.c(jSONObject.toString()).G(new com.sportygames.roulette.activities.b(this));
            return;
        }
        if (id == R.id.clear) {
            G1(r.d.DEFAULT_DRAG_ANIMATION_DURATION);
            wz.a("ClearClicked", "Roulette", new String[0]);
            x1();
            this.I = 0L;
            K1();
            int length = tableGridArr.length;
            while (i3 < length) {
                TableGrid tableGrid = tableGridArr[i3];
                tableGrid.f = 0L;
                tableGrid.a.clear();
                tableGrid.b();
                i3++;
            }
            return;
        }
        if (id == R.id.ivBack) {
            wz.a("BackClicked", "Roulette", new String[0]);
            ArrayList<GameDetails> arrayList = this.h0;
            ee<Intent> eeVar = this.y0;
            if (arrayList != null && arrayList.size() > 0) {
                Intent intent = new Intent(this.g0, (Class<?>) ExitDialogActivity.class);
                intent.putExtra(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, getIntent().getStringExtra(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT));
                intent.putExtra("gameId", getIntent().getIntExtra("gameId", 0));
                intent.putParcelableArrayListExtra("ExitGameList", this.h0);
                intent.putExtra("color", R.color.sb_black_100);
                eeVar.b(intent);
                return;
            }
            Intent intent2 = new Intent(this.g0, (Class<?>) SGConfirmDialogActivity.class);
            intent2.putExtra(EventKeys.ERROR_MESSAGE, getString(R.string.exit_text));
            intent2.putExtra("positive", getString(R.string.stay));
            intent2.putExtra("color", R.color.sb_black_100);
            intent2.putExtra("negative", getString(R.string.label_dialog_exit));
            intent2.putExtra("cancel_btn_color", this.g0.getColor(R.color.redblack_confirm_dialog_left_button));
            intent2.putExtra("confirm_btn_color", this.g0.getColor(R.color.redblack_confirm_dialog_right_button));
            eeVar.b(intent2);
            return;
        }
        if (id != R.id.order) {
            if (id == R.id.ivHamburger) {
                wz.a("HamMenuClicked", "Roulette", new String[0]);
                this.j0.n(8388613);
                return;
            }
            return;
        }
        G1(r.d.DEFAULT_DRAG_ANIMATION_DURATION);
        wz.a("betHistoryOpened", "Roulette", new String[0]);
        if (SportyGamesManager.getInstance().getUser() == null) {
            SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
            return;
        }
        if (this.a0 == null) {
            HistoryActivity historyActivity = new HistoryActivity(this);
            this.a0 = historyActivity;
            this.Z.addView(historyActivity);
        }
        HistoryActivity historyActivity2 = this.a0;
        historyActivity2.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        historyActivity2.F.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i4 = displayMetrics.heightPixels;
        cam camVar = historyActivity2.P;
        camVar.b.clear();
        camVar.e = 0;
        camVar.notifyDataSetChanged();
        historyActivity2.setVisibility(0);
        historyActivity2.setTranslationY(i4);
        historyActivity2.animate().translationY(0.0f);
        historyActivity2.Q.setVisibility(0);
        historyActivity2.setErrorViewData(0);
    }

    @Override // androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getOnBackPressedDispatcher().a(this, new m());
        setContentView(R.layout.sg_rut_activity_main);
        if (SportyGamesManager.getInstance() == null || SportyGamesManager.getInstance().getCountry() == null) {
            finish();
        }
        SportyGamesManager.getInstance().setScreenName("sportygames/roulette");
        this.g0 = this;
        this.v = new LoadingView(this);
        ViewGroup viewGroup = (ViewGroup) findViewById(android.R.id.content);
        this.Z = viewGroup;
        viewGroup.addView(this.v);
        this.v.setVisibility(8);
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(ypa0.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        ProgressMeterComponent progressMeterComponent = (ProgressMeterComponent) findViewById(R.id.progress_meter_component);
        this.n0 = progressMeterComponent;
        progressMeterComponent.setVisibility(0);
        this.n0.setProgressForApi(14);
        this.n0.setCurrentProgress(2);
        this.n0.getLiveData().f(this, new yw50(this));
        qlf.d(this);
        ViewGroup viewGroup2 = this.Z;
        viewGroup2.getClass();
        qlf.b(viewGroup2);
        qlf.c(getWindow(), getColor(R.color.sg_statusbar_color));
        fbn fbnVarA = th8.a();
        fbnVarA.c(new n(findViewById(R.id.table)));
        View viewFindViewById = findViewById(R.id.roulette_layer);
        this.L = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
        View view = this.L;
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        r6i0.d.l(view, 20.0f);
        RouletteView rouletteView = (RouletteView) this.L.findViewById(R.id.roulette);
        this.R = rouletteView;
        o oVar = new o();
        fbnVarA.d("https://s.sporty.net/ke/main/res/93e8f16c4c66585f3a3e76ffee1c0668.png", rouletteView.getRouletteBackground(), oVar);
        fbnVarA.d("https://s.sporty.net/ke/main/res/3df125862f9d6bd7e9d6d97a91d01602.png", this.R.getRouletteRing(), oVar);
        this.J = findViewById(R.id.history);
        this.T = (RecyclerView) findViewById(R.id.ball);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.H = linearLayoutManager;
        this.T.setLayoutManager(linearLayoutManager);
        lv1 lv1Var = new lv1();
        this.G = lv1Var;
        this.T.setAdapter(lv1Var);
        this.b0 = findViewById(R.id.lostDialog);
        View viewFindViewById2 = this.L.findViewById(R.id.stop);
        this.M = viewFindViewById2;
        viewFindViewById2.setOnClickListener(this);
        this.N = (TextView) this.L.findViewById(R.id.remaining);
        View viewFindViewById3 = findViewById(R.id.round_layer);
        this.Q = viewFindViewById3;
        r6i0.d.l(viewFindViewById3, 20.0f);
        this.Q.setOnClickListener(this);
        this.Q.findViewById(R.id.round_close).setOnClickListener(new p());
        TextView textView = (TextView) findViewById(R.id.rebet);
        this.O = textView;
        textView.setOnClickListener(this);
        WinningView winningView = (WinningView) findViewById(R.id.win_layer);
        this.P = winningView;
        r6i0.d.l(winningView, 20.0f);
        fbnVarA.d("https://s.sporty.net/ke/main/res/22ec06341392676426e04c37f2498f38.png", this.P.getWinViewBackground(), oVar);
        findViewById(R.id.order).setOnClickListener(this);
        this.b = (TextView) findViewById(R.id.stakeValue);
        findViewById(R.id.spin).setOnClickListener(this);
        this.z = wn20.a(this.g0, "roulette", "audio_on");
        this.A = wn20.a(this.g0, "roulette", "music_on");
        this.l0 = (LinearLayout) findViewById(R.id.buttons);
        this.m0 = (ImageView) findViewById(R.id.rewards);
        this.i0 = (ConstraintLayout) findViewById(R.id.ivHamburger);
        this.q0 = (ImageView) findViewById(R.id.redMark);
        this.i0.setOnClickListener(this);
        this.j0 = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        this.s0 = LayoutInflater.from(this).inflate(R.layout.roulette_hamburger_menu_view, (ViewGroup) navigationView, false);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        navigationView.removeAllViews();
        navigationView.addView(this.s0, layoutParams);
        this.p0 = (TextView) this.s0.findViewById(R.id.add_money_button);
        ImageView imageView = (ImageView) this.s0.findViewById(R.id.bottom_image);
        try {
            if (B1(this.g0)) {
                com.bumptech.glide.a.d(this.g0).p("https://s.sporty.net/common/main/res/c890bc811eff5cc35f4a726ae0725ee0.png").M(imageView);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.p0.setOnClickListener(new View.OnClickListener() { // from class: rw50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int[] iArr = RouletteActivity.A0;
                this.a.j0.d();
                wz.a("AddMoneyClicked", "Roulette", new String[0]);
                SportyGamesManager.getInstance().gotoSportyBet(xae.c, null);
            }
        });
        RecyclerView recyclerView = (RecyclerView) this.s0.findViewById(R.id.menu_list);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        List<LeftMenuButton> listAsList = Arrays.asList(A1(LeftMenuButtonKey.MUSIC), A1(LeftMenuButtonKey.SOUND), A1(LeftMenuButtonKey.HOW_TO_PLAY), A1(LeftMenuButtonKey.SHARE), A1(LeftMenuButtonKey.WITHDRAW));
        n4s n4sVar = new n4s();
        n4sVar.c = this;
        n4sVar.b = LayoutInflater.from(this);
        n4sVar.a = listAsList;
        n4sVar.d = R.color.roulette_toggle_on_color;
        n4sVar.e = R.color.roulette_toggle_off_color;
        recyclerView.setAdapter(n4sVar);
        this.c0 = (SpinKitView) ((ConstraintLayout) findViewById(R.id.roulette_toolbar)).findViewById(R.id.spin_kit);
        this.t0.f(this, new sx50(this));
        for (int i2 = 0; i2 < 5; i2++) {
            TextView textView2 = (TextView) findViewById(A0[i2]);
            TextView[] textViewArr = this.w;
            textViewArr[i2] = textView2;
            textView2.setTag(Integer.valueOf(i2));
            if (i2 == 0) {
                TextView textView3 = textViewArr[0];
                this.E = textView3;
                textView3.setSelected(true);
            }
            textViewArr[i2].setOnClickListener(new a());
        }
        View viewFindViewById4 = findViewById(R.id.clear);
        this.K = viewFindViewById4;
        viewFindViewById4.setOnClickListener(this);
        K1();
        findViewById(R.id.auto).setOnClickListener(this);
        findViewById(R.id.ivBack).setOnClickListener(this);
        this.i = (ConstraintLayout) findViewById(R.id.wallet_layout);
        this.k0 = (TextView) findViewById(R.id.text_balance);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe);
        this.y = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        if (wn20.a(this.g0, "roulette", "set_first_time")) {
            wn20.c(this.g0, "roulette", "set_first_time", false, true);
        }
        fbnVarA.d("https://s.sporty.net/ke/main/res/a1fda43b057872b02e6bddbb5f77878f.png", (ImageView) findViewById(R.id.pan), oVar);
        P1(0, R.id.bet_0, "0");
        P1(1, R.id.bet_1, "1");
        P1(2, R.id.bet_2, "2");
        P1(3, R.id.bet_3, "3");
        P1(4, R.id.bet_4, "4");
        P1(5, R.id.bet_5, "5");
        P1(6, R.id.bet_6, "6");
        P1(7, R.id.bet_7, "7");
        P1(8, R.id.bet_8, "8");
        P1(9, R.id.bet_9, "9");
        P1(10, R.id.bet_10, "10");
        P1(11, R.id.bet_11, "11");
        P1(12, R.id.bet_12, "12");
        N1(13, R.id.bet_c1, "C1");
        N1(14, R.id.bet_c2, "C2");
        N1(15, R.id.bet_c3, "C3");
        TableGrid[] tableGridArr = this.c;
        tableGridArr[13].v.addAll(Arrays.asList(tableGridArr[1], tableGridArr[4], tableGridArr[7], tableGridArr[10]));
        tableGridArr[14].v.addAll(Arrays.asList(tableGridArr[2], tableGridArr[5], tableGridArr[8], tableGridArr[11]));
        tableGridArr[15].v.addAll(Arrays.asList(tableGridArr[3], tableGridArr[6], tableGridArr[9], tableGridArr[12]));
        M1(16, R.id.red, "RED");
        tableGridArr[16].b.setTextSize(13.0f);
        O1(16, R.id.red, 0, 8);
        tableGridArr[16].b.setCompoundDrawablesWithIntrinsicBounds(gr0.a(this, R.drawable.sg_rut_red_table), (Drawable) null, (Drawable) null, (Drawable) null);
        M1(17, R.id.black, "BLACK");
        tableGridArr[17].b.setTextSize(13.0f);
        tableGridArr[17].b.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, gr0.a(this, R.drawable.sg_rut_table_black), (Drawable) null);
        M1(20, R.id.bet_16, "1-6");
        tableGridArr[20].b.setTextSize(13.0f);
        tableGridArr[20].b.setGravity(5);
        tableGridArr[20].i = R.drawable.sg_rut_left;
        M1(18, R.id.bet_17, "ODD");
        tableGridArr[18].b.setTextSize(13.0f);
        M1(19, R.id.bet_18, "EVEN");
        tableGridArr[19].b.setTextSize(13.0f);
        M1(21, R.id.bet_19, "7-12");
        O1(21, R.id.bet_19, 2, 0);
        tableGridArr[21].b.setTextSize(13.0f);
        tableGridArr[21].b.setGravity(3);
        tableGridArr[21].i = R.drawable.sg_rut_right;
        for (int i3 = 0; i3 < 5; i3++) {
            ImageView imageView2 = tableGridArr[21].d[i3];
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView2.getLayoutParams();
            layoutParams2.gravity = 83;
            imageView2.setLayoutParams(layoutParams2);
            TextView textView4 = tableGridArr[21].c;
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) textView4.getLayoutParams();
            layoutParams3.gravity = 3;
            textView4.setLayoutParams(layoutParams3);
        }
        for (int i4 = 0; i4 < tableGridArr.length; i4++) {
            tableGridArr[i4].setOnClickListener(new b(i4));
        }
        SportyGamesManager.getInstance().addAccountUpdatedListener(this);
        List<Long> list = this.B;
        no0 no0Var = this.a;
        if (list != null) {
            W1();
        } else {
            no0Var.f().G(new ix50(this));
        }
        if (this.C != null) {
            W1();
        } else {
            no0Var.h().G(new tx50(this));
        }
        J1(true);
        v8i0 viewModelStore2 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory2 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras2 = getDefaultViewModelCreationExtras();
        viewModelStore2.getClass();
        defaultViewModelProviderFactory2.getClass();
        defaultViewModelCreationExtras2.getClass();
        s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, defaultViewModelCreationExtras2);
        dq7 dq7VarA2 = jq40.a(o6f.class);
        String strI2 = dq7VarA2.i();
        if (strI2 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        o6f o6fVar = (o6f) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
        this.w0 = o6fVar;
        o6fVar.b.f(this, new zw50(this));
        this.w0.c.f(this, new ax50(this));
        int i5 = Build.VERSION.SDK_INT;
        m6f m6fVar = this.v0;
        if (i5 <= 26) {
            registerReceiver(m6fVar, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
        } else {
            registerReceiver(m6fVar, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), 4);
        }
    }

    @Override // defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        SportyGamesManager.getInstance().removeAccountUpdatedListener(this);
        super.onDestroy();
        unregisterReceiver(this.v0);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.Y = false;
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        int i2 = 1;
        this.Y = true;
        this.g0 = this;
        if (this.o0 && this.n0.getVisibility() == 0 && this.n0.getCurrentProgress() == 100) {
            this.n0.N();
            this.n0.setVisibility(8);
        }
        wz.a("GameForeground", "Roulette", new String[0]);
        I1(SportyGamesManager.getInstance().getUser());
        if (this.n0.getVisibility() == 8 && this.o0 && this.A) {
            F1();
        }
        String str = this.d0;
        if (str != null && this.f0 && this.e0) {
            this.f0 = false;
            T1(str);
        } else if (this.f0 && !this.e0) {
            this.f0 = false;
            y1(getString(R.string.sg_game_roulette__sorry_you_lost));
        }
        if (this.X == null || !this.V || isFinishing() || isDestroyed()) {
            return;
        }
        vx50 vx50Var = new vx50(this);
        vx50Var.b(getString(R.string.sg_game_roulette__round_left_continue, String.valueOf(this.X.a), this.X.a <= 1 ? "" : "s"), getString(R.string.sg_game_roulette__resume), getString(R.string.sg_game_roulette__quit), new z6e(this, i2), new on10(this, i2));
        vx50Var.a();
        this.V = false;
    }

    @Override // defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onStop() {
        super.onStop();
        L1("GameBackground");
        if (this.z || this.A) {
            V1();
        }
    }

    public final void u1() {
        TableGrid[] tableGridArr = this.c;
        if (this.X.a() == 1) {
            this.Q.setVisibility(8);
            this.v.setVisibility(0);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            for (int i2 = 0; i2 < tableGridArr.length; i2++) {
                if (tableGridArr[i2].f > 0) {
                    jSONObject2.put(this.f.get(i2), tableGridArr[i2].f);
                }
            }
            jSONObject.put("betInfo", jSONObject2);
            jSONObject.put("continuousCnt", this.X.b);
            jSONObject.put("currentNum", this.X.a());
            String str = this.X.c;
            if (str != null) {
                jSONObject.put("lastBetId", str);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        this.a.c(jSONObject.toString()).G(new f());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v1() {
        Collection<Pair<String, String>> collectionValues = wx50.a.values();
        collectionValues.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            HashMap<Integer, Pair<String, String>> map = wx50.a;
            File file = new File(getExternalFilesDir(null), (String) ((Pair) obj).b);
            if (!file.exists() || !file.canRead() || file.length() <= 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            D1();
            return;
        }
        if (!this.w0.x1(this, arrayList)) {
            this.n0.O(100);
            RouletteActivity rouletteActivity = this.g0;
            mpe0 mpe0Var = yyf0.a;
            rouletteActivity.getClass();
            yyf0.a(0, rouletteActivity, rouletteActivity.getString(R.string.sg_common_feedback__sorry_something_went_wrong));
            finish();
        }
        D1();
    }

    public final void x1() {
        this.O.setBackgroundResource(R.drawable.sg_rut_left_selector);
        this.O.setClickable(true);
        this.O.setEnabled(true);
    }

    public final void y1(String str) {
        this.b0.setVisibility(0);
        ((TextView) this.b0.findViewById(R.id.error_text_data)).setText(str);
        new Handler().postDelayed(new Runnable() { // from class: tw50
            @Override // java.lang.Runnable
            public final void run() {
                int[] iArr = RouletteActivity.A0;
                this.a.b0.setVisibility(8);
            }
        }, 3000L);
    }

    public final void z1(boolean z) {
        if (z) {
            this.v.setVisibility(0);
        }
        this.a.e().G(new j(z));
    }

    public final void K1() {
        boolean z;
        try {
            if (SportyGamesManager.getInstance() != null && SportyGamesManager.getInstance().getCountryCurrency() != null) {
                this.b.setText(getString(R.string.sg_bet_history__total_stake_vcurrency_country) + getString(R.string.sg_app_common__blank_space) + getString(R.string.sg_app_common__colon) + getString(R.string.sg_app_common__blank_space) + SportyGamesManager.getInstance().getCountryCurrency().trim() + getString(R.string.sg_app_common__blank_space) + b3.V(this.I));
            }
        } catch (Exception unused) {
        }
        View view = this.K;
        if (this.I > 0) {
            z = true;
        } else {
            z = false;
        }
        view.setEnabled(z);
        if (this.K.isEnabled()) {
            RouletteActivity rouletteActivity = this.g0;
            String str = QQWMbKFOuTf.ryiOhDGCwP;
            if (wn20.a(rouletteActivity, str, "clear_first_time")) {
                wn20.c(this.g0, str, "clear_first_time", false, true);
                View viewInflate = getLayoutInflater().inflate(R.layout.sg_rut_clear_bubble, (ViewGroup) null);
                PopupWindow popupWindow = new PopupWindow(viewInflate, kf9.a(this, 210), kf9.a(this, 40));
                popupWindow.setBackgroundDrawable(new ColorDrawable(0));
                popupWindow.setFocusable(false);
                popupWindow.setOutsideTouchable(true);
                popupWindow.showAsDropDown(this.K, -kf9.a(this, 70), -kf9.a(this, 70));
                viewInflate.findViewById(R.id.close).setOnClickListener(new d(popupWindow));
            }
        }
    }
}
