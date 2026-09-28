package defpackage;

import androidx.media3.common.a;

/* JADX INFO: loaded from: classes.dex */
public final class a41 extends Exception {
    public final int a;
    public final boolean b;

    /* JADX WARN: Illegal instructions before constructor call */
    public a41(int i, int i2, int i3, int i4, int i5, a aVar, boolean z, RuntimeException runtimeException) {
        StringBuilder sbA = dy5.a("AudioTrack init failed ", i, i2, " Config(", ", ");
        d5d.a(sbA, i3, ", ", i4, ", ");
        sbA.append(i5);
        sbA.append(") ");
        sbA.append(aVar);
        sbA.append(z ? " (recoverable)" : "");
        super(sbA.toString(), runtimeException);
        this.a = i;
        this.b = z;
    }
}
