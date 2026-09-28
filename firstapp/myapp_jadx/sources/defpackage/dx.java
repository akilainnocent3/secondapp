package defpackage;

import androidx.media3.common.a;
import com.twilio.voice.AudioFormat;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class dx implements k4h {
    public static final int[] q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] s;
    public static final byte[] t;
    public final dre b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public int h;
    public long i;
    public m4h j;
    public njg0 k;
    public njg0 l;
    public p480 m;
    public boolean n;
    public long o;
    public boolean p;
    public final byte[] a = new byte[1];
    public int g = -1;

    static {
        String str = jrh0.a;
        Charset charset = StandardCharsets.UTF_8;
        s = "#!AMR\n".getBytes(charset);
        t = "#!AMR-WB\n".getBytes(charset);
    }

    public dx() {
        dre dreVar = new dre();
        this.b = dreVar;
        this.l = dreVar;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00e8 A[PHI: r4
      0x00e8: PHI (r4v1 l4h) = (r4v0 l4h), (r4v5 l4h) binds: [B:52:0x00e6, B:55:0x00f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ff  */
    @Override // defpackage.k4h
    public final int a(l4h l4hVar, k620 k620Var) throws ssz {
        l4h l4hVar2;
        int iC;
        int i;
        ly0.g(this.k);
        String str = jrh0.a;
        if (l4hVar.getPosition() == 0 && !f(l4hVar)) {
            throw ssz.a(null, "Could not find AMR header.");
        }
        if (!this.p) {
            this.p = true;
            boolean z = this.c;
            String str2 = z ? "audio/amr-wb" : "audio/amr";
            String str3 = z ? "audio/amr-wb" : "audio/3gpp";
            int i2 = z ? AudioFormat.AUDIO_SAMPLE_RATE_16000 : AudioFormat.AUDIO_SAMPLE_RATE_8000;
            int i3 = z ? r[8] : q[7];
            njg0 njg0Var = this.k;
            a.C0062a c0062a = new a.C0062a();
            c0062a.l = gqv.m(str2);
            c0062a.m = gqv.m(str3);
            c0062a.n = i3;
            c0062a.E = 1;
            c0062a.F = i2;
            p0j0.a(c0062a, njg0Var);
        }
        int i4 = 0;
        if (this.f == 0) {
            try {
                int iD = d(l4hVar);
                this.e = iD;
                this.f = iD;
                int i5 = this.g;
                if (i5 == -1) {
                    l4hVar.getPosition();
                    iD = this.e;
                    this.g = iD;
                    i5 = iD;
                }
                if (i5 == iD) {
                    this.h++;
                }
                p480 p480Var = this.m;
                if (p480Var instanceof efn) {
                    efn efnVar = (efn) p480Var;
                    long j = this.i + this.d + 20000;
                    long position = l4hVar.getPosition() + ((long) this.e);
                    jjt jjtVar = efnVar.b;
                    int i6 = jjtVar.a;
                    if (i6 == 0 || j - jjtVar.c(i6 - 1) >= 100000) {
                        jjt jjtVar2 = efnVar.a;
                        jjt jjtVar3 = efnVar.b;
                        if (jjtVar3.a == 0 && j > 0) {
                            jjtVar2.a(0L);
                            jjtVar3.a(0L);
                        }
                        jjtVar2.a(position);
                        jjtVar3.a(j);
                    }
                    if (this.n && Math.abs(this.o - j) < 20000) {
                        this.n = false;
                        this.l = this.k;
                    }
                }
                l4hVar2 = l4hVar;
                iC = this.l.c(l4hVar2, this.f, true);
                if (iC == -1) {
                    i4 = -1;
                } else {
                    i = this.f - iC;
                    this.f = i;
                    if (i <= 0) {
                        this.l.a(this.d + this.i, 1, this.e, 0, null);
                        this.d += 20000;
                    }
                }
            } catch (EOFException unused) {
                l4hVar2 = l4hVar;
            }
        } else {
            l4hVar2 = l4hVar;
            iC = this.l.c(l4hVar2, this.f, true);
            if (iC == -1) {
                i4 = -1;
            } else {
                i = this.f - iC;
                this.f = i;
                if (i <= 0) {
                    this.l.a(this.d + this.i, 1, this.e, 0, null);
                    this.d += 20000;
                }
            }
        }
        l4hVar2.getLength();
        if (this.m == null) {
            p480.b bVar = new p480.b(-9223372036854775807L);
            this.m = bVar;
            this.j.k(bVar);
        }
        if (i4 == -1) {
            p480 p480Var2 = this.m;
            if (p480Var2 instanceof efn) {
                ((efn) p480Var2).c = this.i + this.d;
                this.j.k(p480Var2);
                this.k.getClass();
            }
        }
        return i4;
    }

    @Override // defpackage.k4h
    public final boolean b(l4h l4hVar) {
        return f(l4hVar);
    }

    @Override // defpackage.k4h
    public final void c(long j, long j2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.o = j2;
        p480 p480Var = this.m;
        if (!(p480Var instanceof efn)) {
            if (j == 0 || !(p480Var instanceof uva)) {
                this.i = 0L;
                return;
            } else {
                uva uvaVar = (uva) p480Var;
                this.i = (Math.max(0L, j - uvaVar.b) * 8000000) / ((long) uvaVar.e);
                return;
            }
        }
        efn efnVar = (efn) p480Var;
        jjt jjtVar = efnVar.b;
        long jC = jjtVar.a == 0 ? -9223372036854775807L : jjtVar.c(jrh0.b(efnVar.a, j));
        this.i = jC;
        if (Math.abs(this.o - jC) < 20000) {
            return;
        }
        this.n = true;
        this.l = this.b;
    }

    public final int d(l4h l4hVar) throws ssz {
        boolean z;
        l4hVar.e();
        byte[] bArr = this.a;
        l4hVar.m(bArr, 0, 1);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw ssz.a(null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.c) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? r[i] : q[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw ssz.a(null, sb.toString());
    }

    public final boolean f(l4h l4hVar) {
        l4hVar.e();
        byte[] bArr = s;
        byte[] bArr2 = new byte[bArr.length];
        l4hVar.m(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            l4hVar.l(bArr.length);
            return true;
        }
        l4hVar.e();
        byte[] bArr3 = t;
        byte[] bArr4 = new byte[bArr3.length];
        l4hVar.m(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        l4hVar.l(bArr3.length);
        return true;
    }

    @Override // defpackage.k4h
    public final void l(m4h m4hVar) {
        this.j = m4hVar;
        njg0 njg0VarR = m4hVar.r(0, 1);
        this.k = njg0VarR;
        this.l = njg0VarR;
        m4hVar.n();
    }

    @Override // defpackage.k4h
    public final void release() {
    }
}
