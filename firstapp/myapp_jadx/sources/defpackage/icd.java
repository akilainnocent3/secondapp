package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class icd {
    public static final ekd a;

    static {
        String property;
        wcl wclVar;
        int i = yqe0.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            pfd pfdVar = fse.a;
            wcl wclVar2 = gku.a;
            wclVar2.getClass();
            wclVar = !(wclVar2 instanceof ekd) ? hcd.y : wclVar2;
        } else {
            wclVar = hcd.y;
        }
        a = wclVar;
    }
}
