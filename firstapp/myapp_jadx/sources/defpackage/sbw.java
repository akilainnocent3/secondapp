package defpackage;

import com.sportygames.commons.SportyGamesManager;

/* JADX INFO: loaded from: classes7.dex */
public final class sbw {
    public final k5b a;

    public sbw(k5b k5bVar) {
        k5bVar.getClass();
        this.a = k5bVar;
    }

    public static paw a() {
        mpe0 mpe0Var = on0.a;
        dpb dpbVarE = on0.e();
        if (dpbVarE instanceof paw) {
            return (paw) dpbVarE;
        }
        kb5.a(lx5.a("Expected MultiLevelApi for game ", SportyGamesManager.getGameName(), ", got ", dpbVarE.getClass().getSimpleName()));
        return null;
    }
}
