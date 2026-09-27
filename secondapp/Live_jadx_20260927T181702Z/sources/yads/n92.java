package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class n92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o92 f152948a = new o92();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f152949b = new jb2(0, new byte[65025]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f152950c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f152951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f152952e;

    public final boolean a(ld0 ld0Var) throws InterruptedIOException {
        int i10;
        int i11;
        int i12;
        if (this.f152952e) {
            this.f152952e = false;
            this.f152949b.c(0);
        }
        while (true) {
            if (this.f152952e) {
                return true;
            }
            if (this.f152950c < 0) {
                if (this.f152948a.a(ld0Var, -1L) && this.f152948a.a(ld0Var, true)) {
                    o92 o92Var = this.f152948a;
                    int i13 = o92Var.f153412d;
                    if ((o92Var.f153409a & 1) == 1 && this.f152949b.f151003c == 0) {
                        this.f152951d = 0;
                        int i14 = 0;
                        do {
                            int i15 = this.f152951d;
                            o92 o92Var2 = this.f152948a;
                            if (i15 >= o92Var2.f153411c) {
                                break;
                            }
                            int[] iArr = o92Var2.f153414f;
                            this.f152951d = i15 + 1;
                            i12 = iArr[i15];
                            i14 += i12;
                        } while (i12 == 255);
                        i13 += i14;
                        i11 = this.f152951d;
                    } else {
                        i11 = 0;
                    }
                    try {
                        ld0Var.a(i13);
                        this.f152950c = i11;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int i16 = this.f152950c;
            this.f152951d = 0;
            int i17 = 0;
            do {
                int i18 = this.f152951d;
                int i19 = i16 + i18;
                o92 o92Var3 = this.f152948a;
                if (i19 >= o92Var3.f153411c) {
                    break;
                }
                int[] iArr2 = o92Var3.f153414f;
                this.f152951d = i18 + 1;
                i10 = iArr2[i19];
                i17 += i10;
            } while (i10 == 255);
            int i20 = this.f152950c + this.f152951d;
            if (i17 > 0) {
                jb2 jb2Var = this.f152949b;
                jb2Var.a(jb2Var.f151003c + i17);
                jb2 jb2Var2 = this.f152949b;
                try {
                    ld0Var.a(jb2Var2.f151001a, jb2Var2.f151003c, i17, false);
                    jb2 jb2Var3 = this.f152949b;
                    jb2Var3.d(jb2Var3.f151003c + i17);
                    this.f152952e = this.f152948a.f153414f[i20 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i20 == this.f152948a.f153411c) {
                i20 = -1;
            }
            this.f152950c = i20;
        }
    }

    public final void a() {
        jb2 jb2Var = this.f152949b;
        byte[] bArr = jb2Var.f151001a;
        if (bArr.length == 65025) {
            return;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, Math.max(65025, jb2Var.f151003c));
        int i10 = this.f152949b.f151003c;
        jb2Var.f151001a = bArrCopyOf;
        jb2Var.f151003c = i10;
        jb2Var.f151002b = 0;
    }
}
