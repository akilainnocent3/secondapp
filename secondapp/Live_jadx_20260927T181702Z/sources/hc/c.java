package hc;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import k.h1;
import tb.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class c extends Drawable implements g.b, Animatable, v9.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f88123m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f88124n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f88125o = 119;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f88126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f88127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f88128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f88129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f88130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f88131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f88132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f88133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Paint f88134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f88135k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<v9.b.a> f88136l;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @h1
        public final g f88137a;

        public a(g gVar) {
            this.f88137a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new c(this);
        }
    }

    @Deprecated
    public c(Context context, qb.a aVar, wb.e eVar, m<Bitmap> mVar, int i10, int i11, Bitmap bitmap) {
        this(context, aVar, mVar, i10, i11, bitmap);
    }

    @Override // hc.g.b
    public void a() {
        if (d() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (i() == h() - 1) {
            this.f88131g++;
        }
        int i10 = this.f88132h;
        if (i10 == -1 || this.f88131g < i10) {
            return;
        }
        n();
        stop();
    }

    @Override // v9.b
    public boolean b(@NonNull v9.b.a aVar) {
        List<v9.b.a> list = this.f88136l;
        if (list == null || aVar == null) {
            return false;
        }
        return list.remove(aVar);
    }

    @Override // v9.b
    public void c(@NonNull v9.b.a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.f88136l == null) {
            this.f88136l = new ArrayList();
        }
        this.f88136l.add(aVar);
    }

    @Override // v9.b
    public void clearAnimationCallbacks() {
        List<v9.b.a> list = this.f88136l;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable.Callback d() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f88129e) {
            return;
        }
        if (this.f88133i) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), f());
            this.f88133i = false;
        }
        canvas.drawBitmap(this.f88126b.f88137a.c(), (Rect) null, f(), k());
    }

    public ByteBuffer e() {
        return this.f88126b.f88137a.b();
    }

    public final Rect f() {
        if (this.f88135k == null) {
            this.f88135k = new Rect();
        }
        return this.f88135k;
    }

    public Bitmap g() {
        return this.f88126b.f88137a.e();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f88126b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f88126b.f88137a.i();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f88126b.f88137a.m();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int h() {
        return this.f88126b.f88137a.f();
    }

    public int i() {
        return this.f88126b.f88137a.d();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f88127c;
    }

    public m<Bitmap> j() {
        return this.f88126b.f88137a.h();
    }

    public final Paint k() {
        if (this.f88134j == null) {
            this.f88134j = new Paint(2);
        }
        return this.f88134j;
    }

    public int l() {
        return this.f88126b.f88137a.l();
    }

    public boolean m() {
        return this.f88129e;
    }

    public final void n() {
        List<v9.b.a> list = this.f88136l;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f88136l.get(i10).b(this);
            }
        }
    }

    public void o() {
        this.f88129e = true;
        this.f88126b.f88137a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f88133i = true;
    }

    public final void p() {
        this.f88131g = 0;
    }

    public void q(m<Bitmap> mVar, Bitmap bitmap) {
        this.f88126b.f88137a.q(mVar, bitmap);
    }

    public void r(boolean z10) {
        this.f88127c = z10;
    }

    public void s(int i10) {
        if (i10 <= 0 && i10 != -1 && i10 != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i10 != 0) {
            this.f88132h = i10;
        } else {
            int iJ = this.f88126b.f88137a.j();
            this.f88132h = iJ != 0 ? iJ : -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        k().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        k().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        pc.m.b(!this.f88129e, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f88130f = z10;
        if (!z10) {
            v();
        } else if (this.f88128d) {
            u();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f88128d = true;
        p();
        if (this.f88130f) {
            u();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f88128d = false;
        v();
    }

    public void t() {
        pc.m.b(!this.f88127c, "You cannot restart a currently running animation.");
        this.f88126b.f88137a.r();
        start();
    }

    public final void u() {
        pc.m.b(!this.f88129e, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f88126b.f88137a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f88127c) {
                return;
            }
            this.f88127c = true;
            this.f88126b.f88137a.v(this);
            invalidateSelf();
        }
    }

    public final void v() {
        this.f88127c = false;
        this.f88126b.f88137a.w(this);
    }

    public c(Context context, qb.a aVar, m<Bitmap> mVar, int i10, int i11, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.b.e(context), aVar, i10, i11, mVar, bitmap)));
    }

    public c(a aVar) {
        this.f88130f = true;
        this.f88132h = -1;
        this.f88126b = (a) pc.m.e(aVar);
    }

    @h1
    public c(g gVar, Paint paint) {
        this(new a(gVar));
        this.f88134j = paint;
    }
}
