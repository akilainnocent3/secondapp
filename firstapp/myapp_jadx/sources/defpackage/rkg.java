package defpackage;

import com.sportybet.plugin.event.EventActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rkg extends saj implements Function1<Integer, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        EventActivity eventActivity = (EventActivity) this.receiver;
        int i = EventActivity.U0;
        agd0 agd0Var = eventActivity.R;
        if (agd0Var != null) {
            agd0Var.f.I.A.setProgressWithAnimate(iIntValue / 100.0f);
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
