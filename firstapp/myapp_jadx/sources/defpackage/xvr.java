package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class xvr {
    public final /* synthetic */ zvr a;

    public xvr(zvr zvrVar) {
        this.a = zvrVar;
    }

    public final ArrayList a(final int i) {
        ArrayList arrayList = new ArrayList();
        c5a0.a aVar = c5a0.e;
        zvr zvrVar = this.a;
        aVar.getClass();
        c5a0 c5a0VarA = c5a0.a.a();
        Function1<Object, Unit> function1E = c5a0VarA != null ? c5a0VarA.e() : null;
        c5a0 c5a0VarB = c5a0.a.b(c5a0VarA);
        try {
            final gvr gvrVar = zvrVar.b ? zvrVar.c : (gvr) ((x5a0) zvrVar.e).getValue();
            if (gvrVar != null) {
                final bq40 bq40Var = new bq40();
                bq40Var.a = 1;
                final List<Pair<Integer, kxa>> listInvoke = gvrVar.k.invoke(Integer.valueOf(i));
                int size = listInvoke.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Pair<Integer, kxa> pair = listInvoke.get(i2);
                    bq40Var = bq40Var;
                    final ArrayList arrayList2 = null;
                    arrayList.add(zvrVar.o.a(pair.a.intValue(), pair.b.a, false, new Function1(arrayList2, bq40Var, listInvoke, i, gvrVar) { // from class: wvr
                        public final /* synthetic */ List a;
                        public final /* synthetic */ bq40 b;
                        public final /* synthetic */ List c;
                        public final /* synthetic */ gvr d;

                        {
                            this.d = gvrVar;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            gyr.c cVar = (gyr.c) obj;
                            int iB = cVar.b();
                            int iA = 0;
                            for (int i3 = 0; i3 < iB; i3++) {
                                iA += (int) (this.d.q == i3z.a ? cVar.a(i3) & 4294967295L : cVar.a(i3) >> 32);
                            }
                            List list = this.a;
                            if (list != null) {
                                list.add(Integer.valueOf(iA));
                            }
                            bq40 bq40Var2 = this.b;
                            if (bq40Var2.a != this.c.size()) {
                                bq40Var2.a++;
                            }
                            return Unit.a;
                        }
                    }));
                }
                Unit unit = Unit.a;
            }
            return arrayList;
        } finally {
            c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
        }
    }
}
