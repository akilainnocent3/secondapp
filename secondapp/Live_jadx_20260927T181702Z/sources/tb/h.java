package tb;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class h<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b<Object> f136433e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f136434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b<T> f136435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f136436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile byte[] f136437d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b<T> {
        void a(@NonNull byte[] bArr, @NonNull T t10, @NonNull MessageDigest messageDigest);
    }

    public h(@NonNull String str, @Nullable T t10, @NonNull b<T> bVar) {
        this.f136436c = pc.m.c(str);
        this.f136434a = t10;
        this.f136435b = (b) pc.m.e(bVar);
    }

    @NonNull
    public static <T> h<T> a(@NonNull String str, @Nullable T t10, @NonNull b<T> bVar) {
        return new h<>(str, t10, bVar);
    }

    @NonNull
    public static <T> h<T> b(@NonNull String str, @NonNull b<T> bVar) {
        return new h<>(str, null, bVar);
    }

    @NonNull
    public static <T> b<T> c() {
        return (b<T>) f136433e;
    }

    @NonNull
    public static <T> h<T> f(@NonNull String str) {
        return new h<>(str, null, c());
    }

    @NonNull
    public static <T> h<T> g(@NonNull String str, @NonNull T t10) {
        return new h<>(str, t10, c());
    }

    @Nullable
    public T d() {
        return this.f136434a;
    }

    @NonNull
    public final byte[] e() {
        if (this.f136437d == null) {
            this.f136437d = this.f136436c.getBytes(f.f136431b);
        }
        return this.f136437d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f136436c.equals(((h) obj).f136436c);
        }
        return false;
    }

    public void h(@NonNull T t10, @NonNull MessageDigest messageDigest) {
        this.f136435b.a(e(), t10, messageDigest);
    }

    public int hashCode() {
        return this.f136436c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f136436c + '\'' + fw.b.f85383j;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements b<Object> {
        @Override // tb.h.b
        public void a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }
}
