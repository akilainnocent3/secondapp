package defpackage;

import android.content.Context;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.sportyherov2.remote.models.FairnessResponse;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class se40 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ se40(Object obj, int i) {
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
                ((tcf) obj).getClass();
                ((lza) obj2).b2();
                return Unit.a;
            default:
                final et80 et80Var = (et80) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = et80.a.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (fairnessResponse = (FairnessResponse) hTTPResponse.getData()) != null) {
                        ft80 ft80VarB = et80Var.b();
                        String str3 = et80Var.d;
                        ft80VarB.H.setText(et80Var.getContext().getString(R.string.round_id, str3));
                        HashMap map = new HashMap();
                        map.put("{id}", str3);
                        op5.r(op5.a, b.f(et80Var.b().H), map, 4);
                        AppCompatTextView appCompatTextView = et80Var.b().L;
                        String startTime = fairnessResponse.getStartTime();
                        String str4 = "";
                        String str5 = YAzniTbXHYQ.oudiva;
                        if (startTime != null) {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str5);
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
                            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(str5);
                            SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("dd/MM/yy");
                            try {
                                Date date2 = simpleDateFormat3.parse(startTime2);
                                date2.getClass();
                                String str6 = simpleDateFormat4.format(date2);
                                str6.getClass();
                                str4 = str6;
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        } else {
                            str4 = null;
                        }
                        appCompatTextView.setText(str + " " + str4);
                        et80Var.b().f.setText(et80Var.getContext().getString(R.string.coeff, fairnessResponse.getHouseCoefficientStr()));
                        TextView textView = et80Var.b().f;
                        Context context = et80Var.getContext();
                        Map<Double, Integer> map2 = m18.a;
                        textView.setTextColor(o0b.b(context, m18.b(fairnessResponse.getHouseCoefficient())));
                        if (fairnessResponse.getServerSeeds() != null && !fairnessResponse.getServerSeeds().isEmpty()) {
                            et80Var.b().I.setText(fairnessResponse.getServerSeeds().get(0));
                        }
                        et80Var.b().i.setText(fairnessResponse.getGeneratedHash());
                        et80Var.b().A.setText(fairnessResponse.getHex());
                        et80Var.b().y.setText(fairnessResponse.getDecimal());
                        et80Var.b().F.setText(fairnessResponse.getHouseCoefficientStr());
                        RecyclerView recyclerView = et80Var.b().b;
                        et80Var.getContext();
                        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
                        List<FairnessResponse.ClientSeed> clientSeeds = fairnessResponse.getClientSeeds();
                        et80Var.b().b.setAdapter((clientSeeds == null || (clientSeedCount = fairnessResponse.getClientSeedCount()) == null) ? null : new es7(clientSeedCount.intValue(), et80Var.a, clientSeeds));
                        et80Var.b().D.setVisibility(0);
                        et80Var.b().C.setVisibility(8);
                    }
                    op5.r(op5.a, b.f(et80Var.b().E, et80Var.b().K, et80Var.b().J, et80Var.b().d, et80Var.b().c, et80Var.b().v, et80Var.b().w, et80Var.b().B, et80Var.b().z, et80Var.b().G), null, 4);
                    break;
                } else if (i2 == 2) {
                    et80Var.b().D.setVisibility(4);
                    et80Var.b().C.setVisibility(0);
                } else {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    et80Var.dismiss();
                    ResultWrapper.GenericError error = loadingState.getError();
                    if (error == null || (code = error.getCode()) == null || code.intValue() != 403) {
                        km60 km60Var = et80Var.i;
                        if (km60Var != null && !km60Var.isShowing()) {
                            Context context2 = et80Var.getContext();
                            context2.getClass();
                            km60 km60Var2 = new km60(context2, "Sporty Hero");
                            String string = context2.getString(R.string.sh_error_round_info);
                            string.getClass();
                            String string2 = context2.getString(R.string.label_dialog_tryagain);
                            string2.getClass();
                            km60Var2.c(string, string2, new Function0() { // from class: at80
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    et80Var.e.invoke();
                                    return Unit.a;
                                }
                            }, new ct80(), context2.getColor(R.color.sh_error_btn_color));
                            km60Var2.a();
                            et80Var.i = km60Var2;
                        }
                    } else {
                        SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                    }
                }
                return Unit.a;
        }
    }
}
