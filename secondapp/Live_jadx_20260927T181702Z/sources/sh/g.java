package sh;

import android.animation.TypeEvaluator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.k;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public interface g extends sh.d.a {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b implements TypeEvaluator<e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final TypeEvaluator<e> f135341b = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f135342a = new e();

        @Override // android.animation.TypeEvaluator
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f10, @NonNull e eVar, @NonNull e eVar2) {
            this.f135342a.b(fi.a.f(eVar.f135346a, eVar2.f135346a, f10), fi.a.f(eVar.f135347b, eVar2.f135347b, f10), fi.a.f(eVar.f135348c, eVar2.f135348c, f10));
            return this.f135342a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c extends Property<g, e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Property<g, e> f135343a = new c("circularReveal");

        public c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(@NonNull g gVar) {
            return gVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull g gVar, @Nullable e eVar) {
            gVar.setRevealInfo(eVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d extends Property<g, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Property<g, Integer> f135344a = new d("circularRevealScrimColor");

        public d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(@NonNull g gVar) {
            return Integer.valueOf(gVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull g gVar, @NonNull Integer num) {
            gVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final float f135345d = Float.MAX_VALUE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f135346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f135347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f135348c;

        public boolean a() {
            return this.f135348c == Float.MAX_VALUE;
        }

        public void b(float f10, float f11, float f12) {
            this.f135346a = f10;
            this.f135347b = f11;
            this.f135348c = f12;
        }

        public void c(@NonNull e eVar) {
            b(eVar.f135346a, eVar.f135347b, eVar.f135348c);
        }

        public e() {
        }

        public e(float f10, float f11, float f12) {
            this.f135346a = f10;
            this.f135347b = f11;
            this.f135348c = f12;
        }

        public e(@NonNull e eVar) {
            this(eVar.f135346a, eVar.f135347b, eVar.f135348c);
        }
    }

    void a();

    void d();

    void draw(Canvas canvas);

    @Nullable
    Drawable getCircularRevealOverlayDrawable();

    @k
    int getCircularRevealScrimColor();

    @Nullable
    e getRevealInfo();

    boolean isOpaque();

    void setCircularRevealOverlayDrawable(@Nullable Drawable drawable);

    void setCircularRevealScrimColor(@k int i10);

    void setRevealInfo(@Nullable e eVar);
}
