package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.k;
import sh.d;
import sh.g;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class a extends ph.a implements g {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public final d f137020z;

    public a(Context context) {
        this(context, null);
    }

    @Override // sh.g
    public void a() {
        this.f137020z.b();
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
        this.f137020z.a();
    }

    @Override // android.view.View, sh.g
    public void draw(Canvas canvas) {
        d dVar = this.f137020z;
        if (dVar != null) {
            dVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // sh.g
    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f137020z.g();
    }

    @Override // sh.g
    public int getCircularRevealScrimColor() {
        return this.f137020z.h();
    }

    @Override // sh.g
    @Nullable
    public g.e getRevealInfo() {
        return this.f137020z.j();
    }

    @Override // android.view.View, sh.g
    public boolean isOpaque() {
        d dVar = this.f137020z;
        return dVar != null ? dVar.l() : super.isOpaque();
    }

    @Override // sh.g
    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable) {
        this.f137020z.m(drawable);
    }

    @Override // sh.g
    public void setCircularRevealScrimColor(@k int i10) {
        this.f137020z.n(i10);
    }

    @Override // sh.g
    public void setRevealInfo(@Nullable g.e eVar) {
        this.f137020z.o(eVar);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f137020z = new d(this);
    }
}
