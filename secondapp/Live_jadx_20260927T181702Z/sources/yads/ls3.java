package yads;

import android.content.Context;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.instream.newapi.InstreamAdLoadListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ls3 implements r00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstreamAdLoadListener f152110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f152111b;

    public ls3(Context context, InstreamAdLoadListener instreamAdLoadListener) {
        this.f152110a = instreamAdLoadListener;
        this.f152111b = uz.a(context);
    }

    @Override // yads.r00
    public final void a(m00 m00Var) {
        new CallbackStackTraceMarker(new js3(this, new pr3(this.f152111b, m00Var)));
    }

    @Override // yads.r00
    public final void onInstreamAdFailedToLoad(String str) {
        new CallbackStackTraceMarker(new hs3(str, this));
    }
}
