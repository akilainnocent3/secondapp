package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c6d {

    public static final class a extends c6d {
        public static final a a = new a();

        public static String a(String str, String str2, String str3) {
            StringBuilder sb = new StringBuilder("team_detail");
            sb.append("?team_id=" + Uri.encode(str));
            if (str2 == null) {
                str2 = "";
            }
            sb.append("&team_name=" + Uri.encode(str2));
            if (str3 == null) {
                str3 = "";
            }
            sb.append("&entrance=" + Uri.encode(str3));
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -560194823;
        }

        public final String toString() {
            return "TeamDetail";
        }
    }
}
