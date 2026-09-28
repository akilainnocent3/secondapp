package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class se4 extends crz {
    public final c8n f;
    public final long i;
    public int v = 1;
    public final long w;
    public float y;
    public l58 z;

    public se4(c8n c8nVar, long j) {
        int i;
        this.f = c8nVar;
        this.i = j;
        int i2 = (int) (j >> 32);
        if (i2 < 0 || (i = (int) (4294967295L & j)) < 0 || i2 > c8nVar.c() || i > c8nVar.b()) {
            hb5.a("Failed requirement.");
            throw null;
        }
        this.w = j;
        this.y = 1.0f;
    }

    @Override // defpackage.crz
    public final boolean a(float f) {
        this.y = f;
        return true;
    }

    @Override // defpackage.crz
    public final boolean b(l58 l58Var) {
        this.z = l58Var;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se4)) {
            return false;
        }
        se4 se4Var = (se4) obj;
        return Intrinsics.g(this.f, se4Var.f) && iwo.b(0L, 0L) && jxo.b(this.i, se4Var.i) && this.v == se4Var.v;
    }

    public final int hashCode() {
        return Integer.hashCode(this.v) + f87.a(f87.a(this.f.hashCode() * 31, 0L, 31), this.i, 31);
    }

    @Override // defpackage.crz
    public final long i() {
        return kc6.d(this.w);
    }

    @Override // defpackage.crz
    public final void j(tcf tcfVar) {
        tcf.J1(tcfVar, this.f, 0L, this.i, 0L, (((long) Math.round(Float.intBitsToFloat((int) (tcfVar.d() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)))) & 4294967295L), this.y, null, this.z, 0, this.v, 328);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f);
        sb.append(", srcOffset=");
        sb.append((Object) iwo.e(0L));
        sb.append(", srcSize=");
        sb.append((Object) jxo.c(this.i));
        sb.append(", filterQuality=");
        int i = this.v;
        if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Low";
        } else if (i == 2) {
            str = "Medium";
        } else {
            str = i == 3 ? "High" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
