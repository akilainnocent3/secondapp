package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class pic implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ pic(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                f1e0 f1e0Var = (f1e0) obj;
                pjc.a.b().onNext(Boolean.TRUE);
                ssw<String> sswVar = pjc.l;
                String str = f1e0Var != null ? f1e0Var.c : null;
                if (str == null) {
                    str = "";
                }
                sswVar.j(str);
                break;
            default:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                mb80.a(pb80Var);
                break;
        }
        return Unit.a;
    }
}
