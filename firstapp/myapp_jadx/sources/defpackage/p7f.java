package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class p7f extends qlr implements Function1<q7f, gvg0> {
    public final /* synthetic */ yp40 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7f(m7f m7fVar, q7f q7fVar, yp40 yp40Var) {
        super(1);
        this.a = yp40Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final gvg0 invoke(q7f q7fVar) {
        q7f q7fVar2 = q7fVar;
        if (!q7fVar2.C) {
            return gvg0.b;
        }
        if (q7fVar2.F != null) {
            wkn.c("DragAndDropTarget self reference must be null at the start of a drag and drop session");
        }
        q7fVar2.F = null;
        yp40 yp40Var = this.a;
        yp40Var.a = yp40Var.a;
        return gvg0.a;
    }
}
