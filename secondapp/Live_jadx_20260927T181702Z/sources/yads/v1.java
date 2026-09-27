package yads;

import android.content.pm.ActivityInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f156709a = "com.yandex.mobile.ads.common.AdActivity has missed configuration attribute %s.";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f156710b = fr.n1.W(dr.v1.a(16, "ActivityInfo.CONFIG_KEYBOARD"), dr.v1.a(32, "ActivityInfo.CONFIG_KEYBOARD_HIDDEN"), dr.v1.a(128, "ActivityInfo.CONFIG_ORIENTATION"), dr.v1.a(256, "ActivityInfo.CONFIG_SCREEN_LAYOUT"), dr.v1.a(512, "ActivityInfo.CONFIG_UI_MODE"), dr.v1.a(1024, "ActivityInfo.CONFIG_SCREEN_SIZE"), dr.v1.a(2048, "CONFIG_SMALLEST_SCREEN_SIZE"));

    public static void a(ActivityInfo activityInfo) {
        Object obj;
        Map map = f156710b;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            String str = (String) entry.getValue();
            if ((iIntValue & activityInfo.configChanges) == 0) {
                obj = str;
            }
            arrayList.add(obj);
        }
        for (Object obj2 : arrayList) {
            if (((String) obj2) != null) {
                obj = obj2;
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 == null) {
            return;
        }
        String str3 = String.format(f156709a, Arrays.copyOf(new Object[]{str2}, 1));
        kotlin.jvm.internal.m0.o(str3, "format(...)");
        throw new ub1(str3, str3);
    }
}
