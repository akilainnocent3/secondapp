package defpackage;

import com.sportygames.lobby.remote.models.GameDetails;

/* JADX INFO: loaded from: classes7.dex */
public final class mct extends aqc.d<Integer, GameDetails> {
    public final /* synthetic */ jct a;
    public final /* synthetic */ uxi0 b;

    public mct(jct jctVar, uxi0 uxi0Var) {
        this.a = jctVar;
        this.b = uxi0Var;
    }

    @Override // aqc.d
    public final aqc<Integer, GameDetails> a() {
        jct jctVar = this.a;
        nah nahVar = new nah(o8i0.d(jctVar), this.b, jctVar.D);
        jctVar.F.j(nahVar);
        jctVar.v = nahVar.g;
        return nahVar;
    }
}
