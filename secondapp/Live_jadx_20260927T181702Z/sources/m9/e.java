package m9;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
import java.util.Locale;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface e extends Closeable {
    void A();

    int B1(@l String str, int i10, @l ContentValues contentValues, @m String str2, @m Object[] objArr);

    @l
    Cursor D0(@l h hVar, @m CancellationSignal cancellationSignal);

    boolean D1();

    @l
    Cursor E1(@l String str);

    void J();

    boolean K0();

    void L1(@l SQLiteTransactionListener sQLiteTransactionListener);

    void N1(@l SQLiteTransactionListener sQLiteTransactionListener);

    long O0();

    boolean P();

    boolean P1();

    boolean Q();

    boolean Q0();

    void Q1(int i10);

    void S1(long j10);

    boolean T(int i10);

    void T0(@l String str, @l Object[] objArr) throws SQLException;

    long U0(long j10);

    @l
    Cursor a0(@l String str, @l Object[] objArr);

    void a1(@l SQLiteTransactionListener sQLiteTransactionListener);

    void beginTransaction();

    @l
    j compileStatement(@l String str);

    @l
    Cursor e1(@l h hVar);

    void endTransaction();

    void execSQL(@l String str) throws SQLException;

    @m
    String getPath();

    int getVersion();

    boolean isOpen();

    void k0();

    void n1(@l String str, @SuppressLint({"ArrayReturn"}) @m Object[] objArr);

    void q0(boolean z10);

    long r0();

    int s(@l String str, @m String str2, @m Object[] objArr);

    void setLocale(@l Locale locale);

    void setTransactionSuccessful();

    long t0(@l String str, int i10, @l ContentValues contentValues) throws SQLException;

    boolean u1(long j10);

    void v1(int i10);

    boolean w();

    boolean x1();

    @m
    List<Pair<String, String>> z();
}
