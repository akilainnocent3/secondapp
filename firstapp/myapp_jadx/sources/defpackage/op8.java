package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class op8 implements Function2, gaj, iaj, jaj, kaj, laj, maj, naj, r9j, s9j, u9j, v9j, w9j, x9j, y9j, z9j, aaj, caj, daj {
    public final int a;
    public final boolean b;
    public Object c;
    public oj40 d;
    public ArrayList e;

    public /* synthetic */ class a extends pf implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            int iIntValue = num.intValue();
            ((op8) this.a).a(iIntValue, aVar);
            return Unit.a;
        }
    }

    public op8(int i, Object obj, boolean z) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }

    public final Object a(int i, androidx.compose.runtime.a aVar) {
        b bVarI = aVar.i(this.a);
        m(bVarI);
        int iA = i | (bVarI.M(this) ? pp8.a(2, 0) : pp8.a(1, 0));
        Object obj = this.c;
        obj.getClass();
        y8h0.d(2, obj);
        Object objInvoke = ((Function2) obj).invoke(bVarI, Integer.valueOf(iA));
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new a(2, this, op8.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }
        return objInvoke;
    }

    public final Object b(final Long l, final Object obj, final Integer num, final Long l2, final Long l3, final Integer num2, final Object obj2, androidx.compose.runtime.a aVar, final int i) {
        b bVarI = aVar.i(this.a);
        m(bVarI);
        int iA = bVarI.M(this) ? pp8.a(2, 7) : pp8.a(1, 7);
        Object obj3 = this.c;
        obj3.getClass();
        y8h0.d(9, obj3);
        Object objE = ((naj) obj3).e(l, obj, num, l2, l3, num2, obj2, bVarI, Integer.valueOf(i | iA));
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: np8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    this.a.b(l, obj, num, l2, l3, num2, obj2, (a) obj4, qj40.a(i) | 1);
                    return Unit.a;
                }
            };
        }
        return objE;
    }

    @Override // defpackage.iaj
    public final /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        return h(obj, obj2, (androidx.compose.runtime.a) obj3, ((Number) obj4).intValue());
    }

    @Override // defpackage.naj
    public final /* bridge */ /* synthetic */ Object e(Long l, Object obj, Integer num, Long l2, Long l3, Integer num2, Object obj2, Object obj3, Integer num3) {
        return b(l, obj, num, l2, l3, num2, obj2, (androidx.compose.runtime.a) obj3, num3.intValue());
    }

    @Override // defpackage.kaj
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return k(obj, obj2, obj3, obj4, (androidx.compose.runtime.a) obj5, ((Number) obj6).intValue());
    }

    public final Object g(final Object obj, androidx.compose.runtime.a aVar, final int i) {
        b bVarI = aVar.i(this.a);
        m(bVarI);
        int iA = bVarI.M(this) ? pp8.a(2, 1) : pp8.a(1, 1);
        Object obj2 = this.c;
        obj2.getClass();
        y8h0.d(3, obj2);
        Object objInvoke = ((gaj) obj2).invoke(obj, bVarI, Integer.valueOf(iA | i));
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: lp8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iA2 = qj40.a(i) | 1;
                    this.a.g(obj, (a) obj3, iA2);
                    return Unit.a;
                }
            };
        }
        return objInvoke;
    }

    public final Object h(final Object obj, final Object obj2, androidx.compose.runtime.a aVar, final int i) {
        b bVarI = aVar.i(this.a);
        m(bVarI);
        int iA = bVarI.M(this) ? pp8.a(2, 2) : pp8.a(1, 2);
        Object obj3 = this.c;
        obj3.getClass();
        y8h0.d(4, obj3);
        Object objD = ((iaj) obj3).d(obj, obj2, bVarI, Integer.valueOf(iA | i));
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: jp8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int iA2 = qj40.a(i) | 1;
                    this.a.h(obj, obj2, (a) obj4, iA2);
                    return Unit.a;
                }
            };
        }
        return objD;
    }

    public final Object i(final Object obj, final Object obj2, final Object obj3, androidx.compose.runtime.a aVar, final int i) {
        b bVarI = aVar.i(this.a);
        m(bVarI);
        int iA = bVarI.M(this) ? pp8.a(2, 3) : pp8.a(1, 3);
        Object obj4 = this.c;
        obj4.getClass();
        y8h0.d(5, obj4);
        Object objL = ((jaj) obj4).l(obj, obj2, obj3, bVarI, Integer.valueOf(iA | i));
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: kp8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    this.a.i(obj, obj2, obj3, (a) obj5, qj40.a(i) | 1);
                    return Unit.a;
                }
            };
        }
        return objL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a(((Number) obj2).intValue(), (androidx.compose.runtime.a) obj);
    }

    public final Object k(final Object obj, final Object obj2, final Object obj3, final Object obj4, androidx.compose.runtime.a aVar, final int i) {
        b bVarI = aVar.i(this.a);
        m(bVarI);
        int iA = bVarI.M(this) ? pp8.a(2, 4) : pp8.a(1, 4);
        Object obj5 = this.c;
        obj5.getClass();
        y8h0.d(6, obj5);
        Object objF = ((kaj) obj5).f(obj, obj2, obj3, obj4, bVarI, Integer.valueOf(iA | i));
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: mp8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    this.a.k(obj, obj2, obj3, obj4, (a) obj6, qj40.a(i) | 1);
                    return Unit.a;
                }
            };
        }
        return objF;
    }

    @Override // defpackage.jaj
    public final /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return i(obj, obj2, obj3, (androidx.compose.runtime.a) obj4, ((Number) obj5).intValue());
    }

    public final void m(androidx.compose.runtime.a aVar) {
        e eVarV;
        if (!this.b || (eVarV = aVar.v()) == null) {
            return;
        }
        aVar.E(eVarV);
        if (pp8.c(this.d, eVarV)) {
            this.d = eVarV;
            return;
        }
        ArrayList arrayList = this.e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.e = arrayList2;
            arrayList2.add(eVarV);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (pp8.c((oj40) arrayList.get(i), eVarV)) {
                arrayList.set(i, eVarV);
                return;
            }
        }
        arrayList.add(eVarV);
    }

    @Override // defpackage.gaj
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return g(obj, (androidx.compose.runtime.a) obj2, ((Number) obj3).intValue());
    }
}
