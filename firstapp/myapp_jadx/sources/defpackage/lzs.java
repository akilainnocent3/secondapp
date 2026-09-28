package defpackage;

import java.util.Collection;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class lzs implements lyh<Float> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ dq40 b;
    public final /* synthetic */ bq40 c;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ dq40 b;
        public final /* synthetic */ bq40 c;

        /* JADX INFO: renamed from: lzs$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.common.framework.loading.LoadingTaskKt$loadingFlow$$inlined$map$1$2", f = "LoadingTask.kt", l = {50}, m = "emit", v = 1)
        public static final class C0844a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0844a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(myh myhVar, dq40 dq40Var, bq40 bq40Var) {
            this.a = myhVar;
            this.b = dq40Var;
            this.c = bq40Var;
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
            C0844a c0844a;
            Object bVar;
            Collection<xxs> collectionValues;
            if (v1bVar instanceof C0844a) {
                c0844a = (C0844a) v1bVar;
                int i = c0844a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0844a.b = i - Integer.MIN_VALUE;
                } else {
                    c0844a = new C0844a(v1bVar);
                }
            } else {
                c0844a = new C0844a(v1bVar);
            }
            Object obj2 = c0844a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0844a.b;
            if (i2 == 0) {
                uj50.b(obj2);
                Map map = (Map) this.b.a;
                int i3 = 0;
                if (map != null && (collectionValues = map.values()) != null) {
                    int i4 = 0;
                    for (xxs xxsVar : collectionValues) {
                        i4 += xxsVar != null ? xxsVar.a : 0;
                    }
                    i3 = i4;
                }
                try {
                    zi50.a aVar = zi50.b;
                    bVar = new Float(i3 / this.c.a);
                } catch (Throwable th) {
                    zi50.a aVar2 = zi50.b;
                    bVar = new zi50.b(th);
                }
                Object f = new Float(0.0f);
                if (bVar instanceof zi50.b) {
                    bVar = f;
                }
                c0844a.b = 1;
                if (this.a.emit(bVar, c0844a) == y5bVar) {
                    return y5bVar;
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

    public lzs(lyh lyhVar, dq40 dq40Var, bq40 bq40Var) {
        this.a = lyhVar;
        this.b = dq40Var;
        this.c = bq40Var;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super Float> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar, this.b, this.c), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
