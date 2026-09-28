package defpackage;

import com.sportygames.lobby.remote.models.GameDetails;

/* JADX INFO: loaded from: classes7.dex */
public final class nct extends aqc.d<Integer, GameDetails> {
    public final /* synthetic */ jct a;
    public final /* synthetic */ uxi0 b;

    public nct(jct jctVar, uxi0 uxi0Var) {
        this.a = jctVar;
        this.b = uxi0Var;
    }

    @Override // aqc.d
    public final aqc<Integer, GameDetails> a() {
        jct jctVar = this.a;
        iuj iujVar = new iuj(o8i0.d(jctVar), this.b, jctVar.B, jctVar.C);
        jctVar.E.j(iujVar);
        jctVar.f = iujVar.h;
        return iujVar;
    }
}
