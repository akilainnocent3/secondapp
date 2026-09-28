package defpackage;

import android.graphics.Paint;
import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public final class afn {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public static final float a(Layout layout, int i, Paint paint) {
        float lineLeft = layout.getLineLeft(i);
        idf0 idf0Var = wkf0.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : a.a[paragraphAlignment.ordinal()]) == 1) {
            return g70.a(layout.getWidth(), fMeasureText, 2.0f, Math.abs(lineLeft));
        }
        return (layout.getWidth() - fMeasureText) + Math.abs(lineLeft);
    }

    public static final float b(Layout layout, int i, Paint paint) {
        idf0 idf0Var = wkf0.a;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? a.a[paragraphAlignment.ordinal()] : -1) == 1) {
            return zen.a(layout.getWidth(), fMeasureText, 2.0f, layout.getWidth() - layout.getLineRight(i));
        }
        return (layout.getWidth() - layout.getLineRight(i)) - (layout.getWidth() - fMeasureText);
    }
}
