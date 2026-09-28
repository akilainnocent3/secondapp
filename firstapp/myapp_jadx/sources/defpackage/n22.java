package defpackage;

import android.content.SharedPreferences;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportybet.ntespm.socket.TopicInfo;
import com.sportygames.spinmatch.model.response.UserValidateResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n22 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n22(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String nickName;
        FragmentManager supportFragmentManager;
        String avatarUrl;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                TopicInfo topicInfo = (TopicInfo) obj;
                topicInfo.getClass();
                topicInfo.setSportId((String) obj2);
                break;
            case 1:
                kab0 kab0Var = (kab0) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                SharedPreferences.Editor editor = kab0Var.E;
                if (editor != null) {
                    editor.putBoolean("spin_match_one_tap", zBooleanValue);
                }
                SharedPreferences.Editor editor2 = kab0Var.E;
                if (editor2 != null) {
                    editor2.apply();
                }
                UserValidateResponse userValidateResponse = kab0Var.d;
                String str = "";
                if (userValidateResponse == null || (nickName = userValidateResponse.getNickName()) == null) {
                    nickName = "";
                }
                UserValidateResponse userValidateResponse2 = kab0Var.d;
                if (userValidateResponse2 != null && (avatarUrl = userValidateResponse2.getAvatarUrl()) != null) {
                    str = avatarUrl;
                }
                kab0Var.y0(nickName, str);
                e activity = kab0Var.getActivity();
                if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                    supportFragmentManager.a0();
                }
                break;
            default:
                Function1 function1 = (Function1) obj2;
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                String str2 = ijf0Var.a.b;
                for (int i2 = 0; i2 < str2.length(); i2++) {
                    if (!StringsKt.N(".0123456789", str2.charAt(i2))) {
                    }
                    break;
                }
                function1.invoke(ijf0Var);
                break;
        }
        return Unit.a;
    }
}
