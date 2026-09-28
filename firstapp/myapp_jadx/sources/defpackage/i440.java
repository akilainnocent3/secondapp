package defpackage;

import androidx.fragment.app.Fragment;
import com.sportygames.crash.models.BetData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i440 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ i440(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                d740 d740VarQ0 = ((o540) fragment).q0();
                ej5.c(o8i0.d(d740VarQ0), null, null, new s740(d740VarQ0, str, null), 3);
                break;
            default:
                m9c0 m9c0Var = (m9c0) fragment;
                BetData betData = (BetData) obj;
                betData.getClass();
                m9c0Var.e3(m9c0Var.R0(), betData);
                break;
        }
        return Unit.a;
    }
}
