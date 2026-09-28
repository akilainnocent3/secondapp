package com.sportygames.pocketrocket.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.ybq.android.spinkit.SpinKitView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.enums.PagingFetchType;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.pocketrocket.model.response.BetDetails;
import com.sportygames.pocketrocket.model.response.GameSocektResponse;
import com.sportygames.pocketrocket.model.response.RoundBetResponse;
import defpackage.bmy;
import defpackage.ej5;
import defpackage.fn1;
import defpackage.fw2;
import defpackage.h5e;
import defpackage.ibs;
import defpackage.o8i0;
import defpackage.o920;
import defpackage.op5;
import defpackage.pn1;
import defpackage.y8h0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/sportygames/pocketrocket/component/PrUserBet;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lfw2;", "a", "Lfw2;", "getBinding", "()Lfw2;", "setBinding", "(Lfw2;)V", "binding", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PrUserBet extends LinearLayout {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public fw2 binding;
    public ibs b;
    public o920 c;
    public List<BetDetails> d;
    public final ArrayList e;
    public boolean f;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrUserBet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.bet_list_layout, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R.id.biggest_coeff;
        if (((ConstraintLayout) h5e.a(R.id.biggest_coeff, viewInflate)) != null) {
            i2 = R.id.coeff;
            TextView textView = (TextView) h5e.a(R.id.coeff, viewInflate);
            if (textView != null) {
                i2 = R.id.list;
                RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.list, viewInflate);
                if (recyclerView != null) {
                    i2 = R.id.no_record_found;
                    CardView cardView = (CardView) h5e.a(R.id.no_record_found, viewInflate);
                    if (cardView != null) {
                        i2 = R.id.no_record_text;
                        TextView textView2 = (TextView) h5e.a(R.id.no_record_text, viewInflate);
                        if (textView2 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            i2 = R.id.pr_round_history_list;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.pr_round_history_list, viewInflate);
                            if (constraintLayout2 != null) {
                                i2 = R.id.rocket;
                                TextView textView3 = (TextView) h5e.a(R.id.rocket, viewInflate);
                                if (textView3 != null) {
                                    i2 = R.id.spin_kit;
                                    SpinKitView spinKitView = (SpinKitView) h5e.a(R.id.spin_kit, viewInflate);
                                    if (spinKitView != null) {
                                        i2 = R.id.stake;
                                        TextView textView4 = (TextView) h5e.a(R.id.stake, viewInflate);
                                        if (textView4 != null) {
                                            i2 = R.id.status;
                                            TextView textView5 = (TextView) h5e.a(R.id.status, viewInflate);
                                            if (textView5 != null) {
                                                i2 = R.id.time;
                                                TextView textView6 = (TextView) h5e.a(R.id.time, viewInflate);
                                                if (textView6 != null) {
                                                    this.binding = new fw2(constraintLayout, textView, recyclerView, cardView, textView2, constraintLayout2, textView3, spinKitView, textView4, textView5, textView6);
                                                    this.d = new ArrayList();
                                                    this.e = new ArrayList();
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
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final void a(RoundBetResponse roundBetResponse, GameSocektResponse gameSocektResponse) {
        roundBetResponse.getClass();
        try {
            BetDetails bet = roundBetResponse.getBet();
            Iterator<BetDetails> it = this.d.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                BetDetails next = it.next();
                if (bet != null && next.getBetId() == bet.getBetId()) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                if (bet != null) {
                    this.d.get(i2).setTicketStatus("WIN");
                    this.d.get(i2).setPayoutAmount(bet.getPayoutAmount());
                    this.d.get(i2).setCashoutCoefficient(bet.getCashoutCoefficient());
                    this.d.get(i2).setBackground(true);
                    o920 o920Var = this.c;
                    if (o920Var == null) {
                        c();
                        return;
                    }
                    List<BetDetails> list = this.d;
                    list.getClass();
                    o920Var.c = list;
                    o920Var.a = y8h0.b(list);
                    o920Var.notifyDataSetChanged();
                    return;
                }
                return;
            }
            if (bet != null) {
                String str = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date());
                str.getClass();
                bet.setCreatedAt(str);
                bet.setTicketStatus("ONGOING");
                if (!Intrinsics.g(gameSocektResponse != null ? gameSocektResponse.getMessageType() : null, "ROUND_WAITING")) {
                    this.e.add(0, bet);
                    return;
                }
                this.d.add(0, bet);
                o920 o920Var2 = this.c;
                if (o920Var2 == null) {
                    c();
                    return;
                }
                List<BetDetails> list2 = this.d;
                list2.getClass();
                o920Var2.c = list2;
                o920Var2.a = y8h0.b(list2);
                o920Var2.notifyDataSetChanged();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void b(fn1 fn1Var, ibs ibsVar, boolean z) {
        fn1Var.getClass();
        ibsVar.getClass();
        try {
            this.f = z;
            this.b = ibsVar;
            this.binding.f.setVisibility(8);
            this.binding.v.setVisibility(0);
            PagingFetchType pagingFetchType = PagingFetchType.VIEW_MORE;
            pagingFetchType.getClass();
            ej5.c(o8i0.d(fn1Var), null, null, new pn1(fn1Var, pagingFetchType, null), 3);
            TextView textView = this.binding.e;
            Context context = getContext();
            textView.setTag(context != null ? context.getString(R.string.no_records_found_cms) : null);
            op5 op5Var = op5.a;
            fw2 fw2Var = this.binding;
            op5.r(op5Var, b.f(fw2Var.z, fw2Var.w, fw2Var.y, fw2Var.i, fw2Var.b, fw2Var.e), null, 4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void c() {
        RecyclerView recyclerView = this.binding.c;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        List<BetDetails> list = this.d;
        Context context = getContext();
        context.getClass();
        o920 o920Var = new o920(context, list);
        this.c = o920Var;
        this.binding.c.setAdapter(o920Var);
    }

    public final fw2 getBinding() {
        return this.binding;
    }

    public final void setBinding(fw2 fw2Var) {
        fw2Var.getClass();
        this.binding = fw2Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PrUserBet(Context context) {
        this(context, null);
        context.getClass();
    }
}
