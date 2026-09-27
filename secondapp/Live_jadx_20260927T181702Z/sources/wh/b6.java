package wh;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@k.y0({k.y0.a.LIBRARY_GROUP})
public final class b6 implements z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<Integer, Integer> f143032a;

    @Override // wh.z5
    public c6 a(int[] iArr, int i10) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i11 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i11));
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            linkedHashMap.put(Integer.valueOf(i11), Integer.valueOf(iIntValue));
        }
        this.f143032a = linkedHashMap;
        return new c6(linkedHashMap);
    }

    public Map<Integer, Integer> b() {
        return this.f143032a;
    }
}
