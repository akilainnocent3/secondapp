package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d64 implements hq60 {
    public final /* synthetic */ hq60 a;

    public d64(hq60 hq60Var) {
        this.a = hq60Var;
    }

    @Override // defpackage.hq60
    public final boolean D1() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // defpackage.hq60
    public final void L(int i, String str) {
        str.getClass();
        this.a.L(i, str);
    }

    @Override // defpackage.hq60
    public final boolean T0() {
        return this.a.T0();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // defpackage.hq60
    public final int getColumnCount() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // defpackage.hq60
    public final String getColumnName(int i) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // defpackage.hq60
    public final List<String> getColumnNames() {
        return this.a.getColumnNames();
    }

    @Override // defpackage.hq60
    public final double getDouble(int i) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // defpackage.hq60
    public final float getFloat(int i) {
        return this.a.getFloat(i);
    }

    @Override // defpackage.hq60
    public final int getInt(int i) {
        return this.a.getInt(i);
    }

    @Override // defpackage.hq60
    public final long getLong(int i) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // defpackage.hq60
    public final void i(int i, double d) {
        this.a.i(i, d);
    }

    @Override // defpackage.hq60
    public final boolean isNull(int i) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // defpackage.hq60
    public final String k1(int i) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // defpackage.hq60
    public final void q(int i, long j) {
        this.a.q(i, j);
    }

    @Override // defpackage.hq60
    public final void r(int i) {
        this.a.r(i);
    }

    @Override // defpackage.hq60
    public final void reset() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }
}
