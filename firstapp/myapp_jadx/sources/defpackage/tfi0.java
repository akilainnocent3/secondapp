package defpackage;

import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class tfi0 implements pdd0 {
    public final String a = "virtual_lobby__entrance__click";
    public final String b;

    public tfi0(String str) {
        this.b = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("item_name", this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfi0)) {
            return false;
        }
        tfi0 tfi0Var = (tfi0) obj;
        return this.a.equals(tfi0Var.a) && this.b.equals(tfi0Var.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("EntranceClickEvent(name=", this.a, ", itemName=", this.b, vZBMKENANSz.XzmILFwEWoDTuxq);
    }
}
