package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public final class vbl {
    public final long a;
    public final float b;
    public final boolean c;

    public vbl(float f, long j, boolean z) {
        this.a = j;
        this.b = f;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbl)) {
            return false;
        }
        vbl vblVar = (vbl) obj;
        return gly.c(this.a, vblVar.a) && Float.compare(this.b, vblVar.b) == 0 && this.c == vblVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + tvh.a(this.b, Long.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HammerHitAnimationState(translation=");
        sb.append((Object) gly.h(this.a));
        sb.append(", smashProgress=");
        sb.append(this.b);
        sb.append(", crackVisible=");
        return ruw.a(sb, this.c, ')');
    }
}
