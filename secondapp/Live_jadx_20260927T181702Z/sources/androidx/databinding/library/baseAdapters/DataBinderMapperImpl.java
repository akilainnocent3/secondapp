package androidx.databinding.library.baseAdapters;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.k;
import androidx.databinding.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class DataBinderMapperImpl extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f9510a = new SparseIntArray(0);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SparseArray<String> f9511a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f9511a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final HashMap<String, Integer> f9512a = new HashMap<>(0);
    }

    @Override // androidx.databinding.k
    public List<k> a() {
        return new ArrayList(0);
    }

    @Override // androidx.databinding.k
    public String b(int i10) {
        return a.f9511a.get(i10);
    }

    @Override // androidx.databinding.k
    public ViewDataBinding c(l lVar, View view, int i10) {
        if (f9510a.get(i10) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.k
    public ViewDataBinding d(l lVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f9510a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.k
    public int e(String str) {
        Integer num;
        if (str == null || (num = b.f9512a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
