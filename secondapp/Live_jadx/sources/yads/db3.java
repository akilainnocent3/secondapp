package yads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class db3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cb3 f148141a;

    public db3() {
        this(new cb3());
    }

    public final boolean a(Context context, String str) {
        try {
            this.f148141a.getClass();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.putExtra("monetization_ads_activity_click", true);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public db3(cb3 cb3Var) {
        this.f148141a = cb3Var;
    }
}
