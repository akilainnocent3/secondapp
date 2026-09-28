package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class umz implements tmz {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public umz(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            ukn.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.tmz
    public final float a() {
        return this.d;
    }

    @Override // defpackage.tmz
    public final float b(asr asrVar) {
        return asrVar == asr.a ? this.a : this.c;
    }

    @Override // defpackage.tmz
    public final float c(asr asrVar) {
        return asrVar == asr.a ? this.c : this.a;
    }

    @Override // defpackage.tmz
    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof umz)) {
            return false;
        }
        umz umzVar = (umz) obj;
        return g7f.b(this.a, umzVar.a) && g7f.b(this.b, umzVar.b) && g7f.b(this.c, umzVar.c) && g7f.b(this.d, umzVar.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + tvh.a(this.c, tvh.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaddingValues(start=");
        k35.a(this.a, ", top=", sb);
        k35.a(this.b, ", end=", sb);
        k35.a(this.c, ", bottom=", sb);
        sb.append((Object) g7f.c(this.d));
        sb.append(')');
        return sb.toString();
    }
}
