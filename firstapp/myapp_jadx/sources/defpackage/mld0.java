package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\b\b\u0001\u0010\t\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0005J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\b\b\u0001\u0010\t\u001a\u00020\rH§@¢\u0006\u0004\b\u0013\u0010\u0010¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lmld0;", "", "Lcom/sportygames/common/framework/network/HTTPResponse;", "Lvmd0;", "a", "(Lv1b;)Ljava/lang/Object;", "Lbqd0;", "c", "Lzod0;", "body", "Lyod0;", "e", "(Lzod0;Lv1b;)Ljava/lang/Object;", "Lqpd0;", "", "d", "(Lqpd0;Lv1b;)Ljava/lang/Object;", "Lwpd0;", "b", "f", "game-stacker_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface mld0 {
    @sbj("sporty-stackers/v1/game/is-available")
    Object a(v1b<? super HTTPResponse<vmd0>> v1bVar);

    @sbj("sporty-stackers/v1/round/status")
    Object b(v1b<? super HTTPResponse<wpd0>> v1bVar);

    @flz("sporty-stackers/v1/user/validate")
    Object c(v1b<? super HTTPResponse<bqd0>> v1bVar);

    @flz("sporty-stackers/v1/round/finish")
    Object d(@jh4 qpd0 qpd0Var, v1b<? super HTTPResponse<Double>> v1bVar);

    @flz("sporty-stackers/v1/round/start")
    Object e(@jh4 zod0 zod0Var, v1b<? super HTTPResponse<yod0>> v1bVar);

    @flz("sporty-stackers/v1/round/claim")
    Object f(@jh4 qpd0 qpd0Var, v1b<? super HTTPResponse<Object>> v1bVar);
}
