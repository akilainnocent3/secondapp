package defpackage;

import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class ky0 {
    public static final Rational a = new Rational(4, 3);
    public static final Rational b = new Rational(3, 4);
    public static final Rational c = new Rational(16, 9);
    public static final Rational d = new Rational(9, 16);

    public static final class a implements Comparator<Rational> {
        public final RectF a;
        public final Rational b;

        public a(Rational rational, Rational rational2) {
            this.b = rational2 == null ? new Rational(4, 3) : rational2;
            this.a = b(rational);
        }

        public static float a(RectF rectF, RectF rectF2) {
            return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
        }

        public final RectF b(Rational rational) {
            float fFloatValue = rational.floatValue();
            Rational rational2 = this.b;
            if (fFloatValue == rational2.floatValue()) {
                return new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator());
            }
            return rational.floatValue() > rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
        }

        @Override // java.util.Comparator
        public final int compare(Rational rational, Rational rational2) {
            Rational rational3 = rational;
            Rational rational4 = rational2;
            boolean z = false;
            if (rational3.equals(rational4)) {
                return 0;
            }
            RectF rectFB = b(rational3);
            RectF rectFB2 = b(rational4);
            float fWidth = rectFB.width();
            RectF rectF = this.a;
            boolean z2 = fWidth >= rectF.width() && rectFB.height() >= rectF.height();
            if (rectFB2.width() >= rectF.width() && rectFB2.height() >= rectF.height()) {
                z = true;
            }
            if (z2 && z) {
                return (int) Math.signum((rectFB.height() * rectFB.width()) - (rectFB2.height() * rectFB2.width()));
            }
            if (z2) {
                return -1;
            }
            if (z) {
                return 1;
            }
            return -((int) Math.signum(a(rectFB, rectF) - a(rectFB2, rectF)));
        }
    }

    public static boolean a(Rational rational, Size size) {
        Size size2 = kx90.b;
        if (rational != null) {
            if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
                return true;
            }
            if (size.getHeight() * size.getWidth() >= kx90.a(size2)) {
                int width = size.getWidth();
                int height = size.getHeight();
                Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
                int i = width % 16;
                if (i == 0 && height % 16 == 0) {
                    if (b(Math.max(0, height - 16), width, rational) || b(Math.max(0, width - 16), height, rational2)) {
                        return true;
                    }
                } else {
                    if (i == 0) {
                        return b(height, width, rational);
                    }
                    if (height % 16 == 0) {
                        return b(width, height, rational2);
                    }
                }
            }
        }
        return false;
    }

    public static boolean b(int i, int i2, Rational rational) {
        km20.b(i2 % 16 == 0);
        double numerator = ((double) (rational.getNumerator() * i)) / ((double) rational.getDenominator());
        return numerator > ((double) Math.max(0, i2 + (-16))) && numerator < ((double) (i2 + 16));
    }
}
