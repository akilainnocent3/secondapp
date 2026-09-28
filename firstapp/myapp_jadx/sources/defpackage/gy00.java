package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PiggyBashViewModel$onGameplayShown$1", f = "PiggyBashViewModel.kt", l = {591}, m = "invokeSuspend", v = 1)
public final class gy00 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ vx00 b;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a<T> implements myh {
        public final /* synthetic */ vx00 a;

        /* JADX INFO: renamed from: gy00$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes7.dex */
        @c0d(c = "com.sportygames.piggybash.presentation.viewmodel.PiggyBashViewModel$onGameplayShown$1$1", f = "PiggyBashViewModel.kt", l = {596, 602, 603}, m = "emit", v = 1)
        public static final class C0617a extends x1b {
            public lpj.b a;
            public /* synthetic */ Object b;
            public final /* synthetic */ a<T> c;
            public int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0617a(a<? super T> aVar, v1b<? super C0617a> v1bVar) {
                super(v1bVar);
                this.c = aVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.b = obj;
                this.d |= Integer.MIN_VALUE;
                return this.c.emit(null, this);
            }
        }

        public a(vx00 vx00Var) {
            this.a = vx00Var;
        }

        /* JADX WARN: Code duplicated, block: B:115:0x027a  */
        /* JADX WARN: Code duplicated, block: B:116:0x028b  */
        /* JADX WARN: Code duplicated, block: B:118:0x028f  */
        /* JADX WARN: Code duplicated, block: B:119:0x029a  */
        /* JADX WARN: Code duplicated, block: B:121:0x029e  */
        /* JADX WARN: Code duplicated, block: B:124:0x02b5 A[LOOP:0: B:122:0x02af->B:124:0x02b5, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:126:0x02cd  */
        /* JADX WARN: Code duplicated, block: B:128:0x02d1  */
        /* JADX WARN: Code duplicated, block: B:129:0x02e1  */
        /* JADX WARN: Code duplicated, block: B:131:0x02e5  */
        /* JADX WARN: Code duplicated, block: B:132:0x0300  */
        /* JADX WARN: Code duplicated, block: B:134:0x0304  */
        /* JADX WARN: Code duplicated, block: B:135:0x0310  */
        /* JADX WARN: Code duplicated, block: B:137:0x0313  */
        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX WARN: Code duplicated, block: B:96:0x0230  */
        /* JADX WARN: Code restructure failed: missing block: B:138:0x031d, code lost:
        
            if (r0.emit(r2, r3) == r4) goto L139;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x01c5, code lost:
        
            if (kotlin.Unit.a == r4) goto L139;
         */
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
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(defpackage.lpj r21, defpackage.v1b<? super kotlin.Unit> r22) {
            /*
                Method dump skipped, instruction units count: 807
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: gy00.a.emit(lpj, v1b):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy00(vx00 vx00Var, v1b<? super gy00> v1bVar) {
        super(2, v1bVar);
        this.b = vx00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gy00(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gy00) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            vx00 vx00Var = this.b;
            e77 e77VarG = vx00Var.z.g();
            a aVar = new a(vx00Var);
            this.a = 1;
            if (e77VarG.collect(aVar, this) == y5bVar) {
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
