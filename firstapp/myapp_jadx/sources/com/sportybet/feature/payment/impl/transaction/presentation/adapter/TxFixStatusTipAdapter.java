package com.sportybet.feature.payment.impl.transaction.presentation.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chad.library.adapter.base.BaseNodeAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.entity.node.BaseNode;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.transaction.presentation.adapter.TxFixStatusTipAdapter;
import defpackage.a5d;
import defpackage.abn;
import defpackage.aqa0;
import defpackage.bmy;
import defpackage.dke0;
import defpackage.h5e;
import defpackage.hke0;
import defpackage.ltr;
import defpackage.m9n;
import defpackage.mtr;
import defpackage.nae0;
import defpackage.nan;
import defpackage.qw90;
import defpackage.r5h0;
import defpackage.s5h0;
import defpackage.t5h0;
import defpackage.u2z;
import defpackage.wr5;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/sportybet/feature/payment/impl/transaction/presentation/adapter/TxFixStatusTipAdapter;", "Lcom/chad/library/adapter/base/BaseNodeAdapter;", "<init>", "()V", "", "position", "", "toggle", "(I)V", "", "Lcom/chad/library/adapter/base/entity/node/BaseNode;", "data", "getItemType", "(Ljava/util/List;I)I", "a", "TitleViewHolder", "DetailViewHolder", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TxFixStatusTipAdapter extends BaseNodeAdapter {
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/sportybet/feature/payment/impl/transaction/presentation/adapter/TxFixStatusTipAdapter$DetailViewHolder;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Ls5h0;", "itemEntity", "", "bindData", "(Ls5h0;)Ljava/lang/Object;", "Lltr;", "binding", "Lltr;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class DetailViewHolder extends BaseViewHolder {
        public static final int $stable = 8;
        private final ltr binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DetailViewHolder(View view) {
            super(view);
            view.getClass();
            int i = R.id.tip_image_view;
            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.tip_image_view, view);
            if (appCompatImageView != null) {
                i = R.id.tip_text_view;
                TextView textView = (TextView) h5e.a(R.id.tip_text_view, view);
                if (textView != null) {
                    this.binding = new ltr(textView, appCompatImageView, (ConstraintLayout) view);
                    return;
                }
            }
            bmy.a("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a5d bindData$lambda$0$0$0(aqa0 aqa0Var, u2z u2zVar, m9n m9nVar) {
            aqa0Var.getClass();
            u2zVar.getClass();
            m9nVar.getClass();
            return new hke0(aqa0Var.a, u2zVar, dke0.a.a, hke0.g, true, true);
        }

        public final Object bindData(s5h0 itemEntity) {
            itemEntity.getClass();
            ltr ltrVar = this.binding;
            TextView textView = ltrVar.c;
            ResourceUiText resourceUiText = itemEntity.a;
            Context context = this.itemView.getContext();
            context.getClass();
            textView.setText(nae0.a(resourceUiText.e(context).toString()));
            String str = itemEntity.b;
            AppCompatImageView appCompatImageView = ltrVar.b;
            if (str == null) {
                appCompatImageView.setVisibility(8);
                return Unit.a;
            }
            appCompatImageView.setVisibility(0);
            m9n m9nVarA = qw90.a(appCompatImageView.getContext());
            nan.a aVar = new nan.a(appCompatImageView.getContext());
            aVar.c = str;
            abn.f(aVar, appCompatImageView);
            if (StringsKt.M(str, "svg", true)) {
                aVar.h = new r5h0();
            }
            aVar.m = wr5.c;
            return m9nVarA.a(aVar.a());
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/sportybet/feature/payment/impl/transaction/presentation/adapter/TxFixStatusTipAdapter$TitleViewHolder;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lt5h0;", "itemEntity", "", "bindData", "(Lt5h0;)V", "Lmtr;", "binding", "Lmtr;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class TitleViewHolder extends BaseViewHolder {
        public static final int $stable = 8;
        private final mtr binding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TitleViewHolder(View view) {
            super(view);
            view.getClass();
            int i = R.id.arrow_image_view;
            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.arrow_image_view, view);
            if (appCompatImageView != null) {
                i = R.id.title_text_view;
                TextView textView = (TextView) h5e.a(R.id.title_text_view, view);
                if (textView != null) {
                    this.binding = new mtr(textView, appCompatImageView, (ConstraintLayout) view);
                    return;
                }
            }
            bmy.a("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
            throw null;
        }

        public final void bindData(t5h0 itemEntity) {
            itemEntity.getClass();
            mtr mtrVar = this.binding;
            TextView textView = mtrVar.c;
            ResourceUiText resourceUiText = itemEntity.a;
            Context context = this.itemView.getContext();
            context.getClass();
            textView.setText(resourceUiText.e(context));
            boolean z = itemEntity.b;
            AppCompatImageView appCompatImageView = mtrVar.b;
            if (z) {
                appCompatImageView.setVisibility(0);
            } else {
                appCompatImageView.setVisibility(8);
            }
            if (itemEntity.getIsExpanded()) {
                appCompatImageView.setRotation(90.0f);
            } else {
                appCompatImageView.setRotation(0.0f);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final /* synthetic */ a[] a = {new a("TITLE", 0), new a("DETAIL", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        a EF5;

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) a.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TxFixStatusTipAdapter() {
        super(null, 1, 0 == true ? 1 : 0);
        addNodeProvider(new b());
        addNodeProvider(new com.sportybet.feature.payment.impl.transaction.presentation.adapter.a());
        setOnItemClickListener(new OnItemClickListener() { // from class: q5h0
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                TxFixStatusTipAdapter._init_$lambda$0(this.a, baseQuickAdapter, view, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(TxFixStatusTipAdapter txFixStatusTipAdapter, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        baseQuickAdapter.getClass();
        view.getClass();
        txFixStatusTipAdapter.toggle(i);
    }

    @Override // com.chad.library.adapter.base.BaseProviderMultiAdapter
    public int getItemType(List<? extends BaseNode> data, int position) {
        data.getClass();
        BaseNode baseNode = data.get(position);
        if (baseNode instanceof t5h0) {
            a[] aVarArr = a.a;
            return 0;
        }
        if (!(baseNode instanceof s5h0)) {
            return -1;
        }
        a[] aVarArr2 = a.a;
        return 1;
    }

    public final void toggle(int position) {
        BaseNode item = getItem(position);
        t5h0 t5h0Var = item instanceof t5h0 ? (t5h0) item : null;
        if (t5h0Var != null && t5h0Var.b) {
            if (t5h0Var.getIsExpanded()) {
                BaseNodeAdapter.collapse$default(this, position, false, false, null, 14, null);
            } else {
                BaseNodeAdapter.expand$default(this, position, false, false, null, 14, null);
            }
        }
    }
}
