package defpackage;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a08 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;

    public /* synthetic */ a08(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Serializable serializable = this.b;
        switch (i) {
            case 0:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                lb80.c(pb80Var, (String) serializable);
                lb80.h(pb80Var, 0);
                break;
            default:
                ((cq40) serializable).a = ((gly) obj).a;
                break;
        }
        return Unit.a;
    }
}
