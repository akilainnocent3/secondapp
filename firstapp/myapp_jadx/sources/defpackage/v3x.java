package defpackage;

import androidx.recyclerview.widget.r;
import com.sportybet.feature.notificationcenter.db.NCDatabase;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class v3x implements t3x {
    public final NCDatabase a;
    public final LinkedHashMap b = new LinkedHashMap();

    public v3x(NCDatabase nCDatabase) {
        this.a = nCDatabase;
    }

    @Override // defpackage.t3x
    public final lyh<kqz<h3x>> a(f4x f4xVar, k3x k3xVar) {
        LinkedHashMap linkedHashMap = this.b;
        koz kozVar = (koz) linkedHashMap.get(f4xVar);
        if (kozVar == null) {
            final int i = f4xVar.a;
            koz kozVar2 = new koz(new iqz(20, 0, false, 0, r.d.DEFAULT_DRAG_ANIMATION_DURATION, 46), new s3x(i, k3xVar, this.a), new Function0() { // from class: u3x
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.a.y().c(i);
                }
            });
            linkedHashMap.put(f4xVar, kozVar2);
            kozVar = kozVar2;
        }
        return kozVar.a;
    }
}
