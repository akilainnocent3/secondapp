package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedCallback;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.omn;
import com.bytedance.sdk.openadsdk.utils.kub;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class TTBaseActivity extends Activity {
    private OnBackInvokedCallback hww;
    protected String nod;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    protected boolean f35200rs = false;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww implements OnBackInvokedCallback {
        private final WeakReference<TTBaseActivity> hww;

        public hww(TTBaseActivity tTBaseActivity) {
            this.hww = new WeakReference<>(tTBaseActivity);
        }

        public void onBackInvoked() {
            TTBaseActivity tTBaseActivity = this.hww.get();
            if (tTBaseActivity != null) {
                tTBaseActivity.tq();
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    public boolean hww() {
        return false;
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (hww() && kub.hww()) {
            this.hww = new hww(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.hww);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!kub.hww() || this.hww == null) {
            return;
        }
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.hww);
        this.hww = null;
    }

    @Override // android.app.Activity
    public void onPause() {
        if (Build.VERSION.SDK_INT < 33) {
            super.onPause();
            return;
        }
        try {
            try {
                super.onPause();
            } catch (Exception unused) {
            }
        } catch (IllegalArgumentException unused2) {
            Field declaredField = Activity.class.getDeclaredField("mCalled");
            declaredField.setAccessible(true);
            declaredField.set(this, Boolean.TRUE);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 28 || i10 < 24) {
            super.onResume();
            return;
        }
        try {
            super.onResume();
        } catch (IllegalArgumentException e10) {
            omn.hww("TTBaseActivity", "super.onResume() run fail", e10);
            try {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
            } catch (Exception e11) {
                omn.hww("TTBaseActivity", "onResume set mCalled fail", e11);
            }
        }
    }

    public void sd(boolean z10) {
        this.f35200rs = z10;
    }

    public void tq() {
        onBackPressed();
    }
}
