package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public class ilc extends fcv {
    public static final /* synthetic */ int X = 0;
    public a W;

    public static class b extends ilc {
        @Override // defpackage.fcv
        public final void g(Canvas canvas) {
            if (this.W.s.isEmpty()) {
                super.g(canvas);
                return;
            }
            canvas.save();
            int i = Build.VERSION.SDK_INT;
            a aVar = this.W;
            if (i >= 26) {
                canvas.clipOutRect(aVar.s);
            } else {
                canvas.clipRect(aVar.s, Region.Op.DIFFERENCE);
            }
            super.g(canvas);
            canvas.restore();
        }
    }

    public final void E(float f, float f2, float f3, float f4) {
        RectF rectF = this.W.s;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // defpackage.fcv, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.W = new a(this.W);
        return this;
    }

    public static final class a extends fcv.c {
        public final RectF s;

        public a(a aVar) {
            super(aVar);
            this.s = aVar.s;
        }

        @Override // fcv.c, android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            b bVar = new b(this);
            bVar.W = this;
            bVar.invalidateSelf();
            return bVar;
        }

        public a(rx80 rx80Var, RectF rectF) {
            super(rx80Var);
            this.s = rectF;
        }
    }
}
