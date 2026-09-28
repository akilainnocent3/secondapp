package com.sportygames.sportyherov2.components;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i0;
import com.github.ybq.android.spinkit.SpinKitView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.sportyherov2.components.ShAllBetList;
import com.sportygames.sportyherov2.remote.models.RoundBetResponse;
import com.sportygames.sportyherov2.remote.models.TopBets;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.o48;
import defpackage.op5;
import defpackage.pq80;
import defpackage.ycv;
import defpackage.zx50;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/sportygames/sportyherov2/components/ShAllBetList;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getSelectedTab", "()I", "getAllBets", "", "getScreenHeightMultiplier", "()D", "Lpq80;", "G", "Lpq80;", "getBinding", "()Lpq80;", "setBinding", "(Lpq80;)V", "binding", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShAllBetList extends ConstraintLayout {
    public static final /* synthetic */ int K = 0;
    public int F;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public pq80 binding;
    public ArrayList H;
    public zx50 I;
    public boolean J;

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return Double.valueOf(((TopBets) t2).getStakeAmount()).compareTo(Double.valueOf(((TopBets) t).getStakeAmount()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShAllBetList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sh_all_bet_list_v2, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.header_bet_win;
        TextView textView = (TextView) h5e.a(R.id.header_bet_win, viewInflate);
        if (textView != null) {
            i = R.id.header_coeff;
            TextView textView2 = (TextView) h5e.a(R.id.header_coeff, viewInflate);
            if (textView2 != null) {
                i = R.id.header_name;
                TextView textView3 = (TextView) h5e.a(R.id.header_name, viewInflate);
                if (textView3 != null) {
                    i = R.id.header_row;
                    LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.header_row, viewInflate);
                    if (linearLayout != null) {
                        i = R.id.header_win;
                        TextView textView4 = (TextView) h5e.a(R.id.header_win, viewInflate);
                        if (textView4 != null) {
                            i = R.id.img_poker_chips;
                            if (((ImageView) h5e.a(R.id.img_poker_chips, viewInflate)) != null) {
                                i = R.id.loader;
                                SpinKitView spinKitView = (SpinKitView) h5e.a(R.id.loader, viewInflate);
                                if (spinKitView != null) {
                                    i = R.id.no_bets_layout;
                                    LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.no_bets_layout, viewInflate);
                                    if (linearLayout2 != null) {
                                        i = R.id.recycler_view_bets;
                                        RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.recycler_view_bets, viewInflate);
                                        if (recyclerView != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                            i = R.id.tv_no_bets;
                                            TextView textView5 = (TextView) h5e.a(R.id.tv_no_bets, viewInflate);
                                            if (textView5 != null) {
                                                this.binding = new pq80(constraintLayout, textView, textView2, textView3, linearLayout, textView4, spinKitView, linearLayout2, recyclerView, constraintLayout, textView5);
                                                this.H = new ArrayList();
                                                return;
                                            }
                                        }
                                    }
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
        try {
            this.H.clear();
            zx50 zx50Var = this.I;
            if (zx50Var == null) {
                H();
            } else {
                zx50Var.i(this.H);
            }
        } catch (Exception unused) {
        }
    }

    public final void F(float f) {
        try {
            float fB = ycv.b((f / 100.0f) * 100.0f) / 100.0f;
            if (fB < 0.0f) {
                fB -= 0.1f;
            }
            if (fB == 0.0f || this.J) {
                return;
            }
            this.J = true;
            ViewGroup.LayoutParams layoutParams = this.binding.y.getLayoutParams();
            layoutParams.height = (int) ((getScreenHeightMultiplier() + ((double) fB)) * ((double) layoutParams.height));
            this.binding.y.setLayoutParams(layoutParams);
            this.binding.y.requestLayout();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void G(RoundBetResponse roundBetResponse) {
        if (this.F != 0) {
            return;
        }
        try {
            if (Intrinsics.g(roundBetResponse.getMessageType(), "CASHOUT_RECORD")) {
                final TopBets bet = roundBetResponse.getBet();
                this.H.replaceAll(new UnaryOperator() { // from class: oq80
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        TopBets topBets = (TopBets) obj;
                        int i = ShAllBetList.K;
                        topBets.getClass();
                        TopBets topBets2 = bet;
                        return (topBets2 == null || topBets.getBetId() != topBets2.getBetId()) ? topBets : topBets2;
                    }
                });
                zx50 zx50Var = this.I;
                if (zx50Var == null) {
                    Intrinsics.n("allBetAdapter");
                    throw null;
                }
                zx50Var.i(this.H);
            } else {
                List<TopBets> topBets = roundBetResponse.getTopBets();
                ArrayList arrayList = topBets != null ? new ArrayList(topBets) : null;
                if (arrayList != null) {
                    this.H = arrayList;
                }
                ArrayList arrayList2 = this.H;
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    if (Intrinsics.g(((TopBets) obj).getUserId(), SportyGamesManager.getInstance().getUserId())) {
                        arrayList3.add(obj);
                    }
                }
                ArrayList arrayList4 = this.H;
                if (arrayList4.size() > 1) {
                    o48.v(new b(), arrayList4);
                }
                if (!arrayList3.isEmpty()) {
                    this.H.removeAll(arrayList3);
                    this.H.addAll(0, arrayList3);
                }
                zx50 zx50Var2 = this.I;
                if (zx50Var2 == null) {
                    H();
                } else {
                    zx50Var2.i(this.H);
                }
            }
            this.binding.i.setVisibility(8);
            if (this.H.isEmpty()) {
                I();
                return;
            }
            J(this.F);
            this.binding.v.setVisibility(8);
            this.binding.w.setVisibility(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void H() {
        try {
            if (this.binding.w.getAdapter() != null) {
                this.binding.w.setAdapter(null);
            }
            Context context = getContext();
            context.getClass();
            this.I = new zx50(context, this.H);
            RecyclerView.l itemAnimator = this.binding.w.getItemAnimator();
            itemAnimator.getClass();
            ((i0) itemAnimator).g = false;
            RecyclerView recyclerView = this.binding.w;
            getContext().getClass();
            recyclerView.setLayoutManager(new ShAllBetList$setAllBetAdapter$1(1, false));
            RecyclerView recyclerView2 = this.binding.w;
            zx50 zx50Var = this.I;
            if (zx50Var != null) {
                recyclerView2.setAdapter(zx50Var);
            } else {
                Intrinsics.n("allBetAdapter");
                throw null;
            }
        } catch (Exception unused) {
        }
    }

    public final void I() {
        op5.r(op5.a, kotlin.collections.b.f(this.binding.z), null, 6);
        this.binding.v.setVisibility(0);
        this.binding.w.setVisibility(4);
        this.binding.e.setVisibility(8);
    }

    public final void J(int i) {
        if (getContext() != null) {
            this.binding.e.setVisibility(0);
            pq80 pq80Var = this.binding;
            if (i == 1) {
                TextView textView = pq80Var.d;
                op5 op5Var = op5.a;
                String string = getContext().getString(R.string.round_id_cms_tournament);
                string.getClass();
                op5Var.getClass();
                textView.setText(op5.b(string, "Round ID", null));
            } else {
                TextView textView2 = pq80Var.d;
                op5 op5Var2 = op5.a;
                String string2 = getContext().getString(R.string.name_cms);
                string2.getClass();
                op5Var2.getClass();
                textView2.setText(op5.b(string2, "Name", null));
            }
            TextView textView3 = this.binding.b;
            String string3 = getContext().getString(R.string.bet_text_small);
            string3.getClass();
            String strB = op5.b(string3, "Bet", null);
            try {
                if (strB.length() != 0) {
                    String strSubstring = strB.substring(0, 1);
                    Locale locale = Locale.ROOT;
                    String upperCase = strSubstring.toUpperCase(locale);
                    upperCase.getClass();
                    String lowerCase = strB.substring(1).toLowerCase(locale);
                    lowerCase.getClass();
                    strB = upperCase.concat(lowerCase);
                }
            } catch (Exception unused) {
            }
            textView3.setText(strB);
            TextView textView4 = this.binding.c;
            String string4 = getContext().getString(R.string.coeff_cms);
            string4.getClass();
            textView4.setText(op5.b(string4, "Coeff", null));
            TextView textView5 = this.binding.f;
            String string5 = getContext().getString(R.string.win_cms);
            string5.getClass();
            textView5.setText(op5.b(string5, "Win", null));
        }
    }

    public final int getAllBets() {
        if (this.H.isEmpty()) {
            return 0;
        }
        return this.H.size();
    }

    public final pq80 getBinding() {
        return this.binding;
    }

    public final double getScreenHeightMultiplier() {
        Context context = getContext();
        if (context == null) {
            return 1.0d;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = displayMetrics.heightPixels;
        float f2 = displayMetrics.widthPixels;
        if (f == 0.0f || f2 == 0.0f) {
            return 1.0d;
        }
        float f3 = f / f2;
        if (f3 >= 2.1f) {
            return 1.11d;
        }
        if (f3 >= 2.0f) {
            return 1.1d;
        }
        return f3 >= 1.82f ? 1.05d : 1.0d;
    }

    /* JADX INFO: renamed from: getSelectedTab, reason: from getter */
    public final int getF() {
        return this.F;
    }

    public final void setBinding(pq80 pq80Var) {
        pq80Var.getClass();
        this.binding = pq80Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShAllBetList(Context context) {
        this(context, null);
        context.getClass();
    }
}
