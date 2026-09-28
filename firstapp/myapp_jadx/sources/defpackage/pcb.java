package defpackage;

import com.sportybet.android.instantwin.presentation.openbet.OpenBetsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pcb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pcb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                try {
                    ((fgb) obj).f1().x1();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 1:
                ((Function1) obj).invoke(wwf.d.a);
                break;
            default:
                int i2 = OpenBetsActivity.J;
                ((OpenBetsActivity) obj).G.d.h.a(Unit.a);
                break;
        }
        return Unit.a;
    }
}
