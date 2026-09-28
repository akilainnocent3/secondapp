package defpackage;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class fua implements lyh<Object> {
    public final /* synthetic */ wwd0 a;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;

        /* JADX INFO: renamed from: fua$a$a, reason: collision with other inner class name */
        @c0d(c = "androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2", f = "ConflatedEventBus.kt", l = {225}, m = "emit")
        public static final class C0586a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0586a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(myh myhVar) {
            this.a = myhVar;
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
        public final Object emit(Object obj, v1b v1bVar) {
            C0586a c0586a;
            if (v1bVar instanceof C0586a) {
                c0586a = (C0586a) v1bVar;
                int i = c0586a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0586a.b = i - Integer.MIN_VALUE;
                } else {
                    c0586a = new C0586a(v1bVar);
                }
            } else {
                c0586a = new C0586a(v1bVar);
            }
            Object obj2 = c0586a.a;
            Object obj3 = y5b.a;
            int i2 = c0586a.b;
            if (i2 == 0) {
                uj50.b(obj2);
                B b = ((Pair) obj).b;
                if (b != 0) {
                    c0586a.b = 1;
                    if (this.a.emit(b, c0586a) == obj3) {
                        return obj3;
                    }
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj2);
            }
            return Unit.a;
        }
    }

    public fua(wwd0 wwd0Var) {
        this.a = wwd0Var;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super Object> myhVar, v1b v1bVar) throws Throwable {
        this.a.collect(new a(myhVar), v1bVar);
        return y5b.a;
    }
}
