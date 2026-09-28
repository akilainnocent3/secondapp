package com.sportybet.android.bethistory.presentation.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.pairip.VMRunner;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common.uievent.e;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.realsports.Order;
import com.sporty.android.core.model.sharewin.ShareWinData;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.bethistory.presentation.activity.RSportsBetTicketDetailsActivity;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.verifybet.apidata.BetTicketDetailData;
import com.sportybet.android.verifybet.apidata.VerifyBetData;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.BoreDrawConfig;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.JackpotBet;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.RSelection;
import com.sportybet.plugin.realsports.data.RTicket;
import com.sportybet.plugin.realsports.data.Share;
import com.sportybet.plugin.realsports.data.UserNote;
import defpackage.a190;
import defpackage.ap0;
import defpackage.apg;
import defpackage.as30;
import defpackage.au30;
import defpackage.azm;
import defpackage.b190;
import defpackage.b1m;
import defpackage.bb3;
import defpackage.bb40;
import defpackage.bdy;
import defpackage.bjb0;
import defpackage.bm50;
import defpackage.bu30;
import defpackage.ce;
import defpackage.cu30;
import defpackage.cyb;
import defpackage.d0n;
import defpackage.dq7;
import defpackage.ds30;
import defpackage.du30;
import defpackage.dz80;
import defpackage.e1i;
import defpackage.ebs;
import defpackage.ee;
import defpackage.ej5;
import defpackage.eja0;
import defpackage.ema;
import defpackage.eu30;
import defpackage.f290;
import defpackage.faj;
import defpackage.fdt;
import defpackage.fr30;
import defpackage.g1i;
import defpackage.g290;
import defpackage.g93;
import defpackage.glw;
import defpackage.h330;
import defpackage.h940;
import defpackage.hb5;
import defpackage.hc40;
import defpackage.hl30;
import defpackage.hqc;
import defpackage.ht30;
import defpackage.i2i;
import defpackage.ib;
import defpackage.im2;
import defpackage.itf0;
import defpackage.jq40;
import defpackage.jqf0;
import defpackage.jrm;
import defpackage.k290;
import defpackage.k980;
import defpackage.k9j;
import defpackage.kqc;
import defpackage.kzh;
import defpackage.l840;
import defpackage.lfy;
import defpackage.lk50;
import defpackage.lq1;
import defpackage.lqc;
import defpackage.mo0;
import defpackage.nas;
import defpackage.nqc;
import defpackage.o7d;
import defpackage.o8i0;
import defpackage.psm;
import defpackage.pt30;
import defpackage.pu0;
import defpackage.pu30;
import defpackage.pya;
import defpackage.q190;
import defpackage.qq1;
import defpackage.qt30;
import defpackage.r0i;
import defpackage.r1i;
import defpackage.r5p;
import defpackage.r8i0;
import defpackage.rlr;
import defpackage.rt30;
import defpackage.rws;
import defpackage.s090;
import defpackage.s8i0;
import defpackage.sa3;
import defpackage.sh8;
import defpackage.st30;
import defpackage.su30;
import defpackage.su5;
import defpackage.t090;
import defpackage.taj;
import defpackage.tce0;
import defpackage.u350;
import defpackage.ua3;
import defpackage.ud;
import defpackage.v8i0;
import defpackage.va0;
import defpackage.va3;
import defpackage.vt30;
import defpackage.vym;
import defpackage.wa3;
import defpackage.wae;
import defpackage.wm70;
import defpackage.x9h;
import defpackage.xa3;
import defpackage.xr30;
import defpackage.xt30;
import defpackage.xym;
import defpackage.y8j;
import defpackage.ya3;
import defpackage.yr30;
import defpackage.zch0;
import defpackage.zd2;
import defpackage.zha0;
import defpackage.zr30;
import defpackage.zyf0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Unit;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes5.dex */
public class RSportsBetTicketDetailsActivity extends b1m implements vym, SwipeRefreshLayout.f, View.OnClickListener, s090, k9j, bb40, xym {
    public static final /* synthetic */ int s0 = 0;
    public SwipeRefreshLayout B;
    public LoadingView C;
    public RecyclerView D;
    public eu30 E;
    public fr30 F;
    public boolean G;
    public boolean I;
    public Order J;
    public su5<BaseResponse<JackpotBet>> K;
    public int L;
    public glw M;
    public su5<BaseResponse> N;
    public c O;
    public WebView P;
    public String Q;
    public int R;
    public ConstraintLayout S;
    public TextView T;
    public TextView U;
    public String Z;
    public azm b;
    public f290 b0;
    public lq1 c;
    public im2 c0;
    public d0n d;
    public eja0 d0;
    public jrm e;
    public BookingData e0;
    public hc40 f;
    public VerifyBetData f0;
    public String g0;
    public UserNote h0;
    public t090 i;
    public rws i0;
    public h330 j0;
    public e k0;
    public psm l0;
    public y8j m0;
    public ds30 q0;
    public u350 v;
    public String w = null;
    public Boolean y = Boolean.FALSE;
    public final mo0 z = l840.a();
    public final r5p A = ap0.d();
    public List<hl30> H = new ArrayList();
    public final zd2<String> V = new zd2<>();
    public final ema W = new ema();
    public boolean X = false;
    public String Y = "";
    public final dz80 a0 = new dz80();
    public final a n0 = new a();
    public final Handler o0 = new Handler();
    public final b p0 = new b();
    public final ee<Intent> r0 = registerForActivityResult(new ce(), new ud() { // from class: jt30
        /* JADX WARN: Type inference failed for: r1v1, types: [qs30] */
        @Override // defpackage.ud
        public final void a(Object obj) {
            Intent intent;
            final String stringExtra;
            ActivityResult activityResult = (ActivityResult) obj;
            int i = RSportsBetTicketDetailsActivity.s0;
            if (activityResult.a != -1 || (intent = activityResult.b) == null || (stringExtra = intent.getStringExtra("extra_remix_bet_share_code")) == null || stringExtra.isEmpty()) {
                return;
            }
            final RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = this.a;
            hc40 hc40Var = rSportsBetTicketDetailsActivity.f;
            nas nasVarA = ebs.a(rSportsBetTicketDetailsActivity.getLifecycle());
            String userId = TextUtils.isEmpty(rSportsBetTicketDetailsActivity.getAccountHelper().getUserId()) ? "" : rSportsBetTicketDetailsActivity.getAccountHelper().getUserId();
            boolean z = !rSportsBetTicketDetailsActivity.e.U().isEmpty();
            ?? r1 = new Consumer() { // from class: qs30
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    lws lwsVar = (lws) obj2;
                    int i2 = RSportsBetTicketDetailsActivity.s0;
                    rSportsBetTicketDetailsActivity.i0.x1(stringExtra, g08.REMIX_BET_RECOMMENDED_CODES, true, false, lwsVar);
                }
            };
            hc40Var.getClass();
            userId.getClass();
            ej5.c(nasVarA, null, null, new fc40(r1, hc40Var, nasVarA, userId, z, null), 3);
        }
    });

    public class a implements tce0 {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.tce0
        public final void a0(hqc hqcVar) {
            boolean z = hqcVar instanceof lqc;
            RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = RSportsBetTicketDetailsActivity.this;
            if (z) {
                eu30 eu30Var = rSportsBetTicketDetailsActivity.E;
                if (eu30Var != null) {
                    eu30Var.k(true);
                    return;
                }
                return;
            }
            if (!(hqcVar instanceof nqc)) {
                if (hqcVar instanceof kqc) {
                    eu30 eu30Var2 = rSportsBetTicketDetailsActivity.E;
                    if (eu30Var2 != null) {
                        eu30Var2.k(false);
                    }
                    zyf0.b(R.string.common_feedback__something_went_wrong_please_try_again, 0);
                    return;
                }
                return;
            }
            rSportsBetTicketDetailsActivity.e0 = (BookingData) ((nqc) hqcVar).a;
            if (rSportsBetTicketDetailsActivity.getAccountHelper().hasPersonalPage()) {
                if (TextUtils.isEmpty(rSportsBetTicketDetailsActivity.e0.shareCode)) {
                    return;
                }
                rSportsBetTicketDetailsActivity.d0.x1(rSportsBetTicketDetailsActivity.e0.shareCode);
                return;
            }
            eu30 eu30Var3 = rSportsBetTicketDetailsActivity.E;
            if (eu30Var3 != null) {
                eu30Var3.k(false);
            }
            BookingData bookingData = rSportsBetTicketDetailsActivity.e0;
            Boolean bool = Boolean.TRUE;
            Boolean bool2 = Boolean.FALSE;
            rSportsBetTicketDetailsActivity.A1(bookingData, new zha0(bool, bool2, bool2, rSportsBetTicketDetailsActivity.getAccountHelper().getLastNickName(), rSportsBetTicketDetailsActivity.getAccountHelper().getAvatarUrl()));
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = RSportsBetTicketDetailsActivity.this;
            rSportsBetTicketDetailsActivity.E.j(false);
            rSportsBetTicketDetailsActivity.E.i(false);
            rSportsBetTicketDetailsActivity.X = false;
            rSportsBetTicketDetailsActivity.D1(rSportsBetTicketDetailsActivity.w);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            VMRunner.invoke("Xc7VTIrIyNJnSAGJ", new Object[]{this, context, intent});
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [ss30] */
    public final void A1(final BookingData bookingData, final zha0 zha0Var) {
        ArrayList arrayList = new ArrayList(this.e.U());
        this.e.G(true);
        List<Event> list = bookingData.outcomes;
        if (list != null) {
            LinkedHashMap linkedHashMapA = apg.a(list);
            for (Event event : list) {
                if (event.markets != null && !event.isBetBuilderChild()) {
                    for (Market market : event.markets) {
                        List<Outcome> list2 = market.outcomes;
                        if (list2 != null && market.status != 3) {
                            Iterator<Outcome> it = list2.iterator();
                            while (it.hasNext()) {
                                this.e.N0(event, market, it.next(), true, false, (List) linkedHashMapA.get(market.id), k980.DEFAULT, false, false, false, null, false, false, false);
                            }
                        }
                    }
                }
            }
        }
        final ArrayList arrayList2 = new ArrayList(this.e.U());
        zha0Var.c = Boolean.valueOf(this.e.t());
        this.e.G(true);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Selection selection = (Selection) obj;
            this.e.N0(selection.a, selection.b, selection.c, true, false, selection.d, k980.DEFAULT, false, false, false, null, false, false, false);
        }
        g93.b(new Share(bookingData.shareCode, bookingData.shareURL));
        String str = bookingData.shareCode;
        if (str == null) {
            str = "";
        }
        b190 b190Var = new b190(arrayList2, null, zha0Var.d, str, null, Collections.EMPTY_MAP);
        t090 t090Var = this.i;
        nas nasVarA = ebs.a(getLifecycle());
        ?? r5 = new Consumer() { // from class: ss30
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                c190 c190Var = (c190) obj2;
                int i2 = RSportsBetTicketDetailsActivity.s0;
                StringBuilder sb = new StringBuilder();
                sb.append(o7d.a(wae.SHARE));
                sb.append("?imageUri=");
                sb.append(c190Var.a);
                sb.append("&imageWithUserUri=");
                sb.append(c190Var.b);
                sb.append("&linkUrl=");
                BookingData bookingData2 = bookingData;
                sb.append(bookingData2.shareURL);
                sb.append("&shareCode=");
                sb.append(bookingData2.shareCode);
                sb.append(zha0Var.a());
                sb.append("&isSingleBetBuilder=");
                sb.append(g880.x(arrayList2));
                sb.append("&source=bet_detail");
                String string = sb.toString();
                RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = this.a;
                if (rSportsBetTicketDetailsActivity.h0 != null) {
                    StringBuilder sbB = mq0.b(string, "&userNote=");
                    sbB.append(rSportsBetTicketDetailsActivity.h0.getNoteText());
                    string = sbB.toString();
                }
                if (rSportsBetTicketDetailsActivity.w != null) {
                    StringBuilder sbB2 = mq0.b(string, "&orderId=");
                    sbB2.append(rSportsBetTicketDetailsActivity.w);
                    string = sbB2.toString();
                }
                sh8.c().e(string);
            }
        };
        t090Var.getClass();
        ej5.c(nasVarA, null, null, new a190(r5, t090Var, b190Var, null), 3);
    }

    public final void B1(boolean z) {
        if (this.I) {
            if (z) {
                this.B.setRefreshing(true);
            } else {
                this.C.K();
            }
            su5<BaseResponse<JackpotBet>> su5Var = this.K;
            if (su5Var != null) {
                su5Var.cancel();
            }
            su5<BaseResponse<JackpotBet>> su5VarF = this.A.f(this.w);
            this.K = su5VarF;
            su5VarF.G(new vt30(this, z));
            return;
        }
        if (this.G) {
            return;
        }
        if (z) {
            this.B.setRefreshing(true);
        } else {
            this.C.K();
        }
        this.G = true;
        ds30 ds30Var = this.q0;
        String str = this.w;
        ds30Var.getClass();
        str.getClass();
        h940 h940Var = ds30Var.a;
        kzh.d(new g1i(bm50.a(r1i.b(r0i.a(h940Var.q(str), new as30(ds30Var, null)), h940Var.h(str), ds30Var.b.getNickName(), bm50.f(ds30Var.c.a(pu0.b.a)), new yr30(ds30Var, null))), new zr30(ds30Var, null)), o8i0.d(ds30Var));
    }

    public final void C1(int i, String str) {
        this.Q = str;
        this.R = i;
        boolean z = this.X && !TextUtils.isEmpty(this.Y);
        x9h x9hVar = z ? new x9h(this.Y, this.Z) : null;
        if (z) {
            this.E.j(true);
            this.E.i(true);
        }
        String cMSString = getCMSString(R.string.common_functions__check_out_my_big_win, new Object[0]);
        String cMSString2 = getCMSString(R.string.common_functions__sportybet_hash_tag, new Object[0]);
        f290 f290Var = this.b0;
        String str2 = this.w;
        Configuration configuration = getResources().getConfiguration();
        q190 q190Var = q190.a;
        f290Var.z1(str2, configuration, cMSString, cMSString2, x9hVar);
        f290 f290Var2 = this.b0;
        f290Var2.getClass();
        ej5.c(o8i0.d(f290Var2), null, null, new k290(null, f290Var2), 3);
        if (z) {
            return;
        }
        boolean z2 = this.X;
        eu30 eu30Var = this.E;
        if (z2) {
            eu30Var.j(false);
            this.E.i(false);
        } else {
            eu30Var.j(true);
        }
        this.b0.A1(this.w, true ^ TextUtils.isEmpty(this.g0));
        this.b0.I.a(Unit.a);
    }

    public final void D1(String str) {
        this.E.j(false);
        this.E.i(false);
        try {
            String strEncode = URLEncoder.encode(bjb0.S("/m/share_win/" + str), "UTF-8");
            sh8.c().g(strEncode + this.Z);
        } catch (UnsupportedEncodingException unused) {
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void i() {
        B1(true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.ticket_back_icon) {
            if (this.y.booleanValue()) {
                sh8.c().e(o7d.a(wae.HOME));
            } else {
                finish();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v18, types: [T, com.sportybet.plugin.realsports.data.RTicket] */
    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        final RTicket rTicket;
        super.onCreate(bundle);
        setContentView(R.layout.spr_activity_bet_ticket_details);
        this.j0 = new h330(this);
        boolean booleanExtra = getIntent().getBooleanExtra("is_jackpot", false);
        this.I = booleanExtra;
        if (booleanExtra) {
            Order order = (Order) getIntent().getParcelableExtra("key_order");
            this.J = order;
            if (order == null) {
                finish();
                return;
            }
            this.w = order.orderId;
        } else {
            this.w = getIntent().getStringExtra(AnalyticsParam.SOCIAL_ORDER_ID);
            this.y = Boolean.valueOf(getIntent().getBooleanExtra("from_verify_bet", false));
            this.f0 = (VerifyBetData) getIntent().getParcelableExtra("verify_bet_data");
        }
        if (TextUtils.isEmpty(this.w)) {
            finish();
            return;
        }
        findViewById(R.id.ticket_back_icon).setOnClickListener(this);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.ticket_swipe_layout);
        this.B = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(this);
        if (this.y.booleanValue()) {
            this.B.setEnabled(false);
        }
        LoadingView loadingView = (LoadingView) findViewById(R.id.ticket_loading_view);
        this.C = loadingView;
        loadingView.setOnClickListener(new pt30(this));
        this.D = (RecyclerView) findViewById(R.id.ticket_recycler_view);
        this.S = (ConstraintLayout) findViewById(R.id.verify_code_container);
        findViewById(R.id.verify_code_close).setOnClickListener(new qt30(this));
        this.T = (TextView) findViewById(R.id.verify_code);
        this.U = (TextView) findViewById(R.id.header_title);
        rt30 rt30Var = new rt30(this);
        glw glwVar = new glw();
        glwVar.d = rt30Var;
        Paint paint = new Paint();
        glwVar.e = paint;
        paint.setColor(glwVar.a);
        TextPaint textPaint = new TextPaint();
        int i = 1;
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(40.0f);
        textPaint.setColor(-1);
        textPaint.setTextAlign(Paint.Align.LEFT);
        glwVar.b = zch0.b(getResources(), 50);
        this.M = glwVar;
        findViewById(R.id.home).setOnClickListener(new ht30());
        findViewById(R.id.customer_service).setOnClickListener(new View.OnClickListener() { // from class: it30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = RSportsBetTicketDetailsActivity.s0;
                RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = this.a;
                rSportsBetTicketDetailsActivity.d.b(rSportsBetTicketDetailsActivity, snb0.TICKET_DETAIL);
            }
        });
        try {
            WebView webView = new WebView(this);
            this.P = webView;
            this.webViewWrapperService.installJsBridge(this, webView, new st30(this), new WebChromeClient());
            this.P.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
            this.P.getSettings().setCacheMode(2);
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_COMMON);
            aVar.f(e, "BetTicketDetail Failed to init webView %s", e.getMessage());
        }
        final AtomicReference atomicReference = new AtomicReference();
        bdy bdyVar = new bdy(this.V.e(new faj() { // from class: ts30
            @Override // defpackage.faj
            public final Object apply(Object obj) {
                final String str = (String) obj;
                int i2 = RSportsBetTicketDetailsActivity.s0;
                final RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = this.a;
                final AtomicReference atomicReference2 = atomicReference;
                return new ycy(new ydy() { // from class: zs30
                    @Override // defpackage.ydy
                    public final void a(ycy.a aVar2) {
                        RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity2 = rSportsBetTicketDetailsActivity;
                        String str2 = str;
                        AtomicReference atomicReference3 = atomicReference2;
                        int i3 = RSportsBetTicketDetailsActivity.s0;
                        try {
                            aVar2.b(rSportsBetTicketDetailsActivity2.z1(str2, atomicReference3));
                            aVar2.a();
                        } catch (IOException e2) {
                            if (aVar2.c(e2)) {
                                return;
                            }
                            o760.b(e2);
                        }
                    }
                });
            }
        }).f(wm70.c).e(new faj() { // from class: us30
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.faj
            public final Object apply(Object obj) {
                int i2 = RSportsBetTicketDetailsActivity.s0;
                RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = this.a;
                ct90<z190> ct90VarB1 = rSportsBetTicketDetailsActivity.b0.B1(rSportsBetTicketDetailsActivity.w, (MultipartBody.Part) obj, !TextUtils.isEmpty(rSportsBetTicketDetailsActivity.g0));
                return ct90VarB1 instanceof zaj ? ((zaj) ct90VarB1).a() : new gw90(ct90VarB1);
            }
        }).f(va0.a()), new ib() { // from class: vs30
            @Override // defpackage.ib
            public final void run() {
                int i2 = RSportsBetTicketDetailsActivity.s0;
                RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = this.a;
                rSportsBetTicketDetailsActivity.o0.removeCallbacks(rSportsBetTicketDetailsActivity.p0);
                File file = (File) atomicReference.getAndSet(null);
                if (file != null) {
                    file.delete();
                }
            }
        });
        rlr rlrVar = new rlr(new pya() { // from class: ws30
            @Override // defpackage.pya
            public final void accept(Object obj) {
                z190 z190Var = (z190) obj;
                int i2 = RSportsBetTicketDetailsActivity.s0;
                boolean z = z190Var instanceof z190.b;
                RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = this.a;
                if (!z) {
                    if (z190Var instanceof z190.a) {
                        rSportsBetTicketDetailsActivity.X = false;
                        rSportsBetTicketDetailsActivity.D1(rSportsBetTicketDetailsActivity.w);
                        return;
                    }
                    return;
                }
                ShareWinData shareWinData = ((z190.b) z190Var).a;
                rSportsBetTicketDetailsActivity.X = true;
                try {
                    if (!TextUtils.isEmpty(shareWinData.getShareUrl())) {
                        rSportsBetTicketDetailsActivity.Y = shareWinData.getShareUrl();
                        sh8.c().g(shareWinData.getShareUrl() + rSportsBetTicketDetailsActivity.Z);
                        return;
                    }
                    fbh0 fbh0VarC = sh8.c();
                    StringBuilder sb = new StringBuilder();
                    sb.append(URLEncoder.encode(bjb0.S("/m/share_win/" + rSportsBetTicketDetailsActivity.w), "UTF-8"));
                    sb.append(rSportsBetTicketDetailsActivity.Z);
                    fbh0VarC.g(sb.toString());
                } catch (Exception unused) {
                    rSportsBetTicketDetailsActivity.X = false;
                    rSportsBetTicketDetailsActivity.D1(rSportsBetTicketDetailsActivity.w);
                }
            }
        }, new pya() { // from class: xs30
            @Override // defpackage.pya
            public final void accept(Object obj) {
                int i2 = RSportsBetTicketDetailsActivity.s0;
                RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = this.a;
                rSportsBetTicketDetailsActivity.X = false;
                rSportsBetTicketDetailsActivity.D1(rSportsBetTicketDetailsActivity.w);
            }
        }, taj.c);
        bdyVar.a(rlrVar);
        this.W.b(rlrVar);
        boolean zBooleanValue = this.y.booleanValue();
        TextView textView = this.U;
        if (zBooleanValue) {
            textView.setText(getCMSString(R.string.verify_bet__verify_bet, new Object[0]));
        } else {
            textView.setText(getCMSString(R.string.component_betslip__sim_ticket_details, new Object[0]));
        }
        boolean z = bundle == null;
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(f290.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        f290 f290Var = (f290) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        this.b0 = f290Var;
        if (z) {
            ej5.c(o8i0.d(f290Var), null, null, new g290(null, f290Var), 3);
        }
        i2i.b(this.b0.F).f(this, new lfy() { // from class: lt30
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                y190 y190Var = (y190) obj;
                int i2 = RSportsBetTicketDetailsActivity.s0;
                RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = this.a;
                rSportsBetTicketDetailsActivity.E.j(false);
                rSportsBetTicketDetailsActivity.E.i(false);
                if (y190Var instanceof y190.c) {
                    sh8.c().g(((y190.c) y190Var).a);
                    return;
                }
                if (y190Var instanceof y190.b) {
                    rSportsBetTicketDetailsActivity.X = false;
                    rSportsBetTicketDetailsActivity.E.j(true);
                    rSportsBetTicketDetailsActivity.P.loadUrl(bjb0.S("/m/share-win-card"));
                    return;
                }
                if (y190Var instanceof y190.a) {
                    rSportsBetTicketDetailsActivity.X = false;
                    rSportsBetTicketDetailsActivity.D1(rSportsBetTicketDetailsActivity.w);
                }
            }
        });
        i2i.b(this.b0.z).f(this, new lfy() { // from class: ms30
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                rdk rdkVar = (rdk) obj;
                int i2 = RSportsBetTicketDetailsActivity.s0;
                if (rdkVar instanceof rdk.b) {
                    ShareWinData shareWinData = ((rdk.b) rdkVar).a;
                    if (TextUtils.isEmpty(shareWinData.getShareUrl())) {
                        return;
                    }
                    RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = this.a;
                    rSportsBetTicketDetailsActivity.X = true;
                    rSportsBetTicketDetailsActivity.Y = shareWinData.getShareUrl();
                }
            }
        });
        i2i.b(this.b0.B).f(this, new sa3(this, i));
        i2i.b(this.b0.D).f(this, new lfy() { // from class: os30
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                String str = (String) obj;
                int i2 = RSportsBetTicketDetailsActivity.s0;
                RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = this.a;
                rSportsBetTicketDetailsActivity.E.j(false);
                rSportsBetTicketDetailsActivity.E.i(false);
                if (str != null) {
                    sh8.c().g(str);
                }
            }
        });
        v8i0 viewModelStore2 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory2 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras2 = getDefaultViewModelCreationExtras();
        viewModelStore2.getClass();
        defaultViewModelProviderFactory2.getClass();
        defaultViewModelCreationExtras2.getClass();
        s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, defaultViewModelCreationExtras2);
        dq7 dq7VarA2 = jq40.a(ds30.class);
        String strI2 = dq7VarA2.i();
        if (strI2 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        ds30 ds30Var = (ds30) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
        this.q0 = ds30Var;
        ds30Var.C.f(this, new ua3(this, i));
        v8i0 viewModelStore3 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory3 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras3 = getDefaultViewModelCreationExtras();
        viewModelStore3.getClass();
        defaultViewModelProviderFactory3.getClass();
        defaultViewModelCreationExtras3.getClass();
        s8i0 s8i0Var3 = new s8i0(viewModelStore3, defaultViewModelProviderFactory3, defaultViewModelCreationExtras3);
        dq7 dq7VarA3 = jq40.a(im2.class);
        String strI3 = dq7VarA3.i();
        if (strI3 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        im2 im2Var = (im2) s8i0Var3.a(dq7VarA3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI3));
        this.c0 = im2Var;
        i2i.c(e1i.a(im2Var.e), null, 3).f(this, new va3(this, i));
        this.c0.i.f(this, new wa3(this, i));
        v8i0 viewModelStore4 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory4 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras4 = getDefaultViewModelCreationExtras();
        viewModelStore4.getClass();
        defaultViewModelProviderFactory4.getClass();
        defaultViewModelCreationExtras4.getClass();
        s8i0 s8i0Var4 = new s8i0(viewModelStore4, defaultViewModelProviderFactory4, defaultViewModelCreationExtras4);
        dq7 dq7VarA4 = jq40.a(eja0.class);
        String strI4 = dq7VarA4.i();
        if (strI4 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        eja0 eja0Var = (eja0) s8i0Var4.a(dq7VarA4, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI4));
        this.d0 = eja0Var;
        eja0Var.i.f(this, new xa3(this, i));
        this.q0.A.f(this, new ya3(this, i));
        ds30 ds30Var2 = this.q0;
        ds30Var2.getClass();
        ej5.c(o8i0.d(ds30Var2), null, null, new xr30(ds30Var2, null), 3);
        v8i0 viewModelStore5 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory5 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras5 = getDefaultViewModelCreationExtras();
        viewModelStore5.getClass();
        defaultViewModelProviderFactory5.getClass();
        defaultViewModelCreationExtras5.getClass();
        s8i0 s8i0Var5 = new s8i0(viewModelStore5, defaultViewModelProviderFactory5, defaultViewModelCreationExtras5);
        dq7 dq7VarA5 = jq40.a(rws.class);
        String strI5 = dq7VarA5.i();
        if (strI5 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        rws rwsVar = (rws) s8i0Var5.a(dq7VarA5, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI5));
        this.i0 = rwsVar;
        i2i.b(rwsVar.e).f(this, new bb3(this, i));
        i2i.b(this.i0.i).f(this, new lfy() { // from class: bt30
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                mws.c cVar;
                String str;
                mws mwsVar = (mws) obj;
                int i2 = RSportsBetTicketDetailsActivity.s0;
                boolean z2 = mwsVar instanceof mws.a;
                RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = this.a;
                if (z2) {
                    sh8.c().e(o7d.a(wae.HOME));
                    rSportsBetTicketDetailsActivity.D.post(new ys30(0, rSportsBetTicketDetailsActivity, (mws.a) mwsVar));
                } else {
                    if (!(mwsVar instanceof mws.c) || (str = (cVar = (mws.c) mwsVar).a) == null || str.isEmpty()) {
                        return;
                    }
                    List<Event> list = cVar.b;
                    g08 g08Var = g08.UNKNOWN;
                    ekl.b(rSportsBetTicketDetailsActivity, str, list, "REMIX_BET_RECOMMENDED_CODES", false, cVar.d);
                }
            }
        });
        i2i.b(this.i0.w).f(this, new lfy() { // from class: ft30
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                int i2 = RSportsBetTicketDetailsActivity.s0;
                boolean z2 = ((tzs) obj) instanceof tzs.b;
                h330 h330Var = this.a.j0;
                if (z2) {
                    h330Var.b();
                } else {
                    h330Var.a();
                }
            }
        });
        i2i.b(this.i0.z).f(this, new lfy() { // from class: gt30
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                UiText uiText = (UiText) obj;
                int i2 = RSportsBetTicketDetailsActivity.s0;
                if (uiText != null) {
                    RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = this.a;
                    String string = uiText.e(rSportsBetTicketDetailsActivity).toString();
                    string.getClass();
                    js.d(rSportsBetTicketDetailsActivity, R.string.common_functions__error, string, null, null, 48);
                    rSportsBetTicketDetailsActivity.i0.y.setValue(null);
                }
            }
        });
        if (this.O == null) {
            this.O = new c();
        }
        fdt.a(this).b(this.O, new IntentFilter("com.sportybet.action.JS_EVENT"));
        this.a0.e(this.n0);
        this.q0.y.f(this, new lfy() { // from class: ls30
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                boolean z2;
                int i2;
                lk50 lk50Var = (lk50) obj;
                int i3 = RSportsBetTicketDetailsActivity.s0;
                RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = this.a;
                if (rSportsBetTicketDetailsActivity.isFinishing() || (lk50Var instanceof lk50.b)) {
                    return;
                }
                rSportsBetTicketDetailsActivity.C.setVisibility(8);
                if (!(lk50Var instanceof lk50.c)) {
                    if (lk50Var instanceof lk50.a) {
                        Throwable th = ((lk50.a) lk50Var).a;
                        boolean z3 = th instanceof SprThrowable;
                        SwipeRefreshLayout swipeRefreshLayout2 = rSportsBetTicketDetailsActivity.B;
                        if (z3) {
                            boolean z4 = swipeRefreshLayout2.c;
                            String string = ((SprThrowable) th).b().e(rSportsBetTicketDetailsActivity).toString();
                            if (z4) {
                                z2 = false;
                                zyf0.c(0, string);
                            } else {
                                z2 = false;
                                rSportsBetTicketDetailsActivity.C.J(string);
                            }
                        } else {
                            z2 = false;
                            boolean z5 = swipeRefreshLayout2.c;
                            String cMSString = rSportsBetTicketDetailsActivity.getCMSString(R.string.common_feedback__no_internet_connection_try_again, new Object[0]);
                            if (z5) {
                                zyf0.c(0, cMSString);
                            } else {
                                rSportsBetTicketDetailsActivity.C.J(cMSString);
                            }
                        }
                    }
                    rSportsBetTicketDetailsActivity.G = z2;
                    rSportsBetTicketDetailsActivity.B.setRefreshing(z2);
                }
                jqf0 jqf0Var = (jqf0) ((lk50.c) lk50Var).a;
                BoreDrawConfig boreDrawConfig = jqf0Var.d;
                int i4 = jqf0Var.b;
                rSportsBetTicketDetailsActivity.H = jqf0Var.a;
                boolean z6 = i4 == 20 || i4 == 30 || i4 == 40;
                rSportsBetTicketDetailsActivity.L = z6 ? 1 : 2;
                rSportsBetTicketDetailsActivity.g0 = jqf0Var.c;
                eu30 eu30Var = rSportsBetTicketDetailsActivity.E;
                if (eu30Var == null) {
                    i2 = i4;
                    eu30 eu30Var2 = new eu30(rSportsBetTicketDetailsActivity, rSportsBetTicketDetailsActivity.a0, z6, rSportsBetTicketDetailsActivity.y.booleanValue(), rSportsBetTicketDetailsActivity.H, rSportsBetTicketDetailsActivity.getAccountHelper(), rSportsBetTicketDetailsActivity.l0, rSportsBetTicketDetailsActivity, new ut30(rSportsBetTicketDetailsActivity), qq1.a(rSportsBetTicketDetailsActivity.c, BOConfigParam.CashoutFlexibleBetAllow, true), qq1.a(rSportsBetTicketDetailsActivity.c, BOConfigParam.CashoutAnyWinAllow, true), boreDrawConfig, qq1.a(rSportsBetTicketDetailsActivity.c, BOConfigParam.CashoutSupportGiftEnabled, false), rSportsBetTicketDetailsActivity.m0);
                    rSportsBetTicketDetailsActivity.E = eu30Var2;
                    eu30Var2.G = rSportsBetTicketDetailsActivity;
                    rSportsBetTicketDetailsActivity.D.setAdapter(eu30Var2);
                } else {
                    i2 = i4;
                    boolean zBooleanValue2 = rSportsBetTicketDetailsActivity.y.booleanValue();
                    List<hl30> list = rSportsBetTicketDetailsActivity.H;
                    eu30Var.c = z6;
                    eu30Var.b = list;
                    eu30Var.d = zBooleanValue2;
                    eu30Var.F = boreDrawConfig;
                    eu30Var.notifyDataSetChanged();
                }
                rSportsBetTicketDetailsActivity.D.j0(rSportsBetTicketDetailsActivity.M);
                if (i2 == 90) {
                    rSportsBetTicketDetailsActivity.D.i(rSportsBetTicketDetailsActivity.M);
                }
                rSportsBetTicketDetailsActivity.w = jqf0Var.e;
                rSportsBetTicketDetailsActivity.h0 = jqf0Var.f;
                z2 = false;
                rSportsBetTicketDetailsActivity.G = z2;
                rSportsBetTicketDetailsActivity.B.setRefreshing(z2);
            }
        });
        if (!this.y.booleanValue()) {
            B1(false);
            return;
        }
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.bizCode = 10000;
        baseResponse.message = "";
        baseResponse.data = this.f0.getOrderInfoVO();
        BetTicketDetailData betTicketDetailData = new BetTicketDetailData(baseResponse, this.f0.getUserName(), false, true);
        this.g0 = this.f0.getOrderInfoVO().verifyCode;
        this.B.setRefreshing(false);
        this.C.setVisibility(8);
        int i2 = betTicketDetailData.getOrderInfoVO().bizCode;
        if (i2 != 10000) {
            if (i2 == 19411 || i2 == 19413) {
                boolean zIsSwipe = betTicketDetailData.isSwipe();
                String str = betTicketDetailData.getOrderInfoVO().message;
                if (zIsSwipe) {
                    zyf0.c(0, str);
                    return;
                } else {
                    this.C.J(str);
                    return;
                }
            }
            boolean zIsSwipe2 = betTicketDetailData.isSwipe();
            String cMSString = getCMSString(R.string.common_feedback__no_internet_connection_try_again, new Object[0]);
            if (zIsSwipe2) {
                zyf0.c(0, cMSString);
                return;
            } else {
                this.C.J(cMSString);
                return;
            }
        }
        RTicket rTicket2 = betTicketDetailData.getOrderInfoVO().data;
        if (rTicket2 == null) {
            boolean zIsSwipe3 = betTicketDetailData.isSwipe();
            String cMSString2 = getCMSString(R.string.common_feedback__no_internet_connection_try_again, new Object[0]);
            if (zIsSwipe3) {
                zyf0.c(0, cMSString2);
                return;
            } else {
                this.C.J(cMSString2);
                return;
            }
        }
        this.H.clear();
        this.H.add(new du30(rTicket2, !TextUtils.isEmpty(betTicketDetailData.getUserName()) ? betTicketDetailData.getUserName() : getCMSString(R.string.verify_bet__no_user_name_set, new Object[0]), false));
        String str2 = rTicket2.cashOutAmount;
        if (str2 != null && bjb0.d0(str2) > 0.0d) {
            bu30 bu30Var = new bu30();
            bu30Var.a = rTicket2.cashOutAmount;
            bu30Var.c = rTicket2.remainPotentialWinnings;
            bu30Var.b = rTicket2.remainStake;
            bu30Var.d = rTicket2.usedStake;
            bu30Var.f = rTicket2.hasTax();
            bu30Var.e = rTicket2.remainTaxAmount;
            this.H.add(bu30Var);
        }
        if (!this.y.booleanValue()) {
            this.H.add(new su30(rTicket2.userNote, rTicket2.orderId));
            this.h0 = rTicket2.userNote;
        }
        if (!rTicket2.isAllSelectionSettled() && !TextUtils.isEmpty(rTicket2.shareCode)) {
            this.H.add(new pu30(rTicket2));
        }
        List<RSelection> list = rTicket2.selections;
        if (list != null) {
            for (RSelection rSelection : list) {
                cu30 cu30Var = new cu30();
                cu30Var.a = rSelection;
                cu30Var.d = rTicket2.hasPendingEvent;
                this.H.add(cu30Var);
            }
        }
        if (!this.y.booleanValue()) {
            au30 au30Var = new au30();
            au30Var.a = rTicket2.betSize;
            au30Var.b = rTicket2.orderId;
            au30Var.c = rTicket2.shortId;
            au30Var.d = rTicket2.deviceCh;
            au30Var.e = rTicket2.deviceIp;
            au30Var.f = rTicket2.orderType;
            au30Var.g = rTicket2.isHistory;
            this.H.add(au30Var);
        }
        int i3 = rTicket2.winningStatus;
        boolean z2 = i3 == 20 || i3 == 30 || i3 == 40;
        this.L = z2 ? 1 : 2;
        lk50 lk50Var = (lk50) this.q0.y.d();
        BoreDrawConfig boreDrawConfig = new BoreDrawConfig(new ArrayList());
        if (lk50Var instanceof lk50.c) {
            boreDrawConfig = ((jqf0) ((lk50.c) lk50Var).a).d;
        }
        BoreDrawConfig boreDrawConfig2 = boreDrawConfig;
        eu30 eu30Var = this.E;
        if (eu30Var == null) {
            rTicket = rTicket2;
            eu30 eu30Var2 = new eu30(this, this.a0, z2, this.y.booleanValue(), this.H, getAccountHelper(), this.l0, this, new xt30(this), qq1.a(this.c, BOConfigParam.CashoutFlexibleBetAllow, true), qq1.a(this.c, BOConfigParam.CashoutAnyWinAllow, true), boreDrawConfig2, qq1.a(this.c, BOConfigParam.CashoutSupportGiftEnabled, false), this.m0);
            this.E = eu30Var2;
            eu30Var2.G = this;
            this.D.setAdapter(eu30Var2);
        } else {
            rTicket = rTicket2;
            boolean z3 = z2;
            boolean zBooleanValue2 = this.y.booleanValue();
            List<hl30> list2 = this.H;
            eu30Var.c = z3;
            eu30Var.b = list2;
            eu30Var.d = zBooleanValue2;
            eu30Var.F = boreDrawConfig2;
            eu30Var.notifyDataSetChanged();
        }
        this.D.j0(this.M);
        if (rTicket.winningStatus == 90) {
            this.D.i(this.M);
        }
        String str3 = rTicket.verifyCode;
        this.g0 = str3;
        if (TextUtils.isEmpty(str3) || !this.y.booleanValue()) {
            return;
        }
        this.S.setVisibility(0);
        this.T.setText(rTicket.verifyCode);
        this.T.setOnClickListener(new View.OnClickListener() { // from class: kt30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = RSportsBetTicketDetailsActivity.s0;
                yrh0.e(rTicket.verifyCode);
            }
        });
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        this.o0.removeCallbacksAndMessages(null);
        super.onDestroy();
        ArrayList arrayList = this.a0.a;
        a aVar = this.n0;
        if (arrayList.contains(aVar)) {
            arrayList.remove(aVar);
        }
        this.webViewWrapperService.uninstallJsBridge(this.P);
        if (this.O != null) {
            fdt.a(this).d(this.O);
        }
        WebView webView = this.P;
        if (webView != null) {
            webView.onPause();
            this.P.destroy();
        }
        h330 h330Var = this.j0;
        if (h330Var != null) {
            h330Var.a();
            this.j0 = null;
        }
        this.W.d();
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        if (this.y.booleanValue()) {
            return;
        }
        B1(false);
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        ds30 ds30Var = this.q0;
        if (ds30Var != null) {
            ej5.c(o8i0.d(ds30Var), null, null, new xr30(ds30Var, null), 3);
        }
    }

    public final MultipartBody.Part z1(String str, AtomicReference atomicReference) throws IOException {
        byte[] bArrDecode = Base64.decode(str.split(",")[1], 0);
        File file = new File(getCacheDir(), "ticketshare.png");
        atomicReference.set(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArrDecode);
            fileOutputStream.close();
            return MultipartBody.Part.createFormData("file", file.getName(), RequestBody.create(MediaType.parse("image/jpeg"), file));
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
