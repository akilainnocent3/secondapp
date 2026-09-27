package fc;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import vb.r;
import vb.v;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j<T extends Drawable> implements v<T>, r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f83890b;

    public j(T t10) {
        this.f83890b = (T) pc.m.e(t10);
    }

    @Override // vb.v
    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.f83890b.getConstantState();
        return constantState == null ? this.f83890b : (T) constantState.newDrawable();
    }

    public void initialize() {
        T t10 = this.f83890b;
        if (t10 instanceof BitmapDrawable) {
            ((BitmapDrawable) t10).getBitmap().prepareToDraw();
        } else if (t10 instanceof hc.c) {
            ((hc.c) t10).g().prepareToDraw();
        }
    }
}
