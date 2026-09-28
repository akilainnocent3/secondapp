package defpackage;

import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fvb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fvb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                bwb bwbVar = (bwb) obj;
                bwbVar.p1 = 2;
                ul2 ul2VarS0 = bwbVar.S0();
                boolean zBooleanValue = ((Boolean) ((x5a0) bwbVar.y2).getValue()).booleanValue();
                Integer num = (Integer) ((x5a0) bwbVar.z2).getValue();
                bwbVar.Y2(ul2VarS0, zBooleanValue, num != null ? num.intValue() : 0);
                break;
            case 1:
                ((Function1) obj).invoke(xgq.i.a);
                break;
            default:
                MatchEventActivity matchEventActivity = (MatchEventActivity) obj;
                int i2 = MatchEventActivity.a0;
                matchEventActivity.U1(new a5o.r(((n4p) matchEventActivity.C1()).c()));
                break;
        }
        return Unit.a;
    }
}
