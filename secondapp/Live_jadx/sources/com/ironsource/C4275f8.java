package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* JADX INFO: renamed from: com.ironsource.f8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4275f8 extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final IronSourceError f61774a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4275f8(@oy.l IronSourceError error) {
        super(error.getErrorMessage());
        kotlin.jvm.internal.m0.p(error, "error");
        this.f61774a = error;
    }

    @oy.l
    public final IronSourceError a() {
        return this.f61774a;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.m0.g(C4275f8.class, obj.getClass())) {
            return false;
        }
        C4275f8 c4275f8 = (C4275f8) obj;
        if (this.f61774a.getErrorCode() != c4275f8.f61774a.getErrorCode()) {
            return false;
        }
        return kotlin.jvm.internal.m0.g(this.f61774a.getErrorMessage(), c4275f8.f61774a.getErrorMessage());
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f61774a.getErrorCode()), this.f61774a.getErrorMessage());
    }
}
