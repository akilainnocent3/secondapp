package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class us1 implements vs1 {
    public final dz2 a(mx0 mx0Var) {
        String str = mx0Var.f152729m;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new ng();
                case "application/x-icy":
                    return new n21();
                case "application/id3":
                    return new u21(null);
                case "application/x-emsg":
                    return new xm0();
                case "application/x-scte35":
                    return new k23();
            }
        }
        throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
    }
}
