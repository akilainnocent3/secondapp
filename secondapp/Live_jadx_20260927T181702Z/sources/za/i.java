package za;

import androidx.annotation.Nullable;
import e2.t;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY})
public class i<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public T f160943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public T f160944b;

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public void b(T t10, T t11) {
        this.f160943a = t10;
        this.f160944b = t11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return a(tVar.f79831a, this.f160943a) && a(tVar.f79832b, this.f160944b);
    }

    public int hashCode() {
        T t10 = this.f160943a;
        int iHashCode = t10 == null ? 0 : t10.hashCode();
        T t11 = this.f160944b;
        return iHashCode ^ (t11 != null ? t11.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f160943a + " " + this.f160944b + "}";
    }
}
