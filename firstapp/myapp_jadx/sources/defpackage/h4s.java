package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h4s extends RecyclerView.n {
    public final int a = R.color.border_secondary;
    public final float b;
    public final float c;
    public final float d;
    public Paint e;
    public Paint f;

    public h4s(float f, float f2, float f3) {
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        rect.getClass();
        view.getClass();
        zVar.getClass();
        rect.left = (int) (this.d + this.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        View childAt;
        View childAt2;
        canvas.getClass();
        zVar.getClass();
        if (this.e == null || this.f == null) {
            int color = recyclerView.getContext().getColor(this.a);
            Paint paint = new Paint(1);
            paint.setColor(color);
            paint.setStrokeWidth(this.b);
            paint.setStyle(Paint.Style.STROKE);
            this.e = paint;
            Paint paint2 = new Paint(1);
            paint2.setColor(color);
            paint2.setStyle(Paint.Style.FILL);
            this.f = paint2;
        }
        RecyclerView.f adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (itemCount == 0 || (childAt = recyclerView.getChildAt(0)) == null || (childAt2 = recyclerView.getChildAt(recyclerView.getChildCount() - 1)) == null) {
            return;
        }
        float left = childAt.getLeft() - this.d;
        float bottom = (childAt.getBottom() + childAt.getTop()) / 2.0f;
        float bottom2 = (childAt2.getBottom() + childAt2.getTop()) / 2.0f;
        Paint paint3 = this.e;
        if (paint3 == null) {
            Intrinsics.n("linePaint");
            throw null;
        }
        canvas.drawLine(left, bottom, left, bottom2, paint3);
        int iP = RecyclerView.P(childAt);
        int iP2 = RecyclerView.P(childAt2);
        float f = this.c;
        if (iP == 0) {
            Paint paint4 = this.f;
            if (paint4 == null) {
                Intrinsics.n("dotPaint");
                throw null;
            }
            canvas.drawCircle(left, bottom, f, paint4);
        }
        if (iP2 == itemCount - 1) {
            Paint paint5 = this.f;
            if (paint5 != null) {
                canvas.drawCircle(left, bottom2, f, paint5);
            } else {
                Intrinsics.n("dotPaint");
                throw null;
            }
        }
    }
}
