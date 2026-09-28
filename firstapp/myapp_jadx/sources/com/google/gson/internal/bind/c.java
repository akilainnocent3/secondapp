package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import defpackage.de80;
import defpackage.eal;
import defpackage.w8h0;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes4.dex */
public final class c<T> extends w8h0<T> {
    public final eal a;
    public final w8h0<T> b;
    public final Type c;

    public c(eal ealVar, w8h0<T> w8h0Var, Type type) {
        this.a = ealVar;
        this.b = w8h0Var;
        this.c = type;
    }

    @Override // defpackage.w8h0
    public final T read(JsonReader jsonReader) {
        return this.b.read(jsonReader);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003b  */
    @Override // defpackage.w8h0
    public final void write(JsonWriter jsonWriter, T t) {
        w8h0<T> w8h0VarA;
        Type type = this.c;
        Type type2 = (t == null || !((type instanceof Class) || (type instanceof TypeVariable))) ? type : t.getClass();
        w8h0<T> w8h0Var = this.b;
        if (type2 != type) {
            w8h0<T> w8h0VarG = this.a.g(TypeToken.get(type2));
            if (w8h0VarG instanceof ReflectiveTypeAdapterFactory.b) {
                w8h0<T> w8h0Var2 = w8h0Var;
                while ((w8h0Var2 instanceof de80) && (w8h0VarA = ((de80) w8h0Var2).a()) != w8h0Var2) {
                    w8h0Var2 = w8h0VarA;
                }
                if (w8h0Var2 instanceof ReflectiveTypeAdapterFactory.b) {
                    w8h0Var = w8h0VarG;
                }
            } else {
                w8h0Var = w8h0VarG;
            }
        }
        w8h0Var.write(jsonWriter, t);
    }
}
