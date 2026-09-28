package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class u71 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iW;
        switch (this.a) {
            case 0:
                Double d = (Double) obj;
                d.doubleValue();
                return d;
            default:
                f1e0 f1e0Var = (f1e0) obj;
                f1e0Var.getClass();
                msj.a.c().onNext(f1e0Var);
                String str = f1e0Var.c;
                if (f1e0Var.a.equals("ERROR")) {
                    str.getClass();
                    if (StringsKt.M(str, "message:", true) && (iW = StringsKt.W(str, '{', 0, 6)) != -1) {
                        msj.l.j(str.substring(iW));
                    }
                }
                return Unit.a;
        }
    }
}
