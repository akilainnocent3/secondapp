package com.android.billingclient.api;

import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class zzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f25747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f25748c;

    public /* synthetic */ zzc(JSONObject jSONObject, zzd zzdVar) {
        this.f25746a = jSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
        this.f25747b = jSONObject.optString(C4235d4.i.f61426m);
        String strOptString = jSONObject.optString("offerToken");
        this.f25748c = true == strOptString.isEmpty() ? null : strOptString;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzc)) {
            return false;
        }
        zzc zzcVar = (zzc) obj;
        return this.f25746a.equals(zzcVar.f25746a) && this.f25747b.equals(zzcVar.f25747b) && Objects.equals(this.f25748c, zzcVar.f25748c);
    }

    public final int hashCode() {
        return Objects.hash(this.f25746a, this.f25747b, this.f25748c);
    }

    public final String toString() {
        return String.format("{id: %s, type: %s, offer token: %s}", this.f25746a, this.f25747b, this.f25748c);
    }
}
