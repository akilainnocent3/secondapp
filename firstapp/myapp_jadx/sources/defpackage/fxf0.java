package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fxf0 extends tdb0 {
    public final long a;
    public final long b;

    public fxf0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static long d(long j, nsz nszVar) {
        long jW = nszVar.w();
        if ((128 & jW) != 0) {
            return 8589934591L & ((((jW & 1) << 32) | nszVar.y()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.tdb0
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.a);
        sb.append(", playbackPositionUs= ");
        return nrz.a(this.b, " }", sb);
    }
}
