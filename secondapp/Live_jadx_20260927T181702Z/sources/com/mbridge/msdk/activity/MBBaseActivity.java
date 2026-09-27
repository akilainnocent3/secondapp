package com.mbridge.msdk.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.OrientationEventListener;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.material.bottomappbar.d;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class MBBaseActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Display f64638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private OrientationEventListener f64639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f64640c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f64641d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f64642e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MBBaseActivity.this.b();
            } catch (Exception e10) {
                q0.b("MBBaseActivity", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends OrientationEventListener {
        public b(Context context, int i10) {
            super(context, i10);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i10) {
            int rotation = MBBaseActivity.this.f64638a != null ? MBBaseActivity.this.f64638a.getRotation() : 0;
            if (rotation == 1 && MBBaseActivity.this.f64640c != 1) {
                MBBaseActivity.this.f64640c = 1;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Left");
                return;
            }
            if (rotation == 3 && MBBaseActivity.this.f64640c != 2) {
                MBBaseActivity.this.f64640c = 2;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Right");
            } else if (rotation == 0 && MBBaseActivity.this.f64640c != 3) {
                MBBaseActivity.this.f64640c = 3;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Top");
            } else {
                if (rotation != 2 || MBBaseActivity.this.f64640c == 4) {
                    return;
                }
                MBBaseActivity.this.f64640c = 4;
                MBBaseActivity.this.getNotchParams();
                q0.b("MBBaseActivity", "Orientation Bottom");
            }
        }
    }

    private void d() {
        b bVar = new b(this, 1);
        this.f64639b = bVar;
        if (bVar.canDetectOrientation()) {
            this.f64639b.enable();
        } else {
            this.f64639b.disable();
            this.f64639b = null;
        }
    }

    public void getNotchParams() {
        if (this.f64641d) {
            return;
        }
        this.f64642e = new a();
        getWindow().getDecorView().postDelayed(this.f64642e, 500L);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f64641d = false;
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(512);
            c();
            a();
            f1.c(getWindow());
        } catch (Exception e10) {
            q0.b("MBBaseActivity", e10.getMessage());
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.f64641d = true;
        super.onDestroy();
        try {
            OrientationEventListener orientationEventListener = this.f64639b;
            if (orientationEventListener != null) {
                orientationEventListener.disable();
                this.f64639b = null;
            }
            if (this.f64642e != null) {
                getWindow().getDecorView().removeCallbacks(this.f64642e);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("MBBaseActivity", e10.getMessage());
            }
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (com.mbridge.msdk.foundation.feedback.b.f66963f) {
            return;
        }
        getNotchParams();
        c();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        c();
    }

    public abstract void setTopControllerPadding(int i10, int i11, int i12, int i13, int i14);

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        int i10;
        int safeInsetLeft;
        int i11;
        int i12;
        int safeInsetBottom;
        DisplayCutout displayCutout;
        int i13;
        int i14 = Build.VERSION.SDK_INT;
        if (this.f64641d) {
            return;
        }
        WindowInsets rootWindowInsets = getWindow().getDecorView().getRootWindowInsets();
        int i15 = -1;
        if (rootWindowInsets == null || i14 < 28 || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            this = this;
            i10 = -1;
            safeInsetLeft = 0;
            i11 = 0;
            i12 = 0;
            safeInsetBottom = 0;
        } else {
            safeInsetLeft = displayCutout.getSafeInsetLeft();
            int safeInsetRight = displayCutout.getSafeInsetRight();
            int safeInsetTop = displayCutout.getSafeInsetTop();
            safeInsetBottom = displayCutout.getSafeInsetBottom();
            Display display = this.f64638a;
            int rotation = display != null ? display.getRotation() : a();
            if (this.f64640c == -1) {
                if (rotation == 0) {
                    i13 = 3;
                } else if (rotation == 1) {
                    i13 = 1;
                } else if (rotation == 2) {
                    i13 = 4;
                } else {
                    i13 = rotation == 3 ? 2 : -1;
                }
                this.f64640c = i13;
                q0.b("MBBaseActivity", this.f64640c + "");
            }
            if (rotation != 0) {
                if (rotation == 1) {
                    i15 = 90;
                } else if (rotation == 2) {
                    i15 = 180;
                } else if (rotation == 3) {
                    i15 = d.f50281j;
                }
                i10 = i15;
            } else {
                i10 = 0;
            }
            i11 = safeInsetRight;
            i12 = safeInsetTop;
        }
        this.setTopControllerPadding(i10, safeInsetLeft, i11, i12, safeInsetBottom);
        if (this.f64639b == null) {
            d();
        }
    }

    private void c() {
        try {
            getWindow().addFlags(67108864);
            getWindow().getDecorView().setSystemUiVisibility(4098);
        } catch (Throwable th2) {
            q0.b("MBBaseActivity", th2.getMessage());
        }
    }

    private int a() {
        if (this.f64638a == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f64638a = getDisplay();
            } else {
                this.f64638a = ((WindowManager) getSystemService("window")).getDefaultDisplay();
            }
        }
        Display display = this.f64638a;
        if (display != null) {
            return display.getRotation();
        }
        return -1;
    }
}
