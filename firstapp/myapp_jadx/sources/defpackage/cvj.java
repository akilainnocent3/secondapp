package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.widget.Toast;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.gp.tz.R;
import com.sportygames.lobby.remote.models.BannerDetailResponse;
import com.sportygames.lobby.remote.models.CategoriesResponse;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.lobby.views.fragment.GamesLobbyMainFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cvj implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public /* synthetic */ cvj(d dVar, int i) {
        this.b = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Context context;
        NetworkCapabilities networkCapabilities;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                GamesLobbyMainFragment gamesLobbyMainFragment = (GamesLobbyMainFragment) obj3;
                BannerDetailResponse bannerDetailResponse = (BannerDetailResponse) obj;
                int iIntValue = ((Integer) obj2).intValue();
                bannerDetailResponse.getClass();
                String linkType = bannerDetailResponse.getLinkType();
                if (linkType != null) {
                    int iHashCode = linkType.hashCode();
                    if (iHashCode != 2180082) {
                        if (iHashCode != 833137918) {
                            if (iHashCode == 1637063037 && linkType.equals("DEEP_LINK_URL")) {
                                String linkValue = bannerDetailResponse.getLinkValue();
                                if (linkValue != null) {
                                    if (StringsKt.M(linkValue, "game", false)) {
                                        jct jctVar = (jct) gamesLobbyMainFragment.a;
                                        if (jctVar != null) {
                                            jctVar.B1(c.p((String) StringsKt__StringsKt.split$default(linkValue, new String[]{"="}, false, 0, 6, null).get(1), "%20", " ", false));
                                        }
                                        GamesLobbyMainFragment.y0(String.valueOf(iIntValue), (String) StringsKt__StringsKt.split$default(linkValue, new String[]{"="}, false, 0, 6, null).get(1));
                                    }
                                }
                                return null;
                            }
                        } else if (linkType.equals("CATEGORY")) {
                            CategoriesResponse category = bannerDetailResponse.getCategory();
                            if (category != null) {
                                int iIndexOf = gamesLobbyMainFragment.R.indexOf(bannerDetailResponse.getCategory());
                                cn80 cn80Var = (cn80) gamesLobbyMainFragment.b;
                                if (cn80Var != null) {
                                    TabLayout tabLayout = cn80Var.C;
                                    tabLayout.s(tabLayout.k(iIndexOf), true);
                                }
                                String strValueOf = String.valueOf(iIntValue);
                                String name = category.getName();
                                GamesLobbyMainFragment.y0(strValueOf, name != null ? name : "");
                                return Unit.a;
                            }
                            return null;
                        }
                    } else if (linkType.equals("GAME")) {
                        GameDetails game = bannerDetailResponse.getGame();
                        if (game != null && (context = gamesLobbyMainFragment.getContext()) != null) {
                            Object systemService = context.getSystemService("connectivity");
                            systemService.getClass();
                            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                            Network activeNetwork = connectivityManager.getActiveNetwork();
                            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                                op5 op5Var = op5.a;
                                String string = gamesLobbyMainFragment.getString(R.string.no_internet_cms);
                                string.getClass();
                                String string2 = gamesLobbyMainFragment.getString(R.string.no_internet);
                                string2.getClass();
                                Toast.makeText(context, op5.c(op5Var, string, string2), 0).show();
                            } else {
                                if (!networkCapabilities.hasTransport(0) && !networkCapabilities.hasTransport(3) && !networkCapabilities.hasTransport(1)) {
                                    if (connectivityManager.getActiveNetworkInfo() != null) {
                                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                        activeNetworkInfo.getClass();
                                        if (activeNetworkInfo.isConnectedOrConnecting()) {
                                        }
                                    }
                                    op5 op5Var2 = op5.a;
                                    String string3 = gamesLobbyMainFragment.getString(R.string.no_internet_cms);
                                    string3.getClass();
                                    String string4 = gamesLobbyMainFragment.getString(R.string.no_internet);
                                    string4.getClass();
                                    Toast.makeText(context, op5.c(op5Var2, string3, string4), 0).show();
                                }
                                yjj.c(gamesLobbyMainFragment.e, game, context, null, iIntValue, "", null, 96);
                                String strValueOf2 = String.valueOf(iIntValue);
                                String name2 = game.getName();
                                GamesLobbyMainFragment.y0(strValueOf2, name2 != null ? name2 : "");
                            }
                            return Unit.a;
                        }
                        return null;
                    }
                }
                return Unit.a;
            default:
                ((Integer) obj2).getClass();
                uap.c((d) obj3, (a) obj, qj40.a(1));
                return Unit.a;
        }
    }
}
