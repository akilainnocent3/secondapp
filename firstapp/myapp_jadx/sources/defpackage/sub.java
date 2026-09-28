package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;
import com.sportybet.plugin.event.EventActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sub implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sub(Object obj, int i) {
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
                bwbVar.p1 = 1;
                ul2 ul2VarR0 = bwbVar.R0();
                boolean zBooleanValue = ((Boolean) ((x5a0) bwbVar.y2).getValue()).booleanValue();
                Integer num = (Integer) ((x5a0) bwbVar.z2).getValue();
                bwbVar.Y2(ul2VarR0, zBooleanValue, num != null ? num.intValue() : 0);
                return Unit.a;
            case 1:
                int i2 = EventActivity.U0;
                ((EventActivity) obj).C1();
                return Unit.a;
            case 2:
                int i3 = MatchEventActivity.a0;
                return new kxu((MatchEventActivity) obj);
            default:
                return Integer.valueOf(((mw70) obj).d.getResources().getDimensionPixelSize(R.dimen.spr_score_min_width));
        }
    }
}
