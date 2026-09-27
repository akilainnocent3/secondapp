package dc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements vb.v<BitmapDrawable>, vb.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f78737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vb.v<Bitmap> f78738c;

    public g0(@NonNull Resources resources, @NonNull vb.v<Bitmap> vVar) {
        this.f78737b = (Resources) pc.m.e(resources);
        this.f78738c = (vb.v) pc.m.e(vVar);
    }

    @Deprecated
    public static g0 d(Context context, Bitmap bitmap) {
        return (g0) f(context.getResources(), h.d(bitmap, com.bumptech.glide.b.e(context).h()));
    }

    @Deprecated
    public static g0 e(Resources resources, wb.e eVar, Bitmap bitmap) {
        return (g0) f(resources, h.d(bitmap, eVar));
    }

    @Nullable
    public static vb.v<BitmapDrawable> f(@NonNull Resources resources, @Nullable vb.v<Bitmap> vVar) {
        if (vVar == null) {
            return null;
        }
        return new g0(resources, vVar);
    }

    @Override // vb.v
    public void a() {
        this.f78738c.a();
    }

    @Override // vb.v
    @NonNull
    public Class<BitmapDrawable> b() {
        return BitmapDrawable.class;
    }

    @Override // vb.v
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f78737b, this.f78738c.get());
    }

    @Override // vb.v
    public int getSize() {
        return this.f78738c.getSize();
    }

    @Override // vb.r
    public void initialize() {
        vb.v<Bitmap> vVar = this.f78738c;
        if (vVar instanceof vb.r) {
            ((vb.r) vVar).initialize();
        }
    }
}
