package defpackage;

import android.os.Bundle;
import com.sportybet.android.instantwin.presentation.legends.b;
import com.sportybet.android.social.domain.SocialRouter$PersonalSocial;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ym00 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ym00(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle arguments = ((cn00) obj).getArguments();
                SocialRouter$PersonalSocial.Data data = arguments != null ? (SocialRouter$PersonalSocial.Data) arguments.getParcelable("arg_personal_social_data") : null;
                String initialTab = data != null ? data.getInitialTab() : null;
                if (initialTab != null) {
                    switch (initialTab.hashCode()) {
                        case -1583595392:
                            if (initialTab.equals("BOOKING_CODES")) {
                                return k130.b;
                            }
                            break;
                        case -346037832:
                            if (initialTab.equals("CUSTOM_CODES")) {
                                return k130.d;
                            }
                            break;
                        case 41098089:
                            if (initialTab.equals("FOR_YOU")) {
                                return k130.a;
                            }
                            break;
                        case 1688619626:
                            if (initialTab.equals("CODE_CHAT")) {
                                return k130.c;
                            }
                            break;
                    }
                }
                return k130.a;
            default:
                ((Function1) obj).invoke(b.j.d.a);
                return Unit.a;
        }
    }
}
