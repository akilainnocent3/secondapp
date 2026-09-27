package com.chartboost.sdk.view;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.impl.c4;
import com.chartboost.sdk.impl.mg;
import com.chartboost.sdk.impl.ok;
import com.chartboost.sdk.impl.sb;
import com.chartboost.sdk.impl.t9;
import com.chartboost.sdk.impl.uf;
import com.chartboost.sdk.impl.v9;
import dr.o;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class CBImpressionActivity extends Activity implements t9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v9 f41895a;

    public final void a() {
        if (this.f41895a == null) {
            if (!Chartboost.isSdkStarted()) {
                sb.b("Cannot start Chartboost activity due to SDK not being initialized.", (Throwable) null, 2, (Object) null);
                finish();
                return;
            }
            c4 c4Var = c4.f38374b;
            uf ufVarA = c4Var.l().a();
            Object obj = c4Var.a().b().get();
            m0.o(obj, "get(...)");
            this.f41895a = new v9(this, ufVarA, (mg) obj, c4Var.d().j());
        }
    }

    @Override // com.chartboost.sdk.impl.t9
    public void attachViewToActivity(@l ok view) {
        m0.p(view, "view");
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            addContentView(view, new FrameLayout.LayoutParams(-1, -1));
        } catch (Exception e10) {
            sb.a("Cannot attach view to activity", e10);
        }
    }

    public final boolean b() {
        Intent intent = getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("isChartboost", false);
        }
        return false;
    }

    @Override // com.chartboost.sdk.impl.t9
    public void finishActivity() {
        finish();
    }

    @Override // com.chartboost.sdk.impl.t9
    public boolean isActivityHardwareAccelerated() {
        View decorView;
        Window window = getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return false;
        }
        return decorView.isHardwareAccelerated();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v9 v9Var = this.f41895a;
        if (v9Var != null) {
            v9Var.h();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@l Configuration newConfig) {
        m0.p(newConfig, "newConfig");
        v9 v9Var = this.f41895a;
        if (v9Var != null) {
            v9Var.b();
        }
        super.onConfigurationChanged(newConfig);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c();
        if (!b()) {
            sb.b("This activity cannot be called from outside chartboost SDK", (Throwable) null, 2, (Object) null);
            finish();
            return;
        }
        requestWindowFeature(1);
        getWindow().setWindowAnimations(0);
        a();
        v9 v9Var = this.f41895a;
        if (v9Var != null) {
            v9Var.c();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        v9 v9Var = this.f41895a;
        if (v9Var != null) {
            v9Var.d();
        }
        this.f41895a = null;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        v9 v9Var = this.f41895a;
        if (v9Var != null) {
            v9Var.e();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        a();
        v9 v9Var = this.f41895a;
        if (v9Var != null) {
            v9Var.f();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        v9 v9Var = this.f41895a;
        if (v9Var != null) {
            v9Var.g();
        }
    }

    @Override // com.chartboost.sdk.impl.t9
    public void setFullscreen() {
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                Window window = getWindow();
                if (window != null) {
                    window.setDecorFitsSystemWindows(true);
                    WindowInsetsController insetsController = window.getInsetsController();
                    if (insetsController != null) {
                        insetsController.hide(WindowInsets.Type.statusBars() | WindowInsets.Type.navigationBars());
                        insetsController.setSystemBarsBehavior(2);
                    }
                }
            } else {
                Window window2 = getWindow();
                View decorView = window2 != null ? window2.getDecorView() : null;
                if (decorView != null) {
                    decorView.setSystemUiVisibility(3846);
                }
            }
            if (i10 >= 28) {
                Window window3 = getWindow();
                WindowManager.LayoutParams attributes = window3 != null ? window3.getAttributes() : null;
                if (attributes == null) {
                    return;
                }
                attributes.layoutInDisplayCutoutMode = 1;
            }
        } catch (Exception e10) {
            sb.a("Cannot set view to fullscreen", e10);
        }
    }

    public final void c() {
    }

    @Override // com.chartboost.sdk.impl.t9
    @l
    public CBImpressionActivity getActivity() {
        return this;
    }

    @Override // android.app.Activity
    @o(message = "Deprecated in Java")
    public void onBackPressed() {
    }
}
