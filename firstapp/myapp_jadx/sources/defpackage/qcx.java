package defpackage;

import com.sporty.android.core.model.patron.DocumentAuditStatus;
import com.sporty.android.core.model.service.CountryCodeName;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
public final class qcx {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CountryCodeName.values().length];
            try {
                iArr[CountryCodeName.GHANA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CountryCodeName.UGANDA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CountryCodeName.NIGERIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    public static lcx a(CountryCodeName countryCodeName, Integer num, Integer num2, y200 y200Var) {
        boolean z;
        if (countryCodeName == CountryCodeName.GHANA) {
            int value = DocumentAuditStatus.SUBMITTED.getValue();
            if (num2 == null || num2.intValue() != value) {
                int value2 = DocumentAuditStatus.APPROVED.getValue();
                if (num2 == null || num2.intValue() != value2) {
                    z = false;
                }
            }
            z = true;
        } else {
            z = false;
        }
        int[] iArr = a.a;
        int i = iArr[countryCodeName.ordinal()];
        lcx lcxVar = lcx.b.a;
        lcx.e eVar = lcx.e.a;
        lcx.c cVar = lcx.c.a;
        if (i == 1 || i == 2 ? num != null && num.intValue() == 300 : i == 3 && num != null && num.intValue() == 360) {
            if ((y200Var instanceof a300.b) || (y200Var instanceof y300.a)) {
                int i2 = iArr[countryCodeName.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    lcxVar = eVar;
                } else if (i2 != 3) {
                    lcxVar = cVar;
                }
            } else {
                lcxVar = cVar;
            }
            if (!z || !lcxVar.equals(eVar)) {
                return lcxVar;
            }
        } else {
            int i3 = iArr[countryCodeName.ordinal()];
            if (i3 == 1 || i3 == 2) {
                if ((num != null && num.intValue() == 325) || ((num != null && num.intValue() == 310) || ((num != null && num.intValue() == 370) || (num != null && num.intValue() == 330)))) {
                    lcxVar = eVar;
                } else {
                    lcxVar = cVar;
                }
            } else if (i3 != 3) {
                lcxVar = cVar;
            } else if ((num == null || num.intValue() != 300) && ((num == null || num.intValue() != 320) && ((num == null || num.intValue() != 305) && (num == null || num.intValue() != 330)))) {
                if (num != null && num.intValue() == 310) {
                    lcxVar = lcx.a.a;
                } else {
                    lcxVar = cVar;
                }
            }
            if (!z || !lcxVar.equals(eVar)) {
                return lcxVar;
            }
        }
        return lcx.d.a;
    }

    public static ncx b(CountryCodeName countryCodeName, Integer num, Integer num2, y200 y200Var) {
        boolean zM;
        countryCodeName.getClass();
        lcx lcxVarA = a(countryCodeName, num, num2, y200Var);
        lcx lcxVarA2 = a(countryCodeName, num, num2, y200Var);
        lcx.e eVar = lcx.e.a;
        boolean zEquals = lcxVarA2.equals(eVar);
        lcx.b bVar = lcx.b.a;
        boolean zM2 = false;
        if (zEquals) {
            zM = CollectionsKt.M(kotlin.collections.a.c(310), num);
        } else if (lcxVarA2.equals(bVar)) {
            zM = CollectionsKt.M(kotlin.collections.a.c(320), num);
        } else {
            zM = lcxVarA2.equals(lcx.a.a) ? CollectionsKt.M(kotlin.collections.a.c(310), num) : false;
        }
        lcx lcxVarA3 = a(countryCodeName, num, num2, y200Var);
        boolean z = !lcxVarA3.equals(eVar) ? !(lcxVarA3.equals(bVar) && num != null && 330 == num.intValue()) : num == null || 330 != num.intValue();
        int i = a.a[countryCodeName.ordinal()];
        if (i == 1 || i == 2) {
            zM2 = CollectionsKt.M(b.k(350, 355), num);
        } else if (i == 3) {
            zM2 = CollectionsKt.M(kotlin.collections.a.c(350), num);
        }
        return new ncx(lcxVarA, zM, z, zM2);
    }
}
