package defpackage;

import android.content.Intent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.e;
import com.appsflyer.internal.m;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.activities.ZoomImageActivity;
import com.sportygames.sportyherov2.remote.models.ProvablySettingRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wi40 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wi40(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yi40 yi40Var = (yi40) obj;
                Object tag = yi40Var.a.y.getTag();
                ri40 ri40Var = (ri40) (tag instanceof ri40 ? tag : null);
                if (ri40Var != null) {
                    String str = ri40Var.a;
                    kd20 kd20Var = yi40Var.f;
                    String str2 = ri40Var.c;
                    String str3 = ri40Var.b;
                    g08 g08Var = g08.UNKNOWN;
                    kd20Var.getClass();
                    g08 g08Var2 = g08.UNKNOWN;
                    m.a(str2, str, str3);
                    PreMatchEventActivity preMatchEventActivity = kd20Var.a;
                    int i2 = PreMatchEventActivity.a2;
                    Intent intent = new Intent(preMatchEventActivity, (Class<?>) ZoomImageActivity.class);
                    intent.putExtra("param_image_uri", str2);
                    intent.putExtra("param_booking_code", str);
                    intent.putExtra("param_country_code", str3);
                    intent.putExtra("param_code_source", "RECOMMENDED_BOOKING_CODE_SUCCESSFUL");
                    preMatchEventActivity.startActivityForResult(intent, 2);
                    yi40Var.i.a(str);
                }
                break;
            default:
                ov80 ov80Var = (ov80) obj;
                e eVar = ov80Var.a;
                if (ov80Var.a().e.getVisibility() == 8) {
                    ov80Var.a().e.setVisibility(0);
                    ov80Var.a().f.setAlpha(1.0f);
                    ov80Var.a().f.setFocusableInTouchMode(true);
                    ov80Var.a().f.setFocusable(true);
                    ov80Var.a().f.requestFocus();
                    ov80Var.a().K.setImageDrawable(eVar.getDrawable(R.drawable.tick));
                } else if (!((Boolean) ov80Var.d.invoke()).booleanValue()) {
                    if (!Intrinsics.g(ov80Var.v, ov80Var.a().f.getText().toString()) || ov80Var.w) {
                        ov80Var.a().f.clearFocus();
                        ProvablySettingRequest provablySettingRequest = new ProvablySettingRequest(false, ov80Var.a().f.getText().toString());
                        c28 c28Var = ov80Var.b;
                        c28Var.getClass();
                        ej5.c(o8i0.d(c28Var), null, null, new k28(c28Var, provablySettingRequest, null), 3);
                    } else {
                        ov80Var.c(false);
                    }
                    ov80Var.y = ov80Var.a().f.getText().toString();
                    if (eVar != null) {
                        Object systemService = eVar.getSystemService("input_method");
                        systemService.getClass();
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(ov80Var.a().f.getWindowToken(), 0);
                    }
                } else {
                    ov80Var.e.invoke();
                }
                break;
        }
    }
}
