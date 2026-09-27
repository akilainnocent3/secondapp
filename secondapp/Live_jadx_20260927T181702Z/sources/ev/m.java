package ev;

import dr.a3;
import dr.l1;
import dr.o0;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class m {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f81692a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f81692a = iArr;
        }
    }

    @l1(version = "1.3")
    public static final double a(double d10, @oy.l k sourceUnit, @oy.l k targetUnit) {
        m0.p(sourceUnit, "sourceUnit");
        m0.p(targetUnit, "targetUnit");
        long jConvert = targetUnit.h().convert(1L, sourceUnit.h());
        return jConvert > 0 ? d10 * jConvert : d10 / sourceUnit.h().convert(1L, targetUnit.h());
    }

    @l1(version = "1.5")
    public static final long b(long j10, @oy.l k sourceUnit, @oy.l k targetUnit) {
        m0.p(sourceUnit, "sourceUnit");
        m0.p(targetUnit, "targetUnit");
        return targetUnit.h().convert(j10, sourceUnit.h());
    }

    @l1(version = "1.5")
    public static final long c(long j10, @oy.l k sourceUnit, @oy.l k targetUnit) {
        m0.p(sourceUnit, "sourceUnit");
        m0.p(targetUnit, "targetUnit");
        return targetUnit.h().convert(j10, sourceUnit.h());
    }

    @oy.l
    @l1(version = "1.8")
    @a3(markerClass = {o.class})
    public static final k d(@oy.l TimeUnit timeUnit) {
        m0.p(timeUnit, "<this>");
        switch (a.f81692a[timeUnit.ordinal()]) {
            case 1:
                return k.NANOSECONDS;
            case 2:
                return k.MICROSECONDS;
            case 3:
                return k.MILLISECONDS;
            case 4:
                return k.SECONDS;
            case 5:
                return k.MINUTES;
            case 6:
                return k.HOURS;
            case 7:
                return k.DAYS;
            default:
                throw new o0();
        }
    }

    @oy.l
    @l1(version = "1.8")
    @a3(markerClass = {o.class})
    public static TimeUnit e(@oy.l k kVar) {
        m0.p(kVar, "<this>");
        return kVar.h();
    }
}
