package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final class nqj implements ltm {
    public int a;
    public int b;
    public boolean c;

    @Override // defpackage.ltm
    public final List<lpj.b.g> a(pye pyeVar) {
        pyeVar.getClass();
        if (pyeVar instanceof pye.b) {
            ArrayList arrayList = new ArrayList();
            boolean z = this.c;
            int i = this.a;
            if (z) {
                arrayList.addAll(b.k(new lpj.b.g(false, this.a, String.format("Expression_%s with wings", Arrays.copyOf(new Object[]{String.valueOf(i)}, 1)), false), new lpj.b.g(true, 0, "idle with wings", false)));
            } else {
                arrayList.add(new lpj.b.g(false, this.a, String.format("Expression_%s", Arrays.copyOf(new Object[]{String.valueOf(i)}, 1)), false));
            }
            lx30.INSTANCE.getClass();
            if (lx30.b.i() && this.b < 8) {
                arrayList.add(new lpj.b.g(false, 0, "crack " + this.b, true));
                this.b = this.b + 1;
            }
            return arrayList;
        }
        if (pyeVar.equals(pye.c.a)) {
            this.c = true;
            return b.k(new lpj.b.g(false, 0, "wings grow", false), new lpj.b.g(true, 0, "idle with wings", false));
        }
        if (pyeVar instanceof pye.i) {
            int iOrdinal = ((pye.i) pyeVar).a.ordinal();
            if (iOrdinal == 0) {
                return a.c(new lpj.b.g(false, 0, "Fly away", false));
            }
            if (iOrdinal == 1) {
                return a.c(new lpj.b.g(false, 0, "Blast and loot", false));
            }
            if (iOrdinal == 2) {
                return m2g.a;
            }
            uhc.a();
            return null;
        }
        if (pyeVar instanceof pye.j) {
            return a.c(new lpj.b.g(true, 0, "idle", false));
        }
        if (!(pyeVar instanceof pye.k)) {
            return m2g.a;
        }
        ngs ngsVarB = a.b();
        ngsVarB.add(new lpj.b.g(true, 0, "idle", false));
        int i2 = ((pye.k) pyeVar).b;
        if (i2 != 0) {
            for (int i3 = 0; this.b < 8 && i2 > i3; i3++) {
                lx30.INSTANCE.getClass();
                if (lx30.b.i()) {
                    this.b++;
                }
            }
            ngsVarB.add(new lpj.b.g(false, 0, "crack " + this.b, true));
        }
        return a.a(ngsVarB);
    }

    @Override // defpackage.ltm
    public final Long b(String str) {
        str.getClass();
        return (c.u(str, "Expression", false) || c.u(str, "crack ", false)) ? 500L : null;
    }

    @Override // defpackage.ltm
    public final void reset() {
        this.a = f.k(new IntRange(1, 4, 1), lx30.INSTANCE);
        this.b = 1;
        this.c = false;
    }
}
