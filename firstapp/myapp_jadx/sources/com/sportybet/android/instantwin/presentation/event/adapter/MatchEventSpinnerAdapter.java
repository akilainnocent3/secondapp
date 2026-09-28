package com.sportybet.android.instantwin.presentation.event.adapter;

import com.chad.library.adapter.base.BaseNodeAdapter;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.sportybet.android.instantwin.newtork.model.response.MarketType;
import defpackage.c5v;
import defpackage.crg;
import defpackage.d5v;
import defpackage.e5v;
import defpackage.ej5;
import defpackage.g5v;
import defpackage.ie8;
import defpackage.je8;
import defpackage.le8;
import defpackage.o8i0;
import defpackage.ogo;
import defpackage.p2s;
import defpackage.spu;
import defpackage.tlo;
import defpackage.uho;
import defpackage.ujo;
import defpackage.vjo;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public class MatchEventSpinnerAdapter extends BaseNodeAdapter {
    private ogo appliedOddsFilter;
    private MarketType marketType;
    private int selectedIndex;
    private final List<String> specifierList;
    private vjo winQuickBetViewViewModel;

    public MatchEventSpinnerAdapter(tlo tloVar) {
        super(null);
        this.selectedIndex = -1;
        this.specifierList = new ArrayList();
        addNodeProvider(new g5v(new ie8(this, 1), new je8(this, 2), new c5v(this, 0)));
        addNodeProvider(new e5v(tloVar, new le8(this, 1)));
    }

    private int getFirstMatchingIndex() {
        ArrayList arrayList;
        List<BaseNode> data = getData();
        if (data == null || data.isEmpty() || this.appliedOddsFilter == null) {
            return -1;
        }
        for (int i = 0; i < data.size(); i++) {
            BaseNode baseNode = data.get(i);
            if ((baseNode instanceof crg) && (arrayList = ((crg) baseNode).b) != null) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    spu spuVar = (spu) obj;
                    if (spuVar != null && uho.a(spuVar, this.appliedOddsFilter)) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$new$0() {
        return this.specifierList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$new$1() {
        return Integer.valueOf(this.selectedIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Unit lambda$new$2(Integer num) {
        if (this.selectedIndex != num.intValue()) {
            this.selectedIndex = num.intValue();
            vjo vjoVar = this.winQuickBetViewViewModel;
            if (vjoVar != null) {
                MarketType marketType = this.marketType;
                String str = this.specifierList.get(num.intValue());
                marketType.getClass();
                str.getClass();
                ej5.c(o8i0.d(vjoVar), null, null, new ujo(marketType, vjoVar, str, null), 3);
            }
            syncSpinnerIndex(getData(), num.intValue());
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ogo lambda$new$3() {
        return this.appliedOddsFilter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$prepareSpecifierList$4(String str, String str2) {
        try {
            return Double.compare(Double.parseDouble(str), Double.parseDouble(str2));
        } catch (NumberFormatException unused) {
            System.err.println("Skipping invalid number: " + str + " or " + str2);
            return 0;
        }
    }

    private void prepareSpecifierList(LinkedHashSet<String> linkedHashSet) {
        this.specifierList.clear();
        this.specifierList.addAll(linkedHashSet);
        this.specifierList.sort(new d5v());
        this.specifierList.add(0, "near");
        this.specifierList.add(1, "far");
    }

    private void syncSpinnerIndex(List<BaseNode> list, int i) {
        for (BaseNode baseNode : list) {
            if (baseNode instanceof crg) {
                ((crg) baseNode).a(i, this.specifierList.get(i));
            } else if (baseNode instanceof p2s) {
                syncSpinnerIndexForLeagueItem(((p2s) baseNode).e, i);
            }
        }
        notifyDataSetChanged();
    }

    private void syncSpinnerIndexForLeagueItem(List<BaseNode> list, int i) {
        if (list != null) {
            for (BaseNode baseNode : list) {
                if (baseNode instanceof crg) {
                    ((crg) baseNode).a(i, this.specifierList.get(i));
                }
            }
        }
    }

    public int applyOddsFilter(ogo ogoVar) {
        this.appliedOddsFilter = ogoVar;
        notifyDataSetChanged();
        return getFirstMatchingIndex();
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    public int getItemType(List<? extends BaseNode> list, int i) {
        BaseNode baseNode = list.get(i);
        if (baseNode instanceof p2s) {
            return 0;
        }
        return baseNode instanceof crg ? 1 : -1;
    }

    public void setMarketSpecifierData(MarketType marketType, String str, LinkedHashSet<String> linkedHashSet, List<BaseNode> list, ogo ogoVar, vjo vjoVar) {
        prepareSpecifierList(linkedHashSet);
        this.marketType = marketType;
        this.selectedIndex = this.specifierList.indexOf(str);
        this.appliedOddsFilter = ogoVar;
        this.winQuickBetViewViewModel = vjoVar;
        setList(list);
    }
}
