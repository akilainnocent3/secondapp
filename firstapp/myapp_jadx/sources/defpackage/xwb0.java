package defpackage;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import com.sportybet.android.gp.tz.R;
import com.sportygames.lobby.remote.models.GameDetails;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xwb0 implements Function0 {
    public final /* synthetic */ FragmentManager a;
    public final /* synthetic */ q1c0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ GameDetails d;
    public final /* synthetic */ Map e;

    public /* synthetic */ xwb0(FragmentManager fragmentManager, q1c0 q1c0Var, int i, GameDetails gameDetails, Map map) {
        this.a = fragmentManager;
        this.b = q1c0Var;
        this.c = i;
        this.d = gameDetails;
        this.e = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FragmentManager fragmentManager = this.a;
        a aVarA = oke.a(fragmentManager, fragmentManager);
        aVarA.r = true;
        op5.a.getClass();
        List<? extends File> list = op5.b;
        this.d.getClass();
        com.sportygames.commons.views.a aVar = new com.sportygames.commons.views.a();
        aVar.c = "sporty-hero";
        aVar.d = this.c;
        aVar.w = list;
        aVar.z = this.e;
        aVar.A = false;
        aVarA.f(R.id.onboarding_images, aVar, "onboarding_main");
        aVarA.d();
        w3c0 w3c0Var = (w3c0) this.b.b;
        if (w3c0Var != null) {
            w3c0Var.X.setVisibility(0);
        }
        return Unit.a;
    }
}
