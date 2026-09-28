package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class lbe0 implements Function1 {
    public final /* synthetic */ sbe0 a;
    public final /* synthetic */ sbe0.c b;

    public /* synthetic */ lbe0(sbe0 sbe0Var, sbe0.c cVar) {
        this.a = sbe0Var;
        this.b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        b390 b390Var = this.a.b;
        sbe0.c cVar = this.b;
        jgg0 jgg0Var = cVar.a;
        String str = cVar.b;
        String str2 = ((f1e0) obj).c;
        str2.getClass();
        b390Var.a(new igg0(jgg0Var, str, str2, 8));
        return Unit.a;
    }
}
