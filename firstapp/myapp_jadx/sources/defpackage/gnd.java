package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class gnd implements pdd0 {
    public final String a = "deposit__amount_chip__click";
    public final int b;
    public final boolean c;

    public gnd(int i, boolean z) {
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("amount", Integer.valueOf(this.b)), new Pair("hot_label_show", Boolean.valueOf(this.c)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gnd)) {
            return false;
        }
        gnd gndVar = (gnd) obj;
        return this.a.equals(gndVar.a) && this.b == gndVar.b && this.c == gndVar.c;
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + gpp.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return mq0.a(ml5.a(this.b, "DepositAmountChipClickEvent(name=", this.a, ", chipAmount=", ", hotLabelShow="), this.c, ")");
    }
}
