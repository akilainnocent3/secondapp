package re;

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
public interface v4 extends p4.b {
    public static final int Ba = 1;
    public static final int Ca = 2;
    public static final int Da = 3;
    public static final int Ea = 4;
    public static final int Fa = 5;
    public static final int Ga = 6;
    public static final int Ha = 7;
    public static final int Ia = 8;
    public static final int Ja = 9;
    public static final int Ka = 10;
    public static final int La = 11;
    public static final int Ma = 12;
    public static final int Na = 13;
    public static final int Oa = 14;
    public static final int Pa = 10000;
    public static final int Qa = 0;
    public static final int Ra = 1;
    public static final int Sa = 2;

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

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        void a();

        void b();
    }

    long b();

    void disable();

    void e(float f10, float f11) throws s;

    void g(n2[] n2VarArr, zf.i1 i1Var, long j10, long j11) throws s;

    x4 getCapabilities();

    @Nullable
    eh.j0 getMediaClock();

    String getName();

    int getState();

    @Nullable
    zf.i1 getStream();

    int getTrackType();

    void h(y4 y4Var, n2[] n2VarArr, zf.i1 i1Var, long j10, boolean z10, boolean z11, long j11, long j12) throws s;

    boolean hasReadStreamToEnd();

    void i(int i10, se.b2 b2Var);

    boolean isCurrentStreamFinal();

    boolean isEnded();

    boolean isReady();

    void maybeThrowStreamError() throws IOException;

    void release();

    void render(long j10, long j11) throws s;

    void reset();

    void resetPosition(long j10) throws s;

    void setCurrentStreamFinal();

    void start() throws s;

    void stop();
}
