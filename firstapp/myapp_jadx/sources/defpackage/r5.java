package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class r5 implements k4h {
    public final s5 a = new s5(null, 0, "audio/ac4");
    public final nsz b = new nsz(Http2.INITIAL_MAX_FRAME_SIZE);
    public boolean c;

    @Override // defpackage.k4h
    public final int a(l4h l4hVar, k620 k620Var) {
        nsz nszVar = this.b;
        int i = l4hVar.read(nszVar.a, 0, Http2.INITIAL_MAX_FRAME_SIZE);
        if (i == -1) {
            return -1;
        }
        nszVar.I(0);
        nszVar.H(i);
        boolean z = this.c;
        s5 s5Var = this.a;
        if (!z) {
            s5Var.n = 0L;
            this.c = true;
        }
        s5Var.a(nszVar);
        return 0;
    }

    @Override // defpackage.k4h
    public final boolean b(l4h l4hVar) throws EOFException, InterruptedIOException {
        jcd jcdVar;
        int i;
        nsz nszVar = new nsz(10);
        int i2 = 0;
        while (true) {
            jcdVar = (jcd) l4hVar;
            jcdVar.c(nszVar.a, 0, 10, false);
            nszVar.I(0);
            if (nszVar.z() != 4801587) {
                break;
            }
            nszVar.J(3);
            int iV = nszVar.v();
            i2 += iV + 10;
            jcdVar.n(iV, false);
        }
        jcdVar.f = 0;
        jcdVar.n(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            jcdVar.c(nszVar.a, 0, 7, false);
            nszVar.I(0);
            int iC = nszVar.C();
            if (iC == 44096 || iC == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = nszVar.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iC == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                jcdVar.n(i - 7, false);
            } else {
                jcdVar.f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                jcdVar.n(i4, false);
                i3 = 0;
            }
        }
        return false;
    }

    @Override // defpackage.k4h
    public final void c(long j, long j2) {
        this.c = false;
        this.a.c();
    }

    @Override // defpackage.k4h
    public final void l(m4h m4hVar) {
        this.a.e(m4hVar, new wxg0.c(0, 1));
        m4hVar.n();
        m4hVar.k(new p480.b(-9223372036854775807L));
    }

    @Override // defpackage.k4h
    public final void release() {
    }
}
