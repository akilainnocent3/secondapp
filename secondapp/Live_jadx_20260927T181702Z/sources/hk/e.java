package hk;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, String> f88414a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f88416c;

    public e(int i10, int i11) {
        this.f88415b = i10;
        this.f88416c = i11;
    }

    public static String c(String str, int i10) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i10 ? strTrim.substring(0, i10) : strTrim;
    }

    @NonNull
    public synchronized Map<String, String> a() {
        return Collections.unmodifiableMap(new HashMap(this.f88414a));
    }

    public final String b(String str) {
        if (str != null) {
            return c(str, this.f88416c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public synchronized boolean d(String str, String str2) {
        String strB = b(str);
        if (this.f88414a.size() >= this.f88415b && !this.f88414a.containsKey(strB)) {
            ck.g.f().m("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f88415b);
            return false;
        }
        String strC = c(str2, this.f88416c);
        if (fk.i.B(this.f88414a.get(strB), strC)) {
            return false;
        }
        Map<String, String> map = this.f88414a;
        if (str2 == null) {
            strC = "";
        }
        map.put(strB, strC);
        return true;
    }

    public synchronized void e(Map<String, String> map) {
        try {
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String strB = b(entry.getKey());
                if (this.f88414a.size() < this.f88415b || this.f88414a.containsKey(strB)) {
                    String value = entry.getValue();
                    this.f88414a.put(strB, value == null ? "" : c(value, this.f88416c));
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                ck.g.f().m("Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f88415b);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
