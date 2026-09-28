package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class cqg {

    public static final /* synthetic */ class a extends saj implements Function1<String, Boolean> {
        public static final a a = new a(1, StringsKt.class, "isNotBlank", "isNotBlank(Ljava/lang/CharSequence;)Z", 1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String str) {
            String str2 = str;
            str2.getClass();
            return Boolean.valueOf(!StringsKt.U(str2));
        }
    }

    public static final String a(String str) {
        List listH;
        if (str != null) {
            int i = 1;
            String strV0 = StringsKt.v0(str, ':');
            if (strV0 != null) {
                String strK0 = StringsKt.k0(strV0, ":", "");
                if (StringsKt.U(strK0)) {
                    strK0 = null;
                }
                if (strK0 != null && (listH = new Regex("[:,]").h(strK0)) != null) {
                    return ld80.g(ld80.d(new ysg0(new u48(listH), new vb8(i)), a.a), ", ", null, 62);
                }
            }
        }
        return "";
    }
}
