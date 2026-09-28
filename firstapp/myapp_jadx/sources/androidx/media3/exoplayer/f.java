package androidx.media3.exoplayer;

import defpackage.cft;
import defpackage.ekv;
import defpackage.oyg;
import defpackage.qxf0;
import defpackage.sp10;
import defpackage.tf;

/* JADX INFO: loaded from: classes.dex */
public interface f {

    public static final class a {
        public final sp10 a;
        public final long b;
        public final float c;
        public final boolean d;
        public final long e;

        public a(sp10 sp10Var, qxf0 qxf0Var, ekv.b bVar, long j, long j2, float f, boolean z, long j3) {
            this.a = sp10Var;
            this.b = j2;
            this.c = f;
            this.d = z;
            this.e = j3;
        }
    }

    default boolean a(a aVar) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    default boolean b() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    default long c() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    tf d();

    default boolean e(a aVar) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    default boolean f() {
        cft.g("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    default void g(sp10 sp10Var) {
        throw new IllegalStateException("onReleased not implemented");
    }

    default void h(sp10 sp10Var) {
        throw new IllegalStateException("onStopped not implemented");
    }

    default void i(sp10 sp10Var) {
        throw new IllegalStateException("onPrepared not implemented");
    }

    default void j(a aVar, oyg[] oygVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }
}
