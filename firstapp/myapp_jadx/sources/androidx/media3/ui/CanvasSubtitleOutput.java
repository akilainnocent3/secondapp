package androidx.media3.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import defpackage.cft;
import defpackage.j4c;
import defpackage.oe6;
import defpackage.pee0;
import defpackage.vee0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class CanvasSubtitleOutput extends View implements SubtitleView.a {
    public final ArrayList a;
    public List<j4c> b;
    public int c;
    public float d;
    public oe6 e;
    public float f;

    public CanvasSubtitleOutput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
        this.b = Collections.EMPTY_LIST;
        this.c = 0;
        this.d = 0.0533f;
        this.e = oe6.g;
        this.f = 0.08f;
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public final void a(List<j4c> list, oe6 oe6Var, float f, int i, float f2) {
        this.b = list;
        this.e = oe6Var;
        this.d = f;
        this.c = i;
        this.f = f2;
        while (true) {
            ArrayList arrayList = this.a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new pee0(getContext()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:186:0x0462  */
    /* JADX WARN: Code duplicated, block: B:188:0x0465  */
    /* JADX WARN: Code duplicated, block: B:190:0x0468  */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        int iRound;
        float f2;
        int i3;
        float f3;
        int i4;
        int iMax;
        int iMin;
        int iRound2;
        int i5;
        CanvasSubtitleOutput canvasSubtitleOutput = this;
        List<j4c> list = canvasSubtitleOutput.b;
        if (list.isEmpty()) {
            return;
        }
        int height = canvasSubtitleOutput.getHeight();
        int paddingLeft = canvasSubtitleOutput.getPaddingLeft();
        int paddingTop = canvasSubtitleOutput.getPaddingTop();
        int width = canvasSubtitleOutput.getWidth() - canvasSubtitleOutput.getPaddingRight();
        int paddingBottom = height - canvasSubtitleOutput.getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i6 = paddingBottom - paddingTop;
        float fB = vee0.b(canvasSubtitleOutput.d, canvasSubtitleOutput.c, height, i6);
        float f4 = 0.0f;
        if (fB <= 0.0f) {
            return;
        }
        int size = list.size();
        int i7 = 0;
        while (i7 < size) {
            j4c j4cVarA = list.get(i7);
            float f5 = f4;
            if (j4cVarA.p != Integer.MIN_VALUE) {
                j4c.a aVarA = j4cVarA.a();
                aVarA.h = -3.4028235E38f;
                aVarA.i = Integer.MIN_VALUE;
                aVarA.c = null;
                int i8 = j4cVarA.f;
                float f6 = j4cVarA.e;
                if (i8 == 0) {
                    aVarA.e = 1.0f - f6;
                    i5 = 0;
                    aVarA.f = 0;
                } else {
                    i5 = 0;
                    aVarA.e = (-f6) - 1.0f;
                    aVarA.f = 1;
                }
                int i9 = j4cVarA.g;
                if (i9 == 0) {
                    aVarA.g = 2;
                } else if (i9 == 2) {
                    aVarA.g = i5;
                }
                j4cVarA = aVarA.a();
            }
            float fB2 = vee0.b(j4cVarA.o, j4cVarA.n, height, i6);
            pee0 pee0Var = (pee0) canvasSubtitleOutput.a.get(i7);
            oe6 oe6Var = canvasSubtitleOutput.e;
            List<j4c> list2 = list;
            float f7 = canvasSubtitleOutput.f;
            TextPaint textPaint = pee0Var.f;
            int i10 = height;
            Bitmap bitmap = j4cVarA.d;
            int i11 = i6;
            float f8 = j4cVarA.k;
            int i12 = size;
            float f9 = j4cVarA.j;
            int i13 = i7;
            int i14 = j4cVarA.i;
            float f10 = j4cVarA.h;
            int i15 = j4cVarA.g;
            float f11 = fB;
            int i16 = j4cVarA.f;
            float f12 = j4cVarA.e;
            Layout.Alignment alignment = j4cVarA.b;
            CharSequence charSequence = j4cVarA.a;
            boolean z = bitmap == null;
            if (z) {
                if (TextUtils.isEmpty(charSequence)) {
                    paddingLeft = paddingLeft;
                    paddingTop = paddingTop;
                } else {
                    f = f10;
                    i = j4cVarA.l ? j4cVarA.m : oe6Var.c;
                }
                i7 = i13 + 1;
                canvasSubtitleOutput = this;
                f4 = f5;
                list = list2;
                height = i10;
                i6 = i11;
                size = i12;
                fB = f11;
                paddingLeft = paddingLeft;
                paddingTop = paddingTop;
            } else {
                f = f10;
                i = -16777216;
            }
            CharSequence charSequence2 = pee0Var.i;
            if ((charSequence2 == charSequence || (charSequence2 != null && charSequence2.equals(charSequence))) && Objects.equals(pee0Var.j, alignment) && pee0Var.k == bitmap && pee0Var.l == f12 && pee0Var.m == i16) {
                i2 = i15;
                if (Integer.valueOf(pee0Var.n).equals(Integer.valueOf(i2)) && pee0Var.o == f && Integer.valueOf(pee0Var.p).equals(Integer.valueOf(i14)) && pee0Var.q == f9 && pee0Var.r == f8 && pee0Var.s == oe6Var.a && pee0Var.t == oe6Var.b && pee0Var.u == i && pee0Var.w == oe6Var.d && pee0Var.v == oe6Var.e && Objects.equals(textPaint.getTypeface(), oe6Var.f) && pee0Var.x == f11 && pee0Var.y == fB2 && pee0Var.z == f7 && pee0Var.A == paddingLeft && pee0Var.B == paddingTop && pee0Var.C == width && pee0Var.D == paddingBottom) {
                    pee0Var.a(canvas, z);
                    paddingLeft = paddingLeft;
                    paddingTop = paddingTop;
                }
                i7 = i13 + 1;
                canvasSubtitleOutput = this;
                f4 = f5;
                list = list2;
                height = i10;
                i6 = i11;
                size = i12;
                fB = f11;
                paddingLeft = paddingLeft;
                paddingTop = paddingTop;
            } else {
                i2 = i15;
            }
            pee0Var.i = charSequence;
            pee0Var.j = alignment;
            pee0Var.k = bitmap;
            pee0Var.l = f12;
            pee0Var.m = i16;
            pee0Var.n = i2;
            pee0Var.o = f;
            pee0Var.p = i14;
            pee0Var.q = f9;
            pee0Var.r = f8;
            pee0Var.s = oe6Var.a;
            pee0Var.t = oe6Var.b;
            pee0Var.u = i;
            pee0Var.w = oe6Var.d;
            pee0Var.v = oe6Var.e;
            textPaint.setTypeface(oe6Var.f);
            pee0Var.x = f11;
            pee0Var.y = fB2;
            pee0Var.z = f7;
            pee0Var.A = paddingLeft;
            pee0Var.B = paddingTop;
            pee0Var.C = width;
            pee0Var.D = paddingBottom;
            if (z) {
                pee0Var.i.getClass();
                CharSequence charSequence3 = pee0Var.i;
                SpannableStringBuilder spannableStringBuilder = charSequence3 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence3 : new SpannableStringBuilder(pee0Var.i);
                int i17 = pee0Var.C - pee0Var.A;
                int i18 = pee0Var.D - pee0Var.B;
                textPaint.setTextSize(pee0Var.x);
                int i19 = (int) ((pee0Var.x * 0.125f) + 0.5f);
                int i20 = i19 * 2;
                int i21 = i17 - i20;
                float f13 = pee0Var.q;
                if (f13 != -3.4028235E38f) {
                    i21 = (int) (i21 * f13);
                }
                int i22 = i21;
                if (i22 <= 0) {
                    cft.g("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
                    f11 = f11;
                    paddingLeft = paddingLeft;
                    paddingTop = paddingTop;
                } else {
                    if (pee0Var.y > f5) {
                        f11 = f11;
                        i4 = 0;
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) pee0Var.y), 0, spannableStringBuilder.length(), 16711680);
                    } else {
                        f11 = f11;
                        i4 = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    if (pee0Var.w == 1) {
                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i4, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                        int i23 = 0;
                        for (int length = foregroundColorSpanArr.length; i23 < length; length = length) {
                            spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i23]);
                            i23++;
                        }
                    }
                    if (Color.alpha(pee0Var.t) > 0) {
                        int i24 = pee0Var.w;
                        if (i24 == 0 || i24 == 2) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(pee0Var.t), 0, spannableStringBuilder.length(), 16711680);
                        } else {
                            spannableStringBuilder2.setSpan(new BackgroundColorSpan(pee0Var.t), 0, spannableStringBuilder2.length(), 16711680);
                        }
                    }
                    Layout.Alignment alignment2 = pee0Var.j;
                    if (alignment2 == null) {
                        alignment2 = Layout.Alignment.ALIGN_CENTER;
                    }
                    Layout.Alignment alignment3 = alignment2;
                    SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder3, r2, i22, alignment3, pee0Var.d, pee0Var.e, true);
                    pee0Var.E = staticLayout;
                    int height2 = staticLayout.getHeight();
                    int lineCount = pee0Var.E.getLineCount();
                    int i25 = 0;
                    int iMax2 = 0;
                    while (i25 < lineCount) {
                        iMax2 = Math.max((int) Math.ceil(pee0Var.E.getLineWidth(i25)), iMax2);
                        i25++;
                        height2 = height2;
                        lineCount = lineCount;
                        spannableStringBuilder2 = spannableStringBuilder2;
                    }
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                    int i26 = height2;
                    int i27 = ((pee0Var.q == -3.4028235E38f || iMax2 >= i22) ? iMax2 : i22) + i20;
                    float f14 = pee0Var.o;
                    if (f14 != -3.4028235E38f) {
                        int iRound3 = Math.round(i17 * f14);
                        int i28 = pee0Var.A;
                        int i29 = iRound3 + i28;
                        int i30 = pee0Var.p;
                        if (i30 == 1) {
                            i29 = ((i29 * 2) - i27) / 2;
                        } else if (i30 == 2) {
                            i29 -= i27;
                        }
                        iMax = Math.max(i29, i28);
                        iMin = Math.min(iMax + i27, pee0Var.C);
                    } else {
                        iMax = pee0Var.A + ((i17 - i27) / 2);
                        iMin = iMax + i27;
                    }
                    int i31 = iMin - iMax;
                    if (i31 <= 0) {
                        cft.g("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
                    } else {
                        float f15 = pee0Var.l;
                        if (f15 != -3.4028235E38f) {
                            if (pee0Var.m == 0) {
                                iRound2 = Math.round(i18 * f15) + pee0Var.B;
                                int i32 = pee0Var.n;
                                if (i32 == 2) {
                                    iRound2 -= i26;
                                } else if (i32 == 1) {
                                    iRound2 = ((iRound2 * 2) - i26) / 2;
                                }
                            } else {
                                int lineBottom = pee0Var.E.getLineBottom(0) - pee0Var.E.getLineTop(0);
                                float f16 = pee0Var.l;
                                iRound2 = f16 >= f5 ? Math.round(f16 * lineBottom) + pee0Var.B : (Math.round((f16 + 1.0f) * lineBottom) + pee0Var.D) - i26;
                            }
                            int i33 = iRound2 + i26;
                            int i34 = pee0Var.D;
                            if (i33 > i34) {
                                iRound2 = i34 - i26;
                            } else {
                                int i35 = pee0Var.B;
                                if (iRound2 < i35) {
                                    iRound2 = i35;
                                }
                            }
                        } else {
                            iRound2 = (pee0Var.D - i26) - ((int) (i18 * pee0Var.z));
                        }
                        pee0Var.E = new StaticLayout(spannableStringBuilder3, r2, i31, alignment3, pee0Var.d, pee0Var.e, true);
                        pee0Var.F = new StaticLayout(spannableStringBuilder4, textPaint, i31, alignment3, pee0Var.d, pee0Var.e, true);
                        pee0Var.G = iMax;
                        pee0Var.H = iRound2;
                        pee0Var.I = i19;
                    }
                }
            } else {
                paddingLeft = paddingLeft;
                paddingTop = paddingTop;
                pee0Var.k.getClass();
                Bitmap bitmap2 = pee0Var.k;
                int i36 = pee0Var.C;
                int i37 = pee0Var.A;
                int i38 = pee0Var.D;
                int i39 = pee0Var.B;
                float f17 = i36 - i37;
                float f18 = (pee0Var.o * f17) + i37;
                float f19 = i38 - i39;
                float f20 = (pee0Var.l * f19) + i39;
                int iRound4 = Math.round(f17 * pee0Var.q);
                float f21 = pee0Var.r;
                if (f21 != -3.4028235E38f) {
                    f11 = f11;
                    iRound = Math.round(f19 * f21);
                } else {
                    f11 = f11;
                    iRound = Math.round((bitmap2.getHeight() / bitmap2.getWidth()) * iRound4);
                }
                int i40 = pee0Var.p;
                if (i40 == 2) {
                    f2 = iRound4;
                } else {
                    if (i40 == 1) {
                        f2 = iRound4 / 2;
                    }
                    int iRound5 = Math.round(f18);
                    i3 = pee0Var.n;
                    if (i3 == 2) {
                        f3 = iRound;
                    } else {
                        if (i3 == 1) {
                            f3 = iRound / 2;
                        }
                        int iRound6 = Math.round(f20);
                        pee0Var.J = new Rect(iRound5, iRound6, iRound4 + iRound5, iRound + iRound6);
                    }
                    f20 -= f3;
                    int iRound7 = Math.round(f20);
                    pee0Var.J = new Rect(iRound5, iRound7, iRound4 + iRound5, iRound + iRound7);
                }
                f18 -= f2;
                int iRound8 = Math.round(f18);
                i3 = pee0Var.n;
                if (i3 == 2) {
                    f3 = iRound;
                } else {
                    if (i3 == 1) {
                        f3 = iRound / 2;
                    }
                    int iRound9 = Math.round(f20);
                    pee0Var.J = new Rect(iRound8, iRound9, iRound4 + iRound8, iRound + iRound9);
                }
                f20 -= f3;
                int iRound10 = Math.round(f20);
                pee0Var.J = new Rect(iRound8, iRound10, iRound4 + iRound8, iRound + iRound10);
            }
            pee0Var.a(canvas, z);
            i7 = i13 + 1;
            canvasSubtitleOutput = this;
            f4 = f5;
            list = list2;
            height = i10;
            i6 = i11;
            size = i12;
            fB = f11;
            paddingLeft = paddingLeft;
            paddingTop = paddingTop;
        }
    }
}
