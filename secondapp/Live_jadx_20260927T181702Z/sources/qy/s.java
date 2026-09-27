package qy;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class s extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f123221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f123222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient i0<?> f123223d;

    public s(i0<?> i0Var) {
        super(e(i0Var));
        this.f123221b = i0Var.b();
        this.f123222c = i0Var.h();
        this.f123223d = i0Var;
    }

    public static String e(i0<?> i0Var) {
        Objects.requireNonNull(i0Var, "response == null");
        return "HTTP " + i0Var.b() + " " + i0Var.h();
    }

    public int d() {
        return this.f123221b;
    }

    public String g() {
        return this.f123222c;
    }

    @zq.h
    public i0<?> h() {
        return this.f123223d;
    }
}
