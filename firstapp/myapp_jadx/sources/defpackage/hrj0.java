package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class hrj0 implements lyh<Unit> {
    public final /* synthetic */ yzh a;
    public final /* synthetic */ irj0 b;

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawVerifyNINViewModel$submitNIN$$inlined$handleApiUnitResult$default$1", f = "WithdrawVerifyNINViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return hrj0.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ irj0 b;

        @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawVerifyNINViewModel$submitNIN$$inlined$handleApiUnitResult$default$1$2", f = "WithdrawVerifyNINViewModel.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar, irj0 irj0Var) {
            this.a = myhVar;
            this.b = irj0Var;
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
            a aVar;
            Object value;
            Object objA;
            Object value2;
            Object value3;
            Object objA2;
            Object value4;
            Object value5;
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
                irj0 irj0Var = this.b;
                if (z) {
                    wwd0 wwd0Var = irj0Var.d;
                    do {
                        value5 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value5, crj0.d.a));
                } else if (lk50Var instanceof lk50.a) {
                    Throwable th = ((lk50.a) lk50Var).a;
                    if (th instanceof SprThrowable) {
                        SprThrowable sprThrowable = (SprThrowable) th;
                        if (sprThrowable.getD() == 12703 || sprThrowable.getD() == 12704) {
                            wwd0 wwd0Var2 = irj0Var.d;
                            do {
                                value3 = wwd0Var2.getValue();
                                objA2 = (crj0) value3;
                                crj0.b bVar = (crj0.b) (!(objA2 instanceof crj0.b) ? null : objA2);
                                if (bVar != null) {
                                    objA2 = crj0.b.a(bVar, uxs.DISABLE, sprThrowable.getE(), 2);
                                }
                            } while (!wwd0Var2.g(value3, objA2));
                        } else {
                            wwd0 wwd0Var3 = irj0Var.d;
                            do {
                                value4 = wwd0Var3.getValue();
                            } while (!wwd0Var3.g(value4, crj0.c.a));
                        }
                    } else {
                        wwd0 wwd0Var4 = irj0Var.d;
                        do {
                            value2 = wwd0Var4.getValue();
                        } while (!wwd0Var4.g(value2, crj0.a.a));
                    }
                } else {
                    if (!(lk50Var instanceof lk50.b)) {
                        uhc.a();
                        return null;
                    }
                    wwd0 wwd0Var5 = irj0Var.d;
                    do {
                        value = wwd0Var5.getValue();
                        objA = (crj0) value;
                        crj0.b bVar2 = (crj0.b) (!(objA instanceof crj0.b) ? null : objA);
                        if (bVar2 != null) {
                            objA = crj0.b.a(bVar2, uxs.LOADING, null, 10);
                        }
                    } while (!wwd0Var5.g(value, objA));
                }
                Unit unit = Unit.a;
                aVar.b = 1;
                if (this.a.emit(unit, aVar) == y5bVar) {
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

    public hrj0(yzh yzhVar, irj0 irj0Var) {
        this.a = yzhVar;
        this.b = irj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super Unit> myhVar, v1b v1bVar) {
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
            b bVar = new b(myhVar, this.b);
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
