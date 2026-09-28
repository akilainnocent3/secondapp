package defpackage;

import com.sporty.android.core.model.cashout.CashoutJsData;
import com.sportybet.android.cashoutphase3.h;
import com.sportybet.ntespm.socket.MultiTopic;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutViewModel$setupCCFTopic$1", f = "CashOutViewModel.kt", l = {705, 706}, m = "invokeSuspend", v = 2)
public final class no6 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public String a;
    public int b;
    public final /* synthetic */ h c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no6(h hVar, v1b<? super no6> v1bVar) {
        super(2, v1bVar);
        this.c = hVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new no6(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((no6) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        CashoutJsData cashoutJsDataA;
        boolean zG;
        sm6 sm6Var;
        MultiTopic multiTopic;
        pm6 pm6Var;
        MultiTopic multiTopic2;
        h hVar = this.c;
        mgb0 mgb0Var = hVar.y;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            this.b = 1;
            obj = mgb0Var.getUserId(this);
            if (obj != y5bVar) {
            }
            return y5bVar;
        }
        if (i == 1) {
            uj50.b(obj);
        } else {
            if (i != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = this.a;
            uj50.b(obj);
        }
        if (((CharSequence) obj).length() == 0) {
            return Unit.a;
        }
        q0z q0zVar = hVar.a;
        cashoutJsDataA = hVar.A.a();
        if (cashoutJsDataA != null) {
            zG = Intrinsics.g(cashoutJsDataA.getZeroMarginCashOutEnabled(), Boolean.TRUE);
        } else {
            zG = false;
        }
        q0zVar.getClass();
        str.getClass();
        sm6Var = q0zVar.b;
        sm6Var.getClass();
        if (zG) {
            multiTopic = sm6Var.y;
            if (multiTopic == null) {
                sm6Var.y = new MultiTopic("user_ccf_update_topic", str);
            } else if (!Intrinsics.g(multiTopic.getAccountId(), str)) {
                pm6Var = sm6Var.A;
                multiTopic2 = sm6Var.y;
                if (multiTopic2 != null) {
                    sm6Var.c.unsubscribeTopic(multiTopic2, pm6Var);
                }
                sm6Var.y = new MultiTopic("user_ccf_update_topic", str);
            }
        }
        return Unit.a;
        String str2 = (String) obj;
        this.a = str2;
        this.b = 2;
        Object userId = mgb0Var.getUserId(this);
        if (userId != y5bVar) {
            obj = userId;
            str = str2;
            if (((CharSequence) obj).length() == 0) {
                return Unit.a;
            }
            q0z q0zVar2 = hVar.a;
            cashoutJsDataA = hVar.A.a();
            if (cashoutJsDataA != null) {
                zG = Intrinsics.g(cashoutJsDataA.getZeroMarginCashOutEnabled(), Boolean.TRUE);
            } else {
                zG = false;
            }
            q0zVar2.getClass();
            str.getClass();
            sm6Var = q0zVar2.b;
            sm6Var.getClass();
            if (zG) {
                multiTopic = sm6Var.y;
                if (multiTopic == null) {
                    sm6Var.y = new MultiTopic("user_ccf_update_topic", str);
                } else if (!Intrinsics.g(multiTopic.getAccountId(), str)) {
                    pm6Var = sm6Var.A;
                    multiTopic2 = sm6Var.y;
                    if (multiTopic2 != null) {
                        sm6Var.c.unsubscribeTopic(multiTopic2, pm6Var);
                    }
                    sm6Var.y = new MultiTopic("user_ccf_update_topic", str);
                }
            }
            return Unit.a;
        }
        return y5bVar;
    }
}
