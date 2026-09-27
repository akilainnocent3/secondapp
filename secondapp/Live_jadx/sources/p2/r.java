package p2;

import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray<WeakHashMap<View, WeakReference<?>>> f120362a = new SparseArray<>();

    public static <T> T a(View view, int i10) {
        return (T) view.getTag(i10);
    }

    public static <T> T b(View view, T t10, int i10) {
        T t11 = (T) view.getTag(i10);
        view.setTag(i10, t10);
        return t11;
    }
}
