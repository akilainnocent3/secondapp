package com.google.gson.internal.sql;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import defpackage.eal;
import defpackage.w8h0;
import defpackage.x8h0;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class SqlTimestampTypeAdapter extends w8h0<Timestamp> {
    public static final x8h0 b = new x8h0() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // defpackage.x8h0
        public final <T> w8h0<T> create(eal ealVar, TypeToken<T> typeToken) {
            if (typeToken.getRawType() != Timestamp.class) {
                return null;
            }
            ealVar.getClass();
            return new SqlTimestampTypeAdapter(ealVar.g(TypeToken.get(Date.class)));
        }
    };
    public final w8h0<Date> a;

    public SqlTimestampTypeAdapter(w8h0<Date> w8h0Var) {
        this.a = w8h0Var;
    }

    @Override // defpackage.w8h0
    public final Timestamp read(JsonReader jsonReader) {
        Date date = this.a.read(jsonReader);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // defpackage.w8h0
    public final void write(JsonWriter jsonWriter, Timestamp timestamp) {
        this.a.write(jsonWriter, timestamp);
    }
}
