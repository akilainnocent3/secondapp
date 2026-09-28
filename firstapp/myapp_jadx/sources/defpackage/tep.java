package defpackage;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public class tep extends p3 {
    public final LinkedHashMap g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tep(wbp wbpVar, Function1<? super scp, Unit> function1) {
        super(wbpVar, function1);
        wbpVar.getClass();
        function1.getClass();
        this.g = new LinkedHashMap();
    }

    @Override // defpackage.o, defpackage.fma
    public final <T> void D(pd80 pd80Var, int i, he80<? super T> he80Var, T t) {
        pd80Var.getClass();
        he80Var.getClass();
        if (t != null || this.d.b) {
            super.D(pd80Var, i, he80Var, t);
        }
    }

    @Override // defpackage.p3
    public scp n0() {
        return new wdp(this.g);
    }

    @Override // defpackage.p3
    public void o0(scp scpVar, String str) {
        str.getClass();
        scpVar.getClass();
        this.g.put(str, scpVar);
    }
}
