package defpackage;

import com.esotericsoftware.spine.android.b;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pqj implements hcb0 {
    public static uge0 a(ArrayList arrayList, uge0 uge0Var) {
        arrayList.add(uge0Var);
        return new uge0();
    }

    @Override // defpackage.hcb0
    public void b(b bVar) {
        bVar.a().m(0, AnalyticsParam.DATA_NORMAL, true);
    }
}
