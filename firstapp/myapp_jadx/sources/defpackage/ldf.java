package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class ldf<T extends Drawable> implements qg50<T>, thn {
    public final T a;

    public ldf(T t) {
        gm20.c(t, "Argument must not be null");
        this.a = t;
    }

    @Override // defpackage.thn
    public void b() {
        T t = this.a;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof thk) {
            ((thk) t).a.a.l.prepareToDraw();
        }
    }

    @Override // defpackage.qg50
    public final Object get() {
        T t = this.a;
        Drawable.ConstantState constantState = t.getConstantState();
        return constantState == null ? t : constantState.newDrawable();
    }
}
