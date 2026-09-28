package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.bookingcode.BookingCodeFilterDto;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.widget.InteractiveMarketPanel;
import com.sportybet.android.instantwin.presentation.widget.OutcomeGeneralLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ayo implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ayo(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [T, kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, kotlin.Pair] */
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
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        iy7 iy7VarB;
        boolean z;
        boolean zContains;
        int i;
        boolean zContains2;
        int i2 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                InteractiveMarketPanel interactiveMarketPanel = (InteractiveMarketPanel) obj2;
                p4p p4pVar = (p4p) obj;
                dqu.b bVar = interactiveMarketPanel.K;
                if (bVar != null) {
                    OutcomeGeneralLayout.b bVar2 = (OutcomeGeneralLayout.b) interactiveMarketPanel.H.get(p4pVar.b.getTag());
                    bs3 bs3Var = bVar2 != null ? (bs3) bVar2.a : null;
                    if (p4pVar.b.isSelected()) {
                        bVar.g(bs3Var);
                        return;
                    } else {
                        bVar.f(bs3Var);
                        return;
                    }
                }
                return;
            default:
                r320 r320Var = (r320) obj2;
                hy7 hy7Var = (hy7) obj;
                if (r320Var.p0() == jz7.c && hy7Var == hy7.a) {
                    r320Var.z0();
                    return;
                }
                hy7 hy7Var2 = r320Var.H;
                hy7 hy7Var3 = hy7.f;
                if (hy7Var2 != hy7Var3 && hy7Var2 == hy7Var) {
                    r320Var.H = hy7Var3;
                    r320Var.y0(hy7Var, false);
                    yx7 yx7Var = r320Var.E;
                    if (yx7Var != null) {
                        yx7Var.e();
                        return;
                    } else {
                        Intrinsics.n("filterHandler");
                        throw null;
                    }
                }
                if (hy7Var2 != hy7Var3) {
                    r320Var.y0(hy7Var2, false);
                }
                r320Var.H = hy7Var;
                r320Var.y0(hy7Var, true);
                if (r320.a.b[hy7Var.ordinal()] != 1 || (iy7VarB = r320Var.G) == null) {
                    iy7VarB = ax7.b(r320Var.r0().T, hy7Var);
                }
                final yx7 yx7Var2 = r320Var.E;
                if (yx7Var2 == null) {
                    Intrinsics.n("filterHandler");
                    throw null;
                }
                iym iymVar = r320Var.U;
                if (iymVar == null) {
                    Intrinsics.n("openTelemetryLogger");
                    throw null;
                }
                Context context = yx7Var2.h;
                veb0 veb0Var = yx7Var2.a;
                az7 az7Var = yx7Var2.g;
                if (az7Var != null) {
                    az7Var.e();
                }
                ConstraintLayout constraintLayout = veb0Var.a;
                ConstraintLayout constraintLayout2 = veb0Var.f.a;
                LinearLayout linearLayout = veb0Var.d;
                constraintLayout.setVisibility(0);
                veb0Var.e.removeAllViews();
                int iOrdinal = hy7Var.ordinal();
                if (iOrdinal == 0) {
                    linearLayout.setVisibility(8);
                    constraintLayout2.setVisibility(8);
                    final iy7.a aVar = (iy7.a) iy7VarB;
                    Iterator<T> it = yx7Var2.c.invoke().iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        String str = (String) pair.a;
                        iy7.a aVar2 = (iy7.a) pair.b;
                        yx7Var2.a(str, aVar2, jy7.b(aVar2, aVar), false, false, new Function2() { // from class: tx7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) throws Throwable {
                                iy7.a aVar3 = (iy7.a) obj3;
                                ((Boolean) obj4).getClass();
                                aVar3.getClass();
                                yx7 yx7Var3 = yx7Var2;
                                n320 n320Var = yx7Var3.d;
                                iy7.a aVar4 = aVar;
                                n320Var.d(!jy7.b(aVar3, aVar4) ? aVar3 : null, hy7.a, Boolean.FALSE, Boolean.valueOf(jy7.b(aVar3, aVar4)));
                                yx7Var3.e();
                                return Unit.a;
                            }
                        });
                    }
                    return;
                }
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        iymVar.d(AnalyticsEvent.CODE_HUB_FOLDS_FILTER_CLICKED);
                        az7 az7Var2 = yx7Var2.e;
                        yx7Var2.g = az7Var2;
                        if (az7Var2 != null) {
                            az7Var2.h(iy7VarB);
                            return;
                        }
                        return;
                    }
                    if (iOrdinal == 3) {
                        iymVar.d(AnalyticsEvent.CODE_HUB_ODDS_FILTER_CLICKED);
                        az7 az7Var3 = yx7Var2.f;
                        yx7Var2.g = az7Var3;
                        if (az7Var3 != null) {
                            az7Var3.h(iy7VarB);
                            return;
                        }
                        return;
                    }
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            veb0Var.a.setVisibility(8);
                            return;
                        } else {
                            uhc.a();
                            return;
                        }
                    }
                    iymVar.d(AnalyticsEvent.CODE_HUB_SORT_FILTER_CLICKED);
                    linearLayout.setVisibility(8);
                    constraintLayout2.setVisibility(8);
                    List<Pair<String, iy7.b>> list = fy7.a;
                    context.getClass();
                    iy7.d dVar = (iy7.d) iy7VarB;
                    for (final Pair pair2 : b.k(new Pair(sn5.b(context, R.string.common_functions__all, new Object[0]), new iy7.d(new BookingCodeFilterDto.SortBy(BookingCodeFilterDto.SortBy.SORT_POPULARITY, 0, null, 6, null))), new Pair(sn5.b(context, R.string.page_code_hub__folds_descending, new Object[0]), new iy7.d(new BookingCodeFilterDto.SortBy("folds_amount", 0, "desc", 2, null))), new Pair(sn5.b(context, R.string.page_code_hub__folds_ascending, new Object[0]), new iy7.d(new BookingCodeFilterDto.SortBy("folds_amount", 0, "asc", 2, null))), new Pair(sn5.b(context, R.string.page_code_hub__odds_descending, new Object[0]), new iy7.d(new BookingCodeFilterDto.SortBy("total_odds", 0, "desc", 2, null))), new Pair(sn5.b(context, R.string.page_code_hub__odds_ascending, new Object[0]), new iy7.d(new BookingCodeFilterDto.SortBy("total_odds", 0, "asc", 2, null))))) {
                        String strValueOf = String.valueOf(pair2.a);
                        B b = pair2.b;
                        yx7Var2.a(strValueOf, b, ax7.a((iy7.d) b, dVar), false, false, new Function2() { // from class: lx7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) throws Throwable {
                                ((Boolean) obj4).getClass();
                                ((iy7.d) obj3).getClass();
                                yx7 yx7Var3 = yx7Var2;
                                n320 n320Var = yx7Var3.d;
                                Object obj5 = pair2.b;
                                hy7 hy7Var4 = hy7.e;
                                Boolean bool = Boolean.FALSE;
                                n320Var.d(obj5, hy7Var4, bool, bool);
                                yx7Var3.e();
                                return Unit.a;
                            }
                        });
                    }
                    return;
                }
                iymVar.d(AnalyticsEvent.CODE_HUB_TIME_FILTER_CLICKED);
                oy7 oy7Var = yx7.i;
                linearLayout.setVisibility(0);
                constraintLayout2.setVisibility(8);
                iy7.e eVar = iy7VarB instanceof iy7.e ? (iy7.e) iy7VarB : null;
                List<Long> list2 = eVar != null ? eVar.a : null;
                if (list2 == null) {
                    list2 = m2g.a;
                }
                final List<Long> list3 = list2;
                List<Long> list4 = eVar != null ? eVar.b : null;
                if (list4 == null) {
                    list4 = m2g.a;
                }
                final List<Long> list5 = list4;
                boolean z2 = eVar != null && eVar.c;
                Set set = eVar != null ? eVar.d : null;
                if (set == null) {
                    set = t3g.a;
                }
                final Set set2 = set;
                context.getClass();
                final String strB = sn5.b(context, R.string.page_code_hub__this_weekend, new Object[0]);
                ArrayList arrayList = new ArrayList();
                BookingCodeFilterDto bookingCodeFilterDto = mz7.h0;
                Calendar calendarA = mz7.b.a();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE dd/MM", Locale.US);
                String str2 = simpleDateFormat.format(calendarA.getTime());
                str2.getClass();
                arrayList.add(new Pair(v70.b(yx7.a.c(context, str2), " (", sn5.b(context, R.string.common_dates__today, new Object[0]), ")"), Long.valueOf(calendarA.getTime().getTime())));
                for (int i3 = 1; i3 < 7; i3++) {
                    calendarA.add(5, 1);
                    String str3 = simpleDateFormat.format(calendarA.getTime());
                    str3.getClass();
                    arrayList.add(new Pair(yx7.a.c(context, str3), Long.valueOf(calendarA.getTime().getTime())));
                }
                final ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj3 = arrayList.get(i4);
                    i4++;
                    arrayList2.add(Long.valueOf(((Number) ((Pair) obj3).b).longValue()));
                }
                final ArrayList arrayListB = yx7.a.b();
                boolean z3 = Intrinsics.g(list3, arrayList2) && list5.isEmpty();
                final ArrayList arrayList3 = new ArrayList();
                boolean zIsEmpty = set2.isEmpty();
                Long l = (Long) CollectionsKt.firstOrNull(arrayListB);
                long jLongValue = l != null ? l.longValue() : 0L;
                if (zIsEmpty) {
                    z = z3;
                    zContains = z || z2;
                } else {
                    z = z3;
                    zContains = set2.contains("this_weekend");
                }
                arrayList3.add(new gy7(strB, jLongValue, zContains));
                ArrayList arrayList4 = new ArrayList(l48.r(arrayList, 10));
                int size2 = arrayList.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj4 = arrayList.get(i5);
                    int i6 = i5 + 1;
                    Pair pair3 = (Pair) obj4;
                    ArrayList arrayList5 = arrayList;
                    int i7 = size2;
                    A a = pair3.a;
                    B b2 = pair3.b;
                    String str4 = (String) a;
                    Number number = (Number) b2;
                    yx7 yx7Var3 = yx7Var2;
                    veb0 veb0Var2 = veb0Var;
                    long jLongValue2 = number.longValue();
                    if (!zIsEmpty) {
                        zContains2 = set2.contains(String.valueOf(number.longValue()));
                        i = i6;
                    } else if (z) {
                        i = i6;
                        zContains2 = true;
                    } else {
                        if (z2) {
                            long jLongValue3 = number.longValue();
                            i = i6;
                            if (arrayListB.contains(Long.valueOf(jLongValue3))) {
                                zContains2 = false;
                            }
                        } else {
                            i = i6;
                        }
                        zContains2 = list3.contains(b2);
                    }
                    arrayList4.add(new gy7(str4, jLongValue2, zContains2));
                    arrayList = arrayList5;
                    size2 = i7;
                    i5 = i;
                    yx7Var2 = yx7Var3;
                    veb0Var = veb0Var2;
                }
                final yx7 yx7Var4 = yx7Var2;
                veb0 veb0Var3 = veb0Var;
                p48.w(arrayList4, arrayList3);
                final dq40 dq40Var = new dq40();
                int i8 = 0;
                dq40Var.a = new Pair(new ArrayList(), new ux7(0));
                final ArrayList arrayList6 = new ArrayList();
                String strB2 = sn5.b(context, R.string.component_odds_filters__all, new Object[0]);
                BookingCodeFilterDto bookingCodeFilterDto2 = mz7.h0;
                ArrayList arrayListB2 = mz7.b.b();
                boolean zI = yx7.i(arrayList3);
                final boolean z4 = z2;
                Function2 function2 = new Function2() { // from class: vx7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj5, Object obj6) {
                        boolean zBooleanValue = ((Boolean) obj6).booleanValue();
                        ((ArrayList) obj5).getClass();
                        ArrayList arrayList7 = arrayList3;
                        int size3 = arrayList7.size();
                        int i9 = 0;
                        int i10 = 0;
                        while (i10 < size3) {
                            Object obj7 = arrayList7.get(i10);
                            i10++;
                            int i11 = i9 + 1;
                            if (i9 < 0) {
                                b.q();
                                throw null;
                            }
                            ((gy7) arrayList7.get(i9)).c = zBooleanValue;
                            i9 = i11;
                        }
                        yx7.k(yx7Var4, dq40Var, strB, arrayList6, arrayList7, arrayList2, arrayListB, list3, list5, set2, z4);
                        return Unit.a;
                    }
                };
                ArrayList arrayList7 = arrayList6;
                List<Long> list6 = list3;
                List<Long> list7 = list5;
                Set set3 = set2;
                boolean z5 = z4;
                yx7 yx7Var5 = yx7Var4;
                dq40 dq40Var2 = dq40Var;
                dq40Var2.a = yx7Var5.a(strB2, arrayListB2, zI, true, true, function2);
                int size3 = arrayList3.size();
                while (i8 < size3) {
                    Object obj5 = arrayList3.get(i8);
                    i8++;
                    final gy7 gy7Var = (gy7) obj5;
                    String str5 = gy7Var.a;
                    Long lValueOf = Long.valueOf(gy7Var.b);
                    boolean z6 = gy7Var.c;
                    final List<Long> list8 = list6;
                    final List<Long> list9 = list7;
                    final boolean z7 = z5;
                    final ArrayList arrayList8 = arrayList7;
                    final yx7 yx7Var6 = yx7Var5;
                    final Set set4 = set3;
                    final dq40 dq40Var3 = dq40Var2;
                    Function2 function3 = new Function2() { // from class: wx7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            ((Long) obj6).getClass();
                            boolean zBooleanValue = ((Boolean) obj7).booleanValue();
                            ArrayList arrayList9 = arrayList3;
                            int size4 = arrayList9.size();
                            int i9 = 0;
                            int i10 = 0;
                            while (true) {
                                if (i10 >= size4) {
                                    i9 = -1;
                                    break;
                                }
                                Object obj8 = arrayList9.get(i10);
                                i10++;
                                if (Intrinsics.g(((gy7) obj8).a, gy7Var.a)) {
                                    break;
                                }
                                i9++;
                            }
                            if (i9 == -1) {
                                return Unit.a;
                            }
                            ((gy7) arrayList9.get(i9)).c = zBooleanValue;
                            yx7.k(yx7Var6, dq40Var3, strB, arrayList8, arrayList9, arrayList2, arrayListB, list8, list9, set4, z7);
                            return Unit.a;
                        }
                    };
                    z5 = z7;
                    set3 = set4;
                    yx7Var5 = yx7Var6;
                    list6 = list8;
                    list7 = list9;
                    arrayList8.add(yx7Var5.a(str5, lValueOf, z6, true, true, function3));
                    arrayList7 = arrayList8;
                    dq40Var2 = dq40Var3;
                }
                yx7.k(yx7Var5, dq40Var2, strB, arrayList7, arrayList3, arrayList2, arrayListB, list6, list7, set3, z5);
                final yx7 yx7Var7 = yx7Var5;
                final List<Long> list10 = list6;
                final List<Long> list11 = list7;
                final Set set5 = set3;
                final boolean z8 = z5;
                veb0Var3.b.setOnClickListener(new View.OnClickListener() { // from class: xx7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) throws Throwable {
                        ArrayList arrayList9 = arrayListB;
                        ArrayList arrayList10 = arrayList2;
                        ArrayList arrayList11 = arrayList3;
                        String str6 = strB;
                        List listG = yx7.g(arrayList10, arrayList11, str6, arrayList9);
                        m2g m2gVar = m2g.a;
                        boolean zJ = yx7.j(str6, arrayList11);
                        ph80 ph80VarF = yx7.f(str6, arrayList11);
                        boolean zEquals = listG.equals(list10);
                        yx7 yx7Var8 = yx7Var7;
                        if (zEquals && Intrinsics.g(m2gVar, list11) && zJ == z8 && Intrinsics.g(ph80VarF, set5)) {
                            yx7Var8.d.d(null, hy7.b, Boolean.FALSE, Boolean.TRUE);
                        } else {
                            n320 n320Var = yx7Var8.d;
                            iy7.e eVar2 = new iy7.e(listG, m2gVar, zJ, ph80VarF);
                            hy7 hy7Var4 = hy7.b;
                            Boolean bool = Boolean.FALSE;
                            n320Var.d(eVar2, hy7Var4, bool, bool);
                        }
                        yx7Var8.e();
                    }
                });
                veb0Var3.c.setOnClickListener(new View.OnClickListener() { // from class: kx7
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) throws Throwable {
                        ph80 ph80Var = new ph80();
                        ph80Var.add("this_weekend");
                        ArrayList arrayList9 = arrayList2;
                        int size4 = arrayList9.size();
                        int i9 = 0;
                        while (i9 < size4) {
                            Object obj6 = arrayList9.get(i9);
                            i9++;
                            ph80Var.add(String.valueOf(((Number) obj6).longValue()));
                        }
                        ph80 ph80VarA = wi80.a(ph80Var);
                        boolean zG = Intrinsics.g(list10, arrayList9);
                        yx7 yx7Var8 = yx7Var7;
                        if (zG && list11.isEmpty() && Intrinsics.g(set5, ph80VarA)) {
                            yx7Var8.d.d(null, hy7.b, Boolean.FALSE, Boolean.TRUE);
                        } else {
                            n320 n320Var = yx7Var8.d;
                            iy7.e eVar2 = new iy7.e(arrayList9, m2g.a, true, ph80VarA);
                            hy7 hy7Var4 = hy7.b;
                            Boolean bool = Boolean.FALSE;
                            n320Var.d(eVar2, hy7Var4, bool, bool);
                        }
                        yx7Var8.e();
                    }
                });
                return;
        }
    }
}
