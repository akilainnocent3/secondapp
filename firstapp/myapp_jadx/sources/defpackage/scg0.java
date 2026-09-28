package defpackage;

import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.sportygames.newcms.CMSRes;
import com.sportygames.newcms.b;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final class scg0 implements do8 {
    public static final /* synthetic */ scg0 a = new scg0();

    public static final String b(long j, CMSRes cMSRes, String str, CMSRes cMSRes2, String str2, b bVar) {
        String strValueOf = String.valueOf(j);
        return c.p(c.p(j == 1 ? bVar.b(cMSRes, str) : bVar.b(cMSRes2, str2), "{value}", strValueOf, false), "%1$s", strValueOf, false);
    }

    public static final Long c(long j, String str) {
        Long lValueOf;
        if (StringsKt.U(str)) {
            lValueOf = null;
        } else {
            for (String str2 : kotlin.collections.b.k("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", "yyyy-MM-dd'T'HH:mm:ss'Z'", "yyyy-MM-dd'T'HH:mm:ssXXX", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd'T'HH:mm:ss")) {
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.US);
                    simpleDateFormat.setLenient(false);
                    if (c.k(str2, "'Z'", false) || StringsKt.M(str2, "XXX", false)) {
                        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                    }
                    Date date = simpleDateFormat.parse(str);
                    if (date != null) {
                        lValueOf = Long.valueOf(date.getTime());
                    } else {
                        continue;
                    }
                } catch (Exception unused) {
                }
            }
            lValueOf = null;
        }
        if (lValueOf != null) {
            return Long.valueOf(lValueOf.longValue() - j);
        }
        return null;
    }

    public static final String d(String str, b bVar, long j) {
        bVar.getClass();
        Long lC = c(j, str);
        if (lC == null) {
            return "";
        }
        long jLongValue = lC.longValue();
        if (jLongValue <= 0) {
            return "";
        }
        long j2 = jLongValue / 1000;
        if (j2 <= 0) {
            return "";
        }
        long j3 = j2 / 86400;
        long j4 = (j2 % 86400) / 3600;
        long j5 = (j2 % 3600) / 60;
        long j6 = j2 % 60;
        if (j3 > 0) {
            v5g0 v5g0Var = v5g0.Z;
            return b(j3, v5g0Var.z, "1 day", v5g0Var.A, "{value} days", bVar);
        }
        if (j4 > 0) {
            v5g0 v5g0Var2 = v5g0.Z;
            return b(j4, v5g0Var2.B, "1 hour", v5g0Var2.C, "{value} hours", bVar);
        }
        if (j5 > 0) {
            v5g0 v5g0Var3 = v5g0.Z;
            return b(j5, v5g0Var3.D, "1 minute", v5g0Var3.E, "{value} minutes", bVar);
        }
        v5g0 v5g0Var4 = v5g0.Z;
        return b(j6, v5g0Var4.F, "1 sec", v5g0Var4.G, "{value} sec", bVar);
    }

    @Override // defpackage.do8
    public /* synthetic */ Object a(hi50 hi50Var) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(hi50Var);
    }
}
