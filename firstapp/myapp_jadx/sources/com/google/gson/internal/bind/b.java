package com.google.gson.internal.bind;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import defpackage.kdp;
import defpackage.nq40;
import defpackage.tug;
import defpackage.w8h0;
import defpackage.zdp;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends ReflectiveTypeAdapterFactory.c {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Method e;
    public final /* synthetic */ w8h0 f;
    public final /* synthetic */ w8h0 g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, Field field, boolean z, Method method, w8h0 w8h0Var, w8h0 w8h0Var2, boolean z2, boolean z3) {
        super(str, field);
        this.d = z;
        this.e = method;
        this.f = w8h0Var;
        this.g = w8h0Var2;
        this.h = z2;
        this.i = z3;
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c
    public final void a(JsonReader jsonReader, int i, Object[] objArr) {
        Object obj = this.g.read(jsonReader);
        if (obj != null || !this.h) {
            objArr[i] = obj;
            return;
        }
        throw new zdp("null is not allowed as value for record component '" + this.c + "' of primitive type; at path " + jsonReader.getPath());
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c
    public final void b(JsonReader jsonReader, Object obj) throws IllegalAccessException {
        Object obj2 = this.g.read(jsonReader);
        if (obj2 == null && this.h) {
            return;
        }
        boolean z = this.d;
        Field field = this.b;
        if (z) {
            ReflectiveTypeAdapterFactory.a(obj, field);
        } else if (this.i) {
            throw new kdp("Cannot set value of 'static final' ".concat(nq40.d(field, false)));
        }
        field.set(obj, obj2);
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c
    public final void c(JsonWriter jsonWriter, Object obj) throws IllegalAccessException {
        Object objInvoke;
        boolean z = this.d;
        Field field = this.b;
        Method method = this.e;
        if (z) {
            if (method == null) {
                ReflectiveTypeAdapterFactory.a(obj, field);
            } else {
                ReflectiveTypeAdapterFactory.a(obj, method);
            }
        }
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new kdp(tug.a("Accessor ", nq40.d(method, false), " threw exception"), e.getCause());
            }
        } else {
            objInvoke = field.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        jsonWriter.name(this.a);
        this.f.write(jsonWriter, objInvoke);
    }
}
