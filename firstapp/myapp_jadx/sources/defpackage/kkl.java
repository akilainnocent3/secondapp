package defpackage;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.config.BroadcastConfig;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportybet.plugin.realsports.widget.BottomBroadcastPanel;
import com.sportybet.plugin.realsports.widget.MarqueeView;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class kkl extends xfh0<h> implements k0e0.a, iu2.b {
    public final g8z A;
    public final a8z B;
    public final hkf C;
    public final ity D;
    public BigDecimal E;
    public BigDecimal F;
    public final ArrayList c;
    public final ArrayList d;
    public List<BroadcastConfig.Info> e;
    public List<Event> f;
    public List<Tournament> i;
    public List<Event> v;
    public ioa.a w;
    public RegularMarketRule y;
    public final dfm z;

    public class a extends h {
        public final BottomBroadcastPanel a;

        public a(View view) {
            super(view);
            BottomBroadcastPanel bottomBroadcastPanel = (BottomBroadcastPanel) view;
            this.a = bottomBroadcastPanel;
            bottomBroadcastPanel.setMarqueeViewLogPrefix(kkl.class.getSimpleName());
        }

        @Override // kkl.h
        public final void a(int i) {
            BottomBroadcastPanel bottomBroadcastPanel = this.a;
            bottomBroadcastPanel.b();
            bottomBroadcastPanel.setInfo(kkl.this.e);
            MarqueeView marqueeView = bottomBroadcastPanel.d;
            if (marqueeView.w) {
                return;
            }
            marqueeView.b(true);
        }

        @Override // kkl.h
        public final void onViewRecycled() {
            this.a.b();
        }
    }

    public class b extends h {
        public LoadingView a;

        @Override // kkl.h
        public final void a(int i) {
            this.a.G(R.string.common_functions__no_game);
        }
    }

    public class c extends h implements View.OnClickListener {
        public final View A;
        public final Spinner B;
        public final View C;
        public final ImageView D;
        public final ImageView E;
        public final ImageView F;
        public final ImageView G;
        public final ImageView H;
        public final OutcomeButton[] I;
        public final TextView J;
        public u8z K;
        public final lty L;
        public final TextView a;
        public final TextView b;
        public final TextView c;
        public final TextView d;
        public final TextView e;
        public final TextView f;
        public final ImageView i;
        public final ImageView v;
        public final ImageView w;
        public final TextView y;
        public final View z;

        public class a implements u8z.a {
            public a() {
            }

            @Override // u8z.a
            public final boolean a(Outcome outcome) {
                kkl kklVar = kkl.this;
                return zog.i(outcome.odds, kklVar.E, kklVar.F);
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
                kkl kklVar = kkl.this;
                if (i >= 0) {
                    List list = this.a;
                    if (i < list.size()) {
                        String str = kklVar.y.a;
                        String str2 = (String) list.get(i);
                        ing ingVar = this.b;
                        ingVar.d(str, str2);
                        String str3 = ingVar.a.eventId;
                        String str4 = kklVar.y.a;
                        String str5 = (String) list.get(i);
                        ArrayList arrayList = kklVar.c;
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            jpc jpcVar = (jpc) obj;
                            if (jpcVar instanceof ing) {
                                ing ingVar2 = (ing) jpcVar;
                                if (TextUtils.equals(str3, ingVar2.a.eventId)) {
                                    ingVar2.d(str4, str5);
                                    break;
                                }
                            }
                        }
                        kklVar.j(cVar.getAdapterPosition());
                    }
                }
            }
        }

        public c(View view) {
            super(view);
            this.I = new OutcomeButton[]{(OutcomeButton) view.findViewById(R.id.o1), (OutcomeButton) view.findViewById(R.id.o2), (OutcomeButton) view.findViewById(R.id.o3), (OutcomeButton) view.findViewById(R.id.o4)};
            this.A = view.findViewById(R.id.sport_divider_line);
            this.B = (Spinner) view.findViewById(R.id.sports_spinner);
            this.C = view.findViewById(R.id.sports_spinner_bg);
            this.c = (TextView) view.findViewById(R.id.id);
            this.b = (TextView) view.findViewById(R.id.time);
            this.a = (TextView) view.findViewById(R.id.category_tournament_name);
            this.d = (TextView) view.findViewById(R.id.home_team);
            this.e = (TextView) view.findViewById(R.id.away_team);
            TextView textView = (TextView) view.findViewById(R.id.market_count);
            this.f = textView;
            b3.H(textView, R.color.cmn_cool_grey);
            this.i = (ImageView) view.findViewById(R.id.sporty_tv);
            this.v = (ImageView) view.findViewById(R.id.sporty_fm);
            ImageView imageView = (ImageView) view.findViewById(R.id.sporty_gift);
            this.w = imageView;
            imageView.setOnClickListener(this);
            this.y = (TextView) view.findViewById(R.id.sports_view_all_text);
            View viewFindViewById = view.findViewById(R.id.left_content);
            this.z = viewFindViewById;
            viewFindViewById.setOnClickListener(this);
            this.J = (TextView) view.findViewById(R.id.comments_count);
            ImageView imageView2 = (ImageView) view.findViewById(R.id.odds_boost_img);
            this.D = imageView2;
            imageView2.setImageDrawable(gug0.b(imageView2.getContext()));
            ImageView imageView3 = (ImageView) view.findViewById(R.id.simulate_img);
            this.F = imageView3;
            imageView3.setImageDrawable(gug0.e(view.getContext()));
            ImageView imageView4 = (ImageView) view.findViewById(R.id.top_team_img);
            this.E = imageView4;
            imageView4.setImageDrawable(gug0.f(imageView4.getContext()));
            ImageView imageView5 = (ImageView) view.findViewById(R.id.virtual_img);
            this.G = imageView5;
            imageView5.setImageDrawable(gug0.g(imageView5.getContext()));
            this.H = (ImageView) view.findViewById(R.id.stats_img);
            this.L = kkl.this.D.b(y8i0.a(view.findViewById(R.id.one_up_promo_tag)));
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0042  */
        @Override // kkl.h
        public final void a(int i) {
            Event event;
            String strB;
            List<ing> list;
            lty ltyVar = this.L;
            ltyVar.a();
            kkl kklVar = kkl.this;
            jpc jpcVar = (jpc) kklVar.d.get(i);
            if (jpcVar instanceof ing) {
                ing ingVar = (ing) jpcVar;
                final Event event2 = ingVar.a;
                ity ityVar = kklVar.D;
                String str = event2.eventId;
                ArrayList arrayList = kklVar.c;
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                loop0: while (true) {
                    if (i3 >= size) {
                        event = null;
                        break;
                    }
                    Object obj = arrayList.get(i3);
                    i3++;
                    jpc jpcVar2 = (jpc) obj;
                    if (jpcVar2 instanceof ing) {
                        ing ingVar2 = (ing) jpcVar2;
                        if (TextUtils.equals(str, ingVar2.a.eventId)) {
                            event = ingVar2.a;
                            break;
                        }
                        if (!(jpcVar2 instanceof c6g0) && (list = ((c6g0) jpcVar2).f) != null) {
                            for (ing ingVar3 : list) {
                                if (TextUtils.equals(str, ingVar3.a.eventId)) {
                                    event = ingVar3.a;
                                    break loop0;
                                }
                            }
                        }
                    } else if (!(jpcVar2 instanceof c6g0)) {
                    }
                }
                RegularMarketRule regularMarketRule = kklVar.y;
                ityVar.getClass();
                ityVar.a(ltyVar, event, regularMarketRule, null);
                this.A.setVisibility(ingVar.c ? 8 : 0);
                this.F.setVisibility(nkd0.a.a.a(event2) ? 0 : 8);
                this.E.setVisibility(event2.topTeam ? 0 : 8);
                this.D.setVisibility(event2.oddsBoost ? 0 : 8);
                this.G.setVisibility(b3.S(event2.eventId) ? 0 : 8);
                int i4 = event2.showStats() ? 0 : 8;
                ImageView imageView = this.H;
                imageView.setVisibility(i4);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: lkl
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        kkl.this.z.a(event2);
                    }
                });
                this.b.setText(bwf0.a.s(event2.estimateStartTime, false));
                this.c.setText(b3.P(event2));
                this.J.setVisibility(8);
                boolean z = ingVar.v;
                TextView textView = this.a;
                if (z || TextUtils.isEmpty(ingVar.f) || TextUtils.isEmpty(ingVar.i)) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    textView.setText(sn5.c(this.itemView, R.string.app_common__var_to_var, ingVar.f, ingVar.a.sport.category.tournament.name));
                }
                this.d.setText(event2.homeTeamName);
                this.e.setText(event2.awayTeamName);
                this.f.setText(b3.M(event2));
                this.z.setTag(event2);
                this.i.setVisibility(event2.hasLiveStream() ? 0 : 8);
                this.v.setVisibility(event2.hasAudioStream() ? 0 : 8);
                int i5 = event2.hasGift() ? 0 : 8;
                ImageView imageView2 = this.w;
                imageView2.setVisibility(i5);
                if (imageView2.getVisibility() == 0) {
                    LinkedHashSet linkedHashSet = mlk.a;
                    if (mlk.b(event2.eventId)) {
                        f00 f00Var = vgb0.a;
                        vgb0.a(AnalyticsEvent.GIFT_GRAB_ICON_SHOWN);
                    }
                }
                this.y.setVisibility(ingVar.d ? 0 : 8);
                OutcomeButton[] outcomeButtonArr = this.I;
                for (OutcomeButton outcomeButton : outcomeButtonArr) {
                    outcomeButton.a();
                }
                RegularMarketRule regularMarketRule2 = kklVar.y;
                if (regularMarketRule2.c) {
                    String str2 = regularMarketRule2.a;
                    str2.getClass();
                    strB = ingVar.b(str2, kklVar.b.e(str2), kklVar.E, kklVar.F);
                } else {
                    strB = null;
                }
                Market market = ingVar.a.getMarket(kklVar.y.a, strB);
                boolean z2 = kklVar.y.c;
                Spinner spinner = this.B;
                if (!z2) {
                    spinner.setVisibility(8);
                    for (int length = kklVar.y.d.length; length < outcomeButtonArr.length; length++) {
                        OutcomeButton outcomeButton2 = outcomeButtonArr[length];
                        outcomeButton2.a();
                        outcomeButton2.setVisibility(8);
                    }
                    if (market == null) {
                        for (int i6 = 0; i6 < kklVar.y.d.length; i6++) {
                            OutcomeButton outcomeButton3 = outcomeButtonArr[i6];
                            outcomeButton3.setVisibility(0);
                            outcomeButton3.setTextOnAndOff(zch0.h(outcomeButton3.getContext()));
                            outcomeButton3.setChecked(false);
                            outcomeButton3.setEnabled(false);
                        }
                        return;
                    }
                    while (i2 < market.outcomes.size()) {
                        b(outcomeButtonArr[i2], market, market.outcomes.get(i2), event2);
                        i2++;
                    }
                    while (i2 < outcomeButtonArr.length) {
                        OutcomeButton outcomeButton4 = outcomeButtonArr[i2];
                        outcomeButton4.a();
                        outcomeButton4.setVisibility(8);
                        i2++;
                    }
                    return;
                }
                spinner.setVisibility(0);
                spinner.setOnItemSelectedListener(null);
                OutcomeButton outcomeButton5 = outcomeButtonArr[0];
                outcomeButton5.a();
                outcomeButton5.setVisibility(8);
                List<Market> marketList = ingVar.a.getMarketList(kklVar.y.a);
                List<String> specifierList = ingVar.a.getSpecifierList(marketList);
                u8z u8zVar = this.K;
                if (u8zVar == null) {
                    u8z u8zVar2 = new u8z(spinner, this.C, tru.i(specifierList), false);
                    this.K = u8zVar2;
                    u8zVar2.f(event2, marketList);
                    spinner.setAdapter((SpinnerAdapter) this.K);
                } else {
                    u8zVar.f(event2, marketList);
                    this.K.clear();
                    this.K.addAll(tru.i(specifierList));
                }
                u8z u8zVar3 = this.K;
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
                for (int length2 = kklVar.y.d.length + 1; length2 < outcomeButtonArr.length; length2++) {
                    OutcomeButton outcomeButton6 = outcomeButtonArr[length2];
                    outcomeButton6.a();
                    outcomeButton6.setVisibility(8);
                }
                if (market != null && !specifierList.isEmpty()) {
                    while (i7 <= market.outcomes.size()) {
                        b(outcomeButtonArr[i7], market, market.outcomes.get(i7 - 1), event2);
                        i7++;
                    }
                    while (i7 < outcomeButtonArr.length) {
                        OutcomeButton outcomeButton7 = outcomeButtonArr[i7];
                        outcomeButton7.a();
                        outcomeButton7.setVisibility(8);
                        i7++;
                    }
                    return;
                }
                spinner.setVisibility(8);
                for (int i8 = 0; i8 <= kklVar.y.d.length; i8++) {
                    OutcomeButton outcomeButton8 = outcomeButtonArr[i8];
                    outcomeButton8.setVisibility(0);
                    outcomeButton8.setTextOnAndOff(zch0.h(outcomeButton8.getContext()));
                    outcomeButton8.setEnabled(false);
                    outcomeButton8.setChecked(false);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006f  */
        /* JADX WARN: Code duplicated, block: B:23:0x0075  */
        /* JADX WARN: Code duplicated, block: B:25:0x0078  */
        public final void b(OutcomeButton outcomeButton, Market market, Outcome outcome, Event event) {
            OutcomeButton outcomeButton2;
            int i;
            outcomeButton.setVisibility(0);
            outcomeButton.a();
            if (market.status != 0) {
                outcomeButton.setText(zch0.g(outcomeButton.getContext(), Boolean.TRUE));
                outcomeButton.setEnabled(false);
                return;
            }
            outcomeButton.setEnabled(outcome.isActive == 1);
            if (outcome.isActive == 1) {
                outcomeButton.setOdds(outcome.odds);
                kkl kklVar = kkl.this;
                outcomeButton.setActivated(zog.i(outcome.odds, kklVar.E, kklVar.F));
                a8z a8zVar = kklVar.B;
                if (a8zVar != null) {
                    z7z z7zVarA = a8zVar.a(event, market, outcome);
                    View view = this.itemView;
                    outcomeButton2 = outcomeButton;
                    kuh.a(outcomeButton2, z7zVarA, outcome.odds, view instanceof ViewGroup ? (ViewGroup) view : null, ku1.b, false);
                    this.L.a.a(!(z7zVarA instanceof z7z.c));
                    kklVar.z.M0(event, market, brg.HIGHLIGHTS, z7zVarA);
                }
                i = outcome.flag;
                if (i == 1) {
                    outcomeButton2.g();
                    outcome.flag = 0;
                } else if (i == 2) {
                    outcomeButton2.c();
                    outcome.flag = 0;
                }
                outcomeButton2.setTag(new Selection(event, market, outcome));
                outcomeButton2.setChecked(iu2.n(event, market, outcome));
                outcomeButton2.setOnClickListener(this);
            }
            outcomeButton.setTextOnAndOff(zch0.g(outcomeButton.getContext(), Boolean.TRUE));
            outcomeButton2 = outcomeButton;
            i = outcome.flag;
            if (i == 1) {
                outcomeButton2.g();
                outcome.flag = 0;
            } else if (i == 2) {
                outcomeButton2.c();
                outcome.flag = 0;
            }
            outcomeButton2.setTag(new Selection(event, market, outcome));
            outcomeButton2.setChecked(iu2.n(event, market, outcome));
            outcomeButton2.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            kkl kklVar = kkl.this;
            dfm dfmVar = kklVar.z;
            if (view instanceof OutcomeButton) {
                OutcomeButton outcomeButton = (OutcomeButton) view;
                Selection selection = (Selection) view.getTag();
                boolean zIsChecked = outcomeButton.isChecked();
                if (dfmVar != null) {
                    of20 of20Var = dfmVar.v1;
                    if (zIsChecked) {
                        of20Var.z1(selection);
                    } else {
                        of20Var.C.a(selection);
                    }
                }
                Event event = selection.a;
                Outcome outcome = selection.c;
                Market market = selection.b;
                if (iu2.s(event, market, outcome, zIsChecked)) {
                    kklVar.A.a(selection, zIsChecked, e8z.b);
                } else {
                    outcomeButton.setChecked(false);
                    if (kni0.m()) {
                        iu2.r(view.getContext());
                    } else if (iu2.l()) {
                        qz3.p(view.getContext());
                    } else if (iu2.f(selection) || iu2.g(event)) {
                        qz3.m(view.getContext());
                    } else if (iu2.h(event, market, outcome)) {
                        qz3.o(view.getContext());
                    }
                }
                if (iu2.p() && outcomeButton.isChecked() && !iu2.o(selection)) {
                    iu2.e(outcomeButton.getContext(), selection);
                }
            }
            if (view.getId() == R.id.left_content) {
                Intent intent = new Intent(view.getContext(), (Class<?>) PreMatchEventActivity.class);
                intent.putExtra("EXTRA_EVENT", apg.f((Event) view.getTag()));
                yrh0.s(view.getContext(), intent, true);
            } else if (view.getId() == R.id.sporty_gift) {
                dfmVar.c((Event) this.z.getTag());
            }
        }

        @Override // kkl.h
        public final void onViewRecycled() {
            this.L.a();
            this.B.setOnItemSelectedListener(null);
            for (OutcomeButton outcomeButton : this.I) {
                outcomeButton.a();
            }
        }
    }

    public class d extends h implements View.OnClickListener {
        public final LoadingView a;

        public d(View view) {
            super(view);
            LoadingView loadingView = (LoadingView) view;
            this.a = loadingView;
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) loadingView.getProgressView().getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = zch0.a(loadingView.getContext(), 32);
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = zch0.a(loadingView.getContext(), 720);
            layoutParams.t = 0;
            layoutParams.v = 0;
            layoutParams.i = 0;
            layoutParams.l = 0;
            loadingView.setOnClickListener(this);
        }

        @Override // kkl.h
        public final void a(int i) {
            ioa.a aVar = kkl.this.w;
            LoadingView loadingView = this.a;
            if (ioa.a.a == aVar) {
                loadingView.K();
                return;
            }
            if (ioa.a.b == aVar) {
                loadingView.G(R.string.common_functions__no_game);
            } else if (ioa.a.c == aVar) {
                loadingView.I();
            } else {
                loadingView.E();
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ioa.a aVar = ioa.a.a;
            kkl kklVar = kkl.this;
            kklVar.w = aVar;
            kklVar.j(getAdapterPosition());
            kklVar.m(kklVar.y, true);
        }
    }

    public class e extends h {
        public final TextView a;
        public final Spinner b;
        public final TextView[] c;
        public eru d;

        public class a implements fpy {
            public a() {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                kkl kklVar = kkl.this;
                String str = kklVar.y.a;
                mkl mklVar = new mkl(this, 0);
                str.getClass();
                kklVar.b.h(i, str, mklVar);
            }
        }

        public e(View view) {
            super(view);
            this.c = new TextView[]{(TextView) view.findViewById(R.id.left_button), (TextView) view.findViewById(R.id.mid_button), (TextView) view.findViewById(R.id.right_button), (TextView) view.findViewById(R.id.fourth_button)};
            this.a = (TextView) view.findViewById(R.id.date_week);
            this.b = (Spinner) view.findViewById(R.id.specifier_spinner);
        }

        @Override // kkl.h
        public final void a(int i) {
            kkl kklVar = kkl.this;
            vfh0 vfh0Var = kklVar.b;
            jpc jpcVar = (jpc) kklVar.d.get(i);
            if (jpcVar instanceof rru) {
                this.a.setText(bwf0.c(((rru) jpcVar).a, kklVar.z.E.getLanguageCode()));
                boolean z = kklVar.y.c;
                Spinner spinner = this.b;
                TextView[] textViewArr = this.c;
                if (!z) {
                    spinner.setVisibility(8);
                    String[] strArr = kklVar.y.d;
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
                String str2 = kklVar.y.a;
                str2.getClass();
                spinner.setSelection(vfh0Var.f(str2));
                spinner.setOnItemSelectedListener(new a());
                textViewArr[0].setVisibility(8);
                String[] strArr2 = kklVar.y.d;
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
    }

    public class f extends h implements View.OnClickListener {
        public final View a;
        public final TextView b;
        public final LoadingView c;
        public c6g0 d;
        public final ViewGroup e;
        public final TextView f;
        public final View i;
        public final TextView v;
        public final TextView w;
        public final int y;
        public final int z;

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f fVar = f.this;
                fVar.c.K();
                kkl kklVar = kkl.this;
                kklVar.z.q0(fVar.d, kklVar.y);
            }
        }

        public f(View view) {
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
            this.y = view.getContext().getColor(R.color.brand_secondary_variable_type3);
            this.z = view.getContext().getColor(R.color.brand_secondary);
        }

        @Override // kkl.h
        public final void a(int i) {
            kkl kklVar = kkl.this;
            ArrayList arrayList = kklVar.d;
            if (arrayList.get(i) instanceof c6g0) {
                c6g0 c6g0Var = (c6g0) arrayList.get(i);
                this.d = c6g0Var;
                String str = c6g0Var.b;
                TextView textView = this.b;
                textView.setText(str);
                this.v.setText(String.valueOf(this.d.v));
                boolean z = this.d.d;
                textView.setCompoundDrawablesWithIntrinsicBounds(iwh0.a(textView.getContext(), z ? R.drawable.spr_ic_arrow_drop_down_black_24dp : R.drawable.spr_ic_arrow_right_black_24dp, z ? this.y : this.z), (Drawable) null, (Drawable) null, (Drawable) null);
                this.a.setVisibility(this.d.a ? 8 : 0);
                this.i.setVisibility(8);
                a aVar = new a();
                LoadingView loadingView = this.c;
                loadingView.setOnClickListener(aVar);
                c6g0 c6g0Var2 = this.d;
                boolean z2 = c6g0Var2.d;
                int i2 = c6g0Var2.y;
                if (!z2) {
                    loadingView.setVisibility(8);
                } else if (i2 == 1) {
                    loadingView.K();
                } else if (i2 == 3) {
                    loadingView.I();
                } else if (i2 != 4) {
                    loadingView.setVisibility(8);
                } else {
                    loadingView.G(R.string.common_functions__no_game);
                }
                boolean z3 = this.d.w;
                ViewGroup viewGroup = this.e;
                if (!z3) {
                    viewGroup.setVisibility(8);
                    return;
                }
                viewGroup.setVisibility(0);
                BigDecimal bigDecimal = kklVar.E;
                BigDecimal bigDecimal2 = BigDecimal.ZERO;
                int iCompareTo = bigDecimal.compareTo(bigDecimal2);
                TextView textView2 = this.w;
                TextView textView3 = this.f;
                if (iCompareTo == 0 || kklVar.F.compareTo(bigDecimal2) == 0) {
                    textView3.setVisibility(0);
                    textView2.setText(sn5.c(this.itemView, R.string.wap_home__no_odds_available, new Object[0]));
                } else {
                    textView3.setVisibility(8);
                    textView2.setText(sn5.c(this.itemView, R.string.common_feedback__no_available_filtered_games, new Object[0]));
                }
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            final kkl kklVar = kkl.this;
            ArrayList arrayList = kklVar.d;
            final int adapterPosition = getAdapterPosition();
            if ((view instanceof TextView) && "del".equals(view.getTag())) {
                arrayList.remove(adapterPosition);
                if (arrayList.isEmpty()) {
                    kklVar.w = ioa.a.b;
                    kklVar.i();
                    return;
                }
                RecyclerView recyclerView = kklVar.a;
                if (recyclerView != null && (recyclerView.V() || recyclerView.getScrollState() != 0)) {
                    recyclerView.post(new Runnable() { // from class: zr60
                        @Override // java.lang.Runnable
                        public final void run() {
                            kklVar.notifyItemRemoved(adapterPosition);
                        }
                    });
                    return;
                } else {
                    kklVar.notifyItemRemoved(adapterPosition);
                    Unit unit = Unit.a;
                    return;
                }
            }
            c6g0 c6g0Var = this.d;
            c6g0Var.w = false;
            ArrayList arrayListB = c6g0Var.b(kklVar.y.a, kklVar.E, kklVar.F, true);
            c6g0 c6g0Var2 = this.d;
            if (c6g0Var2.d) {
                c6g0Var2.y = 0;
                if (!arrayListB.isEmpty()) {
                    final int size = arrayListB.size();
                    if (this.d.e) {
                        for (int i = 0; i < size; i++) {
                            arrayList.remove(adapterPosition + 1);
                        }
                        this.d.e = false;
                        final int i2 = adapterPosition + 1;
                        RecyclerView recyclerView2 = kklVar.a;
                        if (recyclerView2 == null || (!recyclerView2.V() && recyclerView2.getScrollState() == 0)) {
                            kklVar.notifyItemRangeRemoved(i2, size);
                            Unit unit2 = Unit.a;
                        } else {
                            recyclerView2.post(new Runnable() { // from class: as60
                                @Override // java.lang.Runnable
                                public final void run() {
                                    kklVar.notifyItemRangeRemoved(i2, size);
                                }
                            });
                        }
                    }
                }
            } else if (arrayListB.isEmpty() || !this.d.e) {
                c6g0 c6g0Var3 = this.d;
                c6g0Var3.y = 1;
                kklVar.z.q0(c6g0Var3, kklVar.y);
            } else {
                int size2 = arrayListB.size();
                c6g0 c6g0Var4 = this.d;
                if (!c6g0Var4.e) {
                    int i3 = adapterPosition + 1;
                    arrayList.addAll(i3, c6g0Var4.b(kklVar.y.a, kklVar.E, kklVar.F, true));
                    this.d.e = true;
                    kklVar.k(i3, size2);
                }
            }
            c6g0 c6g0Var5 = this.d;
            c6g0Var5.d = !c6g0Var5.d;
            kklVar.j(adapterPosition);
        }
    }

    public kkl(t6i0.a aVar, dfm dfmVar, ncm ncmVar, a8z a8zVar, hkf hkfVar, ity ityVar) {
        super(aVar, "home/highlights");
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.w = ioa.a.a;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        this.E = bigDecimal;
        this.F = bigDecimal;
        this.z = dfmVar;
        this.A = ncmVar;
        this.B = a8zVar;
        this.C = hkfVar;
        this.D = ityVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f, iu2.a
    public final void C() {
        n();
    }

    @Override // k0e0.a
    public final boolean d(int i) {
        return getItemViewType(i) == 8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        int i = this.e != null ? 1 : 0;
        ArrayList arrayList = this.d;
        return arrayList.size() > 0 ? arrayList.size() + 1 + i : i + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        ArrayList arrayList = this.d;
        if (i >= 0 && i < arrayList.size()) {
            return ((jpc) arrayList.get(i)).a();
        }
        if (arrayList.isEmpty()) {
            return i == 0 ? 11 : 13;
        }
        return i == arrayList.size() ? 14 : 13;
    }

    public final void m(RegularMarketRule regularMarketRule, boolean z) {
        this.y = regularMarketRule;
        if (!z) {
            ArrayList arrayList = this.c;
            if (!arrayList.isEmpty() && !ioa.a(0)) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    jpc jpcVar = (jpc) obj;
                    if (jpcVar instanceof c6g0) {
                        c6g0 c6g0Var = (c6g0) jpcVar;
                        c6g0Var.d = false;
                        c6g0Var.e = false;
                        c6g0Var.w = false;
                    }
                }
                n();
                return;
            }
        }
        ioa.b(0, System.currentTimeMillis());
        iim iimVar = this.z.w1;
        jvd0 jvd0Var = iimVar.G0;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        iimVar.G0 = kzh.d(new wzh(new yzh(new g1i(new xzh(iimVar.i.m(), new jim(iimVar, null)), new kim(iimVar, null)), new lim(iimVar, null)), new mim(iimVar, null)), o8i0.d(iimVar));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    public final void n() {
        boolean z;
        Event event;
        Event event2;
        ArrayList arrayList = this.d;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.c;
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            jpc jpcVar = (jpc) obj;
            if (jpcVar instanceof ing) {
                arrayList2.add((ing) jpcVar);
            }
        }
        RegularMarketRule regularMarketRule = this.y;
        List<ing> listB = this.C.b("sr:sport:1", regularMarketRule != null ? regularMarketRule.a : null, arrayList2, false, true);
        RegularMarketRule regularMarketRule2 = this.y;
        if (regularMarketRule2 != null) {
            this.C.getClass();
            if (hkf.e(regularMarketRule2)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        HashSet hashSet = new HashSet();
        for (ing ingVar : listB) {
            if (ingVar != null && (event2 = ingVar.a) != null && !TextUtils.isEmpty(event2.eventId)) {
                hashSet.add(ingVar.a.eventId);
            }
        }
        int size2 = arrayList3.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList3.get(i3);
            i3++;
            jpc jpcVar2 = (jpc) obj2;
            if (jpcVar2 instanceof ing) {
                ing ingVar2 = (ing) jpcVar2;
                if (!z || (event = ingVar2.a) == null || TextUtils.isEmpty(event.eventId) || hashSet.contains(ingVar2.a.eventId)) {
                    if (this.y != null) {
                        BigDecimal bigDecimal = this.E;
                        BigDecimal bigDecimal2 = BigDecimal.ZERO;
                        if (bigDecimal.compareTo(bigDecimal2) != 0 || this.F.compareTo(bigDecimal2) != 0) {
                            ing ingVar3 = new ing(ingVar2);
                            Event event3 = new Event(ingVar3.a);
                            if (event3.hasAnyOutcomeInOddsRange(this.y.a, this.E, this.F)) {
                                ArrayList arrayList4 = new ArrayList();
                                for (Market market : event3.markets) {
                                    if (TextUtils.equals(this.y.a, market.id)) {
                                        arrayList4.add(market);
                                    }
                                }
                                event3.markets = arrayList4;
                                ingVar3.a = event3;
                                ingVar3.v = false;
                                Category category = event3.sport.category;
                                if (category != null) {
                                    ingVar3.i = category.tournament.name;
                                    ingVar3.f = category.name;
                                }
                                arrayList.add(ingVar3);
                                i2++;
                            }
                        }
                    }
                    arrayList.add(jpcVar2);
                    i2++;
                }
            } else if (jpcVar2 instanceof c6g0) {
                c6g0 c6g0Var = (c6g0) jpcVar2;
                arrayList.add(c6g0Var);
                if (c6g0Var.d && c6g0Var.e) {
                    arrayList.addAll(c6g0Var.b(this.y.a, this.E, this.F, false));
                }
            } else if (!(jpcVar2 instanceof rru)) {
                arrayList.add(jpcVar2);
            }
        }
        long j = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            jpc jpcVar3 = (jpc) arrayList.get(i4);
            if (jpcVar3 instanceof ing) {
                ing ingVar4 = (ing) jpcVar3;
                boolean zA = vjt.a(j, ingVar4.a.estimateStartTime);
                boolean z2 = !zA;
                if (!zA) {
                    arrayList.add(i4, new rru(ingVar4.a.estimateStartTime));
                }
                ingVar4.c = z2;
                j = ingVar4.a.estimateStartTime;
            } else if (jpcVar3 instanceof c6g0) {
                j = 0;
            }
        }
        RegularMarketRule regularMarketRule3 = this.y;
        arrayList.getClass();
        this.b.b(regularMarketRule3, arrayList, false);
        if (!arrayList3.isEmpty() && arrayList.isEmpty()) {
            this.w = ioa.a.b;
        }
        if (!arrayList3.isEmpty() && i2 == 0) {
            arrayList.add(0, new c2g());
        }
        i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [int] */
    public final void o(boolean z) {
        if (z) {
            ArrayList arrayList = new ArrayList();
            List<Event> list = this.v;
            boolean z2 = false;
            if (list != null) {
                for (Event event : list) {
                    ing ingVar = new ing();
                    ingVar.a = event;
                    ingVar.v = false;
                    Category category = event.sport.category;
                    if (category != null) {
                        ingVar.i = category.tournament.name;
                        ingVar.f = category.name;
                    }
                    arrayList.add(ingVar);
                }
            }
            if (this.f != null) {
                for (int i = 0; i < this.f.size(); i++) {
                    ing ingVar2 = new ing();
                    Event event2 = this.f.get(i);
                    List<Event> list2 = this.v;
                    if (list2 == null || !list2.contains(event2)) {
                        ingVar2.a = event2;
                        Category category2 = event2.sport.category;
                        if (category2 != null) {
                            ingVar2.i = category2.tournament.name;
                            ingVar2.f = category2.name;
                        }
                        ingVar2.v = false;
                        arrayList.add(ingVar2);
                    }
                }
            }
            Collections.sort(arrayList);
            if (arrayList.size() > 1) {
                int i2 = 0;
                long j = 0;
                for (int i3 = 1; i3 < arrayList.size(); i3++) {
                    ing ingVar3 = (ing) arrayList.get(i3);
                    if (ingVar3.a.estimateStartTime != j) {
                        int i4 = i3 - 1;
                        if (i2 < i4) {
                            String str = ((ing) arrayList.get(i2)).a.sport.category.tournament.id;
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            for (int i5 = i2; i5 <= i4; i5++) {
                                ing ingVar4 = (ing) arrayList.get(i5);
                                if (TextUtils.equals(str, ingVar4.a.sport.category.tournament.id)) {
                                    arrayList2.add(ingVar4);
                                } else {
                                    arrayList3.add(ingVar4);
                                }
                            }
                            if (arrayList3.size() != 0) {
                                for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                                    arrayList.set(i2 + i6, (ing) arrayList2.get(i6));
                                }
                                int size = arrayList2.size() + i2;
                                for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                                    arrayList.set(size + i7, (ing) arrayList3.get(i7));
                                }
                            }
                        }
                        j = ingVar3.a.estimateStartTime;
                        i2 = i3;
                    }
                }
            }
            ArrayList arrayList4 = this.c;
            arrayList4.clear();
            int size2 = arrayList.size();
            int i8 = 0;
            long j2 = 0;
            while (i8 < size2) {
                Object obj = arrayList.get(i8);
                i8++;
                ing ingVar5 = (ing) obj;
                boolean zA = vjt.a(j2, ingVar5.a.estimateStartTime);
                boolean z3 = !zA;
                if (!zA) {
                    arrayList4.add(new rru(ingVar5.a.estimateStartTime));
                }
                ingVar5.c = z3;
                arrayList4.add(ingVar5);
                j2 = ingVar5.a.estimateStartTime;
            }
            List<Tournament> list3 = this.i;
            if (list3 != null) {
                lfb0.d().e("sr:sport:1");
                ArrayList arrayList5 = kgb0.a;
                ArrayList arrayList6 = new ArrayList();
                int i9 = 0;
                while (i9 < list3.size()) {
                    Tournament tournament = list3.get(i9);
                    boolean z4 = i9 == 0 ? true : z2;
                    boolean z5 = i9 < 0 ? true : z2;
                    c6g0 c6g0Var = new c6g0();
                    c6g0Var.b = tournament.categoryName + "-" + tournament.name;
                    c6g0Var.c = tournament.id;
                    c6g0Var.a = z4;
                    c6g0Var.d = z5;
                    c6g0Var.v = tournament.eventSize;
                    c6g0Var.e = z5;
                    if (tournament.events == null) {
                        c6g0Var.w = z5;
                        if (!TextUtils.isEmpty(tournament.categoryName) && !TextUtils.isEmpty(tournament.name) && tournament.eventSize > 0) {
                            arrayList6.add(c6g0Var);
                        }
                    } else {
                        ArrayList arrayList7 = new ArrayList();
                        c6g0Var.f = arrayList7;
                        arrayList6.add(c6g0Var);
                        lfb0.d().d.size();
                        long j3 = 0;
                        for (?? r12 = z2; r12 < tournament.events.size() && r12 < 2147483647; r12++) {
                            Event event3 = tournament.events.get(r12);
                            ing ingVar6 = new ing();
                            ingVar6.a = event3;
                            ingVar6.b = tournament.id;
                            ingVar6.i = tournament.name;
                            if (r12 == 2147483646) {
                                ingVar6.d = true;
                            }
                            ingVar6.c = !vjt.a(j3, event3.estimateStartTime);
                            j3 = event3.estimateStartTime;
                            arrayList7.add(ingVar6);
                            if (z5) {
                                arrayList6.add(ingVar6);
                            }
                        }
                    }
                    i9++;
                    z2 = false;
                }
                arrayList4.addAll(arrayList6);
            }
        } else {
            this.w = ioa.a.c;
        }
        n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        ((h) d0Var).a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            return new f(layoutInflaterFrom.inflate(R.layout.spr_sports_event_common_title_bar, viewGroup, false));
        }
        if (i == 2) {
            return new c(layoutInflaterFrom.inflate(R.layout.spr_sport_event_item_with_filter, viewGroup, false));
        }
        if (i == 8) {
            return new e(layoutInflaterFrom.inflate(R.layout.spr_sport_event_market_title, viewGroup, false));
        }
        if (i == 9) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.spr_highlight_loading, viewGroup, false);
            b bVar = new b(viewInflate);
            bVar.a = (LoadingView) viewInflate;
            return bVar;
        }
        if (i == 13) {
            return new a(layoutInflaterFrom.inflate(R.layout.spr_highlight_bottom, viewGroup, false));
        }
        if (i != 14) {
            return new d(layoutInflaterFrom.inflate(R.layout.spr_highlight_loading, viewGroup, false));
        }
        View viewInflate2 = layoutInflaterFrom.inflate(R.layout.spr_highlight_view_all, viewGroup, false);
        g gVar = new g(viewInflate2);
        viewInflate2.setOnClickListener(gVar);
        TextView textView = (TextView) viewInflate2;
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, iwh0.a(textView.getContext(), R.drawable.spr_ic_chevron_right_black_24dp, textView.getCurrentTextColor()), (Drawable) null);
        return gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onViewRecycled(RecyclerView.d0 d0Var) {
        h hVar = (h) d0Var;
        super.onViewRecycled(hVar);
        hVar.onViewRecycled();
    }

    public final void p(List<BroadcastConfig.Info> list) {
        if (list == null || list.size() <= 0) {
            this.e = null;
        } else {
            this.e = list;
        }
        n();
    }

    public static abstract class h extends RecyclerView.d0 {
        public abstract void a(int i);

        public void onViewRecycled() {
        }
    }

    public class g extends h implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(view.getContext(), (Class<?>) PreMatchSportActivity.class);
            intent.putExtra("key_sport_id", "sr:sport:1");
            yrh0.s(view.getContext(), intent, true);
        }

        @Override // kkl.h
        public final void a(int i) {
        }
    }
}
