package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.sportybet.android.user.kyc.banner.KYCBanner;

/* JADX INFO: loaded from: classes5.dex */
public final class fsp implements g6i0 {
    public final KYCBanner a;
    public final FrameLayout b;
    public final ViewPager2 c;

    public fsp(KYCBanner kYCBanner, FrameLayout frameLayout, ViewPager2 viewPager2) {
        this.a = kYCBanner;
        this.b = frameLayout;
        this.c = viewPager2;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
