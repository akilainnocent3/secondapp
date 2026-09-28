package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class aaf implements Function1 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ ytw b;
    public final /* synthetic */ v5b c;
    public final /* synthetic */ psw d;
    public final /* synthetic */ ytw e;

    public /* synthetic */ aaf(Function1 function1, ytw ytwVar, v5b v5bVar, psw pswVar, ytw ytwVar2) {
        this.a = function1;
        this.b = ytwVar;
        this.c = v5bVar;
        this.d = pswVar;
        this.e = ytwVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.b.setValue(Boolean.TRUE);
        i9f.b bVar = new i9f.b();
        ej5.c(this.c, null, null, new daf.a(this.d, bVar, null), 3);
        this.e.setValue(bVar);
        this.a.invoke((gly) obj);
        return Unit.a;
    }
}
