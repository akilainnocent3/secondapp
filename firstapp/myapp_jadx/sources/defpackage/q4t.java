package defpackage;

import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportygames.compose.lobbyv2.models.GameLogData;
import com.sportygames.compose.lobbyv2.models.LobbyV2GameDetailsModel;
import com.sportygames.compose.lobbyv2.viewmodels.LobbyV2ViewModel;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class q4t {
    public static final void a(int i, a aVar) {
        b bVarI = aVar.i(609358711);
        if (bVarI.q(i & 1, i != 0)) {
            p7l.a aVar2 = new p7l.a(3);
            umz umzVar = new umz(8.0f, 8.0f, 8.0f, 8.0f);
            kw0.i iVar = new kw0.i(8.0f, true, new hw0());
            kw0.i iVar2 = new kw0.i(8.0f, true, new hw0());
            d dVarA = androidx.compose.ui.platform.d.a(j.e(d.a.b, 1.0f), "lobby_v2_games_loading");
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new n4t();
                bVarI.r(objY);
            }
            iur.a(aVar2, dVarA, null, umzVar, iVar2, iVar, null, false, null, (Function1) objY, bVarI, 1772592, 6, 916);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new o4t();
        }
    }

    public static final void b(final LobbyV2ViewModel lobbyV2ViewModel, final h0s h0sVar, final gaj gajVar, final fbh fbhVar, final zvr zvrVar, final gnj gnjVar, final String str, final String str2, final String str3, a aVar, final int i) {
        int i2;
        b bVar;
        int i3;
        lobbyV2ViewModel.getClass();
        h0sVar.getClass();
        zvrVar.getClass();
        b bVarI = aVar.i(1398524203);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(lobbyV2ViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(h0sVar) : bVarI.A(h0sVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(gajVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(fbhVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.M(zvrVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.d(gnjVar.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.M(str) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bVarI.M(str2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= bVarI.M(str3) ? 67108864 : 33554432;
        }
        if (bVarI.q(i2 & 1, (i2 & 38347923) != 38347922)) {
            p7l.a aVar2 = new p7l.a(3);
            umz umzVarB = h.b(fw20.a(R.dimen.lobby_v2_general_item_spacing, bVarI), 0.0f, fw20.a(R.dimen.lobby_v2_general_item_spacing, bVarI), fw20.a(R.dimen._16sdp, bVarI), 2);
            kw0.i iVar = new kw0.i(fw20.a(R.dimen.lobby_v2_general_item_spacing, bVarI), true, new hw0());
            kw0.i iVar2 = new kw0.i(fw20.a(R.dimen.lobby_v2_general_item_spacing, bVarI), true, new hw0());
            d dVarA = androidx.compose.ui.platform.d.a(j.e(d.a.b, 1.0f), "lobby_v2_games_grid");
            boolean zA = ((i2 & 112) == 32 || ((i2 & 64) != 0 && bVarI.A(h0sVar))) | ((3670016 & i2) == 1048576) | ((29360128 & i2) == 8388608) | ((234881024 & i2) == 67108864) | bVarI.A(lobbyV2ViewModel) | ((i2 & 7168) == 2048) | ((458752 & i2) == 131072) | ((i2 & 896) == 256);
            Object objY = bVarI.y();
            if (zA || objY == a.C0041a.a) {
                i3 = i2;
                Function1 function1 = new Function1() { // from class: l4t
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        lvr lvrVar = (lvr) obj;
                        lvrVar.getClass();
                        final h0s h0sVar2 = h0sVar;
                        int iC = h0sVar2.c();
                        qdj qdjVar = new qdj(h0sVar2, 1);
                        final String str4 = str;
                        final String str5 = str2;
                        final String str6 = str3;
                        final LobbyV2ViewModel lobbyV2ViewModel2 = lobbyV2ViewModel;
                        final fbh fbhVar2 = fbhVar;
                        final gnj gnjVar2 = gnjVar;
                        final gaj gajVar2 = gajVar;
                        lvr.g(lvrVar, iC, qdjVar, new op8(1074100230, new iaj() { // from class: p4t
                            @Override // defpackage.iaj
                            public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                                int iIntValue = ((Integer) obj3).intValue();
                                a aVar3 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((tur) obj2).getClass();
                                if ((iIntValue2 & 48) == 0) {
                                    iIntValue2 |= aVar3.d(iIntValue) ? 32 : 16;
                                }
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                                    LobbyV2GameDetailsModel lobbyV2GameDetailsModel = (LobbyV2GameDetailsModel) h0sVar2.b(iIntValue);
                                    if (lobbyV2GameDetailsModel != null) {
                                        aVar3.N(1013735457);
                                        String str7 = str4;
                                        boolean zM = aVar3.M(str7);
                                        String str8 = str5;
                                        boolean zM2 = zM | aVar3.M(str8);
                                        String str9 = str6;
                                        boolean zM3 = zM2 | aVar3.M(str9) | ((iIntValue2 & 112) == 32);
                                        Object objY2 = aVar3.y();
                                        if (zM3 || objY2 == a.C0041a.a) {
                                            GameLogData gameLogData = new GameLogData(str7, !str7.equals("provider_list") ? str8 : null, null, str7.equals("provider_list") ? str9 : null, iIntValue, 4, null);
                                            aVar3.r(gameLogData);
                                            objY2 = gameLogData;
                                        }
                                        d4t.b(lobbyV2ViewModel2, null, lobbyV2GameDetailsModel, null, fbhVar2, gnjVar2, (GameLogData) objY2, gajVar2, aVar3, 0, 10);
                                        aVar3.H();
                                    } else {
                                        aVar3.N(1014601752);
                                        u9t.a(c.a(d.a.b, 1.0f), aVar3, 6);
                                        aVar3.H();
                                    }
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, true), 12);
                        hxs hxsVar = h0sVar2.d().c;
                        if (hxsVar instanceof hxs.b) {
                            lvr.g(lvrVar, 30, null, ec9.b, 14);
                        } else if (hxsVar instanceof hxs.a) {
                            lvrVar.a(new cdj(1), new op8(1698727872, new gaj() { // from class: h4t
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    a aVar3 = (a) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    ((tur) obj2).getClass();
                                    if (aVar3.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        d.a aVar4 = d.a.b;
                                        d dVarF = h.f(j.g(aVar4, 1.0f), 16.0f);
                                        aiv aivVarC = g75.c(ht.a.e, false);
                                        int iHashCode = Long.hashCode(aVar3.m());
                                        ne00 ne00VarO = aVar3.o();
                                        d dVarC = androidx.compose.ui.c.c(aVar3, dVarF);
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
                                        hlh0.a(aVar3, aivVarC, yka.a.f);
                                        hlh0.a(aVar3, ne00VarO, yka.a.e);
                                        yka.a.C1350a c1350a = yka.a.g;
                                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                                            j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                                        }
                                        hlh0.a(aVar3, dVarC, yka.a.d);
                                        d dVarA2 = androidx.compose.ui.platform.d.a(aVar4, "lobby_v2_games_append_retry");
                                        h0s h0sVar3 = h0sVar2;
                                        boolean zA2 = aVar3.A(h0sVar3);
                                        Object objY2 = aVar3.y();
                                        if (zA2 || objY2 == a.C0041a.a) {
                                            objY2 = new m9a(h0sVar3, 1);
                                            aVar3.r(objY2);
                                        }
                                        nk5.a((Function0) objY2, dVarA2, false, null, null, null, null, null, null, ec9.c, aVar3, 805306416, 508);
                                        aVar3.s();
                                    } else {
                                        aVar3.G();
                                    }
                                    return Unit.a;
                                }
                            }, true));
                        } else if (!(hxsVar instanceof hxs.c)) {
                            uhc.a();
                            return null;
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(function1);
                objY = function1;
            } else {
                i3 = i2;
            }
            bVar = bVarI;
            iur.a(aVar2, dVarA, zvrVar, umzVarB, iVar2, iVar, null, false, null, (Function1) objY, bVar, ((i3 >> 6) & 896) | 48, 0, 912);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: m4t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q4t.b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVar, gnjVar, str, str2, str3, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0138  */
    /* JADX WARN: Code duplicated, block: B:102:0x013d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0145  */
    /* JADX WARN: Code duplicated, block: B:108:0x0154  */
    /* JADX WARN: Code duplicated, block: B:112:0x015d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0168  */
    /* JADX WARN: Code duplicated, block: B:117:0x016a  */
    /* JADX WARN: Code duplicated, block: B:119:0x016e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0171  */
    /* JADX WARN: Code duplicated, block: B:122:0x0174  */
    /* JADX WARN: Code duplicated, block: B:124:0x0178  */
    /* JADX WARN: Code duplicated, block: B:125:0x017a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0191  */
    /* JADX WARN: Code duplicated, block: B:129:0x0193  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:136:0x01af  */
    /* JADX WARN: Code duplicated, block: B:137:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:140:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:141:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:144:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:145:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:148:0x0210  */
    /* JADX WARN: Code duplicated, block: B:150:0x021e  */
    /* JADX WARN: Code duplicated, block: B:153:0x022a  */
    /* JADX WARN: Code duplicated, block: B:155:0x024e  */
    /* JADX WARN: Code duplicated, block: B:158:0x026b  */
    /* JADX WARN: Code duplicated, block: B:160:0x0273  */
    /* JADX WARN: Code duplicated, block: B:163:0x029c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x029e  */
    /* JADX WARN: Code duplicated, block: B:167:0x02c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:168:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:171:0x02f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:183:0x0381  */
    /* JADX WARN: Code duplicated, block: B:185:0x0389  */
    /* JADX WARN: Code duplicated, block: B:187:0x039c  */
    /* JADX WARN: Code duplicated, block: B:188:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:190:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:191:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:194:0x0407  */
    /* JADX WARN: Code duplicated, block: B:195:0x0414  */
    /* JADX WARN: Code duplicated, block: B:197:0x0422  */
    /* JADX WARN: Code duplicated, block: B:198:0x0424 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:201:0x042d  */
    /* JADX WARN: Code duplicated, block: B:216:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:217:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:219:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:220:0x050b  */
    /* JADX WARN: Code duplicated, block: B:223:0x054e  */
    /* JADX WARN: Code duplicated, block: B:224:0x055b  */
    /* JADX WARN: Code duplicated, block: B:229:0x056f  */
    /* JADX WARN: Code duplicated, block: B:231:0x0577  */
    /* JADX WARN: Code duplicated, block: B:233:0x0583  */
    /* JADX WARN: Code duplicated, block: B:234:0x0588  */
    /* JADX WARN: Code duplicated, block: B:237:0x0596 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:240:0x059b  */
    /* JADX WARN: Code duplicated, block: B:242:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:244:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:246:0x05b9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:247:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:250:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:252:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:255:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:256:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:259:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:261:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:262:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:264:0x060d  */
    /* JADX WARN: Code duplicated, block: B:268:0x0656  */
    /* JADX WARN: Code duplicated, block: B:270:0x065f  */
    /* JADX WARN: Code duplicated, block: B:273:0x066e  */
    /* JADX WARN: Code duplicated, block: B:275:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:51:0x009f  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:84:0x0102  */
    /* JADX WARN: Code duplicated, block: B:85:0x0105  */
    /* JADX WARN: Code duplicated, block: B:89:0x010f  */
    /* JADX WARN: Code duplicated, block: B:91:0x011b  */
    /* JADX WARN: Code duplicated, block: B:92:0x011e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0123  */
    /* JADX WARN: Code duplicated, block: B:97:0x012f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0135  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v41, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v68 */
    /* JADX WARN: Type inference failed for: r7v69 */
    /* JADX WARN: Type inference failed for: r7v70 */
    public static final void c(final yfx yfxVar, final LobbyV2ViewModel lobbyV2ViewModel, final int i, String str, String str2, boolean z, final boolean z2, final fbh fbhVar, boolean z3, final gaj<? super LobbyV2GameDetailsModel, ? super gnj, ? super GameLogData, Unit> gajVar, final gnj gnjVar, final String str3, final lyh<kqz<LobbyV2GameDetailsModel>> lyhVar, a aVar, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        String str4;
        int i7;
        int i8;
        boolean z4;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z5;
        final String str5;
        final boolean z6;
        final boolean z7;
        final String str6;
        e eVarZ;
        String str7;
        boolean z8;
        final boolean z9;
        h0s<LobbyV2GameDetailsModel> h0sVarA;
        zvr zvrVarA;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Object obj;
        Function1 function1;
        int iHashCode;
        d.a aVar2;
        String str8;
        tsr.a aVar3;
        yka.a.C1350a c1350a;
        boolean z14;
        hxs hxsVar;
        boolean z15;
        boolean z16;
        d dVarE;
        boolean zA;
        ?? r7;
        Object obj2;
        boolean z17;
        h0s<LobbyV2GameDetailsModel> h0sVar;
        Unit unit;
        boolean z18;
        String str9;
        Unit unit2;
        boolean z19;
        h0s h0sVar2;
        boolean z20;
        Unit unit3;
        ?? r8;
        ?? r9;
        boolean z21;
        Unit unit4;
        boolean z22;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        yfxVar.getClass();
        lobbyV2ViewModel.getClass();
        LinkedHashMap linkedHashMap = lobbyV2ViewModel.G;
        LinkedHashMap linkedHashMap2 = lobbyV2ViewModel.H;
        lyhVar.getClass();
        b bVarI = aVar.i(1448769370);
        if ((i2 & 6) == 0) {
            i5 = (bVarI.A(yfxVar) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= bVarI.A(lobbyV2ViewModel) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= bVarI.d(i) ? 256 : 128;
        }
        int i23 = i4 & 8;
        if (i23 == 0) {
            if ((i2 & 3072) == 0) {
                i5 |= bVarI.M(str) ? 2048 : 1024;
            }
            i6 = i4 & 16;
            if (i6 != 0) {
                if ((i2 & 24576) == 0) {
                    str4 = str2;
                    if (bVarI.M(str4)) {
                        i7 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i7 = 8192;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 32;
                if (i8 != 0) {
                    i5 |= 196608;
                    z4 = z;
                } else {
                    z4 = z;
                    if ((i2 & 196608) == 0) {
                        if (bVarI.b(z4)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i5 |= i9;
                    }
                }
                if ((i2 & 1572864) == 0) {
                    if (bVarI.b(z2)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i5 |= i22;
                }
                if ((i2 & 12582912) == 0) {
                    if (bVarI.M(fbhVar)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i5 |= i21;
                }
                i10 = i5;
                i11 = i4 & 256;
                if (i11 != 0) {
                    i10 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    if (bVarI.b(z3)) {
                        i12 = 67108864;
                    } else {
                        i12 = 33554432;
                    }
                    i10 |= i12;
                }
                if ((i2 & 805306368) == 0) {
                    if (bVarI.A(gajVar)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i10 |= i20;
                }
                i13 = i10;
                if ((i3 & 6) == 0) {
                    if (bVarI.d(gnjVar.ordinal())) {
                        i19 = 4;
                    } else {
                        i19 = 2;
                    }
                    i14 = i3 | i19;
                } else {
                    i14 = i3;
                }
                i15 = i14;
                if ((i3 & 48) == 0) {
                    if (bVarI.M(str3)) {
                        i18 = 32;
                    } else {
                        i18 = 16;
                    }
                    i16 = i15 | i18;
                } else {
                    i16 = i15;
                }
                i17 = i16 | (bVarI.A(lyhVar) ? 256 : 128);
                if ((i13 & 306783379) == 306783378 || (i17 & 147) != 146) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (bVarI.q(i13 & 1, z5)) {
                    if (i23 != 0) {
                        str7 = null;
                    } else {
                        str7 = str;
                    }
                    if (i6 != 0) {
                        str4 = null;
                    }
                    if (i8 != 0) {
                        z8 = false;
                    } else {
                        z8 = z4;
                    }
                    if (i11 != 0) {
                        z9 = false;
                    } else {
                        z9 = z3;
                    }
                    h0sVarA = k0s.a(lyhVar, bVarI);
                    zvrVarA = dwr.a(0, 3, bVarI);
                    boolean zA2 = bVarI.A(yfxVar);
                    if ((i13 & 896) == 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z23 = zA2 | z10;
                    if ((i13 & 3670016) == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z24 = z23 | z11;
                    if ((i13 & 234881024) == 67108864) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z24 | z12;
                    Object objY = bVarI.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    obj = objY;
                    if (z13 || objY == c0042a) {
                        Function1 function2 = new Function1() { // from class: i4t
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                StringBuilder sbA = dy5.a("search?id=", i, z2 ? 1 : 0, "&section=1&favourite=", "&provider=");
                                sbA.append(z9 ? 1 : 0);
                                yfx.i(yfxVar, sbA.toString(), null, 6);
                                return Unit.a;
                            }
                        };
                        bVarI.r(function2);
                        obj = function2;
                    }
                    function1 = (Function1) obj;
                    i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS = bVarI.S();
                    boolean z25 = z9;
                    aVar2 = d.a.b;
                    str8 = str4;
                    d dVarC = androidx.compose.ui.c.c(bVarI, aVar2);
                    yka.k.getClass();
                    aVar3 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar3);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, i78VarA, yka.a.f);
                    hlh0.a(bVarI, ne00VarS, yka.a.e);
                    c1350a = yka.a.g;
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    hlh0.a(bVarI, dVarC, yka.a.d);
                    if (z8) {
                        bVarI.N(-2032061457);
                        z14 = false;
                        w8t.a(h.g(j.g(aVar2, 1.0f), fw20.a(R.dimen._10sdp, bVarI), fw20.a(R.dimen.lobby_v2_header_vertical_padding, bVarI)), function1, bVarI, 0);
                    } else {
                        z14 = false;
                        bVarI.N(-2036144622);
                    }
                    bVarI.X(z14);
                    hxsVar = h0sVarA.d().a;
                    if (hxsVar instanceof hxs.b) {
                        bVarI.N(-2031411232);
                        if (!z8 && Intrinsics.g(str7, "recommended_games")) {
                            bVarI.N(-2031485725);
                            bVarI.N(-2031449952);
                            z22 = 0;
                            bVarI.X(false);
                            bVarI.N(627224548);
                            a(0, bVarI);
                            bVarI.X(false);
                            bVarI.X(false);
                        } else if (!z8 && Intrinsics.g(str7, "recently_played")) {
                            bVarI.N(-2030730720);
                            bVarI.N(-2030692064);
                            z22 = 0;
                            bVarI.X(false);
                            bVarI.N(627248996);
                            a(0, bVarI);
                            bVarI.X(false);
                            bVarI.X(false);
                        } else if (z8 || !Intrinsics.g(str7, "trending_for_players_like_you")) {
                            if (!z8 && lobbyV2ViewModel.d0.containsKey(Integer.valueOf(i))) {
                                bVarI.N(-2029195941);
                                h0s h0sVar3 = (h0s) lobbyV2ViewModel.f0.get(Integer.valueOf(i));
                                if (h0sVar3 == null) {
                                    bVarI.N(-2029121728);
                                    z21 = false;
                                    bVarI.X(false);
                                    unit4 = null;
                                } else {
                                    bVarI.N(-2029121727);
                                    int i24 = i17 << 15;
                                    int i25 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i24 & 458752) | (i24 & 3670016);
                                    int i26 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar3, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i25 | (i26 & 29360128) | (i26 & 234881024));
                                    Unit unit5 = Unit.a;
                                    z21 = false;
                                    bVarI.X(false);
                                    unit4 = Unit.a;
                                }
                                if (unit4 == null) {
                                    bVarI.N(627299652);
                                    a(z21 ? 1 : 0, bVarI);
                                    bVarI.X(z21);
                                } else {
                                    bVarI.N(627278727);
                                    bVarI.X(z21);
                                }
                                bVarI.X(z21);
                                r9 = z21;
                            } else if (Intrinsics.g(str7, "game_providers")) {
                                bVarI.N(-2028413749);
                                h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                if (h0sVar2 == null) {
                                    bVarI.N(-2028345302);
                                    r8 = 0;
                                    bVarI.X(false);
                                    unit3 = null;
                                } else {
                                    z20 = false;
                                    bVarI.N(-2028345301);
                                    if (h0sVar2.c() == 0) {
                                        bVarI.N(-698186048);
                                        s5t.d(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-698081268);
                                        int i27 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i27 & 29360128) | (i27 & 234881024));
                                        z20 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit6 = Unit.a;
                                    bVarI.X(z20);
                                    unit3 = Unit.a;
                                    r8 = z20;
                                }
                                if (unit3 == null) {
                                    bVarI.N(627332324);
                                    a(r8, bVarI);
                                    bVarI.X(r8);
                                } else {
                                    bVarI.N(627303959);
                                    bVarI.X(r8);
                                }
                                bVarI.X(r8);
                                r9 = r8;
                            } else if (i != 888999888 || (str7 != null && str7.equals("my_favourites"))) {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i28 = i17 << 15;
                                        int i29 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i28 & 458752) | (i28 & 3670016);
                                        int i30 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i29 | (i30 & 29360128) | (i30 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit7 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            } else {
                                bVarI.N(-2026412141);
                                h0s h0sVar4 = (h0s) linkedHashMap.get(Integer.valueOf(i));
                                if (h0sVar4 == null) {
                                    bVarI.N(-2026343694);
                                    z19 = false;
                                    bVarI.X(false);
                                    str9 = str8;
                                    unit2 = null;
                                } else {
                                    boolean z26 = false;
                                    bVarI.N(-2026343693);
                                    if (h0sVar4.c() == 0) {
                                        bVarI.N(242359544);
                                        s5t.d(0, bVarI);
                                        bVarI.X(false);
                                        str9 = str8;
                                    } else {
                                        bVarI.N(242463084);
                                        int i31 = i17 << 15;
                                        int i32 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i31 & 458752) | (i31 & 3670016);
                                        int i33 = i13 << 12;
                                        str9 = str8;
                                        b(lobbyV2ViewModel, h0sVar4, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str9, bVarI, i32 | (i33 & 29360128) | (i33 & 234881024));
                                        z26 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit8 = Unit.a;
                                    bVarI.X(z26);
                                    unit2 = Unit.a;
                                    z19 = z26;
                                }
                                if (unit2 == null) {
                                    bVarI.N(627395652);
                                    a(z19 ? 1 : 0, bVarI);
                                    bVarI.X(z19);
                                } else {
                                    bVarI.N(627368527);
                                    bVarI.X(z19);
                                }
                                bVarI.X(z19);
                                str8 = str9;
                                z22 = z19;
                            }
                            z22 = r9;
                        } else {
                            bVarI.N(-2029971809);
                            bVarI.N(-2029932192);
                            z22 = 0;
                            bVarI.X(false);
                            bVarI.N(627273508);
                            a(0, bVarI);
                            bVarI.X(false);
                            bVarI.X(false);
                        }
                        bVarI.X(z22);
                    } else {
                        if (hxsVar instanceof hxs.a) {
                            bVarI.N(-2025470609);
                            if (h0sVarA.c() > 0) {
                                dVarE = j.g(aVar2, 1.0f);
                            } else {
                                dVarE = j.e(aVar2, 1.0f);
                            }
                            zA = bVarI.A(h0sVarA);
                            Object objY2 = bVarI.y();
                            if (!zA || objY2 == c0042a) {
                                r7 = 0;
                                j4t j4tVar = new j4t(h0sVarA, false ? 1 : 0);
                                bVarI.r(j4tVar);
                                obj2 = j4tVar;
                            } else {
                                r7 = 0;
                                obj2 = objY2;
                            }
                            s5t.a(r7, bVarI, dVarE, (Function0) obj2);
                            bVarI.X(r7);
                        } else {
                            if (hxsVar instanceof hxs.c) {
                                throw igf0.a(bVarI, 627206955, false);
                            }
                            bVarI.N(-2024946926);
                            if (i == 888999888) {
                                lobbyV2ViewModel.c0 = h0sVarA;
                            } else {
                                if (str7 != null) {
                                    z16 = true;
                                    if (str7.equals("my_favourites")) {
                                        lobbyV2ViewModel.c0 = h0sVarA;
                                    }
                                } else {
                                    z16 = true;
                                }
                                if (str7 == null && str7.equals("game_providers") == z16) {
                                    linkedHashMap2.put(Integer.valueOf(i), h0sVarA);
                                } else {
                                    linkedHashMap.put(Integer.valueOf(i), h0sVarA);
                                }
                            }
                            if (h0sVarA.c() == 0) {
                                bVarI.N(-2024224750);
                                if (i == 888999888) {
                                    bVarI.N(-2024148955);
                                    z15 = false;
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    z15 = false;
                                    bVarI.N(-2024066743);
                                    s5t.d(0, bVarI);
                                    bVarI.X(false);
                                }
                                bVarI.X(z15);
                                str4 = str8;
                            } else {
                                bVarI.N(-2023955608);
                                int i34 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168);
                                int i35 = i17 << 15;
                                int i36 = i34 | (i35 & 458752) | (i35 & 3670016);
                                int i37 = i13 << 12;
                                str4 = str8;
                                b(lobbyV2ViewModel, h0sVarA, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str4, bVarI, i36 | (i37 & 29360128) | (i37 & 234881024));
                                z15 = false;
                                bVarI.X(false);
                            }
                            bVarI.X(z15);
                        }
                        bVarI.X(true);
                        str5 = str7;
                        z7 = z8;
                        z6 = z25;
                    }
                    str4 = str8;
                    bVarI.X(true);
                    str5 = str7;
                    z7 = z8;
                    z6 = z25;
                } else {
                    bVarI.G();
                    str5 = str;
                    z6 = z3;
                    z7 = z4;
                }
                str6 = str4;
                eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: k4t
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            int iA = qj40.a(i2 | 1);
                            int iA2 = qj40.a(i3);
                            q4t.c(yfxVar, lobbyV2ViewModel, i, str5, str6, z7, z2, fbhVar, z6, gajVar, gnjVar, str3, lyhVar, (a) obj3, iA, iA2, i4);
                            return Unit.a;
                        }
                    };
                }
            }
            i5 |= 24576;
            str4 = str2;
            i8 = i4 & 32;
            if (i8 != 0) {
                i5 |= 196608;
                z4 = z;
            } else {
                z4 = z;
                if ((i2 & 196608) == 0) {
                    if (bVarI.b(z4)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i5 |= i9;
                }
            }
            if ((i2 & 1572864) == 0) {
                if (bVarI.b(z2)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i5 |= i22;
            }
            if ((i2 & 12582912) == 0) {
                if (bVarI.M(fbhVar)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i5 |= i21;
            }
            i10 = i5;
            i11 = i4 & 256;
            if (i11 != 0) {
                i10 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (bVarI.b(z3)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i10 |= i12;
            }
            if ((i2 & 805306368) == 0) {
                if (bVarI.A(gajVar)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i10 |= i20;
            }
            i13 = i10;
            if ((i3 & 6) == 0) {
                if (bVarI.d(gnjVar.ordinal())) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i14 = i3 | i19;
            } else {
                i14 = i3;
            }
            i15 = i14;
            if ((i3 & 48) == 0) {
                if (bVarI.M(str3)) {
                    i18 = 32;
                } else {
                    i18 = 16;
                }
                i16 = i15 | i18;
            } else {
                i16 = i15;
            }
            i17 = i16 | (bVarI.A(lyhVar) ? 256 : 128);
            if ((i13 & 306783379) == 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (bVarI.q(i13 & 1, z5)) {
                if (i23 != 0) {
                    str7 = null;
                } else {
                    str7 = str;
                }
                if (i6 != 0) {
                    str4 = null;
                }
                if (i8 != 0) {
                    z8 = false;
                } else {
                    z8 = z4;
                }
                if (i11 != 0) {
                    z9 = false;
                } else {
                    z9 = z3;
                }
                h0sVarA = k0s.a(lyhVar, bVarI);
                zvrVarA = dwr.a(0, 3, bVarI);
                boolean zA3 = bVarI.A(yfxVar);
                if ((i13 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z27 = zA3 | z10;
                if ((i13 & 3670016) == 1048576) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z28 = z27 | z11;
                if ((i13 & 234881024) == 67108864) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z28 | z12;
                Object objY3 = bVarI.y();
                a.C0041a.C0042a c0042a2 = a.C0041a.a;
                obj = objY3;
                if (z13) {
                    Function1 function3 = new Function1() { // from class: i4t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            StringBuilder sbA = dy5.a("search?id=", i, z2 ? 1 : 0, "&section=1&favourite=", "&provider=");
                            sbA.append(z9 ? 1 : 0);
                            yfx.i(yfxVar, sbA.toString(), null, 6);
                            return Unit.a;
                        }
                    };
                    bVarI.r(function3);
                    obj = function3;
                } else {
                    Function1 function4 = new Function1() { // from class: i4t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            StringBuilder sbA = dy5.a("search?id=", i, z2 ? 1 : 0, "&section=1&favourite=", "&provider=");
                            sbA.append(z9 ? 1 : 0);
                            yfx.i(yfxVar, sbA.toString(), null, 6);
                            return Unit.a;
                        }
                    };
                    bVarI.r(function4);
                    obj = function4;
                }
                function1 = (Function1) obj;
                i78 i78VarA2 = g78.a(kw0.c, ht.a.m, bVarI, 0);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                boolean z29 = z9;
                aVar2 = d.a.b;
                str8 = str4;
                d dVarC2 = androidx.compose.ui.c.c(bVarI, aVar2);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA2, yka.a.f);
                hlh0.a(bVarI, ne00VarS2, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, yka.a.d);
                if (z8) {
                    bVarI.N(-2032061457);
                    z14 = false;
                    w8t.a(h.g(j.g(aVar2, 1.0f), fw20.a(R.dimen._10sdp, bVarI), fw20.a(R.dimen.lobby_v2_header_vertical_padding, bVarI)), function1, bVarI, 0);
                } else {
                    z14 = false;
                    bVarI.N(-2036144622);
                }
                bVarI.X(z14);
                hxsVar = h0sVarA.d().a;
                if (hxsVar instanceof hxs.b) {
                    bVarI.N(-2031411232);
                    if (!z8) {
                        if (!z8) {
                            if (z8) {
                                if (!z8) {
                                    if (Intrinsics.g(str7, "game_providers")) {
                                        bVarI.N(-2028413749);
                                        h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                        if (h0sVar2 == null) {
                                            bVarI.N(-2028345302);
                                            r8 = 0;
                                            bVarI.X(false);
                                            unit3 = null;
                                        } else {
                                            z20 = false;
                                            bVarI.N(-2028345301);
                                            if (h0sVar2.c() == 0) {
                                                bVarI.N(-698186048);
                                                s5t.d(0, bVarI);
                                                bVarI.X(false);
                                            } else {
                                                bVarI.N(-698081268);
                                                int i210 = i13 << 12;
                                                b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i210 & 29360128) | (i210 & 234881024));
                                                z20 = false;
                                                bVarI.X(false);
                                            }
                                            Unit unit9 = Unit.a;
                                            bVarI.X(z20);
                                            unit3 = Unit.a;
                                            r8 = z20;
                                        }
                                        if (unit3 == null) {
                                            bVarI.N(627332324);
                                            a(r8, bVarI);
                                            bVarI.X(r8);
                                        } else {
                                            bVarI.N(627303959);
                                            bVarI.X(r8);
                                        }
                                        bVarI.X(r8);
                                        r9 = r8;
                                        z22 = r9;
                                    } else if (i != 888999888) {
                                        str8 = str8;
                                        z17 = false;
                                        z18 = false;
                                        bVarI.N(-2027315822);
                                        h0sVar = lobbyV2ViewModel.c0;
                                        if (h0sVar == null) {
                                            bVarI.N(-2027281010);
                                            bVarI.X(false);
                                            str8 = str8;
                                            unit = null;
                                        } else {
                                            bVarI.N(-2027281009);
                                            if (h0sVar.c() == 0) {
                                                bVarI.N(-439565701);
                                                s5t.c(0, bVarI);
                                                bVarI.X(false);
                                            } else {
                                                bVarI.N(-439458317);
                                                int i211 = i17 << 15;
                                                int i212 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211 & 458752) | (i211 & 3670016);
                                                int i38 = i13 << 12;
                                                b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i212 | (i38 & 29360128) | (i38 & 234881024));
                                                z17 = false;
                                                bVarI.X(false);
                                            }
                                            Unit unit10 = Unit.a;
                                            bVarI.X(z17);
                                            unit = Unit.a;
                                            z18 = z17;
                                        }
                                        if (unit == null) {
                                            bVarI.N(627365540);
                                            a(z18 ? 1 : 0, bVarI);
                                            bVarI.X(z18);
                                        } else {
                                            bVarI.N(627339376);
                                            bVarI.X(z18);
                                        }
                                        bVarI.X(z18);
                                        z22 = z18;
                                    } else {
                                        str8 = str8;
                                        z17 = false;
                                        z18 = false;
                                        bVarI.N(-2027315822);
                                        h0sVar = lobbyV2ViewModel.c0;
                                        if (h0sVar == null) {
                                            bVarI.N(-2027281010);
                                            bVarI.X(false);
                                            str8 = str8;
                                            unit = null;
                                        } else {
                                            bVarI.N(-2027281009);
                                            if (h0sVar.c() == 0) {
                                                bVarI.N(-439565701);
                                                s5t.c(0, bVarI);
                                                bVarI.X(false);
                                            } else {
                                                bVarI.N(-439458317);
                                                int i213 = i17 << 15;
                                                int i214 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i213 & 458752) | (i213 & 3670016);
                                                int i39 = i13 << 12;
                                                b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i214 | (i39 & 29360128) | (i39 & 234881024));
                                                z17 = false;
                                                bVarI.X(false);
                                            }
                                            Unit unit11 = Unit.a;
                                            bVarI.X(z17);
                                            unit = Unit.a;
                                            z18 = z17;
                                        }
                                        if (unit == null) {
                                            bVarI.N(627365540);
                                            a(z18 ? 1 : 0, bVarI);
                                            bVarI.X(z18);
                                        } else {
                                            bVarI.N(627339376);
                                            bVarI.X(z18);
                                        }
                                        bVarI.X(z18);
                                        z22 = z18;
                                    }
                                } else if (Intrinsics.g(str7, "game_providers")) {
                                    bVarI.N(-2028413749);
                                    h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                    if (h0sVar2 == null) {
                                        bVarI.N(-2028345302);
                                        r8 = 0;
                                        bVarI.X(false);
                                        unit3 = null;
                                    } else {
                                        z20 = false;
                                        bVarI.N(-2028345301);
                                        if (h0sVar2.c() == 0) {
                                            bVarI.N(-698186048);
                                            s5t.d(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-698081268);
                                            int i215 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i215 & 29360128) | (i215 & 234881024));
                                            z20 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit12 = Unit.a;
                                        bVarI.X(z20);
                                        unit3 = Unit.a;
                                        r8 = z20;
                                    }
                                    if (unit3 == null) {
                                        bVarI.N(627332324);
                                        a(r8, bVarI);
                                        bVarI.X(r8);
                                    } else {
                                        bVarI.N(627303959);
                                        bVarI.X(r8);
                                    }
                                    bVarI.X(r8);
                                    r9 = r8;
                                    z22 = r9;
                                } else if (i != 888999888) {
                                    str8 = str8;
                                    z17 = false;
                                    z18 = false;
                                    bVarI.N(-2027315822);
                                    h0sVar = lobbyV2ViewModel.c0;
                                    if (h0sVar == null) {
                                        bVarI.N(-2027281010);
                                        bVarI.X(false);
                                        str8 = str8;
                                        unit = null;
                                    } else {
                                        bVarI.N(-2027281009);
                                        if (h0sVar.c() == 0) {
                                            bVarI.N(-439565701);
                                            s5t.c(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-439458317);
                                            int i216 = i17 << 15;
                                            int i217 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i216 & 458752) | (i216 & 3670016);
                                            int i310 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i217 | (i310 & 29360128) | (i310 & 234881024));
                                            z17 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit13 = Unit.a;
                                        bVarI.X(z17);
                                        unit = Unit.a;
                                        z18 = z17;
                                    }
                                    if (unit == null) {
                                        bVarI.N(627365540);
                                        a(z18 ? 1 : 0, bVarI);
                                        bVarI.X(z18);
                                    } else {
                                        bVarI.N(627339376);
                                        bVarI.X(z18);
                                    }
                                    bVarI.X(z18);
                                    z22 = z18;
                                } else {
                                    str8 = str8;
                                    z17 = false;
                                    z18 = false;
                                    bVarI.N(-2027315822);
                                    h0sVar = lobbyV2ViewModel.c0;
                                    if (h0sVar == null) {
                                        bVarI.N(-2027281010);
                                        bVarI.X(false);
                                        str8 = str8;
                                        unit = null;
                                    } else {
                                        bVarI.N(-2027281009);
                                        if (h0sVar.c() == 0) {
                                            bVarI.N(-439565701);
                                            s5t.c(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-439458317);
                                            int i218 = i17 << 15;
                                            int i219 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i218 & 458752) | (i218 & 3670016);
                                            int i311 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i219 | (i311 & 29360128) | (i311 & 234881024));
                                            z17 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit14 = Unit.a;
                                        bVarI.X(z17);
                                        unit = Unit.a;
                                        z18 = z17;
                                    }
                                    if (unit == null) {
                                        bVarI.N(627365540);
                                        a(z18 ? 1 : 0, bVarI);
                                        bVarI.X(z18);
                                    } else {
                                        bVarI.N(627339376);
                                        bVarI.X(z18);
                                    }
                                    bVarI.X(z18);
                                    z22 = z18;
                                }
                            } else if (!z8) {
                                if (Intrinsics.g(str7, "game_providers")) {
                                    bVarI.N(-2028413749);
                                    h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                    if (h0sVar2 == null) {
                                        bVarI.N(-2028345302);
                                        r8 = 0;
                                        bVarI.X(false);
                                        unit3 = null;
                                    } else {
                                        z20 = false;
                                        bVarI.N(-2028345301);
                                        if (h0sVar2.c() == 0) {
                                            bVarI.N(-698186048);
                                            s5t.d(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-698081268);
                                            int i2110 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i2110 & 29360128) | (i2110 & 234881024));
                                            z20 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit15 = Unit.a;
                                        bVarI.X(z20);
                                        unit3 = Unit.a;
                                        r8 = z20;
                                    }
                                    if (unit3 == null) {
                                        bVarI.N(627332324);
                                        a(r8, bVarI);
                                        bVarI.X(r8);
                                    } else {
                                        bVarI.N(627303959);
                                        bVarI.X(r8);
                                    }
                                    bVarI.X(r8);
                                    r9 = r8;
                                    z22 = r9;
                                } else if (i != 888999888) {
                                    str8 = str8;
                                    z17 = false;
                                    z18 = false;
                                    bVarI.N(-2027315822);
                                    h0sVar = lobbyV2ViewModel.c0;
                                    if (h0sVar == null) {
                                        bVarI.N(-2027281010);
                                        bVarI.X(false);
                                        str8 = str8;
                                        unit = null;
                                    } else {
                                        bVarI.N(-2027281009);
                                        if (h0sVar.c() == 0) {
                                            bVarI.N(-439565701);
                                            s5t.c(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-439458317);
                                            int i2111 = i17 << 15;
                                            int i2112 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111 & 458752) | (i2111 & 3670016);
                                            int i312 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2112 | (i312 & 29360128) | (i312 & 234881024));
                                            z17 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit16 = Unit.a;
                                        bVarI.X(z17);
                                        unit = Unit.a;
                                        z18 = z17;
                                    }
                                    if (unit == null) {
                                        bVarI.N(627365540);
                                        a(z18 ? 1 : 0, bVarI);
                                        bVarI.X(z18);
                                    } else {
                                        bVarI.N(627339376);
                                        bVarI.X(z18);
                                    }
                                    bVarI.X(z18);
                                    z22 = z18;
                                } else {
                                    str8 = str8;
                                    z17 = false;
                                    z18 = false;
                                    bVarI.N(-2027315822);
                                    h0sVar = lobbyV2ViewModel.c0;
                                    if (h0sVar == null) {
                                        bVarI.N(-2027281010);
                                        bVarI.X(false);
                                        str8 = str8;
                                        unit = null;
                                    } else {
                                        bVarI.N(-2027281009);
                                        if (h0sVar.c() == 0) {
                                            bVarI.N(-439565701);
                                            s5t.c(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-439458317);
                                            int i2113 = i17 << 15;
                                            int i2114 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2113 & 458752) | (i2113 & 3670016);
                                            int i313 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2114 | (i313 & 29360128) | (i313 & 234881024));
                                            z17 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit17 = Unit.a;
                                        bVarI.X(z17);
                                        unit = Unit.a;
                                        z18 = z17;
                                    }
                                    if (unit == null) {
                                        bVarI.N(627365540);
                                        a(z18 ? 1 : 0, bVarI);
                                        bVarI.X(z18);
                                    } else {
                                        bVarI.N(627339376);
                                        bVarI.X(z18);
                                    }
                                    bVarI.X(z18);
                                    z22 = z18;
                                }
                            } else if (Intrinsics.g(str7, "game_providers")) {
                                bVarI.N(-2028413749);
                                h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                if (h0sVar2 == null) {
                                    bVarI.N(-2028345302);
                                    r8 = 0;
                                    bVarI.X(false);
                                    unit3 = null;
                                } else {
                                    z20 = false;
                                    bVarI.N(-2028345301);
                                    if (h0sVar2.c() == 0) {
                                        bVarI.N(-698186048);
                                        s5t.d(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-698081268);
                                        int i2115 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i2115 & 29360128) | (i2115 & 234881024));
                                        z20 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit18 = Unit.a;
                                    bVarI.X(z20);
                                    unit3 = Unit.a;
                                    r8 = z20;
                                }
                                if (unit3 == null) {
                                    bVarI.N(627332324);
                                    a(r8, bVarI);
                                    bVarI.X(r8);
                                } else {
                                    bVarI.N(627303959);
                                    bVarI.X(r8);
                                }
                                bVarI.X(r8);
                                r9 = r8;
                                z22 = r9;
                            } else if (i != 888999888) {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i2116 = i17 << 15;
                                        int i2117 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2116 & 458752) | (i2116 & 3670016);
                                        int i314 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2117 | (i314 & 29360128) | (i314 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit19 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            } else {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i2118 = i17 << 15;
                                        int i2119 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2118 & 458752) | (i2118 & 3670016);
                                        int i315 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2119 | (i315 & 29360128) | (i315 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit110 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            }
                        } else if (z8) {
                            if (!z8) {
                                if (Intrinsics.g(str7, "game_providers")) {
                                    bVarI.N(-2028413749);
                                    h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                    if (h0sVar2 == null) {
                                        bVarI.N(-2028345302);
                                        r8 = 0;
                                        bVarI.X(false);
                                        unit3 = null;
                                    } else {
                                        z20 = false;
                                        bVarI.N(-2028345301);
                                        if (h0sVar2.c() == 0) {
                                            bVarI.N(-698186048);
                                            s5t.d(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-698081268);
                                            int i21110 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i21110 & 29360128) | (i21110 & 234881024));
                                            z20 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit111 = Unit.a;
                                        bVarI.X(z20);
                                        unit3 = Unit.a;
                                        r8 = z20;
                                    }
                                    if (unit3 == null) {
                                        bVarI.N(627332324);
                                        a(r8, bVarI);
                                        bVarI.X(r8);
                                    } else {
                                        bVarI.N(627303959);
                                        bVarI.X(r8);
                                    }
                                    bVarI.X(r8);
                                    r9 = r8;
                                    z22 = r9;
                                } else if (i != 888999888) {
                                    str8 = str8;
                                    z17 = false;
                                    z18 = false;
                                    bVarI.N(-2027315822);
                                    h0sVar = lobbyV2ViewModel.c0;
                                    if (h0sVar == null) {
                                        bVarI.N(-2027281010);
                                        bVarI.X(false);
                                        str8 = str8;
                                        unit = null;
                                    } else {
                                        bVarI.N(-2027281009);
                                        if (h0sVar.c() == 0) {
                                            bVarI.N(-439565701);
                                            s5t.c(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-439458317);
                                            int i21111 = i17 << 15;
                                            int i21112 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111 & 458752) | (i21111 & 3670016);
                                            int i316 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21112 | (i316 & 29360128) | (i316 & 234881024));
                                            z17 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit112 = Unit.a;
                                        bVarI.X(z17);
                                        unit = Unit.a;
                                        z18 = z17;
                                    }
                                    if (unit == null) {
                                        bVarI.N(627365540);
                                        a(z18 ? 1 : 0, bVarI);
                                        bVarI.X(z18);
                                    } else {
                                        bVarI.N(627339376);
                                        bVarI.X(z18);
                                    }
                                    bVarI.X(z18);
                                    z22 = z18;
                                } else {
                                    str8 = str8;
                                    z17 = false;
                                    z18 = false;
                                    bVarI.N(-2027315822);
                                    h0sVar = lobbyV2ViewModel.c0;
                                    if (h0sVar == null) {
                                        bVarI.N(-2027281010);
                                        bVarI.X(false);
                                        str8 = str8;
                                        unit = null;
                                    } else {
                                        bVarI.N(-2027281009);
                                        if (h0sVar.c() == 0) {
                                            bVarI.N(-439565701);
                                            s5t.c(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-439458317);
                                            int i21113 = i17 << 15;
                                            int i21114 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21113 & 458752) | (i21113 & 3670016);
                                            int i317 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21114 | (i317 & 29360128) | (i317 & 234881024));
                                            z17 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit113 = Unit.a;
                                        bVarI.X(z17);
                                        unit = Unit.a;
                                        z18 = z17;
                                    }
                                    if (unit == null) {
                                        bVarI.N(627365540);
                                        a(z18 ? 1 : 0, bVarI);
                                        bVarI.X(z18);
                                    } else {
                                        bVarI.N(627339376);
                                        bVarI.X(z18);
                                    }
                                    bVarI.X(z18);
                                    z22 = z18;
                                }
                            } else if (Intrinsics.g(str7, "game_providers")) {
                                bVarI.N(-2028413749);
                                h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                if (h0sVar2 == null) {
                                    bVarI.N(-2028345302);
                                    r8 = 0;
                                    bVarI.X(false);
                                    unit3 = null;
                                } else {
                                    z20 = false;
                                    bVarI.N(-2028345301);
                                    if (h0sVar2.c() == 0) {
                                        bVarI.N(-698186048);
                                        s5t.d(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-698081268);
                                        int i21115 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i21115 & 29360128) | (i21115 & 234881024));
                                        z20 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit114 = Unit.a;
                                    bVarI.X(z20);
                                    unit3 = Unit.a;
                                    r8 = z20;
                                }
                                if (unit3 == null) {
                                    bVarI.N(627332324);
                                    a(r8, bVarI);
                                    bVarI.X(r8);
                                } else {
                                    bVarI.N(627303959);
                                    bVarI.X(r8);
                                }
                                bVarI.X(r8);
                                r9 = r8;
                                z22 = r9;
                            } else if (i != 888999888) {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i21116 = i17 << 15;
                                        int i21117 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21116 & 458752) | (i21116 & 3670016);
                                        int i318 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21117 | (i318 & 29360128) | (i318 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit115 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            } else {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i21118 = i17 << 15;
                                        int i21119 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21118 & 458752) | (i21118 & 3670016);
                                        int i319 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21119 | (i319 & 29360128) | (i319 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit116 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            }
                        } else if (!z8) {
                            if (Intrinsics.g(str7, "game_providers")) {
                                bVarI.N(-2028413749);
                                h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                if (h0sVar2 == null) {
                                    bVarI.N(-2028345302);
                                    r8 = 0;
                                    bVarI.X(false);
                                    unit3 = null;
                                } else {
                                    z20 = false;
                                    bVarI.N(-2028345301);
                                    if (h0sVar2.c() == 0) {
                                        bVarI.N(-698186048);
                                        s5t.d(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-698081268);
                                        int i211110 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i211110 & 29360128) | (i211110 & 234881024));
                                        z20 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit117 = Unit.a;
                                    bVarI.X(z20);
                                    unit3 = Unit.a;
                                    r8 = z20;
                                }
                                if (unit3 == null) {
                                    bVarI.N(627332324);
                                    a(r8, bVarI);
                                    bVarI.X(r8);
                                } else {
                                    bVarI.N(627303959);
                                    bVarI.X(r8);
                                }
                                bVarI.X(r8);
                                r9 = r8;
                                z22 = r9;
                            } else if (i != 888999888) {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i211111 = i17 << 15;
                                        int i211112 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211111 & 458752) | (i211111 & 3670016);
                                        int i3110 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211112 | (i3110 & 29360128) | (i3110 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit118 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            } else {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i211113 = i17 << 15;
                                        int i211114 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211113 & 458752) | (i211113 & 3670016);
                                        int i3111 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211114 | (i3111 & 29360128) | (i3111 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit119 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            }
                        } else if (Intrinsics.g(str7, "game_providers")) {
                            bVarI.N(-2028413749);
                            h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                            if (h0sVar2 == null) {
                                bVarI.N(-2028345302);
                                r8 = 0;
                                bVarI.X(false);
                                unit3 = null;
                            } else {
                                z20 = false;
                                bVarI.N(-2028345301);
                                if (h0sVar2.c() == 0) {
                                    bVarI.N(-698186048);
                                    s5t.d(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-698081268);
                                    int i211115 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i211115 & 29360128) | (i211115 & 234881024));
                                    z20 = false;
                                    bVarI.X(false);
                                }
                                Unit unit1110 = Unit.a;
                                bVarI.X(z20);
                                unit3 = Unit.a;
                                r8 = z20;
                            }
                            if (unit3 == null) {
                                bVarI.N(627332324);
                                a(r8, bVarI);
                                bVarI.X(r8);
                            } else {
                                bVarI.N(627303959);
                                bVarI.X(r8);
                            }
                            bVarI.X(r8);
                            r9 = r8;
                            z22 = r9;
                        } else if (i != 888999888) {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i211116 = i17 << 15;
                                    int i211117 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211116 & 458752) | (i211116 & 3670016);
                                    int i3112 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211117 | (i3112 & 29360128) | (i3112 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit1111 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        } else {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i211118 = i17 << 15;
                                    int i211119 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211118 & 458752) | (i211118 & 3670016);
                                    int i3113 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211119 | (i3113 & 29360128) | (i3113 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit1112 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        }
                    } else if (!z8) {
                        if (z8) {
                            if (!z8) {
                                if (Intrinsics.g(str7, "game_providers")) {
                                    bVarI.N(-2028413749);
                                    h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                    if (h0sVar2 == null) {
                                        bVarI.N(-2028345302);
                                        r8 = 0;
                                        bVarI.X(false);
                                        unit3 = null;
                                    } else {
                                        z20 = false;
                                        bVarI.N(-2028345301);
                                        if (h0sVar2.c() == 0) {
                                            bVarI.N(-698186048);
                                            s5t.d(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-698081268);
                                            int i2111110 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i2111110 & 29360128) | (i2111110 & 234881024));
                                            z20 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit1113 = Unit.a;
                                        bVarI.X(z20);
                                        unit3 = Unit.a;
                                        r8 = z20;
                                    }
                                    if (unit3 == null) {
                                        bVarI.N(627332324);
                                        a(r8, bVarI);
                                        bVarI.X(r8);
                                    } else {
                                        bVarI.N(627303959);
                                        bVarI.X(r8);
                                    }
                                    bVarI.X(r8);
                                    r9 = r8;
                                    z22 = r9;
                                } else if (i != 888999888) {
                                    str8 = str8;
                                    z17 = false;
                                    z18 = false;
                                    bVarI.N(-2027315822);
                                    h0sVar = lobbyV2ViewModel.c0;
                                    if (h0sVar == null) {
                                        bVarI.N(-2027281010);
                                        bVarI.X(false);
                                        str8 = str8;
                                        unit = null;
                                    } else {
                                        bVarI.N(-2027281009);
                                        if (h0sVar.c() == 0) {
                                            bVarI.N(-439565701);
                                            s5t.c(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-439458317);
                                            int i2111111 = i17 << 15;
                                            int i2111112 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111111 & 458752) | (i2111111 & 3670016);
                                            int i3114 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111112 | (i3114 & 29360128) | (i3114 & 234881024));
                                            z17 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit1114 = Unit.a;
                                        bVarI.X(z17);
                                        unit = Unit.a;
                                        z18 = z17;
                                    }
                                    if (unit == null) {
                                        bVarI.N(627365540);
                                        a(z18 ? 1 : 0, bVarI);
                                        bVarI.X(z18);
                                    } else {
                                        bVarI.N(627339376);
                                        bVarI.X(z18);
                                    }
                                    bVarI.X(z18);
                                    z22 = z18;
                                } else {
                                    str8 = str8;
                                    z17 = false;
                                    z18 = false;
                                    bVarI.N(-2027315822);
                                    h0sVar = lobbyV2ViewModel.c0;
                                    if (h0sVar == null) {
                                        bVarI.N(-2027281010);
                                        bVarI.X(false);
                                        str8 = str8;
                                        unit = null;
                                    } else {
                                        bVarI.N(-2027281009);
                                        if (h0sVar.c() == 0) {
                                            bVarI.N(-439565701);
                                            s5t.c(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-439458317);
                                            int i2111113 = i17 << 15;
                                            int i2111114 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111113 & 458752) | (i2111113 & 3670016);
                                            int i3115 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111114 | (i3115 & 29360128) | (i3115 & 234881024));
                                            z17 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit1115 = Unit.a;
                                        bVarI.X(z17);
                                        unit = Unit.a;
                                        z18 = z17;
                                    }
                                    if (unit == null) {
                                        bVarI.N(627365540);
                                        a(z18 ? 1 : 0, bVarI);
                                        bVarI.X(z18);
                                    } else {
                                        bVarI.N(627339376);
                                        bVarI.X(z18);
                                    }
                                    bVarI.X(z18);
                                    z22 = z18;
                                }
                            } else if (Intrinsics.g(str7, "game_providers")) {
                                bVarI.N(-2028413749);
                                h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                if (h0sVar2 == null) {
                                    bVarI.N(-2028345302);
                                    r8 = 0;
                                    bVarI.X(false);
                                    unit3 = null;
                                } else {
                                    z20 = false;
                                    bVarI.N(-2028345301);
                                    if (h0sVar2.c() == 0) {
                                        bVarI.N(-698186048);
                                        s5t.d(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-698081268);
                                        int i2111115 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i2111115 & 29360128) | (i2111115 & 234881024));
                                        z20 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit1116 = Unit.a;
                                    bVarI.X(z20);
                                    unit3 = Unit.a;
                                    r8 = z20;
                                }
                                if (unit3 == null) {
                                    bVarI.N(627332324);
                                    a(r8, bVarI);
                                    bVarI.X(r8);
                                } else {
                                    bVarI.N(627303959);
                                    bVarI.X(r8);
                                }
                                bVarI.X(r8);
                                r9 = r8;
                                z22 = r9;
                            } else if (i != 888999888) {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i2111116 = i17 << 15;
                                        int i2111117 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111116 & 458752) | (i2111116 & 3670016);
                                        int i3116 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111117 | (i3116 & 29360128) | (i3116 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit1117 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            } else {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i2111118 = i17 << 15;
                                        int i2111119 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111118 & 458752) | (i2111118 & 3670016);
                                        int i3117 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111119 | (i3117 & 29360128) | (i3117 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit1118 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            }
                        } else if (!z8) {
                            if (Intrinsics.g(str7, "game_providers")) {
                                bVarI.N(-2028413749);
                                h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                if (h0sVar2 == null) {
                                    bVarI.N(-2028345302);
                                    r8 = 0;
                                    bVarI.X(false);
                                    unit3 = null;
                                } else {
                                    z20 = false;
                                    bVarI.N(-2028345301);
                                    if (h0sVar2.c() == 0) {
                                        bVarI.N(-698186048);
                                        s5t.d(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-698081268);
                                        int i21111110 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i21111110 & 29360128) | (i21111110 & 234881024));
                                        z20 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit1119 = Unit.a;
                                    bVarI.X(z20);
                                    unit3 = Unit.a;
                                    r8 = z20;
                                }
                                if (unit3 == null) {
                                    bVarI.N(627332324);
                                    a(r8, bVarI);
                                    bVarI.X(r8);
                                } else {
                                    bVarI.N(627303959);
                                    bVarI.X(r8);
                                }
                                bVarI.X(r8);
                                r9 = r8;
                                z22 = r9;
                            } else if (i != 888999888) {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i21111111 = i17 << 15;
                                        int i21111112 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111111 & 458752) | (i21111111 & 3670016);
                                        int i3118 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111112 | (i3118 & 29360128) | (i3118 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit11110 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            } else {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i21111113 = i17 << 15;
                                        int i21111114 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111113 & 458752) | (i21111113 & 3670016);
                                        int i3119 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111114 | (i3119 & 29360128) | (i3119 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit11111 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            }
                        } else if (Intrinsics.g(str7, "game_providers")) {
                            bVarI.N(-2028413749);
                            h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                            if (h0sVar2 == null) {
                                bVarI.N(-2028345302);
                                r8 = 0;
                                bVarI.X(false);
                                unit3 = null;
                            } else {
                                z20 = false;
                                bVarI.N(-2028345301);
                                if (h0sVar2.c() == 0) {
                                    bVarI.N(-698186048);
                                    s5t.d(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-698081268);
                                    int i21111115 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i21111115 & 29360128) | (i21111115 & 234881024));
                                    z20 = false;
                                    bVarI.X(false);
                                }
                                Unit unit11112 = Unit.a;
                                bVarI.X(z20);
                                unit3 = Unit.a;
                                r8 = z20;
                            }
                            if (unit3 == null) {
                                bVarI.N(627332324);
                                a(r8, bVarI);
                                bVarI.X(r8);
                            } else {
                                bVarI.N(627303959);
                                bVarI.X(r8);
                            }
                            bVarI.X(r8);
                            r9 = r8;
                            z22 = r9;
                        } else if (i != 888999888) {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i21111116 = i17 << 15;
                                    int i21111117 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111116 & 458752) | (i21111116 & 3670016);
                                    int i31110 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111117 | (i31110 & 29360128) | (i31110 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit11113 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        } else {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i21111118 = i17 << 15;
                                    int i21111119 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111118 & 458752) | (i21111118 & 3670016);
                                    int i31111 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111119 | (i31111 & 29360128) | (i31111 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit11114 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        }
                    } else if (z8) {
                        if (!z8) {
                            if (Intrinsics.g(str7, "game_providers")) {
                                bVarI.N(-2028413749);
                                h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                if (h0sVar2 == null) {
                                    bVarI.N(-2028345302);
                                    r8 = 0;
                                    bVarI.X(false);
                                    unit3 = null;
                                } else {
                                    z20 = false;
                                    bVarI.N(-2028345301);
                                    if (h0sVar2.c() == 0) {
                                        bVarI.N(-698186048);
                                        s5t.d(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-698081268);
                                        int i211111110 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i211111110 & 29360128) | (i211111110 & 234881024));
                                        z20 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit11115 = Unit.a;
                                    bVarI.X(z20);
                                    unit3 = Unit.a;
                                    r8 = z20;
                                }
                                if (unit3 == null) {
                                    bVarI.N(627332324);
                                    a(r8, bVarI);
                                    bVarI.X(r8);
                                } else {
                                    bVarI.N(627303959);
                                    bVarI.X(r8);
                                }
                                bVarI.X(r8);
                                r9 = r8;
                                z22 = r9;
                            } else if (i != 888999888) {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i211111111 = i17 << 15;
                                        int i211111112 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211111111 & 458752) | (i211111111 & 3670016);
                                        int i31112 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211111112 | (i31112 & 29360128) | (i31112 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit11116 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            } else {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i211111113 = i17 << 15;
                                        int i211111114 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211111113 & 458752) | (i211111113 & 3670016);
                                        int i31113 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211111114 | (i31113 & 29360128) | (i31113 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit11117 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            }
                        } else if (Intrinsics.g(str7, "game_providers")) {
                            bVarI.N(-2028413749);
                            h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                            if (h0sVar2 == null) {
                                bVarI.N(-2028345302);
                                r8 = 0;
                                bVarI.X(false);
                                unit3 = null;
                            } else {
                                z20 = false;
                                bVarI.N(-2028345301);
                                if (h0sVar2.c() == 0) {
                                    bVarI.N(-698186048);
                                    s5t.d(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-698081268);
                                    int i211111115 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i211111115 & 29360128) | (i211111115 & 234881024));
                                    z20 = false;
                                    bVarI.X(false);
                                }
                                Unit unit11118 = Unit.a;
                                bVarI.X(z20);
                                unit3 = Unit.a;
                                r8 = z20;
                            }
                            if (unit3 == null) {
                                bVarI.N(627332324);
                                a(r8, bVarI);
                                bVarI.X(r8);
                            } else {
                                bVarI.N(627303959);
                                bVarI.X(r8);
                            }
                            bVarI.X(r8);
                            r9 = r8;
                            z22 = r9;
                        } else if (i != 888999888) {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i211111116 = i17 << 15;
                                    int i211111117 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211111116 & 458752) | (i211111116 & 3670016);
                                    int i31114 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211111117 | (i31114 & 29360128) | (i31114 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit11119 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        } else {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i211111118 = i17 << 15;
                                    int i211111119 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211111118 & 458752) | (i211111118 & 3670016);
                                    int i31115 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211111119 | (i31115 & 29360128) | (i31115 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit111110 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        }
                    } else if (!z8) {
                        if (Intrinsics.g(str7, "game_providers")) {
                            bVarI.N(-2028413749);
                            h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                            if (h0sVar2 == null) {
                                bVarI.N(-2028345302);
                                r8 = 0;
                                bVarI.X(false);
                                unit3 = null;
                            } else {
                                z20 = false;
                                bVarI.N(-2028345301);
                                if (h0sVar2.c() == 0) {
                                    bVarI.N(-698186048);
                                    s5t.d(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-698081268);
                                    int i2111111110 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i2111111110 & 29360128) | (i2111111110 & 234881024));
                                    z20 = false;
                                    bVarI.X(false);
                                }
                                Unit unit111111 = Unit.a;
                                bVarI.X(z20);
                                unit3 = Unit.a;
                                r8 = z20;
                            }
                            if (unit3 == null) {
                                bVarI.N(627332324);
                                a(r8, bVarI);
                                bVarI.X(r8);
                            } else {
                                bVarI.N(627303959);
                                bVarI.X(r8);
                            }
                            bVarI.X(r8);
                            r9 = r8;
                            z22 = r9;
                        } else if (i != 888999888) {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i2111111111 = i17 << 15;
                                    int i2111111112 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111111111 & 458752) | (i2111111111 & 3670016);
                                    int i31116 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111111112 | (i31116 & 29360128) | (i31116 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit111112 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        } else {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i2111111113 = i17 << 15;
                                    int i2111111114 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111111113 & 458752) | (i2111111113 & 3670016);
                                    int i31117 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111111114 | (i31117 & 29360128) | (i31117 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit111113 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        }
                    } else if (Intrinsics.g(str7, "game_providers")) {
                        bVarI.N(-2028413749);
                        h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                        if (h0sVar2 == null) {
                            bVarI.N(-2028345302);
                            r8 = 0;
                            bVarI.X(false);
                            unit3 = null;
                        } else {
                            z20 = false;
                            bVarI.N(-2028345301);
                            if (h0sVar2.c() == 0) {
                                bVarI.N(-698186048);
                                s5t.d(0, bVarI);
                                bVarI.X(false);
                            } else {
                                bVarI.N(-698081268);
                                int i2111111115 = i13 << 12;
                                b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i2111111115 & 29360128) | (i2111111115 & 234881024));
                                z20 = false;
                                bVarI.X(false);
                            }
                            Unit unit111114 = Unit.a;
                            bVarI.X(z20);
                            unit3 = Unit.a;
                            r8 = z20;
                        }
                        if (unit3 == null) {
                            bVarI.N(627332324);
                            a(r8, bVarI);
                            bVarI.X(r8);
                        } else {
                            bVarI.N(627303959);
                            bVarI.X(r8);
                        }
                        bVarI.X(r8);
                        r9 = r8;
                        z22 = r9;
                    } else if (i != 888999888) {
                        str8 = str8;
                        z17 = false;
                        z18 = false;
                        bVarI.N(-2027315822);
                        h0sVar = lobbyV2ViewModel.c0;
                        if (h0sVar == null) {
                            bVarI.N(-2027281010);
                            bVarI.X(false);
                            str8 = str8;
                            unit = null;
                        } else {
                            bVarI.N(-2027281009);
                            if (h0sVar.c() == 0) {
                                bVarI.N(-439565701);
                                s5t.c(0, bVarI);
                                bVarI.X(false);
                            } else {
                                bVarI.N(-439458317);
                                int i2111111116 = i17 << 15;
                                int i2111111117 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111111116 & 458752) | (i2111111116 & 3670016);
                                int i31118 = i13 << 12;
                                b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111111117 | (i31118 & 29360128) | (i31118 & 234881024));
                                z17 = false;
                                bVarI.X(false);
                            }
                            Unit unit111115 = Unit.a;
                            bVarI.X(z17);
                            unit = Unit.a;
                            z18 = z17;
                        }
                        if (unit == null) {
                            bVarI.N(627365540);
                            a(z18 ? 1 : 0, bVarI);
                            bVarI.X(z18);
                        } else {
                            bVarI.N(627339376);
                            bVarI.X(z18);
                        }
                        bVarI.X(z18);
                        z22 = z18;
                    } else {
                        str8 = str8;
                        z17 = false;
                        z18 = false;
                        bVarI.N(-2027315822);
                        h0sVar = lobbyV2ViewModel.c0;
                        if (h0sVar == null) {
                            bVarI.N(-2027281010);
                            bVarI.X(false);
                            str8 = str8;
                            unit = null;
                        } else {
                            bVarI.N(-2027281009);
                            if (h0sVar.c() == 0) {
                                bVarI.N(-439565701);
                                s5t.c(0, bVarI);
                                bVarI.X(false);
                            } else {
                                bVarI.N(-439458317);
                                int i2111111118 = i17 << 15;
                                int i2111111119 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111111118 & 458752) | (i2111111118 & 3670016);
                                int i31119 = i13 << 12;
                                b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111111119 | (i31119 & 29360128) | (i31119 & 234881024));
                                z17 = false;
                                bVarI.X(false);
                            }
                            Unit unit111116 = Unit.a;
                            bVarI.X(z17);
                            unit = Unit.a;
                            z18 = z17;
                        }
                        if (unit == null) {
                            bVarI.N(627365540);
                            a(z18 ? 1 : 0, bVarI);
                            bVarI.X(z18);
                        } else {
                            bVarI.N(627339376);
                            bVarI.X(z18);
                        }
                        bVarI.X(z18);
                        z22 = z18;
                    }
                    bVarI.X(z22);
                } else {
                    if (hxsVar instanceof hxs.a) {
                        bVarI.N(-2025470609);
                        if (h0sVarA.c() > 0) {
                            dVarE = j.g(aVar2, 1.0f);
                        } else {
                            dVarE = j.e(aVar2, 1.0f);
                        }
                        zA = bVarI.A(h0sVarA);
                        Object objY4 = bVarI.y();
                        if (zA) {
                            r7 = 0;
                            j4t j4tVar2 = new j4t(h0sVarA, false ? 1 : 0);
                            bVarI.r(j4tVar2);
                            obj2 = j4tVar2;
                        } else {
                            r7 = 0;
                            j4t j4tVar3 = new j4t(h0sVarA, false ? 1 : 0);
                            bVarI.r(j4tVar3);
                            obj2 = j4tVar3;
                        }
                        s5t.a(r7, bVarI, dVarE, (Function0) obj2);
                        bVarI.X(r7);
                    } else {
                        if (hxsVar instanceof hxs.c) {
                            throw igf0.a(bVarI, 627206955, false);
                        }
                        bVarI.N(-2024946926);
                        if (i == 888999888) {
                            lobbyV2ViewModel.c0 = h0sVarA;
                        } else {
                            if (str7 != null) {
                                z16 = true;
                                if (str7.equals("my_favourites")) {
                                    lobbyV2ViewModel.c0 = h0sVarA;
                                }
                            } else {
                                z16 = true;
                            }
                            if (str7 == null) {
                                linkedHashMap.put(Integer.valueOf(i), h0sVarA);
                            } else {
                                linkedHashMap.put(Integer.valueOf(i), h0sVarA);
                            }
                        }
                        if (h0sVarA.c() == 0) {
                            bVarI.N(-2024224750);
                            if (i == 888999888) {
                                bVarI.N(-2024148955);
                                z15 = false;
                                s5t.c(0, bVarI);
                                bVarI.X(false);
                            } else {
                                z15 = false;
                                bVarI.N(-2024066743);
                                s5t.d(0, bVarI);
                                bVarI.X(false);
                            }
                            bVarI.X(z15);
                            str4 = str8;
                        } else {
                            bVarI.N(-2023955608);
                            int i320 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168);
                            int i321 = i17 << 15;
                            int i322 = i320 | (i321 & 458752) | (i321 & 3670016);
                            int i323 = i13 << 12;
                            str4 = str8;
                            b(lobbyV2ViewModel, h0sVarA, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str4, bVarI, i322 | (i323 & 29360128) | (i323 & 234881024));
                            z15 = false;
                            bVarI.X(false);
                        }
                        bVarI.X(z15);
                    }
                    bVarI.X(true);
                    str5 = str7;
                    z7 = z8;
                    z6 = z29;
                }
                str4 = str8;
                bVarI.X(true);
                str5 = str7;
                z7 = z8;
                z6 = z29;
            } else {
                bVarI.G();
                str5 = str;
                z6 = z3;
                z7 = z4;
            }
            str6 = str4;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: k4t
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        int iA = qj40.a(i2 | 1);
                        int iA2 = qj40.a(i3);
                        q4t.c(yfxVar, lobbyV2ViewModel, i, str5, str6, z7, z2, fbhVar, z6, gajVar, gnjVar, str3, lyhVar, (a) obj3, iA, iA2, i4);
                        return Unit.a;
                    }
                };
            }
        }
        i5 |= 3072;
        i6 = i4 & 16;
        if (i6 != 0) {
            if ((i2 & 24576) == 0) {
                str4 = str2;
                if (bVarI.M(str4)) {
                    i7 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i7 = 8192;
                }
                i5 |= i7;
            }
            i8 = i4 & 32;
            if (i8 != 0) {
                i5 |= 196608;
                z4 = z;
            } else {
                z4 = z;
                if ((i2 & 196608) == 0) {
                    if (bVarI.b(z4)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i5 |= i9;
                }
            }
            if ((i2 & 1572864) == 0) {
                if (bVarI.b(z2)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i5 |= i22;
            }
            if ((i2 & 12582912) == 0) {
                if (bVarI.M(fbhVar)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i5 |= i21;
            }
            i10 = i5;
            i11 = i4 & 256;
            if (i11 != 0) {
                i10 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                if (bVarI.b(z3)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i10 |= i12;
            }
            if ((i2 & 805306368) == 0) {
                if (bVarI.A(gajVar)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i10 |= i20;
            }
            i13 = i10;
            if ((i3 & 6) == 0) {
                if (bVarI.d(gnjVar.ordinal())) {
                    i19 = 4;
                } else {
                    i19 = 2;
                }
                i14 = i3 | i19;
            } else {
                i14 = i3;
            }
            i15 = i14;
            if ((i3 & 48) == 0) {
                if (bVarI.M(str3)) {
                    i18 = 32;
                } else {
                    i18 = 16;
                }
                i16 = i15 | i18;
            } else {
                i16 = i15;
            }
            i17 = i16 | (bVarI.A(lyhVar) ? 256 : 128);
            if ((i13 & 306783379) == 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (bVarI.q(i13 & 1, z5)) {
                if (i23 != 0) {
                    str7 = null;
                } else {
                    str7 = str;
                }
                if (i6 != 0) {
                    str4 = null;
                }
                if (i8 != 0) {
                    z8 = false;
                } else {
                    z8 = z4;
                }
                if (i11 != 0) {
                    z9 = false;
                } else {
                    z9 = z3;
                }
                h0sVarA = k0s.a(lyhVar, bVarI);
                zvrVarA = dwr.a(0, 3, bVarI);
                boolean zA4 = bVarI.A(yfxVar);
                if ((i13 & 896) == 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z210 = zA4 | z10;
                if ((i13 & 3670016) == 1048576) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z211 = z210 | z11;
                if ((i13 & 234881024) == 67108864) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z211 | z12;
                Object objY5 = bVarI.y();
                a.C0041a.C0042a c0042a3 = a.C0041a.a;
                obj = objY5;
                if (z13) {
                    Function1 function5 = new Function1() { // from class: i4t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            StringBuilder sbA = dy5.a("search?id=", i, z2 ? 1 : 0, "&section=1&favourite=", "&provider=");
                            sbA.append(z9 ? 1 : 0);
                            yfx.i(yfxVar, sbA.toString(), null, 6);
                            return Unit.a;
                        }
                    };
                    bVarI.r(function5);
                    obj = function5;
                } else {
                    Function1 function6 = new Function1() { // from class: i4t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            StringBuilder sbA = dy5.a("search?id=", i, z2 ? 1 : 0, "&section=1&favourite=", "&provider=");
                            sbA.append(z9 ? 1 : 0);
                            yfx.i(yfxVar, sbA.toString(), null, 6);
                            return Unit.a;
                        }
                    };
                    bVarI.r(function6);
                    obj = function6;
                }
                function1 = (Function1) obj;
                i78 i78VarA3 = g78.a(kw0.c, ht.a.m, bVarI, 0);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                boolean z212 = z9;
                aVar2 = d.a.b;
                str8 = str4;
                d dVarC3 = androidx.compose.ui.c.c(bVarI, aVar2);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, i78VarA3, yka.a.f);
                hlh0.a(bVarI, ne00VarS3, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC3, yka.a.d);
                if (z8) {
                    bVarI.N(-2032061457);
                    z14 = false;
                    w8t.a(h.g(j.g(aVar2, 1.0f), fw20.a(R.dimen._10sdp, bVarI), fw20.a(R.dimen.lobby_v2_header_vertical_padding, bVarI)), function1, bVarI, 0);
                } else {
                    z14 = false;
                    bVarI.N(-2036144622);
                }
                bVarI.X(z14);
                hxsVar = h0sVarA.d().a;
                if (hxsVar instanceof hxs.b) {
                    bVarI.N(-2031411232);
                    if (!z8) {
                        if (!z8) {
                            if (z8) {
                                if (!z8) {
                                    if (Intrinsics.g(str7, "game_providers")) {
                                        bVarI.N(-2028413749);
                                        h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                        if (h0sVar2 == null) {
                                            bVarI.N(-2028345302);
                                            r8 = 0;
                                            bVarI.X(false);
                                            unit3 = null;
                                        } else {
                                            z20 = false;
                                            bVarI.N(-2028345301);
                                            if (h0sVar2.c() == 0) {
                                                bVarI.N(-698186048);
                                                s5t.d(0, bVarI);
                                                bVarI.X(false);
                                            } else {
                                                bVarI.N(-698081268);
                                                int i21111111110 = i13 << 12;
                                                b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i21111111110 & 29360128) | (i21111111110 & 234881024));
                                                z20 = false;
                                                bVarI.X(false);
                                            }
                                            Unit unit111117 = Unit.a;
                                            bVarI.X(z20);
                                            unit3 = Unit.a;
                                            r8 = z20;
                                        }
                                        if (unit3 == null) {
                                            bVarI.N(627332324);
                                            a(r8, bVarI);
                                            bVarI.X(r8);
                                        } else {
                                            bVarI.N(627303959);
                                            bVarI.X(r8);
                                        }
                                        bVarI.X(r8);
                                        r9 = r8;
                                        z22 = r9;
                                    } else if (i != 888999888) {
                                        str8 = str8;
                                        z17 = false;
                                        z18 = false;
                                        bVarI.N(-2027315822);
                                        h0sVar = lobbyV2ViewModel.c0;
                                        if (h0sVar == null) {
                                            bVarI.N(-2027281010);
                                            bVarI.X(false);
                                            str8 = str8;
                                            unit = null;
                                        } else {
                                            bVarI.N(-2027281009);
                                            if (h0sVar.c() == 0) {
                                                bVarI.N(-439565701);
                                                s5t.c(0, bVarI);
                                                bVarI.X(false);
                                            } else {
                                                bVarI.N(-439458317);
                                                int i21111111111 = i17 << 15;
                                                int i21111111112 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111111111 & 458752) | (i21111111111 & 3670016);
                                                int i311110 = i13 << 12;
                                                b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111111112 | (i311110 & 29360128) | (i311110 & 234881024));
                                                z17 = false;
                                                bVarI.X(false);
                                            }
                                            Unit unit111118 = Unit.a;
                                            bVarI.X(z17);
                                            unit = Unit.a;
                                            z18 = z17;
                                        }
                                        if (unit == null) {
                                            bVarI.N(627365540);
                                            a(z18 ? 1 : 0, bVarI);
                                            bVarI.X(z18);
                                        } else {
                                            bVarI.N(627339376);
                                            bVarI.X(z18);
                                        }
                                        bVarI.X(z18);
                                        z22 = z18;
                                    } else {
                                        str8 = str8;
                                        z17 = false;
                                        z18 = false;
                                        bVarI.N(-2027315822);
                                        h0sVar = lobbyV2ViewModel.c0;
                                        if (h0sVar == null) {
                                            bVarI.N(-2027281010);
                                            bVarI.X(false);
                                            str8 = str8;
                                            unit = null;
                                        } else {
                                            bVarI.N(-2027281009);
                                            if (h0sVar.c() == 0) {
                                                bVarI.N(-439565701);
                                                s5t.c(0, bVarI);
                                                bVarI.X(false);
                                            } else {
                                                bVarI.N(-439458317);
                                                int i21111111113 = i17 << 15;
                                                int i21111111114 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111111113 & 458752) | (i21111111113 & 3670016);
                                                int i311111 = i13 << 12;
                                                b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111111114 | (i311111 & 29360128) | (i311111 & 234881024));
                                                z17 = false;
                                                bVarI.X(false);
                                            }
                                            Unit unit111119 = Unit.a;
                                            bVarI.X(z17);
                                            unit = Unit.a;
                                            z18 = z17;
                                        }
                                        if (unit == null) {
                                            bVarI.N(627365540);
                                            a(z18 ? 1 : 0, bVarI);
                                            bVarI.X(z18);
                                        } else {
                                            bVarI.N(627339376);
                                            bVarI.X(z18);
                                        }
                                        bVarI.X(z18);
                                        z22 = z18;
                                    }
                                } else if (Intrinsics.g(str7, "game_providers")) {
                                    bVarI.N(-2028413749);
                                    h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                    if (h0sVar2 == null) {
                                        bVarI.N(-2028345302);
                                        r8 = 0;
                                        bVarI.X(false);
                                        unit3 = null;
                                    } else {
                                        z20 = false;
                                        bVarI.N(-2028345301);
                                        if (h0sVar2.c() == 0) {
                                            bVarI.N(-698186048);
                                            s5t.d(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-698081268);
                                            int i21111111115 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i21111111115 & 29360128) | (i21111111115 & 234881024));
                                            z20 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit1111110 = Unit.a;
                                        bVarI.X(z20);
                                        unit3 = Unit.a;
                                        r8 = z20;
                                    }
                                    if (unit3 == null) {
                                        bVarI.N(627332324);
                                        a(r8, bVarI);
                                        bVarI.X(r8);
                                    } else {
                                        bVarI.N(627303959);
                                        bVarI.X(r8);
                                    }
                                    bVarI.X(r8);
                                    r9 = r8;
                                    z22 = r9;
                                } else if (i != 888999888) {
                                    str8 = str8;
                                    z17 = false;
                                    z18 = false;
                                    bVarI.N(-2027315822);
                                    h0sVar = lobbyV2ViewModel.c0;
                                    if (h0sVar == null) {
                                        bVarI.N(-2027281010);
                                        bVarI.X(false);
                                        str8 = str8;
                                        unit = null;
                                    } else {
                                        bVarI.N(-2027281009);
                                        if (h0sVar.c() == 0) {
                                            bVarI.N(-439565701);
                                            s5t.c(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-439458317);
                                            int i21111111116 = i17 << 15;
                                            int i21111111117 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111111116 & 458752) | (i21111111116 & 3670016);
                                            int i311112 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111111117 | (i311112 & 29360128) | (i311112 & 234881024));
                                            z17 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit1111111 = Unit.a;
                                        bVarI.X(z17);
                                        unit = Unit.a;
                                        z18 = z17;
                                    }
                                    if (unit == null) {
                                        bVarI.N(627365540);
                                        a(z18 ? 1 : 0, bVarI);
                                        bVarI.X(z18);
                                    } else {
                                        bVarI.N(627339376);
                                        bVarI.X(z18);
                                    }
                                    bVarI.X(z18);
                                    z22 = z18;
                                } else {
                                    str8 = str8;
                                    z17 = false;
                                    z18 = false;
                                    bVarI.N(-2027315822);
                                    h0sVar = lobbyV2ViewModel.c0;
                                    if (h0sVar == null) {
                                        bVarI.N(-2027281010);
                                        bVarI.X(false);
                                        str8 = str8;
                                        unit = null;
                                    } else {
                                        bVarI.N(-2027281009);
                                        if (h0sVar.c() == 0) {
                                            bVarI.N(-439565701);
                                            s5t.c(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-439458317);
                                            int i21111111118 = i17 << 15;
                                            int i21111111119 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111111118 & 458752) | (i21111111118 & 3670016);
                                            int i311113 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111111119 | (i311113 & 29360128) | (i311113 & 234881024));
                                            z17 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit1111112 = Unit.a;
                                        bVarI.X(z17);
                                        unit = Unit.a;
                                        z18 = z17;
                                    }
                                    if (unit == null) {
                                        bVarI.N(627365540);
                                        a(z18 ? 1 : 0, bVarI);
                                        bVarI.X(z18);
                                    } else {
                                        bVarI.N(627339376);
                                        bVarI.X(z18);
                                    }
                                    bVarI.X(z18);
                                    z22 = z18;
                                }
                            } else if (!z8) {
                                if (Intrinsics.g(str7, "game_providers")) {
                                    bVarI.N(-2028413749);
                                    h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                    if (h0sVar2 == null) {
                                        bVarI.N(-2028345302);
                                        r8 = 0;
                                        bVarI.X(false);
                                        unit3 = null;
                                    } else {
                                        z20 = false;
                                        bVarI.N(-2028345301);
                                        if (h0sVar2.c() == 0) {
                                            bVarI.N(-698186048);
                                            s5t.d(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-698081268);
                                            int i211111111110 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i211111111110 & 29360128) | (i211111111110 & 234881024));
                                            z20 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit1111113 = Unit.a;
                                        bVarI.X(z20);
                                        unit3 = Unit.a;
                                        r8 = z20;
                                    }
                                    if (unit3 == null) {
                                        bVarI.N(627332324);
                                        a(r8, bVarI);
                                        bVarI.X(r8);
                                    } else {
                                        bVarI.N(627303959);
                                        bVarI.X(r8);
                                    }
                                    bVarI.X(r8);
                                    r9 = r8;
                                    z22 = r9;
                                } else if (i != 888999888) {
                                    str8 = str8;
                                    z17 = false;
                                    z18 = false;
                                    bVarI.N(-2027315822);
                                    h0sVar = lobbyV2ViewModel.c0;
                                    if (h0sVar == null) {
                                        bVarI.N(-2027281010);
                                        bVarI.X(false);
                                        str8 = str8;
                                        unit = null;
                                    } else {
                                        bVarI.N(-2027281009);
                                        if (h0sVar.c() == 0) {
                                            bVarI.N(-439565701);
                                            s5t.c(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-439458317);
                                            int i211111111111 = i17 << 15;
                                            int i211111111112 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211111111111 & 458752) | (i211111111111 & 3670016);
                                            int i311114 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211111111112 | (i311114 & 29360128) | (i311114 & 234881024));
                                            z17 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit1111114 = Unit.a;
                                        bVarI.X(z17);
                                        unit = Unit.a;
                                        z18 = z17;
                                    }
                                    if (unit == null) {
                                        bVarI.N(627365540);
                                        a(z18 ? 1 : 0, bVarI);
                                        bVarI.X(z18);
                                    } else {
                                        bVarI.N(627339376);
                                        bVarI.X(z18);
                                    }
                                    bVarI.X(z18);
                                    z22 = z18;
                                } else {
                                    str8 = str8;
                                    z17 = false;
                                    z18 = false;
                                    bVarI.N(-2027315822);
                                    h0sVar = lobbyV2ViewModel.c0;
                                    if (h0sVar == null) {
                                        bVarI.N(-2027281010);
                                        bVarI.X(false);
                                        str8 = str8;
                                        unit = null;
                                    } else {
                                        bVarI.N(-2027281009);
                                        if (h0sVar.c() == 0) {
                                            bVarI.N(-439565701);
                                            s5t.c(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-439458317);
                                            int i211111111113 = i17 << 15;
                                            int i211111111114 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211111111113 & 458752) | (i211111111113 & 3670016);
                                            int i311115 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211111111114 | (i311115 & 29360128) | (i311115 & 234881024));
                                            z17 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit1111115 = Unit.a;
                                        bVarI.X(z17);
                                        unit = Unit.a;
                                        z18 = z17;
                                    }
                                    if (unit == null) {
                                        bVarI.N(627365540);
                                        a(z18 ? 1 : 0, bVarI);
                                        bVarI.X(z18);
                                    } else {
                                        bVarI.N(627339376);
                                        bVarI.X(z18);
                                    }
                                    bVarI.X(z18);
                                    z22 = z18;
                                }
                            } else if (Intrinsics.g(str7, "game_providers")) {
                                bVarI.N(-2028413749);
                                h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                if (h0sVar2 == null) {
                                    bVarI.N(-2028345302);
                                    r8 = 0;
                                    bVarI.X(false);
                                    unit3 = null;
                                } else {
                                    z20 = false;
                                    bVarI.N(-2028345301);
                                    if (h0sVar2.c() == 0) {
                                        bVarI.N(-698186048);
                                        s5t.d(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-698081268);
                                        int i211111111115 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i211111111115 & 29360128) | (i211111111115 & 234881024));
                                        z20 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit1111116 = Unit.a;
                                    bVarI.X(z20);
                                    unit3 = Unit.a;
                                    r8 = z20;
                                }
                                if (unit3 == null) {
                                    bVarI.N(627332324);
                                    a(r8, bVarI);
                                    bVarI.X(r8);
                                } else {
                                    bVarI.N(627303959);
                                    bVarI.X(r8);
                                }
                                bVarI.X(r8);
                                r9 = r8;
                                z22 = r9;
                            } else if (i != 888999888) {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i211111111116 = i17 << 15;
                                        int i211111111117 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211111111116 & 458752) | (i211111111116 & 3670016);
                                        int i311116 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211111111117 | (i311116 & 29360128) | (i311116 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit1111117 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            } else {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i211111111118 = i17 << 15;
                                        int i211111111119 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211111111118 & 458752) | (i211111111118 & 3670016);
                                        int i311117 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211111111119 | (i311117 & 29360128) | (i311117 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit1111118 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            }
                        } else if (z8) {
                            if (!z8) {
                                if (Intrinsics.g(str7, "game_providers")) {
                                    bVarI.N(-2028413749);
                                    h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                    if (h0sVar2 == null) {
                                        bVarI.N(-2028345302);
                                        r8 = 0;
                                        bVarI.X(false);
                                        unit3 = null;
                                    } else {
                                        z20 = false;
                                        bVarI.N(-2028345301);
                                        if (h0sVar2.c() == 0) {
                                            bVarI.N(-698186048);
                                            s5t.d(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-698081268);
                                            int i2111111111110 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i2111111111110 & 29360128) | (i2111111111110 & 234881024));
                                            z20 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit1111119 = Unit.a;
                                        bVarI.X(z20);
                                        unit3 = Unit.a;
                                        r8 = z20;
                                    }
                                    if (unit3 == null) {
                                        bVarI.N(627332324);
                                        a(r8, bVarI);
                                        bVarI.X(r8);
                                    } else {
                                        bVarI.N(627303959);
                                        bVarI.X(r8);
                                    }
                                    bVarI.X(r8);
                                    r9 = r8;
                                    z22 = r9;
                                } else if (i != 888999888) {
                                    str8 = str8;
                                    z17 = false;
                                    z18 = false;
                                    bVarI.N(-2027315822);
                                    h0sVar = lobbyV2ViewModel.c0;
                                    if (h0sVar == null) {
                                        bVarI.N(-2027281010);
                                        bVarI.X(false);
                                        str8 = str8;
                                        unit = null;
                                    } else {
                                        bVarI.N(-2027281009);
                                        if (h0sVar.c() == 0) {
                                            bVarI.N(-439565701);
                                            s5t.c(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-439458317);
                                            int i2111111111111 = i17 << 15;
                                            int i2111111111112 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111111111111 & 458752) | (i2111111111111 & 3670016);
                                            int i311118 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111111111112 | (i311118 & 29360128) | (i311118 & 234881024));
                                            z17 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit11111110 = Unit.a;
                                        bVarI.X(z17);
                                        unit = Unit.a;
                                        z18 = z17;
                                    }
                                    if (unit == null) {
                                        bVarI.N(627365540);
                                        a(z18 ? 1 : 0, bVarI);
                                        bVarI.X(z18);
                                    } else {
                                        bVarI.N(627339376);
                                        bVarI.X(z18);
                                    }
                                    bVarI.X(z18);
                                    z22 = z18;
                                } else {
                                    str8 = str8;
                                    z17 = false;
                                    z18 = false;
                                    bVarI.N(-2027315822);
                                    h0sVar = lobbyV2ViewModel.c0;
                                    if (h0sVar == null) {
                                        bVarI.N(-2027281010);
                                        bVarI.X(false);
                                        str8 = str8;
                                        unit = null;
                                    } else {
                                        bVarI.N(-2027281009);
                                        if (h0sVar.c() == 0) {
                                            bVarI.N(-439565701);
                                            s5t.c(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-439458317);
                                            int i2111111111113 = i17 << 15;
                                            int i2111111111114 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111111111113 & 458752) | (i2111111111113 & 3670016);
                                            int i311119 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111111111114 | (i311119 & 29360128) | (i311119 & 234881024));
                                            z17 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit11111111 = Unit.a;
                                        bVarI.X(z17);
                                        unit = Unit.a;
                                        z18 = z17;
                                    }
                                    if (unit == null) {
                                        bVarI.N(627365540);
                                        a(z18 ? 1 : 0, bVarI);
                                        bVarI.X(z18);
                                    } else {
                                        bVarI.N(627339376);
                                        bVarI.X(z18);
                                    }
                                    bVarI.X(z18);
                                    z22 = z18;
                                }
                            } else if (Intrinsics.g(str7, "game_providers")) {
                                bVarI.N(-2028413749);
                                h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                if (h0sVar2 == null) {
                                    bVarI.N(-2028345302);
                                    r8 = 0;
                                    bVarI.X(false);
                                    unit3 = null;
                                } else {
                                    z20 = false;
                                    bVarI.N(-2028345301);
                                    if (h0sVar2.c() == 0) {
                                        bVarI.N(-698186048);
                                        s5t.d(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-698081268);
                                        int i2111111111115 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i2111111111115 & 29360128) | (i2111111111115 & 234881024));
                                        z20 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit11111112 = Unit.a;
                                    bVarI.X(z20);
                                    unit3 = Unit.a;
                                    r8 = z20;
                                }
                                if (unit3 == null) {
                                    bVarI.N(627332324);
                                    a(r8, bVarI);
                                    bVarI.X(r8);
                                } else {
                                    bVarI.N(627303959);
                                    bVarI.X(r8);
                                }
                                bVarI.X(r8);
                                r9 = r8;
                                z22 = r9;
                            } else if (i != 888999888) {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i2111111111116 = i17 << 15;
                                        int i2111111111117 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111111111116 & 458752) | (i2111111111116 & 3670016);
                                        int i3111110 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111111111117 | (i3111110 & 29360128) | (i3111110 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit11111113 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            } else {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i2111111111118 = i17 << 15;
                                        int i2111111111119 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111111111118 & 458752) | (i2111111111118 & 3670016);
                                        int i3111111 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111111111119 | (i3111111 & 29360128) | (i3111111 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit11111114 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            }
                        } else if (!z8) {
                            if (Intrinsics.g(str7, "game_providers")) {
                                bVarI.N(-2028413749);
                                h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                if (h0sVar2 == null) {
                                    bVarI.N(-2028345302);
                                    r8 = 0;
                                    bVarI.X(false);
                                    unit3 = null;
                                } else {
                                    z20 = false;
                                    bVarI.N(-2028345301);
                                    if (h0sVar2.c() == 0) {
                                        bVarI.N(-698186048);
                                        s5t.d(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-698081268);
                                        int i21111111111110 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i21111111111110 & 29360128) | (i21111111111110 & 234881024));
                                        z20 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit11111115 = Unit.a;
                                    bVarI.X(z20);
                                    unit3 = Unit.a;
                                    r8 = z20;
                                }
                                if (unit3 == null) {
                                    bVarI.N(627332324);
                                    a(r8, bVarI);
                                    bVarI.X(r8);
                                } else {
                                    bVarI.N(627303959);
                                    bVarI.X(r8);
                                }
                                bVarI.X(r8);
                                r9 = r8;
                                z22 = r9;
                            } else if (i != 888999888) {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i21111111111111 = i17 << 15;
                                        int i21111111111112 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111111111111 & 458752) | (i21111111111111 & 3670016);
                                        int i3111112 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111111111112 | (i3111112 & 29360128) | (i3111112 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit11111116 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            } else {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i21111111111113 = i17 << 15;
                                        int i21111111111114 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111111111113 & 458752) | (i21111111111113 & 3670016);
                                        int i3111113 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111111111114 | (i3111113 & 29360128) | (i3111113 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit11111117 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            }
                        } else if (Intrinsics.g(str7, "game_providers")) {
                            bVarI.N(-2028413749);
                            h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                            if (h0sVar2 == null) {
                                bVarI.N(-2028345302);
                                r8 = 0;
                                bVarI.X(false);
                                unit3 = null;
                            } else {
                                z20 = false;
                                bVarI.N(-2028345301);
                                if (h0sVar2.c() == 0) {
                                    bVarI.N(-698186048);
                                    s5t.d(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-698081268);
                                    int i21111111111115 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i21111111111115 & 29360128) | (i21111111111115 & 234881024));
                                    z20 = false;
                                    bVarI.X(false);
                                }
                                Unit unit11111118 = Unit.a;
                                bVarI.X(z20);
                                unit3 = Unit.a;
                                r8 = z20;
                            }
                            if (unit3 == null) {
                                bVarI.N(627332324);
                                a(r8, bVarI);
                                bVarI.X(r8);
                            } else {
                                bVarI.N(627303959);
                                bVarI.X(r8);
                            }
                            bVarI.X(r8);
                            r9 = r8;
                            z22 = r9;
                        } else if (i != 888999888) {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i21111111111116 = i17 << 15;
                                    int i21111111111117 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111111111116 & 458752) | (i21111111111116 & 3670016);
                                    int i3111114 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111111111117 | (i3111114 & 29360128) | (i3111114 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit11111119 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        } else {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i21111111111118 = i17 << 15;
                                    int i21111111111119 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111111111118 & 458752) | (i21111111111118 & 3670016);
                                    int i3111115 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111111111119 | (i3111115 & 29360128) | (i3111115 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit111111110 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        }
                    } else if (!z8) {
                        if (z8) {
                            if (!z8) {
                                if (Intrinsics.g(str7, "game_providers")) {
                                    bVarI.N(-2028413749);
                                    h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                    if (h0sVar2 == null) {
                                        bVarI.N(-2028345302);
                                        r8 = 0;
                                        bVarI.X(false);
                                        unit3 = null;
                                    } else {
                                        z20 = false;
                                        bVarI.N(-2028345301);
                                        if (h0sVar2.c() == 0) {
                                            bVarI.N(-698186048);
                                            s5t.d(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-698081268);
                                            int i211111111111110 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i211111111111110 & 29360128) | (i211111111111110 & 234881024));
                                            z20 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit111111111 = Unit.a;
                                        bVarI.X(z20);
                                        unit3 = Unit.a;
                                        r8 = z20;
                                    }
                                    if (unit3 == null) {
                                        bVarI.N(627332324);
                                        a(r8, bVarI);
                                        bVarI.X(r8);
                                    } else {
                                        bVarI.N(627303959);
                                        bVarI.X(r8);
                                    }
                                    bVarI.X(r8);
                                    r9 = r8;
                                    z22 = r9;
                                } else if (i != 888999888) {
                                    str8 = str8;
                                    z17 = false;
                                    z18 = false;
                                    bVarI.N(-2027315822);
                                    h0sVar = lobbyV2ViewModel.c0;
                                    if (h0sVar == null) {
                                        bVarI.N(-2027281010);
                                        bVarI.X(false);
                                        str8 = str8;
                                        unit = null;
                                    } else {
                                        bVarI.N(-2027281009);
                                        if (h0sVar.c() == 0) {
                                            bVarI.N(-439565701);
                                            s5t.c(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-439458317);
                                            int i211111111111111 = i17 << 15;
                                            int i211111111111112 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211111111111111 & 458752) | (i211111111111111 & 3670016);
                                            int i3111116 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211111111111112 | (i3111116 & 29360128) | (i3111116 & 234881024));
                                            z17 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit111111112 = Unit.a;
                                        bVarI.X(z17);
                                        unit = Unit.a;
                                        z18 = z17;
                                    }
                                    if (unit == null) {
                                        bVarI.N(627365540);
                                        a(z18 ? 1 : 0, bVarI);
                                        bVarI.X(z18);
                                    } else {
                                        bVarI.N(627339376);
                                        bVarI.X(z18);
                                    }
                                    bVarI.X(z18);
                                    z22 = z18;
                                } else {
                                    str8 = str8;
                                    z17 = false;
                                    z18 = false;
                                    bVarI.N(-2027315822);
                                    h0sVar = lobbyV2ViewModel.c0;
                                    if (h0sVar == null) {
                                        bVarI.N(-2027281010);
                                        bVarI.X(false);
                                        str8 = str8;
                                        unit = null;
                                    } else {
                                        bVarI.N(-2027281009);
                                        if (h0sVar.c() == 0) {
                                            bVarI.N(-439565701);
                                            s5t.c(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-439458317);
                                            int i211111111111113 = i17 << 15;
                                            int i211111111111114 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211111111111113 & 458752) | (i211111111111113 & 3670016);
                                            int i3111117 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211111111111114 | (i3111117 & 29360128) | (i3111117 & 234881024));
                                            z17 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit111111113 = Unit.a;
                                        bVarI.X(z17);
                                        unit = Unit.a;
                                        z18 = z17;
                                    }
                                    if (unit == null) {
                                        bVarI.N(627365540);
                                        a(z18 ? 1 : 0, bVarI);
                                        bVarI.X(z18);
                                    } else {
                                        bVarI.N(627339376);
                                        bVarI.X(z18);
                                    }
                                    bVarI.X(z18);
                                    z22 = z18;
                                }
                            } else if (Intrinsics.g(str7, "game_providers")) {
                                bVarI.N(-2028413749);
                                h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                if (h0sVar2 == null) {
                                    bVarI.N(-2028345302);
                                    r8 = 0;
                                    bVarI.X(false);
                                    unit3 = null;
                                } else {
                                    z20 = false;
                                    bVarI.N(-2028345301);
                                    if (h0sVar2.c() == 0) {
                                        bVarI.N(-698186048);
                                        s5t.d(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-698081268);
                                        int i211111111111115 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i211111111111115 & 29360128) | (i211111111111115 & 234881024));
                                        z20 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit111111114 = Unit.a;
                                    bVarI.X(z20);
                                    unit3 = Unit.a;
                                    r8 = z20;
                                }
                                if (unit3 == null) {
                                    bVarI.N(627332324);
                                    a(r8, bVarI);
                                    bVarI.X(r8);
                                } else {
                                    bVarI.N(627303959);
                                    bVarI.X(r8);
                                }
                                bVarI.X(r8);
                                r9 = r8;
                                z22 = r9;
                            } else if (i != 888999888) {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i211111111111116 = i17 << 15;
                                        int i211111111111117 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211111111111116 & 458752) | (i211111111111116 & 3670016);
                                        int i3111118 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211111111111117 | (i3111118 & 29360128) | (i3111118 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit111111115 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            } else {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i211111111111118 = i17 << 15;
                                        int i211111111111119 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211111111111118 & 458752) | (i211111111111118 & 3670016);
                                        int i3111119 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211111111111119 | (i3111119 & 29360128) | (i3111119 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit111111116 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            }
                        } else if (!z8) {
                            if (Intrinsics.g(str7, "game_providers")) {
                                bVarI.N(-2028413749);
                                h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                if (h0sVar2 == null) {
                                    bVarI.N(-2028345302);
                                    r8 = 0;
                                    bVarI.X(false);
                                    unit3 = null;
                                } else {
                                    z20 = false;
                                    bVarI.N(-2028345301);
                                    if (h0sVar2.c() == 0) {
                                        bVarI.N(-698186048);
                                        s5t.d(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-698081268);
                                        int i2111111111111110 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i2111111111111110 & 29360128) | (i2111111111111110 & 234881024));
                                        z20 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit111111117 = Unit.a;
                                    bVarI.X(z20);
                                    unit3 = Unit.a;
                                    r8 = z20;
                                }
                                if (unit3 == null) {
                                    bVarI.N(627332324);
                                    a(r8, bVarI);
                                    bVarI.X(r8);
                                } else {
                                    bVarI.N(627303959);
                                    bVarI.X(r8);
                                }
                                bVarI.X(r8);
                                r9 = r8;
                                z22 = r9;
                            } else if (i != 888999888) {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i2111111111111111 = i17 << 15;
                                        int i2111111111111112 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111111111111111 & 458752) | (i2111111111111111 & 3670016);
                                        int i31111110 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111111111111112 | (i31111110 & 29360128) | (i31111110 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit111111118 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            } else {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i2111111111111113 = i17 << 15;
                                        int i2111111111111114 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111111111111113 & 458752) | (i2111111111111113 & 3670016);
                                        int i31111111 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111111111111114 | (i31111111 & 29360128) | (i31111111 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit111111119 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            }
                        } else if (Intrinsics.g(str7, "game_providers")) {
                            bVarI.N(-2028413749);
                            h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                            if (h0sVar2 == null) {
                                bVarI.N(-2028345302);
                                r8 = 0;
                                bVarI.X(false);
                                unit3 = null;
                            } else {
                                z20 = false;
                                bVarI.N(-2028345301);
                                if (h0sVar2.c() == 0) {
                                    bVarI.N(-698186048);
                                    s5t.d(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-698081268);
                                    int i2111111111111115 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i2111111111111115 & 29360128) | (i2111111111111115 & 234881024));
                                    z20 = false;
                                    bVarI.X(false);
                                }
                                Unit unit1111111110 = Unit.a;
                                bVarI.X(z20);
                                unit3 = Unit.a;
                                r8 = z20;
                            }
                            if (unit3 == null) {
                                bVarI.N(627332324);
                                a(r8, bVarI);
                                bVarI.X(r8);
                            } else {
                                bVarI.N(627303959);
                                bVarI.X(r8);
                            }
                            bVarI.X(r8);
                            r9 = r8;
                            z22 = r9;
                        } else if (i != 888999888) {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i2111111111111116 = i17 << 15;
                                    int i2111111111111117 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111111111111116 & 458752) | (i2111111111111116 & 3670016);
                                    int i31111112 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111111111111117 | (i31111112 & 29360128) | (i31111112 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit1111111111 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        } else {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i2111111111111118 = i17 << 15;
                                    int i2111111111111119 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111111111111118 & 458752) | (i2111111111111118 & 3670016);
                                    int i31111113 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111111111111119 | (i31111113 & 29360128) | (i31111113 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit1111111112 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        }
                    } else if (z8) {
                        if (!z8) {
                            if (Intrinsics.g(str7, "game_providers")) {
                                bVarI.N(-2028413749);
                                h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                if (h0sVar2 == null) {
                                    bVarI.N(-2028345302);
                                    r8 = 0;
                                    bVarI.X(false);
                                    unit3 = null;
                                } else {
                                    z20 = false;
                                    bVarI.N(-2028345301);
                                    if (h0sVar2.c() == 0) {
                                        bVarI.N(-698186048);
                                        s5t.d(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-698081268);
                                        int i21111111111111110 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i21111111111111110 & 29360128) | (i21111111111111110 & 234881024));
                                        z20 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit1111111113 = Unit.a;
                                    bVarI.X(z20);
                                    unit3 = Unit.a;
                                    r8 = z20;
                                }
                                if (unit3 == null) {
                                    bVarI.N(627332324);
                                    a(r8, bVarI);
                                    bVarI.X(r8);
                                } else {
                                    bVarI.N(627303959);
                                    bVarI.X(r8);
                                }
                                bVarI.X(r8);
                                r9 = r8;
                                z22 = r9;
                            } else if (i != 888999888) {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i21111111111111111 = i17 << 15;
                                        int i21111111111111112 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111111111111111 & 458752) | (i21111111111111111 & 3670016);
                                        int i31111114 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111111111111112 | (i31111114 & 29360128) | (i31111114 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit1111111114 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            } else {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i21111111111111113 = i17 << 15;
                                        int i21111111111111114 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111111111111113 & 458752) | (i21111111111111113 & 3670016);
                                        int i31111115 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111111111111114 | (i31111115 & 29360128) | (i31111115 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit1111111115 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            }
                        } else if (Intrinsics.g(str7, "game_providers")) {
                            bVarI.N(-2028413749);
                            h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                            if (h0sVar2 == null) {
                                bVarI.N(-2028345302);
                                r8 = 0;
                                bVarI.X(false);
                                unit3 = null;
                            } else {
                                z20 = false;
                                bVarI.N(-2028345301);
                                if (h0sVar2.c() == 0) {
                                    bVarI.N(-698186048);
                                    s5t.d(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-698081268);
                                    int i21111111111111115 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i21111111111111115 & 29360128) | (i21111111111111115 & 234881024));
                                    z20 = false;
                                    bVarI.X(false);
                                }
                                Unit unit1111111116 = Unit.a;
                                bVarI.X(z20);
                                unit3 = Unit.a;
                                r8 = z20;
                            }
                            if (unit3 == null) {
                                bVarI.N(627332324);
                                a(r8, bVarI);
                                bVarI.X(r8);
                            } else {
                                bVarI.N(627303959);
                                bVarI.X(r8);
                            }
                            bVarI.X(r8);
                            r9 = r8;
                            z22 = r9;
                        } else if (i != 888999888) {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i21111111111111116 = i17 << 15;
                                    int i21111111111111117 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111111111111116 & 458752) | (i21111111111111116 & 3670016);
                                    int i31111116 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111111111111117 | (i31111116 & 29360128) | (i31111116 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit1111111117 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        } else {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i21111111111111118 = i17 << 15;
                                    int i21111111111111119 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111111111111118 & 458752) | (i21111111111111118 & 3670016);
                                    int i31111117 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111111111111119 | (i31111117 & 29360128) | (i31111117 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit1111111118 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        }
                    } else if (!z8) {
                        if (Intrinsics.g(str7, "game_providers")) {
                            bVarI.N(-2028413749);
                            h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                            if (h0sVar2 == null) {
                                bVarI.N(-2028345302);
                                r8 = 0;
                                bVarI.X(false);
                                unit3 = null;
                            } else {
                                z20 = false;
                                bVarI.N(-2028345301);
                                if (h0sVar2.c() == 0) {
                                    bVarI.N(-698186048);
                                    s5t.d(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-698081268);
                                    int i211111111111111110 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i211111111111111110 & 29360128) | (i211111111111111110 & 234881024));
                                    z20 = false;
                                    bVarI.X(false);
                                }
                                Unit unit1111111119 = Unit.a;
                                bVarI.X(z20);
                                unit3 = Unit.a;
                                r8 = z20;
                            }
                            if (unit3 == null) {
                                bVarI.N(627332324);
                                a(r8, bVarI);
                                bVarI.X(r8);
                            } else {
                                bVarI.N(627303959);
                                bVarI.X(r8);
                            }
                            bVarI.X(r8);
                            r9 = r8;
                            z22 = r9;
                        } else if (i != 888999888) {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i211111111111111111 = i17 << 15;
                                    int i211111111111111112 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211111111111111111 & 458752) | (i211111111111111111 & 3670016);
                                    int i31111118 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211111111111111112 | (i31111118 & 29360128) | (i31111118 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit11111111110 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        } else {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i211111111111111113 = i17 << 15;
                                    int i211111111111111114 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211111111111111113 & 458752) | (i211111111111111113 & 3670016);
                                    int i31111119 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211111111111111114 | (i31111119 & 29360128) | (i31111119 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit11111111111 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        }
                    } else if (Intrinsics.g(str7, "game_providers")) {
                        bVarI.N(-2028413749);
                        h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                        if (h0sVar2 == null) {
                            bVarI.N(-2028345302);
                            r8 = 0;
                            bVarI.X(false);
                            unit3 = null;
                        } else {
                            z20 = false;
                            bVarI.N(-2028345301);
                            if (h0sVar2.c() == 0) {
                                bVarI.N(-698186048);
                                s5t.d(0, bVarI);
                                bVarI.X(false);
                            } else {
                                bVarI.N(-698081268);
                                int i211111111111111115 = i13 << 12;
                                b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i211111111111111115 & 29360128) | (i211111111111111115 & 234881024));
                                z20 = false;
                                bVarI.X(false);
                            }
                            Unit unit11111111112 = Unit.a;
                            bVarI.X(z20);
                            unit3 = Unit.a;
                            r8 = z20;
                        }
                        if (unit3 == null) {
                            bVarI.N(627332324);
                            a(r8, bVarI);
                            bVarI.X(r8);
                        } else {
                            bVarI.N(627303959);
                            bVarI.X(r8);
                        }
                        bVarI.X(r8);
                        r9 = r8;
                        z22 = r9;
                    } else if (i != 888999888) {
                        str8 = str8;
                        z17 = false;
                        z18 = false;
                        bVarI.N(-2027315822);
                        h0sVar = lobbyV2ViewModel.c0;
                        if (h0sVar == null) {
                            bVarI.N(-2027281010);
                            bVarI.X(false);
                            str8 = str8;
                            unit = null;
                        } else {
                            bVarI.N(-2027281009);
                            if (h0sVar.c() == 0) {
                                bVarI.N(-439565701);
                                s5t.c(0, bVarI);
                                bVarI.X(false);
                            } else {
                                bVarI.N(-439458317);
                                int i211111111111111116 = i17 << 15;
                                int i211111111111111117 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211111111111111116 & 458752) | (i211111111111111116 & 3670016);
                                int i311111110 = i13 << 12;
                                b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211111111111111117 | (i311111110 & 29360128) | (i311111110 & 234881024));
                                z17 = false;
                                bVarI.X(false);
                            }
                            Unit unit11111111113 = Unit.a;
                            bVarI.X(z17);
                            unit = Unit.a;
                            z18 = z17;
                        }
                        if (unit == null) {
                            bVarI.N(627365540);
                            a(z18 ? 1 : 0, bVarI);
                            bVarI.X(z18);
                        } else {
                            bVarI.N(627339376);
                            bVarI.X(z18);
                        }
                        bVarI.X(z18);
                        z22 = z18;
                    } else {
                        str8 = str8;
                        z17 = false;
                        z18 = false;
                        bVarI.N(-2027315822);
                        h0sVar = lobbyV2ViewModel.c0;
                        if (h0sVar == null) {
                            bVarI.N(-2027281010);
                            bVarI.X(false);
                            str8 = str8;
                            unit = null;
                        } else {
                            bVarI.N(-2027281009);
                            if (h0sVar.c() == 0) {
                                bVarI.N(-439565701);
                                s5t.c(0, bVarI);
                                bVarI.X(false);
                            } else {
                                bVarI.N(-439458317);
                                int i211111111111111118 = i17 << 15;
                                int i211111111111111119 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211111111111111118 & 458752) | (i211111111111111118 & 3670016);
                                int i311111111 = i13 << 12;
                                b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211111111111111119 | (i311111111 & 29360128) | (i311111111 & 234881024));
                                z17 = false;
                                bVarI.X(false);
                            }
                            Unit unit11111111114 = Unit.a;
                            bVarI.X(z17);
                            unit = Unit.a;
                            z18 = z17;
                        }
                        if (unit == null) {
                            bVarI.N(627365540);
                            a(z18 ? 1 : 0, bVarI);
                            bVarI.X(z18);
                        } else {
                            bVarI.N(627339376);
                            bVarI.X(z18);
                        }
                        bVarI.X(z18);
                        z22 = z18;
                    }
                    bVarI.X(z22);
                } else {
                    if (hxsVar instanceof hxs.a) {
                        bVarI.N(-2025470609);
                        if (h0sVarA.c() > 0) {
                            dVarE = j.g(aVar2, 1.0f);
                        } else {
                            dVarE = j.e(aVar2, 1.0f);
                        }
                        zA = bVarI.A(h0sVarA);
                        Object objY6 = bVarI.y();
                        if (zA) {
                            r7 = 0;
                            j4t j4tVar4 = new j4t(h0sVarA, false ? 1 : 0);
                            bVarI.r(j4tVar4);
                            obj2 = j4tVar4;
                        } else {
                            r7 = 0;
                            j4t j4tVar5 = new j4t(h0sVarA, false ? 1 : 0);
                            bVarI.r(j4tVar5);
                            obj2 = j4tVar5;
                        }
                        s5t.a(r7, bVarI, dVarE, (Function0) obj2);
                        bVarI.X(r7);
                    } else {
                        if (hxsVar instanceof hxs.c) {
                            throw igf0.a(bVarI, 627206955, false);
                        }
                        bVarI.N(-2024946926);
                        if (i == 888999888) {
                            lobbyV2ViewModel.c0 = h0sVarA;
                        } else {
                            if (str7 != null) {
                                z16 = true;
                                if (str7.equals("my_favourites")) {
                                    lobbyV2ViewModel.c0 = h0sVarA;
                                }
                            } else {
                                z16 = true;
                            }
                            if (str7 == null) {
                                linkedHashMap.put(Integer.valueOf(i), h0sVarA);
                            } else {
                                linkedHashMap.put(Integer.valueOf(i), h0sVarA);
                            }
                        }
                        if (h0sVarA.c() == 0) {
                            bVarI.N(-2024224750);
                            if (i == 888999888) {
                                bVarI.N(-2024148955);
                                z15 = false;
                                s5t.c(0, bVarI);
                                bVarI.X(false);
                            } else {
                                z15 = false;
                                bVarI.N(-2024066743);
                                s5t.d(0, bVarI);
                                bVarI.X(false);
                            }
                            bVarI.X(z15);
                            str4 = str8;
                        } else {
                            bVarI.N(-2023955608);
                            int i324 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168);
                            int i325 = i17 << 15;
                            int i326 = i324 | (i325 & 458752) | (i325 & 3670016);
                            int i327 = i13 << 12;
                            str4 = str8;
                            b(lobbyV2ViewModel, h0sVarA, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str4, bVarI, i326 | (i327 & 29360128) | (i327 & 234881024));
                            z15 = false;
                            bVarI.X(false);
                        }
                        bVarI.X(z15);
                    }
                    bVarI.X(true);
                    str5 = str7;
                    z7 = z8;
                    z6 = z212;
                }
                str4 = str8;
                bVarI.X(true);
                str5 = str7;
                z7 = z8;
                z6 = z212;
            } else {
                bVarI.G();
                str5 = str;
                z6 = z3;
                z7 = z4;
            }
            str6 = str4;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: k4t
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        int iA = qj40.a(i2 | 1);
                        int iA2 = qj40.a(i3);
                        q4t.c(yfxVar, lobbyV2ViewModel, i, str5, str6, z7, z2, fbhVar, z6, gajVar, gnjVar, str3, lyhVar, (a) obj3, iA, iA2, i4);
                        return Unit.a;
                    }
                };
            }
        }
        i5 |= 24576;
        str4 = str2;
        i8 = i4 & 32;
        if (i8 != 0) {
            i5 |= 196608;
            z4 = z;
        } else {
            z4 = z;
            if ((i2 & 196608) == 0) {
                if (bVarI.b(z4)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i5 |= i9;
            }
        }
        if ((i2 & 1572864) == 0) {
            if (bVarI.b(z2)) {
                i22 = 1048576;
            } else {
                i22 = 524288;
            }
            i5 |= i22;
        }
        if ((i2 & 12582912) == 0) {
            if (bVarI.M(fbhVar)) {
                i21 = 8388608;
            } else {
                i21 = 4194304;
            }
            i5 |= i21;
        }
        i10 = i5;
        i11 = i4 & 256;
        if (i11 != 0) {
            i10 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            if (bVarI.b(z3)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i10 |= i12;
        }
        if ((i2 & 805306368) == 0) {
            if (bVarI.A(gajVar)) {
                i20 = 536870912;
            } else {
                i20 = 268435456;
            }
            i10 |= i20;
        }
        i13 = i10;
        if ((i3 & 6) == 0) {
            if (bVarI.d(gnjVar.ordinal())) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i14 = i3 | i19;
        } else {
            i14 = i3;
        }
        i15 = i14;
        if ((i3 & 48) == 0) {
            if (bVarI.M(str3)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i16 = i15 | i18;
        } else {
            i16 = i15;
        }
        i17 = i16 | (bVarI.A(lyhVar) ? 256 : 128);
        if ((i13 & 306783379) == 306783378) {
            z5 = true;
        } else {
            z5 = true;
        }
        if (bVarI.q(i13 & 1, z5)) {
            if (i23 != 0) {
                str7 = null;
            } else {
                str7 = str;
            }
            if (i6 != 0) {
                str4 = null;
            }
            if (i8 != 0) {
                z8 = false;
            } else {
                z8 = z4;
            }
            if (i11 != 0) {
                z9 = false;
            } else {
                z9 = z3;
            }
            h0sVarA = k0s.a(lyhVar, bVarI);
            zvrVarA = dwr.a(0, 3, bVarI);
            boolean zA5 = bVarI.A(yfxVar);
            if ((i13 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z213 = zA5 | z10;
            if ((i13 & 3670016) == 1048576) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z214 = z213 | z11;
            if ((i13 & 234881024) == 67108864) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = z214 | z12;
            Object objY7 = bVarI.y();
            a.C0041a.C0042a c0042a4 = a.C0041a.a;
            obj = objY7;
            if (z13) {
                Function1 function7 = new Function1() { // from class: i4t
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        StringBuilder sbA = dy5.a("search?id=", i, z2 ? 1 : 0, "&section=1&favourite=", "&provider=");
                        sbA.append(z9 ? 1 : 0);
                        yfx.i(yfxVar, sbA.toString(), null, 6);
                        return Unit.a;
                    }
                };
                bVarI.r(function7);
                obj = function7;
            } else {
                Function1 function8 = new Function1() { // from class: i4t
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        StringBuilder sbA = dy5.a("search?id=", i, z2 ? 1 : 0, "&section=1&favourite=", "&provider=");
                        sbA.append(z9 ? 1 : 0);
                        yfx.i(yfxVar, sbA.toString(), null, 6);
                        return Unit.a;
                    }
                };
                bVarI.r(function8);
                obj = function8;
            }
            function1 = (Function1) obj;
            i78 i78VarA4 = g78.a(kw0.c, ht.a.m, bVarI, 0);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            boolean z215 = z9;
            aVar2 = d.a.b;
            str8 = str4;
            d dVarC4 = androidx.compose.ui.c.c(bVarI, aVar2);
            yka.k.getClass();
            aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA4, yka.a.f);
            hlh0.a(bVarI, ne00VarS4, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC4, yka.a.d);
            if (z8) {
                bVarI.N(-2032061457);
                z14 = false;
                w8t.a(h.g(j.g(aVar2, 1.0f), fw20.a(R.dimen._10sdp, bVarI), fw20.a(R.dimen.lobby_v2_header_vertical_padding, bVarI)), function1, bVarI, 0);
            } else {
                z14 = false;
                bVarI.N(-2036144622);
            }
            bVarI.X(z14);
            hxsVar = h0sVarA.d().a;
            if (hxsVar instanceof hxs.b) {
                bVarI.N(-2031411232);
                if (!z8) {
                    if (!z8) {
                        if (z8) {
                            if (!z8) {
                                if (Intrinsics.g(str7, "game_providers")) {
                                    bVarI.N(-2028413749);
                                    h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                    if (h0sVar2 == null) {
                                        bVarI.N(-2028345302);
                                        r8 = 0;
                                        bVarI.X(false);
                                        unit3 = null;
                                    } else {
                                        z20 = false;
                                        bVarI.N(-2028345301);
                                        if (h0sVar2.c() == 0) {
                                            bVarI.N(-698186048);
                                            s5t.d(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-698081268);
                                            int i2111111111111111110 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i2111111111111111110 & 29360128) | (i2111111111111111110 & 234881024));
                                            z20 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit11111111115 = Unit.a;
                                        bVarI.X(z20);
                                        unit3 = Unit.a;
                                        r8 = z20;
                                    }
                                    if (unit3 == null) {
                                        bVarI.N(627332324);
                                        a(r8, bVarI);
                                        bVarI.X(r8);
                                    } else {
                                        bVarI.N(627303959);
                                        bVarI.X(r8);
                                    }
                                    bVarI.X(r8);
                                    r9 = r8;
                                    z22 = r9;
                                } else if (i != 888999888) {
                                    str8 = str8;
                                    z17 = false;
                                    z18 = false;
                                    bVarI.N(-2027315822);
                                    h0sVar = lobbyV2ViewModel.c0;
                                    if (h0sVar == null) {
                                        bVarI.N(-2027281010);
                                        bVarI.X(false);
                                        str8 = str8;
                                        unit = null;
                                    } else {
                                        bVarI.N(-2027281009);
                                        if (h0sVar.c() == 0) {
                                            bVarI.N(-439565701);
                                            s5t.c(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-439458317);
                                            int i2111111111111111111 = i17 << 15;
                                            int i2111111111111111112 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111111111111111111 & 458752) | (i2111111111111111111 & 3670016);
                                            int i311111112 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111111111111111112 | (i311111112 & 29360128) | (i311111112 & 234881024));
                                            z17 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit11111111116 = Unit.a;
                                        bVarI.X(z17);
                                        unit = Unit.a;
                                        z18 = z17;
                                    }
                                    if (unit == null) {
                                        bVarI.N(627365540);
                                        a(z18 ? 1 : 0, bVarI);
                                        bVarI.X(z18);
                                    } else {
                                        bVarI.N(627339376);
                                        bVarI.X(z18);
                                    }
                                    bVarI.X(z18);
                                    z22 = z18;
                                } else {
                                    str8 = str8;
                                    z17 = false;
                                    z18 = false;
                                    bVarI.N(-2027315822);
                                    h0sVar = lobbyV2ViewModel.c0;
                                    if (h0sVar == null) {
                                        bVarI.N(-2027281010);
                                        bVarI.X(false);
                                        str8 = str8;
                                        unit = null;
                                    } else {
                                        bVarI.N(-2027281009);
                                        if (h0sVar.c() == 0) {
                                            bVarI.N(-439565701);
                                            s5t.c(0, bVarI);
                                            bVarI.X(false);
                                        } else {
                                            bVarI.N(-439458317);
                                            int i2111111111111111113 = i17 << 15;
                                            int i2111111111111111114 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111111111111111113 & 458752) | (i2111111111111111113 & 3670016);
                                            int i311111113 = i13 << 12;
                                            b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111111111111111114 | (i311111113 & 29360128) | (i311111113 & 234881024));
                                            z17 = false;
                                            bVarI.X(false);
                                        }
                                        Unit unit11111111117 = Unit.a;
                                        bVarI.X(z17);
                                        unit = Unit.a;
                                        z18 = z17;
                                    }
                                    if (unit == null) {
                                        bVarI.N(627365540);
                                        a(z18 ? 1 : 0, bVarI);
                                        bVarI.X(z18);
                                    } else {
                                        bVarI.N(627339376);
                                        bVarI.X(z18);
                                    }
                                    bVarI.X(z18);
                                    z22 = z18;
                                }
                            } else if (Intrinsics.g(str7, "game_providers")) {
                                bVarI.N(-2028413749);
                                h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                if (h0sVar2 == null) {
                                    bVarI.N(-2028345302);
                                    r8 = 0;
                                    bVarI.X(false);
                                    unit3 = null;
                                } else {
                                    z20 = false;
                                    bVarI.N(-2028345301);
                                    if (h0sVar2.c() == 0) {
                                        bVarI.N(-698186048);
                                        s5t.d(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-698081268);
                                        int i2111111111111111115 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i2111111111111111115 & 29360128) | (i2111111111111111115 & 234881024));
                                        z20 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit11111111118 = Unit.a;
                                    bVarI.X(z20);
                                    unit3 = Unit.a;
                                    r8 = z20;
                                }
                                if (unit3 == null) {
                                    bVarI.N(627332324);
                                    a(r8, bVarI);
                                    bVarI.X(r8);
                                } else {
                                    bVarI.N(627303959);
                                    bVarI.X(r8);
                                }
                                bVarI.X(r8);
                                r9 = r8;
                                z22 = r9;
                            } else if (i != 888999888) {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i2111111111111111116 = i17 << 15;
                                        int i2111111111111111117 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111111111111111116 & 458752) | (i2111111111111111116 & 3670016);
                                        int i311111114 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111111111111111117 | (i311111114 & 29360128) | (i311111114 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit11111111119 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            } else {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i2111111111111111118 = i17 << 15;
                                        int i2111111111111111119 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111111111111111118 & 458752) | (i2111111111111111118 & 3670016);
                                        int i311111115 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111111111111111119 | (i311111115 & 29360128) | (i311111115 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit111111111110 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            }
                        } else if (!z8) {
                            if (Intrinsics.g(str7, "game_providers")) {
                                bVarI.N(-2028413749);
                                h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                if (h0sVar2 == null) {
                                    bVarI.N(-2028345302);
                                    r8 = 0;
                                    bVarI.X(false);
                                    unit3 = null;
                                } else {
                                    z20 = false;
                                    bVarI.N(-2028345301);
                                    if (h0sVar2.c() == 0) {
                                        bVarI.N(-698186048);
                                        s5t.d(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-698081268);
                                        int i21111111111111111110 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i21111111111111111110 & 29360128) | (i21111111111111111110 & 234881024));
                                        z20 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit111111111111 = Unit.a;
                                    bVarI.X(z20);
                                    unit3 = Unit.a;
                                    r8 = z20;
                                }
                                if (unit3 == null) {
                                    bVarI.N(627332324);
                                    a(r8, bVarI);
                                    bVarI.X(r8);
                                } else {
                                    bVarI.N(627303959);
                                    bVarI.X(r8);
                                }
                                bVarI.X(r8);
                                r9 = r8;
                                z22 = r9;
                            } else if (i != 888999888) {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i21111111111111111111 = i17 << 15;
                                        int i21111111111111111112 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111111111111111111 & 458752) | (i21111111111111111111 & 3670016);
                                        int i311111116 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111111111111111112 | (i311111116 & 29360128) | (i311111116 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit111111111112 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            } else {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i21111111111111111113 = i17 << 15;
                                        int i21111111111111111114 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111111111111111113 & 458752) | (i21111111111111111113 & 3670016);
                                        int i311111117 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111111111111111114 | (i311111117 & 29360128) | (i311111117 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit111111111113 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            }
                        } else if (Intrinsics.g(str7, "game_providers")) {
                            bVarI.N(-2028413749);
                            h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                            if (h0sVar2 == null) {
                                bVarI.N(-2028345302);
                                r8 = 0;
                                bVarI.X(false);
                                unit3 = null;
                            } else {
                                z20 = false;
                                bVarI.N(-2028345301);
                                if (h0sVar2.c() == 0) {
                                    bVarI.N(-698186048);
                                    s5t.d(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-698081268);
                                    int i21111111111111111115 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i21111111111111111115 & 29360128) | (i21111111111111111115 & 234881024));
                                    z20 = false;
                                    bVarI.X(false);
                                }
                                Unit unit111111111114 = Unit.a;
                                bVarI.X(z20);
                                unit3 = Unit.a;
                                r8 = z20;
                            }
                            if (unit3 == null) {
                                bVarI.N(627332324);
                                a(r8, bVarI);
                                bVarI.X(r8);
                            } else {
                                bVarI.N(627303959);
                                bVarI.X(r8);
                            }
                            bVarI.X(r8);
                            r9 = r8;
                            z22 = r9;
                        } else if (i != 888999888) {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i21111111111111111116 = i17 << 15;
                                    int i21111111111111111117 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111111111111111116 & 458752) | (i21111111111111111116 & 3670016);
                                    int i311111118 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111111111111111117 | (i311111118 & 29360128) | (i311111118 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit111111111115 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        } else {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i21111111111111111118 = i17 << 15;
                                    int i21111111111111111119 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111111111111111118 & 458752) | (i21111111111111111118 & 3670016);
                                    int i311111119 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111111111111111119 | (i311111119 & 29360128) | (i311111119 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit111111111116 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        }
                    } else if (z8) {
                        if (!z8) {
                            if (Intrinsics.g(str7, "game_providers")) {
                                bVarI.N(-2028413749);
                                h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                if (h0sVar2 == null) {
                                    bVarI.N(-2028345302);
                                    r8 = 0;
                                    bVarI.X(false);
                                    unit3 = null;
                                } else {
                                    z20 = false;
                                    bVarI.N(-2028345301);
                                    if (h0sVar2.c() == 0) {
                                        bVarI.N(-698186048);
                                        s5t.d(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-698081268);
                                        int i211111111111111111110 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i211111111111111111110 & 29360128) | (i211111111111111111110 & 234881024));
                                        z20 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit111111111117 = Unit.a;
                                    bVarI.X(z20);
                                    unit3 = Unit.a;
                                    r8 = z20;
                                }
                                if (unit3 == null) {
                                    bVarI.N(627332324);
                                    a(r8, bVarI);
                                    bVarI.X(r8);
                                } else {
                                    bVarI.N(627303959);
                                    bVarI.X(r8);
                                }
                                bVarI.X(r8);
                                r9 = r8;
                                z22 = r9;
                            } else if (i != 888999888) {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i211111111111111111111 = i17 << 15;
                                        int i211111111111111111112 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211111111111111111111 & 458752) | (i211111111111111111111 & 3670016);
                                        int i3111111110 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211111111111111111112 | (i3111111110 & 29360128) | (i3111111110 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit111111111118 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            } else {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i211111111111111111113 = i17 << 15;
                                        int i211111111111111111114 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211111111111111111113 & 458752) | (i211111111111111111113 & 3670016);
                                        int i3111111111 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211111111111111111114 | (i3111111111 & 29360128) | (i3111111111 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit111111111119 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            }
                        } else if (Intrinsics.g(str7, "game_providers")) {
                            bVarI.N(-2028413749);
                            h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                            if (h0sVar2 == null) {
                                bVarI.N(-2028345302);
                                r8 = 0;
                                bVarI.X(false);
                                unit3 = null;
                            } else {
                                z20 = false;
                                bVarI.N(-2028345301);
                                if (h0sVar2.c() == 0) {
                                    bVarI.N(-698186048);
                                    s5t.d(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-698081268);
                                    int i211111111111111111115 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i211111111111111111115 & 29360128) | (i211111111111111111115 & 234881024));
                                    z20 = false;
                                    bVarI.X(false);
                                }
                                Unit unit1111111111110 = Unit.a;
                                bVarI.X(z20);
                                unit3 = Unit.a;
                                r8 = z20;
                            }
                            if (unit3 == null) {
                                bVarI.N(627332324);
                                a(r8, bVarI);
                                bVarI.X(r8);
                            } else {
                                bVarI.N(627303959);
                                bVarI.X(r8);
                            }
                            bVarI.X(r8);
                            r9 = r8;
                            z22 = r9;
                        } else if (i != 888999888) {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i211111111111111111116 = i17 << 15;
                                    int i211111111111111111117 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211111111111111111116 & 458752) | (i211111111111111111116 & 3670016);
                                    int i3111111112 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211111111111111111117 | (i3111111112 & 29360128) | (i3111111112 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit1111111111111 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        } else {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i211111111111111111118 = i17 << 15;
                                    int i211111111111111111119 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211111111111111111118 & 458752) | (i211111111111111111118 & 3670016);
                                    int i3111111113 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211111111111111111119 | (i3111111113 & 29360128) | (i3111111113 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit1111111111112 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        }
                    } else if (!z8) {
                        if (Intrinsics.g(str7, "game_providers")) {
                            bVarI.N(-2028413749);
                            h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                            if (h0sVar2 == null) {
                                bVarI.N(-2028345302);
                                r8 = 0;
                                bVarI.X(false);
                                unit3 = null;
                            } else {
                                z20 = false;
                                bVarI.N(-2028345301);
                                if (h0sVar2.c() == 0) {
                                    bVarI.N(-698186048);
                                    s5t.d(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-698081268);
                                    int i2111111111111111111110 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i2111111111111111111110 & 29360128) | (i2111111111111111111110 & 234881024));
                                    z20 = false;
                                    bVarI.X(false);
                                }
                                Unit unit1111111111113 = Unit.a;
                                bVarI.X(z20);
                                unit3 = Unit.a;
                                r8 = z20;
                            }
                            if (unit3 == null) {
                                bVarI.N(627332324);
                                a(r8, bVarI);
                                bVarI.X(r8);
                            } else {
                                bVarI.N(627303959);
                                bVarI.X(r8);
                            }
                            bVarI.X(r8);
                            r9 = r8;
                            z22 = r9;
                        } else if (i != 888999888) {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i2111111111111111111111 = i17 << 15;
                                    int i2111111111111111111112 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111111111111111111111 & 458752) | (i2111111111111111111111 & 3670016);
                                    int i3111111114 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111111111111111111112 | (i3111111114 & 29360128) | (i3111111114 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit1111111111114 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        } else {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i2111111111111111111113 = i17 << 15;
                                    int i2111111111111111111114 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111111111111111111113 & 458752) | (i2111111111111111111113 & 3670016);
                                    int i3111111115 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111111111111111111114 | (i3111111115 & 29360128) | (i3111111115 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit1111111111115 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        }
                    } else if (Intrinsics.g(str7, "game_providers")) {
                        bVarI.N(-2028413749);
                        h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                        if (h0sVar2 == null) {
                            bVarI.N(-2028345302);
                            r8 = 0;
                            bVarI.X(false);
                            unit3 = null;
                        } else {
                            z20 = false;
                            bVarI.N(-2028345301);
                            if (h0sVar2.c() == 0) {
                                bVarI.N(-698186048);
                                s5t.d(0, bVarI);
                                bVarI.X(false);
                            } else {
                                bVarI.N(-698081268);
                                int i2111111111111111111115 = i13 << 12;
                                b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i2111111111111111111115 & 29360128) | (i2111111111111111111115 & 234881024));
                                z20 = false;
                                bVarI.X(false);
                            }
                            Unit unit1111111111116 = Unit.a;
                            bVarI.X(z20);
                            unit3 = Unit.a;
                            r8 = z20;
                        }
                        if (unit3 == null) {
                            bVarI.N(627332324);
                            a(r8, bVarI);
                            bVarI.X(r8);
                        } else {
                            bVarI.N(627303959);
                            bVarI.X(r8);
                        }
                        bVarI.X(r8);
                        r9 = r8;
                        z22 = r9;
                    } else if (i != 888999888) {
                        str8 = str8;
                        z17 = false;
                        z18 = false;
                        bVarI.N(-2027315822);
                        h0sVar = lobbyV2ViewModel.c0;
                        if (h0sVar == null) {
                            bVarI.N(-2027281010);
                            bVarI.X(false);
                            str8 = str8;
                            unit = null;
                        } else {
                            bVarI.N(-2027281009);
                            if (h0sVar.c() == 0) {
                                bVarI.N(-439565701);
                                s5t.c(0, bVarI);
                                bVarI.X(false);
                            } else {
                                bVarI.N(-439458317);
                                int i2111111111111111111116 = i17 << 15;
                                int i2111111111111111111117 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111111111111111111116 & 458752) | (i2111111111111111111116 & 3670016);
                                int i3111111116 = i13 << 12;
                                b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111111111111111111117 | (i3111111116 & 29360128) | (i3111111116 & 234881024));
                                z17 = false;
                                bVarI.X(false);
                            }
                            Unit unit1111111111117 = Unit.a;
                            bVarI.X(z17);
                            unit = Unit.a;
                            z18 = z17;
                        }
                        if (unit == null) {
                            bVarI.N(627365540);
                            a(z18 ? 1 : 0, bVarI);
                            bVarI.X(z18);
                        } else {
                            bVarI.N(627339376);
                            bVarI.X(z18);
                        }
                        bVarI.X(z18);
                        z22 = z18;
                    } else {
                        str8 = str8;
                        z17 = false;
                        z18 = false;
                        bVarI.N(-2027315822);
                        h0sVar = lobbyV2ViewModel.c0;
                        if (h0sVar == null) {
                            bVarI.N(-2027281010);
                            bVarI.X(false);
                            str8 = str8;
                            unit = null;
                        } else {
                            bVarI.N(-2027281009);
                            if (h0sVar.c() == 0) {
                                bVarI.N(-439565701);
                                s5t.c(0, bVarI);
                                bVarI.X(false);
                            } else {
                                bVarI.N(-439458317);
                                int i2111111111111111111118 = i17 << 15;
                                int i2111111111111111111119 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111111111111111111118 & 458752) | (i2111111111111111111118 & 3670016);
                                int i3111111117 = i13 << 12;
                                b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111111111111111111119 | (i3111111117 & 29360128) | (i3111111117 & 234881024));
                                z17 = false;
                                bVarI.X(false);
                            }
                            Unit unit1111111111118 = Unit.a;
                            bVarI.X(z17);
                            unit = Unit.a;
                            z18 = z17;
                        }
                        if (unit == null) {
                            bVarI.N(627365540);
                            a(z18 ? 1 : 0, bVarI);
                            bVarI.X(z18);
                        } else {
                            bVarI.N(627339376);
                            bVarI.X(z18);
                        }
                        bVarI.X(z18);
                        z22 = z18;
                    }
                } else if (!z8) {
                    if (z8) {
                        if (!z8) {
                            if (Intrinsics.g(str7, "game_providers")) {
                                bVarI.N(-2028413749);
                                h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                                if (h0sVar2 == null) {
                                    bVarI.N(-2028345302);
                                    r8 = 0;
                                    bVarI.X(false);
                                    unit3 = null;
                                } else {
                                    z20 = false;
                                    bVarI.N(-2028345301);
                                    if (h0sVar2.c() == 0) {
                                        bVarI.N(-698186048);
                                        s5t.d(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-698081268);
                                        int i21111111111111111111110 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i21111111111111111111110 & 29360128) | (i21111111111111111111110 & 234881024));
                                        z20 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit1111111111119 = Unit.a;
                                    bVarI.X(z20);
                                    unit3 = Unit.a;
                                    r8 = z20;
                                }
                                if (unit3 == null) {
                                    bVarI.N(627332324);
                                    a(r8, bVarI);
                                    bVarI.X(r8);
                                } else {
                                    bVarI.N(627303959);
                                    bVarI.X(r8);
                                }
                                bVarI.X(r8);
                                r9 = r8;
                                z22 = r9;
                            } else if (i != 888999888) {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i21111111111111111111111 = i17 << 15;
                                        int i21111111111111111111112 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111111111111111111111 & 458752) | (i21111111111111111111111 & 3670016);
                                        int i3111111118 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111111111111111111112 | (i3111111118 & 29360128) | (i3111111118 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit11111111111110 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            } else {
                                str8 = str8;
                                z17 = false;
                                z18 = false;
                                bVarI.N(-2027315822);
                                h0sVar = lobbyV2ViewModel.c0;
                                if (h0sVar == null) {
                                    bVarI.N(-2027281010);
                                    bVarI.X(false);
                                    str8 = str8;
                                    unit = null;
                                } else {
                                    bVarI.N(-2027281009);
                                    if (h0sVar.c() == 0) {
                                        bVarI.N(-439565701);
                                        s5t.c(0, bVarI);
                                        bVarI.X(false);
                                    } else {
                                        bVarI.N(-439458317);
                                        int i21111111111111111111113 = i17 << 15;
                                        int i21111111111111111111114 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111111111111111111113 & 458752) | (i21111111111111111111113 & 3670016);
                                        int i3111111119 = i13 << 12;
                                        b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111111111111111111114 | (i3111111119 & 29360128) | (i3111111119 & 234881024));
                                        z17 = false;
                                        bVarI.X(false);
                                    }
                                    Unit unit11111111111111 = Unit.a;
                                    bVarI.X(z17);
                                    unit = Unit.a;
                                    z18 = z17;
                                }
                                if (unit == null) {
                                    bVarI.N(627365540);
                                    a(z18 ? 1 : 0, bVarI);
                                    bVarI.X(z18);
                                } else {
                                    bVarI.N(627339376);
                                    bVarI.X(z18);
                                }
                                bVarI.X(z18);
                                z22 = z18;
                            }
                        } else if (Intrinsics.g(str7, "game_providers")) {
                            bVarI.N(-2028413749);
                            h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                            if (h0sVar2 == null) {
                                bVarI.N(-2028345302);
                                r8 = 0;
                                bVarI.X(false);
                                unit3 = null;
                            } else {
                                z20 = false;
                                bVarI.N(-2028345301);
                                if (h0sVar2.c() == 0) {
                                    bVarI.N(-698186048);
                                    s5t.d(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-698081268);
                                    int i21111111111111111111115 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i21111111111111111111115 & 29360128) | (i21111111111111111111115 & 234881024));
                                    z20 = false;
                                    bVarI.X(false);
                                }
                                Unit unit11111111111112 = Unit.a;
                                bVarI.X(z20);
                                unit3 = Unit.a;
                                r8 = z20;
                            }
                            if (unit3 == null) {
                                bVarI.N(627332324);
                                a(r8, bVarI);
                                bVarI.X(r8);
                            } else {
                                bVarI.N(627303959);
                                bVarI.X(r8);
                            }
                            bVarI.X(r8);
                            r9 = r8;
                            z22 = r9;
                        } else if (i != 888999888) {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i21111111111111111111116 = i17 << 15;
                                    int i21111111111111111111117 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111111111111111111116 & 458752) | (i21111111111111111111116 & 3670016);
                                    int i31111111110 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111111111111111111117 | (i31111111110 & 29360128) | (i31111111110 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit11111111111113 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        } else {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i21111111111111111111118 = i17 << 15;
                                    int i21111111111111111111119 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111111111111111111118 & 458752) | (i21111111111111111111118 & 3670016);
                                    int i31111111111 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111111111111111111119 | (i31111111111 & 29360128) | (i31111111111 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit11111111111114 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        }
                    } else if (!z8) {
                        if (Intrinsics.g(str7, "game_providers")) {
                            bVarI.N(-2028413749);
                            h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                            if (h0sVar2 == null) {
                                bVarI.N(-2028345302);
                                r8 = 0;
                                bVarI.X(false);
                                unit3 = null;
                            } else {
                                z20 = false;
                                bVarI.N(-2028345301);
                                if (h0sVar2.c() == 0) {
                                    bVarI.N(-698186048);
                                    s5t.d(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-698081268);
                                    int i211111111111111111111110 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i211111111111111111111110 & 29360128) | (i211111111111111111111110 & 234881024));
                                    z20 = false;
                                    bVarI.X(false);
                                }
                                Unit unit11111111111115 = Unit.a;
                                bVarI.X(z20);
                                unit3 = Unit.a;
                                r8 = z20;
                            }
                            if (unit3 == null) {
                                bVarI.N(627332324);
                                a(r8, bVarI);
                                bVarI.X(r8);
                            } else {
                                bVarI.N(627303959);
                                bVarI.X(r8);
                            }
                            bVarI.X(r8);
                            r9 = r8;
                            z22 = r9;
                        } else if (i != 888999888) {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i211111111111111111111111 = i17 << 15;
                                    int i211111111111111111111112 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211111111111111111111111 & 458752) | (i211111111111111111111111 & 3670016);
                                    int i31111111112 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211111111111111111111112 | (i31111111112 & 29360128) | (i31111111112 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit11111111111116 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        } else {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i211111111111111111111113 = i17 << 15;
                                    int i211111111111111111111114 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211111111111111111111113 & 458752) | (i211111111111111111111113 & 3670016);
                                    int i31111111113 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211111111111111111111114 | (i31111111113 & 29360128) | (i31111111113 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit11111111111117 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        }
                    } else if (Intrinsics.g(str7, "game_providers")) {
                        bVarI.N(-2028413749);
                        h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                        if (h0sVar2 == null) {
                            bVarI.N(-2028345302);
                            r8 = 0;
                            bVarI.X(false);
                            unit3 = null;
                        } else {
                            z20 = false;
                            bVarI.N(-2028345301);
                            if (h0sVar2.c() == 0) {
                                bVarI.N(-698186048);
                                s5t.d(0, bVarI);
                                bVarI.X(false);
                            } else {
                                bVarI.N(-698081268);
                                int i211111111111111111111115 = i13 << 12;
                                b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i211111111111111111111115 & 29360128) | (i211111111111111111111115 & 234881024));
                                z20 = false;
                                bVarI.X(false);
                            }
                            Unit unit11111111111118 = Unit.a;
                            bVarI.X(z20);
                            unit3 = Unit.a;
                            r8 = z20;
                        }
                        if (unit3 == null) {
                            bVarI.N(627332324);
                            a(r8, bVarI);
                            bVarI.X(r8);
                        } else {
                            bVarI.N(627303959);
                            bVarI.X(r8);
                        }
                        bVarI.X(r8);
                        r9 = r8;
                        z22 = r9;
                    } else if (i != 888999888) {
                        str8 = str8;
                        z17 = false;
                        z18 = false;
                        bVarI.N(-2027315822);
                        h0sVar = lobbyV2ViewModel.c0;
                        if (h0sVar == null) {
                            bVarI.N(-2027281010);
                            bVarI.X(false);
                            str8 = str8;
                            unit = null;
                        } else {
                            bVarI.N(-2027281009);
                            if (h0sVar.c() == 0) {
                                bVarI.N(-439565701);
                                s5t.c(0, bVarI);
                                bVarI.X(false);
                            } else {
                                bVarI.N(-439458317);
                                int i211111111111111111111116 = i17 << 15;
                                int i211111111111111111111117 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211111111111111111111116 & 458752) | (i211111111111111111111116 & 3670016);
                                int i31111111114 = i13 << 12;
                                b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211111111111111111111117 | (i31111111114 & 29360128) | (i31111111114 & 234881024));
                                z17 = false;
                                bVarI.X(false);
                            }
                            Unit unit11111111111119 = Unit.a;
                            bVarI.X(z17);
                            unit = Unit.a;
                            z18 = z17;
                        }
                        if (unit == null) {
                            bVarI.N(627365540);
                            a(z18 ? 1 : 0, bVarI);
                            bVarI.X(z18);
                        } else {
                            bVarI.N(627339376);
                            bVarI.X(z18);
                        }
                        bVarI.X(z18);
                        z22 = z18;
                    } else {
                        str8 = str8;
                        z17 = false;
                        z18 = false;
                        bVarI.N(-2027315822);
                        h0sVar = lobbyV2ViewModel.c0;
                        if (h0sVar == null) {
                            bVarI.N(-2027281010);
                            bVarI.X(false);
                            str8 = str8;
                            unit = null;
                        } else {
                            bVarI.N(-2027281009);
                            if (h0sVar.c() == 0) {
                                bVarI.N(-439565701);
                                s5t.c(0, bVarI);
                                bVarI.X(false);
                            } else {
                                bVarI.N(-439458317);
                                int i211111111111111111111118 = i17 << 15;
                                int i211111111111111111111119 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i211111111111111111111118 & 458752) | (i211111111111111111111118 & 3670016);
                                int i31111111115 = i13 << 12;
                                b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i211111111111111111111119 | (i31111111115 & 29360128) | (i31111111115 & 234881024));
                                z17 = false;
                                bVarI.X(false);
                            }
                            Unit unit111111111111110 = Unit.a;
                            bVarI.X(z17);
                            unit = Unit.a;
                            z18 = z17;
                        }
                        if (unit == null) {
                            bVarI.N(627365540);
                            a(z18 ? 1 : 0, bVarI);
                            bVarI.X(z18);
                        } else {
                            bVarI.N(627339376);
                            bVarI.X(z18);
                        }
                        bVarI.X(z18);
                        z22 = z18;
                    }
                } else if (z8) {
                    if (!z8) {
                        if (Intrinsics.g(str7, "game_providers")) {
                            bVarI.N(-2028413749);
                            h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                            if (h0sVar2 == null) {
                                bVarI.N(-2028345302);
                                r8 = 0;
                                bVarI.X(false);
                                unit3 = null;
                            } else {
                                z20 = false;
                                bVarI.N(-2028345301);
                                if (h0sVar2.c() == 0) {
                                    bVarI.N(-698186048);
                                    s5t.d(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-698081268);
                                    int i2111111111111111111111110 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i2111111111111111111111110 & 29360128) | (i2111111111111111111111110 & 234881024));
                                    z20 = false;
                                    bVarI.X(false);
                                }
                                Unit unit111111111111111 = Unit.a;
                                bVarI.X(z20);
                                unit3 = Unit.a;
                                r8 = z20;
                            }
                            if (unit3 == null) {
                                bVarI.N(627332324);
                                a(r8, bVarI);
                                bVarI.X(r8);
                            } else {
                                bVarI.N(627303959);
                                bVarI.X(r8);
                            }
                            bVarI.X(r8);
                            r9 = r8;
                            z22 = r9;
                        } else if (i != 888999888) {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i2111111111111111111111111 = i17 << 15;
                                    int i2111111111111111111111112 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111111111111111111111111 & 458752) | (i2111111111111111111111111 & 3670016);
                                    int i31111111116 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111111111111111111111112 | (i31111111116 & 29360128) | (i31111111116 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit111111111111112 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        } else {
                            str8 = str8;
                            z17 = false;
                            z18 = false;
                            bVarI.N(-2027315822);
                            h0sVar = lobbyV2ViewModel.c0;
                            if (h0sVar == null) {
                                bVarI.N(-2027281010);
                                bVarI.X(false);
                                str8 = str8;
                                unit = null;
                            } else {
                                bVarI.N(-2027281009);
                                if (h0sVar.c() == 0) {
                                    bVarI.N(-439565701);
                                    s5t.c(0, bVarI);
                                    bVarI.X(false);
                                } else {
                                    bVarI.N(-439458317);
                                    int i2111111111111111111111113 = i17 << 15;
                                    int i2111111111111111111111114 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111111111111111111111113 & 458752) | (i2111111111111111111111113 & 3670016);
                                    int i31111111117 = i13 << 12;
                                    b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111111111111111111111114 | (i31111111117 & 29360128) | (i31111111117 & 234881024));
                                    z17 = false;
                                    bVarI.X(false);
                                }
                                Unit unit111111111111113 = Unit.a;
                                bVarI.X(z17);
                                unit = Unit.a;
                                z18 = z17;
                            }
                            if (unit == null) {
                                bVarI.N(627365540);
                                a(z18 ? 1 : 0, bVarI);
                                bVarI.X(z18);
                            } else {
                                bVarI.N(627339376);
                                bVarI.X(z18);
                            }
                            bVarI.X(z18);
                            z22 = z18;
                        }
                    } else if (Intrinsics.g(str7, "game_providers")) {
                        bVarI.N(-2028413749);
                        h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                        if (h0sVar2 == null) {
                            bVarI.N(-2028345302);
                            r8 = 0;
                            bVarI.X(false);
                            unit3 = null;
                        } else {
                            z20 = false;
                            bVarI.N(-2028345301);
                            if (h0sVar2.c() == 0) {
                                bVarI.N(-698186048);
                                s5t.d(0, bVarI);
                                bVarI.X(false);
                            } else {
                                bVarI.N(-698081268);
                                int i2111111111111111111111115 = i13 << 12;
                                b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i2111111111111111111111115 & 29360128) | (i2111111111111111111111115 & 234881024));
                                z20 = false;
                                bVarI.X(false);
                            }
                            Unit unit111111111111114 = Unit.a;
                            bVarI.X(z20);
                            unit3 = Unit.a;
                            r8 = z20;
                        }
                        if (unit3 == null) {
                            bVarI.N(627332324);
                            a(r8, bVarI);
                            bVarI.X(r8);
                        } else {
                            bVarI.N(627303959);
                            bVarI.X(r8);
                        }
                        bVarI.X(r8);
                        r9 = r8;
                        z22 = r9;
                    } else if (i != 888999888) {
                        str8 = str8;
                        z17 = false;
                        z18 = false;
                        bVarI.N(-2027315822);
                        h0sVar = lobbyV2ViewModel.c0;
                        if (h0sVar == null) {
                            bVarI.N(-2027281010);
                            bVarI.X(false);
                            str8 = str8;
                            unit = null;
                        } else {
                            bVarI.N(-2027281009);
                            if (h0sVar.c() == 0) {
                                bVarI.N(-439565701);
                                s5t.c(0, bVarI);
                                bVarI.X(false);
                            } else {
                                bVarI.N(-439458317);
                                int i2111111111111111111111116 = i17 << 15;
                                int i2111111111111111111111117 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111111111111111111111116 & 458752) | (i2111111111111111111111116 & 3670016);
                                int i31111111118 = i13 << 12;
                                b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111111111111111111111117 | (i31111111118 & 29360128) | (i31111111118 & 234881024));
                                z17 = false;
                                bVarI.X(false);
                            }
                            Unit unit111111111111115 = Unit.a;
                            bVarI.X(z17);
                            unit = Unit.a;
                            z18 = z17;
                        }
                        if (unit == null) {
                            bVarI.N(627365540);
                            a(z18 ? 1 : 0, bVarI);
                            bVarI.X(z18);
                        } else {
                            bVarI.N(627339376);
                            bVarI.X(z18);
                        }
                        bVarI.X(z18);
                        z22 = z18;
                    } else {
                        str8 = str8;
                        z17 = false;
                        z18 = false;
                        bVarI.N(-2027315822);
                        h0sVar = lobbyV2ViewModel.c0;
                        if (h0sVar == null) {
                            bVarI.N(-2027281010);
                            bVarI.X(false);
                            str8 = str8;
                            unit = null;
                        } else {
                            bVarI.N(-2027281009);
                            if (h0sVar.c() == 0) {
                                bVarI.N(-439565701);
                                s5t.c(0, bVarI);
                                bVarI.X(false);
                            } else {
                                bVarI.N(-439458317);
                                int i2111111111111111111111118 = i17 << 15;
                                int i2111111111111111111111119 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i2111111111111111111111118 & 458752) | (i2111111111111111111111118 & 3670016);
                                int i31111111119 = i13 << 12;
                                b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i2111111111111111111111119 | (i31111111119 & 29360128) | (i31111111119 & 234881024));
                                z17 = false;
                                bVarI.X(false);
                            }
                            Unit unit111111111111116 = Unit.a;
                            bVarI.X(z17);
                            unit = Unit.a;
                            z18 = z17;
                        }
                        if (unit == null) {
                            bVarI.N(627365540);
                            a(z18 ? 1 : 0, bVarI);
                            bVarI.X(z18);
                        } else {
                            bVarI.N(627339376);
                            bVarI.X(z18);
                        }
                        bVarI.X(z18);
                        z22 = z18;
                    }
                } else if (!z8) {
                    if (Intrinsics.g(str7, "game_providers")) {
                        bVarI.N(-2028413749);
                        h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                        if (h0sVar2 == null) {
                            bVarI.N(-2028345302);
                            r8 = 0;
                            bVarI.X(false);
                            unit3 = null;
                        } else {
                            z20 = false;
                            bVarI.N(-2028345301);
                            if (h0sVar2.c() == 0) {
                                bVarI.N(-698186048);
                                s5t.d(0, bVarI);
                                bVarI.X(false);
                            } else {
                                bVarI.N(-698081268);
                                int i21111111111111111111111110 = i13 << 12;
                                b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i21111111111111111111111110 & 29360128) | (i21111111111111111111111110 & 234881024));
                                z20 = false;
                                bVarI.X(false);
                            }
                            Unit unit111111111111117 = Unit.a;
                            bVarI.X(z20);
                            unit3 = Unit.a;
                            r8 = z20;
                        }
                        if (unit3 == null) {
                            bVarI.N(627332324);
                            a(r8, bVarI);
                            bVarI.X(r8);
                        } else {
                            bVarI.N(627303959);
                            bVarI.X(r8);
                        }
                        bVarI.X(r8);
                        r9 = r8;
                        z22 = r9;
                    } else if (i != 888999888) {
                        str8 = str8;
                        z17 = false;
                        z18 = false;
                        bVarI.N(-2027315822);
                        h0sVar = lobbyV2ViewModel.c0;
                        if (h0sVar == null) {
                            bVarI.N(-2027281010);
                            bVarI.X(false);
                            str8 = str8;
                            unit = null;
                        } else {
                            bVarI.N(-2027281009);
                            if (h0sVar.c() == 0) {
                                bVarI.N(-439565701);
                                s5t.c(0, bVarI);
                                bVarI.X(false);
                            } else {
                                bVarI.N(-439458317);
                                int i21111111111111111111111111 = i17 << 15;
                                int i21111111111111111111111112 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111111111111111111111111 & 458752) | (i21111111111111111111111111 & 3670016);
                                int i311111111110 = i13 << 12;
                                b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111111111111111111111112 | (i311111111110 & 29360128) | (i311111111110 & 234881024));
                                z17 = false;
                                bVarI.X(false);
                            }
                            Unit unit111111111111118 = Unit.a;
                            bVarI.X(z17);
                            unit = Unit.a;
                            z18 = z17;
                        }
                        if (unit == null) {
                            bVarI.N(627365540);
                            a(z18 ? 1 : 0, bVarI);
                            bVarI.X(z18);
                        } else {
                            bVarI.N(627339376);
                            bVarI.X(z18);
                        }
                        bVarI.X(z18);
                        z22 = z18;
                    } else {
                        str8 = str8;
                        z17 = false;
                        z18 = false;
                        bVarI.N(-2027315822);
                        h0sVar = lobbyV2ViewModel.c0;
                        if (h0sVar == null) {
                            bVarI.N(-2027281010);
                            bVarI.X(false);
                            str8 = str8;
                            unit = null;
                        } else {
                            bVarI.N(-2027281009);
                            if (h0sVar.c() == 0) {
                                bVarI.N(-439565701);
                                s5t.c(0, bVarI);
                                bVarI.X(false);
                            } else {
                                bVarI.N(-439458317);
                                int i21111111111111111111111113 = i17 << 15;
                                int i21111111111111111111111114 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111111111111111111111113 & 458752) | (i21111111111111111111111113 & 3670016);
                                int i311111111111 = i13 << 12;
                                b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111111111111111111111114 | (i311111111111 & 29360128) | (i311111111111 & 234881024));
                                z17 = false;
                                bVarI.X(false);
                            }
                            Unit unit111111111111119 = Unit.a;
                            bVarI.X(z17);
                            unit = Unit.a;
                            z18 = z17;
                        }
                        if (unit == null) {
                            bVarI.N(627365540);
                            a(z18 ? 1 : 0, bVarI);
                            bVarI.X(z18);
                        } else {
                            bVarI.N(627339376);
                            bVarI.X(z18);
                        }
                        bVarI.X(z18);
                        z22 = z18;
                    }
                } else if (Intrinsics.g(str7, "game_providers")) {
                    bVarI.N(-2028413749);
                    h0sVar2 = (h0s) linkedHashMap2.get(Integer.valueOf(i));
                    if (h0sVar2 == null) {
                        bVarI.N(-2028345302);
                        r8 = 0;
                        bVarI.X(false);
                        unit3 = null;
                    } else {
                        z20 = false;
                        bVarI.N(-2028345301);
                        if (h0sVar2.c() == 0) {
                            bVarI.N(-698186048);
                            s5t.d(0, bVarI);
                            bVarI.X(false);
                        } else {
                            bVarI.N(-698081268);
                            int i21111111111111111111111115 = i13 << 12;
                            b(lobbyV2ViewModel, h0sVar2, gajVar, fbhVar, zvrVarA, gnjVar, "provider_list", str7, str8, bVarI, ((i13 >> 3) & 14) | 1572928 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | ((i17 << 15) & 458752) | (i21111111111111111111111115 & 29360128) | (i21111111111111111111111115 & 234881024));
                            z20 = false;
                            bVarI.X(false);
                        }
                        Unit unit1111111111111110 = Unit.a;
                        bVarI.X(z20);
                        unit3 = Unit.a;
                        r8 = z20;
                    }
                    if (unit3 == null) {
                        bVarI.N(627332324);
                        a(r8, bVarI);
                        bVarI.X(r8);
                    } else {
                        bVarI.N(627303959);
                        bVarI.X(r8);
                    }
                    bVarI.X(r8);
                    r9 = r8;
                    z22 = r9;
                } else if (i != 888999888) {
                    str8 = str8;
                    z17 = false;
                    z18 = false;
                    bVarI.N(-2027315822);
                    h0sVar = lobbyV2ViewModel.c0;
                    if (h0sVar == null) {
                        bVarI.N(-2027281010);
                        bVarI.X(false);
                        str8 = str8;
                        unit = null;
                    } else {
                        bVarI.N(-2027281009);
                        if (h0sVar.c() == 0) {
                            bVarI.N(-439565701);
                            s5t.c(0, bVarI);
                            bVarI.X(false);
                        } else {
                            bVarI.N(-439458317);
                            int i21111111111111111111111116 = i17 << 15;
                            int i21111111111111111111111117 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111111111111111111111116 & 458752) | (i21111111111111111111111116 & 3670016);
                            int i311111111112 = i13 << 12;
                            b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111111111111111111111117 | (i311111111112 & 29360128) | (i311111111112 & 234881024));
                            z17 = false;
                            bVarI.X(false);
                        }
                        Unit unit1111111111111111 = Unit.a;
                        bVarI.X(z17);
                        unit = Unit.a;
                        z18 = z17;
                    }
                    if (unit == null) {
                        bVarI.N(627365540);
                        a(z18 ? 1 : 0, bVarI);
                        bVarI.X(z18);
                    } else {
                        bVarI.N(627339376);
                        bVarI.X(z18);
                    }
                    bVarI.X(z18);
                    z22 = z18;
                } else {
                    str8 = str8;
                    z17 = false;
                    z18 = false;
                    bVarI.N(-2027315822);
                    h0sVar = lobbyV2ViewModel.c0;
                    if (h0sVar == null) {
                        bVarI.N(-2027281010);
                        bVarI.X(false);
                        str8 = str8;
                        unit = null;
                    } else {
                        bVarI.N(-2027281009);
                        if (h0sVar.c() == 0) {
                            bVarI.N(-439565701);
                            s5t.c(0, bVarI);
                            bVarI.X(false);
                        } else {
                            bVarI.N(-439458317);
                            int i21111111111111111111111118 = i17 << 15;
                            int i21111111111111111111111119 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168) | (i21111111111111111111111118 & 458752) | (i21111111111111111111111118 & 3670016);
                            int i311111111113 = i13 << 12;
                            b(lobbyV2ViewModel, h0sVar, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str8, bVarI, i21111111111111111111111119 | (i311111111113 & 29360128) | (i311111111113 & 234881024));
                            z17 = false;
                            bVarI.X(false);
                        }
                        Unit unit1111111111111112 = Unit.a;
                        bVarI.X(z17);
                        unit = Unit.a;
                        z18 = z17;
                    }
                    if (unit == null) {
                        bVarI.N(627365540);
                        a(z18 ? 1 : 0, bVarI);
                        bVarI.X(z18);
                    } else {
                        bVarI.N(627339376);
                        bVarI.X(z18);
                    }
                    bVarI.X(z18);
                    z22 = z18;
                }
                bVarI.X(z22);
            } else {
                if (hxsVar instanceof hxs.a) {
                    bVarI.N(-2025470609);
                    if (h0sVarA.c() > 0) {
                        dVarE = j.g(aVar2, 1.0f);
                    } else {
                        dVarE = j.e(aVar2, 1.0f);
                    }
                    zA = bVarI.A(h0sVarA);
                    Object objY8 = bVarI.y();
                    if (zA) {
                        r7 = 0;
                        j4t j4tVar6 = new j4t(h0sVarA, false ? 1 : 0);
                        bVarI.r(j4tVar6);
                        obj2 = j4tVar6;
                    } else {
                        r7 = 0;
                        j4t j4tVar7 = new j4t(h0sVarA, false ? 1 : 0);
                        bVarI.r(j4tVar7);
                        obj2 = j4tVar7;
                    }
                    s5t.a(r7, bVarI, dVarE, (Function0) obj2);
                    bVarI.X(r7);
                } else {
                    if (hxsVar instanceof hxs.c) {
                        throw igf0.a(bVarI, 627206955, false);
                    }
                    bVarI.N(-2024946926);
                    if (i == 888999888) {
                        lobbyV2ViewModel.c0 = h0sVarA;
                    } else {
                        if (str7 != null) {
                            z16 = true;
                            if (str7.equals("my_favourites")) {
                                lobbyV2ViewModel.c0 = h0sVarA;
                            }
                        } else {
                            z16 = true;
                        }
                        if (str7 == null) {
                            linkedHashMap.put(Integer.valueOf(i), h0sVarA);
                        } else {
                            linkedHashMap.put(Integer.valueOf(i), h0sVarA);
                        }
                    }
                    if (h0sVarA.c() == 0) {
                        bVarI.N(-2024224750);
                        if (i == 888999888) {
                            bVarI.N(-2024148955);
                            z15 = false;
                            s5t.c(0, bVarI);
                            bVarI.X(false);
                        } else {
                            z15 = false;
                            bVarI.N(-2024066743);
                            s5t.d(0, bVarI);
                            bVarI.X(false);
                        }
                        bVarI.X(z15);
                        str4 = str8;
                    } else {
                        bVarI.N(-2023955608);
                        int i328 = ((i13 >> 3) & 14) | 64 | ((i13 >> 21) & 896) | ((i13 >> 12) & 7168);
                        int i329 = i17 << 15;
                        int i3210 = i328 | (i329 & 458752) | (i329 & 3670016);
                        int i3211 = i13 << 12;
                        str4 = str8;
                        b(lobbyV2ViewModel, h0sVarA, gajVar, fbhVar, zvrVarA, gnjVar, str3, str7, str4, bVarI, i3210 | (i3211 & 29360128) | (i3211 & 234881024));
                        z15 = false;
                        bVarI.X(false);
                    }
                    bVarI.X(z15);
                }
                bVarI.X(true);
                str5 = str7;
                z7 = z8;
                z6 = z215;
            }
            str4 = str8;
            bVarI.X(true);
            str5 = str7;
            z7 = z8;
            z6 = z215;
        } else {
            bVarI.G();
            str5 = str;
            z6 = z3;
            z7 = z4;
        }
        str6 = str4;
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: k4t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iA = qj40.a(i2 | 1);
                    int iA2 = qj40.a(i3);
                    q4t.c(yfxVar, lobbyV2ViewModel, i, str5, str6, z7, z2, fbhVar, z6, gajVar, gnjVar, str3, lyhVar, (a) obj3, iA, iA2, i4);
                    return Unit.a;
                }
            };
        }
    }
}
