package l1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class o extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f103313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable.ConstantState f103314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f103315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f103316d;

    public o(@Nullable o oVar) {
        this.f103315c = null;
        this.f103316d = m.f103304h;
        if (oVar != null) {
            this.f103313a = oVar.f103313a;
            this.f103314b = oVar.f103314b;
            this.f103315c = oVar.f103315c;
            this.f103316d = oVar.f103316d;
        }
    }

    public boolean a() {
        return this.f103314b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i10 = this.f103313a;
        Drawable.ConstantState constantState = this.f103314b;
        return i10 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @NonNull
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @NonNull
    public Drawable newDrawable(@Nullable Resources resources) {
        return new n(this, resources);
    }
}
