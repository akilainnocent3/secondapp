package androidx.media3.ui;

import android.text.Html;
import defpackage.csa0;
import defpackage.dsa0;
import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final Pattern a = Pattern.compile("(&#13;)?&#10;");

    /* JADX INFO: renamed from: androidx.media3.ui.a$a, reason: collision with other inner class name */
    public static class C0066a {
        public final String a;
        public final Map<String, String> b;

        public C0066a(String str, Map<String, String> map) {
            this.a = str;
            this.b = map;
        }
    }

    public static final class b {
        public static final csa0 e = new csa0();
        public static final dsa0 f = new dsa0();
        public final int a;
        public final int b;
        public final String c;
        public final String d;

        public b(int i, int i2, String str, String str2) {
            this.a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
        }
    }

    public static final class c {
        public final ArrayList a = new ArrayList();
        public final ArrayList b = new ArrayList();
    }

    public static String a(CharSequence charSequence) {
        return a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
