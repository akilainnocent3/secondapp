package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.timeAlert.manager.MonitorTimeAlertAppUsageUseCase$invoke$1", f = "MonitorTimeAlertAppUsageUseCase.kt", l = {24}, m = "invokeSuspend", v = 2)
public final class c4w extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public long a;
    public long b;
    public int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ d4w e;
    public final /* synthetic */ j1b f;

    @c0d(c = "com.sportybet.feature.timeAlert.manager.MonitorTimeAlertAppUsageUseCase$invoke$1$1", f = "MonitorTimeAlertAppUsageUseCase.kt", l = {30}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ d4w b;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d4w d4wVar, long j, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = d4wVar;
            this.c = j;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ptf0 ptf0Var = this.b.a;
                int i2 = ((int) this.c) / 1000;
                this.a = 1;
                if (ptf0Var.a(i2, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4w(int i, d4w d4wVar, j1b j1bVar, v1b v1bVar) {
        super(2, v1bVar);
        this.d = i;
        this.e = d4wVar;
        this.f = j1bVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new c4w(this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c4w) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        long j;
        long jCurrentTimeMillis;
        y5b y5bVar = y5b.a;
        int i = this.c;
        if (i == 0) {
            uj50.b(obj);
            long j2 = ((long) this.d) * 1000;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            try {
                this.a = j2;
                this.b = jCurrentTimeMillis2;
                this.c = 1;
                if (hkd.b(j2, this) == y5bVar) {
                    return y5bVar;
                }
                jCurrentTimeMillis = j2;
            } catch (CancellationException unused) {
                j = jCurrentTimeMillis2;
                jCurrentTimeMillis = System.currentTimeMillis() - j;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.b;
            jCurrentTimeMillis = this.a;
            try {
                uj50.b(obj);
            } catch (CancellationException unused2) {
                jCurrentTimeMillis = System.currentTimeMillis() - j;
            }
        }
        ej5.c(this.f, null, null, new a(this.e, jCurrentTimeMillis, null), 3);
        return Unit.a;
    }
}
