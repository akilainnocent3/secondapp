package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.util.Log;
import java.text.DecimalFormat;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f7937c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f7938d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f7939e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f7940f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f7941g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f7942h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f7943i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f7944j = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f7945k = 9;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f7946l = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f7947m = 25;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f7948n = new String(new char[25]).replace((char) 0, ' ');

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0.f f7949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ConstraintLayout f7950b;

    public e(ConstraintLayout constraintLayout) {
        this.f7949a = new i0.f();
        a(constraintLayout);
    }

    public void a(ConstraintLayout constraintLayout) {
        constraintLayout.fillMetrics(this.f7949a);
        this.f7950b = constraintLayout;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e clone() {
        return new e(this);
    }

    public final String c(e eVar, int i10) {
        String str = h(i10) + " -> " + eVar.h(i10);
        String str2 = f7948n + g(i10);
        return "CL Perf: " + (str2.substring(str2.length() - f7947m) + " = ") + str;
    }

    public final String d(DecimalFormat decimalFormat, e eVar, int i10) {
        String str = f(decimalFormat, h(i10) * 1.0E-6f, 7) + " -> " + f(decimalFormat, eVar.h(i10) * 1.0E-6f, 7) + "ms";
        String str2 = f7948n + g(i10);
        return "CL Perf: " + (str2.substring(str2.length() - f7947m) + " = ") + str;
    }

    public void e() {
        ConstraintLayout constraintLayout = this.f7950b;
        if (constraintLayout != null) {
            constraintLayout.fillMetrics(null);
        }
    }

    public final String f(DecimalFormat decimalFormat, float f10, int i10) {
        String str = new String(new char[i10]).replace((char) 0, ' ') + decimalFormat.format(f10);
        return str.substring(str.length() - i10);
    }

    public String g(int i10) {
        switch (i10) {
            case 1:
                return "NumberOfLayouts";
            case 2:
                return "MeasureCalls";
            case 3:
                return "ChildCount";
            case 4:
                return "ChildrenMeasures";
            case 5:
                return "MeasuresWidgetsDuration ";
            case 6:
                return "MeasureDuration";
            case 7:
                return "MeasuresLayoutDuration";
            case 8:
                return "SolverVariables";
            case 9:
                return "SolverEquations";
            case 10:
                return "SimpleEquations";
            default:
                return "";
        }
    }

    public long h(int i10) {
        switch (i10) {
            case 1:
                return this.f7949a.M;
            case 2:
                return this.f7949a.Q;
            case 3:
                return this.f7949a.P;
            case 4:
                return this.f7949a.N;
            case 5:
                return this.f7949a.f90198a;
            case 6:
                return this.f7949a.O;
            case 7:
                return this.f7949a.f90199b;
            case 8:
                return this.f7949a.T;
            case 9:
                return this.f7949a.S;
            case 10:
                return this.f7949a.U;
            default:
                return 0L;
        }
    }

    public final String i(int i10) {
        String string = Long.toString(h(i10));
        String str = f7948n + g(i10);
        return "CL Perf: " + (str.substring(str.length() - f7947m) + " = ") + string;
    }

    public final String j(DecimalFormat decimalFormat, int i10) {
        String strF = f(decimalFormat, h(i10) * 1.0E-6f, 7);
        String str = f7948n + g(i10);
        return "CL Perf: " + (str.substring(str.length() - f7947m) + " = ") + strF;
    }

    @SuppressLint({"LogConditional"})
    public final void k(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        Log.v(str, "CL Perf: --------  Performance .(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")  ------ ");
        DecimalFormat decimalFormat = new DecimalFormat("###.000");
        Log.v(str, j(decimalFormat, 5));
        Log.v(str, j(decimalFormat, 7));
        Log.v(str, j(decimalFormat, 6));
        Log.v(str, i(1));
        Log.v(str, i(2));
        Log.v(str, i(3));
        Log.v(str, i(4));
        Log.v(str, i(8));
        Log.v(str, i(9));
        Log.v(str, i(10));
    }

    public void l(String str) {
        k(str);
    }

    @SuppressLint({"LogConditional"})
    public void m(String str, e eVar) {
        if (eVar == null) {
            k(str);
            return;
        }
        DecimalFormat decimalFormat = new DecimalFormat("###.000");
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        Log.v(str, "CL Perf: -=  Performance .(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")  =- ");
        Log.v(str, d(decimalFormat, eVar, 5));
        Log.v(str, d(decimalFormat, eVar, 7));
        Log.v(str, d(decimalFormat, eVar, 6));
        Log.v(str, c(eVar, 1));
        Log.v(str, c(eVar, 2));
        Log.v(str, c(eVar, 3));
        Log.v(str, c(eVar, 4));
        Log.v(str, c(eVar, 8));
        Log.v(str, c(eVar, 9));
        Log.v(str, c(eVar, 10));
    }

    public void n() {
        this.f7949a.b();
    }

    public e(e eVar) {
        i0.f fVar = new i0.f();
        this.f7949a = fVar;
        fVar.a(eVar.f7949a);
    }
}
