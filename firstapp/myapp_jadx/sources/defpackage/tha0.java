package defpackage;

import android.util.Pair;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.social.data.local.SocShareCodeCursorEntity;
import com.sportybet.android.social.data.local.SocShareCodeEntity;
import com.sportybet.android.social.data.local.SocialDatabase;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes6.dex */
public final class tha0 extends r650<Integer, SocShareCodeEntity> {
    public final y7a0 a;
    public final SocialDatabase b;
    public final x7a0 c;
    public final gbd0 d;

    public tha0(y7a0 y7a0Var, SocialDatabase socialDatabase, x7a0 x7a0Var, gbd0 gbd0Var) {
        this.a = y7a0Var;
        this.b = socialDatabase;
        this.c = x7a0Var;
        this.d = gbd0Var;
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

    /* JADX WARN: Code duplicated, block: B:58:0x010a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object c(xqz xqzVar, boolean z, x1b x1bVar) {
        rha0 rha0Var;
        xqz xqzVar2;
        String str;
        boolean z2;
        boolean z3;
        String str2;
        int i;
        int i2;
        List list;
        List list2;
        sha0 sha0Var;
        List list3;
        if (x1bVar instanceof rha0) {
            rha0Var = (rha0) x1bVar;
            int i3 = rha0Var.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rha0Var.w = i3 - Integer.MIN_VALUE;
            } else {
                rha0Var = new rha0(this, x1bVar);
            }
        } else {
            rha0Var = new rha0(this, x1bVar);
        }
        rha0 rha0Var2 = rha0Var;
        Object obj = rha0Var2.i;
        y5b y5bVar = y5b.a;
        int i4 = rha0Var2.w;
        SocialDatabase socialDatabase = this.b;
        y7a0 y7a0Var = this.a;
        try {
            if (i4 == 0) {
                uj50.b(obj);
                String str3 = y7a0Var.a;
                gha0 gha0VarB = socialDatabase.B();
                xqzVar2 = xqzVar;
                rha0Var2.a = xqzVar2;
                rha0Var2.b = str3;
                rha0Var2.d = z;
                rha0Var2.w = 1;
                Object objA = gha0VarB.a(str3, rha0Var2);
                if (objA != y5bVar) {
                    str = str3;
                    obj = objA;
                    z2 = z;
                }
                return y5bVar;
            }
            if (i4 == 1) {
                z2 = rha0Var2.d;
                String str4 = rha0Var2.b;
                xqz xqzVar3 = rha0Var2.a;
                uj50.b(obj);
                str = str4;
                xqzVar2 = xqzVar3;
            } else {
                if (i4 == 2) {
                    i = rha0Var2.f;
                    i2 = rha0Var2.e;
                    z3 = rha0Var2.d;
                    str2 = rha0Var2.b;
                    uj50.b(obj);
                    list = (List) n52.b((BaseResponse) obj);
                    int i5 = i2;
                    String str5 = str2;
                    int i6 = i;
                    boolean z4 = z3;
                    list2 = list;
                    sha0Var = new sha0(z4, this, str5, list2, i6, i5, null);
                    rha0Var2.a = null;
                    rha0Var2.b = null;
                    rha0Var2.c = list2;
                    rha0Var2.d = z4;
                    rha0Var2.e = i5;
                    rha0Var2.f = i6;
                    rha0Var2.w = 4;
                    if (qv50.b(socialDatabase, sha0Var, rha0Var2) != y5bVar) {
                        list3 = list2;
                    }
                    return y5bVar;
                }
                if (i4 == 3) {
                    i = rha0Var2.f;
                    i2 = rha0Var2.e;
                    z3 = rha0Var2.d;
                    str2 = rha0Var2.b;
                    uj50.b(obj);
                    list = (List) n52.b((BaseResponse) obj);
                    int i7 = i2;
                    String str6 = str2;
                    int i8 = i;
                    boolean z5 = z3;
                    list2 = list;
                    sha0Var = new sha0(z5, this, str6, list2, i8, i7, null);
                    rha0Var2.a = null;
                    rha0Var2.b = null;
                    rha0Var2.c = list2;
                    rha0Var2.d = z5;
                    rha0Var2.e = i7;
                    rha0Var2.f = i8;
                    rha0Var2.w = 4;
                    if (qv50.b(socialDatabase, sha0Var, rha0Var2) != y5bVar) {
                        list3 = list2;
                    }
                    return y5bVar;
                }
                if (i4 != 4) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list3 = rha0Var2.c;
                uj50.b(obj);
            }
            return new r650.b.C1034b(list3.isEmpty());
            SocShareCodeCursorEntity socShareCodeCursorEntity = (SocShareCodeCursorEntity) obj;
            int i9 = xqzVar2.c.a;
            int pageNo = (z2 || socShareCodeCursorEntity == null) ? 0 : socShareCodeCursorEntity.getPageNo() + 1;
            if (y7a0Var.b) {
                x7a0 x7a0Var = this.c;
                rha0Var2.a = null;
                rha0Var2.b = str;
                rha0Var2.d = z2;
                rha0Var2.e = i9;
                rha0Var2.f = pageNo;
                rha0Var2.w = 2;
                Object objC = x7a0Var.c(pageNo, i9, rha0Var2);
                if (objC != y5bVar) {
                    z3 = z2;
                    str2 = str;
                    i = pageNo;
                    obj = objC;
                    i2 = i9;
                    list = (List) n52.b((BaseResponse) obj);
                    int i10 = i2;
                    String str7 = str2;
                    int i11 = i;
                    boolean z6 = z3;
                    list2 = list;
                    sha0Var = new sha0(z6, this, str7, list2, i11, i10, null);
                    rha0Var2.a = null;
                    rha0Var2.b = null;
                    rha0Var2.c = list2;
                    rha0Var2.d = z6;
                    rha0Var2.e = i10;
                    rha0Var2.f = i11;
                    rha0Var2.w = 4;
                    if (qv50.b(socialDatabase, sha0Var, rha0Var2) != y5bVar) {
                        list3 = list2;
                        return new r650.b.C1034b(list3.isEmpty());
                    }
                }
            } else {
                gbd0 gbd0Var = this.d;
                rha0Var2.a = null;
                rha0Var2.b = str;
                rha0Var2.d = z2;
                rha0Var2.e = i9;
                rha0Var2.f = pageNo;
                rha0Var2.w = 3;
                Object objB = gbd0Var.b(str, pageNo, i9, rha0Var2);
                if (objB != y5bVar) {
                    z3 = z2;
                    str2 = str;
                    i = pageNo;
                    obj = objB;
                    i2 = i9;
                    list = (List) n52.b((BaseResponse) obj);
                    int i12 = i2;
                    String str8 = str2;
                    int i13 = i;
                    boolean z7 = z3;
                    list2 = list;
                    sha0Var = new sha0(z7, this, str8, list2, i13, i12, null);
                    rha0Var2.a = null;
                    rha0Var2.b = null;
                    rha0Var2.c = list2;
                    rha0Var2.d = z7;
                    rha0Var2.e = i12;
                    rha0Var2.f = i13;
                    rha0Var2.w = 4;
                    if (qv50.b(socialDatabase, sha0Var, rha0Var2) != y5bVar) {
                        list3 = list2;
                        return new r650.b.C1034b(list3.isEmpty());
                    }
                }
            }
            return y5bVar;
        } catch (Throwable th) {
            w950.a("SocialShareCodeMediator", "getShareCodeList", th, a.c(new Pair("username", y7a0Var.a)));
            return new r650.b.a(th);
        }
    }
}
