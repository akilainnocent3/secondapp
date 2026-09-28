package com.sportygames.spinmatch.components;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.spinmatch.model.response.DetailResponse;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.jk2;
import defpackage.ok2;
import defpackage.pw;
import defpackage.tk2;
import defpackage.vk2;
import defpackage.wk2;
import defpackage.ypa0;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001%B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000f\u001a\u00020\u000e2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/sportygames/spinmatch/components/BetConfig;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ljava/util/ArrayList;", "Lcom/sportygames/spinmatch/model/response/DetailResponse$BetConfigList;", "Lkotlin/collections/ArrayList;", "betConfigList", "Lypa0;", "soundViewModel", "", "setBetConfigList", "(Ljava/util/ArrayList;Lypa0;)V", "Lkotlin/Function1;", "", "listener", "setBetConfigClick", "(Lkotlin/jvm/functions/Function1;)V", "position", "setCrown", "(I)V", "", "alpha", "setChipAlpha", "(F)V", "Lvk2;", "F", "Lvk2;", "getBinding", "()Lvk2;", "setBinding", "(Lvk2;)V", "binding", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BetConfig extends ConstraintLayout {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public vk2 binding;
    public Integer G;
    public Function1<? super Integer, Unit> H;

    public static final class a extends RecyclerView.n {
        public final int a;
        public final ArrayList<DetailResponse.BetConfigList> b;

        public a(int i, ArrayList<DetailResponse.BetConfigList> arrayList) {
            arrayList.getClass();
            this.a = i;
            this.b = arrayList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            rect.getClass();
            view.getClass();
            zVar.getClass();
            int iP = RecyclerView.P(view);
            int i = this.a;
            if (iP != 0) {
                rect.left = i;
            }
            if (iP != this.b.size() - 1) {
                rect.right = i;
            }
        }
    }

    /* JADX INFO: renamed from: com.sportygames.spinmatch.components.BetConfig$setBetConfigList$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/sportygames/spinmatch/components/BetConfig$setBetConfigList$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean s() {
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean t() {
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BetConfig(Context context, AttributeSet attributeSet) {
        super(context.getApplicationContext(), attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.bet_config, (ViewGroup) this, false);
        addView(viewInflate);
        RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.bet_config_list, viewInflate);
        if (recyclerView != null) {
            this.binding = new vk2((LinearLayout) viewInflate, recyclerView);
        } else {
            bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.bet_config_list)));
            throw null;
        }
    }

    public final void E(int i, double d, ArrayList<Double> arrayList, boolean z) {
        arrayList.getClass();
        vk2 vk2Var = this.binding;
        RecyclerView.f adapter = vk2Var != null ? vk2Var.b.getAdapter() : null;
        tk2 tk2Var = adapter instanceof tk2 ? (tk2) adapter : null;
        if (tk2Var != null) {
            Context context = tk2Var.b;
            try {
                Integer num = jk2.b.get(jk2.a(d, arrayList));
                RecyclerView recyclerView = tk2Var.c;
                RecyclerView.d0 d0VarQ = recyclerView.Q(recyclerView.getChildAt(i));
                d0VarQ.getClass();
                tk2.a aVar = (tk2.a) d0VarQ;
                TextView textView = (TextView) aVar.itemView.findViewById(R.id.bet_amount_match);
                TreeMap treeMap = pw.a;
                textView.setText(pw.l(d));
                if (z) {
                    String string = ((TextView) aVar.itemView.findViewById(R.id.payout_amount)).getText().toString();
                    if (((ConstraintLayout) aVar.itemView.findViewById(R.id.chip_layout)).getVisibility() == 4) {
                        int length = string.length();
                        View view = aVar.itemView;
                        if (length <= 2) {
                            ((TextView) view.findViewById(R.id.payout_amount)).startAnimation(AnimationUtils.loadAnimation(context, R.anim.slide_left_multiplier_anim));
                        } else {
                            ((TextView) view.findViewById(R.id.payout_amount)).startAnimation(AnimationUtils.loadAnimation(context, R.anim.slide_left));
                        }
                        ((ConstraintLayout) aVar.itemView.findViewById(R.id.chip_layout)).setVisibility(0);
                    } else {
                        int length2 = string.length();
                        View view2 = aVar.itemView;
                        if (length2 <= 2) {
                            ((TextView) view2.findViewById(R.id.payout_amount)).startAnimation(AnimationUtils.loadAnimation(context, R.anim.slide_right_multiplier_anim));
                        } else {
                            ((TextView) view2.findViewById(R.id.payout_amount)).startAnimation(AnimationUtils.loadAnimation(context, R.anim.slide_right));
                        }
                        ((ConstraintLayout) aVar.itemView.findViewById(R.id.chip_layout)).setVisibility(4);
                    }
                }
                if (num != null) {
                    int iIntValue = num.intValue();
                    View viewFindViewById = aVar.itemView.findViewById(R.id.chip_image);
                    viewFindViewById.getClass();
                    ImageView imageView = (ImageView) viewFindViewById;
                    View viewFindViewById2 = aVar.itemView.findViewById(R.id.parentLayout);
                    viewFindViewById2.getClass();
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById2;
                    imageView.setImageDrawable(context.getDrawable(iIntValue));
                    imageView.getLayoutParams().height = constraintLayout.getHeight() / 3;
                    imageView.getLayoutParams().width = constraintLayout.getWidth() / 3;
                    ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    layoutParams.getClass();
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, (int) (((double) imageView.getLayoutParams().width) / 1.8d), (int) (((double) imageView.getLayoutParams().width) / 1.8d));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void F(double d, int i, boolean z) {
        View view;
        TextView textView;
        View view2;
        ConstraintLayout constraintLayout;
        View view3;
        TextView textView2;
        View view4;
        ConstraintLayout constraintLayout2;
        View view5;
        TextView textView3;
        View view6;
        TextView textView4;
        vk2 vk2Var = this.binding;
        CharSequence text = null;
        RecyclerView.f adapter = vk2Var != null ? vk2Var.b.getAdapter() : null;
        adapter.getClass();
        tk2 tk2Var = (tk2) adapter;
        String str = "0.00";
        Context context = tk2Var.b;
        try {
            RecyclerView recyclerView = tk2Var.c;
            RecyclerView.d0 d0VarQ = recyclerView.Q(recyclerView.getChildAt(i));
            tk2.a aVar = d0VarQ instanceof tk2.a ? (tk2.a) d0VarQ : null;
            if (aVar != null && (view6 = aVar.itemView) != null && (textView4 = (TextView) view6.findViewById(R.id.tv_fbg_sm)) != null) {
                try {
                    String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d);
                    str2.getClass();
                    str = str2;
                } catch (Exception unused) {
                }
                textView4.setText(str);
            }
            if (z) {
                if (aVar != null && (view5 = aVar.itemView) != null && (textView3 = (TextView) view5.findViewById(R.id.payout_amount)) != null) {
                    text = textView3.getText();
                }
                String strValueOf = String.valueOf(text);
                if (aVar != null && (view4 = aVar.itemView) != null && (constraintLayout2 = (ConstraintLayout) view4.findViewById(R.id.fbg_chip_layout)) != null && constraintLayout2.getVisibility() == 4) {
                    int length = strValueOf.length();
                    View view7 = aVar.itemView;
                    if (length <= 2) {
                        ((TextView) view7.findViewById(R.id.payout_amount)).startAnimation(AnimationUtils.loadAnimation(context, R.anim.slide_left_multiplier_anim));
                    } else {
                        ((TextView) view7.findViewById(R.id.payout_amount)).startAnimation(AnimationUtils.loadAnimation(context, R.anim.slide_left));
                    }
                    ((ConstraintLayout) aVar.itemView.findViewById(R.id.fbg_chip_layout)).setVisibility(0);
                    return;
                }
                if (strValueOf.length() <= 2) {
                    if (aVar != null && (view3 = aVar.itemView) != null && (textView2 = (TextView) view3.findViewById(R.id.payout_amount)) != null) {
                        textView2.startAnimation(AnimationUtils.loadAnimation(context, R.anim.slide_right_multiplier_anim));
                    }
                } else if (aVar != null && (view = aVar.itemView) != null && (textView = (TextView) view.findViewById(R.id.payout_amount)) != null) {
                    textView.startAnimation(AnimationUtils.loadAnimation(context, R.anim.slide_right));
                }
                if (aVar == null || (view2 = aVar.itemView) == null || (constraintLayout = (ConstraintLayout) view2.findViewById(R.id.fbg_chip_layout)) == null) {
                    return;
                }
                constraintLayout.setVisibility(4);
            }
        } catch (Exception unused2) {
        }
    }

    public final void G(List<Integer> list) {
        int i;
        Integer numValueOf;
        DetailResponse.BetConfigList betConfigList;
        list.getClass();
        vk2 vk2Var = this.binding;
        RecyclerView.f adapter = vk2Var != null ? vk2Var.b.getAdapter() : null;
        adapter.getClass();
        tk2 tk2Var = (tk2) adapter;
        Context context = tk2Var.b;
        RecyclerView recyclerView = tk2Var.c;
        ArrayList<DetailResponse.BetConfigList> arrayList = tk2Var.a;
        tk2Var.i = -1;
        Iterator<T> it = list.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            int iIntValue = ((Number) it.next()).intValue();
            if (arrayList != null) {
                int size = arrayList.size();
                do {
                    if (i >= size) {
                        betConfigList = null;
                        break;
                    } else {
                        betConfigList = arrayList.get(i);
                        i++;
                    }
                } while (betConfigList.getId() != iIntValue);
                numValueOf = Integer.valueOf(arrayList.indexOf(betConfigList));
            } else {
                numValueOf = null;
            }
            if (numValueOf != null) {
                RecyclerView.d0 d0VarQ = recyclerView.Q(recyclerView.getChildAt(numValueOf.intValue()));
                d0VarQ.getClass();
                tk2.a aVar = (tk2.a) d0VarQ;
                int length = ((TextView) aVar.itemView.findViewById(R.id.payout_amount)).getText().toString().length();
                View view = aVar.itemView;
                if (length <= 2) {
                    ((TextView) view.findViewById(R.id.payout_amount)).startAnimation(AnimationUtils.loadAnimation(context, R.anim.slide_fast_right_anim));
                } else {
                    ((TextView) view.findViewById(R.id.payout_amount)).startAnimation(AnimationUtils.loadAnimation(context, R.anim.slide_fast_right));
                }
                ((ConstraintLayout) aVar.itemView.findViewById(R.id.chip_layout)).setVisibility(4);
                aVar.a.d.setImageDrawable(null);
            }
        }
        if (arrayList != null) {
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                arrayList.get(i2);
                i2++;
                int i3 = i + 1;
                if (i < 0) {
                    b.q();
                    throw null;
                }
                RecyclerView.d0 d0VarQ2 = recyclerView.Q(recyclerView.getChildAt(i));
                d0VarQ2.getClass();
                ((tk2.a) d0VarQ2).a.d.setImageDrawable(null);
                i = i3;
            }
        }
    }

    public final void H() {
        Integer num = this.G;
        if (num != null) {
            int iIntValue = num.intValue();
            vk2 vk2Var = this.binding;
            RecyclerView.f adapter = vk2Var != null ? vk2Var.b.getAdapter() : null;
            adapter.getClass();
            RecyclerView recyclerView = ((tk2) adapter).c;
            RecyclerView.d0 d0VarQ = recyclerView.Q(recyclerView.getChildAt(iIntValue));
            d0VarQ.getClass();
            ((ImageView) ((tk2.a) d0VarQ).itemView.findViewById(R.id.crown)).setVisibility(8);
        }
    }

    public final void I(int i, double d) {
        View view;
        TextView textView;
        View view2;
        ConstraintLayout constraintLayout;
        View view3;
        TextView textView2;
        View view4;
        TextView textView3;
        View view5;
        TextView textView4;
        vk2 vk2Var = this.binding;
        CharSequence text = null;
        RecyclerView.f adapter = vk2Var != null ? vk2Var.b.getAdapter() : null;
        adapter.getClass();
        tk2 tk2Var = (tk2) adapter;
        Context context = tk2Var.b;
        String str = "0.00";
        try {
            RecyclerView recyclerView = tk2Var.c;
            RecyclerView.d0 d0VarQ = recyclerView.Q(recyclerView.getChildAt(i));
            tk2.a aVar = d0VarQ instanceof tk2.a ? (tk2.a) d0VarQ : null;
            if (aVar != null && (view5 = aVar.itemView) != null && (textView4 = (TextView) view5.findViewById(R.id.tv_fbg_sm)) != null) {
                try {
                    String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d);
                    str2.getClass();
                    str = str2;
                } catch (Exception unused) {
                }
                textView4.setText(str);
            }
            if (aVar != null && (view4 = aVar.itemView) != null && (textView3 = (TextView) view4.findViewById(R.id.payout_amount)) != null) {
                text = textView3.getText();
            }
            if (String.valueOf(text).length() <= 2) {
                if (aVar != null && (view3 = aVar.itemView) != null && (textView2 = (TextView) view3.findViewById(R.id.payout_amount)) != null) {
                    textView2.startAnimation(AnimationUtils.loadAnimation(context, R.anim.slide_right_multiplier_anim));
                }
            } else if (aVar != null && (view = aVar.itemView) != null && (textView = (TextView) view.findViewById(R.id.payout_amount)) != null) {
                textView.startAnimation(AnimationUtils.loadAnimation(context, R.anim.slide_right));
            }
            if (aVar == null || (view2 = aVar.itemView) == null || (constraintLayout = (ConstraintLayout) view2.findViewById(R.id.fbg_chip_layout)) == null) {
                return;
            }
            constraintLayout.setVisibility(4);
        } catch (Exception unused2) {
        }
    }

    public final void J(List<Integer> list) {
        int i;
        Integer numValueOf;
        DetailResponse.BetConfigList betConfigList;
        list.getClass();
        vk2 vk2Var = this.binding;
        RecyclerView.f adapter = vk2Var != null ? vk2Var.b.getAdapter() : null;
        tk2 tk2Var = adapter instanceof tk2 ? (tk2) adapter : null;
        if (tk2Var != null) {
            RecyclerView recyclerView = tk2Var.c;
            ArrayList<DetailResponse.BetConfigList> arrayList = tk2Var.a;
            Context context = tk2Var.b;
            try {
                tk2Var.i = -1;
                Iterator<T> it = list.iterator();
                while (true) {
                    i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    int iIntValue = ((Number) it.next()).intValue();
                    if (arrayList != null) {
                        int size = arrayList.size();
                        do {
                            if (i >= size) {
                                betConfigList = null;
                                break;
                            } else {
                                betConfigList = arrayList.get(i);
                                i++;
                            }
                        } while (betConfigList.getId() != iIntValue);
                        numValueOf = Integer.valueOf(arrayList.indexOf(betConfigList));
                    } else {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        RecyclerView.d0 d0VarQ = recyclerView.Q(recyclerView.getChildAt(numValueOf.intValue()));
                        d0VarQ.getClass();
                        tk2.a aVar = (tk2.a) d0VarQ;
                        int length = ((TextView) aVar.itemView.findViewById(R.id.payout_amount)).getText().toString().length();
                        View view = aVar.itemView;
                        if (length <= 2) {
                            ((TextView) view.findViewById(R.id.payout_amount)).startAnimation(AnimationUtils.loadAnimation(context, R.anim.slide_right_multiplier_anim));
                        } else {
                            ((TextView) view.findViewById(R.id.payout_amount)).startAnimation(AnimationUtils.loadAnimation(context, R.anim.slide_right));
                        }
                        ((TextView) aVar.itemView.findViewById(R.id.payout_amount)).startAnimation(AnimationUtils.loadAnimation(context, R.anim.slide_right));
                        ((ConstraintLayout) aVar.itemView.findViewById(R.id.chip_layout)).setVisibility(4);
                        aVar.a.d.setImageDrawable(null);
                    }
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        DetailResponse.BetConfigList betConfigList2 = arrayList.get(i2);
                        i2++;
                        int i3 = i + 1;
                        if (i < 0) {
                            b.q();
                            throw null;
                        }
                        RecyclerView.d0 d0VarQ2 = recyclerView.Q(recyclerView.getChildAt(i));
                        d0VarQ2.getClass();
                        ((tk2.a) d0VarQ2).a.d.setImageDrawable(null);
                        i = i3;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final vk2 getBinding() {
        return this.binding;
    }

    public final void setBetConfigClick(Function1<? super Integer, Unit> listener) {
        listener.getClass();
        this.H = listener;
    }

    public final void setBetConfigList(ArrayList<DetailResponse.BetConfigList> betConfigList, ypa0 soundViewModel) {
        vk2 vk2Var;
        betConfigList.getClass();
        soundViewModel.getClass();
        Context context = getContext();
        tk2 tk2Var = null;
        if (context != null && (vk2Var = this.binding) != null) {
            tk2Var = new tk2(betConfigList, context, vk2Var.b, soundViewModel);
        }
        vk2 vk2Var2 = this.binding;
        if (vk2Var2 != null) {
            vk2Var2.b.setAdapter(tk2Var);
        }
        vk2 vk2Var3 = this.binding;
        if (vk2Var3 != null) {
            RecyclerView recyclerView = vk2Var3.b;
            recyclerView.i(new a((-recyclerView.getWidth()) / 31, betConfigList));
        }
        vk2 vk2Var4 = this.binding;
        if (vk2Var4 != null) {
            RecyclerView recyclerView2 = vk2Var4.b;
            getContext();
            recyclerView2.setLayoutManager(new AnonymousClass1(0, false));
        }
        if (tk2Var != null) {
            tk2Var.f = new ok2(this, 0);
        }
    }

    public final void setBinding(vk2 vk2Var) {
        this.binding = vk2Var;
    }

    public final void setChipAlpha(float alpha) {
        ArrayList<DetailResponse.BetConfigList> arrayList;
        vk2 vk2Var = this.binding;
        RecyclerView.f adapter = vk2Var != null ? vk2Var.b.getAdapter() : null;
        tk2 tk2Var = adapter instanceof tk2 ? (tk2) adapter : null;
        if (tk2Var == null || (arrayList = tk2Var.a) == null) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            RecyclerView recyclerView = tk2Var.c;
            RecyclerView.d0 d0VarQ = recyclerView.Q(recyclerView.getChildAt(i));
            d0VarQ.getClass();
            wk2 wk2Var = ((tk2.a) d0VarQ).a;
            wk2Var.e.setAlpha(alpha);
            wk2Var.b.setAlpha(alpha);
            i = i3;
        }
    }

    public final void setCrown(int position) {
        this.G = Integer.valueOf(position);
        vk2 vk2Var = this.binding;
        RecyclerView.f adapter = vk2Var != null ? vk2Var.b.getAdapter() : null;
        adapter.getClass();
        RecyclerView recyclerView = ((tk2) adapter).c;
        RecyclerView.d0 d0VarQ = recyclerView.Q(recyclerView.getChildAt(position));
        d0VarQ.getClass();
        ((ImageView) ((tk2.a) d0VarQ).itemView.findViewById(R.id.crown)).setVisibility(0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BetConfig(Context context) {
        this(context, null);
        context.getClass();
    }
}
