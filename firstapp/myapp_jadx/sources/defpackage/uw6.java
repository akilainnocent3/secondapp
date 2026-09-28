package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportybet.feature.loyalty.impl.challenge.presentation.ChallengeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uw6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uw6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        FragmentManager supportFragmentManager;
        FragmentManager supportFragmentManager2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ChallengeActivity challengeActivity = (ChallengeActivity) obj2;
                String str = (String) obj;
                int i2 = ChallengeActivity.e;
                str.getClass();
                bnh0 bnh0Var = challengeActivity.b;
                if (bnh0Var == null) {
                    Intrinsics.n("urlCreator");
                    throw null;
                }
                Uri uri = Uri.parse(bnh0Var.h(str));
                azm azmVar = challengeActivity.c;
                if (azmVar != null) {
                    azmVar.l(uri, null);
                    return Unit.a;
                }
                Intrinsics.n("router");
                throw null;
            case 1:
                wwd0 wwd0Var = (wwd0) obj2;
                q7q.b bVar = (q7q.b) obj;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, cfy.b((p8q) value, bVar)));
                return Unit.a;
            default:
                b8b0 b8b0Var = (b8b0) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                    b8b0Var.r0();
                    ypa0 ypa0Var = b8b0Var.J;
                    if (ypa0Var == null) {
                        Intrinsics.n("soundViewModel");
                        throw null;
                    }
                    ypa0Var.J1(ypa0Var.y1().d);
                    SharedPreferences.Editor editor = b8b0Var.X;
                    if (zBooleanValue) {
                        if (editor != null) {
                            editor.putBoolean("SPIN_DA_BOTTLE_ONE_TAP", true);
                        }
                    } else if (editor != null) {
                        editor.putBoolean("SPIN_DA_BOTTLE_ONE_TAP", false);
                    }
                    SharedPreferences.Editor editor2 = b8b0Var.X;
                    if (editor2 != null) {
                        editor2.apply();
                    }
                    e activity = b8b0Var.getActivity();
                    if (activity != null && (supportFragmentManager2 = activity.getSupportFragmentManager()) != null) {
                        supportFragmentManager2.a0();
                    }
                } else {
                    b8b0Var.r0();
                    e activity2 = b8b0Var.getActivity();
                    if (activity2 != null && (supportFragmentManager = activity2.getSupportFragmentManager()) != null) {
                        supportFragmentManager.a0();
                    }
                }
                b8b0Var.z0();
                b8b0Var.e = null;
                return Unit.a;
        }
    }
}
