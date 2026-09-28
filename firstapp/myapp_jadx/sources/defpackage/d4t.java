package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.compose.lobbyv2.models.GameLogData;
import com.sportygames.compose.lobbyv2.models.LobbyV2GameDetailsModel;
import com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel;
import com.sportygames.lobby.remote.models.WalletInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class d4t {
    public static final void a(float f, final int i, long j, long j2, a aVar, final d dVar) {
        final float f2;
        final long j3;
        final long j4;
        final float f3;
        final long j5;
        final long j6;
        b bVarI = aVar.i(421230664);
        int i2 = i | 3216;
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                qyd0 qyd0Var = vh60.a;
                f3 = 4.0f;
                j5 = ((th60) bVarI.O(qyd0Var)).O;
                j6 = ((th60) bVarI.O(qyd0Var)).P;
            } else {
                bVarI.G();
                f3 = f;
                j5 = j;
                j6 = j2;
            }
            bVarI.Y();
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new xs50();
                bVarI.r(objY);
            }
            d dVarD = lx80.d(dVar, fw20.a(R.dimen._6sdp, bVarI), (xs50) objY, false, 0L, j58.c(0.3f, j58.b), 12);
            boolean zE = bVarI.e(j5) | bVarI.e(j6);
            Object objY2 = bVarI.y();
            if (zE || objY2 == c0042a) {
                Function1 function1 = new Function1() { // from class: b4t
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        tcf tcfVar = (tcf) obj;
                        tcfVar.getClass();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                        float f4 = fIntBitsToFloat2 - (fIntBitsToFloat2 / 4.0f);
                        j90 j90VarA = m90.a();
                        j90VarA.a(0.0f, 0.0f);
                        j90VarA.c(fIntBitsToFloat, 0.0f);
                        j90VarA.c(fIntBitsToFloat, fIntBitsToFloat2);
                        float f5 = fIntBitsToFloat / 2.0f;
                        j90VarA.c(f5, f4);
                        j90VarA.c(0.0f, fIntBitsToFloat2);
                        j90VarA.close();
                        tcf.Q1(tcfVar, j90VarA, j5, 0.0f, null, 60);
                        j90 j90VarA2 = m90.a();
                        j90VarA2.a(fIntBitsToFloat, 0.0f);
                        j90VarA2.c(fIntBitsToFloat, fIntBitsToFloat2);
                        j90VarA2.c(f5, f4);
                        j90VarA2.c(0.0f, fIntBitsToFloat2);
                        tcf.Q1(tcfVar, j90VarA2, j6, 0.0f, new yae0(f3, 0.0f, 2, 0, null, 18), 52);
                        return Unit.a;
                    }
                };
                bVarI.r(function1);
                objY2 = function1;
            }
            rxo.b(dVarD, (Function1) objY2, bVarI, 0);
            f2 = f3;
            j3 = j5;
            j4 = j6;
        } else {
            bVarI.G();
            f2 = f;
            j3 = j;
            j4 = j2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f2, i, j3, j4, dVar) { // from class: c4t
                public final /* synthetic */ d a;
                public final /* synthetic */ long b;
                public final /* synthetic */ long c;
                public final /* synthetic */ float d;

                {
                    this.a = dVar;
                    this.b = j3;
                    this.c = j4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    d4t.a(this.d, iA, this.b, this.c, (a) obj, this.a);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0136  */
    /* JADX WARN: Code duplicated, block: B:102:0x0139  */
    /* JADX WARN: Code duplicated, block: B:104:0x013f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0149  */
    /* JADX WARN: Code duplicated, block: B:111:0x016c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x016e  */
    /* JADX WARN: Code duplicated, block: B:115:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:116:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:119:0x01da  */
    /* JADX WARN: Code duplicated, block: B:122:0x01e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:125:0x022a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0237  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f A[PHI: r14
      0x008f: PHI (r14v30 int) = (r14v0 int), (r14v5 int), (r14v6 int) binds: [B:48:0x008d, B:58:0x00a5, B:57:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:94:0x0115 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:97:0x0127  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final LobbyV2ViewModel lobbyV2ViewModel, d dVar, final LobbyV2GameDetailsModel lobbyV2GameDetailsModel, Integer num, final fbh fbhVar, gnj gnjVar, final GameLogData gameLogData, final gaj<? super LobbyV2GameDetailsModel, ? super gnj, ? super GameLogData, Unit> gajVar, a aVar, final int i, final int i2) {
        int i3;
        d dVar2;
        int i4;
        Integer num2;
        int i5;
        int i6;
        int i7;
        int iOrdinal;
        boolean z;
        final d dVar3;
        final Integer num3;
        final gnj gnjVar2;
        e eVarZ;
        d dVar4;
        final gnj gnjVar3;
        boolean zIsFavourite;
        LoadingState loadingState;
        WalletInfo walletInfo;
        String strWalletString;
        boolean z2;
        Context context;
        boolean zM;
        Object objY;
        boolean z3;
        boolean zA;
        Object objY2;
        HTTPResponse hTTPResponse;
        Boolean bool;
        int i8;
        int i9;
        int i10;
        int i11;
        lobbyV2ViewModel.getClass();
        m6a0<Integer, Boolean> m6a0Var = lobbyV2ViewModel.J;
        lobbyV2GameDetailsModel.getClass();
        gameLogData.getClass();
        b bVarI = aVar.i(-807281239);
        if ((i & 6) == 0) {
            i3 = (bVarI.A(lobbyV2ViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 == 0) {
            if ((i & 48) == 0) {
                dVar2 = dVar;
                i3 |= bVarI.M(dVar2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (bVarI.A(lobbyV2GameDetailsModel)) {
                    i11 = 256;
                } else {
                    i11 = 128;
                }
                i3 |= i11;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    num2 = num;
                    if (bVarI.M(num2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) != 0) {
                    if (bVarI.M(fbhVar)) {
                        i10 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i10 = 8192;
                    }
                    i3 |= i10;
                }
                i6 = i2 & 32;
                i7 = 196608;
                if (i6 == 0) {
                    i3 |= i7;
                } else if ((196608 & i) == 0) {
                    if (gnjVar == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = gnjVar.ordinal();
                    }
                    if (bVarI.d(iOrdinal)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((1572864 & i) == 0) {
                    if (bVarI.A(gameLogData)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                }
                if ((12582912 & i) == 0) {
                    if (bVarI.A(gajVar)) {
                        i8 = 8388608;
                    } else {
                        i8 = 4194304;
                    }
                    i3 |= i8;
                }
                if ((4793491 & i3) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i3 & 1, z)) {
                    if (i12 != 0) {
                        dVar4 = d.a.b;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i4 != 0) {
                        num2 = null;
                    }
                    if (i6 != 0) {
                        gnjVar3 = gnj.c;
                    } else {
                        gnjVar3 = gnjVar;
                    }
                    zIsFavourite = (!m6a0Var.containsKey(lobbyV2GameDetailsModel.getId()) || (bool = m6a0Var.get(lobbyV2GameDetailsModel.getId())) == null) ? lobbyV2GameDetailsModel.isFavourite() : bool.booleanValue();
                    loadingState = (LoadingState) ts9.a(lobbyV2ViewModel.d, bVarI).getValue();
                    if (loadingState != null || (hTTPResponse = (HTTPResponse) loadingState.getData()) == null) {
                        walletInfo = null;
                    } else {
                        walletInfo = (WalletInfo) hTTPResponse.getData();
                    }
                    strWalletString = walletInfo != null ? walletInfo.walletString() : null;
                    if (strWalletString != null || strWalletString.length() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    final boolean z4 = !z2;
                    context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                    zM = bVarI.M(lobbyV2GameDetailsModel.getImageUrl()) | bVarI.M(context);
                    objY = bVarI.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zM || objY == c0042a) {
                        nan.a aVar2 = new nan.a(context);
                        aVar2.c = lobbyV2GameDetailsModel.getImageUrl();
                        objY = aVar2.a();
                        bVarI.r(objY);
                    }
                    final nan nanVar = (nan) objY;
                    final boolean z5 = zIsFavourite;
                    d dVarA = androidx.compose.ui.platform.d.a(c.a(dVar4, 1.0f), "lobby_v2_game_" + lobbyV2GameDetailsModel.getId());
                    jg6 jg6VarC = gg6.c(62, fw20.a(R.dimen._8sdp, bVarI));
                    fg6 fg6VarB = gg6.b(j58.l, 0L, bVarI, 6, 14);
                    if ((29360128 & i3) == 8388608) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zA = z3 | bVarI.A(lobbyV2GameDetailsModel) | ((i3 & 458752) == 131072) | bVarI.A(gameLogData);
                    objY2 = bVarI.y();
                    if (zA || objY2 == c0042a) {
                        objY2 = new Function0() { // from class: x3t
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                gaj gajVar2 = gajVar;
                                if (gajVar2 != null) {
                                    gajVar2.invoke(lobbyV2GameDetailsModel, gnjVar3, gameLogData);
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY2);
                    }
                    d dVar5 = dVar4;
                    final Integer num4 = num2;
                    rg6.b((Function0) objY2, dVarA, false, null, fg6VarB, jg6VarC, null, null, pp8.b(104916244, new gaj() { // from class: y3t
                        @Override // defpackage.gaj
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            crz crzVarA;
                            androidx.compose.foundation.layout.d dVar6;
                            a aVar3 = (a) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((j78) obj).getClass();
                            if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                d.a aVar4 = d.a.b;
                                d dVarE = j.e(aVar4, 1.0f);
                                final LobbyV2GameDetailsModel lobbyV2GameDetailsModel2 = lobbyV2GameDetailsModel;
                                d dVarA2 = s3w.a(dVarE, "game_item_" + lobbyV2GameDetailsModel2.getDisplayName());
                                n54 n54Var = ht.a.a;
                                aiv aivVarC = g75.c(n54Var, false);
                                int iHashCode = Long.hashCode(aVar3.m());
                                ne00 ne00VarO = aVar3.o();
                                d dVarC = androidx.compose.ui.c.c(aVar3, dVarA2);
                                yka.k.getClass();
                                tsr.a aVar5 = yka.a.b;
                                if (aVar3.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar3.D();
                                if (aVar3.g()) {
                                    aVar3.F(aVar5);
                                } else {
                                    aVar3.p();
                                }
                                yka.a.b bVar = yka.a.f;
                                hlh0.a(aVar3, aivVarC, bVar);
                                yka.a.d dVar7 = yka.a.e;
                                hlh0.a(aVar3, ne00VarO, dVar7);
                                yka.a.C1350a c1350a = yka.a.g;
                                if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                    j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                                }
                                yka.a.c cVar = yka.a.d;
                                hlh0.a(aVar3, dVarC, cVar);
                                if (doc.a(aVar3)) {
                                    aVar3.N(-450600093);
                                    crzVarA = erz.a(2131232584, 0, aVar3);
                                    aVar3.H();
                                } else {
                                    aVar3.N(-450597698);
                                    crzVarA = erz.a(2131232583, 0, aVar3);
                                    aVar3.H();
                                }
                                fn80.a(nanVar, lobbyV2GameDetailsModel2.getDisplayName(), androidx.compose.foundation.a.b(j.g(aVar4, 1.0f), j58.l, zk40.a), d0b.a.g, null, 0.0f, crzVarA, null, null, aVar3, 3456, 1904);
                                a aVar6 = aVar3;
                                Integer num5 = num4;
                                androidx.compose.foundation.layout.d dVar8 = androidx.compose.foundation.layout.d.a;
                                if (num5 == null) {
                                    aVar6.N(-1083249975);
                                    aVar6.H();
                                    dVar6 = dVar8;
                                } else {
                                    aVar6.N(-1083249974);
                                    int iIntValue2 = num5.intValue();
                                    float f = iIntValue2 >= 10 ? 0.28f : 0.2f;
                                    long jA = ash0.a(d2l.f(20), aVar6);
                                    d dVarC2 = j.c(j.g(aVar4, f), 0.28f);
                                    aiv aivVarC2 = g75.c(n54Var, false);
                                    int iHashCode2 = Long.hashCode(aVar6.m());
                                    ne00 ne00VarO2 = aVar6.o();
                                    d dVarC3 = androidx.compose.ui.c.c(aVar6, dVarC2);
                                    if (aVar6.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar6.D();
                                    if (aVar6.g()) {
                                        aVar6.F(aVar5);
                                    } else {
                                        aVar6.p();
                                    }
                                    hlh0.a(aVar6, aivVarC2, bVar);
                                    hlh0.a(aVar6, ne00VarO2, dVar7);
                                    if (aVar6.g() || !Intrinsics.g(aVar6.y(), Integer.valueOf(iHashCode2))) {
                                        j3c.a(iHashCode2, aVar6, iHashCode2, c1350a);
                                    }
                                    hlh0.a(aVar6, dVarC3, cVar);
                                    d4t.a(0.0f, 6, 0L, 0L, aVar6, j.e(aVar4, 1.0f));
                                    String strValueOf = String.valueOf(iIntValue2);
                                    d dVarA3 = s3w.a(dVar8.b(j.e(aVar4, 1.0f), ht.a.e), "game_banner_rank_" + iIntValue2);
                                    imf0 imf0Var = ((eah0) aVar6.O(gah0.a)).d;
                                    qyd0 qyd0Var = vh60.a;
                                    dVar6 = dVar8;
                                    lkf0.b(strValueOf, dVarA3, ((th60) aVar6.O(qyd0Var)).N, 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 1, 0, null, imf0.b(imf0Var, ((th60) aVar6.O(qyd0Var)).N, jA, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777212), aVar6, 0, 3072, 56824);
                                    aVar6 = aVar6;
                                    aVar6.s();
                                    Unit unit = Unit.a;
                                    aVar6.H();
                                }
                                if (z4) {
                                    aVar6.N(-450540442);
                                    final fbh fbhVar2 = fbhVar;
                                    if (fbhVar2 == null) {
                                        aVar6.N(-1081851813);
                                    } else {
                                        aVar6.N(-1081851812);
                                        d dVarJ = h.j(dVar6.b(j.w(aVar4, fw20.a(R.dimen._15sdp, aVar6)), ht.a.c), 0.0f, fw20.a(R.dimen._5sdp, aVar6), fw20.a(R.dimen._5sdp, aVar6), 0.0f, 9);
                                        boolean zM2 = aVar6.M(fbhVar2) | aVar6.A(lobbyV2GameDetailsModel2);
                                        final boolean z6 = z5;
                                        boolean zB = zM2 | aVar6.b(z6);
                                        Object objY3 = aVar6.y();
                                        if (zB || objY3 == a.C0041a.a) {
                                            objY3 = new Function0() { // from class: a4t
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    boolean z7 = !z6;
                                                    fbh fbhVar3 = fbhVar2;
                                                    fbhVar3.getClass();
                                                    LobbyV2GameDetailsModel lobbyV2GameDetailsModel3 = lobbyV2GameDetailsModel2;
                                                    lobbyV2GameDetailsModel3.getClass();
                                                    fbhVar3.a.invoke(lobbyV2GameDetailsModel3, Boolean.valueOf(z7));
                                                    return Unit.a;
                                                }
                                            };
                                            aVar6.r(objY3);
                                        }
                                        a aVar7 = aVar6;
                                        h9n.a(erz.a(z6 ? 2131232578 : 2131232577, 0, aVar6), pwo.e(R.string.heart_description, aVar6), s3w.a(androidx.compose.foundation.d.d(dVarJ, false, null, null, (Function0) objY3, 15), "game_item_favourite"), null, null, 0.0f, null, aVar7, 0, 120);
                                        aVar6 = aVar7;
                                        Unit unit2 = Unit.a;
                                    }
                                    aVar6.H();
                                } else {
                                    aVar6.N(-1087885900);
                                }
                                aVar6.H();
                                aVar6.s();
                            } else {
                                aVar3.G();
                            }
                            return Unit.a;
                        }
                    }, bVarI), bVarI, 100663296, 204);
                    bVarI = bVarI;
                    num3 = num4;
                    dVar3 = dVar5;
                    gnjVar2 = gnjVar3;
                } else {
                    bVarI.G();
                    dVar3 = dVar2;
                    num3 = num2;
                    gnjVar2 = gnjVar;
                }
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: z3t
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            d4t.b(lobbyV2ViewModel, dVar3, lobbyV2GameDetailsModel, num3, fbhVar, gnjVar2, gameLogData, gajVar, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 3072;
            num2 = num;
            if ((i & 24576) != 0) {
                if (bVarI.M(fbhVar)) {
                    i10 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i10 = 8192;
                }
                i3 |= i10;
            }
            i6 = i2 & 32;
            i7 = 196608;
            if (i6 == 0) {
                i3 |= i7;
            } else if ((196608 & i) == 0) {
                if (gnjVar == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = gnjVar.ordinal();
                }
                if (bVarI.d(iOrdinal)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((1572864 & i) == 0) {
                if (bVarI.A(gameLogData)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if ((12582912 & i) == 0) {
                if (bVarI.A(gajVar)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            }
            if ((4793491 & i3) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i3 & 1, z)) {
                if (i12 != 0) {
                    dVar4 = d.a.b;
                } else {
                    dVar4 = dVar2;
                }
                if (i4 != 0) {
                    num2 = null;
                }
                if (i6 != 0) {
                    gnjVar3 = gnj.c;
                } else {
                    gnjVar3 = gnjVar;
                }
                if (m6a0Var.containsKey(lobbyV2GameDetailsModel.getId())) {
                    zIsFavourite = lobbyV2GameDetailsModel.isFavourite();
                }
                loadingState = (LoadingState) ts9.a(lobbyV2ViewModel.d, bVarI).getValue();
                if (loadingState != null) {
                    walletInfo = null;
                } else {
                    walletInfo = null;
                }
                if (walletInfo != null) {
                }
                if (strWalletString != null) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                final boolean z6 = !z2;
                context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                zM = bVarI.M(lobbyV2GameDetailsModel.getImageUrl()) | bVarI.M(context);
                objY = bVarI.y();
                a.C0041a.C0042a c0042a2 = a.C0041a.a;
                if (zM) {
                    nan.a aVar3 = new nan.a(context);
                    aVar3.c = lobbyV2GameDetailsModel.getImageUrl();
                    objY = aVar3.a();
                    bVarI.r(objY);
                } else {
                    nan.a aVar4 = new nan.a(context);
                    aVar4.c = lobbyV2GameDetailsModel.getImageUrl();
                    objY = aVar4.a();
                    bVarI.r(objY);
                }
                final nan nanVar2 = (nan) objY;
                final boolean z7 = zIsFavourite;
                d dVarA2 = androidx.compose.ui.platform.d.a(c.a(dVar4, 1.0f), "lobby_v2_game_" + lobbyV2GameDetailsModel.getId());
                jg6 jg6VarC2 = gg6.c(62, fw20.a(R.dimen._8sdp, bVarI));
                fg6 fg6VarB2 = gg6.b(j58.l, 0L, bVarI, 6, 14);
                if ((29360128 & i3) == 8388608) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zA = z3 | bVarI.A(lobbyV2GameDetailsModel) | ((i3 & 458752) == 131072) | bVarI.A(gameLogData);
                objY2 = bVarI.y();
                if (zA) {
                    objY2 = new Function0() { // from class: x3t
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            gaj gajVar2 = gajVar;
                            if (gajVar2 != null) {
                                gajVar2.invoke(lobbyV2GameDetailsModel, gnjVar3, gameLogData);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                } else {
                    objY2 = new Function0() { // from class: x3t
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            gaj gajVar2 = gajVar;
                            if (gajVar2 != null) {
                                gajVar2.invoke(lobbyV2GameDetailsModel, gnjVar3, gameLogData);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                d dVar6 = dVar4;
                final Integer num5 = num2;
                rg6.b((Function0) objY2, dVarA2, false, null, fg6VarB2, jg6VarC2, null, null, pp8.b(104916244, new gaj() { // from class: y3t
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        crz crzVarA;
                        androidx.compose.foundation.layout.d dVar7;
                        a aVar5 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((j78) obj).getClass();
                        if (aVar5.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            d.a aVar6 = d.a.b;
                            d dVarE = j.e(aVar6, 1.0f);
                            final LobbyV2GameDetailsModel lobbyV2GameDetailsModel2 = lobbyV2GameDetailsModel;
                            d dVarA3 = s3w.a(dVarE, "game_item_" + lobbyV2GameDetailsModel2.getDisplayName());
                            n54 n54Var = ht.a.a;
                            aiv aivVarC = g75.c(n54Var, false);
                            int iHashCode = Long.hashCode(aVar5.m());
                            ne00 ne00VarO = aVar5.o();
                            d dVarC = androidx.compose.ui.c.c(aVar5, dVarA3);
                            yka.k.getClass();
                            tsr.a aVar7 = yka.a.b;
                            if (aVar5.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar5.D();
                            if (aVar5.g()) {
                                aVar5.F(aVar7);
                            } else {
                                aVar5.p();
                            }
                            yka.a.b bVar = yka.a.f;
                            hlh0.a(aVar5, aivVarC, bVar);
                            yka.a.d dVar8 = yka.a.e;
                            hlh0.a(aVar5, ne00VarO, dVar8);
                            yka.a.C1350a c1350a = yka.a.g;
                            if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar5, iHashCode, c1350a);
                            }
                            yka.a.c cVar = yka.a.d;
                            hlh0.a(aVar5, dVarC, cVar);
                            if (doc.a(aVar5)) {
                                aVar5.N(-450600093);
                                crzVarA = erz.a(2131232584, 0, aVar5);
                                aVar5.H();
                            } else {
                                aVar5.N(-450597698);
                                crzVarA = erz.a(2131232583, 0, aVar5);
                                aVar5.H();
                            }
                            fn80.a(nanVar2, lobbyV2GameDetailsModel2.getDisplayName(), androidx.compose.foundation.a.b(j.g(aVar6, 1.0f), j58.l, zk40.a), d0b.a.g, null, 0.0f, crzVarA, null, null, aVar5, 3456, 1904);
                            a aVar8 = aVar5;
                            Integer num6 = num5;
                            androidx.compose.foundation.layout.d dVar9 = androidx.compose.foundation.layout.d.a;
                            if (num6 == null) {
                                aVar8.N(-1083249975);
                                aVar8.H();
                                dVar7 = dVar9;
                            } else {
                                aVar8.N(-1083249974);
                                int iIntValue2 = num6.intValue();
                                float f = iIntValue2 >= 10 ? 0.28f : 0.2f;
                                long jA = ash0.a(d2l.f(20), aVar8);
                                d dVarC2 = j.c(j.g(aVar6, f), 0.28f);
                                aiv aivVarC2 = g75.c(n54Var, false);
                                int iHashCode2 = Long.hashCode(aVar8.m());
                                ne00 ne00VarO2 = aVar8.o();
                                d dVarC3 = androidx.compose.ui.c.c(aVar8, dVarC2);
                                if (aVar8.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar8.D();
                                if (aVar8.g()) {
                                    aVar8.F(aVar7);
                                } else {
                                    aVar8.p();
                                }
                                hlh0.a(aVar8, aivVarC2, bVar);
                                hlh0.a(aVar8, ne00VarO2, dVar8);
                                if (aVar8.g() || !Intrinsics.g(aVar8.y(), Integer.valueOf(iHashCode2))) {
                                    j3c.a(iHashCode2, aVar8, iHashCode2, c1350a);
                                }
                                hlh0.a(aVar8, dVarC3, cVar);
                                d4t.a(0.0f, 6, 0L, 0L, aVar8, j.e(aVar6, 1.0f));
                                String strValueOf = String.valueOf(iIntValue2);
                                d dVarA4 = s3w.a(dVar9.b(j.e(aVar6, 1.0f), ht.a.e), "game_banner_rank_" + iIntValue2);
                                imf0 imf0Var = ((eah0) aVar8.O(gah0.a)).d;
                                qyd0 qyd0Var = vh60.a;
                                dVar7 = dVar9;
                                lkf0.b(strValueOf, dVarA4, ((th60) aVar8.O(qyd0Var)).N, 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 1, 0, null, imf0.b(imf0Var, ((th60) aVar8.O(qyd0Var)).N, jA, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777212), aVar8, 0, 3072, 56824);
                                aVar8 = aVar8;
                                aVar8.s();
                                Unit unit = Unit.a;
                                aVar8.H();
                            }
                            if (z6) {
                                aVar8.N(-450540442);
                                final fbh fbhVar2 = fbhVar;
                                if (fbhVar2 == null) {
                                    aVar8.N(-1081851813);
                                } else {
                                    aVar8.N(-1081851812);
                                    d dVarJ = h.j(dVar7.b(j.w(aVar6, fw20.a(R.dimen._15sdp, aVar8)), ht.a.c), 0.0f, fw20.a(R.dimen._5sdp, aVar8), fw20.a(R.dimen._5sdp, aVar8), 0.0f, 9);
                                    boolean zM2 = aVar8.M(fbhVar2) | aVar8.A(lobbyV2GameDetailsModel2);
                                    final boolean z8 = z7;
                                    boolean zB = zM2 | aVar8.b(z8);
                                    Object objY3 = aVar8.y();
                                    if (zB || objY3 == a.C0041a.a) {
                                        objY3 = new Function0() { // from class: a4t
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                boolean z9 = !z8;
                                                fbh fbhVar3 = fbhVar2;
                                                fbhVar3.getClass();
                                                LobbyV2GameDetailsModel lobbyV2GameDetailsModel3 = lobbyV2GameDetailsModel2;
                                                lobbyV2GameDetailsModel3.getClass();
                                                fbhVar3.a.invoke(lobbyV2GameDetailsModel3, Boolean.valueOf(z9));
                                                return Unit.a;
                                            }
                                        };
                                        aVar8.r(objY3);
                                    }
                                    a aVar9 = aVar8;
                                    h9n.a(erz.a(z8 ? 2131232578 : 2131232577, 0, aVar8), pwo.e(R.string.heart_description, aVar8), s3w.a(androidx.compose.foundation.d.d(dVarJ, false, null, null, (Function0) objY3, 15), "game_item_favourite"), null, null, 0.0f, null, aVar9, 0, 120);
                                    aVar8 = aVar9;
                                    Unit unit2 = Unit.a;
                                }
                                aVar8.H();
                            } else {
                                aVar8.N(-1087885900);
                            }
                            aVar8.H();
                            aVar8.s();
                        } else {
                            aVar5.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 100663296, 204);
                bVarI = bVarI;
                num3 = num5;
                dVar3 = dVar6;
                gnjVar2 = gnjVar3;
            } else {
                bVarI.G();
                dVar3 = dVar2;
                num3 = num2;
                gnjVar2 = gnjVar;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: z3t
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        d4t.b(lobbyV2ViewModel, dVar3, lobbyV2GameDetailsModel, num3, fbhVar, gnjVar2, gameLogData, gajVar, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 48;
        dVar2 = dVar;
        if ((i & 384) == 0) {
            if (bVarI.A(lobbyV2GameDetailsModel)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i3 |= i11;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                num2 = num;
                if (bVarI.M(num2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) != 0) {
                if (bVarI.M(fbhVar)) {
                    i10 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i10 = 8192;
                }
                i3 |= i10;
            }
            i6 = i2 & 32;
            i7 = 196608;
            if (i6 == 0) {
                i3 |= i7;
            } else if ((196608 & i) == 0) {
                if (gnjVar == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = gnjVar.ordinal();
                }
                if (bVarI.d(iOrdinal)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((1572864 & i) == 0) {
                if (bVarI.A(gameLogData)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i3 |= i9;
            }
            if ((12582912 & i) == 0) {
                if (bVarI.A(gajVar)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i3 |= i8;
            }
            if ((4793491 & i3) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i3 & 1, z)) {
                if (i12 != 0) {
                    dVar4 = d.a.b;
                } else {
                    dVar4 = dVar2;
                }
                if (i4 != 0) {
                    num2 = null;
                }
                if (i6 != 0) {
                    gnjVar3 = gnj.c;
                } else {
                    gnjVar3 = gnjVar;
                }
                if (m6a0Var.containsKey(lobbyV2GameDetailsModel.getId())) {
                    zIsFavourite = lobbyV2GameDetailsModel.isFavourite();
                }
                loadingState = (LoadingState) ts9.a(lobbyV2ViewModel.d, bVarI).getValue();
                if (loadingState != null) {
                    walletInfo = null;
                } else {
                    walletInfo = null;
                }
                if (walletInfo != null) {
                }
                if (strWalletString != null) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                final boolean z8 = !z2;
                context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                zM = bVarI.M(lobbyV2GameDetailsModel.getImageUrl()) | bVarI.M(context);
                objY = bVarI.y();
                a.C0041a.C0042a c0042a3 = a.C0041a.a;
                if (zM) {
                    nan.a aVar5 = new nan.a(context);
                    aVar5.c = lobbyV2GameDetailsModel.getImageUrl();
                    objY = aVar5.a();
                    bVarI.r(objY);
                } else {
                    nan.a aVar6 = new nan.a(context);
                    aVar6.c = lobbyV2GameDetailsModel.getImageUrl();
                    objY = aVar6.a();
                    bVarI.r(objY);
                }
                final nan nanVar3 = (nan) objY;
                final boolean z9 = zIsFavourite;
                d dVarA3 = androidx.compose.ui.platform.d.a(c.a(dVar4, 1.0f), "lobby_v2_game_" + lobbyV2GameDetailsModel.getId());
                jg6 jg6VarC3 = gg6.c(62, fw20.a(R.dimen._8sdp, bVarI));
                fg6 fg6VarB3 = gg6.b(j58.l, 0L, bVarI, 6, 14);
                if ((29360128 & i3) == 8388608) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zA = z3 | bVarI.A(lobbyV2GameDetailsModel) | ((i3 & 458752) == 131072) | bVarI.A(gameLogData);
                objY2 = bVarI.y();
                if (zA) {
                    objY2 = new Function0() { // from class: x3t
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            gaj gajVar2 = gajVar;
                            if (gajVar2 != null) {
                                gajVar2.invoke(lobbyV2GameDetailsModel, gnjVar3, gameLogData);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                } else {
                    objY2 = new Function0() { // from class: x3t
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            gaj gajVar2 = gajVar;
                            if (gajVar2 != null) {
                                gajVar2.invoke(lobbyV2GameDetailsModel, gnjVar3, gameLogData);
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                d dVar7 = dVar4;
                final Integer num6 = num2;
                rg6.b((Function0) objY2, dVarA3, false, null, fg6VarB3, jg6VarC3, null, null, pp8.b(104916244, new gaj() { // from class: y3t
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        crz crzVarA;
                        androidx.compose.foundation.layout.d dVar8;
                        a aVar7 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((j78) obj).getClass();
                        if (aVar7.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            d.a aVar8 = d.a.b;
                            d dVarE = j.e(aVar8, 1.0f);
                            final LobbyV2GameDetailsModel lobbyV2GameDetailsModel2 = lobbyV2GameDetailsModel;
                            d dVarA4 = s3w.a(dVarE, "game_item_" + lobbyV2GameDetailsModel2.getDisplayName());
                            n54 n54Var = ht.a.a;
                            aiv aivVarC = g75.c(n54Var, false);
                            int iHashCode = Long.hashCode(aVar7.m());
                            ne00 ne00VarO = aVar7.o();
                            d dVarC = androidx.compose.ui.c.c(aVar7, dVarA4);
                            yka.k.getClass();
                            tsr.a aVar9 = yka.a.b;
                            if (aVar7.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar7.D();
                            if (aVar7.g()) {
                                aVar7.F(aVar9);
                            } else {
                                aVar7.p();
                            }
                            yka.a.b bVar = yka.a.f;
                            hlh0.a(aVar7, aivVarC, bVar);
                            yka.a.d dVar9 = yka.a.e;
                            hlh0.a(aVar7, ne00VarO, dVar9);
                            yka.a.C1350a c1350a = yka.a.g;
                            if (aVar7.g() || !Intrinsics.g(aVar7.y(), Integer.valueOf(iHashCode))) {
                                j3c.a(iHashCode, aVar7, iHashCode, c1350a);
                            }
                            yka.a.c cVar = yka.a.d;
                            hlh0.a(aVar7, dVarC, cVar);
                            if (doc.a(aVar7)) {
                                aVar7.N(-450600093);
                                crzVarA = erz.a(2131232584, 0, aVar7);
                                aVar7.H();
                            } else {
                                aVar7.N(-450597698);
                                crzVarA = erz.a(2131232583, 0, aVar7);
                                aVar7.H();
                            }
                            fn80.a(nanVar3, lobbyV2GameDetailsModel2.getDisplayName(), androidx.compose.foundation.a.b(j.g(aVar8, 1.0f), j58.l, zk40.a), d0b.a.g, null, 0.0f, crzVarA, null, null, aVar7, 3456, 1904);
                            a aVar10 = aVar7;
                            Integer num7 = num6;
                            androidx.compose.foundation.layout.d dVar10 = androidx.compose.foundation.layout.d.a;
                            if (num7 == null) {
                                aVar10.N(-1083249975);
                                aVar10.H();
                                dVar8 = dVar10;
                            } else {
                                aVar10.N(-1083249974);
                                int iIntValue2 = num7.intValue();
                                float f = iIntValue2 >= 10 ? 0.28f : 0.2f;
                                long jA = ash0.a(d2l.f(20), aVar10);
                                d dVarC2 = j.c(j.g(aVar8, f), 0.28f);
                                aiv aivVarC2 = g75.c(n54Var, false);
                                int iHashCode2 = Long.hashCode(aVar10.m());
                                ne00 ne00VarO2 = aVar10.o();
                                d dVarC3 = androidx.compose.ui.c.c(aVar10, dVarC2);
                                if (aVar10.k() == null) {
                                    l2a.b();
                                    throw null;
                                }
                                aVar10.D();
                                if (aVar10.g()) {
                                    aVar10.F(aVar9);
                                } else {
                                    aVar10.p();
                                }
                                hlh0.a(aVar10, aivVarC2, bVar);
                                hlh0.a(aVar10, ne00VarO2, dVar9);
                                if (aVar10.g() || !Intrinsics.g(aVar10.y(), Integer.valueOf(iHashCode2))) {
                                    j3c.a(iHashCode2, aVar10, iHashCode2, c1350a);
                                }
                                hlh0.a(aVar10, dVarC3, cVar);
                                d4t.a(0.0f, 6, 0L, 0L, aVar10, j.e(aVar8, 1.0f));
                                String strValueOf = String.valueOf(iIntValue2);
                                d dVarA5 = s3w.a(dVar10.b(j.e(aVar8, 1.0f), ht.a.e), "game_banner_rank_" + iIntValue2);
                                imf0 imf0Var = ((eah0) aVar10.O(gah0.a)).d;
                                qyd0 qyd0Var = vh60.a;
                                dVar8 = dVar10;
                                lkf0.b(strValueOf, dVarA5, ((th60) aVar10.O(qyd0Var)).N, 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 1, 0, null, imf0.b(imf0Var, ((th60) aVar10.O(qyd0Var)).N, jA, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777212), aVar10, 0, 3072, 56824);
                                aVar10 = aVar10;
                                aVar10.s();
                                Unit unit = Unit.a;
                                aVar10.H();
                            }
                            if (z8) {
                                aVar10.N(-450540442);
                                final fbh fbhVar2 = fbhVar;
                                if (fbhVar2 == null) {
                                    aVar10.N(-1081851813);
                                } else {
                                    aVar10.N(-1081851812);
                                    d dVarJ = h.j(dVar8.b(j.w(aVar8, fw20.a(R.dimen._15sdp, aVar10)), ht.a.c), 0.0f, fw20.a(R.dimen._5sdp, aVar10), fw20.a(R.dimen._5sdp, aVar10), 0.0f, 9);
                                    boolean zM2 = aVar10.M(fbhVar2) | aVar10.A(lobbyV2GameDetailsModel2);
                                    final boolean z10 = z9;
                                    boolean zB = zM2 | aVar10.b(z10);
                                    Object objY3 = aVar10.y();
                                    if (zB || objY3 == a.C0041a.a) {
                                        objY3 = new Function0() { // from class: a4t
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                boolean z11 = !z10;
                                                fbh fbhVar3 = fbhVar2;
                                                fbhVar3.getClass();
                                                LobbyV2GameDetailsModel lobbyV2GameDetailsModel3 = lobbyV2GameDetailsModel2;
                                                lobbyV2GameDetailsModel3.getClass();
                                                fbhVar3.a.invoke(lobbyV2GameDetailsModel3, Boolean.valueOf(z11));
                                                return Unit.a;
                                            }
                                        };
                                        aVar10.r(objY3);
                                    }
                                    a aVar11 = aVar10;
                                    h9n.a(erz.a(z10 ? 2131232578 : 2131232577, 0, aVar10), pwo.e(R.string.heart_description, aVar10), s3w.a(androidx.compose.foundation.d.d(dVarJ, false, null, null, (Function0) objY3, 15), "game_item_favourite"), null, null, 0.0f, null, aVar11, 0, 120);
                                    aVar10 = aVar11;
                                    Unit unit2 = Unit.a;
                                }
                                aVar10.H();
                            } else {
                                aVar10.N(-1087885900);
                            }
                            aVar10.H();
                            aVar10.s();
                        } else {
                            aVar7.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 100663296, 204);
                bVarI = bVarI;
                num3 = num6;
                dVar3 = dVar7;
                gnjVar2 = gnjVar3;
            } else {
                bVarI.G();
                dVar3 = dVar2;
                num3 = num2;
                gnjVar2 = gnjVar;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: z3t
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        d4t.b(lobbyV2ViewModel, dVar3, lobbyV2GameDetailsModel, num3, fbhVar, gnjVar2, gameLogData, gajVar, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 3072;
        num2 = num;
        if ((i & 24576) != 0) {
            if (bVarI.M(fbhVar)) {
                i10 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i10 = 8192;
            }
            i3 |= i10;
        }
        i6 = i2 & 32;
        i7 = 196608;
        if (i6 == 0) {
            i3 |= i7;
        } else if ((196608 & i) == 0) {
            if (gnjVar == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = gnjVar.ordinal();
            }
            if (bVarI.d(iOrdinal)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        if ((1572864 & i) == 0) {
            if (bVarI.A(gameLogData)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        if ((12582912 & i) == 0) {
            if (bVarI.A(gajVar)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i3 |= i8;
        }
        if ((4793491 & i3) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i3 & 1, z)) {
            if (i12 != 0) {
                dVar4 = d.a.b;
            } else {
                dVar4 = dVar2;
            }
            if (i4 != 0) {
                num2 = null;
            }
            if (i6 != 0) {
                gnjVar3 = gnj.c;
            } else {
                gnjVar3 = gnjVar;
            }
            if (m6a0Var.containsKey(lobbyV2GameDetailsModel.getId())) {
                zIsFavourite = lobbyV2GameDetailsModel.isFavourite();
            }
            loadingState = (LoadingState) ts9.a(lobbyV2ViewModel.d, bVarI).getValue();
            if (loadingState != null) {
                walletInfo = null;
            } else {
                walletInfo = null;
            }
            if (walletInfo != null) {
            }
            if (strWalletString != null) {
                z2 = true;
            } else {
                z2 = true;
            }
            final boolean z10 = !z2;
            context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            zM = bVarI.M(lobbyV2GameDetailsModel.getImageUrl()) | bVarI.M(context);
            objY = bVarI.y();
            a.C0041a.C0042a c0042a4 = a.C0041a.a;
            if (zM) {
                nan.a aVar7 = new nan.a(context);
                aVar7.c = lobbyV2GameDetailsModel.getImageUrl();
                objY = aVar7.a();
                bVarI.r(objY);
            } else {
                nan.a aVar8 = new nan.a(context);
                aVar8.c = lobbyV2GameDetailsModel.getImageUrl();
                objY = aVar8.a();
                bVarI.r(objY);
            }
            final nan nanVar4 = (nan) objY;
            final boolean z11 = zIsFavourite;
            d dVarA4 = androidx.compose.ui.platform.d.a(c.a(dVar4, 1.0f), "lobby_v2_game_" + lobbyV2GameDetailsModel.getId());
            jg6 jg6VarC4 = gg6.c(62, fw20.a(R.dimen._8sdp, bVarI));
            fg6 fg6VarB4 = gg6.b(j58.l, 0L, bVarI, 6, 14);
            if ((29360128 & i3) == 8388608) {
                z3 = true;
            } else {
                z3 = false;
            }
            zA = z3 | bVarI.A(lobbyV2GameDetailsModel) | ((i3 & 458752) == 131072) | bVarI.A(gameLogData);
            objY2 = bVarI.y();
            if (zA) {
                objY2 = new Function0() { // from class: x3t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        gaj gajVar2 = gajVar;
                        if (gajVar2 != null) {
                            gajVar2.invoke(lobbyV2GameDetailsModel, gnjVar3, gameLogData);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            } else {
                objY2 = new Function0() { // from class: x3t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        gaj gajVar2 = gajVar;
                        if (gajVar2 != null) {
                            gajVar2.invoke(lobbyV2GameDetailsModel, gnjVar3, gameLogData);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            d dVar8 = dVar4;
            final Integer num7 = num2;
            rg6.b((Function0) objY2, dVarA4, false, null, fg6VarB4, jg6VarC4, null, null, pp8.b(104916244, new gaj() { // from class: y3t
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    crz crzVarA;
                    androidx.compose.foundation.layout.d dVar9;
                    a aVar9 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar9.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d.a aVar10 = d.a.b;
                        d dVarE = j.e(aVar10, 1.0f);
                        final LobbyV2GameDetailsModel lobbyV2GameDetailsModel2 = lobbyV2GameDetailsModel;
                        d dVarA5 = s3w.a(dVarE, "game_item_" + lobbyV2GameDetailsModel2.getDisplayName());
                        n54 n54Var = ht.a.a;
                        aiv aivVarC = g75.c(n54Var, false);
                        int iHashCode = Long.hashCode(aVar9.m());
                        ne00 ne00VarO = aVar9.o();
                        d dVarC = androidx.compose.ui.c.c(aVar9, dVarA5);
                        yka.k.getClass();
                        tsr.a aVar11 = yka.a.b;
                        if (aVar9.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar9.D();
                        if (aVar9.g()) {
                            aVar9.F(aVar11);
                        } else {
                            aVar9.p();
                        }
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar9, aivVarC, bVar);
                        yka.a.d dVar10 = yka.a.e;
                        hlh0.a(aVar9, ne00VarO, dVar10);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar9.g() || !Intrinsics.g(aVar9.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar9, iHashCode, c1350a);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar9, dVarC, cVar);
                        if (doc.a(aVar9)) {
                            aVar9.N(-450600093);
                            crzVarA = erz.a(2131232584, 0, aVar9);
                            aVar9.H();
                        } else {
                            aVar9.N(-450597698);
                            crzVarA = erz.a(2131232583, 0, aVar9);
                            aVar9.H();
                        }
                        fn80.a(nanVar4, lobbyV2GameDetailsModel2.getDisplayName(), androidx.compose.foundation.a.b(j.g(aVar10, 1.0f), j58.l, zk40.a), d0b.a.g, null, 0.0f, crzVarA, null, null, aVar9, 3456, 1904);
                        a aVar12 = aVar9;
                        Integer num8 = num7;
                        androidx.compose.foundation.layout.d dVar11 = androidx.compose.foundation.layout.d.a;
                        if (num8 == null) {
                            aVar12.N(-1083249975);
                            aVar12.H();
                            dVar9 = dVar11;
                        } else {
                            aVar12.N(-1083249974);
                            int iIntValue2 = num8.intValue();
                            float f = iIntValue2 >= 10 ? 0.28f : 0.2f;
                            long jA = ash0.a(d2l.f(20), aVar12);
                            d dVarC2 = j.c(j.g(aVar10, f), 0.28f);
                            aiv aivVarC2 = g75.c(n54Var, false);
                            int iHashCode2 = Long.hashCode(aVar12.m());
                            ne00 ne00VarO2 = aVar12.o();
                            d dVarC3 = androidx.compose.ui.c.c(aVar12, dVarC2);
                            if (aVar12.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar12.D();
                            if (aVar12.g()) {
                                aVar12.F(aVar11);
                            } else {
                                aVar12.p();
                            }
                            hlh0.a(aVar12, aivVarC2, bVar);
                            hlh0.a(aVar12, ne00VarO2, dVar10);
                            if (aVar12.g() || !Intrinsics.g(aVar12.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar12, iHashCode2, c1350a);
                            }
                            hlh0.a(aVar12, dVarC3, cVar);
                            d4t.a(0.0f, 6, 0L, 0L, aVar12, j.e(aVar10, 1.0f));
                            String strValueOf = String.valueOf(iIntValue2);
                            d dVarA6 = s3w.a(dVar11.b(j.e(aVar10, 1.0f), ht.a.e), "game_banner_rank_" + iIntValue2);
                            imf0 imf0Var = ((eah0) aVar12.O(gah0.a)).d;
                            qyd0 qyd0Var = vh60.a;
                            dVar9 = dVar11;
                            lkf0.b(strValueOf, dVarA6, ((th60) aVar12.O(qyd0Var)).N, 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 1, 0, null, imf0.b(imf0Var, ((th60) aVar12.O(qyd0Var)).N, jA, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777212), aVar12, 0, 3072, 56824);
                            aVar12 = aVar12;
                            aVar12.s();
                            Unit unit = Unit.a;
                            aVar12.H();
                        }
                        if (z10) {
                            aVar12.N(-450540442);
                            final fbh fbhVar2 = fbhVar;
                            if (fbhVar2 == null) {
                                aVar12.N(-1081851813);
                            } else {
                                aVar12.N(-1081851812);
                                d dVarJ = h.j(dVar9.b(j.w(aVar10, fw20.a(R.dimen._15sdp, aVar12)), ht.a.c), 0.0f, fw20.a(R.dimen._5sdp, aVar12), fw20.a(R.dimen._5sdp, aVar12), 0.0f, 9);
                                boolean zM2 = aVar12.M(fbhVar2) | aVar12.A(lobbyV2GameDetailsModel2);
                                final boolean z12 = z11;
                                boolean zB = zM2 | aVar12.b(z12);
                                Object objY3 = aVar12.y();
                                if (zB || objY3 == a.C0041a.a) {
                                    objY3 = new Function0() { // from class: a4t
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            boolean z13 = !z12;
                                            fbh fbhVar3 = fbhVar2;
                                            fbhVar3.getClass();
                                            LobbyV2GameDetailsModel lobbyV2GameDetailsModel3 = lobbyV2GameDetailsModel2;
                                            lobbyV2GameDetailsModel3.getClass();
                                            fbhVar3.a.invoke(lobbyV2GameDetailsModel3, Boolean.valueOf(z13));
                                            return Unit.a;
                                        }
                                    };
                                    aVar12.r(objY3);
                                }
                                a aVar13 = aVar12;
                                h9n.a(erz.a(z12 ? 2131232578 : 2131232577, 0, aVar12), pwo.e(R.string.heart_description, aVar12), s3w.a(androidx.compose.foundation.d.d(dVarJ, false, null, null, (Function0) objY3, 15), "game_item_favourite"), null, null, 0.0f, null, aVar13, 0, 120);
                                aVar12 = aVar13;
                                Unit unit2 = Unit.a;
                            }
                            aVar12.H();
                        } else {
                            aVar12.N(-1087885900);
                        }
                        aVar12.H();
                        aVar12.s();
                    } else {
                        aVar9.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 100663296, 204);
            bVarI = bVarI;
            num3 = num7;
            dVar3 = dVar8;
            gnjVar2 = gnjVar3;
        } else {
            bVarI.G();
            dVar3 = dVar2;
            num3 = num2;
            gnjVar2 = gnjVar;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: z3t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d4t.b(lobbyV2ViewModel, dVar3, lobbyV2GameDetailsModel, num3, fbhVar, gnjVar2, gameLogData, gajVar, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
