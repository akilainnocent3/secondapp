package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u7r implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ haj b;

    public /* synthetic */ u7r(haj hajVar, int i) {
        this.a = i;
        this.b = hajVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        haj hajVar = this.b;
        switch (i) {
            case 0:
                a8r a8rVar = (a8r) obj;
                a8rVar.getClass();
                ((Function1) hajVar).invoke(new i7r.c(a8rVar));
                break;
            default:
                kl00 kl00Var = (kl00) obj;
                kl00Var.getClass();
                ((Function2) hajVar).invoke(kl00Var, Boolean.FALSE);
                break;
        }
        return Unit.a;
    }
}
