package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public abstract class q12<T> {
    public long a = System.currentTimeMillis();

    public final T a(long j) {
        long j2 = j - this.a;
        this.a = j;
        return b(j, j2);
    }

    public abstract T b(long j, long j2);
}
