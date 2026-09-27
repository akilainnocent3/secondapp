package androidx.leanback.widget;

import android.database.Cursor;
import android.util.LruCache;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class o extends i1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f12816h = 100;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Cursor f12817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u3.a f12818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LruCache<Integer, Object> f12819g;

    public o(b2 b2Var) {
        super(b2Var);
        this.f12819g = new LruCache<>(100);
    }

    public final void A(int i10, int i11) {
        int i12 = i11 + i10;
        while (i10 < i12) {
            z(i10);
            i10++;
        }
    }

    public boolean B() {
        Cursor cursor = this.f12817e;
        return cursor == null || cursor.isClosed();
    }

    public void C() {
        h();
    }

    public final void E(u3.a aVar) {
        boolean z10 = this.f12818f != aVar;
        this.f12818f = aVar;
        if (z10) {
            D();
        }
    }

    public Cursor F(Cursor cursor) {
        Cursor cursor2 = this.f12817e;
        if (cursor == cursor2) {
            return cursor2;
        }
        this.f12817e = cursor;
        this.f12819g.trimToSize(0);
        C();
        return cursor2;
    }

    @Override // androidx.leanback.widget.i1
    public Object a(int i10) {
        Cursor cursor = this.f12817e;
        if (cursor == null) {
            return null;
        }
        if (!cursor.moveToPosition(i10)) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Object obj = this.f12819g.get(Integer.valueOf(i10));
        if (obj != null) {
            return obj;
        }
        Object objC = this.f12818f.c(this.f12817e);
        this.f12819g.put(Integer.valueOf(i10), objC);
        return objC;
    }

    @Override // androidx.leanback.widget.i1
    public boolean g() {
        return true;
    }

    @Override // androidx.leanback.widget.i1
    public int s() {
        Cursor cursor = this.f12817e;
        if (cursor == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public void v(Cursor cursor) {
        Cursor cursor2 = this.f12817e;
        if (cursor == cursor2) {
            return;
        }
        if (cursor2 != null) {
            cursor2.close();
        }
        this.f12817e = cursor;
        this.f12819g.trimToSize(0);
        C();
    }

    public void w() {
        Cursor cursor = this.f12817e;
        if (cursor != null) {
            cursor.close();
            this.f12817e = null;
        }
    }

    public final Cursor x() {
        return this.f12817e;
    }

    public final u3.a y() {
        return this.f12818f;
    }

    public final void z(int i10) {
        this.f12819g.remove(Integer.valueOf(i10));
    }

    public o(a2 a2Var) {
        super(a2Var);
        this.f12819g = new LruCache<>(100);
    }

    public o() {
        this.f12819g = new LruCache<>(100);
    }

    public void D() {
    }
}
