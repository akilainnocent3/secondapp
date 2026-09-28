package defpackage;

import android.content.Context;
import com.sportygames.common.business.CommonGameDetails;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class dq30 implements cq30 {
    public final kh8 a;
    public final Context b;
    public final k5b c;

    public static final class a implements lyh<iwg> {
        public final /* synthetic */ yzh a;

        /* JADX INFO: renamed from: dq30$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes8.dex */
        public static final class C0499a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: dq30$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.refscall.domain.usecase.RCRecommendUseCaseImpl$fetch$$inlined$map$1$2", f = "RCRecommendUseCaseImpl.kt", l = {50}, m = "emit", v = 1)
            public static final class C0500a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0500a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0499a.this.emit(null, this);
                }
            }

            public C0499a(myh myhVar) {
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
                C0500a c0500a;
                iwg bVar;
                if (v1bVar instanceof C0500a) {
                    c0500a = (C0500a) v1bVar;
                    int i = c0500a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0500a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0500a = new C0500a(v1bVar);
                    }
                } else {
                    c0500a = new C0500a(v1bVar);
                }
                Object obj2 = c0500a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0500a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    mk50 mk50Var = (mk50) obj;
                    if (Intrinsics.g(mk50Var, mk50.b.a)) {
                        bVar = iwg.a.a;
                    } else if (mk50Var instanceof mk50.a) {
                        bVar = new iwg.b(null);
                    } else {
                        if (!(mk50Var instanceof mk50.c)) {
                            uhc.a();
                            return null;
                        }
                        bVar = new iwg.b((List) ((mk50.c) mk50Var).a);
                    }
                    c0500a.b = 1;
                    if (this.a.emit(bVar, c0500a) == y5bVar) {
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

        public a(yzh yzhVar) {
            this.a = yzhVar;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super iwg> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new C0499a(myhVar), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    @c0d(c = "com.sportygames.refscall.domain.usecase.RCRecommendUseCaseImpl$fetch$1", f = "RCRecommendUseCaseImpl.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<List<? extends CommonGameDetails>, v1b<? super lyh<? extends List<? extends CommonGameDetails>>>, Object> {
        public /* synthetic */ Object a;

        @c0d(c = "com.sportygames.refscall.domain.usecase.RCRecommendUseCaseImpl$fetch$1$1", f = "RCRecommendUseCaseImpl.kt", l = {38, 40}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<myh<? super List<? extends CommonGameDetails>>, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ List<CommonGameDetails> c;
            public final /* synthetic */ dq30 d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<CommonGameDetails> list, dq30 dq30Var, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.c = list;
                this.d = dq30Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.c, this.d, v1bVar);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(myh<? super List<? extends CommonGameDetails>> myhVar, v1b<? super Unit> v1bVar) {
                return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
            
                if (r8 == r1) goto L17;
             */
            @Override // defpackage.pz1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = r7.b
                    myh r0 = (defpackage.myh) r0
                    y5b r1 = defpackage.y5b.a
                    int r2 = r7.a
                    java.util.List<com.sportygames.common.business.CommonGameDetails> r3 = r7.c
                    r4 = 2
                    r5 = 1
                    r6 = 0
                    if (r2 == 0) goto L21
                    if (r2 == r5) goto L1d
                    if (r2 != r4) goto L17
                    defpackage.uj50.b(r8)     // Catch: java.lang.Throwable -> L48
                    goto L43
                L17:
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r7)
                    return r6
                L1d:
                    defpackage.uj50.b(r8)
                    goto L2f
                L21:
                    defpackage.uj50.b(r8)
                    r7.b = r0
                    r7.a = r5
                    java.lang.Object r8 = r0.emit(r3, r7)
                    if (r8 != r1) goto L2f
                    goto L42
                L2f:
                    dq30 r8 = r7.d
                    zi50$a r0 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L48
                    r7.b = r6     // Catch: java.lang.Throwable -> L48
                    r7.a = r4     // Catch: java.lang.Throwable -> L48
                    eq30 r0 = new eq30     // Catch: java.lang.Throwable -> L48
                    r0.<init>(r3, r8, r6)     // Catch: java.lang.Throwable -> L48
                    java.lang.Object r8 = defpackage.w5b.d(r0, r7)     // Catch: java.lang.Throwable -> L48
                    if (r8 != r1) goto L43
                L42:
                    return r1
                L43:
                    java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L48
                    zi50$a r7 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L48
                    goto L4a
                L48:
                    zi50$a r7 = defpackage.zi50.b
                L4a:
                    kotlin.Unit r7 = kotlin.Unit.a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: dq30.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = dq30.this.new b(v1bVar);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends CommonGameDetails> list, v1b<? super lyh<? extends List<? extends CommonGameDetails>>> v1bVar) {
            return ((b) create(list, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new or60(new a(list, dq30.this, null));
        }
    }

    public dq30(kh8 kh8Var, Context context, k5b k5bVar) {
        kh8Var.getClass();
        context.getClass();
        k5bVar.getClass();
        this.a = kh8Var;
        this.b = context;
        this.c = k5bVar;
    }

    @Override // defpackage.cq30
    public final lyh<iwg> a(String str) {
        str.getClass();
        return ozh.c(new a(em50.a(r0i.a(this.a.a(str), new b(null)))), this.c);
    }
}
