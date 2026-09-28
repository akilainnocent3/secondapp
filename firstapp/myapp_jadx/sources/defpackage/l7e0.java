package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.presentation.mappers.StreakRewardStatusUiMapper$combineStreakData$1", f = "StreakRewardStatusUiMapper.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l7e0 extends tje0 implements gaj<o34, h44, v1b<? super p34>, Object> {
    public /* synthetic */ o34 a;
    public /* synthetic */ h44 b;
    public final /* synthetic */ m7e0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7e0(m7e0 m7e0Var, v1b<? super l7e0> v1bVar) {
        super(3, v1bVar);
        this.c = m7e0Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(o34 o34Var, h44 h44Var, v1b<? super p34> v1bVar) {
        l7e0 l7e0Var = new l7e0(this.c, v1bVar);
        l7e0Var.a = o34Var;
        l7e0Var.b = h44Var;
        return l7e0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        p34 p34Var;
        o34 o34Var = this.a;
        h44 h44Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.c.getClass();
        o34Var.getClass();
        boolean z = o34Var.c;
        double d = o34Var.a;
        if (d != 1.0d && z) {
            StringUiText stringUiText = vch0.a;
            p34Var = new p34(true, "x" + d, jz4.a(new ResourceUiText(R.string.page_loyalty__streak_boost), pe4.b(o34Var.b, ": ", "%")), 24);
        } else {
            p34Var = new p34(z, null, null, 24);
        }
        boolean z2 = h44Var.d;
        int i = h44Var.c;
        return new p34(p34Var.c, p34Var.b, z2 ? m58.a(i, "+") : String.valueOf(i), p34Var.a, h44Var.a);
    }
}
