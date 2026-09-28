package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class o3 extends bjb0 {
    public final y3l b;
    public final /* synthetic */ p3 c;
    public final /* synthetic */ String d;

    public o3(p3 p3Var, String str) {
        this.c = p3Var;
        this.d = str;
        this.b = p3Var.b.b;
    }

    @Override // defpackage.bjb0, defpackage.f4g
    public final void C(int i) {
        hbh0.a aVar = hbh0.b;
        h0(Long.toString(((long) i) & 4294967295L, 10));
    }

    @Override // defpackage.f4g
    public final y3l d() {
        return this.b;
    }

    @Override // defpackage.bjb0, defpackage.f4g
    public final void g(byte b) {
        nah0.a aVar = nah0.b;
        h0(String.valueOf(b & 255));
    }

    public final void h0(String str) {
        str.getClass();
        this.c.o0(new ndp(str, false, null), this.d);
    }

    @Override // defpackage.bjb0, defpackage.f4g
    public final void p(long j) {
        String str;
        nbh0.a aVar = nbh0.b;
        if (j == 0) {
            str = "0";
        } else if (j > 0) {
            str = Long.toString(j, 10);
        } else {
            char[] cArr = new char[64];
            long j2 = (j >>> 1) / 5;
            int i = 63;
            cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
            while (j2 > 0) {
                i--;
                cArr[i] = Character.forDigit((int) (j2 % 10), 10);
                j2 /= 10;
            }
            str = new String(cArr, i, 64 - i);
        }
        h0(str);
    }

    @Override // defpackage.bjb0, defpackage.f4g
    public final void u(short s) {
        wbh0.a aVar = wbh0.b;
        h0(String.valueOf(s & 65535));
    }
}
