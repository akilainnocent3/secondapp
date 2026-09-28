package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class lmd implements pdd0 {
    public final String a;

    public lmd(String str) {
        this.a = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("source", this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lmd) && this.a.equals(((lmd) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "instant_win__demand_account__logout_on_failure";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("InstantWinLogoutOnFailure(source=", this.a, ")");
    }
}
