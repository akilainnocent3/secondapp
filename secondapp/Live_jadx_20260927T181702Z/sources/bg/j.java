package bg;

import ah.u0;
import java.io.IOException;
import java.util.List;
import re.a5;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface j {
    long b(long j10, a5 a5Var);

    void c(long j10, long j11, List<? extends n> list, h hVar);

    void d(f fVar);

    boolean f(f fVar, boolean z10, u0.d dVar, u0 u0Var);

    int getPreferredQueueSize(long j10, List<? extends n> list);

    boolean h(long j10, f fVar, List<? extends n> list);

    void maybeThrowError() throws IOException;

    void release();
}
