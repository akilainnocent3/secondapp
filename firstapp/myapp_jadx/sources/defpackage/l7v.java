package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.Bet;
import com.sportybet.android.instantwin.newtork.model.response.BetDetail;
import com.sportybet.android.instantwin.newtork.model.response.EventInRound;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l7v extends uyy implements View.OnClickListener {
    public final i5p b;
    public final a c;
    public final List<xzy> d;

    public interface a {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l7v(i5p i5pVar, a1z.a aVar, ArrayList arrayList) {
        aVar.getClass();
        RelativeLayout relativeLayout = i5pVar.a;
        relativeLayout.getClass();
        super(relativeLayout, arrayList);
        this.b = i5pVar;
        this.c = aVar;
        this.d = arrayList;
        TextView textView = i5pVar.c;
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, gr0.a(this.itemView.getContext(), R.drawable.spr_ic_arrow_drop_down_green_24dp), (Drawable) null);
        textView.setOnClickListener(this);
    }

    @Override // defpackage.uyy
    public final void a(int i) {
        j7g j7gVar;
        xzy xzyVarC = c(i);
        i5p i5pVar = this.b;
        TextView textView = i5pVar.e;
        TextView textView2 = i5pVar.d;
        if (xzyVarC != null) {
            Context context = this.itemView.getContext();
            j7gVar = xzyVarC.i;
            if (j7gVar == null) {
                HashSet<String> hashSet = new HashSet();
                Iterator<Bet> it = xzyVarC.b.iterator();
                while (it.hasNext()) {
                    for (BetDetail betDetail : it.next().betDetails) {
                        if (!hashSet.contains(betDetail.eventId)) {
                            hashSet.add(betDetail.eventId);
                        }
                    }
                }
                String str = " " + sn5.b(context, R.string.bet_history__vs, new Object[0]) + " ";
                j7g j7gVar2 = new j7g();
                int i2 = 0;
                for (String str2 : hashSet) {
                    if (i2 > 0 && i2 % 3 == 0) {
                        j7gVar2.a("\n");
                    }
                    EventInRound eventInRound = xzyVarC.a.getLookupEventByEventIdMapping().get(str2);
                    if (eventInRound != null) {
                        j7gVar2.d(eventInRound.homeTeamName, true);
                        j7gVar2.e(context.getColor(R.color.text_type1_secondary), str);
                        j7gVar2.d(eventInRound.awayTeamName, true);
                        j7gVar2.a(", ");
                        i2++;
                    }
                }
                if (j7gVar2.length() > 0) {
                    j7gVar2.delete(j7gVar2.length() - 2, j7gVar2.length());
                }
                xzyVarC.i = j7gVar2;
                j7gVar = j7gVar2;
            }
        } else {
            j7gVar = null;
        }
        textView.setText(j7gVar);
        i5pVar.c.setTag(xzyVarC);
        String str3 = xzyVarC != null ? xzyVarC.f : null;
        if (!Intrinsics.g(str3, SimulateBetConsts.BetslipType.FLEX)) {
            if (!Intrinsics.g(str3, SimulateBetConsts.BetslipType.CUTBET)) {
                textView2.setVisibility(8);
                return;
            }
            textView2.setVisibility(0);
            textView2.setText("");
            textView2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_one_bet_cut, 0, 0, 0);
            return;
        }
        textView2.setVisibility(0);
        View view = this.itemView;
        view.getClass();
        String strValueOf = String.valueOf(xzyVarC.e);
        List<BetDetail> list = xzyVarC.b.get(0).betDetails;
        textView2.setText(sn5.c(view, R.string.component_wap_share_bet__flex_your_bet_vmintowin_of_vsize, strValueOf, String.valueOf(list != null ? Integer.valueOf(list.size()) : null)));
        textView2.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_flexible_active, 0, 0, 0);
    }

    @Override // defpackage.uyy
    public final List<xzy> b() {
        return this.d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        Object tag = view.getTag();
        tag.getClass();
        xzy xzyVar = (xzy) tag;
        a1z.a aVar = (a1z.a) this.c;
        a1z.this.i();
        int absoluteAdapterPosition = getAbsoluteAdapterPosition();
        a1z a1zVar = a1z.this;
        ArrayList arrayList = a1zVar.a;
        if (absoluteAdapterPosition < 0 || absoluteAdapterPosition >= arrayList.size()) {
            return;
        }
        arrayList.remove(absoluteAdapterPosition);
        a1zVar.notifyItemRemoved(absoluteAdapterPosition);
        a1zVar.b = xzyVar;
        arrayList.addAll(absoluteAdapterPosition, xzyVar.h);
        a1zVar.notifyItemRangeInserted(absoluteAdapterPosition, a1zVar.b.h.size());
    }
}
