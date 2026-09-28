package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class swj0 extends v390 {
    @Override // defpackage.v390
    public final String b() {
        return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
    }
}
