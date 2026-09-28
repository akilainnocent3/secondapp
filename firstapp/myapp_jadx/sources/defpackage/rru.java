package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class rru extends jpc implements Comparable<rru> {
    public final long a;

    public rru(long j) {
        this.a = j;
    }

    @Override // defpackage.jpc
    public final int a() {
        return 8;
    }

    @Override // java.lang.Comparable
    public final int compareTo(rru rruVar) {
        long j = this.a - rruVar.a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }
}
