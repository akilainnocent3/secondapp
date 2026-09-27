package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.C4534u2;
import com.ironsource.Ga;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class q extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ISBannerSize f62785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f62786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f62787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f62788d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void onWindowFocusChanged(boolean z10);
    }

    public q(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f62787c = false;
        this.f62785a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public void a() {
        this.f62787c = true;
        this.f62785a = null;
        this.f62786b = null;
        this.f62788d = null;
        C4534u2.a().a((Ga) null);
    }

    public boolean b() {
        return this.f62787c;
    }

    public q c() {
        q qVar = new q(getContext(), this.f62785a);
        qVar.f62786b = this.f62786b;
        return qVar;
    }

    public ISBannerSize getSize() {
        return this.f62785a;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        a aVar = this.f62788d;
        if (aVar != null) {
            aVar.onWindowFocusChanged(z10);
        }
    }

    public void setBannerSize(ISBannerSize iSBannerSize) {
        this.f62785a = iSBannerSize;
    }

    public q(Context context, ISBannerSize iSBannerSize) {
        super(context);
        this.f62787c = false;
        this.f62785a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public q(Context context) {
        super(context);
        this.f62787c = false;
    }
}
