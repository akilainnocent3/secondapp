package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.providers.MeScreenRowsProvider$getRowsForLogin$3", f = "MeScreenRowsProvider.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xfv extends tje0 implements jaj<Boolean, aev, aev, aev, v1b<? super List<? extends aev>>, Object> {
    public /* synthetic */ boolean a;
    public /* synthetic */ aev b;
    public /* synthetic */ aev c;
    public /* synthetic */ aev d;
    public final /* synthetic */ qfv e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfv(v1b v1bVar, qfv qfvVar) {
        super(5, v1bVar);
        this.e = qfvVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        aev aevVar = this.b;
        aev aevVar2 = this.c;
        aev aevVar3 = this.d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        aev.b bVar = aev.b.NOTIFICATION_CENTER;
        StringUiText stringUiText = vch0.a;
        ArrayList arrayListL = b.l(new aev(bVar, new Integer(R.drawable.notification_center), new ResourceUiText(R.string.page_notification_center__notification_center), false, null, z, false, null, 984), aevVar, aevVar2, aevVar3);
        qfv qfvVar = this.e;
        if (qfvVar.a.hasPersonalPage()) {
            arrayListL.add(new aev(aev.b.SOCIAL, new Integer(R.drawable.ic_sporty_social), new ResourceUiText(R.string.personal_page__page_title), false, new aev.a.c(new ResourceUiText(R.string.common_functions__view), null, null, null, null, null, new Integer(R.color.text_type1_secondary), null, null, null, 15358), false, false, null, 1000));
        } else {
            arrayListL.add(new aev(aev.b.CREATE_SPORTY_SOCIAL, new Integer(R.drawable.ic_sporty_social), new ResourceUiText(R.string.personal_page__create_my_sportysocial), false, new aev.a.c(new ResourceUiText(R.string.common_functions__view), null, null, null, null, null, new Integer(R.color.text_type1_secondary), null, null, null, 15358), false, false, null, 1000));
        }
        if (qfvVar.f.b("feedback_me_entry")) {
            arrayListL.add(new aev(aev.b.FEEDBACK, new Integer(R.drawable.ic__bulb), new ResourceUiText(R.string.wap_me__share_your_thoughts), false, null, false, false, null, 1016));
        }
        if (qfvVar.c.W()) {
            arrayListL.add(new aev(aev.b.TAX_REPORTS, new Integer(R.drawable.ic_me_tax_reports), new ResourceUiText(R.string.wap_me__get_tax_reports), false, null, false, false, null, 1016));
        }
        return CollectionsKt.R(arrayListL);
    }

    @Override // defpackage.jaj
    public final Object l(Boolean bool, aev aevVar, aev aevVar2, aev aevVar3, v1b<? super List<? extends aev>> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        xfv xfvVar = new xfv(v1bVar, this.e);
        xfvVar.a = zBooleanValue;
        xfvVar.b = aevVar;
        xfvVar.c = aevVar2;
        xfvVar.d = aevVar3;
        return xfvVar.invokeSuspend(Unit.a);
    }
}
