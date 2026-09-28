package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Bet;
import com.sportybet.plugin.realsports.data.BetSelection;
import com.sportybet.plugin.realsports.data.UserNote;
import com.sportybet.plugin.realsports.data.sim.SimShareData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class qhl extends gi6 {
    public final tgd0 b;
    public final zzy c;
    public final Function1<View, Unit> d;
    public final uh6 e;

    /* JADX WARN: Illegal instructions before constructor call */
    public qhl(tgd0 tgd0Var, ek6 ek6Var, ArrayList arrayList, mj6 mj6Var, uh6 uh6Var) {
        ek6Var.getClass();
        arrayList.getClass();
        mj6Var.getClass();
        ConstraintLayout constraintLayout = tgd0Var.a;
        constraintLayout.getClass();
        super(constraintLayout, arrayList);
        this.b = tgd0Var;
        this.c = ek6Var;
        this.d = mj6Var;
        this.e = uh6Var;
        constraintLayout.getClass();
        constraintLayout.setOnClickListener(new khl(new cq40(), this));
        tgd0Var.z.setOnClickListener(new lhl(new cq40(), this));
        tgd0Var.v.setOnClickListener(new mhl(new cq40(), this));
        tgd0Var.A.setOnClickListener(new nhl(new cq40(), this));
        tgd0Var.e.setOnClickListener(new ohl(new cq40(), this));
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0273 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x01af  */
    /* JADX WARN: Code duplicated, block: B:58:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:60:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:67:0x0210  */
    /* JADX WARN: Code duplicated, block: B:71:0x0225  */
    /* JADX WARN: Code duplicated, block: B:76:0x023c  */
    /* JADX WARN: Code duplicated, block: B:82:0x024c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0255  */
    /* JADX WARN: Code duplicated, block: B:88:0x0260  */
    /* JADX WARN: Code duplicated, block: B:91:0x026d A[LOOP:2: B:86:0x025a->B:91:0x026d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x0273 A[EDGE_INSN: B:93:0x0273->B:92:0x0270 BREAK  A[LOOP:2: B:86:0x025a->B:91:0x026d]] */
    /* JADX WARN: Code duplicated, block: B:95:0x0277  */
    /* JADX WARN: Code duplicated, block: B:96:0x0279  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gi6
    public final void a(int i) {
        int i2;
        Integer numValueOf;
        String strB;
        Drawable drawable;
        Drawable drawableC;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        int i4;
        List<pl6> list;
        int i5;
        int i6;
        Iterator<pl6> it;
        int i7;
        List<BetSelection> list2;
        String str;
        pl6 pl6VarB = b(i);
        if (pl6VarB == null) {
            return;
        }
        tgd0 tgd0Var = this.b;
        ConstraintLayout constraintLayout = tgd0Var.a;
        TextView textView = tgd0Var.w;
        LinearLayout linearLayout = tgd0Var.v;
        AppCompatTextView appCompatTextView = tgd0Var.b;
        AppCompatImageView appCompatImageView = tgd0Var.A;
        constraintLayout.setTag(pl6VarB);
        Bet bet = pl6VarB.a;
        tgd0Var.f.setVisibility(((bet.isCalcByFE ? bet.isCashAbleJS && bet.isCashable : bet.isCashable) && bet.isEditable) ? 0 : 8);
        if (TextUtils.isEmpty(bet.shareCode) || TextUtils.isEmpty(pl6VarB.a.shareUrl)) {
            i2 = 0;
            appCompatImageView.setEnabled(false);
        } else {
            appCompatImageView.setEnabled(true);
            ArrayList arrayList = new ArrayList();
            for (BetSelection betSelection : bet.selections) {
                String str2 = betSelection.sportId;
                String str3 = betSelection.eventId;
                String str4 = betSelection.categoryId;
                String str5 = betSelection.tournamentId;
                String str6 = betSelection.tournamentName;
                String str7 = betSelection.home;
                String str8 = betSelection.away;
                String str9 = betSelection.marketId;
                StringBuilder sb = new StringBuilder();
                if (betSelection.isBetBuilder()) {
                    int size = betSelection.betBuilderSelections.size();
                    int i8 = 0;
                    while (i8 < size) {
                        int i9 = size;
                        BetSelection betSelection2 = betSelection.betBuilderSelections.get(i8);
                        String str10 = str2;
                        sb.append(betSelection2.outcomeDesc);
                        sb.append("   ");
                        sb.append(betSelection2.marketDesc);
                        if (i8 != i9 - 1) {
                            sb.append("\n");
                        }
                        i8++;
                        size = i9;
                        str2 = str10;
                    }
                    str = str2;
                } else {
                    str = str2;
                    sb.append(betSelection.marketDesc);
                }
                arrayList.add(new ez80.a(str, str3, str4, str5, str6, str7, str8, str9, sb.toString(), betSelection.specifier, betSelection.outcomeId, betSelection.outcomeDesc, betSelection.odds, Integer.valueOf(betSelection.eventStatus), Long.valueOf(betSelection.product)));
            }
            Bet bet2 = pl6VarB.a;
            String str11 = bet2.shareCode;
            String str12 = bet2.shareUrl;
            UserNote userNote = bet2.userNote;
            appCompatImageView.setTag(new ez80(str11, str12, userNote != null ? userNote.getNoteText() : null, pl6VarB.a.orderId, arrayList));
            i2 = 0;
        }
        tgd0Var.z.setTag(pl6VarB.a.shareCode);
        linearLayout.setTag(pl6VarB.a.shareCode);
        TextView textView2 = tgd0Var.e;
        String str13 = bet.id;
        str13.getClass();
        String str14 = bet.orderType;
        str14.getClass();
        textView2.setTag(new onf(str13, str14));
        if (bet.isAnyWin()) {
            numValueOf = Integer.valueOf(R.drawable.ic_any_win_label);
        } else {
            if (!bet.isOneCutBet()) {
                if (bet.isFlexBet()) {
                    numValueOf = Integer.valueOf(R.drawable.ic_flexi_outline);
                    Context context = this.itemView.getContext();
                    context.getClass();
                    strB = sn5.b(context, R.string.cashout__flexi_label_vmintowin_of_vsize, String.valueOf(bet.minToWin), String.valueOf(bet.selectionSize));
                } else {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    Context context2 = this.itemView.getContext();
                    context2.getClass();
                    drawable = null;
                    drawableC = s0b.c(context2, iIntValue, new a78.c(R.color.custom_brand_secondary_type3), null, 4);
                } else {
                    drawable = null;
                    drawableC = null;
                }
                if (drawableC != null) {
                    i3 = i2;
                } else {
                    i3 = 8;
                }
                appCompatTextView.setVisibility(i3);
                appCompatTextView.setCompoundDrawables(drawableC, drawable, drawable, drawable);
                appCompatTextView.setText(strB);
                tgd0Var.B.setText(bet.getOrderTypeText(this.itemView.getContext()));
                textView.setTag(Boolean.valueOf(pl6VarB.a.isLive()));
                c8i0.o(textView, pl6VarB.a.isLive());
                LinearLayout linearLayout2 = tgd0Var.y;
                if (textView.getVisibility() == 0 && appCompatTextView.getVisibility() != 0) {
                    z = i2;
                } else {
                    z = 1;
                }
                c8i0.o(linearLayout2, z);
                c8i0.o(tgd0Var.i, bet.hasPendingEvent);
                if (SimShareData.INSTANCE.isSimulatedActive()) {
                    list2 = bet.selections;
                    list2.getClass();
                    if (dj90.a(list2) || TextUtils.isEmpty(pl6VarB.a.shareCode)) {
                        z2 = i2;
                    } else {
                        z2 = 1;
                    }
                } else {
                    z2 = i2;
                }
                c8i0.o(linearLayout, z2);
                View view = tgd0Var.c;
                if (z2 == 0 && appCompatImageView.getVisibility() == 0) {
                    z3 = 1;
                } else {
                    z3 = i2;
                }
                c8i0.o(view, z3);
                i4 = -1;
                list = this.a;
                if (list != null) {
                    i5 = 1;
                    break;
                }
                it = list.iterator();
                i7 = i2;
                while (true) {
                    if (it.hasNext()) {
                        i5 = 1;
                        break;
                    }
                    i5 = 1;
                    if (it.next().c == 1) {
                        i4 = i7;
                        break;
                    }
                    i7++;
                }
                if (i == i4) {
                    i6 = i5;
                } else {
                    i6 = i2;
                }
                if (z2 != 0 || i6 == 0) {
                }
                this.d.invoke(linearLayout);
                return;
            }
            Context context3 = this.itemView.getContext();
            context3.getClass();
            numValueOf = Integer.valueOf(gug0.d(context3));
        }
        strB = null;
        if (numValueOf != null) {
            int iIntValue2 = numValueOf.intValue();
            Context context4 = this.itemView.getContext();
            context4.getClass();
            drawable = null;
            drawableC = s0b.c(context4, iIntValue2, new a78.c(R.color.custom_brand_secondary_type3), null, 4);
        } else {
            drawable = null;
            drawableC = null;
        }
        if (drawableC != null) {
            i3 = i2;
        } else {
            i3 = 8;
        }
        appCompatTextView.setVisibility(i3);
        appCompatTextView.setCompoundDrawables(drawableC, drawable, drawable, drawable);
        appCompatTextView.setText(strB);
        tgd0Var.B.setText(bet.getOrderTypeText(this.itemView.getContext()));
        textView.setTag(Boolean.valueOf(pl6VarB.a.isLive()));
        c8i0.o(textView, pl6VarB.a.isLive());
        LinearLayout linearLayout3 = tgd0Var.y;
        if (textView.getVisibility() == 0) {
            z = 1;
        } else {
            z = i2;
        }
        c8i0.o(linearLayout3, z);
        c8i0.o(tgd0Var.i, bet.hasPendingEvent);
        if (SimShareData.INSTANCE.isSimulatedActive()) {
            list2 = bet.selections;
            list2.getClass();
            if (dj90.a(list2)) {
                z2 = i2;
            } else {
                z2 = i2;
            }
        } else {
            z2 = i2;
        }
        c8i0.o(linearLayout, z2);
        View view2 = tgd0Var.c;
        if (z2 == 0) {
            z3 = i2;
        } else {
            z3 = i2;
        }
        c8i0.o(view2, z3);
        i4 = -1;
        list = this.a;
        if (list != null) {
            i5 = 1;
            break;
        }
        it = list.iterator();
        i7 = i2;
        while (true) {
            if (it.hasNext()) {
                i5 = 1;
                break;
            }
            i5 = 1;
            if (it.next().c == 1) {
                i4 = i7;
                break;
            }
            i7++;
        }
        if (i == i4) {
            i6 = i5;
        } else {
            i6 = i2;
        }
        if (z2 != 0) {
        }
    }
}
