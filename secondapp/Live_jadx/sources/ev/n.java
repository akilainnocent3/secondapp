package ev;

import dr.l1;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class n extends m {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f81693a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[k.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[k.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[k.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f81693a = iArr;
        }
    }

    @oy.l
    @l1(version = "1.5")
    public static final k f(char c10, boolean z10) {
        if (!z10) {
            if (c10 == 'D') {
                return k.DAYS;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c10);
        }
        if (c10 == 'H') {
            return k.HOURS;
        }
        if (c10 == 'M') {
            return k.MINUTES;
        }
        if (c10 == 'S') {
            return k.SECONDS;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c10);
    }

    @oy.l
    @l1(version = "1.5")
    public static final k g(@oy.l String shortName) {
        m0.p(shortName, "shortName");
        int iHashCode = shortName.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3494) {
                            if (iHashCode != 3525) {
                                if (iHashCode == 3742 && shortName.equals("us")) {
                                    return k.MICROSECONDS;
                                }
                            } else if (shortName.equals("ns")) {
                                return k.NANOSECONDS;
                            }
                        } else if (shortName.equals("ms")) {
                            return k.MILLISECONDS;
                        }
                    } else if (shortName.equals("s")) {
                        return k.SECONDS;
                    }
                } else if (shortName.equals("m")) {
                    return k.MINUTES;
                }
            } else if (shortName.equals("h")) {
                return k.HOURS;
            }
        } else if (shortName.equals("d")) {
            return k.DAYS;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }

    @oy.l
    @l1(version = "1.3")
    public static final String h(@oy.l k kVar) {
        m0.p(kVar, "<this>");
        switch (a.f81693a[kVar.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "us";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "m";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new IllegalStateException(("Unknown unit: " + kVar).toString());
        }
    }
}
