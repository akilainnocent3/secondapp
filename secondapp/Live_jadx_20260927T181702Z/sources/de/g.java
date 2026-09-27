package de;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f78950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f78951b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends q.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f78952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f78953b;

        @Override // de.q.a
        public q a() {
            return new g(this.f78952a, this.f78953b);
        }

        @Override // de.q.a
        public q.a b(@Nullable byte[] bArr) {
            this.f78952a = bArr;
            return this;
        }

        @Override // de.q.a
        public q.a c(@Nullable byte[] bArr) {
            this.f78953b = bArr;
            return this;
        }
    }

    @Override // de.q
    @Nullable
    public byte[] b() {
        return this.f78950a;
    }

    @Override // de.q
    @Nullable
    public byte[] c() {
        return this.f78951b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            boolean z10 = qVar instanceof g;
            if (Arrays.equals(this.f78950a, z10 ? ((g) qVar).f78950a : qVar.b())) {
                if (Arrays.equals(this.f78951b, z10 ? ((g) qVar).f78951b : qVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f78950a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f78951b);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f78950a) + ", encryptedBlob=" + Arrays.toString(this.f78951b) + "}";
    }

    public g(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        this.f78950a = bArr;
        this.f78951b = bArr2;
    }
}
