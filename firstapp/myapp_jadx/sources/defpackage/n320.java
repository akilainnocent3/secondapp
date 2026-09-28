package defpackage;

import android.content.Context;
import com.sporty.android.core.model.bookingcode.BookingCodeFilterDto;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n320 implements iaj {
    public final /* synthetic */ r320 a;

    public /* synthetic */ n320(r320 r320Var) {
        this.a = r320Var;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:116:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:117:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    @Override // defpackage.iaj
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) throws Throwable {
        Throwable th;
        Object next;
        String str;
        String strO0;
        Object next2;
        double d;
        String strA;
        String strA2;
        String strO1;
        String str2;
        String strA0;
        String strSubstring;
        ?? Substring;
        iy7 iy7Var = (iy7) obj;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        r320 r320Var = this.a;
        Throwable th2 = null;
        if (zBooleanValue2) {
            r320Var.y0(r320Var.H, false);
            r320Var.H = hy7.f;
            kz1 kz1Var = r320Var.C;
            if (kz1Var == null) {
                Intrinsics.n("adapter");
                throw null;
            }
            kz1Var.f();
            r320Var.r0().C1();
            return Unit.a;
        }
        if (iy7Var != null) {
            hy7 hy7Var = r320Var.H;
            hy7 hy7Var2 = hy7.b;
            if (hy7Var == hy7Var2) {
                r320Var.G = iy7Var instanceof iy7.e ? (iy7.e) iy7Var : null;
            }
            ix7 ix7Var = r320Var.F;
            if (hy7Var == hy7.a) {
                ix7Var.getClass();
                th = null;
            } else if (hy7Var == hy7Var2) {
                iy7.e eVar = (iy7.e) iy7Var;
                List<Long> list = eVar.a;
                boolean z = eVar.c;
                List<Long> list2 = eVar.b;
                ArrayList arrayListI0 = CollectionsKt.i0(list2, list);
                List<Long> timeFilter = mz7.h0.getTimeFilter();
                if (timeFilter == null) {
                    timeFilter = m2g.a;
                }
                oy7 oy7Var = yx7.i;
                ArrayList arrayListB = yx7.a.b();
                Set<String> set = eVar.d;
                if (list2.isEmpty() && list.equals(timeFilter)) {
                    th = null;
                    Substring = th;
                } else if (set.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    int size = arrayListI0.size();
                    int i = 0;
                    while (i < size) {
                        Object obj5 = arrayListI0.get(i);
                        i++;
                        Throwable th3 = th2;
                        if (!arrayListB.contains(Long.valueOf(((Number) obj5).longValue()))) {
                            arrayList.add(obj5);
                        }
                        th2 = th3;
                    }
                    th = th2;
                    if (z && arrayList.isEmpty()) {
                        Substring = sn5.d(r320Var, R.string.page_code_hub__this_weekend, new Object[0]);
                    } else {
                        ngs ngsVarB = a.b();
                        if (z) {
                            ngsVarB.add(sn5.d(r320Var, R.string.page_code_hub__this_weekend, new Object[0]));
                        }
                        oy7 oy7Var2 = yx7.i;
                        Context contextRequireContext = r320Var.requireContext();
                        contextRequireContext.getClass();
                        ArrayList arrayListA = yx7.a.a(contextRequireContext);
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = arrayListA.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            Object obj6 = arrayListA.get(i2);
                            i2++;
                            if (arrayList.contains(((Pair) obj6).b)) {
                                arrayList2.add(obj6);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(l48.r(arrayList2, 10));
                        int size3 = arrayList2.size();
                        int i3 = 0;
                        while (i3 < size3) {
                            Object obj7 = arrayList2.get(i3);
                            i3++;
                            arrayList3.add((String) ((Pair) obj7).a);
                        }
                        ngsVarB.addAll(arrayList3);
                        ngs ngsVarA = a.a(ngsVarB);
                        ?? r11 = !ngsVarA.isEmpty() ? ngsVarA : th;
                        if (r11 != 0) {
                            strA0 = CollectionsKt.a0(r11, ", ", null, null, null, 62);
                            if (strA0.length() >= 6) {
                                Substring = strA0;
                                Substring = strA0.substring(0, 6);
                            }
                        } else {
                            Substring = th;
                        }
                    }
                } else {
                    ngs ngsVarB2 = a.b();
                    if (set.contains("this_weekend")) {
                        ngsVarB2.add(sn5.d(r320Var, R.string.page_code_hub__this_weekend, new Object[0]));
                    }
                    Context contextRequireContext2 = r320Var.requireContext();
                    contextRequireContext2.getClass();
                    ArrayList arrayListA2 = yx7.a.a(contextRequireContext2);
                    ArrayList arrayList4 = new ArrayList();
                    int size4 = arrayListA2.size();
                    int i4 = 0;
                    while (i4 < size4) {
                        Object obj8 = arrayListA2.get(i4);
                        i4++;
                        if (set.contains(String.valueOf(((Number) ((Pair) obj8).b).longValue()))) {
                            arrayList4.add(obj8);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(l48.r(arrayList4, 10));
                    int size5 = arrayList4.size();
                    int i5 = 0;
                    while (i5 < size5) {
                        Object obj9 = arrayList4.get(i5);
                        i5++;
                        arrayList5.add((String) ((Pair) obj9).a);
                    }
                    ngsVarB2.addAll(arrayList5);
                    ngs ngsVarA2 = a.a(ngsVarB2);
                    ngs ngsVar = !ngsVarA2.isEmpty() ? ngsVarA2 : null;
                    if (ngsVar != null) {
                        String strA1 = CollectionsKt.a0(ngsVar, ", ", null, null, null, 62);
                        if (strA1.length() >= 6) {
                            strSubstring = strA1;
                            strSubstring = strA1.substring(0, 6);
                        }
                        strSubstring = strA1;
                        th = null;
                        Substring = strSubstring;
                    } else {
                        th = null;
                        Substring = th;
                    }
                }
                Substring = strA0;
                ix7Var.a = Substring;
            } else {
                th = null;
                int iOrdinal = hy7Var.ordinal();
                if (iOrdinal == 2) {
                    iy7.b bVar = (iy7.b) iy7Var;
                    if (!bVar.equals(ax7.b(mz7.h0, hy7Var)) || zBooleanValue) {
                        String strD = sn5.d(r320Var, R.string.component_odds_filters__max, new Object[0]);
                        Iterator it = fy7.a.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!Intrinsics.g(((Pair) next).b, bVar));
                        Pair pair = (Pair) next;
                        if (pair == null || (str = (String) pair.a) == null) {
                            int i6 = bVar.a;
                            int i7 = bVar.b;
                            str = i6 + "~" + (i7 == Integer.MAX_VALUE ? strD : Integer.valueOf(i7));
                        }
                        strO0 = r320.o0(str, strD);
                    } else {
                        strO0 = null;
                    }
                    ix7Var.b = strO0;
                } else if (iOrdinal == 3) {
                    iy7.c cVar = (iy7.c) iy7Var;
                    if (!cVar.equals(ax7.b(mz7.h0, hy7Var)) || zBooleanValue) {
                        String strD2 = sn5.d(r320Var, R.string.component_odds_filters__max, new Object[0]);
                        Iterator it2 = fy7.b.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                        } while (!Intrinsics.g(((Pair) next2).b, cVar));
                        Pair pair2 = (Pair) next2;
                        if (pair2 == null || (str2 = (String) pair2.a) == null) {
                            String strA3 = gky.a(String.valueOf(cVar.a));
                            d = cVar.b;
                            if (d == 2.147483647E9d) {
                                strA = strD2;
                            } else {
                                strA = gky.a(String.valueOf(d));
                            }
                            strA2 = oxc.a(strA3, "~", strA);
                        } else {
                            List listSplit$default = StringsKt__StringsKt.split$default(str2, new String[]{"~"}, false, 0, 6, null);
                            strA2 = listSplit$default.size() == 2 ? oxc.a(gky.a((String) listSplit$default.get(0)), "~", gky.a((String) listSplit$default.get(1))) : gky.a.a(str2, false);
                            if (strA2 == null) {
                                String strA4 = gky.a(String.valueOf(cVar.a));
                                d = cVar.b;
                                if (d == 2.147483647E9d) {
                                    strA = strD2;
                                } else {
                                    strA = gky.a(String.valueOf(d));
                                }
                                strA2 = oxc.a(strA4, "~", strA);
                            }
                        }
                        strO1 = r320.o0(strA2, strD2);
                    } else {
                        strO1 = null;
                    }
                    ix7Var.c = strO1;
                } else if (iOrdinal == 4) {
                    ix7Var.d = !ax7.a((iy7.d) iy7Var, (iy7.d) ax7.b(mz7.h0, hy7Var));
                }
            }
            r320Var.y0(r320Var.H, false);
        } else {
            th = null;
        }
        kz1 kz1Var2 = r320Var.C;
        if (kz1Var2 == null) {
            Intrinsics.n("adapter");
            throw th;
        }
        kz1Var2.f();
        mz7 mz7VarR0 = r320Var.r0();
        BookingCodeFilterDto bookingCodeFilterDtoCopy$default = r320Var.r0().T;
        bookingCodeFilterDtoCopy$default.getClass();
        if (iy7Var != null) {
            if (iy7Var instanceof iy7.b) {
                iy7.b bVar2 = (iy7.b) iy7Var;
                bookingCodeFilterDtoCopy$default = BookingCodeFilterDto.copy$default(bookingCodeFilterDtoCopy$default, false, b.k(Integer.valueOf(bVar2.a), Integer.valueOf(bVar2.b)), 0, null, null, null, null, null, 253, null);
            } else if (iy7Var instanceof iy7.c) {
                iy7.c cVar2 = (iy7.c) iy7Var;
                bookingCodeFilterDtoCopy$default = BookingCodeFilterDto.copy$default(bookingCodeFilterDtoCopy$default, false, null, 0, b.k(Double.valueOf(cVar2.a), Double.valueOf(cVar2.b)), null, null, null, null, 247, null);
            } else if (iy7Var instanceof iy7.e) {
                iy7.e eVar2 = (iy7.e) iy7Var;
                bookingCodeFilterDtoCopy$default = BookingCodeFilterDto.copy$default(bookingCodeFilterDtoCopy$default, false, null, 0, null, null, eVar2.a, eVar2.b, null, 159, null);
            } else if (iy7Var instanceof iy7.d) {
                bookingCodeFilterDtoCopy$default = BookingCodeFilterDto.copy$default(bookingCodeFilterDtoCopy$default, false, null, 0, null, ((iy7.d) iy7Var).a, null, null, null, 239, null);
            } else if (!(iy7Var instanceof iy7.a)) {
                uhc.a();
                return th;
            }
        }
        BookingCodeFilterDto bookingCodeFilterDto = bookingCodeFilterDtoCopy$default;
        w320 w320Var = new w320(2, r320Var, r320.class, "sendFilterEvent", "sendFilterEvent(ZLcom/sporty/android/core/model/bookingcode/BookingCodeFilterDto;)V", 0);
        bookingCodeFilterDto.getClass();
        mz7VarR0.a0 = 0;
        mz7VarR0.G.m(Boolean.FALSE);
        boolean zG = Intrinsics.g(BookingCodeFilterDto.copy$default(bookingCodeFilterDto, true, null, 0, null, BookingCodeFilterDto.SortBy.copy$default(bookingCodeFilterDto.getSortBy(), null, 0, null, 5, null), null, null, null, 234, null), mz7.h0);
        mz7VarR0.T = BookingCodeFilterDto.copy$default(bookingCodeFilterDto, zG, null, 0, null, BookingCodeFilterDto.SortBy.copy$default(bookingCodeFilterDto.getSortBy(), null, 0, null, 5, null), null, null, null, 234, null);
        mz7VarR0.E1();
        w320Var.invoke(Boolean.valueOf(zG), mz7VarR0.T);
        mz7VarR0.B1(mz7VarR0.T, false);
        r320Var.H = hy7.f;
        return Unit.a;
    }
}
