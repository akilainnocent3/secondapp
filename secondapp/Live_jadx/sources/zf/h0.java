package zf;

import com.google.android.exoplayer2.offline.StreamKey;
import java.io.IOException;
import java.util.List;
import re.a5;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface h0 extends j1 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a extends j1.a<h0> {
        void d(h0 h0Var);
    }

    List<StreamKey> a(List<yg.s> list);

    long b(long j10, a5 a5Var);

    @Override // zf.j1
    boolean continueLoading(long j10);

    void discardBuffer(long j10, boolean z10);

    long f(yg.s[] sVarArr, boolean[] zArr, i1[] i1VarArr, boolean[] zArr2, long j10);

    @Override // zf.j1
    long getBufferedPositionUs();

    @Override // zf.j1
    long getNextLoadPositionUs();

    u1 getTrackGroups();

    void h(a aVar, long j10);

    @Override // zf.j1
    boolean isLoading();

    void maybeThrowPrepareError() throws IOException;

    long readDiscontinuity();

    @Override // zf.j1
    void reevaluateBuffer(long j10);

    long seekToUs(long j10);
}
