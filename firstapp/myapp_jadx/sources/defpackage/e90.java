package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e90 {
    public final h90 a;
    public final int b;
    public final long c;
    public final qkf0 d;
    public final CharSequence e;
    public final List<lk40> f;

    /* JADX WARN: Code duplicated, block: B:104:0x015b  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:139:0x0215  */
    /* JADX WARN: Code duplicated, block: B:140:0x0218  */
    /* JADX WARN: Code duplicated, block: B:142:0x0232  */
    /* JADX WARN: Code duplicated, block: B:144:0x024c  */
    /* JADX WARN: Code duplicated, block: B:147:0x0250  */
    /* JADX WARN: Code duplicated, block: B:155:0x0287  */
    /* JADX WARN: Code duplicated, block: B:156:0x028b  */
    /* JADX WARN: Code duplicated, block: B:158:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:160:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:161:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:167:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:170:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:171:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:175:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:66:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ef  */
    /* JADX WARN: Instruction removed from duplicated block: B:156:0x028b, please report this as an issue */
    public e90(h90 h90Var, int i, int i2, long j) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        TextUtils.TruncateAt truncateAt;
        char c;
        TextUtils.TruncateAt truncateAt2;
        qkf0 qkf0VarA;
        int i9;
        e90 e90Var;
        int i10;
        Layout layout;
        Spanned spanned;
        ex80[] ex80VarArr;
        CharSequence charSequence;
        Spanned spanned2;
        ArrayList arrayList;
        int i11;
        List<lk40> list;
        int spanEnd;
        int lineForOffset;
        boolean z;
        boolean z2;
        boolean z3;
        lk40 lk40Var;
        float fE;
        float fD;
        int iB;
        float fG;
        float fB;
        float fD2;
        int i12;
        int i13;
        CharSequence charSequence2 = h90Var.h;
        this.a = h90Var;
        this.b = i;
        this.c = j;
        if (kxa.j(j) != 0 || kxa.k(j) != 0) {
            xkn.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            xkn.a("maxLines should be greater than 0");
        }
        imf0 imf0Var = h90Var.b;
        if (i2 == 2) {
            i3 = 0;
            if (!omf0.a(imf0Var.a.h, d2l.f(0)) && !omf0.a(imf0Var.a.h, omf0.c) && (i13 = imf0Var.b.a) != Integer.MIN_VALUE && i13 != 5 && i13 != 4 && charSequence2.length() != 0) {
                Spannable spannableString = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                spannableString = spannableString == null ? new SpannableString(charSequence2) : spannableString;
                if (!mvo.a(spannableString, yen.class)) {
                    spannableString.setSpan(new yen(), spannableString.length() - 1, spannableString.length() - 1, 33);
                }
                charSequence2 = spannableString;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.e = charSequence3;
        qrz qrzVar = imf0Var.b;
        ora0 ora0Var = imf0Var.a;
        int i14 = qrzVar.a;
        int i15 = i14 == 1 ? 3 : i14 == 2 ? 4 : i14 == 3 ? 2 : (i14 != 5 && i14 == 6) ? 1 : i3;
        int i16 = i14 == 4 ? 1 : i3;
        int i17 = qrzVar.h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i18 = qrzVar.g;
        int i19 = i18 & 255;
        if (i19 == 1) {
            i4 = i3;
        } else if (i19 == 2) {
            i4 = 1;
        } else if (i19 == 3) {
            i4 = 2;
        } else {
            i4 = i3;
        }
        int i20 = (i18 >> 8) & 255;
        if (i20 == 1) {
            i5 = i3;
        } else if (i20 == 2) {
            i5 = 1;
        } else if (i20 == 3) {
            i5 = 2;
        } else if (i20 == 4) {
            i5 = 3;
        } else {
            i5 = i3;
        }
        int i21 = (i18 >> 16) & 255;
        if (i21 == 1) {
            i7 = i3;
            i6 = 2;
        } else {
            i6 = 2;
            i7 = i21 == 2 ? 1 : i3;
        }
        if (i2 != i6) {
            if (i2 == 5) {
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            } else if (i2 == 4) {
                i8 = i17;
                truncateAt = TextUtils.TruncateAt.START;
                c = ' ';
            } else {
                i8 = i17;
                ora0Var = ora0Var;
                truncateAt = null;
                c = ' ';
            }
            qkf0VarA = a(i15, i16, truncateAt, i, i8, i4, i5, i7, charSequence3);
            Layout layout2 = qkf0VarA.f;
            if (Build.VERSION.SDK_INT < 35 || h90Var.g.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                i9 = 2;
                e90Var = this;
                i10 = i;
            } else {
                int ellipsisStart = layout2.getEllipsisStart(0);
                int ellipsisCount = layout2.getEllipsisCount(0) + ellipsisStart;
                i9 = 2;
                CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(ellipsisCount, charSequence3.length())};
                e90Var = this;
                i10 = i;
                qkf0VarA = e90Var.a(i15, i16, truncateAt, i10, i8, i4, i5, i7, TextUtils.concat(charSequenceArr));
            }
            int i22 = qkf0VarA.g;
            if (i2 == i9 || qkf0VarA.a() <= kxa.h(j) || i10 <= 1) {
                e90Var.d = qkf0VarA;
            } else {
                int iH = kxa.h(j);
                int i23 = 0;
                while (true) {
                    if (i23 >= i22) {
                        i23 = i22;
                        break;
                    } else if (qkf0VarA.e(i23) > iH) {
                        break;
                    } else {
                        i23++;
                    }
                }
                if (i23 >= 0 && i23 != e90Var.b) {
                    qkf0VarA = e90Var.a(i15, i16, truncateAt, i23 < 1 ? 1 : i23, i8, i4, i5, i7, e90Var.e);
                }
                e90Var.d = qkf0VarA;
            }
            ora0 ora0Var2 = ora0Var;
            e90Var.a.g.c(ora0Var2.a.e(), (((long) Float.floatToRawIntBits(e90Var.d())) & 4294967295L) | (((long) Float.floatToRawIntBits(e90Var.h())) << c), ora0Var2.a.a());
            layout = qkf0VarA.f;
            if (layout.getText() instanceof Spanned) {
                CharSequence text = layout.getText();
                text.getClass();
                spanned = (Spanned) text;
                if (spanned.nextSpanTransition(-1, spanned.length(), ex80.class) != spanned.length()) {
                    CharSequence text2 = layout.getText();
                    text2.getClass();
                    ex80VarArr = (ex80[]) ((Spanned) text2).getSpans(0, layout.getText().length(), ex80.class);
                } else {
                    ex80VarArr = null;
                }
            } else {
                ex80VarArr = null;
            }
            if (ex80VarArr != null) {
                i12 = 0;
                while (i12 < ex80VarArr.length) {
                    int i24 = i12 + 1;
                    try {
                        ((x5a0) ex80VarArr[i12].c).setValue(new yw90((((long) Float.floatToRawIntBits(e90Var.d())) & 4294967295L) | (((long) Float.floatToRawIntBits(e90Var.h())) << c)));
                        i12 = i24;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        ibh0.a(e.getMessage());
                        throw null;
                    }
                }
            }
            charSequence = e90Var.e;
            if (charSequence instanceof Spanned) {
                spanned2 = (Spanned) charSequence;
                Object[] spans = spanned2.getSpans(0, charSequence.length(), oi10.class);
                arrayList = new ArrayList(spans.length);
                for (Object obj : spans) {
                    oi10 oi10Var = (oi10) obj;
                    int spanStart = spanned2.getSpanStart(oi10Var);
                    spanEnd = spanned2.getSpanEnd(oi10Var);
                    lineForOffset = e90Var.d.f.getLineForOffset(spanStart);
                    if (lineForOffset >= e90Var.b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (e90Var.d.f.getEllipsisCount(lineForOffset) > 0 || spanEnd <= e90Var.d.f.getEllipsisStart(lineForOffset) + e90Var.d.f.getLineStart(lineForOffset)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (spanEnd > e90Var.d.f(lineForOffset)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2 && !z3 && !z) {
                        int iOrdinal = e90Var.b(spanStart).ordinal();
                        if (iOrdinal == 0) {
                            fE = e90Var.e(spanStart, true);
                        } else {
                            if (iOrdinal != 1) {
                                uhc.a();
                                throw null;
                            }
                            float fE2 = e90Var.e(spanStart, true);
                            if (!oi10Var.y) {
                                xkn.c("PlaceholderSpan is not laid out yet.");
                            }
                            fE = fE2 - oi10Var.v;
                        }
                        if (!oi10Var.y) {
                            xkn.c("PlaceholderSpan is not laid out yet.");
                        }
                        float f = oi10Var.v + fE;
                        qkf0 qkf0Var = e90Var.d;
                        switch (oi10Var.f) {
                            case 0:
                                fD = qkf0Var.d(lineForOffset);
                                iB = oi10Var.b();
                                fG = fD - iB;
                                lk40Var = new lk40(fE, fG, f, oi10Var.b() + fG);
                                break;
                            case 1:
                                fG = qkf0Var.g(lineForOffset);
                                lk40Var = new lk40(fE, fG, f, oi10Var.b() + fG);
                                break;
                            case 2:
                                fD = qkf0Var.e(lineForOffset);
                                iB = oi10Var.b();
                                fG = fD - iB;
                                lk40Var = new lk40(fE, fG, f, oi10Var.b() + fG);
                                break;
                            case 3:
                                fG = ((qkf0Var.e(lineForOffset) + qkf0Var.g(lineForOffset)) - oi10Var.b()) / 2.0f;
                                lk40Var = new lk40(fE, fG, f, oi10Var.b() + fG);
                                break;
                            case 4:
                                fB = oi10Var.a().ascent;
                                fD2 = qkf0Var.d(lineForOffset);
                                fG = fD2 + fB;
                                lk40Var = new lk40(fE, fG, f, oi10Var.b() + fG);
                                break;
                            case 5:
                                fD = qkf0Var.d(lineForOffset) + oi10Var.a().descent;
                                iB = oi10Var.b();
                                fG = fD - iB;
                                lk40Var = new lk40(fE, fG, f, oi10Var.b() + fG);
                                break;
                            case 6:
                                Paint.FontMetricsInt fontMetricsIntA = oi10Var.a();
                                fB = ((fontMetricsIntA.ascent + fontMetricsIntA.descent) - oi10Var.b()) / i9;
                                fD2 = qkf0Var.d(lineForOffset);
                                fG = fD2 + fB;
                                lk40Var = new lk40(fE, fG, f, oi10Var.b() + fG);
                                break;
                            default:
                                ib5.a("unexpected verticalAlignment");
                                throw null;
                        }
                    }
                    arrayList.add(lk40Var);
                }
                list = arrayList;
            } else {
                list = m2g.a;
            }
            e90Var.f = list;
        }
        truncateAt2 = TextUtils.TruncateAt.END;
        i8 = i17;
        truncateAt = truncateAt2;
        c = ' ';
        qkf0VarA = a(i15, i16, truncateAt, i, i8, i4, i5, i7, charSequence3);
        Layout layout3 = qkf0VarA.f;
        if (Build.VERSION.SDK_INT < 35) {
            i9 = 2;
            e90Var = this;
            i10 = i;
        } else {
            i9 = 2;
            e90Var = this;
            i10 = i;
        }
        int i25 = qkf0VarA.g;
        if (i2 == i9) {
            e90Var.d = qkf0VarA;
        } else {
            e90Var.d = qkf0VarA;
        }
        ora0 ora0Var3 = ora0Var;
        e90Var.a.g.c(ora0Var3.a.e(), (((long) Float.floatToRawIntBits(e90Var.d())) & 4294967295L) | (((long) Float.floatToRawIntBits(e90Var.h())) << c), ora0Var3.a.a());
        layout = qkf0VarA.f;
        if (layout.getText() instanceof Spanned) {
            ex80VarArr = null;
        } else {
            CharSequence text3 = layout.getText();
            text3.getClass();
            spanned = (Spanned) text3;
            if (spanned.nextSpanTransition(-1, spanned.length(), ex80.class) != spanned.length()) {
                CharSequence text4 = layout.getText();
                text4.getClass();
                ex80VarArr = (ex80[]) ((Spanned) text4).getSpans(0, layout.getText().length(), ex80.class);
            } else {
                ex80VarArr = null;
            }
        }
        if (ex80VarArr != null) {
            i12 = 0;
            while (i12 < ex80VarArr.length) {
                int i26 = i12 + 1;
                ((x5a0) ex80VarArr[i12].c).setValue(new yw90((((long) Float.floatToRawIntBits(e90Var.d())) & 4294967295L) | (((long) Float.floatToRawIntBits(e90Var.h())) << c)));
                i12 = i26;
            }
        }
        charSequence = e90Var.e;
        if (charSequence instanceof Spanned) {
            list = m2g.a;
        } else {
            spanned2 = (Spanned) charSequence;
            Object[] spans2 = spanned2.getSpans(0, charSequence.length(), oi10.class);
            arrayList = new ArrayList(spans2.length);
            while (i11 < r5) {
                oi10 oi10Var2 = (oi10) obj;
                int spanStart2 = spanned2.getSpanStart(oi10Var2);
                spanEnd = spanned2.getSpanEnd(oi10Var2);
                lineForOffset = e90Var.d.f.getLineForOffset(spanStart2);
                if (lineForOffset >= e90Var.b) {
                    z = true;
                } else {
                    z = false;
                }
                if (e90Var.d.f.getEllipsisCount(lineForOffset) > 0) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (spanEnd > e90Var.d.f(lineForOffset)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                lk40Var = z2 ? null : null;
                arrayList.add(lk40Var);
            }
            list = arrayList;
        }
        e90Var.f = list;
    }

    public final qkf0 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        sj10 sj10Var;
        float fH = h();
        h90 h90Var = this.a;
        kc0 kc0Var = h90Var.g;
        int i8 = h90Var.l;
        hsr hsrVar = h90Var.i;
        imf0 imf0Var = h90Var.b;
        f90.a aVar = f90.a;
        uk10 uk10Var = imf0Var.c;
        return new qkf0(charSequence, fH, kc0Var, i, truncateAt, i8, (uk10Var == null || (sj10Var = uk10Var.b) == null) ? false : sj10Var.a, i3, i5, i6, i7, i4, i2, hsrVar);
    }

    public final lg50 b(int i) {
        return this.d.f.isRtlCharAt(i) ? lg50.b : lg50.a;
    }

    public final float c() {
        return this.d.d(0);
    }

    public final float d() {
        return this.d.a();
    }

    public final float e(int i, boolean z) {
        qkf0 qkf0Var = this.d;
        return z ? qkf0Var.h(i, false) : qkf0Var.i(i, false);
    }

    public final float f() {
        qkf0 qkf0Var = this.d;
        return qkf0Var.d(qkf0Var.g - 1);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a4  */
    public final long g(lk40 lk40Var, int i, ojf0 ojf0Var) {
        g580 q6lVar;
        int i2;
        int[] iArrA;
        RectF rectFC = ok40.c(lk40Var);
        int i3 = (i != 0 && i == 1) ? 1 : 0;
        d90 d90Var = new d90(ojf0Var);
        qkf0 qkf0Var = this.d;
        Layout layout = qkf0Var.f;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            iArrA = i80.a(qkf0Var, rectFC, i3, d90Var);
        } else {
            csr csrVarC = qkf0Var.c();
            if (i3 == 1) {
                q6lVar = new nuj0(layout.getText(), qkf0Var.j());
            } else {
                CharSequence text = layout.getText();
                q6lVar = i4 >= 29 ? new q6l(text, qkf0Var.a) : new r6l(text);
            }
            g580 g580Var = q6lVar;
            int lineForVertical = layout.getLineForVertical((int) rectFC.top);
            if (rectFC.top <= qkf0Var.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < qkf0Var.g) {
                int i5 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFC.bottom);
                if (lineForVertical2 != 0 || rectFC.bottom >= qkf0Var.g(0)) {
                    int iB = skf0.b(qkf0Var, layout, csrVarC, i5, rectFC, g580Var, d90Var, true);
                    while (true) {
                        i2 = i5;
                        if (iB != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i5 = i2 + 1;
                        iB = skf0.b(qkf0Var, layout, csrVarC, i5, rectFC, g580Var, d90Var, true);
                    }
                    if (iB == -1) {
                        iArrA = null;
                    } else {
                        int i6 = lineForVertical2;
                        int iB2 = skf0.b(qkf0Var, layout, csrVarC, i6, rectFC, g580Var, d90Var, false);
                        while (iB2 == -1 && i2 < i6) {
                            i6--;
                            iB2 = skf0.b(qkf0Var, layout, csrVarC, i6, rectFC, g580Var, d90Var, false);
                        }
                        if (iB2 == -1) {
                            iArrA = null;
                        } else {
                            iArrA = new int[]{g580Var.c(iB + 1), g580Var.d(iB2 - 1)};
                        }
                    }
                } else {
                    iArrA = null;
                }
            } else {
                iArrA = null;
            }
        }
        return iArrA == null ? ulf0.b : vlf0.a(iArrA[0], iArrA[1]);
    }

    public final float h() {
        return kxa.i(this.c);
    }

    public final void i(lc6 lc6Var) {
        Canvas canvasC = i40.c(lc6Var);
        qkf0 qkf0Var = this.d;
        if (qkf0Var.d) {
            canvasC.save();
            canvasC.clipRect(0.0f, 0.0f, h(), d());
        }
        int i = qkf0Var.h;
        if (canvasC.getClipBounds(qkf0Var.o)) {
            if (i != 0) {
                canvasC.translate(0.0f, i);
            }
            idf0 idf0Var = wkf0.a;
            idf0Var.a = canvasC;
            qkf0Var.f.draw(idf0Var);
            if (i != 0) {
                canvasC.translate(0.0f, (-1.0f) * i);
            }
        }
        if (qkf0Var.d) {
            canvasC.restore();
        }
    }

    public final void j(lc6 lc6Var, long j, ix80 ix80Var, yef0 yef0Var, wcf wcfVar) {
        kc0 kc0Var = this.a.g;
        int i = kc0Var.c;
        kc0Var.d(j);
        kc0Var.f(ix80Var);
        kc0Var.g(yef0Var);
        kc0Var.e(wcfVar);
        kc0Var.b(3);
        i(lc6Var);
        kc0Var.b(i);
    }

    public final void k(lc6 lc6Var, ya5 ya5Var, float f, ix80 ix80Var, yef0 yef0Var, wcf wcfVar) {
        kc0 kc0Var = this.a.g;
        int i = kc0Var.c;
        float fH = h();
        kc0Var.c(ya5Var, (((long) Float.floatToRawIntBits(d())) & 4294967295L) | (Float.floatToRawIntBits(fH) << 32), f);
        kc0Var.f(ix80Var);
        kc0Var.g(yef0Var);
        kc0Var.e(wcfVar);
        kc0Var.b(3);
        i(lc6Var);
        kc0Var.b(i);
    }
}
