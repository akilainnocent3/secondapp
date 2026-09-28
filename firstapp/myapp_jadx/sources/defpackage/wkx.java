package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wkx {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public static final class a {
        public static String a(Class cls) {
            LinkedHashMap linkedHashMap = wkx.b;
            String strValue = (String) linkedHashMap.get(cls);
            if (strValue == null) {
                vkx.a aVar = (vkx.a) cls.getAnnotation(vkx.a.class);
                strValue = aVar != null ? aVar.value() : null;
                if (strValue == null || strValue.length() <= 0) {
                    kb5.a("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()));
                    return null;
                }
                linkedHashMap.put(cls, strValue);
            }
            strValue.getClass();
            return strValue;
        }
    }

    public final void a(vkx vkxVar) {
        vkxVar.getClass();
        String strA = a.a(vkxVar.getClass());
        if (strA.length() <= 0) {
            hb5.a("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.a;
        vkx vkxVar2 = (vkx) linkedHashMap.get(strA);
        if (Intrinsics.g(vkxVar2, vkxVar)) {
            return;
        }
        if (vkxVar2 != null && vkxVar2.b) {
            tkx.a(vkxVar, "Navigator ", " is replacing an already attached ", vkxVar2);
        } else if (vkxVar.b) {
            i0b.b(vkxVar, "Navigator ", " is already attached to another NavController");
        }
    }

    public final <T extends vkx<?>> T b(String str) {
        str.getClass();
        if (str.length() <= 0) {
            hb5.a("navigator name cannot be an empty string");
            return null;
        }
        T t = (T) this.a.get(str);
        if (t != null) {
            return t;
        }
        ib5.a(tug.a("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }
}
