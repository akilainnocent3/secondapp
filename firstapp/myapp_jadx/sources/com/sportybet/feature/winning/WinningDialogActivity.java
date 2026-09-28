package com.sportybet.feature.winning;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import com.pairip.VMRunner;
import com.sporty.android.common.uievent.e;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.remixbet.RemixBetOrderRequest;
import com.sporty.android.core.model.sharewin.ShareWinData;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.bethistory.presentation.activity.RSportsBetTicketDetailsActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.openbet.presentation.activity.OpenBetActivity;
import com.sportybet.android.transaction.ui.txlist.TxListActivity;
import com.sportybet.feature.inappreview.InAppReviewDialogActivity;
import com.sportybet.feature.remixbet.presentation.RemixBetActivity;
import com.sportybet.feature.winning.WinningDialogActivity;
import com.sportybet.feature.winning.a;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import com.sportybet.plugin.realsports.data.Event;
import defpackage.a8b;
import defpackage.ajp;
import defpackage.b1z;
import defpackage.bdy;
import defpackage.bjb0;
import defpackage.bum;
import defpackage.cbj0;
import defpackage.ce;
import defpackage.ch20;
import defpackage.cny;
import defpackage.cyb;
import defpackage.dbj0;
import defpackage.dq7;
import defpackage.eal;
import defpackage.ebj0;
import defpackage.ee;
import defpackage.ej5;
import defpackage.ejp;
import defpackage.ema;
import defpackage.f00;
import defpackage.f290;
import defpackage.faj;
import defpackage.fdt;
import defpackage.g290;
import defpackage.g9i0;
import defpackage.gbn;
import defpackage.ggd0;
import defpackage.gym;
import defpackage.haj0;
import defpackage.hb5;
import defpackage.hif;
import defpackage.i0h0;
import defpackage.i2i;
import defpackage.iaj0;
import defpackage.ib;
import defpackage.iny;
import defpackage.itf0;
import defpackage.iu2;
import defpackage.iym;
import defpackage.j5f0;
import defpackage.j7g;
import defpackage.jq40;
import defpackage.k9j;
import defpackage.lfy;
import defpackage.lr00;
import defpackage.mkh;
import defpackage.n8j0;
import defpackage.o7d;
import defpackage.o8i0;
import defpackage.ofj0;
import defpackage.pr0;
import defpackage.psm;
import defpackage.pya;
import defpackage.q190;
import defpackage.qg20;
import defpackage.qoa0;
import defpackage.r5b;
import defpackage.r6i0;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.rlr;
import defpackage.rws;
import defpackage.s7m;
import defpackage.s8i0;
import defpackage.sh8;
import defpackage.sn5;
import defpackage.taj;
import defpackage.thf;
import defpackage.tlf;
import defpackage.tsg0;
import defpackage.u350;
import defpackage.ud;
import defpackage.uy0;
import defpackage.v8i0;
import defpackage.va0;
import defpackage.vgb0;
import defpackage.vym;
import defpackage.w9j0;
import defpackage.wae;
import defpackage.wm70;
import defpackage.wwd0;
import defpackage.x9h;
import defpackage.xib0;
import defpackage.yi5;
import defpackage.yrh0;
import defpackage.ys60;
import defpackage.zd2;
import defpackage.zug;
import defpackage.zux;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class WinningDialogActivity extends s7m implements zux, View.OnClickListener, vym, k9j, rlf {
    public static final WeakHashMap<Activity, Object> f0 = new WeakHashMap<>();
    public String A;
    public int B;
    public long C;
    public String E;
    public int F;
    public String G;
    public ggd0 H;
    public String I;
    public String J;
    public boolean K;
    public boolean L;
    public String Q;
    public ofj0 R;
    public rws S;
    public f290 T;
    public WebView U;
    public d Y;
    public bum b;
    public String b0;
    public gbn c;
    public String c0;
    public psm d;
    public String d0;
    public uy0 e;
    public com.sportybet.feature.winning.b f;
    public iym i;
    public ys60 v;
    public b1z w;
    public e y;
    public yi5 z;
    public final ArrayList D = new ArrayList();
    public boolean M = true;
    public boolean N = true;
    public boolean O = false;
    public boolean P = false;
    public boolean V = false;
    public final Handler W = new Handler();
    public final a X = new a();
    public final zd2<String> Z = new zd2<>();
    public final ema a0 = new ema();
    public final ee<Intent> e0 = registerForActivityResult(new ce(), new ud() { // from class: faj0
        @Override // defpackage.ud
        public final void a(Object obj) {
            Intent intent;
            ActivityResult activityResult = (ActivityResult) obj;
            WeakHashMap<Activity, Object> weakHashMap = WinningDialogActivity.f0;
            int i = activityResult.a;
            WinningDialogActivity winningDialogActivity = this.a;
            if (i == -1 && (intent = activityResult.b) != null) {
                String stringExtra = intent.getStringExtra("extra_remix_bet_share_code");
                if (!TextUtils.isEmpty(stringExtra)) {
                    winningDialogActivity.S.x1(stringExtra, g08.WINNING_POPUP_REMIX_BET, true, false, lws.c);
                    return;
                }
            }
            winningDialogActivity.finish();
        }
    });

    /* JADX INFO: loaded from: classes6.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            WinningDialogActivity winningDialogActivity = WinningDialogActivity.this;
            winningDialogActivity.H.m0.a();
            winningDialogActivity.V = false;
            winningDialogActivity.E1(winningDialogActivity.d0);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public class b extends cny {
        public b() {
            super(true);
        }

        @Override // defpackage.cny
        public final void b() {
            WeakHashMap<Activity, Object> weakHashMap = WinningDialogActivity.f0;
            WinningDialogActivity winningDialogActivity = WinningDialogActivity.this;
            winningDialogActivity.D1();
            winningDialogActivity.finish();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public class c implements j5f0<Bitmap> {
        public c() {
        }

        @Override // defpackage.j5f0
        public final void a(Drawable drawable) {
        }

        @Override // defpackage.j5f0
        public final void b(Bitmap bitmap) {
            WinningDialogActivity winningDialogActivity = WinningDialogActivity.this;
            winningDialogActivity.H.G.setBackground(new BitmapDrawable(winningDialogActivity.getResources(), bitmap));
        }
    }

    public class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            VMRunner.invoke("K9jpyHspYVDmTMj0", new Object[]{this, context, intent});
        }
    }

    public static void C1(Context context, String str, u350.a aVar) {
        Intent intent = new Intent(context, (Class<?>) WinningDialogActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("type", "recent_winning_order");
        intent.putExtra("data", str);
        intent.putExtra("extra_show_ticket_detail_button", aVar.a);
        intent.putExtra("extra_show_remix_bet_red_dot", aVar.c);
        intent.putExtra("extra_show_remix_bet_tutorial", aVar.b);
        intent.putExtra("extra_dismiss_tutorial_on_remix_bet_click", aVar.e);
        intent.putExtra("extra_use_control_button_layout", aVar.d);
        context.startActivity(intent);
    }

    public final CharSequence A1(int i) {
        CharSequence charSequenceE;
        this.F = i;
        List<i0h0> list = i0h0.c;
        Object obj = null;
        for (Object obj2 : i0h0.a.a(null)) {
            if (((i0h0) obj2).a == i) {
                obj = obj2;
                break;
            }
        }
        i0h0 i0h0Var = (i0h0) obj;
        return (i0h0Var == null || (charSequenceE = i0h0Var.b.e(this)) == null) ? sn5.b(this, R.string.common_functions__unknown, new Object[0]) : charSequenceE;
    }

    public final void B1(String str) {
        ArrayList arrayList = this.D;
        if (TextUtils.isEmpty(str)) {
            finish();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_PERSONAL_TOPIC);
            aVar.a("json = %s", jSONObject.toString());
            String string = jSONObject.getString("type");
            lr00.a aVar2 = lr00.b;
            if ("recent_winning_order".equals(this.G) && "GiftUsablePush".equals(string)) {
                this.f.x1(false);
                return;
            }
            if ("recent_winning_order".equals(string)) {
                this.K = jSONObject.getJSONObject("data").getInt("bizType") == 4;
            }
            if ("recent_winning_order".equals(this.G) && "recent_winning_order".equals(string) && this.K) {
                return;
            }
            this.G = string;
            this.fullStoryCommonManager.b("WinningDialogActivity-" + this.G);
            if ("recent_winning_order".equals(string)) {
                if (this.K) {
                    F1(jSONObject.getJSONObject("data"));
                } else {
                    I1(jSONObject.getJSONObject("data"));
                }
                this.f.x1(!this.K);
                return;
            }
            if ("GiftUsablePush".equals(string)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                int iOptInt = jSONObject2.optInt("from", 0);
                arrayList.clear();
                try {
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("bizTypeScope");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            Integer num = (Integer) jSONArrayOptJSONArray.get(i);
                            num.getClass();
                            arrayList.add(num);
                        }
                    }
                } catch (Exception e) {
                    itf0.a aVar3 = itf0.a;
                    aVar3.q(MyLog.TAG_PERSONAL_TOPIC);
                    aVar3.e(e);
                }
                if (iOptInt == 1) {
                    G1(jSONObject2);
                } else {
                    H1(jSONObject.getJSONObject("data"));
                }
            }
        } catch (Exception e2) {
            itf0.a aVar4 = itf0.a;
            aVar4.q(MyLog.TAG_PERSONAL_TOPIC);
            aVar4.p(e2, "failed to show winning dialog", new Object[0]);
            finish();
        }
    }

    public final void D1() {
        if (this.L && this.M && this.z.b().j()) {
            startActivity(new Intent(this, (Class<?>) InAppReviewDialogActivity.class));
        }
    }

    public final void E1(String str) {
        this.H.m0.a();
        try {
            String strEncode = URLEncoder.encode(bjb0.S("/m/share_win/" + str), "UTF-8");
            if (!TextUtils.isEmpty(this.c0)) {
                strEncode = strEncode + this.c0;
            }
            sh8.c().g(strEncode);
        } catch (UnsupportedEncodingException unused) {
        }
    }

    public final void F1(JSONObject jSONObject) throws JSONException {
        this.H.M.setVisibility(8);
        this.H.E.setVisibility(8);
        this.H.l0.setVisibility(8);
        this.H.w.setVisibility(0);
        this.c.a(xib0.WINNING_DIALOG_BINGO_WIN, this.H.f);
        this.e.g();
        if (this.I == null || jSONObject.getLong("longTotalWinnings") > Long.parseLong(this.I)) {
            this.I = jSONObject.getString("longTotalWinnings");
            this.H.c.setText(a8b.d() + bjb0.U(Long.parseLong(this.I), Locale.US));
            this.J = jSONObject.getString("roundNo");
            this.H.v.setText("From " + ((Object) A1(jSONObject.getInt("bizType"))) + " Round No. " + this.J);
            jSONObject.getString("goodsId");
            jSONObject.getString("roundId");
        }
    }

    public final void G1(JSONObject jSONObject) throws JSONException {
        if (jSONObject.getLong("amount") > this.C) {
            this.H.M.setVisibility(8);
            this.H.l0.setVisibility(8);
            this.H.w.setVisibility(8);
            this.H.E.setVisibility(0);
            this.c.c(xib0.WINNING_DIALOG_CASH_GIFT, new c());
            long j = jSONObject.getLong("amount");
            this.C = j;
            this.H.B.setText(bjb0.V(j));
            String strOptString = jSONObject.optString("activityName");
            if (TextUtils.isEmpty(strOptString) || TextUtils.equals("null", strOptString)) {
                this.H.V.setVisibility(4);
            } else {
                this.H.V.setText(strOptString);
                this.H.V.setVisibility(0);
            }
        }
    }

    public final void H1(JSONObject jSONObject) throws JSONException {
        TextView textView;
        RelativeLayout relativeLayout;
        boolean zOptBoolean = jSONObject.optBoolean("isMultiple");
        ggd0 ggd0Var = this.H;
        if (zOptBoolean) {
            ggd0Var.Q.setVisibility(8);
            this.H.N.setVisibility(8);
            this.H.O.setVisibility(0);
            ggd0 ggd0Var2 = this.H;
            textView = ggd0Var2.L;
            relativeLayout = ggd0Var2.O;
        } else {
            ggd0Var.Q.setVisibility(8);
            this.H.N.setVisibility(0);
            this.H.O.setVisibility(8);
            ggd0 ggd0Var3 = this.H;
            textView = ggd0Var3.K;
            relativeLayout = ggd0Var3.N;
        }
        if (jSONObject.getLong("amount") > this.C) {
            this.H.l0.setVisibility(8);
            this.H.E.setVisibility(8);
            this.H.w.setVisibility(8);
            this.H.M.setVisibility(0);
            RelativeLayout relativeLayout2 = this.H.y;
            Resources resources = getResources();
            BitmapFactory.Options options = new BitmapFactory.Options();
            Bitmap.Config config = Bitmap.Config.RGB_565;
            options.inPreferredConfig = config;
            options.inMutable = true;
            relativeLayout2.setBackgroundDrawable(new BitmapDrawable(resources, BitmapFactory.decodeStream(getResources().openRawResource(R.drawable.spr_dialog_gift_multiple_bg), null, options)));
            long j = jSONObject.getLong("leastOrderAmount");
            this.C = jSONObject.getLong("amount");
            if (jSONObject.optBoolean("isMultiple")) {
                Resources resources2 = getResources();
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inPreferredConfig = config;
                options2.inMutable = true;
                relativeLayout.setBackgroundDrawable(new BitmapDrawable(resources2, BitmapFactory.decodeStream(getResources().openRawResource(R.drawable.gift_pac_card_bg), null, options2)));
                textView.setText(bjb0.V(this.C));
                this.H.Z.setText(getCMSString(R.string.gift__received_new_gift, new Object[0]));
            } else {
                int i = jSONObject.getInt("kind");
                if (i == 1) {
                    textView.setText(bjb0.V(this.C));
                    relativeLayout.setBackgroundResource(R.drawable.spr_dialog_gift_green);
                    this.H.Z.setText(getCMSString(R.string.component_cash_gift_popup__received_a_cash_gift, new Object[0]));
                    this.H.P.setText(getCMSString(R.string.component_pop_dialog__on_any_stake, new Object[0]));
                } else if (i == 2) {
                    textView.setText(bjb0.V(this.C) + " " + getCMSString(R.string.component_coupon__u_off, new Object[0]));
                    relativeLayout.setBackgroundResource(R.drawable.spr_dialog_gift_yellow);
                    this.H.P.setText(getCMSString(R.string.component_coupon__on_stakes_of_vcondition_or_more, bjb0.V(j)));
                    this.H.Z.setText(getCMSString(R.string.gift__received_discount_gift, new Object[0]));
                } else if (i != 3) {
                    relativeLayout.setBackgroundResource(R.drawable.spr_dialog_gift_green);
                } else {
                    textView.setText(bjb0.V(this.C));
                    relativeLayout.setBackgroundResource(R.drawable.spr_dialog_gift_free);
                    this.H.P.setText(getCMSString(R.string.component_coupon__stakes_not_returned_with_winnings, new Object[0]));
                    this.H.Z.setText(getCMSString(R.string.gift__received_free_gift, new Object[0]));
                }
            }
            String strOptString = jSONObject.optString("srcCtt");
            if (TextUtils.isEmpty(strOptString) || "null".equals(strOptString)) {
                this.H.R.setVisibility(8);
            } else {
                this.H.R.setVisibility(0);
                this.H.R.setText(strOptString);
            }
            String strOptString2 = jSONObject.optString("title");
            if (TextUtils.isEmpty(strOptString2) || "null".equals(strOptString2)) {
                this.H.S.setVisibility(8);
            } else {
                this.H.S.setText(strOptString2);
                this.H.S.setVisibility(0);
            }
        }
    }

    public final void I1(JSONObject jSONObject) throws JSONException {
        this.H.M.setVisibility(8);
        this.H.E.setVisibility(8);
        this.H.w.setVisibility(8);
        this.H.l0.setVisibility(0);
        this.L = jSONObject.optBoolean("displayRatingForUser", false);
        this.Q = jSONObject.optString("verifyCode");
        int iOptInt = jSONObject.optInt("settleType", 0);
        gbn gbnVar = this.c;
        if (iOptInt == 1) {
            gbnVar.a(xib0.FLASH_WIN_WINNING_DIALOG_BACKGROUND, this.H.T);
            this.H.f0.setText(getCMSString(R.string.bet_history__u_flash_win, new Object[0]));
        } else {
            gbnVar.a(xib0.WINNING_DIALOG, this.H.T);
            this.H.f0.setText(getCMSString(R.string.component_pop_dialog__you_won, new Object[0]));
        }
        if (this.A == null || Float.parseFloat(jSONObject.getString("totalWinnings")) > Float.parseFloat(this.A)) {
            String string = jSONObject.getString("totalWinnings");
            this.A = string;
            try {
                string = bjb0.a0(Double.parseDouble(string), Locale.US);
            } catch (Throwable th) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_WINNING_POPUP);
                aVar.e(th);
            }
            this.H.b.setText(this.d.b() + string);
            this.E = jSONObject.getString("shortId");
            this.F = jSONObject.getInt("bizType");
            if (TextUtils.isEmpty(this.Q) || "null".equals(this.Q)) {
                TextView textView = this.H.g0;
                StringBuilder sb = new StringBuilder();
                sb.append(getCMSString(R.string.common_dates__from, new Object[0]));
                sb.append(getCMSString(R.string.app_common__blank_space, new Object[0]));
                sb.append((Object) A1(jSONObject.getInt("bizType")));
                sb.append(getCMSString(R.string.app_common__blank_space, new Object[0]));
                sb.append(getCMSString(R.string.component_pop_dialog__ticket_id, new Object[0]));
                sb.append(getCMSString(R.string.app_common__blank_space, new Object[0]));
                zug.b(sb, this.E, textView);
            } else {
                this.H.g0.setVisibility(8);
                this.H.i0.setText(getCMSString(R.string.bet_history__verify_code, new Object[0]) + ": ");
                this.H.i0.setVisibility(0);
                this.H.h0.setVisibility(0);
                this.H.h0.setText(this.Q);
            }
            this.d0 = jSONObject.getString("orderId");
            int iOptInt2 = jSONObject.optInt("percent");
            this.B = iOptInt2;
            ggd0 ggd0Var = this.H;
            if (iOptInt2 > 0) {
                ggd0Var.U.setVisibility(0);
                this.H.U.setText(getCMSString(R.string.component_pop_dialog__android_you_got_more_winnings_than_vnum_of_all_users_new, String.valueOf(this.B)));
            } else {
                ggd0Var.U.setVisibility(8);
            }
        }
        WebView webView = new WebView(this);
        this.U = webView;
        this.webViewWrapperService.installJsBridge(this, webView, new iaj0(this), new WebChromeClient());
        this.U.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        this.U.getSettings().setCacheMode(2);
        final AtomicReference atomicReference = new AtomicReference();
        bdy bdyVar = new bdy(this.Z.e(new faj() { // from class: gaj0
            @Override // defpackage.faj
            public final Object apply(Object obj) {
                final String str = (String) obj;
                WeakHashMap<Activity, Object> weakHashMap = WinningDialogActivity.f0;
                final WinningDialogActivity winningDialogActivity = this.a;
                final AtomicReference atomicReference2 = atomicReference;
                return new ycy(new ydy() { // from class: z9j0
                    @Override // defpackage.ydy
                    public final void a(ycy.a aVar2) {
                        WinningDialogActivity winningDialogActivity2 = winningDialogActivity;
                        String str2 = str;
                        AtomicReference atomicReference3 = atomicReference2;
                        WeakHashMap<Activity, Object> weakHashMap2 = WinningDialogActivity.f0;
                        try {
                            aVar2.b(winningDialogActivity2.z1(str2, atomicReference3));
                            aVar2.a();
                        } catch (IOException e) {
                            if (aVar2.c(e)) {
                                return;
                            }
                            o760.b(e);
                        }
                    }
                });
            }
        }).f(wm70.c).e(new ch20(this)).f(va0.a()), new ib() { // from class: u9j0
            @Override // defpackage.ib
            public final void run() {
                WeakHashMap<Activity, Object> weakHashMap = WinningDialogActivity.f0;
                WinningDialogActivity winningDialogActivity = this.a;
                winningDialogActivity.W.removeCallbacks(winningDialogActivity.X);
                File file = (File) atomicReference.getAndSet(null);
                if (file != null) {
                    file.delete();
                }
            }
        });
        rlr rlrVar = new rlr(new thf(this), new pya() { // from class: v9j0
            @Override // defpackage.pya
            public final void accept(Object obj) {
                WeakHashMap<Activity, Object> weakHashMap = WinningDialogActivity.f0;
                WinningDialogActivity winningDialogActivity = this.a;
                winningDialogActivity.H.m0.a();
                winningDialogActivity.V = false;
                winningDialogActivity.E1(winningDialogActivity.d0);
            }
        }, taj.c);
        bdyVar.a(rlrVar);
        this.a0.b(rlrVar);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String cMSString;
        int id = view.getId();
        if (id == R.id.close) {
            D1();
            finish();
        }
        if (id == R.id.close_gift || id == R.id.cash_gift_pop_close || id == R.id.bingo_close) {
            finish();
            return;
        }
        if (id == R.id.detail || (id == R.id.share && this.P)) {
            gym.a(this.i, new cbj0(this.F));
            int i = this.F;
            if (i == 3) {
                Bundle bundle = new Bundle();
                bundle.putInt("tab_index", 1);
                sh8.c().c(o7d.a(wae.ME_JACKPOT_BET_HISTORY), bundle);
                finish();
                return;
            }
            if (i != 1) {
                yrh0.s(this, new Intent(this, (Class<?>) TxListActivity.class), true);
                finish();
                return;
            } else {
                if (TextUtils.isEmpty(this.d0)) {
                    this.w.n(b1z.b.NoDefined);
                    this.w.k();
                    yrh0.s(this, new Intent(this, (Class<?>) OpenBetActivity.class), true);
                    finish();
                    return;
                }
                Intent intent = new Intent(this, (Class<?>) RSportsBetTicketDetailsActivity.class);
                intent.putExtra(AnalyticsParam.SOCIAL_ORDER_ID, this.d0);
                yrh0.s(this, intent, true);
                finish();
                return;
            }
        }
        String strEncode = "";
        if (id != R.id.share && (id != R.id.remix_bet || !this.P)) {
            if (id != R.id.remix_bet) {
                if (id == R.id.cash_gift_pop_view || id == R.id.view_gift) {
                    sh8.c().e(o7d.a(wae.ME_GIFTS));
                    finish();
                    return;
                } else if (id == R.id.cash_gift_pop_bet || id == R.id.cash_gift_bet) {
                    this.b.a("", this.D);
                    finish();
                    return;
                } else {
                    if (id == R.id.bingo_share) {
                        sh8.c().g(bjb0.S("/m/sportybingo/home/popular"));
                        return;
                    }
                    return;
                }
            }
            if (TextUtils.isEmpty(this.d0)) {
                return;
            }
            gym.a(this.i, new dbj0(this.F));
            com.sportybet.feature.winning.b bVar = this.f;
            boolean z = this.O;
            bVar.getClass();
            ej5.c(o8i0.d(bVar), null, null, new com.sportybet.feature.winning.c(bVar, z, null), 3);
            RemixBetOrderRequest remixBetOrderRequest = new RemixBetOrderRequest(this.d0, 1);
            boolean z2 = !iu2.a.j().o0();
            boolean z3 = this.N;
            Intent intent2 = new Intent(this, (Class<?>) RemixBetActivity.class);
            intent2.putExtra("extra_remix_bet_order_request", new eal().j(remixBetOrderRequest));
            intent2.putExtra("extra_selections_exist", z2);
            intent2.putExtra("extra_from_winning_popup", true);
            intent2.putExtra("extra_show_tutorial", z3);
            this.e0.b(intent2);
            return;
        }
        gym.a(this.i, new ebj0(this.F));
        int i2 = this.F;
        if (i2 == 1) {
            cMSString = getCMSString(R.string.common_games__real_sport, new Object[0]);
        } else {
            cMSString = i2 == 3 ? getCMSString(R.string.common_functions__jackpot, new Object[0]) : "";
        }
        if (!TextUtils.isEmpty(this.d0)) {
            this.H.m0.d();
            boolean z4 = this.F == 1 && this.V && !TextUtils.isEmpty(this.b0);
            if (this.F == 1) {
                x9h x9hVar = z4 ? new x9h(this.b0, this.c0) : null;
                String cMSString2 = getCMSString(R.string.common_functions__check_out_my_big_win, new Object[0]);
                String cMSString3 = getCMSString(R.string.common_functions__sportybet_hash_tag, new Object[0]);
                f290 f290Var = this.T;
                String str = this.d0;
                Configuration configuration = getResources().getConfiguration();
                q190 q190Var = q190.a;
                f290Var.z1(str, configuration, cMSString2, cMSString3, x9hVar);
            }
            if (z4) {
                return;
            }
            if (!this.V) {
                this.T.A1(this.d0, (TextUtils.isEmpty(this.Q) || "null".equals(this.Q)) ? false : true);
                this.T.I.a(Unit.a);
                return;
            }
            boolean zIsEmpty = TextUtils.isEmpty(this.b0);
            ggd0 ggd0Var = this.H;
            if (zIsEmpty) {
                ggd0Var.m0.a();
                this.T.A1(this.d0, (TextUtils.isEmpty(this.Q) || "null".equals(this.Q)) ? false : true);
                this.T.I.a(Unit.a);
                return;
            } else {
                ggd0Var.m0.a();
                sh8.c().g(this.b0 + this.c0);
                return;
            }
        }
        String str2 = this.A;
        String str3 = this.E;
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.spr_sportbet_share, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.ticket_id);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.money);
        sh8.a().a(xib0.WINNING_DIALOG, (ImageView) viewInflate.findViewById(R.id.img));
        textView.setText(sn5.b(this, R.string.app_common__share_sport_bet, cMSString, str3));
        j7g j7gVar = new j7g(a8b.d());
        j7gVar.a(str2);
        textView2.setText(j7gVar);
        viewInflate.measure(View.MeasureSpec.makeMeasureSpec(getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        viewInflate.layout(0, 0, viewInflate.getMeasuredWidth(), viewInflate.getMeasuredHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(viewInflate.getMeasuredWidth(), viewInflate.getMeasuredHeight(), Bitmap.Config.RGB_565);
        viewInflate.draw(new Canvas(bitmapCreateBitmap));
        StringBuilder sb = new StringBuilder();
        sb.append(getFilesDir().getAbsolutePath());
        String str4 = File.separator;
        File file = new File(pr0.a(sb, str4, "sportybetImage", str4));
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "betshare.jpg");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            strEncode = URLEncoder.encode(mkh.c(this, yrh0.h(this), file2).toString(), "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        sh8.c().e(o7d.a(wae.SHARE) + "?imageUri=" + strEncode);
    }

    @Override // defpackage.py1, defpackage.hrl, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        this.W.removeCallbacksAndMessages(null);
        f0.remove(this);
        ggd0 ggd0Var = this.H;
        if (ggd0Var != null) {
            ggd0Var.f.setImageBitmap(null);
            this.H.y.setBackgroundDrawable(null);
            this.H.N.setBackgroundDrawable(null);
            this.H.O.setBackgroundDrawable(null);
            this.H.T.setImageBitmap(null);
            this.H.G.setBackgroundDrawable(null);
        }
        if (this.Y != null) {
            fdt.a(this).d(this.Y);
        }
        ofj0 ofj0Var = this.R;
        if (ofj0Var != null) {
            ofj0Var.c = true;
            ofj0Var.a.M0();
            ofj0Var.a.release();
        }
        super.onDestroy();
        System.gc();
    }

    @Override // defpackage.rn8, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        B1(intent.getStringExtra("data"));
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        ofj0 ofj0Var = this.R;
        if (ofj0Var != null) {
            ofj0Var.a();
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

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object value;
        n8j0.g bVar;
        super.onCreate(bundle);
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(com.sportybet.feature.winning.b.class);
        String strI = dq7VarA.i();
        if (strI != null) {
            this.f = (com.sportybet.feature.winning.b) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
            boolean z = true;
            char c2 = 1;
            char c3 = 1;
            char c4 = 1;
            char c5 = 1;
            this.N = getIntent().getBooleanExtra("extra_show_remix_bet_tutorial", true);
            boolean z2 = false;
            this.O = getIntent().getBooleanExtra("extra_dismiss_tutorial_on_remix_bet_click", false);
            com.sportybet.feature.winning.b bVar2 = this.f;
            boolean booleanExtra = getIntent().getBooleanExtra("extra_show_ticket_detail_button", true);
            boolean booleanExtra2 = getIntent().getBooleanExtra("extra_show_remix_bet_red_dot", true);
            boolean booleanExtra3 = getIntent().getBooleanExtra("extra_use_control_button_layout", false);
            wwd0 wwd0Var = bVar2.d;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, com.sportybet.feature.winning.a.a((com.sportybet.feature.winning.a) value, null, booleanExtra2, booleanExtra, booleanExtra3, 1)));
            f00 f00Var = vgb0.a;
            vgb0.a(AnalyticsEvent.SHOW_WINNING_DIALOG);
            WeakHashMap<Activity, Object> weakHashMap = f0;
            if (!weakHashMap.isEmpty()) {
                finish();
                return;
            }
            iny onBackPressedDispatcher = getOnBackPressedDispatcher();
            b bVar3 = new b();
            onBackPressedDispatcher.getClass();
            onBackPressedDispatcher.b(bVar3);
            weakHashMap.put(this, null);
            ggd0 ggd0VarA = ggd0.a(getLayoutInflater());
            this.H = ggd0VarA;
            setContentView(ggd0VarA.a);
            this.H.k0.setSystemUiVisibility(1280);
            if (Build.VERSION.SDK_INT >= 35) {
                Window window = getWindow();
                qoa0 qoa0Var = new qoa0(window.getDecorView());
                int i = Build.VERSION.SDK_INT;
                if (i >= 35) {
                    bVar = new n8j0.f(window, qoa0Var);
                } else if (i >= 30) {
                    bVar = new n8j0.d(window, qoa0Var);
                } else if (i >= 26) {
                    bVar = new n8j0.c(window, qoa0Var);
                } else {
                    bVar = new n8j0.b(window, qoa0Var);
                }
                bVar.d(true);
                bVar.c(true);
                View viewFindViewById = findViewById(android.R.id.content);
                tlf tlfVar = new tlf(viewFindViewById, z);
                WeakHashMap<View, g9i0> weakHashMap2 = r6i0.a;
                r6i0.d.n(viewFindViewById, tlfVar);
            } else {
                Window window2 = getWindow();
                window2.addFlags(Integer.MIN_VALUE);
                window2.clearFlags(67108864);
                window2.setStatusBarColor(0);
            }
            this.H.H.setOnClickListener(this);
            this.H.J.setOnClickListener(this);
            TextView textView = this.H.J;
            textView.setPaintFlags(textView.getPaintFlags() | 8);
            this.H.d0.setOnClickListener(this);
            this.H.a0.setOnClickListener(this);
            this.fullStoryCommonManager.c(this.H.a0, LhMGMAwwhzjwfz.JaJX);
            this.H.I.setOnClickListener(this);
            this.H.j0.setOnClickListener(this);
            this.H.z.setOnClickListener(this);
            this.H.d.setOnClickListener(this);
            this.H.i.setOnClickListener(this);
            this.H.e.setOnClickListener(this);
            this.H.w.setAspectRatio(1.7777778f);
            this.H.l0.setOnClickListener(this);
            this.H.U.setVisibility(8);
            haj0 haj0Var = new haj0(this);
            this.c.f(xib0.WINNING_DIALOG, haj0Var);
            this.c.f(xib0.WINNING_DIALOG_BINGO_WIN, haj0Var);
            this.c.f(xib0.WINNING_DIALOG_CASH_GIFT, haj0Var);
            this.c.f(xib0.FLASH_WIN_WINNING_DIALOG_BACKGROUND, haj0Var);
            this.H.G.setAspectRatio(0.84713376f);
            this.H.A.setAspectRatio(1.2142857f);
            this.H.F.setOnClickListener(this);
            this.H.C.setOnClickListener(this);
            this.H.D.setOnClickListener(this);
            this.H.Y.setText(a8b.d().trim());
            B1(getIntent().getStringExtra("data"));
            this.H.W.setText(a8b.d().trim());
            this.H.X.setText(a8b.d().trim());
            this.f.i.f(this, new ajp(this, c5 == true ? 1 : 0));
            r5b r5bVarB = i2i.b(this.f.e);
            r5bVarB.f(this, new lfy() { // from class: daj0
                @Override // defpackage.lfy
                public final void u1(Object obj) {
                    a aVar = (a) obj;
                    WeakHashMap<Activity, Object> weakHashMap3 = WinningDialogActivity.f0;
                    a.C0417a c0417a = aVar.a;
                    boolean z3 = aVar.c;
                    WinningDialogActivity winningDialogActivity = this.a;
                    int i2 = 8;
                    winningDialogActivity.H.e0.setVisibility(c0417a.b ? 0 : 8);
                    boolean z4 = aVar.e;
                    winningDialogActivity.P = z4;
                    winningDialogActivity.H.b0.setVisibility((z3 && !z4 && aVar.b) ? 0 : 8);
                    TextView textView2 = winningDialogActivity.H.J;
                    if (z3 && aVar.d) {
                        i2 = 0;
                    }
                    textView2.setVisibility(i2);
                    winningDialogActivity.H.d0.setEnabled(z3);
                    winningDialogActivity.H.a0.setEnabled(z3);
                    Button button = winningDialogActivity.H.d0;
                    boolean z5 = winningDialogActivity.P;
                    int i3 = R.string.component_pop_dialog__show_off;
                    button.setText(winningDialogActivity.getCMSString(z5 ? R.string.common_functions__details : R.string.component_pop_dialog__show_off, new Object[0]));
                    AppCompatTextView appCompatTextView = winningDialogActivity.H.c0;
                    if (!winningDialogActivity.P) {
                        i3 = R.string.bet_history__remix_bet;
                    }
                    appCompatTextView.setText(winningDialogActivity.getCMSString(i3, new Object[0]));
                    winningDialogActivity.H.c0.setCompoundDrawablesRelativeWithIntrinsicBounds(winningDialogActivity.P ? 0 : R.drawable.ic__ai, 0, 0, 0);
                    boolean z6 = winningDialogActivity.P;
                    y8j y8jVar = winningDialogActivity.fullStoryCommonManager;
                    ggd0 ggd0Var = winningDialogActivity.H;
                    if (z6) {
                        y8jVar.g(ggd0Var.a0);
                    } else {
                        y8jVar.c(ggd0Var.a0, "winning_popup__remix_bet_btn");
                    }
                    ComposeView composeView = winningDialogActivity.H.e0;
                    final boolean z7 = !c0417a.a;
                    final gwt gwtVar = new gwt(winningDialogActivity, 1);
                    composeView.setContent(new op8(-2127236655, new Function2() { // from class: npa0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                qpa0.a(z7, gwtVar, null, aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, true));
                }
            });
            tsg0.a(tsg0.b(r5bVarB, new hif(c4 == true ? 1 : 0))).f(this, new lfy() { // from class: eaj0
                @Override // defpackage.lfy
                public final void u1(Object obj) {
                    WinningDialogActivity winningDialogActivity = this.a;
                    a.C0417a c0417a = (a.C0417a) obj;
                    WeakHashMap<Activity, Object> weakHashMap3 = WinningDialogActivity.f0;
                    if (c0417a == null) {
                        return;
                    }
                    boolean z3 = c0417a.b;
                    ofj0 ofj0Var = winningDialogActivity.R;
                    if (!z3) {
                        if (ofj0Var != null) {
                            ofj0Var.a();
                            return;
                        }
                        return;
                    }
                    if (ofj0Var == null) {
                        ofj0Var = new ofj0(winningDialogActivity, winningDialogActivity.v);
                        winningDialogActivity.R = ofj0Var;
                    }
                    if (!c0417a.a) {
                        ofj0Var.a();
                        return;
                    }
                    if (ofj0Var.c) {
                        return;
                    }
                    if (!ofj0Var.b.exists() || ofj0Var.b.length() <= 0) {
                        itf0.a aVar = itf0.a;
                        aVar.q(MyLog.TAG_WINNING_POPUP);
                        aVar.n(inm.a("WinningPopupSound: file missing/empty path=", ofj0Var.b.getAbsolutePath()), new Object[0]);
                    } else {
                        if (ofj0Var.a.g0() == null || ofj0Var.a.P() == 1) {
                            ofj0Var.b();
                        }
                        if (ofj0Var.a.P() == 4) {
                            ofj0Var.a.n0(5, 0L);
                        }
                        ofj0Var.a.T();
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
            dq7 dq7VarA2 = jq40.a(rws.class);
            String strI2 = dq7VarA2.i();
            if (strI2 != null) {
                rws rwsVar = (rws) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
                this.S = rwsVar;
                i2i.b(rwsVar.e).f(this, new lfy() { // from class: aaj0
                    @Override // defpackage.lfy
                    public final void u1(Object obj) {
                        WeakHashMap<Activity, Object> weakHashMap3 = WinningDialogActivity.f0;
                        WinningDialogActivity winningDialogActivity = this.a;
                        winningDialogActivity.y.c((com.sporty.android.common.uievent.a) obj, winningDialogActivity, winningDialogActivity.H.a, null);
                    }
                });
                i2i.b(this.S.i).f(this, new lfy() { // from class: baj0
                    @Override // defpackage.lfy
                    public final void u1(Object obj) {
                        mws mwsVar = (mws) obj;
                        WeakHashMap<Activity, Object> weakHashMap3 = WinningDialogActivity.f0;
                        boolean z3 = mwsVar instanceof mws.a;
                        WinningDialogActivity winningDialogActivity = this.a;
                        if (z3) {
                            sh8.c().e(o7d.a(wae.HOME));
                            Intent intent = new Intent(winningDialogActivity, (Class<?>) BetslipActivity.class);
                            g08 g08Var = g08.UNKNOWN;
                            intent.putExtra("action_load_booking_code_from", "WINNING_POPUP_REMIX_BET");
                            Integer num = ((mws.a) mwsVar).b;
                            if (num != null) {
                                intent.putExtra("extra_booking_code_order_type", num.intValue());
                            }
                            yrh0.s(winningDialogActivity, intent, true);
                            winningDialogActivity.finish();
                            return;
                        }
                        if (mwsVar instanceof mws.c) {
                            mws.c cVar = (mws.c) mwsVar;
                            if (TextUtils.isEmpty(cVar.a)) {
                                return;
                            }
                            String str = cVar.a;
                            List<Event> list = cVar.b;
                            g08 g08Var2 = g08.UNKNOWN;
                            ekl.b(winningDialogActivity, str, list, "WINNING_POPUP_REMIX_BET", false, cVar.d);
                        }
                    }
                });
                i2i.b(this.S.w).f(this, new lfy() { // from class: caj0
                    @Override // defpackage.lfy
                    public final void u1(Object obj) {
                        WeakHashMap<Activity, Object> weakHashMap3 = WinningDialogActivity.f0;
                        boolean z3 = ((tzs) obj) instanceof tzs.b;
                        ggd0 ggd0Var = this.a.H;
                        if (z3) {
                            ggd0Var.m0.d();
                        } else {
                            ggd0Var.m0.a();
                        }
                    }
                });
                if (bundle == null) {
                    z2 = true;
                }
                v8i0 viewModelStore3 = getViewModelStore();
                r8i0.c defaultViewModelProviderFactory3 = getDefaultViewModelProviderFactory();
                cyb defaultViewModelCreationExtras3 = getDefaultViewModelCreationExtras();
                viewModelStore3.getClass();
                defaultViewModelProviderFactory3.getClass();
                defaultViewModelCreationExtras3.getClass();
                s8i0 s8i0Var3 = new s8i0(viewModelStore3, defaultViewModelProviderFactory3, defaultViewModelCreationExtras3);
                dq7 dq7VarA3 = jq40.a(f290.class);
                String strI3 = dq7VarA3.i();
                if (strI3 != null) {
                    f290 f290Var = (f290) s8i0Var3.a(dq7VarA3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI3));
                    this.T = f290Var;
                    if (z2) {
                        ej5.c(o8i0.d(f290Var), null, null, new g290(null, f290Var), 3);
                    }
                    i2i.b(this.T.B).f(this, new ejp(this, c3 == true ? 1 : 0));
                    i2i.b(this.T.D).f(this, new w9j0());
                    i2i.b(this.T.w).f(this, new qg20(this, c2 == true ? 1 : 0));
                    i2i.b(this.T.F).f(this, new lfy() { // from class: x9j0
                        @Override // defpackage.lfy
                        public final void u1(Object obj) {
                            y190 y190Var = (y190) obj;
                            WeakHashMap<Activity, Object> weakHashMap3 = WinningDialogActivity.f0;
                            boolean z3 = y190Var instanceof y190.c;
                            WinningDialogActivity winningDialogActivity = this.a;
                            if (z3) {
                                winningDialogActivity.H.m0.a();
                                sh8.c().g(((y190.c) y190Var).a);
                            } else if (y190Var instanceof y190.b) {
                                winningDialogActivity.H.m0.d();
                                winningDialogActivity.U.loadUrl(bjb0.S("/m/share-win-card"));
                            } else if (y190Var instanceof y190.a) {
                                winningDialogActivity.E1(winningDialogActivity.d0);
                            }
                        }
                    });
                    i2i.b(this.T.z).f(this, new lfy() { // from class: y9j0
                        @Override // defpackage.lfy
                        public final void u1(Object obj) {
                            rdk rdkVar = (rdk) obj;
                            WeakHashMap<Activity, Object> weakHashMap3 = WinningDialogActivity.f0;
                            if (rdkVar instanceof rdk.b) {
                                ShareWinData shareWinData = ((rdk.b) rdkVar).a;
                                if (TextUtils.isEmpty(shareWinData.getShareUrl())) {
                                    return;
                                }
                                WinningDialogActivity winningDialogActivity = this.a;
                                winningDialogActivity.V = true;
                                winningDialogActivity.b0 = shareWinData.getShareUrl();
                            }
                        }
                    });
                    if (this.Y == null) {
                        this.Y = new d();
                    }
                    fdt.a(this).b(this.Y, new IntentFilter("com.sportybet.action.JS_EVENT"));
                    return;
                }
                hb5.a("Local and anonymous classes can not be ViewModels");
                return;
            }
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        hb5.a("Local and anonymous classes can not be ViewModels");
    }
}
