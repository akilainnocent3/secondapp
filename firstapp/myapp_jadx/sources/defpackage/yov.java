package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface yov {
    public static final a a = new a();

    public class a implements yov {
        public final y3l a(androidx.media3.common.a aVar) {
            String str = aVar.n;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new xr0();
                    case "application/x-icy":
                        return new l6n();
                    case "application/id3":
                        return new p6n(null);
                    case "application/x-emsg":
                        return new ypg();
                    case "application/x-scte35":
                        return new udb0();
                }
            }
            hb5.a(inm.a("Attempted to create decoder for unsupported MIME type: ", str));
            return null;
        }

        public final boolean b(androidx.media3.common.a aVar) {
            String str = aVar.n;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }
    }
}
