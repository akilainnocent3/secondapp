package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wn4 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                yn4.b bVar = (yn4.b) obj;
                bVar.getClass();
                return Boolean.valueOf(bVar.e >= bVar.f);
            default:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                mb80.a(pb80Var);
                return Unit.a;
        }
    }
}
