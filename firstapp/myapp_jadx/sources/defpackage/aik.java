package defpackage;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class aik {
    public ByteBuffer b;
    public zhk c;
    public final byte[] a = new byte[256];
    public int d = 0;

    public final boolean a() {
        return this.c.b != 0;
    }

    public final zhk b() {
        byte[] bArr;
        if (this.b == null) {
            ib5.a("You must call setData() before parseHeader()");
            return null;
        }
        if (a()) {
            return this.c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) c());
        }
        boolean zStartsWith = sb.toString().startsWith("GIF");
        zhk zhkVar = this.c;
        if (zStartsWith) {
            zhkVar.f = this.b.getShort();
            this.c.g = this.b.getShort();
            int iC = c();
            zhk zhkVar2 = this.c;
            zhkVar2.h = (iC & 128) != 0;
            zhkVar2.i = (int) Math.pow(2.0d, (iC & 7) + 1);
            this.c.j = c();
            zhk zhkVar3 = this.c;
            c();
            zhkVar3.getClass();
            if (this.c.h && !a()) {
                zhk zhkVar4 = this.c;
                zhkVar4.a = e(zhkVar4.i);
                zhk zhkVar5 = this.c;
                zhkVar5.k = zhkVar5.a[zhkVar5.j];
            }
        } else {
            zhkVar.b = 1;
        }
        if (!a()) {
            boolean z = false;
            while (!z && !a() && this.c.c <= Integer.MAX_VALUE) {
                int iC2 = c();
                if (iC2 == 33) {
                    int iC3 = c();
                    if (iC3 == 1) {
                        f();
                    } else if (iC3 == 249) {
                        this.c.d = new whk();
                        c();
                        int iC4 = c();
                        whk whkVar = this.c.d;
                        int i2 = (iC4 & 28) >> 2;
                        whkVar.g = i2;
                        if (i2 == 0) {
                            whkVar.g = 1;
                        }
                        whkVar.f = (iC4 & 1) != 0;
                        short s = this.b.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        whk whkVar2 = this.c.d;
                        whkVar2.i = s * 10;
                        whkVar2.h = c();
                        c();
                    } else if (iC3 == 254) {
                        f();
                    } else if (iC3 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.a;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    this.c.l = (bArr[1] & 255) | ((bArr[2] & 255) << 8);
                                }
                                if (this.d <= 0) {
                                    break;
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (iC2 == 44) {
                    zhk zhkVar6 = this.c;
                    if (zhkVar6.d == null) {
                        zhkVar6.d = new whk();
                    }
                    this.c.d.a = this.b.getShort();
                    this.c.d.b = this.b.getShort();
                    this.c.d.c = this.b.getShort();
                    this.c.d.d = this.b.getShort();
                    int iC5 = c();
                    boolean z2 = (iC5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iC5 & 7) + 1);
                    whk whkVar3 = this.c.d;
                    whkVar3.e = (iC5 & 64) != 0;
                    if (z2) {
                        whkVar3.k = e(iPow);
                    } else {
                        whkVar3.k = null;
                    }
                    this.c.d.j = this.b.position();
                    c();
                    f();
                    if (!a()) {
                        zhk zhkVar7 = this.c;
                        zhkVar7.c++;
                        zhkVar7.e.add(zhkVar7.d);
                    }
                } else if (iC2 != 59) {
                    this.c.b = 1;
                } else {
                    z = true;
                }
            }
            zhk zhkVar8 = this.c;
            if (zhkVar8.c < 0) {
                zhkVar8.b = 1;
            }
        }
        return this.c;
    }

    public final int c() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    public final void d() {
        int iC = c();
        this.d = iC;
        if (iC <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                int i3 = this.d;
                if (i >= i3) {
                    return;
                }
                i2 = i3 - i;
                this.b.get(this.a, i, i2);
                i += i2;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbA = dy5.a("Error Reading Block n: ", i, i2, " count: ", " blockSize: ");
                    sbA.append(this.d);
                    Log.d("GifHeaderParser", sbA.toString(), e);
                }
                this.c.b = 1;
                return;
            }
        }
    }

    public final int[] e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & 255;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | (-16777216) | (bArr[i5] & 255);
                i2 = i7;
            }
            return iArr;
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.c.b = 1;
            return iArr;
        }
    }

    public final void f() {
        int iC;
        do {
            iC = c();
            this.b.position(Math.min(this.b.position() + iC, this.b.limit()));
        } while (iC > 0);
    }
}
