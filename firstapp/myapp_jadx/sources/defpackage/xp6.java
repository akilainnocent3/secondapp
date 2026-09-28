package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.lobby.remote.models.CategoriesResponse;
import com.sportygames.lobby.remote.models.WalletInfo;
import com.sportygames.lobby.views.fragment.GamesLobbyMainFragment;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xp6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xp6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0275  */
    /* JADX WARN: Code duplicated, block: B:147:0x0279  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CategoriesResponse categoriesResponse;
        hv70 hv70Var;
        cn80 cn80Var;
        jct jctVar;
        cn80 cn80Var2;
        hv70 hv70Var2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                CashoutMetricsPayload.Metric metric = (CashoutMetricsPayload.Metric) obj;
                metric.getClass();
                return Boolean.valueOf(Intrinsics.g(metric.getKeyValueMap().getBetId(), (String) obj2));
            case 1:
                GamesLobbyMainFragment gamesLobbyMainFragment = (GamesLobbyMainFragment) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = GamesLobbyMainFragment.a.a[loadingState.getStatus().ordinal()];
                boolean z = false;
                if (i2 == 1) {
                    Map<String, String> additionalInfo = loadingState.getAdditionalInfo();
                    B b = gamesLobbyMainFragment.b;
                    ArrayList<CategoriesResponse> arrayList = gamesLobbyMainFragment.B;
                    cn80 cn80Var3 = (cn80) b;
                    if (cn80Var3 != null) {
                        cn80Var3.H.f.setVisibility(8);
                    }
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    WalletInfo walletInfo = hTTPResponse != null ? (WalletInfo) hTTPResponse.getData() : null;
                    if (walletInfo == null || walletInfo.walletString().length() <= 0) {
                        cn80 cn80Var4 = (cn80) gamesLobbyMainFragment.b;
                        if (cn80Var4 != null) {
                            cn80Var4.H.v.setVisibility(0);
                        }
                        cn80 cn80Var5 = (cn80) gamesLobbyMainFragment.b;
                        if (cn80Var5 != null) {
                            cn80Var5.H.A.setVisibility(8);
                        }
                        gamesLobbyMainFragment.y = "";
                    } else {
                        cn80 cn80Var6 = (cn80) gamesLobbyMainFragment.b;
                        if (cn80Var6 != null) {
                            cn80Var6.H.A.setVisibility(0);
                        }
                        cn80 cn80Var7 = (cn80) gamesLobbyMainFragment.b;
                        if (cn80Var7 != null) {
                            cn80Var7.H.v.setVisibility(8);
                        }
                        cn80 cn80Var8 = (cn80) gamesLobbyMainFragment.b;
                        if (cn80Var8 != null) {
                            cn80Var8.H.z.setText(walletInfo.walletString());
                        }
                        gamesLobbyMainFragment.y = walletInfo.walletString();
                        String avatarUrl = walletInfo.getAvatarUrl();
                        Context context = gamesLobbyMainFragment.getContext();
                        if (context != null && (cn80Var2 = (cn80) gamesLobbyMainFragment.b) != null) {
                            ImageView imageView = cn80Var2.H.e;
                            xa50 xa50VarA = np5.a(context, context);
                            po80 po80Var = new po80(xa50VarA, avatarUrl, na7.a(xa50VarA, Drawable.class, avatarUrl), lo80.a);
                            po80Var.a(hb50.E());
                            po80Var.e(imageView);
                        }
                    }
                    jct jctVar2 = gamesLobbyMainFragment.f;
                    if (jctVar2 == null) {
                        Intrinsics.n("viewModelLobby");
                        throw null;
                    }
                    jctVar2.C1();
                    if (gamesLobbyMainFragment.c) {
                        gamesLobbyMainFragment.c = false;
                    } else {
                        Bundle bundle = gamesLobbyMainFragment.d;
                        if (bundle == null || !bundle.containsKey("game")) {
                            jct jctVar3 = gamesLobbyMainFragment.f;
                            if (jctVar3 == null) {
                                Intrinsics.n("viewModelLobby");
                                throw null;
                            }
                            jctVar3.A1();
                        } else {
                            gamesLobbyMainFragment.p0();
                        }
                        jct jctVar4 = gamesLobbyMainFragment.f;
                        if (jctVar4 == null) {
                            Intrinsics.n("viewModelLobby");
                            throw null;
                        }
                        jctVar4.z1();
                    }
                    int size = arrayList.size();
                    int i3 = 0;
                    do {
                        if (i3 < size) {
                            categoriesResponse = arrayList.get(i3);
                            i3++;
                        } else {
                            categoriesResponse = null;
                        }
                        CategoriesResponse categoriesResponse2 = categoriesResponse;
                        if (arrayList.size() > 0 && categoriesResponse2 == null) {
                            jctVar = gamesLobbyMainFragment.f;
                            if (jctVar != null) {
                                Intrinsics.n("viewModelLobby");
                                throw null;
                            }
                            jctVar.A1();
                        }
                        if (additionalInfo != null && additionalInfo.containsKey("user_logged_in_status") && c.l(additionalInfo.get("user_logged_in_status"), "false", false) && gamesLobbyMainFragment.t0() && (hv70Var = gamesLobbyMainFragment.N) != null) {
                            cn80Var = (cn80) gamesLobbyMainFragment.b;
                            if (cn80Var != null && cn80Var.H.v.getVisibility() == 8) {
                                z = true;
                            }
                            hv70Var.u0(z);
                        }
                    } while (!c.l(categoriesResponse.getName(), gamesLobbyMainFragment.L, false));
                    CategoriesResponse categoriesResponse3 = categoriesResponse;
                    if (arrayList.size() > 0) {
                        jctVar = gamesLobbyMainFragment.f;
                        if (jctVar != null) {
                            Intrinsics.n("viewModelLobby");
                            throw null;
                        }
                        jctVar.A1();
                    }
                    if (additionalInfo != null) {
                        cn80Var = (cn80) gamesLobbyMainFragment.b;
                        if (cn80Var != null) {
                            z = true;
                        }
                        hv70Var.u0(z);
                    }
                } else if (i2 == 2) {
                    gamesLobbyMainFragment.r0();
                    cn80 cn80Var9 = (cn80) gamesLobbyMainFragment.b;
                    if (cn80Var9 != null) {
                        cn80Var9.H.f.setVisibility(8);
                    }
                    cn80 cn80Var10 = (cn80) gamesLobbyMainFragment.b;
                    if (cn80Var10 != null) {
                        cn80Var10.H.A.setVisibility(8);
                    }
                    cn80 cn80Var11 = (cn80) gamesLobbyMainFragment.b;
                    if (cn80Var11 != null) {
                        cn80Var11.H.v.setVisibility(0);
                    }
                    cn80 cn80Var12 = (cn80) gamesLobbyMainFragment.b;
                    if (cn80Var12 != null) {
                        cn80Var12.i.setVisibility(8);
                    }
                    Map<String, String> additionalInfo2 = loadingState.getAdditionalInfo();
                    gamesLobbyMainFragment.y = "";
                    if (gamesLobbyMainFragment.D.length() == 0) {
                        gamesLobbyMainFragment.q0();
                    }
                    if (!Intrinsics.g(gamesLobbyMainFragment.D, "INT")) {
                        jct jctVar5 = gamesLobbyMainFragment.f;
                        if (jctVar5 == null) {
                            Intrinsics.n("viewModelLobby");
                            throw null;
                        }
                        jctVar5.C1();
                    }
                    if (gamesLobbyMainFragment.c) {
                        gamesLobbyMainFragment.c = false;
                    } else {
                        Bundle bundle2 = gamesLobbyMainFragment.d;
                        if (bundle2 == null || !bundle2.containsKey("game")) {
                            jct jctVar6 = gamesLobbyMainFragment.f;
                            if (jctVar6 == null) {
                                Intrinsics.n("viewModelLobby");
                                throw null;
                            }
                            jctVar6.A1();
                        } else {
                            gamesLobbyMainFragment.p0();
                        }
                        jct jctVar7 = gamesLobbyMainFragment.f;
                        if (jctVar7 == null) {
                            Intrinsics.n("viewModelLobby");
                            throw null;
                        }
                        jctVar7.z1();
                    }
                    if (additionalInfo2 != null && additionalInfo2.containsKey("user_logged_in_status") && c.l(additionalInfo2.get("user_logged_in_status"), "true", false) && gamesLobbyMainFragment.t0() && (hv70Var2 = gamesLobbyMainFragment.N) != null) {
                        cn80 cn80Var13 = (cn80) gamesLobbyMainFragment.b;
                        if (cn80Var13 != null && cn80Var13.H.v.getVisibility() == 8) {
                            z = true;
                        }
                        hv70Var2.u0(z);
                    }
                } else {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    cn80 cn80Var14 = (cn80) gamesLobbyMainFragment.b;
                    if (cn80Var14 != null) {
                        cn80Var14.H.v.setVisibility(8);
                    }
                    cn80 cn80Var15 = (cn80) gamesLobbyMainFragment.b;
                    if (cn80Var15 != null) {
                        cn80Var15.H.A.setVisibility(8);
                    }
                    cn80 cn80Var16 = (cn80) gamesLobbyMainFragment.b;
                    if (cn80Var16 != null) {
                        cn80Var16.H.f.setVisibility(0);
                    }
                    cn80 cn80Var17 = (cn80) gamesLobbyMainFragment.b;
                    if (cn80Var17 != null) {
                        cn80Var17.z.setVisibility(0);
                    }
                    cn80 cn80Var18 = (cn80) gamesLobbyMainFragment.b;
                    if (cn80Var18 != null) {
                        cn80Var18.G.setVisibility(0);
                    }
                    cn80 cn80Var19 = (cn80) gamesLobbyMainFragment.b;
                    if (cn80Var19 != null) {
                        cn80Var19.i.setVisibility(0);
                    }
                }
                return Unit.a;
            case 2:
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.u(((Number) ((twd0) obj2).getValue()).floatValue());
                return Unit.a;
            default:
                wd0 wd0Var = (wd0) obj2;
                a7l a7lVar2 = (a7l) obj;
                a7lVar2.getClass();
                a7lVar2.k(((Number) wd0Var.d()).floatValue());
                a7lVar2.v(((Number) wd0Var.d()).floatValue());
                return Unit.a;
        }
    }
}
