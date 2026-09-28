package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class jcx implements pdd0 {
    public final boolean a;
    public final pcx b;

    public jcx(boolean z, pcx pcxVar) {
        pcxVar.getClass();
        this.a = z;
        this.b = pcxVar;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("has_prefill_name", Boolean.valueOf(this.a)), new Pair("trigger", this.b.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcx)) {
            return false;
        }
        jcx jcxVar = (jcx) obj;
        return this.a == jcxVar.a && this.b == jcxVar.b;
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "name_confirm__page__view";
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "NameConfirmPageViewEvent(hasPrefillName=" + this.a + ", trigger=" + this.b + ")";
    }
}
