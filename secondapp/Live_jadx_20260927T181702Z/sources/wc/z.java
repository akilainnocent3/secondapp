package wc;

import android.location.Location;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;
import k.a1;
import k.e0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.l
    public static final a f142814h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f142815i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f142816j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f142817k = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f142818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f142819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f142820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Location f142821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f142822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Set f142823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f142824g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @er.e(er.a.BINARY)
    @er.c
    @Documented
    @Retention(RetentionPolicy.CLASS)
    public @interface b {
    }

    public final int a() {
        return this.f142820c;
    }

    @oy.m
    public final String b() {
        return this.f142824g;
    }

    @b
    public final int c() {
        return this.f142819b;
    }

    @oy.m
    public final Set<String> d() {
        return this.f142823f;
    }

    @oy.m
    public final Location e() {
        return this.f142821d;
    }

    public final boolean f() {
        return this.f142822e;
    }

    @oy.m
    public final String g() {
        return this.f142818a;
    }

    public final void h(@e0(from = 0, to = 99) int i10) {
        this.f142820c = i10;
    }

    public final void i(@a1(max = 512) @oy.m String str) {
        this.f142824g = str;
    }

    public final void j(@b int i10) {
        this.f142819b = i10;
    }

    public final void k(@oy.m Set<String> set) {
        this.f142823f = set;
    }

    public final void l(@oy.m Location location) {
        this.f142821d = location;
    }

    public final void m(boolean z10) {
        this.f142822e = z10;
    }

    public final void n(@oy.m String str) {
        this.f142818a = str;
    }
}
