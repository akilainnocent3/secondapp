package tb;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0.a<h<?>, Object> f136438c = new pc.b();

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void g(@NonNull h<T> hVar, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        hVar.h(obj, messageDigest);
    }

    @Override // tb.f
    public void a(@NonNull MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f136438c.size(); i10++) {
            g(this.f136438c.g(i10), this.f136438c.l(i10), messageDigest);
        }
    }

    @Nullable
    public <T> T c(@NonNull h<T> hVar) {
        return this.f136438c.containsKey(hVar) ? (T) this.f136438c.get(hVar) : hVar.d();
    }

    public void d(@NonNull i iVar) {
        this.f136438c.h(iVar.f136438c);
    }

    public i e(@NonNull h<?> hVar) {
        this.f136438c.remove(hVar);
        return this;
    }

    @Override // tb.f
    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f136438c.equals(((i) obj).f136438c);
        }
        return false;
    }

    @NonNull
    public <T> i f(@NonNull h<T> hVar, @NonNull T t10) {
        this.f136438c.put(hVar, t10);
        return this;
    }

    @Override // tb.f
    public int hashCode() {
        return this.f136438c.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f136438c + fw.b.f85383j;
    }
}
