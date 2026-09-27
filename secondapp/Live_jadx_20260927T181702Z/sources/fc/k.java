package fc;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.o;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends o<k, Drawable> {
    @NonNull
    public static k n(@NonNull nc.g<Drawable> gVar) {
        return new k().g(gVar);
    }

    @NonNull
    public static k o() {
        return new k().j();
    }

    @NonNull
    public static k p(int i10) {
        return new k().k(i10);
    }

    @NonNull
    public static k q(@NonNull nc.c.a aVar) {
        return new k().l(aVar);
    }

    @NonNull
    public static k r(@NonNull nc.c cVar) {
        return new k().m(cVar);
    }

    @Override // com.bumptech.glide.o
    public boolean equals(Object obj) {
        return (obj instanceof k) && super.equals(obj);
    }

    @Override // com.bumptech.glide.o
    public int hashCode() {
        return super.hashCode();
    }

    @NonNull
    public k j() {
        return l(new nc.c.a());
    }

    @NonNull
    public k k(int i10) {
        return l(new nc.c.a(i10));
    }

    @NonNull
    public k l(@NonNull nc.c.a aVar) {
        return m(aVar.a());
    }

    @NonNull
    public k m(@NonNull nc.c cVar) {
        return g(cVar);
    }
}
