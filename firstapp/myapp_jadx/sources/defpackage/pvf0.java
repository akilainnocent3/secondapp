package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.timeAlert.viewmodel.TimeAlertViewModel$buildUI$1", f = "TimeAlertViewModel.kt", l = {35}, m = "invokeSuspend", v = 2)
public final class pvf0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ tvf0 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ tvf0 a;

        public a(tvf0 tvf0Var) {
            this.a = tvf0Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            auf0 auf0Var;
            T next;
            ltf0 ltf0Var = (ltf0) obj;
            tvf0 tvf0Var = this.a;
            wwd0 wwd0Var = tvf0Var.a;
            nvf0 nvf0Var = tvf0Var.e;
            nvf0Var.getClass();
            ltf0Var.getClass();
            Integer num = ltf0Var.a;
            Map<Integer, Integer> map = nvf0Var.a;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int iIntValue = entry.getKey().intValue();
                int iIntValue2 = entry.getValue().intValue();
                Object[] objArr = {Integer.valueOf(iIntValue2)};
                StringUiText stringUiText = vch0.a;
                arrayList.add(new auf0(iIntValue, iIntValue2, new ResourceUiText(R.string.page_time_alerts__vnum_minutes, ay0.S(objArr))));
            }
            uf00 uf00VarF = a4h.f(arrayList);
            if (num != null) {
                int iIntValue3 = num.intValue() / 60;
                Iterator<T> it = map.entrySet().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((Number) ((Map.Entry) next).getValue()).intValue() != iIntValue3);
                Map.Entry entry2 = (Map.Entry) next;
                int iIntValue4 = entry2 != null ? ((Number) entry2.getKey()).intValue() : 0;
                Object[] objArr2 = {Integer.valueOf(iIntValue3)};
                StringUiText stringUiText2 = vch0.a;
                auf0Var = new auf0(iIntValue4, iIntValue3, new ResourceUiText(R.string.page_time_alerts__vnum_minutes, ay0.S(objArr2)));
            } else {
                auf0Var = new auf0(0);
            }
            ovf0 ovf0Var = new ovf0(uf00VarF, auf0Var, num != null, 24);
            tvf0Var.v = ovf0Var.b;
            wwd0Var.getClass();
            wwd0Var.k(null, ovf0Var);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pvf0(tvf0 tvf0Var, v1b<? super pvf0> v1bVar) {
        super(2, v1bVar);
        this.b = tvf0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pvf0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pvf0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            tvf0 tvf0Var = this.b;
            lyh lyhVarB = uzh.b(new qtf0(vtf0.b.a(tvf0Var.f.a.a, vtf0.a[0]).k()));
            a aVar = new a(tvf0Var);
            this.a = 1;
            if (lyhVarB.collect(aVar, this) == y5bVar) {
                return y5bVar;
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
