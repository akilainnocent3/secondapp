package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import fw.b;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class ECommerceReferrer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f95399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f95400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ECommerceScreen f95401c;

    @Nullable
    public String getIdentifier() {
        return this.f95400b;
    }

    @Nullable
    public ECommerceScreen getScreen() {
        return this.f95401c;
    }

    @Nullable
    public String getType() {
        return this.f95399a;
    }

    @NonNull
    public ECommerceReferrer setIdentifier(@Nullable String str) {
        this.f95400b = str;
        return this;
    }

    @NonNull
    public ECommerceReferrer setScreen(@Nullable ECommerceScreen eCommerceScreen) {
        this.f95401c = eCommerceScreen;
        return this;
    }

    @NonNull
    public ECommerceReferrer setType(@Nullable String str) {
        this.f95399a = str;
        return this;
    }

    public String toString() {
        return "ECommerceReferrer{type='" + this.f95399a + "', identifier='" + this.f95400b + "', screen=" + this.f95401c + b.f85383j;
    }
}
