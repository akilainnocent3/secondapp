package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class knd implements pdd0 {
    public final String a = "deposit__error_recovery_dialogue__view";
    public final String b;

    public knd(String str) {
        this.b = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("error_type", this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof knd)) {
            return false;
        }
        knd kndVar = (knd) obj;
        return this.a.equals(kndVar.a) && this.b.equals(kndVar.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("DepositErrorRecoveryDialogueViewEvent(name=", this.a, ", errorType=", this.b, ")");
    }
}
