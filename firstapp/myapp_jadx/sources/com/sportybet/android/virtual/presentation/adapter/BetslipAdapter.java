package com.sportybet.android.virtual.presentation.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.virtual.presentation.component.BetslipViewHolder;
import defpackage.bmo;
import defpackage.bq3;
import defpackage.ji2;
import defpackage.jpk;
import defpackage.sqo;
import defpackage.tlo;
import defpackage.uy0;
import java.math.BigDecimal;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class BetslipAdapter extends BaseQuickAdapter<bq3, BetslipViewHolder> {
    public static final String PAYLOAD_AMOUNT = "payload_amount";
    public static final String PAYLOAD_KEYBOARD = "payload_keyboard";
    public final uy0 assetsInfoRepository;
    private final ji2 betBuilderUtil;
    public final jpk giftManager;
    public final tlo instantWinSharedData;
    public final bmo instantWinSportRepo;

    public BetslipAdapter(ji2 ji2Var, tlo tloVar, uy0 uy0Var, jpk jpkVar, bmo bmoVar) {
        super(R.layout.iwqk_layout_betslip_item, null);
        this.betBuilderUtil = ji2Var;
        this.instantWinSharedData = tloVar;
        this.assetsInfoRepository = uy0Var;
        this.giftManager = jpkVar;
        this.instantWinSportRepo = bmoVar;
        setHasStableIds(true);
    }

    public void convert(BetslipViewHolder betslipViewHolder, bq3 bq3Var, List<?> list) {
        if (list.isEmpty()) {
            convert(betslipViewHolder, bq3Var);
            return;
        }
        if (list.contains(PAYLOAD_KEYBOARD)) {
            betslipViewHolder.updateKeyboardVisibility(bq3Var.k);
        }
        if (list.contains(PAYLOAD_AMOUNT)) {
            betslipViewHolder.updateAmountOnly(bq3Var, this.instantWinSharedData, this.assetsInfoRepository, this.giftManager);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.f
    public long getItemId(int i) {
        bq3 item = getItem(i);
        if (item == null) {
            return super.getItemId(i);
        }
        BigDecimal bigDecimal = sqo.a;
        return sqo.b(item.b, item.c, item.d).hashCode();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public /* bridge */ /* synthetic */ void convert(BaseViewHolder baseViewHolder, bq3 bq3Var, List list) {
        convert((BetslipViewHolder) baseViewHolder, bq3Var, (List<?>) list);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BetslipViewHolder betslipViewHolder, bq3 bq3Var) {
        betslipViewHolder.setData(bq3Var, getFooterLayoutCount(), getItemCount(), this.betBuilderUtil, this.instantWinSharedData, this.assetsInfoRepository, this.giftManager, this.instantWinSportRepo);
    }
}
