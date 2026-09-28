package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.customCode.newCode.viewmodel.NewCustomCodeViewModel$buildUI$1", f = "NewCustomCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xpx extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ cqx b;
    public final /* synthetic */ gdc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpx(cqx cqxVar, gdc gdcVar, v1b<? super xpx> v1bVar) {
        super(2, v1bVar);
        this.b = cqxVar;
        this.c = gdcVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xpx xpxVar = new xpx(this.b, this.c, v1bVar);
        xpxVar.a = obj;
        return xpxVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xpx) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String strConcat;
        ResourceUiText resourceUiText;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        cqx cqxVar = this.b;
        v340 v340Var = cqxVar.b;
        wwd0 wwd0Var = cqxVar.a;
        String lastNickName = cqxVar.f.getLastNickName();
        if (lastNickName != null) {
            gdc gdcVar = this.c;
            if (gdcVar == null || (strConcat = gdcVar.b) == null) {
                strConcat = lastNickName.concat("_");
            }
            wpx wpxVar = (wpx) v340Var.a.getValue();
            if (gdcVar == null) {
                StringUiText stringUiText = vch0.a;
                resourceUiText = new ResourceUiText(R.string.component_assign_custom_code__create_custom_code_name);
            } else {
                StringUiText stringUiText2 = vch0.a;
                resourceUiText = new ResourceUiText(R.string.component_assign_custom_code__edit_custom_code_name);
            }
            wpx wpxVarA = wpx.a(wpxVar, resourceUiText, lastNickName.concat("_"), gdcVar != null ? new Integer(gdcVar.a) : null, gdcVar != null ? gdcVar.c : null, new ijf0(strConcat, 0L, 6), false, false, false, gdcVar != null, 192);
            wwd0Var.getClass();
            wwd0Var.k(null, wpxVarA);
        } else {
            wpx wpxVarA2 = wpx.a((wpx) v340Var.a.getValue(), null, null, null, null, null, false, false, false, false, 479);
            wwd0Var.getClass();
            wwd0Var.k(null, wpxVarA2);
        }
        return Unit.a;
    }
}
