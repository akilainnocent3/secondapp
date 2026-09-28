package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class zp30 implements lyh<v37<Object>> {
    public final /* synthetic */ h1i a;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;

        /* JADX INFO: renamed from: zp30$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.refscall.presentation.ui.RCPointerViewKt$directionChanges$$inlined$mapNotNull$1$2", f = "RCPointerView.kt", l = {52}, m = "emit", v = 1)
        public static final class C1408a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1408a(v1b v1bVar) {
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
        /* JADX WARN: Multi-variable type inference failed */
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
            C1408a c1408a;
            if (v1bVar instanceof C1408a) {
                c1408a = (C1408a) v1bVar;
                int i = c1408a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1408a.b = i - Integer.MIN_VALUE;
                } else {
                    c1408a = new C1408a(v1bVar);
                }
            } else {
                c1408a = new C1408a(v1bVar);
            }
            Object obj2 = c1408a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1408a.b;
            if (i2 == 0) {
                uj50.b(obj2);
                Object obj3 = ((u5) obj).c;
                if (obj3 != null) {
                    c1408a.b = 1;
                    if (this.a.emit(obj3, c1408a) == y5bVar) {
                        return y5bVar;
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

    public zp30(h1i h1iVar) {
        this.a = h1iVar;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super v37<Object>> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
