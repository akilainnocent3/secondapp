package qe;

import ae.h;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SparseArray<h> f122170a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static HashMap<h, Integer> f122171b;

    static {
        HashMap<h, Integer> map = new HashMap<>();
        f122171b = map;
        map.put(h.DEFAULT, 0);
        f122171b.put(h.VERY_LOW, 1);
        f122171b.put(h.HIGHEST, 2);
        for (h hVar : f122171b.keySet()) {
            f122170a.append(f122171b.get(hVar).intValue(), hVar);
        }
    }

    public static int a(@NonNull h hVar) {
        Integer num = f122171b.get(hVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + hVar);
    }

    @NonNull
    public static h b(int i10) {
        h hVar = f122170a.get(i10);
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
