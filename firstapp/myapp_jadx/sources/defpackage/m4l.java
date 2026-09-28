package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import com.sportygames.newcms.CMSRes;
import com.sportygames.newcms.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class m4l {

    @c0d(c = "com.sportygames.goldmine.collections.presentation.components.GoldmineCollectionsDialogComponentKt$GoldmineCollectionsDialogComponent$1$1", f = "GoldmineCollectionsDialogComponent.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ g58 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g58 g58Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = g58Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            g58 g58Var = this.a;
            g58Var.getClass();
            ej5.c(o8i0.d(g58Var), null, null, new e58(g58Var, null), 3);
            return Unit.a;
        }
    }

    public static final class b implements tse {
        public final /* synthetic */ g58 a;

        public b(g58 g58Var) {
            this.a = g58Var;
        }

        @Override // defpackage.tse
        public final void dispose() {
            g58 g58Var = this.a;
            g58Var.getClass();
            ej5.c(o8i0.d(g58Var), null, null, new f58(g58Var, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final int i, androidx.compose.runtime.a aVar, final Function0 function0, final Function1 function1) {
        int i2;
        function1.getClass();
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-1824850772);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        int i3 = 0;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            bVarI.N(-1614864554);
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            j8i0 j8i0VarA = sgk.a(jq40.a(g58.class), w8i0VarA.getViewModelStore(), dyb.a(w8i0VarA), null, orp.b(bVarI), null);
            bVarI.X(false);
            g58 g58Var = (g58) j8i0VarA;
            Unit unit = Unit.a;
            boolean zA = bVarI.A(g58Var);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new a(g58Var, null);
                bVarI.r(objY);
            }
            xvf.e(bVarI, unit, (Function2) objY);
            boolean zA2 = bVarI.A(g58Var);
            Object objY2 = bVarI.y();
            if (zA2 || objY2 == c0042a) {
                objY2 = new j4l(g58Var, i3);
                bVarI.r(objY2);
            }
            xvf.c(unit, (Function1) objY2, bVarI);
            d58 d58Var = (d58) wyh.c(g58Var.b, bVarI, 0, 7).getValue();
            if (d58Var instanceof fiu) {
                bVarI.N(-1334916998);
                final fiu fiuVar = (fiu) d58Var;
                p4l.a(function0, pp8.b(726953978, new Function2() { // from class: k4l
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        List<nu6> list;
                        Iterator it;
                        int i4;
                        int i5;
                        ou6 ou6Var;
                        woe0 woe0Var;
                        int i6;
                        String str;
                        woe0 woe0Var2;
                        a aVar2 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        int i7 = 0;
                        int i8 = 1;
                        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            List<CMSRes> list2 = v48.a;
                            j48 j48Var = fiuVar.a;
                            List<CMSRes> list3 = v48.c;
                            j48Var.getClass();
                            List<nu6> list4 = j48Var.a;
                            String strC = c.c(vue0.X0.H, new String[0], aVar2);
                            aVar2.N(-1290822981);
                            ArrayList arrayList = new ArrayList();
                            Iterator it2 = list4.iterator();
                            int i9 = 0;
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                int i10 = i9 + 1;
                                if (i9 < 0) {
                                    b.q();
                                    throw null;
                                }
                                nu6 nu6Var = (nu6) next;
                                int i11 = 4;
                                if (i9 == 0) {
                                    list = list4;
                                    it = it2;
                                    aVar2.N(2027581426);
                                    vue0 vue0Var = vue0.X0;
                                    String strC2 = c.c(vue0Var.b0, new String[0], aVar2);
                                    String strC3 = c.c(vue0Var.u0, new String[0], aVar2);
                                    ArrayList arrayList2 = nu6Var.a;
                                    if (arrayList2.isEmpty()) {
                                        i4 = 0;
                                    } else {
                                        int size = arrayList2.size();
                                        int i12 = 0;
                                        int i13 = 0;
                                        while (i13 < size) {
                                            Object obj3 = arrayList2.get(i13);
                                            i13++;
                                            if (((voe0) obj3).b && (i12 = i12 + 1) < 0) {
                                                b.p();
                                                throw null;
                                            }
                                        }
                                        i4 = i12;
                                    }
                                    int size2 = arrayList2.size();
                                    ArrayList arrayList3 = new ArrayList();
                                    int i14 = 0;
                                    int i15 = 0;
                                    for (int size3 = arrayList2.size(); i15 < size3; size3 = size3) {
                                        Object obj4 = arrayList2.get(i15);
                                        i15++;
                                        int i16 = i14 + 1;
                                        if (i14 < 0) {
                                            b.q();
                                            throw null;
                                        }
                                        voe0 voe0Var = (voe0) obj4;
                                        if (i14 > 4) {
                                            aVar2.N(1392955387);
                                            aVar2.H();
                                            woe0Var = null;
                                        } else {
                                            aVar2.N(1393081495);
                                            vue0 vue0Var2 = vue0.X0;
                                            woe0 woe0Var3 = new woe0(c.c(vue0Var2.t0, new String[0], aVar2), c.c(vue0Var2.s0, new String[0], aVar2), c.c(list3.get(i14), new String[0], aVar2), c.c(v48.a.get(i14), new String[0], aVar2), String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(voe0Var.a)}, 1)).concat("x"), voe0Var.b);
                                            aVar2.H();
                                            woe0Var = woe0Var3;
                                        }
                                        if (woe0Var != null) {
                                            arrayList3.add(woe0Var);
                                        }
                                        i14 = i16;
                                        arrayList2 = arrayList2;
                                    }
                                    i5 = 1;
                                    ou6 ou6Var2 = new ou6(strC2, strC3, i4, size2, null, arrayList3);
                                    aVar2.H();
                                    ou6Var = ou6Var2;
                                } else if (i9 != i8) {
                                    aVar2.N(-1566293039);
                                    aVar2.H();
                                    list = list4;
                                    it = it2;
                                    ou6Var = null;
                                    i5 = i8;
                                } else {
                                    aVar2.N(2027629807);
                                    vue0 vue0Var3 = vue0.X0;
                                    String strC4 = c.c(vue0Var3.c0, new String[i7], aVar2);
                                    String strC5 = c.c(vue0Var3.v0, new String[i7], aVar2);
                                    ArrayList arrayList4 = nu6Var.a;
                                    if (arrayList4.isEmpty()) {
                                        i6 = i7;
                                    } else {
                                        int size4 = arrayList4.size();
                                        int i17 = i7;
                                        int i18 = i17;
                                        while (i18 < size4) {
                                            Object obj5 = arrayList4.get(i18);
                                            i18++;
                                            if (((voe0) obj5).b && (i17 = i17 + 1) < 0) {
                                                b.p();
                                                throw null;
                                            }
                                        }
                                        i6 = i17;
                                    }
                                    int size5 = arrayList4.size();
                                    ArrayList arrayList5 = list4.get(i7).a;
                                    if (arrayList5.isEmpty()) {
                                        aVar2.N(-1567430118);
                                        aVar2.H();
                                        str = null;
                                        break;
                                    }
                                    int size6 = arrayList5.size();
                                    int i19 = i7;
                                    while (true) {
                                        if (i19 >= size6) {
                                            aVar2.N(-1567430118);
                                            aVar2.H();
                                            str = null;
                                            break;
                                        }
                                        Object obj6 = arrayList5.get(i19);
                                        i19++;
                                        if (!((voe0) obj6).b) {
                                            aVar2.N(-1567526342);
                                            String strC6 = c.c(vue0.X0.d0, new String[i7], aVar2);
                                            aVar2.H();
                                            str = strC6;
                                            break;
                                        }
                                    }
                                    ArrayList arrayList6 = new ArrayList();
                                    int size7 = arrayList4.size();
                                    int i20 = i7;
                                    int i21 = i20;
                                    while (i21 < size7) {
                                        Object obj7 = arrayList4.get(i21);
                                        i21++;
                                        int i22 = i20 + 1;
                                        if (i20 < 0) {
                                            b.q();
                                            throw null;
                                        }
                                        voe0 voe0Var2 = (voe0) obj7;
                                        if (i20 > i11) {
                                            aVar2.N(-1484370588);
                                            aVar2.H();
                                            woe0Var2 = null;
                                        } else {
                                            aVar2.N(-1484244542);
                                            vue0 vue0Var4 = vue0.X0;
                                            woe0 woe0Var4 = new woe0(c.c(vue0Var4.t0, new String[0], aVar2), c.c(vue0Var4.s0, new String[0], aVar2), c.c(list3.get(i20), new String[0], aVar2), c.c(v48.b.get(i20), new String[0], aVar2), String.format(Locale.getDefault(), "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(voe0Var2.a)}, 1)).concat("x"), voe0Var2.b);
                                            aVar2.H();
                                            woe0Var2 = woe0Var4;
                                        }
                                        if (woe0Var2 != null) {
                                            arrayList6.add(woe0Var2);
                                        }
                                        i20 = i22;
                                        list4 = list4;
                                        it2 = it2;
                                        arrayList4 = arrayList4;
                                        i11 = 4;
                                    }
                                    list = list4;
                                    it = it2;
                                    ou6 ou6Var3 = new ou6(strC4, strC5, i6, size5, str, arrayList6);
                                    aVar2.H();
                                    ou6Var = ou6Var3;
                                    i5 = 1;
                                }
                                if (ou6Var != null) {
                                    arrayList.add(ou6Var);
                                }
                                i8 = i5;
                                i9 = i10;
                                list4 = list;
                                it2 = it;
                                i7 = 0;
                            }
                            aVar2.H();
                            i4l.b(new c58(strC, arrayList), aVar2, 0);
                        } else {
                            aVar2.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, ((i2 >> 3) & 14) | 48);
                bVarI.X(false);
            } else if (d58Var instanceof rxs) {
                bVarI.N(-1334907344);
                p4l.a(function0, s49.a, bVarI, ((i2 >> 3) & 14) | 48);
                bVarI.X(false);
            } else {
                if (!(d58Var instanceof jbg)) {
                    throw igf0.a(bVarI, -1334918500, false);
                }
                bVarI.N(-1334901549);
                bVarI.X(false);
                function1.invoke(((jbg) d58Var).a);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: l4l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    m4l.a(qj40.a(i | 1), (a) obj, function0, function1);
                    return Unit.a;
                }
            };
        }
    }
}
