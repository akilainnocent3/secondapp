package defpackage;

import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.e;
import com.sporty.android.core.model.welcomereward.DepositFloatingIconPage;
import com.sporty.android.core.model.welcomereward.NonFtdEngagement;
import com.sporty.android.core.model.welcomereward.UiConfig;
import java.util.Calendar;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes5.dex */
public final class j7e {
    public final x9k a;
    public final rdd0 b;
    public final w1j0 c;
    public final yqm d;
    public final psm e;
    public final azm f;
    public final wwd0 g;
    public ComposeView h;
    public jvd0 i;

    /* JADX INFO: loaded from: classes4.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DepositFloatingIconPage.values().length];
            try {
                iArr[DepositFloatingIconPage.IV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DepositFloatingIconPage.GAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DepositFloatingIconPage.AZ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public j7e(x9k x9kVar, rdd0 rdd0Var, w1j0 w1j0Var, yqm yqmVar, psm psmVar, azm azmVar) {
        rdd0Var.getClass();
        w1j0Var.getClass();
        yqmVar.getClass();
        psmVar.getClass();
        azmVar.getClass();
        this.a = x9kVar;
        this.b = rdd0Var;
        this.c = w1j0Var;
        this.d = yqmVar;
        this.e = psmVar;
        this.f = azmVar;
        this.g = xwd0.a(r7e.a);
    }

    public final void a() {
        jvd0 jvd0Var = this.i;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.i = null;
        this.g.k(null, r7e.c);
        ComposeView composeView = this.h;
        if (composeView != null) {
            ViewParent parent = composeView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(composeView);
            }
        }
        this.h = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(x1b x1bVar) {
        k7e k7eVar;
        if (x1bVar instanceof k7e) {
            k7eVar = (k7e) x1bVar;
            int i = k7eVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                k7eVar.c = i - Integer.MIN_VALUE;
            } else {
                k7eVar = new k7e(this, x1bVar);
            }
        } else {
            k7eVar = new k7e(this, x1bVar);
        }
        Object objE = k7eVar.a;
        y5b y5bVar = y5b.a;
        int i2 = k7eVar.c;
        if (i2 == 0) {
            uj50.b(objE);
            w1j0 w1j0Var = this.c;
            wm20 wm20VarA = w1j0Var.g.a(w1j0Var, w1j0.i[5]);
            Long l = new Long(0L);
            k7eVar.c = 1;
            objE = wm20VarA.e(k7eVar, l);
            if (objE == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objE);
        }
        long jLongValue = ((Number) objE).longValue();
        if (jLongValue == 0) {
            return Boolean.FALSE;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jLongValue);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(jCurrentTimeMillis);
        return Boolean.valueOf(yt5.f(calendar, calendar2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(DepositFloatingIconPage depositFloatingIconPage, x1b x1bVar) {
        l7e l7eVar;
        boolean depositFloatingIconIvLobbyEnabled;
        if (x1bVar instanceof l7e) {
            l7eVar = (l7e) x1bVar;
            int i = l7eVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                l7eVar.d = i - Integer.MIN_VALUE;
            } else {
                l7eVar = new l7e(this, x1bVar);
            }
        } else {
            l7eVar = new l7e(this, x1bVar);
        }
        Object objA = l7eVar.b;
        y5b y5bVar = y5b.a;
        int i2 = l7eVar.d;
        if (i2 == 0) {
            uj50.b(objA);
            u9k u9kVarA = this.a.a();
            l7eVar.a = depositFloatingIconPage;
            l7eVar.d = 1;
            objA = s0i.a(u9kVarA, l7eVar);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            depositFloatingIconPage = l7eVar.a;
            uj50.b(objA);
        }
        NonFtdEngagement nonFtdEngagement = (NonFtdEngagement) objA;
        if (!nonFtdEngagement.getEnabled()) {
            return Boolean.FALSE;
        }
        UiConfig uiConfig = nonFtdEngagement.getUiConfig();
        if (uiConfig != null) {
            int i3 = a.a[depositFloatingIconPage.ordinal()];
            if (i3 == 1) {
                depositFloatingIconIvLobbyEnabled = uiConfig.getDepositFloatingIconIvLobbyEnabled();
            } else if (i3 == 2) {
                depositFloatingIconIvLobbyEnabled = uiConfig.getDepositFloatingIconGameLobbyEnabled();
            } else {
                if (i3 != 3) {
                    uhc.a();
                    return null;
                }
                depositFloatingIconIvLobbyEnabled = uiConfig.getDepositFloatingIconAzMenuEnabled();
            }
        } else {
            depositFloatingIconIvLobbyEnabled = false;
        }
        return Boolean.valueOf(depositFloatingIconIvLobbyEnabled);
    }

    public final void d(e eVar, DepositFloatingIconPage depositFloatingIconPage) {
        eVar.getClass();
        depositFloatingIconPage.getClass();
        wwd0 wwd0Var = this.g;
        if (wwd0Var.getValue() == r7e.b) {
            return;
        }
        jvd0 jvd0Var = this.i;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        wwd0Var.k(null, r7e.a);
        this.i = ej5.c(ebs.a(eVar.getLifecycle()), null, null, new q7e(this, depositFloatingIconPage, eVar, null), 3);
    }
}
