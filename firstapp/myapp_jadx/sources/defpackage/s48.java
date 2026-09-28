package defpackage;

import android.view.Window;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s48 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s48(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((Iterable) obj).iterator();
            case 1:
                bwb bwbVar = (bwb) obj;
                bwbVar.R0().T1(true);
                bwbVar.S0().T1(false);
                ((x5a0) bwbVar.j1).setValue(Boolean.FALSE);
                bwbVar.R0().R1(false);
                bwbVar.S0().R1(false);
                return Unit.a;
            case 2:
                ((Function1) obj).invoke(xgq.d.a);
                return Unit.a;
            default:
                Window window = (Window) obj;
                if (window != null) {
                    window.setGravity(17);
                }
                if (window != null) {
                    window.setWindowAnimations(R.style.AnimBottom);
                }
                return Unit.a;
        }
    }
}
