package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ok70 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                wk70 wk70Var = (wk70) obj;
                wk70Var.getClass();
                return wk70Var.c;
            default:
                ((Long) obj).getClass();
                op5.a.getClass();
                String str = op5.c;
                if (str == null) {
                    str = "";
                }
                wz.a("tournament_close_clicked", krh0.e(str), new String[0]);
                return Unit.a;
        }
    }
}
