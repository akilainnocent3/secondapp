package defpackage;

import androidx.fragment.app.Fragment;
import com.sportybet.android.social.domain.SocialRouter$SocialNetworkSuggested;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k2j implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ k2j(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PromotionGiftsResponse promotionGiftsResponse;
        int i = this.a;
        Fragment fragment = this.b;
        List<GiftItem> entityList = null;
        switch (i) {
            case 0:
                n2j n2jVar = (n2j) fragment;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = n2j.a.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    n2jVar.t0().w.l(n2jVar.getViewLifecycleOwner());
                    djh djhVar = n2jVar.b;
                    if (djhVar != null) {
                        djhVar.G.P();
                    }
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    n2jVar.t0().w.l(n2jVar.getViewLifecycleOwner());
                    djh djhVar2 = n2jVar.b;
                    if (djhVar2 != null) {
                        djhVar2.G.P();
                    }
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (promotionGiftsResponse = (PromotionGiftsResponse) hTTPResponse.getData()) != null) {
                        entityList = promotionGiftsResponse.getEntityList();
                    }
                    List listR0 = n2j.r0(entityList);
                    if (listR0 == null || listR0.isEmpty()) {
                        n2jVar.e0 = false;
                        n2jVar.C0();
                    } else {
                        n2jVar.e0 = true;
                        djh djhVar3 = n2jVar.b;
                        if (djhVar3 != null) {
                            djhVar3.f.c.setVisibility(0);
                        }
                    }
                }
                return Unit.a;
            default:
                xia0 xia0Var = (xia0) obj;
                xia0Var.getClass();
                SocialRouter$SocialNetworkSuggested socialRouter$SocialNetworkSuggested = SocialRouter$SocialNetworkSuggested.a;
                SocialRouter$SocialNetworkSuggested.Data data = new SocialRouter$SocialNetworkSuggested.Data(xia0Var);
                socialRouter$SocialNetworkSuggested.getClass();
                xnu xnuVarA = ej0.a(vj5.a(new Pair("args_social_network_suggested_data", data)));
                yfx yfxVar = ((oda0) fragment).v;
                if (yfxVar != null) {
                    wix.a(yfxVar, socialRouter$SocialNetworkSuggested, xnuVarA);
                    return Unit.a;
                }
                Intrinsics.n("navController");
                throw null;
        }
    }
}
