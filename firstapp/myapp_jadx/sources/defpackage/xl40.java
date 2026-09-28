package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import com.sportybet.android.share.presentation.activity.ShareCodeActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xl40 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xl40(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0031  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Uri uri;
        int i = this.a;
        Uri uri2 = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                nn40 nn40Var = (nn40) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                SharedPreferences.Editor editor = nn40Var.R;
                if (zBooleanValue) {
                    if (editor != null) {
                        editor.putBoolean("SOUND", true);
                    }
                    ypa0 ypa0Var = nn40Var.z;
                    if (ypa0Var == null) {
                        Intrinsics.n("soundViewModel");
                        throw null;
                    }
                    ypa0Var.y1().d = true;
                } else {
                    if (editor != null) {
                        editor.putBoolean("SOUND", false);
                    }
                    ypa0 ypa0Var2 = nn40Var.z;
                    if (ypa0Var2 == null) {
                        Intrinsics.n("soundViewModel");
                        throw null;
                    }
                    ypa0Var2.y1().d = false;
                }
                SharedPreferences.Editor editor2 = nn40Var.R;
                if (editor2 != null) {
                    editor2.apply();
                }
                ypa0 ypa0Var3 = nn40Var.z;
                if (ypa0Var3 != null) {
                    ypa0Var3.J1(ypa0Var3.y1().d);
                    return Unit.a;
                }
                Intrinsics.n("soundViewModel");
                throw null;
            default:
                ShareCodeActivity shareCodeActivity = (ShareCodeActivity) obj2;
                Pair pair = (Pair) obj;
                int i2 = ShareCodeActivity.j0;
                String str = (String) pair.a;
                String str2 = (String) pair.b;
                if (str != null) {
                    shareCodeActivity.U = str;
                }
                if (str2 != null) {
                    shareCodeActivity.V = str2;
                }
                String str3 = shareCodeActivity.U;
                if (str3 == null) {
                    uri = null;
                } else {
                    if (StringsKt.U(str3)) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        uri = Uri.parse(str3);
                    } else {
                        uri = null;
                    }
                }
                shareCodeActivity.H = uri;
                String str4 = shareCodeActivity.V;
                if (str4 != null) {
                    if (StringsKt.U(str4)) {
                        str4 = null;
                    }
                    if (str4 != null) {
                        uri2 = Uri.parse(str4);
                    }
                }
                shareCodeActivity.I = uri2;
                String str5 = shareCodeActivity.V;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = shareCodeActivity.U;
                shareCodeActivity.E1(str5, str6 != null ? str6 : "");
                return Unit.a;
        }
    }
}
