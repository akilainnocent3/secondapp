package defpackage;

import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes.dex */
public final class fjx {
    public static final Class<?> a(pd80 pd80Var) {
        String strP = c.p(pd80Var.h(), "?", "", false);
        try {
            return Class.forName(strP);
        } catch (ClassNotFoundException unused) {
            if (StringsKt.M(strP, ".", false)) {
                return Class.forName(fu5.a("(\\.+)(?!.*\\.)", strP, "\\$"));
            }
            String strConcat = "Cannot find class with name \"" + pd80Var.h() + "\". Ensure that the serialName for this argument is the default fully qualified name";
            if (pd80Var.getKind() instanceof yd80.b) {
                strConcat = strConcat.concat(".\nIf the build is minified, try annotating the Enum class with \"androidx.annotation.Keep\" to ensure the Enum is not removed.");
            }
            hb5.a(strConcat);
            return null;
        }
    }
}
