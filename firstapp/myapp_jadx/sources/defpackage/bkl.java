package defpackage;

import com.sportybet.android.bookingcode.presentation.activity.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bkl implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bkl(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        w3c0 w3c0Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                a.InterfaceC0220a interfaceC0220a = ((a) obj).B;
                if (interfaceC0220a != null) {
                    interfaceC0220a.p0();
                }
                return Unit.a;
            case 1:
                ((Function1) obj).invoke(rn30.f.a);
                return Unit.a;
            default:
                q1c0 q1c0Var = (q1c0) obj;
                w3c0 w3c0Var2 = (w3c0) q1c0Var.b;
                boolean z = true;
                if ((w3c0Var2 == null || !w3c0Var2.d.getBetPlaced()) && ((w3c0Var = (w3c0) q1c0Var.b) == null || !w3c0Var.e.getBetPlaced())) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
