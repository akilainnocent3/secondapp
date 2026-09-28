package defpackage;

import com.sporty.android.core.model.ads.Ads;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.android.home.SplashActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cdb0 extends fte<Ads> {
    public final /* synthetic */ SplashActivity a;
    public final /* synthetic */ SplashActivity b;

    public cdb0(SplashActivity splashActivity, SplashActivity splashActivity2) {
        this.a = splashActivity;
        this.b = splashActivity2;
    }

    @Override // defpackage.zu90
    public final void onError(Throwable th) {
        th.getClass();
        itf0.a.f(th, "Something is wrong with get Ads", new Object[0]);
    }

    @Override // defpackage.zu90
    public final void onSuccess(Object obj) {
        Ads ads = (Ads) obj;
        ads.getClass();
        SplashActivity splashActivity = this.a;
        gbn gbnVar = splashActivity.C;
        if (gbnVar == null) {
            Intrinsics.n("imageService");
            throw null;
        }
        gbnVar.f(ads.getImgUrl(), null);
        JsonSerializeService jsonSerializeService = splashActivity.D;
        if (jsonSerializeService == null) {
            Intrinsics.n("jsonSerializer");
            throw null;
        }
        this.b.getSharedPreferences("sportybet", 0).edit().putString("splash_ad", jsonSerializeService.toJson(ads)).commit();
    }
}
