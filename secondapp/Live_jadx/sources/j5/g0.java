package j5;

import android.os.Build;
import java.util.UUID;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class g0 implements c5.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f99599d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f99600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f99601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public final boolean f99602c;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        f99599d = z10;
    }

    public g0(UUID uuid, byte[] bArr) {
        this(uuid, bArr, false);
    }

    @Deprecated
    public g0(UUID uuid, byte[] bArr, boolean z10) {
        this.f99600a = uuid;
        this.f99601b = bArr;
        this.f99602c = z10;
    }
}
