package defpackage;

import androidx.recyclerview.widget.r;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.partnet.PartnerInfo;
import com.sportybet.feature.payment.impl.withdraw.presentation.model.WithdrawConfirmation;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawPartnerViewModel$clickNext$1", f = "WithdrawPartnerViewModel.kt", l = {186, 192, 194, r.d.DEFAULT_DRAG_ANIMATION_DURATION, 219}, m = "invokeSuspend", v = 2)
public final class pnj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public ltz a;
    public Object b;
    public snj0 c;
    public PartnerInfo d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ snj0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pnj0(snj0 snj0Var, v1b<? super pnj0> v1bVar) {
        super(2, v1bVar);
        this.i = snj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        pnj0 pnj0Var = new pnj0(this.i, v1bVar);
        pnj0Var.f = obj;
        return pnj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pnj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009e  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b3 A[PHI: r0
      0x00b3: PHI (r0v20 java.lang.Object) = (r0v18 java.lang.Object), (r0v35 java.lang.Object) binds: [B:39:0x00af, B:17:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:58:0x0117  */
    /* JADX WARN: Code duplicated, block: B:60:0x0120  */
    /* JADX WARN: Code duplicated, block: B:61:0x012a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0130  */
    /* JADX WARN: Code duplicated, block: B:65:0x013f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0149  */
    /* JADX WARN: Code duplicated, block: B:70:0x015c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0178  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        ltz ltzVar;
        BaseResponse baseResponse;
        PartnerInfo partnerInfo;
        b700 b700Var;
        String str;
        Object obj2;
        PartnerInfo partnerInfo2;
        ltz ltzVar2;
        snj0 snj0Var;
        String strA;
        UiText stringUiText;
        Throwable thA;
        Object objA;
        Object objI1;
        Object objP;
        lk50 lk50Var;
        lk50.c cVar;
        ltz ltzVar3;
        Object objA2;
        snj0 snj0Var2 = this.i;
        wwd0 wwd0Var = snj0Var2.w0;
        wwd0 wwd0Var2 = snj0Var2.u0;
        wwd0 wwd0Var3 = snj0Var2.n0;
        wwd0 wwd0Var4 = snj0Var2.G;
        v5b v5bVar = (v5b) this.f;
        y5b y5bVar = y5b.a;
        int i = this.e;
        try {
            if (i == 0) {
                uj50.b(obj);
                if (!((Boolean) snj0Var2.y0.a.getValue()).booleanValue()) {
                    return Unit.a;
                }
                vh7 vh7Var = snj0Var2.h0;
                ku90<a> ku90Var = snj0Var2.f;
                ku90<m480> ku90Var2 = snj0Var2.y;
                this.f = v5bVar;
                this.e = 1;
                objA = vh7Var.a(ku90Var, ku90Var2, this);
                if (objA != y5bVar) {
                }
                return y5bVar;
            }
            if (i == 1) {
                uj50.b(obj);
                objA = obj;
            } else {
                if (i == 2) {
                    uj50.b(obj);
                    objI1 = obj;
                    if (!((Boolean) objI1).booleanValue()) {
                        return Unit.a;
                    }
                    wl50 wl50VarR = snj0Var2.i0.R();
                    this.f = v5bVar;
                    this.e = 3;
                    objP = bm50.p(wl50VarR, this);
                    if (objP != y5bVar) {
                        lk50Var = (lk50) objP;
                        if (lk50Var instanceof lk50.c) {
                            cVar = (lk50.c) lk50Var;
                        } else {
                            cVar = null;
                        }
                        if (cVar != null) {
                        }
                        return Unit.a;
                    }
                    return y5bVar;
                }
                if (i == 3) {
                    uj50.b(obj);
                    objP = obj;
                    lk50Var = (lk50) objP;
                    if (lk50Var instanceof lk50.c) {
                        cVar = (lk50.c) lk50Var;
                    } else {
                        cVar = null;
                    }
                    if (cVar != null || (ltzVar3 = (ltz) cVar.a) == null) {
                        return Unit.a;
                    }
                    int i2 = snj0.z0;
                    wwd0Var4.setValue(tzs.b.a);
                    wwd0Var3.setValue(c330.b.a);
                    zi50.a aVar = zi50.b;
                    jtz jtzVar = snj0Var2.l0;
                    String str2 = (String) wwd0Var2.getValue();
                    this.f = null;
                    this.a = ltzVar3;
                    this.e = 4;
                    objA2 = jtzVar.a(str2, this);
                    i = ltzVar3;
                    if (objA2 != y5bVar) {
                        bVar = (BaseResponse) objA2;
                        zi50.a aVar2 = zi50.b;
                        ltzVar = i;
                        c330.a aVar3 = new c330.a(null, Intrinsics.g(wwd0Var.getValue(), itz.c.a));
                        wwd0Var3.getClass();
                        wwd0Var3.k(null, aVar3);
                        wwd0Var4.setValue(tzs.a.a);
                        if (!(bVar instanceof zi50.b)) {
                            baseResponse = (BaseResponse) bVar;
                            if (baseResponse.bizCode != 19001) {
                                wwd0Var.getClass();
                                wwd0Var.k(null, itz.b.a);
                            } else {
                                partnerInfo = (PartnerInfo) baseResponse.data;
                                if (partnerInfo == null) {
                                    ku90<a> ku90Var3 = snj0Var2.f;
                                    s9e0 s9e0Var = s9e0.a;
                                    String str3 = baseResponse.message;
                                    s9e0Var.getClass();
                                    strA = s9e0.a(str3);
                                    if (strA != null) {
                                        StringUiText stringUiText2 = vch0.a;
                                        stringUiText = new StringUiText(strA);
                                    } else {
                                        stringUiText = vch0.b;
                                    }
                                    b.i(ku90Var3, stringUiText, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                                    return Unit.a;
                                }
                                b700Var = snj0Var2.k0;
                                str = (String) wwd0Var2.getValue();
                                this.f = null;
                                this.a = ltzVar;
                                this.b = bVar;
                                this.c = snj0Var2;
                                this.d = partnerInfo;
                                this.e = 5;
                                if (b700Var.g(str, this) != y5bVar) {
                                    obj2 = bVar;
                                    partnerInfo2 = partnerInfo;
                                    ltzVar2 = ltzVar;
                                    snj0Var = snj0Var2;
                                }
                            }
                        }
                        thA = zi50.a(bVar);
                        if (thA != null) {
                            itf0.a aVar4 = itf0.a;
                            aVar4.q(MyLog.TAG_WITHDRAW);
                            aVar4.f(thA, "getPartnerInfo with exception.", new Object[0]);
                            int i3 = snj0.z0;
                            b.i(snj0Var2.f, ppf0.a(thA), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                        }
                        return Unit.a;
                    }
                    return y5bVar;
                }
                if (i == 4) {
                    ltz ltzVar4 = this.a;
                    uj50.b(obj);
                    objA2 = obj;
                    i = ltzVar4;
                    bVar = (BaseResponse) objA2;
                    zi50.a aVar5 = zi50.b;
                    ltzVar = i;
                    c330.a aVar6 = new c330.a(null, Intrinsics.g(wwd0Var.getValue(), itz.c.a));
                    wwd0Var3.getClass();
                    wwd0Var3.k(null, aVar6);
                    wwd0Var4.setValue(tzs.a.a);
                    if (!(bVar instanceof zi50.b)) {
                        baseResponse = (BaseResponse) bVar;
                        if (baseResponse.bizCode != 19001) {
                            partnerInfo = (PartnerInfo) baseResponse.data;
                            if (partnerInfo == null) {
                                ku90<a> ku90Var4 = snj0Var2.f;
                                s9e0 s9e0Var2 = s9e0.a;
                                String str4 = baseResponse.message;
                                s9e0Var2.getClass();
                                strA = s9e0.a(str4);
                                if (strA != null) {
                                    StringUiText stringUiText3 = vch0.a;
                                    stringUiText = new StringUiText(strA);
                                } else {
                                    stringUiText = vch0.b;
                                }
                                b.i(ku90Var4, stringUiText, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                                return Unit.a;
                            }
                            b700Var = snj0Var2.k0;
                            str = (String) wwd0Var2.getValue();
                            this.f = null;
                            this.a = ltzVar;
                            this.b = bVar;
                            this.c = snj0Var2;
                            this.d = partnerInfo;
                            this.e = 5;
                            if (b700Var.g(str, this) != y5bVar) {
                                obj2 = bVar;
                                partnerInfo2 = partnerInfo;
                                ltzVar2 = ltzVar;
                                snj0Var = snj0Var2;
                            }
                            return y5bVar;
                        }
                        wwd0Var.getClass();
                        wwd0Var.k(null, itz.b.a);
                    }
                    thA = zi50.a(bVar);
                    if (thA != null) {
                        itf0.a aVar7 = itf0.a;
                        aVar7.q(MyLog.TAG_WITHDRAW);
                        aVar7.f(thA, "getPartnerInfo with exception.", new Object[0]);
                        int i4 = snj0.z0;
                        b.i(snj0Var2.f, ppf0.a(thA), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
                    }
                    return Unit.a;
                }
                if (i != 5) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                partnerInfo2 = this.d;
                snj0Var = this.c;
                obj2 = this.b;
                ltz ltzVar5 = this.a;
                uj50.b(obj);
                ltzVar2 = ltzVar5;
            }
            ku90<kqj0> ku90Var5 = snj0Var.d0;
            int i5 = snj0.z0;
            BigDecimal bigDecimal = (BigDecimal) snj0Var.Q.a.getValue();
            if (bigDecimal == null) {
                bigDecimal = BigDecimal.ZERO;
            }
            bigDecimal.getClass();
            BigDecimal bigDecimal2 = snj0Var.S.c;
            ltzVar2.getClass();
            bigDecimal2.getClass();
            BigDecimal bigDecimalMultiply = bigDecimal2.multiply(ltzVar2.a);
            bigDecimalMultiply.getClass();
            BigDecimal bigDecimalMin = bigDecimalMultiply.setScale(2, RoundingMode.HALF_UP).min(ltzVar2.b);
            bigDecimalMin.getClass();
            Object value = snj0Var.f0.a.getValue();
            value.getClass();
            BigDecimal bigDecimal3 = (BigDecimal) value;
            String str5 = (String) snj0Var.u0.getValue();
            String info = partnerInfo2.getInfo();
            if (info == null) {
                info = "--";
            }
            lqj0.b(ku90Var5, new WithdrawConfirmation.Partner(bigDecimal, bigDecimal2, bigDecimalMin, bigDecimal3, str5, info));
            bVar = obj2;
            thA = zi50.a(bVar);
            if (thA != null) {
                itf0.a aVar8 = itf0.a;
                aVar8.q(MyLog.TAG_WITHDRAW);
                aVar8.f(thA, "getPartnerInfo with exception.", new Object[0]);
                int i6 = snj0.z0;
                b.i(snj0Var2.f, ppf0.a(thA), null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            }
            return Unit.a;
            if (!((Boolean) objA).booleanValue()) {
                return Unit.a;
            }
            this.f = v5bVar;
            this.e = 2;
            objI1 = snj0Var2.I1(this);
            if (objI1 != y5bVar) {
                if (!((Boolean) objI1).booleanValue()) {
                    return Unit.a;
                }
                wl50 wl50VarR2 = snj0Var2.i0.R();
                this.f = v5bVar;
                this.e = 3;
                objP = bm50.p(wl50VarR2, this);
                if (objP != y5bVar) {
                    lk50Var = (lk50) objP;
                    if (lk50Var instanceof lk50.c) {
                        cVar = (lk50.c) lk50Var;
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                    }
                    return Unit.a;
                }
            }
            return y5bVar;
        } catch (Throwable th) {
            zi50.a aVar9 = zi50.b;
            bVar = new zi50.b(th);
            ltzVar = i;
        }
    }
}
