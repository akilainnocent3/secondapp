package androidx.compose.ui.draw;

import androidx.compose.ui.d;
import defpackage.j58;
import defpackage.p3w;
import defpackage.qf4;
import defpackage.qln;
import defpackage.rcf;
import defpackage.zk40;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/BlockInnerShadowElement;", "Lp3w;", "Lqf4;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BlockInnerShadowElement extends p3w<qf4> {
    public final zk40.a b = zk40.a;
    public final Function1<qln, Unit> c;

    public BlockInnerShadowElement(Function1 function1) {
        this.c = function1;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        qf4 qf4Var = new qf4();
        qf4Var.D = this.b;
        qf4Var.I = this.c;
        qf4Var.L = 0L;
        qf4Var.M = j58.b;
        qf4Var.N = 1.0f;
        qf4Var.O = 3;
        return qf4Var;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        qf4 qf4Var = (qf4) cVar;
        qf4Var.D = this.b;
        Function1<? super qln, Unit> function1 = qf4Var.I;
        Function1<qln, Unit> function2 = this.c;
        if (function1 != function2) {
            qf4Var.I = function2;
            qf4Var.H = false;
            rcf.a(qf4Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockInnerShadowElement)) {
            return false;
        }
        BlockInnerShadowElement blockInnerShadowElement = (BlockInnerShadowElement) obj;
        return Intrinsics.g(this.b, blockInnerShadowElement.b) && this.c == blockInnerShadowElement.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
