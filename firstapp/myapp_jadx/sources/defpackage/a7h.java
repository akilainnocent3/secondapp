package defpackage;

import android.content.Intent;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a7h implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a7h(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strB;
        Parcelable parcelable;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ytw ytwVar = (ytw) obj2;
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                int i2 = activityResult.a;
                if (i2 == -1) {
                    Intent intent = activityResult.b;
                    if (intent == null || (parcelable = (Parcelable) uxo.a(intent, "facial-recognition-result", Parcelable.class)) == null || (strB = parcelable.toString()) == null) {
                        strB = "No result parcelable";
                    }
                } else {
                    strB = pe4.b(i2, "Canceled (resultCode=", ")");
                }
                ytwVar.setValue(strB);
                break;
            default:
                x7c0 x7c0Var = (x7c0) obj2;
                cgb.a(x7c0Var.e1(), (String) ((x5a0) x7c0Var.c1().v).getValue(), "cashout", (String) obj);
                break;
        }
        return Unit.a;
    }
}
