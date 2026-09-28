package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.transaction.ui.txlist.model.TxListItem;
import java.math.BigDecimal;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n7h0 extends RecyclerView.f<c> {
    public List<? extends TxListItem> a;
    public bd90 b;

    public static final class a extends c {
        public final d6h0 a;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(d6h0 d6h0Var) {
            LinearLayout linearLayout = d6h0Var.a;
            linearLayout.getClass();
            super(linearLayout);
            this.a = d6h0Var;
        }

        @Override // n7h0.c
        public final void a(TxListItem txListItem) {
            if ((txListItem instanceof TxListItem.a ? (TxListItem.a) txListItem : null) != null) {
                TextView textView = this.a.b;
                UiText uiText = TxListItem.a.b;
                Context context = this.itemView.getContext();
                context.getClass();
                textView.setText(uiText.e(context));
            }
        }
    }

    public static final class b extends c {
        public final zjd0 a;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(zjd0 zjd0Var) {
            ConstraintLayout constraintLayout = zjd0Var.a;
            constraintLayout.getClass();
            super(constraintLayout);
            this.a = zjd0Var;
        }

        @Override // n7h0.c
        public final void a(TxListItem txListItem) {
            UiText stringUiText;
            TxListItem.b bVar = txListItem instanceof TxListItem.b ? (TxListItem.b) txListItem : null;
            if (bVar != null) {
                brg0 brg0Var = bVar.a;
                zjd0 zjd0Var = this.a;
                TextView textView = zjd0Var.f;
                AppCompatTextView appCompatTextView = zjd0Var.b;
                TextView textView2 = zjd0Var.d;
                UiText uiText = brg0Var.k;
                Context context = this.itemView.getContext();
                context.getClass();
                textView.setText(uiText.e(context));
                zjd0Var.e.setText(bVar.b);
                BigDecimal bigDecimal = brg0Var.c;
                Integer num = brg0Var.d;
                if (num != null && num.intValue() == 1) {
                    Object[] objArr = {n4d.a(bigDecimal)};
                    StringUiText stringUiText2 = vch0.a;
                    stringUiText = new ResourceUiText(R.string.page_transaction__plus_amount, ay0.S(objArr));
                } else if (num != null && num.intValue() == 2) {
                    Object[] objArr2 = {n4d.a(bigDecimal)};
                    StringUiText stringUiText3 = vch0.a;
                    stringUiText = new ResourceUiText(R.string.page_transaction__neg_amount, ay0.S(objArr2));
                } else {
                    String strA = n4d.a(bigDecimal);
                    StringUiText stringUiText4 = vch0.a;
                    stringUiText = new StringUiText(strA);
                }
                Context context2 = this.itemView.getContext();
                context2.getClass();
                appCompatTextView.setText(stringUiText.e(context2));
                int i = R.color.text_type1_secondary;
                appCompatTextView.setTextColor(this.itemView.getContext().getColor((num != null && num.intValue() == 1) ? R.color.brand_quaternary : R.color.text_type1_secondary));
                if (bVar.e) {
                    i = R.color.warning_primary;
                }
                textView2.setTextColor(this.itemView.getContext().getColor(i));
                UiText uiText2 = bVar.d;
                if (uiText2 == null) {
                    textView2.setVisibility(8);
                    return;
                }
                Context context3 = this.itemView.getContext();
                context3.getClass();
                textView2.setText(uiText2.e(context3));
                textView2.setVisibility(0);
            }
        }
    }

    public static abstract class c extends RecyclerView.d0 {
        public abstract void a(TxListItem txListItem);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        TxListItem txListItem = (TxListItem) CollectionsKt.V(i, this.a);
        if (txListItem instanceof TxListItem.b) {
            return R.layout.spr_transaction_list_item;
        }
        Intrinsics.g(txListItem, TxListItem.a.a);
        return R.layout.tx_item_load_more;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        c cVar = (c) d0Var;
        cVar.getClass();
        TxListItem txListItem = (TxListItem) CollectionsKt.V(i, this.a);
        if (txListItem == null) {
            return;
        }
        cVar.a(txListItem);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        final c aVar;
        viewGroup.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i == R.layout.spr_transaction_list_item) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.spr_transaction_list_item, viewGroup, false);
            int i2 = R.id.balance;
            AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.balance, viewInflate);
            if (appCompatTextView != null) {
                i2 = R.id.line;
                View viewA = h5e.a(R.id.line, viewInflate);
                if (viewA != null) {
                    i2 = R.id.status;
                    TextView textView = (TextView) h5e.a(R.id.status, viewInflate);
                    if (textView != null) {
                        i2 = R.id.time;
                        TextView textView2 = (TextView) h5e.a(R.id.time, viewInflate);
                        if (textView2 != null) {
                            i2 = R.id.type;
                            TextView textView3 = (TextView) h5e.a(R.id.type, viewInflate);
                            if (textView3 != null) {
                                aVar = new b(new zjd0((ConstraintLayout) viewInflate, appCompatTextView, viewA, textView, textView2, textView3));
                            }
                        }
                    }
                }
            }
            bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
            return null;
        }
        aVar = i == R.layout.tx_item_load_more ? new a(d6h0.a(layoutInflaterFrom, viewGroup)) : new a(d6h0.a(layoutInflaterFrom, viewGroup));
        aVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: m7h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n7h0 n7h0Var = this.a;
                bd90 bd90Var = n7h0Var.b;
                if (bd90Var != null) {
                    TxListItem txListItem = (TxListItem) CollectionsKt.V(aVar.getAbsoluteAdapterPosition(), n7h0Var.a);
                    if (txListItem == null) {
                        return;
                    }
                    bd90Var.invoke(txListItem);
                }
            }
        });
        return aVar;
    }
}
