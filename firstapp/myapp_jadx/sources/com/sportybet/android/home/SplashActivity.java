package com.sportybet.android.home;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.account.themes.ThemeConfig;
import com.sporty.android.core.model.ads.Ads;
import com.sporty.android.core.model.ads.AdsData;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.pocket.globalpay.HNZU.MiEqxQsUF;
import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import com.sportybet.android.home.SplashActivity;
import defpackage.a8b;
import defpackage.c0d;
import defpackage.cdb0;
import defpackage.ct90;
import defpackage.cw;
import defpackage.cyb;
import defpackage.de00;
import defpackage.ee;
import defpackage.ej5;
import defpackage.eky;
import defpackage.er4;
import defpackage.f00;
import defpackage.faj;
import defpackage.fky;
import defpackage.gaj;
import defpackage.gbn;
import defpackage.gky;
import defpackage.ib5;
import defpackage.itf0;
import defpackage.iym;
import defpackage.jb40;
import defpackage.jq40;
import defpackage.jxf0;
import defpackage.ljy;
import defpackage.m2l;
import defpackage.m3m;
import defpackage.m850;
import defpackage.myh;
import defpackage.ndb0;
import defpackage.o67;
import defpackage.o8i0;
import defpackage.pdb0;
import defpackage.psm;
import defpackage.pwx;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.qm70;
import defpackage.r8i0;
import defpackage.rdb0;
import defpackage.rx60;
import defpackage.s9s;
import defpackage.sb40;
import defpackage.soh;
import defpackage.tje0;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.v8i0;
import defpackage.vgb0;
import defpackage.w57;
import defpackage.wm70;
import defpackage.wwd0;
import defpackage.xu90;
import defpackage.xwd0;
import defpackage.y5b;
import defpackage.yi5;
import defpackage.yrh0;
import defpackage.zcb0;
import defpackage.zi50;
import defpackage.zqm;
import defpackage.zu7;
import defpackage.zux;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sportybet/android/home/SplashActivity;", "Lfq0;", "Lzux;", "Lpwx;", "Lcw;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SplashActivity extends m3m implements zux, cw, pwx {
    public static final /* synthetic */ int O = 0;
    public Boolean A;
    public gbn C;
    public JsonSerializeService D;
    public de00 E;
    public psm F;
    public iym G;
    public jb40 H;
    public sb40 I;
    public er4 J;
    public yi5 K;
    public jxf0 L;
    public View d;
    public ImageView e;
    public boolean f;
    public boolean i;
    public Uri v;
    public ndb0 w;
    public ee<String> y;
    public String z;
    public final q8i0 B = new q8i0(jq40.a(rdb0.class), new h(), new g(), new i());
    public final wwd0 M = xwd0.a(com.sportybet.android.home.a.C0252a.a);
    public final zcb0 N = new Runnable() { // from class: zcb0
        @Override // java.lang.Runnable
        public final void run() {
            Uri uri;
            int i2 = SplashActivity.O;
            SplashActivity splashActivity = this.a;
            Intent intent = splashActivity.getIntent();
            Uri uri2 = null;
            String stringExtra = intent != null ? intent.getStringExtra("url") : null;
            if (stringExtra != null) {
                try {
                    uri = Uri.parse(stringExtra);
                } catch (Exception unused) {
                    uri = null;
                }
            } else {
                uri = null;
            }
            if (uri != null) {
                f00 f00Var = vgb0.a;
                vgb0.d(null, "click_fcm_notification");
            }
            Intent intent2 = splashActivity.getIntent();
            String stringExtra2 = intent2 != null ? intent2.getStringExtra("purpose") : null;
            Intent intent3 = splashActivity.getIntent();
            String stringExtra3 = intent3 != null ? intent3.getStringExtra("purposeId") : null;
            if (stringExtra2 != null && stringExtra3 != null) {
                splashActivity.v1().d.a(new ma30(stringExtra3, stringExtra2), k00.d);
            }
            rdb0 rdb0VarV1 = splashActivity.v1();
            if (uri != null) {
                bnh0 bnh0Var = rdb0VarV1.i;
                bnh0Var.getClass();
                String scheme = uri.getScheme();
                String host = uri.getHost();
                if (Intrinsics.g(scheme, "sportybet") || (Intrinsics.g(scheme, "https") && host != null && bnh0Var.i(host))) {
                    uri2 = uri;
                }
            }
            splashActivity.u1(uri2);
        }
    };

    /* JADX INFO: loaded from: classes4.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ThemeConfig.values().length];
            try {
                iArr[ThemeConfig.THEME_CONFIG_DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeConfig.THEME_CONFIG_LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @c0d(c = "com.sportybet.android.home.SplashActivity$onCreate$$inlined$launchAndRepeatWithLifecycle$default$1", f = "SplashActivity.kt", l = {55}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ SplashActivity b;
        public final /* synthetic */ SplashActivity c;

        /* JADX INFO: loaded from: classes5.dex */
        @c0d(c = "com.sportybet.android.home.SplashActivity$onCreate$$inlined$launchAndRepeatWithLifecycle$default$1$1", f = "SplashActivity.kt", l = {58}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ SplashActivity c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v1b v1bVar, SplashActivity splashActivity) {
                super(2, v1bVar);
                this.c = splashActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(v1bVar, this.c);
                aVar.b = obj;
                return aVar;
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
                    int i2 = SplashActivity.O;
                    SplashActivity splashActivity = this.c;
                    o67 o67Var = splashActivity.v1().w;
                    f fVar = splashActivity.new f();
                    this.b = null;
                    this.a = 1;
                    if (o67Var.collect(fVar, this) == y5bVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SplashActivity splashActivity, v1b v1bVar, SplashActivity splashActivity2) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = splashActivity;
            this.c = splashActivity2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new b(this.b, v1bVar, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                s9s lifecycle = this.b.getLifecycle();
                s9s.b bVar = s9s.b.d;
                a aVar = new a(null, this.c);
                this.a = 1;
                if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a(oAudzpbdOhCI.qvqDXeis);
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.home.SplashActivity$onCreate$1", f = "SplashActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<jb40.a.b, com.sportybet.android.home.a, v1b<? super com.sportybet.android.home.a>, Object> {
        public /* synthetic */ com.sportybet.android.home.a a;

        @Override // defpackage.gaj
        public final Object invoke(jb40.a.b bVar, com.sportybet.android.home.a aVar, v1b<? super com.sportybet.android.home.a> v1bVar) {
            c cVar = new c(3, v1bVar);
            cVar.a = aVar;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            com.sportybet.android.home.a aVar = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return aVar;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.home.SplashActivity$onCreate$2", f = "SplashActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<com.sportybet.android.home.a, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ SplashActivity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(v1b v1bVar, SplashActivity splashActivity) {
            super(2, v1bVar);
            this.b = splashActivity;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = new d(v1bVar, this.b);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(com.sportybet.android.home.a aVar, v1b<? super Unit> v1bVar) {
            return ((d) create(aVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0075  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            com.sportybet.android.home.a aVar = (com.sportybet.android.home.a) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (!Intrinsics.g(aVar, com.sportybet.android.home.a.C0252a.a)) {
                if (!(aVar instanceof com.sportybet.android.home.a.b)) {
                    uhc.a();
                    return null;
                }
                Uri uri = ((com.sportybet.android.home.a.b) aVar).a;
                int i = SplashActivity.O;
                SplashActivity splashActivity = this.b;
                yi5 yi5Var = splashActivity.K;
                if (yi5Var == null) {
                    Intrinsics.n("buildConfiguration");
                    throw null;
                }
                if (yi5Var.b().j()) {
                    yrh0.s(splashActivity, new Intent(null, uri, splashActivity, RestrictionActivity.class), true);
                    splashActivity.overridePendingTransition(0, 0);
                    splashActivity.finish();
                } else {
                    psm psmVar = splashActivity.F;
                    if (psmVar == null) {
                        Intrinsics.n("countryManager");
                        throw null;
                    }
                    if (psmVar.W()) {
                        yrh0.s(splashActivity, new Intent(null, uri, splashActivity, RestrictionActivity.class), true);
                        splashActivity.overridePendingTransition(0, 0);
                        splashActivity.finish();
                    } else if (splashActivity.i) {
                        jxf0 jxf0Var = splashActivity.L;
                        if (jxf0Var == null) {
                            Intrinsics.n("timeToFirstDisplayReporter");
                            throw null;
                        }
                        jxf0Var.a();
                        splashActivity.v = uri;
                        rdb0 rdb0VarV1 = splashActivity.v1();
                        ej5.c(o8i0.d(rdb0VarV1), null, null, new pdb0(rdb0VarV1, null), 3);
                    } else {
                        yrh0.s(splashActivity, new Intent(null, uri, splashActivity, MainActivity.class), true);
                        splashActivity.overridePendingTransition(0, 0);
                        splashActivity.finish();
                    }
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @c0d(c = "com.sportybet.android.home.SplashActivity$onCreate$3", f = "SplashActivity.kt", l = {153}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<myh<? super com.sportybet.android.home.a>, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ SplashActivity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(v1b v1bVar, SplashActivity splashActivity) {
            super(2, v1bVar);
            this.b = splashActivity;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new e(v1bVar, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super com.sportybet.android.home.a> myhVar, v1b<? super Unit> v1bVar) {
            return ((e) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                jb40 jb40Var = this.b.H;
                if (jb40Var == null) {
                    Intrinsics.n("realtimeCMSRepo");
                    throw null;
                }
                this.a = 1;
                if (jb40Var.e() == y5bVar) {
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

    /* JADX INFO: loaded from: classes5.dex */
    public static final class f<T> implements myh {
        public f() {
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            SplashActivity.this.i = ((Boolean) obj).booleanValue();
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class g extends qlr implements Function0<r8i0.c> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return SplashActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class h extends qlr implements Function0<v8i0> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return SplashActivity.this.getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class i extends qlr implements Function0<cyb> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return SplashActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.m3m, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) throws IllegalAccessException, InvocationTargetException {
        MiEqxQsUF.IxAFNCkKeCsZrOO.invoke(null, this, bundle);
    }

    @Override // defpackage.m3m, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() throws IllegalAccessException, InvocationTargetException {
        MiEqxQsUF.AVej.invoke(null, this);
    }

    public final synchronized void u1(Uri uri) {
        if (!this.f) {
            this.f = true;
            wwd0 wwd0Var = this.M;
            com.sportybet.android.home.a.b bVar = new com.sportybet.android.home.a.b(uri);
            wwd0Var.getClass();
            wwd0Var.k(null, bVar);
        }
    }

    public final rdb0 v1() {
        return (rdb0) this.B.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e9  */
    public final void w1() {
        boolean z;
        Object bVar;
        final Ads ads;
        String imgUrl;
        String linkUrl;
        er4 er4Var = this.J;
        JSONObject jSONObject = null;
        if (er4Var == null) {
            Intrinsics.n("bonusFactorManager");
            throw null;
        }
        er4Var.b.a(er4Var);
        a8b.c().getClass();
        ljy.a aVar = ljy.c;
        eky ekyVar = gky.a;
        m2l m2lVar = new m2l(this);
        fky fkyVar = new fky();
        zu7.a aVar2 = zu7.a;
        v5b v5bVarA = zu7.a();
        v5bVarA.getClass();
        m2lVar.a.c("ODDS_FORMAT", "DECIMAL", fkyVar, v5bVarA);
        try {
            Context applicationContext = getApplicationContext();
            applicationContext.getClass();
            soh.b(applicationContext);
        } catch (Exception e2) {
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_COMMON);
            aVar3.o(e2);
        }
        f00 f00Var = vgb0.a;
        String strD = a8b.d();
        Iterator<T> it = vgb0.b.iterator();
        while (it.hasNext()) {
            ((zqm) it.next()).a(strD);
        }
        ImageView imageView = this.e;
        int i2 = 1;
        if (imageView != null) {
            String string = getSharedPreferences("sportybet", 0).getString("splash_ad", "");
            string.getClass();
            if (StringsKt.U(string)) {
                ads = null;
            } else {
                try {
                    JsonSerializeService jsonSerializeService = this.D;
                    if (jsonSerializeService == null) {
                        Intrinsics.n("jsonSerializer");
                        throw null;
                    }
                    ads = (Ads) jsonSerializeService.fromJson(string, Ads.class);
                    if (ads == null || !ads.isAvailable()) {
                        ads = null;
                    }
                } catch (Exception e3) {
                    itf0.a aVar4 = itf0.a;
                    aVar4.q(MyLog.TAG_COMMON);
                    aVar4.p(e3, "Failed to parse full page ad: ".concat(string), new Object[0]);
                }
            }
            if (ads == null || (imgUrl = ads.getImgUrl()) == null || StringsKt.U(imgUrl)) {
                z = false;
            } else {
                gbn gbnVar = this.C;
                if (gbnVar == null) {
                    Intrinsics.n("imageService");
                    throw null;
                }
                gbnVar.b(ads.getImgUrl(), imageView);
                View view = this.d;
                if (view != null && (linkUrl = ads.getLinkUrl()) != null && !StringsKt.U(linkUrl)) {
                    view.setOnClickListener(new View.OnClickListener() { // from class: bdb0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i3 = SplashActivity.O;
                            SplashActivity splashActivity = this.a;
                            View view3 = splashActivity.d;
                            if (view3 != null) {
                                view3.removeCallbacks(splashActivity.N);
                            }
                            String linkUrl2 = ads.getLinkUrl();
                            Uri uri = null;
                            if (linkUrl2 != null) {
                                try {
                                    uri = Uri.parse(linkUrl2);
                                } catch (Exception unused) {
                                }
                            }
                            splashActivity.u1(uri);
                        }
                    });
                }
                z = true;
            }
        } else {
            z = false;
        }
        long j = z ? 3600L : 100L;
        View view2 = this.d;
        if (view2 != null) {
            view2.postDelayed(this.N, j);
        }
        if (!z) {
            ndb0 ndb0Var = this.w;
            if (ndb0Var == null) {
                Intrinsics.n("splashScreen");
                throw null;
            }
            ndb0Var.a.b(new w57());
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("spotId", "splashScreen");
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("adSpots", jSONArray);
            jSONObject = jSONObject3;
        } catch (JSONException e4) {
            itf0.a aVar5 = itf0.a;
            aVar5.q(MyLog.TAG_COMMON);
            aVar5.p(e4, "Failed to create full page ad parameter", new Object[0]);
        }
        if (jSONObject != null) {
            try {
                zi50.a aVar6 = zi50.b;
                ct90<BaseResponse<AdsData>> ct90VarC = v1().b.c(jSONObject.toString());
                qm70 qm70Var = wm70.c;
                ct90<BaseResponse<AdsData>> ct90VarD = ct90VarC.d(qm70Var);
                final rx60 rx60Var = new rx60(i2);
                new xu90(ct90VarD, new faj() { // from class: adb0
                    @Override // defpackage.faj
                    public final Object apply(Object obj) {
                        int i3 = SplashActivity.O;
                        obj.getClass();
                        return (Ads) rx60Var.invoke(obj);
                    }
                }).b(qm70Var).a(new cdb0(this, this));
                bVar = Unit.a;
            } catch (Throwable th) {
                zi50.a aVar7 = zi50.b;
                bVar = new zi50.b(th);
            }
            Throwable thA = zi50.a(bVar);
            if (thA != null) {
                itf0.a.f(thA, "retrofit something went wrong.", new Object[0]);
            }
        }
        v1().f.a();
    }
}
