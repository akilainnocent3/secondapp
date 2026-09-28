package defpackage;

import android.database.AbstractCursor;
import com.sportybet.android.instantwin.newtork.model.response.recommendation.TL.UccrWswQGaIj;

/* JADX INFO: loaded from: classes.dex */
public final class iq60 extends AbstractCursor {
    public final hq60 a;
    public final int b;

    public iq60(hq60 hq60Var, int i) {
        hq60Var.getClass();
        this.a = hq60Var;
        this.b = i;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final String[] getColumnNames() {
        return (String[]) this.a.getColumnNames().toArray(new String[0]);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final int getCount() {
        return this.b;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final double getDouble(int i) {
        return this.a.getDouble(i);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final float getFloat(int i) {
        return this.a.getFloat(i);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final int getInt(int i) {
        return this.a.getInt(i);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final long getLong(int i) {
        return this.a.getLong(i);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final short getShort(int i) {
        return (short) this.a.getLong(i);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final String getString(int i) {
        return this.a.k1(i);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public final boolean isNull(int i) {
        return this.a.isNull(i);
    }

    @Override // android.database.AbstractCursor, android.database.CrossProcessCursor
    public final boolean onMove(int i, int i2) {
        if (i + 1 == i2) {
            return this.a.D1();
        }
        ib5.a(UccrWswQGaIj.aZdi);
        return false;
    }
}
