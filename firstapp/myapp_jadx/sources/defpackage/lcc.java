package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class lcc implements lyh<f8c> {
    public final /* synthetic */ yzh a;
    public final /* synthetic */ bdc b;
    public final /* synthetic */ f8c.b c;

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$confirmEditCode$$inlined$map$1", f = "CustomCodeViewModel.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return lcc.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ bdc b;
        public final /* synthetic */ f8c.b c;

        @c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$confirmEditCode$$inlined$map$1$2", f = "CustomCodeViewModel.kt", l = {50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(myh myhVar, bdc bdcVar, f8c.b bVar) {
            this.a = myhVar;
            this.b = bdcVar;
            this.c = bVar;
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
            a aVar;
            f8c f8cVarA;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj2 = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj2);
                lk50 lk50Var = (lk50) obj;
                boolean z = lk50Var instanceof lk50.c;
                bdc bdcVar = this.b;
                if (z) {
                    bdcVar.I.a(h8c.b.a);
                    bdcVar.y1(true);
                    f8cVarA = f8c.a.a;
                } else {
                    boolean z2 = lk50Var instanceof lk50.a;
                    f8c.b bVar = this.c;
                    if (z2) {
                        lk50.a aVar2 = (lk50.a) lk50Var;
                        Throwable th = aVar2.a;
                        if ((th instanceof SprThrowable) && ((SprThrowable) th).getD() == 11011) {
                            f8cVarA = f8c.b.a(bVar, false, true, 7);
                        } else {
                            wuw<h8c> wuwVar = bdcVar.I;
                            h8c.c cVar = new h8c.c(th, aVar2.b);
                            wuwVar.getClass();
                            wuwVar.a.c(cVar);
                            f8cVarA = f8c.a.a;
                        }
                    } else {
                        if (!(lk50Var instanceof lk50.b)) {
                            uhc.a();
                            return null;
                        }
                        f8cVarA = f8c.b.a(bVar, true, false, 23);
                    }
                }
                aVar.b = 1;
                if (this.a.emit(f8cVarA, aVar) == y5bVar) {
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

    public lcc(yzh yzhVar, bdc bdcVar, f8c.b bVar) {
        this.a = yzhVar;
        this.b = bdcVar;
        this.c = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super f8c> myhVar, v1b v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            b bVar = new b(myhVar, this.b, this.c);
            aVar.b = 1;
            if (this.a.collect(bVar, aVar) == y5bVar) {
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
