package ae;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class f<T> {
    public static <T> f<T> A(T t10, @Nullable g gVar) {
        return new a(null, t10, h.HIGHEST, null, gVar);
    }

    public static <T> f<T> B(T t10, @Nullable i iVar) {
        return new a(null, t10, h.HIGHEST, iVar, null);
    }

    public static <T> f<T> C(T t10, @Nullable i iVar, @Nullable g gVar) {
        return new a(null, t10, h.HIGHEST, iVar, gVar);
    }

    public static <T> f<T> f(int i10, T t10) {
        return new a(Integer.valueOf(i10), t10, h.DEFAULT, null, null);
    }

    public static <T> f<T> g(int i10, T t10, @Nullable g gVar) {
        return new a(Integer.valueOf(i10), t10, h.DEFAULT, null, gVar);
    }

    public static <T> f<T> h(int i10, T t10, @Nullable i iVar) {
        return new a(Integer.valueOf(i10), t10, h.DEFAULT, iVar, null);
    }

    public static <T> f<T> i(int i10, T t10, @Nullable i iVar, @Nullable g gVar) {
        return new a(Integer.valueOf(i10), t10, h.DEFAULT, iVar, gVar);
    }

    public static <T> f<T> j(T t10) {
        return new a(null, t10, h.DEFAULT, null, null);
    }

    public static <T> f<T> k(T t10, @Nullable g gVar) {
        return new a(null, t10, h.DEFAULT, null, gVar);
    }

    public static <T> f<T> l(T t10, @Nullable i iVar) {
        return new a(null, t10, h.DEFAULT, iVar, null);
    }

    public static <T> f<T> m(T t10, @Nullable i iVar, @Nullable g gVar) {
        return new a(null, t10, h.DEFAULT, iVar, gVar);
    }

    public static <T> f<T> n(int i10, T t10) {
        return new a(Integer.valueOf(i10), t10, h.VERY_LOW, null, null);
    }

    public static <T> f<T> o(int i10, T t10, @Nullable g gVar) {
        return new a(Integer.valueOf(i10), t10, h.VERY_LOW, null, gVar);
    }

    public static <T> f<T> p(int i10, T t10, @Nullable i iVar) {
        return new a(Integer.valueOf(i10), t10, h.VERY_LOW, iVar, null);
    }

    public static <T> f<T> q(int i10, T t10, @Nullable i iVar, @Nullable g gVar) {
        return new a(Integer.valueOf(i10), t10, h.VERY_LOW, iVar, gVar);
    }

    public static <T> f<T> r(T t10) {
        return new a(null, t10, h.VERY_LOW, null, null);
    }

    public static <T> f<T> s(T t10, @Nullable g gVar) {
        return new a(null, t10, h.VERY_LOW, null, gVar);
    }

    public static <T> f<T> t(T t10, @Nullable i iVar) {
        return new a(null, t10, h.VERY_LOW, iVar, null);
    }

    public static <T> f<T> u(T t10, @Nullable i iVar, @Nullable g gVar) {
        return new a(null, t10, h.VERY_LOW, iVar, gVar);
    }

    public static <T> f<T> v(int i10, T t10) {
        return new a(Integer.valueOf(i10), t10, h.HIGHEST, null, null);
    }

    public static <T> f<T> w(int i10, T t10, @Nullable g gVar) {
        return new a(Integer.valueOf(i10), t10, h.HIGHEST, null, gVar);
    }

    public static <T> f<T> x(int i10, T t10, @Nullable i iVar) {
        return new a(Integer.valueOf(i10), t10, h.HIGHEST, iVar, null);
    }

    public static <T> f<T> y(int i10, T t10, @Nullable i iVar, @Nullable g gVar) {
        return new a(Integer.valueOf(i10), t10, h.HIGHEST, iVar, gVar);
    }

    public static <T> f<T> z(T t10) {
        return new a(null, t10, h.HIGHEST, null, null);
    }

    @Nullable
    public abstract Integer a();

    @Nullable
    public abstract g b();

    public abstract T c();

    public abstract h d();

    @Nullable
    public abstract i e();
}
