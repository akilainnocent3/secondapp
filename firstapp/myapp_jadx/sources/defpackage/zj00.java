package defpackage;

import android.content.Context;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.pingpong.remote.models.FairnessResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zj00 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zj00(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FairnessResponse fairnessResponse;
        String str;
        Integer clientSeedCount;
        String str2;
        Integer code;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                List list = (List) obj2;
                lza lzaVar = (lza) obj;
                lzaVar.getClass();
                lzaVar.b2();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - lzaVar.C1(34.0f);
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L));
                if ((8 & 2) != 0) {
                    fIntBitsToFloat = 0.0f;
                }
                if ((8 & 4) != 0) {
                    fIntBitsToFloat2 = Float.POSITIVE_INFINITY;
                }
                tcf.V1(lzaVar, new hfs(list, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), (8 & 8) != 0 ? 0 : 2), 0L, 0L, 0.0f, null, null, 6, 62);
                return Unit.a;
            default:
                dt80 dt80Var = (dt80) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = dt80.a.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (fairnessResponse = (FairnessResponse) hTTPResponse.getData()) != null) {
                        e820 e820VarB = dt80Var.b();
                        String str3 = dt80Var.d;
                        e820VarB.I.setText(dt80Var.getContext().getString(R.string.round_id, str3));
                        HashMap map = new HashMap();
                        map.put("{id}", str3);
                        op5.r(op5.a, b.f(dt80Var.b().I), map, 4);
                        AppCompatTextView appCompatTextView = dt80Var.b().M;
                        String startTime = fairnessResponse.getStartTime();
                        String str4 = "";
                        if (startTime != null) {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
                            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm");
                            try {
                                Date date = simpleDateFormat.parse(startTime);
                                date.getClass();
                                str2 = simpleDateFormat2.format(date);
                                str2.getClass();
                            } catch (Exception e) {
                                e.printStackTrace();
                                str2 = "";
                            }
                            str = str2;
                        } else {
                            str = null;
                        }
                        String startTime2 = fairnessResponse.getStartTime();
                        if (startTime2 != null) {
                            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
                            SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("dd/MM/yy");
                            try {
                                Date date2 = simpleDateFormat3.parse(startTime2);
                                date2.getClass();
                                String str5 = simpleDateFormat4.format(date2);
                                str5.getClass();
                                str4 = str5;
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        } else {
                            str4 = null;
                        }
                        appCompatTextView.setText(str + " " + str4);
                        dt80Var.b().f.setText(dt80Var.getContext().getString(R.string.coeff, fairnessResponse.getHouseCoefficientStr()));
                        LinearLayout linearLayout = dt80Var.b().i;
                        Context context = dt80Var.getContext();
                        Map<Double, Integer> map2 = k18.a;
                        linearLayout.setBackgroundTintList(o0b.b(context, k18.a(fairnessResponse.getHouseCoefficient())));
                        if (fairnessResponse.getServerSeeds() != null && !fairnessResponse.getServerSeeds().isEmpty()) {
                            dt80Var.b().J.setText(fairnessResponse.getServerSeeds().get(0));
                        }
                        dt80Var.b().v.setText(fairnessResponse.getGeneratedHash());
                        dt80Var.b().B.setText(fairnessResponse.getHex());
                        dt80Var.b().z.setText(fairnessResponse.getDecimal());
                        dt80Var.b().G.setText(fairnessResponse.getHouseCoefficientStr());
                        RecyclerView recyclerView = dt80Var.b().b;
                        dt80Var.getContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
                        List<FairnessResponse.ClientSeed> clientSeeds = fairnessResponse.getClientSeeds();
                        dt80Var.b().b.setAdapter((clientSeeds == null || (clientSeedCount = fairnessResponse.getClientSeedCount()) == null) ? null : new fs7(clientSeedCount.intValue(), dt80Var.a, clientSeeds));
                        dt80Var.b().E.setVisibility(0);
                        dt80Var.b().D.setVisibility(8);
                    }
                    op5.r(op5.a, b.f(dt80Var.b().F, dt80Var.b().L, dt80Var.b().K, dt80Var.b().d, dt80Var.b().c, dt80Var.b().w, dt80Var.b().y, dt80Var.b().C, dt80Var.b().A, dt80Var.b().H), null, 4);
                    AppCompatTextView appCompatTextView2 = dt80Var.b().L;
                    CharSequence text = dt80Var.b().L.getText();
                    text.getClass();
                    appCompatTextView2.setText(StringsKt.t0(text));
                    break;
                } else if (i2 == 2) {
                    dt80Var.b().E.setVisibility(4);
                    dt80Var.b().D.setVisibility(0);
                } else {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    dt80Var.dismiss();
                    ResultWrapper.GenericError error = loadingState.getError();
                    if (error == null || (code = error.getCode()) == null || code.intValue() != 403) {
                        jm60 jm60Var = dt80Var.i;
                        if (jm60Var != null && !jm60Var.isShowing()) {
                            Context context2 = dt80Var.getContext();
                            context2.getClass();
                            jm60 jm60Var2 = new jm60(context2);
                            jm60Var2.a = context2;
                            jm60Var2.f = "Ping Pong";
                            jm60Var2.setCancelable(false);
                            String string = context2.getString(R.string.sh_error_round_info);
                            string.getClass();
                            String string2 = context2.getString(R.string.label_dialog_tryagain);
                            string2.getClass();
                            jm60Var2.e = new jm60.a(string, string2, new bt80(dt80Var), new bgh(1), context2.getColor(R.color.sh_error_btn_color));
                            Window window = jm60Var2.getWindow();
                            WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                            if (attributes != null) {
                                attributes.gravity = 17;
                            }
                            if (attributes != null) {
                                attributes.flags &= -5;
                            }
                            Window window2 = jm60Var2.getWindow();
                            if (window2 != null) {
                                window2.setAttributes(attributes);
                            }
                            Window window3 = jm60Var2.getWindow();
                            if (window3 != null) {
                                window3.setBackgroundDrawableResource(R.color.trans_black_color);
                            }
                            jm60Var2.show();
                            Window window4 = jm60Var2.getWindow();
                            if (window4 != null) {
                                window4.setLayout(-1, -1);
                            }
                            dt80Var.i = jm60Var2;
                        }
                    } else {
                        SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                    }
                }
                return Unit.a;
        }
    }
}
