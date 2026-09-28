package defpackage;

import com.sporty.android.core.model.gift.GiftDetails;
import java.util.Iterator;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lj7p;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class j7p extends j8i0 {
    public static final Pattern f;
    public final psm a;
    public final p7k b;
    public final q5p c;
    public final wwd0 d;
    public final wwd0 e;

    static {
        Pattern patternCompile = Pattern.compile("^\\d{0,10}(\\.\\d{0,2})?$");
        patternCompile.getClass();
        f = patternCompile;
    }

    public j7p(psm psmVar, p7k p7kVar, q5p q5pVar) {
        psmVar.getClass();
        this.a = psmVar;
        this.b = p7kVar;
        this.c = q5pVar;
        this.d = xwd0.a(ayk.j);
        this.e = xwd0.a(nvk.c);
    }

    public final void A1(long j, String str, boolean z, Integer num, q5p.b bVar) {
        q5p.a aVarY1 = y1(j, str, z);
        q5p q5pVar = this.c;
        q5pVar.getClass();
        q5pVar.b(new o7p.f(q5pVar.a(aVarY1), num, bVar != null ? bVar.a : null));
    }

    public final void x1() {
        wwd0 wwd0Var;
        Object value;
        do {
            wwd0Var = this.d;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, ayk.a((ayk) value, false, false, null, null, null, null, false, false, null, 510)));
    }

    public final q5p.a y1(long j, String str, boolean z) {
        Object next;
        ayk aykVar = (ayk) this.d.getValue();
        String strZ1 = z1();
        boolean z2 = z && aykVar.b && !StringsKt.U(strZ1);
        Iterator<T> it = aykVar.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.g(((GiftDetails) next).getGiftId(), aykVar.d));
        GiftDetails giftDetails = (GiftDetails) next;
        return new q5p.a(j, str, z2, z2 ? giftDetails != null ? Integer.valueOf(giftDetails.getKind()) : null : null, z2 ? strZ1 : null);
    }

    public final String z1() {
        ayk aykVar = (ayk) this.d.getValue();
        dyk dykVar = aykVar.f;
        if (Intrinsics.g(dykVar, dyk.a.a)) {
            return aykVar.e;
        }
        if (dykVar instanceof dyk.b) {
            return ((dyk.b) dykVar).a.a.b;
        }
        uhc.a();
        return null;
    }
}
