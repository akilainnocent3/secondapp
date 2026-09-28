package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportygames.common.network.campaign.Campaign;
import com.sportygames.common.network.campaign.CampaignTier;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.compose.lobbyv2.models.UIState;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class t66 {
    /* JADX WARN: Code duplicated, block: B:101:0x038d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0399  */
    /* JADX WARN: Code duplicated, block: B:105:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:106:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:111:0x040e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0442  */
    /* JADX WARN: Code duplicated, block: B:115:0x0446  */
    /* JADX WARN: Code duplicated, block: B:120:0x0461  */
    /* JADX WARN: Code duplicated, block: B:123:0x0484  */
    /* JADX WARN: Code duplicated, block: B:125:0x048d  */
    /* JADX WARN: Code duplicated, block: B:127:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:129:0x04c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:136:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:139:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:140:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:142:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:143:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:145:0x04fa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:152:0x050d  */
    /* JADX WARN: Code duplicated, block: B:155:0x0514  */
    /* JADX WARN: Code duplicated, block: B:156:0x051b  */
    /* JADX WARN: Code duplicated, block: B:158:0x0521  */
    /* JADX WARN: Code duplicated, block: B:161:0x0531  */
    /* JADX WARN: Code duplicated, block: B:163:0x0539  */
    /* JADX WARN: Code duplicated, block: B:164:0x0559  */
    /* JADX WARN: Code duplicated, block: B:165:0x0579  */
    /* JADX WARN: Code duplicated, block: B:168:0x061b  */
    /* JADX WARN: Code duplicated, block: B:171:0x062c  */
    /* JADX WARN: Code duplicated, block: B:172:0x0636  */
    /* JADX WARN: Code duplicated, block: B:176:0x064a  */
    /* JADX WARN: Code duplicated, block: B:182:0x0665  */
    /* JADX WARN: Code duplicated, block: B:183:0x066a  */
    /* JADX WARN: Code duplicated, block: B:187:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:193:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:196:0x0751  */
    /* JADX WARN: Code duplicated, block: B:197:0x0753  */
    /* JADX WARN: Code duplicated, block: B:201:0x0762  */
    /* JADX WARN: Code duplicated, block: B:206:0x0790  */
    /* JADX WARN: Code duplicated, block: B:208:0x079e  */
    /* JADX WARN: Code duplicated, block: B:210:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:212:0x080d  */
    /* JADX WARN: Code duplicated, block: B:214:0x0811  */
    /* JADX WARN: Code duplicated, block: B:216:0x083c  */
    /* JADX WARN: Code duplicated, block: B:224:0x065e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x012c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0130  */
    /* JADX WARN: Code duplicated, block: B:54:0x014b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0195  */
    /* JADX WARN: Code duplicated, block: B:58:0x0199  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:72:0x0213  */
    /* JADX WARN: Code duplicated, block: B:75:0x0299  */
    /* JADX WARN: Code duplicated, block: B:76:0x029d  */
    /* JADX WARN: Code duplicated, block: B:81:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:84:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:85:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:91:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:94:0x0369  */
    /* JADX WARN: Code duplicated, block: B:99:0x0389  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final d dVar, final db6 db6Var, final String str, final Function0 function0, final Function0 function1, Function0 function2, a aVar, final int i) {
        gbh0 gbh0Var;
        yka.a.c cVar;
        d.a aVar2;
        n54 n54Var;
        int iHashCode;
        qyd0 qyd0Var;
        int iHashCode2;
        int iHashCode3;
        androidx.compose.foundation.layout.d dVar2;
        gbh0 gbh0Var2;
        n54.b bVar;
        int iHashCode4;
        boolean z;
        Object objY;
        a.C0041a.C0042a c0042a;
        int i2;
        n54 n54Var2;
        boolean z2;
        Object objY2;
        UIState uIState;
        Campaign campaign;
        final boolean zG;
        int iHashCode5;
        int iHashCode6;
        String strValueOf;
        String timeUnit;
        String strA;
        int iHashCode7;
        String strB;
        int iHashCode8;
        final Campaign campaign2;
        zzr zzrVarA;
        Object objY3;
        v5b v5bVar;
        Object objY4;
        String str2;
        ytw ytwVar;
        Iterator<T> it;
        Object next;
        final CampaignTier campaignTier;
        String status;
        vsf0 vsf0VarB;
        int iC1;
        boolean zA;
        Object objY5;
        boolean zA2;
        Object objY6;
        boolean z3;
        boolean zA3;
        Object objY7;
        HTTPResponse hTTPResponse;
        Function0 function3 = function2;
        db6Var.getClass();
        b bVarI = aVar.i(-46255479);
        int i3 = (bVarI.A(db6Var) ? 32 : 16) | i | (bVarI.M(str) ? 256 : 128);
        if ((i & 3072) == 0) {
            i3 |= bVarI.A(function0) ? 2048 : 1024;
        }
        int i4 = i3 | (bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function3) ? 131072 : 65536);
        if (bVarI.q(i4 & 1, (74899 & i4) != 74898)) {
            ytw ytwVarA = ts9.a(db6Var.d, bVarI);
            UIState uIState2 = (UIState) ytwVarA.getValue();
            gbh0 uiStatus = uIState2 != null ? uIState2.getUiStatus() : null;
            long j = j58.l;
            zk40.a aVar3 = zk40.a;
            d dVarA = ls7.a(androidx.compose.foundation.a.b(dVar, j, aVar3), j060.e(fw20.a(R.dimen._10sdp, bVarI), fw20.a(R.dimen._10sdp, bVarI), 0.0f, 0.0f, 12));
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode9 = Long.hashCode(bVarI.m());
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar2);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S) {
                gbh0Var = uiStatus;
            } else {
                gbh0Var = uiStatus;
                if (!Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode9))) {
                }
                cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                float fA = fw20.a(R.dimen._34sdp, bVarI);
                aVar2 = d.a.b;
                d dVarB = androidx.compose.foundation.a.b(j.i(aVar2, fA), j, aVar3);
                n54Var = ht.a.a;
                aiv aivVarC = g75.c(n54Var, false);
                iHashCode = Long.hashCode(bVarI.m());
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarB);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, bVar2);
                hlh0.a(bVarI, ne00VarS2, dVar3);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                qyd0Var = sh60.a;
                d dVarC3 = j.c(h.h(androidx.compose.foundation.a.b(aVar2, ((qh60) bVarI.O(qyd0Var)).t, aVar3), fw20.a(R.dimen._10sdp, bVarI), 0.0f, 2), 1.0f);
                d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
                iHashCode2 = Long.hashCode(bVarI.m());
                ne00 ne00VarS3 = bVarI.S();
                d dVarC4 = c.c(bVarI, dVarC3);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, bVar2);
                hlh0.a(bVarI, ne00VarS3, dVar3);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC4, cVar);
                f160 f160Var = f160.a;
                d dVarJ = h.j(f160Var.a(0.25f, aVar2, true), 0.0f, fw20.a(R.dimen._8sdp, bVarI), 0.0f, 0.0f, 13);
                aiv aivVarC2 = g75.c(n54Var, false);
                iHashCode3 = Long.hashCode(bVarI.m());
                ne00 ne00VarS4 = bVarI.S();
                d dVarC5 = c.c(bVarI, dVarJ);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC2, bVar2);
                hlh0.a(bVarI, ne00VarS4, dVar3);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode3))) {
                    n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
                }
                hlh0.a(bVarI, dVarC5, cVar);
                d dVarC6 = j.c(aVar2, 1.0f);
                n54 n54Var3 = ht.a.g;
                dVar2 = androidx.compose.foundation.layout.d.a;
                gbh0Var2 = gbh0Var;
                h9n.a(erz.a(R.drawable.campaign_dialog_gift_header, 0, bVarI), "Campaign Header Image", dVar2.b(dVarC6, n54Var3), null, d0b.a.c, 0.0f, null, bVarI, 24624, 104);
                bVarI.X(true);
                ty0.a(bVarI, f160Var.a(0.5f, aVar2, true));
                d dVarC7 = j.c(f160Var.a(0.25f, aVar2, true), 1.0f);
                kw0.d dVar4 = kw0.b;
                bVar = ht.a.k;
                d160 d160VarA2 = b160.a(dVar4, bVar, bVarI, 54);
                iHashCode4 = Long.hashCode(bVarI.m());
                ne00 ne00VarS5 = bVarI.S();
                d dVarC8 = c.c(bVarI, dVarC7);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA2, bVar2);
                hlh0.a(bVarI, ne00VarS5, dVar3);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode4))) {
                    n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
                }
                hlh0.a(bVarI, dVarC8, cVar);
                d dVarI = j.i(j.w(aVar2, fw20.a(R.dimen._13sdp, bVarI)), fw20.a(R.dimen._13sdp, bVarI));
                if ((i4 & 7168) == 2048) {
                    z = true;
                } else {
                    z = false;
                }
                objY = bVarI.y();
                c0042a = a.C0041a.a;
                if (!z || objY == c0042a) {
                    i2 = 0;
                    objY = new i66(function0, 0);
                    bVarI.r(objY);
                } else {
                    i2 = 0;
                }
                h9n.a(erz.a(R.drawable.cross_white, i2, bVarI), "Cross", androidx.compose.foundation.d.d(dVarI, false, null, null, (Function0) objY, 15), null, null, 0.0f, null, bVarI, 48, 120);
                bVarI = bVarI;
                bVarI.X(true);
                bVarI.X(true);
                d dVarC9 = j.c(j.g(aVar2, 0.68f), 1.0f);
                n54Var2 = ht.a.e;
                q75.a(dVar2.b(dVarC9, n54Var2), null, false, pp8.b(1683497463, new gaj() { // from class: j66
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        r75 r75Var = (r75) obj;
                        a aVar5 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        r75Var.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= aVar5.M(r75Var) ? 4 : 2;
                        }
                        if (aVar5.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                            qyd0 qyd0Var2 = sh60.a;
                            qb2.b(str, r75Var.b(j.g(d.a.b, 0.8f), ht.a.e), new imf0(new hfs(kotlin.collections.b.k(new j58(((qh60) aVar5.O(qyd0Var2)).u), new j58(((qh60) aVar5.O(qyd0Var2)).v)), null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(i7f.a(r75Var.d(), aVar5) * 0.8f)) << 32), 0), 0L, t9i.G, null, null, null, 0L, 33488886), null, 0, false, 1, 0, new if1(d2l.g(fw20.a(R.dimen._4ssp, aVar5), 4294967296L), d2l.g(fw20.a(R.dimen._15ssp, aVar5), 4294967296L), d2l.g(fw20.a(R.dimen._1ssp, aVar5), 4294967296L)), aVar5, 1572864, 440);
                        } else {
                            aVar5.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 3072, 6);
                bVarI.X(true);
                if (gbh0Var2 == gbh0.c) {
                    bVarI.N(-1823969279);
                    uIState = (UIState) ytwVarA.getValue();
                    if (uIState != null || (hTTPResponse = (HTTPResponse) uIState.getData()) == null) {
                        campaign = null;
                    } else {
                        campaign = (Campaign) hTTPResponse.getData();
                    }
                    if (campaign == null) {
                        bVarI.N(-1823889827);
                    } else {
                        bVarI.N(-1823889826);
                        zG = Intrinsics.g(campaign.getCampaign().getStatus(), "PAUSED");
                        d dVarB2 = androidx.compose.foundation.a.b(j.i(j.g(aVar2, 1.0f), fw20.a(R.dimen._19sdp, bVarI)), ((qh60) bVarI.O(qyd0Var)).r, aVar3);
                        d160 d160VarA3 = b160.a(kw0.e, bVar, bVarI, 54);
                        iHashCode5 = Long.hashCode(bVarI.m());
                        ne00 ne00VarS6 = bVarI.S();
                        d dVarC10 = c.c(bVarI, dVarB2);
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar4);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, d160VarA3, bVar2);
                        hlh0.a(bVarI, ne00VarS6, dVar3);
                        if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode5))) {
                            n30.a(iHashCode5, bVarI, iHashCode5, c1350a);
                        }
                        hlh0.a(bVarI, dVarC10, cVar);
                        d dVarA2 = j.A(j.g(aVar2, 0.75f), null, 3);
                        aiv aivVarC3 = g75.c(n54Var, false);
                        iHashCode6 = Long.hashCode(bVarI.m());
                        ne00 ne00VarS7 = bVarI.S();
                        d dVarC11 = c.c(bVarI, dVarA2);
                        bVarI.D();
                        if (bVarI.S) {
                            bVarI.F(aVar4);
                        } else {
                            bVarI.p();
                        }
                        hlh0.a(bVarI, aivVarC3, bVar2);
                        hlh0.a(bVarI, ne00VarS7, dVar3);
                        if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode6))) {
                            n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
                        }
                        hlh0.a(bVarI, dVarC11, cVar);
                        d dVarH = h.h(dVar2.b(j.c(j.g(aVar2, 1.0f), 1.0f), n54Var2), 0.0f, fw20.a(R.dimen._3sdp, bVarI), 1);
                        if (zG) {
                            strB = jn5.PAUSED.a();
                        } else {
                            strValueOf = String.valueOf(campaign.getCampaign().getRemainingTime());
                            timeUnit = campaign.getCampaign().getTimeUnit();
                            strValueOf.getClass();
                            timeUnit.getClass();
                            strA = "";
                            if (strValueOf.contentEquals("1")) {
                                iHashCode8 = timeUnit.hashCode();
                                if (iHashCode8 != 67452) {
                                    if (iHashCode8 != 2223588) {
                                        if (iHashCode8 == 2660340 && timeUnit.equals("WEEK")) {
                                            strA = jn5.WEEK.a();
                                        }
                                    } else if (timeUnit.equals("HOUR")) {
                                        strA = jn5.HOUR.a();
                                    }
                                } else if (timeUnit.equals("DAY")) {
                                    strA = jn5.DAY.a();
                                }
                            } else {
                                iHashCode7 = timeUnit.hashCode();
                                if (iHashCode7 != 67452) {
                                    if (iHashCode7 != 2223588) {
                                        if (iHashCode7 == 2660340 && timeUnit.equals("WEEK")) {
                                            strA = jn5.WEEKS.a();
                                        }
                                    } else if (timeUnit.equals("HOUR")) {
                                        strA = jn5.HOURS.a();
                                    }
                                } else if (timeUnit.equals("DAY")) {
                                    strA = jn5.DAYS.a();
                                }
                            }
                            if (timeUnit.contentEquals("MINUTE")) {
                                strB = kn5.b(new eo5("ends_in_x_time_units", lx5.a("Ends in ", strValueOf, " ", strA), kpu.d(new Pair("{timeRemaining}", strValueOf), new Pair("{timeUnit}", strA))));
                            } else if (strValueOf.contentEquals("1")) {
                                strB = kn5.b(new eo5("ends_in_x_minute", tug.a("Ends in ", strValueOf, " minute"), kpu.d(new Pair("{time}", strValueOf))));
                            } else {
                                strB = kn5.b(new eo5("ends_in_x_minutes", tug.a("Ends in ", strValueOf, " minutes"), kpu.d(new Pair("{time}", strValueOf))));
                            }
                        }
                        campaign2 = campaign;
                        qb2.b(strB, dVarH, new imf0(((qh60) bVarI.O(qyd0Var)).s, 0L, t9i.E, n9i.a(), null, 0L, null, null, 3, 0L, null, null, 16744434), null, 0, false, 0, 0, new if1(ash0.b(R.dimen._4ssp, 48, bVarI), ash0.b(R.dimen._15ssp, 48, bVarI), ash0.b(R.dimen._1sdp, 48, bVarI)), bVarI, 0, 504);
                        bVarI.X(true);
                        bVarI.X(true);
                        zzrVarA = e0s.a(0, 3, bVarI);
                        objY3 = bVarI.y();
                        if (objY3 == c0042a) {
                            objY3 = xvf.i(e.a, bVarI);
                            bVarI.r(objY3);
                        }
                        v5bVar = (v5b) objY3;
                        objY4 = bVarI.y();
                        if (objY4 == c0042a) {
                            str2 = null;
                            objY4 = m.b(null);
                            bVarI.r(objY4);
                        } else {
                            str2 = null;
                        }
                        ytwVar = (ytw) objY4;
                        it = campaign2.getTiers().iterator();
                        do {
                            if (it.hasNext()) {
                                next = str2;
                                break;
                            }
                            next = it.next();
                        } while (b(((CampaignTier) next).getStatus()) == vsf0.d);
                        campaignTier = (CampaignTier) next;
                        if (campaignTier != null) {
                            status = campaignTier.getStatus();
                        } else {
                            status = str2;
                        }
                        vsf0VarB = b(status);
                        iC1 = (int) ((mmd) bVarI.O(kna.h)).C1(fw20.a(R.dimen._15sdp, bVarI));
                        Unit unit = Unit.a;
                        zA = bVarI.A(campaignTier) | bVarI.A(campaign2) | bVarI.M(zzrVarA) | bVarI.d(iC1);
                        objY5 = bVarI.y();
                        if (zA || objY5 == c0042a) {
                            objY5 = new n66(campaignTier, campaign2, zzrVarA, iC1, null);
                            bVarI.r(objY5);
                        }
                        xvf.e(bVarI, unit, (Function2) objY5);
                        zA2 = bVarI.A(campaignTier) | bVarI.d(vsf0VarB.ordinal()) | bVarI.A(campaign2) | bVarI.A(v5bVar) | bVarI.M(zzrVarA);
                        objY6 = bVarI.y();
                        if (zA2 || objY6 == c0042a) {
                            objY6 = new o66(campaignTier, vsf0VarB, campaign2, v5bVar, ytwVar, zzrVarA, null);
                            bVarI.r(objY6);
                        }
                        xvf.e(bVarI, vsf0VarB, (Function2) objY6);
                        d dVarJ2 = h.j(androidx.compose.foundation.a.b(j.e(aVar2, 1.0f), ((qh60) bVarI.O(sh60.a)).w, aVar3), fw20.a(R.dimen._10sdp, bVarI), 0.0f, fw20.a(R.dimen._10sdp, bVarI), 0.0f, 10);
                        kw0.i iVar = new kw0.i(fw20.a(R.dimen._8sdp, bVarI), true, new hw0());
                        boolean zA4 = bVarI.A(campaign2) | bVarI.A(db6Var) | bVarI.b(zG);
                        if ((i4 & 57344) == 16384) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        zA3 = zA4 | z3 | bVarI.A(campaignTier);
                        objY7 = bVarI.y();
                        if (zA3 || objY7 == c0042a) {
                            Function1 function4 = new Function1() { // from class: k66
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    szr szrVar = (szr) obj;
                                    szrVar.getClass();
                                    Campaign campaign3 = campaign2;
                                    boolean z4 = campaign3.getTiers().size() == 1;
                                    int size = campaign3.getTiers().size();
                                    List<CampaignTier> tiers = campaign3.getTiers();
                                    szrVar.d(tiers.size(), null, new p66(tiers), new op8(802480018, new q66(tiers, db6Var, z4, size, zG, campaign3, function1, campaignTier), true));
                                    return Unit.a;
                                }
                            };
                            bVarI.r(function4);
                            objY7 = function4;
                        }
                        aur.a(dVarJ2, zzrVarA, null, false, iVar, null, null, false, null, (Function1) objY7, bVarI, 0, 492);
                        bVarI = bVarI;
                    }
                    bVarI.X(false);
                    bVarI.X(false);
                } else {
                    if (gbh0Var2 == gbh0.b) {
                        bVarI.N(-1817822754);
                        d dVarJ3 = h.j(androidx.compose.foundation.a.b(j.e(aVar2, 1.0f), ((qh60) bVarI.O(qyd0Var)).w, aVar3), fw20.a(R.dimen._10sdp, bVarI), fw20.a(R.dimen._3sdp, bVarI), fw20.a(R.dimen._10sdp, bVarI), 0.0f, 8);
                        kw0.i iVar2 = new kw0.i(fw20.a(R.dimen._8sdp, bVarI), true, new hw0());
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = new l66(0);
                            bVarI.r(objY2);
                        }
                        aur.a(dVarJ3, null, null, false, iVar2, null, null, false, null, (Function1) objY2, bVarI, 805306368, 494);
                        bVarI = bVarI;
                        bVarI.X(false);
                    } else {
                        if (gbh0Var2 == gbh0.d) {
                            bVarI.N(-1816683597);
                            function3 = function2;
                            e76.a((i4 >> 12) & 112, bVarI, androidx.compose.foundation.a.b(j.c(j.g(aVar2, 1.0f), 1.0f), ((qh60) bVarI.O(qyd0Var)).w, aVar3), function3);
                            z2 = false;
                        } else {
                            function3 = function2;
                            z2 = false;
                            bVarI.N(-1830913713);
                        }
                        bVarI.X(z2);
                    }
                    bVarI.X(true);
                }
                function3 = function2;
                bVarI.X(true);
            }
            n30.a(iHashCode9, bVarI, iHashCode9, c1350a);
            cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            float fA2 = fw20.a(R.dimen._34sdp, bVarI);
            aVar2 = d.a.b;
            d dVarB3 = androidx.compose.foundation.a.b(j.i(aVar2, fA2), j, aVar3);
            n54Var = ht.a.a;
            aiv aivVarC4 = g75.c(n54Var, false);
            iHashCode = Long.hashCode(bVarI.m());
            ne00 ne00VarS8 = bVarI.S();
            d dVarC12 = c.c(bVarI, dVarB3);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC4, bVar2);
            hlh0.a(bVarI, ne00VarS8, dVar3);
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC12, cVar);
            qyd0Var = sh60.a;
            d dVarC13 = j.c(h.h(androidx.compose.foundation.a.b(aVar2, ((qh60) bVarI.O(qyd0Var)).t, aVar3), fw20.a(R.dimen._10sdp, bVarI), 0.0f, 2), 1.0f);
            d160 d160VarA4 = b160.a(kw0.a, ht.a.j, bVarI, 0);
            iHashCode2 = Long.hashCode(bVarI.m());
            ne00 ne00VarS9 = bVarI.S();
            d dVarC14 = c.c(bVarI, dVarC13);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA4, bVar2);
            hlh0.a(bVarI, ne00VarS9, dVar3);
            if (bVarI.S) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC14, cVar);
            f160 f160Var2 = f160.a;
            d dVarJ4 = h.j(f160Var2.a(0.25f, aVar2, true), 0.0f, fw20.a(R.dimen._8sdp, bVarI), 0.0f, 0.0f, 13);
            aiv aivVarC5 = g75.c(n54Var, false);
            iHashCode3 = Long.hashCode(bVarI.m());
            ne00 ne00VarS10 = bVarI.S();
            d dVarC15 = c.c(bVarI, dVarJ4);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC5, bVar2);
            hlh0.a(bVarI, ne00VarS10, dVar3);
            if (bVarI.S) {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            } else {
                n30.a(iHashCode3, bVarI, iHashCode3, c1350a);
            }
            hlh0.a(bVarI, dVarC15, cVar);
            d dVarC16 = j.c(aVar2, 1.0f);
            n54 n54Var4 = ht.a.g;
            dVar2 = androidx.compose.foundation.layout.d.a;
            gbh0Var2 = gbh0Var;
            h9n.a(erz.a(R.drawable.campaign_dialog_gift_header, 0, bVarI), "Campaign Header Image", dVar2.b(dVarC16, n54Var4), null, d0b.a.c, 0.0f, null, bVarI, 24624, 104);
            bVarI.X(true);
            ty0.a(bVarI, f160Var2.a(0.5f, aVar2, true));
            d dVarC17 = j.c(f160Var2.a(0.25f, aVar2, true), 1.0f);
            kw0.d dVar5 = kw0.b;
            bVar = ht.a.k;
            d160 d160VarA5 = b160.a(dVar5, bVar, bVarI, 54);
            iHashCode4 = Long.hashCode(bVarI.m());
            ne00 ne00VarS11 = bVarI.S();
            d dVarC18 = c.c(bVarI, dVarC17);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA5, bVar2);
            hlh0.a(bVarI, ne00VarS11, dVar3);
            if (bVarI.S) {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            } else {
                n30.a(iHashCode4, bVarI, iHashCode4, c1350a);
            }
            hlh0.a(bVarI, dVarC18, cVar);
            d dVarI2 = j.i(j.w(aVar2, fw20.a(R.dimen._13sdp, bVarI)), fw20.a(R.dimen._13sdp, bVarI));
            if ((i4 & 7168) == 2048) {
                z = true;
            } else {
                z = false;
            }
            objY = bVarI.y();
            c0042a = a.C0041a.a;
            if (z) {
                i2 = 0;
                objY = new i66(function0, 0);
                bVarI.r(objY);
            } else {
                i2 = 0;
                objY = new i66(function0, 0);
                bVarI.r(objY);
            }
            h9n.a(erz.a(R.drawable.cross_white, i2, bVarI), "Cross", androidx.compose.foundation.d.d(dVarI2, false, null, null, (Function0) objY, 15), null, null, 0.0f, null, bVarI, 48, 120);
            bVarI = bVarI;
            bVarI.X(true);
            bVarI.X(true);
            d dVarC19 = j.c(j.g(aVar2, 0.68f), 1.0f);
            n54Var2 = ht.a.e;
            q75.a(dVar2.b(dVarC19, n54Var2), null, false, pp8.b(1683497463, new gaj() { // from class: j66
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    r75 r75Var = (r75) obj;
                    a aVar5 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar5.M(r75Var) ? 4 : 2;
                    }
                    if (aVar5.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        qyd0 qyd0Var2 = sh60.a;
                        qb2.b(str, r75Var.b(j.g(d.a.b, 0.8f), ht.a.e), new imf0(new hfs(kotlin.collections.b.k(new j58(((qh60) aVar5.O(qyd0Var2)).u), new j58(((qh60) aVar5.O(qyd0Var2)).v)), null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(i7f.a(r75Var.d(), aVar5) * 0.8f)) << 32), 0), 0L, t9i.G, null, null, null, 0L, 33488886), null, 0, false, 1, 0, new if1(d2l.g(fw20.a(R.dimen._4ssp, aVar5), 4294967296L), d2l.g(fw20.a(R.dimen._15ssp, aVar5), 4294967296L), d2l.g(fw20.a(R.dimen._1ssp, aVar5), 4294967296L)), aVar5, 1572864, 440);
                    } else {
                        aVar5.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3072, 6);
            bVarI.X(true);
            if (gbh0Var2 == gbh0.c) {
                bVarI.N(-1823969279);
                uIState = (UIState) ytwVarA.getValue();
                if (uIState != null) {
                    campaign = null;
                } else {
                    campaign = null;
                }
                if (campaign == null) {
                    bVarI.N(-1823889827);
                } else {
                    bVarI.N(-1823889826);
                    zG = Intrinsics.g(campaign.getCampaign().getStatus(), "PAUSED");
                    d dVarB4 = androidx.compose.foundation.a.b(j.i(j.g(aVar2, 1.0f), fw20.a(R.dimen._19sdp, bVarI)), ((qh60) bVarI.O(qyd0Var)).r, aVar3);
                    d160 d160VarA6 = b160.a(kw0.e, bVar, bVarI, 54);
                    iHashCode5 = Long.hashCode(bVarI.m());
                    ne00 ne00VarS12 = bVarI.S();
                    d dVarC110 = c.c(bVarI, dVarB4);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, d160VarA6, bVar2);
                    hlh0.a(bVarI, ne00VarS12, dVar3);
                    if (bVarI.S) {
                        n30.a(iHashCode5, bVarI, iHashCode5, c1350a);
                    } else {
                        n30.a(iHashCode5, bVarI, iHashCode5, c1350a);
                    }
                    hlh0.a(bVarI, dVarC110, cVar);
                    d dVarA3 = j.A(j.g(aVar2, 0.75f), null, 3);
                    aiv aivVarC6 = g75.c(n54Var, false);
                    iHashCode6 = Long.hashCode(bVarI.m());
                    ne00 ne00VarS13 = bVarI.S();
                    d dVarC111 = c.c(bVarI, dVarA3);
                    bVarI.D();
                    if (bVarI.S) {
                        bVarI.F(aVar4);
                    } else {
                        bVarI.p();
                    }
                    hlh0.a(bVarI, aivVarC6, bVar2);
                    hlh0.a(bVarI, ne00VarS13, dVar3);
                    if (bVarI.S) {
                        n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
                    } else {
                        n30.a(iHashCode6, bVarI, iHashCode6, c1350a);
                    }
                    hlh0.a(bVarI, dVarC111, cVar);
                    d dVarH2 = h.h(dVar2.b(j.c(j.g(aVar2, 1.0f), 1.0f), n54Var2), 0.0f, fw20.a(R.dimen._3sdp, bVarI), 1);
                    if (zG) {
                        strB = jn5.PAUSED.a();
                    } else {
                        strValueOf = String.valueOf(campaign.getCampaign().getRemainingTime());
                        timeUnit = campaign.getCampaign().getTimeUnit();
                        strValueOf.getClass();
                        timeUnit.getClass();
                        strA = "";
                        if (strValueOf.contentEquals("1")) {
                            iHashCode8 = timeUnit.hashCode();
                            if (iHashCode8 != 67452) {
                                if (iHashCode8 != 2223588) {
                                    if (iHashCode8 == 2660340) {
                                        strA = jn5.WEEK.a();
                                    }
                                } else if (timeUnit.equals("HOUR")) {
                                    strA = jn5.HOUR.a();
                                }
                            } else if (timeUnit.equals("DAY")) {
                                strA = jn5.DAY.a();
                            }
                        } else {
                            iHashCode7 = timeUnit.hashCode();
                            if (iHashCode7 != 67452) {
                                if (iHashCode7 != 2223588) {
                                    if (iHashCode7 == 2660340) {
                                        strA = jn5.WEEKS.a();
                                    }
                                } else if (timeUnit.equals("HOUR")) {
                                    strA = jn5.HOURS.a();
                                }
                            } else if (timeUnit.equals("DAY")) {
                                strA = jn5.DAYS.a();
                            }
                        }
                        if (timeUnit.contentEquals("MINUTE")) {
                            strB = kn5.b(new eo5("ends_in_x_time_units", lx5.a("Ends in ", strValueOf, " ", strA), kpu.d(new Pair("{timeRemaining}", strValueOf), new Pair("{timeUnit}", strA))));
                        } else if (strValueOf.contentEquals("1")) {
                            strB = kn5.b(new eo5("ends_in_x_minute", tug.a("Ends in ", strValueOf, " minute"), kpu.d(new Pair("{time}", strValueOf))));
                        } else {
                            strB = kn5.b(new eo5("ends_in_x_minutes", tug.a("Ends in ", strValueOf, " minutes"), kpu.d(new Pair("{time}", strValueOf))));
                        }
                    }
                    campaign2 = campaign;
                    qb2.b(strB, dVarH2, new imf0(((qh60) bVarI.O(qyd0Var)).s, 0L, t9i.E, n9i.a(), null, 0L, null, null, 3, 0L, null, null, 16744434), null, 0, false, 0, 0, new if1(ash0.b(R.dimen._4ssp, 48, bVarI), ash0.b(R.dimen._15ssp, 48, bVarI), ash0.b(R.dimen._1sdp, 48, bVarI)), bVarI, 0, 504);
                    bVarI.X(true);
                    bVarI.X(true);
                    zzrVarA = e0s.a(0, 3, bVarI);
                    objY3 = bVarI.y();
                    if (objY3 == c0042a) {
                        objY3 = xvf.i(e.a, bVarI);
                        bVarI.r(objY3);
                    }
                    v5bVar = (v5b) objY3;
                    objY4 = bVarI.y();
                    if (objY4 == c0042a) {
                        str2 = null;
                        objY4 = m.b(null);
                        bVarI.r(objY4);
                    } else {
                        str2 = null;
                    }
                    ytwVar = (ytw) objY4;
                    it = campaign2.getTiers().iterator();
                    do {
                        if (it.hasNext()) {
                            next = str2;
                            break;
                        }
                        next = it.next();
                    } while (b(((CampaignTier) next).getStatus()) == vsf0.d);
                    campaignTier = (CampaignTier) next;
                    if (campaignTier != null) {
                        status = campaignTier.getStatus();
                    } else {
                        status = str2;
                    }
                    vsf0VarB = b(status);
                    iC1 = (int) ((mmd) bVarI.O(kna.h)).C1(fw20.a(R.dimen._15sdp, bVarI));
                    Unit unit2 = Unit.a;
                    zA = bVarI.A(campaignTier) | bVarI.A(campaign2) | bVarI.M(zzrVarA) | bVarI.d(iC1);
                    objY5 = bVarI.y();
                    if (zA) {
                        objY5 = new n66(campaignTier, campaign2, zzrVarA, iC1, null);
                        bVarI.r(objY5);
                    } else {
                        objY5 = new n66(campaignTier, campaign2, zzrVarA, iC1, null);
                        bVarI.r(objY5);
                    }
                    xvf.e(bVarI, unit2, (Function2) objY5);
                    zA2 = bVarI.A(campaignTier) | bVarI.d(vsf0VarB.ordinal()) | bVarI.A(campaign2) | bVarI.A(v5bVar) | bVarI.M(zzrVarA);
                    objY6 = bVarI.y();
                    if (zA2) {
                        objY6 = new o66(campaignTier, vsf0VarB, campaign2, v5bVar, ytwVar, zzrVarA, null);
                        bVarI.r(objY6);
                    } else {
                        objY6 = new o66(campaignTier, vsf0VarB, campaign2, v5bVar, ytwVar, zzrVarA, null);
                        bVarI.r(objY6);
                    }
                    xvf.e(bVarI, vsf0VarB, (Function2) objY6);
                    d dVarJ5 = h.j(androidx.compose.foundation.a.b(j.e(aVar2, 1.0f), ((qh60) bVarI.O(sh60.a)).w, aVar3), fw20.a(R.dimen._10sdp, bVarI), 0.0f, fw20.a(R.dimen._10sdp, bVarI), 0.0f, 10);
                    kw0.i iVar3 = new kw0.i(fw20.a(R.dimen._8sdp, bVarI), true, new hw0());
                    boolean zA5 = bVarI.A(campaign2) | bVarI.A(db6Var) | bVarI.b(zG);
                    if ((i4 & 57344) == 16384) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zA3 = zA5 | z3 | bVarI.A(campaignTier);
                    objY7 = bVarI.y();
                    if (zA3) {
                        Function1 function5 = new Function1() { // from class: k66
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                szr szrVar = (szr) obj;
                                szrVar.getClass();
                                Campaign campaign3 = campaign2;
                                boolean z4 = campaign3.getTiers().size() == 1;
                                int size = campaign3.getTiers().size();
                                List<CampaignTier> tiers = campaign3.getTiers();
                                szrVar.d(tiers.size(), null, new p66(tiers), new op8(802480018, new q66(tiers, db6Var, z4, size, zG, campaign3, function1, campaignTier), true));
                                return Unit.a;
                            }
                        };
                        bVarI.r(function5);
                        objY7 = function5;
                    } else {
                        Function1 function6 = new Function1() { // from class: k66
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                szr szrVar = (szr) obj;
                                szrVar.getClass();
                                Campaign campaign3 = campaign2;
                                boolean z4 = campaign3.getTiers().size() == 1;
                                int size = campaign3.getTiers().size();
                                List<CampaignTier> tiers = campaign3.getTiers();
                                szrVar.d(tiers.size(), null, new p66(tiers), new op8(802480018, new q66(tiers, db6Var, z4, size, zG, campaign3, function1, campaignTier), true));
                                return Unit.a;
                            }
                        };
                        bVarI.r(function6);
                        objY7 = function6;
                    }
                    aur.a(dVarJ5, zzrVarA, null, false, iVar3, null, null, false, null, (Function1) objY7, bVarI, 0, 492);
                    bVarI = bVarI;
                }
                bVarI.X(false);
                bVarI.X(false);
            } else {
                if (gbh0Var2 == gbh0.b) {
                    bVarI.N(-1817822754);
                    d dVarJ6 = h.j(androidx.compose.foundation.a.b(j.e(aVar2, 1.0f), ((qh60) bVarI.O(qyd0Var)).w, aVar3), fw20.a(R.dimen._10sdp, bVarI), fw20.a(R.dimen._3sdp, bVarI), fw20.a(R.dimen._10sdp, bVarI), 0.0f, 8);
                    kw0.i iVar4 = new kw0.i(fw20.a(R.dimen._8sdp, bVarI), true, new hw0());
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new l66(0);
                        bVarI.r(objY2);
                    }
                    aur.a(dVarJ6, null, null, false, iVar4, null, null, false, null, (Function1) objY2, bVarI, 805306368, 494);
                    bVarI = bVarI;
                    bVarI.X(false);
                } else {
                    if (gbh0Var2 == gbh0.d) {
                        bVarI.N(-1816683597);
                        function3 = function2;
                        e76.a((i4 >> 12) & 112, bVarI, androidx.compose.foundation.a.b(j.c(j.g(aVar2, 1.0f), 1.0f), ((qh60) bVarI.O(qyd0Var)).w, aVar3), function3);
                        z2 = false;
                    } else {
                        function3 = function2;
                        z2 = false;
                        bVarI.N(-1830913713);
                    }
                    bVarI.X(z2);
                }
                bVarI.X(true);
            }
            function3 = function2;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final Function0 function7 = function3;
            eVarZ.d = new Function2() { // from class: m66
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t66.a(dVar, db6Var, str, function0, function1, function7, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final vsf0 b(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1384838526) {
                if (iHashCode != 620914836) {
                    if (iHashCode == 1383663147 && str.equals("COMPLETED")) {
                        return vsf0.d;
                    }
                } else if (str.equals("READY_TO_CLAIM")) {
                    return vsf0.b;
                }
            } else if (str.equals("REGISTERED")) {
                return vsf0.a;
            }
        }
        return vsf0.c;
    }
}
