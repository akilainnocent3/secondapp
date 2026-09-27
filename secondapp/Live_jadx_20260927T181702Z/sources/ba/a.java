package ba;

import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set<a> f20899c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20901b;

    /* JADX INFO: renamed from: ba.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0191a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Set<String> f20902a = new HashSet(Arrays.asList(h2.d().a()));
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends a {
        public b(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // ba.a
        public final boolean c() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c extends a {
        public c(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // ba.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 24;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d extends a {
        public d(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // ba.a
        public final boolean c() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e extends a {
        public e(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // ba.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class f extends a {
        public f(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // ba.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class g extends a {
        public g(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // ba.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class h extends a {
        public h(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // ba.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class i extends a {
        public i(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // ba.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    public a(@NonNull String str, @NonNull String str2) {
        this.f20900a = str;
        this.f20901b = str2;
        f20899c.add(this);
    }

    @NonNull
    @k.h1
    public static Set<String> b() {
        return C0191a.f20902a;
    }

    @NonNull
    public static Set<a> e() {
        return Collections.unmodifiableSet(f20899c);
    }

    @Override // ba.e1
    @NonNull
    public String a() {
        return this.f20900a;
    }

    public abstract boolean c();

    public boolean d() {
        return my.a.b(C0191a.f20902a, this.f20901b);
    }

    @Override // ba.e1
    public boolean isSupported() {
        return c() || d();
    }
}
