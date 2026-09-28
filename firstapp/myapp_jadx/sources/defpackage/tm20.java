package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class tm20 extends qlr implements Function1<use, tse> {
    public final /* synthetic */ iny a;
    public final /* synthetic */ ibs b;
    public final /* synthetic */ qm20 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tm20(iny inyVar, ibs ibsVar, qm20 qm20Var) {
        super(1);
        this.a = inyVar;
        this.b = ibsVar;
        this.c = qm20Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final tse invoke(use useVar) {
        iny inyVar = this.a;
        ibs ibsVar = this.b;
        qm20 qm20Var = this.c;
        inyVar.a(ibsVar, qm20Var);
        return new sm20(qm20Var);
    }
}
