package androidx.leanback.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class a2 implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<Class<?>, Object> f12291a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f12292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<Class<?>, Object> f12293b;

        public a(View view) {
            this.f12292a = view;
        }

        @Override // androidx.leanback.widget.y
        public final Object a(Class<?> cls) {
            Map<Class<?>, Object> map = this.f12293b;
            if (map == null) {
                return null;
            }
            return map.get(cls);
        }

        public final void c(Class<?> cls, Object obj) {
            if (this.f12293b == null) {
                this.f12293b = new f0.a();
            }
            this.f12293b.put(cls, obj);
        }
    }

    public static void b(View view) {
        if (view == null || !view.hasTransientState()) {
            return;
        }
        view.animate().cancel();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; view.hasTransientState() && i10 < childCount; i10++) {
                b(viewGroup.getChildAt(i10));
            }
        }
    }

    @Override // androidx.leanback.widget.y
    public final Object a(Class<?> cls) {
        Map<Class<?>, Object> map = this.f12291a;
        if (map == null) {
            return null;
        }
        return map.get(cls);
    }

    public abstract void c(a aVar, Object obj);

    public void d(a aVar, Object obj, List<Object> list) {
        c(aVar, obj);
    }

    public abstract a e(ViewGroup viewGroup);

    public abstract void f(a aVar);

    public void h(a aVar) {
        b(aVar.f12292a);
    }

    public final void i(Class<?> cls, Object obj) {
        if (this.f12291a == null) {
            this.f12291a = new f0.a();
        }
        this.f12291a.put(cls, obj);
    }

    public void j(a aVar, View.OnClickListener onClickListener) {
        aVar.f12292a.setOnClickListener(onClickListener);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class b {
        public void a(a aVar) {
        }
    }

    public void g(a aVar) {
    }
}
