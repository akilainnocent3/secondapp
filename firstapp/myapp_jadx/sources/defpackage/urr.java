package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface urr {
    static long V(urr urrVar, urr urrVar2, int i) {
        return urrVar.Q(urrVar2, 0L, (i & 4) != 0);
    }

    default void C(urr urrVar, float[] fArr) {
        wkn.f("transformFrom is not implemented on this LayoutCoordinates");
    }

    long D(long j);

    long M(urr urrVar, long j);

    lk40 P(urr urrVar, boolean z);

    default long Q(urr urrVar, long j, boolean z) {
        throw new UnsupportedOperationException("localPositionOf is not implemented on this LayoutCoordinates");
    }

    long T(long j);

    default void W(float[] fArr) {
        throw new UnsupportedOperationException("transformToScreen is not implemented on this LayoutCoordinates");
    }

    long a();

    boolean e();

    urr e0();

    long i0(long j);

    default long o(long j) {
        return 9205357640488583168L;
    }

    default long w(long j) {
        return 9205357640488583168L;
    }
}
