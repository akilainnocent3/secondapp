package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class vep extends p3 {
    public final ArrayList<scp> g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vep(wbp wbpVar, Function1<? super scp, Unit> function1) {
        super(wbpVar, function1);
        wbpVar.getClass();
        function1.getClass();
        this.g = new ArrayList<>();
    }

    @Override // defpackage.p3, defpackage.o
    public final String G(pd80 pd80Var, int i) {
        pd80Var.getClass();
        return String.valueOf(i);
    }

    @Override // defpackage.p3
    public final scp n0() {
        return new acp(this.g);
    }

    @Override // defpackage.p3
    public final void o0(scp scpVar, String str) {
        str.getClass();
        scpVar.getClass();
        this.g.add(Integer.parseInt(str), scpVar);
    }
}
