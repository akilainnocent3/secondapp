package com.sportybet.android.instantwin.presentation.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.MarketAttribute;
import com.sportybet.android.instantwin.presentation.eventdetails.adapter.MatchEventDetailAdapter;
import com.sportybet.android.widget.seekbar.RangeSeekBar;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm;
import defpackage.ayo;
import defpackage.bmy;
import defpackage.bs3;
import defpackage.dqu;
import defpackage.h5e;
import defpackage.h8z;
import defpackage.ogo;
import defpackage.p4p;
import defpackage.spu;
import defpackage.uho;
import defpackage.ycv;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/widget/InteractiveMarketPanel;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ldqu;", "data", "Ldqu$b;", "listener", "Lcom/sportybet/android/instantwin/presentation/widget/InteractiveMarketPanel$a;", "marketDelegate", "Logo;", "oddsFilter", "", "setMarketData", "(Ldqu;Ldqu$b;Lcom/sportybet/android/instantwin/presentation/widget/InteractiveMarketPanel$a;Logo;)V", "a", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class InteractiveMarketPanel extends ConstraintLayout {
    public static final /* synthetic */ int M = 0;
    public final p4p F;
    public dqu G;
    public final LinkedHashMap H;
    public String I;
    public String J;
    public dqu.b K;
    public a L;

    public interface a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractiveMarketPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.iwqk_interactive_market_layout, this);
        int i2 = R.id.outcome_layout;
        FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.outcome_layout, this);
        if (frameLayout != null) {
            i2 = R.id.outcome_lock;
            ImageView imageView = (ImageView) h5e.a(R.id.outcome_lock, this);
            if (imageView != null) {
                i2 = R.id.outcome_value;
                TextView textView = (TextView) h5e.a(R.id.outcome_value, this);
                if (textView != null) {
                    i2 = R.id.range_slider;
                    RangeSeekBar rangeSeekBar = (RangeSeekBar) h5e.a(R.id.range_slider, this);
                    if (rangeSeekBar != null) {
                        p4p p4pVar = new p4p(this, frameLayout, imageView, textView, rangeSeekBar);
                        this.F = p4pVar;
                        this.H = new LinkedHashMap();
                        this.I = "";
                        this.J = "";
                        rangeSeekBar.setOnRangeChangedListener(new com.sportybet.android.instantwin.presentation.widget.a(this, p4pVar));
                        frameLayout.setOnClickListener(new ayo(0, this, p4pVar));
                        return;
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final int E(double d) {
        return ycv.a(d / (100.0d / ((double) this.F.e.getSteps())));
    }

    public final void F() {
        p4p p4pVar = this.F;
        p4pVar.b.setTag(null);
        p4pVar.b.setEnabled(false);
        p4pVar.d.setVisibility(8);
        p4pVar.c.setVisibility(0);
    }

    public final void setMarketData(dqu data, dqu.b listener, a marketDelegate, ogo oddsFilter) {
        dqu dquVar = data;
        dquVar.getClass();
        listener.getClass();
        marketDelegate.getClass();
        this.G = dquVar;
        this.K = listener;
        this.L = marketDelegate;
        LinkedHashMap linkedHashMap = this.H;
        linkedHashMap.clear();
        spu spuVar = dquVar.d;
        for (h8z h8zVar : spuVar.f.values()) {
            String str = dquVar.b;
            String str2 = spuVar.a;
            String str3 = h8zVar.a;
            String str4 = h8zVar.b;
            bs3 bs3Var = new bs3(str, str2, str3);
            str4.getClass();
            String str5 = h8zVar.g;
            str5.getClass();
            String str6 = h8zVar.c;
            str6.getClass();
            linkedHashMap.put(h8zVar.a, new OutcomeGeneralLayout.b(bs3Var, str4, str5, str6, h8zVar.d, h8zVar.e, h8zVar.f, uho.b(str4, oddsFilter) && h8zVar.d));
            dquVar = data;
        }
        spuVar.getClass();
        MarketAttribute marketAttribute = spuVar.c;
        RangeSeekBar rangeSeekBar = this.F.e;
        rangeSeekBar.setSteps(marketAttribute.layout.parameters.size() - 1);
        rangeSeekBar.setTickMarkTextArray((CharSequence[]) marketAttribute.layout.parameters.toArray(new String[0]));
        double steps = 100.0d / ((double) rangeSeekBar.getSteps());
        dqu dquVar2 = this.G;
        spu spuVar2 = dquVar2 != null ? dquVar2.d : null;
        spuVar2.getClass();
        String str7 = spuVar2.a;
        str7.getClass();
        HashMap<String, Pair<Integer, Integer>> map = ((MatchEventDetailAdapter.a) marketDelegate).a;
        if (!map.containsKey(str7)) {
            map.put(str7, new Pair<>(0, 1));
        }
        Pair<Integer, Integer> pair = map.get(str7);
        Objects.requireNonNull(pair);
        rangeSeekBar.setProgress((float) (((double) pair.a.intValue()) * steps), (float) (((double) pair.b.intValue()) * steps));
        G(oddsFilter);
    }

    public final void G(ogo ogoVar) {
        spu spuVar;
        Collection collectionValues;
        Object next;
        int i;
        dqu dquVar = this.G;
        if (dquVar == null || (spuVar = dquVar.d) == null || (collectionValues = spuVar.f.values()) == null) {
            return;
        }
        Iterator it = collectionValues.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!TextUtils.equals(((h8z) next).c, this.I + dqvOSm.GByobZsTTvtyan + this.J));
        h8z h8zVar = (h8z) next;
        if (h8zVar != null) {
            this.H.get(h8zVar.a);
            boolean z = h8zVar.d;
            boolean z2 = h8zVar.f;
            if (z) {
                i = z2 ? R.color.absolute_type1 : R.color.brand_secondary_variable_type2;
            } else {
                i = R.color.brand_secondary_variable_type1;
            }
            p4p p4pVar = this.F;
            TextView textView = p4pVar.d;
            FrameLayout frameLayout = p4pVar.b;
            textView.setTextColor(getContext().getColor(i));
            if (uho.b(h8zVar.b, ogoVar) && !z2 && z) {
                frameLayout.setBackgroundResource(R.drawable.iwqk_outcome_toggle_highlight);
            } else {
                frameLayout.setBackgroundResource(R.drawable.iwqk_outcome_toggle_bg);
            }
            frameLayout.setEnabled(z);
            frameLayout.setSelected(z2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InteractiveMarketPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InteractiveMarketPanel(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ InteractiveMarketPanel(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
