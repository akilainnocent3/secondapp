package f5;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public interface x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f83214a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f83215b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f83216c = 0;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends Exception {
        public b(String str) {
            super((String) zi.l0.E(str));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.common.a f83217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u4.i f83218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final AudioDeviceInfo f83219c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f83220d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f83221e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f83222f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f83223g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f83224h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f83225i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f83226j;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final androidx.media3.common.a f83227a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public u4.i f83228b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @Nullable
            public AudioDeviceInfo f83229c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f83230d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f83231e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f83232f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public int f83233g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public int f83234h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public boolean f83235i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f83236j;

            public c k() {
                return new c(this);
            }

            @qj.a
            public a l(u4.i iVar) {
                this.f83228b = iVar;
                return this;
            }

            @qj.a
            public a m(int i10) {
                this.f83233g = i10;
                return this;
            }

            @qj.a
            public a n(boolean z10) {
                this.f83230d = z10;
                return this;
            }

            @qj.a
            public a o(boolean z10) {
                this.f83232f = z10;
                return this;
            }

            @qj.a
            public a p(boolean z10) {
                this.f83231e = z10;
                return this;
            }

            @qj.a
            public a q(boolean z10) {
                this.f83235i = z10;
                return this;
            }

            @qj.a
            public a r(int i10) {
                this.f83236j = i10;
                return this;
            }

            @qj.a
            public a s(@Nullable AudioDeviceInfo audioDeviceInfo) {
                this.f83229c = audioDeviceInfo;
                return this;
            }

            @qj.a
            public a t(int i10) {
                this.f83234h = i10;
                return this;
            }

            public a(androidx.media3.common.a aVar) {
                this.f83227a = aVar;
                this.f83228b = u4.i.f138445i;
                this.f83233g = 0;
                this.f83234h = -1;
                this.f83236j = -1;
            }

            public a(c cVar) {
                this.f83227a = cVar.f83217a;
                this.f83228b = cVar.f83218b;
                this.f83229c = cVar.f83219c;
                this.f83230d = cVar.f83220d;
                this.f83231e = cVar.f83221e;
                this.f83232f = cVar.f83222f;
                this.f83233g = cVar.f83223g;
                this.f83234h = cVar.f83224h;
                this.f83235i = cVar.f83225i;
                this.f83236j = cVar.f83226j;
            }
        }

        public a a() {
            return new a();
        }

        public c(a aVar) {
            this.f83217a = aVar.f83227a;
            this.f83218b = aVar.f83228b;
            this.f83219c = aVar.f83229c;
            this.f83220d = aVar.f83230d;
            this.f83221e = aVar.f83231e;
            this.f83222f = aVar.f83232f;
            this.f83223g = aVar.f83233g;
            this.f83224h = aVar.f83234h;
            this.f83225i = aVar.f83235i;
            this.f83226j = aVar.f83236j;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f83237e = new a().e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f83238a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f83239b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f83240c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f83241d;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public boolean f83242a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f83243b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f83244c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f83245d;

            public d e() {
                if (this.f83242a || !(this.f83243b || this.f83244c)) {
                    return new d(this);
                }
                throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
            }

            @qj.a
            public a f(int i10) {
                this.f83245d = i10;
                return this;
            }

            @qj.a
            public a g(boolean z10) {
                this.f83242a = z10;
                return this;
            }

            @qj.a
            public a h(boolean z10) {
                this.f83243b = z10;
                return this;
            }

            @qj.a
            public a i(boolean z10) {
                this.f83244c = z10;
                return this;
            }

            public a() {
                this.f83245d = 0;
            }

            public a(d dVar) {
                this.f83242a = dVar.f83238a;
                this.f83243b = dVar.f83239b;
                this.f83244c = dVar.f83240c;
                this.f83245d = dVar.f83241d;
            }
        }

        public a a() {
            return new a();
        }

        public d(a aVar) {
            this.f83238a = aVar.f83242a;
            this.f83239b = aVar.f83243b;
            this.f83240c = aVar.f83244c;
            this.f83241d = aVar.f83245d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e extends Exception {
        public e() {
        }

        public e(Throwable th2) {
            super(th2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface f {
        void a();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f83246a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f83247b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f83248c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f83249d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f83250e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f83251f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final u4.i f83252g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f83253h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f83254i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f83255j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f83256k;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f83257a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f83258b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f83259c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f83260d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f83261e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public int f83262f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public u4.i f83263g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public int f83264h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public int f83265i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public boolean f83266j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public boolean f83267k;

            public g l() {
                return new g(this);
            }

            @qj.a
            public a m(u4.i iVar) {
                this.f83263g = iVar;
                return this;
            }

            @qj.a
            public a n(int i10) {
                this.f83264h = i10;
                return this;
            }

            @qj.a
            public a o(int i10) {
                this.f83262f = i10;
                return this;
            }

            @qj.a
            public a p(int i10) {
                this.f83259c = i10;
                return this;
            }

            @qj.a
            public a q(int i10) {
                this.f83257a = i10;
                return this;
            }

            @qj.a
            public a r(boolean z10) {
                this.f83261e = z10;
                return this;
            }

            @qj.a
            public a s(boolean z10) {
                this.f83260d = z10;
                return this;
            }

            @qj.a
            public a t(int i10) {
                this.f83258b = i10;
                return this;
            }

            @qj.a
            public a u(boolean z10) {
                this.f83267k = z10;
                return this;
            }

            @qj.a
            public a v(boolean z10) {
                this.f83266j = z10;
                return this;
            }

            @qj.a
            public a w(int i10) {
                this.f83265i = i10;
                return this;
            }

            public a() {
                this.f83263g = u4.i.f138445i;
                this.f83264h = 0;
                this.f83265i = -1;
            }

            public a(g gVar) {
                this.f83257a = gVar.f83246a;
                this.f83258b = gVar.f83247b;
                this.f83259c = gVar.f83248c;
                this.f83260d = gVar.f83249d;
                this.f83261e = gVar.f83250e;
                this.f83262f = gVar.f83251f;
                this.f83263g = gVar.f83252g;
                this.f83264h = gVar.f83253h;
                this.f83265i = gVar.f83254i;
                this.f83266j = gVar.f83255j;
                this.f83267k = gVar.f83256k;
            }
        }

        public a a() {
            return new a();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && g.class == obj.getClass()) {
                g gVar = (g) obj;
                if (this.f83246a == gVar.f83246a && this.f83247b == gVar.f83247b && this.f83248c == gVar.f83248c && this.f83249d == gVar.f83249d && this.f83250e == gVar.f83250e && this.f83251f == gVar.f83251f && this.f83253h == gVar.f83253h && this.f83254i == gVar.f83254i && this.f83255j == gVar.f83255j && this.f83256k == gVar.f83256k && this.f83252g.equals(gVar.f83252g)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f83246a), Integer.valueOf(this.f83247b), Integer.valueOf(this.f83248c), Boolean.valueOf(this.f83249d), Boolean.valueOf(this.f83250e), Integer.valueOf(this.f83251f), this.f83252g, Integer.valueOf(this.f83253h), Integer.valueOf(this.f83254i), Boolean.valueOf(this.f83256k), Boolean.valueOf(this.f83255j));
        }

        public g(a aVar) {
            this.f83246a = aVar.f83257a;
            this.f83247b = aVar.f83258b;
            this.f83248c = aVar.f83259c;
            this.f83249d = aVar.f83260d;
            this.f83250e = aVar.f83261e;
            this.f83251f = aVar.f83262f;
            this.f83252g = aVar.f83263g;
            this.f83253h = aVar.f83264h;
            this.f83254i = aVar.f83265i;
            this.f83255j = aVar.f83266j;
            this.f83256k = aVar.f83267k;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface h {
    }

    @x4.m1
    void k(x4.l lVar);

    v l(g gVar) throws e;

    void m(f fVar);

    g n(c cVar) throws b;

    void o(f fVar);

    d p(c cVar);

    void release();
}
