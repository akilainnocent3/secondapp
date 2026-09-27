package sg.bigo.ads.ad.splash;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.Mf;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.SplashAd;
import sg.bigo.ads.api.SplashAdInteractionListener;
import sg.bigo.ads.controller.landing.e;

/* JADX INFO: loaded from: classes7.dex */
public class AdSplashActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Integer, b> f132470a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f132471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f132472c = new AtomicBoolean(false);

    public static void a(@NonNull Context context, @NonNull b bVar) {
        Intent intent = new Intent(context, (Class<?>) (bVar.getStyle() == SplashAd.Style.HORIZONTAL ? LandscapeAdSplashActivity.class : AdSplashActivity.class));
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        int iHashCode = bVar.hashCode();
        intent.putExtra("splash_hash", iHashCode);
        f132470a.put(Integer.valueOf(iHashCode), bVar);
        context.startActivity(intent);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        try {
            if (this.f132471b == null || !this.f132472c.compareAndSet(false, true)) {
                return;
            }
            this.f132471b.B.onAdClosed();
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
            Window window = getWindow();
            if (window != null) {
                window.setFlags(1024, 1024);
            }
            Intent intent = getIntent();
            if (intent != null) {
                int intExtra = intent.getIntExtra("splash_hash", -1);
                Map<Integer, b> map = f132470a;
                b bVar = map.get(Integer.valueOf(intExtra));
                if (bVar != null) {
                    map.remove(Integer.valueOf(intExtra));
                    FrameLayout frameLayout = new FrameLayout(this);
                    frameLayout.setBackgroundColor(-1);
                    setContentView(frameLayout);
                    this.f132471b = bVar;
                    bVar.B.f132677c = new SplashAdInteractionListener() { // from class: sg.bigo.ads.ad.splash.AdSplashActivity.1
                        @Override // sg.bigo.ads.api.AdInteractionListener
                        public final void onAdClicked() {
                            sg.bigo.ads.common.t.a.a(0, 3, "AdSplashActivity", Mf.f59495f);
                        }

                        @Override // sg.bigo.ads.api.AdInteractionListener
                        public final void onAdClosed() {
                            sg.bigo.ads.common.t.a.a(0, 3, "AdSplashActivity", Mf.f59496g);
                        }

                        @Override // sg.bigo.ads.api.AdInteractionListener
                        public final void onAdError(@NonNull AdError adError) {
                            if (adError == null) {
                                return;
                            }
                            sg.bigo.ads.common.t.a.a(0, 3, "AdSplashActivity", "onAdError: " + adError.getCode() + " " + adError.getMessage());
                        }

                        @Override // sg.bigo.ads.api.SplashAdInteractionListener
                        public final void onAdFinished() {
                            sg.bigo.ads.common.t.a.a(0, 3, "AdSplashActivity", "onAdFinished");
                        }

                        @Override // sg.bigo.ads.api.AdInteractionListener
                        public final void onAdImpression() {
                            sg.bigo.ads.common.t.a.a(0, 3, "AdSplashActivity", "onAdImpression");
                        }

                        @Override // sg.bigo.ads.api.AdInteractionListener
                        public final void onAdOpened() {
                            sg.bigo.ads.common.t.a.a(0, 3, "AdSplashActivity", Mf.f59492c);
                        }

                        @Override // sg.bigo.ads.api.SplashAdInteractionListener
                        public final void onAdSkipped() {
                            sg.bigo.ads.common.t.a.a(0, 3, "AdSplashActivity", "onAdSkipped");
                            AdSplashActivity.this.finish();
                        }
                    };
                    bVar.a(frameLayout);
                    b bVar2 = this.f132471b;
                    if (bVar2 != null) {
                        bVar2.B.onAdOpened();
                        return;
                    }
                    return;
                }
            }
            finish();
        } catch (Throwable unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            if (this.f132471b != null && this.f132472c.compareAndSet(false, true)) {
                this.f132471b.B.onAdClosed();
            }
            b bVar = this.f132471b;
            if (bVar != null) {
                bVar.destroy();
                this.f132471b = null;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyDown(i10, keyEvent);
        }
        b bVar = this.f132471b;
        if (bVar == null || !bVar.isSkippable()) {
            return true;
        }
        this.f132471b.c(8);
        return true;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        sg.bigo.ads.ad.b.b bVar = this.f132471b.f132647z;
        if (bVar != null) {
            e.a((Activity) this, (sg.bigo.ads.ad.c) bVar);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        View decorView;
        super.onResume();
        try {
            Window window = getWindow();
            if (window != null && (decorView = window.getDecorView()) != null) {
                decorView.setSystemUiVisibility(4098);
            }
            sg.bigo.ads.controller.landing.c cVarY = this.f132471b.f132647z.y();
            if (cVarY == null || cVarY.f134379a != 4 || cVarY.f134381c) {
                return;
            }
            this.f132471b.f132647z.y().f134381c = true;
            e.a((Activity) this, (sg.bigo.ads.ad.c) this.f132471b.f132647z);
            sg.bigo.ads.core.landing.a.a(this, cVarY.f134380b, getPackageName());
        } catch (Throwable unused) {
            finish();
        }
    }
}
