package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.protobuf.Reader;

/* JADX INFO: loaded from: classes.dex */
public final class qkf0 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public muj0 e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final Paint.FontMetricsInt l;
    public final int m;
    public final bfs[] n;
    public final Rect o = new Rect();
    public csr p;

    /* JADX WARN: Code duplicated, block: B:100:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:104:0x0200 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x0206  */
    /* JADX WARN: Code duplicated, block: B:108:0x020e  */
    /* JADX WARN: Code duplicated, block: B:111:0x023e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0243  */
    /* JADX WARN: Code duplicated, block: B:123:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:133:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x011c A[PHI: r12
      0x011c: PHI (r12v8 int) = (r12v7 int), (r12v10 int) binds: [B:61:0x012e, B:54:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x0195  */
    /* JADX WARN: Code duplicated, block: B:85:0x0197  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:97:0x01de  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r26v1, types: [boolean] */
    public qkf0(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, hsr hsrVar) {
        Layout.Alignment alignment;
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutA;
        boolean z2;
        int i10;
        char c;
        int i11;
        long j;
        boolean z3;
        CharSequence text;
        bfs[] bfsVarArr;
        long j2;
        int i12;
        Layout layout;
        int i13;
        boolean z4;
        ?? r14;
        int length;
        int i14;
        int iMax;
        int iMax2;
        long j3;
        int i15;
        boolean zA;
        this.a = textPaint;
        this.b = truncateAt;
        this.c = z;
        int length2 = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicA = wkf0.a(i2);
        Layout.Alignment alignment2 = hdf0.a;
        if (i == 0) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i == 1) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i != 3) {
            alignment = i != 4 ? Layout.Alignment.ALIGN_NORMAL : hdf0.b;
        } else {
            alignment = hdf0.a;
        }
        boolean z5 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length2, u82.class) < length2;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = hsrVar.a();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (metricsA == null || hsrVar.c() > f || z5) {
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicA;
                layoutA = pyd0.a(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
                z2 = false;
            } else {
                if (iCeil < 0) {
                    xkn.a("negative width");
                }
                if (iCeil < 0) {
                    xkn.a("negative ellipsized width");
                }
                layoutA = Build.VERSION.SDK_INT >= 33 ? q35.a(charSequence, textPaint, iCeil, alignment, metricsA, z, truncateAt, iCeil) : new BoringLayout(charSequence, textPaint, iCeil, alignment, 1.0f, 0.0f, metricsA, z, truncateAt, iCeil);
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicA;
                z2 = true;
            }
            this.f = layoutA;
            Trace.endSection();
            int iMin = Math.min(layoutA.getLineCount(), i9);
            this.g = iMin;
            int i16 = iMin - 1;
            this.d = iMin >= i9 && (layoutA.getEllipsisCount(i16) > 0 || layoutA.getLineEnd(i16) != charSequence.length());
            long j4 = wkf0.b;
            long j5 = 4294967295L;
            if (!z) {
                if (z2) {
                    BoringLayout boringLayout = (BoringLayout) layoutA;
                    i10 = 33;
                    if (Build.VERSION.SDK_INT >= 33) {
                        zA = r35.b(boringLayout);
                    } else {
                        zA = false;
                    }
                } else {
                    i10 = 33;
                    StaticLayout staticLayout = (StaticLayout) layoutA;
                    int i17 = Build.VERSION.SDK_INT;
                    if (i17 >= 33) {
                        zA = nyd0.a(staticLayout);
                    } else if (i17 >= 28) {
                        zA = true;
                    } else {
                        zA = false;
                    }
                }
                if (!zA) {
                    TextPaint paint = layoutA.getPaint();
                    CharSequence text2 = layoutA.getText();
                    i11 = 0;
                    Rect rectA = brz.a(paint, text2, layoutA.getLineStart(0), layoutA.getLineEnd(0));
                    int lineAscent = layoutA.getLineAscent(0);
                    c = ' ';
                    int i18 = rectA.top;
                    int topPadding = i18 < lineAscent ? lineAscent - i18 : layoutA.getTopPadding();
                    z3 = true;
                    rectA = iMin != 1 ? brz.a(paint, text2, layoutA.getLineStart(i16), layoutA.getLineEnd(i16)) : rectA;
                    int lineDescent = layoutA.getLineDescent(i16);
                    int i19 = rectA.bottom;
                    int bottomPadding = i19 > lineDescent ? i19 - lineDescent : layoutA.getBottomPadding();
                    j = (topPadding == 0 && bottomPadding == 0) ? j : (((long) bottomPadding) & 4294967295L) | (((long) topPadding) << 32);
                    Paint.FontMetricsInt fontMetricsInt = null;
                    if (layoutA.getText() instanceof Spanned) {
                        text = layoutA.getText();
                        text.getClass();
                        if (!mvo.a((Spanned) text, bfs.class) || layoutA.getText().length() <= 0) {
                            CharSequence text3 = layoutA.getText();
                            text3.getClass();
                            bfsVarArr = (bfs[]) ((Spanned) text3).getSpans(i11, layoutA.getText().length(), bfs.class);
                        } else {
                            bfsVarArr = null;
                        }
                    } else {
                        bfsVarArr = null;
                    }
                    this.n = bfsVarArr;
                    if (bfsVarArr != null) {
                        length = bfsVarArr.length;
                        i14 = i11;
                        iMax = i14;
                        iMax2 = iMax;
                        while (i14 < length) {
                            boolean z6 = z3;
                            bfs bfsVar = bfsVarArr[i14];
                            long j6 = j5;
                            int i20 = bfsVar.z;
                            iMax = i20 < 0 ? Math.max(iMax, Math.abs(i20)) : iMax;
                            i15 = bfsVar.A;
                            if (i15 < 0) {
                                iMax2 = Math.max(iMax, Math.abs(i15));
                            }
                            i14++;
                            j5 = j6;
                            z3 = z6;
                        }
                        j2 = j5;
                        if (iMax == 0 || iMax2 != 0) {
                            j3 = (((long) iMax) << c) | (((long) iMax2) & j2);
                        } else {
                            j3 = wkf0.b;
                        }
                        j4 = j3;
                    } else {
                        j2 = 4294967295L;
                    }
                    this.h = Math.max((int) (j >> c), (int) (j4 >> c));
                    this.i = Math.max((int) (j & j2), (int) (j4 & j2));
                    TextPaint textPaint2 = this.a;
                    bfs[] bfsVarArr2 = this.n;
                    i12 = this.g - 1;
                    layout = this.f;
                    if (layout.getLineStart(i12) == layout.getLineEnd(i12) || bfsVarArr2 == null || bfsVarArr2.length == 0) {
                        i13 = i11;
                    } else {
                        SpannableString spannableString = new SpannableString("\u200b");
                        bfs bfsVar2 = (bfs) ay0.w(bfsVarArr2);
                        int length3 = spannableString.length();
                        if (i12 == 0 || !(z4 = bfsVar2.d)) {
                            boolean z7 = bfsVar2.d;
                            z4 = z7 ? 1 : 0;
                            r14 = z7;
                        } else {
                            r14 = i11;
                        }
                        spannableString.setSpan(new bfs(bfsVar2.a, length3, r14, z4, bfsVar2.e, bfsVar2.f), i11, spannableString.length(), i10);
                        i13 = i11;
                        StaticLayout staticLayoutA = pyd0.a(spannableString, textPaint2, Reader.READ_DONE, spannableString.length(), textDirectionHeuristic, trr.a, Reader.READ_DONE, null, Reader.READ_DONE, 0, this.c, 0, 0, 0, 0);
                        fontMetricsInt = new Paint.FontMetricsInt();
                        fontMetricsInt.ascent = staticLayoutA.getLineAscent(i13);
                        fontMetricsInt.descent = staticLayoutA.getLineDescent(i13);
                        fontMetricsInt.top = staticLayoutA.getLineTop(i13);
                        fontMetricsInt.bottom = staticLayoutA.getLineBottom(i13);
                    }
                    this.m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e(i16) - g(i16))) : i13;
                    this.l = fontMetricsInt;
                    Layout layout2 = this.f;
                    this.j = afn.a(layout2, i16, layout2.getPaint());
                    Layout layout3 = this.f;
                    this.k = afn.b(layout3, i16, layout3.getPaint());
                }
                j = j4;
                Paint.FontMetricsInt fontMetricsInt2 = null;
                if (layoutA.getText() instanceof Spanned) {
                    bfsVarArr = null;
                } else {
                    text = layoutA.getText();
                    text.getClass();
                    if (mvo.a((Spanned) text, bfs.class)) {
                    }
                    CharSequence text4 = layoutA.getText();
                    text4.getClass();
                    bfsVarArr = (bfs[]) ((Spanned) text4).getSpans(i11, layoutA.getText().length(), bfs.class);
                }
                this.n = bfsVarArr;
                if (bfsVarArr != null) {
                    length = bfsVarArr.length;
                    i14 = i11;
                    iMax = i14;
                    iMax2 = iMax;
                    while (i14 < length) {
                        boolean z8 = z3;
                        bfs bfsVar3 = bfsVarArr[i14];
                        long j7 = j5;
                        int i21 = bfsVar3.z;
                        if (i21 < 0) {
                        }
                        i15 = bfsVar3.A;
                        if (i15 < 0) {
                            iMax2 = Math.max(iMax, Math.abs(i15));
                        }
                        i14++;
                        j5 = j7;
                        z3 = z8;
                    }
                    j2 = j5;
                    if (iMax == 0) {
                        j3 = (((long) iMax) << c) | (((long) iMax2) & j2);
                    } else {
                        j3 = (((long) iMax) << c) | (((long) iMax2) & j2);
                    }
                    j4 = j3;
                } else {
                    j2 = 4294967295L;
                }
                this.h = Math.max((int) (j >> c), (int) (j4 >> c));
                this.i = Math.max((int) (j & j2), (int) (j4 & j2));
                TextPaint textPaint3 = this.a;
                bfs[] bfsVarArr3 = this.n;
                i12 = this.g - 1;
                layout = this.f;
                if (layout.getLineStart(i12) == layout.getLineEnd(i12)) {
                    i13 = i11;
                } else {
                    i13 = i11;
                }
                this.m = fontMetricsInt2 != null ? fontMetricsInt2.bottom - ((int) (e(i16) - g(i16))) : i13;
                this.l = fontMetricsInt2;
                Layout layout4 = this.f;
                this.j = afn.a(layout4, i16, layout4.getPaint());
                Layout layout5 = this.f;
                this.k = afn.b(layout5, i16, layout5.getPaint());
            }
            i10 = 33;
            c = ' ';
            z3 = true;
            i11 = 0;
            j = j4;
            Paint.FontMetricsInt fontMetricsInt3 = null;
            if (layoutA.getText() instanceof Spanned) {
                bfsVarArr = null;
            } else {
                text = layoutA.getText();
                text.getClass();
                if (mvo.a((Spanned) text, bfs.class)) {
                }
                CharSequence text5 = layoutA.getText();
                text5.getClass();
                bfsVarArr = (bfs[]) ((Spanned) text5).getSpans(i11, layoutA.getText().length(), bfs.class);
            }
            this.n = bfsVarArr;
            if (bfsVarArr != null) {
                length = bfsVarArr.length;
                i14 = i11;
                iMax = i14;
                iMax2 = iMax;
                while (i14 < length) {
                    boolean z9 = z3;
                    bfs bfsVar4 = bfsVarArr[i14];
                    long j8 = j5;
                    int i22 = bfsVar4.z;
                    if (i22 < 0) {
                    }
                    i15 = bfsVar4.A;
                    if (i15 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i15));
                    }
                    i14++;
                    j5 = j8;
                    z3 = z9;
                }
                j2 = j5;
                if (iMax == 0) {
                    j3 = (((long) iMax) << c) | (((long) iMax2) & j2);
                } else {
                    j3 = (((long) iMax) << c) | (((long) iMax2) & j2);
                }
                j4 = j3;
            } else {
                j2 = 4294967295L;
            }
            this.h = Math.max((int) (j >> c), (int) (j4 >> c));
            this.i = Math.max((int) (j & j2), (int) (j4 & j2));
            TextPaint textPaint4 = this.a;
            bfs[] bfsVarArr4 = this.n;
            i12 = this.g - 1;
            layout = this.f;
            if (layout.getLineStart(i12) == layout.getLineEnd(i12)) {
                i13 = i11;
            } else {
                i13 = i11;
            }
            this.m = fontMetricsInt3 != null ? fontMetricsInt3.bottom - ((int) (e(i16) - g(i16))) : i13;
            this.l = fontMetricsInt3;
            Layout layout6 = this.f;
            this.j = afn.a(layout6, i16, layout6.getPaint());
            Layout layout7 = this.f;
            this.k = afn.b(layout7, i16, layout7.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z = this.d;
        Layout layout = this.f;
        return (z ? layout.getLineBottom(this.g - 1) : layout.getHeight()) + this.h + this.i + this.m;
    }

    public final float b(int i) {
        if (i == this.g - 1) {
            return this.j + this.k;
        }
        return 0.0f;
    }

    public final csr c() {
        csr csrVar = this.p;
        if (csrVar != null) {
            return csrVar;
        }
        csr csrVar2 = new csr(this.f);
        this.p = csrVar2;
        return csrVar2;
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.h + ((i != this.g + (-1) || (fontMetricsInt = this.l) == null) ? this.f.getLineBaseline(i) : g(i) - fontMetricsInt.ascent);
    }

    public final float e(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.g;
        int i3 = i2 - 1;
        Layout layout = this.f;
        if (i != i3 || (fontMetricsInt = this.l) == null) {
            return this.h + layout.getLineBottom(i) + (i == i2 + (-1) ? this.i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i) {
        idf0 idf0Var = wkf0.a;
        Layout layout = this.f;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final float g(int i) {
        return this.f.getLineTop(i) + (i == 0 ? 0 : this.h);
    }

    public final float h(int i, boolean z) {
        return b(this.f.getLineForOffset(i)) + c().c(i, true, z);
    }

    public final float i(int i, boolean z) {
        return b(this.f.getLineForOffset(i)) + c().c(i, false, z);
    }

    public final muj0 j() {
        muj0 muj0Var = this.e;
        if (muj0Var != null) {
            return muj0Var;
        }
        Layout layout = this.f;
        muj0 muj0Var2 = new muj0(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.e = muj0Var2;
        return muj0Var2;
    }
}
