package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.patron.FavoriteOddsRange;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.QuickMarketHelper;
import com.sportybet.plugin.realsports.data.QuickMarketMappingData;
import com.sportybet.plugin.realsports.data.QuickMarketSpotEnum;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class lww extends xfh0<i> implements k0e0.a {
    public final z7h A;
    public su5<BaseResponse<List<Tournament>>> B;
    public final HashSet<su5<BaseResponse<List<Tournament>>>> C;
    public boolean D;
    public sh20 E;
    public of20 F;
    public final uqm G;
    public final g8z H;
    public final a8z I;
    public final muh J;
    public final hkf K;
    public final xhh0 L;
    public final ity M;
    public final Activity c;
    public final ivw d;
    public mfb0 e;
    public QuickMarketSpotEnum f;
    public String i;
    public String v;
    public List<jpc> w;
    public final ArrayList y;
    public long z;

    /* JADX INFO: loaded from: classes7.dex */
    public class c extends i implements View.OnClickListener {
        public final View A;
        public final View B;
        public final Spinner C;
        public final View D;
        public final OutcomeButton[] E;
        public final TextView F;
        public final ImageView G;
        public final ImageView H;
        public final ImageView I;
        public final ImageView J;
        public final ImageView K;
        public u8z L;
        public final lty M;
        public final TextView a;
        public final LinkedList<OutcomeButton> b;
        public final TextView c;
        public final TextView d;
        public final TextView e;
        public final TextView f;
        public final TextView i;
        public final ImageView v;
        public final ImageView w;
        public final ImageView y;
        public final TextView z;

        public class a implements u8z.a {
            public a() {
            }

            @Override // u8z.a
            public final boolean a(Outcome outcome) {
                return false;
            }

            @Override // u8z.a
            public final void b(OutcomeButton outcomeButton) {
                c.this.onClick(outcomeButton);
            }
        }

        public class b implements fpy {
            public final /* synthetic */ List a;
            public final /* synthetic */ ing b;

            public b(List list, ing ingVar) {
                this.a = list;
                this.b = ingVar;
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                c cVar = c.this;
                lww lwwVar = lww.this;
                if (i >= 0) {
                    List list = this.a;
                    if (i < list.size()) {
                        String str = lwwVar.v;
                        String str2 = (String) list.get(i);
                        ing ingVar = this.b;
                        ingVar.d(str, str2);
                        String str3 = ingVar.a.eventId;
                        String str4 = lwwVar.v;
                        String str5 = (String) list.get(i);
                        for (jpc jpcVar : lwwVar.w) {
                            if (jpcVar instanceof ing) {
                                ing ingVar2 = (ing) jpcVar;
                                if (TextUtils.equals(str3, ingVar2.a.eventId)) {
                                    ingVar2.d(str4, str5);
                                    break;
                                }
                            }
                        }
                        lwwVar.notifyItemChanged(cVar.getAdapterPosition());
                    }
                }
            }
        }

        public c(View view) {
            super(view);
            this.b = new LinkedList<>();
            this.B = view.findViewById(R.id.sport_divider_line);
            this.E = new OutcomeButton[]{(OutcomeButton) view.findViewById(R.id.o1), (OutcomeButton) view.findViewById(R.id.o2), (OutcomeButton) view.findViewById(R.id.o3), (OutcomeButton) view.findViewById(R.id.o4)};
            this.C = (Spinner) view.findViewById(R.id.sports_spinner);
            this.D = view.findViewById(R.id.sports_spinner_bg);
            this.d = (TextView) view.findViewById(R.id.id);
            this.c = (TextView) view.findViewById(R.id.time);
            this.a = (TextView) view.findViewById(R.id.category_tournament_name);
            this.e = (TextView) view.findViewById(R.id.home_team);
            this.f = (TextView) view.findViewById(R.id.away_team);
            TextView textView = (TextView) view.findViewById(R.id.market_count);
            this.i = textView;
            b3.H(textView, R.color.cmn_cool_grey);
            this.v = (ImageView) view.findViewById(R.id.sporty_tv);
            this.w = (ImageView) view.findViewById(R.id.sporty_fm);
            ImageView imageView = (ImageView) view.findViewById(R.id.sporty_gift);
            this.y = imageView;
            imageView.setOnClickListener(this);
            this.z = (TextView) view.findViewById(R.id.sports_view_all_text);
            View viewFindViewById = view.findViewById(R.id.left_content);
            this.A = viewFindViewById;
            viewFindViewById.setOnClickListener(this);
            this.F = (TextView) view.findViewById(R.id.comments_count);
            ImageView imageView2 = (ImageView) view.findViewById(R.id.odds_boost_img);
            this.G = imageView2;
            imageView2.setImageDrawable(gug0.b(view.getContext()));
            ImageView imageView3 = (ImageView) view.findViewById(R.id.simulate_img);
            this.I = imageView3;
            imageView3.setImageDrawable(gug0.e(view.getContext()));
            ImageView imageView4 = (ImageView) view.findViewById(R.id.top_team_img);
            this.H = imageView4;
            imageView4.setImageDrawable(gug0.f(view.getContext()));
            ImageView imageView5 = (ImageView) view.findViewById(R.id.virtual_img);
            this.J = imageView5;
            imageView5.setImageDrawable(gug0.g(view.getContext()));
            this.K = (ImageView) view.findViewById(R.id.stats_img);
            this.M = lww.this.M.b(y8i0.a(view.findViewById(R.id.one_up_promo_tag)));
        }

        /* JADX WARN: Code duplicated, block: B:17:0x005a  */
        @Override // lww.i
        public final void a(int i) {
            ing ingVar;
            RegularMarketRule regularMarketRule;
            Outcome outcome;
            Event event;
            String strB;
            List<ing> list;
            lty ltyVar = this.M;
            ltyVar.a();
            lww lwwVar = lww.this;
            Activity activity = lwwVar.c;
            ArrayList arrayList = lwwVar.y;
            if (!(arrayList.get(i) instanceof ing) || (ingVar = (ing) arrayList.get(i)) == null || (regularMarketRule = QuickMarketMappingData.getInstance().get(lwwVar.f, lwwVar.i, lwwVar.v)) == null) {
                return;
            }
            final Event event2 = ingVar.a;
            ity ityVar = lwwVar.M;
            String str = event2.eventId;
            Iterator<jpc> it = lwwVar.w.iterator();
            loop0: while (true) {
                outcome = null;
                if (!it.hasNext()) {
                    event = null;
                    break;
                }
                jpc next = it.next();
                if (next instanceof ing) {
                    ing ingVar2 = (ing) next;
                    if (TextUtils.equals(str, ingVar2.a.eventId)) {
                        event = ingVar2.a;
                        break;
                    }
                    if (!(next instanceof c6g0) && (list = ((c6g0) next).f) != null) {
                        for (ing ingVar3 : list) {
                            if (TextUtils.equals(str, ingVar3.a.eventId)) {
                                event = ingVar3.a;
                                break loop0;
                            }
                        }
                    }
                } else if (!(next instanceof c6g0)) {
                }
            }
            ityVar.getClass();
            ityVar.a(ltyVar, event, regularMarketRule, null);
            int i2 = 0;
            this.B.setVisibility(ingVar.c ? 8 : 0);
            this.I.setVisibility(nkd0.a.a.a(event2) ? 0 : 8);
            this.H.setVisibility(event2.topTeam ? 0 : 8);
            this.G.setVisibility(event2.oddsBoost ? 0 : 8);
            this.J.setVisibility(b3.S(event2.eventId) ? 0 : 8);
            int i3 = event2.showStats() ? 0 : 8;
            ImageView imageView = this.K;
            imageView.setVisibility(i3);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: mww
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    lww.this.d.a(event2);
                }
            });
            this.c.setText(bwf0.a.s(event2.estimateStartTime, false));
            this.d.setText(b3.P(event2));
            int i4 = event2.commentsNum;
            TextView textView = this.F;
            if (i4 > 0) {
                textView.setVisibility(0);
                StringBuilder sb = new StringBuilder("Comments ");
                sb.append(i4 > 999 ? "999+" : Integer.valueOf(i4));
                textView.setText(sb.toString());
            } else {
                textView.setVisibility(8);
            }
            boolean z = ingVar.v;
            TextView textView2 = this.a;
            if (z) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(activity.getString(R.string.app_common__var_to_var, ingVar.f, ingVar.a.sport.category.tournament.name));
            }
            this.e.setText(event2.homeTeamName);
            this.f.setText(event2.awayTeamName);
            this.i.setText(b3.M(event2));
            this.v.setVisibility(event2.hasLiveStream() ? 0 : 8);
            this.w.setVisibility(event2.hasAudioStream() ? 0 : 8);
            int i5 = event2.hasGift() ? 0 : 8;
            ImageView imageView2 = this.y;
            imageView2.setVisibility(i5);
            if (imageView2.getVisibility() == 0) {
                LinkedHashSet linkedHashSet = mlk.a;
                if (mlk.b(event2.eventId)) {
                    f00 f00Var = vgb0.a;
                    vgb0.a(AnalyticsEvent.GIFT_GRAB_ICON_SHOWN);
                }
            }
            this.z.setVisibility(ingVar.d ? 0 : 8);
            OutcomeButton[] outcomeButtonArr = this.E;
            for (OutcomeButton outcomeButton : outcomeButtonArr) {
                outcomeButton.setVisibility(8);
            }
            if (regularMarketRule.c) {
                String str2 = regularMarketRule.a;
                str2.getClass();
                String strE = lwwVar.b.e(str2);
                BigDecimal bigDecimal = BigDecimal.ZERO;
                strB = ingVar.b(str2, strE, bigDecimal, bigDecimal);
            } else {
                strB = null;
            }
            Market market = ingVar.a.getMarket(lwwVar.v, strB);
            if (market != null && !market.outcomes.isEmpty()) {
                outcome = market.outcomes.get(0);
            }
            this.A.setTag(new Selection(event2, market, outcome));
            boolean z2 = regularMarketRule.c;
            Spinner spinner = this.C;
            if (!z2) {
                spinner.setVisibility(8);
                for (int length = regularMarketRule.d.length; length < outcomeButtonArr.length; length++) {
                    outcomeButtonArr[length].setVisibility(8);
                }
                if (market != null) {
                    while (i2 < market.outcomes.size()) {
                        c(outcomeButtonArr[i2], market, market.outcomes.get(i2), event2);
                        i2++;
                    }
                    while (i2 < outcomeButtonArr.length) {
                        outcomeButtonArr[i2].setVisibility(8);
                        i2++;
                    }
                    return;
                }
                for (int i6 = 0; i6 < regularMarketRule.d.length; i6++) {
                    OutcomeButton outcomeButton2 = outcomeButtonArr[i6];
                    outcomeButton2.setVisibility(0);
                    outcomeButton2.setTextOnAndOff(zch0.h(activity));
                    outcomeButton2.setChecked(false);
                    outcomeButton2.setEnabled(false);
                }
                return;
            }
            spinner.setVisibility(0);
            outcomeButtonArr[0].setVisibility(8);
            List<Market> marketList = ingVar.a.getMarketList(lwwVar.v);
            List<String> specifierList = ingVar.a.getSpecifierList(marketList);
            u8z u8zVar = this.L;
            if (u8zVar == null) {
                u8z u8zVar2 = new u8z(spinner, this.D, tru.i(specifierList), false);
                this.L = u8zVar2;
                u8zVar2.f(event2, marketList);
                spinner.setAdapter((SpinnerAdapter) this.L);
            } else {
                u8zVar.f(event2, marketList);
                this.L.clear();
                this.L.addAll(tru.i(specifierList));
            }
            u8z u8zVar3 = this.L;
            a aVar = new a();
            u8zVar3.getClass();
            u8zVar3.f = aVar;
            if (strB != null) {
                spinner.setSelection(Math.max(specifierList.indexOf(strB), 0), false);
            } else {
                spinner.setSelection(0, false);
            }
            spinner.setOnItemSelectedListener(new b(specifierList, ingVar));
            int i7 = 1;
            for (int length2 = regularMarketRule.d.length + 1; length2 < outcomeButtonArr.length; length2++) {
                outcomeButtonArr[length2].setVisibility(8);
            }
            if (market != null && !specifierList.isEmpty()) {
                while (i7 <= market.outcomes.size()) {
                    c(outcomeButtonArr[i7], market, market.outcomes.get(i7 - 1), event2);
                    i7++;
                }
                while (i7 < outcomeButtonArr.length) {
                    outcomeButtonArr[i7].setVisibility(8);
                    i7++;
                }
                return;
            }
            spinner.setVisibility(8);
            for (int i8 = 0; i8 <= regularMarketRule.d.length; i8++) {
                OutcomeButton outcomeButton3 = outcomeButtonArr[i8];
                outcomeButton3.setVisibility(0);
                outcomeButton3.setTextOnAndOff(zch0.h(activity));
                outcomeButton3.setEnabled(false);
                outcomeButton3.setChecked(false);
            }
        }

        @Override // lww.i
        public final void b() {
            this.M.a();
            this.C.setOnItemSelectedListener(null);
            while (true) {
                LinkedList<OutcomeButton> linkedList = this.b;
                if (linkedList.isEmpty()) {
                    return;
                }
                linkedList.getFirst().a();
                linkedList.remove();
            }
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0040  */
        /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:38:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
        public final void c(OutcomeButton outcomeButton, Market market, Outcome outcome, Event event) {
            boolean z;
            OutcomeButton outcomeButton2;
            int i;
            LinkedList<OutcomeButton> linkedList;
            lww lwwVar = lww.this;
            Activity activity = lwwVar.c;
            outcomeButton.setVisibility(0);
            outcomeButton.b();
            if (market.status != 0) {
                outcomeButton.setText(zch0.h(activity));
                outcomeButton.setEnabled(false);
                return;
            }
            outcomeButton.setEnabled(outcome.isActive == 1);
            if (outcome.isActive == 1) {
                outcomeButton.setOdds(outcome.odds);
                BigDecimal bigDecimal = new BigDecimal(outcome.odds);
                FavoriteOddsRange favoriteOddsRangeH = izw.a.a().h();
                if (favoriteOddsRangeH == null) {
                    z = false;
                } else {
                    try {
                        BigDecimal bigDecimal2 = new BigDecimal(favoriteOddsRangeH.max);
                        BigDecimal bigDecimal3 = BigDecimal.ZERO;
                        if (!(bigDecimal2.compareTo(bigDecimal3) == 0 && new BigDecimal(favoriteOddsRangeH.min).compareTo(bigDecimal3) == 0) && bigDecimal.compareTo(new BigDecimal(favoriteOddsRangeH.min)) >= 0 && bigDecimal.compareTo(new BigDecimal(favoriteOddsRangeH.max)) <= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Exception unused) {
                    }
                }
                outcomeButton.setActivated(z);
                a8z a8zVar = lwwVar.I;
                if (a8zVar != null) {
                    z7z z7zVarA = a8zVar.a(event, market, outcome);
                    View view = this.itemView;
                    outcomeButton2 = outcomeButton;
                    kuh.a(outcomeButton2, z7zVarA, outcome.odds, view instanceof ViewGroup ? (ViewGroup) view : null, ku1.b, true);
                    this.M.a.a(!(z7zVarA instanceof z7z.c));
                    if (z7zVarA instanceof z7z.b) {
                        lwwVar.J.a(apg.b(event, market), brg.LIVE_PANEL);
                    }
                }
                i = outcome.flag;
                linkedList = this.b;
                if (i == 1) {
                    outcomeButton2.g();
                    linkedList.add(outcomeButton2);
                    outcome.flag = 0;
                } else if (i == 2) {
                    outcomeButton2.c();
                    linkedList.add(outcomeButton2);
                    outcome.flag = 0;
                }
                outcomeButton2.setTag(new Selection(event, market, outcome));
                outcomeButton2.setChecked(iu2.n(event, market, outcome));
                outcomeButton2.setOnClickListener(this);
            }
            outcomeButton.setTextOnAndOff(zch0.h(activity));
            outcomeButton2 = outcomeButton;
            i = outcome.flag;
            linkedList = this.b;
            if (i == 1) {
                outcomeButton2.g();
                linkedList.add(outcomeButton2);
                outcome.flag = 0;
            } else if (i == 2) {
                outcomeButton2.c();
                linkedList.add(outcomeButton2);
                outcome.flag = 0;
            }
            outcomeButton2.setTag(new Selection(event, market, outcome));
            outcomeButton2.setChecked(iu2.n(event, market, outcome));
            outcomeButton2.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            lww lwwVar = lww.this;
            Activity activity = lwwVar.c;
            if (view instanceof OutcomeButton) {
                OutcomeButton outcomeButton = (OutcomeButton) view;
                Selection selection = (Selection) view.getTag();
                boolean zIsChecked = outcomeButton.isChecked();
                of20 of20Var = lwwVar.F;
                if (of20Var != null) {
                    if (zIsChecked) {
                        of20Var.z1(selection);
                    } else {
                        of20Var.C.a(selection);
                    }
                }
                if (iu2.s(selection.a, selection.b, selection.c, zIsChecked)) {
                    lwwVar.H.a(selection, zIsChecked, e8z.i);
                } else {
                    outcomeButton.setChecked(false);
                    if (kni0.m()) {
                        iu2.r(activity);
                    } else {
                        if (iu2.l()) {
                            qz3.p(activity);
                        }
                        if (iu2.f(selection) || iu2.g(selection.a)) {
                            qz3.m(activity);
                        }
                    }
                }
                if (iu2.p() && outcomeButton.isChecked() && !iu2.o(selection)) {
                    iu2.e(view.getContext(), selection);
                }
            }
            if (view.getId() == R.id.left_content) {
                Selection selection2 = (Selection) view.getTag();
                Event event = selection2.a;
                Intent intent = new Intent(activity, (Class<?>) PreMatchEventActivity.class);
                intent.putExtra("EXTRA_EVENT", apg.f(event));
                intent.putExtra("EXTRA_EVENT_LABEL", nkd0.a.a.a(event) ? 1 : 0);
                yrh0.s(activity, intent, true);
                of20 of20Var2 = lwwVar.F;
                if (of20Var2 == null || selection2.b == null || selection2.c == null) {
                    return;
                }
                of20Var2.z1(selection2);
                return;
            }
            if (view.getId() == R.id.sporty_gift) {
                Event event2 = ((Selection) this.A.getTag()).a;
                if (activity == null || !(activity instanceof androidx.fragment.app.e)) {
                    return;
                }
                FragmentManager supportFragmentManager = ((androidx.fragment.app.e) activity).getSupportFragmentManager();
                supportFragmentManager.getClass();
                ilk ilkVar = new ilk();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.e(0, ilkVar, "GiftGrabPromotionDialogFragment", 1);
                aVar.c("GiftGrabPromotionDialogFragment");
                aVar.d();
                LinkedHashSet linkedHashSet = mlk.a;
                if (mlk.a(event2.eventId)) {
                    f00 f00Var = vgb0.a;
                    vgb0.a(AnalyticsEvent.GIFT_GRAB_ICON_CLICK);
                }
            }
        }
    }

    public static abstract class i extends RecyclerView.d0 {
        public abstract void a(int i);

        public abstract void b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lww(Activity activity, uqm uqmVar, ArrayList arrayList, mfb0 mfb0Var, QuickMarketSpotEnum quickMarketSpotEnum, String str, long j, vg20 vg20Var, a8z a8zVar, muh muhVar, hkf hkfVar, xhh0 xhh0Var, ity ityVar) {
        super(activity, "favorites");
        this.y = new ArrayList();
        this.A = ap0.b();
        this.C = new HashSet<>();
        this.D = false;
        if (activity instanceof ivw) {
            this.d = (ivw) activity;
        }
        this.c = activity;
        this.G = uqmVar;
        this.e = mfb0Var;
        this.w = arrayList;
        this.z = j;
        this.i = mfb0Var.getId();
        this.f = quickMarketSpotEnum;
        this.H = vg20Var;
        this.I = a8zVar;
        this.J = muhVar;
        this.K = hkfVar;
        this.L = xhh0Var;
        this.M = ityVar;
        if (TextUtils.isEmpty(str)) {
            this.v = this.e.v().get(0).a;
        } else {
            this.v = str;
        }
        o();
    }

    @Override // k0e0.a
    public final boolean d(int i2) {
        return getItemViewType(i2) == 8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.y.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i2) {
        if (i2 < 0) {
            return 7;
        }
        ArrayList arrayList = this.y;
        if (i2 < arrayList.size()) {
            return ((jpc) arrayList.get(i2)).a();
        }
        return 7;
    }

    public final void m(boolean z) {
        this.D = z;
        if (z) {
            HashSet<su5<BaseResponse<List<Tournament>>>> hashSet = this.C;
            if (hashSet.size() > 0) {
                Iterator<su5<BaseResponse<List<Tournament>>>> it = hashSet.iterator();
                while (it.hasNext()) {
                    it.next().cancel();
                }
            }
        }
    }

    public final String n() {
        List<RegularMarketRule> fromStorage = QuickMarketHelper.getFromStorage(this.f, this.i);
        if (fromStorage.isEmpty()) {
            return this.v;
        }
        StringBuilder sb = new StringBuilder();
        int size = fromStorage.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                sb.append(",");
            }
            sb.append(fromStorage.get(i2).a);
        }
        if (this.i.equals("sr:sport:1")) {
            whh0 whh0VarD = this.L.d(this.i, this.v, false);
            if (whh0VarD != null && whh0VarD.b != null) {
                sb.append(",");
                sb.append(this.v);
            }
            if (yay.g(this.v)) {
                sb.append(",");
                sb.append(this.v);
            }
        }
        return sb.toString();
    }

    public final void o() {
        ArrayList arrayList = this.y;
        arrayList.clear();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (jpc jpcVar : this.w) {
            if (jpcVar instanceof ing) {
                ing ingVar = (ing) jpcVar;
                String str = ingVar.a.eventId;
                if (linkedHashMap.get(str) == null && (linkedHashMap2.get(ingVar.b) == null || ((Boolean) linkedHashMap2.get(ingVar.b)).booleanValue())) {
                    if (this.K.b(this.i, this.v, Collections.singletonList(ingVar), false, true).contains(ingVar)) {
                        linkedHashMap.put(str, ingVar);
                        if (TextUtils.isEmpty(this.v)) {
                            arrayList.add(jpcVar);
                        } else {
                            ing ingVar2 = new ing(ingVar);
                            Event event = new Event(ingVar.a);
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            for (Market market : event.markets) {
                                if (TextUtils.equals(this.v, market.id) && market.status == 0) {
                                    Iterator<Outcome> it = market.outcomes.iterator();
                                    while (it.hasNext()) {
                                        if (it.next().isActive == 1) {
                                            linkedHashSet.add(market);
                                        }
                                    }
                                }
                            }
                            if (linkedHashSet.isEmpty()) {
                                arrayList.add(jpcVar);
                            } else {
                                event.markets = new ArrayList(linkedHashSet);
                                ingVar2.a = event;
                                ingVar2.v = false;
                                Category category = event.sport.category;
                                if (category != null) {
                                    ingVar2.i = category.tournament.name;
                                    ingVar2.f = category.name;
                                }
                                arrayList.add(ingVar2);
                            }
                        }
                    }
                }
            } else if (jpcVar instanceof c6g0) {
                c6g0 c6g0Var = (c6g0) jpcVar;
                arrayList.add(c6g0Var);
                if (c6g0Var.d && c6g0Var.e) {
                    linkedHashMap2.put(c6g0Var.c, Boolean.TRUE);
                    List<ing> list = c6g0Var.f;
                    if (list.isEmpty()) {
                        c6g0Var.w = true;
                    } else {
                        for (ing ingVar3 : list) {
                            String str2 = ingVar3.a.eventId;
                            if (linkedHashMap.get(str2) == null) {
                                linkedHashMap.put(str2, ingVar3);
                                arrayList.add(ingVar3);
                            }
                        }
                    }
                } else {
                    linkedHashMap2.put(c6g0Var.c, Boolean.FALSE);
                }
            } else {
                arrayList.add(jpcVar);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        ivw ivwVar = this.d;
        if (zIsEmpty || (arrayList.size() == 1 && (arrayList.get(0) instanceof eg20))) {
            ivwVar.t(true);
        } else {
            ivwVar.t(false);
        }
        long j = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            jpc jpcVar2 = (jpc) arrayList.get(i2);
            if (jpcVar2 instanceof ing) {
                ing ingVar4 = (ing) jpcVar2;
                boolean zA = vjt.a(j, ingVar4.a.estimateStartTime);
                boolean z = !zA;
                if (!zA) {
                    arrayList.add(i2, new rru(ingVar4.a.estimateStartTime));
                }
                ingVar4.c = z;
                j = ingVar4.a.estimateStartTime;
            } else if (jpcVar2 instanceof c6g0) {
                j = 0;
            }
        }
        RegularMarketRule regularMarketRule = QuickMarketMappingData.getInstance().get(this.f, this.i, this.v);
        List<jpc> list2 = this.w;
        list2.getClass();
        this.b.b(regularMarketRule, list2, false);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i2) {
        ((i) d0Var).a(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i2) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        switch (i2) {
            case 0:
                return new d(layoutInflaterFrom.inflate(R.layout.spr_best_odds_event_market_item, viewGroup, false));
            case 1:
                return new h(layoutInflaterFrom.inflate(R.layout.spr_sports_event_common_title_bar, viewGroup, false));
            case 2:
                return new c(layoutInflaterFrom.inflate(R.layout.spr_sport_event_item_with_filter, viewGroup, false));
            case 3:
                return new b(layoutInflaterFrom.inflate(R.layout.spr_sports_event_countries_name, viewGroup, false));
            case 4:
                return new a(layoutInflaterFrom.inflate(R.layout.spr_sports_event_common_title_bar, viewGroup, false));
            case 5:
            default:
                eub.a("SportsEventAdapter viewHolder return null,type:" + i2);
                return null;
            case 6:
                return new f(layoutInflaterFrom.inflate(R.layout.spr_pre_match_load_more_item, viewGroup, false));
            case 7:
                View viewInflate = layoutInflaterFrom.inflate(R.layout.spr_event_remain_space_for_quickbetview, viewGroup, false);
                g gVar = new g(viewInflate);
                return gVar;
            case 8:
                return new e(layoutInflaterFrom.inflate(R.layout.spr_sport_event_market_title, viewGroup, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onViewRecycled(RecyclerView.d0 d0Var) {
        i iVar = (i) d0Var;
        super.onViewRecycled(iVar);
        iVar.b();
    }

    public final void p(QuickMarketSpotEnum quickMarketSpotEnum, String str) {
        this.f = quickMarketSpotEnum;
        this.v = str;
        for (jpc jpcVar : this.w) {
            if (jpcVar instanceof c6g0) {
                c6g0 c6g0Var = (c6g0) jpcVar;
                c6g0Var.w = false;
                if (!c6g0Var.d) {
                    c6g0Var.e = false;
                }
            }
        }
        o();
    }

    public class b extends i {
        public final TextView a;

        public b(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.sports_event_countries_text);
        }

        @Override // lww.i
        public final void a(int i) {
            jpc jpcVar = (jpc) lww.this.y.get(i);
            if (jpcVar instanceof c7b) {
                this.a.setText(((c7b) jpcVar).a);
            }
        }

        @Override // lww.i
        public final void b() {
        }
    }

    public class d extends i implements TabLayout.d {
        public final View a;

        public d(View view) {
            super(view);
            ((TabLayout) view.findViewById(R.id.tab_layout)).setTabMode(0);
            this.a = view.findViewById(R.id.divider_line);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void G(TabLayout.g gVar) {
            lww lwwVar = lww.this;
            lwwVar.v = lwwVar.e.v().get(gVar.e).a;
        }

        @Override // lww.i
        public final void a(int i) {
            ArrayList arrayList = lww.this.y;
            if (arrayList.get(i) instanceof tpu) {
                throw null;
            }
        }

        @Override // lww.i
        public final void b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void A0(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void g0(TabLayout.g gVar) {
        }
    }

    public class f extends i {
        public final ProgressBar a;
        public final TextView b;
        public eg20 c;

        public f(View view) {
            super(view);
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.results_loading_progress);
            this.a = progressBar;
            progressBar.getIndeterminateDrawable().setColorFilter(view.getContext().getColor(R.color.text_type2_tertiary), PorterDuff.Mode.SRC_IN);
            TextView textView = (TextView) view.findViewById(R.id.results_load_more);
            this.b = textView;
            textView.setText("");
            textView.setOnClickListener(new View.OnClickListener() { // from class: oww
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    lww.f fVar = this.a;
                    eg20 eg20Var = fVar.c;
                    if (eg20Var == null || !eg20Var.a) {
                        return;
                    }
                    fVar.c();
                }
            });
        }

        @Override // lww.i
        public final void a(int i) {
            ArrayList arrayList = lww.this.y;
            if (arrayList.get(i) instanceof eg20) {
                this.c = (eg20) arrayList.get(i);
                c();
            }
        }

        public final void c() {
            boolean z = this.c.a;
            lww lwwVar = lww.this;
            TextView textView = this.b;
            ProgressBar progressBar = this.a;
            if (z) {
                progressBar.setVisibility(0);
                textView.setVisibility(8);
                String str = lwwVar.i;
                eg20 eg20Var = this.c;
                JSONObject jSONObjectA = mds.a(str, eg20Var.y, eg20Var.f, eg20Var.i, eg20Var.c, eg20Var.d, eg20Var.e);
                itf0.a aVar = itf0.a;
                aVar.q("getMyFavoriteEvents");
                aVar.a(jSONObjectA.toString(), new Object[0]);
                eg20 eg20Var2 = this.c;
                if (eg20Var2.b == null) {
                    eg20Var2.b = lwwVar.A.g(jSONObjectA.toString());
                    this.c.b.G(new pww(this));
                    return;
                }
                return;
            }
            progressBar.setVisibility(8);
            textView.setVisibility(0);
            boolean z2 = this.c.w;
            sh20 sh20Var = lwwVar.E;
            if (!z2) {
                if (sh20Var != null) {
                    int iB = sh20Var.b();
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    if (iB == 0) {
                        layoutParams.height = (int) textView.getContext().getResources().getDimension(R.dimen.no_more_game_text_height);
                        textView.setLayoutParams(layoutParams);
                    } else {
                        layoutParams.height = iB;
                        textView.setLayoutParams(layoutParams);
                    }
                }
                textView.setText("");
                return;
            }
            if (sh20Var != null) {
                int iB2 = sh20Var.b();
                ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                if (iB2 == 0) {
                    layoutParams2.height = (int) textView.getContext().getResources().getDimension(R.dimen.no_more_game_text_height);
                    textView.setLayoutParams(layoutParams2);
                } else {
                    layoutParams2.height = iB2;
                    textView.setLayoutParams(layoutParams2);
                }
                textView.setText(lwwVar.c.getString(R.string.common_feedback__no_more_data));
            }
        }

        @Override // lww.i
        public final void b() {
        }
    }

    public class g extends i {
        @Override // lww.i
        public final void b() {
        }

        @Override // lww.i
        public final void a(int i) {
        }
    }

    public class h extends i implements View.OnClickListener {
        public final View a;
        public final TextView b;
        public final LoadingView c;
        public c6g0 d;
        public final ViewGroup e;
        public final TextView f;
        public final View i;
        public final TextView v;
        public final TextView w;

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                h hVar = h.this;
                hVar.c.K();
                hVar.c();
            }
        }

        public h(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.sports_event_title);
            this.b = textView;
            textView.setOnClickListener(this);
            this.c = (LoadingView) view.findViewById(R.id.sports_event_load_view);
            this.e = (ViewGroup) view.findViewById(R.id.delete_layout);
            TextView textView2 = (TextView) view.findViewById(R.id.no_info_del_text);
            this.f = textView2;
            this.a = view.findViewById(R.id.top_divider_line);
            this.i = view.findViewById(R.id.bottom_divider_line);
            this.v = (TextView) view.findViewById(R.id.sports_event_size);
            this.w = (TextView) view.findViewById(R.id.no_info_tip_text);
            textView2.setVisibility(0);
            textView2.setOnClickListener(this);
            textView2.setTag("del");
        }

        @Override // lww.i
        public final void a(int i) {
            ArrayList arrayList = lww.this.y;
            if (arrayList.get(i) instanceof c6g0) {
                c6g0 c6g0Var = (c6g0) arrayList.get(i);
                this.d = c6g0Var;
                String str = c6g0Var.b;
                TextView textView = this.b;
                textView.setText(str);
                this.v.setText(String.valueOf(this.d.v));
                boolean z = this.d.d;
                textView.setCompoundDrawablesWithIntrinsicBounds(iwh0.a(textView.getContext(), z ? R.drawable.spr_ic_arrow_drop_down_black_24dp : R.drawable.spr_ic_arrow_right_black_24dp, Color.parseColor(z ? "#32ce62" : "#0d9737")), (Drawable) null, (Drawable) null, (Drawable) null);
                this.a.setVisibility(this.d.a ? 8 : 0);
                this.i.setVisibility(8);
                int i2 = this.d.w ? 0 : 8;
                ViewGroup viewGroup = this.e;
                viewGroup.setVisibility(i2);
                a aVar = new a();
                LoadingView loadingView = this.c;
                loadingView.setOnClickListener(aVar);
                c6g0 c6g0Var2 = this.d;
                boolean z2 = c6g0Var2.d;
                int i3 = c6g0Var2.y;
                if (!z2) {
                    loadingView.setVisibility(8);
                } else if (i3 == 1) {
                    loadingView.K();
                } else if (i3 != 3) {
                    loadingView.setVisibility(8);
                } else {
                    loadingView.I();
                }
                if (!this.d.w) {
                    viewGroup.setVisibility(8);
                    return;
                }
                viewGroup.setVisibility(0);
                this.f.setVisibility(0);
                this.w.setText(sn5.b(yrh0.j(), R.string.common_feedback__no_odds_available, new Object[0]));
            }
        }

        public final void c() {
            su5<BaseResponse<List<Tournament>>> su5VarB0;
            c6g0 c6g0Var = this.d;
            qww qwwVar = new qww(this);
            lww lwwVar = lww.this;
            z7h z7hVar = lwwVar.A;
            if (c6g0Var.i || lwwVar.D) {
                return;
            }
            c6g0Var.i = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add(c6g0Var.c);
            long j = lwwVar.z;
            if (j != 3) {
                DecimalFormat decimalFormat = b6y.a;
                boolean z = Double.doubleToLongBits(-1.0d) == Double.doubleToLongBits((double) j);
                long j2 = lwwVar.z;
                su5VarB0 = z7hVar.u(kgb0.e(lwwVar.i, lwwVar.n(), arrayList, j2, j2 != 0 ? 86399999 + j2 : 0L, z).toString());
                lwwVar.B = su5VarB0;
            } else {
                su5VarB0 = z7hVar.b0(kgb0.d(lwwVar.i, lwwVar.n(), arrayList, 3.0d, 3).toString());
                lwwVar.B = su5VarB0;
            }
            lwwVar.C.add(su5VarB0);
            lwwVar.B.G(new kww(lwwVar, c6g0Var, qwwVar));
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int adapterPosition = getAdapterPosition();
            if (adapterPosition == -1) {
                return;
            }
            lww lwwVar = lww.this;
            ArrayList arrayList = lwwVar.y;
            c6g0 c6g0Var = this.d;
            c6g0Var.w = false;
            List<ing> list = c6g0Var.f;
            if (c6g0Var.d) {
                c6g0Var.y = 0;
                if (list.size() > 0) {
                    int size = this.d.f.size();
                    if (this.d.e) {
                        for (int i = 0; i < size; i++) {
                            arrayList.remove(adapterPosition + 1);
                        }
                        this.d.e = false;
                        lwwVar.notifyItemRangeRemoved(adapterPosition + 1, size);
                    }
                }
            } else if (list.size() == 0 || !this.d.e) {
                this.d.y = 1;
                c();
            } else {
                int size2 = list.size();
                c6g0 c6g0Var2 = this.d;
                if (size2 == 0) {
                    c6g0Var2.w = true;
                } else if (!c6g0Var2.e) {
                    int i2 = adapterPosition + 1;
                    arrayList.addAll(i2, c6g0Var2.f);
                    this.d.e = true;
                    lwwVar.notifyItemRangeInserted(i2, size2);
                }
            }
            c6g0 c6g0Var3 = this.d;
            c6g0Var3.d = !c6g0Var3.d;
            lwwVar.notifyItemChanged(adapterPosition);
        }

        @Override // lww.i
        public final void b() {
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public class a extends i implements View.OnClickListener {
        public final TextView a;
        public b7b b;
        public final ViewGroup c;

        public a(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.sports_event_title);
            this.a = textView;
            textView.setOnClickListener(this);
            this.c = (ViewGroup) view.findViewById(R.id.delete_layout);
            TextView textView2 = (TextView) view.findViewById(R.id.no_info_del_text);
            textView2.setOnClickListener(this);
            textView2.setTag("del");
        }

        @Override // lww.i
        public final void a(int i) {
            ArrayList arrayList;
            ArrayList arrayList2 = lww.this.y;
            if (arrayList2.get(i) instanceof b7b) {
                b7b b7bVar = (b7b) arrayList2.get(i);
                this.b = b7bVar;
                String str = b7bVar.a;
                TextView textView = this.a;
                textView.setText(str);
                textView.setCompoundDrawablesWithIntrinsicBounds(iwh0.a(textView.getContext(), this.b.c ? R.drawable.spr_ic_arrow_drop_down_black_24dp : R.drawable.spr_ic_arrow_right_black_24dp, Color.parseColor("#32ce62")), (Drawable) null, (Drawable) null, (Drawable) null);
                b7b b7bVar2 = this.b;
                this.c.setVisibility(b7bVar2.c && (arrayList = b7bVar2.e) != null && arrayList.size() == 0 ? 0 : 8);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            lww lwwVar = lww.this;
            ArrayList arrayList = lwwVar.y;
            int adapterPosition = getAdapterPosition();
            if ((view instanceof TextView) && "del".equals(view.getTag())) {
                arrayList.remove(adapterPosition);
                lwwVar.notifyItemRemoved(adapterPosition);
                return;
            }
            int adapterPosition2 = getAdapterPosition();
            ArrayList arrayList2 = this.b.e;
            if (arrayList2 == null) {
                return;
            }
            int size = arrayList2.size();
            b7b b7bVar = this.b;
            if (!b7bVar.c && !b7bVar.d) {
                int i = adapterPosition2 + 1;
                arrayList.addAll(i, b7bVar.e);
                this.b.d = true;
                lwwVar.notifyItemRangeInserted(i, size);
            } else if (b7bVar.d) {
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.remove(adapterPosition2 + 1);
                }
                this.b.d = false;
                lwwVar.notifyItemRangeRemoved(adapterPosition2 + 1, size);
            }
            b7b b7bVar2 = this.b;
            b7bVar2.c = !b7bVar2.c;
            lwwVar.notifyItemChanged(adapterPosition2);
        }

        @Override // lww.i
        public final void b() {
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public class e extends i {
        public final TextView a;
        public final Spinner b;
        public final TextView[] c;
        public eru d;

        public class a implements fpy {
            public final /* synthetic */ RegularMarketRule a;

            public a(RegularMarketRule regularMarketRule) {
                this.a = regularMarketRule;
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                lww lwwVar = lww.this;
                RegularMarketRule regularMarketRule = this.a;
                String str = regularMarketRule.a;
                nww nwwVar = new nww(0, this, regularMarketRule);
                str.getClass();
                lwwVar.b.h(i, str, nwwVar);
            }
        }

        public e(View view) {
            super(view);
            this.c = new TextView[]{(TextView) view.findViewById(R.id.left_button), (TextView) view.findViewById(R.id.mid_button), (TextView) view.findViewById(R.id.right_button), (TextView) view.findViewById(R.id.fourth_button)};
            this.a = (TextView) view.findViewById(R.id.date_week);
            this.b = (Spinner) view.findViewById(R.id.specifier_spinner);
        }

        @Override // lww.i
        public final void a(int i) {
            lww lwwVar = lww.this;
            vfh0 vfh0Var = lwwVar.b;
            jpc jpcVar = (jpc) lwwVar.y.get(i);
            if (jpcVar instanceof rru) {
                rru rruVar = (rru) jpcVar;
                RegularMarketRule regularMarketRule = QuickMarketMappingData.getInstance().get(lwwVar.f, lwwVar.i, lwwVar.v);
                if (regularMarketRule == null) {
                    return;
                }
                this.a.setText(bwf0.c(rruVar.a, lwwVar.G.getLanguageCode()));
                boolean z = regularMarketRule.c;
                Spinner spinner = this.b;
                TextView[] textViewArr = this.c;
                if (!z) {
                    spinner.setVisibility(8);
                    String[] strArr = regularMarketRule.d;
                    int i2 = 0;
                    for (String str : strArr) {
                        textViewArr[i2].setText(str);
                        textViewArr[i2].setVisibility(0);
                        i2++;
                    }
                    while (i2 < textViewArr.length) {
                        textViewArr[i2].setVisibility(8);
                        i2++;
                    }
                    return;
                }
                spinner.setVisibility(0);
                spinner.setOnItemSelectedListener(null);
                eru eruVar = this.d;
                if (eruVar == null) {
                    eru eruVar2 = new eru(spinner, vfh0Var.g(), false);
                    this.d = eruVar2;
                    spinner.setAdapter((SpinnerAdapter) eruVar2);
                } else {
                    eruVar.clear();
                    this.d.addAll(vfh0Var.g());
                }
                String str2 = regularMarketRule.a;
                str2.getClass();
                spinner.setSelection(vfh0Var.f(str2));
                spinner.setOnItemSelectedListener(new a(regularMarketRule));
                textViewArr[0].setVisibility(8);
                String[] strArr2 = regularMarketRule.d;
                int i3 = 1;
                for (String str3 : strArr2) {
                    textViewArr[i3].setText(str3);
                    textViewArr[i3].setVisibility(0);
                    i3++;
                }
                while (i3 < textViewArr.length) {
                    textViewArr[i3].setVisibility(8);
                    i3++;
                }
            }
        }

        @Override // lww.i
        public final void b() {
        }
    }
}
