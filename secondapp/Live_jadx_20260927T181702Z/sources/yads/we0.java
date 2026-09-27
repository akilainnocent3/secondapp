package yads;

import android.content.Context;
import com.yandex.mobile.ads.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class we0 implements mb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f157336a;

    public we0(Context context) {
        this.f157336a = context;
    }

    @Override // yads.mb0
    public final oi a() {
        return new oi("sponsored", "string", this.f157336a.getResources().getText(R.string.monetization_ads_internal_instream_sponsored_default), null, false, true);
    }
}
