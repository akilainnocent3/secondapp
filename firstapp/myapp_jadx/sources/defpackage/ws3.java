package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ws3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ haj b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ws3(int i, haj hajVar, Object obj) {
        this.a = i;
        this.b = hajVar;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        haj hajVar = this.b;
        switch (i) {
            case 0:
                ((Function1) hajVar).invoke((kt3) obj);
                break;
            default:
                lgc0 lgc0Var = (lgc0) obj;
                ((Function2) hajVar).invoke(lgc0Var.a, lgc0Var.b);
                break;
        }
        return Unit.a;
    }
}
