package defpackage;

import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class yox implements pdd0 {
    public final nkf a;
    public final pkf b;

    public yox(nkf nkfVar, pkf pkfVar) {
        this.a = nkfVar;
        this.b = pkfVar;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("from", yjf.c(this.a)), new Pair("value", yjf.d(this.b)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yox)) {
            return false;
        }
        yox yoxVar = (yox) obj;
        return this.a == yoxVar.a && this.b == yoxVar.b;
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "betslip__neverbehind_checkbox__click";
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NeverDownCheckBoxSelectionClick(from=" + this.a + ", value=" + this.b + oAudzpbdOhCI.YhUoXKaSCcNoM;
    }
}
