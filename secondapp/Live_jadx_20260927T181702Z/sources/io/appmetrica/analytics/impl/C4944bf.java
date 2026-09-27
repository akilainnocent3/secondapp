package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4944bf implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5327qf f97018a;

    public C4944bf() {
        this(new C5327qf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5252nf fromModel(@NonNull C4996df c4996df) {
        C5252nf c5252nf = new C5252nf();
        if (!TextUtils.isEmpty(c4996df.f97198a)) {
            c5252nf.f97975a = c4996df.f97198a;
        }
        c5252nf.f97976b = c4996df.f97199b.toString();
        c5252nf.f97977c = this.f97018a.fromModel(c4996df.f97200c).intValue();
        return c5252nf;
    }

    public C4944bf(C5327qf c5327qf) {
        this.f97018a = c5327qf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4996df toModel(@NonNull C5252nf c5252nf) {
        JSONObject jSONObject;
        String str = c5252nf.f97975a;
        String str2 = c5252nf.f97976b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        return new C4996df(str, jSONObject, this.f97018a.toModel(Integer.valueOf(c5252nf.f97977c)));
    }
}
