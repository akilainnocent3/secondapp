package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballOverviewStatsHandlerImpl$init$3", f = "ScheduledFootballOverviewStatsHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zd70 extends tje0 implements Function2<ve70, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ td70 b;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ve70.values().length];
            try {
                ve70 ve70Var = ve70.a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ve70 ve70Var2 = ve70.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd70(td70 td70Var, v1b<? super zd70> v1bVar) {
        super(2, v1bVar);
        this.b = td70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zd70 zd70Var = new zd70(this.b, v1bVar);
        zd70Var.a = obj;
        return zd70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ve70 ve70Var, v1b<? super Unit> v1bVar) {
        return ((zd70) create(ve70Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        td70 td70Var = this.b;
        b390 b390Var = td70Var.c;
        b390 b390Var2 = td70Var.f;
        ve70 ve70Var = (ve70) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        int i = ve70Var == null ? -1 : a.a[ve70Var.ordinal()];
        if (i == -1) {
            td70.a aVar = td70.a.c;
            b390Var.a(aVar);
            b390Var2.a(aVar);
        } else if (i != 1) {
            if (i != 2) {
                uhc.a();
                return null;
            }
            if (td70Var.g.getValue() == null) {
                b390Var2.a(td70.a.a);
            }
        } else if (td70Var.d.getValue() == null) {
            b390Var.a(td70.a.a);
        }
        return Unit.a;
    }
}
