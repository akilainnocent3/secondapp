package yads;

import android.view.View;
import com.ironsource.C4235d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection f152463a;

    public /* synthetic */ mj() {
        this(fr.h0.J());
    }

    public final r12 a(View view, iy1 iy1Var) {
        q12 q12Var = new q12(view, q22.f154237c, fr.n1.z());
        q12Var.f154230e.put("age", iy1Var.h(view));
        q12Var.f154230e.put("body", iy1Var.a(view));
        q12Var.f154230e.put("call_to_action", iy1Var.e(view));
        q12Var.f154230e.put(C4235d4.j.D, iy1Var.n(view));
        q12Var.f154230e.put("favicon", iy1Var.g(view));
        q12Var.f154230e.put("feedback", iy1Var.l(view));
        q12Var.f154230e.put("icon", iy1Var.o(view));
        q12Var.f154230e.put("media", iy1Var.c(view));
        q12Var.f154228c = iy1Var.b(view);
        q12Var.f154229d = iy1Var.k(view);
        q12Var.f154230e.put("price", iy1Var.d(view));
        View viewI = iy1Var.i(view);
        if (!(viewI instanceof tl2)) {
            viewI = null;
        }
        q12Var.f154230e.put(CampaignEx.JSON_KEY_STAR, viewI);
        q12Var.f154230e.put("review_count", iy1Var.p(view));
        q12Var.f154230e.put("sponsored", iy1Var.m(view));
        q12Var.f154230e.put("title", iy1Var.j(view));
        q12Var.f154230e.put("warning", iy1Var.f(view));
        for (String str : this.f152463a) {
            View viewA = iy1Var.a(view, str);
            if (viewA != null) {
                q12Var.f154230e.put(str, viewA);
            }
        }
        return new r12(q12Var);
    }

    public mj(Collection collection) {
        this.f152463a = collection;
    }
}
