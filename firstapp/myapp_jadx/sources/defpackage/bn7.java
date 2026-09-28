package defpackage;

import com.sporty.android.common.uievent.a;
import com.sportybet.android.bethistory.data.dto.RealBetHistoryOrderDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbn7;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class bn7 extends j8i0 {
    public final tm7 a;
    public final uqm b;
    public final oia0 c;
    public final ku90<a> d;
    public final ku90<Unit> e;
    public final wwd0 f;
    public final v340 i;
    public final wwd0 v;
    public final v340 w;
    public final wwd0 y;
    public final v340 z;

    public bn7(tm7 tm7Var, uqm uqmVar, oia0 oia0Var) {
        uqmVar.getClass();
        this.a = tm7Var;
        this.b = uqmVar;
        this.c = oia0Var;
        this.d = new ku90<>();
        this.e = new ku90<>();
        wwd0 wwd0VarA = xwd0.a(hw2.b.a);
        this.f = wwd0VarA;
        this.i = e1i.b(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(cm2.b.a);
        this.v = wwd0VarA2;
        this.w = e1i.b(wwd0VarA2);
        wwd0 wwd0VarA3 = xwd0.a(null);
        this.y = wwd0VarA3;
        this.z = e1i.e(new n1i(wwd0VarA2, wwd0VarA3, new wm7(3, null)), o8i0.d(this), q490.a.a, Boolean.FALSE);
    }

    public static ArrayList x1(List list) {
        ArrayList arrayList = new ArrayList(sm7.a(0L, list));
        RealBetHistoryOrderDto realBetHistoryOrderDto = (RealBetHistoryOrderDto) CollectionsKt.d0(list);
        if (realBetHistoryOrderDto == null) {
            return arrayList;
        }
        nr30 nr30Var = new nr30();
        nr30Var.f = realBetHistoryOrderDto.getOrderId();
        Long createTime = realBetHistoryOrderDto.getCreateTime();
        nr30Var.g = createTime != null ? createTime.longValue() : 0L;
        nr30Var.e = null;
        nr30Var.d = 10;
        nr30Var.a = list.size() == 10;
        nr30Var.h = arrayList.size() >= 10;
        arrayList.add(nr30Var);
        return arrayList;
    }

    public final void y1(String str, Function1<? super rm7, rm7> function1) {
        wwd0 wwd0Var = this.f;
        hw2 hw2Var = (hw2) wwd0Var.getValue();
        if (hw2Var instanceof hw2.f) {
            ArrayList<hl30> arrayList = ((hw2.f) hw2Var).a;
            ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Object obj2 = (hl30) obj;
                if ((obj2 instanceof rm7) && Intrinsics.g(((rm7) obj2).a.getOrderId(), str)) {
                    obj2 = (hl30) function1.invoke(obj2);
                }
                arrayList2.add(obj2);
            }
            hw2.f fVar = new hw2.f(new ArrayList(arrayList2));
            wwd0Var.getClass();
            wwd0Var.k(null, fVar);
        }
    }
}
