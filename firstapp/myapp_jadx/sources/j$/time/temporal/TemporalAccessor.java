package j$.time.temporal;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public interface TemporalAccessor {
    default Object d(j$.time.f fVar) {
        if (fVar == o.a || fVar == o.b || fVar == o.c) {
            return null;
        }
        return fVar.l(this);
    }

    default int h(n nVar) {
        q qVarL = l(nVar);
        if (!qVarL.d()) {
            throw new p("Invalid field " + nVar + " for get() method, use getLong() instead");
        }
        long jK = k(nVar);
        if (qVarL.e(jK)) {
            return (int) jK;
        }
        throw new j$.time.b("Invalid value for " + nVar + " (valid values " + qVarL + "): " + jK);
    }

    boolean i(n nVar);

    long k(n nVar);

    default q l(n nVar) {
        if (!(nVar instanceof a)) {
            Objects.requireNonNull(nVar, "field");
            return nVar.C(this);
        }
        if (i(nVar)) {
            return ((a) nVar).b;
        }
        throw new p(j$.time.c.a("Unsupported field: ", nVar));
    }
}
