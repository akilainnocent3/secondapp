package defpackage;

import com.google.firebase.perf.metrics.Trace;

/* JADX INFO: loaded from: classes4.dex */
public final class so70 {
    public static final p80 a = p80.d();

    public static void a(Trace trace, izi iziVar) {
        int i = iziVar.a;
        int i2 = iziVar.c;
        int i3 = iziVar.b;
        if (i > 0) {
            trace.putMetric("_fr_tot", i);
        }
        if (i3 > 0) {
            trace.putMetric("_fr_slo", i3);
        }
        if (i2 > 0) {
            trace.putMetric("_fr_fzn", i2);
        }
        StringBuilder sb = new StringBuilder("Screen trace: ");
        sb.append(trace.d);
        sb.append(" _fr_tot:");
        d5d.a(sb, iziVar.a, " _fr_slo:", i3, " _fr_fzn:");
        sb.append(i2);
        a.a(sb.toString());
    }
}
