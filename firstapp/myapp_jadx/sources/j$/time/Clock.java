package j$.time;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Clock {
    public static a b() {
        return new a(ZoneId.systemDefault());
    }

    public static Clock systemUTC() {
        return a.b;
    }

    public abstract ZoneId a();

    public boolean equals(Object obj) {
        return this == obj;
    }

    public abstract Instant instant();
}
