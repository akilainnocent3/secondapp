package defpackage;

import android.accounts.Account;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.matchalert.SubscribedEventDto;
import com.sporty.android.core.model.matchalert.SubscribedEventsResponse;
import com.sporty.android.core.model.pageable.Pageable;
import com.sporty.android.platform.features.settings.notification.matchalert.data.db.MatchAlertDatabase;
import com.sporty.android.platform.features.settings.notification.matchalert.data.db.entity.SubscribedEventEntity;
import com.sporty.android.platform.features.settings.notification.matchalert.data.db.entity.SubscribedEventPagingCursorEntity;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class luu extends r650<Integer, SubscribedEventEntity> {
    public final y7h a;
    public final MatchAlertDatabase b;
    public final uqm c;
    public final wsm d;

    public luu(y7h y7hVar, MatchAlertDatabase matchAlertDatabase, uqm uqmVar, wsm wsmVar) {
        y7hVar.getClass();
        uqmVar.getClass();
        wsmVar.getClass();
        this.a = y7hVar;
        this.b = matchAlertDatabase;
        this.c = uqmVar;
        this.d = wsmVar;
    }

    @Override // defpackage.r650
    public final Object b(kxs kxsVar, xqz xqzVar, tje0 tje0Var) {
        int iOrdinal = kxsVar.ordinal();
        if (iOrdinal == 0) {
            return c(xqzVar, true, tje0Var);
        }
        if (iOrdinal == 1) {
            return new r650.b.C1034b(true);
        }
        if (iOrdinal == 2) {
            return c(xqzVar, false, tje0Var);
        }
        uhc.a();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(xqz xqzVar, boolean z, x1b x1bVar) {
        juu juuVar;
        Object bVar;
        String str;
        xqz xqzVar2;
        String str2;
        boolean z2;
        luu luuVar;
        int i;
        int i2;
        String str3;
        boolean z3;
        Pageable<SubscribedEventDto> page;
        List<SubscribedEventDto> entityList;
        List<SubscribedEventDto> list;
        if (x1bVar instanceof juu) {
            juuVar = (juu) x1bVar;
            int i3 = juuVar.z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                juuVar.z = i3 - Integer.MIN_VALUE;
            } else {
                juuVar = new juu(this, x1bVar);
            }
        } else {
            juuVar = new juu(this, x1bVar);
        }
        Object objB = juuVar.w;
        y5b y5bVar = y5b.a;
        int i4 = juuVar.z;
        int pageNo = 1;
        try {
            if (i4 == 0) {
                uj50.b(objB);
                zi50.a aVar = zi50.b;
                Account account = this.c.getAccount();
                if (account == null || (str = account.name) == null) {
                    throw new Throwable("AccountName is null.");
                }
                sde0 sde0VarY = this.b.y();
                xqzVar2 = xqzVar;
                juuVar.a = xqzVar2;
                juuVar.b = this;
                juuVar.c = str;
                juuVar.f = z;
                juuVar.z = 1;
                Object objC = sde0VarY.c(str, juuVar);
                if (objC != y5bVar) {
                    str2 = str;
                    objB = objC;
                    z2 = z;
                    luuVar = this;
                }
                return y5bVar;
            }
            if (i4 == 1) {
                z2 = juuVar.f;
                String str4 = juuVar.c;
                luu luuVar2 = juuVar.b;
                xqz xqzVar3 = juuVar.a;
                uj50.b(objB);
                str2 = str4;
                xqzVar2 = xqzVar3;
                luuVar = luuVar2;
            } else {
                if (i4 == 2) {
                    int i5 = juuVar.v;
                    int i6 = juuVar.i;
                    boolean z4 = juuVar.f;
                    String str5 = juuVar.d;
                    luu luuVar3 = juuVar.b;
                    uj50.b(objB);
                    i = i5;
                    i2 = i6;
                    str3 = str5;
                    luuVar = luuVar3;
                    z3 = z4;
                    page = ((SubscribedEventsResponse) n52.b((BaseResponse) objB)).getPage();
                    if (page != null || (entityList = page.getEntityList()) == null) {
                        throw new Exception("The page data is null");
                    }
                    MatchAlertDatabase matchAlertDatabase = luuVar.b;
                    kuu kuuVar = new kuu(z3, luuVar, str3, entityList, i, i2, null);
                    juuVar.a = null;
                    juuVar.b = null;
                    juuVar.c = null;
                    juuVar.d = null;
                    juuVar.e = entityList;
                    juuVar.f = z3;
                    juuVar.i = i2;
                    juuVar.v = i;
                    juuVar.z = 3;
                    if (qv50.b(matchAlertDatabase, kuuVar, juuVar) != y5bVar) {
                        list = entityList;
                    }
                    return y5bVar;
                }
                if (i4 != 3) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = juuVar.e;
                uj50.b(objB);
            }
            bVar = new r650.b.C1034b(list.isEmpty());
            zi50.a aVar2 = zi50.b;
            Throwable thA = zi50.a(bVar);
            if (thA != null) {
                this.d.g("Caught exception in MatchAlertPagingMediator.fetchRemote", "", thA, m2g.a);
            }
            Throwable thA2 = zi50.a(bVar);
            return thA2 == null ? bVar : new r650.b.a(thA2);
            SubscribedEventPagingCursorEntity subscribedEventPagingCursorEntity = (SubscribedEventPagingCursorEntity) objB;
            int i7 = xqzVar2.c.a;
            if (!z2 && subscribedEventPagingCursorEntity != null) {
                pageNo = 1 + subscribedEventPagingCursorEntity.getPageNo();
            }
            y7h y7hVar = luuVar.a;
            juuVar.a = null;
            juuVar.b = luuVar;
            juuVar.c = null;
            juuVar.d = str2;
            juuVar.f = z2;
            juuVar.i = i7;
            juuVar.v = pageNo;
            juuVar.z = 2;
            objB = y7hVar.b(pageNo, i7, juuVar);
            if (objB != y5bVar) {
                i = pageNo;
                i2 = i7;
                str3 = str2;
                z3 = z2;
                page = ((SubscribedEventsResponse) n52.b((BaseResponse) objB)).getPage();
                if (page != null) {
                }
                throw new Exception("The page data is null");
            }
            return y5bVar;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
    }
}
