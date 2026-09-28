package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.platform.features.account.verifiedemailchange.verifyidentity.model.EmailChangeVerifyIdentityArgs;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"La0g;", "Lj8i0;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class a0g extends j8i0 {
    public final oyf a;
    public final mgb0 b;
    public final a6k c;
    public final odd d;
    public final rdd0 e;
    public final EmailChangeVerifyIdentityArgs f;
    public final wwd0 i;
    public final v340 v;
    public final ku90<vzf> w;
    public final t340 y;

    public a0g(oyf oyfVar, mgb0 mgb0Var, a6k a6kVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, vu60 vu60Var, rdd0 rdd0Var) {
        oyfVar.getClass();
        mgb0Var.getClass();
        a6kVar.getClass();
        vu60Var.getClass();
        rdd0Var.getClass();
        this.a = oyfVar;
        this.b = mgb0Var;
        this.c = a6kVar;
        this.d = oddVar;
        this.e = rdd0Var;
        this.f = ((ozf) fnf.a(vu60Var, jq40.a(ozf.class), jpu.b(new Pair(jq40.b(EmailChangeVerifyIdentityArgs.class), new pzf(false))))).a;
        wwd0 wwd0VarA = xwd0.a(new nzf(0));
        this.i = wwd0VarA;
        this.v = e1i.b(wwd0VarA);
        ku90<vzf> ku90Var = new ku90<>();
        this.w = ku90Var;
        this.y = e1i.a(ku90Var);
    }
}
