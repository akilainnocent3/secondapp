package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import com.sportygames.crashInitiated.model.response.UserValidateResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class um2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ View.OnCreateContextMenuListener b;

    public /* synthetic */ um2(View.OnCreateContextMenuListener onCreateContextMenuListener, int i) {
        this.a = i;
        this.b = onCreateContextMenuListener;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String nickName;
        String avatarUrl;
        int i = this.a;
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.b;
        switch (i) {
            case 0:
                fo2 fo2Var = (fo2) onCreateContextMenuListener;
                if (fo2Var.L == fo2.b.b) {
                    Function2<? super Integer, ? super Integer, Unit> function2 = fo2Var.H;
                    if (function2 == null) {
                        Intrinsics.n("betHistoryFetchManager");
                        throw null;
                    }
                    function2.invoke(Integer.valueOf(fo2Var.K + fo2Var.J), Integer.valueOf(fo2Var.J));
                }
                return Unit.a;
            default:
                enb enbVar = (enb) onCreateContextMenuListener;
                if (enbVar.b != null) {
                    enbVar.u0().x1(true);
                }
                SharedPreferences.Editor editor = enbVar.Y;
                if (editor != null) {
                    editor.putBoolean(((String[]) ((x5a0) enbVar.u0().e).getValue())[2], ((Boolean) ((x5a0) enbVar.u0().T).getValue()).booleanValue());
                }
                SharedPreferences.Editor editor2 = enbVar.Y;
                if (editor2 != null) {
                    editor2.apply();
                }
                UserValidateResponse userValidateResponse = enbVar.a0;
                String str = "";
                if (userValidateResponse == null || (nickName = userValidateResponse.getNickName()) == null) {
                    nickName = "";
                }
                UserValidateResponse userValidateResponse2 = enbVar.a0;
                if (userValidateResponse2 != null && (avatarUrl = userValidateResponse2.getAvatarUrl()) != null) {
                    str = avatarUrl;
                }
                enbVar.z0(nickName, str);
                enbVar.o0 = false;
                ((x5a0) enbVar.V).setValue(Boolean.FALSE);
                return Unit.a;
        }
    }
}
