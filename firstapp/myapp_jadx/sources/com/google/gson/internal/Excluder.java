package com.google.gson.internal;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import defpackage.eal;
import defpackage.jb5;
import defpackage.nq40;
import defpackage.utg;
import defpackage.w8h0;
import defpackage.x8h0;
import java.io.IOException;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Excluder implements x8h0, Cloneable {
    public static final Excluder c = new Excluder();
    public final List<utg> a;
    public final List<utg> b;

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> extends w8h0<T> {
        public volatile w8h0<T> a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ eal d;
        public final /* synthetic */ TypeToken e;

        public a(boolean z, boolean z2, eal ealVar, TypeToken typeToken) {
            this.b = z;
            this.c = z2;
            this.d = ealVar;
            this.e = typeToken;
        }

        @Override // defpackage.w8h0
        public final T read(JsonReader jsonReader) throws IOException {
            if (this.b) {
                jsonReader.skipValue();
                return null;
            }
            w8h0<T> w8h0VarH = this.a;
            if (w8h0VarH == null) {
                w8h0VarH = this.d.h(Excluder.this, this.e);
                this.a = w8h0VarH;
            }
            return w8h0VarH.read(jsonReader);
        }

        @Override // defpackage.w8h0
        public final void write(JsonWriter jsonWriter, T t) throws IOException {
            if (this.c) {
                jsonWriter.nullValue();
                return;
            }
            w8h0<T> w8h0VarH = this.a;
            if (w8h0VarH == null) {
                w8h0VarH = this.d.h(Excluder.this, this.e);
                this.a = w8h0VarH;
            }
            w8h0VarH.write(jsonWriter, t);
        }
    }

    public Excluder() {
        List<utg> list = Collections.EMPTY_LIST;
        this.a = list;
        this.b = list;
    }

    public final boolean a(Class<?> cls, boolean z) {
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            nq40.a aVar = nq40.a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator<utg> it = (z ? this.a : this.b).iterator();
        while (it.hasNext()) {
            if (it.next().a()) {
                return true;
            }
        }
        return false;
    }

    public final Object clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            jb5.a(e);
            return null;
        }
    }

    @Override // defpackage.x8h0
    public final <T> w8h0<T> create(eal ealVar, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        boolean zA = a(rawType, true);
        boolean zA2 = a(rawType, false);
        if (zA || zA2) {
            return new a(zA2, zA, ealVar, typeToken);
        }
        return null;
    }
}
