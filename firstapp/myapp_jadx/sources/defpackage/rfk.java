package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;
import java.util.Locale;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class rfk {
    public final psm a;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CountryCodeName.values().length];
            try {
                iArr[CountryCodeName.GHANA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CountryCodeName.TANZANIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CountryCodeName.ZAMBIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CountryCodeName.KENYA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public rfk(psm psmVar) {
        psmVar.getClass();
        this.a = psmVar;
    }

    public static szm a(String str, uag uagVar) {
        String strB = w3w.b(str);
        Object obj = null;
        if (strB == null) {
            return null;
        }
        q3.b bVarA = ocx.a(uagVar, uagVar);
        while (bVarA.hasNext()) {
            Object next = bVarA.next();
            szm szmVar = (szm) next;
            szmVar.getClass();
            String lowerCase = szmVar.a().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (StringsKt.M(strB, lowerCase, false) || StringsKt.M(lowerCase, strB, false)) {
                obj = next;
                break;
            }
        }
        return (szm) obj;
    }

    public final a2g0 b(String str) {
        Object next;
        qjp.a aVar;
        int i = a.a[this.a.getCountryCode().ordinal()];
        if (i == 1) {
            uag uagVar = ihk.c.e;
            q3.b bVarA = ocx.a(uagVar, uagVar);
            do {
                if (!bVarA.hasNext()) {
                    next = null;
                    break;
                }
                next = bVarA.next();
            } while (!((ihk.c) next).a.equals(str));
            ihk.c cVar = (ihk.c) next;
            if (cVar != null) {
                return new a2g0(cVar.b, cVar.c);
            }
        } else if (i == 2) {
            jah0.c cVar2 = (jah0.c) a(str, jah0.c.e);
            if (cVar2 != null) {
                return new a2g0(cVar2.b, cVar2.c);
            }
        } else if (i == 3) {
            jck0.c cVar3 = (jck0.c) a(str, jck0.c.e);
            if (cVar3 != null) {
                return new a2g0(cVar3.b, cVar3.c);
            }
        } else if (i == 4 && (aVar = (qjp.a) a(str, qjp.a.e)) != null) {
            return new a2g0(aVar.b, aVar.c);
        }
        return null;
    }
}
