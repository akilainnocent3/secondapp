package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.account.MyFavoriteStake;
import com.sporty.android.core.model.patron.FavoriteMarket;
import com.sporty.android.core.model.patron.FavoriteMarketItem;
import com.sporty.android.core.model.patron.FavoriteOddsRange;
import com.sporty.android.core.model.patron.FavoriteSport;
import com.sporty.android.core.model.patron.FavoriteSummary;
import com.sporty.android.core.model.patron.FavoriteTournament;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;

/* JADX INFO: loaded from: classes6.dex */
public final class yxw implements vxw {
    public final xxz a;
    public final wwd0 b;
    public final wwd0 c;
    public FavoriteSummary d;
    public su5<BaseResponse<FavoriteSummary>> e;
    public final CopyOnWriteArraySet<Function0<Unit>> f;
    public boolean g;
    public boolean h;

    public static final class a implements gv5<BaseResponse<FavoriteSummary>> {
        public a() {
        }

        @Override // defpackage.gv5
        public final void onFailure(su5<BaseResponse<FavoriteSummary>> su5Var, Throwable th) {
            th.getClass();
            yxw.this.b.k(null, new kqc());
        }

        @Override // defpackage.gv5
        public final void onResponse(su5<BaseResponse<FavoriteSummary>> su5Var, bi50<BaseResponse<FavoriteSummary>> bi50Var) {
            yxw yxwVar = yxw.this;
            wwd0 wwd0Var = yxwVar.b;
            Response response = bi50Var.a;
            if (!response.getIsSuccessful()) {
                onFailure(su5Var, new Exception(hce0.a(response.code(), "Error fetching summary: ")));
                return;
            }
            BaseResponse<FavoriteSummary> baseResponse = bi50Var.b;
            if ((baseResponse != null ? baseResponse.data : null) == null) {
                onFailure(su5Var, new Exception("No summary data available"));
                return;
            }
            FavoriteSummary favoriteSummary = baseResponse.data;
            if (Intrinsics.g(yxwVar.d, favoriteSummary)) {
                wwd0Var.k(null, new nqc(yxwVar.d));
            } else {
                yxwVar.d = favoriteSummary;
                wwd0Var.k(null, new nqc(favoriteSummary));
                yxwVar.g = true;
            }
            Iterator<Function0<Unit>> it = yxwVar.f.iterator();
            while (it.hasNext()) {
                it.next().invoke();
            }
        }
    }

    public static final class b implements gv5<BaseResponse<List<? extends String>>> {
        public b() {
        }

        @Override // defpackage.gv5
        public final void onFailure(su5<BaseResponse<List<? extends String>>> su5Var, Throwable th) {
            th.getClass();
        }

        @Override // defpackage.gv5
        public final void onResponse(su5<BaseResponse<List<? extends String>>> su5Var, bi50<BaseResponse<List<? extends String>>> bi50Var) {
            BaseResponse<List<? extends String>> baseResponse;
            List<? extends String> list;
            if (!bi50Var.a.getIsSuccessful() || (baseResponse = bi50Var.b) == null || (list = baseResponse.data) == null) {
                return;
            }
            yxw yxwVar = yxw.this;
            yxwVar.c.k(null, list);
            Iterator<Function0<Unit>> it = yxwVar.f.iterator();
            while (it.hasNext()) {
                it.next().invoke();
            }
        }
    }

    public yxw(xxz xxzVar) {
        xxzVar.getClass();
        this.a = xxzVar;
        this.b = xwd0.a(new jqc());
        this.c = xwd0.a(m2g.a);
        this.f = new CopyOnWriteArraySet<>();
    }

    @Override // defpackage.vxw
    public final void a() {
        this.b.k(null, new lqc());
        su5<BaseResponse<FavoriteSummary>> su5Var = this.e;
        if (su5Var != null) {
            su5Var.cancel();
        }
        su5<BaseResponse<FavoriteSummary>> su5VarJ0 = this.a.j0();
        this.e = su5VarJ0;
        if (su5VarJ0 != null) {
            su5VarJ0.G(new a());
        }
    }

    @Override // defpackage.vxw
    public final r5b b() {
        return i2i.c(this.b, null, 3);
    }

    @Override // defpackage.vxw
    public final void c(l9k.a aVar) {
        this.f.remove(aVar);
    }

    @Override // defpackage.vxw
    public final void clear() {
        su5<BaseResponse<FavoriteSummary>> su5Var = this.e;
        if (su5Var != null) {
            su5Var.cancel();
        }
        this.e = null;
        this.d = null;
        this.b.k(null, new jqc());
    }

    @Override // defpackage.vxw
    public final void d(boolean z) {
        this.h = z;
    }

    @Override // defpackage.vxw
    public final void e(CoroutineContext coroutineContext, rop ropVar) {
        coroutineContext.getClass();
        pfd pfdVar = fse.a;
        ej5.c(w5b.a(odd.b), null, null, new zxw(this, coroutineContext, ropVar, null), 3);
    }

    @Override // defpackage.vxw
    public final boolean f() {
        return !k().isEmpty();
    }

