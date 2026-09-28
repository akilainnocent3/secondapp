package defpackage;

import android.os.Build;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import j$.util.DesugarDate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class pwf0 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[owf0.values().length];
            try {
                owf0 owf0Var = owf0.a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public static Date a(String str, String str2, boolean z, owf0 owf0Var) {
        if (StringsKt.U(str)) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat(str2, z ? Locale.getDefault() : Locale.US).parse(str);
        }
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern(str2, z ? Locale.getDefault() : Locale.US);
        return DesugarDate.from((a.a[owf0Var.ordinal()] == 1 ? LocalDate.parse(str, dateTimeFormatterOfPattern).atStartOfDay() : LocalDateTime.parse(str, dateTimeFormatterOfPattern)).H(ZoneId.systemDefault()).toInstant());
    }
}
