package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import com.sportygames.commons.remote.model.Status;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class hy50 extends Dialog {
    public fn1 a;
    public long b;
    public String c;
    public w820 d;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public final w820 a() {
        w820 w820Var = this.d;
        if (w820Var != null) {
            return w820Var;
        }
        Intrinsics.n("binding");
        throw null;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            this.d = w820.a(getLayoutInflater());
            setContentView(a().a);
            a().A.setVisibility(8);
            fn1 fn1Var = this.a;
            long j = this.b;
            fn1Var.getClass();
            ej5.c(o8i0.d(fn1Var), null, null, new mn1(fn1Var, j, null), 3);
            a().e.setOnClickListener(new f5j(this, 1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
