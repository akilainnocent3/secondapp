package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1", f = "FlowExt.kt", l = {68}, m = "invokeSuspend")
public final class tyh extends tje0 implements Function2<myh<Object>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ lyh<Object> c;
    public final /* synthetic */ gaj<Object, Object, v1b<Object>, Object> d;

    public static final class a<T> implements myh {
        public final /* synthetic */ dq40<Object> a;
        public final /* synthetic */ gaj<T, T, v1b<? super T>, Object> b;
        public final /* synthetic */ myh<T> c;

        /* JADX INFO: renamed from: tyh$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.paging.FlowExtKt$simpleRunningReduce$1$1", f = "FlowExt.kt", l = {73, 76}, m = "emit")
        public static final class C1155a extends x1b {
            public a a;
            public dq40 b;
            public /* synthetic */ Object c;
            public final /* synthetic */ a<T> d;
            public int e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1155a(a<? super T> aVar, v1b<? super C1155a> v1bVar) {
                super(v1bVar);
                this.d = aVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.c = obj;
                this.e |= Integer.MIN_VALUE;
                return this.d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(dq40<Object> dq40Var, gaj<? super T, ? super T, ? super v1b<? super T>, ? extends Object> gajVar, myh<? super T> myhVar) {
            this.a = dq40Var;
            this.b = gajVar;
            this.c = myhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
        
            if (r9.emit(r8, r0) == r1) goto L26;
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
        @Override // defpackage.myh
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r9, defpackage.v1b<? super kotlin.Unit> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof tyh.a.C1155a
                if (r0 == 0) goto L13
                r0 = r10
                tyh$a$a r0 = (tyh.a.C1155a) r0
                int r1 = r0.e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.e = r1
                goto L18
            L13:
                tyh$a$a r0 = new tyh$a$a
                r0.<init>(r8, r10)
            L18:
                java.lang.Object r10 = r0.c
                y5b r1 = defpackage.y5b.a
                int r2 = r0.e
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L39
                if (r2 == r5) goto L31
                if (r2 != r4) goto L2b
                defpackage.uj50.b(r10)
                goto L71
            L2b:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                return r3
            L31:
                dq40 r8 = r0.b
                tyh$a r9 = r0.a
                defpackage.uj50.b(r10)
                goto L58
            L39:
                defpackage.uj50.b(r10)
                dq40<java.lang.Object> r10 = r8.a
                T r2 = r10.a
                java.lang.Object r6 = defpackage.xyh.a
                if (r2 != r6) goto L45
                goto L5c
            L45:
                r0.a = r8
                r0.b = r10
                r0.e = r5
                gaj<T, T, v1b<? super T>, java.lang.Object> r5 = r8.b
                java.lang.Object r9 = r5.invoke(r2, r9, r0)
                if (r9 != r1) goto L54
                goto L70
            L54:
                r7 = r9
                r9 = r8
                r8 = r10
                r10 = r7
            L58:
                r7 = r10
                r10 = r8
                r8 = r9
                r9 = r7
            L5c:
                r10.a = r9
                myh<T> r9 = r8.c
                dq40<java.lang.Object> r8 = r8.a
                T r8 = r8.a
                r0.a = r3
                r0.b = r3
                r0.e = r4
                java.lang.Object r8 = r9.emit(r8, r0)
                if (r8 != r1) goto L71
            L70:
                return r1
            L71:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: tyh.a.emit(java.lang.Object, v1b):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public tyh(lyh<Object> lyhVar, gaj<Object, Object, ? super v1b<Object>, ? extends Object> gajVar, v1b<? super tyh> v1bVar) {
        super(2, v1bVar);
        this.c = lyhVar;
        this.d = gajVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        tyh tyhVar = new tyh(this.c, this.d, v1bVar);
        tyhVar.b = obj;
        return tyhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<Object> myhVar, v1b<? super Unit> v1bVar) {
        return ((tyh) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = (myh) this.b;
            dq40 dq40Var = new dq40();
            dq40Var.a = xyh.a;
            a aVar = new a(dq40Var, this.d, myhVar);
            this.a = 1;
            if (this.c.collect(aVar, this) == y5bVar) {
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
