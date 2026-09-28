package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.win.PersonalSocketUseCase$validateMissionBottomSheetCondition$1", f = "PersonalSocketUseCase.kt", l = {206, 207}, m = "invokeSuspend", v = 2)
public final class wq00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ mq00 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ c420 d;

    @c0d(c = "com.sportybet.plugin.realsports.win.PersonalSocketUseCase$validateMissionBottomSheetCondition$1$1", f = "PersonalSocketUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ c420 a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c420 c420Var, boolean z, v1b v1bVar) {
            super(2, v1bVar);
            this.a = c420Var;
            this.b = z;
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
            this.a.invoke(Boolean.valueOf(this.b));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq00(mq00 mq00Var, boolean z, c420 c420Var, v1b v1bVar) {
        super(2, v1bVar);
        this.b = mq00Var;
        this.c = z;
        this.d = c420Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wq00(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wq00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (defpackage.ej5.d(r1, r3, r6) == r0) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.a
            r2 = 0
            mq00 r3 = r6.b
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1d
            if (r1 == r5) goto L19
            if (r1 != r4) goto L13
            defpackage.uj50.b(r7)
            goto L43
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r2
        L19:
            defpackage.uj50.b(r7)
            goto L2b
        L1d:
            defpackage.uj50.b(r7)
            r6.a = r5
            boolean r7 = r6.c
            java.lang.Object r7 = r3.e(r7, r6)
            if (r7 != r0) goto L2b
            goto L42
        L2b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            k5b r1 = r3.e
            wq00$a r3 = new wq00$a
            c420 r5 = r6.d
            r3.<init>(r5, r7, r2)
            r6.a = r4
            java.lang.Object r6 = defpackage.ej5.d(r1, r3, r6)
            if (r6 != r0) goto L43
        L42:
            return r0
        L43:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
