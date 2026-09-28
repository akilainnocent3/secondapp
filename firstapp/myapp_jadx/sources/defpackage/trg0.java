package defpackage;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.pocket.withdraw.transfer.TransferStatusLegacy;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.payment.security.sportypin.presentation.activity.TransferPinActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class trg0 implements lfy<bi50<BaseResponse<TransferStatusLegacy>>> {
    public final /* synthetic */ TransferPinActivity a;

    public trg0(TransferPinActivity transferPinActivity) {
        this.a = transferPinActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [srg0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.lfy
    public final void u1(bi50<BaseResponse<TransferStatusLegacy>> bi50Var) {
        bi50<BaseResponse<TransferStatusLegacy>> bi50Var2 = bi50Var;
        TransferPinActivity transferPinActivity = this.a;
        if (transferPinActivity.isFinishing()) {
            return;
        }
        ProgressDialog progressDialog = transferPinActivity.y;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        if (bi50Var2 == null) {
            transferPinActivity.z1(null, null);
            return;
        }
        BaseResponse<TransferStatusLegacy> baseResponse = bi50Var2.b;
        if (!bi50Var2.a.getIsSuccessful() || baseResponse == null) {
            transferPinActivity.z1(null, null);
            return;
        }
        int i = baseResponse.bizCode;
        if (i == 10000) {
            transferPinActivity.C1();
            return;
        }
        if (i == 11701) {
            transferPinActivity.C1();
            return;
        }
        if (i == 11708) {
            transferPinActivity.A1(2, baseResponse.message);
            return;
        }
        if (i == 11710) {
            transferPinActivity.e.setVisibility(0);
            transferPinActivity.b.setBoxFillColor(transferPinActivity.getResources().getColor(R.color.brand_primary));
            transferPinActivity.b.invalidate();
        } else if (i != 11810) {
            transferPinActivity.z1(baseResponse.message, null);
        } else {
            transferPinActivity.b.b();
            transferPinActivity.z1(TextUtils.isEmpty(baseResponse.message) ? transferPinActivity.getCMSString(R.string.common_otp_verify__code_expired_desc, new Object[0]) : baseResponse.message, new DialogInterface.OnClickListener() { // from class: srg0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    lop.d(this.a.a.b);
                }
            });
        }
    }
}
