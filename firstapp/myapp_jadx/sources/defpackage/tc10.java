package defpackage;

import android.app.AlertDialog;
import com.sporty.android.common.network.data.SprHttpErrorThrowable;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.globalpay.pixBtg.withdraw.e;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.home.RestrictionActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tc10 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tc10(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String cMSString;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                e.c cVar = (e.c) obj;
                cVar.getClass();
                return e.c.a(cVar, null, 0.0d, null, null, null, (jme) ((Function1) obj2).invoke(cVar.f), 31);
            default:
                RestrictionActivity restrictionActivity = (RestrictionActivity) obj2;
                lk50 lk50Var = (lk50) obj;
                int i2 = RestrictionActivity.f;
                if (lk50Var instanceof lk50.b) {
                    td tdVar = restrictionActivity.b;
                    if (tdVar == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    tdVar.b.K();
                } else if (lk50Var instanceof lk50.c) {
                    boolean zBooleanValue = ((Boolean) ((lk50.c) lk50Var).a).booleanValue();
                    itf0.a aVar = itf0.a;
                    aVar.q(MyLog.TAG_GEO);
                    aVar.a(":processGeoResult " + zBooleanValue, new Object[0]);
                    if (zBooleanValue) {
                        restrictionActivity.A1();
                    } else {
                        new AlertDialog.Builder(restrictionActivity).setCancelable(false).setTitle(restrictionActivity.getCMSString(R.string.app_common__geo_restriction_dialog_title, new Object[0])).setMessage(restrictionActivity.getCMSString(R.string.app_common__geo_restriction_dialog_content, a8b.a.a().getName())).setPositiveButton(restrictionActivity.getCMSString(R.string.common_functions__ok, new Object[0]), new oi50()).create().show();
                    }
                    td tdVar2 = restrictionActivity.b;
                    if (tdVar2 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    tdVar2.b.E();
                } else {
                    if (!(lk50Var instanceof lk50.a)) {
                        uhc.a();
                        return null;
                    }
                    wsm wsmVar = restrictionActivity.d;
                    if (wsmVar == null) {
                        Intrinsics.n("crashlyticsHelper");
                        throw null;
                    }
                    Throwable th = ((lk50.a) lk50Var).a;
                    wsmVar.g("Get Google Play Available Data occur exception", "", th, m2g.a);
                    if (th instanceof SprThrowable) {
                        cMSString = ((SprThrowable) th).getE();
                    } else {
                        cMSString = th instanceof SprHttpErrorThrowable ? restrictionActivity.getCMSString(R.string.common_feedback__something_went_wrong_please_try_again_later_thank_you_vcode, Integer.valueOf(((SprHttpErrorThrowable) th).a)) : restrictionActivity.getCMSString(R.string.common_feedback__something_went_wrong_please_try_again_later_thank_you, new Object[0]);
                    }
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(MyLog.TAG_GEO);
                    aVar2.p(th, "Geo API failed, bypassing restriction. message=%s", cMSString);
                    td tdVar3 = restrictionActivity.b;
                    if (tdVar3 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    tdVar3.b.E();
                    restrictionActivity.A1();
                }
                return Unit.a;
        }
    }
}
