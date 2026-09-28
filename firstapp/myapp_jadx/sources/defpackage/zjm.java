package defpackage;

import android.view.View;
import com.sportybet.feature.horseracing.view.HorseRacingActivity;
import com.sportygames.pingpong.components.ShHeaderContainer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zjm implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zjm(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                fbh0 fbh0Var = ((HorseRacingActivity) obj).b;
                if (fbh0Var != null) {
                    fbh0Var.e(o7d.a(wae.ME));
                    return;
                } else {
                    Intrinsics.n("uiRouterManager");
                    throw null;
                }
            default:
                int i2 = ShHeaderContainer.b;
                ((Function0) obj).invoke();
                return;
        }
    }
}
