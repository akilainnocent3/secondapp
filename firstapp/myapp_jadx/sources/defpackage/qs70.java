package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes8.dex */
public final class qs70 implements fpv {
    public static final Logger g = Logger.getLogger(qs70.class.getName());
    public static final boolean h;
    public static final Pattern i;
    public static final fpv j;
    public final Object a = new Object();
    public final ArrayList b = new ArrayList();
    public final pj1 c;
    public final oso d;
    public final Map<mw40, rpv> e;
    public volatile boolean f;

    public static class a implements x7k0 {
        public final ArrayList b;

        public a(ArrayList arrayList) {
            this.b = arrayList;
        }

        @Override // defpackage.x7k0
        public final void a(double d, m21 m21Var, m0b m0bVar) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((x7k0) obj).a(d, m21Var, m0bVar);
            }
        }

        @Override // defpackage.x7k0
        public final void b(long j, m21 m21Var, m0b m0bVar) {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((x7k0) obj).b(j, m21Var, m0bVar);
            }
        }
    }

    static {
        boolean z;
        try {
            i2h.a aVar = i2h.a;
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        h = z;
        i = Pattern.compile("([A-Za-z]){1}([A-Za-z0-9\\_\\-\\./]){0,254}");
        j = ied.a.d("noop");
    }

    public qs70(pj1 pj1Var, oso osoVar, List list, oj1 oj1Var) {
        this.d = osoVar;
        this.c = pj1Var;
        this.e = (Map) list.stream().collect(Collectors.toMap(Function.identity(), new ps70()));
        this.f = oj1Var.a();
    }

    public static boolean e(String str) {
        if (i.matcher(str).matches()) {
            return true;
        }
        Level level = Level.WARNING;
        Logger logger = g;
        if (!logger.isLoggable(level)) {
            return false;
        }
        logger.log(level, tug.a("Instrument name \"", str, "\" is invalid, returning noop instrument. Instrument names must consist of 255 or fewer characters including alphanumeric, _, ., -, /, and start with a letter."), (Throwable) new AssertionError());
        return false;
    }

    @Override // defpackage.fpv
    public final ukt a(String str) {
        if (e(str)) {
            return h ? new h3h.a(this, str) : new os70.a(this, str);
        }
        return j.a("noop");
    }

    @Override // defpackage.fpv
    public final tjt b(String str) {
        if (e(str)) {
            return h ? new c3h.a(this, str) : new ls70.a(this, str);
        }
        return j.b("noop");
    }

    @Override // defpackage.fpv
    public final oze c(String str) {
        if (e(str)) {
            return h ? new w2h(this, str) : new as70(this, str);
        }
        return j.c("noop");
    }

    @Override // defpackage.fpv
    public final qze d(String str) {
        if (e(str)) {
            return h ? new y2h.a(this, str) : new cs70.a(this, str);
        }
        return j.d("noop");
    }

    public final String toString() {
        return "SdkMeter{instrumentationScopeInfo=" + this.d + "}";
    }
}
