package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h8w implements uov.a {
    public final long a;
    public final long b;
    public final long c;

    public h8w(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8w)) {
            return false;
        }
        h8w h8wVar = (h8w) obj;
        return this.a == h8wVar.a && this.b == h8wVar.b && this.c == h8wVar.c;
    }

    public final int hashCode() {
        return vkt.b(this.c) + ((vkt.b(this.b) + ((vkt.b(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }
}
