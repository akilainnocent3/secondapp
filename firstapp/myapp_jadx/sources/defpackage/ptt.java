package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ptt implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ptt(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                krf0 krf0Var = (krf0) obj;
                krf0Var.getClass();
                ((Function1) obj2).invoke(new igm.t(krf0Var));
                break;
            case 1:
                ((Function1) obj2).invoke(new bri0.a0(((Float) obj).floatValue()));
                break;
            default:
                b8b0 b8b0Var = (b8b0) obj2;
                ((View) obj).getClass();
                b8b0Var.C0();
                fm1 fm1Var = (fm1) b8b0Var.a;
                if (fm1Var != null) {
                    ej5.c(o8i0.d(fm1Var), null, null, new km1(fm1Var, b8b0Var.f, null), 3);
                }
                break;
        }
        return Unit.a;
    }
}
