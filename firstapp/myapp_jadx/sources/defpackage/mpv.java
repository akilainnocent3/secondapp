package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class mpv {
    public final String a;
    public final float b;
    public final float c;

    public mpv(String str, float f, float f2) {
        this.a = str;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpv)) {
            return false;
        }
        mpv mpvVar = (mpv) obj;
        return this.a.equals(mpvVar.a) && Float.compare(this.b, mpvVar.b) == 0 && Float.compare(this.c, mpvVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + tvh.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metric(labelText=");
        sb.append(this.a);
        sb.append(", homeScore=");
        sb.append(this.b);
        sb.append(", awayScore=");
        return wi1.a(this.c, ")", sb);
    }
}
