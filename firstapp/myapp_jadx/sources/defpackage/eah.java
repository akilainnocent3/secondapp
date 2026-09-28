package defpackage;

import com.sporty.android.common.network.model.FavoriteMarketRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class eah implements dah {
    public final bah a;

    public eah(bah bahVar) {
        this.a = bahVar;
    }

    @Override // defpackage.dah
    public final Object a(String str, int i, String str2, ezf0 ezf0Var) {
        return this.a.c(new FavoriteMarketRequest(str, i, str2), ezf0Var);
    }

    @Override // defpackage.dah
    public final Object b(String str, int i, String str2, fih fihVar) {
        return this.a.a(str, i, str2, fihVar);
    }

    @Override // defpackage.dah
    public final Object c(String str, int i, String str2, ezf0 ezf0Var) {
        return this.a.b(new FavoriteMarketRequest(str, i, str2), ezf0Var);
    }
}
