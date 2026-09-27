package yads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class xg3 {
    public static final Long a(String str) {
        if (str != null) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss", Locale.US);
                return Long.valueOf(simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse("00:00:00").getTime());
            } catch (ParseException unused) {
                boolean z10 = ad1.f146762a;
            }
        }
        return null;
    }

    public static final Integer b(String str) {
        if (str != null) {
            try {
                return Integer.valueOf(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                boolean z10 = ad1.f146762a;
            }
        }
        return null;
    }

    public static final void a(Object obj) {
        if (obj != null) {
            return;
        }
        a();
        throw null;
    }

    public static void a() {
        throw new IllegalArgumentException("AdBreak not set!");
    }
}
