package defpackage;

import android.util.Log;
import com.sporty.android.core.model.crypto.IURC.iKBWavCysVP;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class wl80 {
    public final ls6 a;

    public wl80(ls6 ls6Var) {
        this.a = ls6Var;
    }

    public final aj80 a(JSONObject jSONObject) {
        xl80 cm80Var;
        int i = jSONObject.getInt("settings_version");
        if (i != 3) {
            Log.e(iKBWavCysVP.XwuLdHoSlvkOl, "Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.", null);
            cm80Var = new tfd();
        } else {
            cm80Var = new cm80();
        }
        return cm80Var.a(this.a, jSONObject);
    }
}
