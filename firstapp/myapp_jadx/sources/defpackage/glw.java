package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class glw extends uz1 {
    public rt30 d;
    public Paint e;

    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        float f;
        View viewInflate;
        String strJ;
        int iB = zVar.b();
        int childCount = recyclerView.getChildCount();
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int iP = RecyclerView.P(childAt);
            String strJ2 = iP <= 0 ? null : j(iP - 1);
            String strJ3 = j(iP);
            if ((strJ3 == null ? false : !TextUtils.equals(strJ2, strJ3)) || i == 0) {
                float fMax = Math.max(this.b, childAt.getTop());
                int i2 = iP + 1;
                if (i2 < iB) {
                    int bottom = childAt.getBottom();
                    String strJ4 = j(iP);
                    try {
                        strJ = j(i2);
                    } catch (Exception unused) {
                        strJ = strJ4;
                    }
                    if (strJ == null ? false : !TextUtils.equals(strJ4, strJ)) {
                        float f2 = bottom;
                        if (f2 < fMax) {
                            f = f2;
                        } else {
                            f = fMax;
                        }
                    } else {
                        f = fMax;
                    }
                } else {
                    f = fMax;
                }
                float f3 = paddingLeft;
                canvas.drawRect(f3, f - this.b, width, f, this.e);
                rt30 rt30Var = this.d;
                if (rt30Var != null) {
                    eu30 eu30Var = rt30Var.a.E;
                    if (i == 0) {
                        viewInflate = LayoutInflater.from(eu30Var.a).inflate(R.layout.spr_view_top_hint, (ViewGroup) null, false);
                    } else {
                        eu30Var.getClass();
                        viewInflate = null;
                    }
                } else {
                    viewInflate = null;
                }
                viewInflate.setDrawingCacheEnabled(true);
                viewInflate.setLayoutParams(new ViewGroup.LayoutParams(width, this.b));
                viewInflate.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(this.b, 1073741824));
                viewInflate.layout(paddingLeft, 0 - this.b, width, 0);
                canvas.drawBitmap(Bitmap.createBitmap(viewInflate.getDrawingCache()), f3, f - this.b, (Paint) null);
            }
        }
    }

    @Override // defpackage.uz1
    public final String j(int i) {
        rt30 rt30Var = this.d;
        if (rt30Var == null) {
            return null;
        }
        rt30Var.a.E.getClass();
        if (i == 0) {
            return "top";
        }
        return null;
    }
}
