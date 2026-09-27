package com.startapp.sdk.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f75394a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sf f75395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile String f75396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile String f75397d;

    public q0(sf sfVar) {
        this.f75395b = sfVar;
    }

    public final boolean a(String str, String str2) {
        boolean z10;
        if (str != null) {
            str = str.trim();
            if (str.isEmpty()) {
                str = null;
            }
        }
        if (str2 != null) {
            str2 = str2.trim();
            if (str2.isEmpty()) {
                str2 = null;
            }
        }
        synchronized (this.f75394a) {
            try {
                z10 = (si.a((Object) this.f75396c, (Object) str) && si.a((Object) this.f75397d, (Object) str2)) ? false : true;
                this.f75396c = str;
                this.f75397d = str2;
                rf rfVarEdit = this.f75395b.edit();
                rfVarEdit.a("c88d4eab540fab77", str);
                rfVarEdit.f75462a.putString("c88d4eab540fab77", str);
                rfVarEdit.a("2696a7f502faed4b", str2);
                rfVarEdit.f75462a.putString("2696a7f502faed4b", str2);
                rfVarEdit.f75462a.commit();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public final String a() {
        String string;
        String str = this.f75397d;
        if (str != null) {
            return str;
        }
        synchronized (this.f75394a) {
            try {
                string = this.f75397d;
                if (string == null && (string = this.f75395b.getString("2696a7f502faed4b", null)) == null) {
                    string = this.f75395b.getString("31721150b470a3b9", null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }
}
