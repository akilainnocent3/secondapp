package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xe7 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ xe7(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((tcf) obj).getClass();
                return Unit.a;
            case 1:
                d08 d08Var = (d08) obj;
                d08Var.getClass();
                if (d08Var instanceof d08.b) {
                    return String.valueOf(((d08.b) d08Var).a);
                }
                if (d08Var instanceof d08.a) {
                    return "";
                }
                uhc.a();
                return null;
            default:
                sdu sduVar = (sdu) obj;
                sduVar.getClass();
                return sduVar.n;
        }
    }
}
