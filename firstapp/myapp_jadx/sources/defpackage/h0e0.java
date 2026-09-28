package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.sportygames.roulette.activities.HistoryActivity;
import com.sportygames.roulette.data.History;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class h0e0 extends tz1 {
    public int d = -1;
    public int e = 10;
    public int f = 40;
    public final HistoryActivity.c g;
    public final TextPaint h;
    public final Paint i;

    public h0e0(HistoryActivity.c cVar) {
        this.g = cVar;
        Paint paint = new Paint();
        this.i = paint;
        paint.setColor(this.a);
        TextPaint textPaint = new TextPaint();
        this.h = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(this.f);
        textPaint.setColor(this.d);
        textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0058  */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        float f;
        int iB = zVar.b();
        int childCount = recyclerView.getChildCount();
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        String str = null;
        int i = 0;
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            int iP = RecyclerView.P(childAt);
            String strJ = j(iP);
            if (strJ != null && !TextUtils.equals(strJ, str)) {
                float fMax = Math.max(this.b, childAt.getTop());
                int i2 = iP + 1;
                if (i2 < iB) {
                    String strJ2 = j(i2);
                    int bottom = childAt.getBottom();
                    if (strJ.equals(strJ2)) {
                        f = fMax;
                    } else {
                        float f2 = bottom;
                        if (f2 < fMax) {
                            f = f2;
                        } else {
                            f = fMax;
                        }
                    }
                } else {
                    f = fMax;
                }
                canvas.drawRect(paddingLeft, f - this.b, width, f, this.i);
                TextPaint textPaint = this.h;
                Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                float f3 = this.b;
                float f4 = fontMetrics.bottom;
                float f5 = (f - ((f3 - (f4 - fontMetrics.top)) / 2.0f)) - f4;
                textPaint.measureText(strJ);
                int iAbs = Math.abs(this.e);
                this.e = iAbs;
                if (!this.c) {
                    iAbs = -iAbs;
                }
                this.e = iAbs;
                canvas.drawText(strJ, recyclerView.getWidth() / 2, f5, textPaint);
            }
            i++;
            str = strJ;
        }
    }

    @Override // defpackage.tz1
    public final String j(int i) {
        HistoryActivity.c cVar = this.g;
        if (cVar == null) {
            return null;
        }
        ArrayList arrayList = HistoryActivity.this.P.b;
        int i2 = i - 2;
        if (i2 < 0 || i2 >= arrayList.size()) {
            return null;
        }
        return ((History) arrayList.get(i2)).getDateString();
    }
}
