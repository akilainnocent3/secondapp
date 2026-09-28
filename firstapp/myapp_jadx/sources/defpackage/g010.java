package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.security.sportypin.SportyPinStatus;
import com.sporty.android.core.model.security.sportypin.WithdrawalPinStatusInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class g010 {
    public final n8d0 a;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SportyPinStatus.values().length];
            try {
                iArr[SportyPinStatus.Enabled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SportyPinStatus.Blocked.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public g010(n8d0 n8d0Var) {
        n8d0Var.getClass();
        this.a = n8d0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(r8d0 r8d0Var, x1b x1bVar) {
        h010 h010Var;
        if (x1bVar instanceof h010) {
            h010Var = (h010) x1bVar;
            int i = h010Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                h010Var.d = i - Integer.MIN_VALUE;
            } else {
                h010Var = new h010(this, x1bVar);
            }
        } else {
            h010Var = new h010(this, x1bVar);
        }
        Object objA = h010Var.b;
        y5b y5bVar = y5b.a;
        int i2 = h010Var.d;
        boolean z = true;
        try {
            if (i2 == 0) {
                uj50.b(objA);
                zi50.a aVar = zi50.b;
                n8d0 n8d0Var = this.a;
                h010Var.a = this;
                h010Var.d = 1;
                objA = n8d0Var.a(r8d0Var, h010Var);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = h010Var.a;
                uj50.b(objA);
            }
            Object objB = n52.b((BaseResponse) objA);
            int i3 = a.a[((WithdrawalPinStatusInfo) objB).getSportyPinStatus().ordinal()];
            if (i3 != 1 && i3 != 2) {
                z = false;
            }
            this.getClass();
            q8d0.b = z;
            WithdrawalPinStatusInfo withdrawalPinStatusInfo = (WithdrawalPinStatusInfo) objB;
            zi50.a aVar2 = zi50.b;
            return withdrawalPinStatusInfo;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }
}
