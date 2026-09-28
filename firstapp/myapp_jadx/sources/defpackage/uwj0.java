package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uwj0 extends v390 {
    @Override // defpackage.v390
    public final String b() {
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }
}
