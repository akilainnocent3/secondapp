package oa;

import a9.d1;
import a9.k0;
import a9.x0;
import androidx.annotation.NonNull;
import androidx.work.e0;
import androidx.work.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@a9.w(indices = {@k0({"schedule_requested_at"}), @k0({"period_start_time"})})
@y0({y0.a.LIBRARY_GROUP})
public final class r {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f118907t = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @a9.j(name = "id")
    @x0
    public String f118909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @a9.j(name = "state")
    public e0.a f118910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    @a9.j(name = "worker_class_name")
    public String f118911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @a9.j(name = "input_merger_class_name")
    public String f118912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    @a9.j(name = "input")
    public androidx.work.e f118913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    @a9.j(name = "output")
    public androidx.work.e f118914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @a9.j(name = "initial_delay")
    public long f118915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @a9.j(name = "interval_duration")
    public long f118916h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @a9.j(name = "flex_duration")
    public long f118917i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    @a9.v
    public androidx.work.c f118918j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @a9.j(name = "run_attempt_count")
    @k.e0(from = 0)
    public int f118919k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    @a9.j(name = "backoff_policy")
    public androidx.work.a f118920l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @a9.j(name = "backoff_delay_duration")
    public long f118921m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @a9.j(name = "period_start_time")
    public long f118922n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @a9.j(name = "minimum_retention_duration")
    public long f118923o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @a9.j(name = "schedule_requested_at")
    public long f118924p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @a9.j(name = "run_in_foreground")
    public boolean f118925q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    @a9.j(name = "out_of_quota_policy")
    public androidx.work.x f118926r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f118906s = androidx.work.r.f("WorkSpec");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final w.a<List<c>, List<e0>> f118908u = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements w.a<List<c>, List<e0>> {
        @Override // w.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<e0> apply(List<c> input) {
            if (input == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(input.size());
            Iterator<c> it = input.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a());
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @a9.j(name = "id")
        public String f118927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @a9.j(name = "state")
        public e0.a f118928b;

        public boolean equals(Object o10) {
            if (this == o10) {
                return true;
            }
            if (!(o10 instanceof b)) {
                return false;
            }
            b bVar = (b) o10;
            if (this.f118928b != bVar.f118928b) {
                return false;
            }
            return this.f118927a.equals(bVar.f118927a);
        }

        public int hashCode() {
            return (this.f118927a.hashCode() * 31) + this.f118928b.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @a9.j(name = "id")
        public String f118929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @a9.j(name = "state")
        public e0.a f118930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @a9.j(name = "output")
        public androidx.work.e f118931c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @a9.j(name = "run_attempt_count")
        public int f118932d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @d1(entity = u.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"tag"})
        public List<String> f118933e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @d1(entity = o.class, entityColumn = "work_spec_id", parentColumn = "id", projection = {"progress"})
        public List<androidx.work.e> f118934f;

        @NonNull
        public e0 a() {
            List<androidx.work.e> list = this.f118934f;
            return new e0(UUID.fromString(this.f118929a), this.f118930b, this.f118931c, this.f118933e, (list == null || list.isEmpty()) ? androidx.work.e.f20076c : this.f118934f.get(0), this.f118932d);
        }

        public boolean equals(Object o10) {
            if (this == o10) {
                return true;
            }
            if (!(o10 instanceof c)) {
                return false;
            }
            c cVar = (c) o10;
            if (this.f118932d != cVar.f118932d) {
                return false;
            }
            String str = this.f118929a;
            if (str == null ? cVar.f118929a != null : !str.equals(cVar.f118929a)) {
                return false;
            }
            if (this.f118930b != cVar.f118930b) {
                return false;
            }
            androidx.work.e eVar = this.f118931c;
            if (eVar == null ? cVar.f118931c != null : !eVar.equals(cVar.f118931c)) {
                return false;
            }
            List<String> list = this.f118933e;
            if (list == null ? cVar.f118933e != null : !list.equals(cVar.f118933e)) {
                return false;
            }
            List<androidx.work.e> list2 = this.f118934f;
            List<androidx.work.e> list3 = cVar.f118934f;
            if (list2 != null) {
                return list2.equals(list3);
            }
            return list3 == null;
        }

        public int hashCode() {
            String str = this.f118929a;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            e0.a aVar = this.f118930b;
            int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            androidx.work.e eVar = this.f118931c;
            int iHashCode3 = (((iHashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.f118932d) * 31;
            List<String> list = this.f118933e;
            int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            List<androidx.work.e> list2 = this.f118934f;
            return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
        }
    }

    public r(@NonNull String id2, @NonNull String workerClassName) {
        this.f118910b = e0.a.ENQUEUED;
        androidx.work.e eVar = androidx.work.e.f20076c;
        this.f118913e = eVar;
        this.f118914f = eVar;
        this.f118918j = androidx.work.c.f20055i;
        this.f118920l = androidx.work.a.EXPONENTIAL;
        this.f118921m = 30000L;
        this.f118924p = -1L;
        this.f118926r = androidx.work.x.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f118909a = id2;
        this.f118911c = workerClassName;
    }

    public long a() {
        if (c()) {
            return this.f118922n + Math.min(h0.f20106e, this.f118920l == androidx.work.a.LINEAR ? this.f118921m * ((long) this.f118919k) : (long) Math.scalb(this.f118921m, this.f118919k - 1));
        }
        if (!d()) {
            long jCurrentTimeMillis = this.f118922n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.f118915g;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j10 = this.f118922n;
        long j11 = j10 == 0 ? jCurrentTimeMillis2 + this.f118915g : j10;
        long j12 = this.f118917i;
        long j13 = this.f118916h;
        if (j12 != j13) {
            return j11 + j13 + (j10 == 0 ? j12 * (-1) : 0L);
        }
        return j11 + (j10 != 0 ? j13 : 0L);
    }

    public boolean b() {
        return !androidx.work.c.f20055i.equals(this.f118918j);
    }

    public boolean c() {
        return this.f118910b == e0.a.ENQUEUED && this.f118919k > 0;
    }

    public boolean d() {
        return this.f118916h != 0;
    }

    public void e(long backoffDelayDuration) {
        if (backoffDelayDuration > h0.f20106e) {
            androidx.work.r.c().h(f118906s, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            backoffDelayDuration = 18000000;
        }
        if (backoffDelayDuration < 10000) {
            androidx.work.r.c().h(f118906s, "Backoff delay duration less than minimum value", new Throwable[0]);
            backoffDelayDuration = 10000;
        }
        this.f118921m = backoffDelayDuration;
    }

    public boolean equals(Object o10) {
        if (this == o10) {
            return true;
        }
        if (o10 != null && r.class == o10.getClass()) {
            r rVar = (r) o10;
            if (this.f118915g != rVar.f118915g || this.f118916h != rVar.f118916h || this.f118917i != rVar.f118917i || this.f118919k != rVar.f118919k || this.f118921m != rVar.f118921m || this.f118922n != rVar.f118922n || this.f118923o != rVar.f118923o || this.f118924p != rVar.f118924p || this.f118925q != rVar.f118925q || !this.f118909a.equals(rVar.f118909a) || this.f118910b != rVar.f118910b || !this.f118911c.equals(rVar.f118911c)) {
                return false;
            }
            String str = this.f118912d;
            if (str == null ? rVar.f118912d != null : !str.equals(rVar.f118912d)) {
                return false;
            }
            if (this.f118913e.equals(rVar.f118913e) && this.f118914f.equals(rVar.f118914f) && this.f118918j.equals(rVar.f118918j) && this.f118920l == rVar.f118920l && this.f118926r == rVar.f118926r) {
                return true;
            }
        }
        return false;
    }

    public void f(long intervalDuration) {
        if (intervalDuration < androidx.work.y.f20321g) {
            androidx.work.r.c().h(f118906s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", Long.valueOf(androidx.work.y.f20321g)), new Throwable[0]);
            intervalDuration = 900000;
        }
        g(intervalDuration, intervalDuration);
    }

    public void g(long intervalDuration, long flexDuration) {
        if (intervalDuration < androidx.work.y.f20321g) {
            androidx.work.r.c().h(f118906s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", Long.valueOf(androidx.work.y.f20321g)), new Throwable[0]);
            intervalDuration = 900000;
        }
        if (flexDuration < 300000) {
            androidx.work.r.c().h(f118906s, String.format("Flex duration lesser than minimum allowed value; Changed to %s", 300000L), new Throwable[0]);
            flexDuration = 300000;
        }
        if (flexDuration > intervalDuration) {
            androidx.work.r.c().h(f118906s, String.format("Flex duration greater than interval duration; Changed to %s", Long.valueOf(intervalDuration)), new Throwable[0]);
            flexDuration = intervalDuration;
        }
        this.f118916h = intervalDuration;
        this.f118917i = flexDuration;
    }

    public int hashCode() {
        int iHashCode = ((((this.f118909a.hashCode() * 31) + this.f118910b.hashCode()) * 31) + this.f118911c.hashCode()) * 31;
        String str = this.f118912d;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f118913e.hashCode()) * 31) + this.f118914f.hashCode()) * 31;
        long j10 = this.f118915g;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f118916h;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f118917i;
        int iHashCode3 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f118918j.hashCode()) * 31) + this.f118919k) * 31) + this.f118920l.hashCode()) * 31;
        long j13 = this.f118921m;
        int i12 = (iHashCode3 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f118922n;
        int i13 = (i12 + ((int) (j14 ^ (j14 >>> 32)))) * 31;
        long j15 = this.f118923o;
        int i14 = (i13 + ((int) (j15 ^ (j15 >>> 32)))) * 31;
        long j16 = this.f118924p;
        return ((((i14 + ((int) (j16 ^ (j16 >>> 32)))) * 31) + (this.f118925q ? 1 : 0)) * 31) + this.f118926r.hashCode();
    }

    @NonNull
    public String toString() {
        return "{WorkSpec: " + this.f118909a + "}";
    }

    public r(@NonNull r other) {
        this.f118910b = e0.a.ENQUEUED;
        androidx.work.e eVar = androidx.work.e.f20076c;
        this.f118913e = eVar;
        this.f118914f = eVar;
        this.f118918j = androidx.work.c.f20055i;
        this.f118920l = androidx.work.a.EXPONENTIAL;
        this.f118921m = 30000L;
        this.f118924p = -1L;
        this.f118926r = androidx.work.x.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f118909a = other.f118909a;
        this.f118911c = other.f118911c;
        this.f118910b = other.f118910b;
        this.f118912d = other.f118912d;
        this.f118913e = new androidx.work.e(other.f118913e);
        this.f118914f = new androidx.work.e(other.f118914f);
        this.f118915g = other.f118915g;
        this.f118916h = other.f118916h;
        this.f118917i = other.f118917i;
        this.f118918j = new androidx.work.c(other.f118918j);
        this.f118919k = other.f118919k;
        this.f118920l = other.f118920l;
        this.f118921m = other.f118921m;
        this.f118922n = other.f118922n;
        this.f118923o = other.f118923o;
        this.f118924p = other.f118924p;
        this.f118925q = other.f118925q;
        this.f118926r = other.f118926r;
    }
}
