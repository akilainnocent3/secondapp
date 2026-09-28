package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSessionDataHandlerImpl$init$8", f = "ScheduledFootballSessionDataHandlerImpl.kt", l = {137, 138}, m = "invokeSuspend", v = 2)
public final class lj70 extends tje0 implements Function2<Long, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ long b;
    public final /* synthetic */ pj70 c;
    public final /* synthetic */ et7 d;
    public final /* synthetic */ String e;

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSessionDataHandlerImpl$init$8$1$1", f = "ScheduledFootballSessionDataHandlerImpl.kt", l = {140}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ pj70 b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ e970 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pj70 pj70Var, String str, String str2, e970 e970Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = pj70Var;
            this.c = str;
            this.d = str2;
            this.e = e970Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, v1bVar);
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
                e970 e970Var = this.e;
                String str = e970Var.a;
                int i2 = e970Var.b;
                int i3 = e970Var.c;
                this.a = 1;
                if (this.b.e(this.c, this.d, str, i2, i3, false, this) == y5bVar) {
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
    public lj70(pj70 pj70Var, et7 et7Var, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.c = pj70Var;
        this.d = et7Var;
        this.e = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lj70 lj70Var = new lj70(this.c, this.d, this.e, v1bVar);
        lj70Var.b = ((Number) obj).longValue();
        return lj70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Long l, v1b<? super Unit> v1bVar) {
        return ((lj70) create(Long.valueOf(l.longValue()), v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (r12 == r2) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            long r0 = r11.b
            y5b r2 = defpackage.y5b.a
            int r3 = r11.a
            r4 = 0
            pj70 r6 = r11.c
            r5 = 2
            r7 = 1
            if (r3 == 0) goto L1f
            if (r3 == r7) goto L1b
            if (r3 != r5) goto L15
            defpackage.uj50.b(r12)
            goto L38
        L15:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            return r4
        L1b:
            defpackage.uj50.b(r12)
            goto L2d
        L1f:
            defpackage.uj50.b(r12)
            r11.b = r0
            r11.a = r7
            java.lang.Object r12 = r6.i(r0, r11)
            if (r12 != r2) goto L2d
            goto L37
        L2d:
            r11.b = r0
            r11.a = r5
            java.io.Serializable r12 = r6.g(r0, r11)
            if (r12 != r2) goto L38
        L37:
            return r2
        L38:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
        L3e:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r0 = r12.next()
            kotlin.Pair r0 = (kotlin.Pair) r0
            A r1 = r0.a
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            B r0 = r0.b
            r9 = r0
            e970 r9 = (defpackage.e970) r9
            lj70$a r5 = new lj70$a
            r10 = 0
            java.lang.String r7 = r11.e
            r5.<init>(r6, r7, r8, r9, r10)
            r0 = 3
            et7 r1 = r11.d
            defpackage.ej5.c(r1, r4, r4, r5, r0)
            goto L3e
        L63:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj70.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
