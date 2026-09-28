package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.gridlayout.widget.GridLayout;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.book.domain.entity.EventSource;
import com.sporty.android.book.presentation.eventsorting.EventSortDirection;
import com.sporty.android.book.presentation.eventsorting.EventSortType;
import com.sporty.android.book.presentation.eventsorting.EventStreamType;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.config.bo.BOConfigFeatureFlag;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.realsports.DynamicReplacementMarkets;
import com.sporty.android.core.model.realsports.SportDynamicMarkets;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.BubbleView;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.android.widget.OUEarlyGoalsSwitch;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.SocketEventMessage;
import com.sportybet.plugin.realsports.data.SocketMarketMessage;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.event.LiveTimerTextView;
import com.sportybet.plugin.realsports.live.data.LiveBoostMatchItem;
import com.sportybet.plugin.realsports.live.data.LiveEventData;
import com.sportybet.plugin.realsports.live.data.LiveHeaderData;
import com.sportybet.plugin.realsports.live.data.LiveLoadingData;
import com.sportybet.plugin.realsports.live.data.LiveSectionData;
import com.sportybet.plugin.realsports.live.data.LiveTournamentData;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public final class xss extends com.cruxlab.sectionedrecyclerview.lib.b<com.cruxlab.sectionedrecyclerview.lib.a.b, oos> {
    public static final LinkedHashMap L = new LinkedHashMap();
    public static final LinkedHashSet M = new LinkedHashSet();
    public qps A;
    public eqs B;
    public final LinkedHashMap C;
    public boolean D;
    public mfb0 E;
    public RegularMarketRule F;
    public aos G;
    public boolean H;
    public boolean I;
    public final LinkedHashMap J;
    public final LinkedHashMap K;
    public final /* synthetic */ vfh0 e;
    public final l22 f;
    public final lq1 g;
    public final k650 h;
    public final mjf i;
    public final hkf j;
    public final xhh0 k;
    public final zhh0 l;
    public final a8z m;
    public final muh n;
    public final mpe0 o;
    public final mpe0 p;
    public final mpe0 q;
    public final mpe0 r;
    public LiveHeaderData s;
    public final ArrayList t;
    public final ArrayList u;
    public final ArrayList v;
    public final LinkedHashSet w;
    public final ArrayList x;
    public pps y;
    public jts z;

    /* JADX INFO: loaded from: classes4.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[EventSortDirection.values().length];
            try {
                iArr[EventSortDirection.ASCENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventSortDirection.DESCENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
            int[] iArr2 = new int[EventSortType.values().length];
            try {
                iArr2[EventSortType.LEAGUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EventSortType.TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr2;
        }
    }

    public static final class b<T> implements Comparator {
        public final /* synthetic */ LiveEventData.Companion a;

        public b(LiveEventData.Companion companion) {
            this.a = companion;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            LiveEventData.Companion companion = this.a;
            return Integer.valueOf(companion.sorter((LiveEventData) t)).compareTo(Integer.valueOf(companion.sorter((LiveEventData) t2)));
        }
    }

    public static final class c<T> implements Comparator {
        public final /* synthetic */ LiveEventData.Companion a;

        public c(LiveEventData.Companion companion) {
            this.a = companion;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            LiveEventData.Companion companion = this.a;
            return Integer.valueOf(companion.sorter((LiveEventData) t2)).compareTo(Integer.valueOf(companion.sorter((LiveEventData) t)));
        }
    }

    public static final class d implements Function1<Object, Boolean> {
        public static final d a = new d();

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof LiveEventData);
        }
    }

    public static final class e implements Function1<Object, Boolean> {
        public static final e a = new e();

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof LiveTournamentData);
        }
    }

    public static final class f implements Function1<Object, Boolean> {
        public static final f a = new f();

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof LiveTournamentData);
        }
    }

    public static final class g implements Function1<Object, Boolean> {
        public static final g a = new g();

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(obj instanceof LiveTournamentData);
        }
    }

    public static final class h {
        public h() {
        }

        public final boolean a(Tournament tournament) {
            tournament.getClass();
            return xss.this.w.contains(tournament.id);
        }
    }

    public static final class i {
        public i() {
        }
    }

    public xss(l22 l22Var, lq1 lq1Var, k650 k650Var, mjf mjfVar, hkf hkfVar, xhh0 xhh0Var, zhh0 zhh0Var, a8z a8zVar, muh muhVar) {
        lq1Var.getClass();
        k650Var.getClass();
        mjfVar.getClass();
        hkfVar.getClass();
        xhh0Var.getClass();
        zhh0Var.getClass();
        a8zVar.getClass();
        muhVar.getClass();
        this.e = new vfh0(l22Var, "live/live");
        this.f = l22Var;
        this.g = lq1Var;
        this.h = k650Var;
        this.i = mjfVar;
        this.j = hkfVar;
        this.k = xhh0Var;
        this.l = zhh0Var;
        this.m = a8zVar;
        this.n = muhVar;
        int i2 = 0;
        this.o = hwr.b(new vss(this, i2));
        this.p = hwr.b(new d2j(this, 1));
        this.q = hwr.b(new v6e(this, 2));
        mpe0 mpe0VarB = hwr.b(new wss(i2));
        this.r = mpe0VarB;
        this.s = new LiveHeaderData(false, false, null, null, null, 0, 0, 127, null);
        this.t = new ArrayList();
        this.u = kotlin.collections.b.l((LiveLoadingData) mpe0VarB.getValue());
        this.v = new ArrayList();
        this.w = new LinkedHashSet();
        this.x = new ArrayList();
        this.C = new LinkedHashMap();
        this.J = new LinkedHashMap();
        this.K = new LinkedHashMap();
    }

    public static void D(xss xssVar, RegularMarketRule regularMarketRule, List list, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            list = m2g.a;
        }
        boolean z2 = (i2 & 4) == 0;
        xssVar.getClass();
        list.getClass();
        xssVar.F = regularMarketRule;
        k48.a(xssVar.v, list);
        xssVar.s = LiveHeaderData.copy$default(xssVar.s, z2, !z, null, null, null, 0, 0, 124, null);
        xssVar.v();
    }

    public static void n() {
        L.clear();
        M.clear();
    }

    public final void A() {
        w();
        this.u.add((LiveLoadingData) this.r.getValue());
        c();
    }

    public final void B(List<? extends ing> list) {
        list.getClass();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Event event = ((ing) it.next()).a;
            EventSource eventSource = event.eventSource;
            if (eventSource != null) {
                this.J.put(event.eventId, eventSource);
            }
        }
    }

    public final void C(RegularMarketRule regularMarketRule) {
        ArrayList arrayListG = r48.G(this.t, LiveEventData.class);
        ArrayList arrayList = new ArrayList(l48.r(arrayListG, 10));
        int size = arrayListG.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListG.get(i3);
            i3++;
            arrayList.add(((LiveEventData) obj).getEvent());
        }
        this.e.b(regularMarketRule, arrayList, true);
        this.F = regularMarketRule;
        this.I = true;
        v();
        ArrayList arrayList2 = this.u;
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            int i5 = i2 + 1;
            if (i2 < 0) {
                kotlin.collections.b.q();
                throw null;
            }
            if (((LiveSectionData) obj2) instanceof LiveEventData) {
                d(i2);
            }
            i2 = i5;
        }
    }

    public final void E(RegularMarketRule regularMarketRule, List<? extends Tournament> list, List<LiveBoostMatchItem> list2, boolean z) {
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        ArrayList arrayListA = kw5.a(list2);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Iterable iterable = ((Tournament) it.next()).events;
            if (iterable == null) {
                iterable = m2g.a;
            }
            p48.w(iterable, arrayListA);
        }
        this.e.b(regularMarketRule, arrayListA, true);
        w();
        this.x.addAll(list2);
        this.H = z;
        this.F = regularMarketRule;
        Iterator<T> it2 = list.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            arrayList = this.t;
            i2 = 0;
            z = false;
            z = false;
            boolean z2 = false;
            if (!zHasNext) {
                break;
            }
            Tournament tournament = (Tournament) it2.next();
            mvs mvsVar = mvs.TYPE_TOURNAMENT;
            if (!list2.isEmpty()) {
                Iterator<T> it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (byx.f(((LiveBoostMatchItem) it3.next()).getTournamentId(), tournament.id)) {
                        if (!this.H) {
                            break;
                        }
                        z2 = true;
                        break;
                    }
                }
            }
            arrayList.add(new LiveTournamentData(mvsVar, tournament, z2));
            List<Event> list3 = tournament.events;
            if (list3 != null) {
                ArrayList arrayList2 = new ArrayList(l48.r(list3, 10));
                for (Event event : list3) {
                    mvs mvsVar2 = mvs.TYPE_EVENT;
                    event.getClass();
                    int i5 = event.status;
                    String str = tournament.id;
                    str.getClass();
                    arrayList2.add(new LiveEventData(mvsVar2, event, m(i5, str)));
                }
                arrayList.addAll(arrayList2);
            }
        }
        RegularMarketRule regularMarketRule2 = this.F;
        if (regularMarketRule2 != null) {
            String str2 = regularMarketRule2.a;
            if (!regularMarketRule2.f) {
                Set setE0 = CollectionsKt.E0(StringsKt__StringsKt.split$default(this.h.g("no_specifier_market_ids"), new String[]{","}, false, 0, 6, null));
                Iterator<T> it4 = list.iterator();
                loop4: while (it4.hasNext()) {
                    List<Event> list4 = ((Tournament) it4.next()).events;
                    list4.getClass();
                    Iterator<T> it5 = list4.iterator();
                    while (it5.hasNext()) {
                        List<Market> list5 = ((Event) it5.next()).markets;
                        if (list5 != null) {
                            for (Market market : list5) {
                                if (Intrinsics.g(market.id, str2)) {
                                    boolean z3 = (market.getSingleSpecifier() == null || setE0.contains(market.id)) ? false : true;
                                    if (z3) {
                                        String[] strArr = regularMarketRule2.d;
                                        String str3 = strArr[0];
                                        regularMarketRule2.c = str3 != null;
                                        regularMarketRule2.e = str3;
                                        strArr.getClass();
                                        String[] strArr2 = (String[]) xx0.k(1, regularMarketRule2.d.length, strArr);
                                        if (strArr2 == null || strArr2.length == 0) {
                                            hb5.a("title must not be empty");
                                            return;
                                        }
                                        regularMarketRule2.d = strArr2;
                                    } else {
                                        regularMarketRule2.c = false;
                                        regularMarketRule2.e = null;
                                    }
                                    itf0.a aVar = itf0.a;
                                    aVar.q(MyLog.TAG_QUICK_MARKET);
                                    String singleSpecifier = market.getSingleSpecifier();
                                    String string = Arrays.toString(market.getTitles());
                                    string.getClass();
                                    int size = market.outcomes.size();
                                    StringBuilder sbA = ux5.a("fixCurrentMarketData, event market id: ", str2, ", singleSpecifier: ", singleSpecifier, ", titles: ");
                                    sbA.append(string);
                                    sbA.append(", outcomes: ");
                                    sbA.append(size);
                                    aVar.l(sbA.toString(), new Object[0]);
                                    aVar.q(MyLog.TAG_QUICK_MARKET);
                                    String str4 = regularMarketRule2.e;
                                    String string2 = Arrays.toString(regularMarketRule2.d);
                                    string2.getClass();
                                    StringBuilder sb = new StringBuilder("fixCurrentMarketData, current market id: ");
                                    sb.append(str2);
                                    sb.append(", hasSpecifier: ");
                                    sb.append(z3);
                                    aVar.a(kwi.a(sb, ", specifierName: ", str4, ", titles: ", string2), new Object[0]);
                                    break loop4;
                                }
                            }
                        }
                    }
                }
            }
        }
        LiveHeaderData liveHeaderData = this.s;
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it6 = list.iterator();
        while (it6.hasNext()) {
            Iterable iterable2 = ((Tournament) it6.next()).events;
            if (iterable2 == null) {
                iterable2 = m2g.a;
            }
            p48.w(iterable2, arrayList3);
        }
        if (arrayList3.isEmpty()) {
            i3 = 0;
        } else {
            int size2 = arrayList3.size();
            int i6 = 0;
            int i7 = 0;
            while (i7 < size2) {
                Object obj = arrayList3.get(i7);
                i7++;
                if (((Event) obj).hasLiveStream() && (i6 = i6 + 1) < 0) {
                    kotlin.collections.b.p();
                    throw null;
                }
            }
            i3 = i6;
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator<T> it7 = list.iterator();
        while (it7.hasNext()) {
            Iterable iterable3 = ((Tournament) it7.next()).events;
            if (iterable3 == null) {
                iterable3 = m2g.a;
            }
            p48.w(iterable3, arrayList4);
        }
        if (arrayList4.isEmpty()) {
            i4 = 0;
        } else {
            int size3 = arrayList4.size();
            int i8 = 0;
            int i9 = 0;
            while (i9 < size3) {
                Object obj2 = arrayList4.get(i9);
                i9++;
                if (((Event) obj2).hasAudioStream() && (i8 = i8 + 1) < 0) {
                    kotlin.collections.b.p();
                    throw null;
                }
            }
            i4 = i8;
        }
        this.s = LiveHeaderData.copy$default(liveHeaderData, false, false, null, null, null, i3, i4, 29, null);
        this.u.addAll(o());
        this.I = true;
        v();
        c();
        jts jtsVar = this.z;
        if (jtsVar != null) {
            ArrayList arrayList5 = new ArrayList();
            int size4 = arrayList.size();
            while (i2 < size4) {
                Object obj3 = arrayList.get(i2);
                i2++;
                if (obj3 instanceof LiveEventData) {
                    arrayList5.add(obj3);
                }
            }
            jtsVar.f(arrayList5.size(), null);
        }
    }

    public final void F(RegularMarketRule regularMarketRule, RegularMarketRule regularMarketRule2) {
        String str = regularMarketRule2.a;
        String str2 = regularMarketRule.a;
        if (Intrinsics.g(str, str2)) {
            return;
        }
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.set(i2, Intrinsics.g(((RegularMarketRule) arrayList.get(i2)).a, str2) ? regularMarketRule2 : (RegularMarketRule) arrayList.get(i2));
        }
    }

    @Override // com.cruxlab.sectionedrecyclerview.lib.a
    public final int a() {
        return this.u.size();
    }

    @Override // com.cruxlab.sectionedrecyclerview.lib.a
    public final short b(int i2) {
        if (i2 >= 0) {
            ArrayList arrayList = this.u;
            if (i2 < arrayList.size()) {
                return ((LiveSectionData) arrayList.get(i2)).getViewType().a;
            }
        }
        mvs mvsVar = mvs.TYPE_LOADING;
        return (short) 0;
    }

    /* JADX WARN: Code duplicated, block: B:159:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:214:0x0467  */
    /* JADX WARN: Code duplicated, block: B:225:0x0490  */
    /* JADX WARN: Code duplicated, block: B:274:0x05e1  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.cruxlab.sectionedrecyclerview.lib.a
    public final void f(com.cruxlab.sectionedrecyclerview.lib.a.b bVar, int i2) {
        RegularMarketRule regularMarketRule;
        int i3;
        BOConfigFeatureFlag bOConfigFeatureFlag;
        Object bVar2;
        List arrayList;
        List<? extends Market> list;
        List<SportDynamicMarkets> replacementMarkets;
        BOConfigFeatureFlag bOConfigFeatureFlag2;
        BOConfigFeatureFlag.AndroidRule android2;
        xdp data;
        Market market;
        Object objPrevious;
        Category category;
        Category category2;
        Tournament tournament;
        Category category3;
        com.cruxlab.sectionedrecyclerview.lib.a.b bVar3 = bVar;
        bVar3.getClass();
        short sB = b(i2);
        mvs mvsVar = mvs.TYPE_LOADING;
        ArrayList arrayList2 = this.u;
        if (sB == 1) {
            if (!(bVar3 instanceof dvs)) {
                bVar3 = null;
            }
            dvs dvsVar = (dvs) bVar3;
            if (dvsVar != null) {
                LiveSectionData liveSectionData = (LiveSectionData) arrayList2.get(i2);
                liveSectionData.getClass();
                jid0 jid0Var = dvsVar.b;
                LiveTournamentData liveTournamentData = (LiveTournamentData) (!(liveSectionData instanceof LiveTournamentData) ? null : liveSectionData);
                if (liveTournamentData == null) {
                    return;
                }
                String strA = oxc.a(liveTournamentData.getTournament().categoryName, " - ", liveTournamentData.getTournament().name);
                AppCompatCheckBox appCompatCheckBox = jid0Var.c;
                appCompatCheckBox.setTag(liveTournamentData);
                appCompatCheckBox.setText(strA);
                appCompatCheckBox.setButtonDrawable(dvsVar.e.a(liveTournamentData.getTournament()) ? dvsVar.c : dvsVar.d);
                jid0Var.b.setVisibility(liveTournamentData.getShowBoostSign() ? 0 : 8);
                return;
            }
            return;
        }
        if (sB != 2) {
            if (!(bVar3 instanceof vzs)) {
                bVar3 = null;
            }
            vzs vzsVar = (vzs) bVar3;
            if (vzsVar != null) {
                LiveSectionData liveSectionData2 = (LiveSectionData) CollectionsKt.V(i2, arrayList2);
                LoadingView loadingView = vzsVar.b.b;
                LiveLoadingData liveLoadingData = (LiveLoadingData) (!(liveSectionData2 instanceof LiveLoadingData) ? null : liveSectionData2);
                if (liveLoadingData == null) {
                    return;
                }
                int iOrdinal = liveLoadingData.getLoadingType().ordinal();
                if (iOrdinal == 0) {
                    loadingView.K();
                    return;
                }
                if (iOrdinal == 1) {
                    loadingView.I();
                    return;
                } else if (iOrdinal == 2) {
                    loadingView.G(R.string.common_functions__no_game);
                    return;
                } else {
                    uhc.a();
                    return;
                }
            }
            return;
        }
        if (!(bVar3 instanceof yms)) {
            bVar3 = null;
        }
        final yms ymsVar = (yms) bVar3;
        if (ymsVar != null) {
            fid0 fid0Var = ymsVar.b;
            mfb0 mfb0Var = this.E;
            if (mfb0Var == null || (regularMarketRule = this.F) == null) {
                return;
            }
            LiveSectionData liveSectionData3 = (LiveSectionData) arrayList2.get(i2);
            Context context = ymsVar.e;
            liveSectionData3.getClass();
            lq1 lq1Var = this.g;
            lq1Var.getClass();
            k650 k650Var = this.h;
            k650Var.getClass();
            if (!(liveSectionData3 instanceof LiveEventData)) {
                liveSectionData3 = null;
            }
            final LiveEventData liveEventData = (LiveEventData) liveSectionData3;
            if (liveEventData == null) {
                return;
            }
            ArrayList arrayList3 = ymsVar.h;
            int size = arrayList3.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList3.get(i4);
                i4++;
                ((OutcomeButton) obj).a();
            }
            arrayList3.clear();
            Iterator<T> it = ymsVar.f.iterator();
            while (it.hasNext()) {
                ((OutcomeButton) it.next()).b();
            }
            ConstraintLayout constraintLayout = fid0Var.a;
            ImageView imageView = fid0Var.v;
            ImageView imageView2 = fid0Var.f;
            ImageView imageView3 = fid0Var.F;
            LiveTimerTextView liveTimerTextView = fid0Var.Q;
            ImageView imageView4 = fid0Var.z;
            ImageView imageView5 = fid0Var.b;
            TextView textView = fid0Var.c;
            GridLayout gridLayout = fid0Var.E;
            AppCompatImageView appCompatImageView = fid0Var.N;
            constraintLayout.setTag(liveEventData.getEvent());
            fid0Var.O.setText(liveEventData.getEvent().homeTeamName);
            fid0Var.P.setText(liveEventData.getEvent().awayTeamName);
            fid0Var.V.setText(b3.M(liveEventData.getEvent()));
            if (liveEventData.getEvent().commentsNum <= 0 || !k650Var.b("enable_live_event_list_chat_count")) {
                i3 = 0;
                textView.setVisibility(8);
            } else {
                Context context2 = ymsVar.a.getContext();
                context2.getClass();
                textView.setText(ch7.a(context2, liveEventData.getEvent().commentsNum));
                i3 = 0;
                textView.setVisibility(0);
            }
            if (liveEventData.getEvent().status == 0) {
                liveTimerTextView.setStaticLabel(sn5.b(context, R.string.common_functions__upcoming, new Object[i3]));
            } else if ("sr:sport:1".equals(mfb0Var.getId())) {
                String str = liveEventData.getEvent().eventId;
                str.getClass();
                liveTimerTextView.setLiveTime(str, liveEventData.getEvent().playedSeconds, liveEventData.getEvent().matchStatus, liveEventData.getEvent().status);
            } else {
                String str2 = liveEventData.getEvent().playedSeconds;
                String str3 = liveEventData.getEvent().period;
                liveTimerTextView.setStaticLabel(mfb0Var.p(str2, liveEventData.getEvent().remainingTimeInPeriod, liveEventData.getEvent().matchStatus));
            }
            TextView textView2 = fid0Var.i;
            Sport sport = liveEventData.getEvent().sport;
            String str4 = (sport == null || (category3 = sport.category) == null) ? null : category3.name;
            Sport sport2 = liveEventData.getEvent().sport;
            textView2.setText(sn5.b(context, R.string.app_common__league_title, str4, (sport2 == null || (category2 = sport2.category) == null || (tournament = category2.tournament) == null) ? null : tournament.name));
            imageView5.setImageDrawable(gug0.a(context));
            Sport sport3 = liveEventData.getEvent().sport;
            if (sport3 == null || (category = sport3.category) == null || category.tournament == null) {
                imageView5.setVisibility(8);
            } else {
                imageView5.setVisibility(liveEventData.getShowBoostSign() ? 0 : 8);
            }
            imageView3.setVisibility(nkd0.a.a.a(liveEventData.getEvent()) ? 0 : 8);
            imageView3.setImageDrawable(gug0.e(context));
            imageView2.setImageDrawable(gug0.f(context));
            imageView2.setVisibility(liveEventData.getEvent().topTeam ? 0 : 8);
            imageView.setImageDrawable(gug0.g(context));
            imageView.setVisibility(b3.S(liveEventData.getEvent().eventId) ? 0 : 8);
            fid0Var.M.setVisibility(liveEventData.getEvent().hasLiveStream() ? 0 : 8);
            fid0Var.K.setVisibility(liveEventData.getEvent().hasAudioStream() ? 0 : 8);
            fid0Var.L.setVisibility(liveEventData.getEvent().hasGift() ? 0 : 8);
            if (Intrinsics.g(mfb0Var.getId(), "sr:sport:202120001")) {
                imageView4.setVisibility(liveEventData.getEvent().showLiveTracker() ? 0 : 8);
                imageView4.setOnClickListener(new View.OnClickListener() { // from class: kms
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        jts jtsVar = ymsVar.c;
                        if (jtsVar != null) {
                            jtsVar.c(liveEventData.getEvent());
                        }
                    }
                });
                appCompatImageView.setVisibility(8);
                bOConfigFeatureFlag = null;
                appCompatImageView.setOnClickListener(null);
            } else {
                bOConfigFeatureFlag = null;
                imageView4.setVisibility(8);
                imageView4.setOnClickListener(null);
                appCompatImageView.setVisibility(liveEventData.getEvent().showStats() ? 0 : 8);
                appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: mms
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        jts jtsVar = ymsVar.c;
                        if (jtsVar != null) {
                            jtsVar.a(liveEventData.getEvent());
                        }
                    }
                });
            }
            ArrayList arrayListA = mfb0Var.A(liveEventData.getEvent().setScore, liveEventData.getEvent().pointScore, liveEventData.getEvent().gameScore);
            gridLayout.removeAllViews();
            gridLayout.setColumnCount(arrayListA.size() / 2);
            int i5 = 0;
            int iA = sbz.a(0, arrayListA.size() - 1, 2);
            if (iA >= 0) {
                int i6 = 0;
                while (true) {
                    Object obj2 = arrayListA.get(i6);
                    obj2.getClass();
                    gridLayout.addView(ymsVar.a(i6, (String) obj2));
                    if (i6 == iA) {
                        break;
                    } else {
                        i6 += 2;
                    }
                }
            }
            kotlin.ranges.c cVarL = kotlin.ranges.f.l(2, kotlin.ranges.f.n(1, arrayListA.size()));
            int i7 = cVarL.a;
            int i8 = cVarL.b;
            int i9 = cVarL.c;
            if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                while (true) {
                    Object obj3 = arrayListA.get(i7);
                    obj3.getClass();
                    gridLayout.addView(ymsVar.a(i7, (String) obj3));
                    if (i7 == i8) {
                        break;
                    } else {
                        i7 += i9;
                    }
                }
            }
            if (liveEventData.getEvent().markets == null) {
                liveEventData.getEvent().markets = new ArrayList();
            }
            String id = mfb0Var.getId();
            id.getClass();
            List<Market> list2 = liveEventData.getEvent().markets;
            list2.getClass();
            BOConfigParam bOConfigParam = BOConfigParam.DynamicReplacementMarkets;
            if (qq1.c(lq1Var, bOConfigParam, "1.82.2")) {
                BOConfigValueBundle bOConfigValueBundleE = lq1Var.e();
                if (bOConfigValueBundleE == null) {
                    bVar2 = bOConfigFeatureFlag;
                } else {
                    BOConfigValueWrapper response = bOConfigValueBundleE.getResponse(bOConfigParam);
                    Object configValue = response != null ? response.getConfigValue() : bOConfigFeatureFlag;
                    dq7 dq7VarA = jq40.a(BOConfigFeatureFlag.class);
                    if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                        if (configValue instanceof Integer) {
                            if (!(configValue instanceof BOConfigFeatureFlag)) {
                                configValue = bOConfigFeatureFlag;
                            }
                            bOConfigFeatureFlag2 = (BOConfigFeatureFlag) configValue;
                            if (bOConfigFeatureFlag2 != null || (android2 = bOConfigFeatureFlag2.getAndroid()) == null || (data = android2.getData()) == null) {
                                bVar2 = bOConfigFeatureFlag;
                            } else {
                                try {
                                    zi50.a aVar = zi50.b;
                                    bVar2 = new eal().b(data, DynamicReplacementMarkets.class);
                                } catch (Throwable th) {
                                    zi50.a aVar2 = zi50.b;
                                    bVar2 = new zi50.b(th);
                                }
                                if (bVar2 instanceof zi50.b) {
                                    bVar2 = bOConfigFeatureFlag;
                                }
                            }
                        } else {
                            if (configValue instanceof String) {
                                StringsKt.toIntOrNull((String) configValue);
                            }
                            bOConfigFeatureFlag2 = bOConfigFeatureFlag;
                            if (bOConfigFeatureFlag2 != null) {
                                bVar2 = bOConfigFeatureFlag;
                            } else {
                                bVar2 = bOConfigFeatureFlag;
                            }
                        }
                    } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                        if (configValue instanceof Long) {
                            if (!(configValue instanceof BOConfigFeatureFlag)) {
                                configValue = bOConfigFeatureFlag;
                            }
                            bOConfigFeatureFlag2 = (BOConfigFeatureFlag) configValue;
                            if (bOConfigFeatureFlag2 != null) {
                                bVar2 = bOConfigFeatureFlag;
                            } else {
                                bVar2 = bOConfigFeatureFlag;
                            }
                        } else {
                            if (configValue instanceof String) {
                                StringsKt.s0((String) configValue);
                            }
                            bOConfigFeatureFlag2 = bOConfigFeatureFlag;
                            if (bOConfigFeatureFlag2 != null) {
                                bVar2 = bOConfigFeatureFlag;
                            } else {
                                bVar2 = bOConfigFeatureFlag;
                            }
                        }
                    } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                        if (configValue instanceof Float) {
                            if (!(configValue instanceof BOConfigFeatureFlag)) {
                                configValue = bOConfigFeatureFlag;
                            }
                            bOConfigFeatureFlag2 = (BOConfigFeatureFlag) configValue;
                            if (bOConfigFeatureFlag2 != null) {
                                bVar2 = bOConfigFeatureFlag;
                            } else {
                                bVar2 = bOConfigFeatureFlag;
                            }
                        } else {
                            if (configValue instanceof String) {
                                kotlin.text.b.i((String) configValue);
                            }
                            bOConfigFeatureFlag2 = bOConfigFeatureFlag;
                            if (bOConfigFeatureFlag2 != null) {
                                bVar2 = bOConfigFeatureFlag;
                            } else {
                                bVar2 = bOConfigFeatureFlag;
                            }
                        }
                    } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                        if (configValue instanceof Double) {
                            if (!(configValue instanceof BOConfigFeatureFlag)) {
                                configValue = bOConfigFeatureFlag;
                            }
                            bOConfigFeatureFlag2 = (BOConfigFeatureFlag) configValue;
                            if (bOConfigFeatureFlag2 != null) {
                                bVar2 = bOConfigFeatureFlag;
                            } else {
                                bVar2 = bOConfigFeatureFlag;
                            }
                        } else {
                            if (configValue instanceof String) {
                                kotlin.text.b.h((String) configValue);
                            }
                            bOConfigFeatureFlag2 = bOConfigFeatureFlag;
                            if (bOConfigFeatureFlag2 != null) {
                                bVar2 = bOConfigFeatureFlag;
                            } else {
                                bVar2 = bOConfigFeatureFlag;
                            }
                        }
                    } else if (!dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                        if (!dq7VarA.equals(jq40.a(String.class))) {
                            if (configValue != null) {
                                if (!(configValue instanceof BOConfigFeatureFlag)) {
                                    configValue = bOConfigFeatureFlag;
                                }
                                bOConfigFeatureFlag2 = (BOConfigFeatureFlag) configValue;
                            }
                            if (bOConfigFeatureFlag2 != null) {
                                bVar2 = bOConfigFeatureFlag;
                            } else {
                                bVar2 = bOConfigFeatureFlag;
                            }
                        } else if (configValue != null) {
                            configValue.toString();
                        }
                        bOConfigFeatureFlag2 = bOConfigFeatureFlag;
                        if (bOConfigFeatureFlag2 != null) {
                            bVar2 = bOConfigFeatureFlag;
                        } else {
                            bVar2 = bOConfigFeatureFlag;
                        }
                    } else if (configValue instanceof Boolean) {
                        if (!(configValue instanceof BOConfigFeatureFlag)) {
                            configValue = bOConfigFeatureFlag;
                        }
                        bOConfigFeatureFlag2 = (BOConfigFeatureFlag) configValue;
                        if (bOConfigFeatureFlag2 != null) {
                            bVar2 = bOConfigFeatureFlag;
                        } else {
                            bVar2 = bOConfigFeatureFlag;
                        }
                    } else {
                        if (configValue instanceof String) {
                            StringsKt.r0((String) configValue);
                        }
                        bOConfigFeatureFlag2 = bOConfigFeatureFlag;
                        if (bOConfigFeatureFlag2 != null) {
                            bVar2 = bOConfigFeatureFlag;
                        } else {
                            bVar2 = bOConfigFeatureFlag;
                        }
                    }
                }
                DynamicReplacementMarkets dynamicReplacementMarkets = (DynamicReplacementMarkets) bVar2;
                if (dynamicReplacementMarkets == null || (replacementMarkets = dynamicReplacementMarkets.getReplacementMarkets()) == null) {
                    arrayList = m2g.a;
                } else {
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj4 : replacementMarkets) {
                        if (Intrinsics.g(((SportDynamicMarkets) obj4).getSportId(), id)) {
                            arrayList4.add(obj4);
                        }
                    }
                    arrayList = new ArrayList();
                    int size2 = arrayList4.size();
                    while (i5 < size2) {
                        Object obj5 = arrayList4.get(i5);
                        i5++;
                        p48.w(((SportDynamicMarkets) obj5).getMarketIds(), arrayList);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj6 : list2) {
                    if (arrayList.contains(((Market) obj6).id)) {
                        arrayList5.add(obj6);
                    }
                }
                list = arrayList5;
            } else {
                list = m2g.a;
            }
            fid0Var.I.setVisibility(8);
            boolean z = regularMarketRule.c;
            String str5 = regularMarketRule.a;
            if (z) {
                ArrayList arrayListC = gjs.c(liveEventData.getEvent(), str5);
                ArrayList arrayListD = gjs.d(liveEventData.getEvent(), str5);
                boolean zG = gjs.g(regularMarketRule);
                if (!arrayListC.isEmpty()) {
                    ymsVar.e();
                    Event event = liveEventData.getEvent();
                    Market marketF = ymsVar.f(arrayListD, liveEventData.getEvent(), regularMarketRule, i2);
                    String[] strArr = regularMarketRule.d;
                    strArr.getClass();
                    ymsVar.h(event, marketF, strArr);
                    return;
                }
                Market marketF2 = gjs.f(list);
                if (marketF2 == null || zG) {
                    ymsVar.e();
                    Event event2 = liveEventData.getEvent();
                    Market marketF3 = ymsVar.f(arrayListD, liveEventData.getEvent(), regularMarketRule, i2);
                    String[] strArr2 = regularMarketRule.d;
                    strArr2.getClass();
                    ymsVar.h(event2, marketF3, strArr2);
                    return;
                }
                if (!Intrinsics.g(marketF2.id, str5)) {
                    ymsVar.d(liveEventData, regularMarketRule, marketF2, list, i2);
                    return;
                }
                ymsVar.e();
                Event event3 = liveEventData.getEvent();
                Market marketF4 = ymsVar.f(arrayListD, liveEventData.getEvent(), regularMarketRule, i2);
                String[] strArr3 = regularMarketRule.d;
                strArr3.getClass();
                ymsVar.h(event3, marketF4, strArr3);
                return;
            }
            List<? extends Market> list3 = list;
            fid0Var.G.setVisibility(8);
            Event event4 = liveEventData.getEvent();
            LinkedHashMap linkedHashMap = L;
            Market market2 = (Market) linkedHashMap.get(event4);
            if (market2 == null) {
                List<Market> list4 = liveEventData.getEvent().markets;
                if (list4 != null) {
                    market = market2;
                    ListIterator<Market> listIterator = list4.listIterator(list4.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = bOConfigFeatureFlag;
                            break;
                        }
                        objPrevious = listIterator.previous();
                    } while (!Intrinsics.g(str5, ((Market) objPrevious).id));
                    Market market3 = (Market) objPrevious;
                    if (market3 != null) {
                        linkedHashMap.put(liveEventData.getEvent(), market3);
                        market = market3;
                    } else {
                        market = market2;
                        market = bOConfigFeatureFlag;
                    }
                } else {
                    market = market2;
                    market = bOConfigFeatureFlag;
                }
            }
            market = market2;
            Market marketF5 = !gjs.a(market) ? gjs.f(list3) : market;
            if (gjs.g(regularMarketRule)) {
                ymsVar.e();
                fid0Var.J.setVisibility(8);
                fid0Var.G.setVisibility(8);
                fid0Var.I.setVisibility(8);
                Event event5 = liveEventData.getEvent();
                String[] strArr4 = regularMarketRule.d;
                strArr4.getClass();
                ymsVar.h(event5, market, strArr4);
                return;
            }
            if (Intrinsics.g(marketF5 != null ? marketF5.id : bOConfigFeatureFlag, str5)) {
                ymsVar.e();
                Event event6 = liveEventData.getEvent();
                String[] strArr5 = regularMarketRule.d;
                strArr5.getClass();
                ymsVar.h(event6, marketF5, strArr5);
                return;
            }
            if (marketF5 != null) {
                ymsVar.d(liveEventData, regularMarketRule, marketF5, list3, i2);
                return;
            }
            ymsVar.e();
            Event event7 = liveEventData.getEvent();
            String[] strArr6 = regularMarketRule.d;
            strArr6.getClass();
            ymsVar.h(event7, marketF5, strArr6);
        }
    }

    @Override // com.cruxlab.sectionedrecyclerview.lib.a
    public final com.cruxlab.sectionedrecyclerview.lib.a.b g(ViewGroup viewGroup, short s) {
        viewGroup.getClass();
        mvs mvsVar = mvs.TYPE_LOADING;
        if (s == 1) {
            return new dvs(jid0.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.spr_live_section_header, viewGroup, false)), (Drawable) this.o.getValue(), (Drawable) this.p.getValue(), new h());
        }
        if (s == 2) {
            return new yms(fid0.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.spr_live_item, viewGroup, false)), this.z, new i());
        }
        View viewA = dzc.a(viewGroup, R.layout.live_loading_item, viewGroup, false);
        if (viewA != null) {
            LoadingView loadingView = (LoadingView) viewA;
            return new vzs(new sos(loadingView, loadingView), ((Number) this.q.getValue()).intValue(), this.z);
        }
        bmy.a("rootView");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0138  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.cruxlab.sectionedrecyclerview.lib.b
    public final void i(com.cruxlab.sectionedrecyclerview.lib.a.AbstractC0185a abstractC0185a) {
        eqs eqsVar;
        boolean z;
        jqu jquVar;
        boolean zA;
        oos oosVar = (oos) abstractC0185a;
        oosVar.getClass();
        aos aosVar = oosVar.b;
        final RegularMarketRule regularMarketRule = this.F;
        if (regularMarketRule != null) {
            boolean z2 = this.I;
            lq1 lq1Var = this.g;
            if (z2) {
                oosVar.a(regularMarketRule, this.s, qq1.d(lq1Var, BOConfigParam.QuickMarketMenuToggle));
                this.I = false;
            } else {
                LiveHeaderData liveHeaderData = this.s;
                mfb0 mfb0Var = this.E;
                String id = mfb0Var != null ? mfb0Var.getId() : null;
                float fD = qq1.d(lq1Var, BOConfigParam.QuickMarketMenuToggle);
                ArrayList arrayList = this.v;
                arrayList.getClass();
                liveHeaderData.getClass();
                oosVar.c(fD, id);
                oosVar.l = id;
                final TabLayout tabLayout = aosVar.i;
                tabLayout.setTag(0);
                tabLayout.n();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    RegularMarketRule regularMarketRule2 = (RegularMarketRule) obj;
                    oosVar.c.getClass();
                    RegularMarketRule regularMarketRuleD = hkf.d(regularMarketRule2);
                    TabLayout.g gVarL = tabLayout.l();
                    gVarL.a = regularMarketRule2;
                    aosVar.i.getContext();
                    HashSet hashSet = tru.a;
                    gVarL.e(regularMarketRuleD.b);
                    tabLayout.b(gVarL);
                }
                tabLayout.post(new Runnable() { // from class: gos
                    @Override // java.lang.Runnable
                    public final void run() {
                        Object obj2;
                        TabLayout tabLayout2 = tabLayout;
                        ArrayList arrayListA = x1f0.a(tabLayout2);
                        int size2 = arrayListA.size();
                        int i3 = 0;
                        while (true) {
                            obj2 = null;
                            if (i3 >= size2) {
                                break;
                            }
                            Object obj3 = arrayListA.get(i3);
                            i3++;
                            String str = regularMarketRule.a;
                            Object obj4 = ((TabLayout.g) obj3).a;
                            if (!(obj4 instanceof RegularMarketRule)) {
                                obj4 = null;
                            }
                            RegularMarketRule regularMarketRule3 = (RegularMarketRule) obj4;
                            if (Intrinsics.g(str, regularMarketRule3 != null ? regularMarketRule3.a : null)) {
                                obj2 = obj3;
                                break;
                            }
                        }
                        TabLayout.g gVar = (TabLayout.g) obj2;
                        if (gVar != null) {
                            tabLayout2.setTag(Integer.valueOf(gVar.e));
                            gVar.b();
                        }
                    }
                });
                oosVar.a(regularMarketRule, liveHeaderData, fD);
            }
            mfb0 mfb0Var2 = this.E;
            String id2 = mfb0Var2 != null ? mfb0Var2.getId() : null;
            xhh0 xhh0Var = this.k;
            boolean zE = xhh0Var.e(regularMarketRule, id2, true);
            mfb0 mfb0Var3 = this.E;
            whh0 whh0VarC = xhh0Var.c(regularMarketRule, mfb0Var3 != null ? mfb0Var3.getId() : null, true);
            ckf ckfVar = ckf.c;
            mfb0 mfb0Var4 = this.E;
            String id3 = mfb0Var4 != null ? mfb0Var4.getId() : null;
            String str = regularMarketRule.a;
            mjf mjfVar = this.i;
            boolean zB = mjfVar.b(ckfVar, id3, str, true);
            this.l.getClass();
            yhh0 yhh0VarA = zhh0.a(whh0VarC);
            boolean z3 = this.D;
            if (zE) {
                eqs eqsVar2 = this.B;
                if (eqsVar2 != null) {
                    LivePageActivity livePageActivity = eqsVar2.a;
                    int i3 = LivePageActivity.b0;
                    zA = ((sn20) livePageActivity.J.getValue()).a.a("dc_one_up_switch_hint_displayed");
                } else {
                    zA = true;
                }
                Object[] objArr = (whh0VarC != null ? whh0VarC.a : null) == rhh0.b && whh0VarC.c.contains(phh0.a);
                if (zA || !objArr == true) {
                    jquVar = null;
                } else {
                    jquVar = jqu.b;
                }
            } else if (zB) {
                mfb0 mfb0Var5 = this.E;
                String id4 = mfb0Var5 != null ? mfb0Var5.getId() : null;
                RegularMarketRule regularMarketRule3 = this.F;
                if (mjfVar.b(ckfVar, id4, regularMarketRule3 != null ? regularMarketRule3.a : null, true) && (eqsVar = this.B) != null) {
                    LivePageActivity livePageActivity2 = eqsVar.a;
                    int i4 = LivePageActivity.b0;
                    z = !((sn20) livePageActivity2.J.getValue()).a.a("market_early_goals_switch_hint_displayed");
                } else {
                    z = false;
                }
                if (z) {
                    jquVar = jqu.a;
                } else {
                    jquVar = null;
                }
            } else {
                jquVar = null;
            }
            if (zE) {
                OneUpTwoUpSwitch oneUpTwoUpSwitch = aosVar.w;
                BubbleView bubbleView = aosVar.f;
                hih0.a(oneUpTwoUpSwitch, yhh0VarA.a);
                hih0.c(oneUpTwoUpSwitch, yhh0VarA.b, false, true);
                oneUpTwoUpSwitch.setVisibility(0);
                aosVar.y.setVisibility(8);
                aosVar.e.setVisibility(0);
                if (jquVar != null) {
                    lqu.c(bubbleView, jquVar, null);
                }
                c8i0.o(bubbleView, jquVar != null);
                return;
            }
            if (!zB) {
                aosVar.w.setVisibility(8);
                aosVar.y.setVisibility(8);
                aosVar.e.setVisibility(8);
                aosVar.f.setVisibility(8);
                return;
            }
            OneUpTwoUpSwitch oneUpTwoUpSwitch2 = aosVar.w;
            BubbleView bubbleView2 = aosVar.f;
            OUEarlyGoalsSwitch oUEarlyGoalsSwitch = aosVar.y;
            oneUpTwoUpSwitch2.setVisibility(8);
            oUEarlyGoalsSwitch.setState(z3, false, true);
            oUEarlyGoalsSwitch.setVisibility(0);
            aosVar.e.setVisibility(0);
            if (jquVar != null) {
                lqu.c(bubbleView2, jquVar, new cos(aosVar, false ? 1 : 0));
            }
            c8i0.o(bubbleView2, jquVar != null);
        }
    }

    @Override // com.cruxlab.sectionedrecyclerview.lib.b
    public final com.cruxlab.sectionedrecyclerview.lib.a.AbstractC0185a j(ViewGroup viewGroup) {
        View viewA = u540.a(viewGroup, R.layout.live_header_item, viewGroup, false);
        int i2 = R.id.collapse_status;
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) h5e.a(R.id.collapse_status, viewA);
        if (appCompatCheckBox != null) {
            i2 = R.id.event_sorting_button;
            ComposeView composeView = (ComposeView) h5e.a(R.id.event_sorting_button, viewA);
            if (composeView != null) {
                i2 = R.id.event_stream_types_row;
                ComposeView composeView2 = (ComposeView) h5e.a(R.id.event_stream_types_row, viewA);
                if (composeView2 != null) {
                    i2 = R.id.market_option_divider;
                    View viewA2 = h5e.a(R.id.market_option_divider, viewA);
                    if (viewA2 != null) {
                        i2 = R.id.market_option_feature_alert;
                        BubbleView bubbleView = (BubbleView) h5e.a(R.id.market_option_feature_alert, viewA);
                        if (bubbleView != null) {
                            i2 = R.id.market_tab;
                            TabLayout tabLayout = (TabLayout) h5e.a(R.id.market_tab, viewA);
                            if (tabLayout != null) {
                                i2 = R.id.market_title;
                                View viewA3 = h5e.a(R.id.market_title, viewA);
                                if (viewA3 != null) {
                                    gid0 gid0VarA = gid0.a(viewA3);
                                    i2 = R.id.one_up_two_up_switch;
                                    OneUpTwoUpSwitch oneUpTwoUpSwitch = (OneUpTwoUpSwitch) h5e.a(R.id.one_up_two_up_switch, viewA);
                                    if (oneUpTwoUpSwitch != null) {
                                        i2 = R.id.ou_early_goals_switch;
                                        OUEarlyGoalsSwitch oUEarlyGoalsSwitch = (OUEarlyGoalsSwitch) h5e.a(R.id.ou_early_goals_switch, viewA);
                                        if (oUEarlyGoalsSwitch != null) {
                                            i2 = R.id.quick_market_entrance;
                                            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.quick_market_entrance, viewA);
                                            if (appCompatImageView != null) {
                                                aos aosVar = new aos((ConstraintLayout) viewA, appCompatCheckBox, composeView, composeView2, viewA2, bubbleView, tabLayout, gid0VarA, oneUpTwoUpSwitch, oUEarlyGoalsSwitch, appCompatImageView);
                                                this.G = aosVar;
                                                return new oos(aosVar, this.j, (Drawable) this.o.getValue(), (Drawable) this.p.getValue(), this.y, new ats(this), this.A, this.B);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i2)));
        return null;
    }

    public final boolean l() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.t;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            if (obj instanceof LiveTournamentData) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            if (!this.w.contains(((LiveTournamentData) obj2).getTournament().id)) {
                return false;
            }
        }
        return true;
    }

    public final boolean m(int i2, String str) {
        int productId;
        ArrayList arrayList = this.x;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                LiveBoostMatchItem liveBoostMatchItem = (LiveBoostMatchItem) obj;
                if (byx.f(liveBoostMatchItem.getTournamentId(), str) && this.H && (((productId = liveBoostMatchItem.getProductId()) == 1 && i2 == 1) || (productId == 3 && i2 == 0))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:189:0x0273 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x022c A[SYNTHETIC] */
    public final List<LiveSectionData> o() {
        Event event;
        List<Event> list;
        List<Event> list2;
        List<LiveSectionData> listR0;
        Iterable iterableA0 = CollectionsKt.A0(this.t);
        int i2 = a.b[this.s.getSortType().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                uhc.a();
                return null;
            }
            if (l()) {
                return m2g.a;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterableA0) {
                if (obj instanceof LiveEventData) {
                    arrayList.add(obj);
                }
            }
            int i3 = a.a[this.s.getSortDirection().ordinal()];
            if (i3 == 1) {
                listR0 = CollectionsKt.r0(arrayList, new b(LiveEventData.INSTANCE));
            } else {
                if (i3 != 2) {
                    uhc.a();
                    return null;
                }
                listR0 = CollectionsKt.r0(arrayList, new c(LiveEventData.INSTANCE));
            }
            if (this.s.getSelectedStreamTypes().contains(EventStreamType.SPORTY_FM)) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listR0) {
                    if (((LiveEventData) obj2).getEvent().hasAudioStream()) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : listR0) {
                    if (!((LiveEventData) obj3).getEvent().hasAudioStream()) {
                        arrayList3.add(obj3);
                    }
                }
                listR0 = CollectionsKt.i0(arrayList3, arrayList2);
            }
            if (!this.s.getSelectedStreamTypes().contains(EventStreamType.SPORTY_TV)) {
                return listR0;
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj4 : listR0) {
                if (((LiveEventData) obj4).getEvent().hasLiveStream()) {
                    arrayList4.add(obj4);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj5 : listR0) {
                if (!((LiveEventData) obj5).getEvent().hasLiveStream()) {
                    arrayList5.add(obj5);
                }
            }
            return CollectionsKt.i0(arrayList5, arrayList4);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj6 : iterableA0) {
            if (obj6 instanceof LiveTournamentData) {
                arrayList6.add(obj6);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        int size = arrayList6.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj7 = arrayList6.get(i5);
            i5++;
            if (this.w.contains(((LiveTournamentData) obj7).getTournament().id)) {
                arrayList7.add(obj7);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        int size2 = arrayList7.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj8 = arrayList7.get(i6);
            i6++;
            List<Event> list3 = ((LiveTournamentData) obj8).getTournament().events;
            p48.w(list3 != null ? CollectionsKt.R(list3) : m2g.a, arrayList8);
        }
        ArrayList arrayList9 = new ArrayList(l48.r(arrayList8, 10));
        int size3 = arrayList8.size();
        while (i4 < size3) {
            Object obj9 = arrayList8.get(i4);
            i4++;
            arrayList9.add(((Event) obj9).eventId);
        }
        if (!this.s.getSelectedStreamTypes().isEmpty()) {
            ArrayList arrayList10 = new ArrayList();
            for (Object obj10 : iterableA0) {
                LiveSectionData liveSectionData = (LiveSectionData) obj10;
                if ((liveSectionData instanceof LiveTournamentData) && (list2 = ((LiveTournamentData) liveSectionData).getTournament().events) != null && !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Event event2 = (Event) it.next();
                            event2.getClass();
                            if (apg.e(event2, this.s.getSelectedStreamTypes())) {
                            }
                        } else if (!(liveSectionData instanceof LiveEventData)) {
                        }
                        arrayList10.add(obj10);
                    }
                } else if (!(liveSectionData instanceof LiveEventData) && apg.e(((LiveEventData) liveSectionData).getEvent(), this.s.getSelectedStreamTypes())) {
                    arrayList10.add(obj10);
                }
            }
            ArrayList arrayList11 = new ArrayList();
            for (Object obj11 : iterableA0) {
                LiveSectionData liveSectionData2 = (LiveSectionData) obj11;
                if ((liveSectionData2 instanceof LiveTournamentData) && (list = ((LiveTournamentData) liveSectionData2).getTournament().events) != null && !list.isEmpty()) {
                    Iterator<T> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            Event event3 = (Event) it2.next();
                            event3.getClass();
                            if (event3.hasLiveStream() || event3.hasAudioStream()) {
                            }
                        } else if (liveSectionData2 instanceof LiveEventData) {
                            event = ((LiveEventData) liveSectionData2).getEvent();
                            event.getClass();
                            if (event.hasLiveStream()) {
                            }
                        }
                        arrayList11.add(obj11);
                    }
                } else if (liveSectionData2 instanceof LiveEventData) {
                    event = ((LiveEventData) liveSectionData2).getEvent();
                    event.getClass();
                    if (event.hasLiveStream() && !event.hasAudioStream()) {
                        arrayList11.add(obj11);
                    }
                }
            }
            iterableA0 = CollectionsKt.i0(arrayList11, arrayList10);
        }
        ArrayList arrayList12 = new ArrayList();
        for (Object obj12 : iterableA0) {
            LiveSectionData liveSectionData3 = (LiveSectionData) obj12;
            if ((liveSectionData3 instanceof LiveTournamentData) || ((liveSectionData3 instanceof LiveEventData) && !arrayList9.contains(((LiveEventData) liveSectionData3).getEvent().eventId))) {
                arrayList12.add(obj12);
            }
        }
        return arrayList12;
    }

    public final Sport p(mfb0 mfb0Var, Tournament tournament) {
        Sport sport = new Sport();
        sport.id = mfb0Var.getId();
        sport.name = mfb0Var.c().g(this.f);
        Category category = new Category();
        category.id = tournament.categoryId;
        category.name = tournament.categoryName;
        category.tournament = tournament;
        sport.category = category;
        return sport;
    }

    public final Pair<Integer, Integer> q(Event event) {
        Object next;
        ArrayList arrayList = this.t;
        knh.a aVar = new knh.a(ld80.d(CollectionsKt.K(arrayList), d.a));
        do {
            if (!aVar.hasNext()) {
                next = null;
                break;
            }
            next = aVar.next();
        } while (!Intrinsics.g(((LiveEventData) next).getEvent().eventId, event.eventId));
        LiveEventData liveEventData = (LiveEventData) next;
        if (liveEventData != null) {
            return new Pair<>(Integer.valueOf(arrayList.indexOf(liveEventData)), Integer.valueOf(this.u.indexOf(liveEventData)));
        }
        return null;
    }

    public final Pair<Integer, Integer> r(Tournament tournament) {
        Object next;
        ArrayList arrayList = this.t;
        knh.a aVar = new knh.a(ld80.d(CollectionsKt.K(arrayList), e.a));
        do {
            if (!aVar.hasNext()) {
                next = null;
                break;
            }
            next = aVar.next();
        } while (!Intrinsics.g(((LiveTournamentData) next).getTournament().id, tournament.id));
        LiveTournamentData liveTournamentData = (LiveTournamentData) next;
        if (liveTournamentData != null) {
            return new Pair<>(Integer.valueOf(arrayList.indexOf(liveTournamentData)), Integer.valueOf(this.u.indexOf(liveTournamentData)));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:171:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:59:0x0105  */
    /* JADX WARN: Code duplicated, block: B:61:0x010a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0116  */
    /* JADX WARN: Code duplicated, block: B:65:0x011a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0139  */
    /* JADX WARN: Code duplicated, block: B:70:0x0144  */
    public final void s(SocketEventMessage socketEventMessage, boolean z) {
        Object obj;
        Object next;
        mfb0 mfb0Var;
        boolean z2;
        int i2;
        int i3;
        Object bVar;
        int iIntValue;
        Pair<Integer, Integer> pairQ;
        int iIntValue2;
        int iIntValue3;
        jts jtsVar;
        ArrayList arrayList;
        int size;
        Object obj2;
        Object next2;
        socketEventMessage.getClass();
        mfb0 mfb0Var2 = this.E;
        if (mfb0Var2 == null || b3.T(socketEventMessage.eventId) || !sa8.a(mfb0Var2.getId()).equals(socketEventMessage.sportId)) {
            return;
        }
        ArrayList arrayList2 = this.t;
        knh.a aVar = new knh.a(ld80.d(CollectionsKt.K(arrayList2), f.a));
        while (true) {
            obj = null;
            if (!aVar.hasNext()) {
                next = null;
                break;
            }
            next = aVar.next();
            LiveTournamentData liveTournamentData = (LiveTournamentData) next;
            if (Intrinsics.g(liveTournamentData.getTournament().id, socketEventMessage.tournamentId) && Intrinsics.g(liveTournamentData.getTournament().categoryId, socketEventMessage.tournamentCategoryId)) {
                break;
            }
        }
        LiveTournamentData liveTournamentData2 = (LiveTournamentData) next;
        LinkedHashSet linkedHashSet = this.w;
        ArrayList arrayList3 = this.u;
        int i4 = 0;
        if (liveTournamentData2 != null) {
            Tournament tournament = liveTournamentData2.getTournament();
            try {
                zi50.a aVar2 = zi50.b;
                List<Event> list = tournament.events;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                    } while (!Intrinsics.g(((Event) next2).eventId, socketEventMessage.eventId));
                    bVar = (Event) next2;
                } else {
                    bVar = null;
                }
            } catch (Throwable th) {
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
            zi50.a aVar4 = zi50.b;
            if (!(bVar instanceof zi50.b)) {
                Event event = (Event) bVar;
                if (event == null) {
                    u(socketEventMessage, tournament);
                } else if (socketEventMessage.canLiveBet) {
                    knh.a aVar5 = new knh.a(ld80.d(new u48(arrayList2), yss.a));
                    while (aVar5.hasNext()) {
                        Object next3 = aVar5.next();
                        if (Intrinsics.g(((LiveEventData) next3).getEvent().eventId, event.eventId)) {
                            obj = next3;
                            break;
                        }
                    }
                    if (((LiveEventData) obj) != null) {
                        event.update(socketEventMessage.jsonObject);
                    }
                    Pair<Integer, Integer> pairQ2 = q(event);
                    if (pairQ2 != null && (iIntValue = pairQ2.b.intValue()) >= 0) {
                        d(iIntValue);
                    }
                } else {
                    tournament.events.remove(event);
                    if (tournament.events.isEmpty()) {
                        linkedHashSet.remove(tournament.id);
                        Pair<Integer, Integer> pairR = r(tournament);
                        if (pairR != null) {
                            int iIntValue4 = pairR.a.intValue();
                            int iIntValue5 = pairR.b.intValue();
                            if (iIntValue4 >= 0) {
                                arrayList2.remove(iIntValue4);
                            }
                            if (iIntValue5 >= 0) {
                                arrayList3.remove(iIntValue5);
                                e(iIntValue5);
                            }
                            pairQ = q(event);
                            if (pairQ != null) {
                                iIntValue2 = pairQ.a.intValue();
                                iIntValue3 = pairQ.b.intValue();
                                if (iIntValue2 >= 0) {
                                    arrayList2.remove(iIntValue2);
                                }
                                if (iIntValue3 >= 0) {
                                    arrayList3.remove(iIntValue3);
                                    e(iIntValue3);
                                }
                                if (arrayList3.isEmpty()) {
                                    y();
                                } else {
                                    this.s = LiveHeaderData.copy$default(this.s, false, false, null, null, null, 0, 0, 125, null);
                                    this.I = true;
                                    v();
                                }
                                jtsVar = this.z;
                                if (jtsVar != null) {
                                    arrayList = new ArrayList();
                                    size = arrayList2.size();
                                    while (i4 < size) {
                                        obj2 = arrayList2.get(i4);
                                        i4++;
                                        if (obj2 instanceof LiveEventData) {
                                            arrayList.add(obj2);
                                        }
                                    }
                                    jtsVar.f(arrayList.size(), event);
                                }
                            }
                        }
                    } else {
                        pairQ = q(event);
                        if (pairQ != null) {
                            iIntValue2 = pairQ.a.intValue();
                            iIntValue3 = pairQ.b.intValue();
                            if (iIntValue2 >= 0) {
                                arrayList2.remove(iIntValue2);
                            }
                            if (iIntValue3 >= 0) {
                                arrayList3.remove(iIntValue3);
                                e(iIntValue3);
                            }
                            if (arrayList3.isEmpty()) {
                                y();
                            } else {
                                this.s = LiveHeaderData.copy$default(this.s, false, false, null, null, null, 0, 0, 125, null);
                                this.I = true;
                                v();
                            }
                            jtsVar = this.z;
                            if (jtsVar != null) {
                                arrayList = new ArrayList();
                                size = arrayList2.size();
                                while (i4 < size) {
                                    obj2 = arrayList2.get(i4);
                                    i4++;
                                    if (obj2 instanceof LiveEventData) {
                                        arrayList.add(obj2);
                                    }
                                }
                                jtsVar.f(arrayList.size(), event);
                            }
                        }
                    }
                }
            }
            if (zi50.a(bVar) != null) {
                u(socketEventMessage, tournament);
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(new android.util.Pair("tournament", tournament.toString()));
                w950.a("LiveSectionAdapter", "handleExistTournament", new Throwable("tournament.events null"), arrayList4);
                return;
            }
            return;
        }
        if (z && (mfb0Var = this.E) != null && socketEventMessage.canLiveBet) {
            Tournament tournament2 = new Tournament();
            tournament2.id = socketEventMessage.tournamentId;
            tournament2.name = socketEventMessage.tournamentName;
            tournament2.categoryId = socketEventMessage.tournamentCategoryId;
            tournament2.categoryName = socketEventMessage.tournamentCategoryName;
            tournament2.events = new ArrayList();
            Event event2 = new Event();
            event2.eventSource = (EventSource) this.J.get(socketEventMessage.eventId);
            event2.eventId = socketEventMessage.eventId;
            event2.tournament = tournament2;
            event2.sport = p(mfb0Var, tournament2);
            event2.update(socketEventMessage.jsonObject);
            tournament2.events.add(event2);
            linkedHashSet.remove(tournament2.id);
            mvs mvsVar = mvs.TYPE_TOURNAMENT;
            ArrayList arrayList5 = this.x;
            if (arrayList5 != null && arrayList5.isEmpty()) {
                z2 = false;
                break;
            }
            int size2 = arrayList5.size();
            int i5 = 0;
            while (true) {
                if (i5 < size2) {
                    Object obj3 = arrayList5.get(i5);
                    i5++;
                    if (byx.f(((LiveBoostMatchItem) obj3).getTournamentId(), tournament2.id)) {
                        if (this.H) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                break;
            }
            LiveTournamentData liveTournamentData3 = new LiveTournamentData(mvsVar, tournament2, z2);
            mvs mvsVar2 = mvs.TYPE_EVENT;
            int i6 = event2.status;
            String str = tournament2.id;
            str.getClass();
            LiveEventData liveEventData = new LiveEventData(mvsVar2, event2, m(i6, str));
            arrayList2.add(liveTournamentData3);
            arrayList2.add(liveEventData);
            LiveHeaderData liveHeaderData = this.s;
            ArrayList arrayList6 = new ArrayList();
            int size3 = arrayList2.size();
            int i7 = 0;
            while (i7 < size3) {
                Object obj4 = arrayList2.get(i7);
                i7++;
                if (obj4 instanceof LiveEventData) {
                    arrayList6.add(obj4);
                }
            }
            if (arrayList6.isEmpty()) {
                i2 = 0;
            } else {
                int size4 = arrayList6.size();
                int i8 = 0;
                int i9 = 0;
                while (i9 < size4) {
                    Object obj5 = arrayList6.get(i9);
                    i9++;
                    if (((LiveEventData) obj5).getEvent().hasLiveStream() && (i8 = i8 + 1) < 0) {
                        kotlin.collections.b.p();
                        throw null;
                    }
                }
                i2 = i8;
            }
            ArrayList arrayList7 = new ArrayList();
            int size5 = arrayList2.size();
            int i10 = 0;
            while (i10 < size5) {
                Object obj6 = arrayList2.get(i10);
                i10++;
                if (obj6 instanceof LiveEventData) {
                    arrayList7.add(obj6);
                }
            }
            if (arrayList7.isEmpty()) {
                i3 = 0;
            } else {
                int size6 = arrayList7.size();
                int i11 = 0;
                int i12 = 0;
                while (i12 < size6) {
                    Object obj7 = arrayList7.get(i12);
                    i12++;
                    if (((LiveEventData) obj7).getEvent().hasAudioStream() && (i11 = i11 + 1) < 0) {
                        kotlin.collections.b.p();
                        throw null;
                    }
                }
                i3 = i11;
            }
            this.s = LiveHeaderData.copy$default(liveHeaderData, false, false, null, null, null, i2, i3, 29, null);
            k48.a(arrayList3, o());
            this.I = true;
            v();
            c();
            jts jtsVar2 = this.z;
            if (jtsVar2 != null) {
                ArrayList arrayList8 = new ArrayList();
                int size7 = arrayList2.size();
                while (i4 < size7) {
                    Object obj8 = arrayList2.get(i4);
                    i4++;
                    if (obj8 instanceof LiveEventData) {
                        arrayList8.add(obj8);
                    }
                }
                jtsVar2.f(arrayList8.size(), event2);
            }
        }
    }

    public final void t(SocketMarketMessage socketMarketMessage) {
        Object next;
        Tournament tournament;
        List<Event> list;
        Object next2;
        RegularMarketRule regularMarketRule;
        Object obj;
        Object next3;
        socketMarketMessage.getClass();
        mfb0 mfb0Var = this.E;
        Market market = null;
        if (socketMarketMessage.isSameSport(mfb0Var != null ? mfb0Var.getId() : null)) {
            knh.a aVar = new knh.a(ld80.d(CollectionsKt.K(this.t), g.a));
            do {
                if (!aVar.hasNext()) {
                    next = null;
                    break;
                }
                next = aVar.next();
            } while (!Intrinsics.g(((LiveTournamentData) next).getTournament().id, socketMarketMessage.tournamentId));
            LiveTournamentData liveTournamentData = (LiveTournamentData) next;
            if (liveTournamentData == null || (tournament = liveTournamentData.getTournament()) == null || (list = tournament.events) == null) {
                return;
            }
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!Intrinsics.g(((Event) next2).eventId, socketMarketMessage.eventId));
            Event event = (Event) next2;
            if (event != null) {
                ArrayList arrayList = this.u;
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        i3 = -1;
                        break;
                    }
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    LiveSectionData liveSectionData = (LiveSectionData) obj2;
                    if ((liveSectionData instanceof LiveEventData) && Intrinsics.g(((LiveEventData) liveSectionData).getEvent().eventId, event.eventId)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                RegularMarketRule regularMarketRule2 = this.F;
                if (Intrinsics.g(regularMarketRule2 != null ? regularMarketRule2.a : null, socketMarketMessage.marketId)) {
                    regularMarketRule = this.F;
                } else {
                    String str = socketMarketMessage.marketId;
                    LinkedHashMap linkedHashMap = this.K;
                    Object objA = linkedHashMap.get(str);
                    if (objA == null) {
                        objA = RegularMarketRule.a(socketMarketMessage.marketId, null);
                        linkedHashMap.put(str, objA);
                    }
                    regularMarketRule = (RegularMarketRule) objA;
                }
                JSONArray jSONArray = socketMarketMessage.jsonArray;
                jSONArray.getClass();
                String str2 = socketMarketMessage.marketSpecifier;
                str2.getClass();
                if (regularMarketRule == null) {
                    return;
                }
                String str3 = regularMarketRule.a;
                if (event.markets == null) {
                    event.markets = new ArrayList();
                }
                boolean z = regularMarketRule.c;
                LinkedHashMap linkedHashMap2 = L;
                if (z || !Intrinsics.g(str2, "~")) {
                    ArrayList arrayListD = gjs.d(event, str3);
                    int size2 = arrayListD.size();
                    do {
                        if (i2 >= size2) {
                            obj = null;
                            break;
                        } else {
                            obj = arrayListD.get(i2);
                            i2++;
                        }
                    } while (!((Market) obj).match(str3, str2));
                    Market market2 = (Market) obj;
                    if (market2 != null) {
                        market = market2;
                    }
                } else {
                    Market market3 = (Market) linkedHashMap2.get(event);
                    if (!Intrinsics.g(market3 != null ? market3.id : null, str3)) {
                        market3 = null;
                    }
                    if (market3 == null) {
                        List<Market> list2 = event.markets;
                        list2.getClass();
                        Iterator<T> it2 = list2.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it2.next();
                        } while (!Intrinsics.g(((Market) next3).id, str3));
                        Market market4 = (Market) next3;
                        if (market4 != null) {
                            linkedHashMap2.put(event, market4);
                            market = market4;
                        }
                    } else {
                        market = market3;
                    }
                }
                if (market == null) {
                    market = new Market();
                    market.id = str3;
                    market.product = 1;
                    if (!Intrinsics.g(str2, "~")) {
                        market.specifier = str2;
                    }
                    event.markets.add(market);
                    if (!regularMarketRule.c) {
                        linkedHashMap2.put(event, market);
                    }
                }
                market.update(jSONArray);
                if (i3 < 0) {
                    return;
                }
                d(i3);
            }
        }
    }

    public final void u(SocketEventMessage socketEventMessage, Tournament tournament) {
        mfb0 mfb0Var = this.E;
        if (mfb0Var == null || !socketEventMessage.canLiveBet || tournament == null) {
            return;
        }
        Event event = new Event();
        event.eventSource = (EventSource) this.J.get(socketEventMessage.eventId);
        event.eventId = socketEventMessage.eventId;
        event.tournament = tournament;
        event.sport = p(mfb0Var, tournament);
        event.update(socketEventMessage.jsonObject);
        List arrayList = tournament.events;
        if (arrayList == null) {
            arrayList = new ArrayList();
            tournament.events = arrayList;
            Unit unit = Unit.a;
        }
        arrayList.add(event);
        mvs mvsVar = mvs.TYPE_EVENT;
        int i2 = event.status;
        String str = tournament.id;
        str.getClass();
        LiveEventData liveEventData = new LiveEventData(mvsVar, event, m(i2, str));
        Pair<Integer, Integer> pairR = r(tournament);
        if (pairR == null) {
            return;
        }
        int iIntValue = pairR.a.intValue();
        int iIntValue2 = pairR.b.intValue();
        if (iIntValue < 0) {
            return;
        }
        int size = tournament.events.size() + iIntValue;
        ArrayList arrayList2 = this.t;
        arrayList2.add(size, liveEventData);
        int i3 = 0;
        if (iIntValue2 >= 0 && !this.w.contains(tournament.id)) {
            int size2 = tournament.events.size() + iIntValue2;
            this.u.add(size2, liveEventData);
            com.cruxlab.sectionedrecyclerview.lib.d.c cVar = this.b;
            if (cVar != null) {
                int i4 = this.a;
                com.cruxlab.sectionedrecyclerview.lib.d dVar = com.cruxlab.sectionedrecyclerview.lib.d.this;
                dVar.f(i4, false);
                dVar.h(i4, size2, true);
                dVar.g(i4, 1);
                dVar.n(i4, 1, false);
                dVar.h.notifyItemInserted(dVar.i(i4, size2));
                com.cruxlab.sectionedrecyclerview.lib.d.C0186d c0186d = dVar.g;
                if (c0186d != null) {
                    c0186d.a();
                }
            }
        }
        jts jtsVar = this.z;
        if (jtsVar != null) {
            ArrayList arrayList3 = new ArrayList();
            int size3 = arrayList2.size();
            while (i3 < size3) {
                Object obj = arrayList2.get(i3);
                i3++;
                if (obj instanceof LiveEventData) {
                    arrayList3.add(obj);
                }
            }
            jtsVar.f(arrayList3.size(), event);
        }
    }

    public final void v() {
        if (this.d) {
            h();
        } else {
            k(true);
        }
    }

    public final void w() {
        this.u.clear();
        this.t.clear();
        this.x.clear();
        this.H = false;
    }

    public final void x(String str) {
        str.getClass();
        LiveHeaderData liveHeaderDataDecodeSortingData = LiveHeaderData.INSTANCE.decodeSortingData(str);
        this.s = LiveHeaderData.copy$default(this.s, false, false, liveHeaderDataDecodeSortingData.getSortType(), liveHeaderDataDecodeSortingData.getSortDirection(), liveHeaderDataDecodeSortingData.getSelectedStreamTypes(), 0, 0, 99, null);
    }

    public final void y() {
        w();
        this.s = LiveHeaderData.copy$default(this.s, false, true, null, null, null, 0, 0, 125, null);
        v();
        this.u.add(LiveLoadingData.copy$default((LiveLoadingData) this.r.getValue(), null, szs.c, 1, null));
        c();
    }

    public final void z() {
        w();
        this.u.add(LiveLoadingData.copy$default((LiveLoadingData) this.r.getValue(), null, szs.b, 1, null));
        c();
    }
}
