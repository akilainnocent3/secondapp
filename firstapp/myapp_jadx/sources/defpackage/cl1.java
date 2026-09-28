package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class cl1 extends lhe0.a {
    public final Size a;
    public final Rect b;
    public final n26 c;
    public final int d;
    public final boolean e;

    public cl1(Size size, Rect rect, n26 n26Var, int i, boolean z) {
        if (size == null) {
            bmy.a("Null inputSize");
            throw null;
        }
        this.a = size;
        if (rect == null) {
            bmy.a("Null inputCropRect");
            throw null;
        }
        this.b = rect;
        this.c = n26Var;
        this.d = i;
        this.e = z;
    }

    @Override // lhe0.a
    public final n26 a() {
        return this.c;
    }

    @Override // lhe0.a
    public final Rect b() {
        return this.b;
    }

    @Override // lhe0.a
    public final Size c() {
        return this.a;
    }

    @Override // lhe0.a
    public final boolean d() {
        return this.e;
    }

    @Override // lhe0.a
    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lhe0.a)) {
            return false;
        }
        lhe0.a aVar = (lhe0.a) obj;
        if (!this.a.equals(aVar.c()) || !this.b.equals(aVar.b())) {
            return false;
        }
        n26 n26Var = this.c;
        if (n26Var == null) {
            if (aVar.a() != null) {
                return false;
            }
        } else if (!n26Var.equals(aVar.a())) {
            return false;
        }
        return this.d == aVar.e() && this.e == aVar.d();
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        n26 n26Var = this.c;
        return (this.e ? 1231 : 1237) ^ ((((iHashCode ^ (n26Var == null ? 0 : n26Var.hashCode())) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
        sb.append(this.a);
        sb.append(", inputCropRect=");
        sb.append(this.b);
        sb.append(", cameraInternal=");
        sb.append(this.c);
        sb.append(", rotationDegrees=");
        sb.append(this.d);
        sb.append(", mirroring=");
        return mq0.a(sb, this.e, "}");
    }
}
