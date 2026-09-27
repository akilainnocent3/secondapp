package dc;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class h implements vb.v<Bitmap>, vb.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f78739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wb.e f78740c;

    public h(@NonNull Bitmap bitmap, @NonNull wb.e eVar) {
        this.f78739b = (Bitmap) pc.m.f(bitmap, "Bitmap must not be null");
        this.f78740c = (wb.e) pc.m.f(eVar, "BitmapPool must not be null");
    }

    @Nullable
    public static h d(@Nullable Bitmap bitmap, @NonNull wb.e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new h(bitmap, eVar);
    }

    @Override // vb.v
    public void a() {
        this.f78740c.d(this.f78739b);
    }

    @Override // vb.v
    @NonNull
    public Class<Bitmap> b() {
        return Bitmap.class;
    }

    @Override // vb.v
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f78739b;
    }

    @Override // vb.v
    public int getSize() {
        return pc.o.i(this.f78739b);
    }

    @Override // vb.r
    public void initialize() {
        this.f78739b.prepareToDraw();
    }
}
