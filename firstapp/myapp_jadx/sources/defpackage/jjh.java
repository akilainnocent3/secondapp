package defpackage;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public abstract class jjh implements kjh {
    public static final a a;
    public static final /* synthetic */ jjh[] b;

    public final enum a extends jjh {
        public a() {
            super("IDENTITY", 0);
        }

        @Override // defpackage.kjh
        public final String a(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a();
        a = aVar;
        b = new jjh[]{aVar, new jjh() { // from class: jjh.b
            @Override // defpackage.kjh
            public final String a(Field field) {
                return jjh.c(field.getName());
            }
        }, new jjh() { // from class: jjh.c
            @Override // defpackage.kjh
            public final String a(Field field) {
                return jjh.c(jjh.b(' ', field.getName()));
            }
        }, new jjh() { // from class: jjh.d
            @Override // defpackage.kjh
            public final String a(Field field) {
                return jjh.b('_', field.getName()).toUpperCase(Locale.ENGLISH);
            }
        }, new jjh() { // from class: jjh.e
            @Override // defpackage.kjh
            public final String a(Field field) {
                return jjh.b('_', field.getName()).toLowerCase(Locale.ENGLISH);
            }
        }, new jjh() { // from class: jjh.f
            @Override // defpackage.kjh
            public final String a(Field field) {
                return jjh.b('-', field.getName()).toLowerCase(Locale.ENGLISH);
            }
        }, new jjh() { // from class: jjh.g
            @Override // defpackage.kjh
            public final String a(Field field) {
                return jjh.b('.', field.getName()).toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public jjh() {
        throw null;
    }

    public static String b(char c2, String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String c(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    break;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static jjh valueOf(String str) {
        return (jjh) Enum.valueOf(jjh.class, str);
    }

    public static jjh[] values() {
        return (jjh[]) b.clone();
    }
}
