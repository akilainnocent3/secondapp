package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class od3 {

    public static final class a {
        public final String a;
        public final String b;
        public final Map<String, Object> c;

        public a(Map map, String str, String str2) {
            this.a = str;
            this.b = str2;
            this.c = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("MismatchPayload(failedState=", this.a, ", stateInfo=", this.b, ", uiDebugContext=");
            sbA.append(this.c);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static String a(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z || z2) {
            return "other_fbg__button";
        }
        if (z3) {
            return "bet_placed__request";
        }
        return z4 ? "bet_placed__response" : "no_bet__placed";
    }

    public static String b(String str, String str2) {
        String str3;
        str.getClass();
        switch (str) {
            case "ROUND_PRE_START":
                str3 = "round_pre_start";
                break;
            case "ROUND_WAITING":
                str3 = "round_waiting";
                break;
            case "ROUND_END_WAIT":
                str3 = "round_end_wait";
                break;
            case "ROUND_ONGOING":
                str3 = "round_ongoing";
                break;
            default:
                str3 = null;
                break;
        }
        if (str3 == null) {
            return null;
        }
        return tug.a(str3, "__", str2);
    }
}
