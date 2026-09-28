package defpackage;

import android.content.Context;
import android.graphics.Picture;
import com.sporty.android.core.model.social.ShareIntentType;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x5o extends saj implements Function2<ShareIntentType, Picture, Unit> {
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(ShareIntentType shareIntentType, Picture picture) {
        Context context;
        String strD;
        ShareIntentType shareIntentType2 = shareIntentType;
        Picture picture2 = picture;
        shareIntentType2.getClass();
        picture2.getClass();
        q5o q5oVar = (q5o) this.receiver;
        q5oVar.s0();
        String strY1 = q5oVar.q0().y1();
        if (strY1 != null && (context = q5oVar.getContext()) != null) {
            wwd0 wwd0Var = q5oVar.q0().z;
            wwd0Var.k(null, n5o.a((n5o) wwd0Var.getValue(), false, true, 3));
            int i = q5o.a.a[shareIntentType2.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            uhc.a();
                            return null;
                        }
                        if (r0b.c(context, "org.telegram.messenger") || r0b.c(context, "org.telegram.messenger.web")) {
                            strD = null;
                        } else {
                            strD = sn5.d(q5oVar, R.string.common_functions__telegram, new Object[0]);
                        }
                    } else if (r0b.c(context, "com.whatsapp")) {
                        strD = null;
                    } else {
                        strD = sn5.d(q5oVar, R.string.common_functions__whatsapp, new Object[0]);
                    }
                } else if (r0b.c(context, "com.facebook.katana")) {
                    strD = null;
                } else {
                    strD = sn5.d(q5oVar, R.string.common_functions__facebook, new Object[0]);
                }
            } else if (r0b.c(context, "com.twitter.android")) {
                strD = null;
            } else {
                strD = sn5.d(q5oVar, R.string.common_functions__x, new Object[0]);
            }
            if (strD != null) {
                q5oVar.p0().a(sn5.d(q5oVar, R.string.common_feedback__app_might_not_be_installed_tip, strD));
                wwd0 wwd0Var2 = q5oVar.q0().z;
                wwd0Var2.k(null, n5o.a((n5o) wwd0Var2.getValue(), false, false, 3));
            } else {
                ibs viewLifecycleOwner = q5oVar.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new d6o(q5oVar, picture2, strY1, shareIntentType2, null), 3);
            }
        }
        return Unit.a;
    }
}
