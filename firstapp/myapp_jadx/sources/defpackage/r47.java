package defpackage;

import com.sportybet.android.user.ChangeLocationActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class r47 {
    public final /* synthetic */ ChangeLocationActivity a;

    public /* synthetic */ r47(ChangeLocationActivity changeLocationActivity) {
        this.a = changeLocationActivity;
    }

    public final String a(int i) {
        int i2 = ChangeLocationActivity.R;
        ArrayList arrayList = this.a.K;
        return (i < 0 || i >= arrayList.size()) ? " " : ((String) arrayList.get(i)).substring(0, 1);
    }
}
