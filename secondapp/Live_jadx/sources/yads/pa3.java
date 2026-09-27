package yads;

import android.graphics.Bitmap;
import android.util.LruCache;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pa3 implements u82 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LruCache f153843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k31 f153844b;

    public pa3(v82 v82Var, k31 k31Var) {
        this.f153843a = v82Var;
        this.f153844b = k31Var;
    }

    public final Bitmap a(String str) {
        this.f153844b.getClass();
        return (Bitmap) this.f153843a.get(k31.a(str, ImageView.ScaleType.CENTER_INSIDE));
    }

    public final void a(String str, Bitmap bitmap) {
        this.f153844b.getClass();
        this.f153843a.put(k31.a(str, ImageView.ScaleType.CENTER_INSIDE), bitmap);
    }
}
