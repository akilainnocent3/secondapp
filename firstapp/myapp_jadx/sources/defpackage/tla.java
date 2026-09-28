package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class tla extends qla {
    public final boolean c;

    public tla(rep repVar, boolean z) {
        super(repVar);
        this.c = z;
    }

    @Override // defpackage.qla
    public final void b(byte b) {
        if (this.c) {
            nah0.a aVar = nah0.b;
            h(String.valueOf(b & 255));
        } else {
            nah0.a aVar2 = nah0.b;
            f(String.valueOf(b & 255));
        }
    }

    @Override // defpackage.qla
    public final void d(int i) {
        if (this.c) {
            hbh0.a aVar = hbh0.b;
            h(Long.toString(((long) i) & 4294967295L, 10));
        } else {
            hbh0.a aVar2 = hbh0.b;
            f(Long.toString(((long) i) & 4294967295L, 10));
        }
    }

    @Override // defpackage.qla
    public final void e(long j) {
        int i = 63;
        String str = "0";
        if (this.c) {
            nbh0.a aVar = nbh0.b;
            if (j != 0) {
                if (j > 0) {
                    str = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / 5;
                    cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
                    while (j2 > 0) {
                        i--;
                        cArr[i] = Character.forDigit((int) (j2 % 10), 10);
                        j2 /= 10;
                    }
                    str = new String(cArr, i, 64 - i);
                }
            }
            h(str);
            return;
        }
        nbh0.a aVar2 = nbh0.b;
        if (j != 0) {
            if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j3 = (j >>> 1) / 5;
                cArr2[63] = Character.forDigit((int) (j - (j3 * 10)), 10);
                while (j3 > 0) {
                    i--;
                    cArr2[i] = Character.forDigit((int) (j3 % 10), 10);
                    j3 /= 10;
                }
                str = new String(cArr2, i, 64 - i);
            }
        }
        f(str);
    }

    @Override // defpackage.qla
    public final void g(short s) {
        if (this.c) {
            wbh0.a aVar = wbh0.b;
            h(String.valueOf(s & 65535));
        } else {
            wbh0.a aVar2 = wbh0.b;
            f(String.valueOf(s & 65535));
        }
    }
}
