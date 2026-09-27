package u3;

import android.database.Cursor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Cursor f137896a;

    public abstract Object a(Cursor cursor);

    public abstract void b(Cursor cursor);

    public Object c(Cursor cursor) {
        if (cursor != this.f137896a) {
            this.f137896a = cursor;
            b(cursor);
        }
        return a(this.f137896a);
    }
}
