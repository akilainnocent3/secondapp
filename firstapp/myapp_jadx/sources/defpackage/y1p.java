package defpackage;

import com.sporty.android.core.model.security.sportypin.SportyPinStatus;

/* JADX INFO: loaded from: classes5.dex */
public final class y1p {
    public final g010 a;
    public final psm b;
    public final b700 c;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SportyPinStatus.values().length];
            try {
                iArr[SportyPinStatus.Disabled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SportyPinStatus.Enabled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SportyPinStatus.Blocked.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public y1p(g010 g010Var, psm psmVar, b700 b700Var) {
        psmVar.getClass();
        b700Var.getClass();
        this.a = g010Var;
        this.b = psmVar;
        this.c = b700Var;
    }
}
