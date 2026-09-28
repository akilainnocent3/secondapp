package defpackage;

import com.sportybet.feature.worldcup.config.domain.model.WorldCupTournamentConfig;
import java.util.Calendar;
import java.util.List;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes7.dex */
public final class ehk {
    public static final List<String> c = b.k("BB", "NON_BB");
    public final ryj0 a;
    public final s6k0 b;

    public ehk(ryj0 ryj0Var, s6k0 s6k0Var) {
        this.a = ryj0Var;
        this.b = s6k0Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object a(int i, x1b x1bVar, String str, String str2) {
        dhk dhkVar;
        String str3;
        String str4;
        Object objA;
        int i2;
        int iIntValue;
        if (x1bVar instanceof dhk) {
            dhkVar = (dhk) x1bVar;
            int i3 = dhkVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dhkVar.f = i3 - Integer.MIN_VALUE;
            } else {
                dhkVar = new dhk(this, x1bVar);
            }
        } else {
            dhkVar = new dhk(this, x1bVar);
        }
        dhk dhkVar2 = dhkVar;
        Object obj = dhkVar2.d;
        y5b y5bVar = y5b.a;
        int i4 = dhkVar2.f;
        if (i4 == 0) {
            uj50.b(obj);
            str3 = str;
            dhkVar2.a = str3;
            str4 = str2;
            dhkVar2.b = str4;
            dhkVar2.c = i;
            dhkVar2.f = 1;
            objA = this.b.a(dhkVar2);
            if (objA != y5bVar) {
                i2 = i;
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                uj50.b(obj);
                return ((zi50) obj).a;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i5 = dhkVar2.c;
        String str5 = dhkVar2.b;
        String str6 = dhkVar2.a;
        uj50.b(obj);
        i2 = i5;
        str4 = str5;
        objA = obj;
        str3 = str6;
        WorldCupTournamentConfig worldCupTournamentConfig = (WorldCupTournamentConfig) objA;
        if (worldCupTournamentConfig != null) {
            Integer num = new Integer(worldCupTournamentConfig.getSpecialsTimeFrameDays());
            if (num.intValue() <= 0) {
                num = null;
            }
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 7;
            }
        } else {
            iIntValue = 7;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Object objClone = calendar.clone();
        objClone.getClass();
        Calendar calendar2 = (Calendar) objClone;
        calendar2.add(5, iIntValue);
        List listK = b.k(Long.valueOf(calendar.getTimeInMillis() / 1000), Long.valueOf(calendar2.getTimeInMillis() / 1000));
        dhkVar2.a = null;
        dhkVar2.b = null;
        dhkVar2.c = i2;
        dhkVar2.f = 2;
        Object objA2 = this.a.a(str3, c, str4, listK, i2, dhkVar2);
        return objA2 == y5bVar ? y5bVar : objA2;
    }
}
