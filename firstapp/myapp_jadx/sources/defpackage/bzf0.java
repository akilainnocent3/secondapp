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
import com.sporty.android.common_ui.widgets.AspectRatioImageView;
import com.sporty.android.core.model.ads.RealSportsAds;
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
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import com.sportybet.plugin.realsports.widget.BottomBroadcastPanel;
import com.sportybet.plugin.realsports.widget.MarqueeView;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes7.dex */
public final class bzf0 extends xfh0<f> implements k0e0.a, iu2.b {
    public final boolean A;
    public final a8z B;
    public final hkf C;
    public final ity D;
    public BigDecimal E;
    public BigDecimal F;
    public final SimpleDateFormat G;
    public final ArrayList c;
    public final ArrayList d;
    public List<BroadcastConfig.Info> e;
    public List<RealSportsAds> f;
    public RegularMarketRule i;
    public String v;
    public ioa.a w;
    public final dfm y;
    public final g8z z;

    public class a extends f {
        public final BottomBroadcastPanel a;

        public a(View view) {
            super(view);
            BottomBroadcastPanel bottomBroadcastPanel = (BottomBroadcastPanel) view;
            this.a = bottomBroadcastPanel;
            bottomBroadcastPanel.setMarqueeViewLogPrefix(bzf0.class.getSimpleName());
        }

        @Override // bzf0.f
        public final void a(int i) {
            BottomBroadcastPanel bottomBroadcastPanel = this.a;
            bottomBroadcastPanel.b();
            bottomBroadcastPanel.setInfo(bzf0.this.e);
            MarqueeView marqueeView = bottomBroadcastPanel.d;
            if (marqueeView.w) {
                return;
            }
            marqueeView.b(true);
        }

        @Override // bzf0.f
        public final void onViewRecycled() {
            this.a.b();
        }
    }

    public class b extends f implements View.OnClickListener {
        public final View A;
        public final Spinner B;
        public final View C;
        public final OutcomeButton[] D;
        public final TextView E;
        public final ImageView F;
        public final ImageView G;
        public final ImageView H;
        public final ImageView I;
        public final ImageView J;
        public u8z K;
        public final AspectRatioImageView L;
        public final ImageView M;
        public final lty N;
        public final boolean a;
        public final TextView b;
        public final LinkedList<OutcomeButton> c;
        public final TextView d;
        public final TextView e;
        public final TextView f;
        public final TextView i;
        public final TextView v;
        public final ImageView w;
        public final ImageView y;
        public final View z;

        public class a implements u8z.a {
            public a() {
            }

            @Override // u8z.a
            public final boolean a(Outcome outcome) {
                bzf0 bzf0Var = bzf0.this;
                return zog.i(outcome.odds, bzf0Var.E, bzf0Var.F);
            }

            @Override // u8z.a
            public final void b(OutcomeButton outcomeButton) {
                b.this.onClick(outcomeButton);
            }
        }

        /* JADX INFO: renamed from: bzf0$b$b, reason: collision with other inner class name */
        public class C0147b implements fpy {
            public final /* synthetic */ List a;
            public final /* synthetic */ Event b;

            public C0147b(List list, Event event) {
                this.a = list;
                this.b = event;
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                b bVar = b.this;
                bzf0 bzf0Var = bzf0.this;
                if (i >= 0) {
                    List list = this.a;
                    if (i < list.size()) {
                        String str = bzf0Var.i.a;
                        String str2 = (String) list.get(i);
                        Event event = this.b;
                        event.setSelectSpecifier(str, str2);
                        String str3 = event.eventId;
                        String str4 = bzf0Var.i.a;
                        String str5 = (String) list.get(i);
                        ArrayList arrayList = bzf0Var.c;
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            Event event2 = (Event) obj;
                            if (TextUtils.equals(str3, event2.eventId)) {
                                event2.setSelectSpecifier(str4, str5);
                                break;
                            }
                        }
                        bzf0Var.j(bVar.getAdapterPosition());
                    }
                }
            }
        }

