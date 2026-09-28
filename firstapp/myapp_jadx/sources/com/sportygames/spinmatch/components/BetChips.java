package com.sportygames.spinmatch.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.BetChipItem;
import com.sportygames.commons.utils.CircularCardView;
import defpackage.bmy;
import defpackage.cl7;
import defpackage.el7;
import defpackage.h5e;
import defpackage.jk2;
import defpackage.kk2;
import defpackage.lk2;
import defpackage.pw;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u00020\f2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010*\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%¨\u0006+"}, d2 = {"Lcom/sportygames/spinmatch/components/BetChips;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "betChipList", "", "setBetChipList", "(Ljava/util/ArrayList;)V", "Lkotlin/Function1;", "listener", "setChipListener", "(Lkotlin/jvm/functions/Function1;)V", "", "setFbgChipListener", "enable", "setIfFbgAvailable", "(Z)V", "Lkk2;", "F", "Lkk2;", "getBinding", "()Lkk2;", "setBinding", "(Lkk2;)V", "binding", "J", "D", "getMaxAmount", "()D", "setMaxAmount", "(D)V", "maxAmount", "K", "getBetAmount", "setBetAmount", "betAmount", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BetChips extends ConstraintLayout {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public kk2 binding;
    public Function1<? super Double, Unit> G;
    public Function1<? super Boolean, Unit> H;
    public ArrayList<Double> I;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public double maxAmount;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public double betAmount;
    public boolean L;
    public boolean M;
    public ArrayList<BetChipItem> N;
    public cl7 O;

    public static final class a extends RecyclerView.s {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void a(RecyclerView recyclerView, int i) {
            BetChips betChips = BetChips.this;
            betChips.J(Double.valueOf(betChips.getMaxAmount()), Double.valueOf(betChips.getBetAmount()));
            betChips.I(betChips.getMaxAmount() > 0.0d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BetChips(Context context, AttributeSet attributeSet) {
        super(context.getApplicationContext(), attributeSet);
        context.getClass();
        this.N = new ArrayList<>();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.bet_chip_layout, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.chip_list;
        RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.chip_list, viewInflate);
        if (recyclerView != null) {
            i = R.id.main;
            if (((ConstraintLayout) h5e.a(R.id.main, viewInflate)) != null) {
                i = R.id.max_amount;
                TextView textView = (TextView) h5e.a(R.id.max_amount, viewInflate);
                if (textView != null) {
                    i = R.id.max_text;
                    TextView textView2 = (TextView) h5e.a(R.id.max_text, viewInflate);
                    if (textView2 != null) {
                        i = R.id.min_amount;
                        TextView textView3 = (TextView) h5e.a(R.id.min_amount, viewInflate);
                        if (textView3 != null) {
                            i = R.id.min_text;
                            TextView textView4 = (TextView) h5e.a(R.id.min_text, viewInflate);
                            if (textView4 != null) {
                                i = R.id.rounded_bet_container_linear;
                                if (((CircularCardView) h5e.a(R.id.rounded_bet_container_linear, viewInflate)) != null) {
                                    this.binding = new kk2((ConstraintLayout) viewInflate, recyclerView, textView, textView2, textView3, textView4);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void E() {
        ArrayList<Double> arrayList = this.I;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Double d = arrayList.get(i2);
                i2++;
                int i3 = i + 1;
                if (i < 0) {
                    b.q();
                    throw null;
                }
                d.doubleValue();
                try {
                    kk2 kk2Var = this.binding;
                    RecyclerView.f adapter = kk2Var != null ? kk2Var.b.getAdapter() : null;
                    adapter.getClass();
                    ((cl7) adapter).j(i, false);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                i = i3;
            }
        }
    }

    public final void F(boolean z) {
        kk2 kk2Var = this.binding;
        RecyclerView.f adapter = kk2Var != null ? kk2Var.b.getAdapter() : null;
        cl7 cl7Var = adapter instanceof cl7 ? (cl7) adapter : null;
        if (cl7Var == null || !this.M) {
            return;
        }
        this.L = z;
        this.N.get(0).setEnabled(z);
        cl7Var.notifyItemChanged(0);
    }

    public final void G(ArrayList<Double> arrayList) {
        if (arrayList != null) {
            this.N.clear();
            ArrayList arrayListB = jk2.b(arrayList);
            this.N.addAll(arrayListB);
            int size = arrayListB.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListB.get(i2);
                i2++;
                int i3 = i + 1;
                if (i < 0) {
                    b.q();
                    throw null;
                }
                try {
                    kk2 kk2Var = this.binding;
                    RecyclerView.f adapter = kk2Var != null ? kk2Var.b.getAdapter() : null;
                    adapter.getClass();
                    ((cl7) adapter).j(i, false);
                } catch (Exception unused) {
                }
                i = i3;
            }
            cl7 cl7Var = this.O;
            if (cl7Var != null) {
                cl7Var.notifyDataSetChanged();
            }
        }
    }

    public final void H() {
        kk2 kk2Var = this.binding;
        if ((kk2Var != null ? kk2Var.b.getAdapter() : null) == null) {
            return;
        }
        kk2 kk2Var2 = this.binding;
        RecyclerView.f adapter = kk2Var2 != null ? kk2Var2.b.getAdapter() : null;
        cl7 cl7Var = adapter instanceof cl7 ? (cl7) adapter : null;
        if (cl7Var != null) {
            cl7Var.notifyDataSetChanged();
        }
    }

    public final void I(boolean z) {
        kk2 kk2Var = this.binding;
        if ((kk2Var != null ? kk2Var.b.getAdapter() : null) == null) {
            return;
        }
        kk2 kk2Var2 = this.binding;
        RecyclerView.f adapter = kk2Var2 != null ? kk2Var2.b.getAdapter() : null;
        cl7 cl7Var = adapter instanceof cl7 ? (cl7) adapter : null;
        if (cl7Var != null) {
            try {
                ArrayList<BetChipItem> arrayList = cl7Var.c;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    BetChipItem betChipItem = arrayList.get(i2);
                    i2++;
                    int i3 = i + 1;
                    if (i < 0) {
                        b.q();
                        throw null;
                    }
                    RecyclerView recyclerView = cl7Var.a;
                    RecyclerView.d0 d0VarQ = recyclerView.Q(recyclerView.getChildAt(i));
                    if (d0VarQ instanceof el7) {
                        ((el7) d0VarQ).b.setEnabled(z);
                        ((el7) d0VarQ).b.setClickable(z);
                        ((el7) d0VarQ).b.setFocusable(z);
                    } else if (d0VarQ instanceof cl7.a) {
                        ((cl7.a) d0VarQ).a.setEnabled(z);
                        ((cl7.a) d0VarQ).b.setEnabled(z);
                    }
                    i = i3;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void J(Double d, Double d2) {
        this.maxAmount = d.doubleValue();
        this.betAmount = d2 != null ? d2.doubleValue() : 0.0d;
        ArrayList<Double> arrayList = this.I;
        ArrayList arrayListB = arrayList != null ? jk2.b(arrayList) : null;
        if (arrayListB != null) {
            int size = arrayListB.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListB.get(i2);
                i2++;
                int i3 = i + 1;
                if (i < 0) {
                    b.q();
                    throw null;
                }
                BetChipItem betChipItem = (BetChipItem) obj;
                try {
                    TreeMap treeMap = pw.a;
                    double dDoubleValue = new BigDecimal(betChipItem.getBetAmount() + this.betAmount).setScale(2, RoundingMode.CEILING).doubleValue();
                    kk2 kk2Var = this.binding;
                    RecyclerView.f adapter = kk2Var != null ? kk2Var.b.getAdapter() : null;
                    adapter.getClass();
                    ((cl7) adapter).j(i, dDoubleValue <= d.doubleValue());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                i = i3;
            }
        }
        kk2 kk2Var2 = this.binding;
        RecyclerView.f adapter2 = kk2Var2 != null ? kk2Var2.b.getAdapter() : null;
        cl7 cl7Var = adapter2 instanceof cl7 ? (cl7) adapter2 : null;
        if (cl7Var == null || !this.M) {
            return;
        }
        cl7Var.notifyDataSetChanged();
        this.N.get(0).setEnabled(this.L);
        cl7Var.notifyItemChanged(0);
    }

    public final double getBetAmount() {
        return this.betAmount;
    }

    public final kk2 getBinding() {
        return this.binding;
    }

    public final double getMaxAmount() {
        return this.maxAmount;
    }

    public final void setBetAmount(double d) {
        this.betAmount = d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    public final void setBetChipList(ArrayList<Double> betChipList) {
        cl7 cl7Var;
        betChipList.getClass();
        this.I = betChipList;
        ArrayList arrayListB = jk2.b(betChipList);
        kk2 kk2Var = this.binding;
        if (kk2Var != null) {
            RecyclerView recyclerView = kk2Var.b;
            Context context = getContext();
            if (context != null) {
                ArrayList<BetChipItem> arrayListB2 = jk2.b(betChipList);
                this.N = arrayListB2;
                cl7Var = new cl7(context, recyclerView, arrayListB2);
            } else {
                cl7Var = null;
            }
        } else {
            cl7Var = null;
        }
        this.O = cl7Var;
        kk2 kk2Var2 = this.binding;
        if (kk2Var2 != null) {
            RecyclerView recyclerView2 = kk2Var2.b;
            getContext();
            recyclerView2.setLayoutManager(new LinearLayoutManager(0, false));
        }
        kk2 kk2Var3 = this.binding;
        if (kk2Var3 != null) {
            kk2Var3.b.setAdapter(this.O);
        }
        cl7 cl7Var2 = this.O;
        if (cl7Var2 != null) {
            Function1<? super Double, Unit> function1 = this.G;
            if (function1 == null) {
                Intrinsics.n("betChipListener");
                throw null;
            }
            cl7Var2.d = function1;
        }
        Function1<? super Boolean, Unit> function2 = this.H;
        if (function2 != null && cl7Var2 != null) {
            cl7Var2.e = function2;
        }
        int size = arrayListB.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayListB.get(i2);
            i2++;
            int i3 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            try {
                kk2 kk2Var4 = this.binding;
                RecyclerView.f adapter = kk2Var4 != null ? kk2Var4.b.getAdapter() : null;
                adapter.getClass();
                ((cl7) adapter).j(i, false);
            } catch (Exception e) {
                e.printStackTrace();
            }
            i = i3;
        }
        kk2 kk2Var5 = this.binding;
        if (kk2Var5 != null) {
            kk2Var5.b.k(new a());
        }
        cl7 cl7Var3 = this.O;
        if (cl7Var3 != null) {
            cl7Var3.d = new lk2(this, 0);
        }
    }

    public final void setBinding(kk2 kk2Var) {
        this.binding = kk2Var;
    }

    public final void setChipListener(Function1<? super Double, Unit> listener) {
        listener.getClass();
        this.G = listener;
    }

    public final void setFbgChipListener(Function1<? super Boolean, Unit> listener) {
        listener.getClass();
        this.H = listener;
    }

    public final void setIfFbgAvailable(boolean enable) {
        this.M = enable;
    }

    public final void setMaxAmount(double d) {
        this.maxAmount = d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BetChips(Context context) {
        this(context, null);
        context.getClass();
    }
}
