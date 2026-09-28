package defpackage;

import com.sporty.android.core.model.config.bo.enums.BOConfigParam;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.joker.data.repository.JokerRepositoryImpl", f = "JokerRepositoryImpl.kt", l = {87, 35}, m = "getJokerMarkets", v = 2)
public final class map extends x1b {
    public String a;
    public qap b;
    public qap c;
    public BOConfigParam d;
    public /* synthetic */ Object e;
    public final /* synthetic */ qap f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public map(qap qapVar, x1b x1bVar) {
        super(x1bVar);
        this.f = qapVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
