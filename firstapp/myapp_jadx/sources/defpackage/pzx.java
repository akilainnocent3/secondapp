package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pzx extends saj implements Function1<Integer, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        uzx uzxVar = (uzx) this.receiver;
        uzxVar.getClass();
        if (iIntValue >= 50 && iIntValue % 10 == 0) {
            gym.a(uzxVar.d, new dzx(iIntValue));
            uzxVar.e.f(AnalyticsEvent.NOTE_CHARACTER_REACH, jpu.b(new Pair(AnalyticsParam.CONTENT_LENGTH, Integer.valueOf(iIntValue))));
        }
        return Unit.a;
    }
}
