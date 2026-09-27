package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ua2 implements ag0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f156339a;

    public ua2(int i10) {
        this.f156339a = i10;
    }

    @Override // yads.ag0
    public final boolean a(Context context) {
        return this.f156339a == context.getResources().getConfiguration().orientation;
    }
}
