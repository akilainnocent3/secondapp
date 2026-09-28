package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class jte<T> implements lyh<T> {
    public final lyh<T> a;
    public final Function1<T, Object> b;
    public final Function2<Object, Object, Boolean> c;

    public static final class a<T> implements myh {
        public final /* synthetic */ jte<T> a;
        public final /* synthetic */ dq40<Object> b;
        public final /* synthetic */ myh<T> c;

        /* JADX INFO: renamed from: jte$a$a, reason: collision with other inner class name */
        @c0d(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {73}, m = "emit")
        public static final class C0738a extends x1b {
            public /* synthetic */ Object a;
            public final /* synthetic */ a<T> b;
            public int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0738a(a<? super T> aVar, v1b<? super C0738a> v1bVar) {
                super(v1bVar);
                this.b = aVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.c |= Integer.MIN_VALUE;
                return this.b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(jte<T> jteVar, dq40<Object> dq40Var, myh<? super T> myhVar) {
            this.a = jteVar;
            this.b = dq40Var;
            this.c = myhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
        public final Object emit(T t, v1b<? super Unit> v1bVar) {
            C0738a c0738a;
            if (v1bVar instanceof C0738a) {
                c0738a = (C0738a) v1bVar;
                int i = c0738a.c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0738a.c = i - Integer.MIN_VALUE;
                } else {
                    c0738a = new C0738a(this, v1bVar);
                }
            } else {
                c0738a = new C0738a(this, v1bVar);
            }
            Object obj = c0738a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0738a.c;
            if (i2 == 0) {
                uj50.b(obj);
                jte<T> jteVar = this.a;
                T t2 = (T) jteVar.b.invoke(t);
                dq40<Object> dq40Var = this.b;
                Object obj2 = dq40Var.a;
                if (obj2 != k5y.a && jteVar.c.invoke(obj2, t2).booleanValue()) {
                    return Unit.a;
                }
                dq40Var.a = t2;
                c0738a.c = 1;
                if (this.c.emit(t, c0738a) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jte(lyh<? extends T> lyhVar, Function1<? super T, ? extends Object> function1, Function2<Object, Object, Boolean> function2) {
        this.a = lyhVar;
        this.b = function1;
        this.c = function2;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super T> myhVar, v1b<? super Unit> v1bVar) {
        dq40 dq40Var = new dq40();
        dq40Var.a = (T) k5y.a;
        Object objCollect = this.a.collect(new a(this, dq40Var, myhVar), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
