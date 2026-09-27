package z5;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import s5.e0;
import s5.i0;
import x4.m1;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public interface q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f160483a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f160484b = 2;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f160485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f160486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f160487c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f160488d;

        public a(int i10, int i11, int i12, int i13) {
            this.f160485a = i10;
            this.f160486b = i11;
            this.f160487c = i12;
            this.f160488d = i13;
        }

        public boolean a(int i10) {
            if (i10 == 1) {
                return this.f160485a - this.f160486b > 1;
            }
            return this.f160487c - this.f160488d > 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f160489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f160490b;

        public b(int i10, long j10) {
            l0.d(j10 >= 0);
            this.f160489a = i10;
            this.f160490b = j10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e0 f160491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i0 f160492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IOException f160493c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f160494d;

        public d(e0 e0Var, i0 i0Var, IOException iOException, int i10) {
            this.f160491a = e0Var;
            this.f160492b = i0Var;
            this.f160493c = iOException;
            this.f160494d = i10;
        }
    }

    void a(long j10);

    int b(int i10);

    @Nullable
    b c(a aVar, d dVar);

    long d(d dVar);
}
