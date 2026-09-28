package defpackage;

import android.util.Pair;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.social.data.local.CCPDatabase;
import com.sportybet.android.social.data.local.CreatorCreditHistoryEntity;
import com.sportybet.android.social.data.local.CreatorCreditsHistoryCursorEntity;
import com.sportybet.android.social.data.remote.entity.CreatorCreditsData;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes6.dex */
public final class o2c extends r650<Integer, CreatorCreditHistoryEntity> {
    public final String a;
    public final boolean b;
    public final CCPDatabase c;
    public final h1c d;

    public o2c(String str, boolean z, CCPDatabase cCPDatabase, h1c h1cVar) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = cCPDatabase;
        this.d = h1cVar;
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

    /* JADX WARN: Code duplicated, block: B:58:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object c(xqz xqzVar, boolean z, x1b x1bVar) {
        m2c m2cVar;
        xqz xqzVar2;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        CreatorCreditsData creatorCreditsData;
        CreatorCreditsData creatorCreditsData2;
        n2c n2cVar;
        CreatorCreditsData creatorCreditsData3;
        if (x1bVar instanceof m2c) {
            m2cVar = (m2c) x1bVar;
            int i3 = m2cVar.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m2cVar.v = i3 - Integer.MIN_VALUE;
            } else {
                m2cVar = new m2c(this, x1bVar);
            }
        } else {
            m2cVar = new m2c(this, x1bVar);
        }
        m2c m2cVar2 = m2cVar;
        Object objA = m2cVar2.f;
        y5b y5bVar = y5b.a;
        int i4 = m2cVar2.v;
        boolean z4 = this.b;
        String str = this.a;
        CCPDatabase cCPDatabase = this.c;
        int pageNo = 1;
        try {
            if (i4 == 0) {
                uj50.b(objA);
                b2c b2cVarZ = cCPDatabase.z();
                m2cVar2.a = xqzVar;
                m2cVar2.c = z;
                m2cVar2.v = 1;
                objA = b2cVarZ.a(str, z4, m2cVar2);
                if (objA != y5bVar) {
                    xqzVar2 = xqzVar;
                    z2 = z;
                }
                return y5bVar;
            }
            if (i4 == 1) {
                z2 = m2cVar2.c;
                xqzVar2 = m2cVar2.a;
                uj50.b(objA);
            } else {
                if (i4 == 2) {
                    i = m2cVar2.e;
                    i2 = m2cVar2.d;
                    z3 = m2cVar2.c;
                    uj50.b(objA);
                    creatorCreditsData = (CreatorCreditsData) n52.b((BaseResponse) objA);
                    boolean z5 = z3;
                    int i5 = i;
                    int i6 = i2;
                    creatorCreditsData2 = creatorCreditsData;
                    n2cVar = new n2c(z5, this, creatorCreditsData2, i5, i6, null);
                    m2cVar2.a = null;
                    m2cVar2.b = creatorCreditsData2;
                    m2cVar2.c = z5;
                    m2cVar2.d = i6;
                    m2cVar2.e = i5;
                    m2cVar2.v = 4;
                    if (qv50.b(cCPDatabase, n2cVar, m2cVar2) != y5bVar) {
                        creatorCreditsData3 = creatorCreditsData2;
                    }
                    return y5bVar;
                }
                if (i4 == 3) {
                    i = m2cVar2.e;
                    i2 = m2cVar2.d;
                    z3 = m2cVar2.c;
                    uj50.b(objA);
                    creatorCreditsData = (CreatorCreditsData) n52.b((BaseResponse) objA);
                    boolean z6 = z3;
                    int i7 = i;
                    int i8 = i2;
                    creatorCreditsData2 = creatorCreditsData;
                    n2cVar = new n2c(z6, this, creatorCreditsData2, i7, i8, null);
                    m2cVar2.a = null;
                    m2cVar2.b = creatorCreditsData2;
                    m2cVar2.c = z6;
                    m2cVar2.d = i8;
                    m2cVar2.e = i7;
                    m2cVar2.v = 4;
                    if (qv50.b(cCPDatabase, n2cVar, m2cVar2) != y5bVar) {
                        creatorCreditsData3 = creatorCreditsData2;
                    }
                    return y5bVar;
                }
                if (i4 != 4) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                creatorCreditsData3 = m2cVar2.b;
                uj50.b(objA);
            }
            return new r650.b.C1034b(creatorCreditsData3.getEntityList().isEmpty());
            CreatorCreditsHistoryCursorEntity creatorCreditsHistoryCursorEntity = (CreatorCreditsHistoryCursorEntity) objA;
            int i9 = xqzVar2.c.a;
            if (!z2 && creatorCreditsHistoryCursorEntity != null) {
                pageNo = 1 + creatorCreditsHistoryCursorEntity.getPageNo();
            }
            h1c h1cVar = this.d;
            if (z4) {
                m2cVar2.a = null;
                m2cVar2.c = z2;
                m2cVar2.d = i9;
                m2cVar2.e = pageNo;
                m2cVar2.v = 2;
                objA = h1cVar.b(pageNo, i9, m2cVar2);
                if (objA != y5bVar) {
                    z3 = z2;
                    i = pageNo;
                    i2 = i9;
                    creatorCreditsData = (CreatorCreditsData) n52.b((BaseResponse) objA);
                    boolean z7 = z3;
                    int i10 = i;
                    int i11 = i2;
                    creatorCreditsData2 = creatorCreditsData;
                    n2cVar = new n2c(z7, this, creatorCreditsData2, i10, i11, null);
                    m2cVar2.a = null;
                    m2cVar2.b = creatorCreditsData2;
                    m2cVar2.c = z7;
                    m2cVar2.d = i11;
                    m2cVar2.e = i10;
                    m2cVar2.v = 4;
                    if (qv50.b(cCPDatabase, n2cVar, m2cVar2) != y5bVar) {
                        creatorCreditsData3 = creatorCreditsData2;
                        return new r650.b.C1034b(creatorCreditsData3.getEntityList().isEmpty());
                    }
                }
            } else {
                m2cVar2.a = null;
                m2cVar2.c = z2;
                m2cVar2.d = i9;
                m2cVar2.e = pageNo;
                m2cVar2.v = 3;
                objA = h1cVar.d(pageNo, i9, m2cVar2);
                if (objA != y5bVar) {
                    z3 = z2;
                    i = pageNo;
                    i2 = i9;
                    creatorCreditsData = (CreatorCreditsData) n52.b((BaseResponse) objA);
                    boolean z8 = z3;
                    int i12 = i;
                    int i13 = i2;
                    creatorCreditsData2 = creatorCreditsData;
                    n2cVar = new n2c(z8, this, creatorCreditsData2, i12, i13, null);
                    m2cVar2.a = null;
                    m2cVar2.b = creatorCreditsData2;
                    m2cVar2.c = z8;
                    m2cVar2.d = i13;
                    m2cVar2.e = i12;
                    m2cVar2.v = 4;
                    if (qv50.b(cCPDatabase, n2cVar, m2cVar2) != y5bVar) {
                        creatorCreditsData3 = creatorCreditsData2;
                        return new r650.b.C1034b(creatorCreditsData3.getEntityList().isEmpty());
                    }
                }
            }
            return y5bVar;
        } catch (Throwable th) {
            w950.a("CreatorCreditsHistoryMediator", "getCreatorCreditsHistory", th, a.c(new Pair("userId", str)));
            return new r650.b.a(th);
        }
    }
}
