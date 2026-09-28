package defpackage;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes.dex */
public final class wzi extends vzi implements bge0 {
    public final SQLiteStatement b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzi(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        sQLiteStatement.getClass();
        this.b = sQLiteStatement;
    }

    @Override // defpackage.bge0
    public final int D() {
        return this.b.executeUpdateDelete();
    }

    @Override // defpackage.bge0
    public final void execute() {
        this.b.execute();
    }

    @Override // defpackage.bge0
    public final long t0() {
        return this.b.executeInsert();
    }
}
