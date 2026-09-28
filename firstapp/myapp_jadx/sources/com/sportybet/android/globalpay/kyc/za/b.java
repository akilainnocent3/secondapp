package com.sportybet.android.globalpay.kyc.za;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    public static final a a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final b i;
    public static final /* synthetic */ b[] v;

    public static final class a {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public static b a(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -788374099:
                        if (str.equals("REJECTED_SUBMISSION")) {
                            return b.c;
                        }
                        break;
                    case -595122412:
                        if (str.equals("PENDING_SUBMISSION")) {
                            return b.d;
                        }
                        break;
                    case -35012943:
                        if (str.equals("WAITING_KYC_EXTERNAL_VALIDATION")) {
                            return b.e;
                        }
                        break;
                    case 1709771815:
                        if (str.equals("REJECTED_PASSPORT_VERIFICATION")) {
                            return b.f;
                        }
                        break;
                    case 2015421077:
                        if (str.equals("NEED_SUBMISSION")) {
                            return b.b;
                        }
                        break;
                }
            }
            return b.i;
        }
    }

    static {
        b bVar = new b("NEED_SUBMISSION", 0);
        b = bVar;
        b bVar2 = new b("REJECTED_SUBMISSION", 1);
        c = bVar2;
        b bVar3 = new b("PENDING_SUBMISSION", 2);
        d = bVar3;
        b bVar4 = new b("WAITING_KYC_EXTERNAL_VALIDATION", 3);
        e = bVar4;
        b bVar5 = new b("REJECTED_PASSPORT_VERIFICATION", 4);
        f = bVar5;
        b bVar6 = new b("EMPTY", 5);
        i = bVar6;
        v = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        a = new a();
    }

    public b() {
        throw null;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) v.clone();
    }
}