        public b(View view, boolean z) {
            super(view);
            this.c = new LinkedList<>();
            this.D = new OutcomeButton[]{(OutcomeButton) view.findViewById(R.id.o1), (OutcomeButton) view.findViewById(R.id.o2), (OutcomeButton) view.findViewById(R.id.o3), (OutcomeButton) view.findViewById(R.id.o4)};
            this.A = view.findViewById(R.id.sport_divider_line);
            this.a = z;
            this.B = (Spinner) view.findViewById(R.id.sports_spinner);
            this.C = view.findViewById(R.id.sports_spinner_bg);
            this.e = (TextView) view.findViewById(R.id.id);
            this.d = (TextView) view.findViewById(R.id.time);
            this.b = (TextView) view.findViewById(R.id.category_tournament_name);
            this.f = (TextView) view.findViewById(R.id.home_team);
            this.i = (TextView) view.findViewById(R.id.away_team);
            TextView textView = (TextView) view.findViewById(R.id.market_count);
            this.v = textView;
            b3.H(textView, R.color.cmn_cool_grey);
            this.w = (ImageView) view.findViewById(R.id.sporty_tv);
            this.y = (ImageView) view.findViewById(R.id.sporty_fm);
            view.findViewById(R.id.sports_view_all_text).setVisibility(8);
            View viewFindViewById = view.findViewById(R.id.left_content);
            this.z = viewFindViewById;
            viewFindViewById.setOnClickListener(this);
            this.E = (TextView) view.findViewById(R.id.comments_count);
            ImageView imageView = (ImageView) view.findViewById(R.id.odds_boost_img);
            this.F = imageView;
            imageView.setImageDrawable(gug0.b(view.getContext()));
            ImageView imageView2 = (ImageView) view.findViewById(R.id.simulate_img);
            this.H = imageView2;
            imageView2.setImageDrawable(gug0.e(view.getContext()));
            ImageView imageView3 = (ImageView) view.findViewById(R.id.top_team_img);
            this.G = imageView3;
            imageView3.setImageDrawable(gug0.f(view.getContext()));
            ImageView imageView4 = (ImageView) view.findViewById(R.id.virtual_img);
            this.I = imageView4;
            imageView4.setImageDrawable(gug0.g(imageView4.getContext()));
            this.J = (ImageView) view.findViewById(R.id.stats_img);
            AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) view.findViewById(R.id.ad);
            this.L = aspectRatioImageView;
            aspectRatioImageView.setAspectRatio(0.22058824f);
            this.M = (ImageView) view.findViewById(R.id.sporty_gift);
            this.N = bzf0.this.D.b(y8i0.a(view.findViewById(R.id.one_up_promo_tag)));
        }

        public static void c(OutcomeButton outcomeButton) {
            outcomeButton.a();
            outcomeButton.setVisibility(8);
        }

        @Override // bzf0.f
        public final void a(int i) {
            Event event;
            String selectedSpecifier;
            int i2;
            Category category;
            Tournament tournament;
            lty ltyVar = this.N;
            ltyVar.a();
            bzf0 bzf0Var = bzf0.this;
            ArrayList arrayList = bzf0Var.d;
            final Event event2 = (Event) arrayList.get(i);
            ity ityVar = bzf0Var.D;
            String str = event2.eventId;
            ArrayList arrayList2 = bzf0Var.c;
            int size = arrayList2.size();
            int i3 = 0;
            int i4 = 0;
            do {
                if (i4 >= size) {
                    event = null;
                    break;
                } else {
                    Object obj = arrayList2.get(i4);
                    i4++;
                    event = (Event) obj;
                }
            } while (!TextUtils.equals(str, event.eventId));
            RegularMarketRule regularMarketRule = bzf0Var.i;
            ityVar.getClass();
            ityVar.a(ltyVar, event, regularMarketRule, null);
            this.A.setVisibility(bzf0Var.o(i) ? 8 : 0);
            this.H.setVisibility(nkd0.a.a.a(event2) ? 0 : 8);
            this.G.setVisibility(event2.topTeam ? 0 : 8);
            this.F.setVisibility(event2.oddsBoost ? 0 : 8);
            this.I.setVisibility(b3.S(event2.eventId) ? 0 : 8);
            int i5 = event2.showStats() ? 0 : 8;
            ImageView imageView = this.J;
            imageView.setVisibility(i5);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: czf0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    bzf0.this.y.a(event2);
                }
            });
            this.d.setText(bwf0.a.s(event2.estimateStartTime, false));
            this.e.setText(b3.P(event2));
            this.E.setVisibility(8);
            Sport sport = event2.sport;
            TextView textView = this.b;
            if (sport == null || (category = sport.category) == null || (tournament = category.tournament) == null) {
                textView.setText((CharSequence) null);
            } else {
                textView.setText(sn5.c(this.itemView, R.string.app_common__var_to_var, category.name, tournament.name));
            }
            this.f.setText(event2.homeTeamName);
            this.i.setText(event2.awayTeamName);
            this.v.setText(b3.M(event2));
            this.z.setTag(event2);
            this.w.setVisibility(event2.hasLiveStream() ? 0 : 8);
            this.y.setVisibility(event2.hasAudioStream() ? 0 : 8);
            int i6 = event2.hasGift() ? 0 : 8;
            ImageView imageView2 = this.M;
            imageView2.setVisibility(i6);
            imageView2.setOnClickListener(this);
            if (imageView2.getVisibility() == 0) {
                LinkedHashSet linkedHashSet = mlk.a;
                if (mlk.b(event2.eventId)) {
                    f00 f00Var = vgb0.a;
                    vgb0.a(AnalyticsEvent.GIFT_GRAB_ICON_SHOWN);
                }
            }
            OutcomeButton[] outcomeButtonArr = this.D;
            for (OutcomeButton outcomeButton : outcomeButtonArr) {
                c(outcomeButton);
            }
            AspectRatioImageView aspectRatioImageView = this.L;
            aspectRatioImageView.setVisibility(8);
            int i7 = 1;
            if (bzf0Var.f != null && this.a && i % 20 == 19 && i < arrayList.size() - 1 && (i2 = i / 20) < bzf0Var.f.size()) {
                RealSportsAds realSportsAds = bzf0Var.f.get(i2);
                final String linkUrl = realSportsAds.getLinkUrl();
                String imgUrl = realSportsAds.getImgUrl();
                aspectRatioImageView.setImageResource(R.drawable.airteltigo_logo);
                if (bzf0Var.y.N.g(realSportsAds.getLinkUrl()) && realSportsAds.isImageUrlSupported()) {
                    aspectRatioImageView.setVisibility(0);
                    sh8.a().a(imgUrl, aspectRatioImageView);
                    aspectRatioImageView.setOnClickListener(new View.OnClickListener() { // from class: dzf0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            sh8.c().e(linkUrl);
                        }
                    });
                }
            }
            RegularMarketRule regularMarketRule2 = bzf0Var.i;
            if (regularMarketRule2.c) {
                String str2 = regularMarketRule2.a;
                str2.getClass();
                selectedSpecifier = event2.getSelectedSpecifier(str2, bzf0Var.b.e(str2), bzf0Var.E, bzf0Var.F);
            } else {
                selectedSpecifier = null;
            }
            Market market = event2.getMarket(bzf0Var.i.a, selectedSpecifier);
            boolean z = bzf0Var.i.c;
            Spinner spinner = this.B;
            if (!z) {
                spinner.setVisibility(8);
                for (int length = bzf0Var.i.d.length; length < outcomeButtonArr.length; length++) {
                    c(outcomeButtonArr[length]);
                }
                if (market != null) {
                    while (i3 < market.outcomes.size()) {
                        b(outcomeButtonArr[i3], market, market.outcomes.get(i3), event2);
                        i3++;
                    }
                    while (i3 < outcomeButtonArr.length) {
                        c(outcomeButtonArr[i3]);
                        i3++;
                    }
                    return;
                }
                for (int i8 = 0; i8 < bzf0Var.i.d.length; i8++) {
                    OutcomeButton outcomeButton2 = outcomeButtonArr[i8];
                    outcomeButton2.setVisibility(0);
                    outcomeButton2.setTextOnAndOff(zch0.h(outcomeButton2.getContext()));
                    outcomeButton2.setChecked(false);
                    outcomeButton2.setEnabled(false);
                }
                return;
            }
            spinner.setVisibility(0);
            spinner.setOnItemSelectedListener(null);
            c(outcomeButtonArr[0]);
            List<Market> marketList = event2.getMarketList(bzf0Var.i.a);
            List<String> specifierList = event2.getSpecifierList(marketList);
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
            if (selectedSpecifier != null) {
                spinner.setSelection(Math.max(specifierList.indexOf(selectedSpecifier), 0), false);
            } else {
                spinner.setSelection(0, false);
            }
            spinner.setOnItemSelectedListener(new C0147b(specifierList, event2));
            for (int length2 = bzf0Var.i.d.length + 1; length2 < outcomeButtonArr.length; length2++) {
                c(outcomeButtonArr[length2]);
            }
            if (market != null && !specifierList.isEmpty()) {
                while (i7 <= market.outcomes.size()) {
                    b(outcomeButtonArr[i7], market, market.outcomes.get(i7 - 1), event2);
                    i7++;
                }
                while (i7 < outcomeButtonArr.length) {
                    c(outcomeButtonArr[i7]);
                    i7++;
                }
                return;
            }
            spinner.setVisibility(8);
            for (int i9 = 0; i9 <= bzf0Var.i.d.length; i9++) {
                OutcomeButton outcomeButton3 = outcomeButtonArr[i9];
                outcomeButton3.setVisibility(0);
                outcomeButton3.setTextOnAndOff(zch0.h(outcomeButton3.getContext()));
                outcomeButton3.setEnabled(false);
                outcomeButton3.setChecked(false);
            }
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006f  */
        /* JADX WARN: Code duplicated, block: B:23:0x0078  */
        /* JADX WARN: Code duplicated, block: B:25:0x007b  */
        public final void b(OutcomeButton outcomeButton, Market market, Outcome outcome, Event event) {
            OutcomeButton outcomeButton2;
            int i;
            LinkedList<OutcomeButton> linkedList;
            outcomeButton.setVisibility(0);
            outcomeButton.a();
            if (market.status != 0) {
                outcomeButton.setText(zch0.h(outcomeButton.getContext()));
                outcomeButton.setEnabled(false);
                return;
            }
            outcomeButton.setEnabled(outcome.isActive == 1);
            if (outcome.isActive == 1) {
                outcomeButton.setOdds(outcome.odds);
                bzf0 bzf0Var = bzf0.this;
                outcomeButton.setActivated(zog.i(outcome.odds, bzf0Var.E, bzf0Var.F));
                a8z a8zVar = bzf0Var.B;
                if (a8zVar != null) {
                    z7z z7zVarA = a8zVar.a(event, market, outcome);
                    View view = this.itemView;
                    outcomeButton2 = outcomeButton;
                    kuh.a(outcomeButton2, z7zVarA, outcome.odds, view instanceof ViewGroup ? (ViewGroup) view : null, ku1.b, false);
                    this.N.a.a(!(z7zVarA instanceof z7z.c));
                    bzf0Var.y.M0(event, market, brg.TODAY, z7zVarA);
                }
                i = outcome.flag;
                linkedList = this.c;
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
            outcomeButton.setTextOnAndOff(zch0.h(outcomeButton.getContext()));
            outcomeButton2 = outcomeButton;
            i = outcome.flag;
            linkedList = this.c;
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
            bzf0 bzf0Var = bzf0.this;
            dfm dfmVar = bzf0Var.y;
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
                    bzf0Var.z.a(selection, zIsChecked, e8z.a);
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
                    iu2.e(view.getContext(), selection);
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

        @Override // bzf0.f
        public final void onViewRecycled() {
            this.N.a();
            this.B.setOnItemSelectedListener(null);
            while (true) {
                LinkedList<OutcomeButton> linkedList = this.c;
                if (linkedList.size() <= 0) {
                    break;
                }
                linkedList.getFirst().a();
                linkedList.remove();
            }
            for (OutcomeButton outcomeButton : this.D) {
                outcomeButton.a();
            }
        }
    }

    public class c extends f implements View.OnClickListener {
        public final LoadingView a;

        public c(View view) {
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

        @Override // bzf0.f
        public final void a(int i) {
            ioa.a aVar = bzf0.this.w;
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
            bzf0 bzf0Var = bzf0.this;
            bzf0Var.w = aVar;
            bzf0Var.j(getAdapterPosition());
            bzf0Var.m(bzf0Var.i, bzf0Var.v, true);
        }
    }

    public class d extends f {
        public final TextView a;
        public final Spinner b;
        public final TextView[] c;
        public eru d;

        public class a implements fpy {
            public a() {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                bzf0 bzf0Var = bzf0.this;
                String str = bzf0Var.i.a;
                uvb uvbVar = new uvb(this, 1);
                str.getClass();
                bzf0Var.b.h(i, str, uvbVar);
            }
        }

        public d(View view) {
            super(view);
            this.c = new TextView[]{(TextView) view.findViewById(R.id.left_button), (TextView) view.findViewById(R.id.mid_button), (TextView) view.findViewById(R.id.right_button), (TextView) view.findViewById(R.id.fourth_button)};
            this.a = (TextView) view.findViewById(R.id.date_week);
            this.b = (Spinner) view.findViewById(R.id.specifier_spinner);
        }

        @Override // bzf0.f
        public final void a(int i) {
            bzf0 bzf0Var = bzf0.this;
            vfh0 vfh0Var = bzf0Var.b;
            this.a.setText(bwf0.c(((Event) bzf0Var.d.get(i)).estimateStartTime, bzf0Var.y.E.getLanguageCode()));
            boolean z = bzf0Var.i.c;
            TextView[] textViewArr = this.c;
            Spinner spinner = this.b;
            if (!z) {
                spinner.setVisibility(8);
                String[] strArr = bzf0Var.i.d;
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
            String str2 = bzf0Var.i.a;
            str2.getClass();
            spinner.setSelection(vfh0Var.f(str2));
            spinner.setOnItemSelectedListener(new a());
            textViewArr[0].setVisibility(8);
            String[] strArr2 = bzf0Var.i.d;
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

    public bzf0(t6i0.a aVar, dfm dfmVar, ncm ncmVar, boolean z, a8z a8zVar, hkf hkfVar, ity ityVar) {
        super(aVar, "home/today");
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.v = "";
        this.w = ioa.a.a;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        this.E = bigDecimal;
        this.F = bigDecimal;
        this.G = new SimpleDateFormat("D", Locale.US);
        this.y = dfmVar;
        this.z = ncmVar;
        this.A = z;
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
        return getItemViewType(i) == 5;
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
            return o(i) ? 5 : 2;
        }
        if (arrayList.size() == 0) {
            return i == 0 ? 1 : 3;
        }
        return i == arrayList.size() ? 4 : 3;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    public final void m(RegularMarketRule regularMarketRule, String str, boolean z) {
        jvd0 jvd0Var;
        boolean zEquals = TextUtils.equals(this.v, str);
        dfm dfmVar = this.y;
        if (zEquals) {
            jvd0 jvd0Var2 = dfmVar.w1.F0;
            if (jvd0Var2 != null && jvd0Var2.isActive()) {
            }
            this.i = regularMarketRule;
            if (z && !this.c.isEmpty() && !ioa.a(1)) {
                n();
                return;
            }
            String str2 = this.v;
            iim iimVar = dfmVar.w1;
            iimVar.getClass();
            str2.getClass();
            jvd0Var = iimVar.F0;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            iimVar.F0 = kzh.d(new wzh(new yzh(new g1i(new xzh(iimVar.i.d(str2), new oim(iimVar, null)), new pim(iimVar, null)), new qim(iimVar, null)), new rim(iimVar, null)), o8i0.d(iimVar));
        }
        this.v = str;
        z = true;
        this.i = regularMarketRule;
        if (z) {
        }
        String str3 = this.v;
        iim iimVar2 = dfmVar.w1;
        iimVar2.getClass();
        str3.getClass();
        jvd0Var = iimVar2.F0;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        iimVar2.F0 = kzh.d(new wzh(new yzh(new g1i(new xzh(iimVar2.i.d(str3), new oim(iimVar2, null)), new pim(iimVar2, null)), new qim(iimVar2, null)), new rim(iimVar2, null)), o8i0.d(iimVar2));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e3  */
    public final void n() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        String str = this.v;
        RegularMarketRule regularMarketRule = this.i;
        String str2 = regularMarketRule != null ? regularMarketRule.a : null;
        hkf hkfVar = this.C;
        hkfVar.getClass();
        ArrayList arrayList3 = this.c;
        arrayList3.getClass();
        List<Event> listC = hkfVar.c(str, str2, arrayList3, false);
        RegularMarketRule regularMarketRule2 = this.i;
        boolean z = regularMarketRule2 != null && hkf.e(regularMarketRule2);
        HashSet hashSet = new HashSet();
        for (Event event : listC) {
            if (event != null && !TextUtils.isEmpty(event.eventId)) {
                hashSet.add(event.eventId);
            }
        }
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            Event event2 = (Event) obj;
            if (!z || event2 == null || TextUtils.isEmpty(event2.eventId) || hashSet.contains(event2.eventId)) {
                arrayList2.add(event2);
            }
        }
        if (this.i != null) {
            BigDecimal bigDecimal = this.E;
            BigDecimal bigDecimal2 = BigDecimal.ZERO;
            if (bigDecimal.compareTo(bigDecimal2) == 0 && this.F.compareTo(bigDecimal2) == 0) {
                arrayList.addAll(arrayList2);
            } else {
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    Event event3 = (Event) obj2;
                    Event event4 = new Event(event3);
                    if (event4.hasAnyOutcomeInOddsRange(this.i.a, this.E, this.F)) {
                        ArrayList arrayList4 = new ArrayList();
                        for (Market market : event3.markets) {
                            if (TextUtils.equals(this.i.a, market.id)) {
                                arrayList4.add(market);
                            }
                        }
                        event4.markets = arrayList4;
                        arrayList.add(event4);
                    }
                }
            }
        } else {
            arrayList.addAll(arrayList2);
        }
        if (arrayList.isEmpty() && this.w == ioa.a.d) {
            this.w = ioa.a.b;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (o(i3)) {
                arrayList.add(i3, (Event) arrayList.get(i3));
            }
        }
        this.b.b(this.i, arrayList3, false);
        i();
    }

    public final boolean o(int i) {
        if (i == 0) {
            return true;
        }
        ArrayList arrayList = this.d;
        Date date = new Date(((Event) arrayList.get(i)).estimateStartTime);
        Date date2 = new Date(((Event) arrayList.get(i - 1)).estimateStartTime);
        SimpleDateFormat simpleDateFormat = this.G;
        return !simpleDateFormat.format(date2).equals(simpleDateFormat.format(date));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        ((f) d0Var).a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == 2) {
            return new b(layoutInflaterFrom.inflate(R.layout.spr_today_sport_event_item, viewGroup, false), this.A);
        }
        if (i == 3) {
            return new a(layoutInflaterFrom.inflate(R.layout.spr_highlight_bottom, viewGroup, false));
        }
        if (i != 4) {
            return i != 5 ? new c(layoutInflaterFrom.inflate(R.layout.spr_highlight_loading, viewGroup, false)) : new d(layoutInflaterFrom.inflate(R.layout.spr_sport_event_market_title, viewGroup, false));
        }
        return new e(layoutInflaterFrom.inflate(R.layout.spr_highlight_view_all, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onViewRecycled(RecyclerView.d0 d0Var) {
        f fVar = (f) d0Var;
        super.onViewRecycled(fVar);
        fVar.onViewRecycled();
    }

    public final void p(List<BroadcastConfig.Info> list) {
        if (list == null || list.isEmpty()) {
            this.e = null;
        } else {
            this.e = list;
        }
        n();
    }

    public static abstract class f extends RecyclerView.d0 {
        public abstract void a(int i);

        public void onViewRecycled() {
        }
    }

    public class e extends f implements View.OnClickListener {
        public e(View view) {
            super(view);
            view.setOnClickListener(this);
            TextView textView = (TextView) view;
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, iwh0.a(textView.getContext(), R.drawable.spr_ic_chevron_right_black_24dp, textView.getCurrentTextColor()), (Drawable) null);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(view.getContext(), (Class<?>) PreMatchSportActivity.class);
            intent.putExtra("key_sport_id", bzf0.this.v);
            yrh0.s(view.getContext(), intent, true);
        }

        @Override // bzf0.f
        public final void a(int i) {
        }
    }
}
