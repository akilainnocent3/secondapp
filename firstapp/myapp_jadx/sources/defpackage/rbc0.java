package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.antest.SportyLegendsComboSingleBetFlowAnTestReporter$reportConversion$1", f = "SportyLegendsComboSingleBetFlowAnTestReporter.kt", l = {62}, m = "invokeSuspend", v = 2)
public final class rbc0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ sbc0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    @c0d(c = "com.sportybet.android.instantwin.antest.SportyLegendsComboSingleBetFlowAnTestReporter$reportConversion$1$1", f = "SportyLegendsComboSingleBetFlowAnTestReporter.kt", l = {63}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ sbc0 b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(sbc0 sbc0Var, String str, String str2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = sbc0Var;
            this.c = str;
            this.d = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
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
                yqm yqmVar = this.b.a;
                String str = z76.l.a;
                this.a = 1;
                if (yqmVar.c(str, this.c, this.d, this) == y5bVar) {
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
    public rbc0(sbc0 sbc0Var, String str, String str2, v1b<? super rbc0> v1bVar) {
        super(2, v1bVar);
        this.b = sbc0Var;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new rbc0(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((rbc0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                b.a aVar = b.b;
                long jH = c.h(10, rgf.SECONDS);
                a aVar2 = new a(this.b, this.c, this.d, null);
                this.a = 1;
                obj = vxf0.d(jH, aVar2, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
        } catch (Throwable unused) {
        }
        return Unit.a;
    }
}
