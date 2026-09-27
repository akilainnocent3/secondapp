package x4;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import cj.v6;
import cj.x6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class j {
    public static HashMap<String, String> a(Bundle bundle) {
        HashMap<String, String> map = new HashMap<>();
        if (bundle != Bundle.EMPTY) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    map.put(str, string);
                }
            }
        }
        return map;
    }

    public static x6<String, String> b(Bundle bundle) {
        return bundle == Bundle.EMPTY ? x6.y() : x6.m(a(bundle));
    }

    public static void c(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) b2.o(j.class.getClassLoader()));
        }
    }

    public static <T> v6<T> d(zi.t<Bundle, T> tVar, List<Bundle> list) {
        v6.a aVarQ = v6.q();
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarQ.g(tVar.apply((Bundle) zi.l0.E(list.get(i10))));
        }
        return aVarQ.e();
    }

    public static <T> SparseArray<T> e(zi.t<Bundle, T> tVar, SparseArray<Bundle> sparseArray) {
        SparseArray<T> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), tVar.apply(sparseArray.valueAt(i10)));
        }
        return sparseArray2;
    }

    public static Bundle f(Bundle bundle, String str, Bundle bundle2) {
        Bundle bundle3 = bundle.getBundle(str);
        return bundle3 != null ? bundle3 : bundle2;
    }

    public static ArrayList<Integer> g(Bundle bundle, String str, ArrayList<Integer> arrayList) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
        return integerArrayList != null ? integerArrayList : arrayList;
    }

    public static Bundle h(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public static <T> ArrayList<Bundle> i(Collection<T> collection, zi.t<T, Bundle> tVar) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(tVar.apply(it.next()));
        }
        return arrayList;
    }

    public static <T> v6<Bundle> j(List<T> list, zi.t<T, Bundle> tVar) {
        v6.a aVarQ = v6.q();
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarQ.g(tVar.apply(list.get(i10)));
        }
        return aVarQ.e();
    }

    public static <T> SparseArray<Bundle> k(SparseArray<T> sparseArray, zi.t<T, Bundle> tVar) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), tVar.apply(sparseArray.valueAt(i10)));
        }
        return sparseArray2;
    }
}
