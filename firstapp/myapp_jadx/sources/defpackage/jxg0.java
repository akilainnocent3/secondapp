package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jxg0 {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(njg0 njg0Var, njg0.a aVar) {
        if (this.c > 0) {
            njg0Var.a(this.d, this.e, this.f, this.g, aVar);
            this.c = 0;
        }
    }

    public final void b(njg0 njg0Var, long j, int i, int i2, int i3, njg0.a aVar) {
        ly0.e("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i2 + i3);
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(njg0Var, aVar);
            }
        }
    }

    public final void c(l4h l4hVar) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        int i = 0;
        l4hVar.m(bArr, 0, 10);
        l4hVar.e();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                i = 40 << ((bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.b = true;
    }
}
