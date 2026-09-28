package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import com.sportygames.compose.lobbyv2.models.LobbyV2GameDetailsModel;
import com.sportygames.compose.lobbyv2.models.LobbyV2HomeItemModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g4t {
    /* JADX WARN: Code duplicated, block: B:23:0x003c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0045  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:35:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x006d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0081  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:64:0x0102  */
    /* JADX WARN: Code duplicated, block: B:67:0x0120  */
    /* JADX WARN: Code duplicated, block: B:70:0x0196 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x0279  */
    /* JADX WARN: Code duplicated, block: B:87:0x028d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0298  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void a(LobbyV2HomeItemModel lobbyV2HomeItemModel, boolean z, iaj<? super Integer, ? super String, ? super String, ? super Integer, Unit> iajVar, a aVar, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        iaj<? super Integer, ? super String, ? super String, ? super Integer, Unit> iajVar2;
        int i5;
        boolean z3;
        b bVar;
        final iaj<? super Integer, ? super String, ? super String, ? super Integer, Unit> iajVar3;
        e eVarZ;
        boolean z4;
        List<LobbyV2GameDetailsModel> gameListVO;
        int size;
        boolean z5;
        int size2;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        List<LobbyV2GameDetailsModel> gameListVO2;
        iaj<? super Integer, ? super String, ? super String, ? super Integer, Unit> iajVar4;
        boolean z6;
        iaj<? super Integer, ? super String, ? super String, ? super Integer, Unit> iajVar5;
        boolean z7;
        final LobbyV2HomeItemModel lobbyV2HomeItemModel2 = lobbyV2HomeItemModel;
        b bVarI = aVar.i(1131300634);
        if ((i & 6) == 0) {
            i3 = (bVarI.A(lobbyV2HomeItemModel2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= bVarI.b(z2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    iajVar2 = iajVar;
                    if (bVarI.A(iajVar2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i3 & 147) != 146) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bVarI.q(i3 & 1, z3)) {
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    if (i4 != 0) {
                        iajVar2 = null;
                    }
                    gameListVO = lobbyV2HomeItemModel2.getGameListVO();
                    if (gameListVO != null) {
                        size = gameListVO.size();
                    } else {
                        size = 0;
                    }
                    if (size >= 10) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    String listType = lobbyV2HomeItemModel2.getListType();
                    a5t[] a5tVarArr = a5t.a;
                    size2 = Intrinsics.g(listType, "top_horizontal_strip") ? 10 : 6;
                    d.a aVar3 = d.a.b;
                    d dVarJ = h.j(j.A(j.g(aVar3, 1.0f), null, 3), fw20.a(R.dimen.lobby_v2_general_item_spacing, bVarI), 0.0f, fw20.a(R.dimen.lobby_v2_general_item_spacing, bVarI), fw20.a(R.dimen.lobby_v2_general_item_spacing, bVarI), 2);
                    d160 d160VarA = b160.a(kw0.g, ht.a.k, bVarI, 54);
                    iHashCode = Long.hashCode(bVarI.T);
                    ne00 ne00VarS = bVarI.S();
                    d dVarC = c.c(bVarI, dVarJ);
                    yka.k.getClass();
                    aVar2 = yka.a.b;
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar2);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA, yka.a.f);
                    hlh0.a(bVarI, ne00VarS, yka.a.e);
                    c1350a = yka.a.g;
                    if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                        n30.a(iHashCode, bVarI, iHashCode, c1350a);
                    }
                    hlh0.a(bVarI, dVarC, yka.a.d);
                    Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                    String key = lobbyV2HomeItemModel2.getKey();
                    String sectionName = lobbyV2HomeItemModel2.getSectionName();
                    gameListVO2 = lobbyV2HomeItemModel2.getGameListVO();
                    if (gameListVO2 != null) {
                        size2 = gameListVO2.size();
                    }
                    String strC = mn5.c(mn5.d(context, key, sectionName, size2));
                    qyd0 qyd0Var = vh60.a;
                    long j = ((th60) bVarI.O(qyd0Var)).h;
                    qyd0 qyd0Var2 = gah0.a;
                    iajVar4 = iajVar2;
                    z6 = z4;
                    lkf0.b(strC, s3w.a(aVar3, "section_title_label"), j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((eah0) bVarI.O(qyd0Var2)).h, bVarI, 0, 0, 65528);
                    if (z6 || !z5) {
                        lobbyV2HomeItemModel2 = lobbyV2HomeItemModel;
                        bVar = bVarI;
                        iajVar5 = iajVar4;
                        z7 = false;
                        bVar.N(-622718452);
                    } else {
                        bVarI.N(-619461871);
                        String strA = pm5.SHOW_ALL.a();
                        d dVarC2 = j.C(aVar3, null, 3);
                        long j2 = ((th60) bVarI.O(qyd0Var)).j;
                        h7f h7fVar = new h7f(9999999.0f);
                        i060 i060Var = j060.a;
                        d dVarB = androidx.compose.foundation.a.b(dVarC2, j2, new i060(h7fVar, h7fVar, h7fVar, h7fVar));
                        String key2 = lobbyV2HomeItemModel.getKey();
                        key2.getClass();
                        d dVarA = androidx.compose.ui.platform.d.a(dVarB, "lobby_v2_show_all_".concat(key2));
                        lobbyV2HomeItemModel2 = lobbyV2HomeItemModel;
                        boolean zA = bVarI.A(lobbyV2HomeItemModel2) | ((i3 & 896) == 256);
                        Object objY = bVarI.y();
                        if (zA || objY == a.C0041a.a) {
                            iajVar5 = iajVar4;
                            z7 = false;
                            objY = new e4t(0, iajVar5, lobbyV2HomeItemModel2);
                            bVarI.r(objY);
                        } else {
                            iajVar5 = iajVar4;
                            z7 = false;
                        }
                        lkf0.b(strA, s3w.a(h.g(androidx.compose.foundation.d.d(dVarA, false, null, null, (Function0) objY, 15), fw20.a(R.dimen._7sdp, bVarI), fw20.a(R.dimen._2sdp, bVarI)), "show_all_button"), ((th60) bVarI.O(qyd0Var)).i, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, imf0.b(((eah0) bVarI.O(qyd0Var2)).c, 0L, 0L, t9i.C, null, null, 0L, null, null, null, 0, 0L, null, null, 16777211), bVarI, 0, 0, 65528);
                        bVar = bVarI;
                    }
                    bVar.X(z7);
                    bVar.X(true);
                    z2 = z6;
                    iajVar3 = iajVar5;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    iajVar3 = iajVar2;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    final boolean z8 = z2;
                    eVarZ.d = new Function2() { // from class: f4t
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            g4t.a(lobbyV2HomeItemModel2, z8, iajVar3, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i3 |= 384;
            iajVar2 = iajVar;
            if ((i3 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i3 & 1, z3)) {
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i4 != 0) {
                    iajVar2 = null;
                }
                gameListVO = lobbyV2HomeItemModel2.getGameListVO();
                if (gameListVO != null) {
                    size = gameListVO.size();
                } else {
                    size = 0;
                }
                if (size >= 10) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                String listType2 = lobbyV2HomeItemModel2.getListType();
                a5t[] a5tVarArr2 = a5t.a;
                if (Intrinsics.g(listType2, "top_horizontal_strip")) {
                }
                d.a aVar4 = d.a.b;
                d dVarJ2 = h.j(j.A(j.g(aVar4, 1.0f), null, 3), fw20.a(R.dimen.lobby_v2_general_item_spacing, bVarI), 0.0f, fw20.a(R.dimen.lobby_v2_general_item_spacing, bVarI), fw20.a(R.dimen.lobby_v2_general_item_spacing, bVarI), 2);
                d160 d160VarA2 = b160.a(kw0.g, ht.a.k, bVarI, 54);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC3 = c.c(bVarI, dVarJ2);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA2, yka.a.f);
                hlh0.a(bVarI, ne00VarS2, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC3, yka.a.d);
                Context context2 = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                String key3 = lobbyV2HomeItemModel2.getKey();
                String sectionName2 = lobbyV2HomeItemModel2.getSectionName();
                gameListVO2 = lobbyV2HomeItemModel2.getGameListVO();
                if (gameListVO2 != null) {
                    size2 = gameListVO2.size();
                }
                String strC2 = mn5.c(mn5.d(context2, key3, sectionName2, size2));
                qyd0 qyd0Var3 = vh60.a;
                long j3 = ((th60) bVarI.O(qyd0Var3)).h;
                qyd0 qyd0Var4 = gah0.a;
                iajVar4 = iajVar2;
                z6 = z4;
                lkf0.b(strC2, s3w.a(aVar4, "section_title_label"), j3, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((eah0) bVarI.O(qyd0Var4)).h, bVarI, 0, 0, 65528);
                if (z6) {
                    lobbyV2HomeItemModel2 = lobbyV2HomeItemModel;
                    bVar = bVarI;
                    iajVar5 = iajVar4;
                    z7 = false;
                    bVar.N(-622718452);
                } else {
                    lobbyV2HomeItemModel2 = lobbyV2HomeItemModel;
                    bVar = bVarI;
                    iajVar5 = iajVar4;
                    z7 = false;
                    bVar.N(-622718452);
                }
                bVar.X(z7);
                bVar.X(true);
                z2 = z6;
                iajVar3 = iajVar5;
            } else {
                bVar = bVarI;
                bVar.G();
                iajVar3 = iajVar2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                final boolean z9 = z2;
                eVarZ.d = new Function2() { // from class: f4t
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        g4t.a(lobbyV2HomeItemModel2, z9, iajVar3, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 48;
        z2 = z;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                iajVar2 = iajVar;
                if (bVarI.A(iajVar2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i3 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i3 & 1, z3)) {
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                if (i4 != 0) {
                    iajVar2 = null;
                }
                gameListVO = lobbyV2HomeItemModel2.getGameListVO();
                if (gameListVO != null) {
                    size = gameListVO.size();
                } else {
                    size = 0;
                }
                if (size >= 10) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                String listType3 = lobbyV2HomeItemModel2.getListType();
                a5t[] a5tVarArr3 = a5t.a;
                if (Intrinsics.g(listType3, "top_horizontal_strip")) {
                }
                d.a aVar5 = d.a.b;
                d dVarJ3 = h.j(j.A(j.g(aVar5, 1.0f), null, 3), fw20.a(R.dimen.lobby_v2_general_item_spacing, bVarI), 0.0f, fw20.a(R.dimen.lobby_v2_general_item_spacing, bVarI), fw20.a(R.dimen.lobby_v2_general_item_spacing, bVarI), 2);
                d160 d160VarA3 = b160.a(kw0.g, ht.a.k, bVarI, 54);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS3 = bVarI.S();
                d dVarC4 = c.c(bVarI, dVarJ3);
                yka.k.getClass();
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA3, yka.a.f);
                hlh0.a(bVarI, ne00VarS3, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                } else {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC4, yka.a.d);
                Context context3 = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                String key4 = lobbyV2HomeItemModel2.getKey();
                String sectionName3 = lobbyV2HomeItemModel2.getSectionName();
                gameListVO2 = lobbyV2HomeItemModel2.getGameListVO();
                if (gameListVO2 != null) {
                    size2 = gameListVO2.size();
                }
                String strC3 = mn5.c(mn5.d(context3, key4, sectionName3, size2));
                qyd0 qyd0Var5 = vh60.a;
                long j4 = ((th60) bVarI.O(qyd0Var5)).h;
                qyd0 qyd0Var6 = gah0.a;
                iajVar4 = iajVar2;
                z6 = z4;
                lkf0.b(strC3, s3w.a(aVar5, "section_title_label"), j4, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((eah0) bVarI.O(qyd0Var6)).h, bVarI, 0, 0, 65528);
                if (z6) {
                    lobbyV2HomeItemModel2 = lobbyV2HomeItemModel;
                    bVar = bVarI;
                    iajVar5 = iajVar4;
                    z7 = false;
                    bVar.N(-622718452);
                } else {
                    lobbyV2HomeItemModel2 = lobbyV2HomeItemModel;
                    bVar = bVarI;
                    iajVar5 = iajVar4;
                    z7 = false;
                    bVar.N(-622718452);
                }
                bVar.X(z7);
                bVar.X(true);
                z2 = z6;
                iajVar3 = iajVar5;
            } else {
                bVar = bVarI;
                bVar.G();
                iajVar3 = iajVar2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                final boolean z10 = z2;
                eVarZ.d = new Function2() { // from class: f4t
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        g4t.a(lobbyV2HomeItemModel2, z10, iajVar3, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 384;
        iajVar2 = iajVar;
        if ((i3 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i3 & 1, z3)) {
            if (i6 != 0) {
                z4 = true;
            } else {
                z4 = z2;
            }
            if (i4 != 0) {
                iajVar2 = null;
            }
            gameListVO = lobbyV2HomeItemModel2.getGameListVO();
            if (gameListVO != null) {
                size = gameListVO.size();
            } else {
                size = 0;
            }
            if (size >= 10) {
                z5 = true;
            } else {
                z5 = false;
            }
            String listType4 = lobbyV2HomeItemModel2.getListType();
            a5t[] a5tVarArr4 = a5t.a;
            if (Intrinsics.g(listType4, "top_horizontal_strip")) {
            }
            d.a aVar6 = d.a.b;
            d dVarJ4 = h.j(j.A(j.g(aVar6, 1.0f), null, 3), fw20.a(R.dimen.lobby_v2_general_item_spacing, bVarI), 0.0f, fw20.a(R.dimen.lobby_v2_general_item_spacing, bVarI), fw20.a(R.dimen.lobby_v2_general_item_spacing, bVarI), 2);
            d160 d160VarA4 = b160.a(kw0.g, ht.a.k, bVarI, 54);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC5 = c.c(bVarI, dVarJ4);
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA4, yka.a.f);
            hlh0.a(bVarI, ne00VarS4, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC5, yka.a.d);
            Context context4 = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            String key5 = lobbyV2HomeItemModel2.getKey();
            String sectionName4 = lobbyV2HomeItemModel2.getSectionName();
            gameListVO2 = lobbyV2HomeItemModel2.getGameListVO();
            if (gameListVO2 != null) {
                size2 = gameListVO2.size();
            }
            String strC4 = mn5.c(mn5.d(context4, key5, sectionName4, size2));
            qyd0 qyd0Var7 = vh60.a;
            long j5 = ((th60) bVarI.O(qyd0Var7)).h;
            qyd0 qyd0Var8 = gah0.a;
            iajVar4 = iajVar2;
            z6 = z4;
            lkf0.b(strC4, s3w.a(aVar6, "section_title_label"), j5, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((eah0) bVarI.O(qyd0Var8)).h, bVarI, 0, 0, 65528);
            if (z6) {
                lobbyV2HomeItemModel2 = lobbyV2HomeItemModel;
                bVar = bVarI;
                iajVar5 = iajVar4;
                z7 = false;
                bVar.N(-622718452);
            } else {
                lobbyV2HomeItemModel2 = lobbyV2HomeItemModel;
                bVar = bVarI;
                iajVar5 = iajVar4;
                z7 = false;
                bVar.N(-622718452);
            }
            bVar.X(z7);
            bVar.X(true);
            z2 = z6;
            iajVar3 = iajVar5;
        } else {
            bVar = bVarI;
            bVar.G();
            iajVar3 = iajVar2;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            final boolean z11 = z2;
            eVarZ.d = new Function2() { // from class: f4t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g4t.a(lobbyV2HomeItemModel2, z11, iajVar3, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
