package com.google.gson;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements FieldNamingStrategy {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f52382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f52383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f52384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f52385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f52386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f52387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f52388h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ c[] f52389i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final enum a extends c {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f52382b = aVar;
        c cVar = new c("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.c.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.FieldNamingStrategy
            public String translateName(Field field) {
                return c.b(field.getName());
            }
        };
        f52383c = cVar;
        c cVar2 = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.c.c
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.FieldNamingStrategy
            public String translateName(Field field) {
                return c.b(c.a(field.getName(), ' '));
            }
        };
        f52384d = cVar2;
        c cVar3 = new c("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.c.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.FieldNamingStrategy
            public String translateName(Field field) {
                return c.a(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        f52385e = cVar3;
        c cVar4 = new c("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: com.google.gson.c.e
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.FieldNamingStrategy
            public String translateName(Field field) {
                return c.a(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        f52386f = cVar4;
        c cVar5 = new c("LOWER_CASE_WITH_DASHES", 5) { // from class: com.google.gson.c.f
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.FieldNamingStrategy
            public String translateName(Field field) {
                return c.a(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        f52387g = cVar5;
        c cVar6 = new c("LOWER_CASE_WITH_DOTS", 6) { // from class: com.google.gson.c.g
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.FieldNamingStrategy
            public String translateName(Field field) {
                return c.a(field.getName(), kj.e.f102543c).toLowerCase(Locale.ENGLISH);
            }
        };
        f52388h = cVar6;
        f52389i = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5, cVar6};
    }

    public c(String str, int i10) {
        super(str, i10);
    }

    public static String a(String str, char c10) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt) && sb2.length() != 0) {
                sb2.append(c10);
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    public static String b(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    break;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i10 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
            }
        }
        return str;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f52389i.clone();
    }

    @Override // com.google.gson.FieldNamingStrategy
    public /* synthetic */ List alternateNames(Field field) {
        return com.google.gson.d.a(this, field);
    }

    public /* synthetic */ c(String str, int i10, a aVar) {
        this(str, i10);
    }
}
