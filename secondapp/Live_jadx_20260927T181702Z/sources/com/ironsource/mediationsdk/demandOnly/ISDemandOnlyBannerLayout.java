package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.C4517t2;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class ISDemandOnlyBannerLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f62496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ISBannerSize f62497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f62498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Activity f62499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f62500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C4517t2 f62501f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f62502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout.LayoutParams f62503b;

        public a(View view, FrameLayout.LayoutParams layoutParams) {
            this.f62502a = view;
            this.f62503b = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            ISDemandOnlyBannerLayout.this.removeAllViews();
            ViewParent parent = this.f62502a.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f62502a);
            }
            ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = ISDemandOnlyBannerLayout.this;
            View view = this.f62502a;
            iSDemandOnlyBannerLayout.f62496a = view;
            iSDemandOnlyBannerLayout.addView(view, 0, this.f62503b);
        }
    }

    public ISDemandOnlyBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f62500e = false;
        this.f62499d = activity;
        this.f62497b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
        this.f62501f = new C4517t2();
    }

    public Activity getActivity() {
        return this.f62499d;
    }

    public ISDemandOnlyBannerListener getBannerDemandOnlyListener() {
        return this.f62501f.a();
    }

    public View getBannerView() {
        return this.f62496a;
    }

    public C4517t2 getListener() {
        return this.f62501f;
    }

    public String getPlacementName() {
        return this.f62498c;
    }

    public ISBannerSize getSize() {
        return this.f62497b;
    }

    public boolean isDestroyed() {
        return this.f62500e;
    }

    public void removeBannerListener() {
        IronLog.API.info();
        this.f62501f.b((Object) null);
    }

    public void setBannerDemandOnlyListener(ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
        IronLog.API.info();
        this.f62501f.b(iSDemandOnlyBannerListener);
    }

    public void setPlacementName(String str) {
        this.f62498c = str;
    }

    public void a() {
        this.f62500e = true;
        this.f62499d = null;
        this.f62497b = null;
        this.f62498c = null;
        this.f62496a = null;
        removeBannerListener();
    }

    private ISDemandOnlyBannerLayout(Context context) {
        super(context);
        this.f62500e = false;
    }

    public void a(View view, FrameLayout.LayoutParams layoutParams) {
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(view, layoutParams));
    }
}
