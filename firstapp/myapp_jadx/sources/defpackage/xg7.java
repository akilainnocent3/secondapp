package defpackage;

import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes7.dex */
public final class xg7 extends j8i0 {
    public final b5 a;
    public StompClient b;
    public ema c;
    public final b390 d;
    public final t340 e;
    public final HashMap<String, String> f;
    public final eal i;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[bbs.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public xg7(b5 b5Var) {
        b5Var.getClass();
        this.a = b5Var;
        b390 b390VarB = d390.b(0, 64, null, 5);
        this.d = b390VarB;
        this.e = e1i.a(b390VarB);
        this.f = new HashMap<>();
        this.i = new eal();
    }

    public static boolean x1(String str) {
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        String lowerCase2 = "Hero".toLowerCase(locale);
        lowerCase2.getClass();
        if (StringsKt.M(lowerCase, lowerCase2, false)) {
            return true;
        }
        String lowerCase3 = str.toLowerCase(locale);
        lowerCase3.getClass();
        String lowerCase4 = "Jet".toLowerCase(locale);
        lowerCase4.getClass();
        if (StringsKt.M(lowerCase3, lowerCase4, false)) {
            return true;
        }
        String lowerCase5 = str.toLowerCase(locale);
        lowerCase5.getClass();
        String lowerCase6 = "GO".toLowerCase(locale);
        lowerCase6.getClass();
        if (StringsKt.M(lowerCase5, lowerCase6, false)) {
            return true;
        }
        String lowerCase7 = str.toLowerCase(locale);
        lowerCase7.getClass();
        String lowerCase8 = "kick".toLowerCase(locale);
        lowerCase8.getClass();
        if (StringsKt.M(lowerCase7, lowerCase8, false)) {
            return true;
        }
        String lowerCase9 = str.toLowerCase(locale);
        lowerCase9.getClass();
        String lowerCase10 = "skills".toLowerCase(locale);
        lowerCase10.getClass();
        if (StringsKt.M(lowerCase9, lowerCase10, false)) {
            return true;
        }
        String lowerCase11 = str.toLowerCase(locale);
        lowerCase11.getClass();
        String lowerCase12 = "Rider".toLowerCase(locale);
        lowerCase12.getClass();
        if (StringsKt.M(lowerCase11, lowerCase12, false)) {
            return true;
        }
        String lowerCase13 = str.toLowerCase(locale);
        lowerCase13.getClass();
        String lowerCase14 = "cars".toLowerCase(locale);
        lowerCase14.getClass();
        return StringsKt.M(lowerCase13, lowerCase14, false);
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        super.onCleared();
        ema emaVar = this.c;
        if (emaVar != null) {
            emaVar.dispose();
        }
        StompClient stompClient = this.b;
        if (stompClient != null) {
            if (stompClient != null) {
                stompClient.disconnect();
            } else {
                Intrinsics.n("stompClient");
                throw null;
            }
        }
    }
}
