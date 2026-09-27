package sh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.k;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class f extends RelativeLayout implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final d f135340b;

    public f(Context context) {
        this(context, null);
    }

    @Override // sh.g
    public void a() {
        this.f135340b.b();
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
        this.f135340b.a();
    }

    @Override // android.view.View, sh.g
    public void draw(@NonNull Canvas canvas) {
        d dVar = this.f135340b;
        if (dVar != null) {
            dVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // sh.g
    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f135340b.g();
    }

    @Override // sh.g
    public int getCircularRevealScrimColor() {
        return this.f135340b.h();
    }

    @Override // sh.g
    @Nullable
    public g.e getRevealInfo() {
        return this.f135340b.j();
    }

    @Override // android.view.View, sh.g
    public boolean isOpaque() {
        d dVar = this.f135340b;
        return dVar != null ? dVar.l() : super.isOpaque();
    }

    @Override // sh.g
    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable) {
        this.f135340b.m(drawable);
    }

    @Override // sh.g
    public void setCircularRevealScrimColor(@k int i10) {
        this.f135340b.n(i10);
    }

    @Override // sh.g
    public void setRevealInfo(@Nullable g.e eVar) {
        this.f135340b.o(eVar);
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f135340b = new d(this);
    }
}
