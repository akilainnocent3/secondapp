package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.multimaker.data.dto.MultiMakerLeagueOptionDto;
import com.sportybet.android.multimaker.domain.model.MultiMakerSport;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class djw implements lyh<Unit> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ tjw b;

    @c0d(c = "com.sportybet.android.multimaker.presentation.viewmodel.MultiMakerViewModel$registerUiStates$$inlined$combine$1", f = "MultiMakerViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return djw.this.collect(null, this);
        }
    }

    public static final class b implements Function0<Object[]> {
        public final /* synthetic */ lyh[] a;

        public b(lyh[] lyhVarArr) {
            this.a = lyhVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object[] invoke() {
            return new Object[8];
        }
    }

    @c0d(c = "com.sportybet.android.multimaker.presentation.viewmodel.MultiMakerViewModel$registerUiStates$$inlined$combine$1$3", f = "MultiMakerViewModel.kt", l = {234}, m = "invokeSuspend", v = 2)
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

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v1, types: [m2g] */
        /* JADX WARN: Type inference failed for: r10v2, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r11v1, types: [m2g] */
        /* JADX WARN: Type inference failed for: r11v2, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r11v7, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r12v1, types: [m2g] */
        /* JADX WARN: Type inference failed for: r12v2, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r13v1, types: [m2g] */
        /* JADX WARN: Type inference failed for: r13v2, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r13v3, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r8v1, types: [m2g] */
        /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
        /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ?? arrayList;
            ?? arrayList2;
            ?? arrayList3;
            ?? arrayList4;
            ?? arrayList5;
            UiText stringUiText;
            List listC;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                Object[] objArr = this.c;
                Object obj2 = objArr[0];
                List list = obj2 instanceof List ? (List) obj2 : null;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (obj3 instanceof mfb0) {
                            arrayList.add(obj3);
                        }
                    }
                } else {
                    arrayList = m2g.a;
                }
                Object obj4 = objArr[1];
                obj4.getClass();
                String str = (String) obj4;
                Object obj5 = objArr[2];
                List list2 = obj5 instanceof List ? (List) obj5 : null;
                if (list2 != null) {
                    arrayList2 = new ArrayList();
                    for (Object obj6 : list2) {
                        if (obj6 instanceof MultiMakerLeagueOptionDto) {
                            arrayList2.add(obj6);
                        }
                    }
                } else {
                    arrayList2 = m2g.a;
                }
                Object obj7 = objArr[3];
                List list3 = obj7 instanceof List ? (List) obj7 : null;
                if (list3 != null) {
                    arrayList3 = new ArrayList();
                    for (Object obj8 : list3) {
                        if (obj8 instanceof String) {
                            arrayList3.add(obj8);
                        }
                    }
                } else {
                    arrayList3 = m2g.a;
                }
                Object obj9 = objArr[4];
                List list4 = obj9 instanceof List ? (List) obj9 : null;
                if (list4 != null) {
                    arrayList4 = new ArrayList();
                    for (Object obj10 : list4) {
                        if (obj10 instanceof RegularMarketRule) {
                            arrayList4.add(obj10);
                        }
                    }
                } else {
                    arrayList4 = m2g.a;
                }
                Object obj11 = objArr[5];
                List list5 = obj11 instanceof List ? (List) obj11 : null;
                if (list5 != null) {
                    arrayList5 = new ArrayList();
                    for (Object obj12 : list5) {
                        if (obj12 instanceof String) {
                            arrayList5.add(obj12);
                        }
                    }
                } else {
                    arrayList5 = m2g.a;
                }
                Object obj13 = objArr[6];
                obj13.getClass();
                xvf0 xvf0Var = (xvf0) obj13;
                Object obj14 = objArr[7];
                obj14.getClass();
                qhw qhwVar = (qhw) obj14;
                arrayList.getClass();
                ArrayList arrayList6 = new ArrayList(l48.r(arrayList, 10));
                for (mfb0 mfb0Var : arrayList) {
                    String id = mfb0Var.getId();
                    id.getClass();
                    UiText uiTextC = mfb0Var.c();
                    uiTextC.getClass();
                    String strA = mfb0Var.a();
                    strA.getClass();
                    arrayList6.add(new MultiMakerSport(id, uiTextC, strA, Intrinsics.g(mfb0Var.getId(), str), 8));
                }
                if (xvf0Var.b()) {
                    StringUiText stringUiText2 = vch0.a;
                    stringUiText = new ResourceUiText(R.string.common_functions__time);
                } else {
                    String str2 = xvf0Var.b;
                    str2.getClass();
                    StringUiText stringUiText3 = vch0.a;
                    stringUiText = new StringUiText(str2);
                }
                ArrayList arrayListD1 = tjw.D1(tjw.A1(arrayList2, arrayList3));
                if (arrayListD1.contains(new ResourceUiText(R.string.live_result__all_leagues))) {
                    listC = kotlin.collections.a.c(new ResourceUiText(R.string.common_functions__leagues));
                } else if (arrayListD1.isEmpty()) {
                    listC = arrayListD1;
                    listC = kotlin.collections.a.c(new ResourceUiText(R.string.common_functions__leagues));
                }
                listC = arrayListD1;
                List list6 = listC;
                ArrayList arrayListD2 = tjw.D1(tjw.B1(arrayList4, arrayList5));
                tjw tjwVar = this.d;
                wwd0 wwd0Var = tjwVar.g0;
                qhw qhwVar2 = qhw.f;
                liw.b(wwd0Var, arrayList6, qhwVar == qhwVar2 && !arrayList6.isEmpty(), false);
                liw.a(tjwVar.g0, (qhwVar != qhwVar2 || arrayList.isEmpty() || (arrayList2.isEmpty() && arrayList4.isEmpty())) ? false : true, false, stringUiText, list6, arrayListD2);
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

    public djw(lyh[] lyhVarArr, tjw tjwVar) {
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
