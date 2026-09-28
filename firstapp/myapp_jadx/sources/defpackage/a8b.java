package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class a8b {
    public static final d8b a = new d8b();

    @Deprecated(since = "Use ICountryManager.getDisplayCurrency() instead")
    public static String a(String str) {
        return a.a().I(str);
    }

    @Deprecated(since = "Use ICountryManager.getCallingCode() instead")
    public static String b() {
        return a.a().M();
    }

    @Deprecated(since = "Do not use this method, use methods in ICountryManager instead")
    public static w7b c() {
        return ((h8b) a.a()).e();
    }

    @Deprecated(since = "Use ICountryManager.getCurrency() instead")
    public static String d() {
        return a.a().f();
    }

    @Deprecated(since = "Use ICountryManager.getCurrencyTrim() instead")
    public static String e() {
        return a.a().f();
    }
}
