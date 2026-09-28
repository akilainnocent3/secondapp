package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class g32 implements tiv {
    public final long b;
    public long c = -1;

    public g32(long j) {
        this.b = j;
    }

    @Override // defpackage.tiv
    public final boolean next() {
        long j = this.c + 1;
        this.c = j;
        return !(j > this.b);
    }
}
