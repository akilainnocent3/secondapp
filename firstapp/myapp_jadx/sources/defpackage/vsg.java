package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vsg implements Function1 {
    public final /* synthetic */ jlv a;
    public final /* synthetic */ fsg b;

    public /* synthetic */ vsg(jlv jlvVar, fsg fsgVar) {
        this.a = jlvVar;
        this.b = fsgVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ba20 ba20Var = (ba20) obj;
        this.a.m(ba20Var);
        if (ba20Var instanceof ba20.b) {
            this.b.invoke();
        }
        return Unit.a;
    }
}
