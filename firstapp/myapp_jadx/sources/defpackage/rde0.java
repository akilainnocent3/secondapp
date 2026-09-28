package defpackage;

import com.sporty.android.platform.features.settings.notification.matchalert.data.db.entity.SubscribedEventEntity;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class rde0 extends xbs<SubscribedEventEntity> {
    public final /* synthetic */ pde0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rde0(bw50 bw50Var, pde0 pde0Var, lv50 lv50Var, String[] strArr) {
        super(bw50Var, lv50Var, strArr);
        this.e = pde0Var;
    }

    @Override // defpackage.xbs
    public final Object e(bw50 bw50Var, int i, v1b<? super List<? extends SubscribedEventEntity>> v1bVar) {
        return qlc.c(v1bVar, this.e.a, new qde0(bw50Var, 0), true, false);
    }
}
