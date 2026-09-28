package defpackage;

import com.sporty.android.core.model.promotion.ActivityItem;
import com.sporty.android.core.model.promotion.PromotionInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.plugin.common.AZMenuViewModel$fetchPromotionInfo$1", f = "AZMenuViewModel.kt", l = {162}, m = "invokeSuspend", v = 2)
public final class g1 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ c1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(c1 c1Var, v1b<? super g1> v1bVar) {
        super(2, v1bVar);
        this.b = c1Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new g1(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((g1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i;
        int i2;
        String str;
        String str2;
        Object next;
        g530 g530Var;
        y5b y5bVar = y5b.a;
        int i3 = this.a;
        c1 c1Var = this.b;
        if (i3 == 0) {
            uj50.b(obj);
            h530 h530Var = c1Var.a;
            this.a = 1;
            obj = h530Var.g(1, this, "android");
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        lk50 lk50Var = (lk50) obj;
        if (lk50Var instanceof lk50.c) {
            PromotionInfo promotionInfo = (PromotionInfo) ((lk50.c) lk50Var).a;
            promotionInfo.getClass();
            List<ActivityItem> entityList = promotionInfo.getActivityItemPageable().getEntityList();
            ArrayList arrayList = new ArrayList();
            for (ActivityItem activityItem : entityList) {
                n530.a aVar = n530.b;
                int status = activityItem.getStatus();
                aVar.getClass();
                Iterator<T> it = n530.e.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((n530) next).a != status);
                n530 n530Var = (n530) next;
                if (n530Var == null) {
                    itf0.a aVar2 = itf0.a;
                    aVar2.q("PromotionDtoMapper");
                    aVar2.n("Dropping activity " + activityItem.getActivityId() + " with unknown status=" + activityItem.getStatus(), new Object[0]);
                    g530Var = null;
                } else {
                    g530Var = new g530(activityItem.getActivityId(), activityItem.getActivityName(), n530Var, c.u(activityItem.getActivityName(), "[Features]", false));
                }
                if (g530Var != null) {
                    arrayList.add(g530Var);
                }
            }
            int ongoingCount = promotionInfo.getOngoingCount();
            wwd0 wwd0Var = c1Var.z;
            do {
                value = wwd0Var.getValue();
                m1 m1Var = (m1) value;
                m1Var.getClass();
                if (arrayList.isEmpty()) {
                    i = 0;
                } else {
                    int size = arrayList.size();
                    i = 0;
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj2 = arrayList.get(i4);
                        i4++;
                        g530 g530Var2 = (g530) obj2;
                        if (g530Var2.d && g530Var2.c == n530.Ongoing && (i = i + 1) < 0) {
                            b.p();
                            throw null;
                        }
                    }
                }
                i2 = ongoingCount - i;
                if (i2 < 0) {
                    i2 = 0;
                }
                str = m1Var.a;
                str2 = m1Var.c;
                str.getClass();
                str2.getClass();
            } while (!wwd0Var.g(value, new m1(str, i2, str2, i)));
        } else if (lk50Var instanceof lk50.a) {
            itf0.a.d("fetchPromotionInfo failed: " + ((lk50.a) lk50Var).b, new Object[0]);
        } else if (!Intrinsics.g(lk50Var, lk50.b.a)) {
            uhc.a();
            return null;
        }
        return Unit.a;
    }
}
