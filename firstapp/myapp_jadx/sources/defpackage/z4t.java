package defpackage;

import android.net.Uri;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.compose.lobbyv2.models.LobbyV2GameDetailsModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2HomeItemModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2HomeModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2ProviderDetailsModel;
import com.sportygames.compose.lobbyv2.models.UIState;
import com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class z4t {
    public static final void a(final LobbyV2ViewModel lobbyV2ViewModel, final yfx yfxVar, final fbh fbhVar, final gaj gajVar, final Function2 function2, final Function0 function0, final boolean z, final Function0 function1, a aVar, final int i) {
        int i2;
        lobbyV2ViewModel.getClass();
        yfxVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(-698732110);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(lobbyV2ViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(yfxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(fbhVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(gajVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function0) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.b(z) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bVarI.A(function1) ? 8388608 : 4194304;
        }
        if (bVarI.q(i2 & 1, (4793491 & i2) != 4793490)) {
            lqu.a(48, pp8.b(940790121, new Function2() { // from class: x4t
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final zzr zzrVarA = e0s.a(0, 3, aVar2);
                        final LobbyV2ViewModel lobbyV2ViewModel2 = lobbyV2ViewModel;
                        ssw<UIState<HTTPResponse<LobbyV2HomeModel>>> sswVar = lobbyV2ViewModel2.A;
                        UIState.INSTANCE.getClass();
                        ytw ytwVarB = ts9.b(sswVar, UIState.Companion.b(), aVar2, 0);
                        final h0s h0sVarA = k0s.a(lobbyV2ViewModel2.Y, aVar2);
                        final UIState uIState = (UIState) ytwVarB.getValue();
                        ca30 ca30VarD = u930.d(aVar2);
                        final yfx yfxVar2 = yfxVar;
                        final gaj gajVar2 = gajVar;
                        final fbh fbhVar2 = fbhVar;
                        final Function2 function3 = function2;
                        final Function0 function4 = function0;
                        u930.b(z, function1, null, ca30VarD, null, null, pp8.b(2075147459, new gaj() { // from class: t4t
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                LobbyV2HomeModel lobbyV2HomeModel;
                                a aVar3 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((m75) obj3).getClass();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    UIState uIState2 = uIState;
                                    if (uIState2 == null) {
                                        aVar3.N(-1041091453);
                                    } else {
                                        aVar3.N(-1041091452);
                                        int iOrdinal = uIState2.getUiStatus().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1) {
                                            aVar3.N(1230247018);
                                            i5t.d(0, aVar3);
                                            aVar3.H();
                                        } else {
                                            d.a aVar4 = d.a.b;
                                            if (iOrdinal == 2) {
                                                aVar3.N(1224612148);
                                                HTTPResponse hTTPResponse = (HTTPResponse) uIState2.getData();
                                                final List<LobbyV2HomeItemModel> result = (hTTPResponse == null || (lobbyV2HomeModel = (LobbyV2HomeModel) hTTPResponse.getData()) == null) ? null : lobbyV2HomeModel.getResult();
                                                if (result == null || result.isEmpty()) {
                                                    aVar3.N(1224596710);
                                                    s5t.d(0, aVar3);
                                                    aVar3.H();
                                                } else {
                                                    aVar3.N(1224879740);
                                                    d dVarA = androidx.compose.ui.platform.d.a(aVar4, "lobby_v2_home_content");
                                                    kw0.i iVar = new kw0.i(fw20.a(R.dimen.lobby_v2_home_items_spacing, aVar3), true, new hw0());
                                                    final yfx yfxVar3 = yfxVar2;
                                                    boolean zA = aVar3.A(yfxVar3) | aVar3.A(result);
                                                    final LobbyV2ViewModel lobbyV2ViewModel3 = lobbyV2ViewModel2;
                                                    boolean zA2 = zA | aVar3.A(lobbyV2ViewModel3);
                                                    final gaj gajVar3 = gajVar2;
                                                    boolean zM = zA2 | aVar3.M(gajVar3);
                                                    final fbh fbhVar3 = fbhVar2;
                                                    boolean zM2 = zM | aVar3.M(fbhVar3);
                                                    final Function2 function5 = function3;
                                                    boolean zM3 = zM2 | aVar3.M(function5);
                                                    final h0s h0sVar = h0sVarA;
                                                    boolean zA3 = zM3 | aVar3.A(h0sVar);
                                                    Object objY = aVar3.y();
                                                    if (zA3 || objY == a.C0041a.a) {
                                                        Function1 function6 = new Function1() { // from class: u4t
                                                            /* JADX WARN: Type inference failed for: r5v0, types: [v4t] */
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj6) {
                                                                List<LobbyV2ProviderDetailsModel> providerList;
                                                                szr szrVar = (szr) obj6;
                                                                szrVar.getClass();
                                                                final yfx yfxVar4 = yfxVar3;
                                                                final ?? r5 = new iaj() { // from class: v4t
                                                                    @Override // defpackage.iaj
                                                                    public final Object d(Object obj7, Object obj8, Object obj9, Object obj10) {
                                                                        int iIntValue3 = ((Integer) obj7).intValue();
                                                                        String str = (String) obj8;
                                                                        String str2 = (String) obj9;
                                                                        int iIntValue4 = ((Integer) obj10).intValue();
                                                                        str.getClass();
                                                                        str2.getClass();
                                                                        String strEncode = Uri.encode(str);
                                                                        String strEncode2 = Uri.encode(str2);
                                                                        StringBuilder sbA = uqe0.a(iIntValue3, "section?id=", "&name=", strEncode, "&key=");
                                                                        sbA.append(strEncode2);
                                                                        sbA.append("&catId=");
                                                                        sbA.append(iIntValue4);
                                                                        yfx.i(yfxVar4, sbA.toString(), null, 6);
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                final ArrayList arrayList = new ArrayList();
                                                                for (Object obj7 : result) {
                                                                    LobbyV2HomeItemModel lobbyV2HomeItemModel = (LobbyV2HomeItemModel) obj7;
                                                                    if (!Intrinsics.g(lobbyV2HomeItemModel.getKey(), "featured_widget") && !Intrinsics.g(lobbyV2HomeItemModel.getKey(), "top_wins_today")) {
                                                                        if (Intrinsics.g(lobbyV2HomeItemModel.getKey(), "my_favourites")) {
                                                                            List<LobbyV2GameDetailsModel> gameListVO = lobbyV2HomeItemModel.getGameListVO();
                                                                            if ((gameListVO != null ? gameListVO.size() : 0) > 1) {
                                                                            }
                                                                        } else {
                                                                            String listType = lobbyV2HomeItemModel.getListType();
                                                                            a5t[] a5tVarArr = a5t.a;
                                                                            if (Intrinsics.g(listType, "top_horizontal_strip")) {
                                                                                List<LobbyV2GameDetailsModel> gameListVO2 = lobbyV2HomeItemModel.getGameListVO();
                                                                                if ((gameListVO2 != null ? gameListVO2.size() : 0) > 2) {
                                                                                }
                                                                            } else {
                                                                                List<LobbyV2GameDetailsModel> gameListVO3 = lobbyV2HomeItemModel.getGameListVO();
                                                                                if ((gameListVO3 == null || gameListVO3.isEmpty()) && ((providerList = lobbyV2HomeItemModel.getProviderList()) == null || providerList.isEmpty())) {
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    arrayList.add(obj7);
                                                                }
                                                                final int size = arrayList.size();
                                                                final LobbyV2ViewModel lobbyV2ViewModel4 = lobbyV2ViewModel3;
                                                                final gaj gajVar4 = gajVar3;
                                                                final fbh fbhVar4 = fbhVar3;
                                                                final Function2 function7 = function5;
                                                                final h0s h0sVar2 = h0sVar;
                                                                szr.f(szrVar, size, null, new op8(423754481, new iaj() { // from class: w4t
                                                                    @Override // defpackage.iaj
                                                                    public final Object d(Object obj8, Object obj9, Object obj10, Object obj11) {
                                                                        int iIntValue3 = ((Integer) obj9).intValue();
                                                                        a aVar5 = (a) obj10;
                                                                        int iIntValue4 = ((Integer) obj11).intValue();
                                                                        ((gwr) obj8).getClass();
                                                                        if ((iIntValue4 & 48) == 0) {
                                                                            iIntValue4 |= aVar5.d(iIntValue3) ? 32 : 16;
                                                                        }
                                                                        if (aVar5.q(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                                                                            int i3 = size;
                                                                            if (iIntValue3 < i3) {
                                                                                aVar5.N(1161039120);
                                                                                LobbyV2HomeItemModel lobbyV2HomeItemModel2 = (LobbyV2HomeItemModel) arrayList.get(iIntValue3);
                                                                                boolean z2 = iIntValue3 == i3 - 1;
                                                                                String listType2 = lobbyV2HomeItemModel2.getListType();
                                                                                a5t[] a5tVarArr2 = a5t.a;
                                                                                boolean zG = Intrinsics.g(listType2, "horizontal");
                                                                                LobbyV2ViewModel lobbyV2ViewModel5 = lobbyV2ViewModel4;
                                                                                boolean z3 = z2;
                                                                                gaj gajVar5 = gajVar4;
                                                                                v4t v4tVar = r5;
                                                                                fbh fbhVar5 = fbhVar4;
                                                                                if (zG) {
                                                                                    aVar5.N(1161237675);
                                                                                    n5t.a(lobbyV2ViewModel5, lobbyV2HomeItemModel2, gajVar5, v4tVar, fbhVar5, z3, null, aVar5, 0);
                                                                                    aVar5 = aVar5;
                                                                                    aVar5.H();
                                                                                } else if (Intrinsics.g(listType2, "horizontal_card")) {
                                                                                    aVar5 = aVar5;
                                                                                    aVar5.N(1161555084);
                                                                                    w2t.a(lobbyV2HomeItemModel2, gajVar5, v4tVar, z3, null, aVar5, 0);
                                                                                    aVar5 = aVar5;
                                                                                    aVar5.H();
                                                                                } else if (Intrinsics.g(listType2, "banner")) {
                                                                                    aVar5 = aVar5;
                                                                                    aVar5.N(1161860930);
                                                                                    p2t.b(lobbyV2HomeItemModel2, gajVar5, z3, null, aVar5, 0);
                                                                                    aVar5.H();
                                                                                } else if (Intrinsics.g(listType2, "spotlight")) {
                                                                                    aVar5 = aVar5;
                                                                                    aVar5.N(1162118044);
                                                                                    lat.b(lobbyV2HomeItemModel2, gajVar5, z3, aVar5, 0);
                                                                                    aVar5.H();
                                                                                } else if (Intrinsics.g(listType2, "double_row")) {
                                                                                    aVar5 = aVar5;
                                                                                    aVar5.N(1162382908);
                                                                                    p3t.a(lobbyV2ViewModel5, lobbyV2HomeItemModel2, gajVar5, fbhVar5, z3, null, aVar5, 0);
                                                                                    aVar5 = aVar5;
                                                                                    aVar5.H();
                                                                                } else if (Intrinsics.g(listType2, "top_horizontal_strip")) {
                                                                                    aVar5 = aVar5;
                                                                                    aVar5.N(1162688413);
                                                                                    qat.a(lobbyV2ViewModel5, lobbyV2HomeItemModel2, gajVar5, fbhVar5, z3, null, aVar5, 0);
                                                                                    aVar5 = aVar5;
                                                                                    aVar5.H();
                                                                                } else if (Intrinsics.g(listType2, "provider_card")) {
                                                                                    aVar5 = aVar5;
                                                                                    aVar5.N(1162980154);
                                                                                    x7t.a(lobbyV2HomeItemModel2, function7, z3, aVar5, 0);
                                                                                    aVar5.H();
                                                                                } else if (Intrinsics.g(listType2, "featured_widget")) {
                                                                                    aVar5 = aVar5;
                                                                                    aVar5.N(1163250288);
                                                                                    v3t.a(null, aVar5, 0);
                                                                                    aVar5.H();
                                                                                } else if (Intrinsics.g(listType2, "promo_card")) {
                                                                                    aVar5 = aVar5;
                                                                                    aVar5.N(1163463196);
                                                                                    q7t.a(lobbyV2HomeItemModel2, gajVar5, z3, null, aVar5, 0);
                                                                                    aVar5.H();
                                                                                } else if (Intrinsics.g(listType2, "jackpot_card")) {
                                                                                    aVar5 = aVar5;
                                                                                    aVar5.N(1163722976);
                                                                                    a6t.d(lobbyV2HomeItemModel2, gajVar5, z3, null, aVar5, 0);
                                                                                    aVar5.H();
                                                                                } else {
                                                                                    if (Intrinsics.g(listType2, "top_wins")) {
                                                                                        aVar5 = aVar5;
                                                                                        aVar5.N(1163991715);
                                                                                        gbt.a(lobbyV2HomeItemModel2, h0sVar2, gajVar5, z3, null, aVar5, 64);
                                                                                        aVar5 = aVar5;
                                                                                    } else {
                                                                                        aVar5 = aVar5;
                                                                                        aVar5.N(1156056273);
                                                                                    }
                                                                                    aVar5.H();
                                                                                }
                                                                            } else {
                                                                                aVar5.N(1156056273);
                                                                            }
                                                                            aVar5.H();
                                                                        } else {
                                                                            aVar5.G();
                                                                        }
                                                                        return Unit.a;
                                                                    }
                                                                }, true), 6);
                                                                return Unit.a;
                                                            }
                                                        };
                                                        aVar3.r(function6);
                                                        objY = function6;
                                                    }
                                                    aur.a(dVarA, zzrVarA, null, false, iVar, null, null, false, null, (Function1) objY, aVar3, 6, 492);
                                                    aVar3.H();
                                                }
                                                aVar3.H();
                                            } else {
                                                if (iOrdinal != 3) {
                                                    throw rg.a(455143891, aVar3);
                                                }
                                                aVar3.N(1230367422);
                                                s5t.a(6, aVar3, j.e(aVar4, 1.0f), function4);
                                                aVar3.H();
                                            }
                                        }
                                    }
                                    aVar3.H();
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 1572864, 52);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, false);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: y4t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z4t.a(lobbyV2ViewModel, yfxVar, fbhVar, gajVar, function2, function0, z, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
