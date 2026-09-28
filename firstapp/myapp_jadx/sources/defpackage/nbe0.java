package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class nbe0 implements Function1 {
    public final /* synthetic */ sbe0 a;
    public final /* synthetic */ sbe0.c b;

    public /* synthetic */ nbe0(sbe0 sbe0Var, sbe0.c cVar) {
        this.a = sbe0Var;
        this.b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        b390 b390Var = this.a.b;
        sbe0.c cVar = this.b;
        b390Var.a(new igg0(cVar.a, cVar.b, null, 4));
        return Unit.a;
    }
}
