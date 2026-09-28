package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ej40 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                mb80.a(pb80Var);
                return Unit.a;
            default:
                hq60 hq60Var = (hq60) obj;
                hq60Var.getClass();
                return Boolean.valueOf(hq60Var.D1());
        }
    }
}
