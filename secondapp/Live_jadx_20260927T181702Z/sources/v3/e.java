package v3;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class e extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f139961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f139962c;

    public e() {
        this.f139962c = false;
        this.f139961b = new b();
    }

    public void a(Drawable drawable) {
        this.f139961b.f139975a.add(new a(drawable, this));
    }

    public a b(int i10) {
        return this.f139961b.f139975a.get(i10);
    }

    public int c() {
        return this.f139961b.f139975a.size();
    }

    public Drawable d(int i10) {
        return this.f139961b.f139975a.get(i10).f139972b;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ArrayList<a> arrayList = this.f139961b.f139975a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList.get(i10).f139972b.draw(canvas);
        }
    }

    public final Drawable e() {
        ArrayList<a> arrayList = this.f139961b.f139975a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Drawable drawable = arrayList.get(i10).f139972b;
            if (drawable != null) {
                return drawable;
            }
        }
        return null;
    }

    public void f(int i10) {
        this.f139961b.f139975a.remove(i10);
    }

    public void g(Drawable drawable) {
        ArrayList<a> arrayList = this.f139961b.f139975a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (drawable == arrayList.get(i10).f139972b) {
                arrayList.get(i10).f139972b.setCallback(null);
                arrayList.remove(i10);
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawableE = e();
        if (drawableE != null) {
            return l1.d.d(drawableE);
        }
        return 255;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f139961b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    public void h(int i10, Drawable drawable) {
        this.f139961b.f139975a.set(i10, new a(drawable, this));
    }

    public void i(Rect rect) {
        ArrayList<a> arrayList = this.f139961b.f139975a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList.get(i10).d(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f139962c && super.mutate() == this) {
            b bVar = new b(this.f139961b, this, null);
            this.f139961b = bVar;
            ArrayList<a> arrayList = bVar.f139975a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Drawable drawable = arrayList.get(i10).f139972b;
                if (drawable != null) {
                    drawable.mutate();
                }
            }
            this.f139962c = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        ArrayList<a> arrayList = this.f139961b.f139975a;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).f139972b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        ArrayList<a> arrayList = this.f139961b.f139975a;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList.get(i10).f139972b.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<a> f139975a;

        public b() {
            this.f139975a = new ArrayList<>();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new e(this);
        }

        public b(b bVar, e eVar, Resources resources) {
            int size = bVar.f139975a.size();
            this.f139975a = new ArrayList<>(size);
            for (int i10 = 0; i10 < size; i10++) {
                this.f139975a.add(new a(bVar.f139975a.get(i10), eVar, resources));
            }
        }
    }

    public e(b bVar) {
        this.f139962c = false;
        this.f139961b = bVar;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Property<a, Integer> f139963e = new C1467a(Integer.class, "absoluteTop");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Property<a, Integer> f139964f = new b(Integer.class, "absoluteBottom");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Property<a, Integer> f139965g = new c(Integer.class, "absoluteLeft");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Property<a, Integer> f139966h = new d(Integer.class, "absoluteRight");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final Property<a, Float> f139967i = new C1468e(Float.class, "fractionTop");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final Property<a, Float> f139968j = new f(Float.class, "fractionBottom");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final Property<a, Float> f139969k = new g(Float.class, "fractionLeft");

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final Property<a, Float> f139970l = new h(Float.class, "fractionRight");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v3.a f139971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Drawable f139972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Rect f139973c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e f139974d;

        /* JADX INFO: renamed from: v3.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class C1467a extends Property<a, Integer> {
            public C1467a(Class cls, String str) {
                super(cls, str);
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer get(a aVar) {
                return aVar.a().f139944b == null ? Integer.valueOf(aVar.f139974d.getBounds().top) : Integer.valueOf(aVar.a().f139944b.b());
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void set(a aVar, Integer num) {
                if (aVar.a().f139944b == null) {
                    aVar.a().f139944b = v3.a.C1466a.a(num.intValue());
                } else {
                    aVar.a().f139944b.f(num.intValue());
                }
                aVar.c();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class b extends Property<a, Integer> {
            public b(Class cls, String str) {
                super(cls, str);
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer get(a aVar) {
                return aVar.a().f139946d == null ? Integer.valueOf(aVar.f139974d.getBounds().bottom) : Integer.valueOf(aVar.a().f139946d.b());
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void set(a aVar, Integer num) {
                if (aVar.a().f139946d == null) {
                    aVar.a().f139946d = v3.a.C1466a.a(num.intValue());
                } else {
                    aVar.a().f139946d.f(num.intValue());
                }
                aVar.c();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class c extends Property<a, Integer> {
            public c(Class cls, String str) {
                super(cls, str);
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer get(a aVar) {
                return aVar.a().f139943a == null ? Integer.valueOf(aVar.f139974d.getBounds().left) : Integer.valueOf(aVar.a().f139943a.b());
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void set(a aVar, Integer num) {
                if (aVar.a().f139943a == null) {
                    aVar.a().f139943a = v3.a.C1466a.a(num.intValue());
                } else {
                    aVar.a().f139943a.f(num.intValue());
                }
                aVar.c();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class d extends Property<a, Integer> {
            public d(Class cls, String str) {
                super(cls, str);
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Integer get(a aVar) {
                return aVar.a().f139945c == null ? Integer.valueOf(aVar.f139974d.getBounds().right) : Integer.valueOf(aVar.a().f139945c.b());
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void set(a aVar, Integer num) {
                if (aVar.a().f139945c == null) {
                    aVar.a().f139945c = v3.a.C1466a.a(num.intValue());
                } else {
                    aVar.a().f139945c.f(num.intValue());
                }
                aVar.c();
            }
        }

        /* JADX INFO: renamed from: v3.e$a$e, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class C1468e extends Property<a, Float> {
            public C1468e(Class cls, String str) {
                super(cls, str);
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Float get(a aVar) {
                return aVar.a().f139944b == null ? Float.valueOf(0.0f) : Float.valueOf(aVar.a().f139944b.c());
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void set(a aVar, Float f10) {
                if (aVar.a().f139944b == null) {
                    aVar.a().f139944b = v3.a.C1466a.d(f10.floatValue());
                } else {
                    aVar.a().f139944b.g(f10.floatValue());
                }
                aVar.c();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class f extends Property<a, Float> {
            public f(Class cls, String str) {
                super(cls, str);
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Float get(a aVar) {
                return aVar.a().f139946d == null ? Float.valueOf(1.0f) : Float.valueOf(aVar.a().f139946d.c());
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void set(a aVar, Float f10) {
                if (aVar.a().f139946d == null) {
                    aVar.a().f139946d = v3.a.C1466a.d(f10.floatValue());
                } else {
                    aVar.a().f139946d.g(f10.floatValue());
                }
                aVar.c();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class g extends Property<a, Float> {
            public g(Class cls, String str) {
                super(cls, str);
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Float get(a aVar) {
                return aVar.a().f139943a == null ? Float.valueOf(0.0f) : Float.valueOf(aVar.a().f139943a.c());
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void set(a aVar, Float f10) {
                if (aVar.a().f139943a == null) {
                    aVar.a().f139943a = v3.a.C1466a.d(f10.floatValue());
                } else {
                    aVar.a().f139943a.g(f10.floatValue());
                }
                aVar.c();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class h extends Property<a, Float> {
            public h(Class cls, String str) {
                super(cls, str);
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Float get(a aVar) {
                return aVar.a().f139945c == null ? Float.valueOf(1.0f) : Float.valueOf(aVar.a().f139945c.c());
            }

            @Override // android.util.Property
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void set(a aVar, Float f10) {
                if (aVar.a().f139945c == null) {
                    aVar.a().f139945c = v3.a.C1466a.d(f10.floatValue());
                } else {
                    aVar.a().f139945c.g(f10.floatValue());
                }
                aVar.c();
            }
        }

        public a(Drawable drawable, e eVar) {
            this.f139973c = new Rect();
            this.f139972b = drawable;
            this.f139974d = eVar;
            this.f139971a = new v3.a();
            drawable.setCallback(eVar);
        }

        public v3.a a() {
            return this.f139971a;
        }

        public Drawable b() {
            return this.f139972b;
        }

        public void c() {
            d(this.f139974d.getBounds());
        }

        public void d(Rect rect) {
            this.f139971a.a(rect, this.f139973c);
            this.f139972b.setBounds(this.f139973c);
        }

        public a(a aVar, e eVar, Resources resources) {
            Drawable drawableNewDrawable;
            this.f139973c = new Rect();
            Drawable drawable = aVar.f139972b;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (resources != null) {
                    drawableNewDrawable = constantState.newDrawable(resources);
                } else {
                    drawableNewDrawable = constantState.newDrawable();
                }
                drawableNewDrawable.setCallback(eVar);
                l1.d.m(drawableNewDrawable, l1.d.f(drawable));
                drawableNewDrawable.setBounds(drawable.getBounds());
                drawableNewDrawable.setLevel(drawable.getLevel());
            } else {
                drawableNewDrawable = null;
            }
            v3.a aVar2 = aVar.f139971a;
            if (aVar2 != null) {
                this.f139971a = new v3.a(aVar2);
            } else {
                this.f139971a = new v3.a();
            }
            this.f139972b = drawableNewDrawable;
            this.f139974d = eVar;
        }
    }
}
