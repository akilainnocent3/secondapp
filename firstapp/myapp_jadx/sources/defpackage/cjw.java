package defpackage;

import com.sportybet.android.multimaker.data.dto.MultiMakerLeagueOptionDto;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class cjw implements lyh<Unit> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ tjw b;

    @c0d(c = "com.sportybet.android.multimaker.presentation.viewmodel.MultiMakerViewModel$registerDataStates$$inlined$combine$1", f = "MultiMakerViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return cjw.this.collect(null, this);
        }
    }

    public static final class b implements Function0<Object[]> {
        public final /* synthetic */ lyh[] a;

        public b(lyh[] lyhVarArr) {
            this.a = lyhVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object[] invoke() {
            return new Object[6];
        }
    }

    @c0d(c = "com.sportybet.android.multimaker.presentation.viewmodel.MultiMakerViewModel$registerDataStates$$inlined$combine$1$3", f = "MultiMakerViewModel.kt", l = {234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super Unit>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ tjw d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, tjw tjwVar) {
            super(3, v1bVar);
            this.d = tjwVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super Unit> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:110:0x0183 A[EDGE_INSN: B:110:0x0183->B:84:0x0183 BREAK  A[LOOP:4: B:61:0x00e7->B:89:0x0196], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x0196 A[LOOP:4: B:61:0x00e7->B:89:0x0196, LOOP_END] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0 */
        /* JADX WARN: Type inference failed for: r10v1 */
        /* JADX WARN: Type inference failed for: r10v11, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r10v18 */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5 */
        /* JADX WARN: Type inference failed for: r10v6 */
        /* JADX WARN: Type inference failed for: r10v8 */
        /* JADX WARN: Type inference failed for: r10v9 */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r11v10 */
        /* JADX WARN: Type inference failed for: r11v11 */
        /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v3 */
        /* JADX WARN: Type inference failed for: r11v4, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r11v5 */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        /* JADX WARN: Type inference failed for: r11v9 */
        /* JADX WARN: Type inference failed for: r12v3 */
        /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object, java.util.List] */
        /* JADX WARN: Type inference failed for: r12v6 */
        /* JADX WARN: Type inference failed for: r12v8 */
        /* JADX WARN: Type inference failed for: r13v11, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.List] */
        /* JADX WARN: Type inference failed for: r15v5 */
        /* JADX WARN: Type inference failed for: r15v6 */
        /* JADX WARN: Type inference failed for: r15v8 */
        /* JADX WARN: Type inference failed for: r7v1, types: [m2g] */
        /* JADX WARN: Type inference failed for: r7v10, types: [m2g] */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v16, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r7v17, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r7v18, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r7v19, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference failed for: r7v4, types: [m2g] */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v7, types: [m2g] */
        /* JADX WARN: Type inference failed for: r7v8 */
        /* JADX WARN: Type inference failed for: r9v0 */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v13 */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v5 */
        /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List] */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ?? arrayList;
            ?? arrayList2;
            ?? arrayList3;
            ?? arrayList4;
            ArrayList arrayListJ0;
            ?? r12;
            ?? r15;
            ?? r10;
            ?? r11;
            ?? r9;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                Object[] objArr = this.c;
                Object obj2 = objArr[0];
                obj2.getClass();
                String str = (String) obj2;
                Object obj3 = objArr[1];
                List list = obj3 instanceof List ? (List) obj3 : null;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj4 : list) {
                        if (obj4 instanceof MultiMakerLeagueOptionDto) {
                            arrayList.add(obj4);
                        }
                    }
                } else {
                    arrayList = m2g.a;
                }
                ?? r13 = arrayList;
                Object obj5 = objArr[2];
                List list2 = obj5 instanceof List ? (List) obj5 : null;
                if (list2 != null) {
                    arrayList2 = new ArrayList();
                    for (Object obj6 : list2) {
                        if (obj6 instanceof String) {
                            arrayList2.add(obj6);
                        }
                    }
                } else {
                    arrayList2 = m2g.a;
                }
                ?? r14 = arrayList2;
                Object obj7 = objArr[3];
                List list3 = obj7 instanceof List ? (List) obj7 : null;
                if (list3 != null) {
                    arrayList3 = new ArrayList();
                    for (Object obj8 : list3) {
                        if (obj8 instanceof RegularMarketRule) {
                            arrayList3.add(obj8);
                        }
                    }
                } else {
                    arrayList3 = m2g.a;
                }
                ?? r16 = arrayList3;
                Object obj9 = objArr[4];
                List list4 = obj9 instanceof List ? (List) obj9 : null;
                if (list4 != null) {
                    arrayList4 = new ArrayList();
                    for (Object obj10 : list4) {
                        if (obj10 instanceof String) {
                            arrayList4.add(obj10);
                        }
                    }
                } else {
                    arrayList4 = m2g.a;
                }
                ?? r17 = arrayList4;
                Object obj11 = objArr[5];
                obj11.getClass();
                xvf0 xvf0Var = (xvf0) obj11;
                wwd0 wwd0Var = this.d.c0;
                while (true) {
                    Object value = wwd0Var.getValue();
                    List<shw> list5 = (List) value;
                    if (list5 == null || !list5.isEmpty()) {
                        Iterator it = list5.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((shw) it.next()).a.equals(str)) {
                                    ArrayList arrayList5 = new ArrayList(l48.r(list5, 10));
                                    ?? r18 = r16;
                                    ?? r19 = r17;
                                    ?? r110 = r13;
                                    for (shw shwVar : list5) {
                                        if (shwVar.a.equals(str)) {
                                            ?? r111 = r19;
                                            String str2 = shwVar.a;
                                            r18.getClass();
                                            r111.getClass();
                                            r110.getClass();
                                            r14.getClass();
                                            ?? r112 = r110;
                                            ?? r113 = r18;
                                            shw shwVar2 = new shw(str2, r113, r111, r112, r14, xvf0Var);
                                            r10 = r113;
                                            r110 = r112;
                                            r15 = r111;
                                            shwVar = shwVar2;
                                        } else {
                                            r15 = r19;
                                            r10 = r18;
                                        }
                                        arrayList5.add(shwVar);
                                        arrayList5 = arrayList5;
                                        r18 = r10;
                                        r19 = r15;
                                        xvf0Var = xvf0Var;
                                        r110 = r110;
                                    }
                                    arrayListJ0 = arrayList5;
                                    r12 = r19;
                                    r9 = r18;
                                    r11 = r110;
                                    break;
                                }
                            }
                        }
                        if (wwd0Var.g(value, arrayListJ0)) {
                            break;
                        }
                        r17 = r12;
                        r16 = r9;
                        r13 = r11;
                    }
                    ?? r20 = r16;
                    ?? r114 = r17;
                    xvf0 xvf0Var2 = xvf0Var;
                    xvf0Var = xvf0Var2;
                    r12 = r114;
                    arrayListJ0 = CollectionsKt.j0(list5, new shw(str, r20, r114, r13, r14, xvf0Var2));
                    r9 = r20;
                    r11 = r13;
                    if (wwd0Var.g(value, arrayListJ0)) {
                        break;
                        break;
                    }
                    r17 = r12;
                    r16 = r9;
                    r13 = r11;
                }
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

    public cjw(lyh[] lyhVarArr, tjw tjwVar) {
        this.a = lyhVarArr;
        this.b = tjwVar;
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
            c cVar = new c(null, this.b);
            aVar.b = 1;
            if (r78.a(aVar, myhVar, cVar, bVar, lyhVarArr) == y5bVar) {
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
