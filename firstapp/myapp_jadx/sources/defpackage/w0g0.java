package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w0g0 implements w420 {
    public final int a;
    public final int b;

    public w0g0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.w420
    public final long a(owo owoVar, long j, asr asrVar, long j2) {
        int i = this.a;
        if (i == 3) {
            return c(owoVar, j2);
        }
        if (i == 4) {
            return d(owoVar, j2, j);
        }
        if (i == 1) {
            return b(owoVar, j2, j);
        }
        if (i != 2) {
            if (i == 5) {
                return asrVar == asr.a ? c(owoVar, j2) : d(owoVar, j2, j);
            }
            if (i == 6) {
                return asrVar == asr.a ? d(owoVar, j2, j) : c(owoVar, j2);
            }
            return b(owoVar, j2, j);
        }
        int i2 = (int) (j2 >> 32);
        int iD = ((owoVar.d() - i2) / 2) + owoVar.a;
        if (iD < 0) {
            iD = owoVar.a;
        } else if (iD + i2 > ((int) (j >> 32))) {
            iD = owoVar.c - i2;
        }
        int i3 = owoVar.d;
        int i4 = this.b;
        int i5 = i3 + i4;
        int i6 = (int) (j2 & 4294967295L);
        if (i5 + i6 > ((int) (j & 4294967295L))) {
            i5 = (owoVar.b - i6) - i4;
        }
        return (((long) iD) << 32) | (((long) i5) & 4294967295L);
    }

    public final long b(owo owoVar, long j, long j2) {
        int i = (int) (j >> 32);
        int iD = ((owoVar.d() - i) / 2) + owoVar.a;
        if (iD < 0) {
            iD = owoVar.a;
        } else if (iD + i > ((int) (j2 >> 32))) {
            iD = owoVar.c - i;
        }
        int i2 = owoVar.b - ((int) (j & 4294967295L));
        int i3 = this.b;
        int i4 = i2 - i3;
        if (i4 < 0) {
            i4 = owoVar.d + i3;
        }
        return (((long) iD) << 32) | (((long) i4) & 4294967295L);
    }

    public final long c(owo owoVar, long j) {
        int i = owoVar.a;
        int i2 = this.b;
        int i3 = i - (((int) (j >> 32)) + i2);
        if (i3 < 0) {
            i3 = owoVar.c + i2;
        }
        return (((long) i3) << 32) | (((long) (((owoVar.b + owoVar.d) - ((int) (j & 4294967295L))) / 2)) & 4294967295L);
    }

    public final long d(owo owoVar, long j, long j2) {
        int i = owoVar.c;
        int i2 = this.b;
        int i3 = i + i2;
        int i4 = (int) (j >> 32);
        if (i3 + i4 > ((int) (j2 >> 32))) {
            i3 = owoVar.a - (i4 + i2);
        }
        return (((long) i3) << 32) | (((long) (((owoVar.b + owoVar.d) - ((int) (j & 4294967295L))) / 2)) & 4294967295L);
    }
}
