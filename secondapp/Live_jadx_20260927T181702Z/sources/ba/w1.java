package ba;

import androidx.annotation.NonNull;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f21003a = "MOBILE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f21004b = "BRAND_VERSION_LIST";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f21005c = "FULL_VERSION";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f21006d = "PLATFORM";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f21007e = "PLATFORM_VERSION";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f21008f = "ARCHITECTURE";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f21009g = "MODEL";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f21010h = "BITNESS";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f21011i = "WOW64";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f21012j = 3;

    @NonNull
    public static Map<String, Object> a(@NonNull aa.q qVar) {
        HashMap map = new HashMap();
        map.put(f21004b, b(qVar.c()));
        map.put(f21005c, qVar.d());
        map.put(f21006d, qVar.f());
        map.put(f21007e, qVar.g());
        map.put(f21008f, qVar.a());
        map.put(f21009g, qVar.e());
        map.put(f21003a, Boolean.valueOf(qVar.h()));
        map.put(f21010h, Integer.valueOf(qVar.b()));
        map.put(f21011i, Boolean.valueOf(qVar.i()));
        return map;
    }

    public static String[][] b(List<aa.q.b> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String[][] strArr = (String[][]) Array.newInstance((Class<?>) String.class, list.size(), 3);
        for (int i10 = 0; i10 < list.size(); i10++) {
            strArr[i10][0] = list.get(i10).a();
            strArr[i10][1] = list.get(i10).c();
            strArr[i10][2] = list.get(i10).b();
        }
        return strArr;
    }

    @NonNull
    public static aa.q c(@NonNull Map<String, Object> map) {
        aa.q.c cVar = new aa.q.c();
        Object obj = map.get(f21004b);
        if (obj != null) {
            ArrayList arrayList = new ArrayList();
            for (String[] strArr : (String[][]) obj) {
                arrayList.add(new aa.q.b.a().b(strArr[0]).d(strArr[1]).c(strArr[2]).a());
            }
            cVar.d(arrayList);
        }
        String str = (String) map.get(f21005c);
        if (str != null) {
            cVar.e(str);
        }
        String str2 = (String) map.get(f21006d);
        if (str2 != null) {
            cVar.h(str2);
        }
        String str3 = (String) map.get(f21007e);
        if (str3 != null) {
            cVar.i(str3);
        }
        String str4 = (String) map.get(f21008f);
        if (str4 != null) {
            cVar.b(str4);
        }
        String str5 = (String) map.get(f21009g);
        if (str5 != null) {
            cVar.g(str5);
        }
        Boolean bool = (Boolean) map.get(f21003a);
        if (bool != null) {
            cVar.f(bool.booleanValue());
        }
        Integer num = (Integer) map.get(f21010h);
        if (num != null) {
            cVar.c(num.intValue());
        }
        Boolean bool2 = (Boolean) map.get(f21011i);
        if (bool2 != null) {
            cVar.j(bool2.booleanValue());
        }
        return cVar.a();
    }
}
