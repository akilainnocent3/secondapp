package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class gi90 implements pdd0 {
    public final String a = "sim__betslip_confirm_to_pay__click";
    public final boolean b;
    public final boolean c;

    public gi90(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        boolean z = this.b;
        Pair pair = new Pair("has_1up", Boolean.valueOf(z));
        boolean z2 = this.c;
        return kpu.d(pair, new Pair("has_2up", Boolean.valueOf(z2)), new Pair("no_up", Boolean.valueOf((z || z2) ? false : true)));
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }
}
