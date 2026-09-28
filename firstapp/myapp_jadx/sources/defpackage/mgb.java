package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.views.GameMainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class mgb implements noy {
    public Object a;

    @Override // defpackage.noy
    public void a(final boolean z) {
        final fgb fgbVar = (fgb) this.a;
        e activity = fgbVar.getActivity();
        final GameMainActivity gameMainActivity = activity instanceof GameMainActivity ? (GameMainActivity) activity : null;
        if (gameMainActivity == null) {
            return;
        }
        kd8 kd8VarI1 = gameMainActivity.I1();
        op5 op5Var = op5.a;
        String string = fgbVar.getString(R.string.error_location_permission_title_cms);
        string.getClass();
        String string2 = fgbVar.getString(R.string.error_location_permission_title_text);
        string2.getClass();
        op5Var.getClass();
        String strB = op5.b(string, string2, null);
        String string3 = fgbVar.getString(R.string.error_location_permission_msg_cms);
        string3.getClass();
        String string4 = fgbVar.getString(R.string.error_location_permission_msg_text);
        string4.getClass();
        String strB2 = op5.b(string3, string4, null);
        String string5 = fgbVar.getString(R.string.action_open_settings_cms);
        string5.getClass();
        String string6 = fgbVar.getString(R.string.action_open_settings_text);
        string6.getClass();
        String strB3 = op5.b(string5, string6, null);
        String string7 = fgbVar.getString(R.string.exit_btn_cms);
        string7.getClass();
        String string8 = fgbVar.getString(R.string.action_exit_text);
        string8.getClass();
        kd8.b(kd8VarI1, strB, strB2, strB3, op5.b(string7, string8, null), new Function0() { // from class: jdb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z2 = z;
                GameMainActivity gameMainActivity2 = gameMainActivity;
                Intent intent = z2 ? new Intent("android.settings.LOCATION_SOURCE_SETTINGS") : new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", gameMainActivity2.getPackageName(), null));
                intent.addFlags(268435456);
                gameMainActivity2.startActivity(intent);
                return Unit.a;
            }
        }, new kdb(), gameMainActivity.getColor(R.color.try_again_color), new Function0() { // from class: ldb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                fgbVar.M0();
                return Unit.a;
            }
        });
        if (gameMainActivity.I1().isShowing()) {
            return;
        }
        gameMainActivity.I1().a();
    }

    public void b(byte b) {
        ((Parcel) this.a).writeByte(b);
    }

    public void c(float f) {
        ((Parcel) this.a).writeFloat(f);
    }

    public void d(long j) {
        long jB = omf0.b(j);
        byte b = 0;
        if (!pmf0.a(jB, 0L)) {
            if (pmf0.a(jB, 4294967296L)) {
                b = 1;
            } else if (pmf0.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        b(b);
        if (pmf0.a(omf0.b(j), 0L)) {
            return;
        }
        c(omf0.c(j));
    }
}
