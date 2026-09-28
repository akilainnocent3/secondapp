package defpackage;

import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes8.dex */
public final class ipa {
    public static String a(String str, String str2) {
        final String strReplace = str.toLowerCase(Locale.ROOT).replace("-", ".");
        String str3 = (String) ((Properties) System.getProperties().clone()).entrySet().stream().filter(new Predicate() { // from class: epa
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return strReplace.equals(((Map.Entry) obj).getKey().toString().toLowerCase(Locale.ROOT).replace("-", "."));
            }
        }).map(new fpa()).findFirst().orElse(null);
        return str3 != null ? str3 : (String) System.getenv().entrySet().stream().filter(new Predicate() { // from class: gpa
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return strReplace.equals(((String) ((Map.Entry) obj).getKey()).toLowerCase(Locale.ROOT).replace("_", "."));
            }
        }).map(new hpa()).findFirst().orElse(str2);
    }
}
