package yads;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ux0 implements k20 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f156662d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f156663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f156664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f156665c;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z10;
        if ("Amazon".equals(ib3.f150518c)) {
            String str = ib3.f150519d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        f156662d = z10;
    }

    public ux0(UUID uuid, byte[] bArr, boolean z10) {
        this.f156663a = uuid;
        this.f156664b = bArr;
        this.f156665c = z10;
    }
}
