package com.sportybet.android.instantwin.presentation.eventdetails.adapter;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.widget.InteractiveMarketPanel;
import com.sportybet.android.instantwin.presentation.widget.viewholder.ComboMarketViewHolder;
import com.sportybet.android.instantwin.presentation.widget.viewholder.GeneralMarketViewHolder;
import com.sportybet.android.instantwin.presentation.widget.viewholder.HandicapMarketViewHolder;
import com.sportybet.android.instantwin.presentation.widget.viewholder.InteractiveMarketViewHolder;
import com.sportybet.android.instantwin.presentation.widget.viewholder.MultipleRowsMarketViewHolder;
import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import defpackage.dqu;
import defpackage.dwi;
import defpackage.o0v;
import defpackage.ogo;
import defpackage.spu;
import defpackage.uho;
import defpackage.y1v;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public class MatchEventDetailAdapter extends BaseMultiItemQuickAdapter<dqu, BaseViewHolder> {
    private ogo appliedOddsFilter;
    private o0v matchEventDetailCollapseListener;
    private y1v matchEventDetailMarketInfoClickListener;
    private final InteractiveMarketPanel.a sliderDelegate;

    public class a implements InteractiveMarketPanel.a {
        public final HashMap<String, Pair<Integer, Integer>> a = new HashMap<>();
    }

    public MatchEventDetailAdapter() {
        super(null);
        this.matchEventDetailCollapseListener = null;
        this.matchEventDetailMarketInfoClickListener = null;
        this.sliderDelegate = new a();
        addItemType(0, R.layout.iwqk_layout_general_market_item);
        addItemType(1, R.layout.iwqk_layout_combo_rows_market_item);
        addItemType(2, R.layout.iwqk_layout_multiple_rows_market_item);
        addItemType(3, R.layout.iwqk_layout_interactive_market_item);
        addItemType(4, R.layout.iwqk_layout_handicap_rows_market_item);
    }

    private int getFirstMatchingIndex() {
        List<T> data = getData();
        if (data != 0 && !data.isEmpty() && this.appliedOddsFilter != null) {
            for (int i = 0; i < data.size(); i++) {
                dqu dquVar = (dqu) data.get(i);
                spu spuVar = dquVar.d;
                if (spuVar == null || !uho.a(spuVar, this.appliedOddsFilter)) {
                    List<spu> list = dquVar.e;
                    if (list != null) {
                        Iterator<spu> it = list.iterator();
                        while (it.hasNext()) {
                            if (uho.a(it.next(), this.appliedOddsFilter)) {
                            }
                        }
                    }
                }
                return i;
            }
        }
        return -1;
    }

    public int applyOddsFilter(ogo ogoVar) {
        this.appliedOddsFilter = ogoVar;
        notifyDataSetChanged();
        return getFirstMatchingIndex();
    }

    public void setCollapsed(Boolean bool, String str) {
        for (int i = 0; i < getData().size(); i++) {
            dqu dquVar = (dqu) getData().get(i);
            if (dquVar.c.equals(str)) {
                dquVar.i = bool;
                return;
            }
        }
    }

    public void setMatchEventDetailCollapseListener(o0v o0vVar) {
        this.matchEventDetailCollapseListener = o0vVar;
    }

    public void setMatchEventDetailMarketInfoClickListener(y1v y1vVar) {
        this.matchEventDetailMarketInfoClickListener = y1vVar;
    }

    public void setNewData(List<dqu> list, ogo ogoVar) {
        this.appliedOddsFilter = ogoVar;
        setList(list);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, dqu dquVar) {
        int i = dquVar.a;
        if (i == 0) {
            GeneralMarketViewHolder generalMarketViewHolder = (GeneralMarketViewHolder) baseViewHolder.itemView.getTag();
            if (generalMarketViewHolder == null) {
                generalMarketViewHolder = new GeneralMarketViewHolder(baseViewHolder.itemView);
                baseViewHolder.itemView.setTag(generalMarketViewHolder);
            }
            generalMarketViewHolder.setMatchEventDetailCollapseListener(this.matchEventDetailCollapseListener);
            generalMarketViewHolder.setMatchEventDetailMarketInfoClickListener(this.matchEventDetailMarketInfoClickListener);
            generalMarketViewHolder.setData(dquVar, this.appliedOddsFilter);
            return;
        }
        if (i == 1) {
            ComboMarketViewHolder comboMarketViewHolder = (ComboMarketViewHolder) baseViewHolder.itemView.getTag();
            if (comboMarketViewHolder == null) {
                comboMarketViewHolder = new ComboMarketViewHolder(baseViewHolder.itemView);
                baseViewHolder.itemView.setTag(comboMarketViewHolder);
            }
            comboMarketViewHolder.setMatchEventDetailCollapseListener(this.matchEventDetailCollapseListener);
            comboMarketViewHolder.setMatchEventDetailMarketInfoClickListener(this.matchEventDetailMarketInfoClickListener);
            comboMarketViewHolder.setData(dquVar, this.appliedOddsFilter);
            return;
        }
        if (i == 2) {
            MultipleRowsMarketViewHolder multipleRowsMarketViewHolder = (MultipleRowsMarketViewHolder) baseViewHolder.itemView.getTag();
            if (multipleRowsMarketViewHolder == null) {
                multipleRowsMarketViewHolder = new MultipleRowsMarketViewHolder(baseViewHolder.itemView);
                baseViewHolder.itemView.setTag(multipleRowsMarketViewHolder);
            }
            multipleRowsMarketViewHolder.setMatchEventDetailCollapseListener(this.matchEventDetailCollapseListener);
            multipleRowsMarketViewHolder.setMatchEventDetailMarketInfoClickListener(this.matchEventDetailMarketInfoClickListener);
            multipleRowsMarketViewHolder.setData(dquVar, this.appliedOddsFilter);
            return;
        }
        if (i == 3) {
            InteractiveMarketViewHolder interactiveMarketViewHolder = (InteractiveMarketViewHolder) baseViewHolder.itemView.getTag();
            if (interactiveMarketViewHolder == null) {
                interactiveMarketViewHolder = new InteractiveMarketViewHolder(baseViewHolder.itemView);
                baseViewHolder.itemView.setTag(interactiveMarketViewHolder);
            }
            interactiveMarketViewHolder.setMatchEventDetailCollapseListener(this.matchEventDetailCollapseListener);
            interactiveMarketViewHolder.setMatchEventDetailMarketInfoClickListener(this.matchEventDetailMarketInfoClickListener);
            interactiveMarketViewHolder.setData(dquVar, this.sliderDelegate, this.appliedOddsFilter);
            return;
        }
        if (i != 4) {
            dwi.a(dquVar.a, rarBonoqWB.jHNxgu);
            return;
        }
        HandicapMarketViewHolder handicapMarketViewHolder = (HandicapMarketViewHolder) baseViewHolder.itemView.getTag();
        if (handicapMarketViewHolder == null) {
            handicapMarketViewHolder = new HandicapMarketViewHolder(baseViewHolder.itemView);
            baseViewHolder.itemView.setTag(handicapMarketViewHolder);
        }
        handicapMarketViewHolder.setMatchEventDetailCollapseListener(this.matchEventDetailCollapseListener);
        handicapMarketViewHolder.setMatchEventDetailMarketInfoClickListener(this.matchEventDetailMarketInfoClickListener);
        handicapMarketViewHolder.setData(dquVar, this.appliedOddsFilter);
    }
}
