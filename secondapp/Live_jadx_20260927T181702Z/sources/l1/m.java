package l1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class m extends Drawable implements Drawable.Callback, l, k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f103304h = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f103305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f103306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f103307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f103308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f103309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f103310g;

    public m(@NonNull o oVar, @Nullable Resources resources) {
        this.f103308e = oVar;
        e(resources);
    }

    @Override // l1.l
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f103310g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f103310g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            o oVar = this.f103308e;
            if (oVar != null) {
                oVar.f103314b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // l1.l
    public final Drawable b() {
        return this.f103310g;
    }

    public boolean c() {
        return true;
    }

    @NonNull
    public final o d() {
        return new o(this.f103308e);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f103310g.draw(canvas);
    }

    public final void e(@Nullable Resources resources) {
        Drawable.ConstantState constantState;
        o oVar = this.f103308e;
        if (oVar == null || (constantState = oVar.f103314b) == null) {
            return;
        }
        a(constantState.newDrawable(resources));
    }

    public final boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        o oVar = this.f103308e;
        ColorStateList colorStateList = oVar.f103315c;
        PorterDuff.Mode mode = oVar.f103316d;
        if (colorStateList == null || mode == null) {
            this.f103307d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f103307d || colorForState != this.f103305b || mode != this.f103306c) {
                setColorFilter(colorForState, mode);
                this.f103305b = colorForState;
                this.f103306c = mode;
                this.f103307d = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        o oVar = this.f103308e;
        return changingConfigurations | (oVar != null ? oVar.getChangingConfigurations() : 0) | this.f103310g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        o oVar = this.f103308e;
        if (oVar == null || !oVar.a()) {
            return null;
        }
        this.f103308e.f103313a = getChangingConfigurations();
        return this.f103308e;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable getCurrent() {
        return this.f103310g.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f103310g.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f103310g.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @t0(23)
    public int getLayoutDirection() {
        return d.f(this.f103310g);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f103310g.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f103310g.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f103310g.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        return this.f103310g.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public int[] getState() {
        return this.f103310g.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f103310g.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return d.h(this.f103310g);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        o oVar;
        ColorStateList colorStateList = (!c() || (oVar = this.f103308e) == null) ? null : oVar.f103315c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f103310g.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f103310g.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f103309f && super.mutate() == this) {
            this.f103308e = d();
            Drawable drawable = this.f103310g;
            if (drawable != null) {
                drawable.mutate();
            }
            o oVar = this.f103308e;
            if (oVar != null) {
                Drawable drawable2 = this.f103310g;
                oVar.f103314b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f103309f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f103310g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @t0(23)
    public boolean onLayoutDirectionChanged(int i10) {
        return d.m(this.f103310g, i10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        return this.f103310g.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f103310g.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        d.j(this.f103310g, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i10) {
        this.f103310g.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f103310g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f103310g.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f103310g.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(@NonNull int[] iArr) {
        return f(iArr) || this.f103310g.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, l1.k
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, l1.k
    public void setTintList(ColorStateList colorStateList) {
        this.f103308e.f103315c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable, l1.k
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        this.f103308e.f103316d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f103310g.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public m(@Nullable Drawable drawable) {
        this.f103308e = d();
        a(drawable);
    }
}
