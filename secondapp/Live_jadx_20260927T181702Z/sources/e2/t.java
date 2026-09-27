package e2;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class t<F, S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f79831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f79832b;

    public t(F f10, S s10) {
        this.f79831a = f10;
        this.f79832b = s10;
    }

    @NonNull
    public static <A, B> t<A, B> a(A a10, B b10) {
        return new t<>(a10, b10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return s.a(tVar.f79831a, this.f79831a) && s.a(tVar.f79832b, this.f79832b);
    }

    public int hashCode() {
        F f10 = this.f79831a;
        int iHashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f79832b;
        return iHashCode ^ (s10 != null ? s10.hashCode() : 0);
    }

    @NonNull
    public String toString() {
        return "Pair{" + this.f79831a + " " + this.f79832b + "}";
    }
}
