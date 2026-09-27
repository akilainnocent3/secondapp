package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class u43 implements v43 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final s43 a(mx0 mx0Var) {
        String str = mx0Var.f152729m;
        if (str != null) {
            byte b10 = -1;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        b10 = 0;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        b10 = 1;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        b10 = 2;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        b10 = 3;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        b10 = 4;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        b10 = 5;
                    }
                    break;
                case 930165504:
                    if (str.equals("application/x-mp4-cea-608")) {
                        b10 = 6;
                    }
                    break;
                case 1201784583:
                    if (str.equals(eh.l0.f81036o0)) {
                        b10 = 7;
                    }
                    break;
                case 1566015601:
                    if (str.equals("application/cea-608")) {
                        b10 = 8;
                    }
                    break;
                case 1566016562:
                    if (str.equals("application/cea-708")) {
                        b10 = 9;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        b10 = 10;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        b10 = zi.c.f161635m;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    return new el0(mx0Var.f152731o);
                case 1:
                    return new kc2();
                case 2:
                    return new lv1();
                case 3:
                    return new ro3();
                case 4:
                    return new x93(mx0Var.f152731o);
                case 5:
                    return new b33(mx0Var.f152731o);
                case 6:
                case 8:
                    return new ht(str, mx0Var.E);
                case 7:
                    return new vp0();
                case 9:
                    return new mt(mx0Var.E, mx0Var.f152731o);
                case 10:
                    return new p43();
                case 11:
                    return new r93();
            }
        }
        throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
    }

    public final boolean b(mx0 mx0Var) {
        String str = mx0Var.f152729m;
        return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || eh.l0.f81036o0.equals(str);
    }
}
