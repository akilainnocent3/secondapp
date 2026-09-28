package defpackage;

import com.appsflyer.internal.x;
import com.google.protobuf.Reader;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class zqe0 {
    public static final long a(String str, long j, long j2, long j3) {
        String property;
        int i = yqe0.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lS0 = StringsKt.s0(property);
        if (lS0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lS0.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        StringBuilder sbA = x.a(j2, "System property '", str, "' should be in range ");
        g41.a(j3, "..", ", but is '", sbA);
        sbA.append(jLongValue);
        sbA.append('\'');
        throw new IllegalStateException(sbA.toString().toString());
    }

    public static int b(int i, int i2, String str) {
        return (int) a(str, i, 1L, (i2 & 8) != 0 ? Reader.READ_DONE : 2097150);
    }
}
