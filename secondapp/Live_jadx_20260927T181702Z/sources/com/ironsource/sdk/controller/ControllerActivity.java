package com.ironsource.sdk.controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import com.ironsource.A8;
import com.ironsource.B7;
import com.ironsource.C4178a1;
import com.ironsource.C4235d4;
import com.ironsource.C4281fe;
import com.ironsource.C4355k;
import com.ironsource.C4373l;
import com.ironsource.C4473q8;
import com.ironsource.C4485r4;
import com.ironsource.C4551v2;
import com.ironsource.C4557v8;
import com.ironsource.G5;
import com.ironsource.InterfaceC4410mg;
import com.ironsource.Lb;
import com.ironsource.Og;
import com.ironsource.Qc;
import com.ironsource.S9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class ControllerActivity extends Activity implements Qc, InterfaceC4410mg {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f63589o = "ControllerActivity";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f63590p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static String f63591q = "removeWebViewContainerView | mContainer is null";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static String f63592r = "removeWebViewContainerView | view is null";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f63593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v f63594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RelativeLayout f63595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FrameLayout f63596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private B7 f63597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private OnBackInvokedCallback f63598f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f63600h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private C4178a1 f63604l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f63605m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f63606n;
    public int currentRequestedRotation = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f63599g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f63601i = new Handler();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f63602j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final RelativeLayout.LayoutParams f63603k = new RelativeLayout.LayoutParams(-1, -1);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(ControllerActivity.this.f63599g));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements View.OnSystemUiVisibilityChangeListener {
        public b() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i10) {
            if ((i10 & 4098) == 0) {
                ControllerActivity controllerActivity = ControllerActivity.this;
                controllerActivity.f63601i.removeCallbacks(controllerActivity.f63602j);
                ControllerActivity controllerActivity2 = ControllerActivity.this;
                controllerActivity2.f63601i.postDelayed(controllerActivity2.f63602j, 500L);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().addFlags(128);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ControllerActivity.this.getWindow().clearFlags(128);
        }
    }

    private void f() {
        runOnUiThread(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        Logger.i(f63589o, "OnBackInvokedCallback");
        if (C4551v2.a().a(this)) {
            return;
        }
        super.onBackPressed();
    }

    private void h() {
        if (Build.VERSION.SDK_INT < 33 || this.f63598f == null) {
            return;
        }
        try {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f63598f);
            Logger.i(f63589o, "OnBackInvokedCallback unregistered");
            this.f63598f = null;
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error("Failed to unregister OnBackInvokedCallback: " + e10);
        }
    }

    private void i() {
        ViewGroup viewGroup;
        try {
            if (this.f63595c == null) {
                throw new Exception(f63591q);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f63596d.getParent();
            View viewA = a(viewGroup2);
            if (viewA == null) {
                throw new Exception(f63592r);
            }
            if (isFinishing() && (viewGroup = (ViewGroup) viewA.getParent()) != null) {
                viewGroup.removeView(viewA);
            }
            viewGroup2.removeView(this.f63596d);
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            A8.a(C4281fe.f61809s, new C4557v8().a(G5.A, e10.getMessage()).a());
            Logger.i(f63589o, "removeWebViewContainerView fail " + e10.getMessage());
        }
    }

    private void j() {
        int iK = this.f63597e.K(this);
        String str = f63589o;
        Logger.i(str, "setInitiateLandscapeOrientation");
        if (iK == 0) {
            Logger.i(str, "ROTATION_0");
            setRequestedOrientation(0);
            return;
        }
        if (iK == 2) {
            Logger.i(str, "ROTATION_180");
            setRequestedOrientation(8);
        } else if (iK == 3) {
            Logger.i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(8);
        } else if (iK != 1) {
            Logger.i(str, "No Rotation");
        } else {
            Logger.i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(0);
        }
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void k() {
        int iK = this.f63597e.K(this);
        String str = f63589o;
        Logger.i(str, "setInitiatePortraitOrientation");
        if (iK == 0) {
            Logger.i(str, "ROTATION_0");
            setRequestedOrientation(1);
            return;
        }
        if (iK == 2) {
            Logger.i(str, "ROTATION_180");
            setRequestedOrientation(9);
        } else if (iK == 1) {
            Logger.i(str, "ROTATION_270 Right Landscape");
            setRequestedOrientation(1);
        } else if (iK != 3) {
            Logger.i(str, "No Rotation");
        } else {
            Logger.i(str, "ROTATION_90 Left Landscape");
            setRequestedOrientation(1);
        }
    }

    @Override // com.ironsource.Qc
    public boolean onBackButtonPressed() {
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        Logger.i(f63589o, "onBackPressed");
        if (C4551v2.a().a(this)) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.ironsource.Qc
    public void onCloseRequested() {
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f63597e = Lb.U().i();
        try {
            new C4373l(this).a();
            new C4355k(this).a();
            v vVar = (v) S9.b((Context) this).a().k();
            this.f63594b = vVar;
            vVar.r().setId(1);
            this.f63594b.a((Qc) this);
            this.f63594b.a((InterfaceC4410mg) this);
            Intent intent = getIntent();
            this.f63600h = intent.getStringExtra(C4235d4.i.f61426m);
            this.f63599g = intent.getBooleanExtra(C4235d4.i.f61444v, false);
            this.f63593a = intent.getStringExtra("adViewId");
            this.f63605m = false;
            this.f63606n = intent.getBooleanExtra(C4235d4.i.f61453z0, false);
            if (this.f63599g) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new b());
                runOnUiThread(this.f63602j);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f63595c = relativeLayout;
            setContentView(relativeLayout, this.f63603k);
            this.f63596d = a(this.f63593a);
            if (this.f63595c.findViewById(1) == null && this.f63596d.getParent() != null) {
                finish();
            }
            d();
            this.f63595c.addView(this.f63596d, this.f63603k);
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            finish();
        }
        a();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        String str = f63589o;
        Logger.i(str, "onDestroy");
        h();
        i();
        if (this.f63605m) {
            return;
        }
        Logger.i(str, "onDestroy | destroyedFromBackground");
        c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4 && this.f63594b.x()) {
            this.f63594b.w();
            return true;
        }
        if (this.f63599g && (i10 == 25 || i10 == 24)) {
            this.f63601i.removeCallbacks(this.f63602j);
            this.f63601i.postDelayed(this.f63602j, 500L);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // com.ironsource.Qc
    public void onOrientationChanged(String str, int i10) {
        a(str, i10);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        Logger.i(f63589o, "onPause, isFinishing=" + isFinishing());
        t.a(this);
        v vVar = this.f63594b;
        if (vVar != null) {
            vVar.a((Context) this);
            if (!this.f63606n) {
                this.f63594b.B();
            }
            this.f63594b.b(false, "main");
            this.f63594b.g(this.f63600h, C4235d4.i.f61441t0);
        }
        if (isFinishing()) {
            this.f63605m = true;
            c();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.i(f63589o, C4235d4.i.f61443u0);
        v vVar = this.f63594b;
        if (vVar != null) {
            vVar.b(this);
            if (!this.f63606n) {
                this.f63594b.F();
            }
            this.f63594b.b(true, "main");
            this.f63594b.g(this.f63600h, C4235d4.i.f61443u0);
        }
        t.b(this);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        Logger.i(f63589o, "onStart");
        v vVar = this.f63594b;
        if (vVar != null) {
            vVar.g(this.f63600h, "onStart");
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        Logger.i(f63589o, "onStop");
        v vVar = this.f63594b;
        if (vVar != null) {
            vVar.g(this.f63600h, "onStop");
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Logger.i(f63589o, "onUserLeaveHint");
        v vVar = this.f63594b;
        if (vVar != null) {
            vVar.g(this.f63600h, "onUserLeaveHint");
        }
    }

    @Override // com.ironsource.InterfaceC4410mg
    public void onVideoEnded() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.InterfaceC4410mg
    public void onVideoPaused() {
        toggleKeepScreen(false);
    }

    @Override // com.ironsource.InterfaceC4410mg
    public void onVideoResumed() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.InterfaceC4410mg
    public void onVideoStarted() {
        toggleKeepScreen(true);
    }

    @Override // com.ironsource.InterfaceC4410mg
    public void onVideoStopped() {
        toggleKeepScreen(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (this.f63599g && z10) {
            runOnUiThread(this.f63602j);
        }
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i10) {
        if (this.currentRequestedRotation != i10) {
            Logger.i(f63589o, "Rotation: Req = " + i10 + " Curr = " + this.currentRequestedRotation);
            this.currentRequestedRotation = i10;
            super.setRequestedOrientation(i10);
        }
    }

    public void toggleKeepScreen(boolean z10) {
        if (z10) {
            f();
        } else {
            b();
        }
    }

    private void a() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f63598f = new OnBackInvokedCallback() { // from class: com.ironsource.sdk.controller.w
                public final void onBackInvoked() {
                    this.f64058a.g();
                }
            };
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f63598f);
        }
    }

    private boolean b(String str) {
        return (TextUtils.isEmpty(str) || str.equals(Integer.toString(1))) ? false : true;
    }

    private void c() {
        String str = f63589o;
        Logger.i(str, "clearWebviewController");
        v vVar = this.f63594b;
        if (vVar == null) {
            Logger.i(str, "clearWebviewController, null");
            return;
        }
        vVar.a(v.EnumC0595v.Gone);
        this.f63594b.C();
        this.f63594b.D();
        this.f63594b.g(this.f63600h, "onDestroy");
    }

    private void d() {
        Intent intent = getIntent();
        a(intent.getStringExtra(C4235d4.i.A), intent.getIntExtra(C4235d4.i.B, 0));
    }

    private boolean e() {
        return this.f63593a == null;
    }

    private void b() {
        runOnUiThread(new d());
    }

    private FrameLayout a(String str) {
        if (!b(str)) {
            return this.f63594b.r();
        }
        return Og.a(getApplicationContext(), C4473q8.a().a(str).getPresentingView());
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void a(String str, int i10) {
        if (str != null) {
            if (C4235d4.i.C.equalsIgnoreCase(str)) {
                j();
                return;
            }
            if (C4235d4.i.D.equalsIgnoreCase(str)) {
                k();
                return;
            }
            if ("device".equalsIgnoreCase(str)) {
                if (this.f63597e.w(this)) {
                    setRequestedOrientation(1);
                }
            } else if (getRequestedOrientation() == -1) {
                setRequestedOrientation(4);
            }
        }
    }

    private View a(ViewGroup viewGroup) {
        if (e()) {
            return viewGroup.findViewById(1);
        }
        return C4473q8.a().a(this.f63593a).getPresentingView();
    }
}
