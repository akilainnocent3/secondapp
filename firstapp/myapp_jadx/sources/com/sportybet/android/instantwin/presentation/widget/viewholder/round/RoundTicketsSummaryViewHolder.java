package com.sportybet.android.instantwin.presentation.widget.viewholder.round;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.Bet;
import com.sportybet.android.instantwin.newtork.model.response.TicketInRound;
import com.sportybet.android.instantwin.router.ticketdetail.InstantWinTicketDetailInput;
import defpackage.a78;
import defpackage.cq40;
import defpackage.d060;
import defpackage.dpy;
import defpackage.e5p;
import defpackage.eqf0;
import defpackage.p5l;
import defpackage.s0b;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/widget/viewholder/round/RoundTicketsSummaryViewHolder;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Le5p;", "binding", "Lcom/sportybet/android/instantwin/presentation/widget/viewholder/round/RoundTicketsSummaryViewHolder$a;", "detailDelegate", "<init>", "(Le5p;Lcom/sportybet/android/instantwin/presentation/widget/viewholder/round/RoundTicketsSummaryViewHolder$a;)V", "Ld060;", "baseItem", "Ldpy;", "onShowTicketDetailButtonClickListener", "Landroid/widget/TextView;", "setData", "(Ld060;Ldpy;)Landroid/widget/TextView;", "Le5p;", "Lcom/sportybet/android/instantwin/presentation/widget/viewholder/round/RoundTicketsSummaryViewHolder$a;", "toggleText", "Landroid/widget/TextView;", "a", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class RoundTicketsSummaryViewHolder extends BaseViewHolder {
    public static final int $stable = 8;
    private final e5p binding;
    private final a detailDelegate;
    private TextView toggleText;

    public interface a {
        BigDecimal getFlexTotalOdds(TicketInRound ticketInRound);

        BigDecimal getTotalBonus(List<Bet> list);

        BigDecimal getTotalOdds(String str, List<Bet> list);
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class b implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ dpy b;
        public final /* synthetic */ d060 c;
        public final /* synthetic */ TicketInRound d;

        public b(cq40 cq40Var, dpy dpyVar, d060 d060Var, TicketInRound ticketInRound) {
            this.a = cq40Var;
            this.b = dpyVar;
            this.c = d060Var;
            this.d = ticketInRound;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            cq40 cq40Var = this.a;
            if (jCurrentTimeMillis - cq40Var.a < 350) {
                return;
            }
            cq40Var.a = jCurrentTimeMillis;
            view.getClass();
            String str = this.c.a;
            TicketInRound ticketInRound = this.d;
            String str2 = ticketInRound != null ? ticketInRound.ticketId : null;
            eqf0 eqf0Var = (eqf0) ((p5l) this.b).a;
            Context context = eqf0Var.getContext();
            if (str == null || str2 == null || context == null) {
                return;
            }
            eqf0Var.startActivity(eqf0Var.v.d(context, new InstantWinTicketDetailInput(str, str2, InstantWinTicketDetailInput.b.b)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundTicketsSummaryViewHolder(e5p e5pVar, a aVar) {
        super(e5pVar.a);
        e5pVar.getClass();
        aVar.getClass();
        this.binding = e5pVar;
        this.detailDelegate = aVar;
        View viewFindViewById = this.itemView.findViewById(R.id.toggle_text);
        viewFindViewById.getClass();
        this.toggleText = (TextView) viewFindViewById;
    }

    public final TextView setData(d060 baseItem, dpy onShowTicketDetailButtonClickListener) {
        baseItem.getClass();
        onShowTicketDetailButtonClickListener.getClass();
        e5p e5pVar = this.binding;
        TicketInRound ticketInRound = baseItem.b;
        e5pVar.b.setData(ticketInRound, this.detailDelegate);
        TextView textView = this.toggleText;
        Context context = textView.getContext();
        context.getClass();
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, s0b.b(context, R.drawable.spr_ic_arrow_right_black_24dp, new a78.c(R.color.icon_brand_sub_primary_d_base), 16), (Drawable) null);
        textView.setOnClickListener(new b(new cq40(), onShowTicketDetailButtonClickListener, baseItem, ticketInRound));
        return textView;
    }
}
