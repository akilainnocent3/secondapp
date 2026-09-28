package defpackage;

import com.sporty.android.core.model.gift.GiftDetails;
import com.sporty.android.core.model.json.JsonSerializeService;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class lfo {
    public final psm a;
    public final jpk b;
    public final yho c;
    public final JsonSerializeService d;
    public final k5b e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final wwd0 g;
    public final wwd0 h;
    public final ku90<Unit> i;

    public lfo(psm psmVar, jpk jpkVar, yho yhoVar, JsonSerializeService jsonSerializeService, k5b k5bVar) {
        this.a = psmVar;
        this.b = jpkVar;
        this.c = yhoVar;
        this.d = jsonSerializeService;
        this.e = k5bVar;
        wwd0 wwd0VarA = xwd0.a(ink.b.a);
        this.g = wwd0VarA;
        this.h = wwd0VarA;
        this.i = new ku90<>();
    }

    public final void a(et7 et7Var, String str) {
        str.getClass();
        if (this.f.compareAndSet(false, true)) {
            uwd0<List<GiftDetails>> uwd0VarP1 = this.b.p1();
            yho yhoVar = this.c;
            g1i g1iVar = new g1i(new n1i(uwd0VarP1, yhoVar.h.a(yhoVar, yho.o[6]).d(""), new ifo(this, str, null)), new jfo(this, null));
            k5b k5bVar = this.e;
            kzh.d(ozh.c(g1iVar, k5bVar), et7Var);
            kzh.d(ozh.c(new g1i(this.i, new kfo(this, str, null)), k5bVar), et7Var);
        }
    }

    public final void b() {
        this.i.a(Unit.a);
    }
}
