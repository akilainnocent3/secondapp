package yads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.common.AdActivity;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ju3 f154554a;

    public qq(ju3 ju3Var) {
        this.f154554a = ju3Var;
    }

    public final Intent a(Context context, String str, long j10) {
        this.f154554a.getClass();
        Intent intent = new Intent(context, (Class<?>) AdActivity.class);
        intent.putExtra("window_type", "window_type_browser");
        intent.putExtra("extra_browser_url", str);
        if (!(context instanceof Activity)) {
            intent.addFlags(402653184);
        }
        intent.putExtra("data_identifier", j10);
        return intent;
    }
}
