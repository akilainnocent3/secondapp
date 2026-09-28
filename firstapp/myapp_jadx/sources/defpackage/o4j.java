package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class o4j extends j8i0 {
    public final wwd0 a;
    public final wwd0 b;
    public final wwd0 c;
    public final v340 d;
    public final ju90<a8j> e;
    public final t340 f;

    @c0d(c = "com.sportygames.fruithunt.views.chips.FruitHuntChipsViewModel$1", f = "FruitHuntChipsViewModel.kt", l = {60}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<d4j, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = o4j.this.new a(v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(d4j d4jVar, v1b<? super Unit> v1bVar) {
            return ((a) create(d4jVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            d4j d4jVar = (d4j) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                Iterator<mk2> it = d4jVar.c.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (Math.abs(it.next().b - d4jVar.b) < 1.0E-5d) {
                        break;
                    }
                    i2++;
                }
                Integer num = new Integer(i2);
                int iIntValue = num.intValue();
                if (iIntValue < 0 || iIntValue >= d4jVar.c.size()) {
                    num = null;
                }
                if (num != null) {
                    int iIntValue2 = num.intValue();
                    wwd0 wwd0Var = o4j.this.c;
                    Integer num2 = new Integer(iIntValue2);
                    this.b = null;
                    this.a = 1;
                    wwd0Var.getClass();
                    wwd0Var.k(null, num2);
                    if (Unit.a == y5bVar) {
                        return y5bVar;
                    }
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

    @c0d(c = "com.sportygames.fruithunt.views.chips.FruitHuntChipsViewModel$2", f = "FruitHuntChipsViewModel.kt", l = {66}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements gaj<Integer, d4j, v1b<? super mk2>, Object> {
        public mk2 a;
        public int b;
        public /* synthetic */ int c;
        public /* synthetic */ d4j d;

        public b(v1b<? super b> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(Integer num, d4j d4jVar, v1b<? super mk2> v1bVar) {
            int iIntValue = num.intValue();
            b bVar = o4j.this.new b(v1bVar);
            bVar.c = iIntValue;
            bVar.d = d4jVar;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            int i = this.c;
            d4j d4jVar = this.d;
            y5b y5bVar = y5b.a;
            int i2 = this.b;
            if (i2 != 0) {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mk2 mk2Var = this.a;
                uj50.b(obj);
                return mk2Var;
            }
            uj50.b(obj);
            mk2 mk2Var2 = (mk2) CollectionsKt.V(i, d4jVar.c);
            if (mk2Var2 == null) {
                return null;
            }
            ju90<a8j> ju90Var = o4j.this.e;
            a8j.a aVar = new a8j.a(mk2Var2.b);
            this.d = null;
            this.a = mk2Var2;
            this.c = i;
            this.b = 1;
            return ju90Var.a.emit(aVar, this) == y5bVar ? y5bVar : mk2Var2;
        }
    }

    @c0d(c = "com.sportygames.fruithunt.views.chips.FruitHuntChipsViewModel$uiState$1", f = "FruitHuntChipsViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements iaj<d4j, Boolean, Integer, v1b<? super e4j>, Object> {
        public /* synthetic */ d4j a;
        public /* synthetic */ boolean b;
        public /* synthetic */ int c;

        @Override // defpackage.iaj
        public final Object d(d4j d4jVar, Boolean bool, Integer num, v1b<? super e4j> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            int iIntValue = num.intValue();
            c cVar = new c(4, v1bVar);
            cVar.a = d4jVar;
            cVar.b = zBooleanValue;
            cVar.c = iIntValue;
            return cVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0054  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z;
            boolean z2;
            d4j d4jVar = this.a;
            boolean z3 = this.b;
            int i = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (i < 0) {
                return null;
            }
            qcn<mk2> qcnVar = d4jVar.c;
            qcn<mk2> qcnVar2 = d4jVar.c;
            if (i >= qcnVar.size()) {
                return null;
            }
            double d = d4jVar.e;
            double d2 = d4jVar.d;
            boolean z4 = d4jVar.a;
            ArrayList arrayList = new ArrayList(l48.r(qcnVar2, 10));
            int i2 = 0;
            for (mk2 mk2Var : qcnVar2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                mk2 mk2Var2 = mk2Var;
                d4j d4jVar2 = d4jVar;
                if (z4) {
                    double d3 = mk2Var2.b;
                    if (d2 > d3 || d3 > d) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                } else {
                    z2 = true;
                }
                arrayList.add(new w3j(mk2Var2.a, fl7.a(mk2Var2.b), z2, i2 == i, z3 && i2 == i));
                i2 = i3;
                d4jVar = d4jVar2;
            }
            d4j d4jVar3 = d4jVar;
            if (!z4 || (qcnVar2 != null && qcnVar2.isEmpty())) {
                z = false;
                break;
            }
            Iterator<mk2> it = qcnVar2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                double d4 = it.next().b;
                if (d2 <= d4 && d4 <= d) {
                    z = true;
                    break;
                }
            }
            String str = d4jVar3.f;
            if (str == null) {
                str = "";
            }
            return new e4j(z, z3, i, str, a4h.f(arrayList));
        }
    }

    public o4j(k5b k5bVar) {
        k5bVar.getClass();
        wwd0 wwd0VarA = xwd0.a(new d4j(0));
        this.a = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(Boolean.FALSE);
        this.b = wwd0VarA2;
        wwd0 wwd0VarA3 = xwd0.a(0);
        this.c = wwd0VarA3;
        f1i f1iVar = new f1i(r1i.a(wwd0VarA, wwd0VarA2, wwd0VarA3, new c(4, null)));
        this.d = e1i.e(ozh.c(f1iVar, k5bVar), o8i0.d(this), q490.a.a, new e4j(0));
        ju90<a8j> ju90Var = new ju90<>();
        this.e = ju90Var;
        this.f = e1i.a(ju90Var);
        kzh.d(ozh.c(new g1i(wwd0VarA, new a(null)), k5bVar), o8i0.d(this));
        kzh.d(new n1i(wwd0VarA3, wwd0VarA, new b(null)), o8i0.d(this));
    }
}
