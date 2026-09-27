package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class z20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f158567a;

    public z20(Context context) {
        this.f158567a = uz.a(context);
    }

    public final boolean a() {
        return (this.f158567a.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
