package s5;

import androidx.media3.common.StreamKey;
import d5.e5;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@x4.m1
public interface p0 extends u1 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a extends u1.a<p0> {
        void h(p0 p0Var);
    }

    List<StreamKey> a(List<y5.w> list);

    long b(long j10, e5 e5Var);

    @Override // s5.u1
    boolean d(androidx.media3.exoplayer.j jVar);

    void discardBuffer(long j10, boolean z10);

    long f(y5.w[] wVarArr, boolean[] zArr, t1[] t1VarArr, boolean[] zArr2, long j10);

    long g(long j10);

    @Override // s5.u1
    long getBufferedPositionUs();

    @Override // s5.u1
    long getNextLoadPositionUs();

    j2 getTrackGroups();

    @Override // s5.u1
    boolean isLoading();

    void j(a aVar, long j10);

    void maybeThrowPrepareError() throws IOException;

    long readDiscontinuity();

    @Override // s5.u1
    void reevaluateBuffer(long j10);

    long seekToUs(long j10);
}
