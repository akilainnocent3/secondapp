package com.sportygames.commons.views;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.InflateException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import com.github.ybq.android.spinkit.SpinKitView;
import com.sporty.android.core.model.accountprotection.LastLoginDeviceInfo;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.GPSData;
import com.sportygames.commons.views.MainActivity;
import defpackage.a1s;
import defpackage.ae;
import defpackage.aku;
import defpackage.bb;
import defpackage.bk60;
import defpackage.bn80;
import defpackage.c0d;
import defpackage.cku;
import defpackage.d0j0;
import defpackage.dn80;
import defpackage.dq7;
import defpackage.e0j0;
import defpackage.eal;
import defpackage.ebs;
import defpackage.ee;
import defpackage.ej5;
import defpackage.elf;
import defpackage.eug0;
import defpackage.f0j0;
import defpackage.fae;
import defpackage.fie;
import defpackage.fse;
import defpackage.g6i0;
import defpackage.g9i0;
import defpackage.gku;
import defpackage.h8j0;
import defpackage.hkd;
import defpackage.hwr;
import defpackage.ib5;
import defpackage.jej;
import defpackage.jq40;
import defpackage.kd8;
import defpackage.kej;
import defpackage.kiu;
import defpackage.kju;
import defpackage.krh0;
import defpackage.l1z;
import defpackage.m8;
import defpackage.noy;
import defpackage.nzf0;
import defpackage.o0b;
import defpackage.o2g;
import defpackage.odd;
import defpackage.ojb;
import defpackage.op5;
import defpackage.oyi0;
import defpackage.pfd;
import defpackage.poy;
import defpackage.qlf;
import defpackage.qn70;
import defpackage.r6i0;
import defpackage.rrp;
import defpackage.sjj;
import defpackage.tje0;
import defpackage.ttr;
import defpackage.u3w;
import defpackage.ud;
import defpackage.uj50;
import defpackage.uy1;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.w5b;
import defpackage.whs;
import defpackage.wzi0;
import defpackage.xjj;
import defpackage.xnh0;
import defpackage.xzi0;
import defpackage.y5b;
import defpackage.yju;
import defpackage.zj60;
import defpackage.zju;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/sportygames/commons/views/MainActivity;", "Luy1;", "Ldn80;", "Lbb;", "Lxjj;", "<init>", "()V", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MainActivity extends uy1<dn80> implements bb, xjj {
    public static final List<String> R = kotlin.collections.b.k("bonus_game_callbacks", JsPluginCommon.GAMES_EXIT, JsPluginCommon.GAMES_TRANSACTION, JsPluginCommon.GAMES_ADD_MONEY, "withdraw", JsPluginCommon.GAMES_LOGIN, "NoGPSData", "ExitRecommendationGameClick", "ExitRecommendationShow", "ExitRecommendationStayClick", "ExitCaptureGameBackPress", "ShowBettorLimitModal", "GameLoaded", "GameLoadedDuration");
    public GPSData A;
    public boolean B;
    public Integer C;
    public Integer D;
    public String E;
    public Long F;
    public Double G;
    public Long H;
    public boolean I;
    public kd8 J;
    public kej K;
    public zju L;
    public aku M;
    public double N;
    public boolean O;
    public boolean P;
    public final ee<String[]> Q;
    public final ttr c;
    public final ttr d;
    public String e;
    public Integer f;
    public String i;
    public boolean v;
    public boolean w;
    public boolean y;
    public String z;

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b implements poy {

        @c0d(c = "com.sportygames.commons.views.MainActivity$getGPSData$1$onPermissionGranted$1", f = "MainActivity.kt", l = {HttpStatusCodesKt.HTTP_PERM_REDIRECT}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public MainActivity a;
            public int b;
            public final /* synthetic */ MainActivity c;

            /* JADX INFO: renamed from: com.sportygames.commons.views.MainActivity$b$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.commons.views.MainActivity$getGPSData$1$onPermissionGranted$1$1", f = "MainActivity.kt", l = {}, m = "invokeSuspend", v = 1)
            public static final class C0440a extends tje0 implements Function2<v5b, v1b<? super GPSData>, Object> {
                public final /* synthetic */ MainActivity a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0440a(MainActivity mainActivity, v1b<? super C0440a> v1bVar) {
                    super(2, v1bVar);
                    this.a = mainActivity;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C0440a(this.a, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super GPSData> v1bVar) {
                    return ((C0440a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    uj50.b(obj);
                    kej kejVar = this.a.K;
                    if (kejVar != null) {
                        return kejVar.a();
                    }
                    return null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MainActivity mainActivity, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.c = mainActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                MainActivity mainActivity;
                y5b y5bVar = y5b.a;
                int i = this.b;
                MainActivity mainActivity2 = this.c;
                if (i == 0) {
                    uj50.b(obj);
                    pfd pfdVar = fse.a;
                    odd oddVar = odd.b;
                    C0440a c0440a = new C0440a(mainActivity2, null);
                    this.a = mainActivity2;
                    this.b = 1;
                    obj = ej5.d(oddVar, c0440a, this);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                    mainActivity = mainActivity2;
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mainActivity = this.a;
                    uj50.b(obj);
                }
                mainActivity.A = (GPSData) obj;
                if (!mainActivity2.isDestroyed() && !mainActivity2.isFinishing()) {
                    mainActivity2.H1();
                    mainActivity2.D1();
                }
                return Unit.a;
            }
        }

        public b() {
        }

        @Override // defpackage.poy
        public final void a() {
            MainActivity mainActivity = MainActivity.this;
            ej5.c(ebs.a(mainActivity.getLifecycle()), null, null, new a(mainActivity, null), 3);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class c implements noy {
        public c() {
        }

        @Override // defpackage.noy
        public final void a(boolean z) {
            MainActivity.this.I1(z);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.commons.views.MainActivity$onResume$1", f = "MainActivity.kt", l = {266, 271}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return MainActivity.this.new d(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
        
            if (defpackage.hkd.b(1100, r9) == r0) goto L27;
         */
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
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r9.a
                r2 = 1100(0x44c, double:5.435E-321)
                r4 = 1
                r5 = 0
                r6 = 0
                com.sportygames.commons.views.MainActivity r7 = com.sportygames.commons.views.MainActivity.this
                r8 = 2
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r8) goto L16
                defpackage.uj50.b(r10)     // Catch: java.lang.Exception -> Lab
                goto L4d
            L16:
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r9)
                return r6
            L1c:
                defpackage.uj50.b(r10)     // Catch: java.lang.Exception -> Lab
                goto L2c
            L20:
                defpackage.uj50.b(r10)
                r9.a = r4     // Catch: java.lang.Exception -> Lab
                java.lang.Object r10 = defpackage.hkd.b(r2, r9)     // Catch: java.lang.Exception -> Lab
                if (r10 != r0) goto L2c
                goto L4c
            L2c:
                boolean r10 = r7.y     // Catch: java.lang.Exception -> Lab
                if (r10 == 0) goto L44
                B extends g6i0 r10 = r7.a     // Catch: java.lang.Exception -> L3e
                dn80 r10 = (defpackage.dn80) r10     // Catch: java.lang.Exception -> L3e
                if (r10 == 0) goto L42
                android.webkit.WebView r10 = r10.e     // Catch: java.lang.Exception -> L3e
                java.lang.String r1 = "window.postMessage('login_failed', '*');"
                r10.evaluateJavascript(r1, r6)     // Catch: java.lang.Exception -> L3e
                goto L42
            L3e:
                r10 = move-exception
                r10.printStackTrace()     // Catch: java.lang.Exception -> Lab
            L42:
                r7.y = r5     // Catch: java.lang.Exception -> Lab
            L44:
                r9.a = r8     // Catch: java.lang.Exception -> Lab
                java.lang.Object r9 = defpackage.hkd.b(r2, r9)     // Catch: java.lang.Exception -> Lab
                if (r9 != r0) goto L4d
            L4c:
                return r0
            L4d:
                java.lang.String r9 = r7.e     // Catch: java.lang.Exception -> Lab
                if (r9 == 0) goto Laf
                int r10 = r9.length()     // Catch: java.lang.Exception -> Lab
                if (r10 <= 0) goto Laf
                android.webkit.CookieManager r10 = android.webkit.CookieManager.getInstance()     // Catch: java.lang.Exception -> Lab
                if (r10 == 0) goto L61
                java.lang.String r6 = r10.getCookie(r9)     // Catch: java.lang.Exception -> Lab
            L61:
                if (r6 == 0) goto L69
                java.lang.String r9 = "patron:id:accesstoken"
                boolean r5 = kotlin.text.StringsKt.M(r6, r9, r5)     // Catch: java.lang.Exception -> Lab
            L69:
                com.sportygames.commons.SportyGamesManager r9 = com.sportygames.commons.SportyGamesManager.getInstance()     // Catch: java.lang.Exception -> La6
                if (r9 == 0) goto Laf
                com.sportygames.commons.SportyGamesManager r9 = com.sportygames.commons.SportyGamesManager.getInstance()     // Catch: java.lang.Exception -> La6
                xnh0 r9 = r9.getUser()     // Catch: java.lang.Exception -> La6
                if (r9 == 0) goto Laf
                com.sportygames.commons.SportyGamesManager r9 = com.sportygames.commons.SportyGamesManager.getInstance()     // Catch: java.lang.Exception -> La6
                xnh0 r9 = r9.getUser()     // Catch: java.lang.Exception -> La6
                java.lang.String r9 = r9.a     // Catch: java.lang.Exception -> La6
                int r9 = r9.length()     // Catch: java.lang.Exception -> La6
                if (r9 <= 0) goto Laf
                if (r5 != 0) goto Laf
                r7.z1(r7)     // Catch: java.lang.Exception -> Lab
                java.lang.String r9 = "br"
                com.sportygames.commons.SportyGamesManager r10 = new com.sportygames.commons.SportyGamesManager     // Catch: java.lang.Exception -> Lab
                r10.<init>()     // Catch: java.lang.Exception -> Lab
                java.lang.String r10 = r10.getSubCountry()     // Catch: java.lang.Exception -> Lab
                boolean r9 = r9.equalsIgnoreCase(r10)     // Catch: java.lang.Exception -> Lab
                if (r9 != 0) goto Laf
                r7.H1()     // Catch: java.lang.Exception -> Lab
                r7.D1()     // Catch: java.lang.Exception -> Lab
                goto Laf
            La6:
                r9 = move-exception
                r9.printStackTrace()     // Catch: java.lang.Exception -> Lab
                goto Laf
            Lab:
                r9 = move-exception
                r9.printStackTrace()
            Laf:
                kotlin.Unit r9 = kotlin.Unit.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportygames.commons.views.MainActivity.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class e extends WebChromeClient {

        @c0d(c = "com.sportygames.commons.views.MainActivity$setListenersForWeb$chromeClient$1$onProgressChanged$2", f = "MainActivity.kt", l = {HttpStatusCodesKt.HTTP_MISDIRECTED_REQUEST}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ MainActivity b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MainActivity mainActivity, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = mainActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.b, v1bVar);
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
                    this.a = 1;
                    if (hkd.b(15000L, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                MainActivity mainActivity = this.b;
                dn80 dn80Var = (dn80) mainActivity.a;
                if (dn80Var != null) {
                    dn80Var.v.setVisibility(8);
                }
                dn80 dn80Var2 = (dn80) mainActivity.a;
                if (dn80Var2 != null) {
                    dn80Var2.i.setVisibility(8);
                }
                return Unit.a;
            }
        }

        public e() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            Long l;
            webView.getClass();
            MainActivity mainActivity = MainActivity.this;
            if (i >= 100 && mainActivity.G == null && (l = mainActivity.F) != null) {
                mainActivity.G = Double.valueOf(SystemClock.elapsedRealtime() - l.longValue());
                mainActivity.E1();
            }
            if (i >= 50) {
                ej5.c(ebs.a(mainActivity.getLifecycle()), null, null, new a(mainActivity, null), 3);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class f implements Function0<l1z> {
        public f() {
        }

        /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, l1z] */
        @Override // kotlin.jvm.functions.Function0
        public final l1z invoke() {
            qn70 qn70VarJ;
            dq7 dq7VarA;
            bb bbVar = MainActivity.this;
            if (bbVar instanceof rrp) {
                qn70VarJ = ((rrp) bbVar).j();
                dq7VarA = jq40.a(l1z.class);
                qn70VarJ.getClass();
            } else {
                qn70VarJ = sjj.b().c.d;
                dq7VarA = jq40.a(l1z.class);
            }
            return qn70VarJ.a(dq7VarA, null, null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class g implements Function0<xzi0> {
        public g() {
        }

        /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, xzi0] */
        @Override // kotlin.jvm.functions.Function0
        public final xzi0 invoke() {
            qn70 qn70VarJ;
            dq7 dq7VarA;
            bb bbVar = MainActivity.this;
            if (bbVar instanceof rrp) {
                qn70VarJ = ((rrp) bbVar).j();
                dq7VarA = jq40.a(xzi0.class);
                qn70VarJ.getClass();
            } else {
                qn70VarJ = sjj.b().c.d;
                dq7VarA = jq40.a(xzi0.class);
            }
            return qn70VarJ.a(dq7VarA, null, null);
        }
    }

    public MainActivity() {
        a1s a1sVar = a1s.a;
        this.c = hwr.a(a1sVar, new f());
        this.d = hwr.a(a1sVar, new g());
        this.e = "";
        this.f = 0;
        this.i = "";
        this.z = "false";
        this.Q = registerForActivityResult(new ae(), new ud() { // from class: wju
            @Override // defpackage.ud
            public final void a(Object obj) {
                Map map = (Map) obj;
                List<String> list = MainActivity.R;
                map.getClass();
                boolean zIsEmpty = map.isEmpty();
                MainActivity mainActivity = this.a;
                if (!zIsEmpty) {
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                            aku akuVar = mainActivity.M;
                            if (akuVar != null) {
                                akuVar.a(false);
                                return;
                            }
                            return;
                        }
                    }
                }
                zju zjuVar = mainActivity.L;
                if (zjuVar != null) {
                    zjuVar.a();
                }
            }
        });
    }

    public static void K1(NestedScrollView nestedScrollView) {
        if (nestedScrollView.canScrollVertically(1) || nestedScrollView.canScrollVertically(-1)) {
            nestedScrollView.requestDisallowInterceptTouchEvent(false);
        } else {
            nestedScrollView.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final void A1(WebView webView) {
        if (this.P) {
            Iterator<T> it = R.iterator();
            while (it.hasNext()) {
                webView.removeJavascriptInterface((String) it.next());
            }
            this.P = false;
        }
    }

    public final void B1() {
        if (yju.a("br")) {
            b bVar = new b();
            c cVar = new c();
            Object systemService = getSystemService(LastLoginDeviceInfo.KEY_LOCATION);
            systemService.getClass();
            if (!((LocationManager) systemService).isProviderEnabled("gps")) {
                cVar.a(true);
                return;
            }
            for (int i = 0; i < 2; i++) {
                String[] strArr = jej.a;
                if (o0b.a(this, strArr[i]) != 0) {
                    if (shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION") || shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION")) {
                        cVar.a(false);
                        return;
                    }
                    this.L = new zju(bVar);
                    this.M = new aku(cVar);
                    ee<String[]> eeVar = this.Q;
                    eeVar.getClass();
                    eeVar.b(strArr);
                    return;
                }
            }
            bVar.a();
        }
    }

    public final xzi0 C1() {
        return (xzi0) this.d.getValue();
    }

    public final void D1() {
        String str = this.e;
        String domain = SportyGamesManager.getInstance().getDomain(this);
        dn80 dn80Var = (dn80) this.a;
        if (dn80Var != null) {
            WebView webView = dn80Var.e;
            if (C1().h(webView)) {
                if (!d0j0.b(str, domain)) {
                    y1();
                    finish();
                    return;
                }
                this.F = Long.valueOf(SystemClock.elapsedRealtime());
                this.G = null;
                this.N = 0.0d;
                this.O = false;
                this.I = false;
                xzi0 xzi0VarC1 = C1();
                str.getClass();
                o2g o2gVar = o2g.a;
                o2gVar.getClass();
                J1(webView, xzi0VarC1.b(webView, str, o2gVar));
            }
        }
    }

    public final void E1() {
        Double d2;
        double dRint;
        xnh0 user;
        if (this.B && !this.I && this.O && (d2 = this.G) != null) {
            double dDoubleValue = d2.doubleValue();
            this.I = true;
            double d3 = this.N + dDoubleValue;
            l1z l1zVar = (l1z) this.c.getValue();
            Integer num = this.f;
            String str = this.i;
            SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
            String str2 = (sportyGamesManager == null || (user = sportyGamesManager.getUser()) == null) ? null : user.b;
            Double d4 = fie.a;
            if (d4 != null) {
                dRint = d4.doubleValue();
            } else {
                Object systemService = getSystemService("activity");
                systemService.getClass();
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
                dRint = Math.rint((memoryInfo.totalMem / 1.073741824E9d) * 100.0d) / 100.0d;
                fie.a = Double.valueOf(dRint);
            }
            l1zVar.f(d3, num, str, str2, Double.valueOf(dRint), krh0.j(this), "Webview");
        }
    }

    public final void F1() {
        dn80 dn80Var = (dn80) this.a;
        if (dn80Var != null) {
            WebView webView = dn80Var.e;
            A1(webView);
            C1().a(webView);
            webView.removeAllViews();
            webView.clearHistory();
            webView.clearCache(true);
        }
        G1(this.i);
        finish();
    }

    public final void H1() {
        dn80 dn80Var = (dn80) this.a;
        if (dn80Var != null) {
            WebView webView = dn80Var.e;
            e eVar = new e();
            dn80 dn80Var2 = (dn80) this.a;
            J1(webView, C1().e(this, webView, new wzi0(this.e, dn80Var2 != null ? new a(this, dn80Var2.v, this.A) : new WebViewClient(), eVar)));
        }
    }

    public final void I1(final boolean z) {
        kd8 kd8Var = this.J;
        if (kd8Var == null) {
            Intrinsics.n("gpsPermissionDialog");
            throw null;
        }
        op5 op5Var = op5.a;
        String string = getString(R.string.error_location_permission_title_cms);
        string.getClass();
        String string2 = getString(R.string.error_location_permission_title_text);
        string2.getClass();
        op5Var.getClass();
        String strB = op5.b(string, string2, null);
        String string3 = getString(R.string.error_location_permission_msg_cms);
        string3.getClass();
        String string4 = getString(R.string.error_location_permission_msg_text);
        string4.getClass();
        String strB2 = op5.b(string3, string4, null);
        String string5 = getString(R.string.action_open_settings_cms);
        string5.getClass();
        String string6 = getString(R.string.action_open_settings_text);
        string6.getClass();
        String strB3 = op5.b(string5, string6, null);
        String string7 = getString(R.string.exit_btn_cms);
        string7.getClass();
        String string8 = getString(R.string.action_exit_text);
        string8.getClass();
        kd8.b(kd8Var, strB, strB2, strB3, op5.b(string7, string8, null), new Function0() { // from class: giu
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List<String> list = MainActivity.R;
                MainActivity mainActivity = this.a;
                Intent intent = z ? new Intent("android.settings.LOCATION_SOURCE_SETTINGS") : new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", mainActivity.getPackageName(), null));
                intent.addFlags(268435456);
                mainActivity.startActivity(intent);
                return Unit.a;
            }
        }, new kiu(), getColor(R.color.try_again_color), new ojb(this, 1));
        kd8 kd8Var2 = this.J;
        if (kd8Var2 == null) {
            Intrinsics.n("gpsPermissionDialog");
            throw null;
        }
        if (kd8Var2.isShowing()) {
            return;
        }
        kd8 kd8Var3 = this.J;
        if (kd8Var3 != null) {
            kd8Var3.a();
        } else {
            Intrinsics.n("gpsPermissionDialog");
            throw null;
        }
    }

    public final void J1(WebView webView, f0j0 f0j0Var) {
        f0j0Var.getClass();
        if (f0j0Var.a != e0j0.a) {
            A1(webView);
            return;
        }
        if (this.P) {
            return;
        }
        for (String str : R) {
            webView.addJavascriptInterface(new oyi0(this, webView, str, new kju(this)), str);
        }
        this.P = true;
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
        u1();
        z1(this);
        dn80 dn80Var = (dn80) this.a;
        if (dn80Var != null) {
            if (C1().h(dn80Var.e)) {
                D1();
            }
        }
    }

    @Override // defpackage.bb
    public final void f0(m8 m8Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = nzf0.a;
        if (!z && jCurrentTimeMillis - nzf0.b <= 500) {
            z = true;
        }
        if (z) {
            return;
        }
        this.y = true;
    }

    @Override // defpackage.uy1
    public final boolean onBackPressedCompat() {
        if (this.v) {
            String str = this.i;
            if (str == null || StringsKt.U(str)) {
                F1();
                return true;
            }
            this.v = false;
            dn80 dn80Var = (dn80) this.a;
            if (dn80Var != null) {
                dn80Var.e.goBack();
            }
            dn80 dn80Var2 = (dn80) this.a;
            if (dn80Var2 != null) {
                dn80Var2.w.setText(this.i);
                return true;
            }
        } else {
            if (this.w || !kotlin.text.c.l(this.z, "true", true)) {
                F1();
                return false;
            }
            Double d2 = this.G;
            double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
            dn80 dn80Var3 = (dn80) this.a;
            if (dn80Var3 != null) {
                dn80Var3.e.evaluateJavascript("window.dispatchEvent(new CustomEvent('sg_show_exit_dialog', { detail: { webviewloadDuration: " + dDoubleValue + " } }));", null);
            }
        }
        return true;
    }

    @Override // defpackage.uy1, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        RelativeLayout relativeLayout;
        super.onCreate(bundle);
        if (this.a == 0) {
            return;
        }
        elf.b(this, null, 3);
        dn80 dn80Var = (dn80) this.a;
        if (dn80Var != null && (relativeLayout = dn80Var.a) != null) {
            qlf.b(relativeLayout);
        }
        SportyGamesManager.getInstance().addAccountUpdatedListener(this);
        this.f = Integer.valueOf(getIntent().getIntExtra("g_id", 0));
        this.e = getIntent().getStringExtra("url");
        this.i = getIntent().getStringExtra("g_name");
        this.B = getIntent().getBooleanExtra("is_an_test_latency_tracking_enabled", false);
        if (getIntent().hasExtra("campaign_id")) {
            this.C = Integer.valueOf(getIntent().getIntExtra("campaign_id", 0));
        }
        if (getIntent().hasExtra("variant_id")) {
            this.D = Integer.valueOf(getIntent().getIntExtra("variant_id", 0));
        }
        if (getIntent().hasExtra("variant")) {
            this.E = getIntent().getStringExtra("variant");
        }
        String stringExtra = getIntent().getStringExtra("toolbar_clr");
        dn80 dn80Var2 = (dn80) this.a;
        setSupportActionBar(dn80Var2 != null ? dn80Var2.c : null);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.n();
        }
        dn80 dn80Var3 = (dn80) this.a;
        if (dn80Var3 != null) {
            dn80Var3.w.setText(this.i);
        }
        dn80 dn80Var4 = (dn80) this.a;
        if (dn80Var4 != null) {
            dn80Var4.b.setOnClickListener(new View.OnClickListener() { // from class: iiu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity mainActivity = this.a;
                    MainActivity.G1(mainActivity.i);
                    mainActivity.onBackPressedCompat();
                }
            });
        }
        this.J = new kd8(this);
        this.K = new kej(this);
        try {
            int color = Color.parseColor(stringExtra);
            getWindow().addFlags(Integer.MIN_VALUE);
            qlf.d(this);
            Window window = getWindow();
            window.getClass();
            qlf.c(window, color);
            dn80 dn80Var5 = (dn80) this.a;
            if (dn80Var5 != null) {
                dn80Var5.c.setBackgroundColor(color);
            }
            dn80 dn80Var6 = (dn80) this.a;
            if (dn80Var6 != null) {
                dn80Var6.b.setBackgroundColor(color);
            }
        } catch (Exception unused) {
            int color2 = getColor(R.color.status_bar_color_dark);
            getWindow().addFlags(Integer.MIN_VALUE);
            qlf.d(this);
            Window window2 = getWindow();
            window2.getClass();
            qlf.c(window2, color2);
            dn80 dn80Var7 = (dn80) this.a;
            if (dn80Var7 != null) {
                dn80Var7.c.setBackgroundColor(getColor(R.color.toolbar));
            }
            dn80 dn80Var8 = (dn80) this.a;
            if (dn80Var8 != null) {
                dn80Var8.b.setBackgroundColor(getColor(R.color.toolbar));
            }
        }
        z1(this);
        getLifecycle().a(new bn80(this, new cku(this)));
        if (!"br".equalsIgnoreCase(new SportyGamesManager().getSubCountry())) {
            H1();
            D1();
        }
        dn80 dn80Var9 = (dn80) this.a;
        if (dn80Var9 != null) {
            final NestedScrollView nestedScrollView = dn80Var9.d;
            final FrameLayout frameLayout = dn80Var9.f;
            WebView webView = dn80Var9.e;
            webView.getSettings().setTextZoom(100);
            nestedScrollView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: mju
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    List<String> list = MainActivity.R;
                    ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = view.getHeight();
                    }
                }
            });
            nestedScrollView.requestDisallowInterceptTouchEvent(true);
            eug0 eug0Var = new eug0(frameLayout, nestedScrollView);
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            h8j0.a(nestedScrollView, eug0Var);
            nestedScrollView.setOnScrollChangeListener(new View.OnScrollChangeListener(this) { // from class: oju
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    MainActivity.K1(nestedScrollView);
                }
            });
            nestedScrollView.setOnTouchListener(new View.OnTouchListener(this) { // from class: qju
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    MainActivity.K1(nestedScrollView);
                    return false;
                }
            });
            webView.setOnTouchListener(new View.OnTouchListener(this) { // from class: sju
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    MainActivity.K1(nestedScrollView);
                    return false;
                }
            });
            nestedScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this) { // from class: uju
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    MainActivity.K1(nestedScrollView);
                }
            });
        }
    }

    @Override // defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        SportyGamesManager sportyGamesManager;
        SportyGamesManager.getInstance().removeAccountUpdatedListener(this);
        dn80 dn80Var = (dn80) this.a;
        if (dn80Var != null) {
            WebView webView = dn80Var.e;
            A1(webView);
            C1().a(webView);
            webView.setWebChromeClient(null);
            webView.loadUrl("");
            webView.clearHistory();
            ViewParent parent = webView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(null);
            }
            webView.destroy();
        }
        u1();
        if (getIntent().hasExtra("source") && Intrinsics.g(getIntent().getStringExtra("source"), "featured_games")) {
            if (!x1() && (sportyGamesManager = SportyGamesManager.getInstance()) != null) {
                sportyGamesManager.exit();
            }
            SportyGamesManager.setCurrentLanguageCode("");
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        u1();
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        try {
            getWindow().clearFlags(128);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.H = Long.valueOf(SystemClock.elapsedRealtime());
        try {
            getWindow().addFlags(128);
            u1();
            B1();
            ej5.c(ebs.a(getLifecycle()), null, null, new d(null), 3);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onStop() {
        double dRint;
        xnh0 user;
        Long l = this.H;
        if (l != null) {
            if (!this.B) {
                l = null;
            }
            if (l != null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
                l1z l1zVar = (l1z) this.c.getValue();
                Integer num = this.f;
                String str = this.i;
                SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
                String str2 = (sportyGamesManager == null || (user = sportyGamesManager.getUser()) == null) ? null : user.b;
                Double d2 = fie.a;
                if (d2 != null) {
                    dRint = d2.doubleValue();
                } else {
                    Object systemService = getSystemService("activity");
                    systemService.getClass();
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
                    dRint = Math.rint((memoryInfo.totalMem / 1.073741824E9d) * 100.0d) / 100.0d;
                    fie.a = Double.valueOf(dRint);
                }
                l1zVar.n(jElapsedRealtime, num, str, str2, Double.valueOf(dRint), krh0.j(this), "Webview");
            }
        }
        this.H = null;
        super.onStop();
    }

    @Override // defpackage.uy1
    public final g6i0 w1() {
        try {
            return dn80.a(getLayoutInflater());
        } catch (InflateException unused) {
            op5 op5Var = op5.a;
            String string = getString(R.string.no_web_view_cms);
            string.getClass();
            String string2 = getString(R.string.no_web_view);
            string2.getClass();
            Toast.makeText(this, op5.c(op5Var, string, string2), 0).show();
            finish();
            return null;
        }
    }

    public final void z1(Context context) {
        double dRint;
        xnh0 user;
        xnh0 user2;
        xnh0 user3;
        xnh0 user4;
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        if (sportyGamesManager != null) {
            if (sportyGamesManager.getEnvironment() != null) {
                sportyGamesManager.getEnvironment().toString();
            }
            String country = sportyGamesManager.getCountry();
            if (country == null || country.length() == 0) {
                u1();
            }
            String platform = sportyGamesManager.getPlatform();
            platform.getClass();
            u3w.a = platform;
            u3w.d = sportyGamesManager.getCountry();
            u3w.b = sportyGamesManager.getDomain(context);
            u3w.c = sportyGamesManager.getLanguageCode();
        }
        SportyGamesManager sportyGamesManager2 = SportyGamesManager.getInstance();
        if (((sportyGamesManager2 == null || (user4 = sportyGamesManager2.getUser()) == null) ? null : user4.a) != null) {
            CookieManager cookieManager = CookieManager.getInstance();
            String str = u3w.b;
            SportyGamesManager sportyGamesManager3 = SportyGamesManager.getInstance();
            cookieManager.setCookie(str, "accessToken=" + ((sportyGamesManager3 == null || (user3 = sportyGamesManager3.getUser()) == null) ? null : user3.a));
        } else {
            CookieManager.getInstance().setCookie(u3w.b, "accessToken=");
        }
        SportyGamesManager sportyGamesManager4 = SportyGamesManager.getInstance();
        if (((sportyGamesManager4 == null || (user2 = sportyGamesManager4.getUser()) == null) ? null : user2.b) != null) {
            CookieManager cookieManager2 = CookieManager.getInstance();
            String str2 = u3w.b;
            SportyGamesManager sportyGamesManager5 = SportyGamesManager.getInstance();
            cookieManager2.setCookie(str2, "userId=" + ((sportyGamesManager5 == null || (user = sportyGamesManager5.getUser()) == null) ? null : user.b));
        } else {
            CookieManager.getInstance().setCookie(u3w.b, "userId=");
        }
        CookieManager cookieManager3 = CookieManager.getInstance();
        String str3 = u3w.b;
        SportyGamesManager sportyGamesManager6 = SportyGamesManager.getInstance();
        cookieManager3.setCookie(str3, "deviceId=" + (sportyGamesManager6 != null ? sportyGamesManager6.getDeviceId() : null));
        CookieManager.getInstance().setCookie(u3w.b, "platform=" + u3w.a);
        CookieManager.getInstance().setCookie(u3w.b, "sb_country=" + u3w.d);
        try {
            CookieManager.getInstance().setCookie(u3w.b, "download-source=".concat(SportyGamesManager.getInstance().isSideLoading(context) ? "external-link" : "google-play-store"));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = packageManager != null ? packageManager.getPackageInfo(context.getPackageName(), 0) : null;
        String str4 = packageInfo != null ? packageInfo.versionName : null;
        CookieManager.getInstance().setCookie(u3w.b, "app-version=" + str4);
        CookieManager.getInstance().setCookie(u3w.b, "locale=" + u3w.c);
        CookieManager.getInstance().setCookie(u3w.b, "exitRecommendationGame=" + getIntent().getStringExtra("name"));
        CookieManager.getInstance().setCookie(u3w.b, "isAnTestLatencyTrackingEnabled=" + this.B);
        Integer num = this.C;
        if (num != null) {
            int iIntValue = num.intValue();
            CookieManager.getInstance().setCookie(u3w.b, "campaignId=" + iIntValue);
        }
        Integer num2 = this.D;
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            CookieManager.getInstance().setCookie(u3w.b, "variantId=" + iIntValue2);
        }
        String str5 = this.E;
        if (str5 != null) {
            CookieManager.getInstance().setCookie(u3w.b, "variant=".concat(str5));
        }
        CookieManager cookieManager4 = CookieManager.getInstance();
        String str6 = u3w.b;
        Double d2 = fie.a;
        if (d2 != null) {
            dRint = d2.doubleValue();
        } else {
            Object systemService = context.getSystemService("activity");
            systemService.getClass();
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
            dRint = Math.rint((memoryInfo.totalMem / 1.073741824E9d) * 100.0d) / 100.0d;
            fie.a = Double.valueOf(dRint);
        }
        cookieManager4.setCookie(str6, "RAM=" + dRint);
        CookieManager.getInstance().setCookie(u3w.b, "networkType=".concat(krh0.j(context)));
    }

    public static void G1(String str) {
        String str2;
        zj60 bridge;
        if (SportyGamesManager.getInstance().getUser() != null) {
            str2 = "logged-in";
        } else {
            str2 = "non logged-in";
        }
        Bundle bundleA = whs.a(QWvyvNzGsBpRT.FGQtA, str, "user_state", str2);
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        if (sportyGamesManager != null && (bridge = sportyGamesManager.getBridge()) != null) {
            ((bk60) bridge).a("back_in_game", bundleA);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a extends WebViewClient {
        public final MainActivity a;
        public final SpinKitView b;
        public final GPSData c;

        /* JADX INFO: renamed from: com.sportygames.commons.views.MainActivity$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.commons.views.MainActivity$MyWebViewClient$onPageStarted$1", f = "MainActivity.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class C0439a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public final /* synthetic */ WebView b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0439a(WebView webView, v1b<? super C0439a> v1bVar) {
                super(2, v1bVar);
                this.b = webView;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return a.this.new C0439a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0439a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                String strJ = new eal().j(a.this.c);
                if (!TextUtils.isEmpty(strJ)) {
                    this.b.evaluateJavascript("sessionStorage.setItem('gpsData', '" + strJ + "');", null);
                }
                return Unit.a;
            }
        }

        public a(MainActivity mainActivity, SpinKitView spinKitView, GPSData gPSData) {
            this.a = mainActivity;
            this.b = spinKitView;
            this.c = gPSData;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            webView.getClass();
            str.getClass();
            super.onPageStarted(webView, str, bitmap);
            this.b.setVisibility(0);
            MainActivity mainActivity = this.a;
            f0j0 f0j0VarC = mainActivity.C1().c(webView);
            if (f0j0VarC != null) {
                mainActivity.J1(webView, f0j0VarC);
            }
            if (yju.a("br")) {
                try {
                    pfd pfdVar = fse.a;
                    ej5.c(w5b.a(gku.a), null, null, new C0439a(webView, null), 3);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            webView.getClass();
            str.getClass();
            str2.getClass();
            webView.setVisibility(8);
            this.b.setVisibility(0);
            this.a.y1();
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri url;
            return !d0j0.b((webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) ? null : url.toString(), SportyGamesManager.getInstance().getDomain(this.a));
        }

        @Override // android.webkit.WebViewClient
        @fae
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return !d0j0.b(str, SportyGamesManager.getInstance().getDomain(this.a));
        }
    }
}
