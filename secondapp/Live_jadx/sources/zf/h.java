package zf;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class h implements j1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1[] f161207b;

    public h(j1[] j1VarArr) {
        this.f161207b = j1VarArr;
    }

    @Override // zf.j1
    public boolean continueLoading(long j10) {
        boolean zContinueLoading;
        boolean z10 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z10;
            }
            zContinueLoading = false;
            for (j1 j1Var : this.f161207b) {
                long nextLoadPositionUs2 = j1Var.getNextLoadPositionUs();
                boolean z11 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= j10;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z11) {
                    zContinueLoading |= j1Var.continueLoading(j10);
                }
            }
            z10 |= zContinueLoading;
        } while (zContinueLoading);
        return z10;
    }

    @Override // zf.j1
    public final long getBufferedPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (j1 j1Var : this.f161207b) {
            long bufferedPositionUs = j1Var.getBufferedPositionUs();
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // zf.j1
    public final long getNextLoadPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (j1 j1Var : this.f161207b) {
            long nextLoadPositionUs = j1Var.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // zf.j1
    public boolean isLoading() {
        for (j1 j1Var : this.f161207b) {
            if (j1Var.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // zf.j1
    public final void reevaluateBuffer(long j10) {
        for (j1 j1Var : this.f161207b) {
            j1Var.reevaluateBuffer(j10);
        }
    }
}
