package ba;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class b2 implements WebMessagePayloadBoundaryInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f20908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final byte[] f20909d;

    public b2(@Nullable String str) {
        this.f20907b = 0;
        this.f20908c = str;
        this.f20909d = null;
    }

    public final void a(int i10) {
        if (this.f20907b == i10) {
            return;
        }
        throw new IllegalStateException("Expected " + i10 + ", but type is " + this.f20907b);
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    @NonNull
    public byte[] getAsArrayBuffer() {
        a(1);
        byte[] bArr = this.f20909d;
        Objects.requireNonNull(bArr);
        return bArr;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    @Nullable
    public String getAsString() {
        a(0);
        return this.f20908c;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    public String[] getSupportedFeatures() {
        return new String[0];
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public int getType() {
        return this.f20907b;
    }

    public b2(@NonNull byte[] bArr) {
        this.f20907b = 1;
        this.f20908c = null;
        this.f20909d = bArr;
    }
}
