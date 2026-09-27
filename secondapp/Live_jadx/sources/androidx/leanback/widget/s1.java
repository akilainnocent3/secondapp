package androidx.leanback.widget;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class s1 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a<T, V extends Number> extends s1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f13019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Property<T, V> f13020b;

        public a(Object obj, Property<T, V> property) {
            this.f13019a = obj;
            this.f13020b = property;
        }

        @Override // androidx.leanback.widget.s1
        public void a(Number number) {
            this.f13020b.set((T) this.f13019a, (V) number);
        }

        @Override // androidx.leanback.widget.s1
        public boolean b() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends s1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final long f13021b = 1000000;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ObjectAnimator f13022a;

        public b(Object obj, PropertyValuesHolder propertyValuesHolder) {
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(obj, propertyValuesHolder);
            this.f13022a = objectAnimatorOfPropertyValuesHolder;
            objectAnimatorOfPropertyValuesHolder.setInterpolator(new LinearInterpolator());
            objectAnimatorOfPropertyValuesHolder.setDuration(1000000L);
        }

        @Override // androidx.leanback.widget.s1
        public void c(float f10) {
            this.f13022a.setCurrentPlayTime((long) (f10 * 1000000.0f));
        }
    }

    public boolean b() {
        return false;
    }

    public void a(Number number) {
    }

    public void c(float f10) {
    }
}
