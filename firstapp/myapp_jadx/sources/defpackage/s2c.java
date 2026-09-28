package defpackage;

import android.util.Pair;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.social.data.local.CCPDatabase;
import com.sportybet.android.social.data.local.CreatorCreditEntity;
import com.sportybet.android.social.data.local.CreatorCreditsCursorEntity;
import com.sportybet.android.social.data.remote.entity.CreatorCreditsData;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes6.dex */
public final class s2c extends r650<Integer, CreatorCreditEntity> {
    public final String a;
    public final CCPDatabase b;
    public final h1c c;

    public s2c(String str, CCPDatabase cCPDatabase, h1c h1cVar) {
        str.getClass();
        this.a = str;
        this.b = cCPDatabase;
        this.c = h1cVar;
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

    /* JADX WARN: Code duplicated, block: B:44:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object c(xqz xqzVar, boolean z, x1b x1bVar) {
        q2c q2cVar;
        boolean z2;
        xqz xqzVar2;
        int i;
        boolean z3;
        CreatorCreditsData creatorCreditsData;
        r2c r2cVar;
        CreatorCreditsData creatorCreditsData2;
        if (x1bVar instanceof q2c) {
            q2cVar = (q2c) x1bVar;
            int i2 = q2cVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q2cVar.v = i2 - Integer.MIN_VALUE;
            } else {
                q2cVar = new q2c(this, x1bVar);
            }
        } else {
            q2cVar = new q2c(this, x1bVar);
        }
        q2c q2cVar2 = q2cVar;
        Object objC = q2cVar2.f;
        y5b y5bVar = y5b.a;
        int i3 = q2cVar2.v;
        String str = this.a;
        CCPDatabase cCPDatabase = this.b;
        int pageNo = 1;
        try {
            if (i3 == 0) {
                uj50.b(objC);
                i1c i1cVarX = cCPDatabase.x();
                q2cVar2.a = xqzVar;
                z2 = z;
                q2cVar2.c = z2;
                q2cVar2.v = 1;
                objC = i1cVarX.c(str, q2cVar2);
                if (objC != y5bVar) {
                    xqzVar2 = xqzVar;
                }
                return y5bVar;
            }
            if (i3 == 1) {
                boolean z4 = q2cVar2.c;
                xqz xqzVar3 = q2cVar2.a;
                uj50.b(objC);
                z2 = z4;
                xqzVar2 = xqzVar3;
            } else {
                if (i3 == 2) {
                    int i4 = q2cVar2.e;
                    int i5 = q2cVar2.d;
                    boolean z5 = q2cVar2.c;
                    uj50.b(objC);
                    pageNo = i4;
                    z3 = z5;
                    i = i5;
                    creatorCreditsData = (CreatorCreditsData) n52.b((BaseResponse) objC);
                    r2cVar = new r2c(z3, this, creatorCreditsData, pageNo, i, null);
                    q2cVar2.a = null;
                    q2cVar2.b = creatorCreditsData;
                    q2cVar2.c = z3;
                    q2cVar2.d = i;
                    q2cVar2.e = pageNo;
                    q2cVar2.v = 3;
                    if (qv50.b(cCPDatabase, r2cVar, q2cVar2) != y5bVar) {
                        creatorCreditsData2 = creatorCreditsData;
                    }
                    return y5bVar;
                }
                if (i3 != 3) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                creatorCreditsData2 = q2cVar2.b;
                uj50.b(objC);
            }
            return new r650.b.C1034b(creatorCreditsData2.getEntityList().isEmpty());
            CreatorCreditsCursorEntity creatorCreditsCursorEntity = (CreatorCreditsCursorEntity) objC;
            int i6 = xqzVar2.c.a;
            if (!z2 && creatorCreditsCursorEntity != null) {
                pageNo = 1 + creatorCreditsCursorEntity.getPageNo();
            }
            h1c h1cVar = this.c;
            q2cVar2.a = null;
            q2cVar2.c = z2;
            q2cVar2.d = i6;
            q2cVar2.e = pageNo;
            q2cVar2.v = 2;
            objC = h1cVar.c(pageNo, i6, q2cVar2);
            if (objC != y5bVar) {
                boolean z6 = z2;
                i = i6;
                z3 = z6;
                creatorCreditsData = (CreatorCreditsData) n52.b((BaseResponse) objC);
                r2cVar = new r2c(z3, this, creatorCreditsData, pageNo, i, null);
                q2cVar2.a = null;
                q2cVar2.b = creatorCreditsData;
                q2cVar2.c = z3;
                q2cVar2.d = i;
                q2cVar2.e = pageNo;
                q2cVar2.v = 3;
                if (qv50.b(cCPDatabase, r2cVar, q2cVar2) != y5bVar) {
                    creatorCreditsData2 = creatorCreditsData;
                    return new r650.b.C1034b(creatorCreditsData2.getEntityList().isEmpty());
                }
            }
            return y5bVar;
        } catch (Throwable th) {
            w950.a("CreatorCreditsMediator", "getCreatorCredits", th, a.c(new Pair("userId", str)));
            return new r650.b.a(th);
        }
    }
}
