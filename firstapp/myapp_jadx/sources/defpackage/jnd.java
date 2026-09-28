package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class jnd implements pdd0 {
    public final String a = "deposit__error_recovery_dialogue__click";
    public final String b;
    public final String c;
    public final String d;

    public jnd(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("error_type", this.b), new Pair("button_tier", this.c), new Pair("button_type", this.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnd)) {
            return false;
        }
        jnd jndVar = (jnd) obj;
        return this.a.equals(jndVar.a) && this.b.equals(jndVar.b) && this.c.equals(jndVar.c) && this.d.equals(jndVar.d);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return kwi.a(ux5.a("DepositErrorRecoveryDialogueClickEvent(name=", this.a, ", errorType=", this.b, ", buttonTier="), this.c, ", buttonType=", this.d, ")");
    }
}
