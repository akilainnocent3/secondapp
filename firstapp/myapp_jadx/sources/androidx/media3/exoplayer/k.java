package androidx.media3.exoplayer;

import defpackage.d850;
import defpackage.ekv;
import defpackage.qxf0;
import defpackage.rs60;
import defpackage.sp10;
import defpackage.uiv;
import defpackage.vs7;

/* JADX INFO: loaded from: classes.dex */
public interface k extends j.b {

    public interface a {
        void a();

        void b();
    }

    long A();

    void B(long j);

    uiv C();

    void a();

    boolean b();

    boolean f();

    String getName();

    int getState();

    void h(long j, long j2);

    default void i() {
    }

    boolean isReady();

    void j();

    void n(d850 d850Var, androidx.media3.common.a[] aVarArr, rs60 rs60Var, boolean z, boolean z2, long j, long j2, ekv.b bVar);

    void o();

    boolean p();

    int q();

    void r(qxf0 qxf0Var);

    default void release() {
    }

    void reset();

    default long s(long j, long j2) {
        if (getState() == 1) {
            return (isReady() || b()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    void start();

    void stop();

    void t(int i, sp10 sp10Var, vs7 vs7Var);

    b u();

    default void w(float f, float f2) {
    }

    void y(androidx.media3.common.a[] aVarArr, rs60 rs60Var, long j, long j2, ekv.b bVar);

    rs60 z();
}
