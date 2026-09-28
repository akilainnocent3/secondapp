package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class gan {
    public static final void a(List list, final boolean z, float f, int i, a aVar, final int i2) {
        final float f2;
        final int i3;
        final List list2 = list;
        list2.getClass();
        b bVarI = aVar.i(-935352232);
        int i4 = (bVarI.M(list2) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i4 |= bVarI.b(z) ? 32 : 16;
        }
        int i5 = i4 | 3456;
        if (bVarI.q(i5 & 1, (i5 & 1171) != 1170)) {
            final float f3 = 80.0f;
            if (!z || list2.isEmpty()) {
                e eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: ban
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            gan.a(list2, z, f3, 3, (a) obj, qj40.a(i2 | 1));
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            m9n m9nVarA = qw90.a(context);
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            boolean zM = bVarI.M(mmdVar);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = Integer.valueOf(mmdVar.y0(80.0f));
                bVarI.r(objY);
            }
            int iIntValue = ((Number) objY).intValue();
            int i6 = i5 & 14;
            boolean z2 = i6 == 4;
            Object objY2 = bVarI.y();
            if (z2 || objY2 == c0042a) {
                Integer numValueOf = 1;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    numValueOf = Integer.valueOf(it.next().hashCode() + (numValueOf.intValue() * 31));
                }
                objY2 = Integer.valueOf(numValueOf.intValue());
                bVarI.r(objY2);
            }
            Integer numValueOf2 = Integer.valueOf(((Number) objY2).intValue());
            Integer numValueOf3 = Integer.valueOf(iIntValue);
            boolean zA = bVarI.A(m9nVarA) | bVarI.A(context) | (i6 == 4) | bVarI.d(iIntValue);
            Object objY3 = bVarI.y();
            if (zA || objY3 == c0042a) {
                dan danVar = new dan(m9nVarA, context, list, iIntValue, null);
                list2 = list;
                bVarI.r(danVar);
                objY3 = danVar;
            } else {
                list2 = list;
            }
            xvf.f(numValueOf2, numValueOf3, 3, (Function2) objY3, bVarI);
            f2 = 80.0f;
            i3 = 3;
        } else {
            bVarI.G();
            f2 = f;
            i3 = i;
        }
        e eVarZ2 = bVarI.Z();
        if (eVarZ2 != null) {
            eVarZ2.d = new Function2() { // from class: can
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gan.a(list2, z, f2, i3, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static Object b(m9n m9nVar, Context context, List list, Integer num, tje0 tje0Var, int i) {
        if ((i & 4) != 0) {
            num = null;
        }
        Object objD = w5b.d(new ean(list, 3, m9nVar, context, num, null), tje0Var);
        return objD == y5b.a ? objD : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(m9n m9nVar, Context context, Object obj, Integer num, boolean z, x1b x1bVar) {
        fan fanVar;
        if (x1bVar instanceof fan) {
            fanVar = (fan) x1bVar;
            int i = fanVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                fanVar.b = i - Integer.MIN_VALUE;
            } else {
                fanVar = new fan(x1bVar);
            }
        } else {
            fanVar = new fan(x1bVar);
        }
        Object obj2 = fanVar.a;
        Object obj3 = y5b.a;
        int i2 = fanVar.b;
        if (i2 == 0) {
            uj50.b(obj2);
            nan.a aVar = new nan.a(context);
            aVar.c = obj;
            if (num != null) {
                aVar.e(num.intValue());
                aVar.s = dm20.b;
                aVar.r = vy60.b;
            } else {
                aVar.f(ww90.c);
            }
            wr5 wr5Var = wr5.c;
            aVar.l = wr5Var;
            aVar.m = wr5Var;
            abn.a(aVar, z);
            nan nanVarA = aVar.a();
            fanVar.b = 1;
            if (m9nVar.b(nanVarA, fanVar) == obj3) {
                return obj3;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj2);
        }
        return Unit.a;
    }

    public static final void d(m9n m9nVar, Context context, Object obj, boolean z) {
        obj.getClass();
        nan.a aVar = new nan.a(context);
        aVar.c = obj;
        aVar.f(ww90.c);
        wr5 wr5Var = wr5.c;
        aVar.l = wr5Var;
        aVar.m = wr5Var;
        abn.a(aVar, z);
        m9nVar.a(aVar.a());
    }
}
