package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i380 implements wxg0 {
    public final h380 a;
    public final nsz b = new nsz(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public i380(h380 h380Var) {
        this.a = h380Var;
    }

    @Override // defpackage.wxg0
    public final void a(int i, nsz nszVar) {
        int iW;
        boolean z = (i & 1) != 0;
        if (z) {
            iW = nszVar.b + nszVar.w();
        } else {
            iW = -1;
        }
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            nszVar.I(iW);
            this.d = 0;
        }
        while (nszVar.a() > 0) {
            int i2 = this.d;
            nsz nszVar2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iW2 = nszVar.w();
                    nszVar.I(nszVar.b - 1);
                    if (iW2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(nszVar.a(), 3 - this.d);
                nszVar.h(nszVar2.a, this.d, iMin);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    nszVar2.I(0);
                    nszVar2.H(3);
                    nszVar2.J(1);
                    int iW3 = nszVar2.w();
                    int iW4 = nszVar2.w();
                    this.e = (iW3 & 128) != 0;
                    int i4 = (((iW3 & 15) << 8) | iW4) + 3;
                    this.c = i4;
                    byte[] bArr = nszVar2.a;
                    if (bArr.length < i4) {
                        nszVar2.c(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(nszVar.a(), this.c - this.d);
                nszVar.h(nszVar2.a, this.d, iMin2);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        nszVar2.H(i6);
                    } else {
                        if (jrh0.o(0, i6, -1, nszVar2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        nszVar2.H(this.c - 4);
                    }
                    nszVar2.I(0);
                    this.a.a(nszVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.wxg0
    public final void b(zxf0 zxf0Var, m4h m4hVar, wxg0.c cVar) {
        this.a.b(zxf0Var, m4hVar, cVar);
        this.f = true;
    }

    @Override // defpackage.wxg0
    public final void c() {
        this.f = true;
    }
}
