package defpackage;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lihb0;", "Lj8i0;", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
@fae
public abstract class ihb0 extends j8i0 {
    public final qm70 a;
    public final CoroutineContext b;
    public final mpe0 c;

    public ihb0(int i) {
        qm70 qm70Var = wm70.c;
        qm70Var.getClass();
        pfd pfdVar = fse.a;
        odd oddVar = odd.b;
        oddVar.getClass();
        this.a = qm70Var;
        this.b = oddVar;
        this.c = hwr.b(new ebb(1));
    }

    @Override // defpackage.j8i0
    public void onCleared() {
        super.onCleared();
        if (y1().b) {
            return;
        }
        y1().dispose();
    }

    public final void x1(pse pseVar) {
        ema emaVarY1 = y1();
        emaVarY1.getClass();
        emaVarY1.b(pseVar);
    }

    public final ema y1() {
        return (ema) this.c.getValue();
    }

    public ihb0() {
        this(0);
    }
}
