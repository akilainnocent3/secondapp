package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel;
import com.sportygames.lobby.remote.models.CategoriesResponse;
import com.sportygames.lobby.remote.models.WalletInfo;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wvj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ wvj(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LobbyV2ViewModel lobbyV2ViewModel;
        LobbyV2ViewModel lobbyV2ViewModel2;
        w3t w3tVar;
        LobbyV2ViewModel lobbyV2ViewModel3;
        aoe0 aoe0Var;
        int i = this.a;
        Fragment fragment = this.b;
        CategoriesResponse categoriesResponse = null;
        Object obj2 = null;
        switch (i) {
            case 0:
                ywj ywjVar = (ywj) fragment;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = ywj.a.b[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    Map<String, String> additionalInfo = loadingState.getAdditionalInfo();
                    B b = ywjVar.b;
                    ArrayList<CategoriesResponse> arrayList = ywjVar.y;
                    w3t w3tVar2 = (w3t) b;
                    if (w3tVar2 != null) {
                        w3tVar2.e.f.setVisibility(8);
                    }
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    WalletInfo walletInfo = hTTPResponse != null ? (WalletInfo) hTTPResponse.getData() : null;
                    if (walletInfo == null || walletInfo.walletString().length() <= 0) {
                        w3t w3tVar3 = (w3t) ywjVar.b;
                        if (w3tVar3 != null) {
                            w3tVar3.e.v.setVisibility(0);
                        }
                        w3t w3tVar4 = (w3t) ywjVar.b;
                        if (w3tVar4 != null) {
                            w3tVar4.e.A.setVisibility(8);
                        }
                    } else {
                        w3t w3tVar5 = (w3t) ywjVar.b;
                        if (w3tVar5 != null) {
                            w3tVar5.e.A.setVisibility(0);
                        }
                        w3t w3tVar6 = (w3t) ywjVar.b;
                        if (w3tVar6 != null) {
                            w3tVar6.e.v.setVisibility(8);
                        }
                        w3t w3tVar7 = (w3t) ywjVar.b;
                        if (w3tVar7 != null) {
                            w3tVar7.e.z.setText(walletInfo.walletString());
                        }
                        walletInfo.walletString();
                        String avatarUrl = walletInfo.getAvatarUrl();
                        Context context = ywjVar.getContext();
                        if (context != null && (w3tVar = (w3t) ywjVar.b) != null) {
                            ImageView imageView = w3tVar.e.e;
                            xa50 xa50VarA = np5.a(context, context);
                            po80 po80Var = new po80(xa50VarA, avatarUrl, na7.a(xa50VarA, Drawable.class, avatarUrl), lo80.a);
                            po80Var.a(hb50.E());
                            po80Var.e(imageView);
                        }
                        try {
                            ywjVar.s0().x1();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    if (ywjVar.f) {
                        ywjVar.f = false;
                    } else {
                        Bundle bundle = ywjVar.i;
                        if (bundle == null || !bundle.containsKey("game")) {
                            Bundle bundle2 = ywjVar.i;
                            if (bundle2 == null || !bundle2.containsKey("action")) {
                                LobbyV2ViewModel lobbyV2ViewModel4 = (LobbyV2ViewModel) ywjVar.a;
                                if (lobbyV2ViewModel4 != null) {
                                    lobbyV2ViewModel4.z1();
                                }
                            } else {
                                ywjVar.u0();
                            }
                        } else {
                            ywjVar.p0();
                        }
                    }
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        CategoriesResponse categoriesResponse2 = arrayList.get(i3);
                        i3++;
                        if (c.l(categoriesResponse2.getName(), ywjVar.B, false)) {
                            categoriesResponse = categoriesResponse2;
                            CategoriesResponse categoriesResponse3 = categoriesResponse;
                            if (arrayList.size() > 0 && categoriesResponse3 == null && (lobbyV2ViewModel2 = (LobbyV2ViewModel) ywjVar.a) != null) {
                                lobbyV2ViewModel2.z1();
                            }
                            if (additionalInfo != null && additionalInfo.containsKey("user_logged_in_status") && c.l(additionalInfo.get("user_logged_in_status"), "false", false) && (lobbyV2ViewModel = (LobbyV2ViewModel) ywjVar.a) != null) {
                                lobbyV2ViewModel.z1();
                            }
                        }
                    }
                    CategoriesResponse categoriesResponse4 = categoriesResponse;
                    if (arrayList.size() > 0) {
                        lobbyV2ViewModel2.z1();
                    }
                    if (additionalInfo != null) {
                        lobbyV2ViewModel.z1();
                    }
                    break;
                } else if (i2 == 2) {
                    w3t w3tVar8 = (w3t) ywjVar.b;
                    if (w3tVar8 != null) {
                        w3tVar8.e.f.setVisibility(8);
                    }
                    w3t w3tVar9 = (w3t) ywjVar.b;
                    if (w3tVar9 != null) {
                        w3tVar9.e.A.setVisibility(8);
                    }
                    w3t w3tVar10 = (w3t) ywjVar.b;
                    if (w3tVar10 != null) {
                        w3tVar10.e.v.setVisibility(0);
                    }
                    Map<String, String> additionalInfo2 = loadingState.getAdditionalInfo();
                    if (ywjVar.z.length() == 0) {
                        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
                        if ((sportyGamesManager != null ? sportyGamesManager.getBridge() : null) == null) {
                            Intent intent = new Intent();
                            intent.setAction("com.sportybet.android.game.REOPEN_GAME_LOBBY");
                            Context context2 = ywjVar.getContext();
                            intent.setPackage(context2 != null ? context2.getPackageName() : null);
                            Context context3 = ywjVar.getContext();
                            if (context3 != null) {
                                context3.sendBroadcast(intent);
                            }
                        }
                    }
                    if (ywjVar.f) {
                        ywjVar.f = false;
                    } else {
                        Bundle bundle3 = ywjVar.i;
                        if (bundle3 == null || !bundle3.containsKey("game")) {
                            Bundle bundle4 = ywjVar.i;
                            if (bundle4 == null || !bundle4.containsKey("action")) {
                                LobbyV2ViewModel lobbyV2ViewModel5 = (LobbyV2ViewModel) ywjVar.a;
                                if (lobbyV2ViewModel5 != null) {
                                    lobbyV2ViewModel5.z1();
                                }
                            } else {
                                ywjVar.u0();
                            }
                        } else {
                            ywjVar.p0();
                        }
                    }
                    if (additionalInfo2 != null && additionalInfo2.containsKey("user_logged_in_status") && c.l(additionalInfo2.get("user_logged_in_status"), "true", false) && (lobbyV2ViewModel3 = (LobbyV2ViewModel) ywjVar.a) != null) {
                        lobbyV2ViewModel3.z1();
                    }
                } else {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    w3t w3tVar11 = (w3t) ywjVar.b;
                    if (w3tVar11 != null) {
                        w3tVar11.e.v.setVisibility(8);
                    }
                    w3t w3tVar12 = (w3t) ywjVar.b;
                    if (w3tVar12 != null) {
                        w3tVar12.e.A.setVisibility(8);
                    }
                    w3t w3tVar13 = (w3t) ywjVar.b;
                    if (w3tVar13 != null) {
                        w3tVar13.e.f.setVisibility(0);
                    }
                }
                return Unit.a;
            default:
                loe0 loe0Var = (loe0) fragment;
                ((View) obj).getClass();
                loe0Var.m0().A1();
                for (Object obj3 : ((wne0) loe0Var.m0().c.getValue()).a) {
                    aoe0 aoe0Var2 = (aoe0) obj3;
                    aoe0.e eVar = aoe0Var2 instanceof aoe0.e ? (aoe0.e) aoe0Var2 : null;
                    if (eVar != null ? eVar.isDefault() : false) {
                        obj2 = obj3;
                        aoe0Var = (aoe0) obj2;
                        if (aoe0Var != null) {
                            loe0Var.m0().z1(aoe0Var);
                        }
                        return Unit.a;
                    }
                }
                aoe0Var = (aoe0) obj2;
                if (aoe0Var != null) {
                    loe0Var.m0().z1(aoe0Var);
                }
                return Unit.a;
        }
    }
}
