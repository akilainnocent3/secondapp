package defpackage;

import com.sporty.android.core.model.OrderBetType;

/* JADX INFO: loaded from: classes7.dex */
public final class b5k {
    public final cek a;
    public final g5k b;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[OrderBetType.values().length];
            try {
                iArr[OrderBetType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public b5k(cek cekVar, g5k g5kVar) {
        this.a = cekVar;
        this.b = g5kVar;
    }
}
