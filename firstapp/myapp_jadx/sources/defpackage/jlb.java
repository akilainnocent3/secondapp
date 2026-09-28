package defpackage;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.WorldCupPassAnnouncementActivity;
import com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.c;
import com.sportygames.commons.components.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jlb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jlb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FragmentManager supportFragmentManager;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                enb enbVar = (enb) obj;
                e activity = enbVar.getActivity();
                if (!(((activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) ? null : supportFragmentManager.G(R.id.flContent)) instanceof a)) {
                    ((x5a0) enbVar.L).setValue(Boolean.TRUE);
                }
                return Unit.a;
            case 1:
                ((Function0) obj).invoke();
                return Unit.a;
            case 2:
                return Float.valueOf(((fxh) obj).invoke() < 1.0f ? 0.3f : 1.0f);
            default:
                int i2 = WorldCupPassAnnouncementActivity.d;
                ((c) ((WorldCupPassAnnouncementActivity) obj).c.getValue()).z1(com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.a.b.a);
                return Unit.a;
        }
    }
}
