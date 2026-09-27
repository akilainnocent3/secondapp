package io.appmetrica.analytics.coreapi.internal.db;

import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import java.sql.SQLException;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class DatabaseScript {
    public abstract void runScript(@NonNull SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException;
}
