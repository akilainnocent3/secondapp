package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface vfe0 extends Closeable {
    int E1(ContentValues contentValues, Object[] objArr);

    bge0 J0(String str);

    default void M0() {
        v();
    }

    void N();

    void O();

    void U0(Object[] objArr);

    void W();

    boolean isOpen();

    boolean s();

    void v();

    Cursor w(yfe0 yfe0Var);

    boolean y1();

    void z(String str);
}
