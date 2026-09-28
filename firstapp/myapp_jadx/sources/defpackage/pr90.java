package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.io.IOException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class pr90 implements jr90 {
    public final ln90 a;
    public final iug0 b;
    public final b390 c = d390.b(0, 1, pb5.b, 1);
    public final wwd0 d = xwd0.a(hug0.b);
    public final wwd0 e = xwd0.a(null);
    public final wwd0 f = xwd0.a(null);
    public final wwd0 i = xwd0.a(bn90.c.a);
    public final wwd0 v = xwd0.a(null);

    public pr90(ln90 ln90Var, iug0 iug0Var, sr90 sr90Var, dr90 dr90Var, ir90 ir90Var) {
        this.a = ln90Var;
        this.b = iug0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        kr90 kr90Var;
        Object value;
        Object objD;
        an90 cVar;
        Object value2;
        Object value3;
        if (x1bVar instanceof kr90) {
            kr90Var = (kr90) x1bVar;
            int i = kr90Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kr90Var.c = i - Integer.MIN_VALUE;
            } else {
                kr90Var = new kr90(this, x1bVar);
            }
        } else {
            kr90Var = new kr90(this, x1bVar);
        }
        Object obj = kr90Var.a;
        y5b y5bVar = y5b.a;
        int i2 = kr90Var.c;
        wwd0 wwd0Var = this.i;
        if (i2 == 0) {
            uj50.b(obj);
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, bn90.b.a));
            kr90Var.c = 1;
            objD = this.a.d(str, kr90Var);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objD = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (!(objD instanceof zi50.b)) {
            rq90 rq90Var = (rq90) objD;
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, new bn90.d(rq90Var)));
        }
        Throwable thA = zi50.a(objD);
        if (thA != null) {
            if (thA instanceof IOException) {
                cVar = new an90.b();
            } else {
                String message = thA.getMessage();
                if (message == null || message.length() == 0) {
                    cVar = new an90.c();
                } else {
                    String message2 = thA.getMessage();
                    if (message2 == null) {
                        message2 = "";
                    }
                    cVar = new an90.a(message2);
                }
            }
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, new bn90.a(cVar)));
        }
        return Unit.a;
    }

    @Override // defpackage.jr90
    public final void h1(ss90 ss90Var) {
        Object value;
        Object value2;
        slo sloVar;
        Object value3;
        wwd0 wwd0Var;
        Object value4;
        Object value5;
        Object value6;
        ss90Var.getClass();
        boolean z = ss90Var instanceof ss90.a;
        b390 b390Var = this.c;
        if (z) {
            b390Var.a(((ss90.a) ss90Var).a);
            return;
        }
        boolean z2 = ss90Var instanceof ss90.b;
        wwd0 wwd0Var2 = this.f;
        wwd0 wwd0Var3 = this.e;
        String str = null;
        if (z2) {
            b390Var.a(null);
            do {
                wwd0Var = this.i;
                value4 = wwd0Var.getValue();
            } while (!wwd0Var.g(value4, bn90.c.a));
            do {
                value5 = wwd0Var3.getValue();
            } while (!wwd0Var3.g(value5, null));
            do {
                value6 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value6, null));
            return;
        }
        if (ss90Var instanceof ss90.d) {
            ss90.d dVar = (ss90.d) ss90Var;
            if (dVar instanceof ss90.d.b) {
                str = ((ss90.d.b) dVar).a;
            } else if (!(dVar instanceof ss90.d.a)) {
                uhc.a();
                return;
            }
            do {
                value3 = wwd0Var3.getValue();
            } while (!wwd0Var3.g(value3, str));
            return;
        }
        if (!(ss90Var instanceof ss90.c)) {
            uhc.a();
            return;
        }
        ss90.c cVar = (ss90.c) ss90Var;
        if (!(cVar instanceof ss90.c.b)) {
            if (!(cVar instanceof ss90.c.a)) {
                uhc.a();
                return;
            }
            do {
                value = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value, null));
            return;
        }
        do {
            value2 = wwd0Var2.getValue();
            int iOrdinal = ((ss90.c.b) cVar).a.ordinal();
            if (iOrdinal == 0) {
                StringUiText stringUiText = vch0.a;
                sloVar = new slo(new ResourceUiText(R.string.bet_history__1up_early_payout), new ResourceUiText(R.string.bet_history__congratulations_1up_popup));
            } else if (iOrdinal != 1) {
                uhc.a();
                return;
            } else {
                StringUiText stringUiText2 = vch0.a;
                sloVar = new slo(new ResourceUiText(R.string.bet_history__2up_early_payout), new ResourceUiText(R.string.bet_history__congratulations_2up_popup));
            }
        } while (!wwd0Var2.g(value2, sloVar));
    }
}
