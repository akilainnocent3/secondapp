package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wdg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wdg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Double dY1;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                fgg fggVar = (fgg) obj2;
                Double d = (Double) obj;
                bo1 bo1Var = (bo1) fggVar.a;
                if (bo1Var == null || (dY1 = bo1Var.y1()) == null || !dY1.equals(d)) {
                    bo1 bo1Var2 = (bo1) fggVar.a;
                    if (!Intrinsics.d(bo1Var2 != null ? bo1Var2.y1() : null, d)) {
                        ypa0 ypa0VarD0 = fggVar.D0();
                        String string = fggVar.getString(R.string.slider);
                        string.getClass();
                        ypa0VarD0.A1(0L, string);
                    }
                    bo1 bo1Var3 = (bo1) fggVar.a;
                    if (bo1Var3 != null) {
                        bo1Var3.z1(d);
                    }
                }
                break;
            default:
                mjj0 mjj0Var = (mjj0) obj2;
                obj.getClass();
                tmu.e eVar = new tmu.e(obj);
                mjj0Var.getClass();
                mjj0Var.A0.a(eVar);
                break;
        }
        return Unit.a;
    }
}
