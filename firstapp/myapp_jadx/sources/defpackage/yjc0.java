package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class yjc0 implements lyh<List<? extends hh2>> {
    public final /* synthetic */ wwd0 a;

    @c0d(c = "com.sportybet.android.instantwin.presentation.legends.handler.SportyLegendsSessionDataHandlerImpl$special$$inlined$map$2", f = "SportyLegendsSessionDataHandlerImpl.kt", l = {109}, m = "collect", v = 2)
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
            return yjc0.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;

        @c0d(c = "com.sportybet.android.instantwin.presentation.legends.handler.SportyLegendsSessionDataHandlerImpl$special$$inlined$map$2$2", f = "SportyLegendsSessionDataHandlerImpl.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar) {
            this.a = myhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [myh] */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v3, types: [m2g] */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r6v5 */
        /* JADX WARN: Type inference failed for: r6v6 */
        /* JADX WARN: Type inference failed for: r6v7 */
        /* JADX WARN: Type inference failed for: r6v8 */
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
            hcc0 hcc0Var;
            List<icc0> list;
            icc0 icc0Var;
            List<sdc0> list2;
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
            ?? arrayList = 0;
            arrayList = 0;
            arrayList = 0;
            arrayList = 0;
            arrayList = 0;
            if (i2 == 0) {
                uj50.b(obj2);
                bkc0 bkc0Var = (bkc0) obj;
                bkc0.c cVar = bkc0Var instanceof bkc0.c ? (bkc0.c) bkc0Var : null;
                if (cVar != null && (hcc0Var = cVar.a.c) != null && (list = hcc0Var.b) != null && (icc0Var = (icc0) CollectionsKt.firstOrNull(list)) != null && (list2 = icc0Var.d) != null) {
                    int i3 = 10;
                    arrayList = new ArrayList(l48.r(list2, 10));
                    for (sdc0 sdc0Var : list2) {
                        String str = sdc0Var.a;
                        List<gfc0> list3 = sdc0Var.i;
                        ArrayList arrayList2 = new ArrayList(l48.r(list3, i3));
                        for (gfc0 gfc0Var : list3) {
                            String str2 = sdc0Var.a;
                            String str3 = gfc0Var.a;
                            String str4 = gfc0Var.d;
                            String str5 = gfc0Var.c;
                            String string = gfc0Var.b.toString();
                            string.getClass();
                            arrayList2.add(new ih2(str2, str3, str4, str5, string, gfc0Var.e));
                        }
                        arrayList.add(new hh2(str, arrayList2));
                        i3 = 10;
                    }
                }
                if (arrayList == 0) {
                    arrayList = m2g.a;
                }
                aVar.b = 1;
                if (this.a.emit(arrayList, aVar) == y5bVar) {
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

    public yjc0(wwd0 wwd0Var) {
        this.a = wwd0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super List<? extends hh2>> myhVar, v1b v1bVar) throws Throwable {
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
        if (i2 != 0) {
            if (i2 == 1) {
                uj50.b(obj);
                return Unit.a;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        b bVar = new b(myhVar);
        aVar.b = 1;
        this.a.collect(bVar, aVar);
        return y5bVar;
    }
}
