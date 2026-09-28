package defpackage;

import androidx.compose.runtime.m;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class i96 extends j8i0 {
    public final LinkedHashMap A;
    public final ssw<HashMap<Long, String>> B;
    public final LinkedHashMap C;
    public final ssw<HashMap<Long, String>> D;
    public final ssw<String> E;
    public final b390 F;
    public final t340 G;
    public final LinkedHashMap H;
    public final ssw<String> I;
    public final b390 J;
    public final t340 K;
    public final b390 L;
    public final t340 M;
    public final ConcurrentHashMap<String, Long> N;
    public final ConcurrentHashMap<String, Long> O;
    public final ytw<String> P;
    public final ssw<String> Q;
    public final xzm a;
    public final wzm b;
    public final vzm c;
    public final nhg0 d;
    public final b5 e;
    public jvd0 f;
    public String i;
    public String v;
    public jvd0 w;
    public jvd0 y;
    public final eal z;

    public i96(xzm xzmVar, wzm wzmVar, vzm vzmVar, nhg0 nhg0Var, b5 b5Var) {
        xzmVar.getClass();
        wzmVar.getClass();
        vzmVar.getClass();
        nhg0Var.getClass();
        b5Var.getClass();
        this.a = xzmVar;
        this.b = wzmVar;
        this.c = vzmVar;
        this.d = nhg0Var;
        this.e = b5Var;
        this.i = "";
        this.v = "";
        this.z = new eal();
        this.A = new LinkedHashMap();
        this.B = new ssw<>();
        this.C = new LinkedHashMap();
        this.D = new ssw<>();
        this.E = new ssw<>();
        pb5 pb5Var = pb5.b;
        b390 b390VarA = d390.a(1, 64, pb5Var);
        this.F = b390VarA;
        this.G = e1i.a(b390VarA);
        this.H = new LinkedHashMap();
        new ssw();
        this.I = new ssw<>();
        new ssw();
        new ssw();
        new ssw();
        new ssw();
        new ssw();
        new ssw();
        new ssw();
        b390 b390VarA2 = d390.a(1, 64, pb5Var);
        this.J = b390VarA2;
        this.K = e1i.a(b390VarA2);
        b390 b390VarA3 = d390.a(1, 64, pb5Var);
        this.L = b390VarA3;
        this.M = e1i.a(b390VarA3);
        this.N = new ConcurrentHashMap<>();
        this.O = new ConcurrentHashMap<>();
        this.P = m.b("");
        this.Q = new ssw<>();
        new ssw();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        super.onCleared();
        x1();
    }

    public final void x1() {
        jvd0 jvd0Var = this.f;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.f = null;
        jvd0 jvd0Var2 = this.w;
        if (jvd0Var2 != null) {
            jvd0Var2.cancel((CancellationException) null);
        }
        this.w = null;
        jvd0 jvd0Var3 = this.y;
        if (jvd0Var3 != null) {
            jvd0Var3.cancel((CancellationException) null);
        }
        this.y = null;
    }
}
