package defpackage;

import com.sporty.android.core.model.config.bo.enums.BOConfigParam;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.joker.data.repository.JokerRepositoryImpl", f = "JokerRepositoryImpl.kt", l = {87}, m = "shouldShowNewBadge", v = 2)
public final class pap extends x1b {
    public BOConfigParam a;
    public /* synthetic */ Object b;
    public final /* synthetic */ qap c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pap(qap qapVar, x1b x1bVar) {
        super(x1bVar);
        this.c = qapVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(this);
    }
}
