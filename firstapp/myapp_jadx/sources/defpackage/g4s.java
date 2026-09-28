package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class g4s extends RecyclerView.n {
    public final float a;
    public final Paint b;
    public final Paint c;
    public final Rect d;

    public g4s(int i, float f, float f2) {
        this.a = f2;
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        this.b = paint;
        Paint paint2 = new Paint();
        paint2.setColor(i);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        this.c = paint2;
        this.d = new Rect();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        canvas.getClass();
        zVar.getClass();
        RecyclerView.f adapter = recyclerView.getAdapter();
        if (adapter != null && adapter.getItemCount() >= 2) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                int iP = RecyclerView.P(childAt);
                if (iP != -1) {
                    Rect rect = this.d;
                    RecyclerView.S(rect, childAt);
                    float left = childAt.getLeft();
                    float bottom = (childAt.getBottom() + childAt.getTop()) * 0.5f;
                    boolean z = iP == 0;
                    boolean z2 = iP == adapter.getItemCount() - 1;
                    canvas.drawLine(left, z ? bottom : rect.top, left, z2 ? bottom : rect.bottom, this.b);
                    Paint paint = this.c;
                    float f = this.a;
                    if (z) {
                        canvas.drawCircle(left, bottom, f, paint);
                    }
                    if (z2) {
                        canvas.drawCircle(left, bottom, f, paint);
                    }
                }
            }
        }
    }
}
