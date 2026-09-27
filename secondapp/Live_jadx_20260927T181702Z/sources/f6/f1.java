package f6;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public interface f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f83460a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f83461b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f83462c = 2;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f83463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f83464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f83465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f83466d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f83463a = i10;
            this.f83464b = bArr;
            this.f83465c = i11;
            this.f83466d = i12;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f83463a == aVar.f83463a && this.f83465c == aVar.f83465c && this.f83466d == aVar.f83466d && Arrays.equals(this.f83464b, aVar.f83464b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f83463a * 31) + Arrays.hashCode(this.f83464b)) * 31) + this.f83465c) * 31) + this.f83466d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    int a(u4.c0 c0Var, int i10, boolean z10) throws IOException;

    void b(long j10, int i10, int i11, int i12, @Nullable a aVar);

    void c(long j10);

    void d(x4.v0 v0Var, int i10, int i11);

    void e(androidx.media3.common.a aVar);

    void f(x4.v0 v0Var, int i10);

    int g(u4.c0 c0Var, int i10, boolean z10, int i11) throws IOException;
}
