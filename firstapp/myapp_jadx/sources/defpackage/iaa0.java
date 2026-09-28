package defpackage;

import android.util.Pair;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.social.data.local.SocialDatabase;
import com.sportybet.android.social.data.local.SocialFollowingCursorEntity;
import com.sportybet.android.social.data.local.SocialFollowingEntity;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes6.dex */
public final class iaa0 extends r650<Integer, SocialFollowingEntity> {
    public final v8a0 a;
    public final SocialDatabase b;
    public final x7a0 c;
    public final gbd0 d;
    public final bnh0 e;

    public iaa0(v8a0 v8a0Var, SocialDatabase socialDatabase, x7a0 x7a0Var, gbd0 gbd0Var, bnh0 bnh0Var) {
        this.a = v8a0Var;
        this.b = socialDatabase;
        this.c = x7a0Var;
        this.d = gbd0Var;
        this.e = bnh0Var;
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
        gaa0 gaa0Var;
        xqz xqzVar2;
        String str;
        boolean z2;
        boolean z3;
        String str2;
        int i;
        int i2;
        List list;
        List list2;
        haa0 haa0Var;
        List list3;
        if (x1bVar instanceof gaa0) {
            gaa0Var = (gaa0) x1bVar;
            int i3 = gaa0Var.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gaa0Var.w = i3 - Integer.MIN_VALUE;
            } else {
                gaa0Var = new gaa0(this, x1bVar);
            }
        } else {
            gaa0Var = new gaa0(this, x1bVar);
        }
        gaa0 gaa0Var2 = gaa0Var;
        Object obj = gaa0Var2.i;
        y5b y5bVar = y5b.a;
        int i4 = gaa0Var2.w;
        SocialDatabase socialDatabase = this.b;
        v8a0 v8a0Var = this.a;
        try {
            if (i4 == 0) {
                uj50.b(obj);
                String str3 = v8a0Var.a;
                u9a0 u9a0VarZ = socialDatabase.z();
                xqzVar2 = xqzVar;
                gaa0Var2.a = xqzVar2;
                gaa0Var2.b = str3;
                gaa0Var2.d = z;
                gaa0Var2.w = 1;
                Object objA = u9a0VarZ.a(str3, gaa0Var2);
                if (objA != y5bVar) {
                    str = str3;
                    obj = objA;
                    z2 = z;
                }
                return y5bVar;
            }
            if (i4 == 1) {
                z2 = gaa0Var2.d;
                String str4 = gaa0Var2.b;
                xqz xqzVar3 = gaa0Var2.a;
                uj50.b(obj);
                str = str4;
                xqzVar2 = xqzVar3;
            } else {
                if (i4 == 2) {
                    i = gaa0Var2.f;
                    i2 = gaa0Var2.e;
                    z3 = gaa0Var2.d;
                    str2 = gaa0Var2.b;
                    uj50.b(obj);
                    list = (List) n52.b((BaseResponse) obj);
                    int i5 = i2;
                    String str5 = str2;
                    int i6 = i;
                    boolean z4 = z3;
                    list2 = list;
                    haa0Var = new haa0(z4, this, str5, list2, i6, i5, null);
                    gaa0Var2.a = null;
                    gaa0Var2.b = null;
                    gaa0Var2.c = list2;
                    gaa0Var2.d = z4;
                    gaa0Var2.e = i5;
                    gaa0Var2.f = i6;
                    gaa0Var2.w = 4;
                    if (qv50.b(socialDatabase, haa0Var, gaa0Var2) != y5bVar) {
                        list3 = list2;
                    }
                    return y5bVar;
                }
                if (i4 == 3) {
                    i = gaa0Var2.f;
                    i2 = gaa0Var2.e;
                    z3 = gaa0Var2.d;
                    str2 = gaa0Var2.b;
                    uj50.b(obj);
                    list = (List) n52.b((BaseResponse) obj);
                    int i7 = i2;
                    String str6 = str2;
                    int i8 = i;
                    boolean z5 = z3;
                    list2 = list;
                    haa0Var = new haa0(z5, this, str6, list2, i8, i7, null);
                    gaa0Var2.a = null;
                    gaa0Var2.b = null;
                    gaa0Var2.c = list2;
                    gaa0Var2.d = z5;
                    gaa0Var2.e = i7;
                    gaa0Var2.f = i8;
                    gaa0Var2.w = 4;
                    if (qv50.b(socialDatabase, haa0Var, gaa0Var2) != y5bVar) {
                        list3 = list2;
                    }
                    return y5bVar;
                }
                if (i4 != 4) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list3 = gaa0Var2.c;
                uj50.b(obj);
            }
            return new r650.b.C1034b(list3.isEmpty());
            SocialFollowingCursorEntity socialFollowingCursorEntity = (SocialFollowingCursorEntity) obj;
            int i9 = xqzVar2.c.a;
            int pageNo = (z2 || socialFollowingCursorEntity == null) ? 0 : socialFollowingCursorEntity.getPageNo() + 1;
            if (v8a0Var.b) {
                x7a0 x7a0Var = this.c;
                gaa0Var2.a = null;
                gaa0Var2.b = str;
                gaa0Var2.d = z2;
                gaa0Var2.e = i9;
                gaa0Var2.f = pageNo;
                gaa0Var2.w = 2;
                Object objM = x7a0Var.m(pageNo, i9, gaa0Var2);
                if (objM != y5bVar) {
                    z3 = z2;
                    str2 = str;
                    i = pageNo;
                    obj = objM;
                    i2 = i9;
                    list = (List) n52.b((BaseResponse) obj);
                    int i10 = i2;
                    String str7 = str2;
                    int i11 = i;
                    boolean z6 = z3;
                    list2 = list;
                    haa0Var = new haa0(z6, this, str7, list2, i11, i10, null);
                    gaa0Var2.a = null;
                    gaa0Var2.b = null;
                    gaa0Var2.c = list2;
                    gaa0Var2.d = z6;
                    gaa0Var2.e = i10;
                    gaa0Var2.f = i11;
                    gaa0Var2.w = 4;
                    if (qv50.b(socialDatabase, haa0Var, gaa0Var2) != y5bVar) {
                        list3 = list2;
                        return new r650.b.C1034b(list3.isEmpty());
                    }
                }
            } else {
                gbd0 gbd0Var = this.d;
                gaa0Var2.a = null;
                gaa0Var2.b = str;
                gaa0Var2.d = z2;
                gaa0Var2.e = i9;
                gaa0Var2.f = pageNo;
                gaa0Var2.w = 3;
                Object objD = gbd0Var.d(str, pageNo, i9, gaa0Var2);
                if (objD != y5bVar) {
                    z3 = z2;
                    str2 = str;
                    i = pageNo;
                    obj = objD;
                    i2 = i9;
                    list = (List) n52.b((BaseResponse) obj);
                    int i12 = i2;
                    String str8 = str2;
                    int i13 = i;
                    boolean z7 = z3;
                    list2 = list;
                    haa0Var = new haa0(z7, this, str8, list2, i13, i12, null);
                    gaa0Var2.a = null;
                    gaa0Var2.b = null;
                    gaa0Var2.c = list2;
                    gaa0Var2.d = z7;
                    gaa0Var2.e = i12;
                    gaa0Var2.f = i13;
                    gaa0Var2.w = 4;
                    if (qv50.b(socialDatabase, haa0Var, gaa0Var2) != y5bVar) {
                        list3 = list2;
                        return new r650.b.C1034b(list3.isEmpty());
                    }
                }
            }
            return y5bVar;
        } catch (Throwable th) {
            w950.a("SocialFollowingMediator", "getSocialFollowings", th, a.c(new Pair("username", v8a0Var.a)));
            return new r650.b.a(th);
        }
    }
}
