package dc;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends com.bumptech.glide.o<j, Bitmap> {
    @NonNull
    public static j o(@NonNull nc.g<Bitmap> gVar) {
        return new j().g(gVar);
    }

    @NonNull
    public static j p() {
        return new j().j();
    }

    @NonNull
    public static j q(int i10) {
        return new j().k(i10);
    }

    @NonNull
    public static j r(@NonNull nc.c.a aVar) {
        return new j().l(aVar);
    }

    @NonNull
    public static j s(@NonNull nc.c cVar) {
        return new j().m(cVar);
    }

    @NonNull
    public static j t(@NonNull nc.g<Drawable> gVar) {
        return new j().n(gVar);
    }

    @Override // com.bumptech.glide.o
    public boolean equals(Object obj) {
        return (obj instanceof j) && super.equals(obj);
    }

    @Override // com.bumptech.glide.o
    public int hashCode() {
        return super.hashCode();
    }

    @NonNull
    public j j() {
        return l(new nc.c.a());
    }

    @NonNull
    public j k(int i10) {
        return l(new nc.c.a(i10));
    }

    @NonNull
    public j l(@NonNull nc.c.a aVar) {
        return n(aVar.a());
    }

    @NonNull
    public j m(@NonNull nc.c cVar) {
        return n(cVar);
    }

    @NonNull
    public j n(@NonNull nc.g<Drawable> gVar) {
        return g(new nc.b(gVar));
    }
}
