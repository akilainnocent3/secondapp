package defpackage;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: loaded from: classes.dex */
public class vzi implements xfe0 {
    public final SQLiteProgram a;

    public vzi(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.a = sQLiteProgram;
    }

    @Override // defpackage.xfe0
    public final void C0(int i, String str) {
        str.getClass();
        this.a.bindString(i, str);
    }

    @Override // defpackage.xfe0
    public final void Z0(int i, byte[] bArr) {
        bArr.getClass();
        this.a.bindBlob(i, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.xfe0
    public final void i(int i, double d) {
        this.a.bindDouble(i, d);
    }

    @Override // defpackage.xfe0
    public final void q(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // defpackage.xfe0
    public final void r(int i) {
        this.a.bindNull(i);
    }
}
