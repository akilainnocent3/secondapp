package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.x;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ni40 extends x<ri40, yi40> {
    public static final a w = new a();
    public final nh4 b;
    public final lrm c;
    public final psm d;
    public final y8j e;
    public final kd20 f;
    public final pi40 i;
    public final nzm v;

    public static final class a extends n.e<ri40> {
        @Override // androidx.recyclerview.widget.n.e
        public final boolean areContentsTheSame(ri40 ri40Var, ri40 ri40Var2) {
            ri40 ri40Var3 = ri40Var;
            ri40 ri40Var4 = ri40Var2;
            ri40Var3.getClass();
            ri40Var4.getClass();
            if (Intrinsics.g(ri40Var3.a, ri40Var4.a) && Intrinsics.g(ri40Var3.b, ri40Var4.b)) {
                List<Event> list = ri40Var3.d;
                List<Event> list2 = ri40Var4.d;
                if (list.size() == list2.size()) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        Event event = list.get(i);
                        Event event2 = list2.get(i);
                        Event event3 = event;
                        event3.getClass();
                        event2.getClass();
                        String str = event3.eventId;
                        str.getClass();
                        String str2 = event2.eventId;
                        str2.getClass();
                        if (str.equals(str2)) {
                            LinkedHashMap linkedHashMapA = g880.A(event3);
                            LinkedHashMap linkedHashMapA2 = g880.A(event2);
                            if (Intrinsics.g(linkedHashMapA.keySet(), linkedHashMapA2.keySet())) {
                                if (!linkedHashMapA.isEmpty()) {
                                    for (Map.Entry entry : linkedHashMapA.entrySet()) {
                                        String str3 = (String) entry.getKey();
                                        Set set = (Set) entry.getValue();
                                        Set set2 = (Set) linkedHashMapA2.get(str3);
                                        if (!(set2 == null ? false : Intrinsics.g(set, set2))) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.n.e
        public final boolean areItemsTheSame(ri40 ri40Var, ri40 ri40Var2) {
            ri40 ri40Var3 = ri40Var;
            ri40 ri40Var4 = ri40Var2;
            ri40Var3.getClass();
            ri40Var4.getClass();
            return Intrinsics.g(ri40Var3.a, ri40Var4.a) && Intrinsics.g(ri40Var3.b, ri40Var4.b) && Intrinsics.g(ri40Var3.d, ri40Var4.d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni40(nh4 nh4Var, lrm lrmVar, psm psmVar, y8j y8jVar, kd20 kd20Var, pi40 pi40Var, nzm nzmVar) {
        super(w);
        nh4Var.getClass();
        lrmVar.getClass();
        psmVar.getClass();
        y8jVar.getClass();
        kd20Var.getClass();
        pi40Var.getClass();
        nzmVar.getClass();
        this.b = nh4Var;
        this.c = lrmVar;
        this.d = psmVar;
        this.e = y8jVar;
        this.f = kd20Var;
        this.i = pi40Var;
        this.v = nzmVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        String str;
        BigDecimal bigDecimalMultiply;
        BigDecimal bigDecimalD;
        Market market;
        Object bVar;
        Object bVar2;
        yi40 yi40Var = (yi40) d0Var;
        yi40Var.getClass();
        ri40 item = getItem(i);
        item.getClass();
        igd0 igd0Var = yi40Var.a;
        j1b j1bVar = yi40Var.w;
        i9p.d(j1bVar.a);
        y8j y8jVar = yi40Var.e;
        FrameLayout frameLayout = igd0Var.y;
        TextView textView = igd0Var.e;
        TextView textView2 = igd0Var.z;
        TextView textView3 = igd0Var.v;
        y8jVar.g(frameLayout);
        FrameLayout frameLayout2 = igd0Var.y;
        v88.c.a.getClass();
        y8jVar.c(frameLayout2, v88.c.b);
        String str2 = item.a;
        if (str2.length() == 0) {
            textView2.setVisibility(8);
            textView3.setVisibility(8);
        } else {
            SpannableString spannableString = new SpannableString(str2);
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            textView3.setText(spannableString);
            textView2.setVisibility(0);
            textView3.setVisibility(0);
        }
        String str3 = str2;
        List<Selection> list = item.e;
        nh4 nh4Var = yi40Var.b;
        nh4Var.getClass();
        list.getClass();
        lw2 lw2Var = new lw2(new ow2(new jw2(), new kw2(), ird0.a()));
        lw2Var.o(list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.clear();
        Iterator<T> it = list.iterator();
        while (true) {
            str = str3;
            if (!it.hasNext()) {
                break;
            }
            Selection selection = (Selection) it.next();
            Market market2 = selection.b;
            Outcome outcome = selection.c;
            Event event = selection.a;
            if (market2 == null || market2.status < 2) {
                Outcome outcome2 = (Outcome) linkedHashMap.get(event.eventId);
                if (outcome2 == null) {
                    String str4 = event.eventId;
                    str4.getClass();
                    outcome.getClass();
                    linkedHashMap.put(str4, outcome);
                } else {
                    try {
                        zi50.a aVar = zi50.b;
                        bVar = new BigDecimal(outcome.odds);
                    } catch (Throwable th) {
                        zi50.a aVar2 = zi50.b;
                        bVar = new zi50.b(th);
                    }
                    if (bVar instanceof zi50.b) {
                        bVar = null;
                    }
                    BigDecimal bigDecimal = (BigDecimal) bVar;
                    try {
                        bVar2 = new BigDecimal(outcome2.odds);
                    } catch (Throwable th2) {
                        zi50.a aVar3 = zi50.b;
                        bVar2 = new zi50.b(th2);
                    }
                    BigDecimal bigDecimal2 = (BigDecimal) (bVar2 instanceof zi50.b ? null : bVar2);
                    if (bigDecimal != null && bigDecimal2 != null && bigDecimal.compareTo(bigDecimal2) > 0) {
                        String str5 = event.eventId;
                        str5.getClass();
                        outcome.getClass();
                        linkedHashMap.put(str5, outcome);
                    }
                }
            }
            str3 = str;
        }
        if (linkedHashMap.isEmpty()) {
            bigDecimalMultiply = BigDecimal.ZERO;
            bigDecimalMultiply.getClass();
        } else {
            bigDecimalMultiply = BigDecimal.ONE;
            Iterator it2 = linkedHashMap.values().iterator();
            while (it2.hasNext()) {
                bigDecimalMultiply = bigDecimalMultiply.multiply(new BigDecimal(((Outcome) it2.next()).odds));
            }
            bigDecimalMultiply.getClass();
        }
        BigDecimal bigDecimal3 = bigDecimalMultiply;
        BigDecimal bigDecimalMultiply2 = BigDecimal.ONE;
        BigDecimal bigDecimal4 = nh4Var.a;
        int i2 = 0;
        for (Outcome outcome3 : linkedHashMap.values()) {
            if (new BigDecimal(outcome3.odds).compareTo(bigDecimal4) >= 0) {
                i2++;
                bigDecimalMultiply2 = bigDecimalMultiply2.multiply(new BigDecimal(outcome3.odds));
            }
        }
        boolean z = i2 >= nh4Var.d;
        if (!z || qz3.h(lw2Var, list)) {
            bigDecimalD = BigDecimal.ZERO;
            bigDecimalD.getClass();
        } else {
            if (!list.isEmpty()) {
                List<lw2.a> listG = lw2Var.g(new ArrayList(list));
                listG.getClass();
                nh4Var.i = dr4.a(listG);
            }
            BigDecimal bigDecimal5 = nh4Var.i;
            if (bigDecimal5 == null) {
                bigDecimal5 = BigDecimal.ONE;
            }
            BigDecimal bigDecimalB = nh4Var.b(i2);
            if (nh4Var.e()) {
                bigDecimalD = nh4Var.a(i2).multiply(bigDecimal5).max(bigDecimalB);
                bigDecimalD.getClass();
            } else {
                bigDecimalD = nh4Var.d(i2);
                bigDecimalD.getClass();
            }
        }
        BigDecimal bigDecimal6 = bigDecimalD;
        si40 si40Var = new si40(bigDecimal3, bigDecimal6, i2, bigDecimalMultiply2, z);
        Context contextA = yi40Var.a();
        contextA.getClass();
        igd0Var.f.setText(sn5.b(contextA, R.string.comment_details__odds, gky.a(rt5.b(bigDecimal3.toString()))));
        BigDecimal scale = bigDecimal6.multiply(BigDecimal.valueOf(100L)).setScale(2, RoundingMode.HALF_UP);
        Context contextA2 = yi40Var.a();
        contextA2.getClass();
        igd0Var.b.setText(sn5.b(contextA2, R.string.comment_details__max_bonus, scale.toString()).concat("%"));
        Selection selection2 = (Selection) CollectionsKt.firstOrNull(list);
        String str6 = (selection2 == null || (market = selection2.b) == null) ? null : market.desc;
        if (str6 == null || str6.length() == 0) {
            textView.setVisibility(8);
        } else {
            Context contextA3 = yi40Var.a();
            contextA3.getClass();
            textView.setText(sn5.b(contextA3, R.string.live__has_vmarket_on_this_match, str6));
            textView.setVisibility(0);
        }
        ej5.c(j1bVar, null, null, new xi40(yi40Var, str, list, si40Var, i, item, null), 3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        return new yi40(igd0.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.spr_adapter_comment_image_view, viewGroup, false)), this.b, this.c, this.d, this.e, this.f, this.i, this.v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onViewRecycled(RecyclerView.d0 d0Var) {
        yi40 yi40Var = (yi40) d0Var;
        yi40Var.getClass();
        super.onViewRecycled(yi40Var);
        yi40Var.e.g(yi40Var.a.y);
    }
}
