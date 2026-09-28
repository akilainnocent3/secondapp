package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.patron.FavoriteTournament;
import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.LiveEventChange;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.SocketMarketMessage;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public final class djs extends xfh0<hjs> {
    public final ArrayList A;
    public RegularMarketRule B;
    public boolean C;
    public boolean D;
    public List<FavoriteTournament> E;
    public eru F;
    public final d G;
    public final a8z H;
    public final muh I;
    public final Context J;
    public final ArrayList c;
    public final ArrayList d;
    public final k650 e;
    public final v5k f;
    public final Set<String> i;
    public mfb0 v;
    public HashMap w;
    public RelativeLayout y;
    public boolean z;

    /* JADX INFO: loaded from: classes7.dex */
    public class a {
        public a() {
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public class b {
        public b() {
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public class c implements fpy {
        public final /* synthetic */ RegularMarketRule a;

        public c(RegularMarketRule regularMarketRule) {
            this.a = regularMarketRule;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            final RegularMarketRule regularMarketRule = this.a;
            String str = regularMarketRule.a;
            Function1<? super String, Unit> function1 = new Function1() { // from class: ejs
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    djs djsVar = djs.this;
                    ArrayList arrayList = djsVar.c;
                    djsVar.l(regularMarketRule.a, (String) obj, arrayList);
                    djsVar.notifyDataSetChanged();
                    return null;
                }
            };
            str.getClass();
            djs.this.b.h(i, str, function1);
        }
    }

    public djs(Context context, String str, d dVar, String str2, k650 k650Var, a8z a8zVar, muh muhVar, v5k v5kVar) {
        super(context, str2);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.i = Collections.newSetFromMap(new ConcurrentHashMap());
        this.A = new ArrayList();
        this.C = false;
        this.D = false;
        this.J = context;
        this.v = lfb0.d().e(str);
        this.G = dVar;
        this.e = k650Var;
        this.f = v5kVar;
        this.H = a8zVar;
        this.I = muhVar;
    }

    public static int o(ArrayList arrayList, ArrayList arrayList2) {
        int size;
        int i = 0;
        if (arrayList == null || arrayList.size() <= 0) {
            size = -1;
        } else {
            int size2 = arrayList.size();
            size = 0;
            int i2 = 0;
            while (i2 < size2) {
                Object obj = arrayList.get(i2);
                i2++;
                List<Event> list = ((Tournament) obj).events;
                size += list == null ? 0 : list.size();
            }
        }
        if (size != -1) {
            return size;
        }
        if (arrayList2 != null) {
            int size3 = arrayList2.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                if (obj2 instanceof Event) {
                    i++;
                }
            }
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        Object obj = this.c.get(i);
        if (obj instanceof Tournament) {
            return 0;
        }
        return obj instanceof Event ? 1 : 2;
    }

    public final void m(RegularMarketRule regularMarketRule) {
        RelativeLayout relativeLayout = this.y;
        if (relativeLayout == null) {
            return;
        }
        TextView[] textViewArr = {(TextView) relativeLayout.findViewById(R.id.title1), (TextView) this.y.findViewById(R.id.title2), (TextView) this.y.findViewById(R.id.title3), (TextView) this.y.findViewById(R.id.title4)};
        Spinner spinner = (Spinner) this.y.findViewById(R.id.specifier_spinner);
        if (regularMarketRule.c) {
            spinner.setVisibility(0);
            spinner.setOnItemSelectedListener(null);
            eru eruVar = this.F;
            vfh0 vfh0Var = this.b;
            if (eruVar == null) {
                eru eruVar2 = new eru(spinner, vfh0Var.g(), true);
                this.F = eruVar2;
                spinner.setAdapter((SpinnerAdapter) eruVar2);
            } else {
                eruVar.clear();
                this.F.addAll(vfh0Var.g());
            }
            String str = regularMarketRule.a;
            str.getClass();
            spinner.setSelection(vfh0Var.f(str));
            spinner.setOnItemSelectedListener(new c(regularMarketRule));
        } else {
            spinner.setVisibility(8);
        }
        String[] strArr = regularMarketRule.d;
        int i = 0;
        while (i < strArr.length) {
            textViewArr[i].setText(strArr[i]);
            textViewArr[i].setVisibility(0);
            i++;
        }
        while (i < 4) {
            textViewArr[i].setVisibility(8);
            i++;
        }
    }

    public final Sport n(mfb0 mfb0Var, Tournament tournament) {
        Category category = new Category();
        category.id = tournament.categoryId;
        category.name = tournament.categoryName;
        category.tournament = tournament;
        Sport sport = new Sport();
        sport.id = mfb0Var.getId();
        sport.name = mfb0Var.c().g(this.J);
        sport.category = category;
        return sport;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onViewRecycled(RecyclerView.d0 d0Var) {
        hjs hjsVar = (hjs) d0Var;
        super.onViewRecycled(hjsVar);
        hjsVar.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(SocketMarketMessage socketMarketMessage, RegularMarketRule regularMarketRule) {
        mfb0 mfb0Var = this.v;
        RegularMarketRule regularMarketRule2 = this.B;
        if (mfb0Var == null || regularMarketRule2 == null || socketMarketMessage == null || !socketMarketMessage.isLive || !socketMarketMessage.isSameSport(mfb0Var.getId())) {
            return;
        }
        Object[] objArr = regularMarketRule != null && regularMarketRule.a.equals(socketMarketMessage.marketId);
        boolean zEquals = TextUtils.equals(regularMarketRule2.a, socketMarketMessage.marketId);
        if (objArr == true || zEquals) {
            if (objArr == false) {
                regularMarketRule = regularMarketRule2;
            }
            String str = socketMarketMessage.marketSpecifier;
            String str2 = (str == null || str.equals("~")) ? null : socketMarketMessage.marketSpecifier;
            synchronized (this.c) {
                try {
                    if (this.D) {
                        int size = 0;
                        while (size < this.c.size()) {
                            Object obj = this.c.get(size);
                            if (obj instanceof Tournament) {
                                Tournament tournament = (Tournament) obj;
                                if (TextUtils.equals(tournament.id, socketMarketMessage.tournamentId)) {
                                    for (int i = 0; i < tournament.events.size(); i++) {
                                        Event event = tournament.events.get(i);
                                        if (TextUtils.equals(event.eventId, socketMarketMessage.eventId)) {
                                            t(socketMarketMessage.jsonArray, event, regularMarketRule, str2, true);
                                            if (!this.i.contains(tournament.id)) {
                                                notifyItemChanged(i + 1 + size);
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    return;
                                }
                                if (!this.i.contains(tournament.id)) {
                                    size += tournament.events.size();
                                }
                            }
                            size++;
                        }
                    } else {
                        int i2 = 0;
                        while (i2 < this.c.size()) {
                            Event event2 = (Event) this.c.get(i2);
                            if (TextUtils.equals(event2.eventId, socketMarketMessage.eventId)) {
                                t(socketMarketMessage.jsonArray, event2, regularMarketRule, str2, regularMarketRule.c || str2 != null);
                                if (objArr == false || !gjs.a(event2.getMarket(this.B.a, str2))) {
                                    notifyItemChanged(i2);
                                }
                                return;
                            }
                            i2++;
                        }
                    }
                    itf0.a aVar = itf0.a;
                    aVar.q(MyLog.TAG_LIVE_EVENT_ADAPTER);
                    aVar.a("no event was found, eventId: %s", socketMarketMessage.eventId);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(hjs hjsVar, int i) {
        hjsVar.d(true);
        try {
            if (!(hjsVar instanceof s3p)) {
                hjsVar.a(i);
                return;
            }
            mfb0 mfb0Var = this.v;
            RegularMarketRule regularMarketRule = this.B;
            if (mfb0Var != null && regularMarketRule != null) {
                hjsVar.b(i, mfb0Var, regularMarketRule);
                return;
            }
            hjsVar.d(false);
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_LIVE_EVENT_ADAPTER);
            aVar.p(e, "Failed to bind ViewHolder", new Object[0]);
            hjsVar.d(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final hjs onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            s3p s3pVar = new s3p(layoutInflaterFrom.inflate(R.layout.spr_live_item, viewGroup, false), this.e, this.f);
            s3pVar.a = new b();
            return s3pVar;
        }
        if (i == 2) {
            return new r8e0(layoutInflaterFrom.inflate(R.layout.spr_live_stream_header_item, viewGroup, false));
        }
        if (i != 3) {
            j380 j380Var = new j380(layoutInflaterFrom.inflate(R.layout.spr_live_section_header, viewGroup, false));
            j380Var.a = new a();
            return j380Var;
        }
        View viewInflate = layoutInflaterFrom.inflate(R.layout.spr_event_remain_space_for_quickbetview, viewGroup, false);
        v250 v250Var = new v250(viewInflate);
        return v250Var;
    }

    public final void s(ArrayList arrayList, RegularMarketRule regularMarketRule) {
        synchronized (this.c) {
            try {
                this.B = regularMarketRule;
                this.d.clear();
                this.d.addAll(arrayList);
                this.c.clear();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Tournament tournament = (Tournament) obj;
                    this.c.add(tournament);
                    if (tournament.events == null) {
                        tournament.events = new ArrayList();
                    }
                    if (!this.i.contains(tournament.id)) {
                        this.c.addAll(tournament.events);
                    }
                }
                ArrayList arrayList2 = this.c;
                arrayList2.getClass();
                this.b.b(regularMarketRule, arrayList2, true);
                m(regularMarketRule);
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_LIVE_EVENT_ADAPTER);
                aVar.a("setLivePageData: %s", this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void t(JSONArray jSONArray, Event event, RegularMarketRule regularMarketRule, String str, boolean z) {
        if (event.markets == null) {
            event.markets = new ArrayList();
        }
        String str2 = regularMarketRule.a;
        Market market = event.getMarket(str2, str);
        if (regularMarketRule.c) {
            ArrayList arrayListD = gjs.d(event, str2);
            int size = arrayListD.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListD.get(i);
                i++;
                Market market2 = (Market) obj;
                if (market2.match(str2, str)) {
                    market = market2;
                    break;
                }
            }
        }
        if (market == null && z) {
            market = new Market();
            market.id = str2;
            market.product = 1;
            market.specifier = str;
            event.markets.add(market);
        }
        if (market != null) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_LIVE_EVENT_ADAPTER);
            aVar.a("update event %s's market %s, status: %s, odds: %s", event.eventId, market.toString(), jSONArray.optString(2), jSONArray.optJSONArray(8));
            market.update(jSONArray);
            return;
        }
        itf0.a aVar2 = itf0.a;
        aVar2.q(MyLog.TAG_LIVE_EVENT_ADAPTER);
        aVar2.a(jbkEboCkTqmGf.JDqxpOICpEd, event.eventId, jSONArray);
    }

    /* JADX INFO: loaded from: classes6.dex */
    public interface d {
        void a(Event event);

        void d(Selection selection, boolean z);

        void e();

        boolean g();

        default void f(String str, String str2) {
        }

        default void c(Event event) {
        }

        default void h(LiveEventChange liveEventChange) {
        }

        default void i(hqc hqcVar) {
        }
    }
}
