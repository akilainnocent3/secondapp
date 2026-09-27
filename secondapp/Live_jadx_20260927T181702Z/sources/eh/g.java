package eh;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import cj.v6;
import cj.x6;
import com.google.android.material.internal.ParcelableSparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class g {
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
            bundle.setClassLoader((ClassLoader) o1.o(g.class.getClassLoader()));
        }
    }

    public static <T extends re.j> v6<T> d(re.j.a<T> aVar, List<Bundle> list) {
        v6.a aVarQ = v6.q();
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarQ.g(aVar.fromBundle((Bundle) a.g(list.get(i10))));
        }
        return aVarQ.e();
    }

    public static <T extends re.j> SparseArray<T> e(re.j.a<T> aVar, SparseArray<Bundle> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            parcelableSparseArray.put(sparseArray.keyAt(i10), aVar.fromBundle(sparseArray.valueAt(i10)));
        }
        return parcelableSparseArray;
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

    public static <T extends re.j> ArrayList<Bundle> i(Collection<T> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toBundle());
        }
        return arrayList;
    }

    public static <T extends re.j> v6<Bundle> j(List<T> list) {
        return k(list, new zi.t() { // from class: eh.f
            @Override // zi.t
            public final Object apply(Object obj) {
                return ((re.j) obj).toBundle();
            }
        });
    }

    public static <T extends re.j> v6<Bundle> k(List<T> list, zi.t<T, Bundle> tVar) {
        v6.a aVarQ = v6.q();
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarQ.g(tVar.apply(list.get(i10)));
        }
        return aVarQ.e();
    }

    public static <T extends re.j> SparseArray<Bundle> l(SparseArray<T> sparseArray) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10).toBundle());
        }
        return sparseArray2;
    }
}
