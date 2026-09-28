package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H§@¢\u0006\u0004\b\f\u0010\u0005J \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0005¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lwh4;", "", "Lcom/sportygames/common/framework/network/HTTPResponse;", "Lqp4;", "c", "(Lv1b;)Ljava/lang/Object;", "Lpo4;", "body", "Loo4;", "e", "(Lpo4;Lv1b;)Ljava/lang/Object;", "Lop4;", "b", "Lyo4;", "Lri4;", "d", "(Lyo4;Lv1b;)Ljava/lang/Object;", "Lqhj;", "a", "game-bonuscup_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface wh4 {
    @sbj("sporty-bonus-cup/v1/game/is-available")
    Object a(v1b<? super HTTPResponse<qhj>> v1bVar);

    @sbj("sporty-bonus-cup/v1/round/status")
    Object b(v1b<? super HTTPResponse<op4>> v1bVar);

    @flz("sporty-bonus-cup/v1/user/validate")
    Object c(v1b<? super HTTPResponse<qp4>> v1bVar);

    @flz("sporty-bonus-cup/v1/round/claim")
    Object d(@jh4 yo4 yo4Var, v1b<? super HTTPResponse<ri4>> v1bVar);

    @flz("sporty-bonus-cup/v1/round/start")
    Object e(@jh4 po4 po4Var, v1b<? super HTTPResponse<oo4>> v1bVar);
}
