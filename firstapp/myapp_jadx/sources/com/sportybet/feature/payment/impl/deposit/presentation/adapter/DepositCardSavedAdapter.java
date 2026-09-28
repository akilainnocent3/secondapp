package com.sportybet.feature.payment.impl.deposit.presentation.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sporty.android.core.model.pocket.common.AssetData;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.deposit.presentation.adapter.DepositCardSavedAdapter;
import defpackage.abn;
import defpackage.atd;
import defpackage.bqe;
import defpackage.e440;
import defpackage.jsd;
import defpackage.kg6;
import defpackage.m9n;
import defpackage.nan;
import defpackage.qw90;
import defpackage.tud;
import defpackage.usd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/sportybet/feature/payment/impl/deposit/presentation/adapter/DepositCardSavedAdapter;", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lkg6;", "Lcom/sportybet/feature/payment/impl/deposit/presentation/adapter/DepositCardSavedAdapter$ViewHolder;", "<init>", "()V", "viewHolder", "cardItem", "", "convert", "(Lcom/sportybet/feature/payment/impl/deposit/presentation/adapter/DepositCardSavedAdapter$ViewHolder;Lkg6;)V", "ViewHolder", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DepositCardSavedAdapter extends BaseQuickAdapter<kg6, ViewHolder> {
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/sportybet/feature/payment/impl/deposit/presentation/adapter/DepositCardSavedAdapter$ViewHolder;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lkg6;", "cardItem", "", "setData", "(Lkg6;)V", "Landroid/widget/ImageView;", "cardSelect", "Landroid/widget/ImageView;", "cardIcon", "Landroid/widget/TextView;", "cardInfo", "Landroid/widget/TextView;", "defaultLabel", "Landroid/view/View;", "moreIcon", "expiredLabel", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ViewHolder extends BaseViewHolder {
        public static final int $stable = 8;
        private final ImageView cardIcon;
        private final TextView cardInfo;
        private final ImageView cardSelect;
        private final View defaultLabel;
        private final TextView expiredLabel;
        private final ImageView moreIcon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            view.getClass();
            View viewFindViewById = view.findViewById(R.id.card_checkbox);
            viewFindViewById.getClass();
            this.cardSelect = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.card_icon);
            viewFindViewById2.getClass();
            this.cardIcon = (ImageView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.card_info);
            viewFindViewById3.getClass();
            this.cardInfo = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.default_label);
            viewFindViewById4.getClass();
            this.defaultLabel = viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R.id.icon_more);
            viewFindViewById5.getClass();
            this.moreIcon = (ImageView) viewFindViewById5;
            View viewFindViewById6 = view.findViewById(R.id.expired_label);
            viewFindViewById6.getClass();
            this.expiredLabel = (TextView) viewFindViewById6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void setData$lambda$1(kg6 kg6Var, View view) {
            AssetData.CardsBean cardsBean;
            if (((kg6Var == null || (cardsBean = kg6Var.a) == null) ? false : Intrinsics.g(cardsBean.isExpired(), Boolean.TRUE)) || kg6Var == null) {
                return;
            }
            tud tudVar = kg6Var.c.a;
            tudVar.G0.setValue(kg6Var.a);
            tudVar.R1(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:17:0x0086  */
        public static final void setData$lambda$2(final kg6 kg6Var, ViewHolder viewHolder, View view) {
            if (kg6Var != null) {
                usd.j.a aVar = kg6Var.c;
                ImageView imageView = viewHolder.moreIcon;
                final usd usdVar = aVar.b;
                if (imageView != null) {
                    AssetData.CardsBean cardsBean = kg6Var.a;
                    Object systemService = imageView.getContext().getSystemService("layout_inflater");
                    systemService.getClass();
                    View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.popup_deposit_card_actions, (ViewGroup) null);
                    viewInflate.getClass();
                    usdVar.i0 = new PopupWindow(viewInflate, -2, -2, true);
                    int[] iArr = new int[2];
                    imageView.getLocationInWindow(iArr);
                    PopupWindow popupWindow = usdVar.i0;
                    if (popupWindow != null) {
                        popupWindow.showAtLocation(imageView, 8388661, bqe.a(20.0f), imageView.getHeight() + iArr[1]);
                    }
                    TextView textView = (TextView) viewInflate.findViewById(R.id.action_set_default);
                    TextView textView2 = (TextView) viewInflate.findViewById(R.id.action_delete);
                    View viewFindViewById = viewInflate.findViewById(R.id.loading_mask);
                    int i = 0;
                    if (cardsBean != null ? Intrinsics.g(cardsBean.isDefault(), Boolean.TRUE) : false) {
                        textView.getClass();
                        textView.setVisibility(8);
                    } else {
                        if (cardsBean != null ? Intrinsics.g(cardsBean.isExpired(), Boolean.TRUE) : false) {
                            textView.getClass();
                            textView.setVisibility(8);
                        }
                    }
                    textView.setOnClickListener(new jsd(i, usdVar, kg6Var));
                    textView2.setOnClickListener(new View.OnClickListener() { // from class: ksd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            tud tudVarP0 = usdVar.P0();
                            ej5.c(o8i0.d(tudVarP0), null, null, new gtd(null, tudVarP0, kg6Var.a), 3);
                        }
                    });
                    viewFindViewById.setOnClickListener(new e440());
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:39:0x009e  */
        public final void setData(final kg6 cardItem) {
            int i;
            AssetData.CardsBean cardsBean;
            AssetData.CardsBean cardsBean2;
            AssetData.CardsBean cardsBean3;
            int i2 = 0;
            boolean zG = (cardItem == null || (cardsBean3 = cardItem.a) == null) ? false : Intrinsics.g(cardsBean3.isExpired(), Boolean.TRUE);
            this.cardSelect.setVisibility((cardItem == null || !cardItem.b) ? 4 : 0);
            this.expiredLabel.setVisibility(zG ? 0 : 4);
            this.itemView.setBackgroundResource(zG ? R.color.background_type1_primary : R.color.background_general_primary);
            if (cardItem != null && (cardsBean2 = cardItem.a) != null) {
                ImageView imageView = this.cardIcon;
                String cardBrandIconUrl = cardsBean2.getCardBrandIconUrl();
                m9n m9nVarA = qw90.a(imageView.getContext());
                nan.a aVar = new nan.a(imageView.getContext());
                aVar.c = cardBrandIconUrl;
                abn.f(aVar, imageView);
                abn.e(aVar, R.drawable.icon_default);
                abn.b(aVar, R.drawable.icon_default);
                m9nVarA.a(aVar.a());
                this.cardInfo.setText(cardsBean2.getCardNumber());
            }
            View view = this.defaultLabel;
            if ((cardItem == null || (cardsBean = cardItem.a) == null) ? false : Intrinsics.g(cardsBean.isDefault(), Boolean.TRUE)) {
                AssetData.CardsBean cardsBean4 = cardItem.a;
                if (cardsBean4 != null ? Intrinsics.g(cardsBean4.isExpired(), Boolean.TRUE) : false) {
                    i = 8;
                } else {
                    i = 0;
                }
            } else {
                i = 8;
            }
            view.setVisibility(i);
            this.itemView.setOnClickListener(new atd(cardItem, i2));
            this.moreIcon.setOnClickListener(new View.OnClickListener(this) { // from class: btd
                public final /* synthetic */ DepositCardSavedAdapter.ViewHolder b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DepositCardSavedAdapter.ViewHolder.setData$lambda$2(cardItem, this.b, view2);
                }
            });
        }
    }

    public DepositCardSavedAdapter() {
        super(R.layout.item_deposit_card_saved, null);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(ViewHolder viewHolder, kg6 cardItem) {
        viewHolder.getClass();
        cardItem.getClass();
        viewHolder.setData(cardItem);
    }
}
