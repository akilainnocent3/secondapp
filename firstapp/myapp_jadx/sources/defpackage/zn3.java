package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.settings.betslip.BetslipCustomizationSettingsViewModel$load$1", f = "BetslipCustomizationSettingsViewModel.kt", l = {54}, m = "invokeSuspend", v = 2)
public final class zn3 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ao3 b;

    @c0d(c = "com.sporty.android.platform.features.settings.betslip.BetslipCustomizationSettingsViewModel$load$1$result$1", f = "BetslipCustomizationSettingsViewModel.kt", l = {54}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super lk50<? extends wy3>>, Object> {
        public int a;
        public final /* synthetic */ ao3 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ao3 ao3Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = ao3Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super lk50<? extends wy3>> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            gy3 gy3Var = this.b.a;
            this.a = 1;
            Object objB = gy3Var.b(true, this);
            return objB == y5bVar ? y5bVar : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn3(ao3 ao3Var, v1b<? super zn3> v1bVar) {
        super(2, v1bVar);
        this.b = ao3Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zn3(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zn3) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ao3 ao3Var = this.b;
        wwd0 wwd0Var = ao3Var.e;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wwd0Var.setValue(m2x.c.a);
            odd oddVar = ao3Var.d;
            a aVar = new a(ao3Var, null);
            this.a = 1;
            obj = ej5.d(oddVar, aVar, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        lk50 lk50Var = (lk50) obj;
        int i2 = 0;
        if (lk50Var instanceof lk50.c) {
            gvw gvwVar = ao3Var.b;
            List<iw3> list = ((wy3) ((lk50.c) lk50Var).a).b;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((iw3) obj2).e) {
                    arrayList.add(obj2);
                }
            }
            gvwVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj3 = arrayList.get(i3);
                i3++;
                if (((iw3) obj3).e) {
                    arrayList2.add(obj3);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size2 = arrayList2.size();
            while (i2 < size2) {
                Object obj4 = arrayList2.get(i2);
                i2++;
                String str = ((iw3) obj4).d;
                Object objA = linkedHashMap.get(str);
                if (objA == null) {
                    objA = r9i.a(str, linkedHashMap);
                }
                ((List) objA).add(obj4);
            }
            ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                List<iw3> list2 = (List) entry.getValue();
                ArrayList arrayList4 = new ArrayList(l48.r(list2, 10));
                for (iw3 iw3Var : list2) {
                    arrayList4.add(new mof0(iw3Var.a, iw3Var.c, gvwVar.a.e(iw3Var.b), iw3Var.f));
                }
                arrayList3.add(new fof0(str2, arrayList4));
            }
            m2x.a aVar2 = new m2x.a(new hvw(arrayList3), null, null);
            wwd0Var.getClass();
            wwd0Var.k(null, aVar2);
        } else if (lk50Var instanceof lk50.a) {
            itf0.a aVar3 = itf0.a;
            aVar3.q("BetslipSettings");
            aVar3.f(((lk50.a) lk50Var).a, "Load themes failed", new Object[0]);
            StringUiText stringUiText = vch0.a;
            m2x.b bVar = new m2x.b(new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again_later));
            wwd0Var.getClass();
            wwd0Var.k(null, bVar);
        } else if (!Intrinsics.g(lk50Var, lk50.b.a)) {
            uhc.a();
            return null;
        }
        return Unit.a;
    }
}
