package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ueh implements otk0 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ ueh b = new ueh();

    public static final Pair a(String str, String str2) {
        String strD0;
        String value;
        Regex regex = new Regex("\\s\\(.+\\)");
        if (regex.a(str)) {
            String strReplace = regex.replace(str, "");
            n8v n8vVarB = regex.b(str);
            strD0 = (n8vVarB == null || (value = n8vVarB.getValue()) == null) ? "" : StringsKt.d0(value, " (", ")");
            str = strReplace;
        } else {
            strD0 = "";
        }
        String strK0 = str2 != null ? StringsKt.k0(str2, "=", str2) : "";
        if (!StringsKt.U(strK0) && !StringsKt.M(str, strK0, false)) {
            str = tug.a(str, " ", strK0);
        }
        return new Pair(str, strD0);
    }

    @Override // defpackage.otk0
    public Object zza() {
        List list = v2l0.a;
        return Boolean.valueOf(((eql0) dql0.b.a.a).zza());
    }
}
