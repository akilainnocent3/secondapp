package hk;

import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f88417c = "userlog";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f88418d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f88419e = 65536;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lk.g f88420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f88421b;

    public f(lk.g gVar) {
        this.f88420a = gVar;
        this.f88421b = f88418d;
    }

    public void a() {
        this.f88421b.b();
    }

    public byte[] b() {
        return this.f88421b.a();
    }

    @Nullable
    public String c() {
        return this.f88421b.e();
    }

    public final File d(String str) {
        return this.f88420a.r(str, f88417c);
    }

    public final void e(String str) {
        this.f88421b.d();
        this.f88421b = f88418d;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    public void f(File file, int i10) {
        this.f88421b = new i(file, i10);
    }

    public void g(long j10, String str) {
        this.f88421b.c(j10, str);
    }

    public f(lk.g gVar, String str) {
        this(gVar);
        e(str);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements d {
        public b() {
        }

        @Override // hk.d
        public byte[] a() {
            return null;
        }

        @Override // hk.d
        public String e() {
            return null;
        }

        @Override // hk.d
        public void b() {
        }

        @Override // hk.d
        public void d() {
        }

        @Override // hk.d
        public void c(long j10, String str) {
        }
    }
}
