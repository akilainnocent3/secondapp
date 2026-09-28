package defpackage;

import android.content.Context;
import android.os.Parcelable;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportygames.compose.lobbyv2.models.LobbyV2ProviderDetailsModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class tv0 implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Parcelable b;

    public /* synthetic */ tv0(Parcelable parcelable, int i) {
        this.a = i;
        this.b = parcelable;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Parcelable parcelable = this.b;
        switch (i) {
            case 0:
                UiText uiText = (UiText) parcelable;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e160) obj).getClass();
                if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    d160 d160VarA = b160.a(kw0.a, ht.a.j, aVar, 0);
                    int iHashCode = Long.hashCode(aVar.m());
                    ne00 ne00VarO = aVar.o();
                    d.a aVar2 = d.a.b;
                    d dVarC = c.c(aVar, aVar2);
                    yka.k.getClass();
                    tsr.a aVar3 = yka.a.b;
                    if (aVar.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar.D();
                    if (aVar.g()) {
                        aVar.F(aVar3);
                    } else {
                        aVar.p();
                    }
                    hlh0.a(aVar, d160VarA, yka.a.f);
                    hlh0.a(aVar, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar, iHashCode, c1350a);
                    }
                    hlh0.a(aVar, dVarC, yka.a.d);
                    h6n.b(erz.a(R.drawable.ic_check, 0, aVar), null, j.r(aVar2, 20.0f), c68.a(R.color.icon_inverse_primary, aVar), aVar, 432, 0);
                    lkf0.d(vch0.a(uiText, aVar), h.j(aVar2, ((cjb0) aVar.O(ejb0.a)).c, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(y9a.a.a, aVar), aVar, 0, 0, 131068);
                    aVar.s();
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                LobbyV2ProviderDetailsModel lobbyV2ProviderDetailsModel = (LobbyV2ProviderDetailsModel) parcelable;
                a aVar4 = (a) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((j78) obj).getClass();
                if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    nan.a aVar5 = new nan.a((Context) aVar4.O(AndroidCompositionLocals_androidKt.b));
                    aVar5.c = doc.a(aVar4) ? lobbyV2ProviderDetailsModel.getDarkImageUrl() : lobbyV2ProviderDetailsModel.getLightImageUrl();
                    fn80.a(aVar5.a(), lobbyV2ProviderDetailsModel.getName(), j.c(j.g(h.g(d.a.b, fw20.a(R.dimen._9sdp, aVar4), fw20.a(R.dimen._3sdp, aVar4)), 1.0f), 1.0f), d0b.a.b, ht.a.e, 0.0f, null, null, null, aVar4, 199680, 2000);
                } else {
                    aVar4.G();
                }
                return Unit.a;
        }
    }
}
