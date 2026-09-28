package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sporty.android.core.model.social.ShareIntentType;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import java.net.URL;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tp00 implements Function1 {
    public final /* synthetic */ vp00.a a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ tp00(vp00.a aVar, String str, boolean z) {
        this.a = aVar;
        this.b = str;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ShareIntentType shareIntentType = (ShareIntentType) obj;
        shareIntentType.getClass();
        int i = vp00.a.C1220a.a[shareIntentType.ordinal()];
        vp00.a aVar = this.a;
        String str = this.b;
        if (i != 1) {
            if (i == 2) {
                Context contextRequireContext = aVar.requireContext();
                g6h.a aVar2 = g6h.a.b;
                if (yrh0.l(contextRequireContext, "com.facebook.katana")) {
                    try {
                        Context contextRequireContext2 = aVar.requireContext();
                        contextRequireContext2.getClass();
                        aVar.requireContext().startActivity(f6h.a(contextRequireContext2, str, m2g.a, aVar2));
                    } catch (Exception unused) {
                    }
                    aVar.dismiss();
                } else {
                    zyf0.c(0, sn5.d(aVar, R.string.common_feedback__app_might_not_be_installed_tip, sn5.d(aVar, R.string.common_functions__facebook, new Object[0])));
                }
            } else if (i != 3) {
                if (i != 4) {
                    uhc.a();
                    return null;
                }
                Context contextRequireContext3 = aVar.requireContext();
                contextRequireContext3.getClass();
                if (r0b.c(contextRequireContext3, "org.telegram.messenger") || r0b.c(contextRequireContext3, "org.telegram.messenger.web")) {
                    try {
                        Context contextRequireContext4 = aVar.requireContext();
                        contextRequireContext4.getClass();
                        aVar.requireContext().startActivity(n0g.a(contextRequireContext4, str, m2g.a));
                    } catch (Exception unused2) {
                    }
                    aVar.dismiss();
                } else {
                    zyf0.c(0, sn5.d(aVar, R.string.common_feedback__app_might_not_be_installed_tip, sn5.d(aVar, R.string.common_functions__telegram, new Object[0])));
                }
            } else if (yrh0.l(aVar.requireContext(), "com.whatsapp")) {
                try {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setPackage("com.whatsapp");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", str);
                    aVar.requireContext().startActivity(intent);
                } catch (Exception unused3) {
                }
                aVar.dismiss();
            } else {
                zyf0.c(0, sn5.d(aVar, R.string.common_feedback__app_might_not_be_installed_tip, sn5.d(aVar, R.string.common_functions__whatsapp, new Object[0])));
            }
        } else if (yrh0.l(aVar.requireContext(), "com.twitter.android")) {
            try {
                Context contextRequireContext5 = aVar.requireContext();
                contextRequireContext5.getClass();
                hzg0 hzg0Var = new hzg0(contextRequireContext5);
                hzg0Var.g(new URL(str));
                aVar.requireContext().startActivity(hzg0Var.a());
            } catch (Exception unused4) {
            }
            aVar.dismiss();
        } else {
            zyf0.c(0, sn5.d(aVar, R.string.common_feedback__app_might_not_be_installed_tip, sn5.d(aVar, R.string.common_functions__x, new Object[0])));
        }
        Unit unit = Unit.a;
        aVar.m0(AnalyticsParam.SOCIAL_ACTION_TYPE_MEDIA, shareIntentType, this.c);
        return Unit.a;
    }
}
