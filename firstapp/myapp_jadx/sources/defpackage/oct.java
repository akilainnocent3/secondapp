package defpackage;

import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.lobby.remote.models.UpdateFavouriteRequest;

/* JADX INFO: loaded from: classes7.dex */
public final class oct extends aqc.d<Integer, GameDetails> {
    public final /* synthetic */ jct a;
    public final /* synthetic */ UpdateFavouriteRequest b;

    public oct(jct jctVar, UpdateFavouriteRequest updateFavouriteRequest) {
        this.a = jctVar;
        this.b = updateFavouriteRequest;
    }

    @Override // aqc.d
    public final aqc<Integer, GameDetails> a() {
        jct jctVar = this.a;
        ibh ibhVar = new ibh(o8i0.d(jctVar), jctVar.a, this.b);
        jctVar.d = ibhVar.g;
        return ibhVar;
    }
}
