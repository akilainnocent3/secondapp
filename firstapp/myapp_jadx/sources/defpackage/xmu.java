package defpackage;

import com.sporty.android.core.model.pocket.common.AssetData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xmu {
    public final sr10 a;
    public v340 b;
    public v340 c;
    public wwd0 d;
    public ku90 e;
    public vtw<com.sporty.android.common.uievent.a> f;
    public y300.a g;
    public et7 h;
    public final wwd0 i;
    public final wwd0 j;
    public final wwd0 k;
    public final mpe0 l;
    public final vmu m;

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.ManageAccountUiManagerImpl$manageAccountReducer$1$2", f = "ManageAccountUiManager.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<tzs, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ xmu b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, xmu xmuVar) {
            super(2, v1bVar);
            this.b = xmuVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(v1bVar, this.b);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(tzs tzsVar, v1b<? super Unit> v1bVar) {
            return ((a) create(tzsVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            tzs tzsVar = (tzs) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wwd0 wwd0Var = this.b.j;
            do {
                value = wwd0Var.getValue();
                ((enu) value).getClass();
                tzsVar.getClass();
            } while (!wwd0Var.g(value, new enu(tzsVar)));
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.ManageAccountUiManagerImpl$manageAccountReducer$1$3", f = "ManageAccountUiManager.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<List<? extends aoe0.b>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ xmu b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, xmu xmuVar) {
            super(2, v1bVar);
            this.b = xmuVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(v1bVar, this.b);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(List<? extends aoe0.b> list, v1b<? super Unit> v1bVar) {
            return ((b) create(list, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.b.k.setValue(list);
            return Unit.a;
        }
    }

    public static final class c implements lyh<Unit> {
        public final /* synthetic */ lyh[] a;
        public final /* synthetic */ xmu b;

        @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.ManageAccountUiManagerImpl$manageAccountReducer$lambda$0$$inlined$combine$1", f = "ManageAccountUiManager.kt", l = {109}, m = "collect", v = 2)
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
                return c.this.collect(null, this);
            }
        }

        public static final class b implements Function0<Object[]> {
            public final /* synthetic */ lyh[] a;

            public b(lyh[] lyhVarArr) {
                this.a = lyhVarArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object[] invoke() {
                return new Object[this.a.length];
            }
        }

        /* JADX INFO: renamed from: xmu$c$c, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.ManageAccountUiManagerImpl$manageAccountReducer$lambda$0$$inlined$combine$1$3", f = "ManageAccountUiManager.kt", l = {234}, m = "invokeSuspend", v = 2)
        public static final class C1300c extends tje0 implements gaj<myh<? super Unit>, Object[], v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ myh b;
            public /* synthetic */ Object[] c;
            public final /* synthetic */ xmu d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1300c(v1b v1bVar, xmu xmuVar) {
                super(3, v1bVar);
                this.d = xmuVar;
            }

            @Override // defpackage.gaj
            public final Object invoke(myh<? super Unit> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
                C1300c c1300c = new C1300c(v1bVar, this.d);
                c1300c.b = myhVar;
                c1300c.c = objArr;
                return c1300c.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                Object value;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    myh myhVar = this.b;
                    Object[] objArr = this.c;
                    Object obj2 = objArr[0];
                    obj2.getClass();
                    List list = (List) obj2;
                    Object obj3 = objArr[1];
                    obj3.getClass();
                    boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                    wwd0 wwd0Var = this.d.i;
                    do {
                        value = wwd0Var.getValue();
                        ((dnu) value).getClass();
                    } while (!wwd0Var.g(value, new dnu(list, zBooleanValue)));
                    Unit unit = Unit.a;
                    this.b = null;
                    this.c = null;
                    this.a = 1;
                    if (myhVar.emit(unit, this) == y5bVar) {
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

        public c(lyh[] lyhVarArr, xmu xmuVar) {
            this.a = lyhVarArr;
            this.b = xmuVar;
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
                lyh[] lyhVarArr = this.a;
                b bVar = new b(lyhVarArr);
                C1300c c1300c = new C1300c(null, this.b);
                aVar.b = 1;
                if (r78.a(aVar, myhVar, c1300c, bVar, lyhVarArr) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.ManageAccountUiManagerImpl$savedAssetsLimitStateFlow$2$1", f = "ManageAccountUiManager.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements gaj<List<? extends AssetData.AccountsBean>, ut60, v1b<? super Boolean>, Object> {
        public /* synthetic */ List a;
        public /* synthetic */ ut60 b;
        public final /* synthetic */ xmu c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(v1b v1bVar, xmu xmuVar) {
            super(3, v1bVar);
            this.c = xmuVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(List<? extends AssetData.AccountsBean> list, ut60 ut60Var, v1b<? super Boolean> v1bVar) {
            d dVar = new d(v1bVar, this.c);
            dVar.a = list;
            dVar.b = ut60Var;
            return dVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List list = this.a;
            Object obj2 = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            y300.a aVar = this.c.g;
            if (aVar == null) {
                Intrinsics.n("payMethod");
                throw null;
            }
            if (!aVar.p()) {
                obj2 = ut60.b.a;
            }
            return Boolean.valueOf((obj2 instanceof ut60.a) && list.size() >= ((ut60.a) obj2).a);
        }
    }

    public xmu(final d100 d100Var, sr10 sr10Var) {
        sr10Var.getClass();
        d100Var.getClass();
        this.a = sr10Var;
        this.i = xwd0.a(new dnu(0));
        this.j = xwd0.a(new enu(0));
        this.k = xwd0.a(m2g.a);
        this.l = hwr.b(new Function0() { // from class: umu
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                xmu xmuVar = this.a;
                v340 v340Var = xmuVar.b;
                if (v340Var == null) {
                    Intrinsics.n("savedAssetsStateFlow");
                    throw null;
                }
                n1i n1iVar = new n1i(bm50.f(v340Var), bm50.f(d100Var.G()), new xmu.d(null, xmuVar));
                et7 et7Var = xmuVar.h;
                if (et7Var != null) {
                    return e1i.e(n1iVar, et7Var, q490.a.b, Boolean.FALSE);
                }
                Intrinsics.n("scope");
                throw null;
            }
        });
        this.m = new vmu(this);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0207 A[Catch: all -> 0x0226, TryCatch #3 {all -> 0x0226, blocks: (B:96:0x01fd, B:98:0x0203, B:100:0x0207, B:103:0x0229, B:104:0x022c, B:105:0x022d, B:106:0x0231), top: B:154:0x01fd }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0229 A[Catch: all -> 0x0226, TryCatch #3 {all -> 0x0226, blocks: (B:96:0x01fd, B:98:0x0203, B:100:0x0207, B:103:0x0229, B:104:0x022c, B:105:0x022d, B:106:0x0231), top: B:154:0x01fd }] */
    /* JADX WARN: Code duplicated, block: B:105:0x022d A[Catch: all -> 0x0226, TryCatch #3 {all -> 0x0226, blocks: (B:96:0x01fd, B:98:0x0203, B:100:0x0207, B:103:0x0229, B:104:0x022c, B:105:0x022d, B:106:0x0231), top: B:154:0x01fd }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0247  */
    /* JADX WARN: Code duplicated, block: B:116:0x0250  */
    /* JADX WARN: Code duplicated, block: B:117:0x026b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0271  */
    /* JADX WARN: Code duplicated, block: B:122:0x0275  */
    /* JADX WARN: Code duplicated, block: B:125:0x0285  */
    /* JADX WARN: Code duplicated, block: B:127:0x0288  */
    /* JADX WARN: Code duplicated, block: B:128:0x0291  */
    /* JADX WARN: Code duplicated, block: B:132:0x029b A[LOOP:0: B:132:0x029b->B:158:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:136:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:98:0x0203 A[Catch: all -> 0x0226, TryCatch #3 {all -> 0x0226, blocks: (B:96:0x01fd, B:98:0x0203, B:100:0x0207, B:103:0x0229, B:104:0x022c, B:105:0x022d, B:106:0x0231), top: B:154:0x01fd }] */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0195, code lost:
    
        if (b(r12) == r3) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, wwd0] */
    /* JADX WARN: Type inference failed for: r2v24, types: [com.sporty.android.core.model.pocket.common.AssetData$AccountsBean] */
    /* JADX WARN: Type inference failed for: r2v25, types: [com.sporty.android.core.model.pocket.common.AssetData$AccountsBean] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v15 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r28, boolean r29, defpackage.x1b r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xmu.a(java.lang.Object, boolean, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010b, code lost:
    
        r0 = r11;
        r11 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.x1b r11) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xmu.b(x1b):java.lang.Object");
    }

    public final Object c(int i, int i2, tje0 tje0Var) {
        wwd0 wwd0Var = this.k;
        List list = (List) wwd0Var.getValue();
        if (i < 0 || i >= list.size() || i2 < 0 || i2 >= list.size()) {
            return v600.a.a;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(i2, (aoe0.b) arrayList.remove(i));
        wwd0Var.getClass();
        Object obj = null;
        wwd0Var.k(null, arrayList);
        for (Object obj2 : (List) wwd0Var.getValue()) {
            if (!((aoe0.b) obj2).i) {
                obj = obj2;
                break;
            }
        }
        aoe0.b bVar = (aoe0.b) obj;
        return (bVar == null || bVar.h) ? v600.a.a : b(tje0Var);
    }
}
