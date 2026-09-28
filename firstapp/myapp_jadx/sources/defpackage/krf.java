package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.playtimecontrol.confirmation.viewmodel.EditPlayTimeConfirmationViewModel$buildUI$1", f = "EditPlayTimeConfirmationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class krf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ mrf a;
    public final /* synthetic */ cr10 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krf(mrf mrfVar, cr10 cr10Var, int i, v1b<? super krf> v1bVar) {
        super(2, v1bVar);
        this.a = mrfVar;
        this.b = cr10Var;
        this.c = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new krf(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((krf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ResourceUiText resourceUiText;
        ResourceUiText resourceUiText2;
        ResourceUiText resourceUiText3;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        mrf mrfVar = this.a;
        cr10 cr10Var = this.b;
        mrfVar.y = cr10Var;
        wwd0 wwd0Var = mrfVar.a;
        mrfVar.e.getClass();
        cr10Var.getClass();
        int iOrdinal = cr10Var.ordinal();
        if (iOrdinal == 0) {
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(R.string.playtime_control__your_self_exclusion_period_will_start_now_and_will_end_on);
            resourceUiText2 = new ResourceUiText(R.string.playtime_control__once_a_self_exclusion_is_confirmed_desc);
            resourceUiText3 = new ResourceUiText(R.string.playtime_control__continue_with_self_exclusion);
        } else {
            if (iOrdinal != 1) {
                uhc.a();
                return null;
            }
            StringUiText stringUiText2 = vch0.a;
            resourceUiText = new ResourceUiText(R.string.playtime_control__your_time_out_period_will_start_now_and_will_end_on);
            resourceUiText2 = new ResourceUiText(R.string.playtime_control__once_a_time_out_period_is_confirmed_desc);
            resourceUiText3 = new ResourceUiText(R.string.playtime_control__continue_with_time_out);
        }
        ResourceUiText resourceUiText4 = resourceUiText;
        ResourceUiText resourceUiText5 = resourceUiText2;
        ResourceUiText resourceUiText6 = resourceUiText3;
        Calendar calendar = Calendar.getInstance();
        int i = this.c;
        calendar.add(6, i);
        String str = new SimpleDateFormat("d MMM. yyyy HH:mm '(GMT'XXX')'", Locale.US).format(calendar.getTime());
        str.getClass();
        hrf.b bVar = new hrf.b(new irf(cr10Var, i, new StringUiText(str), resourceUiText4, resourceUiText5, resourceUiText6));
        wwd0Var.getClass();
        wwd0Var.k(null, bVar);
        return Unit.a;
    }
}
