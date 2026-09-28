package com.sportybet.plugin.realsports.event.viewholder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.gridlayout.widget.GridLayout;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import com.sportybet.plugin.realsports.widget.OutcomeView;
import defpackage.itf0;
import defpackage.ku1;
import defpackage.kuh;
import defpackage.sn5;
import defpackage.tru;
import defpackage.y4s;
import defpackage.z7z;
import defpackage.zch0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class FakeComboViewHolder extends VisibleMarketViewHolder implements View.OnClickListener, View.OnLongClickListener {
    private final ImageView boostSignView;
    private final RelativeLayout container;
    private final ImageView descImg;
    private final View dividerLine;
    private final ImageButton favour;
    private final GridLayout grid;
    private final TextView title;

    public FakeComboViewHolder(View view, VisibleMarketViewHolder.a aVar, Set<String> set) {
        super(view, aVar, set);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.title_container);
        this.container = relativeLayout;
        relativeLayout.setOnClickListener(this);
        relativeLayout.setOnLongClickListener(this);
        this.title = (TextView) view.findViewById(R.id.title);
        ImageView imageView = (ImageView) view.findViewById(R.id.info);
        this.descImg = imageView;
        imageView.setOnClickListener(this);
        this.grid = (GridLayout) view.findViewById(R.id.grid);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.fav);
        this.favour = imageButton;
        imageButton.setOnClickListener(this);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.boost_sign);
        this.boostSignView = imageView2;
        imageView2.setOnClickListener(this);
        this.dividerLine = view.findViewById(R.id.divider);
    }

    private TextView generateColumnTitle(String str) {
        TextView textView = new TextView(this.ctx);
        textView.setBackgroundColor(this.layoutConfig.e);
        textView.setTextColor(this.layoutConfig.b);
        textView.setTextSize(12.0f);
        textView.setText(str);
        int i = this.padding;
        textView.setPadding(i, i, i, i);
        textView.setMaxLines(1);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxWidth(zch0.a(this.ctx, 240 / this.grid.getColumnCount()));
        textView.setGravity(17);
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindView$0(View view) {
        openOddsBoostPage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindView$1() {
        Iterator<Outcome> it = this.market.outcomes.iterator();
        while (it.hasNext()) {
            this.outcomesInVerticalOrientation.add(it.next().id);
        }
        for (int i = 0; i < this.grid.getChildCount(); i++) {
            View childAt = this.grid.getChildAt(i);
            if (childAt instanceof OutcomeView) {
                ((OutcomeView) childAt).setupWithVerticalOrientation();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01e6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [android.view.View$OnClickListener, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r1v11, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.View, android.widget.ImageView] */
    @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder
    public void onBindView() {
        int i;
        HashMap map;
        char c;
        String str;
        RelativeLayout relativeLayout = this.container;
        this.layoutConfig.getClass();
        relativeLayout.setBackgroundColor(0);
        this.title.setTextColor(this.layoutConfig.a);
        boolean zX = this.callback.x(this.market);
        ?? r12 = 1;
        boolean z = this.market.hasJokerOutcome() && this.callback.n();
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_FAKE_COMBO_MARKET);
        aVar.a(this.market.toString() + " is first fake combo market: " + zX, new Object[0]);
        boolean zIsVirtualSoccer = this.event.isVirtualSoccer();
        ImageButton imageButton = this.favour;
        if (zIsVirtualSoccer) {
            imageButton.setVisibility(8);
        } else {
            imageButton.setVisibility(0);
        }
        RelativeLayout relativeLayout2 = this.container;
        if (zX) {
            relativeLayout2.setVisibility(0);
            if (this.market.isPreMatch()) {
                this.dividerLine.setVisibility(0);
            }
            if (this.sportRule.b(this.market.id)) {
                boolean zContains = tru.a.contains(this.market.id);
                TextView textView = this.title;
                if (zContains) {
                    textView.setText(sn5.c(textView, R.string.common_functions__combo_market_title_set_winner, new Object[0]));
                } else {
                    textView.setText(tru.b(this.market));
                }
            } else {
                this.title.setText(tru.a(this.market));
            }
            ImageButton imageButton2 = this.favour;
            VisibleMarketViewHolder.b bVar = this.layoutConfig;
            Context context = this.ctx;
            boolean zA = this.callback.A(this.market);
            bVar.getClass();
            imageButton2.setImageDrawable(VisibleMarketViewHolder.b.a(context, zA));
            this.boostSignView.setVisibility((this.callback.B() && VisibleMarketViewHolder.isBoostEvent(this.event, this.market, this.callback.D(), false)) ? 0 : 8);
            this.descImg.setTag(this.market);
        } else {
            relativeLayout2.setVisibility(8);
            this.dividerLine.setVisibility(8);
        }
        ?? r15 = 0;
        if (this.callback.y(this.market) || this.callback.s(this.market)) {
            this.title.setCompoundDrawablesWithIntrinsicBounds(getCollapsedStatusDrawable(true), (Drawable) null, (Drawable) null, (Drawable) null);
            this.grid.setVisibility(8);
            return;
        }
        this.title.setCompoundDrawablesWithIntrinsicBounds(getCollapsedStatusDrawable(false), (Drawable) null, (Drawable) null, (Drawable) null);
        this.grid.setVisibility(0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap map2 = new HashMap();
        List<Outcome> list = this.market.outcomes;
        char c2 = 2;
        if (list != null) {
            for (Outcome outcome : list) {
                if (this.sportRule.w(this.market.id) || this.sportRule.o(this.market.id)) {
                    String[] strArrSplit = outcome.desc.split(" ");
                    if (strArrSplit.length >= 2) {
                        String strE = tru.e(strArrSplit);
                        if (!arrayList2.contains(strE)) {
                            arrayList2.add(strE);
                        }
                        String strF = tru.f(strArrSplit[strArrSplit.length - 1]);
                        if (!arrayList.contains(strF)) {
                            arrayList.add(strF);
                        }
                        map2.put(strF + strE, outcome);
                    }
                } else if (this.sportRule.m(this.market.id) || this.sportRule.i(this.market.id)) {
                    String[] strArrSplit2 = outcome.desc.split(" ");
                    if (strArrSplit2.length >= 2) {
                        String strE2 = tru.e(strArrSplit2);
                        if (!arrayList2.contains(strE2)) {
                            arrayList2.add(strE2);
                        }
                        String strF2 = tru.f(strArrSplit2[strArrSplit2.length - 1]);
                        if (!arrayList.contains(strF2)) {
                            arrayList.add(strF2);
                        }
                        map2.put(strF2 + strE2, outcome);
                    }
                } else if (this.sportRule.b(this.market.id)) {
                    String str2 = outcome.desc;
                    if (!TextUtils.isEmpty(str2) && !arrayList2.contains(str2)) {
                        arrayList2.add(str2);
                    }
                    String strSubstring = this.market.specifier;
                    if (strSubstring != null) {
                        HashSet hashSet = tru.a;
                        if (strSubstring.contains("|")) {
                            int iIndexOf = strSubstring.indexOf("|");
                            strSubstring = iIndexOf >= 0 ? strSubstring.substring(iIndexOf + 1) : "";
                        }
                        if (strSubstring.length() <= 1 || !strSubstring.contains("=") || strSubstring.split("=").length <= 1) {
                            str = "";
                        } else {
                            str = strSubstring.split("=")[1];
                            if (!arrayList.contains(str)) {
                                arrayList.add(str);
                            }
                        }
                    } else {
                        str = "";
                    }
                    map2.put(str + str2, outcome);
                }
            }
        }
        int size = arrayList2.size();
        this.grid.removeAllViews();
        this.grid.setRowCount(arrayList.size() + 1 + (z ? arrayList.size() : 0));
        if (this.sportRule.m(this.market.id) || this.sportRule.i(this.market.id)) {
            this.grid.setColumnCount(arrayList2.size());
        } else {
            this.grid.setColumnCount(arrayList2.size() + 1);
        }
        if (zX) {
            if (!this.sportRule.m(this.market.id) && !this.sportRule.i(this.market.id)) {
                GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
                layoutParams.a(7);
                this.grid.addView(generateColumnTitle(""), layoutParams);
            }
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj = arrayList2.get(i2);
                i2++;
                GridLayout.LayoutParams layoutParams2 = new GridLayout.LayoutParams();
                layoutParams2.a(7);
                this.grid.addView(generateColumnTitle((String) obj), layoutParams2);
            }
        }
        int size3 = arrayList.size();
        int i3 = 0;
        while (i3 < size3) {
            int i4 = i3 + 1;
            String str3 = (String) arrayList.get(i3);
            ?? r1 = z ? c2 : r12;
            GridLayout.g gVar = GridLayout.O;
            GridLayout.LayoutParams layoutParams3 = new GridLayout.LayoutParams(GridLayout.l(Integer.MIN_VALUE, r1, gVar, 0.0f), GridLayout.l(Integer.MIN_VALUE, r12, gVar, 1.0f));
            View viewInflate = LayoutInflater.from(this.ctx).inflate(R.layout.spr_item_match_details_odds, r15, false);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.specifier);
            ?? r5 = (ImageView) viewInflate.findViewById(R.id.odds_boost_icon);
            textView2.setTextColor(this.layoutConfig.b);
            viewInflate.setBackgroundResource(this.layoutConfig.c);
            textView2.setText(tru.f(str3));
            if (this.callback.B() && VisibleMarketViewHolder.isBoostEvent(this.event, this.market, this.callback.D(), r12)) {
                i = 0;
                r5.setVisibility(0);
                r5.setOnClickListener(new View.OnClickListener() { // from class: n9h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.lambda$onBindView$0(view);
                    }
                });
            } else {
                i = 0;
                r5.setVisibility(8);
                r5.setOnClickListener(r15);
            }
            textView2.measure(i, i);
            int measuredHeight = textView2.getMeasuredHeight();
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = this.topMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams3).width = r12;
            if (!this.sportRule.m(this.market.id) && !this.sportRule.i(this.market.id)) {
                this.grid.addView(viewInflate, layoutParams3);
            }
            char c3 = 1033;
            if (this.sportRule.m(this.market.id) || this.sportRule.i(this.market.id)) {
                map = map2;
                float f = 0.0f;
                int i5 = Integer.MIN_VALUE;
                c = 2;
                Iterator<Outcome> it = this.market.outcomes.iterator();
                while (it.hasNext()) {
                    Outcome next = it.next();
                    float f2 = f;
                    int i6 = i5;
                    ArrayList arrayList3 = arrayList;
                    ArrayList arrayList4 = arrayList2;
                    int i7 = size;
                    Iterator<Outcome> it2 = it;
                    OutcomeView outcomeViewCreateOutcomeView = createOutcomeView(this.ctx, this.layoutConfig, this.event, this.sportRule, this.market, next, true, this, new OutcomeView.a() { // from class: o9h
                        @Override // com.sportybet.plugin.realsports.widget.OutcomeView.a
                        public final void a() {
                            this.a.lambda$onBindView$1();
                        }
                    }, this.outcomesInVerticalOrientation.contains(next.id));
                    refreshOddsChangedFlag(outcomeViewCreateOutcomeView, next);
                    GridLayout.g gVar2 = GridLayout.O;
                    GridLayout.LayoutParams layoutParams4 = new GridLayout.LayoutParams(GridLayout.l(i6, 1, gVar2, f2), GridLayout.l(i6, 1, gVar2, 1.0f));
                    ((ViewGroup.MarginLayoutParams) layoutParams4).width = 0;
                    if (this.grid.getChildCount() % this.grid.getColumnCount() > 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin = this.leftMargin;
                    }
                    ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = this.topMargin;
                    z7z z7zVarG = this.callback.g(this.event, this.market, next);
                    if (((z7zVarG instanceof z7z.b) || (z7zVarG instanceof z7z.a)) && !this.outcomesInVerticalOrientation.contains(next.id)) {
                        ((ViewGroup.MarginLayoutParams) layoutParams4).height = this.itemView.getResources().getDimensionPixelSize(R.dimen.flash_boost_simple_market_outcome_height);
                        OutcomeButton outcomeButton = outcomeViewCreateOutcomeView.ob1;
                        outcomeButton.setPadding(outcomeButton.getPaddingLeft(), 0, outcomeViewCreateOutcomeView.ob1.getPaddingRight(), 0);
                        OutcomeButton outcomeButton2 = outcomeViewCreateOutcomeView.ob2;
                        outcomeButton2.setPadding(outcomeButton2.getPaddingLeft(), 0, outcomeViewCreateOutcomeView.ob2.getPaddingRight(), 0);
                    }
                    kuh.b(outcomeViewCreateOutcomeView, z7zVarG, next.odds, this.grid.getParent() instanceof ViewGroup ? (ViewGroup) this.grid.getParent() : null, ku1.a, this.market.isLive());
                    this.callback.f(this.event, this.market, z7zVarG);
                    this.grid.addView(outcomeViewCreateOutcomeView, layoutParams4);
                    f = f2;
                    i5 = i6;
                    arrayList2 = arrayList4;
                    arrayList = arrayList3;
                    size = i7;
                    it = it2;
                }
            } else {
                int i8 = 0;
                while (i8 < size) {
                    StringBuilder sbA = y4s.a(str3);
                    sbA.append((String) arrayList2.get(i8));
                    Outcome outcome2 = (Outcome) map2.get(sbA.toString());
                    int i9 = i8;
                    HashMap map3 = map2;
                    int i10 = measuredHeight;
                    OutcomeButton outcomeButtonCreateOutcomeButton = createOutcomeButton(this.ctx, this.layoutConfig, this.event, this.sportRule, this.market, outcome2, true, this);
                    GridLayout.LayoutParams layoutParams5 = new GridLayout.LayoutParams();
                    if (size >= 4) {
                        ((ViewGroup.MarginLayoutParams) layoutParams5).width = zch0.a(this.ctx, 60);
                    }
                    if (this.sportRule.w(this.market.id) || this.sportRule.o(this.market.id) || this.sportRule.b(this.market.id) || this.sportRule.m(this.market.id) || this.sportRule.i(this.market.id)) {
                        ((ViewGroup.MarginLayoutParams) layoutParams5).width = zch0.a(this.ctx, 240 / size);
                    }
                    ((ViewGroup.MarginLayoutParams) layoutParams5).height = -2;
                    ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = this.leftMargin;
                    ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = this.topMargin;
                    layoutParams5.a(112);
                    if (outcome2 != null) {
                        z7z z7zVarG2 = this.callback.g(this.event, this.market, outcome2);
                        if ((z7zVarG2 instanceof z7z.b) || (z7zVarG2 instanceof z7z.a)) {
                            ((ViewGroup.MarginLayoutParams) layoutParams5).height = this.itemView.getResources().getDimensionPixelSize(R.dimen.flash_boost_simple_market_outcome_height);
                            outcomeButtonCreateOutcomeButton.setPadding(outcomeButtonCreateOutcomeButton.getPaddingLeft(), 0, outcomeButtonCreateOutcomeButton.getPaddingRight(), 0);
                        }
                        kuh.a(outcomeButtonCreateOutcomeButton, z7zVarG2, outcome2.odds, this.grid.getParent() instanceof ViewGroup ? (ViewGroup) this.grid.getParent() : null, ku1.a, this.market.isLive());
                        this.callback.f(this.event, this.market, z7zVarG2);
                    }
                    this.grid.addView(outcomeButtonCreateOutcomeButton, layoutParams5);
                    i8 = i9 + 1;
                    measuredHeight = i10;
                    map2 = map3;
                    c3 = 1033;
                }
                map = map2;
                int i11 = measuredHeight;
                c = 2;
                if (z) {
                    boolean zB = this.callback.b();
                    Context context2 = this.ctx;
                    VisibleMarketViewHolder.b bVar2 = this.layoutConfig;
                    Event event = this.event;
                    Market market = this.market;
                    OutcomeView outcomeViewCreateJokerOutcomeView = createJokerOutcomeView(context2, bVar2, event, market, market.jokerOutcome, zB, this);
                    GridLayout.g gVar3 = GridLayout.O;
                    GridLayout.LayoutParams layoutParams6 = new GridLayout.LayoutParams(GridLayout.l(Integer.MIN_VALUE, 1, gVar3, 0.0f), GridLayout.l(1, this.market.outcomes.size(), gVar3, 1.0f));
                    if (size >= 4) {
                        ((ViewGroup.MarginLayoutParams) layoutParams6).width = zch0.a(this.ctx, 60);
                    }
                    if (this.sportRule.w(this.market.id) || this.sportRule.o(this.market.id) || this.sportRule.b(this.market.id) || this.sportRule.m(this.market.id) || this.sportRule.i(this.market.id)) {
                        ((ViewGroup.MarginLayoutParams) layoutParams6).width = zch0.a(this.ctx, 240 / size);
                    }
                    ((ViewGroup.MarginLayoutParams) layoutParams6).height = i11;
                    ((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin = this.leftMargin;
                    ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = this.topMargin;
                    this.grid.addView(outcomeViewCreateJokerOutcomeView, layoutParams6);
                }
            }
            arrayList2 = arrayList2;
            i3 = i4;
            arrayList = arrayList;
            c2 = c;
            size = size;
            map2 = map;
            r12 = 1;
            r15 = 0;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view instanceof OutcomeButton) {
            onOutcomeButtonClick((OutcomeButton) view);
            return;
        }
        if (view instanceof OutcomeView) {
            onOutcomeViewClick((OutcomeView) view);
            return;
        }
        int id = view.getId();
        if (id == R.id.title_container) {
            this.callback.F(this.market, getAdapterPosition());
            return;
        }
        if (id == R.id.info) {
            this.callback.o((Market) view.getTag());
        } else if (id == R.id.boost_sign) {
            openOddsBoostPage();
        } else if (id == R.id.fav) {
            this.callback.q(this.market);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        return true;
    }
}
