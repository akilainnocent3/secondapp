package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.sportybet.android.instantwin.newtork.model.response.recommendation.TL.UccrWswQGaIj;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class vni0 implements ree0 {
    public final nsz a = new nsz();
    public final nsz b = new nsz();
    public final a c;
    public Inflater d;

    public static final class a {
        public boolean b;
        public boolean c;
        public int[] d;
        public int e;
        public int f;
        public Rect g;
        public final int[] a = new int[4];
        public int h = -1;
        public int i = -1;

        public static int a(int[] iArr, int i) {
            return (i < 0 || i >= iArr.length) ? iArr[0] : iArr[i];
        }

        public static int c(int i, int i2) {
            return (i & 16777215) | ((i2 * 17) << 24);
        }

        public final void b(msz mszVar, boolean z, Rect rect, int[] iArr) {
            int i;
            int i2;
            int iWidth = rect.width();
            int iHeight = rect.height();
            int i3 = !z ? 1 : 0;
            int i4 = i3 * iWidth;
            while (true) {
                int i5 = 0;
                do {
                    int i6 = 1;
                    int iG = 0;
                    while (true) {
                        if (iG >= i6 || i6 > 64) {
                            i = iG & 3;
                            if (iG >= 4) {
                                i2 = iG >> 2;
                                break;
                            } else {
                                i2 = iWidth;
                                break;
                            }
                        }
                        if (mszVar.b() < 4) {
                            i = -1;
                            i2 = 0;
                            break;
                        } else {
                            iG = (iG << 4) | mszVar.g(4);
                            i6 <<= 2;
                        }
                    }
                    int iMin = Math.min(i2, iWidth - i5);
                    if (iMin > 0) {
                        int i7 = i4 + iMin;
                        Arrays.fill(iArr, i4, i7, this.a[i]);
                        i5 += iMin;
                        i4 = i7;
                    }
                } while (i5 < iWidth);
                i3 += 2;
                if (i3 >= iHeight) {
                    return;
                }
                i4 = i3 * iWidth;
                mszVar.c();
            }
        }
    }

    @Override // defpackage.ree0
    public final void a(byte[] bArr, int i, int i2, ree0.b bVar, oya<q4c> oyaVar) {
        c150 c150VarN;
        Rect rect;
        nsz nszVar = this.a;
        nszVar.G(i + i2, bArr);
        nszVar.I(i);
        Inflater inflater = this.d;
        if (inflater == null) {
            inflater = new Inflater();
            this.d = inflater;
        }
        String str = jrh0.a;
        if (nszVar.a() > 0 && (nszVar.a[nszVar.b] & 255) == 120) {
            nsz nszVar2 = this.b;
            if (jrh0.I(nszVar, nszVar2, inflater)) {
                nszVar.G(nszVar2.c, nszVar2.a);
            }
        }
        a aVar = this.c;
        aVar.c = false;
        j4c j4cVarA = null;
        aVar.g = null;
        aVar.h = -1;
        aVar.i = -1;
        int iA = nszVar.a();
        if (iA >= 2 && nszVar.C() == iA) {
            int[] iArr = aVar.d;
            if (iArr != null && aVar.b) {
                nszVar.J(nszVar.C() - 2);
                int iC = nszVar.C();
                int[] iArr2 = aVar.a;
                while (nszVar.b < iC && nszVar.a() > 0) {
                    switch (nszVar.w()) {
                        case 0:
                        case 1:
                        case 2:
                            continue;
                        case 3:
                            if (nszVar.a() >= 2) {
                                int iW = nszVar.w();
                                int iW2 = nszVar.w();
                                iArr2[3] = a.a(iArr, iW >> 4);
                                iArr2[2] = a.a(iArr, iW & 15);
                                iArr2[1] = a.a(iArr, iW2 >> 4);
                                iArr2[0] = a.a(iArr, iW2 & 15);
                                aVar.c = true;
                            }
                            break;
                        case 4:
                            if (nszVar.a() >= 2 && aVar.c) {
                                int iW3 = nszVar.w();
                                int iW4 = nszVar.w();
                                iArr2[3] = a.c(iArr2[3], iW3 >> 4);
                                iArr2[2] = a.c(iArr2[2], iW3 & 15);
                                iArr2[1] = a.c(iArr2[1], iW4 >> 4);
                                iArr2[0] = a.c(iArr2[0], iW4 & 15);
                            }
                            break;
                        case 5:
                            if (nszVar.a() >= 6) {
                                int iW5 = nszVar.w();
                                int iW6 = nszVar.w();
                                int i3 = (iW5 << 4) | (iW6 >> 4);
                                int iW7 = ((iW6 & 15) << 8) | nszVar.w();
                                int iW8 = nszVar.w();
                                int iW9 = nszVar.w();
                                aVar.g = new Rect(i3, (iW8 << 4) | (iW9 >> 4), iW7 + 1, (((iW9 & 15) << 8) | nszVar.w()) + 1);
                            }
                            break;
                        case 6:
                            if (nszVar.a() >= 4) {
                                aVar.h = nszVar.C();
                                aVar.i = nszVar.C();
                            }
                            break;
                    }
                }
            }
            if (aVar.d != null && aVar.b && aVar.c && (rect = aVar.g) != null && aVar.h != -1 && aVar.i != -1 && rect.width() >= 2 && aVar.g.height() >= 2) {
                Rect rect2 = aVar.g;
                int[] iArr3 = new int[rect2.height() * rect2.width()];
                msz mszVar = new msz();
                nszVar.I(aVar.h);
                mszVar.l(nszVar);
                aVar.b(mszVar, true, rect2, iArr3);
                nszVar.I(aVar.i);
                mszVar.l(nszVar);
                aVar.b(mszVar, false, rect2, iArr3);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr3, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
                j4c.a aVar2 = new j4c.a();
                aVar2.b = bitmapCreateBitmap;
                aVar2.a = null;
                aVar2.h = rect2.left / aVar.e;
                aVar2.i = 0;
                aVar2.e = rect2.top / aVar.f;
                aVar2.f = 0;
                aVar2.g = 0;
                aVar2.l = rect2.width() / aVar.e;
                aVar2.m = rect2.height() / aVar.f;
                j4cVarA = aVar2.a();
            }
        }
        if (j4cVarA != null) {
            c150VarN = pcn.n(j4cVarA);
        } else {
            pcn.b bVar2 = pcn.b;
            c150VarN = c150.e;
        }
        oyaVar.accept(new q4c(-9223372036854775807L, 5000000L, c150VarN));
    }

    public vni0(List<byte[]> list) {
        int i;
        a aVar = new a();
        this.c = aVar;
        String strTrim = new String(list.get(0), StandardCharsets.UTF_8).trim();
        String str = jrh0.a;
        for (String str2 : strTrim.split(UccrWswQGaIj.fLzJhwyicQZH, -1)) {
            if (str2.startsWith("palette: ")) {
                String[] strArrSplit = str2.substring(9).split(",", -1);
                aVar.d = new int[strArrSplit.length];
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    int[] iArr = aVar.d;
                    try {
                        i = Integer.parseInt(strArrSplit[i2].trim(), 16);
                    } catch (RuntimeException unused) {
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] strArrSplit2 = str2.substring(6).trim().split("x", -1);
                if (strArrSplit2.length == 2) {
                    try {
                        aVar.e = Integer.parseInt(strArrSplit2[0]);
                        aVar.f = Integer.parseInt(strArrSplit2[1]);
                        aVar.b = true;
                    } catch (RuntimeException e) {
                        cft.h("VobsubParser", "Parsing IDX failed", e);
                    }
                }
            }
        }
    }
}
