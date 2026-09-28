package defpackage;

import com.sporty.android.core.model.dispatcher.ApplicationScope;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class age implements rdd {
    public final jr40 a;
    public final v5b b;
    public final mgb0 c;
    public final AtomicLong d;

    @c0d(c = "com.sportybet.feature.devicemanagement.impl.ui.DeviceManagementLifecycleObserver$onStart$1", f = "DeviceManagementLifecycleObserver.kt", l = {33}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public age a;
        public long b;
        public int c;
        public /* synthetic */ Object d;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = age.this.new a(v1bVar);
            aVar.d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x006c  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            Throwable thA;
            age ageVar;
            long j;
            y5b y5bVar = y5b.a;
            int i = this.c;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    age ageVar2 = age.this;
                    zi50.a aVar = zi50.b;
                    if (ageVar2.c.isLogin()) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (jCurrentTimeMillis - ageVar2.d.get() >= 3600000) {
                            jr40 jr40Var = ageVar2.a;
                            this.d = null;
                            this.a = ageVar2;
                            this.b = jCurrentTimeMillis;
                            this.c = 1;
                            if (jr40Var.a.b(this) == y5bVar) {
                                return y5bVar;
                            }
                            ageVar = ageVar2;
                            j = jCurrentTimeMillis;
                        }
                    }
                    bVar = Unit.a;
                    zi50.a aVar2 = zi50.b;
                    thA = zi50.a(bVar);
                    if (thA != null) {
                        itf0.a.f(thA, "Failed to refresh user device", new Object[0]);
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = this.b;
                ageVar = this.a;
                uj50.b(obj);
                ageVar.d.set(j);
                bVar = Unit.a;
                zi50.a aVar3 = zi50.b;
            } catch (Throwable th) {
                zi50.a aVar4 = zi50.b;
                bVar = new zi50.b(th);
            }
            thA = zi50.a(bVar);
            if (thA != null) {
                itf0.a.f(thA, "Failed to refresh user device", new Object[0]);
            }
            return Unit.a;
        }
    }

    public age(jr40 jr40Var, @ApplicationScope v5b v5bVar, mgb0 mgb0Var) {
        v5bVar.getClass();
        mgb0Var.getClass();
        this.a = jr40Var;
        this.b = v5bVar;
        this.c = mgb0Var;
        this.d = new AtomicLong(0L);
    }

    @Override // defpackage.rdd
    public final void onStart(ibs ibsVar) {
        ej5.c(this.b, null, null, new a(null), 3);
    }
}
