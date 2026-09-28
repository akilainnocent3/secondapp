package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class hjf implements pdd0 {
    public final lkf a;
    public final zjf b;
    public final pkf c;

    public hjf(lkf lkfVar, zjf zjfVar, pkf pkfVar) {
        this.a = lkfVar;
        this.b = zjfVar;
        this.c = pkfVar;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("from", yjf.b(this.a)), new Pair("type", yjf.a(this.b)), new Pair("value", yjf.d(this.c)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjf)) {
            return false;
        }
        hjf hjfVar = (hjf) obj;
        return this.a == hjfVar.a && this.b == hjfVar.b && this.c == hjfVar.c;
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return "eg_toggle_market_bar__view";
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "EarlyGoalsToggleMarketBarView(from=" + this.a + ", type=" + this.b + ", value=" + this.c + ")";
    }
}
