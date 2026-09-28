package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.account.MyFavoriteStake;
import com.sporty.android.core.model.patron.FavoriteOddsRange;
import com.sporty.android.core.model.patron.FavoriteTournament;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public interface vxw {
    void a();

    r5b b();

    void c(l9k.a aVar);

    void clear();

    void d(boolean z);

    void e(CoroutineContext coroutineContext, rop ropVar);

    boolean f();

    boolean g(String str, List list);

    void get();

    MyFavoriteStake getStake();

    FavoriteOddsRange h();

    boolean i(String str);

    void j();

    List<String> k();

    int l(String str);

    List<FavoriteTournament> m(String str);

    boolean n(String str);

    void o(gv5<BaseResponse<List<String>>> gv5Var);

    void p(Function0<Unit> function0);

    boolean q(String str);

    boolean r();

    boolean s();

    int t(String str);

    boolean u();
}
