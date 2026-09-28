package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sportybet.plugin.realsports.data.RTicket;
import java.util.List;
import kotlin.Unit;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RSportTicketDetailsViewModel$getTicketDetail$1", f = "RSportTicketDetailsViewModel.kt", l = {123}, m = "invokeSuspend", v = 2)
public final class yr30 extends tje0 implements jaj<RTicket, BaseResponse<List<? extends nof>>, BaseResponse<String>, BOConfigValueBundle, v1b<? super jqf0>, Object> {
    public int a;
    public /* synthetic */ RTicket b;
    public /* synthetic */ BaseResponse c;
    public /* synthetic */ BaseResponse d;
    public /* synthetic */ BOConfigValueBundle e;
    public final /* synthetic */ ds30 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr30(ds30 ds30Var, v1b<? super yr30> v1bVar) {
        super(5, v1bVar);
        this.f = ds30Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Boolean boolR0;
        String str;
        RTicket rTicket = this.b;
        BaseResponse baseResponse = this.c;
        BaseResponse baseResponse2 = this.d;
        BOConfigValueBundle bOConfigValueBundle = this.e;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        ds30 ds30Var = this.f;
        ds30Var.D = rTicket;
        List list = baseResponse.hasData() ? (List) baseResponse.data : m2g.a;
        String str2 = (!baseResponse2.isSuccessful() || (str = (String) baseResponse2.data) == null) ? "" : str;
        BOConfigValueWrapper response = bOConfigValueBundle.getResponse(BOConfigParam.RemixBetEnabled);
        Object configValue = response != null ? response.getConfigValue() : null;
        dq7 dq7VarA = jq40.a(Boolean.class);
        if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
            if (configValue instanceof Integer) {
                if (!(configValue instanceof Boolean)) {
                    configValue = null;
                }
                boolR0 = (Boolean) configValue;
            } else {
                if (configValue instanceof String) {
                    StringsKt.toIntOrNull((String) configValue);
                }
                boolR0 = null;
            }
        } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
            if (configValue instanceof Long) {
                if (!(configValue instanceof Boolean)) {
                    configValue = null;
                }
                boolR0 = (Boolean) configValue;
            } else {
                if (configValue instanceof String) {
                    StringsKt.s0((String) configValue);
                }
                boolR0 = null;
            }
        } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
            if (configValue instanceof Float) {
                if (!(configValue instanceof Boolean)) {
                    configValue = null;
                }
                boolR0 = (Boolean) configValue;
            } else {
                if (configValue instanceof String) {
                    b.i((String) configValue);
                }
                boolR0 = null;
            }
        } else if (!dq7VarA.equals(jq40.a(Double.TYPE))) {
            if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                if (configValue instanceof Boolean) {
                    boolR0 = (Boolean) configValue;
                } else if (!(configValue instanceof String) || (boolR0 = StringsKt.r0((String) configValue)) == null) {
                }
            } else if (dq7VarA.equals(jq40.a(String.class))) {
                if (configValue != null) {
                    configValue.toString();
                }
            } else if (configValue != null) {
                if (!(configValue instanceof Boolean)) {
                    configValue = null;
                }
                boolR0 = (Boolean) configValue;
            }
            boolR0 = null;
        } else if (configValue instanceof Double) {
            if (!(configValue instanceof Boolean)) {
                configValue = null;
            }
            boolR0 = (Boolean) configValue;
        } else {
            if (configValue instanceof String) {
                b.h((String) configValue);
            }
            boolR0 = null;
        }
        boolean zBooleanValue = boolR0 != null ? boolR0.booleanValue() : false;
        ds30Var.E = zBooleanValue;
        list.getClass();
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.a = 1;
        Object objX1 = ds30Var.x1(rTicket, list, str2, zBooleanValue, bOConfigValueBundle, this);
        return objX1 == y5bVar ? y5bVar : objX1;
    }

    @Override // defpackage.jaj
    public final Object l(RTicket rTicket, BaseResponse<List<? extends nof>> baseResponse, BaseResponse<String> baseResponse2, BOConfigValueBundle bOConfigValueBundle, v1b<? super jqf0> v1bVar) {
        yr30 yr30Var = new yr30(this.f, v1bVar);
        yr30Var.b = rTicket;
        yr30Var.c = baseResponse;
        yr30Var.d = baseResponse2;
        yr30Var.e = bOConfigValueBundle;
        return yr30Var.invokeSuspend(Unit.a);
    }
}
