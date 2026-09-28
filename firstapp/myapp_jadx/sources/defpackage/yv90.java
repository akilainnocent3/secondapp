package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.SingleRunner$runInIsolation$2", f = "SingleRunner.kt", l = {53, 59, 61, 61}, m = "invokeSuspend")
public final class yv90 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ uv90 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1<v1b<? super Unit>, Object> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public yv90(uv90 uv90Var, int i, Function1<? super v1b<? super Unit>, ? extends Object> function1, v1b<? super yv90> v1bVar) {
        super(2, v1bVar);
        this.c = uv90Var;
        this.d = i;
        this.e = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yv90 yv90Var = new yv90(this.c, this.d, this.e, v1bVar);
        yv90Var.b = obj;
        return yv90Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((yv90) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (r9 == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [uv90$b] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [c9p] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v7, types: [c9p] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, x1b, yv90] */
    /* JADX WARN: Type inference failed for: r9v1, types: [x1b, yv90] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            uv90 r0 = r9.c
            uv90$b r0 = r0.a
            y5b r1 = defpackage.y5b.a
            int r2 = r9.a
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L3d
            if (r2 == r7) goto L35
            if (r2 == r6) goto L2b
            if (r2 == r5) goto L26
            if (r2 == r4) goto L1d
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r3
        L1d:
            java.lang.Object r9 = r9.b
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            defpackage.uj50.b(r10)
            goto L8e
        L26:
            defpackage.uj50.b(r10)
            goto L8f
        L2b:
            java.lang.Object r2 = r9.b
            c9p r2 = (defpackage.c9p) r2
            defpackage.uj50.b(r10)     // Catch: java.lang.Throwable -> L33
            goto L77
        L33:
            r10 = move-exception
            goto L82
        L35:
            java.lang.Object r2 = r9.b
            c9p r2 = (defpackage.c9p) r2
            defpackage.uj50.b(r10)
            goto L62
        L3d:
            defpackage.uj50.b(r10)
            java.lang.Object r10 = r9.b
            v5b r10 = (defpackage.v5b) r10
            kotlin.coroutines.CoroutineContext r10 = r10.getCoroutineContext()
            c9p$b r2 = c9p.b.a
            kotlin.coroutines.CoroutineContext$Element r10 = r10.get(r2)
            if (r10 == 0) goto L92
            c9p r10 = (defpackage.c9p) r10
            r9.b = r10
            r9.a = r7
            int r2 = r9.d
            java.lang.Object r2 = r0.b(r2, r10, r9)
            if (r2 != r1) goto L5f
            goto L8c
        L5f:
            r8 = r2
            r2 = r10
            r10 = r8
        L62:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L8f
            kotlin.jvm.functions.Function1<v1b<? super kotlin.Unit>, java.lang.Object> r10 = r9.e     // Catch: java.lang.Throwable -> L33
            r9.b = r2     // Catch: java.lang.Throwable -> L33
            r9.a = r6     // Catch: java.lang.Throwable -> L33
            java.lang.Object r10 = r10.invoke(r9)     // Catch: java.lang.Throwable -> L33
            if (r10 != r1) goto L77
            goto L8c
        L77:
            r9.b = r3
            r9.a = r5
            java.lang.Object r9 = r0.a(r2, r9)
            if (r9 != r1) goto L8f
            goto L8c
        L82:
            r9.b = r10
            r9.a = r4
            java.lang.Object r9 = r0.a(r2, r9)
            if (r9 != r1) goto L8d
        L8c:
            return r1
        L8d:
            r9 = r10
        L8e:
            throw r9
        L8f:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L92:
            java.lang.String r9 = "Internal error. coroutineScope should've created a job."
            defpackage.ib5.a(r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv90.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
