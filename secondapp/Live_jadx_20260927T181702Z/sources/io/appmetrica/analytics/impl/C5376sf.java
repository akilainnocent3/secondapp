package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5376sf implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5327qf f98297a = new C5327qf();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5227mf fromModel(@NonNull C5351rf c5351rf) {
        C5227mf c5227mf = new C5227mf();
        if (!TextUtils.isEmpty(c5351rf.f98233a)) {
            c5227mf.f97902a = c5351rf.f98233a;
        }
        c5227mf.f97903b = c5351rf.f98234b.toString();
        c5227mf.f97904c = c5351rf.f98235c;
        c5227mf.f97905d = c5351rf.f98236d;
        c5227mf.f97906e = this.f98297a.fromModel(c5351rf.f98237e).intValue();
        return c5227mf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5351rf toModel(@NonNull C5227mf c5227mf) {
        JSONObject jSONObject;
        String str = c5227mf.f97902a;
        String str2 = c5227mf.f97903b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        return new C5351rf(str, jSONObject, c5227mf.f97904c, c5227mf.f97905d, this.f98297a.toModel(Integer.valueOf(c5227mf.f97906e)));
    }
}
