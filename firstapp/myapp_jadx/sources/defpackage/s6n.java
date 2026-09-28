package defpackage;

import androidx.media3.common.a;

/* JADX INFO: loaded from: classes.dex */
public final class s6n implements fwf {
    public njg0 b;
    public boolean c;
    public int e;
    public int f;
    public final nsz a = new nsz(10);
    public long d = -9223372036854775807L;

    @Override // defpackage.fwf
    public final void a(nsz nszVar) {
        ly0.g(this.b);
        if (this.c) {
            int iA = nszVar.a();
            int i = this.f;
            if (i < 10) {
                int iMin = Math.min(iA, 10 - i);
                byte[] bArr = nszVar.a;
                int i2 = nszVar.b;
                nsz nszVar2 = this.a;
                System.arraycopy(bArr, i2, nszVar2.a, this.f, iMin);
                if (this.f + iMin == 10) {
                    nszVar2.I(0);
                    if (73 != nszVar2.w() || 68 != nszVar2.w() || 51 != nszVar2.w()) {
                        cft.g("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    } else {
                        nszVar2.J(3);
                        this.e = nszVar2.v() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.e - this.f);
            this.b.f(iMin2, nszVar);
            this.f += iMin2;
        }
    }

    @Override // defpackage.fwf
    public final void c() {
        this.c = false;
        this.d = -9223372036854775807L;
    }

    @Override // defpackage.fwf
    public final void d(boolean z) {
        int i;
        ly0.g(this.b);
        if (this.c && (i = this.e) != 0 && this.f == i) {
            ly0.f(this.d != -9223372036854775807L);
            this.b.a(this.d, 1, this.e, 0, null);
            this.c = false;
        }
    }

    @Override // defpackage.fwf
    public final void e(m4h m4hVar, wxg0.c cVar) {
        cVar.a();
        cVar.b();
        njg0 njg0VarR = m4hVar.r(cVar.d, 5);
        this.b = njg0VarR;
        a.C0062a c0062a = new a.C0062a();
        cVar.b();
        c0062a.a = cVar.e;
        c0062a.l = gqv.m("video/mp2t");
        c0062a.m = gqv.m("application/id3");
        p0j0.a(c0062a, njg0VarR);
    }

    @Override // defpackage.fwf
    public final void f(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        this.d = j;
        this.e = 0;
        this.f = 0;
    }
}
