package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import defpackage.de80;
import defpackage.eal;
import defpackage.oep;
import defpackage.qcp;
import defpackage.w8h0;
import defpackage.x8h0;

/* JADX INFO: loaded from: classes4.dex */
public final class TreeTypeAdapter<T> extends de80<T> {
    public final eal a;
    public final TypeToken<T> b;
    public final x8h0 c;
    public final boolean d;
    public volatile w8h0<T> e;

    public static final class SingleTypeFactory implements x8h0 {
        @Override // defpackage.x8h0
        public final <T> w8h0<T> create(eal ealVar, TypeToken<T> typeToken) {
            typeToken.getRawType();
            throw null;
        }
    }

    public final class a {
    }

    public TreeTypeAdapter(oep<T> oepVar, qcp<T> qcpVar, eal ealVar, TypeToken<T> typeToken, x8h0 x8h0Var, boolean z) {
        this.a = ealVar;
        this.b = typeToken;
        this.c = x8h0Var;
        this.d = z;
    }

    @Override // defpackage.de80
    public final w8h0<T> a() {
        w8h0<T> w8h0Var = this.e;
        if (w8h0Var != null) {
            return w8h0Var;
        }
        w8h0<T> w8h0VarH = this.a.h(this.c, this.b);
        this.e = w8h0VarH;
        return w8h0VarH;
    }

    @Override // defpackage.w8h0
    public final T read(JsonReader jsonReader) {
        w8h0<T> w8h0VarH = this.e;
        if (w8h0VarH == null) {
            w8h0VarH = this.a.h(this.c, this.b);
            this.e = w8h0VarH;
        }
        return w8h0VarH.read(jsonReader);
    }

    @Override // defpackage.w8h0
    public final void write(JsonWriter jsonWriter, T t) {
        w8h0<T> w8h0VarH = this.e;
        if (w8h0VarH == null) {
            w8h0VarH = this.a.h(this.c, this.b);
            this.e = w8h0VarH;
        }
        w8h0VarH.write(jsonWriter, t);
    }
}
