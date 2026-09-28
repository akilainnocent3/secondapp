package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;
import java.util.Locale;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class v2k {
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
            a = iArr;
        }
    }

    public v2k(psm psmVar) {
        psmVar.getClass();
        this.a = psmVar;
    }

    public static brm a(String str, uag uagVar) {
        String strB = w3w.b(str);
        Object obj = null;
        if (strB == null) {
            return null;
        }
        q3.b bVarA = ocx.a(uagVar, uagVar);
        while (bVarA.hasNext()) {
            Object next = bVarA.next();
            brm brmVar = (brm) next;
            brmVar.getClass();
            String lowerCase = brmVar.a().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (StringsKt.M(strB, lowerCase, false) || StringsKt.M(lowerCase, strB, false)) {
                obj = next;
                break;
            }
        }
        return (brm) obj;
    }
}
