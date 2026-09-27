package dc;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class o0 implements tb.k<Bitmap, Bitmap> {
    @Override // tb.k
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public vb.v<Bitmap> b(@NonNull Bitmap bitmap, int i10, int i11, @NonNull tb.i iVar) {
        return new a(bitmap);
    }

    @Override // tb.k
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@NonNull Bitmap bitmap, @NonNull tb.i iVar) {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements vb.v<Bitmap> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bitmap f78781b;

        public a(@NonNull Bitmap bitmap) {
            this.f78781b = bitmap;
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
            return this.f78781b;
        }

        @Override // vb.v
        public int getSize() {
            return pc.o.i(this.f78781b);
        }

        @Override // vb.v
        public void a() {
        }
    }
}
