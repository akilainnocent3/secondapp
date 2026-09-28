package defpackage;

import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.presentation.StackerViewModel$observeGameUpdates$1", f = "StackerViewModel.kt", l = {152}, m = "invokeSuspend", v = 1)
public final class iqd0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ tqd0 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ tqd0 a;

        public a(tqd0 tqd0Var) {
            this.a = tqd0Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            int i;
            Object obj2;
            String strConcat;
            String strValueOf;
            uf4 uf4Var;
            zmd0 zmd0Var = (zmd0) obj;
            wwd0 wwd0Var = this.a.G;
            aqd0 aqd0Var = (aqd0) wwd0Var.getValue();
            List<List<mf4>> list = zmd0Var.a;
            List<Double> list2 = zmd0Var.c;
            List<Long> list3 = zmd0Var.d;
            list.getClass();
            list2.getClass();
            list3.getClass();
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            int i2 = 0;
            for (T t : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    b.q();
                    throw null;
                }
                List<mf4> list4 = (List) t;
                if (list2.get(i2).doubleValue() == 0.0d) {
                    i = i3;
                    strConcat = "";
                    obj2 = null;
                } else {
                    i = i3;
                    obj2 = null;
                    double dDoubleValue = list2.get(i2).doubleValue();
                    if (dDoubleValue < 100.0d) {
                        strValueOf = fu5.a("\\.?0+$", String.format("%,.2f", Arrays.copyOf(new Object[]{Double.valueOf(dDoubleValue)}, 1)), "");
                    } else if (dDoubleValue < 1000.0d) {
                        strValueOf = String.valueOf((int) dDoubleValue);
                    } else {
                        String strValueOf2 = String.valueOf((int) (dDoubleValue / 1000.0d));
                        strConcat = strValueOf2.length() == 2 ? strValueOf2.concat(xOgHBQVl.CQzeCqkm) : strValueOf2 + ',' + ((int) ((dDoubleValue % 1000.0d) / 100.0d)) + 'k';
                    }
                    strConcat = strValueOf;
                }
                long jLongValue = list3.get(i2).longValue();
                ArrayList arrayList2 = new ArrayList(l48.r(list4, 10));
                for (mf4 mf4Var : list4) {
                    if (Intrinsics.g(mf4Var, r1g.a)) {
                        uf4Var = uf4.e;
                    } else {
                        if (!(mf4Var instanceof nld0)) {
                            uhc.a();
                            return obj2;
                        }
                        int iOrdinal = ((nld0) mf4Var).a.ordinal();
                        if (iOrdinal == 0) {
                            uf4Var = uf4.a;
                        } else if (iOrdinal == 1) {
                            uf4Var = uf4.b;
                        } else if (iOrdinal == 2) {
                            uf4Var = uf4.c;
                        } else {
                            if (iOrdinal != 3) {
                                uhc.a();
                                return obj2;
                            }
                            uf4Var = uf4.d;
                        }
                    }
                    arrayList2.add(uf4Var);
                }
                arrayList.add(new bpd0(jLongValue, strConcat, a4h.f(arrayList2)));
                i2 = i;
            }
            uf00 uf00VarF = a4h.f(arrayList);
            wmd0 wmd0Var = new wmd0(uf00VarF);
            wmd0 wmd0Var2 = aqd0Var.d;
            wmd0Var2.getClass();
            qcn<bpd0> qcnVar = wmd0Var2.a;
            if (qcnVar.size() == uf00VarF.size()) {
                ArrayList arrayList3 = new ArrayList(l48.r(uf00VarF, 10));
                int i4 = 0;
                for (Object obj3 : uf00VarF) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        b.q();
                        throw null;
                    }
                    bpd0 bpd0Var = (bpd0) obj3;
                    bpd0 bpd0Var2 = qcnVar.get(i4);
                    qcn<uf4> qcnVar2 = bpd0Var2.c;
                    qcn<uf4> qcnVar3 = bpd0Var.c;
                    if (!Intrinsics.g(qcnVar2, qcnVar3)) {
                        int size = qcnVar3.size();
                        ArrayList arrayList4 = new ArrayList(size);
                        for (int i6 = 0; i6 < size; i6++) {
                            uf4 uf4Var2 = qcnVar2.get(i6);
                            uf4 uf4Var3 = qcnVar3.get(i6);
                            if (uf4Var2 != uf4Var3) {
                                uf4Var2 = uf4Var3;
                            }
                            arrayList4.add(uf4Var2);
                        }
                        uf00 uf00VarF2 = a4h.f(arrayList4);
                        String str = bpd0Var.b;
                        long j = bpd0Var2.a;
                        str.getClass();
                        uf00VarF2.getClass();
                        bpd0Var2 = new bpd0(j, str, uf00VarF2);
                    }
                    arrayList3.add(bpd0Var2);
                    i4 = i5;
                }
                uf00 uf00VarF3 = a4h.f(arrayList3);
                uf00VarF3.getClass();
                wmd0Var = new wmd0(uf00VarF3);
            }
            aqd0 aqd0VarA = aqd0.a(aqd0Var, zmd0Var.e, zmd0Var.b, zmd0Var.f, wmd0Var, null, 16);
            wwd0Var.getClass();
            wwd0Var.k(null, aqd0VarA);
            Unit unit = Unit.a;
            y5b y5bVar = y5b.a;
            return unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqd0(tqd0 tqd0Var, v1b<? super iqd0> v1bVar) {
        super(2, v1bVar);
        this.b = tqd0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new iqd0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((iqd0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return Unit.a;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        tqd0 tqd0Var = this.b;
        wwd0 wwd0VarInvoke = tqd0Var.c.invoke();
        a aVar = new a(tqd0Var);
        this.a = 1;
        wwd0VarInvoke.collect(new jqd0(aVar), this);
        return y5bVar;
    }
}
