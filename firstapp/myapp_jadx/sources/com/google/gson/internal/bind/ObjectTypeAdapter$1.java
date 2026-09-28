package com.google.gson.internal.bind;

import com.google.gson.reflect.TypeToken;
import defpackage.eal;
import defpackage.qyf0;
import defpackage.w8h0;
import defpackage.x8h0;

/* JADX INFO: loaded from: classes4.dex */
class ObjectTypeAdapter$1 implements x8h0 {
    public final /* synthetic */ qyf0 a;

    public ObjectTypeAdapter$1(qyf0 qyf0Var) {
        this.a = qyf0Var;
    }

    @Override // defpackage.x8h0
    public final <T> w8h0<T> create(eal ealVar, TypeToken<T> typeToken) {
        if (typeToken.getRawType() == Object.class) {
            return new a(ealVar, this.a);
        }
        return null;
    }
}
