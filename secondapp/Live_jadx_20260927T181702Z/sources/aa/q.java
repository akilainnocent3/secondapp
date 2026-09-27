package aa;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f4546j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b> f4547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f4552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4555i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f4556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f4557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f4558c;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f4559a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f4560b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public String f4561c;

            public a() {
            }

            @NonNull
            public b a() {
                String str;
                String str2;
                String str3 = this.f4559a;
                if (str3 == null || str3.trim().isEmpty() || (str = this.f4560b) == null || str.trim().isEmpty() || (str2 = this.f4561c) == null || str2.trim().isEmpty()) {
                    throw new IllegalStateException("Brand name, major version and full version should not be null or blank.");
                }
                return new b(this.f4559a, this.f4560b, this.f4561c);
            }

            @NonNull
            public a b(@NonNull String str) {
                if (str.trim().isEmpty()) {
                    throw new IllegalArgumentException("Brand should not be blank.");
                }
                this.f4559a = str;
                return this;
            }

            @NonNull
            public a c(@NonNull String str) {
                if (str.trim().isEmpty()) {
                    throw new IllegalArgumentException("FullVersion should not be blank.");
                }
                this.f4561c = str;
                return this;
            }

            @NonNull
            public a d(@NonNull String str) {
                if (str.trim().isEmpty()) {
                    throw new IllegalArgumentException("MajorVersion should not be blank.");
                }
                this.f4560b = str;
                return this;
            }

            public a(@NonNull b bVar) {
                this.f4559a = bVar.a();
                this.f4560b = bVar.c();
                this.f4561c = bVar.b();
            }
        }

        @NonNull
        public String a() {
            return this.f4556a;
        }

        @NonNull
        public String b() {
            return this.f4558c;
        }

        @NonNull
        public String c() {
            return this.f4557b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Objects.equals(this.f4556a, bVar.f4556a) && Objects.equals(this.f4557b, bVar.f4557b) && Objects.equals(this.f4558c, bVar.f4558c);
        }

        public int hashCode() {
            return Objects.hash(this.f4556a, this.f4557b, this.f4558c);
        }

        @NonNull
        public String toString() {
            return this.f4556a + "," + this.f4557b + "," + this.f4558c;
        }

        @y0({y0.a.LIBRARY})
        public b(@NonNull String str, @NonNull String str2, @NonNull String str3) {
            this.f4556a = str;
            this.f4557b = str2;
            this.f4558c = str3;
        }
    }

    @Nullable
    public String a() {
        return this.f4551e;
    }

    public int b() {
        return this.f4554h;
    }

    @NonNull
    public List<b> c() {
        return this.f4547a;
    }

    @Nullable
    public String d() {
        return this.f4548b;
    }

    @Nullable
    public String e() {
        return this.f4552f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f4553g == qVar.f4553g && this.f4554h == qVar.f4554h && this.f4555i == qVar.f4555i && Objects.equals(this.f4547a, qVar.f4547a) && Objects.equals(this.f4548b, qVar.f4548b) && Objects.equals(this.f4549c, qVar.f4549c) && Objects.equals(this.f4550d, qVar.f4550d) && Objects.equals(this.f4551e, qVar.f4551e) && Objects.equals(this.f4552f, qVar.f4552f);
    }

    @Nullable
    public String f() {
        return this.f4549c;
    }

    @Nullable
    public String g() {
        return this.f4550d;
    }

    public boolean h() {
        return this.f4553g;
    }

    public int hashCode() {
        return Objects.hash(this.f4547a, this.f4548b, this.f4549c, this.f4550d, this.f4551e, this.f4552f, Boolean.valueOf(this.f4553g), Integer.valueOf(this.f4554h), Boolean.valueOf(this.f4555i));
    }

    public boolean i() {
        return this.f4555i;
    }

    @y0({y0.a.LIBRARY})
    public q(@NonNull List<b> list, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z10, int i10, boolean z11) {
        this.f4547a = list;
        this.f4548b = str;
        this.f4549c = str2;
        this.f4550d = str3;
        this.f4551e = str4;
        this.f4552f = str5;
        this.f4553g = z10;
        this.f4554h = i10;
        this.f4555i = z11;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<b> f4562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f4563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f4564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f4565d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f4566e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f4567f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f4568g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f4569h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f4570i;

        public c() {
            this.f4562a = new ArrayList();
            this.f4568g = true;
            this.f4569h = 0;
            this.f4570i = false;
        }

        @NonNull
        public q a() {
            return new q(this.f4562a, this.f4563b, this.f4564c, this.f4565d, this.f4566e, this.f4567f, this.f4568g, this.f4569h, this.f4570i);
        }

        @NonNull
        public c b(@Nullable String str) {
            this.f4566e = str;
            return this;
        }

        @NonNull
        public c c(int i10) {
            this.f4569h = i10;
            return this;
        }

        @NonNull
        public c d(@NonNull List<b> list) {
            this.f4562a = list;
            return this;
        }

        @NonNull
        public c e(@Nullable String str) {
            if (str == null) {
                this.f4563b = null;
                return this;
            }
            if (str.trim().isEmpty()) {
                throw new IllegalArgumentException("Full version should not be blank.");
            }
            this.f4563b = str;
            return this;
        }

        @NonNull
        public c f(boolean z10) {
            this.f4568g = z10;
            return this;
        }

        @NonNull
        public c g(@Nullable String str) {
            this.f4567f = str;
            return this;
        }

        @NonNull
        public c h(@Nullable String str) {
            if (str == null) {
                this.f4564c = null;
                return this;
            }
            if (str.trim().isEmpty()) {
                throw new IllegalArgumentException("Platform should not be blank.");
            }
            this.f4564c = str;
            return this;
        }

        @NonNull
        public c i(@Nullable String str) {
            this.f4565d = str;
            return this;
        }

        @NonNull
        public c j(boolean z10) {
            this.f4570i = z10;
            return this;
        }

        public c(@NonNull q qVar) {
            this.f4562a = new ArrayList();
            this.f4568g = true;
            this.f4569h = 0;
            this.f4570i = false;
            this.f4562a = qVar.c();
            this.f4563b = qVar.d();
            this.f4564c = qVar.f();
            this.f4565d = qVar.g();
            this.f4566e = qVar.a();
            this.f4567f = qVar.e();
            this.f4568g = qVar.h();
            this.f4569h = qVar.b();
            this.f4570i = qVar.i();
        }
    }
}
