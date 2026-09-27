package s5;

import d5.n3;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@x4.m1
public interface t1 {

    /* JADX INFO: renamed from: rb, reason: collision with root package name */
    public static final int f129524rb = 1;

    /* JADX INFO: renamed from: sb, reason: collision with root package name */
    public static final int f129525sb = 2;

    /* JADX INFO: renamed from: tb, reason: collision with root package name */
    public static final int f129526tb = 4;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    int c(n3 n3Var, c5.j jVar, int i10);

    boolean isReady();

    void maybeThrowError() throws IOException;

    int skipData(long j10);
}
