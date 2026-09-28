package com.sportybet.android.instantwin.presentation.widget;

import android.widget.FrameLayout;
import android.widget.TextView;
import com.sportybet.android.instantwin.presentation.eventdetails.adapter.MatchEventDetailAdapter;
import com.sportybet.android.widget.seekbar.RangeSeekBar;
import defpackage.dqu;
import defpackage.gky;
import defpackage.h8z;
import defpackage.p4p;
import defpackage.spu;
import defpackage.voy;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements voy {
    public final /* synthetic */ InteractiveMarketPanel a;
    public final /* synthetic */ p4p b;

    public a(InteractiveMarketPanel interactiveMarketPanel, p4p p4pVar) {
        this.a = interactiveMarketPanel;
        this.b = p4pVar;
    }

    @Override // defpackage.voy
    public final void a(RangeSeekBar rangeSeekBar, float f, float f2) {
        spu spuVar;
        Collection collectionValues;
        Object next;
        spu spuVar2;
        String str;
        InteractiveMarketPanel.a aVar;
        p4p p4pVar = this.b;
        RangeSeekBar rangeSeekBar2 = p4pVar.e;
        FrameLayout frameLayout = p4pVar.b;
        CharSequence[] tickMarkTextArray = rangeSeekBar2.getTickMarkTextArray();
        double d = f;
        int i = InteractiveMarketPanel.M;
        InteractiveMarketPanel interactiveMarketPanel = this.a;
        interactiveMarketPanel.I = tickMarkTextArray[interactiveMarketPanel.E(d)].toString();
        double d2 = f2;
        interactiveMarketPanel.J = p4pVar.e.getTickMarkTextArray()[interactiveMarketPanel.E(d2)].toString();
        dqu dquVar = interactiveMarketPanel.G;
        if (dquVar != null && (spuVar2 = dquVar.d) != null && (str = spuVar2.a) != null && (aVar = interactiveMarketPanel.L) != null) {
            ((MatchEventDetailAdapter.a) aVar).a.put(str, new Pair<>(Integer.valueOf(interactiveMarketPanel.E(d)), Integer.valueOf(interactiveMarketPanel.E(d2))));
        }
        dqu dquVar2 = interactiveMarketPanel.G;
        if (dquVar2 == null || (spuVar = dquVar2.d) == null || (collectionValues = spuVar.f.values()) == null) {
            interactiveMarketPanel.F();
        } else {
            Iterator it = collectionValues.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.g(((h8z) next).c, interactiveMarketPanel.I + "-" + interactiveMarketPanel.J));
            h8z h8zVar = (h8z) next;
            if (h8zVar == null || !h8zVar.d) {
                interactiveMarketPanel.F();
            } else {
                TextView textView = p4pVar.d;
                frameLayout.setTag(h8zVar.a);
                frameLayout.setEnabled(true);
                textView.setVisibility(0);
                p4pVar.c.setVisibility(8);
                String str2 = h8zVar.b;
                str2.getClass();
                textView.setText(gky.a.a(str2, false));
            }
        }
        interactiveMarketPanel.G(null);
    }

    @Override // defpackage.voy
    public final void b(RangeSeekBar rangeSeekBar) {
    }
}
