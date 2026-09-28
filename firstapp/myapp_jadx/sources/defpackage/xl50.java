package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.common.network.data.ResultsKt$onEachFailure$1", f = "Results.kt", l = {174}, m = "invokeSuspend", v = 2)
public final class xl50 extends tje0 implements Function2<lk50<Object>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function2<lk50.a, v1b<? super Unit>, Object> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xl50(Function2<? super lk50.a, ? super v1b<? super Unit>, ? extends Object> function2, v1b<? super xl50> v1bVar) {
        super(2, v1bVar);
        this.c = function2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xl50 xl50Var = new xl50(this.c, v1bVar);
        xl50Var.b = obj;
        return xl50Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<Object> lk50Var, v1b<? super Unit> v1bVar) {
        return ((xl50) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to xl50 for r5v3 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.b
            lk50 r0 = (defpackage.lk50) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r5.a
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L18
            if (r2 != r4) goto L12
            defpackage.uj50.b(r6)
            goto L2c
        L12:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            return r3
        L18:
            defpackage.uj50.b(r6)
            boolean r6 = r0 instanceof lk50.a
            if (r6 == 0) goto L2c
            r5.b = r3
            r5.a = r4
            kotlin.jvm.functions.Function2<lk50$a, v1b<? super kotlin.Unit>, java.lang.Object> r6 = r5.c
            java.lang.Object r5 = r6.invoke(r0, r5)
            if (r5 != r1) goto L2c
            return r1
        L2c:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xl50.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
