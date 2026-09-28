package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.BetItemOddsUpdater", f = "BetItemOddsUpdater.kt", l = {87}, m = "updateSelections", v = 2)
public final class ev2 extends x1b {
    public /* synthetic */ Object A;
    public final /* synthetic */ gv2 B;
    public int C;
    public List a;
    public List b;
    public Map c;
    public Iterator d;
    public Event e;
    public Iterator f;
    public Market i;
    public Iterator v;
    public Outcome w;
    public Selection y;
    public Iterator z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev2(gv2 gv2Var, x1b x1bVar) {
        super(x1bVar);
        this.B = gv2Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, null, this);
    }
}
