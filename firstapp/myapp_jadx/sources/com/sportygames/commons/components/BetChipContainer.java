package com.sportygames.commons.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.BetChipItem;
import defpackage.cl7;
import defpackage.gph;
import defpackage.jk2;
import defpackage.lsb;
import defpackage.op5;
import defpackage.pw;
import defpackage.qsb;
import defpackage.tk30;
import defpackage.tug;
import defpackage.tx5;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ)\u0010\u0012\u001a\u00020\n2\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\n\u0012\u0004\u0012\u00020\u000f\u0018\u0001`\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\n2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\n2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\n0\u0018¢\u0006\u0004\b\u001c\u0010\u001bJ!\u0010\u001f\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u00020\n2\b\u0010!\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\"\u0010 R\"\u0010\u001e\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010!\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b\"\u0010(¨\u0006+"}, d2 = {"Lcom/sportygames/commons/components/BetChipContainer;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "color", "", "setColorByColor", "(I)V", "setColor", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "chips", "setChipList", "(Ljava/util/ArrayList;)V", "", "enable", "setChipsClick", "(Z)V", "Lkotlin/Function1;", "listener", "setBetAmountAddListener", "(Lkotlin/jvm/functions/Function1;)V", "setFbgClickListener", "minAmount", "maxAmount", "setMinMaxChip", "(Ljava/lang/Double;Ljava/lang/Double;)V", "betAmount", "setBetAmount", "O", "D", "getMaxAmount", "()D", "setMaxAmount", "(D)V", "P", "getBetAmount", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BetChipContainer extends ConstraintLayout {
    public final RecyclerView F;
    public final TextView G;
    public final CardView H;
    public Function1<? super Double, Unit> I;
    public Function1<? super Boolean, Unit> J;
    public cl7 K;
    public ArrayList<BetChipItem> L;
    public final DecimalFormat M;
    public boolean N;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public double maxAmount;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public double betAmount;

    public static final class a extends RecyclerView.s {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final void a(RecyclerView recyclerView, int i) {
            BetChipContainer betChipContainer = BetChipContainer.this;
            betChipContainer.setBetAmount(Double.valueOf(betChipContainer.getBetAmount()), Double.valueOf(betChipContainer.getMaxAmount()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BetChipContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.L = new ArrayList<>();
        DecimalFormat decimalFormat = new DecimalFormat();
        this.M = decimalFormat;
        this.N = true;
        View.inflate(context, R.layout.sg_betchip_container, this);
        decimalFormat.setMaximumFractionDigits(2);
        decimalFormat.setDecimalFormatSymbols(SportyGamesManager.decimalFormatSymbols);
        View viewFindViewById = findViewById(R.id.betchip_listview);
        viewFindViewById.getClass();
        this.F = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.min_amount);
        viewFindViewById2.getClass();
        this.G = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.min_max_layout);
        viewFindViewById3.getClass();
        View viewFindViewById4 = findViewById(R.id.rounded_bet_container_linear);
        viewFindViewById4.getClass();
        this.H = (CardView) viewFindViewById4;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tk30.a);
        typedArrayObtainStyledAttributes.getClass();
        typedArrayObtainStyledAttributes.recycle();
        E(0.5f, false);
    }

    public final void E(float f, boolean z) {
        CardView cardView = this.H;
        cardView.setEnabled(z);
        cardView.setAlpha(f);
    }

    public final void F(ArrayList<Double> arrayList) {
        if (this.K == null || arrayList == null) {
            return;
        }
        this.L.clear();
        this.L.addAll(jk2.b(arrayList));
        cl7 cl7Var = this.K;
        if (cl7Var != null) {
            cl7Var.notifyDataSetChanged();
        } else {
            Intrinsics.n("chipListAdapter");
            throw null;
        }
    }

    public final double getBetAmount() {
        return this.betAmount;
    }

    public final double getMaxAmount() {
        return this.maxAmount;
    }

    public final void setBetAmount(Double betAmount, Double maxAmount) {
        this.betAmount = betAmount != null ? betAmount.doubleValue() : 0.0d;
        this.maxAmount = maxAmount != null ? maxAmount.doubleValue() : 0.0d;
        ArrayList<BetChipItem> arrayList = this.L;
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
            BetChipItem betChipItem2 = betChipItem;
            if (betAmount != null && maxAmount != null) {
                TreeMap treeMap = pw.a;
                double dDoubleValue = new BigDecimal(betAmount.doubleValue() + betChipItem2.getBetAmount()).setScale(2, RoundingMode.CEILING).doubleValue();
                try {
                    RecyclerView.f adapter = this.F.getAdapter();
                    adapter.getClass();
                    ((cl7) adapter).j(i, dDoubleValue <= maxAmount.doubleValue());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            i = i3;
        }
    }

    public final void setBetAmountAddListener(Function1<? super Double, Unit> listener) {
        listener.getClass();
        this.I = listener;
    }

    public final void setChipList(ArrayList<Double> chips) {
        E(1.0f, true);
        boolean zIsEmpty = this.L.isEmpty();
        RecyclerView recyclerView = this.F;
        if (zIsEmpty) {
            ArrayList<BetChipItem> arrayListB = chips != null ? jk2.b(chips) : null;
            arrayListB.getClass();
            this.L = arrayListB;
            Context context = getContext();
            context.getClass();
            this.K = new cl7(context, recyclerView, this.L);
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            cl7 cl7Var = this.K;
            if (cl7Var == null) {
                Intrinsics.n("chipListAdapter");
                throw null;
            }
            Function1<? super Double, Unit> function1 = this.I;
            if (function1 == null) {
                Intrinsics.n("betChipAddListener");
                throw null;
            }
            cl7Var.d = function1;
            Function1<? super Boolean, Unit> function2 = this.J;
            if (function2 != null) {
                if (cl7Var == null) {
                    Intrinsics.n("chipListAdapter");
                    throw null;
                }
                cl7Var.e = function2;
            }
            if (cl7Var == null) {
                Intrinsics.n("chipListAdapter");
                throw null;
            }
            recyclerView.setAdapter(cl7Var);
        }
        try {
            gph gphVarA = gph.a();
            String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
            qsb qsbVar = gphVarA.a;
            qsbVar.o.a.a(new lsb(qsbVar, System.currentTimeMillis() - qsbVar.d, strValueOf));
        } catch (Exception e) {
            e.printStackTrace();
        }
        recyclerView.k(new a());
        cl7 cl7Var2 = this.K;
        if (cl7Var2 != null) {
            cl7Var2.f = this.N;
        } else {
            Intrinsics.n("chipListAdapter");
            throw null;
        }
    }

    public final void setChipsClick(boolean enable) {
        this.N = enable;
        if (this.L.isEmpty()) {
            return;
        }
        cl7 cl7Var = this.K;
        if (cl7Var != null) {
            cl7Var.f = enable;
        } else {
            Intrinsics.n("chipListAdapter");
            throw null;
        }
    }

    public final void setColor(int color) {
        this.H.setCardBackgroundColor(getContext().getColor(color));
    }

    public final void setColorByColor(int color) {
        this.H.setCardBackgroundColor(color);
    }

    public final void setFbgClickListener(Function1<? super Boolean, Unit> listener) {
        listener.getClass();
        this.J = listener;
    }

    public final void setMaxAmount(double d) {
        this.maxAmount = d;
    }

    public final void setMinMaxChip(Double minAmount, Double maxAmount) {
        String strA;
        String strA2;
        Double dValueOf = Double.valueOf(0.0d);
        TextView textView = this.G;
        if (minAmount == null || maxAmount == null) {
            textView.setText("...");
            return;
        }
        op5 op5Var = op5.a;
        String string = getContext().getString(R.string.min_text_caps_cms);
        string.getClass();
        op5Var.getClass();
        String strB = op5.b(string, "Min", null);
        String string2 = getContext().getString(R.string.max_text_caps_cms);
        string2.getClass();
        String strB2 = op5.b(string2, "Max", null);
        boolean zEquals = Double.valueOf(minAmount.doubleValue() % 1.0d).equals(dValueOf);
        DecimalFormat decimalFormat = this.M;
        if (zEquals || minAmount.doubleValue() > 1000.0d) {
            TreeMap treeMap = pw.a;
            strA = tug.a(strB, " : ", pw.h((long) minAmount.doubleValue()));
        } else {
            strA = tug.a(strB, " : ", decimalFormat.format(minAmount.doubleValue()));
        }
        if (Double.valueOf(maxAmount.doubleValue() % 1.0d).equals(dValueOf) || maxAmount.doubleValue() > 1000.0d) {
            TreeMap treeMap2 = pw.a;
            strA2 = tx5.a(strA, "       ", strB2, " : ", pw.h((long) maxAmount.doubleValue()));
        } else {
            strA2 = tx5.a(strA, "       ", strB2, " : ", decimalFormat.format(maxAmount.doubleValue()));
        }
        textView.setText(strA2);
        if (Build.VERSION.SDK_INT <= 25) {
            textView.setTextSize(13.0f);
        }
    }

    public final void setBetAmount(double d) {
        this.betAmount = d;
    }
}
