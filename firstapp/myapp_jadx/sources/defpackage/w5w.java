package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w5w implements uov.a {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public w5w(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w5w.class == obj.getClass()) {
            w5w w5wVar = (w5w) obj;
            if (this.a == w5wVar.a && this.b == w5wVar.b && this.c == w5wVar.c && this.d == w5wVar.d && this.e == w5wVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return vkt.b(this.e) + ((vkt.b(this.d) + ((vkt.b(this.c) + ((vkt.b(this.b) + ((vkt.b(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }
}
