package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class ind implements pdd0 {
    public final String a;

    public ind(String str) {
        this.a = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("errorReason", this.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ind) && this.a.equals(((ind) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "deposit__error_dialog__view";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("DepositErrorDialogViewEvent(errorReason=", this.a, ")");
    }
}
