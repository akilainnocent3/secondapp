package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.book.domain.entity.MarketGroup;
import com.sporty.android.book.domain.entity.SimpleMarket;
import com.sporty.android.core.model.bookingcode.BookingCodeInfoDto;
import com.sporty.android.core.model.bookingcode.BookingCodeInfoOutcomeDto;
import com.sporty.android.core.model.cashout.AutoCashOut;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.event.c;
import com.sportybet.plugin.event.e;
import com.sportybet.plugin.realsports.activities.AlertDialogActivity;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.prematch.data.NavigationUiEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class on6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ on6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        ArrayList arrayList;
        boolean z;
        List listM0;
        String str;
        Object value;
        mj40 mj40Var;
        ArrayList arrayList2;
        ArrayList arrayList3;
        LoadingView loadingView;
        LoadingView loadingView2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                AutoCashOut autoCashOut = (AutoCashOut) obj;
                autoCashOut.getClass();
                return Boolean.valueOf(Intrinsics.g(autoCashOut.betId, (String) obj2));
            default:
                final PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj2;
                c cVar = (c) obj;
                if (cVar == null) {
                    int i2 = PreMatchEventActivity.a2;
                    return Unit.a;
                }
                aqg aqgVar = cVar.e;
                if (cVar.b) {
                    LoadingView loadingView3 = preMatchEventActivity.y0;
                    if (loadingView3 != null) {
                        loadingView3.E();
                    }
                    SwipeRefreshLayout swipeRefreshLayout = preMatchEventActivity.T;
                    if (swipeRefreshLayout != null) {
                        swipeRefreshLayout.setRefreshing(false);
                    }
                    ImageView imageView = preMatchEventActivity.E0;
                    if (imageView != null) {
                        imageView.clearAnimation();
                    }
                    int iOrdinal = cVar.c.ordinal();
                    if (iOrdinal == 0) {
                        preMatchEventActivity.showDialog(preMatchEventActivity, cVar.d, new Function0() { // from class: hc20
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i3 = PreMatchEventActivity.a2;
                                preMatchEventActivity.finish();
                                return Unit.a;
                            }
                        });
                    } else if (iOrdinal == 1) {
                        yrh0.t(preMatchEventActivity, AlertDialogActivity.class, true);
                    } else {
                        if (iOrdinal != 2) {
                            uhc.a();
                            return null;
                        }
                        if ((preMatchEventActivity.J0 == 0 || preMatchEventActivity.I1()) && (loadingView2 = preMatchEventActivity.y0) != null) {
                            loadingView2.I();
                        }
                    }
                } else {
                    boolean z2 = cVar.a;
                    SwipeRefreshLayout swipeRefreshLayout2 = preMatchEventActivity.T;
                    if (!z2) {
                        if (swipeRefreshLayout2 != null) {
                            swipeRefreshLayout2.setRefreshing(false);
                        }
                        Event event = aqgVar.a;
                        List<MarketGroup> list = aqgVar.b;
                        if (list != null) {
                            arrayList = new ArrayList();
                            for (Object obj3 : list) {
                                if (!kotlin.text.c.l(((MarketGroup) obj3).getName(), "1 Min. Markets", true)) {
                                    arrayList.add(obj3);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        if (event != null && event.sport != null) {
                            if (lfb0.d().d.containsKey(event.sport.id) && arrayList != null) {
                                preMatchEventActivity.S = event;
                                preMatchEventActivity.V1(event);
                                of20 of20Var = preMatchEventActivity.R0;
                                if (of20Var != null) {
                                    int i3 = event.status;
                                    vu90<NavigationUiEvent> vu90Var = of20Var.e0;
                                    Event event2 = of20Var.k0;
                                    if (event2 != null) {
                                        if (event2.status == i3) {
                                            event2 = null;
                                        }
                                        if (event2 != null) {
                                            if (i3 == 1) {
                                                String str2 = event2.eventId;
                                                str2.getClass();
                                                vu90Var.m(new NavigationUiEvent.LiveNavigation(str2, true));
                                            } else if (i3 == 3 || i3 == 4) {
                                                vu90Var.m(NavigationUiEvent.MatchEndedNavigation.INSTANCE);
                                            }
                                        }
                                    }
                                }
                                String str3 = preMatchEventActivity.Q1;
                                if (str3 != null) {
                                    preMatchEventActivity.Q1 = null;
                                    int i4 = event.status;
                                    if (i4 != 1 && i4 != 3 && i4 != 4) {
                                        qz3.k(str3, "SHARE_BOOKING_CODE_LOAD_CODE");
                                    }
                                }
                                mi20 mi20Var = preMatchEventActivity.M1;
                                if (mi20Var != null && (str = event.eventId) != null && str.equals(mi20Var.E)) {
                                    mi20Var.G = new mi20.a(str, event.homeTeamIcon, event.awayTeamIcon);
                                    wwd0 wwd0Var = mi20Var.B;
                                    do {
                                        value = wwd0Var.getValue();
                                        mj40Var = (mj40) value;
                                        List<BookingCodeInfoDto> list2 = mj40Var.a;
                                        int i5 = 10;
                                        arrayList2 = new ArrayList(l48.r(list2, 10));
                                        for (BookingCodeInfoDto bookingCodeInfoDto : list2) {
                                            List<BookingCodeInfoOutcomeDto> outcomeInfos = bookingCodeInfoDto.getOutcomeInfos();
                                            if (outcomeInfos != null) {
                                                ArrayList arrayList4 = new ArrayList(l48.r(outcomeInfos, i5));
                                                for (BookingCodeInfoOutcomeDto bookingCodeInfoOutcomeDto : outcomeInfos) {
                                                    arrayList4.add(bookingCodeInfoOutcomeDto.copy((4095 & 1) != 0 ? bookingCodeInfoOutcomeDto.awayTeamName : null, (4095 & 2) != 0 ? bookingCodeInfoOutcomeDto.endTime : null, (4095 & 4) != 0 ? bookingCodeInfoOutcomeDto.eventId : null, (4095 & 8) != 0 ? bookingCodeInfoOutcomeDto.homeTeamName : null, (4095 & 16) != 0 ? bookingCodeInfoOutcomeDto.marketDescription : null, (4095 & 32) != 0 ? bookingCodeInfoOutcomeDto.marketId : null, (4095 & 64) != 0 ? bookingCodeInfoOutcomeDto.odds : null, (4095 & 128) != 0 ? bookingCodeInfoOutcomeDto.outcomeDescription : null, (4095 & 256) != 0 ? bookingCodeInfoOutcomeDto.outcomeId : null, (4095 & 512) != 0 ? bookingCodeInfoOutcomeDto.sportId : null, (4095 & 1024) != 0 ? bookingCodeInfoOutcomeDto.startTime : null, (4095 & 2048) != 0 ? bookingCodeInfoOutcomeDto.tournamentIcon : null, (4095 & 4096) != 0 ? bookingCodeInfoOutcomeDto.homeTeamIcon : event.homeTeamIcon, (4095 & 8192) != 0 ? bookingCodeInfoOutcomeDto.awayTeamIcon : event.awayTeamIcon));
                                                }
                                                arrayList3 = arrayList4;
                                            } else {
                                                arrayList3 = null;
                                            }
                                            arrayList2.add(BookingCodeInfoDto.copy$default(bookingCodeInfoDto, null, null, null, null, null, null, arrayList3, null, null, null, null, false, null, 8127, null));
                                            i5 = 10;
                                        }
                                    } while (!wwd0Var.g(value, new mj40(mj40Var.c, arrayList2, mj40Var.b)));
                                    if (mi20Var.A.getValue() instanceof nj40.a) {
                                        mi20.x1(mi20Var, mi20Var.z1(), null, null, 62);
                                    }
                                }
                                rvu rvuVar = preMatchEventActivity.U0;
                                if (rvuVar != null) {
                                    rvu.a[] aVarArr = rvu.a.a;
                                    rvuVar.d = event.sport.id;
                                    ej5.c(o8i0.d(rvuVar), null, null, new tvu(rvuVar, null), 3);
                                }
                                List<SimpleMarket> list3 = aqgVar.d;
                                List<SimpleMarket> list4 = preMatchEventActivity.X;
                                if ((list4 == null && list3 != null) || (list4 != null && list3 == null)) {
                                    preMatchEventActivity.W = true;
                                }
                                preMatchEventActivity.X = list3;
                                ArrayList arrayList5 = preMatchEventActivity.V;
                                if (arrayList5 == null || !arrayList5.equals(arrayList)) {
                                    preMatchEventActivity.W = true;
                                    preMatchEventActivity.V = arrayList;
                                    HashMap<String, List<Market>> map = preMatchEventActivity.M;
                                    map.clear();
                                    map.put("market_search", new ArrayList());
                                    map.put("favorites", new ArrayList());
                                    map.put("all", new ArrayList());
                                    map.put("bet_builder", new ArrayList());
                                    List list5 = preMatchEventActivity.V;
                                    if (list5 == null) {
                                        list5 = m2g.a;
                                    }
                                    Iterator it = list5.iterator();
                                    while (it.hasNext()) {
                                        map.put(((MarketGroup) it.next()).getId(), new ArrayList());
                                    }
                                }
                                String userId = preMatchEventActivity.getAccountHelper().getUserId();
                                List<Integer> list6 = aqgVar.c;
                                if (userId != null && list6 != null) {
                                    preMatchEventActivity.Q0 = list6;
                                    ArrayList arrayList6 = preMatchEventActivity.N;
                                    arrayList6.clear();
                                    Event event3 = preMatchEventActivity.S;
                                    List<Market> list7 = event3 != null ? event3.markets : null;
                                    if (list7 == null) {
                                        preMatchEventActivity.O0 = 0;
                                    } else {
                                        preMatchEventActivity.j2(list7);
                                        PreMatchEventActivity.D1(list7);
                                        List<Integer> list8 = preMatchEventActivity.Q0;
                                        if (list8 != null && (listM0 = CollectionsKt.m0(list8)) != null) {
                                            Iterator it2 = listM0.iterator();
                                            while (it2.hasNext()) {
                                                int iIntValue = ((Number) it2.next()).intValue();
                                                Map<String, ksu> map2 = ypu.a;
                                                Set setE0 = CollectionsKt.E0(ypu.a(String.valueOf(iIntValue)));
                                                ArrayList arrayList7 = new ArrayList();
                                                for (Object obj4 : list7) {
                                                    String str4 = ((Market) obj4).id;
                                                    str4.getClass();
                                                    if (setE0.contains(Integer.valueOf(Integer.parseInt(str4)))) {
                                                        arrayList7.add(obj4);
                                                    }
                                                }
                                                p48.w(arrayList7, arrayList6);
                                            }
                                        }
                                        preMatchEventActivity.O0 = arrayList6.size();
                                    }
                                }
                                List<Market> list9 = event.markets;
                                list9.getClass();
                                boolean z3 = !u5y.b(list9).isEmpty();
                                List<Market> list10 = event.markets;
                                list10.getClass();
                                if (list10.isEmpty()) {
                                    z = false;
                                } else {
                                    Iterator<T> it3 = list10.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            Market market = (Market) it3.next();
                                            if (Intrinsics.g(market.id, "820001") || u5y.c(market)) {
                                                z = true;
                                            }
                                        } else {
                                            z = false;
                                        }
                                    }
                                }
                                preMatchEventActivity.N1(0, cVar.f, z3, z);
                                if (preMatchEventActivity.a2(z3)) {
                                    BubbleView bubbleView = preMatchEventActivity.g0;
                                    if (bubbleView != null) {
                                        bubbleView.setVisibility(0);
                                    }
                                    e eVar = preMatchEventActivity.L1;
                                    if (eVar != null) {
                                        ej5.c(o8i0.d(eVar), null, null, new psg(eVar, 1, null), 3);
                                    }
                                    BubbleView bubbleView2 = preMatchEventActivity.g0;
                                    if (bubbleView2 != null) {
                                        bubbleView2.setOnClickedClose(new Function0() { // from class: uc20
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i6 = PreMatchEventActivity.a2;
                                                preMatchEventActivity.G1(true);
                                                return Unit.a;
                                            }
                                        });
                                    }
                                    preMatchEventActivity.findViewById(R.id.touch_overlay).setOnTouchListener(new View.OnTouchListener() { // from class: vc20
                                        @Override // android.view.View.OnTouchListener
                                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                                            PreMatchEventActivity preMatchEventActivity2;
                                            BubbleView bubbleView3;
                                            int i6 = PreMatchEventActivity.a2;
                                            if (motionEvent.getAction() == 0 && (bubbleView3 = (preMatchEventActivity2 = preMatchEventActivity).g0) != null && bubbleView3.getVisibility() == 0) {
                                                Rect rect = new Rect();
                                                bubbleView3.getGlobalVisibleRect(rect);
                                                if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                                                    preMatchEventActivity2.G1(false);
                                                }
                                            }
                                            return false;
                                        }
                                    });
                                }
                                LoadingView loadingView4 = preMatchEventActivity.y0;
                                if (loadingView4 != null) {
                                    loadingView4.E();
                                }
                            }
                        }
                        LoadingView loadingView5 = preMatchEventActivity.y0;
                        if (loadingView5 != null) {
                            loadingView5.I();
                        }
                        return Unit.a;
                    }
                    if ((swipeRefreshLayout2 == null || !swipeRefreshLayout2.c) && (loadingView = preMatchEventActivity.y0) != null) {
                        loadingView.K();
                    }
                }
                return Unit.a;
        }
    }
}
