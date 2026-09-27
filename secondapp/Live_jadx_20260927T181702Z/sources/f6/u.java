package f6;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public interface u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f83654a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f83655b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f83656c = -1;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    void c(w wVar);

    boolean d(v vVar) throws IOException;

    @ky.e
    u e();

    List<a1> f();

    int g(v vVar, t0 t0Var) throws IOException;

    void release();

    void seek(long j10, long j11);
}
