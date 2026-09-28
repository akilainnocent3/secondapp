package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dxj0 extends v390 {
    @Override // defpackage.v390
    public final String b() {
        return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
    }
}
