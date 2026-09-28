package j$.time.format;

import j$.time.chrono.Chronology;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements e {
    public final j$.time.temporal.n a;
    public final TextStyle b;
    public final z c;
    public volatile i d;

    public q(j$.time.temporal.n nVar, TextStyle textStyle, z zVar) {
        this.a = nVar;
        this.b = textStyle;
        this.c = zVar;
    }

    @Override // j$.time.format.e
    public final int C(u uVar, CharSequence charSequence, int i) {
        z zVar = this.c;
        j$.time.temporal.n nVar = this.a;
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException();
        }
        boolean z = uVar.c;
        DateTimeFormatter dateTimeFormatter = uVar.a;
        TextStyle textStyle = z ? this.b : null;
        Chronology chronology = uVar.c().c;
        if (chronology == null && (chronology = uVar.a.e) == null) {
            chronology = j$.time.chrono.p.d;
        }
        Chronology chronology2 = chronology;
        Iterator itF = (chronology2 == null || chronology2 == j$.time.chrono.p.d) ? zVar.f(nVar, textStyle, dateTimeFormatter.b) : zVar.e(chronology2, nVar, textStyle, dateTimeFormatter.b);
        if (itF != null) {
            while (itF.hasNext()) {
                Map.Entry entry = (Map.Entry) itF.next();
                String str = (String) entry.getKey();
                if (uVar.g(str, 0, charSequence, i, str.length())) {
                    return uVar.f(this.a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                }
            }
            if (nVar == j$.time.temporal.a.ERA && !uVar.c) {
                for (j$.time.chrono.j jVar : chronology2.B()) {
                    String string = jVar.toString();
                    if (uVar.g(string, 0, charSequence, i, string.length())) {
                        return uVar.f(this.a, jVar.getValue(), i, string.length() + i);
                    }
                }
            }
            if (uVar.c) {
                return ~i;
            }
        }
        if (this.d == null) {
            this.d = new i(this.a, 1, 19, c0.NORMAL);
        }
        return this.d.C(uVar, charSequence, i);
    }

    public final String toString() {
        TextStyle textStyle = TextStyle.FULL;
        TextStyle textStyle2 = this.b;
        j$.time.temporal.n nVar = this.a;
        if (textStyle2 == textStyle) {
            return "Text(" + nVar + ")";
        }
        return "Text(" + nVar + "," + textStyle2 + ")";
    }

    @Override // j$.time.format.e
    public final boolean x(w wVar, StringBuilder sb) {
        Long lA = wVar.a(this.a);
        DateTimeFormatter dateTimeFormatter = wVar.b;
        if (lA == null) {
            return false;
        }
        Chronology chronology = (Chronology) wVar.a.d(j$.time.temporal.o.b);
        String strD = (chronology == null || chronology == j$.time.chrono.p.d) ? this.c.d(this.a, lA.longValue(), this.b, dateTimeFormatter.b) : this.c.c(chronology, this.a, lA.longValue(), this.b, dateTimeFormatter.b);
        if (strD != null) {
            sb.append(strD);
            return true;
        }
        if (this.d == null) {
            this.d = new i(this.a, 1, 19, c0.NORMAL);
        }
        return this.d.x(wVar, sb);
    }
}
