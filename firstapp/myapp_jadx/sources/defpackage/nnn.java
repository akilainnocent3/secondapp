package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes5.dex */
public final class nnn {
    public static final Regex a = new Regex("[\\u0000-\\u001f\\u007f]");
    public static InstallReferrerClient b;
    public static a c;
    public static String d;

    /* JADX INFO: loaded from: classes4.dex */
    public static final class a extends ao20 {
        public static final /* synthetic */ ohp<Object>[] f = {new otw(0, a.class, "referrerLink", "getReferrerLink()Ljava/lang/String;")};
        public final ao20.a e;

        public a(hp0 hp0Var) {
            super(hp0Var, "InstallReferrerPreferences");
            this.e = ao20.a(this);
        }
    }

    public static String a(String str) {
        String strReplace;
        if (str == null || (strReplace = a.replace(str, "")) == null || strReplace.length() <= 0) {
            return null;
        }
        return strReplace;
    }
}
