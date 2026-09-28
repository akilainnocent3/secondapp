package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pth implements g8j0 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public pth(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.g8j0
    public final int a(mmd mmdVar) {
        return mmdVar.y0(this.b);
    }

    @Override // defpackage.g8j0
    public final int b(mmd mmdVar, asr asrVar) {
        return mmdVar.y0(this.c);
    }

    @Override // defpackage.g8j0
    public final int c(mmd mmdVar) {
        return mmdVar.y0(this.d);
    }

    @Override // defpackage.g8j0
    public final int d(mmd mmdVar, asr asrVar) {
        return mmdVar.y0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pth)) {
            return false;
        }
        pth pthVar = (pth) obj;
        return g7f.b(this.a, pthVar.a) && g7f.b(this.b, pthVar.b) && g7f.b(this.c, pthVar.c) && g7f.b(this.d, pthVar.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + tvh.a(this.c, tvh.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets(left=");
        k35.a(this.a, ", top=", sb);
        k35.a(this.b, ", right=", sb);
        k35.a(this.c, ", bottom=", sb);
        sb.append((Object) g7f.c(this.d));
        sb.append(')');
        return sb.toString();
    }
}
