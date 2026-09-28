package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class jdp {
    public static final gdp a(Number number, String str) {
        str.getClass();
        return new gdp("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) g(-1, str)));
    }

    public static final gdp b(pd80 pd80Var) {
        pd80Var.getClass();
        return new gdp("Value of type '" + pd80Var.h() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + pd80Var.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final pcp c(int i, CharSequence charSequence, String str) {
        charSequence.getClass();
        return d(i, str + "\nJSON input: " + ((Object) g(i, charSequence)));
    }

    public static final pcp d(int i, String str) {
        if (i >= 0) {
            str = "Unexpected JSON token at offset " + i + ": " + str;
        }
        str.getClass();
        return new pcp(str);
    }

    public static final void e(v9e0 v9e0Var, String str) {
        v9e0Var.k(v9e0Var.a - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static /* synthetic */ void f(v9e0 v9e0Var) {
        e(v9e0Var, "object");
        throw null;
    }

    public static final CharSequence g(int i, CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sb = new StringBuilder(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sb.append(charSequence.subSequence(i2, i3).toString());
                sb.append(str2);
                return sb.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void h(v9e0 v9e0Var, Number number) {
        v9e0.l(v9e0Var, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String i(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) g(-1, str2));
    }
}
