package defpackage;

import com.sporty.android.common.network.data.JsonErrorThrowable;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lu93;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class u93 extends j8i0 {
    public final wwd0 A;
    public final v340 B;
    public final t93 C;
    public final wwd0 D;
    public final v340 E;
    public final ku90<dln> F;
    public final t340 G;
    public jvd0 H;
    public final xo20 a;
    public final ba90 b;
    public final mgb0 c;
    public final m2l d;
    public final odd e;
    public final ku90<a> f;
    public final t340 i;
    public final ku90<wz80> v;
    public final t340 w;
    public final ku90<Boolean> y;
    public final r5b z;

    public u93(xo20 xo20Var, ex4 ex4Var, ba90 ba90Var, mgb0 mgb0Var, m2l m2lVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        int loyaltyCurrentTier;
        Object value;
        ex4Var.getClass();
        mgb0Var.getClass();
        m2lVar.getClass();
        this.a = xo20Var;
        this.b = ba90Var;
        this.c = mgb0Var;
        this.d = m2lVar;
        this.e = oddVar;
        ku90<a> ku90Var = new ku90<>();
        this.f = ku90Var;
        this.i = e1i.a(ku90Var);
        ku90<wz80> ku90Var2 = new ku90<>();
        this.v = ku90Var2;
        this.w = e1i.a(ku90Var2);
        ku90<Boolean> ku90Var3 = new ku90<>();
        this.y = ku90Var3;
        Object obj = null;
        this.z = i2i.c(e1i.a(ku90Var3), null, 3);
        wwd0 wwd0VarA = xwd0.a(tzs.a.a);
        this.A = wwd0VarA;
        this.B = e1i.b(wwd0VarA);
        this.C = new t93(ex4Var.p());
        wwd0 wwd0VarA2 = xwd0.a(new oc3(0));
        this.D = wwd0VarA2;
        this.E = e1i.b(wwd0VarA2);
        ku90<dln> ku90Var4 = new ku90<>();
        this.F = ku90Var4;
        this.G = e1i.a(ku90Var4);
        AccountInfo accountInfoLastAccountInfo = mgb0Var.lastAccountInfo();
        if (accountInfoLastAccountInfo == null || (loyaltyCurrentTier = accountInfoLastAccountInfo.getLoyaltyCurrentTier()) == krf0.TIER_98.a) {
            return;
        }
        for (Object obj2 : krf0.I) {
            if (((krf0) obj2).a == loyaltyCurrentTier) {
                obj = obj2;
                break;
            }
        }
        krf0 krf0Var = (krf0) obj;
        String str = (krf0Var == null || (str = krf0Var.d) == null) ? "" : str;
        wwd0 wwd0Var = this.D;
        do {
            value = wwd0Var.getValue();
            ((oc3) value).getClass();
        } while (!wwd0Var.g(value, new oc3(str)));
    }

    public final void x1(Throwable th) throws Throwable {
        UiText uiTextD;
        if (th instanceof CancellationException) {
            throw th;
        }
        itf0.a.e(th);
        if (th instanceof SprThrowable) {
            uiTextD = vch0.d(((SprThrowable) th).getE());
        } else {
            uiTextD = th instanceof JsonErrorThrowable ? ((JsonErrorThrowable) th).a : vch0.b;
        }
        b.i(this.f, uiTextD, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
    }

    public final void y1(cln clnVar, String str, String str2, String str3) {
        clnVar.getClass();
        if (str == null || StringsKt.U(str)) {
            return;
        }
        jvd0 jvd0Var = this.H;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.H = ej5.c(o8i0.d(this), null, null, new p93(this, str, str2, str3, clnVar, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z1(x1b x1bVar) {
        r93 r93Var;
        if (x1bVar instanceof r93) {
            r93Var = (r93) x1bVar;
            int i = r93Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r93Var.c = i - Integer.MIN_VALUE;
            } else {
                r93Var = new r93(this, x1bVar);
            }
        } else {
            r93Var = new r93(this, x1bVar);
        }
        Object obj = r93Var.a;
        y5b y5bVar = y5b.a;
        int i2 = r93Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            r93Var.c = 1;
            obj = this.d.a.getLong("notification_dialog_time", 0L, r93Var);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        long jLongValue = ((Number) obj).longValue();
        if (jLongValue == 0) {
            return Boolean.TRUE;
        }
        return Boolean.valueOf(System.currentTimeMillis() - jLongValue >= 604800000);
    }
}
