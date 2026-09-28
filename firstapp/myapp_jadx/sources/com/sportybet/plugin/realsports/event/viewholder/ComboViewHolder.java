package com.sportybet.plugin.realsports.event.viewholder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.gridlayout.widget.GridLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import defpackage.ku1;
import defpackage.kuh;
import defpackage.tru;
import defpackage.uf80;
import defpackage.y4s;
import defpackage.z7z;
import defpackage.zch0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ComboViewHolder extends VisibleMarketViewHolder implements View.OnClickListener, View.OnLongClickListener {
    private final ImageView boostSignView;
    private final RelativeLayout container;
    private final ImageView descImg;
    private final ImageButton favour;
    private final GridLayout grid;
    private final TextView title;

    public ComboViewHolder(View view, VisibleMarketViewHolder.a aVar) {
        super(view, aVar, new HashSet());
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
    }

    @Override // com.sportybet.plugin.realsports.event.viewholder.VisibleMarketViewHolder
    public void onBindView() {
        char c;
        int i;
        float f;
        int i2;
        String string;
        RelativeLayout relativeLayout = this.container;
        this.layoutConfig.getClass();
        relativeLayout.setBackgroundColor(0);
        this.title.setTextColor(this.layoutConfig.a);
        TextView textView = this.title;
        Market market = this.market;
        HashSet hashSet = tru.a;
        textView.setText(market.desc);
        ImageButton imageButton = this.favour;
        VisibleMarketViewHolder.b bVar = this.layoutConfig;
        Context context = this.ctx;
        boolean zA = this.callback.A(this.market);
        bVar.getClass();
        imageButton.setImageDrawable(VisibleMarketViewHolder.b.a(context, zA));
        boolean zIsVirtualSoccer = this.event.isVirtualSoccer();
        ImageButton imageButton2 = this.favour;
        if (zIsVirtualSoccer) {
            imageButton2.setVisibility(8);
        } else {
            imageButton2.setVisibility(0);
        }
        this.boostSignView.setVisibility((this.callback.B() && VisibleMarketViewHolder.isBoostEvent(this.event, this.market, this.callback.D(), false)) ? 0 : 8);
        this.descImg.setTag(this.market);
        boolean zY = this.callback.y(this.market);
        TextView textView2 = this.title;
        int i3 = 1;
        if (zY) {
            textView2.setCompoundDrawablesWithIntrinsicBounds(getCollapsedStatusDrawable(true), (Drawable) null, (Drawable) null, (Drawable) null);
            this.grid.setVisibility(8);
            return;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(getCollapsedStatusDrawable(false), (Drawable) null, (Drawable) null, (Drawable) null);
        this.grid.setVisibility(0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        LinkedList<Outcome> linkedList = new LinkedList();
        HashMap map = new HashMap();
        List<Outcome> list = this.market.outcomes;
        char c2 = 2;
        if (list != null) {
            for (Outcome outcome : list) {
                String[] strArrSplit = outcome.desc.split(this.sportRule.y());
                if (strArrSplit.length == 2) {
                    if (!arrayList.contains(strArrSplit[0])) {
                        arrayList.add(strArrSplit[0]);
                    }
                    if (!arrayList2.contains(strArrSplit[1])) {
                        arrayList2.add(strArrSplit[1]);
                    }
                    map.put(strArrSplit[0] + strArrSplit[1], outcome);
                } else {
                    linkedList.add(outcome);
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList2.size();
        boolean z = size < size2;
        if (z) {
            arrayList2 = arrayList;
            arrayList = arrayList2;
        } else {
            size = size2;
        }
        this.grid.removeAllViews();
        this.grid.setRowCount(linkedList.size() + arrayList.size() + 1);
        this.grid.setColumnCount(arrayList2.size() + 1);
        this.grid.addView(new Space(this.ctx));
        int size3 = arrayList2.size();
        int i4 = 0;
        while (true) {
            c = 'd';
            i = 17;
            if (i4 >= size3) {
                break;
            }
            Object obj = arrayList2.get(i4);
            i4++;
            TextView textView3 = new TextView(this.ctx);
            textView3.setTextColor(this.layoutConfig.b);
            textView3.setTextSize(12.0f);
            textView3.setText((String) obj);
            textView3.setMaxWidth(zch0.a(this.ctx, 100));
            textView3.setGravity(17);
            GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
            layoutParams.a(17);
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = this.leftMargin;
            this.grid.addView(textView3, layoutParams);
        }
        int size4 = arrayList.size();
        int i5 = 0;
        while (true) {
            f = 0.0f;
            i2 = Integer.MIN_VALUE;
            if (i5 >= size4) {
                break;
            }
            int i6 = i5 + 1;
            String str = (String) arrayList.get(i5);
            char c3 = c2;
            TextView textView4 = new TextView(this.ctx);
            textView4.setTextColor(this.layoutConfig.b);
            textView4.setBackgroundResource(this.layoutConfig.c);
            textView4.setText(str);
            int i7 = this.padding;
            textView4.setPadding(i7, i7, i7, i7);
            textView4.setGravity(i);
            GridLayout.g gVar = GridLayout.O;
            GridLayout.LayoutParams layoutParams2 = new GridLayout.LayoutParams(GridLayout.l(Integer.MIN_VALUE, i3, gVar, 0.0f), GridLayout.l(Integer.MIN_VALUE, i3, gVar, 1.0f));
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = this.topMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = i3;
            this.grid.addView(textView4, layoutParams2);
            int i8 = 0;
            while (i8 < size) {
                if (z) {
                    string = uf80.a(new StringBuilder(), (String) arrayList2.get(i8), str);
                } else {
                    StringBuilder sbA = y4s.a(str);
                    sbA.append((String) arrayList2.get(i8));
                    string = sbA.toString();
                }
                Outcome outcome2 = (Outcome) map.get(string);
                ArrayList arrayList3 = arrayList;
                ArrayList arrayList4 = arrayList2;
                int i9 = size;
                String str2 = str;
                int i10 = i8;
                OutcomeButton outcomeButtonCreateOutcomeButton = createOutcomeButton(this.ctx, this.layoutConfig, this.event, this.sportRule, this.market, outcome2, false, this);
                GridLayout.LayoutParams layoutParams3 = new GridLayout.LayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams3).width = zch0.a(this.ctx, 100);
                ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = this.leftMargin;
                ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = this.topMargin;
                this.grid.addView(outcomeButtonCreateOutcomeButton, layoutParams3);
                if (outcome2 != null) {
                    z7z z7zVarG = this.callback.g(this.event, this.market, outcome2);
                    kuh.a(outcomeButtonCreateOutcomeButton, z7zVarG, outcome2.odds, this.grid.getParent() instanceof ViewGroup ? (ViewGroup) this.grid.getParent() : null, ku1.b, this.market.isLive());
                    this.callback.f(this.event, this.market, z7zVarG);
                }
                i8 = i10 + 1;
                size = i9;
                str = str2;
                arrayList = arrayList3;
                arrayList2 = arrayList4;
            }
            i5 = i6;
            c2 = c3;
            c = 'd';
            i = 17;
            i3 = 1;
        }
        int i11 = i;
        float f2 = 1.0f;
        int i12 = size;
        char c4 = c;
        for (Outcome outcome3 : linkedList) {
            TextView textView5 = new TextView(this.ctx);
            textView5.setTextColor(this.layoutConfig.b);
            textView5.setBackgroundResource(this.layoutConfig.c);
            textView5.setText(outcome3.desc);
            int i13 = this.padding;
            textView5.setPadding(i13, i13, i13, i13);
            textView5.setGravity(i11);
            GridLayout.g gVar2 = GridLayout.O;
            GridLayout.LayoutParams layoutParams4 = new GridLayout.LayoutParams(GridLayout.l(i2, 1, gVar2, f), GridLayout.l(i2, 1, gVar2, f2));
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = this.topMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams4).width = 1;
            this.grid.addView(textView5, layoutParams4);
            float f3 = f2;
            float f4 = f;
            int i14 = i2;
            char c5 = c4;
            OutcomeButton outcomeButtonCreateOutcomeButton2 = createOutcomeButton(this.ctx, this.layoutConfig, this.event, this.sportRule, this.market, outcome3, false, this);
            GridLayout.LayoutParams layoutParams5 = new GridLayout.LayoutParams();
            layoutParams5.b = GridLayout.l(i14, i12, GridLayout.F, f4);
            ((ViewGroup.MarginLayoutParams) layoutParams5).width = zch0.a(this.ctx, (this.leftMargin / 2) + (i12 * 100));
            ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = this.leftMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = this.topMargin;
            this.grid.addView(outcomeButtonCreateOutcomeButton2, layoutParams5);
            z7z z7zVarG2 = this.callback.g(this.event, this.market, outcome3);
            kuh.a(outcomeButtonCreateOutcomeButton2, z7zVarG2, outcome3.odds, this.grid.getParent() instanceof ViewGroup ? (ViewGroup) this.grid.getParent() : null, ku1.b, this.market.isLive());
            this.callback.f(this.event, this.market, z7zVarG2);
            i2 = i14;
            f = f4;
            f2 = f3;
            c4 = c5;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view instanceof OutcomeButton) {
            onOutcomeButtonClick((OutcomeButton) view);
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
