package com.yandex.div.core.view2.spannable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.LineBackgroundSpan;
import e2.w;
import is.d;
import java.util.LinkedList;
import java.util.Queue;
import k.q0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class VerticalAlignmentSpan extends CharacterStyle implements LineBackgroundSpan {
    private static final int INDEX_LINE_ASCENT = 0;
    private static final int INDEX_LINE_DESCENT = 1;

    @l
    private final TextVerticalAlignment alignment;
    private final int fontSize;

    @l
    private final cr.c<Layout> layoutProvider;
    private boolean textDrawWasCalled;

    @l
    private static final Companion Companion = new Companion(null);

    @l
    private static final w.b<int[]> LINE_POOL = new w.b<>(16);

    @l
    private final Paint.FontMetricsInt fontMetrics = new Paint.FontMetricsInt();

    @l
    private final Queue<int[]> lines = new LinkedList();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextVerticalAlignment.values().length];
            try {
                iArr[TextVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextVerticalAlignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextVerticalAlignment.BASELINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TextVerticalAlignment.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VerticalAlignmentSpan(@q0 int i10, @l TextVerticalAlignment textVerticalAlignment, @l cr.c<Layout> cVar) {
        this.fontSize = i10;
        this.alignment = textVerticalAlignment;
        this.layoutProvider = cVar;
    }

    @Override // android.text.style.LineBackgroundSpan
    public void drawBackground(@l Canvas canvas, @l Paint paint, int i10, int i11, int i12, int i13, int i14, @l CharSequence charSequence, int i15, int i16, int i17) {
        if (this.textDrawWasCalled) {
            this.lines.clear();
        }
        this.textDrawWasCalled = false;
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned == null) {
            return;
        }
        int spanStart = spanned.getSpanStart(this);
        if (i15 > spanned.getSpanEnd(this) || spanStart > i16) {
            return;
        }
        Layout layout = this.layoutProvider.get();
        int iL0 = i17 == layout.getLineCount() - 1 ? 0 : d.L0(layout.getSpacingAdd());
        int[] iArrA = LINE_POOL.a();
        if (iArrA == null) {
            iArrA = new int[2];
        }
        iArrA[0] = i12 - i13;
        iArrA[1] = (i14 - i13) - iL0;
        this.lines.add(iArrA);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@l TextPaint textPaint) {
        this.textDrawWasCalled = true;
        if (this.lines.isEmpty()) {
            return;
        }
        int[] iArrRemove = this.lines.remove();
        int i10 = iArrRemove[0];
        int i11 = iArrRemove[1];
        LINE_POOL.b(iArrRemove);
        int i12 = this.fontSize;
        if (i12 > 0) {
            textPaint.setTextSize(i12);
        }
        textPaint.getFontMetricsInt(this.fontMetrics);
        int i13 = WhenMappings.$EnumSwitchMapping$0[this.alignment.ordinal()];
        if (i13 == 1) {
            textPaint.baselineShift += i10 - this.fontMetrics.ascent;
            return;
        }
        if (i13 != 2) {
            if (i13 != 4) {
                return;
            }
            textPaint.baselineShift += i11 - this.fontMetrics.descent;
        } else {
            Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
            textPaint.baselineShift += ((i10 + i11) / 2) - ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2);
        }
    }
}
