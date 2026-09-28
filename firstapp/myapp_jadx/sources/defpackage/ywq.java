package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.mynumbers.LNMyNumberViewModel$1", f = "LNMyNumberViewModel.kt", l = {109}, m = "invokeSuspend", v = 2)
public final class ywq extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ exq b;

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.mynumbers.LNMyNumberViewModel$1$1", f = "LNMyNumberViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<dvq, v1b<? super Boolean>, Object> {
        public /* synthetic */ Object a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(2, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(dvq dvqVar, v1b<? super Boolean> v1bVar) {
            return ((a) create(dvqVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            dvq dvqVar = (dvq) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = false;
            if (!Intrinsics.g(dvqVar, dvq.a.a) && !Intrinsics.g(dvqVar, dvq.c.a) && dvqVar != null) {
                if (!(dvqVar instanceof dvq.b)) {
                    uhc.a();
                    return null;
                }
                qcn<qvq> qcnVar = ((dvq.b) dvqVar).b;
                if (qcnVar == null || !qcnVar.isEmpty()) {
                    Iterator<qvq> it = qcnVar.iterator();
                    while (it.hasNext()) {
                        if (!it.next().a) {
                            z = true;
                            break;
                        }
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywq(exq exqVar, v1b<? super ywq> v1bVar) {
        super(2, v1bVar);
        this.b = exqVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ywq(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ywq) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        exq exqVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            wwd0 wwd0Var = exqVar.y;
            a aVar = new a(2, null);
            this.a = 1;
            if (s0i.b(wwd0Var, aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        ku90<pvq> ku90Var = exqVar.A;
        StringUiText stringUiText = vch0.a;
        ku90Var.a(new pvq.a(new nvp.j(new ResourceUiText(R.string.page_lucky_numbers__my_numbers_game_rules_changed_toast), false)));
        return Unit.a;
    }
}
