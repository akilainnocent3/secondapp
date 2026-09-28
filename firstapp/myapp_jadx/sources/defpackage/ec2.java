package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.sporty.android.chat.data.CalculateTotalBonus;
import com.sporty.android.chat.data.LiveShareBetData;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.security.otp.OTPGeneralResult;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ec2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ec2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return new jc2((b1g0) obj2);
            case 1:
                final td7 td7Var = (td7) obj2;
                LiveShareBetData liveShareBetData = (LiveShareBetData) obj;
                if (liveShareBetData != null) {
                    qrr qrrVar = td7Var.a;
                    qrrVar.getClass();
                    qrrVar.d.setPadding(0, 0, 0, 0);
                    Uri uri = liveShareBetData.getUri();
                    if (uri != null) {
                        try {
                            int iF = zch0.f(td7Var.requireContext());
                            Bitmap bitmapI = zch0.i(td7Var.requireContext(), uri, iF, true);
                            if (bitmapI != null) {
                                qrr qrrVar2 = td7Var.a;
                                qrrVar2.getClass();
                                ImageView imageView = qrrVar2.c.i;
                                imageView.setTag(uri.toString());
                                imageView.setVisibility(0);
                                int height = bitmapI.getHeight();
                                if (height > iF) {
                                    height = iF;
                                }
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapI, 0, 0, iF, height);
                                bitmapCreateBitmap.getClass();
                                imageView.setImageBitmap(bitmapCreateBitmap);
                            }
                        } catch (Exception e) {
                            itf0.a aVar = itf0.a;
                            aVar.q(MyLog.TAG_PREMATCH_PAGE);
                            aVar.f(e, "Failed to get ShareImage", new Object[0]);
                        }
                    }
                    qrr qrrVar3 = td7Var.a;
                    qrrVar3.getClass();
                    qrrVar3.G.setVisibility(0);
                    qrr qrrVar4 = td7Var.a;
                    qrrVar4.getClass();
                    qrrVar4.J.setVisibility(0);
                    ConstraintLayout constraintLayout = td7Var.A;
                    if (constraintLayout == null) {
                        Intrinsics.n("bookingCodePreview");
                        throw null;
                    }
                    constraintLayout.setVisibility(0);
                    qrr qrrVar5 = td7Var.a;
                    qrrVar5.getClass();
                    m2p m2pVar = qrrVar5.c;
                    TextView textView = m2pVar.d;
                    TextView textView2 = m2pVar.v;
                    TextView textView3 = m2pVar.f;
                    textView.setText(sn5.d(td7Var, R.string.comment_details__odds, gky.a(CalculateTotalBonus.getTotalOdds(liveShareBetData.getTotalOdds()))).concat(sn5.d(td7Var, R.string.app_common__blank_space, new Object[0])));
                    m2pVar.b.setText(sn5.d(td7Var, R.string.comment_details__max_bonus, yk10.a(CalculateTotalBonus.INSTANCE.getTotalBonus(liveShareBetData), "%")));
                    m2pVar.i.setOnClickListener(new View.OnClickListener() { // from class: hd7
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            view.getClass();
                            if (view.getTag() != null) {
                                td7Var.m0().D.m(ad7.w);
                            }
                        }
                    });
                    if (liveShareBetData.isAllSettled()) {
                        textView3.setVisibility(8);
                        textView2.setVisibility(8);
                    } else {
                        textView3.setVisibility(0);
                        textView2.setVisibility(0);
                        textView3.setText(liveShareBetData.getShareCode());
                        textView3.setTextColor(td7Var.getResources().getColor(R.color.brand_secondary));
                        textView2.setText(sn5.d(td7Var, R.string.comment_details__bet_booking_code, new Object[0]));
                    }
                    FlexboxLayout flexboxLayout = m2pVar.e;
                    String totalOdds = liveShareBetData.getTotalOdds();
                    flexboxLayout.setVisibility((totalOdds == null || totalOdds.length() == 0) ? 8 : 0);
                    break;
                }
                return Unit.a;
            default:
                uxf uxfVar = (uxf) obj2;
                OtpData.EmailChange emailChange = (OtpData.EmailChange) obj;
                emailChange.getClass();
                OTPResult<OTPGeneralResult> oTPResult = emailChange.e;
                if (oTPResult instanceof OTPResult.Success) {
                    gyf gyfVarM0 = uxfVar.m0();
                    String token = ((OTPGeneralResult) ((OTPResult.Success) oTPResult).a).getToken();
                    token.getClass();
                    gyfVarM0.i.a(new wxf.a(token));
                }
                return Unit.a;
        }
    }
}
