package l1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@t0(21)
public class n extends m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f103311i = "WrappedDrawableApi21";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Method f103312j;

    public n(Drawable drawable) {
        super(drawable);
        g();
    }

    @Override // l1.m
    public boolean c() {
        return false;
    }

    public final void g() {
        if (f103312j == null) {
            try {
                f103312j = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception e10) {
                Log.w(f103311i, "Failed to retrieve Drawable#isProjected() method", e10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Rect getDirtyBounds() {
        return this.f103310g.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@NonNull Outline outline) {
        this.f103310g.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f103310g;
        if (drawable == null || (method = f103312j) == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(drawable, null)).booleanValue();
        } catch (Exception e10) {
            Log.w(f103311i, "Error calling Drawable#isProjected() method", e10);
            return false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        this.f103310g.setHotspot(f10, f11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.f103310g.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // l1.m, android.graphics.drawable.Drawable
    public boolean setState(@NonNull int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // l1.m, android.graphics.drawable.Drawable, l1.k
    public void setTint(int i10) {
        if (c()) {
            super.setTint(i10);
        } else {
            this.f103310g.setTint(i10);
        }
    }

    @Override // l1.m, android.graphics.drawable.Drawable, l1.k
    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.f103310g.setTintList(colorStateList);
        }
    }

    @Override // l1.m, android.graphics.drawable.Drawable, l1.k
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.f103310g.setTintMode(mode);
        }
    }

    public n(o oVar, Resources resources) {
        super(oVar, resources);
        g();
    }
}
