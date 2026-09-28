package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wr3 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ wr3(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iW;
        switch (this.a) {
            case 0:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                mb80.a(pb80Var);
                break;
            default:
                f1e0 f1e0Var = (f1e0) obj;
                f1e0Var.getClass();
                pjc.a.c().onNext(f1e0Var);
                String str = f1e0Var.c;
                if (f1e0Var.a.equals("ERROR")) {
                    str.getClass();
                    if (StringsKt.M(str, "message:", true) && (iW = StringsKt.W(str, '{', 0, 6)) != -1) {
                        pjc.l.j(str.substring(iW));
                    }
                }
                break;
        }
        return Unit.a;
    }
}
