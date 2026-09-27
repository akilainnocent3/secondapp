package af;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f4983a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f4984b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f4985c = -1;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    void c(o oVar);

    boolean d(n nVar) throws IOException;

    int e(n nVar, b0 b0Var) throws IOException;

    void release();

    void seek(long j10, long j11);
}
