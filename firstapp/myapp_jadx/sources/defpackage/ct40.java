package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.core.model.security.otp.OTPCompleteResult;
import com.sporty.android.core.model.security.otp.RegisterCompleteBody;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ct40 {
    public final rdd0 a;
    public final ou40 b;
    public final lyz c;
    public final k5b d;

    public ct40(rdd0 rdd0Var, ou40 ou40Var, lyz lyzVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        rdd0Var.getClass();
        ou40Var.getClass();
        lyzVar.getClass();
        this.a = rdd0Var;
        this.b = ou40Var;
        this.c = lyzVar;
        this.d = k5bVar;
    }

    public static lyh a(ct40 ct40Var, String str, String str2, String str3, ts40 ts40Var, String str4, String str5, Long l, String str6, int i) {
        ts40 vVar = (i & 8) != 0 ? new ts40.v(0) : ts40Var;
        String str7 = (i & 16) != 0 ? null : str4;
        String str8 = (i & 32) != 0 ? null : str5;
        Long l2 = (i & 64) != 0 ? null : l;
        String str9 = (i & 128) != 0 ? null : str6;
        ct40Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        vVar.getClass();
        return ozh.c(new or60(new ys40(ct40Var, vVar, str, str2, str3, l2, str7, str9, str8, null)), ct40Var.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(String str, String str2, x1b x1bVar) {
        at40 at40Var;
        UiText resourceUiText;
        if (x1bVar instanceof at40) {
            at40Var = (at40) x1bVar;
            int i = at40Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                at40Var.d = i - Integer.MIN_VALUE;
            } else {
                at40Var = new at40(this, x1bVar);
            }
        } else {
            at40Var = new at40(this, x1bVar);
        }
        Object objB = at40Var.b;
        y5b y5bVar = y5b.a;
        int i2 = at40Var.d;
        if (i2 == 0) {
            uj50.b(objB);
            yzh yzhVarA = bm50.a(new zs40(this.c.i(new RegisterCompleteBody("", "", str, str2))));
            bt40 bt40Var = new bt40(2, null);
            at40Var.a = str2;
            at40Var.d = 1;
            objB = s0i.b(yzhVarA, bt40Var, at40Var);
            if (objB == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = at40Var.a;
            uj50.b(objB);
        }
        lk50 lk50Var = (lk50) objB;
        if (lk50Var instanceof lk50.c) {
            return new ws40.c(str2, (OTPCompleteResult) ((lk50.c) lk50Var).a);
        }
        if (!(lk50Var instanceof lk50.a)) {
            if (lk50Var instanceof lk50.b) {
                ib5.a("Loading state should be filtered");
                return null;
            }
            uhc.a();
            return null;
        }
        Throwable th = ((lk50.a) lk50Var).a;
        th.getClass();
        if (th instanceof SprThrowable) {
            resourceUiText = vch0.d(((SprThrowable) th).getE());
        } else {
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(R.string.common_feedback__something_went_wrong_tip);
        }
        return new ws40.a.C1265a(resourceUiText);
    }
}
