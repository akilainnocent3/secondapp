package defpackage;

import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.prematch.data.UpcomingEventTypes;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class bl20 implements Function0 {
    public final /* synthetic */ PreMatchSportActivity a;

    public /* synthetic */ bl20(PreMatchSportActivity preMatchSportActivity) {
        this.a = preMatchSportActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
        return Boolean.valueOf(!this.a.K1(UpcomingEventTypes.PRE_MATCH.getValue()));
    }
}
