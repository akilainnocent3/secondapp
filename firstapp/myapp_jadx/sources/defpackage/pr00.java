package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class pr00 implements ree0 {
    public final nsz a = new nsz();
    public final nsz b = new nsz();
    public final a c = new a();
    public Inflater d;

    public static final class a {
        public final nsz a = new nsz();
        public final int[] b = new int[256];
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0081  */
    @Override // defpackage.ree0
    public final void a(byte[] bArr, int i, int i2, ree0.b bVar, oya<q4c> oyaVar) {
        a aVar;
        j4c j4cVarA;
        int i3;
        int i4;
        int iW;
        int i5;
        int i6;
        int iZ;
        a aVar2 = this.c;
        int[] iArr = aVar2.b;
        nsz nszVar = aVar2.a;
        nsz nszVar2 = this.a;
        nszVar2.G(i + i2, bArr);
        nszVar2.I(i);
        Inflater inflater = this.d;
        if (inflater == null) {
            inflater = new Inflater();
            this.d = inflater;
        }
        String str = jrh0.a;
        if (nszVar2.a() > 0 && (nszVar2.a[nszVar2.b] & 255) == 120) {
            nsz nszVar3 = this.b;
            if (jrh0.I(nszVar2, nszVar3, inflater)) {
                nszVar2.G(nszVar3.c, nszVar3.a);
            }
        }
        int i7 = 0;
        aVar2.d = 0;
        aVar2.e = 0;
        aVar2.f = 0;
        aVar2.g = 0;
        aVar2.h = 0;
        aVar2.i = 0;
        nszVar.F(0);
        aVar2.c = false;
        ArrayList arrayList = new ArrayList();
        while (nszVar2.a() >= 3) {
            int i8 = nszVar2.c;
            int iW2 = nszVar2.w();
            int iC = nszVar2.C();
            int i9 = nszVar2.b + iC;
            if (i9 > i8) {
                nszVar2.I(i8);
                i3 = i7;
                aVar = aVar2;
                j4cVarA = null;
            } else {
                char c = 128;
                if (iW2 != 128) {
                    switch (iW2) {
                        case 20:
                            if (iC % 5 == 2) {
                                nszVar2.J(2);
                                Arrays.fill(iArr, i7);
                                int i10 = iC / 5;
                                int i11 = i7;
                                while (i11 < i10) {
                                    int iW3 = nszVar2.w();
                                    char c2 = c;
                                    double dW = nszVar2.w();
                                    double dW2 = nszVar2.w() - 128;
                                    double dW3 = nszVar2.w() - 128;
                                    iArr[iW3] = jrh0.i((int) ((dW3 * 1.772d) + dW), 0, 255) | (nszVar2.w() << 24) | (jrh0.i((int) ((1.402d * dW2) + dW), 0, 255) << 16) | (jrh0.i((int) ((dW - (0.34414d * dW3)) - (dW2 * 0.71414d)), 0, 255) << 8);
                                    i11++;
                                    c = c2;
                                    aVar2 = aVar2;
                                }
                                aVar = aVar2;
                                aVar.c = true;
                            } else {
                                aVar = aVar2;
                            }
                            break;
                        case 21:
                            if (iC >= 4) {
                                nszVar2.J(3);
                                int i12 = iC - 4;
                                if (((128 & nszVar2.w()) != 0 ? 1 : i7) == 0) {
                                    i5 = nszVar.b;
                                    i6 = nszVar.c;
                                    if (i5 < i6 && i12 > 0) {
                                        int iMin = Math.min(i12, i6 - i5);
                                        nszVar2.h(nszVar.a, i5, iMin);
                                        nszVar.I(i5 + iMin);
                                    }
                                } else if (i12 >= 7 && (iZ = nszVar2.z()) >= 4) {
                                    aVar2.h = nszVar2.C();
                                    aVar2.i = nszVar2.C();
                                    nszVar.F(iZ - 4);
                                    i12 = iC - 11;
                                    i5 = nszVar.b;
                                    i6 = nszVar.c;
                                    if (i5 < i6) {
                                        int iMin2 = Math.min(i12, i6 - i5);
                                        nszVar2.h(nszVar.a, i5, iMin2);
                                        nszVar.I(i5 + iMin2);
                                    }
                                }
                            }
                            aVar = aVar2;
                            break;
                        case 22:
                            if (iC >= 19) {
                                aVar2.d = nszVar2.C();
                                aVar2.e = nszVar2.C();
                                nszVar2.J(11);
                                aVar2.f = nszVar2.C();
                                aVar2.g = nszVar2.C();
                            }
                            aVar = aVar2;
                            break;
                        default:
                            aVar = aVar2;
                            break;
                    }
                    j4cVarA = null;
                    i3 = 0;
                } else {
                    aVar = aVar2;
                    if (aVar.d == 0 || aVar.e == 0 || aVar.h == 0 || aVar.i == 0 || (i4 = nszVar.c) == 0 || nszVar.b != i4 || !aVar.c) {
                        j4cVarA = null;
                    } else {
                        nszVar.I(0);
                        int i13 = aVar.h * aVar.i;
                        int[] iArr2 = new int[i13];
                        int i14 = 0;
                        while (i14 < i13) {
                            int iW4 = nszVar.w();
                            if (iW4 != 0) {
                                iW = i14 + 1;
                                iArr2[i14] = iArr[iW4];
                            } else {
                                int iW5 = nszVar.w();
                                if (iW5 != 0) {
                                    iW = ((iW5 & 64) == 0 ? iW5 & 63 : ((iW5 & 63) << 8) | nszVar.w()) + i14;
                                    Arrays.fill(iArr2, i14, iW, (iW5 & 128) == 0 ? iArr[0] : iArr[nszVar.w()]);
                                }
                            }
                            i14 = iW;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, aVar.h, aVar.i, Bitmap.Config.ARGB_8888);
                        j4c.a aVar3 = new j4c.a();
                        aVar3.b = bitmapCreateBitmap;
                        aVar3.a = null;
                        float f = aVar.f;
                        float f2 = aVar.d;
                        aVar3.h = f / f2;
                        aVar3.i = 0;
                        float f3 = aVar.g;
                        float f4 = aVar.e;
                        aVar3.e = f3 / f4;
                        aVar3.f = 0;
                        aVar3.g = 0;
                        aVar3.l = aVar.h / f2;
                        aVar3.m = aVar.i / f4;
                        j4cVarA = aVar3.a();
                    }
                    i3 = 0;
                    aVar.d = 0;
                    aVar.e = 0;
                    aVar.f = 0;
                    aVar.g = 0;
                    aVar.h = 0;
                    aVar.i = 0;
                    nszVar.F(0);
                    aVar.c = false;
                }
                nszVar2.I(i9);
            }
            if (j4cVarA != null) {
                arrayList.add(j4cVarA);
            }
            aVar2 = aVar;
            i7 = i3;
        }
        oyaVar.accept(new q4c(-9223372036854775807L, -9223372036854775807L, arrayList));
    }
}
