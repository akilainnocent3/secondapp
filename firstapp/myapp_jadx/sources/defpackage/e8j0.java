package defpackage;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", l = {54, 55}, m = "invokeSuspend")
public final class e8j0 extends tje0 implements Function2<myh<? super b9j0>, v1b<? super Unit>, Object> {
    public qya a;
    public c77 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ f8j0 e;
    public final /* synthetic */ Activity f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8j0(f8j0 f8j0Var, Activity activity, v1b<? super e8j0> v1bVar) {
        super(2, v1bVar);
        this.e = f8j0Var;
        this.f = activity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        e8j0 e8j0Var = new e8j0(this.e, this.f, v1bVar);
        e8j0Var.d = obj;
        return e8j0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super b9j0> myhVar, v1b<? super Unit> v1bVar) {
        return ((e8j0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x0072 A[Catch: all -> 0x001e, TRY_LEAVE, TryCatch #0 {all -> 0x001e, blocks: (B:7:0x0018, B:18:0x0057, B:22:0x006a, B:24:0x0072, B:14:0x002f, B:17:0x0052), top: B:31:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0087  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (r6.emit(r10, r9) == r1) goto L26;
     */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0084 -> B:8:0x001b). Please report as a decompilation issue!!! */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            f8j0 r0 = r9.e
            w7j0 r0 = r0.b
            y5b r1 = defpackage.y5b.a
            int r2 = r9.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 == r4) goto L27
            if (r2 != r3) goto L20
            c77 r2 = r9.b
            qya r5 = r9.a
            java.lang.Object r6 = r9.d
            myh r6 = (defpackage.myh) r6
            defpackage.uj50.b(r10)     // Catch: java.lang.Throwable -> L1e
        L1b:
            r10 = r6
            r6 = r2
            goto L57
        L1e:
            r9 = move-exception
            goto L8d
        L20:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            r9 = 0
            return r9
        L27:
            c77 r2 = r9.b
            qya r5 = r9.a
            java.lang.Object r6 = r9.d
            myh r6 = (defpackage.myh) r6
            defpackage.uj50.b(r10)     // Catch: java.lang.Throwable -> L1e
            goto L6a
        L33:
            defpackage.uj50.b(r10)
            java.lang.Object r10 = r9.d
            myh r10 = (defpackage.myh) r10
            pb5 r2 = defpackage.pb5.b
            r5 = 4
            r6 = 10
            tb5 r2 = defpackage.d77.b(r6, r5, r2)
            d8j0 r5 = new d8j0
            r5.<init>(r2)
            liv r6 = new liv
            r6.<init>()
            android.app.Activity r7 = r9.f
            r0.a(r7, r6, r5)
            tb5$a r6 = new tb5$a     // Catch: java.lang.Throwable -> L1e
            r6.<init>()     // Catch: java.lang.Throwable -> L1e
        L57:
            r9.d = r10     // Catch: java.lang.Throwable -> L1e
            r9.a = r5     // Catch: java.lang.Throwable -> L1e
            r9.b = r6     // Catch: java.lang.Throwable -> L1e
            r9.c = r4     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r2 = r6.b(r9)     // Catch: java.lang.Throwable -> L1e
            if (r2 != r1) goto L66
            goto L86
        L66:
            r8 = r6
            r6 = r10
            r10 = r2
            r2 = r8
        L6a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L1e
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L1e
            if (r10 == 0) goto L87
            java.lang.Object r10 = r2.next()     // Catch: java.lang.Throwable -> L1e
            b9j0 r10 = (defpackage.b9j0) r10     // Catch: java.lang.Throwable -> L1e
            r9.d = r6     // Catch: java.lang.Throwable -> L1e
            r9.a = r5     // Catch: java.lang.Throwable -> L1e
            r9.b = r2     // Catch: java.lang.Throwable -> L1e
            r9.c = r3     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r10 = r6.emit(r10, r9)     // Catch: java.lang.Throwable -> L1e
            if (r10 != r1) goto L1b
        L86:
            return r1
        L87:
            r0.b(r5)
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L8d:
            r0.b(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e8j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
