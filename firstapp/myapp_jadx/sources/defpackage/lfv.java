package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.patron.KycSource;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class lfv {
    public final nev a;
    public final qev b;
    public final psm c;
    public final iym d;

    static {
        int i = qev.g;
    }

    public lfv(nev nevVar, qev qevVar, psm psmVar, iym iymVar) {
        nevVar.getClass();
        qevVar.getClass();
        psmVar.getClass();
        iymVar.getClass();
        this.a = nevVar;
        this.b = qevVar;
        this.c = psmVar;
        this.d = iymVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        jfv jfvVar;
        if (x1bVar instanceof jfv) {
            jfvVar = (jfv) x1bVar;
            int i = jfvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jfvVar.c = i - Integer.MIN_VALUE;
            } else {
                jfvVar = new jfv(this, x1bVar);
            }
        } else {
            jfvVar = new jfv(this, x1bVar);
        }
        Object obj = jfvVar.a;
        Object obj2 = y5b.a;
        int i2 = jfvVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            jfvVar.c = 1;
            u2u u2uVar = this.b.b;
            Object objD = ej5.d(u2uVar.a, new t2u(null, u2uVar), jfvVar);
            if (objD != obj2) {
                objD = Unit.a;
            }
            if (objD == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return iev.o.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(aev aevVar, x1b x1bVar) {
        kfv kfvVar;
        if (x1bVar instanceof kfv) {
            kfvVar = (kfv) x1bVar;
            int i = kfvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kfvVar.c = i - Integer.MIN_VALUE;
            } else {
                kfvVar = new kfv(this, x1bVar);
            }
        } else {
            kfvVar = new kfv(this, x1bVar);
        }
        Object lastNickname = kfvVar.a;
        y5b y5bVar = y5b.a;
        int i2 = kfvVar.c;
        nev nevVar = this.a;
        if (i2 == 0) {
            uj50.b(lastNickname);
            switch (aevVar.a) {
                case RECAP:
                    return iev.v.a;
                case IDENTITY_VERIFICATION:
                    KycSource kycSource = KycSource.VERIFY;
                    kycSource.getClass();
                    return new iev.m(kycSource, null);
                case DAILY_STREAK:
                    return new iev.g(null);
                case SOCIAL:
                    gym.a(this.d, new hbd0(0));
                    kfvVar.c = 1;
                    lastNickname = nevVar.b.getLastNickname(kfvVar);
                    if (lastNickname == y5bVar) {
                        return y5bVar;
                    }
                    break;
                case CREATE_SPORTY_SOCIAL:
                    return new iev.x("", false);
                case PROMOTIONS:
                    return iev.t.a;
                case CUSTOMER_SERVICE:
                    snb0 snb0Var = snb0.DEPP_LINK;
                    return new iev.f();
                case NOTIFICATION_CENTER:
                    return iev.p.a;
                case RATE_APP:
                    return iev.u.a;
                case HOW_TO_PLAY:
                    return iev.l.a;
                case CHANGE_REGION:
                    return iev.e.a;
                case FEEDBACK:
                case C:
                    return null;
                case TAX_REPORTS:
                    return iev.y.a;
                default:
                    uhc.a();
                    return null;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(lastNickname);
        }
        String str = (String) lastNickname;
        String str2 = str != null ? str : "";
        AccountInfo accountInfoLastAccountInfo = nevVar.b.lastAccountInfo();
        return new iev.x(str2, accountInfoLastAccountInfo != null ? accountInfoLastAccountInfo.getNicknameVerified() : false);
    }
}
