package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.piggybash.data.model.http.PBBetHistoryItemDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
public final class v1t implements mum {
    public final b5 a;
    public final tv00 b;
    public final fb4 c;
    public final uv00 d;
    public final zxm e;
    public final eal f;
    public final ArrayList g;
    public final ArrayList h;
    public Long i;
    public Long j;
    public hxi0 k;
    public String l;
    public String m;
    public final mpe0 n;
    public final mpe0 o;
    public final mpe0 p;

    public v1t(b5 b5Var, tv00 tv00Var, fb4 fb4Var, uv00 uv00Var, zxm zxmVar, eal ealVar) {
        b5Var.getClass();
        zxmVar.getClass();
        ealVar.getClass();
        this.a = b5Var;
        this.b = tv00Var;
        this.c = fb4Var;
        this.d = uv00Var;
        this.e = zxmVar;
        this.f = ealVar;
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.k = new hxi0(0);
        this.n = hwr.b(new h1t(this, 0));
        this.o = hwr.b(new o7a(this, 1));
        this.p = hwr.b(new bio(this, 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mum
    public final Object a(x1b x1bVar) {
        t1t t1tVar;
        boolean isActive;
        if (x1bVar instanceof t1t) {
            t1tVar = (t1t) x1bVar;
            int i = t1tVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                t1tVar.c = i - Integer.MIN_VALUE;
            } else {
                t1tVar = new t1t(this, x1bVar);
            }
        } else {
            t1tVar = new t1t(this, x1bVar);
        }
        Object objF = t1tVar.a;
        y5b y5bVar = y5b.a;
        int i2 = t1tVar.c;
        if (i2 == 0) {
            uj50.b(objF);
            fox foxVar = fox.f;
            u1t u1tVar = new u1t(this, null);
            t1tVar.c = 1;
            objF = this.e.f(foxVar, u1tVar, t1tVar);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objF);
        }
        hqh0 hqh0Var = (hqh0) objF;
        if (hqh0Var != null) {
            String nickname = hqh0Var.getNickname();
            b5 b5Var = this.a;
            b5Var.setNickName(nickname);
            b5Var.setUserImage(hqh0Var.getAvatar());
            isActive = hqh0Var.getIsActive();
        } else {
            isActive = false;
        }
        return Boolean.valueOf(isActive);
    }

    @Override // defpackage.mum
    public final ArrayList b() {
        return this.g;
    }

    @Override // defpackage.mum
    public final Long c() {
        return this.j;
    }

    @Override // defpackage.mum
    public final String d() {
        return this.m;
    }

    @Override // defpackage.mum
    public final ArrayList e() {
        return this.h;
    }

    @Override // defpackage.mum
    public final void f() {
        this.h.clear();
        this.j = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mum
    public final Object g(String str, x1b x1bVar) {
        k1t k1tVar;
        ae7 ae7Var;
        if (x1bVar instanceof k1t) {
            k1tVar = (k1t) x1bVar;
            int i = k1tVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                k1tVar.c = i - Integer.MIN_VALUE;
            } else {
                k1tVar = new k1t(this, x1bVar);
            }
        } else {
            k1tVar = new k1t(this, x1bVar);
        }
        Object chatRoom = k1tVar.a;
        y5b y5bVar = y5b.a;
        int i2 = k1tVar.c;
        try {
            if (i2 == 0) {
                uj50.b(chatRoom);
                yc7 yc7Var = (yc7) this.p.getValue();
                k1tVar.c = 1;
                chatRoom = yc7Var.getChatRoom(str, k1tVar);
                if (chatRoom == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(chatRoom);
            }
            List list = (List) ((HTTPResponse) chatRoom).getData();
            if (list != null && (ae7Var = (ae7) CollectionsKt.firstOrNull(list)) != null) {
                this.l = ae7Var.getChatRoomId();
                this.m = ae7Var.getBotUserId();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mum
    public final Object h(x1b x1bVar) {
        p1t p1tVar;
        if (x1bVar instanceof p1t) {
            p1tVar = (p1t) x1bVar;
            int i = p1tVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p1tVar.c = i - Integer.MIN_VALUE;
            } else {
                p1tVar = new p1t(this, x1bVar);
            }
        } else {
            p1tVar = new p1t(this, x1bVar);
        }
        Object objF = p1tVar.a;
        y5b y5bVar = y5b.a;
        int i2 = p1tVar.c;
        if (i2 == 0) {
            uj50.b(objF);
            fox foxVar = fox.e;
            q1t q1tVar = new q1t(this, null);
            p1tVar.c = 1;
            objF = this.e.f(foxVar, q1tVar, p1tVar);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objF);
        }
        phj phjVar = (phj) objF;
        if (phjVar != null) {
            return Boolean.valueOf(phjVar.getIsAvailable());
        }
        return null;
    }

    @Override // defpackage.mum
    public final Long i() {
        return this.i;
    }

    @Override // defpackage.mum
    public final String j() {
        return this.l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mum
    public final Object k(double d, long j, x1b x1bVar) {
        r1t r1tVar;
        if (x1bVar instanceof r1t) {
            r1tVar = (r1t) x1bVar;
            int i = r1tVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                r1tVar.d = i - Integer.MIN_VALUE;
            } else {
                r1tVar = new r1t(this, x1bVar);
            }
        } else {
            r1tVar = new r1t(this, x1bVar);
        }
        Object objF = r1tVar.b;
        y5b y5bVar = y5b.a;
        int i2 = r1tVar.d;
        boolean z = true;
        if (i2 == 0) {
            uj50.b(objF);
            fox foxVar = fox.b;
            s1t s1tVar = new s1t(this, j, null);
            r1tVar.a = j;
            r1tVar.d = 1;
            objF = this.e.f(foxVar, s1tVar, r1tVar);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = r1tVar.a;
            uj50.b(objF);
        }
        u9p u9pVar = (u9p) objF;
        if (u9pVar != null) {
            List<String> listB = u9pVar.b();
            if (listB != null) {
                this.i = new Long(j);
                this.j = new Long(u9pVar.getJoinKey());
                ArrayList arrayList = this.h;
                arrayList.clear();
                arrayList.addAll(listB);
            }
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.mum
    public final Object l(x1b x1bVar) {
        n1t n1tVar;
        zzd0 zzd0Var;
        Object aVar;
        if (x1bVar instanceof n1t) {
            n1tVar = (n1t) x1bVar;
            int i = n1tVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n1tVar.c = i - Integer.MIN_VALUE;
            } else {
                n1tVar = new n1t(this, x1bVar);
            }
        } else {
            n1tVar = new n1t(this, x1bVar);
        }
        Object objG = n1tVar.a;
        y5b y5bVar = y5b.a;
        int i2 = n1tVar.c;
        if (i2 == 0) {
            uj50.b(objG);
            fox foxVar = fox.d;
            o1t o1tVar = new o1t(this, null);
            n1tVar.c = 1;
            objG = this.e.g(foxVar, o1tVar, n1tVar);
            if (objG == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objG);
        }
        HTTPResponse hTTPResponse = (HTTPResponse) objG;
        if (hTTPResponse == null) {
            return null;
        }
        Integer bizCode = hTTPResponse.getBizCode();
        if (bizCode != null && bizCode.intValue() == 4010) {
            return tye.b.a;
        }
        b0e0 b0e0Var = (b0e0) hTTPResponse.getData();
        if (b0e0Var == null) {
            return null;
        }
        eal ealVar = this.f;
        ealVar.getClass();
        try {
            String gameStatus = b0e0Var.getGameStatus();
            dq7 dq7VarA = Intrinsics.g(gameStatus, "MATCHMAKING") ? jq40.a(zzd0.c.class) : Intrinsics.g(gameStatus, "IN_PROGRESS") ? jq40.a(zzd0.b.class) : null;
            if (dq7VarA == null || (zzd0Var = (zzd0) ealVar.b(b0e0Var.getCom.twilio.voice.EventKeys.PAYLOAD java.lang.String(), tgp.b(dq7VarA))) == null) {
                String gameStatus2 = b0e0Var.getGameStatus();
                int iHashCode = gameStatus2.hashCode();
                if (iHashCode != -1031784143) {
                    if (iHashCode != 108966002) {
                        zzd0Var = (iHashCode == 2058938941 && gameStatus2.equals("EXITED")) ? zzd0.d.a : null;
                    } else if (gameStatus2.equals("FINISHED")) {
                        zzd0Var = zzd0.e.a;
                    }
                } else if (gameStatus2.equals(PBBetHistoryItemDTO.STATUS_CANCELLED)) {
                    zzd0Var = zzd0.a.a;
                }
            }
        } catch (Exception unused) {
        }
        if (zzd0Var == null) {
            return null;
        }
        String countryCurrency = this.a.getCountryCurrency();
        if (countryCurrency == null) {
            countryCurrency = "";
        }
        String str = countryCurrency;
        if (zzd0Var instanceof zzd0.c) {
            zzd0.c cVar = (zzd0.c) zzd0Var;
            aVar = new tye.c(cVar.getJoinKey(), cVar.getMatchmakingStatus(), cVar.c(), x2d.h(cVar.getRoomTheme()), cVar.getRoomConfigId());
        } else if (zzd0Var instanceof zzd0.b) {
            zzd0.b bVar = (zzd0.b) zzd0Var;
            long roundId = bVar.getRoundId();
            List<String> listH = bVar.h();
            List<dq10> listC = bVar.c();
            ArrayList arrayList = new ArrayList(l48.r(listC, 10));
            for (dq10 dq10Var : listC) {
                arrayList.add(new rye(dq10Var.getPlayerId(), dq10Var.getNickname()));
            }
            aVar = new tye.a(roundId, listH, arrayList, bVar.getPlayerId(), bVar.getHitsLeft(), bVar.getTotalPrizePool(), bVar.getRoundEndSeconds(), x2d.h(bVar.getRoomTheme()), str, bVar.getRoomConfigId());
        } else {
            aVar = tye.b.a;
        }
        if (aVar == null) {
            return null;
        }
        if (aVar instanceof tye.a) {
            this.i = new Long(((tye.a) aVar).j);
        } else if (aVar instanceof tye.c) {
            tye.c cVar2 = (tye.c) aVar;
            this.i = new Long(cVar2.e);
            this.j = new Long(cVar2.a);
            ArrayList arrayList2 = this.h;
            arrayList2.clear();
            Collection collection = cVar2.c;
            if (collection == null) {
                collection = m2g.a;
            }
            arrayList2.addAll(collection);
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.mum
    public final Object m(x1b x1bVar) {
        i1t i1tVar;
        if (x1bVar instanceof i1t) {
            i1tVar = (i1t) x1bVar;
            int i = i1tVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i1tVar.c = i - Integer.MIN_VALUE;
            } else {
                i1tVar = new i1t(this, x1bVar);
            }
        } else {
            i1tVar = new i1t(this, x1bVar);
        }
        Object objF = i1tVar.a;
        y5b y5bVar = y5b.a;
        int i2 = i1tVar.c;
        boolean z = true;
        if (i2 == 0) {
            uj50.b(objF);
            fox foxVar = fox.a;
            j1t j1tVar = new j1t(this, null);
            i1tVar.c = 1;
            objF = this.e.f(foxVar, j1tVar, i1tVar);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objF);
        }
        List<cw50> list = (List) objF;
        if (list != null) {
            ArrayList arrayList = this.g;
            arrayList.clear();
            ArrayList arrayList2 = new ArrayList(l48.r(list, 10));
            for (cw50 cw50Var : list) {
                String countryCurrency = this.a.getCountryCurrency();
                if (countryCurrency == null) {
                    countryCurrency = "";
                }
                String str = countryCurrency;
                cw50Var.getClass();
                long roomConfigId = cw50Var.getRoomConfigId();
                String roomName = cw50Var.getRoomName();
                Double dH = b.h(cw50Var.getMaxWinAmount());
                arrayList2.add(new if80(roomConfigId, roomName, str, dH != null ? dH.doubleValue() : 0.0d, cw50Var.getEntryFeeAmount(), cw50Var.getActivePlayerCount(), cw50Var.getIsSpecial(), x2d.h(cw50Var.getTheme()), x2d.g(x2d.h(cw50Var.getTheme()))));
            }
            arrayList.addAll(arrayList2);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mum
    public final Object n(x1b x1bVar) {
        l1t l1tVar;
        if (x1bVar instanceof l1t) {
            l1tVar = (l1t) x1bVar;
            int i = l1tVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l1tVar.c = i - Integer.MIN_VALUE;
            } else {
                l1tVar = new l1t(this, x1bVar);
            }
        } else {
            l1tVar = new l1t(this, x1bVar);
        }
        Object objF = l1tVar.a;
        y5b y5bVar = y5b.a;
        int i2 = l1tVar.c;
        if (i2 == 0) {
            uj50.b(objF);
            fox foxVar = fox.c;
            m1t m1tVar = new m1t(this, null);
            l1tVar.c = 1;
            objF = this.e.f(foxVar, m1tVar, l1tVar);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objF);
        }
        ixi0 ixi0Var = (ixi0) objF;
        if (ixi0Var == null) {
            return this.k;
        }
        double d = ixi0Var.getCom.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon.GAMES_WALLET_UPDATE_BALANCE_ARGUMENT java.lang.String();
        String countryCurrency = this.a.getCountryCurrency();
        if (countryCurrency == null) {
            countryCurrency = ixi0Var.getCurrency();
        }
        hxi0 hxi0Var = new hxi0(d, countryCurrency);
        this.k = hxi0Var;
        return hxi0Var;
    }
}
