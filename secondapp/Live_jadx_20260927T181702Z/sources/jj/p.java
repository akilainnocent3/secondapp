package jj;

import com.ironsource.C4235d4;
import java.lang.Comparable;
import java.lang.Number;
import java.math.RoundingMode;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@yi.c
@e
public abstract class p<X extends Number & Comparable<X>> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100581a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f100581a = iArr;
            try {
                iArr[RoundingMode.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f100581a[RoundingMode.HALF_EVEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f100581a[RoundingMode.HALF_DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f100581a[RoundingMode.HALF_UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f100581a[RoundingMode.FLOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f100581a[RoundingMode.CEILING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f100581a[RoundingMode.UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f100581a[RoundingMode.UNNECESSARY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public abstract X a(X a10, X b10);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:31:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:72:0x0103  */
    /* JADX WARN: Code duplicated, block: B:75:0x010a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0119  */
    /* JADX WARN: Code duplicated, block: B:81:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0122  */
    /* JADX WARN: Code duplicated, block: B:85:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x012a  */
    public final double b(X x10, RoundingMode mode) {
        Number numberE;
        int iCompareTo;
        int[] iArr;
        double dF;
        Number numberE2;
        double dNextUp;
        int iCompareTo2;
        int i10;
        boolean z10;
        l0.F(x10, "x");
        l0.F(mode, C4235d4.a.f61301t);
        double dC = c(x10);
        if (Double.isInfinite(dC)) {
            switch (a.f100581a[mode.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return ((double) d(x10)) * Double.MAX_VALUE;
                case 5:
                    return dC == Double.POSITIVE_INFINITY ? Double.MAX_VALUE : Double.NEGATIVE_INFINITY;
                case 6:
                    return dC == Double.POSITIVE_INFINITY ? Double.POSITIVE_INFINITY : -1.7976931348623157E308d;
                case 7:
                    break;
                case 8:
                    throw new ArithmeticException(x10 + " cannot be represented precisely as a double");
                default:
                    numberE = e(dC, RoundingMode.UNNECESSARY);
                    iCompareTo = ((Comparable) x10).compareTo(numberE);
                    iArr = a.f100581a;
                    switch (iArr[mode.ordinal()]) {
                        case 1:
                            if (d(x10) >= 0) {
                                if (iCompareTo < 0) {
                                    return d.f(dC);
                                }
                            } else if (iCompareTo > 0) {
                                return Math.nextUp(dC);
                            }
                        case 2:
                        case 3:
                        case 4:
                            if (iCompareTo >= 0) {
                                dNextUp = Math.nextUp(dC);
                                if (dNextUp != Double.POSITIVE_INFINITY) {
                                    numberE2 = e(dNextUp, RoundingMode.CEILING);
                                    iCompareTo2 = ((Comparable) a(x10, numberE)).compareTo(a(numberE2, x10));
                                    if (iCompareTo2 >= 0) {
                                        if (iCompareTo2 <= 0) {
                                            i10 = iArr[mode.ordinal()];
                                            if (i10 != 2) {
                                                if (i10 != 3) {
                                                    if (i10 == 4) {
                                                        throw new AssertionError("impossible");
                                                    }
                                                    if (d(x10) >= 0) {
                                                    }
                                                } else if (d(x10) >= 0) {
                                                }
                                            } else if ((Double.doubleToRawLongBits(dC) & 1) == 0) {
                                            }
                                        }
                                        return dNextUp;
                                    }
                                    return dC;
                                }
                            } else {
                                dF = d.f(dC);
                                if (dF != Double.NEGATIVE_INFINITY) {
                                    Number numberE3 = e(dF, RoundingMode.FLOOR);
                                    numberE2 = numberE;
                                    numberE = numberE3;
                                    dNextUp = dC;
                                    dC = dF;
                                    iCompareTo2 = ((Comparable) a(x10, numberE)).compareTo(a(numberE2, x10));
                                    if (iCompareTo2 >= 0) {
                                        if (iCompareTo2 <= 0) {
                                            i10 = iArr[mode.ordinal()];
                                            if (i10 != 2) {
                                                if (i10 != 3) {
                                                    if (i10 == 4) {
                                                        throw new AssertionError("impossible");
                                                    }
                                                    if (d(x10) >= 0) {
                                                    }
                                                } else if (d(x10) >= 0) {
                                                }
                                            } else if ((Double.doubleToRawLongBits(dC) & 1) == 0) {
                                            }
                                        }
                                        return dNextUp;
                                    }
                                    return dC;
                                }
                            }
                        case 5:
                            if (iCompareTo < 0) {
                                return d.f(dC);
                            }
                            break;
                        case 6:
                            if (iCompareTo > 0) {
                                return Math.nextUp(dC);
                            }
                            break;
                        case 7:
                            if (d(x10) >= 0) {
                                if (iCompareTo > 0) {
                                    return Math.nextUp(dC);
                                }
                            } else if (iCompareTo < 0) {
                                return d.f(dC);
                            }
                        case 8:
                            if (iCompareTo == 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            i.k(z10);
                            return dC;
                        default:
                            throw new AssertionError("impossible");
                    }
                    break;
            }
        } else {
            numberE = e(dC, RoundingMode.UNNECESSARY);
            iCompareTo = ((Comparable) x10).compareTo(numberE);
            iArr = a.f100581a;
            switch (iArr[mode.ordinal()]) {
                case 1:
                    if (d(x10) >= 0) {
                        if (iCompareTo < 0) {
                            return d.f(dC);
                        }
                    } else if (iCompareTo > 0) {
                        return Math.nextUp(dC);
                    }
                case 2:
                case 3:
                case 4:
                    if (iCompareTo >= 0) {
                        dNextUp = Math.nextUp(dC);
                        if (dNextUp != Double.POSITIVE_INFINITY) {
                            numberE2 = e(dNextUp, RoundingMode.CEILING);
                            iCompareTo2 = ((Comparable) a(x10, numberE)).compareTo(a(numberE2, x10));
                            if (iCompareTo2 >= 0) {
                                if (iCompareTo2 <= 0) {
                                    i10 = iArr[mode.ordinal()];
                                    if (i10 != 2) {
                                        if (i10 != 3) {
                                            if (i10 == 4) {
                                                throw new AssertionError("impossible");
                                            }
                                            if (d(x10) >= 0) {
                                            }
                                        } else if (d(x10) >= 0) {
                                        }
                                    } else if ((Double.doubleToRawLongBits(dC) & 1) == 0) {
                                    }
                                }
                                return dNextUp;
                            }
                            return dC;
                        }
                    } else {
                        dF = d.f(dC);
                        if (dF != Double.NEGATIVE_INFINITY) {
                            Number numberE4 = e(dF, RoundingMode.FLOOR);
                            numberE2 = numberE;
                            numberE = numberE4;
                            dNextUp = dC;
                            dC = dF;
                            iCompareTo2 = ((Comparable) a(x10, numberE)).compareTo(a(numberE2, x10));
                            if (iCompareTo2 >= 0) {
                                if (iCompareTo2 <= 0) {
                                    i10 = iArr[mode.ordinal()];
                                    if (i10 != 2) {
                                        if (i10 != 3) {
                                            if (i10 == 4) {
                                                throw new AssertionError("impossible");
                                            }
                                            if (d(x10) >= 0) {
                                            }
                                        } else if (d(x10) >= 0) {
                                        }
                                    } else if ((Double.doubleToRawLongBits(dC) & 1) == 0) {
                                    }
                                }
                                return dNextUp;
                            }
                            return dC;
                        }
                    }
                case 5:
                    if (iCompareTo < 0) {
                        return d.f(dC);
                    }
                    break;
                case 6:
                    if (iCompareTo > 0) {
                        return Math.nextUp(dC);
                    }
                    break;
                case 7:
                    if (d(x10) >= 0) {
                        if (iCompareTo > 0) {
                            return Math.nextUp(dC);
                        }
                    } else if (iCompareTo < 0) {
                        return d.f(dC);
                    }
                case 8:
                    if (iCompareTo == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i.k(z10);
                    return dC;
                default:
                    throw new AssertionError("impossible");
            }
        }
        return dC;
    }

    public abstract double c(X x10);

    public abstract int d(X x10);

    public abstract X e(double d10, RoundingMode mode);
}
