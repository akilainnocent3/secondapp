package com.sportybet.android.instantwin.presentation.event.adapter;

import com.chad.library.adapter.base.BaseNodeAdapter;
import com.chad.library.adapter.base.entity.node.BaseNode;
import defpackage.dyu;
import defpackage.eyu;
import defpackage.fyu;
import defpackage.mpg;
import defpackage.ogo;
import defpackage.p2s;
import defpackage.spu;
import defpackage.uho;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class MatchEventAdapter extends BaseNodeAdapter {
    private ogo appliedOddsFilter;

    public MatchEventAdapter() {
        super(null);
        addNodeProvider(new fyu());
        addNodeProvider(new eyu(new dyu(this, 0)));
    }

    private int getFirstMatchingIndex() {
        spu spuVar;
        List<BaseNode> data = getData();
        if (data != null && !data.isEmpty() && this.appliedOddsFilter != null) {
            for (int i = 0; i < data.size(); i++) {
                BaseNode baseNode = data.get(i);
                if ((baseNode instanceof mpg) && (spuVar = ((mpg) baseNode).k) != null && uho.a(spuVar, this.appliedOddsFilter)) {
                    return i;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ogo lambda$new$0() {
        return this.appliedOddsFilter;
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
        return baseNode instanceof mpg ? 1 : -1;
    }

    public void setNewData(List<BaseNode> list, ogo ogoVar) {
        this.appliedOddsFilter = ogoVar;
        setList(list);
    }
}
