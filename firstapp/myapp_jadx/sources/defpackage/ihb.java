package defpackage;

import com.sportygames.commons.SportyGamesManager;
import com.sportygames.onepunch.remote.api.OnePunchInterface;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ihb implements ssm {
    @Override // defpackage.ssm
    public final znb a() {
        mpe0 mpe0Var = on0.a;
        if (Intrinsics.g(SportyGamesManager.getGameName(), "one-punch")) {
            Object objA = on0.a().a(OnePunchInterface.class);
            objA.getClass();
            return (znb) objA;
        }
        Object objA2 = on0.a().a(znb.class);
        objA2.getClass();
        return (znb) objA2;
    }
}
