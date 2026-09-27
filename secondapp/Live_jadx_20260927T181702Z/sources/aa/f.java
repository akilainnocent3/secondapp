package aa;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f4512d = "http";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f4513e = "https";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f4514f = "*";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f4515g = "direct://";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f4516h = "<local>";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f4517i = "<-loopback>";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b> f4518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f4519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4520c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY})
    public @interface c {
    }

    @y0({y0.a.LIBRARY})
    public f(@NonNull List<b> list, @NonNull List<String> list2, boolean z10) {
        this.f4518a = list;
        this.f4519b = list2;
        this.f4520c = z10;
    }

    @NonNull
    public List<String> a() {
        return Collections.unmodifiableList(this.f4519b);
    }

    @NonNull
    public List<b> b() {
        return Collections.unmodifiableList(this.f4518a);
    }

    public boolean c() {
        return this.f4520c;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4524a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f4525b;

        @y0({y0.a.LIBRARY})
        public b(@NonNull String str, @NonNull String str2) {
            this.f4524a = str;
            this.f4525b = str2;
        }

        @NonNull
        public String a() {
            return this.f4524a;
        }

        @NonNull
        public String b() {
            return this.f4525b;
        }

        @y0({y0.a.LIBRARY})
        public b(@NonNull String str) {
            this("*", str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<b> f4521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<String> f4522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f4523c;

        public a() {
            this.f4523c = false;
            this.f4521a = new ArrayList();
            this.f4522b = new ArrayList();
        }

        @NonNull
        public a a(@NonNull String str) {
            this.f4522b.add(str);
            return this;
        }

        @NonNull
        public a b() {
            return c("*");
        }

        @NonNull
        public a c(@NonNull String str) {
            this.f4521a.add(new b(str, f.f4515g));
            return this;
        }

        @NonNull
        public a d(@NonNull String str) {
            this.f4521a.add(new b(str));
            return this;
        }

        @NonNull
        public a e(@NonNull String str, @NonNull String str2) {
            this.f4521a.add(new b(str2, str));
            return this;
        }

        @NonNull
        public f f() {
            return new f(i(), g(), k());
        }

        @NonNull
        public final List<String> g() {
            return this.f4522b;
        }

        @NonNull
        public a h() {
            return a(f.f4516h);
        }

        @NonNull
        public final List<b> i() {
            return this.f4521a;
        }

        @NonNull
        public a j() {
            return a(f.f4517i);
        }

        public final boolean k() {
            return this.f4523c;
        }

        @NonNull
        public a l(boolean z10) {
            this.f4523c = z10;
            return this;
        }

        public a(@NonNull f fVar) {
            this.f4523c = false;
            this.f4521a = fVar.b();
            this.f4522b = fVar.a();
            this.f4523c = fVar.c();
        }
    }
}
