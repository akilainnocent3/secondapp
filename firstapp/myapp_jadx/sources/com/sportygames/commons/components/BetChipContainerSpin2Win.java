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
import com.sportybet.android.instantwin.newtork.model.response.recommendation.TL.UccrWswQGaIj;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.BetChipItem;
import defpackage.cl7;
import defpackage.ik2;
import defpackage.jk2;
import defpackage.lxa0;
import defpackage.op5;
import defpackage.pw;
import defpackage.tk30;
import defpackage.tug;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0011\u001a\u00020\n2\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\n2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\u0013¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\n2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\n0\u0013¢\u0006\u0004\b\u0018\u0010\u0016J#\u0010\u001b\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001e\u0010\u001cJ\u0015\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b \u0010\fJ\u0015\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/sportygames/commons/components/BetChipContainerSpin2Win;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "color", "", "setColor", "(I)V", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "chips", "setChipList", "(Ljava/util/ArrayList;)V", "Lkotlin/Function1;", "listener", "setBetAmountAddListener", "(Lkotlin/jvm/functions/Function1;)V", "", "setFbgClickListener", "minAmount", "maxAmount", "setMinMaxChip", "(Ljava/lang/Double;Ljava/lang/Double;)V", "betAmount", "setBetAmount", "pos", "setScrollPosition", "enable", "setIfFbgAvailable", "(Z)V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BetChipContainerSpin2Win extends ConstraintLayout {
    public final RecyclerView F;
    public final TextView G;
    public final TextView H;
    public final CardView I;
    public Function1<? super Double, Unit> J;
    public Function1<? super Boolean, Unit> K;
    public a L;
    public ArrayList<BetChipItem> M;
    public final DecimalFormat N;
    public final boolean O;
    public double P;
    public double Q;
    public boolean R;
    public boolean S;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a extends cl7 {
        @Override // defpackage.cl7
        public final String i(double d) {
            return lxa0.a(d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BetChipContainerSpin2Win(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.M = new ArrayList<>();
        DecimalFormat decimalFormat = new DecimalFormat();
        this.N = decimalFormat;
        this.O = true;
        View.inflate(context, R.layout.sg_bet_chip_container_spin2win, this);
        decimalFormat.setMaximumFractionDigits(2);
        decimalFormat.setDecimalFormatSymbols(SportyGamesManager.decimalFormatSymbols);
        View viewFindViewById = findViewById(R.id.betchip_listview);
        viewFindViewById.getClass();
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.F = recyclerView;
        View viewFindViewById2 = findViewById(R.id.min_amount);
        viewFindViewById2.getClass();
        this.G = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.max_amount);
        viewFindViewById3.getClass();
        this.H = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.rounded_bet_container_linear);
        viewFindViewById4.getClass();
        this.I = (CardView) viewFindViewById4;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tk30.a);
        typedArrayObtainStyledAttributes.getClass();
        typedArrayObtainStyledAttributes.recycle();
        recyclerView.k(new ik2(this));
    }

    public final void E(boolean z) {
        if (this.L == null || !this.S) {
            return;
        }
        this.R = z;
        this.M.get(0).setEnabled(z);
        a aVar = this.L;
        if (aVar != null) {
            aVar.notifyItemChanged(0);
        } else {
            Intrinsics.n("chipListAdapter");
            throw null;
        }
    }

    public final void F(ArrayList<Double> arrayList) {
        if (arrayList != null) {
            this.M.clear();
            this.M.addAll(jk2.b(arrayList));
            a aVar = this.L;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
            }
        }
    }

    public final void setBetAmountAddListener(Function1<? super Double, Unit> listener) {
        listener.getClass();
        this.J = listener;
    }

    public final void setChipList(ArrayList<Double> chips) {
        RecyclerView recyclerView = this.F;
        try {
            if (this.M.isEmpty()) {
                ArrayList<BetChipItem> arrayListB = chips != null ? jk2.b(chips) : null;
                arrayListB.getClass();
                this.M = arrayListB;
                Context context = getContext();
                ArrayList<BetChipItem> arrayList = this.M;
                context.getClass();
                this.L = new a(context, recyclerView, arrayList);
                getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
                a aVar = this.L;
                if (aVar == null) {
                    Intrinsics.n("chipListAdapter");
                    throw null;
                }
                Function1<? super Double, Unit> function1 = this.J;
                if (function1 == null) {
                    Intrinsics.n("betChipAddListener");
                    throw null;
                }
                aVar.d = function1;
                Function1<? super Boolean, Unit> function2 = this.K;
                if (function2 != null) {
                    if (aVar == null) {
                        Intrinsics.n("chipListAdapter");
                        throw null;
                    }
                    aVar.e = function2;
                }
                if (aVar == null) {
                    Intrinsics.n("chipListAdapter");
                    throw null;
                }
                recyclerView.setAdapter(aVar);
                a aVar2 = this.L;
                if (aVar2 != null) {
                    aVar2.f = this.O;
                } else {
                    Intrinsics.n("chipListAdapter");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void setColor(int color) {
        this.I.setCardBackgroundColor(getContext().getColor(color));
    }

    public final void setFbgClickListener(Function1<? super Boolean, Unit> listener) {
        listener.getClass();
        this.K = listener;
    }

    public final void setIfFbgAvailable(boolean enable) {
        this.S = enable;
    }

    public final void setMinMaxChip(Double minAmount, Double maxAmount) {
        String strA;
        String strA2;
        Double dValueOf = Double.valueOf(0.0d);
        if (minAmount == null || maxAmount == null) {
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
        boolean zC = Intrinsics.c(minAmount, 0.0d);
        TextView textView = this.H;
        TextView textView2 = this.G;
        if (zC || Intrinsics.c(maxAmount, 0.0d)) {
            textView2.setText(strB.concat("\n--"));
            textView.setText(strB2.concat("\n--"));
            return;
        }
        boolean zEquals = Double.valueOf(minAmount.doubleValue() % 1.0d).equals(dValueOf);
        DecimalFormat decimalFormat = this.N;
        if (zEquals || minAmount.doubleValue() > 1000.0d) {
            TreeMap treeMap = pw.a;
            strA = tug.a(strB, "\n", pw.h((long) minAmount.doubleValue()));
        } else {
            strA = tug.a(strB, "\n", decimalFormat.format(minAmount.doubleValue()));
        }
        if (Double.valueOf(maxAmount.doubleValue() % 1.0d).equals(dValueOf) || minAmount.doubleValue() > 1000.0d) {
            TreeMap treeMap2 = pw.a;
            strA2 = tug.a(strB2, "\n", pw.h((long) maxAmount.doubleValue()));
        } else {
            strA2 = tug.a(strB2, "\n", decimalFormat.format(maxAmount.doubleValue()));
        }
        textView2.setText(strA);
        textView.setText(strA2);
        if (Build.VERSION.SDK_INT <= 25) {
            textView2.setTextSize(10.0f);
        }
    }

    public final void setScrollPosition(int pos) {
        this.F.o0(pos);
    }

    public final void setBetAmount(Double betAmount, Double maxAmount) {
        this.Q = betAmount != null ? betAmount.doubleValue() : 0.0d;
        this.P = maxAmount != null ? maxAmount.doubleValue() : 0.0d;
        ArrayList<BetChipItem> arrayList = this.M;
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
        a aVar = this.L;
        if (aVar == null || !this.S) {
            return;
        }
        aVar.notifyDataSetChanged();
        this.M.get(0).setEnabled(this.R);
        a aVar2 = this.L;
        if (aVar2 != null) {
            aVar2.notifyItemChanged(0);
        } else {
            Intrinsics.n(UccrWswQGaIj.QaqEI);
            throw null;
        }
    }
}
