package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.lobby.remote.models.BannerDetailResponse;
import com.sportygames.lobby.views.fragment.GamesLobbyMainFragment;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xuj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xuj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cn80 cn80Var;
        ViewPager2 viewPager2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                GamesLobbyMainFragment gamesLobbyMainFragment = (GamesLobbyMainFragment) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = GamesLobbyMainFragment.a.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    List<BannerDetailResponse> list = gamesLobbyMainFragment.I;
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    List list2 = hTTPResponse != null ? (List) hTTPResponse.getData() : null;
                    if ((list == null || list2 == null) ? false : Arrays.equals(list.toArray(new BannerDetailResponse[0]), list2.toArray(new BannerDetailResponse[0]))) {
                        return Unit.a;
                    }
                    HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                    List<BannerDetailResponse> list3 = hTTPResponse2 != null ? (List) hTTPResponse2.getData() : null;
                    gamesLobbyMainFragment.I = list3;
                    if (list3 != null) {
                        boolean zIsEmpty = list3.isEmpty();
                        B b = gamesLobbyMainFragment.b;
                        if (zIsEmpty) {
                            cn80 cn80Var2 = (cn80) b;
                            if (cn80Var2 != null) {
                                cn80Var2.z.setVisibility(8);
                            }
                        } else {
                            cn80 cn80Var3 = (cn80) b;
                            if (cn80Var3 != null) {
                                cn80Var3.z.setVisibility(0);
                            }
                            try {
                                if (gamesLobbyMainFragment.isAdded() && gamesLobbyMainFragment.getContext() != null) {
                                    gamesLobbyMainFragment.A = new hx1(list3, gamesLobbyMainFragment, new cvj(gamesLobbyMainFragment));
                                    cn80 cn80Var4 = (cn80) gamesLobbyMainFragment.b;
                                    if (cn80Var4 != null) {
                                        cn80Var4.z.setSaveEnabled(false);
                                    }
                                    try {
                                        if (gamesLobbyMainFragment.isAdded() && gamesLobbyMainFragment.getView() != null) {
                                            if ((gamesLobbyMainFragment.getLifecycle().b().compareTo(s9s.b.d) >= 0) && (viewPager2 = gamesLobbyMainFragment.w) != null) {
                                                viewPager2.setAdapter(gamesLobbyMainFragment.A);
                                            }
                                        }
                                        break;
                                    } catch (Exception unused) {
                                    }
                                    cn80 cn80Var5 = (cn80) gamesLobbyMainFragment.b;
                                    if (cn80Var5 != null) {
                                        cn80Var5.z.setOffscreenPageLimit(1);
                                    }
                                    nvj nvjVar = gamesLobbyMainFragment.S;
                                    if (nvjVar != null && (cn80Var = (cn80) gamesLobbyMainFragment.b) != null) {
                                        cn80Var.z.f(nvjVar);
                                    }
                                    nvj nvjVar2 = new nvj(gamesLobbyMainFragment, list3.size());
                                    gamesLobbyMainFragment.S = nvjVar2;
                                    cn80 cn80Var6 = (cn80) gamesLobbyMainFragment.b;
                                    if (cn80Var6 != null) {
                                        cn80Var6.z.c(nvjVar2);
                                    }
                                    Timer timer = gamesLobbyMainFragment.G;
                                    if (timer != null) {
                                        timer.cancel();
                                    }
                                    if (gamesLobbyMainFragment.requireActivity().hasWindowFocus()) {
                                        gamesLobbyMainFragment.G = new Timer();
                                        ovj ovjVar = new ovj(gamesLobbyMainFragment);
                                        Timer timer2 = gamesLobbyMainFragment.G;
                                        if (timer2 == null) {
                                            Intrinsics.n("timer");
                                            throw null;
                                        }
                                        timer2.schedule(ovjVar, 2500L, 2500L);
                                    }
                                }
                            } catch (Exception unused2) {
                            }
                        }
                        cn80 cn80Var7 = (cn80) gamesLobbyMainFragment.b;
                        if (cn80Var7 != null) {
                            cn80Var7.b.setVisibility(8);
                        }
                    }
                } else if (i2 == 2) {
                    cn80 cn80Var8 = (cn80) gamesLobbyMainFragment.b;
                    if (cn80Var8 != null) {
                        cn80Var8.z.setVisibility(8);
                    }
                    cn80 cn80Var9 = (cn80) gamesLobbyMainFragment.b;
                    if (cn80Var9 != null) {
                        cn80Var9.b.setVisibility(8);
                    }
                } else if (i2 != 3) {
                    uhc.a();
                    return null;
                }
                return Unit.a;
            default:
                int i3 = (int) (((jxo) obj).a & 4294967295L);
                u5a0 u5a0Var = (u5a0) ((n27) obj2).j;
                if (u5a0Var.D() != i3) {
                    u5a0Var.k(i3);
                }
                return Unit.a;
        }
    }
}
