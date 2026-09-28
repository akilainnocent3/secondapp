package defpackage;

import androidx.media3.common.a;

/* JADX INFO: loaded from: classes.dex */
public final class s5 implements fwf {
    public final msz a;
    public final nsz b;
    public final String c;
    public final int d;
    public final String e;
    public String f;
    public njg0 g;
    public int h;
    public int i;
    public boolean j;
    public long k;
    public a l;
    public int m;
    public long n;

    public s5(String str, int i, String str2) {
        msz mszVar = new msz(16, new byte[16]);
        this.a = mszVar;
        this.b = new nsz(mszVar.a);
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // defpackage.fwf
    public final void a(nsz nszVar) {
        ly0.g(this.g);
        while (nszVar.a() > 0) {
            int i = this.h;
            nsz nszVar2 = this.b;
            if (i == 0) {
                while (nszVar.a() > 0) {
                    if (this.j) {
                        int iW = nszVar.w();
                        this.j = iW == 172;
                        if (iW == 64 || iW == 65) {
                            boolean z = iW == 65;
                            this.h = 1;
                            byte[] bArr = nszVar2.a;
                            bArr[0] = -84;
                            bArr[1] = (byte) (z ? 65 : 64);
                            this.i = 2;
                            break;
                        }
                    } else {
                        this.j = nszVar.w() == 172;
                    }
                }
            } else if (i == 1) {
                byte[] bArr2 = nszVar2.a;
                int iMin = Math.min(nszVar.a(), 16 - this.i);
                nszVar.h(bArr2, this.i, iMin);
                int i2 = this.i + iMin;
                this.i = i2;
                if (i2 == 16) {
                    msz mszVar = this.a;
                    mszVar.m(0);
                    t5.b bVarB = t5.b(mszVar);
                    int i3 = bVarB.a;
                    a aVar = this.l;
                    if (aVar == null || 2 != aVar.F || i3 != aVar.G || !"audio/ac4".equals(aVar.n)) {
                        a.C0062a c0062a = new a.C0062a();
                        c0062a.a = this.f;
                        c0062a.l = gqv.m(this.e);
                        c0062a.m = gqv.m("audio/ac4");
                        c0062a.E = 2;
                        c0062a.F = i3;
                        c0062a.d = this.c;
                        c0062a.f = this.d;
                        a aVar2 = new a(c0062a);
                        this.l = aVar2;
                        this.g.d(aVar2);
                    }
                    this.m = bVarB.b;
                    this.k = (((long) bVarB.c) * 1000000) / ((long) this.l.G);
                    nszVar2.I(0);
                    this.g.f(16, nszVar2);
                    this.h = 2;
                }
            } else if (i == 2) {
                int iMin2 = Math.min(nszVar.a(), this.m - this.i);
                this.g.f(iMin2, nszVar);
                int i4 = this.i + iMin2;
                this.i = i4;
                if (i4 == this.m) {
                    ly0.f(this.n != -9223372036854775807L);
                    this.g.a(this.n, 1, this.m, 0, null);
                    this.n += this.k;
                    this.h = 0;
                }
            }
        }
    }

    @Override // defpackage.fwf
    public final void c() {
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.fwf
    public final void e(m4h m4hVar, wxg0.c cVar) {
        cVar.a();
        cVar.b();
        this.f = cVar.e;
        cVar.b();
        this.g = m4hVar.r(cVar.d, 1);
    }

    @Override // defpackage.fwf
    public final void f(int i, long j) {
        this.n = j;
    }

    @Override // defpackage.fwf
    public final void d(boolean z) {
    }
}
