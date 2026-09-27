package g3;

import android.util.FloatProperty;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86007a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends g<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FloatProperty f86008b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, FloatProperty floatProperty) {
            super(str);
            this.f86008b = floatProperty;
        }

        @Override // g3.g
        public float b(T t10) {
            return ((Float) this.f86008b.get(t10)).floatValue();
        }

        @Override // g3.g
        public void c(T t10, float f10) {
            this.f86008b.setValue(t10, f10);
        }
    }

    public g(String str) {
        this.f86007a = str;
    }

    @t0(24)
    public static <T> g<T> a(FloatProperty<T> floatProperty) {
        return new a(floatProperty.getName(), floatProperty);
    }

    public abstract float b(T t10);

    public abstract void c(T t10, float f10);
}
