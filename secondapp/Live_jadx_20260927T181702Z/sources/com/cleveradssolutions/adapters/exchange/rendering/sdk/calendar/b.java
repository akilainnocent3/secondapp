package com.cleveradssolutions.adapters.exchange.rendering.sdk.calendar;

import android.content.Context;
import android.content.Intent;
import com.ironsource.C4235d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements f {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42441a;

        static {
            int[] iArr = new int[d.a.values().length];
            f42441a = iArr;
            try {
                iArr[d.a.DAILY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42441a[d.a.MONTHLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42441a[d.a.WEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42441a[d.a.YEARLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.sdk.calendar.f
    public void a(Context context, g gVar) {
        String strL = gVar.l();
        String strP = gVar.p();
        String strD = gVar.d();
        if (strL == null) {
            strL = "";
        }
        if (strP == null) {
            strP = "";
        }
        if (strD == null) {
            strD = "";
        }
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.item/event");
        intent.putExtra("title", strL);
        intent.putExtra("description", strP);
        intent.putExtra("eventLocation", strD);
        intent.putExtra("beginTime", gVar.j() != null ? gVar.j().b() : System.currentTimeMillis());
        intent.putExtra("endTime", gVar.b() != null ? gVar.b().b() : System.currentTimeMillis() + 1800000);
        intent.putExtra("allDay", false);
        intent.putExtra("accessLevel", 0);
        intent.putExtra("availability", 1);
        d dVarF = gVar.f();
        if (dVarF != null) {
            intent.putExtra("rrule", c(dVarF));
        }
        if (gVar.h() != null && !gVar.h().a()) {
            intent.putExtra("hasAlarm", true);
        }
        com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.c.a(context, intent);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0033  */
    public final StringBuilder b(d dVar) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i10 = a.f42441a[dVar.l().ordinal()];
        if (i10 == 1) {
            str = "FREQ=DAILY";
        } else if (i10 == 2) {
            str = "FREQ=MONTHLY";
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    str = "FREQ=YEARLY";
                }
                if (dVar.o() != null) {
                    sb2.append(";INTERVAL=");
                    sb2.append(dVar.o());
                }
                return sb2;
            }
            str = "FREQ=WEEKLY";
        }
        sb2.append(str);
        if (dVar.o() != null) {
            sb2.append(";INTERVAL=");
            sb2.append(dVar.o());
        }
        return sb2;
    }

    public final String c(d dVar) {
        StringBuilder sbB = b(dVar);
        if (dVar.d() != null && dVar.d().length > 0) {
            e(dVar, sbB);
        }
        sbB.append(d(dVar.y(), "BYMONTHDAY"));
        sbB.append(d(dVar.h(), "BYYEARDAY"));
        sbB.append(d(dVar.q(), "BYMONTH"));
        sbB.append(d(dVar.r(), "BYWEEKNO"));
        if (dVar.i() != null) {
            sbB.append(";UNTIL=");
            sbB.append(dVar.i().b());
        }
        return sbB.toString();
    }

    public final String d(Short[] shArr, String str) {
        if (shArr != null && shArr.length > 0) {
            StringBuilder sb2 = new StringBuilder();
            for (Short sh2 : shArr) {
                if (sh2 != null) {
                    sb2.append(",");
                    sb2.append(sh2);
                }
            }
            if (sb2.length() > 0) {
                return ";" + str + C4235d4.j.f61456b + sb2.deleteCharAt(0).toString();
            }
        }
        return "";
    }

    public final void e(d dVar, StringBuilder sb2) {
        String str;
        StringBuilder sb3 = new StringBuilder();
        for (Short sh2 : dVar.d()) {
            if (sh2 != null) {
                switch (sh2.shortValue()) {
                    case 0:
                        str = ",SU";
                        break;
                    case 1:
                        str = ",MO";
                        break;
                    case 2:
                        str = ",TU";
                        break;
                    case 3:
                        str = ",WE";
                        break;
                    case 4:
                        str = ",TH";
                        break;
                    case 5:
                        str = ",FR";
                        break;
                    case 6:
                        str = ",SA";
                        break;
                    default:
                        continue;
                }
                sb3.append(str);
            }
        }
        if (sb3.length() > 0) {
            StringBuilder sbDeleteCharAt = sb3.deleteCharAt(0);
            sb2.append(";BYDAY=");
            sb2.append(sbDeleteCharAt.toString());
        }
    }
}
