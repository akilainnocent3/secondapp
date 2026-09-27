package ah;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f5368a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f5369b = 2;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5371b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f5372c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f5373d;

        public a(int i10, int i11, int i12, int i13) {
            this.f5370a = i10;
            this.f5371b = i11;
            this.f5372c = i12;
            this.f5373d = i13;
        }

        public boolean a(int i10) {
            if (i10 == 1) {
                return this.f5370a - this.f5371b > 1;
            }
            return this.f5372c - this.f5373d > 1;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f5375b;

        public b(int i10, long j10) {
            eh.a.a(j10 >= 0);
            this.f5374a = i10;
            this.f5375b = j10;
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
        public final zf.z f5376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final zf.d0 f5377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IOException f5378c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f5379d;

        public d(zf.z zVar, zf.d0 d0Var, IOException iOException, int i10) {
            this.f5376a = zVar;
            this.f5377b = d0Var;
            this.f5378c = iOException;
            this.f5379d = i10;
        }
    }

    void a(long j10);

    int b(int i10);

    @Nullable
    b c(a aVar, d dVar);

    long d(d dVar);
}
