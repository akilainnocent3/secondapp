package defpackage;

import com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.c;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.WorldCupPassAnnouncementViewModel", f = "WorldCupPassAnnouncementViewModel.kt", l = {95}, m = "formatPrice", v = 2)
public final class u1k0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ c b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1k0(c cVar, x1b x1bVar) {
        super(x1bVar);
        this.b = cVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.y1(this);
    }
}
