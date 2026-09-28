package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.NameUpdateResultPopupActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k7l {
    public d900 a;
    public d0n b;

    public final void a(fq0 fq0Var, h7l h7lVar, Function1<? super String, Unit> function1, Function0<Unit> function0) {
        h7lVar.getClass();
        if (h7lVar instanceof h7l.d) {
            function1.invoke("/m/my_accounts/transactions/materials_upload?from=transaction");
            return;
        }
        if (h7lVar instanceof h7l.a) {
            d0n d0nVar = this.b;
            if (d0nVar != null) {
                d0nVar.b(fq0Var, snb0.TRANSACTION);
                return;
            } else {
                Intrinsics.n("utils");
                throw null;
            }
        }
        if (h7lVar instanceof h7l.c) {
            FragmentManager supportFragmentManager = fq0Var.getSupportFragmentManager();
            supportFragmentManager.getClass();
            h7l.c cVar = (h7l.c) h7lVar;
            String str = cVar.a;
            StringUiText stringUiText = vch0.a;
            lq70.a.b(supportFragmentManager, fq0Var, new StringUiText(str), new StringUiText(cVar.b), new j7l(), 240);
            return;
        }
        if (h7lVar instanceof h7l.b) {
            d900 d900Var = this.a;
            if (d900Var != null) {
                d900Var.b.d(wae.NAME_UPDATE);
                return;
            } else {
                Intrinsics.n("paymentRouter");
                throw null;
            }
        }
        if (h7lVar instanceof h7l.e) {
            NameUpdateResultPopupActivity.a aVar = NameUpdateResultPopupActivity.b;
            String str2 = ((h7l.e) h7lVar).a;
            aVar.getClass();
            str2.getClass();
            Intent intent = new Intent(fq0Var, (Class<?>) NameUpdateResultPopupActivity.class);
            intent.putExtra("key - message", str2);
            fq0Var.startActivity(intent);
            return;
        }
        if (!(h7lVar instanceof h7l.f)) {
            uhc.a();
            return;
        }
        Bundle bundleA = mll0.a("data", AnalyticsParam.EVENT_GRAY_LIST);
        f00 f00Var = vgb0.a;
        vgb0.b(AnalyticsEvent.WITHDRAWAL_PAGE_VERIFY_NIN_HINT_CLICKED, bundleA);
        function0.invoke();
    }
}
