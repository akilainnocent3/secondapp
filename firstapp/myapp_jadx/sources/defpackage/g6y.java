package defpackage;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes8.dex */
public final class g6y extends c87 {
    public static final EnumSet<a> c = EnumSet.copyOf((Collection) Collections.singletonList(a.a));
    public final EnumSet<a> b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("semiColonRequired", 0);
            a = aVar;
            a aVar2 = new a("semiColonOptional", 1);
            a aVar3 = new a("errorIfNoSemiColon", 2);
            b = aVar3;
            c = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public g6y(a... aVarArr) {
        this.b = Array.getLength(aVarArr) == 0 ? c : EnumSet.copyOf((Collection) Arrays.asList(aVarArr));
    }

    @Override // defpackage.c87
    public final int a(String str, int i, StringWriter stringWriter) throws IOException {
        int i2;
        int length = str.length();
        if (str.charAt(i) == '&' && i < length - 2 && str.charAt(i + 1) == '#') {
            int i3 = i + 2;
            char cCharAt = str.charAt(i3);
            if (cCharAt == 'x' || cCharAt == 'X') {
                i3 = i + 3;
                if (i3 != length) {
                    i2 = 1;
                }
            } else {
                i2 = 0;
            }
            int i4 = i3;
            while (i4 < length && ((str.charAt(i4) >= '0' && str.charAt(i4) <= '9') || ((str.charAt(i4) >= 'a' && str.charAt(i4) <= 'f') || (str.charAt(i4) >= 'A' && str.charAt(i4) <= 'F')))) {
                i4++;
            }
            int i5 = (i4 == length || str.charAt(i4) != ';') ? 0 : 1;
            if (i5 == 0) {
                a aVar = a.a;
                EnumSet<a> enumSet = this.b;
                if (!enumSet.contains(aVar)) {
                    if (enumSet.contains(a.b)) {
                        hb5.a("Semi-colon required at end of numeric entity");
                        return 0;
                    }
                }
            }
            try {
                int i6 = i2 != 0 ? Integer.parseInt(str.subSequence(i3, i4).toString(), 16) : Integer.parseInt(str.subSequence(i3, i4).toString(), 10);
                if (i6 > 65535) {
                    char[] chars = Character.toChars(i6);
                    stringWriter.write(chars[0]);
                    stringWriter.write(chars[1]);
                } else {
                    stringWriter.write(i6);
                }
                return ((i4 + 2) - i3) + i2 + i5;
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }
}
