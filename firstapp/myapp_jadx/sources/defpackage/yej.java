package defpackage;

import com.sportybet.android.instantwin.presentation.ticketdetail.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class yej implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yej(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                tgj tgjVar = (tgj) obj;
                tgjVar.p1 = 1;
                ul2 ul2VarR0 = tgjVar.R0();
                boolean zBooleanValue = ((Boolean) ((x5a0) tgjVar.y2).getValue()).booleanValue();
                Integer num = (Integer) ((x5a0) tgjVar.z2).getValue();
                tgjVar.Y2(ul2VarR0, zBooleanValue, num != null ? num.intValue() : 0);
                break;
            default:
                ((Function1) obj).invoke(b.e.a);
                break;
        }
        return Unit.a;
    }
}
