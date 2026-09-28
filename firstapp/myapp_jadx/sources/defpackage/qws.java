package defpackage;

import com.sporty.android.common.network.data.JsonErrorThrowable;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.presentation.viewmodel.LoadCodeViewModel$loadCode$1", f = "LoadCodeViewModel.kt", l = {72}, m = "invokeSuspend", v = 2)
public final class qws extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ rws c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ lws e;
    public final /* synthetic */ g08 f;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qws(String str, rws rwsVar, boolean z, lws lwsVar, g08 g08Var, boolean z2, v1b<? super qws> v1bVar) {
        super(2, v1bVar);
        this.b = str;
        this.c = rwsVar;
        this.d = z;
        this.e = lwsVar;
        this.f = g08Var;
        this.i = z2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qws(this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qws) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        Object value2;
        UiText stringUiText;
        rws rwsVar = this.c;
        ku90<a> ku90Var = rwsVar.d;
        wwd0 wwd0Var = rwsVar.v;
        wwd0 wwd0Var2 = rwsVar.y;
        ku90<mws> ku90Var2 = rwsVar.f;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            String str = this.b;
            if (str == null || str.length() == 0) {
                StringUiText stringUiText2 = vch0.a;
                b.j(ku90Var, new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again_later));
                return Unit.a;
            }
            wwd0Var2.setValue(null);
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, tzs.b.a));
            pws pwsVar = rwsVar.a;
            ku90<a> ku90Var3 = rwsVar.d;
            this.a = 1;
            objA = pwsVar.a(ku90Var3, this.b, this.d, this.e, this);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objA = obj;
        }
        kws kwsVar = (kws) objA;
        do {
            value2 = wwd0Var.getValue();
        } while (!wwd0Var.g(value2, tzs.a.a));
        if (kwsVar instanceof kws.d) {
            rwsVar.b.q(0);
            rdd0 rdd0Var = rwsVar.c.a;
            g08 g08Var = this.f;
            g08Var.getClass();
            Set<g08> set = m290.a;
            String strA = m290.a(g08Var.name());
            String str2 = Intrinsics.g(strA, "share_link") ? strA : null;
            if (str2 != null) {
                rdd0Var.a(new v03.e0(str2), k00.d);
                rdd0Var.a(new v03.d0(str2), k00.c);
            }
            kws.d dVar = (kws.d) kwsVar;
            ku90Var2.a.a(new mws.a(g08Var, dVar.a, dVar.b));
        } else if (kwsVar instanceof kws.c) {
            kws.c cVar = (kws.c) kwsVar;
            ku90Var2.a.a(new mws.c(cVar.a, cVar.b, this.f, cVar.d, 4));
        } else if (kwsVar instanceof kws.b) {
            Throwable th = ((kws.b) kwsVar).a;
            if (th instanceof SprThrowable) {
                SprThrowable sprThrowable = (SprThrowable) th;
                stringUiText = sprThrowable.getD() == 19000 ? new ResourceUiText(R.string.common_functions__code_is_invalid) : vch0.d(sprThrowable.getE());
            } else if (th instanceof JsonErrorThrowable) {
                stringUiText = ((JsonErrorThrowable) th).a;
            } else if (th instanceof fk50) {
                stringUiText = ((fk50) th).getText();
            } else {
                String message = th.getMessage();
                if (message != null) {
                    StringUiText stringUiText3 = vch0.a;
                    stringUiText = new StringUiText(message);
                } else {
                    stringUiText = vch0.b;
                }
            }
            wwd0Var2.setValue(stringUiText);
        } else if (!Intrinsics.g(kwsVar, kws.a.a)) {
            uhc.a();
            return null;
        }
        if (!(kwsVar instanceof kws.b)) {
            ku90Var2.a(mws.b.a);
        }
        if (this.i) {
            b.b(ku90Var);
        }
        return Unit.a;
    }
}
