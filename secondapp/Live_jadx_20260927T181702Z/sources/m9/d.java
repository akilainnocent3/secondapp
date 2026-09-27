package m9;

import android.annotation.SuppressLint;
import android.database.sqlite.SQLiteTransactionListener;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d {
    public static void a(e eVar) {
        eVar.beginTransaction();
    }

    public static void b(e eVar, @l SQLiteTransactionListener transactionListener) {
        m0.p(transactionListener, "transactionListener");
        eVar.a1(transactionListener);
    }

    public static void c(e eVar, @l String sql, @SuppressLint({"ArrayReturn"}) @m Object[] objArr) {
        m0.p(sql, "sql");
        throw new UnsupportedOperationException();
    }

    public static boolean d(e eVar) {
        return false;
    }
}
