package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.OrderBetType;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class ob1 implements lyh<Unit> {
    public final /* synthetic */ yzh a;
    public final /* synthetic */ fb1 b;
    public final /* synthetic */ twb.f c;

    @c0d(c = "com.sportybet.plugin.realsports.autobet.AutoBetViewModel$onRemoveAutoBet$$inlined$handleApiUnitResult$default$1", f = "AutoBetViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return ob1.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ fb1 b;
        public final /* synthetic */ twb.f c;

        @c0d(c = "com.sportybet.plugin.realsports.autobet.AutoBetViewModel$onRemoveAutoBet$$inlined$handleApiUnitResult$default$1$2", f = "AutoBetViewModel.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar, fb1 fb1Var, twb.f fVar) {
            this.a = myhVar;
            this.b = fb1Var;
            this.c = fVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
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
            twb fVar;
            Object value2;
            Object objA;
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
                fb1 fb1Var = this.b;
                if (z) {
                    fb1Var.B1();
                    fb1Var.X.setValue(t91.c.a);
                } else if (lk50Var instanceof lk50.a) {
                    Throwable th = ((lk50.a) lk50Var).a;
                    if (th instanceof SprThrowable) {
                        ej5.c(o8i0.d(fb1Var), null, null, new pb1(fb1Var, ((SprThrowable) th).getD(), null), 3);
                        wwd0 wwd0Var = fb1Var.V;
                        do {
                            value2 = wwd0Var.getValue();
                            objA = (twb) value2;
                            if (objA instanceof twb.a) {
                                objA = twb.a.a((twb.a) objA, null, null, null, null, false, false, false, null, uxs.ENABLE, 32767);
                            }
                        } while (!wwd0Var.g(value2, objA));
                    } else {
                        wwd0 wwd0Var2 = fb1Var.V;
                        twb.c cVar = new twb.c(this.c.a);
                        wwd0Var2.getClass();
                        wwd0Var2.k(null, cVar);
                    }
                } else {
                    if (!(lk50Var instanceof lk50.b)) {
                        uhc.a();
                        return null;
                    }
                    wwd0 wwd0Var3 = fb1Var.V;
                    do {
                        value = wwd0Var3.getValue();
                        fVar = (twb) value;
                        if (fVar instanceof twb.f) {
                            twb.f fVar2 = (twb.f) fVar;
                            uxs uxsVar = uxs.LOADING;
                            OrderBetType orderBetType = fVar2.a;
                            String str = fVar2.b;
                            UiText uiText = fVar2.c;
                            UiText uiText2 = fVar2.d;
                            UiText uiText3 = fVar2.e;
                            String str2 = fVar2.f;
                            String str3 = fVar2.g;
                            UiText uiText4 = fVar2.h;
                            orderBetType.getClass();
                            str.getClass();
                            uiText.getClass();
                            uiText2.getClass();
                            uiText3.getClass();
                            str3.getClass();
                            uiText4.getClass();
                            fVar = new twb.f(orderBetType, str, uiText, uiText2, uiText3, str2, str3, uiText4, uxsVar);
                        }
                    } while (!wwd0Var3.g(value, fVar));
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

    public ob1(yzh yzhVar, fb1 fb1Var, twb.f fVar) {
        this.a = yzhVar;
        this.b = fb1Var;
        this.c = fVar;
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
