package defpackage;

import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.eventdetails.NewBadgeEventDetailsValue;
import com.sportybet.plugin.event.e;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.EventViewModel", f = "EventViewModel.kt", l = {925, 319}, m = "shouldShowRecommendTabNewBadge", v = 2)
public final class rsg extends x1b {
    public BOConfigParam a;
    public NewBadgeEventDetailsValue b;
    public /* synthetic */ Object c;
    public final /* synthetic */ e d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rsg(e eVar, x1b x1bVar) {
        super(x1bVar);
        this.d = eVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.Q1(this);
    }
}
