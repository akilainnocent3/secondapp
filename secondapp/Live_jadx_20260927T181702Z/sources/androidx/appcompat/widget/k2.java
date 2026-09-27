package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class k2 extends y1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference<Context> f7212b;

    public k2(@NonNull Context context, @NonNull Resources resources) {
        super(resources);
        this.f7212b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.y1, android.content.res.Resources
    public Drawable getDrawable(int i10) throws Resources.NotFoundException {
        Drawable drawableA = a(i10);
        Context context = this.f7212b.get();
        if (drawableA != null && context != null) {
            x1.h().x(context, i10, drawableA);
        }
        return drawableA;
    }
}
