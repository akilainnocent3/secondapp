package yads;

import android.graphics.Bitmap;
import android.util.LruCache;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class t82 implements h41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LruCache f155765a;

    public t82(v82 v82Var) {
        this.f155765a = v82Var;
    }

    public final Bitmap a(String str) {
        return (Bitmap) this.f155765a.get(str);
    }

    public final void a(String str, Bitmap bitmap) {
        this.f155765a.put(str, bitmap);
    }
}
