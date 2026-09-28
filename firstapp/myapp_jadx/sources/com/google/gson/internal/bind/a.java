package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import defpackage.eal;
import defpackage.hgs;
import defpackage.pyf0;
import defpackage.qyf0;
import defpackage.rcp;
import defpackage.w8h0;
import defpackage.x8h0;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends w8h0<Object> {
    public static final x8h0 c = new ObjectTypeAdapter$1(pyf0.a);
    public final eal a;
    public final qyf0 b;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0201a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public a(eal ealVar, qyf0 qyf0Var) {
        this.a = ealVar;
        this.b = qyf0Var;
    }

    public static x8h0 a(qyf0 qyf0Var) {
        return qyf0Var == pyf0.a ? c : new ObjectTypeAdapter$1(qyf0Var);
    }

    public static Serializable c(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i = C0201a.a[jsonToken.ordinal()];
        if (i == 1) {
            jsonReader.beginArray();
            return new ArrayList();
        }
        if (i != 2) {
            return null;
        }
        jsonReader.beginObject();
        return new hgs();
    }

    public final Serializable b(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i = C0201a.a[jsonToken.ordinal()];
        if (i == 3) {
            return jsonReader.nextString();
        }
        if (i == 4) {
            return this.b.a(jsonReader);
        }
        if (i == 5) {
            return Boolean.valueOf(jsonReader.nextBoolean());
        }
        if (i == 6) {
            jsonReader.nextNull();
            return null;
        }
        rcp.a(jsonToken, "Unexpected token: ");
        return null;
    }

    @Override // defpackage.w8h0
    public final Object read(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        Object objC = c(jsonReader, jsonTokenPeek);
        if (objC == null) {
            return b(jsonReader, jsonTokenPeek);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                String strNextName = objC instanceof Map ? jsonReader.nextName() : null;
                JsonToken jsonTokenPeek2 = jsonReader.peek();
                Serializable serializableC = c(jsonReader, jsonTokenPeek2);
                boolean z = serializableC != null;
                if (serializableC == null) {
                    serializableC = b(jsonReader, jsonTokenPeek2);
                }
                if (objC instanceof List) {
                    ((List) objC).add(serializableC);
                } else {
                    ((Map) objC).put(strNextName, serializableC);
                }
                if (z) {
                    arrayDeque.addLast(objC);
                    objC = serializableC;
                }
            } else {
                if (objC instanceof List) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return objC;
                }
                objC = arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.w8h0
    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        Class<?> cls = obj.getClass();
        eal ealVar = this.a;
        ealVar.getClass();
        w8h0 w8h0VarG = ealVar.g(TypeToken.get((Class) cls));
        if (!(w8h0VarG instanceof a)) {
            w8h0VarG.write(jsonWriter, obj);
        } else {
            jsonWriter.beginObject();
            jsonWriter.endObject();
        }
    }
}
