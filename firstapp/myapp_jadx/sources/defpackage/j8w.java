package defpackage;

import androidx.media3.common.a;

/* JADX INFO: loaded from: classes.dex */
public final class j8w implements fwf {
    public final nsz a;
    public final k8w.a b;
    public final String c;
    public final int d;
    public final String e;
    public njg0 f;
    public String g;
    public int h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public j8w(String str, int i, String str2) {
        nsz nszVar = new nsz(4);
        this.a = nszVar;
        nszVar.a[0] = -1;
        this.b = new k8w.a();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // defpackage.fwf
    public final void a(nsz nszVar) {
        ly0.g(this.f);
        while (nszVar.a() > 0) {
            int i = this.h;
            nsz nszVar2 = this.a;
            if (i == 0) {
                byte[] bArr = nszVar.a;
                int i2 = nszVar.b;
                int i3 = nszVar.c;
                while (true) {
                    if (i2 >= i3) {
                        nszVar.I(i3);
                        break;
                    }
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.k && (b & 224) == 224;
                    this.k = z;
                    if (z2) {
                        nszVar.I(i2 + 1);
                        this.k = false;
                        nszVar2.a[1] = bArr[i2];
                        this.i = 2;
                        this.h = 1;
                        break;
                    }
                    i2++;
                }
            } else if (i == 1) {
                int iMin = Math.min(nszVar.a(), 4 - this.i);
                nszVar.h(nszVar2.a, this.i, iMin);
                int i4 = this.i + iMin;
                this.i = i4;
                if (i4 >= 4) {
                    nszVar2.I(0);
                    int iJ = nszVar2.j();
                    k8w.a aVar = this.b;
                    if (aVar.a(iJ)) {
                        this.m = aVar.c;
                        if (!this.j) {
                            this.l = (((long) aVar.g) * 1000000) / ((long) aVar.d);
                            a.C0062a c0062a = new a.C0062a();
                            c0062a.a = this.g;
                            c0062a.l = gqv.m(this.e);
                            c0062a.m = gqv.m(aVar.b);
                            c0062a.n = 4096;
                            c0062a.E = aVar.e;
                            c0062a.F = aVar.d;
                            c0062a.d = this.c;
                            c0062a.f = this.d;
                            this.f.d(new a(c0062a));
                            this.j = true;
                        }
                        nszVar2.I(0);
                        this.f.f(4, nszVar2);
                        this.h = 2;
                    } else {
                        this.i = 0;
                        this.h = 1;
                    }
                }
            } else {
                if (i != 2) {
                    fm20.a();
                    return;
                }
                int iMin2 = Math.min(nszVar.a(), this.m - this.i);
                this.f.f(iMin2, nszVar);
                int i5 = this.i + iMin2;
                this.i = i5;
                if (i5 >= this.m) {
                    ly0.f(this.n != -9223372036854775807L);
                    this.f.a(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = 0;
                }
            }
        }
    }

    @Override // defpackage.fwf
    public final void c() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.fwf
    public final void e(m4h m4hVar, wxg0.c cVar) {
        cVar.a();
        cVar.b();
        this.g = cVar.e;
        cVar.b();
        this.f = m4hVar.r(cVar.d, 1);
    }

    @Override // defpackage.fwf
    public final void f(int i, long j) {
        this.n = j;
    }

    @Override // defpackage.fwf
    public final void d(boolean z) {
    }
}
