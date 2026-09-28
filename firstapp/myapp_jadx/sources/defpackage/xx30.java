package defpackage;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes7.dex */
public final class xx30 {
    public final SecureRandom a = new SecureRandom();

    public final double a() {
        SecureRandom secureRandom = this.a;
        double dNextDouble = secureRandom.nextDouble();
        if (dNextDouble < 1.0E-12d) {
            dNextDouble = 1.0E-12d;
        }
        double dCos = (Math.cos(secureRandom.nextDouble() * 6.283185307179586d) * Math.sqrt(Math.log(dNextDouble) * (-2.0d))) / 3.0d;
        return (-1.0d > dCos || dCos > 1.0d) ? a() : dCos;
    }

    public final int b(int i, int i2, boolean z) {
        int i3 = i2 - i;
        return (z ? (int) (Math.abs(a()) * ((double) (i3 + 1))) : this.a.nextInt(i3 + 1)) + i;
    }
}
