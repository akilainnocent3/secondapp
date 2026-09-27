package jj;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@yi.c
@e
@yi.d
public class a {

    /* JADX INFO: renamed from: jj.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0943a extends p<BigDecimal> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0943a f100502a = new C0943a();

        @Override // jj.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public BigDecimal a(BigDecimal a10, BigDecimal b10) {
            return a10.subtract(b10);
        }

        @Override // jj.p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public double c(BigDecimal bigDecimal) {
            return bigDecimal.doubleValue();
        }

        @Override // jj.p
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int d(BigDecimal bigDecimal) {
            return bigDecimal.signum();
        }

        @Override // jj.p
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public BigDecimal e(double d10, RoundingMode mode) {
            return new BigDecimal(d10);
        }
    }

    public static double a(BigDecimal x10, RoundingMode mode) {
        return C0943a.f100502a.b(x10, mode);
    }
}
