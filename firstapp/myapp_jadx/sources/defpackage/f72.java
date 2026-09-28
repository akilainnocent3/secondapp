package defpackage;

import com.sportybet.plugin.realsports.sportsmenu.SportsMenuActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f72 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f72(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                s62 s62Var = (s62) obj;
                ee eeVar = s62Var.L;
                if (eeVar == null) {
                    Intrinsics.n("setSportyPinLauncher");
                    throw null;
                }
                eeVar.b(null);
                iym iymVar = s62Var.w;
                if (iymVar != null) {
                    gym.a(iymVar, new wm80(0));
                    return Unit.a;
                }
                Intrinsics.n("openTelemetryLogger");
                throw null;
            case 1:
                return i2i.c((lyh) ((ruy) obj).c.getValue(), null, 3);
            default:
                int i2 = SportsMenuActivity.i;
                dgb0 dgb0VarB1 = ((SportsMenuActivity) obj).B1();
                dgb0VarB1.F.setValue(t3g.a);
                dgb0VarB1.C1(null, true);
                return Unit.a;
        }
    }
}
