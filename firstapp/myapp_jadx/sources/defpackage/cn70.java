package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class cn70 {

    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return vl8.b((Integer) ((Map.Entry) t).getKey(), (Integer) ((Map.Entry) t2).getKey());
        }
    }

    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return vl8.b((Integer) ((Map.Entry) t).getKey(), (Integer) ((Map.Entry) t2).getKey());
        }
    }

    public static final o3f0.d b(vp60 vp60Var, String str, boolean z) {
        hq60 hq60VarH1 = vp60Var.H1("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iA = jq60.a(hq60VarH1, "seqno");
            int iA2 = jq60.a(hq60VarH1, "cid");
            int iA3 = jq60.a(hq60VarH1, "name");
            int iA4 = jq60.a(hq60VarH1, "desc");
            if (iA != -1 && iA2 != -1 && iA3 != -1 && iA4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (hq60VarH1.D1()) {
                    if (((int) hq60VarH1.getLong(iA2)) >= 0) {
                        int i = (int) hq60VarH1.getLong(iA);
                        String strK1 = hq60VarH1.k1(iA3);
                        String str2 = hq60VarH1.getLong(iA4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), strK1);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listR0 = CollectionsKt.r0(linkedHashMap.entrySet(), new a());
                ArrayList arrayList = new ArrayList(l48.r(listR0, 10));
                Iterator it = listR0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listA0 = CollectionsKt.A0(arrayList);
                List listR1 = CollectionsKt.r0(linkedHashMap2.entrySet(), new b());
                ArrayList arrayList2 = new ArrayList(l48.r(listR1, 10));
                Iterator it2 = listR1.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                o3f0.d dVar = new o3f0.d(str, z, listA0, CollectionsKt.A0(arrayList2));
                vc1.a(hq60VarH1, null);
                return dVar;
            }
            vc1.a(hq60VarH1, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                vc1.a(hq60VarH1, th);
                throw th2;
            }
        }
    }

    public static final List<rti> a(hq60 hq60Var) {
        int iA = jq60.a(hq60Var, AnalyticsParam.EVENT_PARAM_ID);
        int iA2 = jq60.a(hq60Var, "seq");
        int iA3 = jq60.a(hq60Var, dLRYz.GIl);
        int iA4 = jq60.a(hq60Var, "to");
        ngs ngsVarB = kotlin.collections.a.b();
        while (hq60Var.D1()) {
            ngsVarB.add(new rti((int) hq60Var.getLong(iA), (int) hq60Var.getLong(iA2), hq60Var.k1(iA3), hq60Var.k1(iA4)));
        }
        return CollectionsKt.q0(kotlin.collections.a.a(ngsVarB));
    }
}
