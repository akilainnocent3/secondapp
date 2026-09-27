package com.mbridge.msdk.config.activity;

import android.content.Intent;
import android.view.ViewGroup;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f65059a = "ActivityPresenter";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.activity.lifecycle.a f65060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewGroup f65061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f65062d;

    public a(MBRewardVideoActivity mBRewardVideoActivity, ViewGroup viewGroup) {
        this.f65061c = viewGroup;
        a(mBRewardVideoActivity);
        if (mBRewardVideoActivity != null && mBRewardVideoActivity.getIntent() != null) {
            this.f65060b = (com.mbridge.msdk.config.activity.lifecycle.a) mBRewardVideoActivity.getIntent().getSerializableExtra("lifecycleCallbackByActivity");
            int intExtra = mBRewardVideoActivity.getIntent().getIntExtra("156", 1);
            this.f65062d = intExtra;
            mBRewardVideoActivity.setRequestedOrientation(intExtra);
        }
        a("onCreate");
    }

    public void a(String str) {
        if (this.f65060b == null) {
            return;
        }
        str.getClass();
        switch (str) {
            case "onDestroy":
                this.f65060b.f();
                break;
            case "onPause":
                this.f65060b.e();
                break;
            case "onStart":
                this.f65060b.onStart();
                break;
            case "onBackPressed":
                this.f65060b.c();
                break;
            case "onStop":
                this.f65060b.a();
                break;
            case "onCreate":
                this.f65060b.a(this.f65061c);
                break;
            case "onResume":
                this.f65060b.b();
                break;
        }
        q0.b("ActivityPresenter", "life " + str);
    }

    private void a(MBRewardVideoActivity mBRewardVideoActivity) {
        int iA;
        int iA2;
        int iA3;
        if (mBRewardVideoActivity == null || mBRewardVideoActivity.isFinishing() || mBRewardVideoActivity.getIntent() == null) {
            return;
        }
        Intent intent = mBRewardVideoActivity.getIntent();
        if (intent.getIntExtra("154", 0) != 1) {
            return;
        }
        try {
            int intExtra = mBRewardVideoActivity.getIntent().getIntExtra("157", 0);
            int intExtra2 = mBRewardVideoActivity.getIntent().getIntExtra("158", 0);
            int iG = v0.g(mBRewardVideoActivity);
            int iF = v0.f(mBRewardVideoActivity);
            if (intent.getIntExtra("155", 0) == 0 && (iA3 = c.a(mBRewardVideoActivity)) > 0) {
                iF -= iA3;
            }
            if (intExtra <= 0 || intExtra2 <= 0) {
                iA = iG;
                iA2 = iF;
            } else {
                iA = v0.a(mBRewardVideoActivity, intExtra);
                iA2 = v0.a(mBRewardVideoActivity, intExtra2);
            }
            int iMin = Math.min(iA, iG);
            int iMin2 = Math.min(iA2, iF);
            ViewGroup.LayoutParams layoutParams = this.f65061c.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(iMin, iMin2);
            } else {
                layoutParams.width = iMin;
                layoutParams.height = iMin2;
            }
            this.f65061c.setLayoutParams(layoutParams);
            this.f65061c.setX((iG - iMin) / 2.0f);
            this.f65061c.setY((iF - iMin2) / 2.0f);
        } catch (Exception e10) {
            q0.b("ActivityPresenter", e10.getMessage());
        }
    }
}
