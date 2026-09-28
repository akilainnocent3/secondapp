package com.sporty.android.core.model.gson;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import defpackage.eal;
import defpackage.jb5;
import defpackage.w8h0;
import defpackage.x8h0;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class AlwaysListTypeAdapterFactory<E> implements x8h0 {

    /* JADX INFO: renamed from: com.sporty.android.core.model.gson.AlwaysListTypeAdapterFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NAME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_ARRAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private AlwaysListTypeAdapterFactory() {
    }

    private static Type resolveTypeArgument(Type type) {
        return !(type instanceof ParameterizedType) ? Object.class : ((ParameterizedType) type).getActualTypeArguments()[0];
    }

    @Override // defpackage.x8h0
    public <T> w8h0<T> create(eal ealVar, TypeToken<T> typeToken) {
        if (List.class.isAssignableFrom(typeToken.getRawType())) {
            return new AlwaysListTypeAdapter(ealVar.g(TypeToken.get(resolveTypeArgument(typeToken.getType()))), 0).nullSafe();
        }
        return null;
    }

    public static final class AlwaysListTypeAdapter<E> extends w8h0<List<E>> {
        private final w8h0<E> elementTypeAdapter;

        private AlwaysListTypeAdapter(w8h0<E> w8h0Var) {
            this.elementTypeAdapter = w8h0Var;
        }

        @Override // defpackage.w8h0
        public List<E> read(JsonReader jsonReader) throws MalformedJsonException {
            ArrayList arrayList = new ArrayList();
            JsonToken jsonTokenPeek = jsonReader.peek();
            switch (AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken[jsonTokenPeek.ordinal()]) {
                case 1:
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(this.elementTypeAdapter.read(jsonReader));
                    }
                    jsonReader.endArray();
                    return arrayList;
                case 2:
                case 3:
                case 4:
                case 5:
                    arrayList.add(this.elementTypeAdapter.read(jsonReader));
                    return arrayList;
                case 6:
                    jb5.a("Must never happen: check if the type adapter configured with .nullSafe()");
                    return null;
                case 7:
                case 8:
                case 9:
                case 10:
                    throw new MalformedJsonException("Unexpected token: " + jsonTokenPeek);
                default:
                    throw new AssertionError("Must never happen: " + jsonTokenPeek);
            }
        }

        public /* synthetic */ AlwaysListTypeAdapter(w8h0 w8h0Var, int i) {
            this(w8h0Var);
        }

        @Override // defpackage.w8h0
        public void write(JsonWriter jsonWriter, List<E> list) {
            throw new UnsupportedOperationException();
        }
    }
}
