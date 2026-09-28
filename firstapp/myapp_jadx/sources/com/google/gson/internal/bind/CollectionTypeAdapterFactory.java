package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import defpackage.eal;
import defpackage.ial;
import defpackage.kya;
import defpackage.tby;
import defpackage.w8h0;
import defpackage.x8h0;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class CollectionTypeAdapterFactory implements x8h0 {
    public final kya a;

    public static final class a<E> extends w8h0<Collection<E>> {
        public final c a;
        public final tby<? extends Collection<E>> b;

        public a(c cVar, tby tbyVar) {
            this.a = cVar;
            this.b = tbyVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.w8h0
        public final Object read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection<E> collectionA = this.b.a();
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                collectionA.add(this.a.b.read(jsonReader));
            }
            jsonReader.endArray();
            return collectionA;
        }

        @Override // defpackage.w8h0
        public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.a.write(jsonWriter, it.next());
            }
            jsonWriter.endArray();
        }
    }

    public CollectionTypeAdapterFactory(kya kyaVar) {
        this.a = kyaVar;
    }

    @Override // defpackage.x8h0
    public final <T> w8h0<T> create(eal ealVar, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type typeF = ial.f(type, rawType, Collection.class);
        Type type2 = typeF instanceof ParameterizedType ? ((ParameterizedType) typeF).getActualTypeArguments()[0] : Object.class;
        return new a(new c(ealVar, ealVar.g(TypeToken.get(type2)), type2), this.a.b(typeToken, false));
    }
}
