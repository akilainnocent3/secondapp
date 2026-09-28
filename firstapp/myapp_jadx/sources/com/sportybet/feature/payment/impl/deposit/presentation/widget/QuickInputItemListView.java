package com.sportybet.feature.payment.impl.deposit.presentation.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.pocket.deposit.QuickInputItem;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.deposit.presentation.widget.QuickInputItemListView;
import defpackage.bmy;
import defpackage.c3p;
import defpackage.h5e;
import defpackage.m2g;
import defpackage.u540;
import defpackage.ug30;
import defpackage.zch0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/sportybet/feature/payment/impl/deposit/presentation/widget/QuickInputItemListView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lug30;", "quickInputItemUiStates", "", "setData", "(Ljava/util/List;)V", "Lcom/sportybet/feature/payment/impl/deposit/presentation/widget/QuickInputItemListView$a$a;", "onClickListener", "setOnClickListener", "(Lcom/sportybet/feature/payment/impl/deposit/presentation/widget/QuickInputItemListView$a$a;)V", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class QuickInputItemListView extends RecyclerView {
    public final a b1;

    public static final class a extends RecyclerView.f<b> {
        public InterfaceC0413a a;
        public List<ug30> b;

        /* JADX INFO: renamed from: com.sportybet.feature.payment.impl.deposit.presentation.widget.QuickInputItemListView$a$a, reason: collision with other inner class name */
        public interface InterfaceC0413a {
            void a(QuickInputItem quickInputItem);
        }

        public static final class b extends RecyclerView.d0 {
            public final c3p a;

            public b(c3p c3pVar) {
                super(c3pVar.a);
                this.a = c3pVar;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final int getItemCount() {
            return this.b.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
            b bVar = (b) d0Var;
            bVar.getClass();
            ug30 ug30Var = this.b.get(i);
            c3p c3pVar = bVar.a;
            c3pVar.a.setSelected(ug30Var.a);
            TextView textView = c3pVar.b;
            QuickInputItem quickInputItem = ug30Var.b;
            textView.setText(quickInputItem.text);
            c3pVar.c.setText(quickInputItem.btnText);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            View viewA = u540.a(viewGroup, R.layout.item_quick_input, viewGroup, false);
            int i2 = R.id.pay_amount;
            TextView textView = (TextView) h5e.a(R.id.pay_amount, viewA);
            if (textView != null) {
                i2 = R.id.pay_desc;
                TextView textView2 = (TextView) h5e.a(R.id.pay_desc, viewA);
                if (textView2 != null) {
                    final b bVar = new b(new c3p((LinearLayout) viewA, textView, textView2));
                    bVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: tg30
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            QuickInputItemListView.a aVar = this.a;
                            QuickInputItemListView.a.InterfaceC0413a interfaceC0413a = aVar.a;
                            if (interfaceC0413a != null) {
                                ug30 ug30Var = (ug30) CollectionsKt.V(bVar.getAbsoluteAdapterPosition(), aVar.b);
                                if (ug30Var == null) {
                                    return;
                                }
                                interfaceC0413a.a(ug30Var.b);
                            }
                        }
                    });
                    return bVar;
                }
            }
            bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i2)));
            return null;
        }
    }

    public static final class b extends RecyclerView.n {
        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            rect.getClass();
            view.getClass();
            zVar.getClass();
            super.f(rect, view, recyclerView, zVar);
            RecyclerView.f adapter = recyclerView.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : recyclerView.getChildCount();
            if (itemCount <= 1) {
                rect.left = 0;
                rect.right = 0;
                rect.top = 0;
                rect.bottom = 0;
                return;
            }
            RecyclerView.d0 d0VarR = RecyclerView.R(view);
            int layoutPosition = d0VarR != null ? d0VarR.getLayoutPosition() : -1;
            int iA = zch0.a(view.getContext(), 3);
            if (itemCount == 3 || itemCount >= 6) {
                int i = (itemCount / 3) + (itemCount % 3 == 0 ? 0 : 1);
                int i2 = layoutPosition % 3;
                if (i2 == 0) {
                    rect.left = 0;
                    rect.right = iA;
                } else if (i2 != 2) {
                    rect.left = iA;
                    rect.right = iA;
                } else {
                    rect.left = iA;
                    rect.right = 0;
                }
                int i3 = layoutPosition / 3;
                if (i3 == 0) {
                    rect.top = 0;
                    rect.bottom = iA;
                    return;
                } else if (i3 == i - 1) {
                    rect.top = iA;
                    rect.bottom = 0;
                    return;
                } else {
                    rect.top = iA;
                    rect.bottom = iA;
                    return;
                }
            }
            if (itemCount % 2 == 0) {
                int i4 = itemCount / 2;
                if (layoutPosition % 2 == 0) {
                    rect.left = 0;
                    rect.right = iA;
                } else {
                    rect.left = iA;
                    rect.right = 0;
                }
                int i5 = layoutPosition / 2;
                if (i5 == 0) {
                    rect.top = 0;
                    rect.bottom = iA;
                    return;
                } else {
                    if (i5 == i4 - 1) {
                        rect.top = iA;
                        rect.bottom = 0;
                        return;
                    }
                    return;
                }
            }
            if (layoutPosition == 0) {
                rect.left = 0;
                rect.right = iA;
                rect.top = 0;
                rect.bottom = iA;
                return;
            }
            if (layoutPosition == 1) {
                rect.left = iA;
                rect.right = 0;
                rect.top = 0;
                rect.bottom = iA;
                return;
            }
            if (layoutPosition == 2) {
                rect.left = 0;
                rect.right = iA;
                rect.top = iA;
                rect.bottom = 0;
                return;
            }
            if (layoutPosition == 3) {
                rect.left = iA;
                rect.right = iA;
                rect.top = iA;
                rect.bottom = 0;
                return;
            }
            if (layoutPosition != 4) {
                return;
            }
            rect.left = iA;
            rect.right = 0;
            rect.top = iA;
            rect.bottom = 0;
        }
    }

    public static final class c extends GridLayoutManager.b {
        public c() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public final int getSpanSize(int i) {
            RecyclerView.f adapter = QuickInputItemListView.this.getAdapter();
            if (adapter == null) {
                return 0;
            }
            int itemCount = adapter.getItemCount();
            if (itemCount <= 6) {
                if (itemCount == 1) {
                    return 6;
                }
                if (itemCount % 3 != 0 && (itemCount % 2 == 0 || i <= 1)) {
                    return 3;
                }
            }
            return 2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickInputItemListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        a aVar = new a();
        aVar.b = m2g.a;
        this.b1 = aVar;
        RecyclerView.n bVar = new b();
        c cVar = new c();
        setAdapter(aVar);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(6, 1);
        gridLayoutManager.Z = cVar;
        setLayoutManager(gridLayoutManager);
        i(bVar);
    }

    public final void setData(List<ug30> quickInputItemUiStates) {
        quickInputItemUiStates.getClass();
        a aVar = this.b1;
        aVar.getClass();
        quickInputItemUiStates.getClass();
        aVar.b = quickInputItemUiStates;
        aVar.notifyDataSetChanged();
    }

    public final void setOnClickListener(a.InterfaceC0413a onClickListener) {
        onClickListener.getClass();
        this.b1.a = onClickListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuickInputItemListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QuickInputItemListView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ QuickInputItemListView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
