package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class as8 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ as8(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                lb80.c(pb80Var, "bethistory_filter_bar_reset_text");
                break;
            default:
                f1e0 f1e0Var = (f1e0) obj;
                hic.a.b().onNext(Boolean.TRUE);
                ssw<String> sswVar = hic.l;
                String str = f1e0Var != null ? f1e0Var.c : null;
                if (str == null) {
                    str = "";
                }
                sswVar.j(str);
                break;
        }
        return Unit.a;
    }
}
