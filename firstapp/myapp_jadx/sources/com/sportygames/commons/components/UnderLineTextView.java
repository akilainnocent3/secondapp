package com.sportygames.commons.components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/sportygames/commons/components/UnderLineTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UnderLineTextView extends AppCompatTextView {
    public final Paint v;
    public final float w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnderLineTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        Paint paint = new Paint();
        paint.setColor(getCurrentTextColor());
        paint.setStrokeWidth(getResources().getDisplayMetrics().density * 1.0f);
        paint.setAntiAlias(true);
        this.v = paint;
        this.w = getResources().getDisplayMetrics().density * 1.5f;
        setPaintFlags(getPaintFlags() & (-9));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        CharSequence text = getText();
        if (text == null) {
            return;
        }
        float fMeasureText = getPaint().measureText(text.toString());
        float width = (getWidth() - fMeasureText) / 2.0f;
        float baseline = getBaseline() + this.w;
        canvas.drawLine(width, baseline, width + fMeasureText, baseline, this.v);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UnderLineTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UnderLineTextView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ UnderLineTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
