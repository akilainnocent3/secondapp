package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.security.otp.OTPGeneralResult;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001fH§@¢\u0006\u0004\b \u0010!J \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\"H§@¢\u0006\u0004\b#\u0010$¨\u0006%À\u0006\u0003"}, d2 = {"Lbfe;", "", "Luzh0;", "request", "Lcom/sporty/android/common/network/data/BaseResponse;", "Lvzh0;", "i", "(Luzh0;Lv1b;)Ljava/lang/Object;", "Lpxb;", "Lqxb;", "e", "(Lpxb;Lv1b;)Ljava/lang/Object;", "Ltzh0;", "Lcom/sporty/android/core/model/security/otp/OTPGeneralResult;", "f", "(Ltzh0;Lv1b;)Ljava/lang/Object;", "Lnf4;", "", "b", "(Lnf4;Lv1b;)Ljava/lang/Object;", "Lbdh0;", "d", "(Lbdh0;Lv1b;)Ljava/lang/Object;", "Lxzh0;", "Lyzh0;", "a", "(Lxzh0;Lv1b;)Ljava/lang/Object;", "Lrxb;", "Lsxb;", "g", "(Lrxb;Lv1b;)Ljava/lang/Object;", "Lwzh0;", "c", "(Lwzh0;Lv1b;)Ljava/lang/Object;", "Ltsi;", "h", "(Ltsi;Lv1b;)Ljava/lang/Object;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface bfe {
    @flz("patron/user/devices/force-logout/password/verify")
    Object a(@jh4 xzh0 xzh0Var, v1b<? super BaseResponse<yzh0>> v1bVar);

    @flz("patron/user/devices/blocking/execute")
    Object b(@jh4 nf4 nf4Var, v1b<? super BaseResponse<Unit>> v1bVar);

    @flz("patron/user/devices/force-logout/otp/verify")
    Object c(@jh4 wzh0 wzh0Var, v1b<? super BaseResponse<OTPGeneralResult>> v1bVar);

    @flz("patron/user/devices/blocking/unblock")
    Object d(@jh4 bdh0 bdh0Var, v1b<? super BaseResponse<Unit>> v1bVar);

    @flz("patron/user/devices/blocking/otp/session")
    Object e(@jh4 pxb pxbVar, v1b<? super BaseResponse<qxb>> v1bVar);

    @flz("patron/user/devices/blocking/otp/verify")
    Object f(@jh4 tzh0 tzh0Var, v1b<? super BaseResponse<OTPGeneralResult>> v1bVar);

    @flz("patron/user/devices/force-logout/otp/session")
    Object g(@jh4 rxb rxbVar, v1b<? super BaseResponse<sxb>> v1bVar);

    @flz("patron/user/devices/force-logout/execute")
    Object h(@jh4 tsi tsiVar, v1b<? super BaseResponse<Unit>> v1bVar);

    @flz("patron/user/devices/blocking/password/verify")
    Object i(@jh4 uzh0 uzh0Var, v1b<? super BaseResponse<vzh0>> v1bVar);
}
