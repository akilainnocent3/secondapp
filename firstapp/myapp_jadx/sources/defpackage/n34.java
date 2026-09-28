package defpackage;

import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.loyalty.streak.BettingStreakAchievementDto;
import com.sporty.android.core.model.loyalty.streak.BettingStreakCalendarDto;
import com.sporty.android.core.model.loyalty.streak.BettingStreakMetricDto;
import com.sporty.android.core.model.loyalty.streak.BettingStreakStatusDto;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n34 implements c34 {
    public final x430 a;
    public final o04 b;
    public final s04 c;

    public n34(x430 x430Var, o04 o04Var, s04 s04Var) {
        x430Var.getClass();
        o04Var.getClass();
        s04Var.getClass();
        this.a = x430Var;
        this.b = o04Var;
        this.c = s04Var;
    }

    @Override // defpackage.c34
    public final yzh a(boolean z) {
        return bm50.a(new or60(new d34(this, z, null)));
    }

    @Override // defpackage.c34
    public final yzh b(zsz zszVar) {
        return bm50.a(new or60(new k34(this, zszVar, null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.c34
    public final Object c(x1b x1bVar) {
        h34 h34Var;
        Object bVar;
        UiText text;
        if (x1bVar instanceof h34) {
            h34Var = (h34) x1bVar;
            int i = h34Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h34Var.c = i - Integer.MIN_VALUE;
            } else {
                h34Var = new h34(this, x1bVar);
            }
        } else {
            h34Var = new h34(this, x1bVar);
        }
        Object objI = h34Var.a;
        y5b y5bVar = y5b.a;
        int i2 = h34Var.c;
        if (i2 == 0) {
            uj50.b(objI);
            h34Var.c = 1;
            objI = this.a.i(h34Var);
            if (objI == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objI);
        }
        BettingStreakMetricDto bettingStreakMetricDto = (BettingStreakMetricDto) n52.b((BaseResponse) objI);
        UiText uiText = vch0.b;
        try {
            zi50.a aVar = zi50.b;
            this.c.getClass();
            bettingStreakMetricDto.getClass();
            int level1Threshold = bettingStreakMetricDto.getLevel1Threshold();
            int currentStreakDays = bettingStreakMetricDto.getCurrentStreakDays();
            t6e0.a aVar2 = t6e0.b;
            int currentStreakLevel = bettingStreakMetricDto.getCurrentStreakLevel();
            aVar2.getClass();
            bVar = new a24(level1Threshold, currentStreakDays, t6e0.a.a(currentStreakLevel), bettingStreakMetricDto.getCurrentStreakBoost(), bettingStreakMetricDto.getRewardCap(), bettingStreakMetricDto.getCurrentStreakRepairToolAmount(), bettingStreakMetricDto.getNotifyKeepStreak());
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Object obj = bVar instanceof zi50.b ? null : bVar;
        if (obj != null) {
            return new lk50.c(obj);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            thA = new Throwable("Unknown error");
        }
        Throwable thA2 = zi50.a(bVar);
        if (thA2 != null) {
            fk50 fk50Var = (fk50) (thA2 instanceof fk50 ? thA2 : null);
            if (fk50Var != null && (text = fk50Var.getText()) != null) {
                uiText = text;
            }
        }
        return new lk50.a(thA, uiText);
    }

    @Override // defpackage.c34
    public final yzh d() {
        return bm50.a(new or60(new g34(this, null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.c34
    public final Object e(x1b x1bVar) {
        e34 e34Var;
        Object bVar;
        UiText text;
        if (x1bVar instanceof e34) {
            e34Var = (e34) x1bVar;
            int i = e34Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e34Var.c = i - Integer.MIN_VALUE;
            } else {
                e34Var = new e34(this, x1bVar);
            }
        } else {
            e34Var = new e34(this, x1bVar);
        }
        Object objE = e34Var.a;
        y5b y5bVar = y5b.a;
        int i2 = e34Var.c;
        if (i2 == 0) {
            uj50.b(objE);
            e34Var.c = 1;
            objE = this.a.e(e34Var);
            if (objE == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objE);
        }
        BettingStreakAchievementDto bettingStreakAchievementDto = (BettingStreakAchievementDto) n52.b((BaseResponse) objE);
        UiText uiText = vch0.b;
        try {
            zi50.a aVar = zi50.b;
            this.c.getClass();
            bVar = s04.a(bettingStreakAchievementDto);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Object obj = bVar instanceof zi50.b ? null : bVar;
        if (obj != null) {
            return new lk50.c(obj);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            thA = new Throwable("Unknown error");
        }
        Throwable thA2 = zi50.a(bVar);
        if (thA2 != null) {
            fk50 fk50Var = (fk50) (thA2 instanceof fk50 ? thA2 : null);
            if (fk50Var != null && (text = fk50Var.getText()) != null) {
                uiText = text;
            }
        }
        return new lk50.a(thA, uiText);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.c34
    public final Object f(boolean z, x1b x1bVar) {
        m34 m34Var;
        UiText uiText;
        Object bVar;
        UiText text;
        if (x1bVar instanceof m34) {
            m34Var = (m34) x1bVar;
            int i = m34Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                m34Var.d = i - Integer.MIN_VALUE;
            } else {
                m34Var = new m34(this, x1bVar);
            }
        } else {
            m34Var = new m34(this, x1bVar);
        }
        Object obj = m34Var.b;
        y5b y5bVar = y5b.a;
        int i2 = m34Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            ResourceUiText resourceUiText = vch0.b;
            try {
                zi50.a aVar = zi50.b;
                o04 o04Var = this.b;
                vkh0 vkh0Var = new vkh0(z);
                m34Var.a = resourceUiText;
                m34Var.d = 1;
                Object objB = o04Var.b(vkh0Var, m34Var);
                if (objB == y5bVar) {
                    return y5bVar;
                }
                obj = objB;
                uiText = resourceUiText;
            } catch (Throwable th) {
                th = th;
                uiText = resourceUiText;
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uiText = m34Var.a;
            try {
                uj50.b(obj);
            } catch (Throwable th2) {
                th = th2;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        bVar = Boolean.valueOf(((vkh0) n52.b((BaseResponse) obj)).getNotifyKeepStreak());
        zi50.a aVar4 = zi50.b;
        Object obj2 = bVar instanceof zi50.b ? null : bVar;
        if (obj2 != null) {
            return new lk50.c(obj2);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            thA = new Throwable("Unknown error");
        }
        Throwable thA2 = zi50.a(bVar);
        if (thA2 != null) {
            fk50 fk50Var = (fk50) (thA2 instanceof fk50 ? thA2 : null);
            if (fk50Var != null && (text = fk50Var.getText()) != null) {
                uiText = text;
            }
        }
        return new lk50.a(thA, uiText);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.c34
    public final Object g(x1b x1bVar) {
        j34 j34Var;
        Object bVar;
        UiText text;
        if (x1bVar instanceof j34) {
            j34Var = (j34) x1bVar;
            int i = j34Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j34Var.c = i - Integer.MIN_VALUE;
            } else {
                j34Var = new j34(this, x1bVar);
            }
        } else {
            j34Var = new j34(this, x1bVar);
        }
        Object objN = j34Var.a;
        y5b y5bVar = y5b.a;
        int i2 = j34Var.c;
        if (i2 == 0) {
            uj50.b(objN);
            j34Var.c = 1;
            objN = this.a.N(j34Var);
            if (objN == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objN);
        }
        BettingStreakStatusDto bettingStreakStatusDto = (BettingStreakStatusDto) n52.b((BaseResponse) objN);
        UiText uiText = vch0.b;
        try {
            zi50.a aVar = zi50.b;
            this.c.getClass();
            bettingStreakStatusDto.getClass();
            bVar = new h44(bettingStreakStatusDto.getShowNewBadge(), bettingStreakStatusDto.getEnabled(), bettingStreakStatusDto.getCurrentStreakDays(), false, bettingStreakStatusDto.getShowStreakAlertNewBadge());
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Object obj = bVar instanceof zi50.b ? null : bVar;
        if (obj != null) {
            return new lk50.c(obj);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            thA = new Throwable("Unknown error");
        }
        Throwable thA2 = zi50.a(bVar);
        if (thA2 != null) {
            fk50 fk50Var = (fk50) (thA2 instanceof fk50 ? thA2 : null);
            if (fk50Var != null && (text = fk50Var.getText()) != null) {
                uiText = text;
            }
        }
        return new lk50.a(thA, uiText);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.c34
    public final Object h(x1b x1bVar) {
        f34 f34Var;
        Object bVar;
        UiText text;
        if (x1bVar instanceof f34) {
            f34Var = (f34) x1bVar;
            int i = f34Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f34Var.c = i - Integer.MIN_VALUE;
            } else {
                f34Var = new f34(this, x1bVar);
            }
        } else {
            f34Var = new f34(this, x1bVar);
        }
        Object objL = f34Var.a;
        y5b y5bVar = y5b.a;
        int i2 = f34Var.c;
        if (i2 == 0) {
            uj50.b(objL);
            f34Var.c = 1;
            objL = this.a.l(f34Var);
            if (objL == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objL);
        }
        BettingStreakCalendarDto bettingStreakCalendarDto = (BettingStreakCalendarDto) n52.b((BaseResponse) objL);
        UiText uiText = vch0.b;
        try {
            zi50.a aVar = zi50.b;
            this.c.getClass();
            bVar = s04.b(bettingStreakCalendarDto);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Object obj = bVar instanceof zi50.b ? null : bVar;
        if (obj != null) {
            return new lk50.c(obj);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            thA = new Throwable("Unknown error");
        }
        Throwable thA2 = zi50.a(bVar);
        if (thA2 != null) {
            fk50 fk50Var = (fk50) (thA2 instanceof fk50 ? thA2 : null);
            if (fk50Var != null && (text = fk50Var.getText()) != null) {
                uiText = text;
            }
        }
        return new lk50.a(thA, uiText);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.c34
    public final Object j(x1b x1bVar) {
        i34 i34Var;
        UiText uiText;
        Object bVar;
        UiText text;
        if (x1bVar instanceof i34) {
            i34Var = (i34) x1bVar;
            int i = i34Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                i34Var.d = i - Integer.MIN_VALUE;
            } else {
                i34Var = new i34(this, x1bVar);
            }
        } else {
            i34Var = new i34(this, x1bVar);
        }
        Object obj = i34Var.b;
        y5b y5bVar = y5b.a;
        int i2 = i34Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            ResourceUiText resourceUiText = vch0.b;
            try {
                zi50.a aVar = zi50.b;
                o04 o04Var = this.b;
                i34Var.a = resourceUiText;
                i34Var.d = 1;
                Object objA = o04Var.a(i34Var);
                if (objA == y5bVar) {
                    return y5bVar;
                }
                uiText = resourceUiText;
                obj = objA;
            } catch (Throwable th) {
                th = th;
                uiText = resourceUiText;
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uiText = i34Var.a;
            try {
                uj50.b(obj);
            } catch (Throwable th2) {
                th = th2;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        List<l24> list = (List) n52.b((BaseResponse) obj);
        s04 s04Var = this.c;
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        for (l24 l24Var : list) {
            s04Var.getClass();
            arrayList.add(s04.d(l24Var));
        }
        zi50.a aVar4 = zi50.b;
        bVar = arrayList;
        Object obj2 = bVar instanceof zi50.b ? null : bVar;
        if (obj2 != null) {
            return new lk50.c(obj2);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            thA = new Throwable("Unknown error");
        }
        Throwable thA2 = zi50.a(bVar);
        if (thA2 != null) {
            fk50 fk50Var = (fk50) (thA2 instanceof fk50 ? thA2 : null);
            if (fk50Var != null && (text = fk50Var.getText()) != null) {
                uiText = text;
            }
        }
        return new lk50.a(thA, uiText);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.c34
    public final Object i(x1b x1bVar) {
        l34 l34Var;
        UiText uiText;
        Object bVar;
        UiText text;
        if (x1bVar instanceof l34) {
            l34Var = (l34) x1bVar;
            int i = l34Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                l34Var.d = i - Integer.MIN_VALUE;
            } else {
                l34Var = new l34(this, x1bVar);
            }
        } else {
            l34Var = new l34(this, x1bVar);
        }
        Object obj = l34Var.b;
        y5b y5bVar = y5b.a;
        int i2 = l34Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            ResourceUiText resourceUiText = vch0.b;
            try {
                zi50.a aVar = zi50.b;
                o04 o04Var = this.b;
                l34Var.a = resourceUiText;
                l34Var.d = 1;
                Object objC = o04Var.c(l34Var);
                if (objC == y5bVar) {
                    return y5bVar;
                }
                uiText = resourceUiText;
                obj = objC;
            } catch (Throwable th) {
                th = th;
                uiText = resourceUiText;
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uiText = l34Var.a;
            try {
                uj50.b(obj);
            } catch (Throwable th2) {
                th = th2;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        Iterable<v14> iterable = (Iterable) n52.b((BaseResponse) obj);
        ArrayList arrayList = new ArrayList(l48.r(iterable, 10));
        for (v14 v14Var : iterable) {
            this.c.getClass();
            v14Var.getClass();
            t6e0.a aVar4 = t6e0.b;
            int level = v14Var.getLevel();
            aVar4.getClass();
            arrayList.add(new u14(t6e0.a.a(level), v14Var.getStreakDays()));
        }
        zi50.a aVar5 = zi50.b;
        bVar = arrayList;
        Object obj2 = bVar instanceof zi50.b ? null : bVar;
        if (obj2 != null) {
            return new lk50.c(obj2);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            thA = new Throwable(lobGSRIlnSGJY.HmbcMIXTO);
        }
        Throwable thA2 = zi50.a(bVar);
        if (thA2 != null) {
            fk50 fk50Var = (fk50) (thA2 instanceof fk50 ? thA2 : null);
            if (fk50Var != null && (text = fk50Var.getText()) != null) {
                uiText = text;
            }
        }
        return new lk50.a(thA, uiText);
    }
}