    @Override // defpackage.vxw
    public final boolean g(String str, List list) {
        str.getClass();
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Intrinsics.g(((FavoriteTournament) it.next()).id, str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vxw
    public final void get() {
        FavoriteSummary favoriteSummary = this.d;
        if (favoriteSummary == null) {
            a();
        } else {
            this.b.k(null, new nqc(favoriteSummary));
        }
    }

    @Override // defpackage.vxw
    public final MyFavoriteStake getStake() {
        FavoriteSummary favoriteSummary = this.d;
        if (favoriteSummary != null) {
            return favoriteSummary.stake;
        }
        return null;
    }

    @Override // defpackage.vxw
    public final FavoriteOddsRange h() {
        FavoriteSummary favoriteSummary = this.d;
        if (favoriteSummary != null) {
            return favoriteSummary.oddsRange;
        }
        return null;
    }

    @Override // defpackage.vxw
    public final boolean i(String str) {
        HashMap<String, FavoriteSport> sportRefMapping;
        str.getClass();
        FavoriteSummary favoriteSummary = this.d;
        return ((favoriteSummary == null || (sportRefMapping = favoriteSummary.getSportRefMapping()) == null) ? null : sportRefMapping.get(str)) != null;
    }

    @Override // defpackage.vxw
    public final void j() {
        this.a.t1().G(new b());
    }

    @Override // defpackage.vxw
    public final List<String> k() {
        HashMap<String, FavoriteSport> sportRefMapping;
        Set<String> setKeySet;
        List<String> listA0;
        FavoriteSummary favoriteSummary = this.d;
        return (favoriteSummary == null || (sportRefMapping = favoriteSummary.getSportRefMapping()) == null || (setKeySet = sportRefMapping.keySet()) == null || (listA0 = CollectionsKt.A0(setKeySet)) == null) ? m2g.a : listA0;
    }

    @Override // defpackage.vxw
    public final int l(String str) {
        HashMap<String, FavoriteSport> sportRefMapping;
        FavoriteSport favoriteSport;
        List<FavoriteTournament> list;
        str.getClass();
        FavoriteSummary favoriteSummary = this.d;
        if (favoriteSummary == null || (sportRefMapping = favoriteSummary.getSportRefMapping()) == null || (favoriteSport = sportRefMapping.get(str)) == null || (list = favoriteSport.tournaments) == null) {
            return 0;
        }
        return list.size();
    }

    @Override // defpackage.vxw
    public final List<FavoriteTournament> m(String str) {
        HashMap<String, FavoriteSport> sportRefMapping;
        FavoriteSport favoriteSport;
        str.getClass();
        FavoriteSummary favoriteSummary = this.d;
        if (favoriteSummary == null || (sportRefMapping = favoriteSummary.getSportRefMapping()) == null || (favoriteSport = sportRefMapping.get(str)) == null) {
            return null;
        }
        return favoriteSport.tournaments;
    }

    @Override // defpackage.vxw
    public final boolean n(String str) {
        HashMap<String, FavoriteTournament> tournamentRefMapping;
        Collection<FavoriteTournament> collectionValues;
        str.getClass();
        FavoriteSummary favoriteSummary = this.d;
        return g(str, (favoriteSummary == null || (tournamentRefMapping = favoriteSummary.getTournamentRefMapping()) == null || (collectionValues = tournamentRefMapping.values()) == null) ? null : CollectionsKt.A0(collectionValues));
    }

    @Override // defpackage.vxw
    public final void o(gv5<BaseResponse<List<String>>> gv5Var) {
        gv5Var.getClass();
        this.a.t1().G(gv5Var);
    }

    @Override // defpackage.vxw
    public final void p(Function0<Unit> function0) {
        this.f.add(function0);
    }

    @Override // defpackage.vxw
    public final boolean q(String str) {
        str.getClass();
        List<String> listK = k();
        if (listK != null && listK.isEmpty()) {
            return false;
        }
        Iterator<T> it = listK.iterator();
        while (it.hasNext()) {
            if (Intrinsics.g((String) it.next(), str)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.vxw
    public final boolean r() {
        return this.h;
    }

    @Override // defpackage.vxw
    public final boolean s() {
        boolean z = this.g;
        this.g = false;
        return z;
    }

    @Override // defpackage.vxw
    public final int t(String str) {
        List<FavoriteMarket> list;
        Object next;
        List<FavoriteMarketItem> list2;
        str.getClass();
        FavoriteSummary favoriteSummary = this.d;
        if (favoriteSummary == null || (list = favoriteSummary.markets) == null) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.g(((FavoriteMarket) next).sportId, str));
        FavoriteMarket favoriteMarket = (FavoriteMarket) next;
        if (favoriteMarket == null || (list2 = favoriteMarket.markets) == null) {
            return 0;
        }
        return list2.size();
    }

    @Override // defpackage.vxw
    public final boolean u() {
        HashMap<String, FavoriteTournament> tournamentRefMapping;
        Collection<FavoriteTournament> collectionValues;
        FavoriteSummary favoriteSummary = this.d;
        List listA0 = (favoriteSummary == null || (tournamentRefMapping = favoriteSummary.getTournamentRefMapping()) == null || (collectionValues = tournamentRefMapping.values()) == null) ? null : CollectionsKt.A0(collectionValues);
        if (listA0 != null) {
            return !listA0.isEmpty();
        }
        return false;
    }
}
