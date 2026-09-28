package defpackage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.f;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.utils.bet.MultipleBetUtils$getMultipleBetCombinationData$2", f = "MultipleBetUtils.kt", l = {}, m = "invokeSuspend", v = 2)
public final class qmw extends tje0 implements Function2<v5b, v1b<? super mmw>, Object> {
    public final /* synthetic */ nmw a;
    public final /* synthetic */ rmw b;
    public final /* synthetic */ wr4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qmw(nmw nmwVar, rmw rmwVar, wr4 wr4Var, v1b<? super qmw> v1bVar) {
        super(2, v1bVar);
        this.a = nmwVar;
        this.b = rmwVar;
        this.c = wr4Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qmw(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super mmw> v1bVar) {
        return ((qmw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:105:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cf  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        Sequence yc80Var;
        int i;
        Object next;
        BigDecimal bigDecimalMultiply;
        Iterator it;
        qmw qmwVar = this;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        nmw nmwVar = qmwVar.a;
        if (!nmwVar.d) {
            return mmw.g;
        }
        List listA0 = CollectionsKt.A0(nmwVar.c.values());
        BigDecimal bigDecimal = BigDecimal.ZERO;
        listA0.getClass();
        Throwable th = null;
        if (listA0.isEmpty()) {
            yc80Var = new yc80(new qh6(listA0, null));
            break;
        }
        Iterator it2 = listA0.iterator();
        while (true) {
            if (!it2.hasNext()) {
                yc80Var = new yc80(new qh6(listA0, null));
                break;
            }
            if (((List) it2.next()).isEmpty()) {
                yc80Var = s3g.a;
                break;
            }
        }
        Iterator it3 = yc80Var.iterator();
        BigDecimal bigDecimalMin = bigDecimal;
        BigDecimal bigDecimalAdd = bigDecimalMin;
        BigDecimal bigDecimalMin2 = bigDecimalAdd;
        BigDecimal bigDecimalAdd2 = bigDecimalMin2;
        long j = 0;
        int i2 = 0;
        while (it3.hasNext()) {
            List list = (List) it3.next();
            i9p.e(qmwVar.getContext());
            j++;
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                arrayList.add(((cz2) it4.next()).d);
            }
            BigDecimal bigDecimalMultiply2 = BigDecimal.ONE;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj2 = arrayList.get(i3);
                i3++;
                bigDecimalMultiply2 = bigDecimalMultiply2.multiply((BigDecimal) obj2);
                th = th;
            }
            Throwable th2 = th;
            bigDecimalMin = bigDecimalMin.compareTo(BigDecimal.ZERO) > 0 ? bigDecimalMin.min(bigDecimalMultiply2) : bigDecimalMultiply2;
            bigDecimalAdd.getClass();
            bigDecimalMultiply2.getClass();
            bigDecimalAdd = bigDecimalAdd.add(bigDecimalMultiply2);
            bigDecimalAdd.getClass();
            wr4 wr4Var = qmwVar.c;
            boolean z = wr4Var instanceof wr4.b;
            if (z) {
                BigDecimal bigDecimalA = s5y.a(((wr4.b) wr4Var).b);
                if (list.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it5 = list.iterator();
                    i = 0;
                    while (it5.hasNext()) {
                        if (((cz2) it5.next()).d.compareTo(bigDecimalA) >= 0 && (i = i + 1) < 0) {
                            b.p();
                            throw th2;
                        }
                    }
                }
            } else {
                i = 0;
            }
            if (i2 < i) {
                i2 = i;
            }
            if (z) {
                wr4.b bVar = (wr4.b) wr4Var;
                BigDecimal bigDecimalA2 = s5y.a(bVar.b);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (((cz2) obj3).d.compareTo(bigDecimalA2) >= 0) {
                        arrayList2.add(obj3);
                    }
                }
                if (arrayList2.isEmpty()) {
                    bigDecimalMultiply = BigDecimal.ZERO;
                    bigDecimalMultiply.getClass();
                } else {
                    Iterator<T> it6 = bVar.e.iterator();
                    do {
                        if (!it6.hasNext()) {
                            next = th2;
                            break;
                        }
                        next = it6.next();
                    } while (((wr4.b.a) next).a != arrayList2.size());
                    wr4.b.a aVar = (wr4.b.a) next;
                    if (aVar == null) {
                        bigDecimalMultiply = BigDecimal.ZERO;
                        bigDecimalMultiply.getClass();
                    } else {
                        ArrayList arrayList3 = new ArrayList(l48.r(arrayList2, 10));
                        int size2 = arrayList2.size();
                        int i4 = 0;
                        while (i4 < size2) {
                            Object obj4 = arrayList2.get(i4);
                            i4++;
                            cz2 cz2Var = (cz2) obj4;
                            arrayList3.add(cz2Var.d.multiply(cz2Var.e));
                        }
                        BigDecimal bigDecimalMultiply3 = BigDecimal.ONE;
                        int size3 = arrayList3.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            Object obj5 = arrayList3.get(i5);
                            i5++;
                            bigDecimalMultiply3 = bigDecimalMultiply3.multiply((BigDecimal) obj5);
                        }
                        bigDecimalMultiply = BigDecimal.ZERO;
                        if (bigDecimalMultiply3.compareTo(bigDecimalMultiply) == 0) {
                            bigDecimalMultiply.getClass();
                        } else {
                            ArrayList arrayList4 = new ArrayList(l48.r(arrayList2, 10));
                            int size4 = arrayList2.size();
                            int i6 = 0;
                            while (i6 < size4) {
                                Object obj6 = arrayList2.get(i6);
                                i6++;
                                arrayList4.add(((cz2) obj6).d);
                            }
                            BigDecimal bigDecimalAdd3 = BigDecimal.ZERO;
                            int size5 = arrayList4.size();
                            int i7 = 0;
                            while (i7 < size5) {
                                Object obj7 = arrayList4.get(i7);
                                i7++;
                                bigDecimalAdd3 = bigDecimalAdd3.add((BigDecimal) obj7);
                                it3 = it3;
                            }
                            it = it3;
                            bigDecimalMultiply = BigDecimal.ZERO;
                            if (bigDecimalAdd3.compareTo(bigDecimalMultiply) == 0) {
                                bigDecimalMultiply.getClass();
                            } else {
                                int size6 = arrayList2.size();
                                int i8 = 0;
                                while (i8 < size6) {
                                    Object obj8 = arrayList2.get(i8);
                                    i8++;
                                    cz2 cz2Var2 = (cz2) obj8;
                                    int i9 = size6;
                                    BigDecimal bigDecimal2 = cz2Var2.d;
                                    bigDecimalMultiply = bigDecimalMultiply.add(bigDecimal2.multiply(cz2Var2.e).multiply(bigDecimal2));
                                    size6 = i9;
                                }
                                BigDecimal bigDecimalDivide = bigDecimalMultiply.divide(bigDecimalAdd3, 4, RoundingMode.HALF_UP);
                                BigDecimal bigDecimal3 = bigDecimalMultiply3.compareTo(bigDecimalDivide) < 0 ? (BigDecimal) f.i(bigDecimalDivide.multiply(s5y.a(bVar.a)).divide(bigDecimalMultiply3, 2, RoundingMode.FLOOR).subtract(BigDecimal.ONE), s5y.a(aVar.b), s5y.a(aVar.c)) : BigDecimal.ZERO;
                                ArrayList arrayList5 = new ArrayList(l48.r(arrayList2, 10));
                                int size7 = arrayList2.size();
                                int i10 = 0;
                                while (i10 < size7) {
                                    Object obj9 = arrayList2.get(i10);
                                    i10++;
                                    arrayList5.add(((cz2) obj9).d);
                                }
                                BigDecimal bigDecimalMultiply4 = BigDecimal.ONE;
                                int size8 = arrayList5.size();
                                int i11 = 0;
                                while (i11 < size8) {
                                    Object obj10 = arrayList5.get(i11);
                                    i11++;
                                    bigDecimalMultiply4 = bigDecimalMultiply4.multiply((BigDecimal) obj10);
                                }
                                bigDecimalMultiply = bigDecimalMultiply4.multiply(bigDecimal3);
                                bigDecimalMultiply.getClass();
                            }
                        }
                        if (bigDecimalMin2.compareTo(BigDecimal.ZERO) > 0) {
                            bigDecimalMin2 = bigDecimalMin2.min(bigDecimalMultiply);
                        } else {
                            bigDecimalMin2 = bigDecimalMultiply;
                        }
                        bigDecimalAdd2.getClass();
                        bigDecimalAdd2 = bigDecimalAdd2.add(bigDecimalMultiply);
                        bigDecimalAdd2.getClass();
                        qmwVar = this;
                        th = th2;
                        it3 = it;
                    }
                }
            } else {
                bigDecimalMultiply = BigDecimal.ZERO;
                bigDecimalMultiply.getClass();
            }
            it = it3;
            if (bigDecimalMin2.compareTo(BigDecimal.ZERO) > 0) {
                bigDecimalMin2 = bigDecimalMin2.min(bigDecimalMultiply);
            } else {
                bigDecimalMin2 = bigDecimalMultiply;
            }
            bigDecimalAdd2.getClass();
            bigDecimalAdd2 = bigDecimalAdd2.add(bigDecimalMultiply);
            bigDecimalAdd2.getClass();
            qmwVar = this;
            th = th2;
            it3 = it;
        }
        bigDecimalMin.getClass();
        bigDecimalAdd.getClass();
        bigDecimalMin2.getClass();
        bigDecimalAdd2.getClass();
        return new mmw(j, bigDecimalMin, bigDecimalAdd, bigDecimalMin2, bigDecimalAdd2, i2);
    }
}
