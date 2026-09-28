package defpackage;

import android.content.Context;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.e;
import com.sportybet.android.cashoutphase3.h;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.data.Bet;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.lobby.utils.VerticalViewPager;
import com.sportygames.lobby.views.fragment.GamesLobbyMainFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class sn6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sn6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        VerticalViewPager verticalViewPager;
        pgf pgfVar;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                final h hVar = (h) obj2;
                Bet bet = (Bet) obj;
                bet.getClass();
                if (bet.isCashable && !bet.isHugeCombo) {
                    hVar.h0.a(bet);
                    hVar.b0.put(bet.id, bet);
                    if (((Boolean) hVar.j0.a.getValue()).booleanValue()) {
                        ConcurrentHashMap<String, c9p> concurrentHashMap = hVar.p0;
                        final String str = bet.id;
                        if (str != null) {
                            c9p c9pVar = concurrentHashMap.get(str);
                            if (c9pVar != null) {
                                c9pVar.cancel((CancellationException) null);
                            }
                            final jvd0 jvd0VarC = ej5.c(o8i0.d(hVar), null, null, new ao6(hVar, str, bet, null), 3);
                            jvd0VarC.invokeOnCompletion(new Function1() { // from class: tn6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    hVar.p0.remove(str, jvd0VarC);
                                    return Unit.a;
                                }
                            });
                            concurrentHashMap.put(str, jvd0VarC);
                        }
                    }
                }
                return Unit.a;
            case 1:
                GamesLobbyMainFragment gamesLobbyMainFragment = (GamesLobbyMainFragment) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = GamesLobbyMainFragment.a.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    if (gamesLobbyMainFragment.D.length() == 0) {
                        gamesLobbyMainFragment.q0();
                    }
                    if (!Intrinsics.g(gamesLobbyMainFragment.D, "INT") || gamesLobbyMainFragment.y.length() > 0) {
                        HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                        List list = hTTPResponse != null ? (List) hTTPResponse.getData() : null;
                        if (list == null || list.isEmpty()) {
                            cn80 cn80Var = (cn80) gamesLobbyMainFragment.b;
                            if (cn80Var != null) {
                                cn80Var.i.setVisibility(8);
                            }
                            cn80 cn80Var2 = (cn80) gamesLobbyMainFragment.b;
                            if (cn80Var2 != null) {
                                cn80Var2.w.setVisibility(8);
                            }
                        } else {
                            cn80 cn80Var3 = (cn80) gamesLobbyMainFragment.b;
                            if (cn80Var3 != null) {
                                cn80Var3.i.setVisibility(0);
                            }
                            cn80 cn80Var4 = (cn80) gamesLobbyMainFragment.b;
                            if (cn80Var4 != null) {
                                cn80Var4.w.setVisibility(8);
                            }
                            HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                            ArrayList arrayList = new ArrayList(hTTPResponse2 != null ? (List) hTTPResponse2.getData() : null);
                            arrayList.add(arrayList.get(0));
                            Context context = gamesLobbyMainFragment.getContext();
                            j0y j0yVar = context != null ? new j0y(context, CollectionsKt.A0(arrayList)) : null;
                            cn80 cn80Var5 = (cn80) gamesLobbyMainFragment.b;
                            if (cn80Var5 != null) {
                                cn80Var5.v.setAdapter(j0yVar);
                            }
                            cn80 cn80Var6 = (cn80) gamesLobbyMainFragment.b;
                            if (cn80Var6 != null && (pgfVar = (verticalViewPager = cn80Var6.v).F0) != null) {
                                long duration = (long) (((((double) pgfVar.getDuration()) / verticalViewPager.C0) * verticalViewPager.D0) + verticalViewPager.interval);
                                VerticalViewPager.a aVar = verticalViewPager.E0;
                                aVar.getClass();
                                aVar.removeMessages(0);
                                VerticalViewPager.a aVar2 = verticalViewPager.E0;
                                aVar2.getClass();
                                aVar2.sendEmptyMessageDelayed(0, duration);
                            }
                            cn80 cn80Var7 = (cn80) gamesLobbyMainFragment.b;
                            if (cn80Var7 != null) {
                                cn80Var7.v.setAutoScrollDurationFactor(8.0d);
                            }
                            cn80 cn80Var8 = (cn80) gamesLobbyMainFragment.b;
                            if (cn80Var8 != null) {
                                cn80Var8.v.setInterval(1600L);
                            }
                            cn80 cn80Var9 = (cn80) gamesLobbyMainFragment.b;
                            if (cn80Var9 != null) {
                                cn80Var9.v.setBorderAnimation(false);
                            }
                            cn80 cn80Var10 = (cn80) gamesLobbyMainFragment.b;
                            if (cn80Var10 != null) {
                                cn80Var10.v.setCycle(true);
                            }
                            cn80 cn80Var11 = (cn80) gamesLobbyMainFragment.b;
                            if (cn80Var11 != null) {
                                cn80Var11.v.b(new mvj(loadingState, gamesLobbyMainFragment));
                            }
                        }
                    } else {
                        cn80 cn80Var12 = (cn80) gamesLobbyMainFragment.b;
                        if (cn80Var12 != null) {
                            cn80Var12.i.setVisibility(8);
                        }
                        cn80 cn80Var13 = (cn80) gamesLobbyMainFragment.b;
                        if (cn80Var13 != null) {
                            cn80Var13.w.setVisibility(8);
                        }
                    }
                } else if (i2 == 2) {
                    cn80 cn80Var14 = (cn80) gamesLobbyMainFragment.b;
                    if (cn80Var14 != null) {
                        cn80Var14.i.setVisibility(8);
                    }
                    cn80 cn80Var15 = (cn80) gamesLobbyMainFragment.b;
                    if (cn80Var15 != null) {
                        cn80Var15.w.setVisibility(8);
                    }
                }
                return Unit.a;
            default:
                PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj2;
                a aVar3 = (a) obj;
                int i3 = PreMatchEventActivity.a2;
                e eVar = preMatchEventActivity.z;
                if (eVar != null) {
                    eVar.c(aVar3, preMatchEventActivity, preMatchEventActivity.findViewById(R.id.root), preMatchEventActivity);
                    return Unit.a;
                }
                Intrinsics.n("commonUiEventProcessor");
                throw null;
        }
    }
}
