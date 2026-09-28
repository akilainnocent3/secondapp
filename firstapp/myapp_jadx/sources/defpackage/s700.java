package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class s700 implements pdd0 {
    public final String a;

    public s700(String str) {
        this.a = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("type_str", this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s700) && this.a.equals(((s700) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "Payment_Deposit_Top_Up_Now_Clicked";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("PaymentDepositTopUpNowClickedEvent(sourceType=", this.a, ")");
    }
}
