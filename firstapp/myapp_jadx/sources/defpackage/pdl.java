package defpackage;

import com.sporty.android.core.model.watchdog.HangWatchdogConfigData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.performance.watchdog.HangWatchdogStarter$start$1", f = "HangWatchdogStarter.kt", l = {48, 52, 55, 58}, m = "invokeSuspend", v = 2)
public final class pdl extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public int b;
    public final /* synthetic */ qdl c;

    @c0d(c = "com.sporty.android.core.performance.watchdog.HangWatchdogStarter$start$1$1", f = "HangWatchdogStarter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ qdl a;
        public final /* synthetic */ HangWatchdogConfigData b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qdl qdlVar, HangWatchdogConfigData hangWatchdogConfigData, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = qdlVar;
            this.b = hangWatchdogConfigData;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.d.a(this.b);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdl(qdl qdlVar, v1b<? super pdl> v1bVar) {
        super(2, v1bVar);
        this.c = qdlVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pdl(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pdl) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:32:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x0088 A[DONT_INVERT, PHI: r1
      0x0088: PHI (r1v8 int) = (r1v5 int), (r1v5 int), (r1v9 int) binds: [B:31:0x0074, B:33:0x0085, B:11:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x008a  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
    
        if (r6.a(r2, r10) == r0) goto L39;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r10.b
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            qdl r6 = r10.c
            r7 = 1
            r8 = 0
            if (r1 == 0) goto L2f
            if (r1 == r7) goto L2b
            if (r1 == r5) goto L27
            if (r1 == r4) goto L21
            if (r1 != r3) goto L1b
            defpackage.uj50.b(r11)
            goto L96
        L1b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r10)
            return r8
        L21:
            int r1 = r10.a
            defpackage.uj50.b(r11)
            goto L88
        L27:
            defpackage.uj50.b(r11)
            goto L63
        L2b:
            defpackage.uj50.b(r11)
            goto L4f
        L2f:
            defpackage.uj50.b(r11)
            yqm r11 = r6.b
            x66<xdl> r1 = defpackage.z76.q
            yzh r11 = r11.j(r1)
            sl50 r1 = new sl50
            r1.<init>(r11)
            xdl r11 = defpackage.xdl.DISABLED
            yl50 r9 = new yl50
            r9.<init>(r1, r11)
            r10.b = r7
            java.lang.Object r11 = defpackage.s0i.a(r9, r10)
            if (r11 != r0) goto L4f
            goto L95
        L4f:
            xdl r11 = (defpackage.xdl) r11
            xdl r1 = defpackage.xdl.ENABLED
            if (r11 == r1) goto L58
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        L58:
            udl r11 = r6.c
            r10.b = r5
            java.lang.Object r11 = r11.a(r10)
            if (r11 != r0) goto L63
            goto L95
        L63:
            com.sporty.android.core.model.watchdog.HangWatchdogConfigData r11 = (com.sporty.android.core.model.watchdog.HangWatchdogConfigData) r11
            if (r11 == 0) goto L6e
            com.sporty.android.core.model.watchdog.HangWatchdogConfigData$Companion r1 = com.sporty.android.core.model.watchdog.HangWatchdogConfigData.INSTANCE
            com.sporty.android.core.model.watchdog.HangWatchdogConfigData r11 = r1.sanitized(r11)
            goto L6f
        L6e:
            r11 = r8
        L6f:
            if (r11 == 0) goto L73
            r1 = r7
            goto L74
        L73:
            r1 = r2
        L74:
            if (r1 == 0) goto L88
            k5b r5 = r6.g
            pdl$a r9 = new pdl$a
            r9.<init>(r6, r11, r8)
            r10.a = r1
            r10.b = r4
            java.lang.Object r11 = defpackage.ej5.d(r5, r9, r10)
            if (r11 != r0) goto L88
            goto L95
        L88:
            if (r1 == 0) goto L8b
            r2 = r7
        L8b:
            r10.a = r1
            r10.b = r3
            java.lang.Object r10 = r6.a(r2, r10)
            if (r10 != r0) goto L96
        L95:
            return r0
        L96:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pdl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
