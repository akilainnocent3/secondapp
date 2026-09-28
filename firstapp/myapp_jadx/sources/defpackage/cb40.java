package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class cb40 implements otk0 {
    public static final /* synthetic */ cb40 a = new cb40();

    public static final String a(int i, Object[] objArr, a aVar) {
        return sn5.b((Context) aVar.O(AndroidCompositionLocals_androidKt.b), i, Arrays.copyOf(objArr, objArr.length));
    }

    public static final String b(String str, Object[] objArr, a aVar) {
        str.getClass();
        Resources resources = (Resources) aVar.O(AndroidCompositionLocals_androidKt.c);
        qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
        int identifier = resources.getIdentifier(str, "string", ((Context) aVar.O(qyd0Var)).getPackageName());
        Integer numValueOf = Integer.valueOf(identifier);
        if (identifier == 0) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        return sn5.b((Context) aVar.O(qyd0Var), numValueOf.intValue(), Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.otk0
    public Object zza() {
        List list = v2l0.a;
        return Long.valueOf(bol0.b.get().A());
    }
}
