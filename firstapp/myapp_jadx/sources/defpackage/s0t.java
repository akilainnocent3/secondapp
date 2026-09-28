package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.lobby.remote.models.LobbyMetaInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s0t implements Function1 {
    public final /* synthetic */ d1t a;

    public /* synthetic */ s0t(d1t d1tVar) {
        this.a = d1tVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jct jctVar;
        ssw<LoadingState<List<GameDetails>>> sswVar;
        znz<GameDetails> znzVar = (znz) obj;
        final d1t d1tVar = this.a;
        c0t c0tVar = d1tVar.f;
        if (c0tVar != null) {
            c0tVar.f.e(znzVar);
            if (znzVar != null) {
                znzVar.b(znzVar.h() ? znzVar : new z5a0<>(znzVar), new d0t());
            }
        }
        if (d1tVar.isAdded() && (jctVar = (jct) d1tVar.a) != null && (sswVar = jctVar.f) != null) {
            sswVar.f(d1tVar.getViewLifecycleOwner(), new lfy() { // from class: b1t
                @Override // defpackage.lfy
                public final void u1(Object obj2) {
                    Resources resources;
                    bo80 bo80Var;
                    j01<GameDetails> j01Var;
                    znz<GameDetails> znzVarA;
                    GameDetails gameDetails;
                    String string;
                    String string2;
                    String launchUrl;
                    LobbyMetaInfo metaInfo;
                    String deepLinkCode;
                    String gameUrl;
                    LoadingState loadingState = (LoadingState) obj2;
                    int i = d1t.a.a[loadingState.getStatus().ordinal()];
                    d1t d1tVar2 = d1tVar;
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                uhc.a();
                                return;
                            }
                            try {
                                op5 op5Var = op5.a;
                                String string3 = d1tVar2.getString(R.string.unknown_error_title_uh_cms);
                                string3.getClass();
                                String string4 = d1tVar2.getString(R.string.other_error_title);
                                string4.getClass();
                                op5Var.getClass();
                                String strB = op5.b(string3, string4, null);
                                String string5 = d1tVar2.getString(R.string.unknown_error_description_cms);
                                string5.getClass();
                                String string6 = d1tVar2.getString(R.string.other_error);
                                string6.getClass();
                                d1tVar2.t0(strB, op5.b(string5, string6, null));
                                bo80 bo80Var2 = (bo80) d1tVar2.b;
                                if (bo80Var2 != null) {
                                    bo80Var2.b.b.setVisibility(8);
                                }
                                bo80 bo80Var3 = (bo80) d1tVar2.b;
                                if (bo80Var3 != null) {
                                    bo80Var3.b.c.setVisibility(0);
                                }
                                bo80 bo80Var4 = (bo80) d1tVar2.b;
                                if (bo80Var4 != null) {
                                    bo80Var4.b.i.setVisibility(0);
                                }
                                bo80 bo80Var5 = (bo80) d1tVar2.b;
                                if (bo80Var5 != null) {
                                    bo80Var5.b.f.setVisibility(0);
                                }
                                d1tVar2.q0();
                                return;
                            } catch (Exception e) {
                                e.printStackTrace();
                                return;
                            }
                        }
                        return;
                    }
                    List arrayList = (List) loadingState.getData();
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    d1tVar2.q0();
                    Bundle bundle = d1tVar2.d;
                    if (bundle != null) {
                        d1tVar2.e.getClass();
                        String string7 = bundle.getString("game", "");
                        string7.getClass();
                        if (string7.length() == 0) {
                            gameDetails = null;
                        } else {
                            String str = (String) bundle.get("game");
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    GameDetails gameDetails2 = (GameDetails) it.next();
                                    if (gameDetails2.getLaunchTrigger() != null) {
                                        string2 = gameDetails2.getLaunchTrigger().toString();
                                        LobbyMetaInfo metaInfo2 = gameDetails2.getMetaInfo();
                                        launchUrl = (metaInfo2 == null || (gameUrl = metaInfo2.getGameUrl()) == null || gameUrl.length() <= 0) ? "" : gameDetails2.getMetaInfo().getGameUrl();
                                    } else {
                                        string2 = "";
                                        launchUrl = string2;
                                    }
                                    if (gameDetails2.getLaunchUrl() != null) {
                                        launchUrl = gameDetails2.getLaunchUrl();
                                    }
                                    if (Intrinsics.g(str, launchUrl) || Intrinsics.g(str, string2) || Intrinsics.g(gameDetails2.getName(), str) || (((metaInfo = gameDetails2.getMetaInfo()) != null && (deepLinkCode = metaInfo.getDeepLinkCode()) != null && deepLinkCode.length() > 0 && c.l(gameDetails2.getMetaInfo().getDeepLinkCode(), str, false)) || (gameDetails2.getLaunchUrl() != null && str != null && StringsKt.M(gameDetails2.getLaunchUrl(), "/".concat(str), false)))) {
                                        gameDetails = gameDetails2;
                                    }
                                } else {
                                    gameDetails = null;
                                }
                            }
                        }
                        if (gameDetails != null) {
                            Bundle bundle2 = d1tVar2.d;
                            if (bundle2 == null || !bundle2.containsKey("source")) {
                                yjj yjjVar = d1tVar2.e;
                                Context contextRequireContext = d1tVar2.requireContext();
                                contextRequireContext.getClass();
                                yjj.c(yjjVar, gameDetails, contextRequireContext, d1tVar2.d, 0, "", null, 96);
                            } else {
                                Bundle bundle3 = d1tVar2.d;
                                String str2 = (bundle3 == null || (string = bundle3.getString("source")) == null) ? "" : string;
                                yjj yjjVar2 = d1tVar2.e;
                                Context contextRequireContext2 = d1tVar2.requireContext();
                                contextRequireContext2.getClass();
                                yjj.c(yjjVar2, gameDetails, contextRequireContext2, null, 0, str2, null, 96);
                                e activity = d1tVar2.getActivity();
                                if (activity != null) {
                                    activity.finish();
                                }
                            }
                            d1tVar2.d = null;
                            d1tVar2.q0();
                            r0t r0tVar = d1tVar2.C;
                            if (r0tVar != null) {
                                r0tVar.t();
                                return;
                            }
                            return;
                        }
                        r0t r0tVar2 = d1tVar2.C;
                        if (r0tVar2 != null) {
                            r0tVar2.t();
                        }
                        d1tVar2.d = null;
                    }
                    r0t r0tVar3 = d1tVar2.C;
                    if (r0tVar3 != null) {
                        r0tVar3.A();
                    }
                    c0t c0tVar2 = d1tVar2.f;
                    int iA = (c0tVar2 == null || (j01Var = c0tVar2.f) == null || (znzVarA = j01Var.a()) == null) ? 0 : znzVarA.d.a();
                    if (!arrayList.isEmpty() || iA > 0) {
                        bo80 bo80Var6 = (bo80) d1tVar2.b;
                        if (bo80Var6 != null) {
                            bo80Var6.d.setVisibility(0);
                        }
                        bo80 bo80Var7 = (bo80) d1tVar2.b;
                        if (bo80Var7 != null) {
                            bo80Var7.e.setVisibility(8);
                        }
                    } else {
                        try {
                            String str3 = d1tVar2.v;
                            if (str3 == null || str3.length() == 0) {
                                op5 op5Var2 = op5.a;
                                String string8 = d1tVar2.getString(R.string.unknown_error_title_uh_cms);
                                string8.getClass();
                                String string9 = d1tVar2.getString(R.string.other_error_title);
                                string9.getClass();
                                op5Var2.getClass();
                                String strB2 = op5.b(string8, string9, null);
                                String string10 = d1tVar2.getString(R.string.no_game_error);
                                string10.getClass();
                                d1tVar2.t0(strB2, string10);
                                bo80 bo80Var8 = (bo80) d1tVar2.b;
                                if (bo80Var8 != null) {
                                    bo80Var8.b.b.setVisibility(8);
                                }
                                bo80 bo80Var9 = (bo80) d1tVar2.b;
                                if (bo80Var9 != null) {
                                    bo80Var9.b.c.setVisibility(0);
                                }
                                bo80 bo80Var10 = (bo80) d1tVar2.b;
                                if (bo80Var10 != null) {
                                    bo80Var10.b.i.setVisibility(8);
                                }
                            } else {
                                String string11 = d1tVar2.getString(R.string.empty_txt);
                                string11.getClass();
                                op5 op5Var3 = op5.a;
                                String string12 = d1tVar2.getString(R.string.games_coming_soon_message_cms);
                                string12.getClass();
                                String string13 = d1tVar2.getString(R.string.empty_category_txt);
                                string13.getClass();
                                op5Var3.getClass();
                                d1tVar2.t0(string11, op5.b(string12, string13, null));
                                bo80 bo80Var11 = (bo80) d1tVar2.b;
                                if (bo80Var11 != null) {
                                    bo80Var11.b.e.setTextColor(d1tVar2.requireActivity().getColor(R.color.empty_category_error_txt));
                                }
                                bo80 bo80Var12 = (bo80) d1tVar2.b;
                                if (bo80Var12 != null) {
                                    bo80Var12.b.e.setTypeface(Typeface.DEFAULT_BOLD);
                                }
                                Context context = d1tVar2.getContext();
                                if (context != null && (resources = context.getResources()) != null && (bo80Var = (bo80) d1tVar2.b) != null) {
                                    bo80Var.b.e.setTextSize(0, resources.getDimension(R.dimen._14ssp));
                                }
                                bo80 bo80Var13 = (bo80) d1tVar2.b;
                                if (bo80Var13 != null) {
                                    bo80Var13.b.e.setAlpha(1.0f);
                                }
                                bo80 bo80Var14 = (bo80) d1tVar2.b;
                                if (bo80Var14 != null) {
                                    bo80Var14.b.b.setVisibility(0);
                                }
                                bo80 bo80Var15 = (bo80) d1tVar2.b;
                                if (bo80Var15 != null) {
                                    bo80Var15.b.c.setVisibility(8);
                                }
                                bo80 bo80Var16 = (bo80) d1tVar2.b;
                                if (bo80Var16 != null) {
                                    bo80Var16.b.d.setVisibility(8);
                                }
                                bo80 bo80Var17 = (bo80) d1tVar2.b;
                                if (bo80Var17 != null) {
                                    bo80Var17.b.i.setVisibility(8);
                                }
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    d1tVar2.q0();
                }
            });
        }
        return Unit.a;
    }
}
