package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes.dex */
public final class dqi {

    @c0d(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", l = {HttpStatusCodesKt.HTTP_PROCESSING, 105, 110}, m = "invokeSuspend")
    public static final class a extends ji50 implements Function2<vp1, v1b<? super Unit>, Object> {
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ CoroutineContext d;
        public final /* synthetic */ Function2<vp1, v1b<? super Unit>, Object> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(CoroutineContext coroutineContext, Function2<? super vp1, ? super v1b<? super Unit>, ? extends Object> function2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.d = coroutineContext;
            this.e = function2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.d, this.e, v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vp1 vp1Var, v1b<? super Unit> v1bVar) {
            return ((a) create(vp1Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(4:38|21|(2:24|25)|34) */
        /* JADX WARN: Code duplicated, block: B:24:0x004d  */
        /* JADX WARN: Code duplicated, block: B:32:0x0065  */
        /* JADX WARN: Code duplicated, block: B:35:0x0072  */
        /* JADX WARN: Code duplicated, block: B:36:0x0073  */
        /* JADX WARN: Code duplicated, block: B:38:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
        
            if (r9 == r0) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
        
            r1 = r9;
            r9 = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
        
            if (defpackage.dqi.a(r1, defpackage.c020.c, r8) == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, vp1] */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v21 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, vp1] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r9v12 */
        /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v9 */
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
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0058 -> B:12:0x0027). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x006f -> B:12:0x0027). Please report as a decompilation issue!!! */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r8.b
                kotlin.coroutines.CoroutineContext r2 = r8.d
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L33
                if (r1 == r5) goto L2b
                if (r1 == r4) goto L20
                if (r1 != r3) goto L19
                java.lang.Object r1 = r8.c
                vp1 r1 = (defpackage.vp1) r1
                defpackage.uj50.b(r9)
                goto L27
            L19:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                r8 = 0
                return r8
            L20:
                java.lang.Object r1 = r8.c
                vp1 r1 = (defpackage.vp1) r1
                defpackage.uj50.b(r9)     // Catch: java.util.concurrent.CancellationException -> L29
            L27:
                r9 = r1
                goto L3a
            L29:
                r9 = move-exception
                goto L5f
            L2b:
                java.lang.Object r1 = r8.c
                vp1 r1 = (defpackage.vp1) r1
                defpackage.uj50.b(r9)     // Catch: java.util.concurrent.CancellationException -> L29
                goto L4e
            L33:
                defpackage.uj50.b(r9)
                java.lang.Object r9 = r8.c
                vp1 r9 = (defpackage.vp1) r9
            L3a:
                boolean r1 = defpackage.i9p.h(r2)
                if (r1 == 0) goto L73
                kotlin.jvm.functions.Function2<vp1, v1b<? super kotlin.Unit>, java.lang.Object> r1 = r8.e     // Catch: java.util.concurrent.CancellationException -> L5b
                r8.c = r9     // Catch: java.util.concurrent.CancellationException -> L5b
                r8.b = r5     // Catch: java.util.concurrent.CancellationException -> L5b
                java.lang.Object r1 = r1.invoke(r9, r8)     // Catch: java.util.concurrent.CancellationException -> L5b
                if (r1 != r0) goto L4d
                goto L71
            L4d:
                r1 = r9
            L4e:
                r8.c = r1     // Catch: java.util.concurrent.CancellationException -> L29
                r8.b = r4     // Catch: java.util.concurrent.CancellationException -> L29
                c020 r9 = defpackage.c020.c     // Catch: java.util.concurrent.CancellationException -> L29
                java.lang.Object r9 = defpackage.dqi.a(r1, r9, r8)     // Catch: java.util.concurrent.CancellationException -> L29
                if (r9 != r0) goto L27
                goto L71
            L5b:
                r1 = move-exception
                r7 = r1
                r1 = r9
                r9 = r7
            L5f:
                boolean r6 = defpackage.i9p.h(r2)
                if (r6 == 0) goto L72
                r8.c = r1
                r8.b = r3
                c020 r9 = defpackage.c020.c
                java.lang.Object r9 = defpackage.dqi.a(r1, r9, r8)
                if (r9 != r0) goto L27
            L71:
                return r0
            L72:
                throw r9
            L73:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: dqi.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:22:0x0066->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0050 A[EDGE_INSN: B:31:0x0050->B:18:0x0050 BREAK  A[LOOP:0: B:22:0x0066->B:26:0x0073], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:21:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.vp1 r8, defpackage.c020 r9, defpackage.pz1 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.cqi
            if (r0 == 0) goto L13
            r0 = r10
            cqi r0 = (defpackage.cqi) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cqi r0 = new cqi
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.c
            y5b r1 = defpackage.y5b.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2f
            c020 r8 = r0.b
            vp1 r9 = r0.a
            defpackage.uj50.b(r10)
            r7 = r9
            r9 = r8
            r8 = r7
            goto L5d
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            r8 = 0
            return r8
        L36:
            defpackage.uj50.b(r10)
            b020 r10 = r8.U0()
            java.util.List<m020> r10 = r10.a
            int r2 = r10.size()
            r5 = r3
        L44:
            if (r5 >= r2) goto L79
            java.lang.Object r6 = r10.get(r5)
            m020 r6 = (defpackage.m020) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L76
        L50:
            r0.a = r8
            r0.b = r9
            r0.d = r4
            java.lang.Object r10 = r8.l1(r9, r0)
            if (r10 != r1) goto L5d
            return r1
        L5d:
            b020 r10 = (defpackage.b020) r10
            java.util.List<m020> r10 = r10.a
            int r2 = r10.size()
            r5 = r3
        L66:
            if (r5 >= r2) goto L79
            java.lang.Object r6 = r10.get(r5)
            m020 r6 = (defpackage.m020) r6
            boolean r6 = r6.d
            if (r6 == 0) goto L73
            goto L50
        L73:
            int r5 = r5 + 1
            goto L66
        L76:
            int r5 = r5 + 1
            goto L44
        L79:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqi.a(vp1, c020, pz1):java.lang.Object");
    }

    public static final Object b(u020 u020Var, Function2<? super vp1, ? super v1b<? super Unit>, ? extends Object> function2, v1b<? super Unit> v1bVar) {
        Object objX0 = u020Var.x0(new a(v1bVar.getContext(), function2, null), v1bVar);
        return objX0 == y5b.a ? objX0 : Unit.a;
    }
}
