package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.timeAlertReached.compose.TimeAlertReachedAlertDialogKt$TimeAlertReachedAlertDialog$4$1", f = "TimeAlertReachedAlertDialog.kt", l = {73}, m = "invokeSuspend", v = 2)
public final class puf0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ wuf0 b;
    public final /* synthetic */ Function0<Unit> c;
    public final /* synthetic */ Function0<Unit> d;

    public static final class a<T> implements myh {
        public final /* synthetic */ Function0<Unit> a;
        public final /* synthetic */ Function0<Unit> b;

        public a(Function0<Unit> function0, Function0<Unit> function1) {
            this.a = function0;
            this.b = function1;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            id90 id90Var = (id90) obj;
            if (id90Var instanceof ruf0.a) {
                this.a.invoke();
            } else if (id90Var instanceof ruf0.b) {
                this.b.invoke();
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public puf0(wuf0 wuf0Var, Function0<Unit> function0, Function0<Unit> function1, v1b<? super puf0> v1bVar) {
        super(2, v1bVar);
        this.b = wuf0Var;
        this.c = function0;
        this.d = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new puf0(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((puf0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to puf0 for r6v2 'this'  v1b
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 == r3) goto L10
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r2
        L10:
            defpackage.uj50.b(r7)
            goto L2f
        L14:
            defpackage.uj50.b(r7)
            wuf0 r7 = r6.b
            t340 r7 = r7.d
            puf0$a r1 = new puf0$a
            kotlin.jvm.functions.Function0<kotlin.Unit> r4 = r6.c
            kotlin.jvm.functions.Function0<kotlin.Unit> r5 = r6.d
            r1.<init>(r4, r5)
            r6.a = r3
            a390<T> r7 = r7.a
            java.lang.Object r6 = r7.collect(r1, r6)
            if (r6 != r0) goto L2f
            return r0
        L2f:
            defpackage.fkd.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.puf0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
