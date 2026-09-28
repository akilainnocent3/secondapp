package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class da5 extends qlr implements Function0<lk40> {
    public final /* synthetic */ Function0<lk40> a;
    public final /* synthetic */ ywx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da5(Function0 function0, ywx ywxVar) {
        super(0);
        this.a = function0;
        this.b = ywxVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final lk40 invoke() {
        lk40 lk40VarInvoke;
        Function0<lk40> function0 = this.a;
        if (function0 != null && (lk40VarInvoke = function0.invoke()) != null) {
            return lk40VarInvoke;
        }
        ywx ywxVar = this.b;
        if (!ywxVar.E1().C) {
            ywxVar = null;
        }
        if (ywxVar != null) {
            return pk40.b(0L, kc6.d(ywxVar.c));
        }
        return null;
    }
}
