package zj;

import androidx.annotation.NonNull;
import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<? extends Annotation> f161952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<T> f161953b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public @interface a {
    }

    public k0(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f161952a = cls;
        this.f161953b = cls2;
    }

    @NonNull
    public static <T> k0<T> a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new k0<>(cls, cls2);
    }

    @NonNull
    public static <T> k0<T> b(Class<T> cls) {
        return new k0<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (this.f161953b.equals(k0Var.f161953b)) {
            return this.f161952a.equals(k0Var.f161952a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f161953b.hashCode() * 31) + this.f161952a.hashCode();
    }

    public String toString() {
        if (this.f161952a == a.class) {
            return this.f161953b.getName();
        }
        return to.c.phraseDel + this.f161952a.getName() + " " + this.f161953b.getName();
    }
}
