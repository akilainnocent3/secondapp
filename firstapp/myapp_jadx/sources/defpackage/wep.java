package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes8.dex */
public final class wep extends sep {
    public final int A;
    public int B;
    public final wdp y;
    public final List<String> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wep(wbp wbpVar, wdp wdpVar) {
        super(wbpVar, wdpVar, (String) null, 12);
        wbpVar.getClass();
        this.y = wdpVar;
        List<String> listA0 = CollectionsKt.A0(wdpVar.a.keySet());
        this.z = listA0;
        this.A = listA0.size() * 2;
        this.B = -1;
    }

    @Override // defpackage.sep, defpackage.uex
    public final String P(pd80 pd80Var, int i) {
        pd80Var.getClass();
        return this.z.get(i / 2);
    }

    @Override // defpackage.sep, defpackage.l3
    public final scp T(String str) {
        str.getClass();
        return this.B % 2 == 0 ? ucp.b(str) : (scp) kpu.c(str, this.y);
    }

    @Override // defpackage.sep, defpackage.l3
    public final scp V() {
        return this.y;
    }

    @Override // defpackage.sep
    /* JADX INFO: renamed from: Y */
    public final wdp V() {
        return this.y;
    }

    @Override // defpackage.sep, defpackage.l3, defpackage.dma
    public final void b(pd80 pd80Var) {
        pd80Var.getClass();
    }

    @Override // defpackage.sep, defpackage.dma
    public final int v(pd80 pd80Var) {
        pd80Var.getClass();
        int i = this.B;
        if (i >= this.A - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.B = i2;
        return i2;
    }
}
