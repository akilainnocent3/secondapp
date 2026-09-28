package defpackage;

import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lci00;", "Lavw;", "Lai00;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ci00 extends avw<ai00> {
    public final iym e;
    public final wwd0 f;
    public final v340 i;
    public final t340 v;
    public final String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci00(r4k r4kVar, s4k s4kVar, iym iymVar) {
        super(new ai00(null));
        iymVar.getClass();
        this.e = iymVar;
        wwd0 wwd0VarA = xwd0.a(t3g.a);
        this.f = wwd0VarA;
        this.i = e1i.b(wwd0VarA);
        this.v = rs5.a(new p4k(new ymz(new joz(new r07(r4kVar, 2), null), new iqz(10, 0, false, 10, 0, 50), null).e, r4kVar), o8i0.d(this));
        this.w = String.valueOf(qq1.e((lq1) s4kVar.a, BOConfigParam.SportySocialCodeChatThreshold, 6));
    }

    public final void z1(String str) {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            this.e.d(str);
            bVar = Unit.a;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a.p(thA, "Failed to send CodeChat event: %s", str);
        }
    }
}
