package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.rewardcenter.mission.presentation.LNMissionTabViewModel$startMission$2", f = "LNMissionTabViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class uuq extends tje0 implements Function2<lk50<? extends Unit>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ tuq b;
    public final /* synthetic */ int c;

    @c0d(c = "com.sportybet.feature.luckynumber.rewardcenter.mission.presentation.LNMissionTabViewModel$startMission$2$3", f = "LNMissionTabViewModel.kt", l = {179}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ tuq b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tuq tuqVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = tuqVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(300L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            this.b.x1();
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uuq(tuq tuqVar, int i, v1b<? super uuq> v1bVar) {
        super(2, v1bVar);
        this.b = tuqVar;
        this.c = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        uuq uuqVar = new uuq(this.b, this.c, v1bVar);
        uuqVar.a = obj;
        return uuqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Unit> lk50Var, v1b<? super Unit> v1bVar) {
        return ((uuq) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean zG = Intrinsics.g(lk50Var, lk50.b.a);
        int i = this.c;
        tuq tuqVar = this.b;
        if (zG) {
            tuqVar.A1(i, uxs.LOADING);
        } else if (lk50Var instanceof lk50.a) {
            tuqVar.A1(i, uxs.ENABLE);
            wwd0 wwd0Var = tuqVar.y;
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, a4h.h(yi80.c((ucn) value2, new Integer(i)))));
            StringUiText stringUiText = vch0.a;
            tuqVar.y1(new nvp.j(new ResourceUiText(R.string.page_lucky_numbers__something_went_wrong_please_try_again), false));
        } else {
            if (!(lk50Var instanceof lk50.c)) {
                uhc.a();
                return null;
            }
            tuqVar.A1(i, uxs.ENABLE);
            wwd0 wwd0Var2 = tuqVar.w;
            do {
                value = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value, a4h.h(yi80.f((ucn) value, new Integer(i)))));
            ej5.c(o8i0.d(tuqVar), null, null, new a(tuqVar, null), 3);
        }
        return Unit.a;
    }
}
