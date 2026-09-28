package defpackage;

import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;

/* JADX INFO: loaded from: classes8.dex */
public class sso<REQUEST, RESPONSE> {
    public static final nbd k = new nbd(YAzniTbXHYQ.YEJXnZ);
    public static final kge0 l = kge0.e;
    public final zig0 a;
    public final era0<? super REQUEST> b;
    public final zqa0<? super REQUEST> c;
    public final lra0<? super REQUEST, ? super RESPONSE> d;
    public final cra0<? super REQUEST>[] e;
    public final o21<? super REQUEST, ? super RESPONSE>[] f;
    public final p0b<? super REQUEST>[] g;
    public final a2z[] h;
    public final o21<? super REQUEST, ? super RESPONSE>[] i;
    public final tra0 j;

    public class a {
    }

    public sso(ato<REQUEST, RESPONSE> atoVar) {
        ArrayList arrayList;
        i1z i1zVar = atoVar.a;
        ajg0 ajg0VarF = i1zVar.g().f("io.opentelemetry.okhttp-3.0");
        String str = atoVar.i;
        if (str != null) {
            ajg0VarF.a(str);
        }
        String strA = atoVar.a();
        if (strA != null) {
            ajg0VarF.b(strA);
        }
        this.a = ajg0VarF.build();
        this.b = atoVar.b;
        this.c = atoVar.k;
        this.d = atoVar.l;
        this.e = (cra0[]) atoVar.c.toArray(new cra0[0]);
        this.f = (o21[]) atoVar.d.toArray(new o21[0]);
        this.g = (p0b[]) atoVar.f.toArray(new p0b[0]);
        ArrayList arrayList2 = atoVar.g;
        ArrayList arrayList3 = atoVar.h;
        if (arrayList3.isEmpty()) {
            arrayList = new ArrayList(arrayList2);
        } else {
            ArrayList arrayList4 = new ArrayList(arrayList3.size() + arrayList2.size());
            arrayList4.addAll(arrayList2);
            gpv gpvVarF = i1zVar.d().f("io.opentelemetry.okhttp-3.0");
            if (str != null) {
                gpvVarF.a(str);
            }
            String strA2 = atoVar.a();
            if (strA2 != null) {
                gpvVarF.b(strA2);
            }
            fpv fpvVarBuild = gpvVarF.build();
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList3.get(i);
                i++;
                arrayList4.add(((b2z) obj).a(fpvVarBuild));
            }
            arrayList = arrayList4;
        }
        this.h = (a2z[]) arrayList.toArray(new a2z[0]);
        this.i = (o21[]) atoVar.e.toArray(new o21[0]);
        Class<?> cls = ccd.a;
        d2g d2gVar = d2g.a;
        if (i1zVar instanceof v2h) {
            d2gVar.getClass();
        }
        String property = System.getProperty("otel.instrumentation.experimental.span-suppression-strategy");
        property = property == null ? System.getenv("otel.instrumentation.experimental.span-suppression-strategy".toUpperCase(Locale.ROOT).replace('-', '_').replace('.', '_')) : property;
        property = property == null ? "" : property;
        d2gVar.getClass();
        property = property.isEmpty() ? null : property;
        rra0.a aVar = rra0.a;
        String lowerCase = (property == null ? "semconv" : property).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        this.j = new tra0((!lowerCase.equals("span-kind") ? !lowerCase.equals("none") ? rra0.c : rra0.a : rra0.b).a(atoVar.b()));
    }

    public final void a(m0b m0bVar, Interceptor.Chain chain, Object obj, Throwable th, Instant instant) {
        oqa0 oqa0VarI = oqa0.i(m0bVar);
        if (th != null) {
            th = ccd.a(th);
            oqa0VarI.g(th);
        }
        Throwable th2 = th;
        wgh0 wgh0Var = new wgh0();
        for (o21<? super REQUEST, ? super RESPONSE> o21Var : this.f) {
            o21Var.b(wgh0Var, m0bVar, chain, obj, th2);
        }
        oqa0VarI.c(wgh0Var);
        a2z[] a2zVarArr = (a2z[]) m0bVar.b(k);
        if (a2zVarArr == null) {
            a2zVarArr = this.h;
        }
        this.d.a(new kra0(oqa0VarI), chain, obj, th2);
        if (a2zVarArr.length != 0) {
            o21<? super REQUEST, ? super RESPONSE>[] o21VarArr = this.i;
            if (o21VarArr.length != 0) {
                wgh0Var = new wgh0();
                wgh0Var.putAll(wgh0Var);
                for (o21<? super REQUEST, ? super RESPONSE> o21Var2 : o21VarArr) {
                    o21Var2.b(wgh0Var, m0bVar, chain, obj, th2);
                }
            }
            long jNanoTime = instant == null ? System.nanoTime() : TimeUnit.SECONDS.toNanos(instant.getEpochSecond()) + ((long) instant.getNano());
            for (int length = a2zVarArr.length - 1; length >= 0; length--) {
                a2zVarArr[length].b(m0bVar, wgh0Var, jNanoTime);
            }
        }
        if (instant != null) {
            oqa0VarI.l(instant);
        } else {
            oqa0VarI.end();
        }
    }

    public final m0b b(m0b m0bVar, Interceptor.Chain chain, Instant instant) {
        wpm wpmVar;
        nbd nbdVar = sdt.a;
        wqa0 wqa0VarA = this.c.a();
        qqa0 qqa0VarG = this.a.a(this.b.a(chain)).g(wqa0VarA);
        if (instant != null) {
            qqa0VarG.d(instant);
        }
        for (cra0<? super REQUEST> cra0Var : this.e) {
            cra0Var.a();
        }
        wgh0 wgh0Var = new wgh0();
        for (o21<? super REQUEST, ? super RESPONSE> o21Var : this.f) {
            o21Var.a(wgh0Var, m0bVar, chain);
        }
        m0b m0bVarB = m0bVar;
        for (p0b<? super REQUEST> p0bVar : this.g) {
            m0bVarB = p0bVar.b();
        }
        ui1 ui1VarB = oqa0.i(m0bVar).b();
        boolean z = !ui1VarB.f() || ui1VarB.e();
        boolean z2 = ((oqa0) m0bVarB.b(nbdVar)) != null;
        qqa0VarG.mo101c(wgh0Var);
        oqa0 oqa0VarB = qqa0VarG.h(m0bVarB).b();
        m0b m0bVarC = m0bVarB.c(oqa0VarB);
        if (this.h.length != 0) {
            if (this.i.length != 0) {
                wgh0 wgh0Var2 = new wgh0();
                wgh0Var2.putAll(wgh0Var);
                for (o21<? super REQUEST, ? super RESPONSE> o21Var2 : this.i) {
                    o21Var2.a(wgh0Var2, m0bVar, chain);
                }
                wgh0Var = wgh0Var2;
            }
            long jNanoTime = instant == null ? System.nanoTime() : TimeUnit.SECONDS.toNanos(instant.getEpochSecond()) + ((long) instant.getNano());
            for (a2z a2zVar : this.h) {
                m0bVarC = a2zVar.a(m0bVarC, wgh0Var, jNanoTime);
            }
        }
        nbd nbdVar2 = k;
        if (m0bVarC.b(nbdVar2) != null) {
            m0bVarC = m0bVarC.a(nbdVar2, this.h);
        }
        if (z) {
            m0bVarC = m0bVarC.a(nbdVar, oqa0VarB);
        }
        if (!z2 && wqa0VarA == wqa0.b && (wpmVar = (wpm) m0bVarC.b(wpm.b)) != null && wpmVar.a == null) {
            wpmVar.a = oqa0VarB;
        }
        return this.j.a.a(m0bVarC, wqa0VarA, oqa0VarB);
    }

    public final boolean c(m0b m0bVar, Interceptor.Chain chain) {
        wqa0 wqa0VarA = this.c.a();
        boolean zB = this.j.b(m0bVar, wqa0VarA);
        if (zB) {
            kge0 kge0Var = l;
            if (kge0Var.a) {
                kge0.a aVar = (kge0.a) kge0Var.c.computeIfAbsent("io.opentelemetry.okhttp-3.0", new gge0());
                aVar.getClass();
                int iOrdinal = wqa0VarA.ordinal();
                if (iOrdinal == 0) {
                    aVar.c.incrementAndGet();
                } else if (iOrdinal == 1) {
                    aVar.a.incrementAndGet();
                } else if (iOrdinal == 2) {
                    aVar.b.incrementAndGet();
                } else if (iOrdinal == 3) {
                    aVar.e.incrementAndGet();
                } else if (iOrdinal == 4) {
                    aVar.d.incrementAndGet();
                }
            }
        }
        return !zB;
    }

    static {
        gto.a = new a();
    }
}
