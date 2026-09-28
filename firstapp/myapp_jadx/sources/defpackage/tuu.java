package defpackage;

import android.accounts.Account;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.matchalert.SwitchMatchNotificationEnabledRequest;
import com.sporty.android.platform.features.settings.notification.matchalert.data.db.MatchAlertDatabase;
import com.sporty.android.platform.features.settings.notification.matchalert.data.db.entity.SubscribedEventEntity;
import java.io.Serializable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class tuu implements muu {
    public final y7h a;
    public final ha30 b;
    public final MatchAlertDatabase c;
    public final uqm d;
    public final wsm e;

    public tuu(y7h y7hVar, ha30 ha30Var, MatchAlertDatabase matchAlertDatabase, uqm uqmVar, wsm wsmVar) {
        y7hVar.getClass();
        ha30Var.getClass();
        uqmVar.getClass();
        wsmVar.getClass();
        this.a = y7hVar;
        this.b = ha30Var;
        this.c = matchAlertDatabase;
        this.d = uqmVar;
        this.e = wsmVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:59:0x010f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.muu
    public final Object a(String str, boolean z, x1b x1bVar) {
        suu suuVar;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z2;
        SubscribedEventEntity subscribedEventEntity;
        String str7;
        Object bVar;
        Throwable thA;
        kde0 kde0VarX;
        Boolean notificationEnabled;
        boolean zBooleanValue;
        Object obj;
        if (x1bVar instanceof suu) {
            suuVar = (suu) x1bVar;
            int i = suuVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                suuVar.v = i - Integer.MIN_VALUE;
            } else {
                suuVar = new suu(this, x1bVar);
            }
        } else {
            suuVar = new suu(this, x1bVar);
        }
        Object objA = suuVar.f;
        y5b y5bVar = y5b.a;
        int i2 = suuVar.v;
        MatchAlertDatabase matchAlertDatabase = this.c;
        if (i2 == 0) {
            uj50.b(objA);
            Account account = this.d.getAccount();
            if (account == null || (str2 = account.name) == null) {
                return Unit.a;
            }
            kde0 kde0VarX2 = matchAlertDatabase.x();
            suuVar.a = str;
            suuVar.b = str2;
            suuVar.e = z;
            suuVar.v = 1;
            Object objE = kde0VarX2.e(str2, str, suuVar);
            if (objE != y5bVar) {
                str3 = str;
                str4 = str2;
                objA = objE;
            }
            return y5bVar;
        }
        if (i2 == 1) {
            z = suuVar.e;
            str4 = suuVar.b;
            str3 = suuVar.a;
            uj50.b(objA);
        } else {
            if (i2 == 2) {
                z2 = suuVar.e;
                subscribedEventEntity = suuVar.c;
                str6 = suuVar.b;
                str5 = suuVar.a;
                uj50.b(objA);
                try {
                    zi50.a aVar = zi50.b;
                    ha30 ha30Var = this.b;
                    SwitchMatchNotificationEnabledRequest switchMatchNotificationEnabledRequest = new SwitchMatchNotificationEnabledRequest(str5, z2);
                    suuVar.a = str5;
                    suuVar.b = str6;
                    suuVar.c = subscribedEventEntity;
                    suuVar.d = null;
                    suuVar.e = z2;
                    suuVar.v = 3;
                    objA = ha30Var.a(switchMatchNotificationEnabledRequest, suuVar);
                    if (objA != y5bVar) {
                        str7 = str5;
                        bVar = (BaseResponse) objA;
                        zi50.a aVar2 = zi50.b;
                        thA = zi50.a(bVar);
                        if (thA != null) {
                            this.e.g("Caught exception in MatchAlertRepository.switchNotificationEnabled", "", thA, m2g.a);
                            kde0VarX = matchAlertDatabase.x();
                            notificationEnabled = subscribedEventEntity.getNotificationEnabled();
                            if (notificationEnabled != null) {
                                zBooleanValue = notificationEnabled.booleanValue();
                            } else {
                                zBooleanValue = false;
                            }
                            suuVar.a = null;
                            suuVar.b = null;
                            suuVar.c = null;
                            suuVar.d = bVar;
                            suuVar.e = z2;
                            suuVar.v = 4;
                            if (kde0VarX.f(str6, str7, zBooleanValue, suuVar) != y5bVar) {
                                obj = bVar;
                            }
                        }
                        uj50.b(bVar);
                        return Unit.a;
                    }
                } catch (Throwable th) {
                    th = th;
                    str7 = str5;
                    zi50.a aVar3 = zi50.b;
                    bVar = new zi50.b(th);
                }
                return y5bVar;
            }
            if (i2 == 3) {
                z2 = suuVar.e;
                subscribedEventEntity = suuVar.c;
                str6 = suuVar.b;
                str7 = suuVar.a;
                try {
                    uj50.b(objA);
                    bVar = (BaseResponse) objA;
                    zi50.a aVar4 = zi50.b;
                } catch (Throwable th2) {
                    th = th2;
                    zi50.a aVar5 = zi50.b;
                    bVar = new zi50.b(th);
                }
                thA = zi50.a(bVar);
                if (thA != null) {
                    this.e.g("Caught exception in MatchAlertRepository.switchNotificationEnabled", "", thA, m2g.a);
                    kde0VarX = matchAlertDatabase.x();
                    notificationEnabled = subscribedEventEntity.getNotificationEnabled();
                    if (notificationEnabled != null) {
                        zBooleanValue = notificationEnabled.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    suuVar.a = null;
                    suuVar.b = null;
                    suuVar.c = null;
                    suuVar.d = bVar;
                    suuVar.e = z2;
                    suuVar.v = 4;
                    if (kde0VarX.f(str6, str7, zBooleanValue, suuVar) != y5bVar) {
                        obj = bVar;
                    }
                    return y5bVar;
                }
                uj50.b(bVar);
                return Unit.a;
            }
            if (i2 != 4) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = suuVar.d;
            uj50.b(objA);
        }
        bVar = obj;
        uj50.b(bVar);
        return Unit.a;
        SubscribedEventEntity subscribedEventEntity2 = (SubscribedEventEntity) objA;
        if (subscribedEventEntity2 == null) {
            return Unit.a;
        }
        kde0 kde0VarX3 = matchAlertDatabase.x();
        suuVar.a = str3;
        suuVar.b = str4;
        suuVar.c = subscribedEventEntity2;
        suuVar.e = z;
        suuVar.v = 2;
        if (kde0VarX3.f(str4, str3, z, suuVar) != y5bVar) {
            str5 = str3;
            str6 = str4;
            z2 = z;
            subscribedEventEntity = subscribedEventEntity2;
            zi50.a aVar6 = zi50.b;
            ha30 ha30Var2 = this.b;
            SwitchMatchNotificationEnabledRequest switchMatchNotificationEnabledRequest2 = new SwitchMatchNotificationEnabledRequest(str5, z2);
            suuVar.a = str5;
            suuVar.b = str6;
            suuVar.c = subscribedEventEntity;
            suuVar.d = null;
            suuVar.e = z2;
            suuVar.v = 3;
            objA = ha30Var2.a(switchMatchNotificationEnabledRequest2, suuVar);
            if (objA != y5bVar) {
                str7 = str5;
                bVar = (BaseResponse) objA;
                zi50.a aVar7 = zi50.b;
                thA = zi50.a(bVar);
                if (thA != null) {
                    this.e.g("Caught exception in MatchAlertRepository.switchNotificationEnabled", "", thA, m2g.a);
                    kde0VarX = matchAlertDatabase.x();
                    notificationEnabled = subscribedEventEntity.getNotificationEnabled();
                    if (notificationEnabled != null) {
                        zBooleanValue = notificationEnabled.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    suuVar.a = null;
                    suuVar.b = null;
                    suuVar.c = null;
                    suuVar.d = bVar;
                    suuVar.e = z2;
                    suuVar.v = 4;
                    if (kde0VarX.f(str6, str7, zBooleanValue, suuVar) != y5bVar) {
                        obj = bVar;
                        bVar = obj;
                    }
                }
                uj50.b(bVar);
                return Unit.a;
            }
        }
        return y5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.muu
    public final Object b(String str, x1b x1bVar) throws SprThrowable {
        ruu ruuVar;
        if (x1bVar instanceof ruu) {
            ruuVar = (ruu) x1bVar;
            int i = ruuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ruuVar.c = i - Integer.MIN_VALUE;
            } else {
                ruuVar = new ruu(this, x1bVar);
            }
        } else {
            ruuVar = new ruu(this, x1bVar);
        }
        Object objC = ruuVar.a;
        y5b y5bVar = y5b.a;
        int i2 = ruuVar.c;
        if (i2 == 0) {
            uj50.b(objC);
            ruuVar.c = 1;
            objC = this.a.c(str, ruuVar);
            if (objC == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objC);
        }
        n52.c((BaseResponse) objC);
        return Unit.a;
    }

    @Override // defpackage.muu
    public final Object c(boolean z, wvu wvuVar) {
        String str;
        Account account = this.d.getAccount();
        return (account == null || (str = account.name) == null) ? Unit.a : this.c.x().d(str, z, wvuVar);
    }

    @Override // defpackage.muu
    public final puu d() {
        return new puu(new ymz(new joz(new nuu(this, 0), null), new iqz(20, 0, false, 0, 0, 62), new luu(this.a, this.c, this.d, this.e)).e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.muu
    public final Serializable e(x1b x1bVar) {
        ouu ouuVar;
        Serializable bVar;
        if (x1bVar instanceof ouu) {
            ouuVar = (ouu) x1bVar;
            int i = ouuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ouuVar.c = i - Integer.MIN_VALUE;
            } else {
                ouuVar = new ouu(this, x1bVar);
            }
        } else {
            ouuVar = new ouu(this, x1bVar);
        }
        Object objB = ouuVar.a;
        y5b y5bVar = y5b.a;
        int i2 = ouuVar.c;
        try {
            if (i2 == 0) {
                uj50.b(objB);
                zi50.a aVar = zi50.b;
                ha30 ha30Var = this.b;
                ouuVar.c = 1;
                objB = ha30Var.b(ouuVar);
                if (objB == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objB);
            }
            bVar = (Boolean) n52.b((BaseResponse) objB);
            bVar.getClass();
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        return bVar instanceof zi50.b ? Boolean.FALSE : bVar;
    }
}
