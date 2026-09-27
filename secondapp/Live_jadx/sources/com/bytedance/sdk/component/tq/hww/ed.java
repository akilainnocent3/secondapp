package com.bytedance.sdk.component.tq.hww;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class ed {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    public hww f35017hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    public byte[] f35018hv;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public rs f35019sd;
    public String vy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum hww {
        STRING_TYPE,
        BYTE_ARRAY_TYPE
    }

    public ed() {
    }

    public static ed hww(rs rsVar, String str) {
        return new ed(rsVar, str, hww.STRING_TYPE);
    }

    public ed(rs rsVar, String str, hww hwwVar) {
        this.f35019sd = rsVar;
        this.vy = str;
        this.f35017hu = hwwVar;
    }

    public static ed hww(rs rsVar, byte[] bArr) {
        return new ed(rsVar, bArr, hww.BYTE_ARRAY_TYPE);
    }

    public ed(rs rsVar, byte[] bArr, hww hwwVar) {
        this.f35019sd = rsVar;
        this.f35018hv = bArr;
        this.f35017hu = hwwVar;
    }
}
