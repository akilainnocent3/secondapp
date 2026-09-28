package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class g9s implements pdd0 {
    public final w8s a;

    public g9s(w8s w8sVar) {
        this.a = w8sVar;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        String str;
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            str = "top_banner";
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return null;
            }
            str = "bottom_cta";
        }
        return kpu.d(new Pair("from", str));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g9s) && this.a == ((g9s) obj).a;
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "smart_remix_liability_bottom_sheet__smart_remix_button__click";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SmartRemixLiabilityBottomSheetSRButtonClick(from=" + this.a + ")";
    }
}
