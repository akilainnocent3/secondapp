package defpackage;

import java.util.Locale;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dtp {
    public static Map a(Integer num, String str) {
        return jpu.b(new Pair(str, num));
    }

    public static boolean b(String str, String str2, Locale locale) {
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        return lowerCase.equals(str2);
    }
}
