package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import androidx.work.d;
import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class bjb0 implements f4g, fma {
    public static volatile on50 a;

    public static String L(BigDecimal bigDecimal, Locale locale) {
        return bigDecimal == null ? U(0L, locale) : String.format(locale, "%,.2f", bigDecimal);
    }

    public static String M(BigDecimal bigDecimal) {
        return bigDecimal == null ? "0" : String.format(Locale.US, "%,.0f", bigDecimal);
    }

    public static String O(double d) {
        return String.format(Locale.US, "%,.2f", Double.valueOf(d));
    }

    public static String P(String str, Locale locale) {
        if (str != null) {
            int length = str.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (!Character.isWhitespace(iCodePointAt)) {
                    DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(locale);
                    return String.format(locale, "%,.2f", new BigDecimal(str.replace(String.valueOf(decimalFormatSymbols.getGroupingSeparator()), "").replace(String.valueOf(decimalFormatSymbols.getDecimalSeparator()), ".")));
                }
                iCharCount += Character.charCount(iCodePointAt);
            }
        }
        return U(0L, locale);
    }

    @Deprecated
    public static String S(String str) {
        hp0 hp0Var = hp0.A;
        hp0Var.getClass();
        Context applicationContext = hp0Var.getApplicationContext();
        applicationContext.getClass();
        return ((cnh0) qag.a(applicationContext, cnh0.class)).G().h(str);
    }

    public static String U(long j, Locale locale) {
        return String.format(locale, "%,.2f", BigDecimal.valueOf(j).divide(BigDecimal.valueOf(10000L), 2, RoundingMode.HALF_UP));
    }

    public static String V(long j) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j);
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(10000L);
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal bigDecimalDivide = bigDecimalValueOf.divide(bigDecimalValueOf2, 2, roundingMode);
        return BigDecimal.valueOf(bigDecimalDivide.longValue()).compareTo(bigDecimalDivide) == 0 ? String.format(Locale.US, "%,.0f", BigDecimal.valueOf(j).divide(BigDecimal.valueOf(10000L), 0, roundingMode)) : String.format(Locale.US, "%,.2f", bigDecimalDivide);
    }

    public static String W(long j) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j);
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(10000L);
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal bigDecimalDivide = bigDecimalValueOf.divide(bigDecimalValueOf2, 2, roundingMode);
        return BigDecimal.valueOf(bigDecimalDivide.longValue()).compareTo(bigDecimalDivide) == 0 ? BigDecimal.valueOf(j).divide(BigDecimal.valueOf(10000L), 0, roundingMode).toString() : String.format(Locale.US, "%.2f", bigDecimalDivide);
    }

    public static String X(long j) {
        return String.format(Locale.US, "%.2f", BigDecimal.valueOf(j).divide(BigDecimal.valueOf(10000L), 2, RoundingMode.HALF_UP));
    }

    public static String Y(BigDecimal bigDecimal) {
        return String.format(Locale.US, "%,.2f", bigDecimal);
    }

    public static String Z(double d, RoundingMode roundingMode) {
        return String.format(Locale.US, "%,.2f", BigDecimal.valueOf(d).setScale(2, roundingMode));
    }

    @Deprecated
    public static double d0(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0.0d;
        }
        try {
            return Double.parseDouble(str);
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public static String f0(String str) {
        return new DecimalFormat("0.##").format(Float.parseFloat(str));
    }

    @Override // defpackage.fma
    public void A(int i, int i2, pd80 pd80Var) {
        pd80Var.getClass();
        J(pd80Var, i);
        C(i2);
    }

    @Override // defpackage.fma
    public void B(wv20 wv20Var, int i, char c) {
        J(wv20Var, i);
        y(c);
    }

    @Override // defpackage.f4g
    public void C(int i) {
        K(Integer.valueOf(i));
    }

    @Override // defpackage.fma
    public void D(pd80 pd80Var, int i, he80 he80Var, Object obj) {
        pd80Var.getClass();
        he80Var.getClass();
        J(pd80Var, i);
        if (he80Var.getDescriptor().b()) {
            x(he80Var, obj);
        } else if (obj == null) {
            t();
        } else {
            x(he80Var, obj);
        }
    }

    @Override // defpackage.f4g
    public void E(String str) {
        str.getClass();
        K(str);
    }

    public abstract void F(hq60 hq60Var, Object obj);

    public abstract String G();

    public abstract d H(Context context, String str, WorkerParameters workerParameters);

    public d I(Context context, String str, WorkerParameters workerParameters) {
        context.getClass();
        str.getClass();
        workerParameters.getClass();
        d dVarH = H(context, str, workerParameters);
        if (dVarH == null) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(d.class);
                clsAsSubclass.getClass();
                try {
                    Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                    objNewInstance.getClass();
                    dVarH = (d) objNewInstance;
                } catch (Throwable th) {
                    jgt.e().d(txj0.a, "Could not instantiate ".concat(str), th);
                    throw th;
                }
            } catch (Throwable th2) {
                jgt.e().d(txj0.a, "Invalid class: ".concat(str), th2);
                throw th2;
            }
        }
        if (!dVarH.d) {
            return dVarH;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }

    public void J(pd80 pd80Var, int i) {
        pd80Var.getClass();
    }

    public void K(Object obj) {
        obj.getClass();
        throw new ee80("Non-serializable " + jq40.a(obj.getClass()) + " is not supported by " + jq40.a(getClass()) + " encoder");
    }

    public String Q() {
        return null;
    }

    public String R() {
        return null;
    }

    public void T(vp60 vp60Var, Object obj) {
        vp60Var.getClass();
        if (obj == null) {
            return;
        }
        hq60 hq60VarH1 = vp60Var.H1(G());
        try {
            F(hq60VarH1, obj);
            hq60VarH1.D1();
            vc1.a(hq60VarH1, null);
            wp60.a(vp60Var);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                vc1.a(hq60VarH1, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.fma
    public boolean a(pd80 pd80Var) {
        pd80Var.getClass();
        return true;
    }

    @Override // defpackage.fma
    public void b(pd80 pd80Var) {
        pd80Var.getClass();
    }

    public abstract void b0(int i);

    @Override // defpackage.f4g
    public fma c(pd80 pd80Var) {
        pd80Var.getClass();
        return this;
    }

    public abstract void c0(Typeface typeface, boolean z);

    @Override // defpackage.f4g
    public void e(double d) {
        K(Double.valueOf(d));
    }

    public abstract m21 e0(m21 m21Var);

    @Override // defpackage.fma
    public void f(pd80 pd80Var, int i, long j) {
        pd80Var.getClass();
        J(pd80Var, i);
        p(j);
    }

    @Override // defpackage.f4g
    public void g(byte b) {
        K(Byte.valueOf(b));
    }

    public abstract void g0(byte[] bArr, int i, int i2);

    @Override // defpackage.f4g
    public f4g h(pd80 pd80Var) {
        pd80Var.getClass();
        return this;
    }

    @Override // defpackage.fma
    public void i(pd80 pd80Var, int i, boolean z) {
        pd80Var.getClass();
        J(pd80Var, i);
        v(z);
    }

    @Override // defpackage.fma
    public void j(pd80 pd80Var, int i, double d) {
        pd80Var.getClass();
        J(pd80Var, i);
        e(d);
    }

    @Override // defpackage.fma
    public void k(wv20 wv20Var, int i, byte b) {
        J(wv20Var, i);
        g(b);
    }

    @Override // defpackage.fma
    public void l(wv20 wv20Var, int i, float f) {
        J(wv20Var, i);
        w(f);
    }

    @Override // defpackage.f4g
    public void m(pd80 pd80Var, int i) {
        pd80Var.getClass();
        K(Integer.valueOf(i));
    }

    @Override // defpackage.fma
    public void n(wv20 wv20Var, int i, short s) {
        J(wv20Var, i);
        u(s);
    }

    @Override // defpackage.fma
    public void o(pd80 pd80Var, int i, String str) {
        pd80Var.getClass();
        str.getClass();
        J(pd80Var, i);
        E(str);
    }

    @Override // defpackage.f4g
    public void p(long j) {
        K(Long.valueOf(j));
    }

    @Override // defpackage.fma
    public void q(pd80 pd80Var, int i, he80 he80Var, Object obj) {
        pd80Var.getClass();
        he80Var.getClass();
        J(pd80Var, i);
        x(he80Var, obj);
    }

    @Override // defpackage.fma
    public f4g r(wv20 wv20Var, int i) {
        J(wv20Var, i);
        return h(wv20Var.g(i));
    }

    @Override // defpackage.f4g
    public void t() {
        throw new ee80("'null' is not supported by default");
    }

    @Override // defpackage.f4g
    public void u(short s) {
        K(Short.valueOf(s));
    }

    @Override // defpackage.f4g
    public void v(boolean z) {
        K(Boolean.valueOf(z));
    }

    @Override // defpackage.f4g
    public void w(float f) {
        K(Float.valueOf(f));
    }

    @Override // defpackage.f4g
    public void y(char c) {
        K(Character.valueOf(c));
    }

    @Override // defpackage.f4g
    public void z() {
    }

    public static String N(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return yFmFZvuWxAYfEj.omWNQBiL;
        }
        return bigDecimal.subtract(BigDecimal.valueOf(bigDecimal.longValue())).compareTo(BigDecimal.ZERO) > 0 ? String.format(Locale.US, "%,.2f", bigDecimal) : String.format(Locale.US, "%,.0f", bigDecimal);
    }

    public static String a0(double d, Locale locale) {
        return String.format(locale, LGxrN.neSERaZIbsxd, BigDecimal.valueOf(d));
    }
}
