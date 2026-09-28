package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class ecx implements pdd0 {
    public final boolean a;

    public ecx(boolean z) {
        this.a = z;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("has_prefill_name", Boolean.valueOf(this.a)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ecx) && this.a == ((ecx) obj).a;
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "name_confirm__confirm_btn__click";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return b6c.a("NameConfirmConfirmButtonClickEvent(hasPrefillName=", ")", this.a);
    }
}
