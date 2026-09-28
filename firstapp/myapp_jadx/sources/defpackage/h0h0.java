package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h0h0 implements ree0 {
    public final nsz a = new nsz();
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final float f;
    public final int g;

    public h0h0(List<byte[]> list) {
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.c = 0;
            this.d = -1;
            this.e = "sans-serif";
            this.b = false;
            this.f = 0.85f;
            this.g = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.c = bArr[24];
        this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        int length = bArr.length - 43;
        String str = jrh0.a;
        this.e = "Serif".equals(new String(bArr, 43, length, StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.g = i;
        boolean z = (bArr[0] & 32) != 0;
        this.b = z;
        if (z) {
            this.f = jrh0.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f = 0.85f;
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void d(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ree0
    public final void a(byte[] bArr, int i, int i2, ree0.b bVar, oya<q4c> oyaVar) {
        String strU;
        int i3;
        nsz nszVar = this.a;
        nszVar.G(i + i2, bArr);
        nszVar.I(i);
        int i4 = 1;
        int i5 = 0;
        int i6 = 2;
        ly0.b(nszVar.a() >= 2);
        int iC = nszVar.C();
        if (iC == 0) {
            strU = "";
        } else {
            int i7 = nszVar.b;
            Charset charsetE = nszVar.E();
            int i8 = iC - (nszVar.b - i7);
            if (charsetE == null) {
                charsetE = StandardCharsets.UTF_8;
            }
            strU = nszVar.u(i8, charsetE);
        }
        if (strU.isEmpty()) {
            pcn.b bVar2 = pcn.b;
            oyaVar.accept(new q4c(-9223372036854775807L, -9223372036854775807L, c150.e));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strU);
        d(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        c(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        int length = spannableStringBuilder.length();
        String str = this.e;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fH = this.f;
        while (nszVar.a() >= 8) {
            int i9 = nszVar.b;
            int iJ = nszVar.j();
            int iJ2 = nszVar.j();
            if (iJ2 == 1937013100) {
                ly0.b(nszVar.a() >= i6 ? i4 : i5);
                int iC2 = nszVar.C();
                int i10 = i5;
                while (i10 < iC2) {
                    ly0.b(nszVar.a() >= 12 ? i4 : i5);
                    int iC3 = nszVar.C();
                    int iC4 = nszVar.C();
                    nszVar.J(i6);
                    int i11 = i10;
                    int iW = nszVar.w();
                    nszVar.J(i4);
                    int iJ3 = nszVar.j();
                    if (iC4 > spannableStringBuilder.length()) {
                        StringBuilder sbA = efe0.a(iC4, "Truncating styl end (", ") to cueText.length() (");
                        sbA.append(spannableStringBuilder.length());
                        sbA.append(").");
                        cft.g("Tx3gParser", sbA.toString());
                        iC4 = spannableStringBuilder.length();
                    }
                    if (iC3 >= iC4) {
                        cft.g("Tx3gParser", n36.a("Ignoring styl with start (", iC3, iC4, ") >= end (", ")."));
                    } else {
                        int i12 = iC4;
                        d(spannableStringBuilder, iW, this.c, iC3, i12, 0);
                        c(spannableStringBuilder, iJ3, this.d, iC3, i12, 0);
                    }
                    i10 = i11 + 1;
                    i4 = 1;
                    i5 = 0;
                    i6 = 2;
                }
                i3 = i6;
            } else if (iJ2 == 1952608120 && this.b) {
                i3 = 2;
                ly0.b(nszVar.a() >= 2);
                fH = jrh0.h(nszVar.C() / this.g, 0.0f, 0.95f);
            } else {
                i3 = 2;
            }
            nszVar.I(i9 + iJ);
            i6 = i3;
            i4 = 1;
            i5 = 0;
        }
        j4c.a aVar = new j4c.a();
        aVar.a = spannableStringBuilder;
        aVar.b = null;
        aVar.e = fH;
        aVar.f = 0;
        aVar.g = 0;
        oyaVar.accept(new q4c(-9223372036854775807L, -9223372036854775807L, pcn.n(aVar.a())));
    }
}
