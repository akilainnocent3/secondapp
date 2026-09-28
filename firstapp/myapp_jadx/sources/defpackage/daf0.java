package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sportybet.feature.dedicatedteampage.shared.data.model.PaginatedResponseDto;
import com.sportybet.feature.dedicatedteampage.team.data.model.EventDataDto;
import com.sportybet.feature.dedicatedteampage.team.data.model.FeedDto;
import com.sportybet.feature.dedicatedteampage.team.data.model.TeamDetailDto;
import com.sportybet.feature.dedicatedteampage.team.data.model.TournamentDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class daf0 implements x9f0 {
    public final q9f0 a;

    public daf0(q9f0 q9f0Var) {
        this.a = q9f0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.x9f0
    public final Object a(int i, x1b x1bVar, String str, String str2) {
        baf0 baf0Var;
        Object objA;
        if (x1bVar instanceof baf0) {
            baf0Var = (baf0) x1bVar;
            int i2 = baf0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baf0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                baf0Var = new baf0(this, x1bVar);
            }
        } else {
            baf0Var = new baf0(this, x1bVar);
        }
        Object obj = baf0Var.a;
        y5b y5bVar = y5b.a;
        int i3 = baf0Var.c;
        if (i3 == 0) {
            uj50.b(obj);
            baf0Var.c = 1;
            objA = this.a.a(i, baf0Var, str, str2);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objA = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (objA instanceof zi50.b) {
            return objA;
        }
        try {
            PaginatedResponseDto paginatedResponseDto = (PaginatedResponseDto) objA;
            List data = paginatedResponseDto.getData();
            ArrayList arrayList = new ArrayList(l48.r(data, 10));
            Iterator it = data.iterator();
            while (it.hasNext()) {
                arrayList.add(rlc.i((FeedDto) it.next()));
            }
            return new hqz(paginatedResponseDto.getFlag(), arrayList, paginatedResponseDto.getHasNextPage());
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.x9f0
    public final Object b(String str, x1b x1bVar) {
        caf0 caf0Var;
        Object objB;
        if (x1bVar instanceof caf0) {
            caf0Var = (caf0) x1bVar;
            int i = caf0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                caf0Var.c = i - Integer.MIN_VALUE;
            } else {
                caf0Var = new caf0(this, x1bVar);
            }
        } else {
            caf0Var = new caf0(this, x1bVar);
        }
        Object obj = caf0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = caf0Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            caf0Var.c = 1;
            objB = this.a.b(str, caf0Var);
            if (objB == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objB = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (objB instanceof zi50.b) {
            return objB;
        }
        try {
            List<TournamentDto> list = (List) objB;
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            for (TournamentDto tournamentDto : list) {
                Set<String> set = b7f0.a;
                tournamentDto.getClass();
                String id = tournamentDto.getId();
                String radarId = tournamentDto.getRadarId();
                String displayName = tournamentDto.getDisplayName();
                if (displayName == null) {
                    displayName = tournamentDto.getName();
                }
                String logoUri = tournamentDto.getLogoUri();
                if (logoUri == null) {
                    logoUri = "";
                }
                arrayList.add(new a4g0(id, radarId, displayName, logoUri));
            }
            return arrayList;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.x9f0
    public final Object c(String str, x1b x1bVar) {
        aaf0 aaf0Var;
        Object objC;
        if (x1bVar instanceof aaf0) {
            aaf0Var = (aaf0) x1bVar;
            int i = aaf0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aaf0Var.c = i - Integer.MIN_VALUE;
            } else {
                aaf0Var = new aaf0(this, x1bVar);
            }
        } else {
            aaf0Var = new aaf0(this, x1bVar);
        }
        Object obj = aaf0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = aaf0Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            aaf0Var.c = 1;
            objC = this.a.c(str, aaf0Var);
            if (objC == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objC = ((zi50) obj).a;
        }
        Set<String> set = b7f0.a;
        Throwable thA = zi50.a(objC);
        if (thA != null) {
            SprThrowable sprThrowable = thA instanceof SprThrowable ? (SprThrowable) thA : null;
            Integer numValueOf = sprThrowable != null ? Integer.valueOf(sprThrowable.getD()) : null;
            if (numValueOf != null && numValueOf.intValue() == 40002) {
                thA = new g6f0.a();
            }
            return new zi50.b(thA);
        }
        TeamDetailDto teamDetailDto = (TeamDetailDto) objC;
        String displayName = teamDetailDto.getDisplayName();
        if (displayName == null && (displayName = teamDetailDto.getName()) == null) {
            displayName = "";
        }
        String logoUri = teamDetailDto.getLogoUri();
        return new f6f0(displayName, logoUri != null ? logoUri : "");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.x9f0
    public final Object d(String str, String str2, int i, String str3, x1b x1bVar) {
        y9f0 y9f0Var;
        Object objD;
        if (x1bVar instanceof y9f0) {
            y9f0Var = (y9f0) x1bVar;
            int i2 = y9f0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y9f0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                y9f0Var = new y9f0(this, x1bVar);
            }
        } else {
            y9f0Var = new y9f0(this, x1bVar);
        }
        y9f0 y9f0Var2 = y9f0Var;
        Object obj = y9f0Var2.a;
        y5b y5bVar = y5b.a;
        int i3 = y9f0Var2.c;
        if (i3 == 0) {
            uj50.b(obj);
            y9f0Var2.c = 1;
            objD = this.a.d(str, str2, i, str3, y9f0Var2);
            if (objD == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objD = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (objD instanceof zi50.b) {
            return objD;
        }
        try {
            PaginatedResponseDto paginatedResponseDto = (PaginatedResponseDto) objD;
            List data = paginatedResponseDto.getData();
            ArrayList arrayList = new ArrayList(l48.r(data, 10));
            Iterator it = data.iterator();
            while (it.hasNext()) {
                arrayList.add(b7f0.a((EventDataDto) it.next()));
            }
            return new hqz(paginatedResponseDto.getFlag(), arrayList, paginatedResponseDto.getHasNextPage());
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            return new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.x9f0
    public final Object e(String str, String str2, int i, String str3, x1b x1bVar) {
        z9f0 z9f0Var;
        Object objE;
        if (x1bVar instanceof z9f0) {
            z9f0Var = (z9f0) x1bVar;
            int i2 = z9f0Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z9f0Var.c = i2 - Integer.MIN_VALUE;
            } else {
                z9f0Var = new z9f0(this, x1bVar);
            }
        } else {
            z9f0Var = new z9f0(this, x1bVar);
        }
        z9f0 z9f0Var2 = z9f0Var;
        Object obj = z9f0Var2.a;
        y5b y5bVar = y5b.a;
        int i3 = z9f0Var2.c;
        if (i3 == 0) {
            uj50.b(obj);
            z9f0Var2.c = 1;
            objE = this.a.e(str, str2, i, str3, z9f0Var2);
            if (objE == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objE = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (objE instanceof zi50.b) {
            return objE;
        }
        try {
            PaginatedResponseDto paginatedResponseDto = (PaginatedResponseDto) objE;
            List data = paginatedResponseDto.getData();
            ArrayList arrayList = new ArrayList(l48.r(data, 10));
            Iterator it = data.iterator();
            while (it.hasNext()) {
                arrayList.add(b7f0.a((EventDataDto) it.next()));
            }
            return new hqz(paginatedResponseDto.getFlag(), arrayList, paginatedResponseDto.getHasNextPage());
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            return new zi50.b(th);
        }
    }
}
