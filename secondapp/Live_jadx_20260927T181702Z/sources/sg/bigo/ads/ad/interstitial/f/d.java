package sg.bigo.ads.ad.interstitial.f;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* JADX INFO: loaded from: classes7.dex */
public class d extends sg.bigo.ads.controller.landing.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final LandingPageStyleConfig f131836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m f131837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f131838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ProgressBar f131839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f131840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f131841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f131842g;

    public d(@NonNull Activity activity) {
        super(activity);
        this.f131840e = 5;
        this.f131841f = false;
        this.f131842g = true;
        Intent intent = activity.getIntent();
        this.f131836a = intent == null ? null : (LandingPageStyleConfig) intent.getParcelableExtra("layout_style");
        sg.bigo.ads.api.core.b bVar = this.f134401t;
        if (bVar != null) {
            this.f131837b = bVar.e();
        }
    }

    private int a(String str, String str2, String str3) {
        LandingPageStyleConfig landingPageStyleConfig;
        str.getClass();
        int i10 = 2;
        switch (str) {
            case "video_play_page.webview2_force_time":
                break;
            case "video_play_page.loading_timing":
            case "video_play_page.is_loading":
                i10 = 1;
                break;
            default:
                i10 = 0;
                break;
        }
        m mVar = this.f131837b;
        if (mVar != null && (landingPageStyleConfig = this.f131836a) != null) {
            int i11 = landingPageStyleConfig.f134333c;
            if (i11 == 0) {
                return mVar.a(str);
            }
            if (i11 == 1) {
                return mVar.a(str3);
            }
            if (i11 == 9 || i11 == 10) {
                return mVar.a(str2);
            }
        }
        return i10;
    }

    private void f() {
        ViewStub viewStub;
        View view;
        if (!this.f131841f && x()) {
            if ((this.f131838c == null || this.f131839d == null) && (viewStub = (ViewStub) p(R.id.bigo_web_loading_container)) != null) {
                View viewInflate = viewStub.inflate();
                this.f131838c = viewInflate;
                if (viewInflate != null) {
                    this.f131839d = (ProgressBar) viewInflate.findViewById(R.id.bigo_ad_webview_loading_progress);
                }
            }
            View view2 = this.f131838c;
            if (view2 != null) {
                view2.setVisibility(0);
                ProgressBar progressBar = this.f131839d;
                if (progressBar != null) {
                    progressBar.setProgress(5);
                }
            }
            int iY = y();
            if (iY > 1 && (view = this.f131838c) != null) {
                view.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.f.d.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (sg.bigo.ads.ad.c.a(d.this.f134400s)) {
                            return;
                        }
                        d.this.g();
                    }
                }, ((long) iY) * 1000);
            }
            this.f131841f = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        View view = this.f131838c;
        if (view != null) {
            this.f131841f = false;
            view.setVisibility(8);
        }
    }

    private boolean x() {
        return 1 == a("video_play_page.is_loading", "layer.is_loading", "endpage.is_loading");
    }

    private int y() {
        int iA = a("video_play_page.loading_timing", "layer.loading_timing", "endpage.loading_timing");
        if (iA == 2) {
            return 3;
        }
        if (iA == 3) {
            return 5;
        }
        if (iA != 4) {
            return iA;
        }
        return 10;
    }

    @Override // sg.bigo.ads.controller.landing.d, sg.bigo.ads.core.landing.WebViewActivityImpl
    public void b() {
        super.b();
        f();
        if (c()) {
            ProgressBar progressBar = this.f134966y;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            ImageView imageView = this.A;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            TextView textView = this.f134965x;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final boolean c() {
        return 1 == a("video_play_page.support_browser", "layer.support_browser", "endpage.support_browser");
    }

    @Override // sg.bigo.ads.controller.landing.d, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void a(int i10) {
        super.a(i10);
        ProgressBar progressBar = this.f131839d;
        if (progressBar == null || i10 <= 5) {
            return;
        }
        if (i10 > 95) {
            i10 = 95;
        }
        progressBar.setProgress(i10);
    }

    @Override // sg.bigo.ads.controller.landing.d, sg.bigo.ads.core.landing.WebViewActivityImpl
    public void a(String str) {
        super.a(str);
        if (this.f131838c == null || y() > 1) {
            return;
        }
        g();
    }

    @Override // sg.bigo.ads.controller.landing.d, sg.bigo.ads.core.landing.WebViewActivityImpl
    public void a(String str, boolean z10) {
        f();
        super.a(str, z10);
        if (this.f131842g) {
            this.f131842g = false;
            return;
        }
        this.f134404w = true;
        q();
        int iA = a("video_play_page.webview2_force_time", "layer.webview2_force_time", "endpage.webview2_force_time");
        if (iA == 1 || iA == 2 || iA == 3 || iA == 4) {
            this.f134403v = iA + 1;
        } else {
            this.f134403v = 0;
        }
        w();
    }
}
