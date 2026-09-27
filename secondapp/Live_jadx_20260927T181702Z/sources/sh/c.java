package sh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.GridLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.k;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class c extends GridLayout implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final d f135323b;

    public c(Context context) {
        this(context, null);
    }

    @Override // sh.g
    public void a() {
        this.f135323b.b();
    }

    @Override // sh.d.a
    public void b(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // sh.d.a
    public boolean c() {
        return super.isOpaque();
    }

    @Override // sh.g
    public void d() {
        this.f135323b.a();
    }

    @Override // android.view.View, sh.g
    public void draw(@NonNull Canvas canvas) {
        d dVar = this.f135323b;
        if (dVar != null) {
            dVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // sh.g
    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f135323b.g();
    }

    @Override // sh.g
    public int getCircularRevealScrimColor() {
        return this.f135323b.h();
    }

    @Override // sh.g
    @Nullable
    public g.e getRevealInfo() {
        return this.f135323b.j();
    }

    @Override // android.view.View, sh.g
    public boolean isOpaque() {
        d dVar = this.f135323b;
        return dVar != null ? dVar.l() : super.isOpaque();
    }

    @Override // sh.g
    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable) {
        this.f135323b.m(drawable);
    }

    @Override // sh.g
    public void setCircularRevealScrimColor(@k int i10) {
        this.f135323b.n(i10);
    }

    @Override // sh.g
    public void setRevealInfo(@Nullable g.e eVar) {
        this.f135323b.o(eVar);
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f135323b = new d(this);
    }
}
