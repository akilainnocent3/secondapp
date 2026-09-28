package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.a;
import com.sporty.android.core.model.account.AccountInfo;
import com.sportybet.android.social.presentation.SocialActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i030 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i030(d030 d030Var, AccountInfo accountInfo) {
        this.b = accountInfo;
        this.c = d030Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                final AccountInfo accountInfo = (AccountInfo) obj4;
                final d030 d030Var = (d030) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String nickname = accountInfo.getNickname();
                    boolean nicknameVerified = accountInfo.getNicknameVerified();
                    boolean zA = aVar.A(d030Var) | aVar.A(accountInfo);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new Function0() { // from class: k030
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                d030 d030Var2 = d030Var;
                                AccountInfo accountInfo2 = accountInfo;
                                String nickname2 = accountInfo2.getNickname();
                                boolean nicknameVerified2 = accountInfo2.getNicknameVerified();
                                ohp<Object>[] ohpVarArr = d030.S;
                                try {
                                    zi50.a aVar2 = zi50.b;
                                    int i2 = SocialActivity.b;
                                    Context contextRequireContext = d030Var2.requireContext();
                                    contextRequireContext.getClass();
                                    d030Var2.startActivity(SocialActivity.a.a(contextRequireContext, nickname2, !nicknameVerified2, null, false, false, null));
                                    Unit unit = Unit.a;
                                } catch (Throwable unused) {
                                    zi50.a aVar3 = zi50.b;
                                }
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    g1x.a(0, aVar, null, nickname, (Function0) objY, nicknameVerified);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((hef0) obj4).a((Drawable) obj3, (a) obj, qj40.a(49));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ i030(hef0 hef0Var, Drawable drawable, int i) {
        this.b = hef0Var;
        this.c = drawable;
    }
}
