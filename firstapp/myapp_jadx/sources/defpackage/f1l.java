package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportybet.android.basepay.viewModel.GlobalDepositViewModel$onViewInitialized$2", f = "GlobalDepositViewModel.kt", l = {WebSocketProtocol.PAYLOAD_SHORT, 127, 128, 129, 130}, m = "invokeSuspend", v = 2)
public final class f1l extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public int b;
    public final /* synthetic */ a1l c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1l(a1l a1lVar, v1b<? super f1l> v1bVar) {
        super(2, v1bVar);
        this.c = a1lVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new f1l(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((f1l) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076 A[PHI: r11
      0x0076: PHI (r11v9 java.lang.Object) = (r11v8 java.lang.Object), (r11v0 java.lang.Object) binds: [B:25:0x0073, B:13:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        if (r0.A1(r10) == r2) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [ubk0] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v3 */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            a1l r0 = r10.c
            v800 r1 = r0.d
            y5b r2 = defpackage.y5b.a
            int r3 = r10.b
            r4 = 0
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r3 == 0) goto L37
            if (r3 == r9) goto L33
            if (r3 == r8) goto L2f
            if (r3 == r7) goto L2b
            if (r3 == r6) goto L25
            if (r3 != r5) goto L1f
            defpackage.uj50.b(r11)
            goto La1
        L1f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r10)
            return r4
        L25:
            int r1 = r10.a
            defpackage.uj50.b(r11)
            goto L8c
        L2b:
            defpackage.uj50.b(r11)
            goto L76
        L2f:
            defpackage.uj50.b(r11)
            goto L4e
        L33:
            defpackage.uj50.b(r11)
            goto L43
        L37:
            defpackage.uj50.b(r11)
            r10.b = r9
            java.lang.Object r11 = r0.z1(r10)
            if (r11 != r2) goto L43
            goto L96
        L43:
            f600 r11 = defpackage.f600.DEPOSIT
            r10.b = r8
            java.lang.Object r11 = r1.b(r11, r10)
            if (r11 != r2) goto L4e
            goto L96
        L4e:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L97
            f1i r11 = r1.g
            x0l r1 = r0.c
            r3 = 0
            java.lang.String r3 = com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN.uQewNinLDKUbrc
            zed r1 = r1.a
            lyh r1 = r1.getIntFlow(r3)
            b1l r3 = new b1l
            r3.<init>(r0, r4)
            n1i r4 = new n1i
            r4.<init>(r11, r1, r3)
            r10.b = r7
            java.lang.Object r11 = defpackage.s0i.c(r4, r10)
            if (r11 != r2) goto L76
            goto L96
        L76:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            if (r11 == 0) goto L7e
            boolean r9 = r11.booleanValue()
        L7e:
            ubk0 r11 = r0.z
            r10.a = r9
            r10.b = r6
            java.lang.Object r11 = r11.c(r9, r10)
            if (r11 != r2) goto L8b
            goto L96
        L8b:
            r1 = r9
        L8c:
            r10.a = r1
            r10.b = r5
            java.lang.Object r10 = r0.A1(r10)
            if (r10 != r2) goto La1
        L96:
            return r2
        L97:
            z0l$f r10 = z0l.f.a
            r0.x1(r10)
            z0l$a r10 = z0l.a.a
            r0.x1(r10)
        La1:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f1l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
