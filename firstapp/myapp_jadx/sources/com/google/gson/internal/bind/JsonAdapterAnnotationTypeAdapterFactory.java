package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import defpackage.eal;
import defpackage.kya;
import defpackage.oep;
import defpackage.qcp;
import defpackage.w8h0;
import defpackage.x8h0;
import defpackage.zbp;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements x8h0 {
    public static final x8h0 c;
    public static final x8h0 d;
    public final kya a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        int i = 0;
        c = new DummyTypeAdapterFactory(i);
        d = new DummyTypeAdapterFactory(i);
    }

    public JsonAdapterAnnotationTypeAdapterFactory(kya kyaVar) {
        this.a = kyaVar;
    }

    public final w8h0<?> a(kya kyaVar, eal ealVar, TypeToken<?> typeToken, zbp zbpVar, boolean z) {
        w8h0<?> w8h0VarCreate;
        Object objA = kyaVar.b(TypeToken.get((Class) zbpVar.value()), true).a();
        boolean zNullSafe = zbpVar.nullSafe();
        if (objA instanceof w8h0) {
            w8h0VarCreate = (w8h0) objA;
        } else if (objA instanceof x8h0) {
            x8h0 x8h0Var = (x8h0) objA;
            if (z) {
                x8h0 x8h0Var2 = (x8h0) this.b.putIfAbsent(typeToken.getRawType(), x8h0Var);
                if (x8h0Var2 != null) {
                    x8h0Var = x8h0Var2;
                }
            }
            w8h0VarCreate = x8h0Var.create(ealVar, typeToken);
        } else {
            boolean z2 = objA instanceof oep;
            if (!z2 && !(objA instanceof qcp)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objA.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            TreeTypeAdapter treeTypeAdapter = new TreeTypeAdapter(z2 ? (oep) objA : null, objA instanceof qcp ? (qcp) objA : null, ealVar, typeToken, z ? c : d, zNullSafe);
            zNullSafe = false;
            w8h0VarCreate = treeTypeAdapter;
        }
        return (w8h0VarCreate == null || !zNullSafe) ? w8h0VarCreate : w8h0VarCreate.nullSafe();
    }

    @Override // defpackage.x8h0
    public final <T> w8h0<T> create(eal ealVar, TypeToken<T> typeToken) {
        zbp zbpVar = (zbp) typeToken.getRawType().getAnnotation(zbp.class);
        if (zbpVar == null) {
            return null;
        }
        return (w8h0<T>) a(this.a, ealVar, typeToken, zbpVar, true);
    }

    public static class DummyTypeAdapterFactory implements x8h0 {
        private DummyTypeAdapterFactory() {
        }

        @Override // defpackage.x8h0
        public final <T> w8h0<T> create(eal ealVar, TypeToken<T> typeToken) {
            throw new AssertionError("Factory should not be used");
        }

        public /* synthetic */ DummyTypeAdapterFactory(int i) {
            this();
        }
    }
}
