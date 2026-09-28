package defpackage;

import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class kcx implements pdd0 {
    public final pcx a;

    public kcx(pcx pcxVar) {
        pcxVar.getClass();
        this.a = pcxVar;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("trigger", this.a.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kcx) && this.a == ((kcx) obj).a;
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "name_confirm__success_snackbar__view";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return xOgHBQVl.dZPbHCCYZkT + this.a + ")";
    }
}
