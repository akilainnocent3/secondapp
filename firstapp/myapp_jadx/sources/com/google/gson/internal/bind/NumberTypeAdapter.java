package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import defpackage.eal;
import defpackage.pyf0;
import defpackage.qep;
import defpackage.qyf0;
import defpackage.w8h0;
import defpackage.x8h0;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class NumberTypeAdapter extends w8h0<Number> {
    public static final x8h0 b = a(pyf0.b);
    public final qyf0 a;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            a = iArr;
            try {
                iArr[JsonToken.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[JsonToken.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public NumberTypeAdapter(qyf0 qyf0Var) {
        this.a = qyf0Var;
    }

    public static x8h0 a(qyf0 qyf0Var) {
        return new x8h0() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // defpackage.x8h0
            public final <T> w8h0<T> create(eal ealVar, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override // defpackage.w8h0
    public final Number read(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        int i = a.a[jsonTokenPeek.ordinal()];
        if (i == 1) {
            jsonReader.nextNull();
            return null;
        }
        if (i == 2 || i == 3) {
            return this.a.a(jsonReader);
        }
        StringBuilder sb = new StringBuilder("Expecting number, got: ");
        sb.append(jsonTokenPeek);
        String path = jsonReader.getPath();
        sb.append("; at path ");
        sb.append(path);
        throw new qep(sb.toString());
    }

    @Override // defpackage.w8h0
    public final void write(JsonWriter jsonWriter, Number number) throws IOException {
        jsonWriter.value(number);
    }
}
