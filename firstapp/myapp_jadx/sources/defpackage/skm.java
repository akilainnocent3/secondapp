package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class skm extends qlr implements Function1<tkm, Boolean> {
    public final /* synthetic */ dq40<tkm> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skm(dq40<tkm> dq40Var) {
        super(1);
        this.a = dq40Var;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object, tkm] */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(tkm tkmVar) {
        tkm tkmVar2 = tkmVar;
        dq40<tkm> dq40Var = this.a;
        tkm tkmVar3 = dq40Var.a;
        if (tkmVar3 == null && tkmVar2.F) {
            dq40Var.a = tkmVar2;
        } else if (tkmVar3 != null) {
            tkmVar2.getClass();
        }
        return Boolean.TRUE;
    }
}
