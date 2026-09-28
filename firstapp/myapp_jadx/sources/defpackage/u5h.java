package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.components.UnderLineTextView;
import com.sportygames.fruithunt.network.models.FHBetHistoryItem;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u5h extends RecyclerView.d0 {
    public static final /* synthetic */ int b = 0;
    public final wih a;

    public static final class a {
    }

    @c0d(c = "com.sportygames.fruithunt.views.bethistory.FHuntBetHistoryItemViewHolder$fillDetails$2", f = "FHuntBetHistoryItemViewHolder.kt", l = {107}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public ea50 a;
        public int b;
        public final /* synthetic */ Activity c;
        public final /* synthetic */ FHBetHistoryItem d;
        public final /* synthetic */ u5h e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity, FHBetHistoryItem fHBetHistoryItem, u5h u5hVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = activity;
            this.d = fHBetHistoryItem;
            this.e = u5hVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ea50<Bitmap> ea50Var;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                Activity activity = this.c;
                ea50<Bitmap> ea50VarK = com.bumptech.glide.a.d(activity.getApplicationContext()).k();
                String fruitsEnum = this.d.getFruitsEnum();
                if (fruitsEnum == null) {
                    fruitsEnum = "";
                }
                this.a = ea50VarK;
                this.b = 1;
                pfd pfdVar = fse.a;
                obj = ej5.d(odd.b, new h0j(null, activity, fruitsEnum), this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
                ea50Var = ea50VarK;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ea50Var = this.a;
                uj50.b(obj);
            }
            ea50Var.P((Bitmap) obj).a(new hb50().e(hre.b)).M(this.e.a.E);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.fruithunt.views.bethistory.FHuntBetHistoryItemViewHolder$fillDetails$3", f = "FHuntBetHistoryItemViewHolder.kt", l = {121}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public ea50 a;
        public int b;
        public final /* synthetic */ Activity c;
        public final /* synthetic */ FHBetHistoryItem d;
        public final /* synthetic */ u5h e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Activity activity, FHBetHistoryItem fHBetHistoryItem, u5h u5hVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.c = activity;
            this.d = fHBetHistoryItem;
            this.e = u5hVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ea50<Bitmap> ea50Var;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                Activity activity = this.c;
                ea50<Bitmap> ea50VarK = com.bumptech.glide.a.d(activity.getApplicationContext()).k();
                String fruitsEnum = this.d.getFruitsEnum();
                if (fruitsEnum == null) {
                    fruitsEnum = "";
                }
                this.a = ea50VarK;
                this.b = 1;
                pfd pfdVar = fse.a;
                obj = ej5.d(odd.b, new g0j(null, activity, fruitsEnum), this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
                ea50Var = ea50VarK;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ea50Var = this.a;
                uj50.b(obj);
            }
            ea50Var.P((Bitmap) obj).a(new hb50().e(hre.b)).M(this.e.a.E);
            return Unit.a;
        }
    }

    public u5h(wih wihVar) {
        super(wihVar.a);
        this.a = wihVar;
    }

    public final void a(final FHBetHistoryItem fHBetHistoryItem, Activity activity) {
        fHBetHistoryItem.getClass();
        activity.getClass();
        boolean zIsExpanded = fHBetHistoryItem.isExpanded();
        wih wihVar = this.a;
        if (zIsExpanded) {
            ConstraintLayout constraintLayout = wihVar.G;
            ConstraintLayout constraintLayout2 = wihVar.e;
            AppCompatImageView appCompatImageView = wihVar.F;
            UnderLineTextView underLineTextView = wihVar.J;
            AppCompatTextView appCompatTextView = wihVar.R;
            AppCompatTextView appCompatTextView2 = wihVar.Q;
            constraintLayout.setVisibility(0);
            wihVar.B.setVisibility(8);
            wihVar.C.setVisibility(0);
            underLineTextView.setText(fHBetHistoryItem.getTicketId());
            underLineTextView.setOnClickListener(new View.OnClickListener() { // from class: t5h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String ticketId = fHBetHistoryItem.getTicketId();
                    if (ticketId == null) {
                        ticketId = "";
                    }
                    SportyGamesManager.getInstance().gotoSportyBet(xae.d, mll0.a("KEY_TICKET_ID", ticketId));
                }
            });
            com.bumptech.glide.a.d(activity.getApplicationContext()).o(Integer.valueOf(R.drawable.fh_multiplier_image)).M(appCompatImageView);
            appCompatImageView.setColorFilter(activity.getColor(i0j.a(fHBetHistoryItem.getMultiplier())), PorterDuff.Mode.SRC_IN);
            if (Intrinsics.g(fHBetHistoryItem.getMultiplier(), "Rotten")) {
                pfd pfdVar = fse.a;
                ej5.c(w5b.a(gku.a), null, null, new b(activity, fHBetHistoryItem, this, null), 3);
                appCompatTextView2.setVisibility(8);
                appCompatTextView.setVisibility(0);
                appCompatTextView.setText(m7i0.b(activity, R.string.fh_rotten_cms, R.string.fh_rotten));
            } else {
                pfd pfdVar2 = fse.a;
                ej5.c(w5b.a(gku.a), null, null, new c(activity, fHBetHistoryItem, this, null), 3);
                appCompatTextView2.setVisibility(0);
                appCompatTextView.setVisibility(8);
                appCompatTextView2.setText(fHBetHistoryItem.getMultiplier());
            }
            Double giftAmount = fHBetHistoryItem.getGiftAmount();
            if ((giftAmount != null ? giftAmount.doubleValue() : 0.0d) > 0.0d) {
                TextView textView = wihVar.L;
                TreeMap treeMap = pw.a;
                Double stakeAmount = fHBetHistoryItem.getStakeAmount();
                textView.setText(pw.d(stakeAmount != null ? stakeAmount.doubleValue() : 0.0d));
                Double giftAmount2 = fHBetHistoryItem.getGiftAmount();
                String strConcat = "- ".concat(pw.d(giftAmount2 != null ? giftAmount2.doubleValue() : 0.0d));
                wihVar.d.setText(strConcat);
                TextView textView2 = wihVar.U;
                Double actualDebitedAmount = fHBetHistoryItem.getActualDebitedAmount();
                textView2.setText(pw.d(actualDebitedAmount != null ? actualDebitedAmount.doubleValue() : 0.0d));
                Double payoutAmount = fHBetHistoryItem.getPayoutAmount();
                double dDoubleValue = payoutAmount != null ? payoutAmount.doubleValue() : 0.0d;
                ConstraintLayout constraintLayout3 = wihVar.z;
                if (dDoubleValue <= 0.0d) {
                    constraintLayout3.setVisibility(8);
                } else {
                    constraintLayout3.setVisibility(0);
                    TextView textView3 = wihVar.N;
                    Double payoutAmount2 = fHBetHistoryItem.getPayoutAmount();
                    textView3.setText(pw.d(payoutAmount2 != null ? payoutAmount2.doubleValue() : 0.0d));
                    wihVar.f.setText(strConcat);
                    TextView textView4 = wihVar.W;
                    Double actualCreditedAmount = fHBetHistoryItem.getActualCreditedAmount();
                    textView4.setText(pw.d(actualCreditedAmount != null ? actualCreditedAmount.doubleValue() : 0.0d));
                    wihVar.O.setText(m7i0.b(activity, R.string.fh_total_win_cms, R.string.fh_total_win));
                    wihVar.v.setText(m7i0.b(activity, R.string.fh_free_gift_bet_cms, R.string.fh_free_gift_bet));
                    wihVar.X.setText(m7i0.b(activity, R.string.fh_you_won_cms, R.string.fh_you_won));
                }
                wihVar.M.setText(m7i0.b(activity, R.string.fh_total_stake_cms, R.string.fh_total_stake));
                wihVar.i.setText(m7i0.b(activity, R.string.fh_free_gift_bet_cms, R.string.fh_free_gift_bet));
                wihVar.V.setText(m7i0.b(activity, R.string.fh_you_paid_cms, R.string.fh_you_paid));
                constraintLayout2.setVisibility(0);
            } else {
                constraintLayout2.setVisibility(8);
            }
            wihVar.Y.setText(m7i0.b(activity, R.string.fh_fruit_and_coefficient_cms, R.string.fh_fruit_and_coefficient));
        } else {
            wihVar.G.setVisibility(8);
            wihVar.B.setVisibility(0);
            wihVar.C.setVisibility(8);
        }
        wihVar.b.setText(m7i0.b(activity, R.string.fh_history_details_cms, R.string.fh_history_details));
    }
}
