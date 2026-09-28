package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 4, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
public class sgf {
    public static final double a(double d, rgf rgfVar, rgf rgfVar2) {
        rgfVar.getClass();
        TimeUnit timeUnit = rgfVar2.a;
        TimeUnit timeUnit2 = rgfVar.a;
        long jConvert = timeUnit.convert(1L, timeUnit2);
        return jConvert > 0 ? d * jConvert : d / timeUnit2.convert(1L, timeUnit);
    }
}
