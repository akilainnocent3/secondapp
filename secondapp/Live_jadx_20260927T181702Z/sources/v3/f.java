package v3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.IntProperty;
import android.util.Property;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class f extends Drawable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Property<f, Integer> f139976d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f139977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f139978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f139979c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends Property<f, Integer> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.c());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(f fVar, Integer num) {
            fVar.g(num.intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends IntProperty {
        public b(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.c());
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(f fVar, int i10) {
            fVar.g(i10);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 24) {
            f139976d = d();
        } else {
            f139976d = new a(Integer.class, "verticalOffset");
        }
    }

    public f() {
        this.f139977a = new Rect();
        this.f139979c = false;
        this.f139978b = new c();
    }

    @t0(24)
    public static IntProperty d() {
        return new b("verticalOffset");
    }

    public Bitmap a() {
        return this.f139978b.f139981b;
    }

    public Rect b() {
        return this.f139978b.f139982c;
    }

    public int c() {
        return this.f139978b.f139984e;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f139978b.f139981b != null) {
            Rect bounds = getBounds();
            Rect rect = this.f139977a;
            rect.left = 0;
            rect.top = this.f139978b.f139984e;
            rect.right = bounds.width();
            Rect rectH = h();
            float fWidth = bounds.width() / rectH.width();
            Rect rect2 = this.f139977a;
            rect2.bottom = rect2.top + ((int) (rectH.height() * fWidth));
            int iSave = canvas.save();
            canvas.clipRect(bounds);
            c cVar = this.f139978b;
            canvas.drawBitmap(cVar.f139981b, rectH, this.f139977a, cVar.f139980a);
            canvas.restoreToCount(iSave);
        }
    }

    public void e(Bitmap bitmap) {
        c cVar = this.f139978b;
        cVar.f139981b = bitmap;
        if (bitmap != null) {
            cVar.f139983d.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        } else {
            cVar.f139983d.set(0, 0, 0, 0);
        }
        this.f139978b.f139982c = null;
    }

    public void f(Rect rect) {
        this.f139978b.f139982c = rect;
    }

    public void g(int i10) {
        this.f139978b.f139984e = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f139978b.f139980a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f139978b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap = this.f139978b.f139981b;
        return (bitmap == null || bitmap.hasAlpha() || this.f139978b.f139980a.getAlpha() < 255) ? -3 : -1;
    }

    public final Rect h() {
        c cVar = this.f139978b;
        Rect rect = cVar.f139982c;
        return rect == null ? cVar.f139983d : rect;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f139979c && super.mutate() == this) {
            this.f139978b = new c(this.f139978b);
            this.f139979c = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f139978b.f139980a.getAlpha()) {
            this.f139978b.f139980a.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f139978b.f139980a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Paint f139980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Bitmap f139981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Rect f139982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Rect f139983d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f139984e;

        public c() {
            this.f139983d = new Rect();
            this.f139980a = new Paint();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new f(this);
        }

        public c(c cVar) {
            Rect rect = new Rect();
            this.f139983d = rect;
            this.f139981b = cVar.f139981b;
            this.f139980a = new Paint(cVar.f139980a);
            this.f139982c = cVar.f139982c != null ? new Rect(cVar.f139982c) : null;
            rect.set(cVar.f139983d);
            this.f139984e = cVar.f139984e;
        }
    }

    public f(c cVar) {
        this.f139977a = new Rect();
        this.f139979c = false;
        this.f139978b = cVar;
    }
}
