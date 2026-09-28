package defpackage;

import com.sporty.android.core.model.patron.KYCBannerItem;
import java.util.concurrent.CancellationException;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public final class xdi0 extends loa0 {
    public final ssw<String> N;
    public final ssw<String> O;
    public final ssw<String> P;
    public final ssw<String> Q;
    public final ssw<String> R;
    public final ssw<String> S;
    public final ssw<Boolean> T;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[brb.values().length];
            try {
                brb brbVar = brb.a;
                iArr[19] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                brb brbVar2 = brb.a;
                iArr[20] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                brb brbVar3 = brb.a;
                iArr[21] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                brb brbVar4 = brb.a;
                iArr[22] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                brb brbVar5 = brb.a;
                iArr[24] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                brb brbVar6 = brb.a;
                iArr[25] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xdi0(g0n g0nVar, usm usmVar, tzm tzmVar) {
        super(g0nVar, usmVar, tzmVar);
        g0nVar.getClass();
        usmVar.getClass();
        tzmVar.getClass();
        this.N = new ssw<>();
        this.O = new ssw<>();
        this.P = new ssw<>();
        this.Q = new ssw<>();
        this.R = new ssw<>();
        this.S = new ssw<>();
        this.T = new ssw<>();
        jvd0 jvd0Var = this.d;
        if (jvd0Var == null || !jvd0Var.isActive()) {
            jvd0 jvd0Var2 = this.d;
            if (jvd0Var2 != null) {
                jvd0Var2.cancel((CancellationException) null);
            }
            this.d = ej5.c(o8i0.d(this), null, null, new joa0(this, null), 3);
        }
    }

    @Override // defpackage.loa0
    public final void B1(arb arbVar) {
        if (a.a[arbVar.a.ordinal()] == 1) {
            this.T.j(Boolean.TRUE);
        }
    }

    @Override // defpackage.loa0
    public final void C1(arb arbVar) {
        brb brbVar = arbVar.a;
        String str = arbVar.b;
        switch (brbVar.ordinal()) {
            case 19:
                this.N.j(str);
                break;
            case 20:
                this.O.j(str);
                break;
            case 21:
                this.P.j(str);
                break;
            case 22:
                this.Q.j(str);
                break;
            case 24:
                this.R.j(str);
                break;
            case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                this.S.j(str);
                break;
        }
    }

    public final void J1(String str) {
        usm usmVar = this.b;
        if (usmVar.c()) {
            brb brbVar = brb.I;
            String strA = tzm.a(this.c, brbVar, str, 4);
            if (StringsKt.U(strA)) {
                return;
            }
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            usmVar.j(brbVar, strA, o2gVar);
        }
    }

    public final void K1(String str) {
        usm usmVar = this.b;
        if (usmVar.c()) {
            brb brbVar = brb.J;
            String strA = tzm.a(this.c, brbVar, str, 4);
            if (StringsKt.U(strA)) {
                return;
            }
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            usmVar.j(brbVar, strA, o2gVar);
        }
    }

    public final void L1(String str) {
        usm usmVar = this.b;
        if (usmVar.c()) {
            brb brbVar = brb.K;
            String strA = tzm.a(this.c, brbVar, str, 4);
            if (StringsKt.U(strA)) {
                return;
            }
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            usmVar.j(brbVar, strA, o2gVar);
        }
    }

    public final void M1(String str) {
        usm usmVar = this.b;
        if (usmVar.c()) {
            brb brbVar = brb.N;
            String strA = tzm.a(this.c, brbVar, str, 4);
            if (StringsKt.U(strA)) {
                return;
            }
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            usmVar.j(brbVar, strA, o2gVar);
        }
    }

    public final void N1(String str) {
        usm usmVar = this.b;
        if (usmVar.c()) {
            brb brbVar = brb.O;
            String strA = tzm.a(this.c, brbVar, str, 4);
            if (StringsKt.U(strA)) {
                return;
            }
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            usmVar.j(brbVar, strA, o2gVar);
        }
    }

    public final void O1(String str) {
        usm usmVar = this.b;
        if (usmVar.c()) {
            brb brbVar = brb.L;
            String strA = tzm.a(this.c, brbVar, str, 4);
            if (StringsKt.U(strA)) {
                return;
            }
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            usmVar.j(brbVar, strA, o2gVar);
        }
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        jvd0 jvd0Var = this.d;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.d = null;
        super.onCleared();
    }
}
