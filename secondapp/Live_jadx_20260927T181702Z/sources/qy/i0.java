package qy;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class i0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jw.n0 f123176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @zq.h
    public final T f123177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @zq.h
    public final jw.o0 f123178c;

    public i0(jw.n0 n0Var, @zq.h T t10, @zq.h jw.o0 o0Var) {
        this.f123176a = n0Var;
        this.f123177b = t10;
        this.f123178c = o0Var;
    }

    public static <T> i0<T> c(int i10, jw.o0 o0Var) {
        Objects.requireNonNull(o0Var, "body == null");
        if (i10 >= 400) {
            return d(o0Var, new jw.n0.a().b(new w.c(o0Var.contentType(), o0Var.contentLength())).f(i10).y("Response.error()").B(jw.k0.HTTP_1_1).E(new jw.l0.a().I("http://localhost/").b()).c());
        }
        throw new IllegalArgumentException("code < 400: " + i10);
    }

    public static <T> i0<T> d(jw.o0 o0Var, jw.n0 n0Var) {
        Objects.requireNonNull(o0Var, "body == null");
        Objects.requireNonNull(n0Var, "rawResponse == null");
        if (n0Var.isSuccessful()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new i0<>(n0Var, null, o0Var);
    }

    public static <T> i0<T> j(int i10, @zq.h T t10) {
        if (i10 >= 200 && i10 < 300) {
            return m(t10, new jw.n0.a().f(i10).y("Response.success()").B(jw.k0.HTTP_1_1).E(new jw.l0.a().I("http://localhost/").b()).c());
        }
        throw new IllegalArgumentException("code < 200 or >= 300: " + i10);
    }

    public static <T> i0<T> k(@zq.h T t10) {
        return m(t10, new jw.n0.a().f(200).y("OK").B(jw.k0.HTTP_1_1).E(new jw.l0.a().I("http://localhost/").b()).c());
    }

    public static <T> i0<T> l(@zq.h T t10, jw.a0 a0Var) {
        Objects.requireNonNull(a0Var, "headers == null");
        return m(t10, new jw.n0.a().f(200).y("OK").B(jw.k0.HTTP_1_1).w(a0Var).E(new jw.l0.a().I("http://localhost/").b()).c());
    }

    public static <T> i0<T> m(@zq.h T t10, jw.n0 n0Var) {
        Objects.requireNonNull(n0Var, "rawResponse == null");
        if (n0Var.isSuccessful()) {
            return new i0<>(n0Var, t10, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    @zq.h
    public T a() {
        return this.f123177b;
    }

    public int b() {
        return this.f123176a.L();
    }

    @zq.h
    public jw.o0 e() {
        return this.f123178c;
    }

    public jw.a0 f() {
        return this.f123176a.e0();
    }

    public boolean g() {
        return this.f123176a.isSuccessful();
    }

    public String h() {
        return this.f123176a.g0();
    }

    public jw.n0 i() {
        return this.f123176a;
    }

    public String toString() {
        return this.f123176a.toString();
    }
}
