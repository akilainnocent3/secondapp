package f9;

import android.database.Cursor;
import java.util.List;
import k.y0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import l9.h;
import l9.i;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@y0({y0.a.LIBRARY_GROUP})
public final class a implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    public static final C0826a f83696c = new C0826a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public final Cursor f83697b;

    /* JADX INFO: renamed from: f9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0826a {
        public /* synthetic */ C0826a(x xVar) {
            this();
        }

        public final int b(Cursor cursor, int i10) {
            int type = cursor.getType(i10);
            int type2 = cursor.getType(i10);
            if (type2 == 0) {
                return 5;
            }
            int i11 = 1;
            if (type2 != 1) {
                i11 = 2;
                if (type2 != 2) {
                    i11 = 3;
                    if (type2 != 3) {
                        if (type2 == 4) {
                            return 4;
                        }
                        throw new IllegalStateException(("Unknown field type: " + type).toString());
                    }
                }
            }
            return i11;
        }

        public C0826a() {
        }
    }

    public a(@l Cursor cursor) {
        m0.p(cursor, "cursor");
        this.f83697b = cursor;
    }

    @Override // l9.i
    public int C0(int i10) {
        return f83696c.b(this.f83697b, i10);
    }

    @Override // l9.i
    public /* synthetic */ void H1(int i10, boolean z10) {
        h.a(this, i10, z10);
    }

    @Override // l9.i
    @l
    public String I1(int i10) {
        String string = this.f83697b.getString(i10);
        m0.o(string, "getString(...)");
        return string;
    }

    @Override // l9.i
    public /* synthetic */ void S0(int i10, int i11) {
        h.c(this, i10, i11);
    }

    @Override // l9.i
    @l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void f(int i10, @l byte[] value) {
        m0.p(value, "value");
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // l9.i
    @l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void j(int i10, double d10) {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // l9.i
    @l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Void e(int i10, long j10) {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // l9.i, java.lang.AutoCloseable
    public void close() {
        this.f83697b.close();
    }

    @Override // l9.i
    @l
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Void g(int i10) {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // l9.i
    @l
    public byte[] getBlob(int i10) {
        byte[] blob = this.f83697b.getBlob(i10);
        m0.o(blob, "getBlob(...)");
        return blob;
    }

    @Override // l9.i
    public /* synthetic */ boolean getBoolean(int i10) {
        return h.d(this, i10);
    }

    @Override // l9.i
    public int getColumnCount() {
        return this.f83697b.getColumnCount();
    }

    @Override // l9.i
    @l
    public String getColumnName(int i10) {
        String columnName = this.f83697b.getColumnName(i10);
        m0.o(columnName, "getColumnName(...)");
        return columnName;
    }

    @Override // l9.i
    public /* synthetic */ List getColumnNames() {
        return h.e(this);
    }

    @Override // l9.i
    public double getDouble(int i10) {
        return this.f83697b.getDouble(i10);
    }

    @Override // l9.i
    public /* synthetic */ float getFloat(int i10) {
        return h.f(this, i10);
    }

    @Override // l9.i
    public /* synthetic */ int getInt(int i10) {
        return h.g(this, i10);
    }

    @Override // l9.i
    public long getLong(int i10) {
        return this.f83697b.getLong(i10);
    }

    @Override // l9.i
    @l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Void N0(int i10, @l String value) {
        m0.p(value, "value");
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // l9.i
    public boolean isNull(int i10) {
        return this.f83697b.isNull(i10);
    }

    @Override // l9.i
    @l
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Void x() {
        throw new IllegalStateException("Only get*() calls are allowed on a Cursor backed SQLiteStatement");
    }

    @Override // l9.i
    public /* synthetic */ void k1(int i10, float f10) {
        h.b(this, i10, f10);
    }

    @Override // l9.i
    public void reset() {
        this.f83697b.moveToPosition(-1);
    }

    @Override // l9.i
    public boolean step() {
        return this.f83697b.moveToNext();
    }
}
