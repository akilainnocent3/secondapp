package defpackage;

import com.appsflyer.internal.l;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes8.dex */
public final class at70 implements oqa0, r340 {
    public static final Logger u = Logger.getLogger(at70.class.getName());
    public final ara0 a;
    public final ui1 b;
    public final ui1 c;
    public final fra0 d;
    public final gcd e;
    public final wqa0 f;
    public final p00 g;
    public final pg50 h;
    public final oso i;
    public final long j;
    public final Runnable k;
    public final String m;
    public q21 n;
    public ArrayList o;
    public long r;
    public Thread t;
    public final Object l = new Object();
    public int p = 0;
    public vi1 q = vi1.c;
    public a s = a.a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("NOT_ENDED", 0);
            a = aVar;
            a aVar2 = new a("ENDING", 1);
            b = aVar2;
            a aVar3 = new a("ENDED", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    public at70(ui1 ui1Var, String str, oso osoVar, wqa0 wqa0Var, ui1 ui1Var2, ara0 ara0Var, fra0 fra0Var, gcd gcdVar, p00 p00Var, pg50 pg50Var, q21 q21Var, long j, Runnable runnable) {
        this.b = ui1Var;
        this.i = osoVar;
        this.c = ui1Var2;
        this.m = str;
        this.f = wqa0Var;
        this.d = fra0Var;
        this.e = gcdVar;
        this.h = pg50Var;
        this.g = p00Var;
        this.j = j;
        this.n = q21Var;
        this.a = ara0Var;
        this.k = runnable;
    }

    @Override // defpackage.oqa0
    /* JADX INFO: renamed from: a */
    public final oqa0 f(e21 e21Var, Object obj) {
        if (e21Var == null || e21Var.getKey().isEmpty() || obj == null) {
            return this;
        }
        synchronized (this.l) {
            try {
                if (!n()) {
                    u.log(Level.FINE, "Calling setAttribute() on an ended Span.");
                    return this;
                }
                q21 q21Var = this.n;
                if (q21Var == null) {
                    q21 q21Var2 = new q21(this.a.b(), this.a.a());
                    this.n = q21Var2;
                    q21Var = q21Var2;
                }
                q21Var.put(e21Var, obj);
                return this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.oqa0
    public final ui1 b() {
        return this.b;
    }

    @Override // defpackage.r340
    public final rk1 e() {
        List listUnmodifiableList;
        m21 m21VarA;
        rk1 rk1Var;
        synchronized (this.l) {
            List list = Collections.EMPTY_LIST;
            ArrayList arrayList = this.o;
            if (arrayList == null) {
                listUnmodifiableList = list;
            } else {
                listUnmodifiableList = this.s == a.c ? Collections.unmodifiableList(arrayList) : Collections.unmodifiableList(new ArrayList(this.o));
            }
            q21 q21Var = this.n;
            if (q21Var == null || q21Var.isEmpty()) {
                m21VarA = vw0.d;
            } else {
                a aVar = this.s;
                a aVar2 = a.c;
                m21VarA = this.n;
                if (aVar != aVar2) {
                    m21VarA.getClass();
                    xw0 xw0Var = new xw0();
                    xw0Var.c(m21VarA);
                    m21VarA = xw0Var.a();
                }
            }
            m21 m21Var = m21VarA;
            q21 q21Var2 = this.n;
            rk1Var = new rk1(this, list, listUnmodifiableList, m21Var, q21Var2 == null ? 0 : q21Var2.c, this.p, this.q, this.m, this.r, this.s == a.c);
        }
        return rk1Var;
    }

    @Override // defpackage.oqa0
    public final void end() {
        m(this.g.a());
    }

    @Override // defpackage.oqa0
    public final void g(Throwable th) {
        o(th, vw0.d);
    }

    @Override // defpackage.oqa0
    public final /* bridge */ /* synthetic */ oqa0 h(Throwable th, m21 m21Var) {
        o(th, m21Var);
        return this;
    }

    @Override // defpackage.oqa0
    public final void j(long j) {
        m(j == 0 ? this.g.a() : TimeUnit.NANOSECONDS.toNanos(j));
    }

    @Override // defpackage.oqa0
    public final oqa0 k() {
        xzd0 xzd0Var = xzd0.c;
        synchronized (this.l) {
            try {
                if (!n()) {
                    u.log(Level.FINE, "Calling setStatus() on an ended Span.");
                    return this;
                }
                if (this.q.a == xzd0.b) {
                    u.log(Level.FINE, "Calling setStatus() on a Span that is already set to OK.");
                    return this;
                }
                vi1 vi1Var = vi1.c;
                this.q = "".isEmpty() ? vi1.d : new vi1(xzd0Var, "");
                return this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(long j) {
        synchronized (this.l) {
            try {
                if (this.s != a.a) {
                    u.log(Level.FINE, "Calling end() on an ended or ending Span.");
                    return;
                }
                this.r = j;
                this.t = Thread.currentThread();
                this.s = a.b;
                this.k.run();
                fra0 fra0Var = this.d;
                if (fra0Var instanceof m3h) {
                    m3h m3hVar = (m3h) fra0Var;
                    if (m3hVar.U()) {
                        m3hVar.T(this);
                    }
                }
                synchronized (this.l) {
                    this.s = a.c;
                }
                if (this.d.B1()) {
                    this.d.r0(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean n() {
        a aVar = this.s;
        if (aVar != a.a) {
            return aVar == a.b && Thread.currentThread() == this.t;
        }
        return true;
    }

    public final void o(Throwable th, m21 m21Var) {
        String strSubstring;
        if (th == null) {
            return;
        }
        if (m21Var == null) {
            m21Var = vw0.d;
        }
        int iA = this.a.a();
        final q21 q21Var = new q21(this.a.b(), this.a.a());
        gcd gcdVar = this.e;
        String canonicalName = th.getClass().getCanonicalName();
        if (canonicalName != null) {
            q21Var.put(ntg.a, canonicalName);
        }
        String message = th.getMessage();
        if (message != null) {
            q21Var.put(ntg.b, message);
        }
        if (gcdVar.d) {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            try {
                th.printStackTrace(printWriter);
                printWriter.close();
                strSubstring = stringWriter.toString();
            } catch (Throwable th2) {
                try {
                    printWriter.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } else {
            eld0 eld0Var = new eld0(iA, th);
            StringBuilder sb = eld0Var.b;
            if (sb.length() == 0) {
                sb.append(th);
                sb.append(System.lineSeparator());
                if (!eld0Var.b()) {
                    StackTraceElement[] stackTrace = th.getStackTrace();
                    int length = stackTrace.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            Set<Throwable> setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                            setNewSetFromMap.add(th);
                            for (Throwable th4 : th.getSuppressed()) {
                                eld0Var.a(stackTrace, th4, "\t", "Suppressed: ", setNewSetFromMap);
                            }
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                break;
                            }
                            eld0Var.a(stackTrace, cause, "", "Caused by: ", setNewSetFromMap);
                            break;
                        }
                        StackTraceElement stackTraceElement = stackTrace[i];
                        sb.append("\tat ");
                        sb.append(stackTraceElement);
                        sb.append(System.lineSeparator());
                        if (eld0Var.b()) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            strSubstring = sb.substring(0, Math.min(sb.length(), eld0Var.a));
        }
        q21Var.put(ntg.c, strSubstring);
        m21Var.forEach(new BiConsumer() { // from class: zs70
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                q21Var.put((e21) obj, obj2);
            }
        });
        ri1 ri1Var = new ri1(q21Var, this.g.a(), q21Var.c, th);
        synchronized (this.l) {
            try {
                if (!n()) {
                    u.log(Level.FINE, "Calling addEvent() on an ended Span.");
                    return;
                }
                ArrayList arrayList = this.o;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.o = arrayList;
                }
                if (arrayList.size() < this.a.e()) {
                    this.o.add(ri1Var);
                }
                this.p++;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    public final String toString() {
        String str;
        String strValueOf;
        String strValueOf2;
        long j;
        long j2;
        synchronized (this.l) {
            str = this.m;
            strValueOf = String.valueOf(this.n);
            strValueOf2 = String.valueOf(this.q);
            j = this.p;
            j2 = this.r;
        }
        StringBuilder sb = new StringBuilder("SdkSpan{traceId=");
        sb.append(this.b.a);
        sb.append(", spanId=");
        sb.append(this.b.b);
        sb.append(", parentSpanContext=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(str);
        sb.append(", kind=");
        sb.append(this.f);
        sb.append(", attributes=");
        sb.append(strValueOf);
        sb.append(", status=");
        l.a(j, strValueOf2, ", totalRecordedEvents=", sb);
        sb.append(", totalRecordedLinks=0, startEpochNanos=");
        sb.append(this.j);
        return zug.a(j2, ", endEpochNanos=", "}", sb);
    }
}
