package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.RuntimeVersion;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class b77<T, R> extends z67<T, R> {
    public final gaj<myh<? super R>, T, v1b<? super Unit>, Object> e;

    @c0d(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ b77<T, R> c;
        public final /* synthetic */ myh<R> d;

        /* JADX INFO: renamed from: b77$a$a, reason: collision with other inner class name */
        public static final class C0112a<T> implements myh {
            public final /* synthetic */ dq40<c9p> a;
            public final /* synthetic */ v5b b;
            public final /* synthetic */ b77<T, R> c;
            public final /* synthetic */ myh<R> d;

            /* JADX INFO: renamed from: b77$a$a$a, reason: collision with other inner class name */
            @c0d(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {30}, m = "invokeSuspend")
            public static final class C0113a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ b77<T, R> b;
                public final /* synthetic */ myh<R> c;
                public final /* synthetic */ T d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0113a(b77<T, R> b77Var, myh<? super R> myhVar, T t, v1b<? super C0113a> v1bVar) {
                    super(2, v1bVar);
                    this.b = b77Var;
                    this.c = myhVar;
                    this.d = t;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C0113a(this.b, this.c, this.d, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((C0113a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to b77$a$a$a for r3v3 'this'  java.lang.Object
                    	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                    	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                    	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                    	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                    	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                    */
                @Override // defpackage.pz1
                public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                    /*
                        r3 = this;
                        y5b r0 = defpackage.y5b.a
                        int r1 = r3.a
                        r2 = 1
                        if (r1 == 0) goto L14
                        if (r1 != r2) goto Ld
                        defpackage.uj50.b(r4)
                        goto L28
                    Ld:
                        java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
                        defpackage.ib5.a(r3)
                        r3 = 0
                        return r3
                    L14:
                        defpackage.uj50.b(r4)
                        b77<T, R> r4 = r3.b
                        gaj<myh<? super R>, T, v1b<? super kotlin.Unit>, java.lang.Object> r4 = r4.e
                        r3.a = r2
                        myh<R> r1 = r3.c
                        T r2 = r3.d
                        java.lang.Object r3 = r4.invoke(r1, r2, r3)
                        if (r3 != r0) goto L28
                        return r0
                    L28:
                        kotlin.Unit r3 = kotlin.Unit.a
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: b77.a.C0112a.C0113a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX INFO: renamed from: b77$a$a$b */
            @c0d(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {RuntimeVersion.MINOR}, m = "emit")
            public static final class b extends x1b {
                public C0112a a;
                public Object b;
                public c9p c;
                public /* synthetic */ Object d;
                public final /* synthetic */ C0112a<T> e;
                public int f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C0112a<? super T> c0112a, v1b<? super b> v1bVar) {
                    super(v1bVar);
                    this.e = c0112a;
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.d = obj;
                    this.f |= Integer.MIN_VALUE;
                    return this.e.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0112a(dq40<c9p> dq40Var, v5b v5bVar, b77<T, R> b77Var, myh<? super R> myhVar) {
                this.a = dq40Var;
                this.b = v5bVar;
                this.c = b77Var;
                this.d = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                b bVar;
                if (v1bVar instanceof b) {
                    bVar = (b) v1bVar;
                    int i = bVar.f;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        bVar.f = i - Integer.MIN_VALUE;
                    } else {
                        bVar = new b(this, v1bVar);
                    }
                } else {
                    bVar = new b(this, v1bVar);
                }
                Object obj = bVar.d;
                y5b y5bVar = y5b.a;
                int i2 = bVar.f;
                if (i2 == 0) {
                    uj50.b(obj);
                    c9p c9pVar = this.a.a;
                    if (c9pVar != null) {
                        c9pVar.cancel((CancellationException) new xj7("Child of the scoped flow was cancelled"));
                        bVar.a = this;
                        bVar.b = t;
                        bVar.c = c9pVar;
                        bVar.f = 1;
                        if (c9pVar.join(bVar) == y5bVar) {
                            return y5bVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t = (T) bVar.b;
                    this = bVar.a;
                    uj50.b(obj);
                }
                this.a.a = (T) ej5.c(this.b, null, a6b.d, new C0113a(this.c, this.d, t, null), 1);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(b77<T, R> b77Var, myh<? super R> myhVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = b77Var;
            this.d = myhVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, this.d, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to b77$a for r7v3 'this'  v1b
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r7.a
                r2 = 1
                if (r1 == 0) goto L14
                if (r1 != r2) goto Ld
                defpackage.uj50.b(r8)
                goto L34
            Ld:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                r7 = 0
                return r7
            L14:
                defpackage.uj50.b(r8)
                java.lang.Object r8 = r7.b
                v5b r8 = (defpackage.v5b) r8
                dq40 r1 = new dq40
                r1.<init>()
                b77<T, R> r3 = r7.c
                lyh<S> r4 = r3.d
                b77$a$a r5 = new b77$a$a
                myh<R> r6 = r7.d
                r5.<init>(r1, r8, r3, r6)
                r7.a = r2
                java.lang.Object r7 = r4.collect(r5, r7)
                if (r7 != r0) goto L34
                return r0
            L34:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: b77.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b77(gaj<? super myh<? super R>, ? super T, ? super v1b<? super Unit>, ? extends Object> gajVar, lyh<? extends T> lyhVar, CoroutineContext coroutineContext, int i, pb5 pb5Var) {
        super(i, pb5Var, lyhVar, coroutineContext);
        this.e = gajVar;
    }

    @Override // defpackage.u67
    public final u67<R> i(CoroutineContext coroutineContext, int i, pb5 pb5Var) {
        return new b77(this.e, this.d, coroutineContext, i, pb5Var);
    }

    @Override // defpackage.z67
    public final Object l(myh<? super R> myhVar, v1b<? super Unit> v1bVar) {
        Object objD = w5b.d(new a(this, myhVar, null), v1bVar);
        return objD == y5b.a ? objD : Unit.a;
    }
}
