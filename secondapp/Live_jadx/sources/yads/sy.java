package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class sy implements rx2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rx2[] f155628b;

    public sy(rx2[] rx2VarArr) {
        this.f155628b = rx2VarArr;
    }

    @Override // yads.rx2
    public final boolean continueLoading(long j10) {
        boolean zContinueLoading;
        boolean z10 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z10;
            }
            zContinueLoading = false;
            for (rx2 rx2Var : this.f155628b) {
                long nextLoadPositionUs2 = rx2Var.getNextLoadPositionUs();
                boolean z11 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= j10;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z11) {
                    zContinueLoading |= rx2Var.continueLoading(j10);
                }
            }
            z10 |= zContinueLoading;
        } while (zContinueLoading);
        return z10;
    }

    @Override // yads.rx2
    public final long getBufferedPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (rx2 rx2Var : this.f155628b) {
            long bufferedPositionUs = rx2Var.getBufferedPositionUs();
            if (bufferedPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, bufferedPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // yads.rx2
    public final long getNextLoadPositionUs() {
        long jMin = Long.MAX_VALUE;
        for (rx2 rx2Var : this.f155628b) {
            long nextLoadPositionUs = rx2Var.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                jMin = Math.min(jMin, nextLoadPositionUs);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // yads.rx2
    public final boolean isLoading() {
        for (rx2 rx2Var : this.f155628b) {
            if (rx2Var.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // yads.rx2
    public final void reevaluateBuffer(long j10) {
        for (rx2 rx2Var : this.f155628b) {
            rx2Var.reevaluateBuffer(j10);
        }
    }
}
