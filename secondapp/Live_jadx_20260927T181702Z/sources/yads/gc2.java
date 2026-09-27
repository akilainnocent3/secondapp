package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f149524a;

    public gc2(Context context) {
        this.f149524a = context.getApplicationContext();
    }

    public final boolean a(String str) {
        try {
            return this.f149524a.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }
}
