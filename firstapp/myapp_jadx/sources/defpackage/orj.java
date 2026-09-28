package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class orj implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        f1e0 f1e0Var = (f1e0) obj;
        msj.a.b().onNext(Boolean.TRUE);
        ssw<String> sswVar = msj.l;
        String str = f1e0Var != null ? f1e0Var.c : null;
        if (str == null) {
            str = "";
        }
        sswVar.j(str);
        return Unit.a;
    }
}
