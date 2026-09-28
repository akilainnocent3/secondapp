package defpackage;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.paybill.ExclusiveOffersLayout;
import com.sportybet.feature.payment.impl.paybill.a;
import com.sportygames.chat.remote.models.ClaimRainRequest;
import com.sportygames.sportyherov2.remote.models.RainTopicResponse;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bh8 implements Function1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ bh8(dh8 dh8Var, hh8 hh8Var) {
        this.b = dh8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer id;
        int i = this.a;
        int iIntValue = 0;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                final dh8 dh8Var = (dh8) fragment;
                a aVar = (a) obj;
                dh8.a aVar2 = dh8.y;
                dh8Var.m0().c.setText(aVar.a);
                ImageView imageView = dh8Var.m0().e;
                String str = aVar.c;
                if (str != null) {
                    sh8.a().b(str, imageView);
                } else {
                    imageView.setImageResource(aVar.b);
                }
                List<UiText> list = aVar.e;
                j7g j7gVar = new j7g();
                String string = "";
                for (UiText uiText : list) {
                    Context contextRequireContext = dh8Var.requireContext();
                    contextRequireContext.getClass();
                    CharSequence charSequenceE = uiText.e(contextRequireContext);
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) string);
                    sb.append((Object) charSequenceE);
                    string = sb.toString();
                }
                int iS = StringsKt.S(string, '*', 0, 6);
                int iS2 = StringsKt.S(string, '#', 0, 6);
                int iA = zch0.a(dh8Var.getContext(), zch0.a(dh8Var.getContext(), dh8Var.getResources().getInteger(R.integer.spannable_paragraph_leading_margin)));
                if (iS == -1 || iS2 == -1 || iS >= iS2) {
                    j7gVar.c(iA, string);
                } else {
                    int i2 = iS2 + 1;
                    final String strSubstring = string.substring(iS, i2);
                    j7gVar.c(iA, string.substring(0, iS));
                    j7gVar.i(strSubstring, dh8Var.m0().d.getContext().getColor(R.color.brand_quaternary), new j7g.a() { // from class: ch8
                        @Override // j7g.a
                        public final void a() {
                            dh8.a aVar3 = dh8.y;
                            e eVarRequireActivity = dh8Var.requireActivity();
                            eVarRequireActivity.getClass();
                            vxo.b(eVarRequireActivity, strSubstring);
                        }
                    });
                    j7gVar.c(iA, string.substring(i2));
                }
                dh8Var.m0().d.append(j7gVar);
                dh8Var.m0().d.setMovementMethod(LinkMovementMethod.getInstance());
                ExclusiveOffersLayout.a aVar3 = aVar.d;
                if (aVar3 != null) {
                    dh8Var.m0().v.setExclusiveOffersInfo(aVar3);
                    dh8Var.m0().v.setVisibility(0);
                } else {
                    dh8Var.m0().v.setVisibility(8);
                }
                break;
            default:
                ((View) obj).getClass();
                ssw<Map<String, Object>> sswVar = qv30.c;
                RainTopicResponse rainTopicResponse = ((gw30) fragment).y;
                if (rainTopicResponse != null && (id = rainTopicResponse.getId()) != null) {
                    iIntValue = id.intValue();
                }
                sswVar.j(jpu.b(new Pair("requestModel", new ClaimRainRequest(iIntValue))));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ bh8(gw30 gw30Var) {
        this.b = gw30Var;
    }
}
