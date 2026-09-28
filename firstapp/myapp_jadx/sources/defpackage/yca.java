package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class yca implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yca(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ytw) obj).setValue(Boolean.TRUE);
                break;
            case 1:
                ((tgj) obj).e2();
                break;
            default:
                db6 db6Var = (db6) obj;
                db6Var.B1("Lobby", new fgj(db6Var, 1));
                break;
        }
        return Unit.a;
    }
}
