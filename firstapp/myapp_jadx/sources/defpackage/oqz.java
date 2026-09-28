package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class oqz extends qlr implements Function1<y78, Unit> {
    public final /* synthetic */ y340 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oqz(y340 y340Var) {
        super(1);
        this.a = y340Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(y78 y78Var) {
        y78 y78Var2 = y78Var;
        y78Var2.getClass();
        hxs hxsVar = y78Var2.c;
        hxsVar.getClass();
        y340 y340Var = this.a;
        if (!Intrinsics.g(y340Var.a, hxsVar)) {
            hxs hxsVar2 = y340Var.a;
            hxsVar2.getClass();
            boolean z = true;
            boolean z2 = (hxsVar2 instanceof hxs.b) || (hxsVar2 instanceof hxs.a);
            if (!(hxsVar instanceof hxs.b) && !(hxsVar instanceof hxs.a)) {
                z = false;
            }
            if (z2 && !z) {
                y340Var.notifyItemRemoved(0);
            } else if (z && !z2) {
                y340Var.notifyItemInserted(0);
            } else if (z2 && z) {
                y340Var.notifyItemChanged(0);
            }
            y340Var.a = hxsVar;
        }
        return Unit.a;
    }
}
