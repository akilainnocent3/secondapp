package defpackage;

import com.sportybet.plugin.realsports.home.featuredsection.lAly.lTGEJfVytU;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class qmk0 {
    public static final tcn d = tcn.j(3, lTGEJfVytU.guxtch, "_err", "_el");
    public String a;
    public final long b;
    public final HashMap c;

    public qmk0(String str, long j, HashMap map) {
        this.a = str;
        this.b = j;
        HashMap map2 = new HashMap();
        this.c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public static Object b(Object obj, String str, Object obj2) {
        if (d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qmk0 clone() {
        return new qmk0(this.a, this.b, new HashMap(this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qmk0)) {
            return false;
        }
        qmk0 qmk0Var = (qmk0) obj;
        if (this.b == qmk0Var.b && this.a.equals(qmk0Var.a)) {
            return this.c.equals(qmk0Var.c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return this.c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.a;
        String string = this.c.toString();
        int length = String.valueOf(str).length();
        long j = this.b;
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(j).length() + 9 + string.length() + 1);
        u4.a(sb, "Event{name='", str, "', timestamp=");
        em5.a(j, ", params=", string, sb);
        sb.append("}");
        return sb.toString();
    }
}
